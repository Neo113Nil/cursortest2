package com.squareup.cash.clientrouting.routers.core;

import app.cash.broadway.navigation.Navigator;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.clientrouting.errors.RoutingError;
import com.squareup.cash.clientrouting.fallback.RealSelectiveUnrecognizedURLNavigator;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.observability.types.ErrorReporter;

/* loaded from: classes6.dex */
public final class NotImplementedRouter {
    public final ErrorReporter errorReporter;
    public final IntentLauncher launcher;
    public final Navigator navigator;
    public final RealSelectiveUnrecognizedURLNavigator selectiveUnrecognizedUrlNavigator;

    public NotImplementedRouter(ErrorReporter errorReporter, IntentLauncher intentLauncher, RealSelectiveUnrecognizedURLNavigator realSelectiveUnrecognizedURLNavigator, Navigator navigator) {
        navigator.getClass();
        this.errorReporter = errorReporter;
        this.launcher = intentLauncher;
        this.selectiveUnrecognizedUrlNavigator = realSelectiveUnrecognizedURLNavigator;
        this.navigator = navigator;
    }

    public final void route(ClientRoute clientRoute, RoutingParams routingParams) {
        String str;
        clientRoute.getClass();
        routingParams.getClass();
        RoutingParams.DeepLinkMetadata deepLinkMetadata = routingParams.deepLinkMetadata;
        if (deepLinkMetadata != null && (str = deepLinkMetadata.originalUrl) != null) {
            this.selectiveUnrecognizedUrlNavigator.navigateSelectiveUnrecognizedPath(this.navigator, this.launcher, str);
        }
        this.errorReporter.report(new RoutingError.UnsupportedRoute(clientRoute, new RoutingParams(null, null, null, null, null, null, 511)), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
    }
}
