package com.squareup.cash.blockers.presenters;

import com.squareup.cash.blockers.presenters.SsnPresenter;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.resource.text.AndroidStringManager;

/* loaded from: classes.dex */
public final class EarnerEnrollmentSuccessBlockerPresenter$Factory$Impl {
    public final SsnPresenter.MetroFactory delegateFactory;

    public EarnerEnrollmentSuccessBlockerPresenter$Factory$Impl(SsnPresenter.MetroFactory metroFactory) {
        this.delegateFactory = metroFactory;
    }

    public final EarnerEnrollmentSuccessBlockerPresenter create(BlockersScreens.EarnerEnrollmentSuccessBlockerScreenArgs earnerEnrollmentSuccessBlockerScreenArgs, BetterNavigator.ScreenNavigator screenNavigator) {
        SsnPresenter.MetroFactory metroFactory = this.delegateFactory;
        AndroidStringManager androidStringManager = (AndroidStringManager) metroFactory.stringManager.lambda.invoke();
        RealRouter$Factory$Impl realRouter$Factory$Impl = (RealRouter$Factory$Impl) metroFactory.idvPresenterFactory.invoke();
        EarnerOnboardingAnalytics earnerOnboardingAnalytics = (EarnerOnboardingAnalytics) metroFactory.blockersHelperFactory.invoke();
        androidStringManager.getClass();
        realRouter$Factory$Impl.getClass();
        earnerOnboardingAnalytics.getClass();
        return new EarnerEnrollmentSuccessBlockerPresenter(androidStringManager, realRouter$Factory$Impl, earnerOnboardingAnalytics, earnerEnrollmentSuccessBlockerScreenArgs, screenNavigator);
    }
}
