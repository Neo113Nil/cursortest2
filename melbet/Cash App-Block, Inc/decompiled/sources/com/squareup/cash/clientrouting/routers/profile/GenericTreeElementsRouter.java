package com.squareup.cash.clientrouting.routers.profile;

import app.cash.broadway.navigation.Navigator;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.genericelements.screens.GenericTreeElementsScreen;

/* loaded from: classes6.dex */
public final class GenericTreeElementsRouter {
    public final Navigator navigator;

    public GenericTreeElementsRouter(Navigator navigator) {
        navigator.getClass();
        this.navigator = navigator;
    }

    public final void route(ClientRoute.ViewCustomerProfileLoyaltyDetails viewCustomerProfileLoyaltyDetails) {
        viewCustomerProfileLoyaltyDetails.getClass();
        this.navigator.goTo(new GenericTreeElementsScreen.GenericTreeElementsFullScreen(viewCustomerProfileLoyaltyDetails.genericElementsContext, viewCustomerProfileLoyaltyDetails.customerToken, null));
    }
}
