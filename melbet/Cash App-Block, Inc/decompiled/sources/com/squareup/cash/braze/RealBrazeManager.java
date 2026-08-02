package com.squareup.cash.braze;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import androidx.core.util.Supplier;
import androidx.lifecycle.LifecycleOwner;
import app.cash.badging.backend.RealBadger2;
import app.cash.local.views.LocalViewFactory;
import coil3.RealImageLoader;
import com.fillr.e0;
import com.google.android.gms.internal.mlkit_genai_prompt.zzjo;
import com.google.android.gms.maps.zzai;
import com.google.crypto.tink.KeysetHandle;
import com.google.mlkit.vision.common.zzb;
import com.nimbusds.jose.JWECryptoParts;
import com.squareup.cash.advertising.service.PeddleAppService;
import com.squareup.cash.aiedge.MLKitTitleGenerator$MetroFactory;
import com.squareup.cash.arcade.ArcadeModule$ProvideHapticVibratorMetroFactory;
import com.squareup.cash.attribution.InstallAttributer;
import com.squareup.cash.attribution.wrappers.AppsFlyerClient;
import com.squareup.cash.boost.db.Reward$Adapter;
import com.squareup.cash.borrow.views.BorrowUiFactory;
import com.squareup.cash.braze.BrazeInitializer;
import com.squareup.cash.braze.RealBrazeConfigurator;
import com.squareup.cash.card.onboarding.InteractiveCardView$flingTo$1;
import com.squareup.cash.clientrouting.validation.AccountRequirementValidator;
import com.squareup.cash.clientrouting.validation.BtcxValidator;
import com.squareup.cash.clientrouting.validation.LoginStateValidator;
import com.squareup.cash.clientrouting.validation.ManagedAccountClientRouteValidator;
import com.squareup.cash.clientsync.errors.RealClientSyncErrorReporter;
import com.squareup.cash.clientsync.persistence.ClientSyncTransactor;
import com.squareup.cash.clientsync.persistence.SyncEntityStore;
import com.squareup.cash.clientsync.persistence.SyncRangeStore;
import com.squareup.cash.clientsync.pipeline.RealClientSyncStorageOperationBatchExecutor;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.crypto.backend.performance.RealBitcoinPerformanceDataRepo;
import com.squareup.cash.data.TemporaryStorage;
import com.squareup.cash.data.accessibility.AndroidAccessibilityManager;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.BlockersDescriptorNavigator;
import com.squareup.cash.data.blockers.ClientBlockersNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.contacts.RealContactRepository;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.data.profile.RealJurisdictionConfigManager;
import com.squareup.cash.data.profile.RealProfileAliasRepository;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.data.profile.documents.RealDocumentEntitiesMapper;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.devicegrip.service.DeviceGripAppApi;
import com.squareup.cash.eligibility.backend.real.RealFeatureEligibilityRepository;
import com.squareup.cash.family.applets.data.RealAllowanceAppletTileRepository;
import com.squareup.cash.family.applets.presenters.DependentActivityAppletTilePresenter$Factory$Impl;
import com.squareup.cash.family.familyhub.backend.real.RealDependentAllowanceManager;
import com.squareup.cash.family.familyhub.backend.real.RealFamilyAccountsManager;
import com.squareup.cash.family.navigation.RealFamilyNavigator$Factory$Impl;
import com.squareup.cash.family.profileselection.real.RealFamilyProfileManager;
import com.squareup.cash.featureflags.AmplitudeExperiments$MobileCashCreditScoreApplet;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.featureflags.RealSessionFlags;
import com.squareup.cash.filament.RealFilamentSupportProvider;
import com.squareup.cash.fileupload.real.AndroidFileTypeDescriber;
import com.squareup.cash.fillr.real.FillrInitializer;
import com.squareup.cash.gcl.RealGlobalConfigManager;
import com.squareup.cash.initialscreenloader.backend.RealOpenTheAppUserJourney;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.investing.backend.real.RealHistoricalPriceTickRefresher;
import com.squareup.cash.keystore.AttestedKeyMetrics$MetroFactory;
import com.squareup.cash.keystore.AttestedKeyService;
import com.squareup.cash.keystore.RealMessageSigner;
import com.squareup.cash.localization.RealLocaleAssetProvider$MetroFactory;
import com.squareup.cash.localization.RealLocaleManager;
import com.squareup.cash.money.applets.viewmodels.Applet;
import com.squareup.cash.money.core.ids.AppletId;
import com.squareup.cash.money.core.states.AppletAvailabilityState;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.music.views.MusicViewFactory$MetroFactory;
import com.squareup.cash.nfc.backend.real.RealNfcPaymentsManager;
import com.squareup.cash.notifications.channels.MiscNotificationChannelContributor;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.cash.onboarding.accountpicker.backend.RealSelectedAliasRegistrar;
import com.squareup.cash.onboarding.util.RealAliasRegistrar;
import com.squareup.cash.portfolio.graphs.RealInvestingGraphCalculator;
import com.squareup.cash.portfolio.graphs.RealInvestingGraphSmoother;
import com.squareup.cash.profile.devicemanager.backend.RealDeviceManagerAnalytics;
import com.squareup.cash.profile.devicemanager.backend.RealDeviceManagerRepo;
import com.squareup.cash.recipients.backend.real.RealRecipientFinder;
import com.squareup.cash.recipients.data.RealCustomerStore;
import com.squareup.cash.resource.AndroidDateFormatManager;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.retro.views.RetroUiFactory;
import com.squareup.cash.score.applets.presenters.ScoreAppletTilePresenter$Factory$Impl;
import com.squareup.cash.score.backend.RealScoreRepository;
import com.squareup.cash.score.views.CalloutKt$$ExternalSyntheticLambda0;
import com.squareup.cash.score.views.ScoreUiFactory;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.storage.RealSandboxer;
import com.squareup.cash.support.chat.presenters.ChatStateMapper;
import com.squareup.cash.support.chat.presenters.RealEmojiDetector;
import com.squareup.cash.taptopay.backend.real.RealEmbeddedCardReaderDelegator$Factory$Impl;
import com.squareup.cash.taptopay.backend.real.RealEmbeddedCardReaderEventDelegator$Factory$Impl;
import com.squareup.cash.tax.applet.views.TaxesAppletViewsModule$TaxesAppletMetroFactory;
import com.squareup.cash.threedsdataonly.backend.real.RealThreeDsService;
import com.squareup.cash.timestampformatter.impl.RealTimestampFormatter$Factory$Impl;
import com.squareup.cash.treehouse.android.RealTreehouseEventListener;
import com.squareup.cash.ui.BreadcrumbListener;
import com.squareup.cash.ui.BroadwayModule$ProvideBroadwayMetroFactory;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.upsell.presenters.NullStateSwipeConfigProvider;
import com.squareup.cash.userjourneys.tracker.RealUserJourneyTracker;
import com.squareup.cash.userjourneys.tracker.UserJourneyTracker;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.work.analytics.ShiftsAnalytics;
import com.squareup.cash.work.applets.views.WorkApplet;
import com.squareup.preferences.BooleanPreference;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.cashcustomergateway.api.v1.LookupCashtagService;
import com.squareup.protos.cash.nearby.api.v1.NearbySessionService;
import com.squareup.protos.cash.paymenttemplate.v1.PaymentTemplateService;
import com.squareup.protos.cash.portfolios.PortfoliosService;
import com.squareup.protos.cash.spendinginsights.appapi.SpendingInsightsAppService;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.scannerview.TextSetter;
import com.squareup.util.ForcedLazyKt$forcedLazy$1;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DelegateFactory;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import dev.zacsweers.metro.internal.InstanceFactory;
import dev.zacsweers.metro.internal.SetFactory;
import io.noties.markwon.MarkwonConfiguration;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.StartedWhileSubscribed;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.Symbol;
import okhttp3.ConnectionPool;
import okhttp3.internal.publicsuffix.AssetPublicSuffixList;
import okio.Path;

/* loaded from: classes.dex */
public final class RealBrazeManager implements BrazeManager {
    public final Activity activity;
    public final Lazy braze$delegate = LazyKt.lazy(new RealBrazeManager$$ExternalSyntheticLambda0(this, 0));
    public final BrazeConfigurator brazeConfigurator;
    public final Application context;
    public final CoroutineContext ioContext;
    public final CoroutineScope scope;
    public final SessionManager sessionManager;
    public StandaloneCoroutine userSessionTrackingJob;

    public RealBrazeManager(Activity activity, SessionManager sessionManager, BrazeConfigurator brazeConfigurator, CoroutineContext coroutineContext, CoroutineScope coroutineScope) {
        this.activity = activity;
        this.sessionManager = sessionManager;
        this.brazeConfigurator = brazeConfigurator;
        this.ioContext = coroutineContext;
        this.scope = coroutineScope;
        this.context = activity.getApplication();
    }

    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId;
        public final Provider activity;
        public final Provider brazeConfigurator;
        public final Provider ioContext;
        public final Provider scope;
        public final Provider sessionManager;

        public MetroFactory(FillrInitializer.MetroFactory metroFactory, InstanceFactory instanceFactory, InstanceFactory instanceFactory2, DoubleCheck doubleCheck, LambdaProvider lambdaProvider) {
            this.$r8$classId = 10;
            this.ioContext = metroFactory;
            this.activity = instanceFactory;
            this.scope = instanceFactory2;
            this.sessionManager = doubleCheck;
            this.brazeConfigurator = lambdaProvider;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v24, types: [kotlin.Lazy] */
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = this.$r8$classId;
            Provider provider = this.ioContext;
            Provider provider2 = this.sessionManager;
            Provider provider3 = this.activity;
            Provider provider4 = this.scope;
            Provider provider5 = this.brazeConfigurator;
            switch (i) {
                case 0:
                    Activity activity = (Activity) ((InstanceFactory) provider3).value;
                    SessionManager sessionManager = (SessionManager) provider2.invoke();
                    BrazeConfigurator brazeConfigurator = (BrazeConfigurator) provider5.invoke();
                    CoroutineContext coroutineContext = (CoroutineContext) provider.invoke();
                    CoroutineScope coroutineScope = (CoroutineScope) ((InstanceFactory) provider4).value;
                    activity.getClass();
                    sessionManager.getClass();
                    brazeConfigurator.getClass();
                    coroutineContext.getClass();
                    coroutineScope.getClass();
                    return new RealBrazeManager(activity, sessionManager, brazeConfigurator, coroutineContext, coroutineScope);
                case 1:
                    return CollectionsKt__CollectionsKt.listOf((Object[]) new MiscNotificationChannelContributor[]{(MiscNotificationChannelContributor) ((RealLocaleAssetProvider$MetroFactory) provider3).invoke(), (MiscNotificationChannelContributor) ((RealLocaleAssetProvider$MetroFactory) provider4).invoke(), (MiscNotificationChannelContributor) ((RealLocaleAssetProvider$MetroFactory) provider2).invoke(), (MiscNotificationChannelContributor) ((RealLocaleAssetProvider$MetroFactory) provider5).invoke(), (MiscNotificationChannelContributor) ((RealLocaleAssetProvider$MetroFactory) provider).invoke()});
                case 2:
                    AndroidDateFormatManager androidDateFormatManager = (AndroidDateFormatManager) ((LambdaProvider) provider3).lambda.invoke();
                    AndroidStringManager androidStringManager = (AndroidStringManager) ((LambdaProvider) provider4).lambda.invoke();
                    LocalizedMoneyFormatter.Factory factory = (LocalizedMoneyFormatter.Factory) provider2.invoke();
                    AndroidClock androidClock = (AndroidClock) ((LambdaProvider) provider).lambda.invoke();
                    RealJurisdictionConfigManager realJurisdictionConfigManager = (RealJurisdictionConfigManager) provider5.invoke();
                    androidDateFormatManager.getClass();
                    androidStringManager.getClass();
                    factory.getClass();
                    androidClock.getClass();
                    realJurisdictionConfigManager.getClass();
                    return new JWECryptoParts(androidDateFormatManager, androidStringManager, factory, androidClock, realJurisdictionConfigManager);
                case 3:
                    PeddleAppService peddleAppService = (PeddleAppService) ((DoubleCheck) provider3).getValue();
                    SessionManager sessionManager2 = (SessionManager) provider2.invoke();
                    AppsFlyerClient appsFlyerClient = (AppsFlyerClient) provider5.invoke();
                    Supplier supplier = (Supplier) ((ArcadeModule$ProvideHapticVibratorMetroFactory) provider4).invoke();
                    CoroutineContext coroutineContext2 = (CoroutineContext) provider.invoke();
                    peddleAppService.getClass();
                    sessionManager2.getClass();
                    appsFlyerClient.getClass();
                    coroutineContext2.getClass();
                    return new InstallAttributer(peddleAppService, sessionManager2, appsFlyerClient, supplier, coroutineContext2);
                case 4:
                    RealBitcoinPerformanceDataRepo realBitcoinPerformanceDataRepo = (RealBitcoinPerformanceDataRepo) provider2.invoke();
                    AndroidStringManager androidStringManager2 = (AndroidStringManager) provider5.invoke();
                    KeyValue keyValue = (KeyValue) ((ArcadeModule$ProvideHapticVibratorMetroFactory) provider3).invoke();
                    Analytics analytics = (Analytics) provider.invoke();
                    LocalizedMoneyFormatter.Factory factory2 = (LocalizedMoneyFormatter.Factory) provider4.invoke();
                    realBitcoinPerformanceDataRepo.getClass();
                    androidStringManager2.getClass();
                    analytics.getClass();
                    factory2.getClass();
                    return new e0(realBitcoinPerformanceDataRepo, androidStringManager2, keyValue, analytics, factory2);
                case 5:
                    Analytics analytics2 = (Analytics) provider2.invoke();
                    AccountRequirementValidator accountRequirementValidator = new AccountRequirementValidator();
                    BtcxValidator btcxValidator = (BtcxValidator) ((TemporaryStorage.MetroFactory) provider3).invoke();
                    LoginStateValidator loginStateValidator = (LoginStateValidator) ((RealBrazeConfigurator.MetroFactory) provider4).invoke();
                    LoginStateValidator loginStateValidator2 = (LoginStateValidator) ((RealBrazeConfigurator.MetroFactory) provider5).invoke();
                    ManagedAccountClientRouteValidator managedAccountClientRouteValidator = (ManagedAccountClientRouteValidator) ((TemporaryStorage.MetroFactory) provider).invoke();
                    analytics2.getClass();
                    return new KeysetHandle(analytics2, accountRequirementValidator, btcxValidator, loginStateValidator, loginStateValidator2, managedAccountClientRouteValidator);
                case 6:
                    SyncRangeStore syncRangeStore = (SyncRangeStore) provider2.invoke();
                    SyncEntityStore syncEntityStore = (SyncEntityStore) provider5.invoke();
                    ClientSyncTransactor clientSyncTransactor = (ClientSyncTransactor) provider.invoke();
                    Set set = (Set) ((SetFactory) provider3).invoke();
                    RealClientSyncErrorReporter realClientSyncErrorReporter = (RealClientSyncErrorReporter) provider4.invoke();
                    syncRangeStore.getClass();
                    syncEntityStore.getClass();
                    clientSyncTransactor.getClass();
                    set.getClass();
                    realClientSyncErrorReporter.getClass();
                    return new RealClientSyncStorageOperationBatchExecutor(syncRangeStore, syncEntityStore, clientSyncTransactor, CollectionsKt.toList(set), realClientSyncErrorReporter);
                case 7:
                    BlockersDescriptorNavigator blockersDescriptorNavigator = (BlockersDescriptorNavigator) ((RealBadger2.MetroFactory) provider3).invoke();
                    Analytics analytics3 = (Analytics) provider2.invoke();
                    UserJourneyTracker userJourneyTracker = (UserJourneyTracker) provider5.invoke();
                    RealUserJourneyTracker realUserJourneyTracker = (RealUserJourneyTracker) provider.invoke();
                    FeatureFlagManager featureFlagManager = (FeatureFlagManager) provider4.invoke();
                    analytics3.getClass();
                    userJourneyTracker.getClass();
                    realUserJourneyTracker.getClass();
                    featureFlagManager.getClass();
                    return new ClientBlockersNavigator(blockersDescriptorNavigator, analytics3, userJourneyTracker, realUserJourneyTracker, featureFlagManager);
                case 8:
                    CashAccountDatabaseImpl cashAccountDatabaseImpl = (CashAccountDatabaseImpl) provider2.invoke();
                    RealProfileAliasRepository realProfileAliasRepository = (RealProfileAliasRepository) ((LocalViewFactory.MetroFactory) provider3).invoke();
                    RealCustomerStore realCustomerStore = (RealCustomerStore) provider5.invoke();
                    RealProfileManager realProfileManager = (RealProfileManager) provider.invoke();
                    CoroutineContext coroutineContext3 = (CoroutineContext) provider4.invoke();
                    cashAccountDatabaseImpl.getClass();
                    realCustomerStore.getClass();
                    realProfileManager.getClass();
                    coroutineContext3.getClass();
                    return new RealDocumentEntitiesMapper(cashAccountDatabaseImpl, realProfileAliasRepository, realCustomerStore, realProfileManager, coroutineContext3);
                case 9:
                    RealFamilyProfileManager realFamilyProfileManager = (RealFamilyProfileManager) provider2.invoke();
                    RealFamilyAccountsManager realFamilyAccountsManager = (RealFamilyAccountsManager) provider5.invoke();
                    RealDependentAllowanceManager realDependentAllowanceManager = (RealDependentAllowanceManager) ((MLKitTitleGenerator$MetroFactory) provider4).invoke();
                    SessionManager sessionManager3 = (SessionManager) provider.invoke();
                    CoroutineScope coroutineScope2 = (CoroutineScope) ((InstanceFactory) provider3).value;
                    realFamilyProfileManager.getClass();
                    realFamilyAccountsManager.getClass();
                    sessionManager3.getClass();
                    coroutineScope2.getClass();
                    return new RealAllowanceAppletTileRepository(realFamilyProfileManager, realFamilyAccountsManager, realDependentAllowanceManager, sessionManager3, coroutineScope2);
                case 10:
                    zzb zzbVar = (zzb) ((FillrInitializer.MetroFactory) provider).invoke();
                    DependentActivityAppletTilePresenter$Factory$Impl dependentActivityAppletTilePresenter$Factory$Impl = (DependentActivityAppletTilePresenter$Factory$Impl) ((InstanceFactory) provider3).value;
                    LifecycleOwner lifecycleOwner = (LifecycleOwner) ((InstanceFactory) provider4).value;
                    RealImageLoader realImageLoader = (RealImageLoader) provider2.invoke();
                    RealCashVibrator realCashVibrator = (RealCashVibrator) provider5.invoke();
                    dependentActivityAppletTilePresenter$Factory$Impl.getClass();
                    lifecycleOwner.getClass();
                    realImageLoader.getClass();
                    realCashVibrator.getClass();
                    return zzjo.dependentActivityApplet(zzbVar, dependentActivityAppletTilePresenter$Factory$Impl, lifecycleOwner, realImageLoader, realCashVibrator);
                case 11:
                    RealProfileManager realProfileManager2 = (RealProfileManager) provider2.invoke();
                    KeyValue keyValue2 = (KeyValue) ((BorrowUiFactory.MetroFactory) provider4).invoke();
                    RealCustomerStore realCustomerStore2 = (RealCustomerStore) provider5.invoke();
                    AndroidStringManager androidStringManager3 = (AndroidStringManager) provider.invoke();
                    CoroutineScope coroutineScope3 = (CoroutineScope) ((InstanceFactory) provider3).value;
                    realProfileManager2.getClass();
                    realCustomerStore2.getClass();
                    androidStringManager3.getClass();
                    coroutineScope3.getClass();
                    return new RealFamilyProfileManager(realProfileManager2, keyValue2, realCustomerStore2, androidStringManager3, coroutineScope3);
                case 12:
                    ConnectionPool connectionPool = (ConnectionPool) ((BrazeInitializer.MetroFactory) provider3).invoke();
                    AndroidClock androidClock2 = (AndroidClock) provider5.invoke();
                    CoroutineScope coroutineScope4 = (CoroutineScope) provider4.invoke();
                    Provider provider6 = this.sessionManager;
                    provider6.getClass();
                    androidClock2.getClass();
                    Provider provider7 = this.ioContext;
                    provider7.getClass();
                    coroutineScope4.getClass();
                    return new RealOpenTheAppUserJourney(provider6, connectionPool, androidClock2, provider7, coroutineScope4);
                case 13:
                    PortfoliosService portfoliosService = (PortfoliosService) ((DoubleCheck) provider4).getValue();
                    AndroidClock androidClock3 = (AndroidClock) provider2.invoke();
                    Reward$Adapter reward$Adapter = (Reward$Adapter) ((RealFilamentSupportProvider.MetroFactory) provider).invoke();
                    CoroutineContext coroutineContext4 = (CoroutineContext) provider5.invoke();
                    CoroutineScope coroutineScope5 = (CoroutineScope) ((InstanceFactory) provider3).value;
                    portfoliosService.getClass();
                    androidClock3.getClass();
                    coroutineContext4.getClass();
                    coroutineScope5.getClass();
                    return new RealHistoricalPriceTickRefresher(portfoliosService, androidClock3, reward$Adapter, coroutineContext4, coroutineScope5);
                case 14:
                    CashAccountDatabaseImpl cashAccountDatabaseImpl2 = (CashAccountDatabaseImpl) ((DoubleCheck) provider3).getValue();
                    SyncValueReader syncValueReader = (SyncValueReader) ((DoubleCheck) provider4).getValue();
                    AndroidStringManager androidStringManager4 = (AndroidStringManager) ((LambdaProvider) provider2).lambda.invoke();
                    Analytics analytics4 = (Analytics) ((DoubleCheck) provider5).getValue();
                    CoroutineContext coroutineContext5 = (CoroutineContext) ((LambdaProvider) provider).lambda.invoke();
                    cashAccountDatabaseImpl2.getClass();
                    syncValueReader.getClass();
                    androidStringManager4.getClass();
                    analytics4.getClass();
                    coroutineContext5.getClass();
                    return new MarkwonConfiguration(cashAccountDatabaseImpl2, syncValueReader, androidStringManager4, analytics4, coroutineContext5);
                case 15:
                    RealFamilyProfileManager realFamilyProfileManager2 = (RealFamilyProfileManager) provider2.invoke();
                    RealFamilyNavigator$Factory$Impl realFamilyNavigator$Factory$Impl = (RealFamilyNavigator$Factory$Impl) provider5.invoke();
                    AndroidStringManager androidStringManager5 = (AndroidStringManager) ((LambdaProvider) provider4).lambda.invoke();
                    Set set2 = (Set) ((RealGlobalConfigManager.MetroFactory) provider).invoke();
                    CoroutineScope coroutineScope6 = (CoroutineScope) ((InstanceFactory) provider3).value;
                    realFamilyProfileManager2.getClass();
                    realFamilyNavigator$Factory$Impl.getClass();
                    androidStringManager5.getClass();
                    set2.getClass();
                    coroutineScope6.getClass();
                    return new e0(realFamilyProfileManager2, realFamilyNavigator$Factory$Impl, androidStringManager5, set2, coroutineScope6);
                case 16:
                    StateFlow stateFlow = (StateFlow) provider2.invoke();
                    CoroutineContext coroutineContext6 = (CoroutineContext) ((LambdaProvider) provider4).lambda.invoke();
                    RealMessageSigner realMessageSigner = (RealMessageSigner) provider5.invoke();
                    AttestedKeyService.Factory factory3 = (AttestedKeyService.Factory) ((DoubleCheck) provider).getValue();
                    stateFlow.getClass();
                    coroutineContext6.getClass();
                    realMessageSigner.getClass();
                    factory3.getClass();
                    return new AssetPublicSuffixList((DoubleCheck) provider3, stateFlow, coroutineContext6, realMessageSigner, factory3);
                case 17:
                    PaymentTemplateService paymentTemplateService = (PaymentTemplateService) ((DoubleCheck) provider3).getValue();
                    NearbySessionService nearbySessionService = (NearbySessionService) ((DoubleCheck) provider4).getValue();
                    AssetPublicSuffixList assetPublicSuffixList = (AssetPublicSuffixList) ((MetroFactory) provider5).invoke();
                    RealMessageSigner realMessageSigner2 = (RealMessageSigner) provider2.invoke();
                    AttestedKeyService.Factory factory4 = (AttestedKeyService.Factory) ((DoubleCheck) provider).getValue();
                    paymentTemplateService.getClass();
                    nearbySessionService.getClass();
                    realMessageSigner2.getClass();
                    factory4.getClass();
                    return new MarkwonConfiguration(paymentTemplateService, nearbySessionService, assetPublicSuffixList, realMessageSigner2, factory4);
                case 18:
                    BlockersDataNavigator blockersDataNavigator = (BlockersDataNavigator) provider2.invoke();
                    RealAliasRegistrar realAliasRegistrar = (RealAliasRegistrar) ((BroadwayModule$ProvideBroadwayMetroFactory) provider3).invoke();
                    AndroidStringManager androidStringManager6 = (AndroidStringManager) provider5.invoke();
                    FlowStarter flowStarter = (FlowStarter) provider.invoke();
                    Analytics analytics5 = (Analytics) provider4.invoke();
                    blockersDataNavigator.getClass();
                    androidStringManager6.getClass();
                    flowStarter.getClass();
                    analytics5.getClass();
                    return new RealSelectedAliasRegistrar(blockersDataNavigator, realAliasRegistrar, androidStringManager6, flowStarter, analytics5);
                case 19:
                    AndroidStringManager androidStringManager7 = (AndroidStringManager) provider2.invoke();
                    AndroidClock androidClock4 = (AndroidClock) provider5.invoke();
                    AndroidDateFormatManager androidDateFormatManager2 = (AndroidDateFormatManager) provider.invoke();
                    RealInvestingGraphSmoother realInvestingGraphSmoother = (RealInvestingGraphSmoother) provider3.invoke();
                    BooleanPreference booleanPreference = (BooleanPreference) ((ScoreUiFactory.MetroFactory) provider4).invoke();
                    androidStringManager7.getClass();
                    androidClock4.getClass();
                    androidDateFormatManager2.getClass();
                    realInvestingGraphSmoother.getClass();
                    return new RealInvestingGraphCalculator(androidStringManager7, androidClock4, androidDateFormatManager2, realInvestingGraphSmoother, booleanPreference);
                case 20:
                    KeyValue keyValue3 = (KeyValue) ((DoubleCheck) provider3).getValue();
                    DeviceGripAppApi deviceGripAppApi = (DeviceGripAppApi) provider2.invoke();
                    Symbol symbol = (Symbol) ((ScoreUiFactory.MetroFactory) provider4).invoke();
                    RealDeviceManagerAnalytics realDeviceManagerAnalytics = (RealDeviceManagerAnalytics) ((ScoreUiFactory.MetroFactory) provider).invoke();
                    AndroidClock androidClock5 = (AndroidClock) provider5.invoke();
                    keyValue3.getClass();
                    deviceGripAppApi.getClass();
                    androidClock5.getClass();
                    return new RealDeviceManagerRepo(keyValue3, deviceGripAppApi, symbol, realDeviceManagerAnalytics, androidClock5);
                case 21:
                    RealContactRepository realContactRepository = (RealContactRepository) ((RealSessionFlags.MetroFactory) provider3).invoke();
                    AppService appService = (AppService) provider2.invoke();
                    AppConfigManager appConfigManager = (AppConfigManager) provider5.invoke();
                    FeatureFlagManager featureFlagManager2 = (FeatureFlagManager) provider.invoke();
                    LookupCashtagService lookupCashtagService = (LookupCashtagService) provider4.invoke();
                    appService.getClass();
                    appConfigManager.getClass();
                    featureFlagManager2.getClass();
                    lookupCashtagService.getClass();
                    return new RealRecipientFinder(realContactRepository, appService, appConfigManager, featureFlagManager2, lookupCashtagService);
                case 22:
                    RealScoreRepository realScoreRepository = (RealScoreRepository) provider2.invoke();
                    ScoreAppletTilePresenter$Factory$Impl scoreAppletTilePresenter$Factory$Impl = (ScoreAppletTilePresenter$Factory$Impl) ((InstanceFactory) provider3).value;
                    LifecycleOwner lifecycleOwner2 = (LifecycleOwner) ((InstanceFactory) provider4).value;
                    FeatureFlagManager featureFlagManager3 = (FeatureFlagManager) provider5.invoke();
                    CoroutineScope coroutineScope7 = (CoroutineScope) ((InstanceFactory) provider).value;
                    realScoreRepository.getClass();
                    scoreAppletTilePresenter$Factory$Impl.getClass();
                    lifecycleOwner2.getClass();
                    featureFlagManager3.getClass();
                    coroutineScope7.getClass();
                    return new Applet(AppletId.SCORE, FlowKt.stateIn(new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(FlowKt.distinctUntilChanged(new NullStateSwipeConfigProvider(((RealFeatureFlagManager) featureFlagManager3).values(AmplitudeExperiments$MobileCashCreditScoreApplet.INSTANCE), 22)), FlowKt.distinctUntilChanged(realScoreRepository.cashCreditScoreEntryPointData()), new InteractiveCardView$flingTo$1.AnonymousClass1(5), 0), coroutineScope7, new StartedWhileSubscribed(0L, Long.MAX_VALUE), AppletAvailabilityState.LOADING), new CalloutKt$$ExternalSyntheticLambda0(19, scoreAppletTilePresenter$Factory$Impl, lifecycleOwner2));
                case 23:
                    AndroidStringManager androidStringManager8 = (AndroidStringManager) ((LambdaProvider) provider3).lambda.invoke();
                    RealEmojiDetector realEmojiDetector = new RealEmojiDetector();
                    AndroidFileTypeDescriber androidFileTypeDescriber = (AndroidFileTypeDescriber) provider2.invoke();
                    FeatureFlagManager featureFlagManager4 = (FeatureFlagManager) ((DoubleCheck) provider4).getValue();
                    AndroidAccessibilityManager androidAccessibilityManager = (AndroidAccessibilityManager) ((LambdaProvider) provider).lambda.invoke();
                    RealTimestampFormatter$Factory$Impl realTimestampFormatter$Factory$Impl = (RealTimestampFormatter$Factory$Impl) provider5.invoke();
                    androidStringManager8.getClass();
                    androidFileTypeDescriber.getClass();
                    featureFlagManager4.getClass();
                    androidAccessibilityManager.getClass();
                    realTimestampFormatter$Factory$Impl.getClass();
                    return new ChatStateMapper(androidStringManager8, realEmojiDetector, androidFileTypeDescriber, featureFlagManager4, androidAccessibilityManager, realTimestampFormatter$Factory$Impl);
                case 24:
                    ForcedLazyKt$forcedLazy$1 forcedLazyKt$forcedLazy$1 = (ForcedLazyKt$forcedLazy$1) ((DoubleCheck) provider5).getValue();
                    RealEmbeddedCardReaderDelegator$Factory$Impl realEmbeddedCardReaderDelegator$Factory$Impl = (RealEmbeddedCardReaderDelegator$Factory$Impl) ((InstanceFactory) provider3).value;
                    RealEmbeddedCardReaderEventDelegator$Factory$Impl realEmbeddedCardReaderEventDelegator$Factory$Impl = (RealEmbeddedCardReaderEventDelegator$Factory$Impl) ((InstanceFactory) provider4).value;
                    RealNfcPaymentsManager realNfcPaymentsManager = (RealNfcPaymentsManager) provider2.invoke();
                    RealObservabilityManager realObservabilityManager = (RealObservabilityManager) ((LambdaProvider) provider).lambda.invoke();
                    forcedLazyKt$forcedLazy$1.getClass();
                    realEmbeddedCardReaderDelegator$Factory$Impl.getClass();
                    realEmbeddedCardReaderEventDelegator$Factory$Impl.getClass();
                    realNfcPaymentsManager.getClass();
                    realObservabilityManager.getClass();
                    return new zzai(forcedLazyKt$forcedLazy$1, realEmbeddedCardReaderDelegator$Factory$Impl, realEmbeddedCardReaderEventDelegator$Factory$Impl, realNfcPaymentsManager, realObservabilityManager);
                case 25:
                    Symbol symbol2 = (Symbol) ((BreadcrumbListener.MetroFactory) provider4).invoke();
                    RealLocaleManager realLocaleManager = (RealLocaleManager) provider2.invoke();
                    CoroutineScope coroutineScope8 = (CoroutineScope) ((InstanceFactory) provider3).value;
                    Context context = (Context) provider5.invoke();
                    CoroutineContext coroutineContext7 = (CoroutineContext) provider.invoke();
                    realLocaleManager.getClass();
                    coroutineScope8.getClass();
                    context.getClass();
                    coroutineContext7.getClass();
                    return new RealThreeDsService(symbol2, realLocaleManager, coroutineScope8, context, coroutineContext7);
                case 26:
                    CoroutineScope coroutineScope9 = (CoroutineScope) ((InstanceFactory) provider3).value;
                    Provider provider8 = (SetFactory) provider4;
                    DoubleCheck doubleCheck = provider8 instanceof Lazy ? (Lazy) provider8 : new DoubleCheck(provider8);
                    ErrorReporter errorReporter = (ErrorReporter) provider2.invoke();
                    RealObservabilityManager realObservabilityManager2 = (RealObservabilityManager) provider5.invoke();
                    boolean booleanValue = ((Boolean) provider.invoke()).booleanValue();
                    coroutineScope9.getClass();
                    errorReporter.getClass();
                    realObservabilityManager2.getClass();
                    return new RealTreehouseEventListener.Factory(coroutineScope9, doubleCheck, errorReporter, realObservabilityManager2, booleanValue);
                case 27:
                    SyncValueReader syncValueReader2 = (SyncValueReader) ((DoubleCheck) provider3).getValue();
                    SpendingInsightsAppService spendingInsightsAppService = (SpendingInsightsAppService) ((DoubleCheck) provider4).getValue();
                    AndroidStringManager androidStringManager9 = (AndroidStringManager) ((LambdaProvider) provider5).lambda.invoke();
                    ErrorReporter errorReporter2 = (ErrorReporter) ((LambdaProvider) provider).lambda.invoke();
                    SampleStrategy sampleStrategy = (SampleStrategy) provider2.invoke();
                    syncValueReader2.getClass();
                    spendingInsightsAppService.getClass();
                    androidStringManager9.getClass();
                    errorReporter2.getClass();
                    sampleStrategy.getClass();
                    return new MarkwonConfiguration(syncValueReader2, spendingInsightsAppService, androidStringManager9, errorReporter2, sampleStrategy);
                default:
                    RealFeatureEligibilityRepository realFeatureEligibilityRepository = (RealFeatureEligibilityRepository) provider2.invoke();
                    FeatureFlagManager featureFlagManager5 = (FeatureFlagManager) provider5.invoke();
                    SyncValueReader syncValueReader3 = (SyncValueReader) provider.invoke();
                    TextSetter textSetter = (TextSetter) ((TaxesAppletViewsModule$TaxesAppletMetroFactory) provider4).invoke();
                    CoroutineScope coroutineScope10 = (CoroutineScope) ((InstanceFactory) provider3).value;
                    realFeatureEligibilityRepository.getClass();
                    featureFlagManager5.getClass();
                    syncValueReader3.getClass();
                    coroutineScope10.getClass();
                    return new WorkApplet(realFeatureEligibilityRepository, featureFlagManager5, syncValueReader3, textSetter, coroutineScope10);
            }
        }

        public MetroFactory(BreadcrumbListener.MetroFactory metroFactory, LambdaProvider lambdaProvider, InstanceFactory instanceFactory, DoubleCheck doubleCheck, LambdaProvider lambdaProvider2) {
            this.$r8$classId = 25;
            this.scope = metroFactory;
            this.sessionManager = lambdaProvider;
            this.activity = instanceFactory;
            this.brazeConfigurator = doubleCheck;
            this.ioContext = lambdaProvider2;
        }

        public MetroFactory(LambdaProvider lambdaProvider, LambdaProvider lambdaProvider2, RealMessageSigner.MetroFactory metroFactory, LambdaProvider lambdaProvider3, LocalViewFactory.MetroFactory metroFactory2) {
            this.$r8$classId = 2;
            this.activity = lambdaProvider;
            this.scope = lambdaProvider2;
            this.sessionManager = metroFactory;
            this.ioContext = lambdaProvider3;
            this.brazeConfigurator = metroFactory2;
        }

        public /* synthetic */ MetroFactory(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, int i) {
            this.$r8$classId = i;
            this.activity = provider;
            this.scope = provider2;
            this.sessionManager = provider3;
            this.brazeConfigurator = provider4;
            this.ioContext = provider5;
        }

        public /* synthetic */ MetroFactory(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, int i, boolean z) {
            this.$r8$classId = i;
            this.activity = provider;
            this.sessionManager = provider2;
            this.scope = provider3;
            this.ioContext = provider4;
            this.brazeConfigurator = provider5;
        }

        public /* synthetic */ MetroFactory(Provider provider, Provider provider2, Provider provider3, Factory factory, Factory factory2, int i) {
            this.$r8$classId = i;
            this.sessionManager = provider;
            this.brazeConfigurator = provider2;
            this.ioContext = provider3;
            this.activity = factory;
            this.scope = factory2;
        }

        public /* synthetic */ MetroFactory(Provider provider, Factory factory, Provider provider2, Provider provider3, Provider provider4, int i) {
            this.$r8$classId = i;
            this.sessionManager = provider;
            this.activity = factory;
            this.brazeConfigurator = provider2;
            this.ioContext = provider3;
            this.scope = provider4;
        }

        public /* synthetic */ MetroFactory(Provider provider, Factory factory, Provider provider2, Provider provider3, InstanceFactory instanceFactory, int i) {
            this.$r8$classId = i;
            this.sessionManager = provider;
            this.brazeConfigurator = factory;
            this.scope = provider2;
            this.ioContext = provider3;
            this.activity = instanceFactory;
        }

        public MetroFactory(DelegateFactory delegateFactory, BorrowUiFactory.MetroFactory metroFactory, RetroUiFactory.MetroFactory metroFactory2, LambdaProvider lambdaProvider, InstanceFactory instanceFactory) {
            this.$r8$classId = 11;
            this.sessionManager = delegateFactory;
            this.scope = metroFactory;
            this.brazeConfigurator = metroFactory2;
            this.ioContext = lambdaProvider;
            this.activity = instanceFactory;
        }

        public MetroFactory(DoubleCheck doubleCheck, TemporaryStorage.MetroFactory metroFactory, RealBrazeConfigurator.MetroFactory metroFactory2, RealBrazeConfigurator.MetroFactory metroFactory3, TemporaryStorage.MetroFactory metroFactory4) {
            this.$r8$classId = 5;
            this.sessionManager = doubleCheck;
            this.activity = metroFactory;
            this.scope = metroFactory2;
            this.brazeConfigurator = metroFactory3;
            this.ioContext = metroFactory4;
        }

        public MetroFactory(DoubleCheck doubleCheck, AttestedKeyMetrics$MetroFactory attestedKeyMetrics$MetroFactory, LambdaProvider lambdaProvider, RealMessageSigner.MetroFactory metroFactory, DoubleCheck doubleCheck2) {
            this.$r8$classId = 16;
            this.activity = doubleCheck;
            this.sessionManager = attestedKeyMetrics$MetroFactory;
            this.scope = lambdaProvider;
            this.brazeConfigurator = metroFactory;
            this.ioContext = doubleCheck2;
        }

        public MetroFactory(DoubleCheck doubleCheck, LambdaProvider lambdaProvider, ArcadeModule$ProvideHapticVibratorMetroFactory arcadeModule$ProvideHapticVibratorMetroFactory, DoubleCheck doubleCheck2, RealMessageSigner.MetroFactory metroFactory) {
            this.$r8$classId = 4;
            this.sessionManager = doubleCheck;
            this.brazeConfigurator = lambdaProvider;
            this.activity = arcadeModule$ProvideHapticVibratorMetroFactory;
            this.ioContext = doubleCheck2;
            this.scope = metroFactory;
        }

        public MetroFactory(DoubleCheck doubleCheck, LambdaProvider lambdaProvider, RealFilamentSupportProvider.MetroFactory metroFactory, LambdaProvider lambdaProvider2, InstanceFactory instanceFactory) {
            this.$r8$classId = 13;
            this.scope = doubleCheck;
            this.sessionManager = lambdaProvider;
            this.ioContext = metroFactory;
            this.brazeConfigurator = lambdaProvider2;
            this.activity = instanceFactory;
        }

        public MetroFactory(DoubleCheck doubleCheck, LambdaProvider lambdaProvider, DoubleCheck doubleCheck2, ArcadeModule$ProvideHapticVibratorMetroFactory arcadeModule$ProvideHapticVibratorMetroFactory, LambdaProvider lambdaProvider2) {
            this.$r8$classId = 3;
            this.activity = doubleCheck;
            this.sessionManager = lambdaProvider;
            this.brazeConfigurator = doubleCheck2;
            this.scope = arcadeModule$ProvideHapticVibratorMetroFactory;
            this.ioContext = lambdaProvider2;
        }

        public MetroFactory(DoubleCheck doubleCheck, DoubleCheck doubleCheck2, MetroFactory metroFactory, RealMessageSigner.MetroFactory metroFactory2, DoubleCheck doubleCheck3) {
            this.$r8$classId = 17;
            this.activity = doubleCheck;
            this.scope = doubleCheck2;
            this.brazeConfigurator = metroFactory;
            this.sessionManager = metroFactory2;
            this.ioContext = doubleCheck3;
        }

        public MetroFactory(DoubleCheck doubleCheck, DoubleCheck doubleCheck2, LambdaProvider lambdaProvider, LambdaProvider lambdaProvider2, MusicViewFactory$MetroFactory musicViewFactory$MetroFactory) {
            this.$r8$classId = 27;
            this.activity = doubleCheck;
            this.scope = doubleCheck2;
            this.brazeConfigurator = lambdaProvider;
            this.ioContext = lambdaProvider2;
            this.sessionManager = musicViewFactory$MetroFactory;
        }

        public MetroFactory(DoubleCheck doubleCheck, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3, TaxesAppletViewsModule$TaxesAppletMetroFactory taxesAppletViewsModule$TaxesAppletMetroFactory, InstanceFactory instanceFactory) {
            this.$r8$classId = 28;
            this.sessionManager = doubleCheck;
            this.brazeConfigurator = doubleCheck2;
            this.ioContext = doubleCheck3;
            this.scope = taxesAppletViewsModule$TaxesAppletMetroFactory;
            this.activity = instanceFactory;
        }

        public MetroFactory(DoubleCheck doubleCheck, InstanceFactory instanceFactory, InstanceFactory instanceFactory2, RealSandboxer.MetroFactory metroFactory, LambdaProvider lambdaProvider) {
            this.$r8$classId = 24;
            this.brazeConfigurator = doubleCheck;
            this.activity = instanceFactory;
            this.scope = instanceFactory2;
            this.sessionManager = metroFactory;
            this.ioContext = lambdaProvider;
        }

        public /* synthetic */ MetroFactory(Factory factory, Provider provider, Provider provider2, Provider provider3, Object obj, int i) {
            this.$r8$classId = i;
            this.activity = factory;
            this.sessionManager = provider;
            this.brazeConfigurator = provider2;
            this.ioContext = provider3;
            this.scope = (Provider) obj;
        }

        public MetroFactory(Path.Companion companion, ShiftsAnalytics.MetroFactory metroFactory, InstanceFactory instanceFactory, InstanceFactory instanceFactory2, DoubleCheck doubleCheck, InstanceFactory instanceFactory3) {
            this.$r8$classId = 22;
            this.sessionManager = metroFactory;
            this.activity = instanceFactory;
            this.scope = instanceFactory2;
            this.brazeConfigurator = doubleCheck;
            this.ioContext = instanceFactory3;
        }
    }
}
