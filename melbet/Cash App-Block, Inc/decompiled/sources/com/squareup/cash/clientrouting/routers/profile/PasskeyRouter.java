package com.squareup.cash.clientrouting.routers.profile;

import app.cash.broadway.navigation.Navigator;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.passkeys.screens.PasskeyManagementScreen;

/* loaded from: classes6.dex */
public final class PasskeyRouter {
    public final Navigator navigator;

    public PasskeyRouter(Navigator navigator) {
        navigator.getClass();
        this.navigator = navigator;
    }

    public final void route(ClientRoute.ViewPasskeyManager viewPasskeyManager) {
        viewPasskeyManager.getClass();
        this.navigator.goTo(PasskeyManagementScreen.INSTANCE);
    }
}
