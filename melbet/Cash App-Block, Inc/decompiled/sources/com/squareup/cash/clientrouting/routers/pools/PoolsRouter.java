package com.squareup.cash.clientrouting.routers.pools;

import app.cash.broadway.navigation.Navigator;
import app.cash.history.screens.HistoryScreens;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.pools.screens.PoolDetailsScreen;
import com.squareup.cash.pools.screens.PoolsListScreen;

/* loaded from: classes6.dex */
public final class PoolsRouter {
    public final Navigator navigator;

    public PoolsRouter(Navigator navigator) {
        navigator.getClass();
        this.navigator = navigator;
    }

    public final void route(ClientRoute.ViewPoolDetails viewPoolDetails, RoutingParams routingParams) {
        viewPoolDetails.getClass();
        routingParams.getClass();
        this.navigator.goTo(new PoolDetailsScreen(viewPoolDetails.poolToken, routingParams.origin instanceof HistoryScreens.PaymentReceipt ? "enriched_receipt" : viewPoolDetails.origin, null, null, null, null, 60));
    }

    public final void route(ClientRoute.ViewPoolsList viewPoolsList) {
        viewPoolsList.getClass();
        this.navigator.goTo(new PoolsListScreen(viewPoolsList.origin, null, 2));
    }
}
