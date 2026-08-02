package com.squareup.cash.clientrouting.routers.offers;

import app.cash.broadway.navigation.Navigator;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.discover.promotiondetails.screens.PromotionDetails;

/* loaded from: classes6.dex */
public final class PromotionDetailsRouter {
    public final Navigator navigator;

    public PromotionDetailsRouter(Navigator navigator) {
        navigator.getClass();
        this.navigator = navigator;
    }

    public final void route(ClientRoute.ViewDetailsPage viewDetailsPage, RoutingParams routingParams) {
        viewDetailsPage.getClass();
        routingParams.getClass();
        this.navigator.goTo(new PromotionDetails(new PromotionDetails.Identifier.TemplateToken(viewDetailsPage.templateToken, viewDetailsPage.version), routingParams.exitScreen, 14));
    }

    public final void route(ClientRoute.ViewBooklet viewBooklet, RoutingParams routingParams) {
        viewBooklet.getClass();
        routingParams.getClass();
        String str = viewBooklet.treehousePath;
        this.navigator.goTo(new PromotionDetails(new PromotionDetails.Identifier.TreehousePath(str, str), routingParams.exitScreen, 14));
    }

    public final void route(ClientRoute.ViewPromotionDetails viewPromotionDetails, RoutingParams routingParams) {
        viewPromotionDetails.getClass();
        routingParams.getClass();
        this.navigator.goTo(new PromotionDetails(new PromotionDetails.Identifier.DetailsToken(viewPromotionDetails.detailsPageToken), routingParams.exitScreen, 14));
    }
}
