package com.squareup.cash.clientrouting.routers.earnings;

import app.cash.broadway.navigation.Navigator;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.earnings.screens.AddPayerCustomersScreen;

/* loaded from: classes6.dex */
public final class EarningsCustomerTaggingRouter {
    public final Navigator navigator;

    public EarningsCustomerTaggingRouter(Navigator navigator) {
        navigator.getClass();
        this.navigator = navigator;
    }

    public final void route(ClientRoute.ViewEarnerCustomerTagging viewEarnerCustomerTagging, RoutingParams routingParams) {
        viewEarnerCustomerTagging.getClass();
        routingParams.getClass();
        this.navigator.goTo(new AddPayerCustomersScreen(viewEarnerCustomerTagging.entrypoint.equals("POST_KYB") ? AddPayerCustomersScreen.Entrypoint.POST_KYB : AddPayerCustomersScreen.Entrypoint.MANAGE, routingParams.exitScreen, null));
    }
}
