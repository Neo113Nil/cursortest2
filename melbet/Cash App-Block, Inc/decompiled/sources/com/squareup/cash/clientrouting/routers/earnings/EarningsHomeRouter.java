package com.squareup.cash.clientrouting.routers.earnings;

import app.cash.broadway.navigation.Navigator;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.earnings.screens.home.EarningsHomeScreen;
import com.squareup.cash.money.screens.MoneyTabScreen;

/* loaded from: classes6.dex */
public final class EarningsHomeRouter {
    public final Navigator navigator;

    public EarningsHomeRouter(Navigator navigator) {
        navigator.getClass();
        this.navigator = navigator;
    }

    public final void route(ClientRoute.ViewEarningsHome viewEarningsHome, RoutingParams routingParams) {
        viewEarningsHome.getClass();
        routingParams.getClass();
        this.navigator.goTo(new EarningsHomeScreen(routingParams.deepLinkMetadata != null ? EarningsHomeScreen.Origin.DEEP_LINK : routingParams.origin instanceof MoneyTabScreen ? EarningsHomeScreen.Origin.MONEY_TAB_APPLET : EarningsHomeScreen.Origin.UNKNOWN));
    }
}
