package com.squareup.cash.clientrouting.routers.promotions;

import app.cash.broadway.navigation.Navigator;
import com.squareup.cash.account.screens.Account;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.promotionsreferrals.screens.PromotionsReferralsScreen$PromotionsReferralsHomeScreen;

/* loaded from: classes6.dex */
public final class PromotionsRouter {
    public final Navigator navigator;

    public PromotionsRouter(Navigator navigator) {
        navigator.getClass();
        this.navigator = navigator;
    }

    public final void route(ClientRoute.ViewPromotionsHome viewPromotionsHome, RoutingParams routingParams) {
        viewPromotionsHome.getClass();
        routingParams.getClass();
        RoutingParams.DeepLinkMetadata deepLinkMetadata = routingParams.deepLinkMetadata;
        Navigator navigator = this.navigator;
        if (deepLinkMetadata != null) {
            navigator.goTo(Account.INSTANCE);
        }
        navigator.goTo(new PromotionsReferralsScreen$PromotionsReferralsHomeScreen());
    }
}
