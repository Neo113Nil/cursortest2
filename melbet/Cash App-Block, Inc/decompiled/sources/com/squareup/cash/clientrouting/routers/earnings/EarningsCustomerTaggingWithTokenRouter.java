package com.squareup.cash.clientrouting.routers.earnings;

import app.cash.broadway.navigation.Navigator;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.earnings.screens.AddPayerCustomersScreen;

/* loaded from: classes6.dex */
public final class EarningsCustomerTaggingWithTokenRouter {
    public final Navigator navigator;

    public EarningsCustomerTaggingWithTokenRouter(Navigator navigator) {
        navigator.getClass();
        this.navigator = navigator;
    }

    public final void route(ClientRoute.ViewEarnerCustomerTaggingWithToken viewEarnerCustomerTaggingWithToken, RoutingParams routingParams) {
        AddPayerCustomersScreen.Entrypoint entrypoint;
        viewEarnerCustomerTaggingWithToken.getClass();
        routingParams.getClass();
        String str = viewEarnerCustomerTaggingWithToken.entrypoint;
        int hashCode = str.hashCode();
        if (hashCode == -645275394) {
            if (str.equals("REQUEST_FLOW")) {
                entrypoint = AddPayerCustomersScreen.Entrypoint.REQUEST_FLOW;
            }
            entrypoint = AddPayerCustomersScreen.Entrypoint.MANAGE;
        } else if (hashCode != 1540920437) {
            if (hashCode == 1800273432 && str.equals("RECEIPT")) {
                entrypoint = AddPayerCustomersScreen.Entrypoint.RECEIPT;
            }
            entrypoint = AddPayerCustomersScreen.Entrypoint.MANAGE;
        } else {
            if (str.equals("POST_KYB")) {
                entrypoint = AddPayerCustomersScreen.Entrypoint.POST_KYB;
            }
            entrypoint = AddPayerCustomersScreen.Entrypoint.MANAGE;
        }
        this.navigator.goTo(new AddPayerCustomersScreen(entrypoint, routingParams.exitScreen, viewEarnerCustomerTaggingWithToken.taggedCustomerToken));
    }
}
