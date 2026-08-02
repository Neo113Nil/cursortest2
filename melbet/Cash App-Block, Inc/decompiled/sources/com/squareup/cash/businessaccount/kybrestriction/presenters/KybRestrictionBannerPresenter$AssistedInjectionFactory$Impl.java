package com.squareup.cash.businessaccount.kybrestriction.presenters;

import com.google.zxing.BinaryBitmap;
import com.squareup.cash.borrow.views.BorrowUiFactory;
import com.squareup.cash.businessaccount.screens.KybRestrictionBannerScreen;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.db2.Instrument$Adapter;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.moneybot.presenters.plugins.NavigationCardPresenter;
import dev.zacsweers.metro.Provider;

/* loaded from: classes.dex */
public final class KybRestrictionBannerPresenter$AssistedInjectionFactory$Impl {
    public final Instrument$Adapter delegateFactory;

    public KybRestrictionBannerPresenter$AssistedInjectionFactory$Impl(Instrument$Adapter instrument$Adapter) {
        this.delegateFactory = instrument$Adapter;
    }

    public final NavigationCardPresenter create(BetterNavigator.ScreenNavigator screenNavigator, KybRestrictionBannerScreen kybRestrictionBannerScreen) {
        Instrument$Adapter instrument$Adapter = this.delegateFactory;
        Analytics analytics = (Analytics) ((Provider) instrument$Adapter.cash_instrument_typeAdapter).invoke();
        RealRouter$Factory$Impl realRouter$Factory$Impl = (RealRouter$Factory$Impl) ((Provider) instrument$Adapter.card_brandAdapter).invoke();
        BinaryBitmap binaryBitmap = (BinaryBitmap) ((BorrowUiFactory.MetroFactory) instrument$Adapter.balance_currencyAdapter).invoke();
        analytics.getClass();
        realRouter$Factory$Impl.getClass();
        return new NavigationCardPresenter(analytics, realRouter$Factory$Impl, binaryBitmap, screenNavigator, kybRestrictionBannerScreen);
    }
}
