package com.squareup.cash.blockers.presenters;

import app.cash.local.worker.LocalActivitySetupTeardown;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.securitysignals.api.SecuritySignalsAggregator;
import com.squareup.protos.franklin.app.AppService;

/* loaded from: classes.dex */
public final class RealIdvPresenter$RealIdvPresenterFactory$Impl {
    public final LocalActivitySetupTeardown.MetroFactory delegateFactory;

    public RealIdvPresenter$RealIdvPresenterFactory$Impl(LocalActivitySetupTeardown.MetroFactory metroFactory) {
        this.delegateFactory = metroFactory;
    }

    public final DisclosurePresenter create$1(BlockersScreens blockersScreens) {
        LocalActivitySetupTeardown.MetroFactory metroFactory = this.delegateFactory;
        AndroidStringManager androidStringManager = (AndroidStringManager) metroFactory.appForegroundStateProvider.invoke();
        Analytics analytics = (Analytics) metroFactory.sessionManager.invoke();
        BlockersDataNavigator blockersDataNavigator = (BlockersDataNavigator) metroFactory.syncValueReader.invoke();
        AppService appService = (AppService) metroFactory.shortlinkHandler.invoke();
        SecuritySignalsAggregator securitySignalsAggregator = (SecuritySignalsAggregator) metroFactory.ioDispatcher.invoke();
        androidStringManager.getClass();
        analytics.getClass();
        blockersDataNavigator.getClass();
        appService.getClass();
        securitySignalsAggregator.getClass();
        return new DisclosurePresenter(androidStringManager, analytics, blockersDataNavigator, appService, securitySignalsAggregator, blockersScreens);
    }
}
