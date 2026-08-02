package com.squareup.cash.clientrouting.routers.core;

import app.cash.broadway.navigation.Navigator;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.launcher.IntentLauncher;

/* loaded from: classes6.dex */
public final class ExternalMapRouter {
    public final IntentLauncher launcher;

    public ExternalMapRouter(IntentLauncher intentLauncher, Navigator navigator) {
        navigator.getClass();
        this.launcher = intentLauncher;
    }

    public final void route(ClientRoute.ViewExternalMapApplication viewExternalMapApplication) {
        viewExternalMapApplication.getClass();
        this.launcher.launchMap(viewExternalMapApplication.address, 0.0d, 0.0d);
    }
}
