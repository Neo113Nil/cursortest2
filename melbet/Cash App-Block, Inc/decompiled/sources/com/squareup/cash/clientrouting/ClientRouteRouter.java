package com.squareup.cash.clientrouting;

import app.cash.broadway.navigation.Navigator;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientrouting.data.RoutingParams;

/* loaded from: classes.dex */
public interface ClientRouteRouter {

    public interface Factory {
        ClientRouteRouter create(Navigator navigator);
    }

    boolean route(ClientRoute clientRoute, RoutingParams routingParams);
}
