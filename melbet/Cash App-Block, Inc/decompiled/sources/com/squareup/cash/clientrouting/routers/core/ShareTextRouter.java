package com.squareup.cash.clientrouting.routers.core;

import app.cash.broadway.navigation.Navigator;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.launcher.IntentLauncher;

/* loaded from: classes6.dex */
public final class ShareTextRouter {
    public final IntentLauncher launcher;

    public ShareTextRouter(IntentLauncher intentLauncher, Navigator navigator) {
        navigator.getClass();
        this.launcher = intentLauncher;
    }

    public final void route(ClientRoute.ShareText shareText) {
        shareText.getClass();
        this.launcher.shareText(shareText.text, null, null);
    }
}
