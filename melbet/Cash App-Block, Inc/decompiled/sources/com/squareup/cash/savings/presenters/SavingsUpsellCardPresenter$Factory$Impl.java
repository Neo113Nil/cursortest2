package com.squareup.cash.savings.presenters;

import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.profile.views.ProfileCropView;
import com.squareup.cash.savings.screens.SavingsCardSheet;

/* loaded from: classes.dex */
public final class SavingsUpsellCardPresenter$Factory$Impl {
    public final ProfileCropView.MetroFactory delegateFactory;

    public SavingsUpsellCardPresenter$Factory$Impl(ProfileCropView.MetroFactory metroFactory) {
        this.delegateFactory = metroFactory;
    }

    public final SavingsUpsellCardPresenter create(SavingsCardSheet savingsCardSheet, BetterNavigator.ScreenNavigator screenNavigator) {
        ProfileCropView.MetroFactory metroFactory = this.delegateFactory;
        RealRouter$Factory$Impl realRouter$Factory$Impl = (RealRouter$Factory$Impl) metroFactory.imageLoader.invoke();
        Analytics analytics = (Analytics) metroFactory.cropResultManager.invoke();
        realRouter$Factory$Impl.getClass();
        analytics.getClass();
        return new SavingsUpsellCardPresenter(realRouter$Factory$Impl, analytics, savingsCardSheet, screenNavigator);
    }
}
