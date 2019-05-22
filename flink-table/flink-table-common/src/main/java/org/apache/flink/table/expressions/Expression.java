/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.flink.table.expressions;

import org.apache.flink.annotation.PublicEvolving;
import org.apache.flink.table.types.DataType;

import java.util.List;

/**
 * The interface for all expressions.
 *
 * <p>Expressions represent a logical tree for producing a computation result. Every expression
 * consists of zero, one, or more sub-expressions. Expressions might be literal values, function calls,
 * or field references.
 *
 * <p>Expressions are part of the API. Thus, values and return types are expressed as instances of
 * {@link DataType}.
 */
@PublicEvolving
public interface Expression {

	List<Expression> getChildren();

	<R> R accept(ExpressionVisitor<R> visitor);
}