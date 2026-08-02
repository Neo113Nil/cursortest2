package com.squareup.cash.clientrouting.routers.benefits;

import app.cash.broadway.navigation.Navigator;
import com.squareup.cash.benefits.screens.BankingBenefitsBookletScreen;
import com.squareup.cash.benefits.screens.BenefitsHomeScreen;
import com.squareup.cash.clientroutes.ClientRoute;

/* loaded from: classes5.dex */
public final class BenefitsRouter {
    public final Navigator navigator;

    public BenefitsRouter(Navigator navigator) {
        navigator.getClass();
        this.navigator = navigator;
    }

    public final void route(ClientRoute.ViewBenefitsBooklet viewBenefitsBooklet) {
        viewBenefitsBooklet.getClass();
        this.navigator.goTo(BankingBenefitsBookletScreen.INSTANCE);
    }

    public final void route(ClientRoute.ViewBenefitsHome viewBenefitsHome) {
        viewBenefitsHome.getClass();
        this.navigator.goTo(BenefitsHomeScreen.INSTANCE);
    }
}
