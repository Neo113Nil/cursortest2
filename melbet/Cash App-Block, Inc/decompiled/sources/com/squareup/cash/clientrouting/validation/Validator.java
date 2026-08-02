package com.squareup.cash.clientrouting.validation;

import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientrouting.data.RoutingParams;

/* loaded from: classes.dex */
public interface Validator {
    ValidatorResult validate(ClientRoute clientRoute, RoutingParams routingParams);
}
