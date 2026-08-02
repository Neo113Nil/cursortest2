package com.squareup.cash.clientrouting.routers.taxes;

import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.payments.screens.PaymentScreens$HomeScreens$Home;
import com.squareup.cash.tax.primitives.TaxLocation;
import com.squareup.cash.tax.screens.TaxAuthorizationScreen;

/* loaded from: classes7.dex */
public final class TaxesRouter {
    public final Navigator navigator;

    public TaxesRouter(Navigator navigator) {
        navigator.getClass();
        this.navigator = navigator;
    }

    public final void route(ClientRoute.ViewTaxesWebApp viewTaxesWebApp, RoutingParams routingParams) {
        viewTaxesWebApp.getClass();
        routingParams.getClass();
        routeToTaxAuthorizationScreen(new TaxLocation.DeepLink(viewTaxesWebApp.taxesDeepLink), routingParams);
    }

    public final void routeToTaxAuthorizationScreen(TaxLocation taxLocation, RoutingParams routingParams) {
        Screen screen = routingParams.origin;
        if (screen == null && (screen = routingParams.exitScreen) == null) {
            screen = PaymentScreens$HomeScreens$Home.INSTANCE;
        }
        this.navigator.goTo(new TaxAuthorizationScreen(taxLocation, screen));
    }

    public final void route(ClientRoute.ViewTaxesWebAppRoot viewTaxesWebAppRoot, RoutingParams routingParams) {
        viewTaxesWebAppRoot.getClass();
        routingParams.getClass();
        routeToTaxAuthorizationScreen(new TaxLocation.DeepLink(""), routingParams);
    }

    public final void route(ClientRoute.ViewTaxesHub viewTaxesHub, RoutingParams routingParams) {
        viewTaxesHub.getClass();
        routingParams.getClass();
        routeToTaxAuthorizationScreen(TaxLocation.TaxHub.INSTANCE, routingParams);
    }

    public final void route(ClientRoute.ViewTaxesHubWithDeepLink viewTaxesHubWithDeepLink, RoutingParams routingParams) {
        viewTaxesHubWithDeepLink.getClass();
        routingParams.getClass();
        routeToTaxAuthorizationScreen(new TaxLocation.TaxHubWithDeepLink(viewTaxesHubWithDeepLink.taxesDeepLink), routingParams);
    }
}
