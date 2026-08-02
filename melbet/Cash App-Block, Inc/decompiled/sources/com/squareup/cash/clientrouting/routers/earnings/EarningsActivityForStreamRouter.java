package com.squareup.cash.clientrouting.routers.earnings;

import app.cash.broadway.navigation.Navigator;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.earnings.screens.home.EarningsActivityListScreen;

/* loaded from: classes6.dex */
public final class EarningsActivityForStreamRouter {
    public final Navigator navigator;

    public EarningsActivityForStreamRouter(Navigator navigator) {
        navigator.getClass();
        this.navigator = navigator;
    }

    public final void route(ClientRoute.ViewEarningsActivityForStream viewEarningsActivityForStream, RoutingParams routingParams) {
        viewEarningsActivityForStream.getClass();
        routingParams.getClass();
        this.navigator.goTo(new EarningsActivityListScreen(viewEarningsActivityForStream.streamIdentifier));
    }
}
