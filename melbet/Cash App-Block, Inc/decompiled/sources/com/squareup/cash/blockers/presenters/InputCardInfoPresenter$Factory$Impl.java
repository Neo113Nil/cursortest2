package com.squareup.cash.blockers.presenters;

import com.squareup.cash.biometrics.AndroidBiometricsStore;
import com.squareup.cash.blockers.flow.RealMultiBlockerFacilitator;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.clientsync.syncer.RealClientSyncer;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.activity.PaymentNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealBlockersHelper$Factory$Impl;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.gcl.RealGlobalConfigProvider;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.pools.presenters.PoolDetailsPresenter$MetroFactory;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.protos.franklin.app.AppService;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;

/* loaded from: classes.dex */
public final class InputCardInfoPresenter$Factory$Impl {
    public final PoolDetailsPresenter$MetroFactory delegateFactory;

    public InputCardInfoPresenter$Factory$Impl(PoolDetailsPresenter$MetroFactory poolDetailsPresenter$MetroFactory) {
        this.delegateFactory = poolDetailsPresenter$MetroFactory;
    }

    public final InputCardInfoPresenter create(BlockersScreens.InputCardInfoScreen inputCardInfoScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        PoolDetailsPresenter$MetroFactory poolDetailsPresenter$MetroFactory = this.delegateFactory;
        AppService appService = (AppService) ((DoubleCheck) poolDetailsPresenter$MetroFactory.blockersNavigator).getValue();
        AndroidStringManager androidStringManager = (AndroidStringManager) ((LambdaProvider) poolDetailsPresenter$MetroFactory.stringManager).lambda.invoke();
        Provider provider = poolDetailsPresenter$MetroFactory.moneyFormatterFactory;
        BlockersDataNavigator blockersDataNavigator = (BlockersDataNavigator) provider.invoke();
        AppConfigManager appConfigManager = (AppConfigManager) ((DoubleCheck) poolDetailsPresenter$MetroFactory.analytics).getValue();
        PaymentNavigator paymentNavigator = (PaymentNavigator) poolDetailsPresenter$MetroFactory.poolsRepository.invoke();
        FeatureFlagManager featureFlagManager = (FeatureFlagManager) ((DoubleCheck) poolDetailsPresenter$MetroFactory.featureFlagManager).getValue();
        FlowStarter flowStarter = (FlowStarter) ((DoubleCheck) poolDetailsPresenter$MetroFactory.activitiesCacheManager).getValue();
        Analytics analytics = (Analytics) ((DoubleCheck) poolDetailsPresenter$MetroFactory.dateFormatManager).getValue();
        RealClientSyncer realClientSyncer = (RealClientSyncer) poolDetailsPresenter$MetroFactory.launcher.invoke();
        AndroidBiometricsStore androidBiometricsStore = (AndroidBiometricsStore) poolDetailsPresenter$MetroFactory.activityEmbeddedPresenterFactory.invoke();
        RealGlobalConfigProvider realGlobalConfigProvider = (RealGlobalConfigProvider) ((DoubleCheck) poolDetailsPresenter$MetroFactory.clock).getValue();
        BlockersDataNavigator blockersDataNavigator2 = (BlockersDataNavigator) provider.invoke();
        SessionManager sessionManager = (SessionManager) ((LambdaProvider) poolDetailsPresenter$MetroFactory.sessionManager).lambda.invoke();
        RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl = (RealBlockersHelper$Factory$Impl) poolDetailsPresenter$MetroFactory.defaultActivityItemEventHandlerFactory.invoke();
        RealMultiBlockerFacilitator realMultiBlockerFacilitator = (RealMultiBlockerFacilitator) poolDetailsPresenter$MetroFactory.uuidGenerator.invoke();
        appService.getClass();
        androidStringManager.getClass();
        blockersDataNavigator.getClass();
        appConfigManager.getClass();
        paymentNavigator.getClass();
        featureFlagManager.getClass();
        flowStarter.getClass();
        analytics.getClass();
        realClientSyncer.getClass();
        androidBiometricsStore.getClass();
        realGlobalConfigProvider.getClass();
        blockersDataNavigator2.getClass();
        sessionManager.getClass();
        realBlockersHelper$Factory$Impl.getClass();
        realMultiBlockerFacilitator.getClass();
        return new InputCardInfoPresenter(appService, androidStringManager, blockersDataNavigator, appConfigManager, paymentNavigator, featureFlagManager, flowStarter, analytics, realClientSyncer, androidBiometricsStore, inputCardInfoScreen, screenNavigator, realGlobalConfigProvider, blockersDataNavigator2, sessionManager, realBlockersHelper$Factory$Impl, realMultiBlockerFacilitator);
    }
}
