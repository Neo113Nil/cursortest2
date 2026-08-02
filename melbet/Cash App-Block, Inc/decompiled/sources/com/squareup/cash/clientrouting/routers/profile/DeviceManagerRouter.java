package com.squareup.cash.clientrouting.routers.profile;

import app.cash.broadway.navigation.Navigator;
import app.cash.local.navigation.api.RealCashLocalNavigator;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.profile.devicemanager.navigation.RealDeviceManagerInboundNavigator$Factory$Impl;
import com.squareup.cash.profile.devicemanager.screens.DeviceManagerDeviceDetailsScreen;

/* loaded from: classes6.dex */
public final class DeviceManagerRouter {
    public final RealCashLocalNavigator inboundRouter;

    public DeviceManagerRouter(Navigator navigator, RealDeviceManagerInboundNavigator$Factory$Impl realDeviceManagerInboundNavigator$Factory$Impl) {
        navigator.getClass();
        this.inboundRouter = new RealCashLocalNavigator(navigator, 2);
    }

    public final void route(ClientRoute.ViewDeviceManagerDeviceDetails viewDeviceManagerDeviceDetails) {
        viewDeviceManagerDeviceDetails.getClass();
        String str = viewDeviceManagerDeviceDetails.hashedAppToken;
        RealCashLocalNavigator realCashLocalNavigator = this.inboundRouter;
        realCashLocalNavigator.getClass();
        realCashLocalNavigator.navigator.goTo(new DeviceManagerDeviceDetailsScreen(str, 1));
    }

    public final void route(ClientRoute.ViewDeviceManager viewDeviceManager) {
        viewDeviceManager.getClass();
        this.inboundRouter.showDeviceList();
    }
}
