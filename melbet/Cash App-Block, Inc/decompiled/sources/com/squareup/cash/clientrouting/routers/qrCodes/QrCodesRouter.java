package com.squareup.cash.clientrouting.routers.qrCodes;

import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.qrcodes.screens.CashQrCodeScanner;
import com.squareup.cash.qrcodes.screens.QrCodeScreen;
import com.squareup.cash.screens.Back;

/* loaded from: classes6.dex */
public final class QrCodesRouter {
    public final Navigator navigator;

    public QrCodesRouter(Navigator navigator) {
        navigator.getClass();
        this.navigator = navigator;
    }

    public final void route(ClientRoute.ViewQrCodeScanner viewQrCodeScanner, RoutingParams routingParams) {
        viewQrCodeScanner.getClass();
        routingParams.getClass();
        Screen screen = routingParams.exitScreen;
        if (screen == null) {
            screen = Back.INSTANCE;
        }
        this.navigator.goTo(new CashQrCodeScanner(screen, false, 2));
    }

    public final void route(ClientRoute.ViewQrCode viewQrCode, RoutingParams routingParams) {
        viewQrCode.getClass();
        routingParams.getClass();
        Screen screen = routingParams.exitScreen;
        if (screen == null) {
            screen = Back.INSTANCE;
        }
        this.navigator.goTo(new QrCodeScreen(screen));
    }
}
