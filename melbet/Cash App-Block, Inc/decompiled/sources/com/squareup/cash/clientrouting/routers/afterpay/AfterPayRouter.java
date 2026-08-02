package com.squareup.cash.clientrouting.routers.afterpay;

import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.activity.screens.ActivityScreen;
import com.squareup.cash.buynowpaylater.screens.AfterPayOrderDetailsScreen;
import com.squareup.cash.buynowpaylater.screens.AfterPayOrderDocumentScreen;
import com.squareup.cash.buynowpaylater.screens.AfterPayOrderHubScreen;
import com.squareup.cash.cdf.afterpayhub.AfterpayHubBrowseStart;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientrouting.data.RoutingParams;

/* loaded from: classes6.dex */
public final class AfterPayRouter {
    public final Navigator navigator;

    public AfterPayRouter(Navigator navigator) {
        navigator.getClass();
        this.navigator = navigator;
    }

    public final void route(ClientRoute.ViewAfterpayHub viewAfterpayHub, RoutingParams routingParams) {
        viewAfterpayHub.getClass();
        routingParams.getClass();
        Screen screen = routingParams.origin;
        this.navigator.goTo(new AfterPayOrderHubScreen(screen instanceof ActivityScreen ? AfterpayHubBrowseStart.AppLocation.ActivityTab : screen instanceof AfterPayOrderDetailsScreen ? AfterpayHubBrowseStart.AppLocation.OrderDetails : null, false));
    }

    public final void route(ClientRoute.ViewAfterpayOrderDetails viewAfterpayOrderDetails) {
        viewAfterpayOrderDetails.getClass();
        this.navigator.goTo(new AfterPayOrderDetailsScreen(viewAfterpayOrderDetails.orderId, false));
    }

    public final void route(ClientRoute.ViewAfterpayOrderDocument viewAfterpayOrderDocument) {
        viewAfterpayOrderDocument.getClass();
        this.navigator.goTo(new AfterPayOrderDocumentScreen(viewAfterpayOrderDocument.documentId, false));
    }
}
