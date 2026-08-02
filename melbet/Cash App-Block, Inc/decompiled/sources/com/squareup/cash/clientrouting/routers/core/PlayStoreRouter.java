package com.squareup.cash.clientrouting.routers.core;

import app.cash.broadway.navigation.Navigator;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.launcher.IntentLauncher;

/* loaded from: classes6.dex */
public final class PlayStoreRouter {
    public final String applicationId;
    public final IntentLauncher launcher;

    public PlayStoreRouter(Navigator navigator, IntentLauncher intentLauncher, String str) {
        navigator.getClass();
        this.launcher = intentLauncher;
        this.applicationId = str;
    }

    public final void route(ClientRoute.ViewAppStoreUpdate viewAppStoreUpdate) {
        viewAppStoreUpdate.getClass();
        this.launcher.launchPlayStore(this.applicationId);
    }
}
