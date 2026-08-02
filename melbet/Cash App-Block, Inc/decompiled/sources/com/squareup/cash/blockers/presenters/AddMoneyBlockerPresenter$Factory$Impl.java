package com.squareup.cash.blockers.presenters;

import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.google.pay.payments.api.GooglePayPaymentsClient;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.franklin.app.AppService;

/* loaded from: classes.dex */
public final class AddMoneyBlockerPresenter$Factory$Impl {
    public final DisclosurePresenter.MetroFactory delegateFactory;

    public AddMoneyBlockerPresenter$Factory$Impl(DisclosurePresenter.MetroFactory metroFactory) {
        this.delegateFactory = metroFactory;
    }

    public final AddMoneyBlockerPresenter create(BlockersScreens.AddMoneyBlockerScreen addMoneyBlockerScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        DisclosurePresenter.MetroFactory metroFactory = this.delegateFactory;
        BlockersDataNavigator blockersDataNavigator = (BlockersDataNavigator) metroFactory.blockersNavigator.invoke();
        AndroidStringManager androidStringManager = (AndroidStringManager) metroFactory.stringManager.lambda.invoke();
        AppService appService = (AppService) metroFactory.analytics.getValue();
        FeatureFlagManager featureFlagManager = (FeatureFlagManager) metroFactory.appService.getValue();
        GooglePayPaymentsClient googlePayPaymentsClient = (GooglePayPaymentsClient) metroFactory.launcher.invoke();
        blockersDataNavigator.getClass();
        androidStringManager.getClass();
        appService.getClass();
        featureFlagManager.getClass();
        googlePayPaymentsClient.getClass();
        return new AddMoneyBlockerPresenter(blockersDataNavigator, androidStringManager, appService, featureFlagManager, googlePayPaymentsClient, addMoneyBlockerScreen, screenNavigator);
    }
}
