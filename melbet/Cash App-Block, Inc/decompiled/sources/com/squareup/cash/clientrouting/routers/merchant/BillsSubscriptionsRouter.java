package com.squareup.cash.clientrouting.routers.merchant;

import app.cash.broadway.navigation.Navigator;
import com.squareup.cash.billssubscriptions.screens.BillsSubscriptionsMerchantListScreen;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class BillsSubscriptionsRouter {
    public final Navigator navigator;

    public BillsSubscriptionsRouter(Navigator navigator) {
        navigator.getClass();
        this.navigator = navigator;
    }

    public final Unit route() {
        this.navigator.goTo(BillsSubscriptionsMerchantListScreen.INSTANCE);
        return Unit.INSTANCE;
    }
}
