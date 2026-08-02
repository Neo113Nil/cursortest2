package com.squareup.cash.bitcoin.presenters.paidinbitcoin.navigation;

import app.cash.broadway.screen.Screen;
import com.squareup.cash.bitcoin.screens.PaidInBitcoinLandingScreen;
import com.squareup.cash.cdf.crypto.CryptoAllocatePayrollStart;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.integration.analytics.Analytics;

/* loaded from: classes5.dex */
public final class RealPaidInBitcoinNavigator {
    public final Analytics analytics;
    public final BetterNavigator.ScreenNavigator navigator;
    public final RealRouter router;

    public RealPaidInBitcoinNavigator(Analytics analytics, RealRouter$Factory$Impl realRouter$Factory$Impl, BetterNavigator.ScreenNavigator screenNavigator) {
        this.analytics = analytics;
        this.navigator = screenNavigator;
        this.router = realRouter$Factory$Impl.create$1(screenNavigator);
    }

    public final void navigateToLandingScreen(int i, Screen screen) {
        screen.getClass();
        this.analytics.track(new CryptoAllocatePayrollStart(Integer.valueOf(i), i > 0 ? CryptoAllocatePayrollStart.AllocatePayrollStateType.ENROLLED : CryptoAllocatePayrollStart.AllocatePayrollStateType.UNENROLLED), null);
        this.navigator.goTo(new PaidInBitcoinLandingScreen(screen));
    }
}
