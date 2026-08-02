package com.squareup.cash.clientrouting.routers.earnings;

import app.cash.broadway.navigation.Navigator;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.earnings.screens.home.EarningsActivityListScreen;

/* loaded from: classes6.dex */
public final class EarningsActivityRouter {
    public final Navigator navigator;

    public EarningsActivityRouter(Navigator navigator) {
        navigator.getClass();
        this.navigator = navigator;
    }

    public final void route(ClientRoute.ViewEarningsActivity viewEarningsActivity) {
        viewEarningsActivity.getClass();
        this.navigator.goTo(new EarningsActivityListScreen(null));
    }
}
