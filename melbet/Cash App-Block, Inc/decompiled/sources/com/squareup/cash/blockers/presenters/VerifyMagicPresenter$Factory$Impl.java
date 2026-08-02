package com.squareup.cash.blockers.presenters;

import app.cash.local.presenters.wallet.LocalHomePresenter;
import com.squareup.cash.blockers.flowlistener.BlockerFlowListener;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.util.coroutines.Signal;

/* loaded from: classes.dex */
public final class VerifyMagicPresenter$Factory$Impl {
    public final VerifyMagicPresenter$MetroFactory delegateFactory;

    public VerifyMagicPresenter$Factory$Impl(VerifyMagicPresenter$MetroFactory verifyMagicPresenter$MetroFactory) {
        this.delegateFactory = verifyMagicPresenter$MetroFactory;
    }

    public final LocalHomePresenter create(BlockersScreens.VerifyMagic verifyMagic, BetterNavigator.ScreenNavigator screenNavigator) {
        VerifyMagicPresenter$MetroFactory verifyMagicPresenter$MetroFactory = this.delegateFactory;
        Analytics analytics = (Analytics) verifyMagicPresenter$MetroFactory.analytics.getValue();
        AppService appService = (AppService) verifyMagicPresenter$MetroFactory.appService.getValue();
        FlowStarter flowStarter = (FlowStarter) verifyMagicPresenter$MetroFactory.flowStarter.getValue();
        BlockersDataNavigator blockersDataNavigator = (BlockersDataNavigator) verifyMagicPresenter$MetroFactory.blockersNavigator.invoke();
        AndroidStringManager androidStringManager = (AndroidStringManager) verifyMagicPresenter$MetroFactory.stringManager.lambda.invoke();
        BlockerFlowListener blockerFlowListener = (BlockerFlowListener) verifyMagicPresenter$MetroFactory.blockerFlowAnalytics.invoke();
        Signal signal = (Signal) verifyMagicPresenter$MetroFactory.signOut.getValue();
        analytics.getClass();
        appService.getClass();
        flowStarter.getClass();
        blockersDataNavigator.getClass();
        androidStringManager.getClass();
        blockerFlowListener.getClass();
        signal.getClass();
        return new LocalHomePresenter(analytics, appService, flowStarter, blockersDataNavigator, androidStringManager, blockerFlowListener, signal, verifyMagic, screenNavigator);
    }
}
