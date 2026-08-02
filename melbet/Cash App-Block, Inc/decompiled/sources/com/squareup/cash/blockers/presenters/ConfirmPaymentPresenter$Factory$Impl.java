package com.squareup.cash.blockers.presenters;

import com.squareup.cash.attribution.ProductionAttributionEventEmitter;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.franklin.app.AppService;

/* loaded from: classes.dex */
public final class ConfirmPaymentPresenter$Factory$Impl {
    public final DisclosurePresenter.MetroFactory delegateFactory;

    public ConfirmPaymentPresenter$Factory$Impl(DisclosurePresenter.MetroFactory metroFactory) {
        this.delegateFactory = metroFactory;
    }

    public final DisclosurePresenter create(BlockersScreens.ConfirmPaymentScreen confirmPaymentScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        DisclosurePresenter.MetroFactory metroFactory = this.delegateFactory;
        Analytics analytics = (Analytics) metroFactory.analytics.getValue();
        AppService appService = (AppService) metroFactory.appService.getValue();
        ProductionAttributionEventEmitter productionAttributionEventEmitter = (ProductionAttributionEventEmitter) metroFactory.blockersNavigator.invoke();
        BlockersDataNavigator blockersDataNavigator = (BlockersDataNavigator) metroFactory.launcher.invoke();
        AndroidStringManager androidStringManager = (AndroidStringManager) metroFactory.stringManager.lambda.invoke();
        analytics.getClass();
        appService.getClass();
        productionAttributionEventEmitter.getClass();
        blockersDataNavigator.getClass();
        androidStringManager.getClass();
        return new DisclosurePresenter(analytics, appService, productionAttributionEventEmitter, blockersDataNavigator, androidStringManager, confirmPaymentScreen, screenNavigator);
    }
}
