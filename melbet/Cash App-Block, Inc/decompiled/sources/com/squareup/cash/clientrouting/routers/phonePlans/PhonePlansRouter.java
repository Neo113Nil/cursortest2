package com.squareup.cash.clientrouting.routers.phonePlans;

import app.cash.broadway.navigation.Navigator;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.phoneplans.PhonePlansHomeScreen;

/* loaded from: classes6.dex */
public final class PhonePlansRouter {
    public final Navigator navigator;

    public PhonePlansRouter(Navigator navigator) {
        navigator.getClass();
        this.navigator = navigator;
    }

    public final void route(ClientRoute.ViewPhonePlansHome viewPhonePlansHome, RoutingParams routingParams) {
        viewPhonePlansHome.getClass();
        routingParams.getClass();
        this.navigator.goTo(PhonePlansHomeScreen.INSTANCE);
    }
}
