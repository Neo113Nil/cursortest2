package com.squareup.cash.clientrouting.routers.shifts;

import app.cash.broadway.navigation.Navigator;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$WorkApplet;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.money.navigation.real.RealMoneyNavigatorHelper;
import com.squareup.cash.work.screens.WorkHomeScreen;

/* loaded from: classes6.dex */
public final class ShiftsRouter {
    public final FeatureFlagManager featureFlagManager;
    public final Navigator navigator;

    public ShiftsRouter(Navigator navigator, FeatureFlagManager featureFlagManager, RealMoneyNavigatorHelper realMoneyNavigatorHelper) {
        navigator.getClass();
        this.navigator = navigator;
        this.featureFlagManager = featureFlagManager;
    }

    public final void route(ClientRoute.ViewShiftsHome viewShiftsHome) {
        viewShiftsHome.getClass();
        boolean enabled = ((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) this.featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$WorkApplet.INSTANCE)).enabled();
        Navigator navigator = this.navigator;
        if (enabled) {
            navigator.goTo(WorkHomeScreen.INSTANCE);
        } else {
            navigator.goTo(RealMoneyNavigatorHelper.moneyTabScreen());
        }
    }
}
