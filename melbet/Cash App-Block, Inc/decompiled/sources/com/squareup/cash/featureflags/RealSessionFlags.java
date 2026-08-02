package com.squareup.cash.featureflags;

import android.content.SharedPreferences;
import androidx.compose.runtime.AbstractApplier;
import androidx.lifecycle.Lifecycle;
import androidx.room.Room;
import app.cash.local.backend.real.RealLocalOrderRepository;
import app.cash.local.presenters.RealOrderBuilder$Factory$Impl;
import app.cash.local.presenters.RealOrderBuilderStore;
import app.cash.local.presenters.cart.LocalCartCheckoutNavigator;
import app.cash.local.store.real.RealLocalInstalledStore;
import app.cash.molecule.PlatformKt;
import coil3.ComponentRegistry;
import coil3.RealImageLoader;
import com.squareup.cash.activity.backend.ZiplineActivityItemFormatter;
import com.squareup.cash.api.ExperimentExposure;
import com.squareup.cash.api.ExperimentExposureTracker;
import com.squareup.cash.bitcoin.views.BitcoinUiFactory;
import com.squareup.cash.boost.backend.RealBoostConfigManager;
import com.squareup.cash.boost.backend.RealBoostSelector;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientrouting.fallback.RealSelectiveUnrecognizedURLNavigator;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.crypto.backend.balance.RealCryptoBalanceRepo;
import com.squareup.cash.crypto.backend.performance.RealBitcoinPerformanceDataRepo;
import com.squareup.cash.crypto.backend.value.RealCryptoValueRepo;
import com.squareup.cash.data.contacts.RealContactRepository;
import com.squareup.cash.data.contacts.RealContactSyncDetailsRepository;
import com.squareup.cash.data.profile.RealJurisdictionConfigManager;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.data.profile.documents.RealAfterpayStatementManager;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.deviceintegrity.RealDeviceIntegrityAttester;
import com.squareup.cash.e2ee.signature.RealSignatureManager;
import com.squareup.cash.elementboundsregistry.core.ElementBoundsRegistry;
import com.squareup.cash.eligibility.backend.real.RealSettingsEligibilityManager;
import com.squareup.cash.family.familyhub.backend.real.RealFamilyAccountsManager;
import com.squareup.cash.filepicker.RealFilePicker$Factory$Impl;
import com.squareup.cash.identityverification.backend.real.RealIdentityVerificationRepo;
import com.squareup.cash.instruments.backend.real.RealBalanceSnapshotManager;
import com.squareup.cash.instruments.backend.real.RealInstrumentManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.intent.RealDeepLinking;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.maps.engine.providers.GoogleMapEngineProvider;
import com.squareup.cash.moneybot.components.api.ClientRenderablePluginRegistry;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.mosaic.resources.api.v2.ResourceService;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.observability.backend.real.network.RealRequestObserver;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.offers.backend.real.RealOffersSheetRepository;
import com.squareup.cash.payments.backend.real.RealPersonalizationRepository;
import com.squareup.cash.payments.backend.real.RealStatusAndLimitsManager;
import com.squareup.cash.permissions.PermissionChecker;
import com.squareup.cash.profile.repo.real.RealProfileRepo;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.session.backend.RealSessionRefresher;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.shopping.backend.real.RealShopHubRepository;
import com.squareup.cash.support.backend.api.SupportActivityItemLoader;
import com.squareup.cash.threedsdataonly.backend.real.RealThreeDsService;
import com.squareup.cash.threedsdataonly.backend.real.RealThreeDsSpanTrackingService;
import com.squareup.cash.threedsdataonly.backend.real.RealThreeDsWarningsRepository;
import com.squareup.cash.transfers.backend.real.RealBalanceBasedAddCashManager;
import com.squareup.cash.transfers.backend.real.RealIcuStringFormatter;
import com.squareup.cash.treehouse.activity.ActivityDataBridge;
import com.squareup.cash.treehouse.activity.HostActivityDataBridge;
import com.squareup.cash.ui.SplashScreenAnimationObserver;
import com.squareup.cash.ui.util.RealCashScreenBrightness;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.util.money.CurrencyConverter$Factory;
import com.squareup.cash.work.data.real.RealGetClockInControlsUseCase;
import com.squareup.cash.work.session.RealCurrentUserProvider;
import com.squareup.cash.work.session.RealSelectedMerchantProvider;
import com.squareup.cash.work.tinygraph.real.RealMembershipRepository;
import com.squareup.cash.work.tinygraph.real.RealMerchantRepository;
import com.squareup.cash.work.tinygraph.real.RealSettingRepository;
import com.squareup.moshi.Moshi;
import com.squareup.preferences.KeyValue;
import com.squareup.preferences.SharedPreferencesKeyValue;
import com.squareup.protos.cash.cashface.api.CashFaceClientService;
import com.squareup.protos.cash.cashsuggest.api.CashSuggestClientService;
import com.squareup.protos.cash.customersearch.api.CustomerSearchClientService;
import com.squareup.protos.cash.orderly.app.afterpaystatements.AfterpayStatementsClientService;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.rewardly.app.RewardlyExternalAppService;
import com.squareup.util.android.RealBackupService;
import com.squareup.util.coroutines.Signal;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.util.coroutines.Teardown;
import com.squareup.util.coroutines.android.IoActivitySetupTeardown;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.Factory;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.StateFlowImpl;
import retrofit2.Retrofit;

/* loaded from: classes.dex */
public final class RealSessionFlags implements IoActivitySetupTeardown {
    public final ExperimentExposureTracker experimentExposureTracker;
    public final FeatureFlagManager featureFlagManager;
    public final StateFlowImpl launchMoneyTabAsHome;
    public final SessionFlagKeyValue liquidGlassKeyValue;
    public final StateFlowImpl moneybotHome;
    public final SessionFlagKeyValue moneybotHomeKeyValue;
    public final StateFlowImpl moneybotRespectSystemAppearance;
    public final SessionFlagKeyValue moneybotRespectSystemAppearanceKeyValue;
    public boolean onboarded;
    public final SessionManager sessionManager;
    public final StateFlowImpl showModernTabs;
    public final Flow signOut;

    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId;
        public final Provider experimentExposureTracker;
        public final Provider featureFlagManager;
        public final Provider preferences;
        public final Provider sessionManager;
        public final Provider signOut;

        public /* synthetic */ MetroFactory(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, int i) {
            this.$r8$classId = i;
            this.featureFlagManager = provider;
            this.sessionManager = provider2;
            this.experimentExposureTracker = provider3;
            this.preferences = provider4;
            this.signOut = provider5;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = this.$r8$classId;
            Provider provider = this.signOut;
            Provider provider2 = this.preferences;
            Provider provider3 = this.experimentExposureTracker;
            Provider provider4 = this.sessionManager;
            Provider provider5 = this.featureFlagManager;
            switch (i) {
                case 0:
                    FeatureFlagManager featureFlagManager = (FeatureFlagManager) provider5.invoke();
                    SessionManager sessionManager = (SessionManager) provider4.invoke();
                    ExperimentExposureTracker experimentExposureTracker = (ExperimentExposureTracker) provider3.invoke();
                    SharedPreferences sharedPreferences = (SharedPreferences) provider2.invoke();
                    Flow flow = (Flow) provider.invoke();
                    featureFlagManager.getClass();
                    sessionManager.getClass();
                    experimentExposureTracker.getClass();
                    sharedPreferences.getClass();
                    flow.getClass();
                    return new RealSessionFlags(featureFlagManager, sessionManager, experimentExposureTracker, sharedPreferences, flow);
                case 1:
                    RealLocalOrderRepository realLocalOrderRepository = (RealLocalOrderRepository) provider5.invoke();
                    RealOrderBuilder$Factory$Impl realOrderBuilder$Factory$Impl = (RealOrderBuilder$Factory$Impl) provider4.invoke();
                    RealOrderBuilderStore realOrderBuilderStore = (RealOrderBuilderStore) provider3.invoke();
                    AndroidStringManager androidStringManager = (AndroidStringManager) provider2.invoke();
                    RealUuidGenerator realUuidGenerator = (RealUuidGenerator) provider.invoke();
                    realLocalOrderRepository.getClass();
                    realOrderBuilder$Factory$Impl.getClass();
                    realOrderBuilderStore.getClass();
                    androidStringManager.getClass();
                    realUuidGenerator.getClass();
                    return new LocalCartCheckoutNavigator(realLocalOrderRepository, realOrderBuilder$Factory$Impl, realOrderBuilderStore, androidStringManager, realUuidGenerator);
                case 2:
                    CashAccountDatabaseImpl cashAccountDatabaseImpl = (CashAccountDatabaseImpl) provider5.invoke();
                    AndroidClock androidClock = (AndroidClock) provider4.invoke();
                    SyncValueReader syncValueReader = (SyncValueReader) provider3.invoke();
                    CoroutineContext coroutineContext = (CoroutineContext) provider2.invoke();
                    RealProfileManager realProfileManager = (RealProfileManager) provider.invoke();
                    cashAccountDatabaseImpl.getClass();
                    androidClock.getClass();
                    syncValueReader.getClass();
                    coroutineContext.getClass();
                    realProfileManager.getClass();
                    return new RealLocalInstalledStore(cashAccountDatabaseImpl, androidClock, syncValueReader, coroutineContext, realProfileManager);
                case 3:
                    ActivityDataBridge activityDataBridge = (ActivityDataBridge) provider5.invoke();
                    HostActivityDataBridge hostActivityDataBridge = (HostActivityDataBridge) provider4.invoke();
                    Moshi moshi = (Moshi) provider3.invoke();
                    CoroutineContext coroutineContext2 = (CoroutineContext) provider2.invoke();
                    ErrorReporter errorReporter = (ErrorReporter) provider.invoke();
                    activityDataBridge.getClass();
                    hostActivityDataBridge.getClass();
                    moshi.getClass();
                    coroutineContext2.getClass();
                    errorReporter.getClass();
                    return new ZiplineActivityItemFormatter(activityDataBridge, hostActivityDataBridge, moshi, coroutineContext2, errorReporter);
                case 4:
                    RealDeepLinking realDeepLinking = (RealDeepLinking) provider5.invoke();
                    IntentLauncher intentLauncher = (IntentLauncher) provider4.invoke();
                    RealRouter$Factory$Impl realRouter$Factory$Impl = (RealRouter$Factory$Impl) provider3.invoke();
                    RealSelectiveUnrecognizedURLNavigator realSelectiveUnrecognizedURLNavigator = (RealSelectiveUnrecognizedURLNavigator) provider2.invoke();
                    Analytics analytics = (Analytics) provider.invoke();
                    realDeepLinking.getClass();
                    intentLauncher.getClass();
                    realRouter$Factory$Impl.getClass();
                    realSelectiveUnrecognizedURLNavigator.getClass();
                    analytics.getClass();
                    return new ComponentRegistry.Builder(realDeepLinking, intentLauncher, realRouter$Factory$Impl, realSelectiveUnrecognizedURLNavigator, analytics);
                case 5:
                    RealCashVibrator realCashVibrator = (RealCashVibrator) provider5.invoke();
                    RealCashScreenBrightness realCashScreenBrightness = (RealCashScreenBrightness) provider4.invoke();
                    RealImageLoader realImageLoader = (RealImageLoader) provider3.invoke();
                    FeatureFlagManager featureFlagManager2 = (FeatureFlagManager) provider2.invoke();
                    GoogleMapEngineProvider googleMapEngineProvider = (GoogleMapEngineProvider) provider.invoke();
                    realCashVibrator.getClass();
                    realCashScreenBrightness.getClass();
                    realImageLoader.getClass();
                    featureFlagManager2.getClass();
                    googleMapEngineProvider.getClass();
                    return new BitcoinUiFactory(realCashVibrator, realCashScreenBrightness, realImageLoader, featureFlagManager2, googleMapEngineProvider, 0);
                case 6:
                    RewardlyExternalAppService rewardlyExternalAppService = (RewardlyExternalAppService) provider5.invoke();
                    Signal signal = (Signal) provider4.invoke();
                    CashAccountDatabaseImpl cashAccountDatabaseImpl2 = (CashAccountDatabaseImpl) provider3.invoke();
                    AndroidClock androidClock2 = (AndroidClock) provider2.invoke();
                    CoroutineContext coroutineContext3 = (CoroutineContext) provider.invoke();
                    rewardlyExternalAppService.getClass();
                    signal.getClass();
                    cashAccountDatabaseImpl2.getClass();
                    androidClock2.getClass();
                    coroutineContext3.getClass();
                    return new RealBoostConfigManager(rewardlyExternalAppService, signal, cashAccountDatabaseImpl2, androidClock2, coroutineContext3);
                case 7:
                    SyncValueReader syncValueReader2 = (SyncValueReader) provider5.invoke();
                    RealCryptoValueRepo realCryptoValueRepo = (RealCryptoValueRepo) provider4.invoke();
                    RealJurisdictionConfigManager realJurisdictionConfigManager = (RealJurisdictionConfigManager) provider3.invoke();
                    RealCryptoBalanceRepo realCryptoBalanceRepo = (RealCryptoBalanceRepo) provider2.invoke();
                    CurrencyConverter$Factory currencyConverter$Factory = (CurrencyConverter$Factory) provider.invoke();
                    syncValueReader2.getClass();
                    realCryptoValueRepo.getClass();
                    realJurisdictionConfigManager.getClass();
                    realCryptoBalanceRepo.getClass();
                    currencyConverter$Factory.getClass();
                    return new RealBitcoinPerformanceDataRepo(syncValueReader2, realCryptoValueRepo, realJurisdictionConfigManager, realCryptoBalanceRepo, currencyConverter$Factory);
                case 8:
                    RealContactRepository realContactRepository = (RealContactRepository) provider5.invoke();
                    RealContactSyncDetailsRepository realContactSyncDetailsRepository = (RealContactSyncDetailsRepository) provider4.invoke();
                    AppService appService = (AppService) provider3.invoke();
                    AndroidClock androidClock3 = (AndroidClock) provider2.invoke();
                    Analytics analytics2 = (Analytics) provider.invoke();
                    realContactRepository.getClass();
                    realContactSyncDetailsRepository.getClass();
                    appService.getClass();
                    androidClock3.getClass();
                    analytics2.getClass();
                    return new ComponentRegistry.Builder(realContactRepository, realContactSyncDetailsRepository, appService, androidClock3, analytics2);
                case 9:
                    PermissionChecker permissionChecker = (PermissionChecker) provider5.invoke();
                    CoroutineContext coroutineContext4 = (CoroutineContext) provider4.invoke();
                    RealProfileManager realProfileManager2 = (RealProfileManager) provider3.invoke();
                    Analytics analytics3 = (Analytics) provider2.invoke();
                    CashAccountDatabaseImpl cashAccountDatabaseImpl3 = (CashAccountDatabaseImpl) provider.invoke();
                    permissionChecker.getClass();
                    coroutineContext4.getClass();
                    realProfileManager2.getClass();
                    analytics3.getClass();
                    cashAccountDatabaseImpl3.getClass();
                    return new RealContactRepository(permissionChecker, coroutineContext4, realProfileManager2, analytics3, cashAccountDatabaseImpl3);
                case 10:
                    CashAccountDatabaseImpl cashAccountDatabaseImpl4 = (CashAccountDatabaseImpl) provider5.invoke();
                    AfterpayStatementsClientService afterpayStatementsClientService = (AfterpayStatementsClientService) provider4.invoke();
                    AndroidStringManager androidStringManager2 = (AndroidStringManager) provider3.invoke();
                    Retrofit retrofit = (Retrofit) provider2.invoke();
                    CoroutineContext coroutineContext5 = (CoroutineContext) provider.invoke();
                    cashAccountDatabaseImpl4.getClass();
                    afterpayStatementsClientService.getClass();
                    androidStringManager2.getClass();
                    retrofit.getClass();
                    coroutineContext5.getClass();
                    return new RealAfterpayStatementManager(cashAccountDatabaseImpl4, afterpayStatementsClientService, androidStringManager2, retrofit, coroutineContext5);
                case 11:
                    RealObservabilityManager realObservabilityManager = (RealObservabilityManager) provider5.invoke();
                    RealImageLoader realImageLoader2 = (RealImageLoader) provider4.invoke();
                    RealCashVibrator realCashVibrator2 = (RealCashVibrator) provider3.invoke();
                    LocalizedMoneyFormatter.Factory factory = (LocalizedMoneyFormatter.Factory) provider2.invoke();
                    FeatureFlagManager featureFlagManager3 = (FeatureFlagManager) provider.invoke();
                    realObservabilityManager.getClass();
                    realImageLoader2.getClass();
                    realCashVibrator2.getClass();
                    factory.getClass();
                    featureFlagManager3.getClass();
                    return new BitcoinUiFactory(realObservabilityManager, realImageLoader2, realCashVibrator2, factory, featureFlagManager3);
                case 12:
                    RealFamilyAccountsManager realFamilyAccountsManager = (RealFamilyAccountsManager) provider5.invoke();
                    CoroutineContext coroutineContext6 = (CoroutineContext) provider4.invoke();
                    SyncValueReader syncValueReader3 = (SyncValueReader) provider3.invoke();
                    RealSettingsEligibilityManager realSettingsEligibilityManager = (RealSettingsEligibilityManager) provider2.invoke();
                    SessionManager sessionManager2 = (SessionManager) provider.invoke();
                    realFamilyAccountsManager.getClass();
                    coroutineContext6.getClass();
                    syncValueReader3.getClass();
                    realSettingsEligibilityManager.getClass();
                    sessionManager2.getClass();
                    return new RealIdentityVerificationRepo(realFamilyAccountsManager, coroutineContext6, syncValueReader3, realSettingsEligibilityManager, sessionManager2);
                case 13:
                    CashAccountDatabaseImpl cashAccountDatabaseImpl5 = (CashAccountDatabaseImpl) provider5.invoke();
                    FeatureFlagManager featureFlagManager4 = (FeatureFlagManager) provider4.invoke();
                    SyncValueReader syncValueReader4 = (SyncValueReader) provider3.invoke();
                    RealProfileManager realProfileManager3 = (RealProfileManager) provider2.invoke();
                    CoroutineContext coroutineContext7 = (CoroutineContext) provider.invoke();
                    cashAccountDatabaseImpl5.getClass();
                    featureFlagManager4.getClass();
                    syncValueReader4.getClass();
                    realProfileManager3.getClass();
                    coroutineContext7.getClass();
                    return new RealBalanceSnapshotManager(cashAccountDatabaseImpl5, featureFlagManager4, syncValueReader4, realProfileManager3, coroutineContext7);
                case 14:
                    RealImageLoader realImageLoader3 = (RealImageLoader) provider5.invoke();
                    RealCashVibrator realCashVibrator3 = (RealCashVibrator) provider4.invoke();
                    RealSessionFlags realSessionFlags = (RealSessionFlags) provider3.invoke();
                    ClientRenderablePluginRegistry clientRenderablePluginRegistry = (ClientRenderablePluginRegistry) provider2.invoke();
                    FeatureFlagManager featureFlagManager5 = (FeatureFlagManager) provider.invoke();
                    realImageLoader3.getClass();
                    realCashVibrator3.getClass();
                    realSessionFlags.getClass();
                    clientRenderablePluginRegistry.getClass();
                    featureFlagManager5.getClass();
                    return new BitcoinUiFactory(realImageLoader3, realCashVibrator3, realSessionFlags, clientRenderablePluginRegistry, featureFlagManager5);
                case 15:
                    CashSuggestClientService cashSuggestClientService = (CashSuggestClientService) provider5.invoke();
                    CashAccountDatabaseImpl cashAccountDatabaseImpl6 = (CashAccountDatabaseImpl) provider4.invoke();
                    AndroidClock androidClock4 = (AndroidClock) provider3.invoke();
                    CoroutineContext coroutineContext8 = (CoroutineContext) provider2.invoke();
                    RealRequestObserver realRequestObserver = (RealRequestObserver) provider.invoke();
                    cashSuggestClientService.getClass();
                    cashAccountDatabaseImpl6.getClass();
                    androidClock4.getClass();
                    coroutineContext8.getClass();
                    realRequestObserver.getClass();
                    return new RealOffersSheetRepository(cashSuggestClientService, cashAccountDatabaseImpl6, androidClock4, coroutineContext8, realRequestObserver);
                case 16:
                    RealCashVibrator realCashVibrator4 = (RealCashVibrator) provider5.invoke();
                    RealImageLoader realImageLoader4 = (RealImageLoader) provider4.invoke();
                    ElementBoundsRegistry elementBoundsRegistry = (ElementBoundsRegistry) provider3.invoke();
                    SplashScreenAnimationObserver splashScreenAnimationObserver = (SplashScreenAnimationObserver) provider2.invoke();
                    FeatureFlagManager featureFlagManager6 = (FeatureFlagManager) provider.invoke();
                    realCashVibrator4.getClass();
                    realImageLoader4.getClass();
                    elementBoundsRegistry.getClass();
                    splashScreenAnimationObserver.getClass();
                    featureFlagManager6.getClass();
                    return new BitcoinUiFactory(realCashVibrator4, realImageLoader4, elementBoundsRegistry, splashScreenAnimationObserver, featureFlagManager6);
                case 17:
                    RealPersonalizationRepository realPersonalizationRepository = (RealPersonalizationRepository) provider5.invoke();
                    ResourceService resourceService = (ResourceService) provider4.invoke();
                    CoroutineContext coroutineContext9 = (CoroutineContext) provider3.invoke();
                    FeatureFlagManager featureFlagManager7 = (FeatureFlagManager) provider2.invoke();
                    KeyValue keyValue = (KeyValue) provider.invoke();
                    realPersonalizationRepository.getClass();
                    resourceService.getClass();
                    coroutineContext9.getClass();
                    featureFlagManager7.getClass();
                    keyValue.getClass();
                    return new ComponentRegistry.Builder(realPersonalizationRepository, resourceService, coroutineContext9, featureFlagManager7, keyValue);
                case 18:
                    CoroutineContext coroutineContext10 = (CoroutineContext) provider5.invoke();
                    FeatureFlagManager featureFlagManager8 = (FeatureFlagManager) provider4.invoke();
                    Signal signal2 = (Signal) provider3.invoke();
                    SyncValueReader syncValueReader5 = (SyncValueReader) provider2.invoke();
                    CashAccountDatabaseImpl cashAccountDatabaseImpl7 = (CashAccountDatabaseImpl) provider.invoke();
                    coroutineContext10.getClass();
                    featureFlagManager8.getClass();
                    signal2.getClass();
                    syncValueReader5.getClass();
                    cashAccountDatabaseImpl7.getClass();
                    return new RealStatusAndLimitsManager(syncValueReader5, cashAccountDatabaseImpl7, featureFlagManager8, signal2, coroutineContext10);
                case 19:
                    CashFaceClientService cashFaceClientService = (CashFaceClientService) provider5.invoke();
                    RealContactRepository realContactRepository2 = (RealContactRepository) provider4.invoke();
                    CashAccountDatabaseImpl cashAccountDatabaseImpl8 = (CashAccountDatabaseImpl) provider3.invoke();
                    CoroutineContext coroutineContext11 = (CoroutineContext) provider2.invoke();
                    Map map = (Map) provider.invoke();
                    cashFaceClientService.getClass();
                    realContactRepository2.getClass();
                    cashAccountDatabaseImpl8.getClass();
                    coroutineContext11.getClass();
                    map.getClass();
                    return new RealProfileRepo(cashFaceClientService, realContactRepository2, cashAccountDatabaseImpl8, coroutineContext11, map);
                case 20:
                    AppService appService2 = (AppService) provider5.invoke();
                    Signal signal3 = (Signal) provider4.invoke();
                    SessionManager sessionManager3 = (SessionManager) provider3.invoke();
                    RealBackupService realBackupService = (RealBackupService) provider2.invoke();
                    RealDeviceIntegrityAttester realDeviceIntegrityAttester = (RealDeviceIntegrityAttester) provider.invoke();
                    appService2.getClass();
                    signal3.getClass();
                    sessionManager3.getClass();
                    realBackupService.getClass();
                    realDeviceIntegrityAttester.getClass();
                    return new RealSessionRefresher(appService2, signal3, sessionManager3, realBackupService, realDeviceIntegrityAttester);
                case 21:
                    CustomerSearchClientService customerSearchClientService = (CustomerSearchClientService) provider5.invoke();
                    CashSuggestClientService cashSuggestClientService2 = (CashSuggestClientService) provider4.invoke();
                    CashAccountDatabaseImpl cashAccountDatabaseImpl9 = (CashAccountDatabaseImpl) provider3.invoke();
                    AndroidClock androidClock5 = (AndroidClock) provider2.invoke();
                    CoroutineContext coroutineContext12 = (CoroutineContext) provider.invoke();
                    customerSearchClientService.getClass();
                    cashSuggestClientService2.getClass();
                    cashAccountDatabaseImpl9.getClass();
                    androidClock5.getClass();
                    coroutineContext12.getClass();
                    return new RealShopHubRepository(customerSearchClientService, cashSuggestClientService2, cashAccountDatabaseImpl9, androidClock5, coroutineContext12);
                case 22:
                    RealFilePicker$Factory$Impl realFilePicker$Factory$Impl = (RealFilePicker$Factory$Impl) provider5.invoke();
                    AndroidStringManager androidStringManager3 = (AndroidStringManager) provider4.invoke();
                    RealImageLoader realImageLoader5 = (RealImageLoader) provider3.invoke();
                    RealImageLoader realImageLoader6 = (RealImageLoader) provider2.invoke();
                    SupportActivityItemLoader supportActivityItemLoader = (SupportActivityItemLoader) provider.invoke();
                    realFilePicker$Factory$Impl.getClass();
                    androidStringManager3.getClass();
                    realImageLoader5.getClass();
                    realImageLoader6.getClass();
                    supportActivityItemLoader.getClass();
                    return new BitcoinUiFactory(realFilePicker$Factory$Impl, androidStringManager3, realImageLoader5, realImageLoader6, supportActivityItemLoader, 4);
                case 23:
                    FeatureFlagManager featureFlagManager9 = (FeatureFlagManager) provider5.invoke();
                    RealThreeDsSpanTrackingService realThreeDsSpanTrackingService = (RealThreeDsSpanTrackingService) provider4.invoke();
                    Analytics analytics4 = (Analytics) provider3.invoke();
                    RealThreeDsService realThreeDsService = (RealThreeDsService) provider2.invoke();
                    RealThreeDsWarningsRepository realThreeDsWarningsRepository = (RealThreeDsWarningsRepository) provider.invoke();
                    featureFlagManager9.getClass();
                    realThreeDsSpanTrackingService.getClass();
                    analytics4.getClass();
                    realThreeDsService.getClass();
                    realThreeDsWarningsRepository.getClass();
                    return new RealSignatureManager(featureFlagManager9, realThreeDsSpanTrackingService, analytics4, realThreeDsService, realThreeDsWarningsRepository);
                case 24:
                    SyncValueReader syncValueReader6 = (SyncValueReader) provider5.invoke();
                    RealInstrumentManager realInstrumentManager = (RealInstrumentManager) provider4.invoke();
                    AndroidStringManager androidStringManager4 = (AndroidStringManager) provider3.invoke();
                    RealIcuStringFormatter realIcuStringFormatter = (RealIcuStringFormatter) provider2.invoke();
                    com.squareup.protos.cash.balancebasedaddcash.api.v1_0.AppService appService3 = (com.squareup.protos.cash.balancebasedaddcash.api.v1_0.AppService) provider.invoke();
                    syncValueReader6.getClass();
                    realInstrumentManager.getClass();
                    androidStringManager4.getClass();
                    realIcuStringFormatter.getClass();
                    appService3.getClass();
                    return new RealBalanceBasedAddCashManager(syncValueReader6, realInstrumentManager, androidStringManager4, realIcuStringFormatter, appService3);
                default:
                    RealCurrentUserProvider realCurrentUserProvider = (RealCurrentUserProvider) provider5.invoke();
                    RealMerchantRepository realMerchantRepository = (RealMerchantRepository) provider4.invoke();
                    RealSettingRepository realSettingRepository = (RealSettingRepository) provider3.invoke();
                    RealMembershipRepository realMembershipRepository = (RealMembershipRepository) provider2.invoke();
                    RealSelectedMerchantProvider realSelectedMerchantProvider = (RealSelectedMerchantProvider) provider.invoke();
                    realCurrentUserProvider.getClass();
                    realMerchantRepository.getClass();
                    realSettingRepository.getClass();
                    realMembershipRepository.getClass();
                    realSelectedMerchantProvider.getClass();
                    return new RealGetClockInControlsUseCase(realCurrentUserProvider, realMerchantRepository, realSettingRepository, realMembershipRepository, realSelectedMerchantProvider);
            }
        }
    }

    public final class SessionFlagKeyValue implements KeyValue {
        public final /* synthetic */ SharedPreferencesKeyValue $$delegate_0;
        public final AbstractApplier flag;
        public final /* synthetic */ RealSessionFlags this$0;

        public SessionFlagKeyValue(RealSessionFlags realSessionFlags, SharedPreferences sharedPreferences, AbstractApplier abstractApplier) {
            abstractApplier.getClass();
            this.this$0 = realSessionFlags;
            this.$$delegate_0 = Room.StringKeyValue(sharedPreferences, "session-flag:".concat((String) abstractApplier.root), ((RealFeatureFlagManager) realSessionFlags.featureFlagManager).currentExperimentValue(abstractApplier, false).getIdentifier(), false);
            this.flag = abstractApplier;
        }

        @Override // com.squareup.preferences.KeyValue
        public final Object blockingGet() {
            SharedPreferencesKeyValue sharedPreferencesKeyValue = this.$$delegate_0;
            return (String) sharedPreferencesKeyValue.reader.read(sharedPreferencesKeyValue);
        }

        public final FeatureFlag$Option blockingGetFlagOption() {
            SharedPreferencesKeyValue sharedPreferencesKeyValue = this.$$delegate_0;
            String str = (String) sharedPreferencesKeyValue.reader.read(sharedPreferencesKeyValue);
            AbstractApplier abstractApplier = this.flag;
            FeatureFlag$Option option = abstractApplier.getOption(null, str);
            if (option == null) {
                option = (FeatureFlag$Option) abstractApplier.current;
            }
            this.this$0.experimentExposureTracker.trackExposure(new ExperimentExposure((String) abstractApplier.root, option.getIdentifier(), null));
            return option;
        }

        @Override // com.squareup.preferences.KeyValue
        public final void blockingSet(Object obj) {
            String str = (String) obj;
            str.getClass();
            this.$$delegate_0.blockingSet(str);
        }

        @Override // com.squareup.preferences.KeyValue
        public final Object delete(Continuation continuation) {
            return this.$$delegate_0.delete(continuation);
        }

        @Override // com.squareup.preferences.KeyValue
        public final Object get(Continuation continuation) {
            return this.$$delegate_0.get(continuation);
        }

        @Override // com.squareup.preferences.KeyValue
        public final Flow observe() {
            return this.$$delegate_0.observe();
        }

        @Override // com.squareup.preferences.KeyValue
        public final Object set(Object obj, Continuation continuation) {
            return this.$$delegate_0.set((String) obj, continuation);
        }
    }

    public RealSessionFlags(FeatureFlagManager featureFlagManager, SessionManager sessionManager, ExperimentExposureTracker experimentExposureTracker, SharedPreferences sharedPreferences, Flow flow) {
        this.featureFlagManager = featureFlagManager;
        this.sessionManager = sessionManager;
        this.experimentExposureTracker = experimentExposureTracker;
        this.signOut = flow;
        this.onboarded = PlatformKt.hasOnboardedAccount(sessionManager);
        SessionFlagKeyValue sessionFlagKeyValue = new SessionFlagKeyValue(this, sharedPreferences, AmplitudeExperiments$MoneybotHome.INSTANCE);
        this.moneybotHomeKeyValue = sessionFlagKeyValue;
        SessionFlagKeyValue sessionFlagKeyValue2 = new SessionFlagKeyValue(this, sharedPreferences, AmplitudeExperiments$MoneybotRespectSystemAppearance.INSTANCE);
        this.moneybotRespectSystemAppearanceKeyValue = sessionFlagKeyValue2;
        SessionFlagKeyValue sessionFlagKeyValue3 = new SessionFlagKeyValue(this, sharedPreferences, AmplitudeExperiments$ClientNavigationLiquidGlass.INSTANCE);
        this.liquidGlassKeyValue = sessionFlagKeyValue3;
        RealFeatureFlagManager realFeatureFlagManager = (RealFeatureFlagManager) featureFlagManager;
        FlowKt.MutableStateFlow(Boolean.valueOf(((FeatureFlag$EnabledDisabledFeatureFlag$Options) realFeatureFlagManager.peekCurrentValue(LaunchDarklyFeatureFlags$CashAppLiteClientGate.INSTANCE)).enabled()));
        this.launchMoneyTabAsHome = FlowKt.MutableStateFlow(Boolean.valueOf(((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) realFeatureFlagManager.currentValue(AmplitudeExperiments$LaunchMoneyTabAsHome.INSTANCE)).enabled()));
        this.showModernTabs = FlowKt.MutableStateFlow(Boolean.valueOf(this.onboarded && ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) sessionFlagKeyValue3.blockingGetFlagOption()).enabled()));
        this.moneybotHome = FlowKt.MutableStateFlow(Boolean.valueOf(((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) sessionFlagKeyValue.blockingGetFlagOption()).enabled()));
        this.moneybotRespectSystemAppearance = FlowKt.MutableStateFlow(Boolean.valueOf(((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) sessionFlagKeyValue2.blockingGetFlagOption()).enabled()));
    }

    public static final FlowKt__MergeKt$flatMapConcat$$inlined$map$1 access$syncFor(RealSessionFlags realSessionFlags, FeatureFlagManager featureFlagManager, SessionFlagKeyValue sessionFlagKeyValue) {
        return new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(((RealFeatureFlagManager) featureFlagManager).peekValues(sessionFlagKeyValue.flag), new RealBoostSelector.AnonymousClass1(sessionFlagKeyValue, (Continuation) null, 15), 3);
    }

    @Override // com.squareup.util.coroutines.SetupTeardown
    public final Teardown setup(CoroutineScope coroutineScope, Object obj) {
        coroutineScope.getClass();
        ((Lifecycle) obj).getClass();
        JobKt.launch$default(coroutineScope, null, CoroutineStart.DEFAULT, new RealSessionFlags$setup$1$1((Continuation) null, this), 1);
        return StateFlowKt.noOpTeardown;
    }
}
