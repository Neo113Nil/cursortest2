package com.squareup.cash.clientrouting;

import app.cash.broadway.screen.Screen;
import com.squareup.cash.activity.screens.ActivityScreen;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.treehouse.android.broadway.TreehouseScreenFactory;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes.dex */
public final class RealClientRouteToScreenMapping {
    public final TreehouseScreenFactory treehouseScreenFactory;

    public RealClientRouteToScreenMapping(TreehouseScreenFactory treehouseScreenFactory) {
        this.treehouseScreenFactory = treehouseScreenFactory;
    }

    public final Screen toScreen(ClientRoute clientRoute) {
        if (clientRoute instanceof ClientRoute.ViewActivity) {
            return ActivityScreen.INSTANCE;
        }
        if (!(clientRoute instanceof ClientRoute.TreehouseAppLink)) {
            Path$$ExternalSyntheticBUOutline0.m$1(clientRoute, "unexpected route: ");
            return null;
        }
        ClientRoute.TreehouseAppLink treehouseAppLink = (ClientRoute.TreehouseAppLink) clientRoute;
        return TreehouseScreenFactory.create$default(this.treehouseScreenFactory, treehouseAppLink.getApp(), treehouseAppLink.getLink(), 12);
    }
}
