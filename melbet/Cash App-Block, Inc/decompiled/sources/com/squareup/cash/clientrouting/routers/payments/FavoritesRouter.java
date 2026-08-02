package com.squareup.cash.clientrouting.routers.payments;

import app.cash.broadway.navigation.Navigator;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.favorites.screens.ListFavorites;
import com.squareup.cash.integration.analytics.RealUuidGenerator;

/* loaded from: classes6.dex */
public final class FavoritesRouter {
    public final Navigator navigator;

    public FavoritesRouter(RealUuidGenerator realUuidGenerator, Navigator navigator) {
        navigator.getClass();
        this.navigator = navigator;
    }

    public final void route(ClientRoute.ViewFavorites viewFavorites) {
        viewFavorites.getClass();
        this.navigator.goTo(new ListFavorites(RealUuidGenerator.generate()));
    }
}
