package com.squareup.cash.clientrouting.routers.core;

import app.cash.broadway.navigation.Navigator;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.clientrouting.errors.RoutingError;
import com.squareup.cash.observability.types.ErrorReporter;

/* loaded from: classes6.dex */
public final class DeprecatedRouter {
    public final ErrorReporter errorReporter;

    public DeprecatedRouter(ErrorReporter errorReporter, Navigator navigator) {
        navigator.getClass();
        this.errorReporter = errorReporter;
    }

    public final void route(ClientRoute clientRoute) {
        clientRoute.getClass();
        this.errorReporter.report(new RoutingError.UnsupportedRoute(clientRoute, new RoutingParams(null, null, null, null, null, null, 511)), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
    }
}
