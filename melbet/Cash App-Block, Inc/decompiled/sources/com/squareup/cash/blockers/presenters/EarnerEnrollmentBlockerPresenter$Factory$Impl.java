package com.squareup.cash.blockers.presenters;

import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.formview.presenters.FormPresenter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.franklin.app.AppService;

/* loaded from: classes.dex */
public final class EarnerEnrollmentBlockerPresenter$Factory$Impl {
    public final FormPresenter.MetroFactory delegateFactory;

    public EarnerEnrollmentBlockerPresenter$Factory$Impl(FormPresenter.MetroFactory metroFactory) {
        this.delegateFactory = metroFactory;
    }

    public final EarnerEnrollmentBlockerPresenter create(BlockersScreens.EarnerEnrollmentBlockerScreenArgs earnerEnrollmentBlockerScreenArgs, BetterNavigator.ScreenNavigator screenNavigator) {
        FormPresenter.MetroFactory metroFactory = this.delegateFactory;
        BlockersDataNavigator blockersDataNavigator = (BlockersDataNavigator) metroFactory.blockersHelperFactory.invoke();
        AppService appService = (AppService) metroFactory.analytics.getValue();
        AndroidStringManager androidStringManager = (AndroidStringManager) metroFactory.clock.lambda.invoke();
        EarnerOnboardingAnalytics earnerOnboardingAnalytics = (EarnerOnboardingAnalytics) metroFactory.formAnalytics.invoke();
        RealRouter$Factory$Impl realRouter$Factory$Impl = (RealRouter$Factory$Impl) metroFactory.blockerActionUriDecoder.invoke();
        blockersDataNavigator.getClass();
        appService.getClass();
        androidStringManager.getClass();
        earnerOnboardingAnalytics.getClass();
        realRouter$Factory$Impl.getClass();
        return new EarnerEnrollmentBlockerPresenter(blockersDataNavigator, appService, androidStringManager, earnerOnboardingAnalytics, realRouter$Factory$Impl, earnerEnrollmentBlockerScreenArgs, screenNavigator);
    }
}
