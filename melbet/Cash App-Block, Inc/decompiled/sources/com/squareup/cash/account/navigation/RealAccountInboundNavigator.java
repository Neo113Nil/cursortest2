package com.squareup.cash.account.navigation;

import app.cash.broadway.navigation.Navigator;
import com.squareup.cash.account.screens.Account;

/* loaded from: classes6.dex */
public final class RealAccountInboundNavigator {
    public final Navigator navigator;

    public RealAccountInboundNavigator(Navigator navigator, int i) {
        switch (i) {
            case 1:
                navigator.getClass();
                this.navigator = navigator;
                break;
            default:
                navigator.getClass();
                this.navigator = navigator;
                break;
        }
    }

    public void showAccount() {
        this.navigator.goTo(Account.INSTANCE);
    }
}
