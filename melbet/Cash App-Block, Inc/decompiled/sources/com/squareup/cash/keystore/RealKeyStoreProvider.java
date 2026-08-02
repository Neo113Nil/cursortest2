package com.squareup.cash.keystore;

import android.content.Context;
import android.os.Looper;
import android.security.keystore.KeyGenParameterSpec;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.core.os.BundleKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.RealImageLoader;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.blockers.navigation.FlowNavigationHelper;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.data.profile.RealProfileSyncSetupTeardown;
import com.squareup.cash.data.profile.RealProfileSyncer;
import com.squareup.cash.data.profile.documents.RealDocumentsManager;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.db2.Instrument$Adapter;
import com.squareup.cash.deviceintegrity.RealDeviceIntegrityAnalyticsTracker;
import com.squareup.cash.discover.DiscoverRegisteredTreehouseApp;
import com.squareup.cash.e2ee.signature.generator.SignatureDeleter;
import com.squareup.cash.e2ee.signature.local.RealLocalSignatureStore;
import com.squareup.cash.e2ee.trifle.RealTrifleLogger;
import com.squareup.cash.e2ee.trifle.TrifleService;
import com.squareup.cash.earningstracker.backend.real.RealEarningsTrackerAnalytics;
import com.squareup.cash.earningstracker.backend.real.RealEarningsTrackerRepository;
import com.squareup.cash.elementboundsregistry.core.ElementBoundsRegistry;
import com.squareup.cash.eligibility.backend.real.RealFeatureEligibilityRepository;
import com.squareup.cash.eligibility.backend.real.RealSettingsEligibilityManager;
import com.squareup.cash.family.familyhub.backend.real.RealFamilyAccountsManager;
import com.squareup.cash.family.profileselection.real.RealFamilyProfileManager;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.RealSessionFlags;
import com.squareup.cash.fidesmo.presenters.FidesmoProvisioningFlowContext;
import com.squareup.cash.gps.backend.real.GpsLocationRefresher;
import com.squareup.cash.gps.backend.real.RealGpsLocationManager;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import com.squareup.cash.instruments.backend.real.RealInstrumentManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.integration.api.CashBackoffInterceptor;
import com.squareup.cash.integration.api.Endpoints;
import com.squareup.cash.investing.backend.real.PersistentHistoricalDataCache;
import com.squareup.cash.investing.backend.real.RealEntityPriceRefresher;
import com.squareup.cash.investing.backend.real.categories.RealCategoryBackend;
import com.squareup.cash.limits.backend.real.RealLimitsStore;
import com.squareup.cash.money.presenters.HypeEligibilityProvider;
import com.squareup.cash.moneybot.backend.real.RealMoneybotFlagsHelper;
import com.squareup.cash.moneybot.components.plugins.SuggestionListPlugin;
import com.squareup.cash.moneybot.components.plugins.TemplateCardPlugin;
import com.squareup.cash.moneybot.presenters.plugins.SuggestionListPresenter$Factory$Impl;
import com.squareup.cash.moneybot.presenters.plugins.TemplateCardPresenter$Factory$Impl;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.observability.backend.real.network.RealMobileObservabilityEventListener;
import com.squareup.cash.observability.backend.real.network.RealRequestObserver;
import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.ReportedError;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.cash.paychecks.presenters.util.RealPaycheckSettlementDateFormatter;
import com.squareup.cash.payments.backend.real.RealP2pSettingsManager;
import com.squareup.cash.payments.views.PaymentsViewFactory;
import com.squareup.cash.performance.StartupPerformanceAnalyzer;
import com.squareup.cash.pools.backend.real.PoolsRefresher;
import com.squareup.cash.pools.backend.real.RealPoolsRepository;
import com.squareup.cash.resource.AndroidDateFormatManager;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.storage.RealStorage;
import com.squareup.cash.storage.Storage;
import com.squareup.cash.treehouse.android.TreehouseModule$provideCashTreehouseAppFactory$1;
import com.squareup.cash.treehouse.android.broadway.TreehouseScreenFactory;
import com.squareup.cash.treehouse.android.configuration.RealTreehouseConfigurationStore;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.userjourneys.tracker.UserJourneyTracker;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.common.truststore.SquareSSLSocketFactory;
import com.squareup.common.truststore.SquareTruststore;
import com.squareup.preferences.BooleanPreference;
import com.squareup.protos.cash.cashbusinessaccounts.api.v1.C4BClientService;
import com.squareup.protos.cash.cashlimitsxp.api.v1.LimitsHubService;
import com.squareup.protos.cash.deviceintegritly.api.DeviceIntegritlyService;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.util.ForcedLazyKt$forcedLazy$1;
import com.squareup.util.Strings;
import com.squareup.wire.WireGrpcClient;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.X509TrustManager;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import okhttp3.Cache;
import okhttp3.ConnectionPool;
import okhttp3.EventListener;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.internal._UtilJvmKt;
import okio.Path;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.PapaEventListener;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class RealKeyStoreProvider {
    public final Context context;
    public final ErrorReporter errorReporter;
    public final CoroutineContext ioContext;
    public final ConnectionPool keyStore;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/squareup/cash/keystore/RealKeyStoreProvider$KeyStoreProviderError", "Lcom/squareup/cash/observability/types/ReportedError;", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public final class KeyStoreProviderError extends ReportedError {
        public final Throwable cause;
        public final String message;
        public final Map metadata;
        public final Set targets;

        public KeyStoreProviderError(Throwable th, int i) {
            th.getClass();
            this.cause = th;
            this.message = Recorder$$ExternalSyntheticOutline2.m("KeyStoreProvider: ", th.getMessage());
            this.targets = ArraysKt___ArraysKt.toSet(new ReportedError.ErrorReportingTarget[]{ReportedError.ErrorReportingTarget.DATADOG, ReportedError.ErrorReportingTarget.LOGS});
            this.metadata = BalanceFeedKt$$ExternalSyntheticOutline0.m("KeyStoreProvider.load", MapsKt__MapsJVMKt.mapOf(new Pair("retry_attempt", Integer.valueOf(i))));
        }

        @Override // java.lang.Throwable
        public final Throwable getCause() {
            return this.cause;
        }

        @Override // com.squareup.cash.observability.types.FeatureError
        public final Set getFeatures() {
            return ArraysKt___ArraysKt.toSet(new ErrorFeature[]{ErrorFeature.Security.INSTANCE, ErrorFeature.DigitalSigning.INSTANCE});
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.message;
        }

        @Override // com.squareup.cash.observability.types.ReportedError
        public final Map getMetadata() {
            return this.metadata;
        }

        @Override // com.squareup.cash.observability.types.ReportedError
        public final Set getTargets() {
            return this.targets;
        }
    }

    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId;
        public final Provider context;
        public final Provider errorReporter;
        public final Provider ioContext;

        public /* synthetic */ MetroFactory(Provider provider, Provider provider2, Provider provider3, int i) {
            this.$r8$classId = i;
            this.context = provider;
            this.errorReporter = provider2;
            this.ioContext = provider3;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = this.$r8$classId;
            int i2 = 0;
            Provider provider = this.ioContext;
            Provider provider2 = this.errorReporter;
            Provider provider3 = this.context;
            switch (i) {
                case 0:
                    Context context = (Context) provider3.invoke();
                    ErrorReporter errorReporter = (ErrorReporter) provider2.invoke();
                    ConnectionPool connectionPool = (ConnectionPool) RealKeyStoreDelegator$MetroFactory.INSTANCE.invoke();
                    CoroutineContext coroutineContext = (CoroutineContext) provider.invoke();
                    context.getClass();
                    errorReporter.getClass();
                    coroutineContext.getClass();
                    return new RealKeyStoreProvider(context, errorReporter, connectionPool, coroutineContext);
                case 1:
                    RealProfileSyncer realProfileSyncer = (RealProfileSyncer) provider3.invoke();
                    SessionManager sessionManager = (SessionManager) provider2.invoke();
                    ErrorReporter errorReporter2 = (ErrorReporter) provider.invoke();
                    realProfileSyncer.getClass();
                    sessionManager.getClass();
                    errorReporter2.getClass();
                    return new RealProfileSyncSetupTeardown(realProfileSyncer, sessionManager, errorReporter2);
                case 2:
                    CashAccountDatabaseImpl cashAccountDatabaseImpl = (CashAccountDatabaseImpl) provider3.invoke();
                    String str = (String) provider2.invoke();
                    CoroutineContext coroutineContext2 = (CoroutineContext) provider.invoke();
                    cashAccountDatabaseImpl.getClass();
                    str.getClass();
                    coroutineContext2.getClass();
                    return new RealDocumentsManager(cashAccountDatabaseImpl, str, coroutineContext2);
                case 3:
                    Analytics analytics = (Analytics) provider3.invoke();
                    AndroidClock androidClock = (AndroidClock) provider2.invoke();
                    ForcedLazyKt$forcedLazy$1 forcedLazyKt$forcedLazy$1 = (ForcedLazyKt$forcedLazy$1) provider.invoke();
                    analytics.getClass();
                    androidClock.getClass();
                    forcedLazyKt$forcedLazy$1.getClass();
                    return new RealDeviceIntegrityAnalyticsTracker(analytics, androidClock, forcedLazyKt$forcedLazy$1);
                case 4:
                    DeviceIntegritlyService deviceIntegritlyService = (DeviceIntegritlyService) provider3.invoke();
                    SessionManager sessionManager2 = (SessionManager) provider2.invoke();
                    RealDeviceIntegrityAnalyticsTracker realDeviceIntegrityAnalyticsTracker = (RealDeviceIntegrityAnalyticsTracker) provider.invoke();
                    deviceIntegritlyService.getClass();
                    sessionManager2.getClass();
                    realDeviceIntegrityAnalyticsTracker.getClass();
                    return new Instrument$Adapter(deviceIntegritlyService, sessionManager2, realDeviceIntegrityAnalyticsTracker);
                case 5:
                    TreehouseModule$provideCashTreehouseAppFactory$1 treehouseModule$provideCashTreehouseAppFactory$1 = (TreehouseModule$provideCashTreehouseAppFactory$1) provider3.invoke();
                    RealTreehouseConfigurationStore realTreehouseConfigurationStore = (RealTreehouseConfigurationStore) provider2.invoke();
                    TreehouseScreenFactory treehouseScreenFactory = (TreehouseScreenFactory) provider.invoke();
                    treehouseModule$provideCashTreehouseAppFactory$1.getClass();
                    realTreehouseConfigurationStore.getClass();
                    treehouseScreenFactory.getClass();
                    return new DiscoverRegisteredTreehouseApp(treehouseModule$provideCashTreehouseAppFactory$1, realTreehouseConfigurationStore, treehouseScreenFactory, 0);
                case 6:
                    TrifleService trifleService = (TrifleService) provider3.invoke();
                    RealTrifleLogger realTrifleLogger = (RealTrifleLogger) provider2.invoke();
                    RealLocalSignatureStore realLocalSignatureStore = (RealLocalSignatureStore) provider.invoke();
                    trifleService.getClass();
                    realTrifleLogger.getClass();
                    realLocalSignatureStore.getClass();
                    return new SignatureDeleter(trifleService, realTrifleLogger, realLocalSignatureStore);
                case 7:
                    C4BClientService c4BClientService = (C4BClientService) provider3.invoke();
                    RealEarningsTrackerAnalytics realEarningsTrackerAnalytics = (RealEarningsTrackerAnalytics) provider2.invoke();
                    AndroidClock androidClock2 = (AndroidClock) provider.invoke();
                    c4BClientService.getClass();
                    realEarningsTrackerAnalytics.getClass();
                    androidClock2.getClass();
                    return new RealEarningsTrackerRepository(c4BClientService, realEarningsTrackerAnalytics, androidClock2);
                case 8:
                    SyncValueReader syncValueReader = (SyncValueReader) provider3.invoke();
                    ErrorReporter errorReporter3 = (ErrorReporter) provider2.invoke();
                    SampleStrategy sampleStrategy = (SampleStrategy) provider.invoke();
                    syncValueReader.getClass();
                    errorReporter3.getClass();
                    sampleStrategy.getClass();
                    return new RealFamilyAccountsManager(syncValueReader, errorReporter3, sampleStrategy);
                case 9:
                    Analytics analytics2 = (Analytics) provider3.invoke();
                    AndroidClock androidClock3 = (AndroidClock) provider2.invoke();
                    UserJourneyTracker userJourneyTracker = (UserJourneyTracker) provider.invoke();
                    analytics2.getClass();
                    androidClock3.getClass();
                    return new FidesmoProvisioningFlowContext(analytics2, androidClock3, userJourneyTracker);
                case 10:
                    RealGpsLocationManager realGpsLocationManager = (RealGpsLocationManager) provider3.invoke();
                    SessionManager sessionManager3 = (SessionManager) provider2.invoke();
                    RealUuidGenerator realUuidGenerator = (RealUuidGenerator) provider.invoke();
                    realGpsLocationManager.getClass();
                    sessionManager3.getClass();
                    realUuidGenerator.getClass();
                    return new GpsLocationRefresher(realGpsLocationManager, sessionManager3, realUuidGenerator);
                case 11:
                    CashAccountDatabaseImpl cashAccountDatabaseImpl2 = (CashAccountDatabaseImpl) provider3.invoke();
                    CashAccountDatabaseImpl cashAccountDatabaseImpl3 = (CashAccountDatabaseImpl) provider2.invoke();
                    CoroutineContext coroutineContext3 = (CoroutineContext) provider.invoke();
                    cashAccountDatabaseImpl2.getClass();
                    cashAccountDatabaseImpl3.getClass();
                    coroutineContext3.getClass();
                    return new Instrument$Adapter(cashAccountDatabaseImpl2, cashAccountDatabaseImpl3, coroutineContext3);
                case 12:
                    AppConfigManager appConfigManager = (AppConfigManager) provider3.invoke();
                    Analytics analytics3 = (Analytics) provider2.invoke();
                    FlowStarter flowStarter = (FlowStarter) provider.invoke();
                    appConfigManager.getClass();
                    analytics3.getClass();
                    flowStarter.getClass();
                    return new Instrument$Adapter(appConfigManager, analytics3, flowStarter);
                case 13:
                    RealInstrumentManager realInstrumentManager = (RealInstrumentManager) provider3.invoke();
                    BooleanPreference booleanPreference = (BooleanPreference) provider2.invoke();
                    RealSettingsEligibilityManager realSettingsEligibilityManager = (RealSettingsEligibilityManager) provider.invoke();
                    realInstrumentManager.getClass();
                    booleanPreference.getClass();
                    realSettingsEligibilityManager.getClass();
                    return new Instrument$Adapter(realInstrumentManager, booleanPreference, realSettingsEligibilityManager);
                case 14:
                    AndroidClock androidClock4 = (AndroidClock) provider3.invoke();
                    FeatureFlagManager featureFlagManager = (FeatureFlagManager) provider2.invoke();
                    RealObservabilityManager realObservabilityManager = (RealObservabilityManager) provider.invoke();
                    androidClock4.getClass();
                    featureFlagManager.getClass();
                    realObservabilityManager.getClass();
                    return new CashBackoffInterceptor(androidClock4, featureFlagManager, realObservabilityManager);
                case 15:
                    Context context2 = (Context) provider3.invoke();
                    Endpoints endpoints = (Endpoints) provider2.invoke();
                    Storage storage = (Storage) provider.invoke();
                    context2.getClass();
                    endpoints.getClass();
                    storage.getClass();
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        a$$ExternalSyntheticBUOutline0.m$1("GrpcClient initialized on main thread.");
                        return null;
                    }
                    String str2 = Path.DIRECTORY_SEPARATOR;
                    Cache cache = new Cache(((RealStorage) storage).cache, Path.Companion.get("/http_streaming", false), Strings.DISK_CACHE_SIZE);
                    OkHttpClient.Builder builder = new OkHttpClient.Builder();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    timeUnit.getClass();
                    builder.connectTimeout = _UtilJvmKt.checkDuration("timeout", 15L, timeUnit);
                    builder.readTimeout(15L, timeUnit);
                    builder.writeTimeout = _UtilJvmKt.checkDuration("timeout", 15L, timeUnit);
                    builder.pingInterval = _UtilJvmKt.checkDuration("interval", 60L, timeUnit);
                    builder.cache = cache;
                    SquareTruststore create = SquareTruststore.create(context2);
                    SquareSSLSocketFactory squareSSLSocketFactory = create.sslSocketFactory;
                    X509TrustManager x509TrustManager = create.trustManager;
                    x509TrustManager.getClass();
                    builder.sslSocketFactory(squareSSLSocketFactory, x509TrustManager);
                    OkHttpClient okHttpClient = new OkHttpClient(builder);
                    Protocol protocol = Protocol.HTTP_2;
                    List list = okHttpClient.protocols;
                    if (list.contains(protocol) || list.contains(Protocol.H2_PRIOR_KNOWLEDGE)) {
                        return new WireGrpcClient(okHttpClient, BundleKt.toHttpUrl("https://push.cashappapi.com"));
                    }
                    a$$ExternalSyntheticBUOutline0.m$3("OkHttpClient is not configured with a HTTP/2 protocol which is required for gRPC connections.");
                    return null;
                case 16:
                    CashAccountDatabaseImpl cashAccountDatabaseImpl4 = (CashAccountDatabaseImpl) provider3.invoke();
                    com.squareup.cash.util.cache.Cache cache2 = (com.squareup.cash.util.cache.Cache) provider2.invoke();
                    CoroutineContext coroutineContext4 = (CoroutineContext) provider.invoke();
                    cashAccountDatabaseImpl4.getClass();
                    cache2.getClass();
                    coroutineContext4.getClass();
                    return new PersistentHistoricalDataCache(cashAccountDatabaseImpl4, cache2, coroutineContext4);
                case 17:
                    RealEntityPriceRefresher realEntityPriceRefresher = (RealEntityPriceRefresher) provider3.invoke();
                    CashAccountDatabaseImpl cashAccountDatabaseImpl5 = (CashAccountDatabaseImpl) provider2.invoke();
                    CoroutineContext coroutineContext5 = (CoroutineContext) provider.invoke();
                    realEntityPriceRefresher.getClass();
                    cashAccountDatabaseImpl5.getClass();
                    coroutineContext5.getClass();
                    return new RealCategoryBackend(realEntityPriceRefresher, cashAccountDatabaseImpl5, coroutineContext5);
                case 18:
                    LimitsHubService limitsHubService = (LimitsHubService) provider3.invoke();
                    ErrorReporter errorReporter4 = (ErrorReporter) provider2.invoke();
                    SampleStrategy sampleStrategy2 = (SampleStrategy) provider.invoke();
                    limitsHubService.getClass();
                    errorReporter4.getClass();
                    sampleStrategy2.getClass();
                    return new RealLimitsStore(limitsHubService, errorReporter4, sampleStrategy2);
                case 19:
                    RealP2pSettingsManager realP2pSettingsManager = (RealP2pSettingsManager) provider3.invoke();
                    RealFamilyProfileManager realFamilyProfileManager = (RealFamilyProfileManager) provider2.invoke();
                    SyncValueReader syncValueReader2 = (SyncValueReader) provider.invoke();
                    realP2pSettingsManager.getClass();
                    realFamilyProfileManager.getClass();
                    syncValueReader2.getClass();
                    return new HypeEligibilityProvider(realP2pSettingsManager, realFamilyProfileManager, syncValueReader2);
                case 20:
                    FeatureFlagManager featureFlagManager2 = (FeatureFlagManager) provider3.invoke();
                    RealFeatureEligibilityRepository realFeatureEligibilityRepository = (RealFeatureEligibilityRepository) provider2.invoke();
                    RealSessionFlags realSessionFlags = (RealSessionFlags) provider.invoke();
                    featureFlagManager2.getClass();
                    realFeatureEligibilityRepository.getClass();
                    realSessionFlags.getClass();
                    return new RealMoneybotFlagsHelper(featureFlagManager2, realFeatureEligibilityRepository, realSessionFlags);
                case 21:
                    SuggestionListPresenter$Factory$Impl suggestionListPresenter$Factory$Impl = (SuggestionListPresenter$Factory$Impl) provider3.invoke();
                    ErrorReporter errorReporter5 = (ErrorReporter) provider2.invoke();
                    SampleStrategy sampleStrategy3 = (SampleStrategy) provider.invoke();
                    suggestionListPresenter$Factory$Impl.getClass();
                    errorReporter5.getClass();
                    sampleStrategy3.getClass();
                    return new SuggestionListPlugin(suggestionListPresenter$Factory$Impl, errorReporter5, sampleStrategy3);
                case 22:
                    TemplateCardPresenter$Factory$Impl templateCardPresenter$Factory$Impl = (TemplateCardPresenter$Factory$Impl) provider3.invoke();
                    ErrorReporter errorReporter6 = (ErrorReporter) provider2.invoke();
                    SampleStrategy sampleStrategy4 = (SampleStrategy) provider.invoke();
                    templateCardPresenter$Factory$Impl.getClass();
                    errorReporter6.getClass();
                    sampleStrategy4.getClass();
                    return new TemplateCardPlugin(templateCardPresenter$Factory$Impl, errorReporter6, sampleStrategy4);
                case 23:
                    String str3 = (String) provider3.invoke();
                    RealObservabilityManager realObservabilityManager2 = (RealObservabilityManager) provider2.invoke();
                    RealUuidGenerator realUuidGenerator2 = (RealUuidGenerator) provider.invoke();
                    str3.getClass();
                    realObservabilityManager2.getClass();
                    realUuidGenerator2.getClass();
                    return new RealRequestObserver(realObservabilityManager2, str3, realUuidGenerator2);
                case 24:
                    FeatureFlagManager featureFlagManager3 = (FeatureFlagManager) provider3.invoke();
                    provider2.getClass();
                    Lazy doubleCheck = provider2 instanceof Lazy ? (Lazy) provider2 : new DoubleCheck(provider2);
                    EventListener.Factory factory = (EventListener.Factory) provider.invoke();
                    featureFlagManager3.getClass();
                    factory.getClass();
                    return new RealMobileObservabilityEventListener(featureFlagManager3, doubleCheck, factory);
                case 25:
                    AndroidClock androidClock5 = (AndroidClock) provider3.invoke();
                    AndroidStringManager androidStringManager = (AndroidStringManager) provider2.invoke();
                    AndroidDateFormatManager androidDateFormatManager = (AndroidDateFormatManager) provider.invoke();
                    androidClock5.getClass();
                    androidStringManager.getClass();
                    androidDateFormatManager.getClass();
                    return new RealPaycheckSettlementDateFormatter(androidClock5, androidStringManager, androidDateFormatManager);
                case 26:
                    RealImageLoader realImageLoader = (RealImageLoader) provider3.invoke();
                    RealCashVibrator realCashVibrator = (RealCashVibrator) provider2.invoke();
                    ElementBoundsRegistry elementBoundsRegistry = (ElementBoundsRegistry) provider.invoke();
                    realImageLoader.getClass();
                    realCashVibrator.getClass();
                    elementBoundsRegistry.getClass();
                    return new PaymentsViewFactory(i2, realImageLoader, realCashVibrator, elementBoundsRegistry);
                case 27:
                    Analytics analytics4 = (Analytics) provider3.invoke();
                    CoroutineScope coroutineScope = (CoroutineScope) provider2.invoke();
                    PapaEventListener.Companion companion = PapaEventListener.Companion;
                    UserJourneyTracker userJourneyTracker2 = (UserJourneyTracker) provider.invoke();
                    analytics4.getClass();
                    coroutineScope.getClass();
                    companion.getClass();
                    userJourneyTracker2.getClass();
                    return new StartupPerformanceAnalyzer(analytics4, coroutineScope, companion, userJourneyTracker2);
                case 28:
                    RealPoolsRepository realPoolsRepository = (RealPoolsRepository) provider3.invoke();
                    SessionManager sessionManager4 = (SessionManager) provider2.invoke();
                    FeatureFlagManager featureFlagManager4 = (FeatureFlagManager) provider.invoke();
                    realPoolsRepository.getClass();
                    sessionManager4.getClass();
                    featureFlagManager4.getClass();
                    return new PoolsRefresher(realPoolsRepository, sessionManager4, featureFlagManager4);
                default:
                    AppService appService = (AppService) provider3.invoke();
                    FlowStarter flowStarter2 = (FlowStarter) provider2.invoke();
                    FlowNavigationHelper flowNavigationHelper = (FlowNavigationHelper) provider.invoke();
                    appService.getClass();
                    flowStarter2.getClass();
                    flowNavigationHelper.getClass();
                    return new EglCore(25, appService, flowStarter2, flowNavigationHelper);
            }
        }
    }

    public RealKeyStoreProvider(Context context, ErrorReporter errorReporter, ConnectionPool connectionPool, CoroutineContext coroutineContext) {
        this.context = context;
        this.errorReporter = errorReporter;
        this.keyStore = connectionPool;
        this.ioContext = coroutineContext;
    }

    public final Object containsAlias(String str, ContinuationImpl continuationImpl) {
        return JobKt.withContext(this.ioContext, new RealKeyStoreProvider$getKey$2(this, str, null, 1), continuationImpl);
    }

    public final Object deleteEntry(String str, ContinuationImpl continuationImpl) {
        Object withContext = JobKt.withContext(this.ioContext, new RealKeyStoreProvider$getKey$2(this, str, null, 2), continuationImpl);
        return withContext == CoroutineSingletons.COROUTINE_SUSPENDED ? withContext : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object generateRSAKey(KeyGenParameterSpec keyGenParameterSpec, ContinuationImpl continuationImpl) {
        RealKeyStoreProvider$generateRSAKey$1 realKeyStoreProvider$generateRSAKey$1;
        int i;
        if (continuationImpl instanceof RealKeyStoreProvider$generateRSAKey$1) {
            realKeyStoreProvider$generateRSAKey$1 = (RealKeyStoreProvider$generateRSAKey$1) continuationImpl;
            int i2 = realKeyStoreProvider$generateRSAKey$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realKeyStoreProvider$generateRSAKey$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realKeyStoreProvider$generateRSAKey$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realKeyStoreProvider$generateRSAKey$1.label;
                Continuation continuation = null;
                int i3 = 1;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealKeyStoreProvider$generateECKey$2 realKeyStoreProvider$generateECKey$2 = new RealKeyStoreProvider$generateECKey$2(this, keyGenParameterSpec, continuation, i3);
                    realKeyStoreProvider$generateRSAKey$1.label = 1;
                    obj = JobKt.withContext(this.ioContext, realKeyStoreProvider$generateECKey$2, realKeyStoreProvider$generateRSAKey$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                obj.getClass();
                return obj;
            }
        }
        realKeyStoreProvider$generateRSAKey$1 = new RealKeyStoreProvider$generateRSAKey$1(this, continuationImpl);
        Object obj2 = realKeyStoreProvider$generateRSAKey$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realKeyStoreProvider$generateRSAKey$1.label;
        Continuation continuation2 = null;
        int i32 = 1;
        if (i != 0) {
        }
        obj2.getClass();
        return obj2;
    }
}
