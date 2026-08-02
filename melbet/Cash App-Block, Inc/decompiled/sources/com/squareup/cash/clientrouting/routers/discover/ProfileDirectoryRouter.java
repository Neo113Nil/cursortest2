package com.squareup.cash.clientrouting.routers.discover;

import app.cash.broadway.navigation.Navigator;
import com.squareup.cash.cdf.SearchOrigin;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.globalsearch.screens.GlobalSearchScreen;

/* loaded from: classes6.dex */
public final class ProfileDirectoryRouter {
    public final Navigator navigator;

    public ProfileDirectoryRouter(Navigator navigator) {
        navigator.getClass();
        this.navigator = navigator;
    }

    public final void route(ClientRoute.ViewProfileDirectory viewProfileDirectory) {
        viewProfileDirectory.getClass();
        this.navigator.goTo(new GlobalSearchScreen(SearchOrigin.UNSPECIFIED, false));
    }
}
