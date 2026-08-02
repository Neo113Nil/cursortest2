package com.squareup.cash.blockers.presenters;

import com.squareup.cash.biometrics.AndroidBiometricsStore;
import com.squareup.cash.blockers.flowlistener.BlockerFlowListener;
import com.squareup.cash.blockers.presenters.SetPinPresenter;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.util.coroutines.Signal;

/* loaded from: classes.dex */
public final class SetPinPresenter$Factory$Impl {
    public final SetPinPresenter.MetroFactory delegateFactory;

    public SetPinPresenter$Factory$Impl(SetPinPresenter.MetroFactory metroFactory) {
        this.delegateFactory = metroFactory;
    }

    public final SetPinPresenter create(BlockersScreens.SetPinScreen setPinScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        SetPinPresenter.MetroFactory metroFactory = this.delegateFactory;
        Analytics analytics = (Analytics) metroFactory.analytics.getValue();
        BlockersDataNavigator blockersDataNavigator = (BlockersDataNavigator) metroFactory.blockersNavigator.invoke();
        AndroidStringManager androidStringManager = (AndroidStringManager) metroFactory.stringManager.lambda.invoke();
        AppService appService = (AppService) metroFactory.appService.getValue();
        AndroidBiometricsStore androidBiometricsStore = (AndroidBiometricsStore) metroFactory.biometricsStore.invoke();
        FlowStarter flowStarter = (FlowStarter) metroFactory.flowStarter.getValue();
        BlockerFlowListener blockerFlowListener = (BlockerFlowListener) metroFactory.blockerFlowAnalytics.invoke();
        Signal signal = (Signal) metroFactory.signOutSignal.getValue();
        FeatureFlagManager featureFlagManager = (FeatureFlagManager) metroFactory.featureFlagManager.getValue();
        RealPinScreensTitleGenerator$Factory$Impl realPinScreensTitleGenerator$Factory$Impl = (RealPinScreensTitleGenerator$Factory$Impl) metroFactory.pinScreensTitleGeneratorFactory.invoke();
        analytics.getClass();
        blockersDataNavigator.getClass();
        androidStringManager.getClass();
        appService.getClass();
        androidBiometricsStore.getClass();
        flowStarter.getClass();
        blockerFlowListener.getClass();
        signal.getClass();
        featureFlagManager.getClass();
        realPinScreensTitleGenerator$Factory$Impl.getClass();
        return new SetPinPresenter(analytics, blockersDataNavigator, androidStringManager, appService, androidBiometricsStore, flowStarter, blockerFlowListener, signal, setPinScreen, screenNavigator, featureFlagManager, realPinScreensTitleGenerator$Factory$Impl);
    }
}
