package com.squareup.cash.blockers.treehouse;

import app.cash.redwood.treehouse.RealTreehouseApp;
import coil3.RealImageLoader;
import com.google.zxing.BinaryBitmap;
import com.miteksystems.misnap.camera.a.n;
import com.squareup.cash.account.backend.RealAccountSwitchAnalytics;
import com.squareup.cash.account.manager.backend.real.RealAccountRatePlanManager;
import com.squareup.cash.analytics.firebase.real.RealCashFirebaseAnalytics;
import com.squareup.cash.appforeground.AppForegroundStateProvider;
import com.squareup.cash.appmessages.RealAppMessageRepositoryWriter;
import com.squareup.cash.attribution.ProductionAttributionEventEmitter;
import com.squareup.cash.attribution.deeplink.DeepLinkOnboardingContextWorker;
import com.squareup.cash.attribution.wrappers.AppsFlyerClient;
import com.squareup.cash.banking.real.RealDisclosureProvider;
import com.squareup.cash.biometrics.AndroidBiometrics;
import com.squareup.cash.biometrics.AndroidBiometricsStore;
import com.squareup.cash.biometrics.AndroidSecureStore;
import com.squareup.cash.bitcoin.capability.RealBitcoinCapabilityProvider;
import com.squareup.cash.bitcoin.formatter.RealBitcoinFormatter;
import com.squareup.cash.bitcoin.navigation.RealBitcoinInboundNavigator$Factory$Impl;
import com.squareup.cash.bitcoin.presenters.RealBitcoinKeypadPresenter;
import com.squareup.cash.bitcoin.presenters.autoinvest.RealBitcoinAutoInvestProvider;
import com.squareup.cash.bitcoin.presenters.limits.util.NonCustodialBitcoinLimitsProvider;
import com.squareup.cash.bitcoin.presenters.map.RealBitcoinMapEligibilityManager;
import com.squareup.cash.blockers.analytics.RealBlockerFlowAnalytics;
import com.squareup.cash.boost.backend.BoostConfigManager;
import com.squareup.cash.cashapplite.CashAppLiteReleaseModule$$ExternalSyntheticLambda0;
import com.squareup.cash.cashapppay.views.CashAppPayUiFactory;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientrouting.routers.support.SupportRouter;
import com.squareup.cash.clientsync.RealRawSyncValueService;
import com.squareup.cash.clientsync.observability.RealAccountMismatchReporter;
import com.squareup.cash.clientsync.persistence.SyncEntityStore;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.clientsync.sync.ClientSyncSetupTeardown;
import com.squareup.cash.clientsync.syncer.RealClientSyncer;
import com.squareup.cash.crypto.backend.autoinvest.CryptoAutoInvestRepo;
import com.squareup.cash.crypto.backend.balance.RealCryptoBalanceRepo;
import com.squareup.cash.crypto.backend.eligibility.RealBitcoinEligibilityRepo;
import com.squareup.cash.crypto.backend.idv.CryptoIdvStatusRepo;
import com.squareup.cash.crypto.backend.profile.RealBitcoinProfileRepo;
import com.squareup.cash.crypto.common.presenters.BitcoinP2pConversionPercentageSubmitter;
import com.squareup.cash.crypto.navigation.CryptoFlowStarter;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.js.ZiplineHistoryDataJavaScripter;
import com.squareup.cash.data.profile.RealJurisdictionConfigManager;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.eligibility.backend.real.RealSettingsEligibilityManager;
import com.squareup.cash.encryption.RealClientSyncEntityDecryptor;
import com.squareup.cash.family.familyhub.backend.api.DependentRecurringPreferenceStore;
import com.squareup.cash.family.familyhub.backend.real.RealDependentCustomerTokenRepository;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.instruments.backend.real.RealBalanceSnapshotManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.investing.backend.real.RealInvestingSyncer;
import com.squareup.cash.investingcrypto.presenters.news.InvestingCryptoNewsPresenter$Factory$Impl;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.onboarding.backend.RealOnboardingFlowTokenManager;
import com.squareup.cash.payments.backend.real.RealP2pSettingsManager;
import com.squareup.cash.payments.views.PaymentsViewFactory;
import com.squareup.cash.performance.MemoryInfo;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.support.chat.backend.real.RealChatNotificationSuppressor;
import com.squareup.cash.support.navigation.RealSupportNavigator;
import com.squareup.cash.treehouse.android.RegisteredTreehouseApp;
import com.squareup.cash.treehouse.android.TreehouseModule$provideCashTreehouseAppFactory$1;
import com.squareup.cash.treehouse.android.configuration.RealTreehouseConfigurationStore;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.util.money.CurrencyConverter$Factory;
import com.squareup.cash.wallet.data.IssuedCardManager;
import com.squareup.moshi.Moshi;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.workflow1.ui.backstack.ViewStateCacheKt;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.Factory;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;

/* loaded from: classes.dex */
public final class TreehouseFlows implements RegisteredTreehouseApp {
    public final RealTreehouseApp treehouseApp;

    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId;
        public final Provider flowStarter;
        public final Provider treehouseAppFactory;
        public final Provider treehouseConfigurationStore;

        public /* synthetic */ MetroFactory(Provider provider, Provider provider2, Provider provider3, int i) {
            this.$r8$classId = i;
            this.flowStarter = provider;
            this.treehouseAppFactory = provider2;
            this.treehouseConfigurationStore = provider3;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = this.$r8$classId;
            Provider provider = this.treehouseConfigurationStore;
            Provider provider2 = this.treehouseAppFactory;
            Provider provider3 = this.flowStarter;
            switch (i) {
                case 0:
                    FlowStarter flowStarter = (FlowStarter) provider3.invoke();
                    TreehouseModule$provideCashTreehouseAppFactory$1 treehouseModule$provideCashTreehouseAppFactory$1 = (TreehouseModule$provideCashTreehouseAppFactory$1) provider2.invoke();
                    RealTreehouseConfigurationStore realTreehouseConfigurationStore = (RealTreehouseConfigurationStore) provider.invoke();
                    flowStarter.getClass();
                    treehouseModule$provideCashTreehouseAppFactory$1.getClass();
                    realTreehouseConfigurationStore.getClass();
                    return new TreehouseFlows(flowStarter, treehouseModule$provideCashTreehouseAppFactory$1, realTreehouseConfigurationStore);
                case 1:
                    Analytics analytics = (Analytics) provider3.invoke();
                    AndroidClock androidClock = (AndroidClock) provider2.invoke();
                    MemoryInfo.Reader reader = (MemoryInfo.Reader) provider.invoke();
                    analytics.getClass();
                    androidClock.getClass();
                    reader.getClass();
                    return new RealAccountSwitchAnalytics(analytics, androidClock, reader);
                case 2:
                    FeatureFlagManager featureFlagManager = (FeatureFlagManager) provider3.invoke();
                    RealP2pSettingsManager realP2pSettingsManager = (RealP2pSettingsManager) provider2.invoke();
                    RealSettingsEligibilityManager realSettingsEligibilityManager = (RealSettingsEligibilityManager) provider.invoke();
                    featureFlagManager.getClass();
                    realP2pSettingsManager.getClass();
                    realSettingsEligibilityManager.getClass();
                    return new RealAccountRatePlanManager(featureFlagManager, realP2pSettingsManager, realSettingsEligibilityManager);
                case 3:
                    CashAccountDatabaseImpl cashAccountDatabaseImpl = (CashAccountDatabaseImpl) provider3.invoke();
                    AndroidClock androidClock2 = (AndroidClock) provider2.invoke();
                    CoroutineContext coroutineContext = (CoroutineContext) provider.invoke();
                    cashAccountDatabaseImpl.getClass();
                    androidClock2.getClass();
                    coroutineContext.getClass();
                    return new RealAppMessageRepositoryWriter(cashAccountDatabaseImpl, androidClock2, coroutineContext);
                case 4:
                    AppsFlyerClient appsFlyerClient = (AppsFlyerClient) provider3.invoke();
                    RealCashFirebaseAnalytics realCashFirebaseAnalytics = (RealCashFirebaseAnalytics) provider2.invoke();
                    Analytics analytics2 = (Analytics) provider.invoke();
                    appsFlyerClient.getClass();
                    realCashFirebaseAnalytics.getClass();
                    analytics2.getClass();
                    return new ProductionAttributionEventEmitter(appsFlyerClient, realCashFirebaseAnalytics, analytics2);
                case 5:
                    AppService appService = (AppService) provider3.invoke();
                    SharedFlow sharedFlow = (SharedFlow) provider2.invoke();
                    RealOnboardingFlowTokenManager realOnboardingFlowTokenManager = (RealOnboardingFlowTokenManager) provider.invoke();
                    appService.getClass();
                    sharedFlow.getClass();
                    realOnboardingFlowTokenManager.getClass();
                    return new DeepLinkOnboardingContextWorker(appService, sharedFlow, realOnboardingFlowTokenManager);
                case 6:
                    SyncValueReader syncValueReader = (SyncValueReader) provider3.invoke();
                    ErrorReporter errorReporter = (ErrorReporter) provider2.invoke();
                    RealProfileManager realProfileManager = (RealProfileManager) provider.invoke();
                    syncValueReader.getClass();
                    errorReporter.getClass();
                    realProfileManager.getClass();
                    return new RealDisclosureProvider(syncValueReader, errorReporter, realProfileManager);
                case 7:
                    AndroidBiometrics androidBiometrics = (AndroidBiometrics) provider3.invoke();
                    AndroidSecureStore androidSecureStore = (AndroidSecureStore) provider2.invoke();
                    Analytics analytics3 = (Analytics) provider.invoke();
                    androidBiometrics.getClass();
                    androidSecureStore.getClass();
                    analytics3.getClass();
                    return new AndroidBiometricsStore(androidSecureStore, androidBiometrics, analytics3);
                case 8:
                    AndroidBiometrics androidBiometrics2 = (AndroidBiometrics) provider3.invoke();
                    AndroidSecureStore androidSecureStore2 = (AndroidSecureStore) provider2.invoke();
                    Analytics analytics4 = (Analytics) provider.invoke();
                    androidBiometrics2.getClass();
                    androidSecureStore2.getClass();
                    analytics4.getClass();
                    return new AndroidBiometricsStore(androidSecureStore2, androidBiometrics2, analytics4);
                case 9:
                    LocalizedMoneyFormatter.Factory factory = (LocalizedMoneyFormatter.Factory) provider3.invoke();
                    AndroidStringManager androidStringManager = (AndroidStringManager) provider2.invoke();
                    FeatureFlagManager featureFlagManager2 = (FeatureFlagManager) provider.invoke();
                    factory.getClass();
                    androidStringManager.getClass();
                    featureFlagManager2.getClass();
                    return new RealBitcoinFormatter(featureFlagManager2, factory, androidStringManager);
                case 10:
                    RealBitcoinFormatter realBitcoinFormatter = (RealBitcoinFormatter) provider3.invoke();
                    AndroidStringManager androidStringManager2 = (AndroidStringManager) provider2.invoke();
                    LocalizedMoneyFormatter.Factory factory2 = (LocalizedMoneyFormatter.Factory) provider.invoke();
                    realBitcoinFormatter.getClass();
                    androidStringManager2.getClass();
                    factory2.getClass();
                    return new RealBitcoinKeypadPresenter(realBitcoinFormatter, androidStringManager2, factory2);
                case 11:
                    BoostConfigManager boostConfigManager = (BoostConfigManager) provider3.invoke();
                    RealRouter$Factory$Impl realRouter$Factory$Impl = (RealRouter$Factory$Impl) provider2.invoke();
                    IssuedCardManager issuedCardManager = (IssuedCardManager) provider.invoke();
                    boostConfigManager.getClass();
                    realRouter$Factory$Impl.getClass();
                    issuedCardManager.getClass();
                    return new n(21, boostConfigManager, realRouter$Factory$Impl, issuedCardManager);
                case 12:
                    RealBitcoinMapEligibilityManager realBitcoinMapEligibilityManager = (RealBitcoinMapEligibilityManager) provider3.invoke();
                    RealBitcoinInboundNavigator$Factory$Impl realBitcoinInboundNavigator$Factory$Impl = (RealBitcoinInboundNavigator$Factory$Impl) provider2.invoke();
                    FeatureFlagManager featureFlagManager3 = (FeatureFlagManager) provider.invoke();
                    realBitcoinMapEligibilityManager.getClass();
                    realBitcoinInboundNavigator$Factory$Impl.getClass();
                    featureFlagManager3.getClass();
                    return new n(22, realBitcoinMapEligibilityManager, realBitcoinInboundNavigator$Factory$Impl, featureFlagManager3);
                case 13:
                    InvestingCryptoNewsPresenter$Factory$Impl investingCryptoNewsPresenter$Factory$Impl = (InvestingCryptoNewsPresenter$Factory$Impl) provider3.invoke();
                    RealInvestingSyncer realInvestingSyncer = (RealInvestingSyncer) provider2.invoke();
                    CoroutineContext coroutineContext2 = (CoroutineContext) provider.invoke();
                    investingCryptoNewsPresenter$Factory$Impl.getClass();
                    realInvestingSyncer.getClass();
                    coroutineContext2.getClass();
                    return new n(23, investingCryptoNewsPresenter$Factory$Impl, realInvestingSyncer, coroutineContext2);
                case 14:
                    AndroidStringManager androidStringManager3 = (AndroidStringManager) provider3.invoke();
                    CryptoIdvStatusRepo cryptoIdvStatusRepo = (CryptoIdvStatusRepo) provider2.invoke();
                    CryptoFlowStarter cryptoFlowStarter = (CryptoFlowStarter) provider.invoke();
                    androidStringManager3.getClass();
                    cryptoIdvStatusRepo.getClass();
                    cryptoFlowStarter.getClass();
                    return new n(24, androidStringManager3, cryptoIdvStatusRepo, cryptoFlowStarter);
                case 15:
                    CryptoAutoInvestRepo cryptoAutoInvestRepo = (CryptoAutoInvestRepo) provider3.invoke();
                    DependentRecurringPreferenceStore dependentRecurringPreferenceStore = (DependentRecurringPreferenceStore) provider2.invoke();
                    RealDependentCustomerTokenRepository realDependentCustomerTokenRepository = (RealDependentCustomerTokenRepository) provider.invoke();
                    cryptoAutoInvestRepo.getClass();
                    dependentRecurringPreferenceStore.getClass();
                    realDependentCustomerTokenRepository.getClass();
                    return new RealBitcoinAutoInvestProvider(cryptoAutoInvestRepo, dependentRecurringPreferenceStore, realDependentCustomerTokenRepository);
                case 16:
                    RealCryptoBalanceRepo realCryptoBalanceRepo = (RealCryptoBalanceRepo) provider3.invoke();
                    CurrencyConverter$Factory currencyConverter$Factory = (CurrencyConverter$Factory) provider2.invoke();
                    RealJurisdictionConfigManager realJurisdictionConfigManager = (RealJurisdictionConfigManager) provider.invoke();
                    realCryptoBalanceRepo.getClass();
                    currencyConverter$Factory.getClass();
                    realJurisdictionConfigManager.getClass();
                    return new NonCustodialBitcoinLimitsProvider(realCryptoBalanceRepo, currencyConverter$Factory, realJurisdictionConfigManager);
                case 17:
                    RealBitcoinCapabilityProvider realBitcoinCapabilityProvider = (RealBitcoinCapabilityProvider) provider3.invoke();
                    RealBalanceSnapshotManager realBalanceSnapshotManager = (RealBalanceSnapshotManager) provider2.invoke();
                    RealCryptoBalanceRepo realCryptoBalanceRepo2 = (RealCryptoBalanceRepo) provider.invoke();
                    realBitcoinCapabilityProvider.getClass();
                    realBalanceSnapshotManager.getClass();
                    realCryptoBalanceRepo2.getClass();
                    return new BinaryBitmap(realBitcoinCapabilityProvider, realBalanceSnapshotManager, realCryptoBalanceRepo2);
                case 18:
                    Analytics analytics5 = (Analytics) provider3.invoke();
                    AppForegroundStateProvider appForegroundStateProvider = (AppForegroundStateProvider) provider2.invoke();
                    FeatureFlagManager featureFlagManager4 = (FeatureFlagManager) provider.invoke();
                    analytics5.getClass();
                    appForegroundStateProvider.getClass();
                    featureFlagManager4.getClass();
                    return new RealBlockerFlowAnalytics(analytics5, appForegroundStateProvider, featureFlagManager4);
                case 19:
                    RealImageLoader realImageLoader = (RealImageLoader) provider3.invoke();
                    ErrorReporter errorReporter2 = (ErrorReporter) provider2.invoke();
                    FeatureFlagManager featureFlagManager5 = (FeatureFlagManager) provider.invoke();
                    realImageLoader.getClass();
                    errorReporter2.getClass();
                    featureFlagManager5.getClass();
                    return new PaymentsViewFactory(2, realImageLoader, errorReporter2, featureFlagManager5);
                case 20:
                    LocalizedMoneyFormatter.Factory factory3 = (LocalizedMoneyFormatter.Factory) provider3.invoke();
                    RealImageLoader realImageLoader2 = (RealImageLoader) provider2.invoke();
                    FeatureFlagManager featureFlagManager6 = (FeatureFlagManager) provider.invoke();
                    factory3.getClass();
                    realImageLoader2.getClass();
                    featureFlagManager6.getClass();
                    return new CashAppPayUiFactory(factory3, realImageLoader2, featureFlagManager6);
                case 21:
                    RealSupportNavigator realSupportNavigator = (RealSupportNavigator) provider3.invoke();
                    RealChatNotificationSuppressor realChatNotificationSuppressor = (RealChatNotificationSuppressor) provider2.invoke();
                    AndroidClock androidClock3 = (AndroidClock) provider.invoke();
                    realSupportNavigator.getClass();
                    realChatNotificationSuppressor.getClass();
                    androidClock3.getClass();
                    return new SupportRouter.Factory(realSupportNavigator, realChatNotificationSuppressor, androidClock3);
                case 22:
                    SyncEntityStore syncEntityStore = (SyncEntityStore) provider3.invoke();
                    RealClientSyncEntityDecryptor realClientSyncEntityDecryptor = (RealClientSyncEntityDecryptor) provider2.invoke();
                    CoroutineContext coroutineContext3 = (CoroutineContext) provider.invoke();
                    syncEntityStore.getClass();
                    realClientSyncEntityDecryptor.getClass();
                    coroutineContext3.getClass();
                    return new RealRawSyncValueService(syncEntityStore, realClientSyncEntityDecryptor, coroutineContext3);
                case 23:
                    ErrorReporter errorReporter3 = (ErrorReporter) provider3.invoke();
                    FeatureFlagManager featureFlagManager7 = (FeatureFlagManager) provider2.invoke();
                    SessionManager sessionManager = (SessionManager) provider.invoke();
                    errorReporter3.getClass();
                    featureFlagManager7.getClass();
                    sessionManager.getClass();
                    return new RealAccountMismatchReporter(errorReporter3, featureFlagManager7, sessionManager);
                case 24:
                    RealClientSyncer realClientSyncer = (RealClientSyncer) provider3.invoke();
                    SessionManager sessionManager2 = (SessionManager) provider2.invoke();
                    SyncValueReader syncValueReader2 = (SyncValueReader) provider.invoke();
                    realClientSyncer.getClass();
                    sessionManager2.getClass();
                    syncValueReader2.getClass();
                    return new ClientSyncSetupTeardown(realClientSyncer, sessionManager2, syncValueReader2);
                case 25:
                    FeatureFlagManager featureFlagManager8 = (FeatureFlagManager) provider3.invoke();
                    RealProfileManager realProfileManager2 = (RealProfileManager) provider2.invoke();
                    SyncValueReader syncValueReader3 = (SyncValueReader) provider.invoke();
                    featureFlagManager8.getClass();
                    realProfileManager2.getClass();
                    syncValueReader3.getClass();
                    return new RealBitcoinEligibilityRepo(featureFlagManager8, realProfileManager2, syncValueReader3);
                case 26:
                    FeatureFlagManager featureFlagManager9 = (FeatureFlagManager) provider3.invoke();
                    RealProfileManager realProfileManager3 = (RealProfileManager) provider2.invoke();
                    SyncValueReader syncValueReader4 = (SyncValueReader) provider.invoke();
                    featureFlagManager9.getClass();
                    realProfileManager3.getClass();
                    syncValueReader4.getClass();
                    return new RealBitcoinProfileRepo(featureFlagManager9, realProfileManager3, syncValueReader4);
                case 27:
                    CashAppLiteReleaseModule$$ExternalSyntheticLambda0 cashAppLiteReleaseModule$$ExternalSyntheticLambda0 = (CashAppLiteReleaseModule$$ExternalSyntheticLambda0) provider.invoke();
                    provider3.getClass();
                    provider2.getClass();
                    cashAppLiteReleaseModule$$ExternalSyntheticLambda0.getClass();
                    return ViewStateCacheKt.provideStablecoinNetworkRepo$real(provider3, provider2, cashAppLiteReleaseModule$$ExternalSyntheticLambda0);
                case 28:
                    AppService appService2 = (AppService) provider3.invoke();
                    BlockersDataNavigator blockersDataNavigator = (BlockersDataNavigator) provider2.invoke();
                    AndroidStringManager androidStringManager4 = (AndroidStringManager) provider.invoke();
                    appService2.getClass();
                    blockersDataNavigator.getClass();
                    androidStringManager4.getClass();
                    return new BitcoinP2pConversionPercentageSubmitter(appService2, blockersDataNavigator, androidStringManager4);
                default:
                    Moshi moshi = (Moshi) provider.invoke();
                    provider3.getClass();
                    provider2.getClass();
                    moshi.getClass();
                    return new ZiplineHistoryDataJavaScripter(provider3, provider2, moshi);
            }
        }
    }

    public TreehouseFlows(FlowStarter flowStarter, TreehouseModule$provideCashTreehouseAppFactory$1 treehouseModule$provideCashTreehouseAppFactory$1, RealTreehouseConfigurationStore realTreehouseConfigurationStore) {
        this.treehouseApp = treehouseModule$provideCashTreehouseAppFactory$1.create(realTreehouseConfigurationStore.manifestUrlFlow("flows"), "flows", new TreehouseFlows$$ExternalSyntheticLambda0(realTreehouseConfigurationStore, 0));
        FlowKt.MutableStateFlow(RegisteredTreehouseApp.FeatureFlagState.NONE);
    }

    @Override // com.squareup.cash.treehouse.android.RegisteredTreehouseApp
    public final RealTreehouseApp getTreehouseApp() {
        return this.treehouseApp;
    }
}
