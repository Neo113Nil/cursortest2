package com.squareup.cash.pools.presenters;

import app.cash.badging.backend.RealBadger2;
import app.cash.cdp.integration.CashCdpConfigProvider;
import app.cash.local.views.LocalViewFactory;
import app.cash.passcode.backend.RealAppLockState;
import com.squareup.cash.NavigationSideEffects;
import com.squareup.cash.UiSandboxedSetupTeardowns;
import com.squareup.cash.activity.presenters.RealActivityItemPresenterFactory;
import com.squareup.cash.appmessages.RealAppMessageManager;
import com.squareup.cash.arcade.ArcadeModule$ProvideHapticVibratorMetroFactory;
import com.squareup.cash.blockers.treehouse.TreehouseFlows;
import com.squareup.cash.braze.RealBrazeManager;
import com.squareup.cash.cashapplite.cashin.RealLiteCashInRepo$MetroFactory;
import com.squareup.cash.data.TemporaryStorage;
import com.squareup.cash.family.familyhub.backend.real.RealDependentBalancesStore;
import com.squareup.cash.featureflags.RealSessionFlags;
import com.squareup.cash.gcl.RealGlobalConfigManager;
import com.squareup.cash.keystore.AttestedKeyMetrics$MetroFactory;
import com.squareup.cash.keystore.RealMessageSigner;
import com.squareup.cash.knot.backend.real.RealKnotLauncher;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.merchant.backend.real.RealMerchantProfileRepo$MetroFactory;
import com.squareup.cash.moneybot.backend.real.managers.RealChatManager;
import com.squareup.cash.music.views.MusicViewFactory$MetroFactory;
import com.squareup.cash.notifications.RealAndroidNotificationSettingsChecker;
import com.squareup.cash.storage.RealFileDownloader;
import com.squareup.cash.storage.SandboxJanitor;
import com.squareup.cash.ui.BreadcrumbListener;
import com.squareup.cash.ui.BroadwayModule$ProvideBroadwayMetroFactory;
import com.squareup.cash.wallet.views.WalletUiFactory$MetroFactory;
import com.squareup.cash.work.session.RealCurrentUserSetter;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DelegateFactory;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import dev.zacsweers.metro.internal.InstanceFactory;

/* loaded from: classes.dex */
public final class PoolDetailsPresenter$MetroFactory {
    public final Provider activitiesCacheManager;
    public final Provider activityEmbeddedPresenterFactory;
    public final Provider analytics;
    public final Provider blockersNavigator;
    public final Provider clock;
    public final Provider dateFormatManager;
    public final Provider defaultActivityItemEventHandlerFactory;
    public final Provider featureFlagManager;
    public final Provider launcher;
    public final Provider moneyFormatterFactory;
    public final Provider poolsRepository;
    public final Provider sessionManager;
    public final Provider stringManager;
    public final Provider uuidGenerator;

    public PoolDetailsPresenter$MetroFactory(RealBadger2.MetroFactory metroFactory, MusicViewFactory$MetroFactory musicViewFactory$MetroFactory, Provider provider, LambdaProvider lambdaProvider, LambdaProvider lambdaProvider2, SandboxJanitor.MetroFactory metroFactory2, TemporaryStorage.MetroFactory metroFactory3, InstanceFactory instanceFactory, RealAppLockState.MetroFactory metroFactory4, Provider provider2, LambdaProvider lambdaProvider3, InstanceFactory instanceFactory2, Provider provider3, Provider provider4) {
        this.stringManager = metroFactory;
        this.sessionManager = musicViewFactory$MetroFactory;
        this.moneyFormatterFactory = provider;
        this.poolsRepository = lambdaProvider;
        this.launcher = lambdaProvider2;
        this.dateFormatManager = metroFactory2;
        this.clock = metroFactory3;
        this.uuidGenerator = instanceFactory;
        this.blockersNavigator = metroFactory4;
        this.activityEmbeddedPresenterFactory = provider2;
        this.defaultActivityItemEventHandlerFactory = lambdaProvider3;
        this.analytics = instanceFactory2;
        this.featureFlagManager = provider3;
        this.activitiesCacheManager = provider4;
    }

    public PoolDetailsPresenter$MetroFactory(NavigationSideEffects.MetroFactory metroFactory, LambdaProvider lambdaProvider, DoubleCheck doubleCheck, DoubleCheck doubleCheck2, LambdaProvider lambdaProvider2, DoubleCheck doubleCheck3, RealAndroidNotificationSettingsChecker.MetroFactory metroFactory2, DoubleCheck doubleCheck4, IntentLauncher.MetroFactory metroFactory3, LambdaProvider lambdaProvider3, RealLiteCashInRepo$MetroFactory realLiteCashInRepo$MetroFactory, InstanceFactory instanceFactory, RealAppLockState.MetroFactory metroFactory4, InstanceFactory instanceFactory2) {
        this.moneyFormatterFactory = metroFactory;
        this.stringManager = lambdaProvider;
        this.blockersNavigator = doubleCheck;
        this.poolsRepository = doubleCheck2;
        this.sessionManager = lambdaProvider2;
        this.analytics = doubleCheck3;
        this.launcher = metroFactory2;
        this.featureFlagManager = doubleCheck4;
        this.activityEmbeddedPresenterFactory = metroFactory3;
        this.dateFormatManager = lambdaProvider3;
        this.clock = realLiteCashInRepo$MetroFactory;
        this.uuidGenerator = instanceFactory;
        this.defaultActivityItemEventHandlerFactory = metroFactory4;
        this.activitiesCacheManager = instanceFactory2;
    }

    public PoolDetailsPresenter$MetroFactory(RealMessageSigner.MetroFactory metroFactory, NavigationSideEffects.MetroFactory metroFactory2, LambdaProvider lambdaProvider, LambdaProvider lambdaProvider2, IntentLauncher.MetroFactory metroFactory3, DoubleCheck doubleCheck, LambdaProvider lambdaProvider3, LambdaProvider lambdaProvider4, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3, LambdaProvider lambdaProvider5, InstanceFactory instanceFactory, DoubleCheck doubleCheck4, InstanceFactory instanceFactory2) {
        this.moneyFormatterFactory = metroFactory;
        this.poolsRepository = metroFactory2;
        this.stringManager = lambdaProvider;
        this.sessionManager = lambdaProvider2;
        this.launcher = metroFactory3;
        this.blockersNavigator = doubleCheck;
        this.dateFormatManager = lambdaProvider3;
        this.clock = lambdaProvider4;
        this.analytics = doubleCheck2;
        this.featureFlagManager = doubleCheck3;
        this.uuidGenerator = lambdaProvider5;
        this.activityEmbeddedPresenterFactory = instanceFactory;
        this.activitiesCacheManager = doubleCheck4;
        this.defaultActivityItemEventHandlerFactory = instanceFactory2;
    }

    public PoolDetailsPresenter$MetroFactory(DoubleCheck doubleCheck, IntentLauncher.MetroFactory metroFactory, TreehouseFlows.MetroFactory metroFactory2, DelegateFactory delegateFactory, LambdaProvider lambdaProvider, RealAppLockState.MetroFactory metroFactory3, RealFileDownloader.MetroFactory metroFactory4, RealGlobalConfigManager.MetroFactory metroFactory5, CashCdpConfigProvider.MetroFactory metroFactory6, ArcadeModule$ProvideHapticVibratorMetroFactory arcadeModule$ProvideHapticVibratorMetroFactory, TreehouseFlows.MetroFactory metroFactory7, InstanceFactory instanceFactory, RealMessageSigner.MetroFactory metroFactory8, LambdaProvider lambdaProvider2) {
        this.blockersNavigator = doubleCheck;
        this.moneyFormatterFactory = metroFactory;
        this.poolsRepository = metroFactory2;
        this.dateFormatManager = delegateFactory;
        this.stringManager = lambdaProvider;
        this.launcher = metroFactory3;
        this.activityEmbeddedPresenterFactory = metroFactory4;
        this.defaultActivityItemEventHandlerFactory = metroFactory5;
        this.clock = metroFactory6;
        this.uuidGenerator = arcadeModule$ProvideHapticVibratorMetroFactory;
        this.analytics = metroFactory7;
        this.featureFlagManager = instanceFactory;
        this.activitiesCacheManager = metroFactory8;
        this.sessionManager = lambdaProvider2;
    }

    public PoolDetailsPresenter$MetroFactory(DoubleCheck doubleCheck, RealChatManager.MetroFactory metroFactory, RealSessionFlags.MetroFactory metroFactory2, WalletUiFactory$MetroFactory walletUiFactory$MetroFactory, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3, AttestedKeyMetrics$MetroFactory attestedKeyMetrics$MetroFactory, RealMessageSigner.MetroFactory metroFactory3, LambdaProvider lambdaProvider, Provider provider, LambdaProvider lambdaProvider2, MusicViewFactory$MetroFactory musicViewFactory$MetroFactory, InstanceFactory instanceFactory, LambdaProvider lambdaProvider3) {
        this.moneyFormatterFactory = doubleCheck;
        this.poolsRepository = metroFactory;
        this.launcher = metroFactory2;
        this.activityEmbeddedPresenterFactory = walletUiFactory$MetroFactory;
        this.blockersNavigator = doubleCheck2;
        this.analytics = doubleCheck3;
        this.defaultActivityItemEventHandlerFactory = attestedKeyMetrics$MetroFactory;
        this.clock = metroFactory3;
        this.stringManager = lambdaProvider;
        this.uuidGenerator = provider;
        this.sessionManager = lambdaProvider2;
        this.featureFlagManager = musicViewFactory$MetroFactory;
        this.activitiesCacheManager = instanceFactory;
        this.dateFormatManager = lambdaProvider3;
    }

    public PoolDetailsPresenter$MetroFactory(DoubleCheck doubleCheck, LambdaProvider lambdaProvider, RealBrazeManager.MetroFactory metroFactory, DoubleCheck doubleCheck2, UiSandboxedSetupTeardowns.MetroFactory metroFactory2, DoubleCheck doubleCheck3, DoubleCheck doubleCheck4, DoubleCheck doubleCheck5, RealKnotLauncher.MetroFactory metroFactory3, TreehouseFlows.MetroFactory metroFactory4, DoubleCheck doubleCheck6, LambdaProvider lambdaProvider2, InstanceFactory instanceFactory, LocalViewFactory.MetroFactory metroFactory5) {
        this.blockersNavigator = doubleCheck;
        this.stringManager = lambdaProvider;
        this.moneyFormatterFactory = metroFactory;
        this.analytics = doubleCheck2;
        this.poolsRepository = metroFactory2;
        this.featureFlagManager = doubleCheck3;
        this.activitiesCacheManager = doubleCheck4;
        this.dateFormatManager = doubleCheck5;
        this.launcher = metroFactory3;
        this.activityEmbeddedPresenterFactory = metroFactory4;
        this.clock = doubleCheck6;
        this.sessionManager = lambdaProvider2;
        this.defaultActivityItemEventHandlerFactory = instanceFactory;
        this.uuidGenerator = metroFactory5;
    }

    public PoolDetailsPresenter$MetroFactory(DoubleCheck doubleCheck, DoubleCheck doubleCheck2, RealDependentBalancesStore.MetroFactory metroFactory, DoubleCheck doubleCheck3, LambdaProvider lambdaProvider, RealMerchantProfileRepo$MetroFactory realMerchantProfileRepo$MetroFactory, InstanceFactory instanceFactory, MusicViewFactory$MetroFactory musicViewFactory$MetroFactory, InstanceFactory instanceFactory2, InstanceFactory instanceFactory3, DoubleCheck doubleCheck4, LambdaProvider lambdaProvider2, InstanceFactory instanceFactory4, LambdaProvider lambdaProvider3) {
        this.blockersNavigator = doubleCheck;
        this.analytics = doubleCheck2;
        this.moneyFormatterFactory = metroFactory;
        this.featureFlagManager = doubleCheck3;
        this.stringManager = lambdaProvider;
        this.clock = realMerchantProfileRepo$MetroFactory;
        this.poolsRepository = instanceFactory;
        this.launcher = musicViewFactory$MetroFactory;
        this.activityEmbeddedPresenterFactory = instanceFactory2;
        this.defaultActivityItemEventHandlerFactory = instanceFactory3;
        this.activitiesCacheManager = doubleCheck4;
        this.sessionManager = lambdaProvider2;
        this.uuidGenerator = instanceFactory4;
        this.dateFormatManager = lambdaProvider3;
    }

    public PoolDetailsPresenter$MetroFactory(DoubleCheck doubleCheck, DoubleCheck doubleCheck2, WalletUiFactory$MetroFactory walletUiFactory$MetroFactory, LambdaProvider lambdaProvider, DoubleCheck doubleCheck3, AttestedKeyMetrics$MetroFactory attestedKeyMetrics$MetroFactory, RealAppMessageManager.MetroFactory metroFactory, InstanceFactory instanceFactory, BroadwayModule$ProvideBroadwayMetroFactory broadwayModule$ProvideBroadwayMetroFactory, RealLiteCashInRepo$MetroFactory realLiteCashInRepo$MetroFactory, RealCurrentUserSetter.MetroFactory metroFactory2, DoubleCheck doubleCheck4, CashCdpConfigProvider.MetroFactory metroFactory3, RealMessageSigner.MetroFactory metroFactory4) {
        this.moneyFormatterFactory = doubleCheck;
        this.blockersNavigator = doubleCheck2;
        this.poolsRepository = walletUiFactory$MetroFactory;
        this.stringManager = lambdaProvider;
        this.analytics = doubleCheck3;
        this.launcher = attestedKeyMetrics$MetroFactory;
        this.activityEmbeddedPresenterFactory = metroFactory;
        this.defaultActivityItemEventHandlerFactory = instanceFactory;
        this.sessionManager = broadwayModule$ProvideBroadwayMetroFactory;
        this.dateFormatManager = realLiteCashInRepo$MetroFactory;
        this.clock = metroFactory2;
        this.uuidGenerator = doubleCheck4;
        this.featureFlagManager = metroFactory3;
        this.activitiesCacheManager = metroFactory4;
    }

    public /* synthetic */ PoolDetailsPresenter$MetroFactory(Factory factory, Provider provider, Provider provider2, Provider provider3, Factory factory2, Provider provider4, DoubleCheck doubleCheck, Provider provider5, LambdaProvider lambdaProvider, Provider provider6, Provider provider7, Provider provider8, DoubleCheck doubleCheck2, Provider provider9) {
        this.moneyFormatterFactory = factory;
        this.poolsRepository = provider;
        this.launcher = provider2;
        this.activityEmbeddedPresenterFactory = provider3;
        this.defaultActivityItemEventHandlerFactory = factory2;
        this.stringManager = provider4;
        this.sessionManager = doubleCheck;
        this.dateFormatManager = provider5;
        this.clock = lambdaProvider;
        this.uuidGenerator = provider6;
        this.blockersNavigator = provider7;
        this.analytics = provider8;
        this.featureFlagManager = doubleCheck2;
        this.activitiesCacheManager = provider9;
    }

    public PoolDetailsPresenter$MetroFactory(InstanceFactory instanceFactory, RealAppLockState.MetroFactory metroFactory, RealActivityItemPresenterFactory.MetroFactory metroFactory2, RealAppLockState.MetroFactory metroFactory3, InstanceFactory instanceFactory2, DoubleCheck doubleCheck, CashCdpConfigProvider.MetroFactory metroFactory4, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3, AttestedKeyMetrics$MetroFactory attestedKeyMetrics$MetroFactory, RealAppLockState.MetroFactory metroFactory5, BreadcrumbListener.MetroFactory metroFactory6, DoubleCheck doubleCheck4, LambdaProvider lambdaProvider) {
        this.sessionManager = instanceFactory;
        this.moneyFormatterFactory = metroFactory;
        this.dateFormatManager = metroFactory2;
        this.poolsRepository = metroFactory3;
        this.launcher = instanceFactory2;
        this.blockersNavigator = doubleCheck;
        this.clock = metroFactory4;
        this.analytics = doubleCheck2;
        this.featureFlagManager = doubleCheck3;
        this.activityEmbeddedPresenterFactory = attestedKeyMetrics$MetroFactory;
        this.uuidGenerator = metroFactory5;
        this.defaultActivityItemEventHandlerFactory = metroFactory6;
        this.activitiesCacheManager = doubleCheck4;
        this.stringManager = lambdaProvider;
    }

    public PoolDetailsPresenter$MetroFactory(InstanceFactory instanceFactory, InstanceFactory instanceFactory2, LambdaProvider lambdaProvider, InstanceFactory instanceFactory3, DoubleCheck doubleCheck, LambdaProvider lambdaProvider2, DoubleCheck doubleCheck2, RealCurrentUserSetter.MetroFactory metroFactory, DoubleCheck doubleCheck3, TreehouseFlows.MetroFactory metroFactory2, RealKnotLauncher.MetroFactory metroFactory3, LambdaProvider lambdaProvider3, MusicViewFactory$MetroFactory musicViewFactory$MetroFactory, LambdaProvider lambdaProvider4) {
        this.moneyFormatterFactory = instanceFactory;
        this.poolsRepository = instanceFactory2;
        this.stringManager = lambdaProvider;
        this.launcher = instanceFactory3;
        this.blockersNavigator = doubleCheck;
        this.sessionManager = lambdaProvider2;
        this.analytics = doubleCheck2;
        this.uuidGenerator = metroFactory;
        this.featureFlagManager = doubleCheck3;
        this.activityEmbeddedPresenterFactory = metroFactory2;
        this.defaultActivityItemEventHandlerFactory = metroFactory3;
        this.dateFormatManager = lambdaProvider3;
        this.activitiesCacheManager = musicViewFactory$MetroFactory;
        this.clock = lambdaProvider4;
    }
}
