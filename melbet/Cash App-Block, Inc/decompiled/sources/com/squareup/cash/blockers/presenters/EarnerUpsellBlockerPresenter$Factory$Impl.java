package com.squareup.cash.blockers.presenters;

import com.squareup.cash.blockers.flow.RealMultiBlockerFacilitator;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.work.presenters.RealYouPresenter$MetroFactory;

/* loaded from: classes.dex */
public final class EarnerUpsellBlockerPresenter$Factory$Impl {
    public final RealYouPresenter$MetroFactory delegateFactory;

    public EarnerUpsellBlockerPresenter$Factory$Impl(RealYouPresenter$MetroFactory realYouPresenter$MetroFactory) {
        this.delegateFactory = realYouPresenter$MetroFactory;
    }

    public final EarnerUpsellBlockerPresenter create(BlockersScreens.EarnerUpsellBlockerScreenArgs earnerUpsellBlockerScreenArgs, BetterNavigator.ScreenNavigator screenNavigator) {
        RealYouPresenter$MetroFactory realYouPresenter$MetroFactory = this.delegateFactory;
        BlockersDataNavigator blockersDataNavigator = (BlockersDataNavigator) realYouPresenter$MetroFactory.assignedJobProvider.invoke();
        RealMultiBlockerFacilitator realMultiBlockerFacilitator = (RealMultiBlockerFacilitator) realYouPresenter$MetroFactory.assignedLocationProvider.invoke();
        EarnerOnboardingAnalytics earnerOnboardingAnalytics = (EarnerOnboardingAnalytics) realYouPresenter$MetroFactory.passcodeProvider.invoke();
        blockersDataNavigator.getClass();
        realMultiBlockerFacilitator.getClass();
        earnerOnboardingAnalytics.getClass();
        return new EarnerUpsellBlockerPresenter(blockersDataNavigator, realMultiBlockerFacilitator, earnerOnboardingAnalytics, earnerUpsellBlockerScreenArgs, screenNavigator);
    }
}
