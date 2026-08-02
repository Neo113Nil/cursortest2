package com.squareup.cash.filament;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.lifecycle.Lifecycle;
import androidx.room.RoomDatabase$closeBarrier$1;
import androidx.tracing.Trace;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.cdp.backend.android.AndroidDeviceInfoProvider;
import app.cash.cdp.backend.android.AndroidOperatingSystemInfoProvider;
import app.cash.cdp.backend.android.AndroidSessionIdProvider;
import app.cash.cdp.backend.android.CashApplicationInfoProvider;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.afterpayapplet.backend.real.RealAfterpayMerchantRepo;
import com.squareup.cash.biometrics.AndroidBiometricsStore;
import com.squareup.cash.biometrics.CashBiometricsInfo;
import com.squareup.cash.blockers.analytics.RealFlowTokenGenerator;
import com.squareup.cash.boost.backend.RealBoostRepository;
import com.squareup.cash.boost.db.Reward$Adapter;
import com.squareup.cash.braze.RealBrazeManager$$ExternalSyntheticLambda0;
import com.squareup.cash.clientsync.errors.RealClientSyncErrorReporter;
import com.squareup.cash.clientsync.persistence.SyncEntityStore;
import com.squareup.cash.clientsync.readers.RealSyncValueReader;
import com.squareup.cash.clientsync.readers.RealSyncValueReaderV2;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.clientsync.syncer.RealClientSyncer;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.data.profile.RealJurisdictionConfigManager;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.e2ee.signature.RealSignatureManager;
import com.squareup.cash.earnings.applets.presenters.RealEarnerAppletAvailabilityState;
import com.squareup.cash.earnings.backend.real.RealEarningsSyncStateRepository;
import com.squareup.cash.encryption.RealClientSyncEntityDecryptor;
import com.squareup.cash.exchangedata.real.RealExchangeDataSyncerFactory;
import com.squareup.cash.featureflags.FeatureFlag$StringFeatureFlag$Value;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$AndroidFilamentBlacklist;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$ClientsyncSyncValueReaderImpl;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.investing.backend.api.NetworkStatus;
import com.squareup.cash.localization.ClientSyncLocaleChangeIoSetupTeardown;
import com.squareup.cash.localization.RealLocaleManager;
import com.squareup.cash.mri.android.RealMRIFactory;
import com.squareup.cash.observability.backend.api.BugsnagClient;
import com.squareup.cash.observability.backend.real.bugsnag.BugsnagClientSandboxSetupTeardown;
import com.squareup.cash.offers.backend.real.RealOffersAnalyticsHelper;
import com.squareup.cash.offers.backend.real.RealOffersSheetRepository;
import com.squareup.cash.offers.backend.real.RealOffersTabRefresher;
import com.squareup.cash.offers.backend.real.RealOffersTabRepository;
import com.squareup.cash.payments.backend.api.OfflineManager;
import com.squareup.cash.payments.backend.real.RealRawOfflineActivityService;
import com.squareup.cash.securitysignals.backend.RealScreenRecordingDetector;
import com.squareup.cash.session.backend.RealUrlAuthenticator;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.shopping.backend.real.RealRecentSearchManager;
import com.squareup.cash.storage.StorageLink;
import com.squareup.cash.support.backend.real.RealSupportStatus;
import com.squareup.cash.support.backend.real.articles.RealArticlesService;
import com.squareup.cash.support.chat.backend.real.RealChatNotificationSuppressor;
import com.squareup.cash.threedsdataonly.backend.real.RealThreeDsWarningsRepository;
import com.squareup.cash.userjourneys.tracker.RealJourneyRequestContextProvider;
import com.squareup.cash.userjourneys.tracker.UserJourneysAppModule$Companion$provideJourneyReporterContext$5;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.moshi.Moshi;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.cashstorefronts.api.CashStorefrontsClientService;
import com.squareup.protos.cash.cashsuggest.api.CashSuggestClientService;
import com.squareup.protos.cash.deviceintegritly.api.ClientTrustSignalsService;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.util.coroutines.Teardown;
import com.squareup.util.coroutines.android.IoActivitySetupTeardown;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import dev.zacsweers.metro.internal.InstanceFactory;
import io.noties.markwon.MarkwonConfiguration;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import papa.internal.AppUpdateDetector$$ExternalSyntheticLambda0;
import retrofit2.Retrofit;

/* loaded from: classes.dex */
public final class RealFilamentSupportProvider implements IoActivitySetupTeardown {
    public static final List DEFAULT_BLACKLISTED_GPUS = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"GE8100", "GE8300", "GE8320", "GE8322"});
    public final BugsnagClient bugsnagClient;
    public final Context context;
    public final CoroutineContext ioDispatcher;
    public final ReadonlyStateFlow isDeviceSupported;
    public final Lazy renderer$delegate = LazyKt.lazy(new RealBrazeManager$$ExternalSyntheticLambda0(this, 17));

    public RealFilamentSupportProvider(Context context, BugsnagClient bugsnagClient, FeatureFlagManager featureFlagManager, CoroutineScope coroutineScope, CoroutineContext coroutineContext) {
        this.context = context;
        this.bugsnagClient = bugsnagClient;
        this.ioDispatcher = coroutineContext;
        this.isDeviceSupported = FlowKt.stateIn(FlowKt.flowOn(new FinishSetupTileBadgeCounter(12, Trace.valuesState(featureFlagManager, LaunchDarklyFeatureFlags$AndroidFilamentBlacklist.INSTANCE), this), coroutineContext), coroutineScope, SharingStarted.Companion.Eagerly, Boolean.FALSE);
    }

    public final boolean isDeviceSupported() {
        return ((Boolean) this.isDeviceSupported.$$delegate_0.getValue()).booleanValue();
    }

    @Override // com.squareup.util.coroutines.SetupTeardown
    public final Teardown setup(CoroutineScope coroutineScope, Object obj) {
        coroutineScope.getClass();
        ((Lifecycle) obj).getClass();
        return StateFlowKt.noOpTeardown;
    }

    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId;
        public final Provider bugsnagClient;
        public final Provider context;
        public final Provider featureFlagManager;
        public final Provider ioDispatcher;
        public final InstanceFactory scope;

        public /* synthetic */ MetroFactory(Provider provider, Provider provider2, Provider provider3, Provider provider4, InstanceFactory instanceFactory, int i) {
            this.$r8$classId = i;
            this.context = provider;
            this.bugsnagClient = provider2;
            this.featureFlagManager = provider3;
            this.ioDispatcher = provider4;
            this.scope = instanceFactory;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v5, types: [kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r5v10, types: [kotlin.Lazy] */
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = this.$r8$classId;
            Provider provider = this.ioDispatcher;
            Provider provider2 = this.featureFlagManager;
            Provider provider3 = this.bugsnagClient;
            Provider provider4 = this.context;
            InstanceFactory instanceFactory = this.scope;
            switch (i) {
                case 0:
                    Context context = (Context) provider4.invoke();
                    BugsnagClient bugsnagClient = (BugsnagClient) provider3.invoke();
                    FeatureFlagManager featureFlagManager = (FeatureFlagManager) provider2.invoke();
                    CoroutineScope coroutineScope = (CoroutineScope) instanceFactory.value;
                    CoroutineContext coroutineContext = (CoroutineContext) provider.invoke();
                    context.getClass();
                    bugsnagClient.getClass();
                    featureFlagManager.getClass();
                    coroutineScope.getClass();
                    coroutineContext.getClass();
                    return new RealFilamentSupportProvider(context, bugsnagClient, featureFlagManager, coroutineScope, coroutineContext);
                case 1:
                    CashSuggestClientService cashSuggestClientService = (CashSuggestClientService) provider4.invoke();
                    AndroidClock androidClock = (AndroidClock) provider3.invoke();
                    CashAccountDatabaseImpl cashAccountDatabaseImpl = (CashAccountDatabaseImpl) provider2.invoke();
                    CoroutineContext coroutineContext2 = (CoroutineContext) provider.invoke();
                    CoroutineScope coroutineScope2 = (CoroutineScope) instanceFactory.value;
                    cashSuggestClientService.getClass();
                    androidClock.getClass();
                    cashAccountDatabaseImpl.getClass();
                    coroutineContext2.getClass();
                    coroutineScope2.getClass();
                    return new RealAfterpayMerchantRepo(cashSuggestClientService, androidClock, cashAccountDatabaseImpl, coroutineContext2, coroutineScope2);
                case 2:
                    Activity activity = (Activity) instanceFactory.value;
                    AndroidBiometricsStore androidBiometricsStore = (AndroidBiometricsStore) provider4.invoke();
                    CashBiometricsInfo cashBiometricsInfo = (CashBiometricsInfo) provider3.invoke();
                    AppService appService = (AppService) provider2.invoke();
                    RealProfileManager realProfileManager = (RealProfileManager) provider.invoke();
                    activity.getClass();
                    androidBiometricsStore.getClass();
                    cashBiometricsInfo.getClass();
                    appService.getClass();
                    realProfileManager.getClass();
                    return new MarkwonConfiguration(activity, androidBiometricsStore, cashBiometricsInfo, appService, realProfileManager);
                case 3:
                    FeatureFlagManager featureFlagManager2 = (FeatureFlagManager) provider4.invoke();
                    RealClientSyncEntityDecryptor realClientSyncEntityDecryptor = (RealClientSyncEntityDecryptor) provider3.invoke();
                    SyncEntityStore syncEntityStore = (SyncEntityStore) provider2.invoke();
                    RealClientSyncErrorReporter realClientSyncErrorReporter = (RealClientSyncErrorReporter) provider.invoke();
                    CoroutineScope coroutineScope3 = (CoroutineScope) instanceFactory.value;
                    featureFlagManager2.getClass();
                    realClientSyncEntityDecryptor.getClass();
                    syncEntityStore.getClass();
                    realClientSyncErrorReporter.getClass();
                    coroutineScope3.getClass();
                    String str = ((FeatureFlag$StringFeatureFlag$Value) ((RealFeatureFlagManager) featureFlagManager2).peekCurrentValue(LaunchDarklyFeatureFlags$ClientsyncSyncValueReaderImpl.INSTANCE)).value;
                    if (Intrinsics.areEqual(str, "V1")) {
                        return new RealSyncValueReader(realClientSyncEntityDecryptor, syncEntityStore, realClientSyncErrorReporter, coroutineScope3);
                    }
                    if (Intrinsics.areEqual(str, "V2")) {
                        return new RealSyncValueReaderV2(realClientSyncEntityDecryptor, syncEntityStore, realClientSyncErrorReporter, coroutineScope3);
                    }
                    a$$ExternalSyntheticBUOutline0.m$3("Invalid LaunchDarklyFeatureFlags.ClientsyncSyncValueReaderImpl value");
                    return null;
                case 4:
                    RealEarningsSyncStateRepository realEarningsSyncStateRepository = (RealEarningsSyncStateRepository) provider4.invoke();
                    SyncValueReader syncValueReader = (SyncValueReader) provider3.invoke();
                    RealClientSyncer realClientSyncer = (RealClientSyncer) provider2.invoke();
                    CoroutineScope coroutineScope4 = (CoroutineScope) instanceFactory.value;
                    CoroutineContext coroutineContext3 = (CoroutineContext) provider.invoke();
                    realEarningsSyncStateRepository.getClass();
                    syncValueReader.getClass();
                    realClientSyncer.getClass();
                    coroutineScope4.getClass();
                    coroutineContext3.getClass();
                    return new RealEarnerAppletAvailabilityState(realEarningsSyncStateRepository, syncValueReader, realClientSyncer, coroutineScope4, coroutineContext3);
                case 5:
                    AppService appService2 = (AppService) provider4.invoke();
                    CoroutineContext coroutineContext4 = (CoroutineContext) provider3.invoke();
                    AndroidClock androidClock2 = (AndroidClock) provider2.invoke();
                    CashAccountDatabaseImpl cashAccountDatabaseImpl2 = (CashAccountDatabaseImpl) provider.invoke();
                    CoroutineScope coroutineScope5 = (CoroutineScope) instanceFactory.value;
                    appService2.getClass();
                    coroutineContext4.getClass();
                    androidClock2.getClass();
                    cashAccountDatabaseImpl2.getClass();
                    coroutineScope5.getClass();
                    return new RealExchangeDataSyncerFactory(appService2, coroutineContext4, androidClock2, cashAccountDatabaseImpl2, coroutineScope5);
                case 6:
                    AppService appService3 = (AppService) provider4.invoke();
                    RealJurisdictionConfigManager realJurisdictionConfigManager = (RealJurisdictionConfigManager) provider3.invoke();
                    AndroidClock androidClock3 = (AndroidClock) provider2.invoke();
                    CoroutineContext coroutineContext5 = (CoroutineContext) provider.invoke();
                    CoroutineScope coroutineScope6 = (CoroutineScope) instanceFactory.value;
                    appService3.getClass();
                    realJurisdictionConfigManager.getClass();
                    androidClock3.getClass();
                    coroutineContext5.getClass();
                    coroutineScope6.getClass();
                    Reward$Adapter reward$Adapter = new Reward$Adapter();
                    reward$Adapter.avatarsAdapter = appService3;
                    reward$Adapter.reward_selection_stateAdapter = realJurisdictionConfigManager;
                    reward$Adapter.boost_detail_bottom_upsellAdapter = androidClock3;
                    reward$Adapter.app_linksAdapter = coroutineContext5;
                    reward$Adapter.program_detail_rowsAdapter = coroutineScope6;
                    reward$Adapter.boost_detail_rowsAdapter = FlowKt.MutableStateFlow(NetworkStatus.Available.INSTANCE);
                    reward$Adapter.boost_attributesAdapter = new LinkedHashMap();
                    return reward$Adapter;
                case 7:
                    provider4.getClass();
                    DoubleCheck doubleCheck = provider4 instanceof Lazy ? (Lazy) provider4 : new DoubleCheck(provider4);
                    RealLocaleManager realLocaleManager = (RealLocaleManager) provider3.invoke();
                    KeyValue keyValue = (KeyValue) provider2.invoke();
                    CoroutineScope coroutineScope7 = (CoroutineScope) instanceFactory.value;
                    CoroutineContext coroutineContext6 = (CoroutineContext) provider.invoke();
                    realLocaleManager.getClass();
                    keyValue.getClass();
                    coroutineScope7.getClass();
                    coroutineContext6.getClass();
                    return new ClientSyncLocaleChangeIoSetupTeardown(doubleCheck, realLocaleManager, keyValue, coroutineScope7, coroutineContext6);
                case 8:
                    ClientTrustSignalsService clientTrustSignalsService = (ClientTrustSignalsService) provider4.invoke();
                    FeatureFlagManager featureFlagManager3 = (FeatureFlagManager) provider3.invoke();
                    RealMRIFactory realMRIFactory = (RealMRIFactory) provider2.invoke();
                    RealScreenRecordingDetector realScreenRecordingDetector = (RealScreenRecordingDetector) instanceFactory.value;
                    RealThreeDsWarningsRepository realThreeDsWarningsRepository = (RealThreeDsWarningsRepository) provider.invoke();
                    clientTrustSignalsService.getClass();
                    featureFlagManager3.getClass();
                    realMRIFactory.getClass();
                    realScreenRecordingDetector.getClass();
                    realThreeDsWarningsRepository.getClass();
                    return new RealSignatureManager(clientTrustSignalsService, featureFlagManager3, realMRIFactory, realScreenRecordingDetector, realThreeDsWarningsRepository);
                case 9:
                    Analytics analytics = (Analytics) provider4.invoke();
                    BugsnagClient bugsnagClient2 = (BugsnagClient) provider3.invoke();
                    provider2.getClass();
                    DoubleCheck doubleCheck2 = provider2 instanceof Lazy ? (Lazy) provider2 : new DoubleCheck(provider2);
                    SessionManager sessionManager = (SessionManager) provider.invoke();
                    StorageLink storageLink = (StorageLink) instanceFactory.value;
                    analytics.getClass();
                    bugsnagClient2.getClass();
                    sessionManager.getClass();
                    storageLink.getClass();
                    return new BugsnagClientSandboxSetupTeardown(analytics, bugsnagClient2, doubleCheck2, sessionManager, storageLink);
                case 10:
                    SharedPreferences sharedPreferences = (SharedPreferences) provider4.invoke();
                    RealUuidGenerator realUuidGenerator = (RealUuidGenerator) provider3.invoke();
                    RealFlowTokenGenerator realFlowTokenGenerator = (RealFlowTokenGenerator) provider2.invoke();
                    RealBoostRepository realBoostRepository = (RealBoostRepository) provider.invoke();
                    CoroutineScope coroutineScope8 = (CoroutineScope) instanceFactory.value;
                    sharedPreferences.getClass();
                    realUuidGenerator.getClass();
                    realFlowTokenGenerator.getClass();
                    realBoostRepository.getClass();
                    coroutineScope8.getClass();
                    return new RealOffersAnalyticsHelper(sharedPreferences, realUuidGenerator, realFlowTokenGenerator, realBoostRepository, coroutineScope8);
                case 11:
                    RealOffersTabRepository realOffersTabRepository = (RealOffersTabRepository) provider4.invoke();
                    RealOffersSheetRepository realOffersSheetRepository = (RealOffersSheetRepository) provider3.invoke();
                    CoroutineContext coroutineContext7 = (CoroutineContext) provider2.invoke();
                    CoroutineContext coroutineContext8 = (CoroutineContext) provider.invoke();
                    CoroutineScope coroutineScope9 = (CoroutineScope) instanceFactory.value;
                    realOffersTabRepository.getClass();
                    realOffersSheetRepository.getClass();
                    coroutineContext7.getClass();
                    coroutineContext8.getClass();
                    coroutineScope9.getClass();
                    return new RealOffersTabRefresher(realOffersTabRepository, realOffersSheetRepository, coroutineContext7, coroutineContext8, coroutineScope9);
                case 12:
                    CashAccountDatabaseImpl cashAccountDatabaseImpl3 = (CashAccountDatabaseImpl) provider4.invoke();
                    OfflineManager offlineManager = (OfflineManager) provider3.invoke();
                    CoroutineContext coroutineContext9 = (CoroutineContext) provider2.invoke();
                    Moshi moshi = (Moshi) provider.invoke();
                    CoroutineScope coroutineScope10 = (CoroutineScope) instanceFactory.value;
                    cashAccountDatabaseImpl3.getClass();
                    offlineManager.getClass();
                    coroutineContext9.getClass();
                    moshi.getClass();
                    coroutineScope10.getClass();
                    return new RealRawOfflineActivityService(cashAccountDatabaseImpl3, offlineManager, coroutineContext9, moshi, coroutineScope10);
                case 13:
                    AndroidClock androidClock4 = (AndroidClock) provider4.invoke();
                    AppConfigManager appConfigManager = (AppConfigManager) provider3.invoke();
                    List list = (List) provider2.invoke();
                    CoroutineContext coroutineContext10 = (CoroutineContext) provider.invoke();
                    CoroutineScope coroutineScope11 = (CoroutineScope) instanceFactory.value;
                    androidClock4.getClass();
                    appConfigManager.getClass();
                    list.getClass();
                    coroutineContext10.getClass();
                    coroutineScope11.getClass();
                    return new RealUrlAuthenticator(androidClock4, appConfigManager, list, coroutineContext10, coroutineScope11);
                case 14:
                    CashAccountDatabaseImpl cashAccountDatabaseImpl4 = (CashAccountDatabaseImpl) provider4.invoke();
                    AndroidClock androidClock5 = (AndroidClock) provider3.invoke();
                    CashStorefrontsClientService cashStorefrontsClientService = (CashStorefrontsClientService) provider2.invoke();
                    CoroutineContext coroutineContext11 = (CoroutineContext) provider.invoke();
                    CoroutineScope coroutineScope12 = (CoroutineScope) instanceFactory.value;
                    cashAccountDatabaseImpl4.getClass();
                    androidClock5.getClass();
                    cashStorefrontsClientService.getClass();
                    coroutineContext11.getClass();
                    coroutineScope12.getClass();
                    return new RealRecentSearchManager(cashAccountDatabaseImpl4, androidClock5, cashStorefrontsClientService, coroutineContext11, coroutineScope12);
                case 15:
                    RealChatNotificationSuppressor realChatNotificationSuppressor = (RealChatNotificationSuppressor) provider4.invoke();
                    Analytics analytics2 = (Analytics) provider3.invoke();
                    RealArticlesService realArticlesService = (RealArticlesService) provider2.invoke();
                    RealSupportStatus realSupportStatus = (RealSupportStatus) provider.invoke();
                    CoroutineScope coroutineScope13 = (CoroutineScope) instanceFactory.value;
                    realChatNotificationSuppressor.getClass();
                    analytics2.getClass();
                    realArticlesService.getClass();
                    realSupportStatus.getClass();
                    coroutineScope13.getClass();
                    return new Retrofit.Builder(realChatNotificationSuppressor, analytics2, realArticlesService, realSupportStatus, coroutineScope13);
                default:
                    Context context2 = (Context) instanceFactory.value;
                    AndroidDeviceInfoProvider androidDeviceInfoProvider = (AndroidDeviceInfoProvider) provider4.invoke();
                    AndroidOperatingSystemInfoProvider androidOperatingSystemInfoProvider = (AndroidOperatingSystemInfoProvider) provider3.invoke();
                    AndroidSessionIdProvider androidSessionIdProvider = (AndroidSessionIdProvider) provider2.invoke();
                    SessionManager sessionManager2 = (SessionManager) provider.invoke();
                    context2.getClass();
                    androidDeviceInfoProvider.getClass();
                    androidOperatingSystemInfoProvider.getClass();
                    androidSessionIdProvider.getClass();
                    sessionManager2.getClass();
                    RoomDatabase$closeBarrier$1 roomDatabase$closeBarrier$1 = new RoomDatabase$closeBarrier$1(0, androidDeviceInfoProvider, AndroidDeviceInfoProvider.class, "getDeviceInfo", "getDeviceInfo()Lapp/cash/cdp/api/providers/DeviceInfo;", 0, 9);
                    AppUpdateDetector$$ExternalSyntheticLambda0 appUpdateDetector$$ExternalSyntheticLambda0 = new AppUpdateDetector$$ExternalSyntheticLambda0(androidSessionIdProvider, 7);
                    RoomDatabase$closeBarrier$1 roomDatabase$closeBarrier$12 = new RoomDatabase$closeBarrier$1(0, androidOperatingSystemInfoProvider, AndroidOperatingSystemInfoProvider.class, "getOperatingSystemInfo", "getOperatingSystemInfo()Lapp/cash/cdp/api/providers/OperatingSystemInfo;", 0, 10);
                    RoomDatabase$closeBarrier$1 roomDatabase$closeBarrier$13 = new RoomDatabase$closeBarrier$1(0, new CashApplicationInfoProvider(context2), CashApplicationInfoProvider.class, "getApplicationInfo", "getApplicationInfo()Lapp/cash/cdp/api/providers/ApplicationInfo;", 0, 11);
                    int i2 = UserJourneysAppModule$Companion$provideJourneyReporterContext$5.$r8$clinit;
                    return new RealJourneyRequestContextProvider(roomDatabase$closeBarrier$1, appUpdateDetector$$ExternalSyntheticLambda0, roomDatabase$closeBarrier$12, roomDatabase$closeBarrier$13, sessionManager2);
            }
        }

        public /* synthetic */ MetroFactory(Provider provider, Provider provider2, Provider provider3, InstanceFactory instanceFactory, Provider provider4, int i) {
            this.$r8$classId = i;
            this.context = provider;
            this.bugsnagClient = provider2;
            this.featureFlagManager = provider3;
            this.scope = instanceFactory;
            this.ioDispatcher = provider4;
        }

        public /* synthetic */ MetroFactory(InstanceFactory instanceFactory, Factory factory, Factory factory2, DoubleCheck doubleCheck, Provider provider, int i) {
            this.$r8$classId = i;
            this.scope = instanceFactory;
            this.context = factory;
            this.bugsnagClient = factory2;
            this.featureFlagManager = doubleCheck;
            this.ioDispatcher = provider;
        }
    }
}
