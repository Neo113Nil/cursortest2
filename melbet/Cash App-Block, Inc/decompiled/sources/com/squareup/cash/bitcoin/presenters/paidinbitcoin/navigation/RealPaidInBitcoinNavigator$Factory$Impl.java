package com.squareup.cash.bitcoin.presenters.paidinbitcoin.navigation;

import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.history.analytics.LoadTimeClock;
import com.squareup.cash.integration.analytics.Analytics;

/* loaded from: classes.dex */
public final class RealPaidInBitcoinNavigator$Factory$Impl {
    public final LoadTimeClock.MetroFactory delegateFactory;

    public RealPaidInBitcoinNavigator$Factory$Impl(LoadTimeClock.MetroFactory metroFactory) {
        this.delegateFactory = metroFactory;
    }

    public final RealPaidInBitcoinNavigator create(BetterNavigator.ScreenNavigator screenNavigator) {
        LoadTimeClock.MetroFactory metroFactory = this.delegateFactory;
        Analytics analytics = (Analytics) metroFactory.clock.invoke();
        RealRouter$Factory$Impl realRouter$Factory$Impl = (RealRouter$Factory$Impl) metroFactory.observabilityManager.invoke();
        analytics.getClass();
        realRouter$Factory$Impl.getClass();
        return new RealPaidInBitcoinNavigator(analytics, realRouter$Factory$Impl, screenNavigator);
    }
}
