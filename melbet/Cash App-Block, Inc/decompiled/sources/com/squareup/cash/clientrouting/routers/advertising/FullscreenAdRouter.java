package com.squareup.cash.clientrouting.routers.advertising;

import app.cash.broadway.navigation.Navigator;
import com.squareup.cash.advertising.screens.FullscreenAdScreen;
import com.squareup.cash.clientroutes.ClientRoute;

/* loaded from: classes6.dex */
public final class FullscreenAdRouter {
    public final Navigator navigator;

    public FullscreenAdRouter(Navigator navigator) {
        navigator.getClass();
        this.navigator = navigator;
    }

    public final void route(ClientRoute.ViewFullScreenAd viewFullScreenAd) {
        viewFullScreenAd.getClass();
        this.navigator.goTo(new FullscreenAdScreen(viewFullScreenAd.experimentToken));
    }
}
