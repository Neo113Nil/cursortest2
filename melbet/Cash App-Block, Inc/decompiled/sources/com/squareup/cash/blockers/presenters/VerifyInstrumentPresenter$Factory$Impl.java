package com.squareup.cash.blockers.presenters;

import app.cash.local.presenters.wallet.LocalHomePresenter;
import com.squareup.cash.activity.presenters.BalanceFeedPresenter$MetroFactory;
import com.squareup.cash.blockers.flowlistener.BlockerFlowListener;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.RealBlockersHelper$Factory$Impl;
import com.squareup.cash.instruments.backend.real.RealInstrumentVerifier;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.resource.text.AndroidStringManager;

/* loaded from: classes.dex */
public final class VerifyInstrumentPresenter$Factory$Impl {
    public final BalanceFeedPresenter$MetroFactory delegateFactory;

    public VerifyInstrumentPresenter$Factory$Impl(BalanceFeedPresenter$MetroFactory balanceFeedPresenter$MetroFactory) {
        this.delegateFactory = balanceFeedPresenter$MetroFactory;
    }

    public final LocalHomePresenter create(BlockersScreens.VerifyCardScreen verifyCardScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        BalanceFeedPresenter$MetroFactory balanceFeedPresenter$MetroFactory = this.delegateFactory;
        AndroidStringManager androidStringManager = (AndroidStringManager) balanceFeedPresenter$MetroFactory.stringManager.lambda.invoke();
        Analytics analytics = (Analytics) balanceFeedPresenter$MetroFactory.activitiesCacheManager.getValue();
        BlockerFlowListener blockerFlowListener = (BlockerFlowListener) balanceFeedPresenter$MetroFactory.activityEmbeddedPresenterFactory.invoke();
        BlockersDataNavigator blockersDataNavigator = (BlockersDataNavigator) balanceFeedPresenter$MetroFactory.activityTokenFactory.invoke();
        RealInstrumentVerifier realInstrumentVerifier = (RealInstrumentVerifier) balanceFeedPresenter$MetroFactory.moneyFormatterFactory.invoke();
        RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl = (RealBlockersHelper$Factory$Impl) balanceFeedPresenter$MetroFactory.balanceSnapshotManager.invoke();
        androidStringManager.getClass();
        analytics.getClass();
        blockerFlowListener.getClass();
        blockersDataNavigator.getClass();
        realInstrumentVerifier.getClass();
        realBlockersHelper$Factory$Impl.getClass();
        return new LocalHomePresenter(androidStringManager, analytics, blockerFlowListener, blockersDataNavigator, realInstrumentVerifier, realBlockersHelper$Factory$Impl, verifyCardScreen, screenNavigator);
    }
}
