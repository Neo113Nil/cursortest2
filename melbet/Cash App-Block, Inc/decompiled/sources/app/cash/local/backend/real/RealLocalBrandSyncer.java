package app.cash.local.backend.real;

import android.content.Context;
import android.os.Looper;
import androidx.camera.camera2.impl.FlashControl$applyScreenFlash$2;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.api.ApiResult;
import app.cash.local.backend.BuyerIntentManager;
import app.cash.local.backend.BuyerIntentManagerKt;
import app.cash.local.backend.BuyerIntentScope;
import app.cash.local.backend.BuyerIntentState;
import app.cash.local.backend.BuyerIntentType;
import app.cash.local.backend.LocalBrandSyncer$SyncResult;
import app.cash.local.backend.real.RealLocalBrandSyncerKt;
import app.cash.local.navigation.LocalInstalledStore;
import app.cash.local.primitives.BrandSpot;
import app.cash.local.primitives.BrandSpotSyncTokens;
import app.cash.local.primitives.BrandToken;
import app.cash.local.primitives.EstimatedCompletionDurationKt;
import app.cash.local.primitives.FulfillmentConfiguration;
import app.cash.local.primitives.FulfillmentConfigurationKt;
import app.cash.local.primitives.LocationStatus$Closed;
import app.cash.local.primitives.LocationStatus$Open24Hours;
import app.cash.local.primitives.LocationStatus$Unspecified;
import app.cash.local.primitives.LocationStatusKt$WhenMappings;
import app.cash.local.primitives.LocationToken;
import app.cash.local.service.LocalService;
import app.cash.local.store.real.RealLocalInstalledStore;
import app.cash.local.store.real.RealLocalInstalledStore$hideBrands$$inlined$map$1;
import app.cash.redwood.treehouse.EventBridge$sendEvent$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.DimensionKt;
import com.google.android.gms.internal.mlkit_vision_common.zzhx;
import com.google.android.gms.internal.mlkit_vision_common.zzhz;
import com.squareup.cash.cdf.localclient.ErrorType;
import com.squareup.cash.cdf.localclient.LocalClientGetBrandCollectionFailed;
import com.squareup.cash.cdf.localclient.LocalClientGetNeighborhoodsTabContentFailed;
import com.squareup.cash.data.profile.RealProfileSyncer;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlag$JsonFeatureFlag;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.JsonFeatureFlags$MobileObservabilityConfig;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$EnableMobileObservabilityAndroid;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$LocalBuyerInfoSync;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$LocalBuyerIntentAndroidEnabled;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.api.CommonInterceptor;
import com.squareup.cash.observability.backend.real.network.RealDatadogObservabilityInterceptor;
import com.squareup.cash.observability.backend.real.network.RealMobileObservabilityEventListener;
import com.squareup.cash.observability.backend.real.network.RealNetworkTracingObservabilityInterceptor;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.session.backend.TimeToLiveSyncState;
import com.squareup.cash.storage.RealStorage;
import com.squareup.cash.storage.Storage;
import com.squareup.cash.userjourneys.tracker.UserJourneyInterceptor;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.common.truststore.SquareSSLSocketFactory;
import com.squareup.common.truststore.SquareTruststore;
import com.squareup.protos.cash.local.client.app.v1.GetLocalCashDetailRequest;
import com.squareup.protos.cash.local.client.app.v1.GetLocalCashDetailResponse;
import com.squareup.protos.cash.local.client.app.v1.GetMarketScreenDataRequest;
import com.squareup.protos.cash.local.client.app.v1.GetMarketScreenDataResponse;
import com.squareup.protos.cash.local.client.app.v1.MarketTilesScreen;
import com.squareup.protos.cash.local.client.v1.BatchGetLocationStatusRequest;
import com.squareup.protos.cash.local.client.v1.BatchGetLocationStatusResponse;
import com.squareup.protos.cash.local.client.v1.Feature;
import com.squareup.protos.cash.local.client.v1.FeatureSet;
import com.squareup.protos.cash.local.client.v1.GetBrandCollectionRequest;
import com.squareup.protos.cash.local.client.v1.GetBrandCollectionResponse;
import com.squareup.protos.cash.local.client.v1.GetBrandProfileRequest;
import com.squareup.protos.cash.local.client.v1.GetBrandProfileResponse;
import com.squareup.protos.cash.local.client.v1.GetBrandProfileResponse$Response$Brand;
import com.squareup.protos.cash.local.client.v1.GetBrandProfileResponse$Response$ErrorResponse;
import com.squareup.protos.cash.local.client.v1.GetBrandProfileResponse$Response$RedirectToWeb;
import com.squareup.protos.cash.local.client.v1.GetBuyerInfoRequest;
import com.squareup.protos.cash.local.client.v1.GetBuyerInfoResponse;
import com.squareup.protos.cash.local.client.v1.GetBuyerInfoResponse$Response$BuyerInfo;
import com.squareup.protos.cash.local.client.v1.GetBuyerInfoResponse$Response$ErrorResponse;
import com.squareup.protos.cash.local.client.v1.GetNeighborhoodsTabContentRequest;
import com.squareup.protos.cash.local.client.v1.GetNeighborhoodsTabContentResponse;
import com.squareup.protos.cash.local.client.v1.LocalBrand;
import com.squareup.protos.cash.local.client.v1.LocalEstimatedCompletionDuration;
import com.squareup.protos.cash.local.client.v1.LocalFulfillment;
import com.squareup.protos.cash.local.client.v1.LocalFulfillmentType;
import com.squareup.protos.cash.local.client.v1.LocalLocationDetail;
import com.squareup.protos.cash.local.client.v1.LocalLocationSummary;
import com.squareup.protos.cash.local.client.v1.LocalOpenHours;
import com.squareup.protos.cash.local.client.v1.LocalOpenStatus;
import com.squareup.protos.cash.local.client.v1.LocalUserIntent;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import java.time.Instant;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.X509TrustManager;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.sync.Mutex;
import net.idrnd.face.iad.capture.internal.d4$$ExternalSyntheticLambda0;
import okhttp3.Cache;
import okhttp3.EventListener;
import okhttp3.OkHttpClient;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.cache.CacheInterceptor;
import okio.ByteString;
import okio.Path;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes3.dex */
public final class RealLocalBrandSyncer {
    public final Analytics analytics;
    public final BuyerIntentManager buyerIntentManager;
    public final AndroidClock clock;
    public final FeatureFlagManager featureFlagManager;
    public final LocalInMemoryDatabase localInMemoryDatabase;
    public final LocalService service;
    public final SessionManager sessionManager;
    public final LocalInstalledStore store;
    public final ConcurrentHashMap cachedBrandProfileResponses = new ConcurrentHashMap();
    public final ConcurrentHashMap brandProfileSyncStates = new ConcurrentHashMap();
    public final ConcurrentHashMap brandProfileSyncMutexes = new ConcurrentHashMap();

    public final class BrandProfileSyncRequestState {
        public final boolean buyerIntentAndroidEnabled;
        public final LocalFulfillmentType effectiveFulfillmentType;
        public final BrandSpotSyncTokens effectiveSyncTokens;
        public final LocalFulfillmentType fallbackUserIntentFulfillmentType;
        public final LocalFulfillmentType normalizedFulfillmentType;
        public final boolean preserveInStoreOrderingToken;
        public final String resolvedUserIntentLinkContext;

        public BrandProfileSyncRequestState(boolean z, LocalFulfillmentType localFulfillmentType, LocalFulfillmentType localFulfillmentType2, boolean z2, String str, BrandSpotSyncTokens brandSpotSyncTokens, LocalFulfillmentType localFulfillmentType3) {
            localFulfillmentType2.getClass();
            brandSpotSyncTokens.getClass();
            this.buyerIntentAndroidEnabled = z;
            this.normalizedFulfillmentType = localFulfillmentType;
            this.fallbackUserIntentFulfillmentType = localFulfillmentType2;
            this.preserveInStoreOrderingToken = z2;
            this.resolvedUserIntentLinkContext = str;
            this.effectiveSyncTokens = brandSpotSyncTokens;
            this.effectiveFulfillmentType = localFulfillmentType3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BrandProfileSyncRequestState)) {
                return false;
            }
            BrandProfileSyncRequestState brandProfileSyncRequestState = (BrandProfileSyncRequestState) obj;
            return this.buyerIntentAndroidEnabled == brandProfileSyncRequestState.buyerIntentAndroidEnabled && this.normalizedFulfillmentType == brandProfileSyncRequestState.normalizedFulfillmentType && this.fallbackUserIntentFulfillmentType == brandProfileSyncRequestState.fallbackUserIntentFulfillmentType && this.preserveInStoreOrderingToken == brandProfileSyncRequestState.preserveInStoreOrderingToken && Intrinsics.areEqual(this.resolvedUserIntentLinkContext, brandProfileSyncRequestState.resolvedUserIntentLinkContext) && Intrinsics.areEqual(this.effectiveSyncTokens, brandProfileSyncRequestState.effectiveSyncTokens) && this.effectiveFulfillmentType == brandProfileSyncRequestState.effectiveFulfillmentType;
        }

        public final int hashCode() {
            int hashCode = Boolean.hashCode(this.buyerIntentAndroidEnabled) * 31;
            LocalFulfillmentType localFulfillmentType = this.normalizedFulfillmentType;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.fallbackUserIntentFulfillmentType.hashCode() + ((hashCode + (localFulfillmentType == null ? 0 : localFulfillmentType.hashCode())) * 31)) * 31, 31, this.preserveInStoreOrderingToken);
            String str = this.resolvedUserIntentLinkContext;
            int hashCode2 = (this.effectiveSyncTokens.hashCode() + ((m + (str == null ? 0 : str.hashCode())) * 31)) * 31;
            LocalFulfillmentType localFulfillmentType2 = this.effectiveFulfillmentType;
            return hashCode2 + (localFulfillmentType2 != null ? localFulfillmentType2.hashCode() : 0);
        }

        public final String toString() {
            return "BrandProfileSyncRequestState(buyerIntentAndroidEnabled=" + this.buyerIntentAndroidEnabled + ", normalizedFulfillmentType=" + this.normalizedFulfillmentType + ", fallbackUserIntentFulfillmentType=" + this.fallbackUserIntentFulfillmentType + ", preserveInStoreOrderingToken=" + this.preserveInStoreOrderingToken + ", resolvedUserIntentLinkContext=" + this.resolvedUserIntentLinkContext + ", effectiveSyncTokens=" + this.effectiveSyncTokens + ", effectiveFulfillmentType=" + this.effectiveFulfillmentType + ")";
        }
    }

    public final class BrandProfileSyncState {
        public boolean userIntentDisabled;
        public String userIntentLinkContext;
        public boolean userIntentLinkContextConsumed;
        public LocalFulfillmentType userIntentLinkContextFallbackFulfillmentType;

        public BrandProfileSyncState() {
        }

        public final void update(BrandSpot brandSpot, BrandSpot brandSpot2, LocalBrand localBrand, String str, LocalFulfillmentType localFulfillmentType, boolean z) {
            String access$userIntentFallbackLinkContext;
            ConcurrentHashMap concurrentHashMap = RealLocalBrandSyncer.this.brandProfileSyncStates;
            brandSpot.getClass();
            brandSpot2.getClass();
            localFulfillmentType.getClass();
            String str2 = null;
            if (!RealLocalBrandSyncerKt.access$userIntentEnabled(localBrand)) {
                this.userIntentLinkContext = null;
                this.userIntentLinkContextFallbackFulfillmentType = null;
                this.userIntentLinkContextConsumed = false;
                this.userIntentDisabled = true;
                concurrentHashMap.put(brandSpot, this);
                concurrentHashMap.put(brandSpot2, this);
                return;
            }
            this.userIntentDisabled = false;
            String str3 = this.userIntentLinkContext;
            if (str != null) {
                this.userIntentLinkContext = str;
                if (!str.equals(RealLocalBrandSyncerKt.access$userIntentFallbackLinkContext(brandSpot, localFulfillmentType)) && !str.equals(RealLocalBrandSyncerKt.access$userIntentFallbackLinkContext(brandSpot2, localFulfillmentType))) {
                    localFulfillmentType = null;
                }
                this.userIntentLinkContextFallbackFulfillmentType = localFulfillmentType;
                if (localFulfillmentType != null && !Intrinsics.areEqual(str3, str)) {
                    this.userIntentLinkContextConsumed = false;
                }
            } else if (str3 == null) {
                String access$userIntentFallbackLinkContext2 = RealLocalBrandSyncerKt.access$userIntentFallbackLinkContext(brandSpot2, localFulfillmentType);
                if (access$userIntentFallbackLinkContext2 != null) {
                    this.userIntentLinkContext = access$userIntentFallbackLinkContext2;
                    this.userIntentLinkContextFallbackFulfillmentType = localFulfillmentType;
                    str2 = access$userIntentFallbackLinkContext2;
                }
                if (str2 == null && (access$userIntentFallbackLinkContext = RealLocalBrandSyncerKt.access$userIntentFallbackLinkContext(brandSpot, localFulfillmentType)) != null) {
                    this.userIntentLinkContext = access$userIntentFallbackLinkContext;
                    this.userIntentLinkContextFallbackFulfillmentType = localFulfillmentType;
                }
            }
            if (z) {
                this.userIntentLinkContextConsumed = true;
            }
            concurrentHashMap.put(brandSpot, this);
            concurrentHashMap.put(brandSpot2, this);
        }
    }

    public final class CachedBrandResponseData {
        public final LocalFulfillmentType fulfillmentType;
        public final GetBrandProfileResponse response;
        public final BrandSpotSyncTokens syncTokens;
        public final String userIntentLinkContext;

        public CachedBrandResponseData(GetBrandProfileResponse getBrandProfileResponse, BrandSpotSyncTokens brandSpotSyncTokens, LocalFulfillmentType localFulfillmentType, String str) {
            getBrandProfileResponse.getClass();
            brandSpotSyncTokens.getClass();
            this.response = getBrandProfileResponse;
            this.syncTokens = brandSpotSyncTokens;
            this.fulfillmentType = localFulfillmentType;
            this.userIntentLinkContext = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CachedBrandResponseData)) {
                return false;
            }
            CachedBrandResponseData cachedBrandResponseData = (CachedBrandResponseData) obj;
            return Intrinsics.areEqual(this.response, cachedBrandResponseData.response) && Intrinsics.areEqual(this.syncTokens, cachedBrandResponseData.syncTokens) && this.fulfillmentType == cachedBrandResponseData.fulfillmentType && Intrinsics.areEqual(this.userIntentLinkContext, cachedBrandResponseData.userIntentLinkContext);
        }

        public final int hashCode() {
            int hashCode = (this.syncTokens.hashCode() + (this.response.hashCode() * 31)) * 31;
            LocalFulfillmentType localFulfillmentType = this.fulfillmentType;
            int hashCode2 = (hashCode + (localFulfillmentType == null ? 0 : localFulfillmentType.hashCode())) * 31;
            String str = this.userIntentLinkContext;
            return hashCode2 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            return "CachedBrandResponseData(response=" + this.response + ", syncTokens=" + this.syncTokens + ", fulfillmentType=" + this.fulfillmentType + ", userIntentLinkContext=" + this.userIntentLinkContext + ")";
        }
    }

    /* loaded from: classes.dex */
    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId;
        public final Provider analytics;
        public final Provider buyerIntentManager;
        public final Provider clock;
        public final Provider featureFlagManager;
        public final Provider localInMemoryDatabase;
        public final Provider service;
        public final Provider sessionManager;
        public final Provider store;

        public /* synthetic */ MetroFactory(DoubleCheck doubleCheck, Provider provider, DoubleCheck doubleCheck2, Provider provider2, DoubleCheck doubleCheck3, Provider provider3, Provider provider4, Provider provider5, int i) {
            this.$r8$classId = i;
            this.service = doubleCheck;
            this.store = provider;
            this.localInMemoryDatabase = doubleCheck2;
            this.clock = provider2;
            this.featureFlagManager = doubleCheck3;
            this.analytics = provider3;
            this.sessionManager = provider4;
            this.buyerIntentManager = provider5;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v1, types: [kotlin.Lazy] */
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = this.$r8$classId;
            Provider provider = this.buyerIntentManager;
            Provider provider2 = this.sessionManager;
            Provider provider3 = this.analytics;
            Provider provider4 = this.featureFlagManager;
            Provider provider5 = this.clock;
            Provider provider6 = this.localInMemoryDatabase;
            Provider provider7 = this.store;
            Provider provider8 = this.service;
            switch (i) {
                case 0:
                    LocalService localService = (LocalService) provider8.invoke();
                    LocalInstalledStore localInstalledStore = (LocalInstalledStore) provider7.invoke();
                    LocalInMemoryDatabase localInMemoryDatabase = (LocalInMemoryDatabase) provider6.invoke();
                    AndroidClock androidClock = (AndroidClock) provider5.invoke();
                    FeatureFlagManager featureFlagManager = (FeatureFlagManager) provider4.invoke();
                    Analytics analytics = (Analytics) provider3.invoke();
                    SessionManager sessionManager = (SessionManager) provider2.invoke();
                    BuyerIntentManager buyerIntentManager = (BuyerIntentManager) provider.invoke();
                    localService.getClass();
                    localInstalledStore.getClass();
                    localInMemoryDatabase.getClass();
                    androidClock.getClass();
                    featureFlagManager.getClass();
                    analytics.getClass();
                    sessionManager.getClass();
                    buyerIntentManager.getClass();
                    return new RealLocalBrandSyncer(localService, localInstalledStore, localInMemoryDatabase, androidClock, featureFlagManager, analytics, sessionManager, buyerIntentManager);
                case 1:
                    TimeToLiveSyncState timeToLiveSyncState = (TimeToLiveSyncState) provider8.invoke();
                    AppService appService = (AppService) provider7.invoke();
                    AtomicInteger atomicInteger = (AtomicInteger) provider6.invoke();
                    provider5.getClass();
                    DoubleCheck doubleCheck = provider5 instanceof Lazy ? (Lazy) provider5 : new DoubleCheck(provider5);
                    CashAccountDatabaseImpl cashAccountDatabaseImpl = (CashAccountDatabaseImpl) provider4.invoke();
                    SessionManager sessionManager2 = (SessionManager) provider3.invoke();
                    FeatureFlagManager featureFlagManager2 = (FeatureFlagManager) provider2.invoke();
                    CoroutineContext coroutineContext = (CoroutineContext) provider.invoke();
                    timeToLiveSyncState.getClass();
                    appService.getClass();
                    atomicInteger.getClass();
                    cashAccountDatabaseImpl.getClass();
                    sessionManager2.getClass();
                    featureFlagManager2.getClass();
                    coroutineContext.getClass();
                    return new RealProfileSyncer(timeToLiveSyncState, appService, atomicInteger, doubleCheck, cashAccountDatabaseImpl, sessionManager2, featureFlagManager2, coroutineContext);
                default:
                    Context context = (Context) provider8.invoke();
                    CommonInterceptor commonInterceptor = (CommonInterceptor) provider7.invoke();
                    CompletableDeferred completableDeferred = (CompletableDeferred) provider6.invoke();
                    Storage storage = (Storage) provider5.invoke();
                    RealDatadogObservabilityInterceptor realDatadogObservabilityInterceptor = (RealDatadogObservabilityInterceptor) provider4.invoke();
                    RealNetworkTracingObservabilityInterceptor realNetworkTracingObservabilityInterceptor = (RealNetworkTracingObservabilityInterceptor) provider3.invoke();
                    UserJourneyInterceptor userJourneyInterceptor = (UserJourneyInterceptor) provider2.invoke();
                    RealMobileObservabilityEventListener realMobileObservabilityEventListener = (RealMobileObservabilityEventListener) provider.invoke();
                    context.getClass();
                    commonInterceptor.getClass();
                    completableDeferred.getClass();
                    storage.getClass();
                    realDatadogObservabilityInterceptor.getClass();
                    realNetworkTracingObservabilityInterceptor.getClass();
                    userJourneyInterceptor.getClass();
                    realMobileObservabilityEventListener.getClass();
                    completableDeferred.complete(Unit.INSTANCE);
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        a$$ExternalSyntheticBUOutline0.m$1("OkHttpClient initialized on main thread.");
                        return null;
                    }
                    String str = Path.DIRECTORY_SEPARATOR;
                    Cache cache = new Cache(((RealStorage) storage).cache, Path.Companion.get("/http", false), Strings.DISK_CACHE_SIZE);
                    OkHttpClient.Builder builder = new OkHttpClient.Builder();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    timeUnit.getClass();
                    builder.connectTimeout = _UtilJvmKt.checkDuration("timeout", 15L, timeUnit);
                    builder.readTimeout(15L, timeUnit);
                    builder.writeTimeout = _UtilJvmKt.checkDuration("timeout", 15L, timeUnit);
                    builder.cache = cache;
                    SquareTruststore create = SquareTruststore.create(context);
                    SquareSSLSocketFactory squareSSLSocketFactory = create.sslSocketFactory;
                    X509TrustManager x509TrustManager = create.trustManager;
                    x509TrustManager.getClass();
                    builder.sslSocketFactory(squareSSLSocketFactory, x509TrustManager);
                    ArrayList arrayList = builder.interceptors;
                    arrayList.add(realDatadogObservabilityInterceptor);
                    builder.networkInterceptors.add(realNetworkTracingObservabilityInterceptor);
                    RealFeatureFlagManager realFeatureFlagManager = (RealFeatureFlagManager) realMobileObservabilityEventListener.featureFlagManager;
                    EventListener.Factory factory = (!((FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options) realFeatureFlagManager.peekCurrentValue(LaunchDarklyFeatureFlags$EnableMobileObservabilityAndroid.INSTANCE)).enabled() || ((JsonFeatureFlags$MobileObservabilityConfig.Config) ((FeatureFlag$JsonFeatureFlag.Options) realFeatureFlagManager.peekCurrentValue(JsonFeatureFlags$MobileObservabilityConfig.INSTANCE)).value).datadogTracerSampleRateAndroid <= 0) ? realMobileObservabilityEventListener.noOpEventListenerFactory : (EventListener.Factory) realMobileObservabilityEventListener.datadogEventListenerFactory.getValue();
                    factory.getClass();
                    builder.eventListenerFactory = factory;
                    arrayList.add(new CacheInterceptor(2));
                    arrayList.add(new CacheInterceptor(1));
                    arrayList.add(commonInterceptor);
                    arrayList.add(userJourneyInterceptor);
                    return new OkHttpClient(builder);
            }
        }
    }

    public RealLocalBrandSyncer(LocalService localService, LocalInstalledStore localInstalledStore, LocalInMemoryDatabase localInMemoryDatabase, AndroidClock androidClock, FeatureFlagManager featureFlagManager, Analytics analytics, SessionManager sessionManager, BuyerIntentManager buyerIntentManager) {
        this.service = localService;
        this.store = localInstalledStore;
        this.localInMemoryDatabase = localInMemoryDatabase;
        this.clock = androidClock;
        this.featureFlagManager = featureFlagManager;
        this.analytics = analytics;
        this.sessionManager = sessionManager;
        this.buyerIntentManager = buyerIntentManager;
    }

    public static BrandSpot confirmedBrandSpot(LocalBrand localBrand) {
        String str;
        LocalLocationSummary localLocationSummary;
        String str2 = localBrand.token;
        str2.getClass();
        LocalLocationDetail localLocationDetail = localBrand.selected_location;
        if (localLocationDetail == null || (localLocationSummary = localLocationDetail.summary) == null || (str = localLocationSummary.token) == null) {
            str = null;
        }
        return new BrandSpot(str2, str);
    }

    public static /* synthetic */ Object syncBrandSpot$default(RealLocalBrandSyncer realLocalBrandSyncer, BrandSpot brandSpot, String str, BrandSpotSyncTokens brandSpotSyncTokens, LocalFulfillmentType localFulfillmentType, SuspendLambda suspendLambda, int i) {
        if ((i & 4) != 0) {
            String str2 = null;
            brandSpotSyncTokens = new BrandSpotSyncTokens(str2, str2, 7);
        }
        BrandSpotSyncTokens brandSpotSyncTokens2 = brandSpotSyncTokens;
        if ((i & 8) != 0) {
            localFulfillmentType = LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_UNSPECIFIED;
        }
        return realLocalBrandSyncer.syncBrandSpot(brandSpot, str, brandSpotSyncTokens2, localFulfillmentType, null, suspendLambda);
    }

    public final void consumeBrandProfileUserIntent(BrandSpot brandSpot, LocalBrand localBrand, BrandSpotSyncTokens brandSpotSyncTokens, LocalFulfillmentType localFulfillmentType, LocalUserIntent localUserIntent) {
        FulfillmentConfiguration delivery;
        Map<String, Feature> map;
        Feature feature;
        BrandSpot confirmedBrandSpot = confirmedBrandSpot(localBrand);
        BuyerIntentManager buyerIntentManager = this.buyerIntentManager;
        String str = brandSpotSyncTokens.inStoreOrderingToken;
        BuyerIntentState buyerIntentState = null;
        BuyerIntentScope buyerIntentScope = (str == null || StringsKt.isBlank(str)) ? new BuyerIntentScope(confirmedBrandSpot, BuyerIntentType.REMOTE_ORDERING, null) : new BuyerIntentScope(confirmedBrandSpot, BuyerIntentType.IN_STORE_ORDERING, str);
        String str2 = brandSpotSyncTokens.inStoreOrderingToken;
        String str3 = confirmedBrandSpot.locationToken;
        if (str3 == null) {
            delivery = null;
        } else if (str2 == null || StringsKt.isBlank(str2)) {
            int i = RealLocalBrandSyncerKt.WhenMappings.$EnumSwitchMapping$0[(localFulfillmentType == null ? RealLocalBrandSyncerKt.defaultRemoteOrderingFulfillmentType(localBrand) : localFulfillmentType).ordinal()];
            if (i == 1) {
                delivery = new FulfillmentConfiguration.Delivery(str3, null, null, null, null, null);
            } else if (i != 2) {
                delivery = FulfillmentConfiguration.Unspecified.INSTANCE;
            } else {
                LocalEstimatedCompletionDuration localEstimatedCompletionDuration = localBrand.estimated_pickup_wait_time;
                delivery = new FulfillmentConfiguration.Pickup(str3, localEstimatedCompletionDuration != null ? EstimatedCompletionDurationKt.toEstimatedCompletionDuration(localEstimatedCompletionDuration) : null, 10);
            }
        } else {
            delivery = FulfillmentConfigurationKt.inStoreFulfillmentConfiguration(localBrand, str2);
            if (delivery == null) {
                delivery = new FulfillmentConfiguration.InStore(str3, new LocalFulfillment.InStoreDetails(null, str2, null, 5, null));
            }
        }
        RealBuyerIntentManager realBuyerIntentManager = (RealBuyerIntentManager) buyerIntentManager;
        brandSpot.getClass();
        synchronized (realBuyerIntentManager.lock) {
            FeatureSet featureSet = localBrand.feature_set;
            if (!((featureSet == null || (map = featureSet.features) == null || (feature = map.get("user_intent_enabled")) == null) ? false : Intrinsics.areEqual(feature.enabled, Boolean.TRUE))) {
                realBuyerIntentManager.retireBrandSpot(brandSpot);
                realBuyerIntentManager.retireBrandSpot(confirmedBrandSpot);
                return;
            }
            if (localUserIntent == null) {
                buyerIntentState = realBuyerIntentManager.currentForBrandSpot(confirmedBrandSpot);
                if (buyerIntentState == null && (buyerIntentState = realBuyerIntentManager.currentForBrandSpot(brandSpot)) == null) {
                    buyerIntentState = RealBuyerIntentManager.toInitialBuyerIntentState(buyerIntentScope, localBrand, delivery);
                }
            } else {
                BuyerIntentState buyerIntentState2 = BuyerIntentManagerKt.toBuyerIntentState(localUserIntent, confirmedBrandSpot, localBrand, null);
                if (buyerIntentState2 != null) {
                    buyerIntentState = realBuyerIntentManager.preserveActiveCartForBrandProfileResponse(buyerIntentState2, brandSpot, confirmedBrandSpot);
                }
            }
            if (buyerIntentState != null) {
                realBuyerIntentManager.retireBrandSpot(brandSpot);
                realBuyerIntentManager.retireBrandSpot(confirmedBrandSpot);
                realBuyerIntentManager.setBrandProfileState(buyerIntentState, brandSpot);
            } else {
                realBuyerIntentManager.retireBrandSpot(brandSpot);
                realBuyerIntentManager.retireBrandSpot(confirmedBrandSpot);
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v9 app.cash.local.primitives.BrandSpot, still in use, count: 2, list:
          (r2v9 app.cash.local.primitives.BrandSpot) from 0x0050: INVOKE (r2v9 app.cash.local.primitives.BrandSpot), (r23v0 com.squareup.protos.cash.local.client.v1.LocalFulfillmentType) STATIC call: app.cash.local.backend.real.RealLocalBrandSyncerKt.access$userIntentFallbackLinkContext(app.cash.local.primitives.BrandSpot, com.squareup.protos.cash.local.client.v1.LocalFulfillmentType):java.lang.String A[MD:(app.cash.local.primitives.BrandSpot, com.squareup.protos.cash.local.client.v1.LocalFulfillmentType):java.lang.String (m), WRAPPED]
          (r2v9 app.cash.local.primitives.BrandSpot) from 0x0056: PHI (r2v5 app.cash.local.primitives.BrandSpot) = (r2v4 app.cash.local.primitives.BrandSpot), (r2v9 app.cash.local.primitives.BrandSpot) binds: [B:48:0x0059, B:35:0x0054] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    /* JADX WARN: Removed duplicated region for block: B:12:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object fetchFallbackUserIntent(boolean r19, java.lang.String r20, app.cash.local.primitives.BrandSpot r21, app.cash.local.primitives.BrandSpot r22, com.squareup.protos.cash.local.client.v1.LocalFulfillmentType r23, java.lang.String r24, com.squareup.protos.cash.local.client.v1.LocalBrand r25, kotlin.coroutines.jvm.internal.ContinuationImpl r26) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.cash.local.backend.real.RealLocalBrandSyncer.fetchFallbackUserIntent(boolean, java.lang.String, app.cash.local.primitives.BrandSpot, app.cash.local.primitives.BrandSpot, com.squareup.protos.cash.local.client.v1.LocalFulfillmentType, java.lang.String, com.squareup.protos.cash.local.client.v1.LocalBrand, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00bf, code lost:
    
        if (r11 == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object syncBrandCollection(ContinuationImpl continuationImpl) {
        RealLocalBrandSyncer$syncBrandCollection$1 realLocalBrandSyncer$syncBrandCollection$1;
        int i;
        RealLocalBrandSyncer realLocalBrandSyncer;
        int i2;
        long longValue;
        long j;
        ApiResult apiResult;
        if (continuationImpl instanceof RealLocalBrandSyncer$syncBrandCollection$1) {
            realLocalBrandSyncer$syncBrandCollection$1 = (RealLocalBrandSyncer$syncBrandCollection$1) continuationImpl;
            int i3 = realLocalBrandSyncer$syncBrandCollection$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                realLocalBrandSyncer$syncBrandCollection$1.label = i3 - PKIFailureInfo.systemUnavail;
                Object obj = realLocalBrandSyncer$syncBrandCollection$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realLocalBrandSyncer$syncBrandCollection$1.label;
                LocalInstalledStore localInstalledStore = this.store;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealLocalInstalledStore$hideBrands$$inlined$map$1 realLocalInstalledStore$hideBrands$$inlined$map$1 = new RealLocalInstalledStore$hideBrands$$inlined$map$1(((RealLocalInstalledStore) localInstalledStore).brandCollections, 17);
                    realLocalBrandSyncer$syncBrandCollection$1.L$0 = this;
                    realLocalBrandSyncer$syncBrandCollection$1.I$0 = 0;
                    realLocalBrandSyncer$syncBrandCollection$1.label = 1;
                    obj = FlowKt.first(realLocalInstalledStore$hideBrands$$inlined$map$1, realLocalBrandSyncer$syncBrandCollection$1);
                    if (obj != coroutineSingletons) {
                        realLocalBrandSyncer = this;
                        i2 = 0;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = realLocalBrandSyncer$syncBrandCollection$1.J$0;
                    i2 = realLocalBrandSyncer$syncBrandCollection$1.I$0;
                    SafeTrace.throwOnFailure(obj);
                    apiResult = (ApiResult) obj;
                    if (apiResult instanceof ApiResult.Success) {
                        boolean z = apiResult instanceof ApiResult.Failure.HttpFailure;
                        Analytics analytics = this.analytics;
                        if (z) {
                            Timber.Forest forest = Timber.Forest;
                            String simpleName = Reflection.factory.getOrCreateKotlinClass(GetBrandCollectionResponse.class).getSimpleName();
                            int i4 = ((ApiResult.Failure.HttpFailure) apiResult).code;
                            forest.e(Recorder$$ExternalSyntheticOutline1.m("HttpFailure fetching ", i4, simpleName, " [", "]"), new Object[0]);
                            analytics.track(new LocalClientGetBrandCollectionFailed(ErrorType.SERVER_ERROR, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i4, "HttpFailure [", "]")), null);
                        } else {
                            if (!(apiResult instanceof ApiResult.Failure.NetworkFailure)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            Timber.Forest forest2 = Timber.Forest;
                            Throwable th = ((ApiResult.Failure.NetworkFailure) apiResult).error;
                            forest2.e(Recorder$$ExternalSyntheticOutline2.m("NetworkFailure fetching ", Reflection.factory.getOrCreateKotlinClass(GetBrandCollectionResponse.class).getSimpleName()), new Object[0], th);
                            ErrorType errorType = ErrorType.NETWORK_ERROR;
                            String message = th.getMessage();
                            if (message == null) {
                                message = "NetworkFailure";
                            }
                            analytics.track(new LocalClientGetBrandCollectionFailed(errorType, message), null);
                        }
                    } else {
                        GetBrandCollectionResponse getBrandCollectionResponse = (GetBrandCollectionResponse) ((ApiResult.Success) apiResult).response;
                        realLocalBrandSyncer$syncBrandCollection$1.L$0 = null;
                        realLocalBrandSyncer$syncBrandCollection$1.I$0 = i2;
                        realLocalBrandSyncer$syncBrandCollection$1.J$0 = j;
                        realLocalBrandSyncer$syncBrandCollection$1.label = 3;
                        RealLocalInstalledStore realLocalInstalledStore = (RealLocalInstalledStore) localInstalledStore;
                        Object withContext = JobKt.withContext(realLocalInstalledStore.ioDispatcher, new EventBridge$sendEvent$1(realLocalInstalledStore, getBrandCollectionResponse, continuation, 10), realLocalBrandSyncer$syncBrandCollection$1);
                        if (withContext != coroutineSingletons) {
                            withContext = Unit.INSTANCE;
                        }
                    }
                    return Unit.INSTANCE;
                }
                i2 = realLocalBrandSyncer$syncBrandCollection$1.I$0;
                realLocalBrandSyncer = realLocalBrandSyncer$syncBrandCollection$1.L$0;
                SafeTrace.throwOnFailure(obj);
                longValue = ((Number) obj).longValue();
                if (Instant.ofEpochMilli(longValue).compareTo(DimensionKt.now(realLocalBrandSyncer.clock)) <= 0) {
                    GetBrandCollectionRequest getBrandCollectionRequest = new GetBrandCollectionRequest(ByteString.EMPTY);
                    realLocalBrandSyncer$syncBrandCollection$1.L$0 = null;
                    realLocalBrandSyncer$syncBrandCollection$1.I$0 = i2;
                    realLocalBrandSyncer$syncBrandCollection$1.J$0 = longValue;
                    realLocalBrandSyncer$syncBrandCollection$1.label = 2;
                    obj = this.service.getBrandCollection(getBrandCollectionRequest, realLocalBrandSyncer$syncBrandCollection$1);
                    if (obj != coroutineSingletons) {
                        j = longValue;
                        apiResult = (ApiResult) obj;
                        if (apiResult instanceof ApiResult.Success) {
                        }
                    }
                    return coroutineSingletons;
                }
                return Unit.INSTANCE;
            }
        }
        realLocalBrandSyncer$syncBrandCollection$1 = new RealLocalBrandSyncer$syncBrandCollection$1(this, continuationImpl);
        Object obj2 = realLocalBrandSyncer$syncBrandCollection$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realLocalBrandSyncer$syncBrandCollection$1.label;
        LocalInstalledStore localInstalledStore2 = this.store;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        longValue = ((Number) obj2).longValue();
        if (Instant.ofEpochMilli(longValue).compareTo(DimensionKt.now(realLocalBrandSyncer.clock)) <= 0) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object syncBrandSpot(BrandSpot brandSpot, String str, BrandSpotSyncTokens brandSpotSyncTokens, LocalFulfillmentType localFulfillmentType, String str2, ContinuationImpl continuationImpl) {
        RealLocalBrandSyncer$syncBrandSpot$1 realLocalBrandSyncer$syncBrandSpot$1;
        Object obj;
        Object obj2;
        int i;
        int i2;
        BrandSpot brandSpot2;
        Mutex mutex;
        String str3;
        LocalFulfillmentType localFulfillmentType2;
        BrandSpotSyncTokens brandSpotSyncTokens2;
        String str4;
        Throwable th;
        Mutex mutex2;
        Object obj3;
        Object putIfAbsent;
        try {
            if (continuationImpl instanceof RealLocalBrandSyncer$syncBrandSpot$1) {
                realLocalBrandSyncer$syncBrandSpot$1 = (RealLocalBrandSyncer$syncBrandSpot$1) continuationImpl;
                int i3 = realLocalBrandSyncer$syncBrandSpot$1.label;
                if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                    realLocalBrandSyncer$syncBrandSpot$1.label = i3 - PKIFailureInfo.systemUnavail;
                    RealLocalBrandSyncer$syncBrandSpot$1 realLocalBrandSyncer$syncBrandSpot$12 = realLocalBrandSyncer$syncBrandSpot$1;
                    obj = realLocalBrandSyncer$syncBrandSpot$12.result;
                    obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = realLocalBrandSyncer$syncBrandSpot$12.label;
                    int i4 = 2;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        Object computeIfAbsent = this.brandProfileSyncMutexes.computeIfAbsent(new BrandToken(brandSpot.brandToken), new d4$$ExternalSyntheticLambda0(i4));
                        computeIfAbsent.getClass();
                        Mutex mutex3 = (Mutex) computeIfAbsent;
                        realLocalBrandSyncer$syncBrandSpot$12.L$0 = brandSpot;
                        realLocalBrandSyncer$syncBrandSpot$12.L$1 = str;
                        realLocalBrandSyncer$syncBrandSpot$12.L$2 = brandSpotSyncTokens;
                        realLocalBrandSyncer$syncBrandSpot$12.L$3 = localFulfillmentType;
                        realLocalBrandSyncer$syncBrandSpot$12.L$4 = str2;
                        realLocalBrandSyncer$syncBrandSpot$12.L$6 = mutex3;
                        i2 = 0;
                        realLocalBrandSyncer$syncBrandSpot$12.I$0 = 0;
                        realLocalBrandSyncer$syncBrandSpot$12.label = 1;
                        if (mutex3.lock(realLocalBrandSyncer$syncBrandSpot$12) != obj2) {
                            brandSpot2 = brandSpot;
                            mutex = mutex3;
                            str3 = str2;
                            localFulfillmentType2 = localFulfillmentType;
                            brandSpotSyncTokens2 = brandSpotSyncTokens;
                            str4 = str;
                        }
                        return obj2;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        mutex2 = realLocalBrandSyncer$syncBrandSpot$12.L$6;
                        try {
                            SafeTrace.throwOnFailure(obj);
                            LocalBrandSyncer$SyncResult localBrandSyncer$SyncResult = (LocalBrandSyncer$SyncResult) obj;
                            mutex2.unlock(null);
                            return localBrandSyncer$SyncResult;
                        } catch (Throwable th2) {
                            th = th2;
                            mutex2.unlock(null);
                            throw th;
                        }
                    }
                    int i5 = realLocalBrandSyncer$syncBrandSpot$12.I$0;
                    Mutex mutex4 = realLocalBrandSyncer$syncBrandSpot$12.L$6;
                    String str5 = realLocalBrandSyncer$syncBrandSpot$12.L$4;
                    LocalFulfillmentType localFulfillmentType3 = realLocalBrandSyncer$syncBrandSpot$12.L$3;
                    brandSpotSyncTokens2 = realLocalBrandSyncer$syncBrandSpot$12.L$2;
                    String str6 = realLocalBrandSyncer$syncBrandSpot$12.L$1;
                    BrandSpot brandSpot3 = realLocalBrandSyncer$syncBrandSpot$12.L$0;
                    SafeTrace.throwOnFailure(obj);
                    localFulfillmentType2 = localFulfillmentType3;
                    str4 = str6;
                    str3 = str5;
                    brandSpot2 = brandSpot3;
                    i2 = i5;
                    mutex = mutex4;
                    ConcurrentHashMap concurrentHashMap = this.brandProfileSyncStates;
                    obj3 = concurrentHashMap.get(brandSpot2);
                    if (obj3 == null && (putIfAbsent = concurrentHashMap.putIfAbsent(brandSpot2, (obj3 = new BrandProfileSyncState()))) != null) {
                        obj3 = putIfAbsent;
                    }
                    realLocalBrandSyncer$syncBrandSpot$12.L$0 = null;
                    realLocalBrandSyncer$syncBrandSpot$12.L$1 = null;
                    realLocalBrandSyncer$syncBrandSpot$12.L$2 = null;
                    realLocalBrandSyncer$syncBrandSpot$12.L$3 = null;
                    realLocalBrandSyncer$syncBrandSpot$12.L$4 = null;
                    realLocalBrandSyncer$syncBrandSpot$12.L$6 = mutex;
                    realLocalBrandSyncer$syncBrandSpot$12.I$0 = i2;
                    realLocalBrandSyncer$syncBrandSpot$12.label = 2;
                    obj = syncBrandSpotLocked((BrandProfileSyncState) obj3, brandSpot2, str4, brandSpotSyncTokens2, localFulfillmentType2, str3, realLocalBrandSyncer$syncBrandSpot$12);
                    if (obj != obj2) {
                        mutex2 = mutex;
                        LocalBrandSyncer$SyncResult localBrandSyncer$SyncResult2 = (LocalBrandSyncer$SyncResult) obj;
                        mutex2.unlock(null);
                        return localBrandSyncer$SyncResult2;
                    }
                    return obj2;
                }
            }
            ConcurrentHashMap concurrentHashMap2 = this.brandProfileSyncStates;
            obj3 = concurrentHashMap2.get(brandSpot2);
            if (obj3 == null) {
                obj3 = putIfAbsent;
            }
            realLocalBrandSyncer$syncBrandSpot$12.L$0 = null;
            realLocalBrandSyncer$syncBrandSpot$12.L$1 = null;
            realLocalBrandSyncer$syncBrandSpot$12.L$2 = null;
            realLocalBrandSyncer$syncBrandSpot$12.L$3 = null;
            realLocalBrandSyncer$syncBrandSpot$12.L$4 = null;
            realLocalBrandSyncer$syncBrandSpot$12.L$6 = mutex;
            realLocalBrandSyncer$syncBrandSpot$12.I$0 = i2;
            realLocalBrandSyncer$syncBrandSpot$12.label = 2;
            obj = syncBrandSpotLocked((BrandProfileSyncState) obj3, brandSpot2, str4, brandSpotSyncTokens2, localFulfillmentType2, str3, realLocalBrandSyncer$syncBrandSpot$12);
            if (obj != obj2) {
            }
            return obj2;
        } catch (Throwable th3) {
            Mutex mutex5 = mutex;
            th = th3;
            mutex2 = mutex5;
            mutex2.unlock(null);
            throw th;
        }
        realLocalBrandSyncer$syncBrandSpot$1 = new RealLocalBrandSyncer$syncBrandSpot$1(this, continuationImpl);
        RealLocalBrandSyncer$syncBrandSpot$1 realLocalBrandSyncer$syncBrandSpot$122 = realLocalBrandSyncer$syncBrandSpot$1;
        obj = realLocalBrandSyncer$syncBrandSpot$122.result;
        obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realLocalBrandSyncer$syncBrandSpot$122.label;
        int i42 = 2;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:216:0x00da, code lost:
    
        if (r31.userIntentLinkContextConsumed != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0367, code lost:
    
        if (r1 != false) goto L214;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0371 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object syncBrandSpotLocked(BrandProfileSyncState brandProfileSyncState, BrandSpot brandSpot, String str, BrandSpotSyncTokens brandSpotSyncTokens, LocalFulfillmentType localFulfillmentType, String str2, ContinuationImpl continuationImpl) {
        RealLocalBrandSyncer$syncBrandSpotLocked$1 realLocalBrandSyncer$syncBrandSpotLocked$1;
        int i;
        String access$userIntentFallbackLinkContext;
        LocalFulfillmentType localFulfillmentType2;
        String str3;
        LocalFulfillmentType localFulfillmentType3;
        BrandProfileSyncRequestState brandProfileSyncRequestState;
        String str4;
        Object brandProfile;
        BrandProfileSyncState brandProfileSyncState2;
        String str5;
        BrandProfileSyncRequestState brandProfileSyncRequestState2;
        String str6;
        BrandSpot brandSpot2;
        String str7;
        LocalBrand localBrand;
        String str8;
        ApiResult apiResult;
        BrandSpot brandSpot3;
        BrandSpot brandSpot4;
        LocalFulfillmentType localFulfillmentType4;
        LocalBrand localBrand2;
        BrandProfileSyncState brandProfileSyncState3;
        FallbackUserIntent fallbackUserIntent;
        boolean z;
        BrandSpot brandSpot5;
        String str9;
        BrandProfileSyncRequestState brandProfileSyncRequestState3;
        BrandProfileSyncState brandProfileSyncState4;
        BrandSpot brandSpot6;
        LocalFulfillmentType localFulfillmentType5;
        LocalBrand localBrand3;
        String str10;
        ApiResult apiResult2;
        String str11;
        String str12;
        BrandSpot brandSpot7;
        LinkedHashMap linkedHashMap;
        MutableSharedFlow mutableSharedFlow;
        boolean equals;
        BrandSpotSyncTokens brandSpotSyncTokens2 = brandSpotSyncTokens;
        if (continuationImpl instanceof RealLocalBrandSyncer$syncBrandSpotLocked$1) {
            realLocalBrandSyncer$syncBrandSpotLocked$1 = (RealLocalBrandSyncer$syncBrandSpotLocked$1) continuationImpl;
            int i2 = realLocalBrandSyncer$syncBrandSpotLocked$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realLocalBrandSyncer$syncBrandSpotLocked$1.label = i2 - PKIFailureInfo.systemUnavail;
                RealLocalBrandSyncer$syncBrandSpotLocked$1 realLocalBrandSyncer$syncBrandSpotLocked$12 = realLocalBrandSyncer$syncBrandSpotLocked$1;
                Object obj = realLocalBrandSyncer$syncBrandSpotLocked$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realLocalBrandSyncer$syncBrandSpotLocked$12.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    boolean enabled = ((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) this.featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$LocalBuyerIntentAndroidEnabled.INSTANCE)).enabled();
                    String str13 = (str2 == null || StringsKt.isBlank(str2)) ? null : str2;
                    LocalFulfillmentType localFulfillmentType6 = localFulfillmentType != LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_UNSPECIFIED ? localFulfillmentType : null;
                    boolean z2 = (str13 != null || (str8 = brandSpotSyncTokens2.inStoreOrderingToken) == null || StringsKt.isBlank(str8)) ? false : true;
                    LocalFulfillmentType localFulfillmentType7 = localFulfillmentType6 == null ? z2 ? LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_IN_STORE : LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_PICKUP : localFulfillmentType6;
                    if (z2) {
                        str3 = null;
                    } else {
                        brandProfileSyncState.getClass();
                        brandSpot.getClass();
                        localFulfillmentType7.getClass();
                        if (!enabled) {
                            brandProfileSyncState.userIntentLinkContext = null;
                            brandProfileSyncState.userIntentLinkContextFallbackFulfillmentType = null;
                            brandProfileSyncState.userIntentLinkContextConsumed = false;
                        } else if (str13 != null) {
                            if (!Intrinsics.areEqual(brandProfileSyncState.userIntentLinkContext, str13)) {
                                brandProfileSyncState.userIntentLinkContext = str13;
                                brandProfileSyncState.userIntentLinkContextFallbackFulfillmentType = null;
                                brandProfileSyncState.userIntentLinkContextConsumed = false;
                            }
                        } else if (!brandProfileSyncState.userIntentDisabled && !brandProfileSyncState.userIntentLinkContextConsumed) {
                            if ((brandProfileSyncState.userIntentLinkContext == null || ((localFulfillmentType2 = brandProfileSyncState.userIntentLinkContextFallbackFulfillmentType) != null && localFulfillmentType2 != localFulfillmentType7)) && (access$userIntentFallbackLinkContext = RealLocalBrandSyncerKt.access$userIntentFallbackLinkContext(brandSpot, localFulfillmentType7)) != null) {
                                brandProfileSyncState.userIntentLinkContext = access$userIntentFallbackLinkContext;
                                brandProfileSyncState.userIntentLinkContextFallbackFulfillmentType = localFulfillmentType7;
                            }
                            str13 = brandProfileSyncState.userIntentLinkContext;
                            str3 = str13;
                        }
                        str13 = null;
                        str3 = str13;
                    }
                    boolean z3 = str3 != null;
                    if (z3) {
                        brandSpotSyncTokens2 = BrandSpotSyncTokens.copy$default(brandSpotSyncTokens2, null, 6);
                    }
                    BrandSpotSyncTokens brandSpotSyncTokens3 = brandSpotSyncTokens2;
                    LocalFulfillmentType localFulfillmentType8 = !z3 ? localFulfillmentType6 : null;
                    LocalFulfillmentType localFulfillmentType9 = localFulfillmentType7;
                    String str14 = str3;
                    BrandProfileSyncRequestState brandProfileSyncRequestState4 = new BrandProfileSyncRequestState(enabled, localFulfillmentType6, localFulfillmentType9, z2, str14, brandSpotSyncTokens3, localFulfillmentType8);
                    CachedBrandResponseData cachedBrandResponseData = (CachedBrandResponseData) this.cachedBrandProfileResponses.get(brandSpot);
                    if (cachedBrandResponseData != null) {
                        Instant now = DimensionKt.now(this.clock);
                        now.getClass();
                        String str15 = cachedBrandResponseData.userIntentLinkContext;
                        boolean z4 = Intrinsics.areEqual(str15, str14) || (enabled && str14 == null && localFulfillmentType8 == null && str15 != null);
                        if (Intrinsics.areEqual(cachedBrandResponseData.syncTokens, brandSpotSyncTokens3) && cachedBrandResponseData.fulfillmentType == localFulfillmentType8 && z4) {
                            Long l = cachedBrandResponseData.response.expires_at;
                            if (Instant.ofEpochMilli(l != null ? l.longValue() : 0L).compareTo(now) > 0) {
                                GetBrandProfileResponse getBrandProfileResponse = cachedBrandResponseData.response;
                                zzhx zzhxVar = getBrandProfileResponse.response;
                                GetBrandProfileResponse$Response$Brand getBrandProfileResponse$Response$Brand = zzhxVar instanceof GetBrandProfileResponse$Response$Brand ? (GetBrandProfileResponse$Response$Brand) zzhxVar : null;
                                if (getBrandProfileResponse$Response$Brand != null) {
                                    LocalBrand localBrand4 = getBrandProfileResponse$Response$Brand.value;
                                    brandProfileSyncRequestState = brandProfileSyncRequestState4;
                                    localBrand = localBrand4;
                                } else {
                                    brandProfileSyncRequestState = brandProfileSyncRequestState4;
                                    localBrand = null;
                                }
                                if (localBrand != null) {
                                    BrandSpot confirmedBrandSpot = confirmedBrandSpot(localBrand);
                                    BuyerIntentManager buyerIntentManager = this.buyerIntentManager;
                                    if (enabled && RealLocalBrandSyncerKt.access$userIntentEnabled(localBrand)) {
                                        RealBuyerIntentManager realBuyerIntentManager = (RealBuyerIntentManager) buyerIntentManager;
                                        if (!realBuyerIntentManager.hasActiveBrandSpot(brandSpot) && !realBuyerIntentManager.hasActiveBrandSpot(confirmedBrandSpot) && (str14 != null || RealLocalBrandSyncerKt.access$userIntentFallbackLinkContext(confirmedBrandSpot, localFulfillmentType9) != null || RealLocalBrandSyncerKt.access$userIntentFallbackLinkContext(brandSpot, localFulfillmentType9) != null)) {
                                            localFulfillmentType3 = localFulfillmentType8;
                                            String str16 = brandSpot.brandToken;
                                            String str17 = brandSpot.locationToken;
                                            String access$anonymousUserAppTokenOrNull = str14 == null ? RealLocalBrandSyncerKt.access$anonymousUserAppTokenOrNull(this.sessionManager) : null;
                                            String str18 = brandSpot.brandToken;
                                            str4 = brandSpot.locationToken;
                                            if (str4 == null) {
                                                str4 = null;
                                            }
                                            if (str14 != null) {
                                                str4 = null;
                                            }
                                            GetBrandProfileRequest getBrandProfileRequest = new GetBrandProfileRequest(str18, str4, str, access$anonymousUserAppTokenOrNull, brandSpotSyncTokens3.schedulingToken, str14 == null ? null : brandSpotSyncTokens3.inStoreOrderingToken, CollectionsKt__CollectionsKt.listOfNotNull(localFulfillmentType3), str14, 576);
                                            LocalService localService = this.service;
                                            realLocalBrandSyncer$syncBrandSpotLocked$12.L$0 = brandProfileSyncState;
                                            realLocalBrandSyncer$syncBrandSpotLocked$12.L$1 = brandSpot;
                                            realLocalBrandSyncer$syncBrandSpotLocked$12.L$2 = str;
                                            realLocalBrandSyncer$syncBrandSpotLocked$12.L$6 = brandProfileSyncRequestState;
                                            realLocalBrandSyncer$syncBrandSpotLocked$12.L$8 = str16;
                                            realLocalBrandSyncer$syncBrandSpotLocked$12.L$9 = str17;
                                            realLocalBrandSyncer$syncBrandSpotLocked$12.label = 1;
                                            brandProfile = localService.getBrandProfile(getBrandProfileRequest, realLocalBrandSyncer$syncBrandSpotLocked$12);
                                            if (brandProfile != obj2) {
                                                brandProfileSyncState2 = brandProfileSyncState;
                                                str5 = str16;
                                                brandProfileSyncRequestState2 = brandProfileSyncRequestState;
                                                str6 = str;
                                                brandSpot2 = brandSpot;
                                                str7 = str17;
                                                obj = brandProfile;
                                            }
                                            return obj2;
                                        }
                                    }
                                }
                                if (localBrand != null) {
                                    brandProfileSyncState.update(brandSpot, confirmedBrandSpot(localBrand), localBrand, str14, localFulfillmentType9, false);
                                    consumeBrandProfileUserIntent(brandSpot, localBrand, brandSpotSyncTokens3, localFulfillmentType8, getBrandProfileResponse.user_intent);
                                }
                                return LocalBrandSyncer$SyncResult.Cache.INSTANCE;
                            }
                        }
                    }
                    localFulfillmentType3 = localFulfillmentType8;
                    brandProfileSyncRequestState = brandProfileSyncRequestState4;
                    String str162 = brandSpot.brandToken;
                    String str172 = brandSpot.locationToken;
                    if (str14 == null) {
                    }
                    String str182 = brandSpot.brandToken;
                    str4 = brandSpot.locationToken;
                    if (str4 == null) {
                    }
                    if (str14 != null) {
                    }
                    GetBrandProfileRequest getBrandProfileRequest2 = new GetBrandProfileRequest(str182, str4, str, access$anonymousUserAppTokenOrNull, brandSpotSyncTokens3.schedulingToken, str14 == null ? null : brandSpotSyncTokens3.inStoreOrderingToken, CollectionsKt__CollectionsKt.listOfNotNull(localFulfillmentType3), str14, 576);
                    LocalService localService2 = this.service;
                    realLocalBrandSyncer$syncBrandSpotLocked$12.L$0 = brandProfileSyncState;
                    realLocalBrandSyncer$syncBrandSpotLocked$12.L$1 = brandSpot;
                    realLocalBrandSyncer$syncBrandSpotLocked$12.L$2 = str;
                    realLocalBrandSyncer$syncBrandSpotLocked$12.L$6 = brandProfileSyncRequestState;
                    realLocalBrandSyncer$syncBrandSpotLocked$12.L$8 = str162;
                    realLocalBrandSyncer$syncBrandSpotLocked$12.L$9 = str172;
                    realLocalBrandSyncer$syncBrandSpotLocked$12.label = 1;
                    brandProfile = localService2.getBrandProfile(getBrandProfileRequest2, realLocalBrandSyncer$syncBrandSpotLocked$12);
                    if (brandProfile != obj2) {
                    }
                    return obj2;
                }
                if (i == 1) {
                    String str19 = realLocalBrandSyncer$syncBrandSpotLocked$12.L$9;
                    String str20 = realLocalBrandSyncer$syncBrandSpotLocked$12.L$8;
                    BrandProfileSyncRequestState brandProfileSyncRequestState5 = realLocalBrandSyncer$syncBrandSpotLocked$12.L$6;
                    String str21 = realLocalBrandSyncer$syncBrandSpotLocked$12.L$2;
                    BrandSpot brandSpot8 = realLocalBrandSyncer$syncBrandSpotLocked$12.L$1;
                    brandProfileSyncState2 = realLocalBrandSyncer$syncBrandSpotLocked$12.L$0;
                    SafeTrace.throwOnFailure(obj);
                    str7 = str19;
                    str5 = str20;
                    brandProfileSyncRequestState2 = brandProfileSyncRequestState5;
                    str6 = str21;
                    brandSpot2 = brandSpot8;
                } else {
                    if (i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    localFulfillmentType5 = realLocalBrandSyncer$syncBrandSpotLocked$12.L$16;
                    brandSpot5 = realLocalBrandSyncer$syncBrandSpotLocked$12.L$15;
                    localBrand3 = realLocalBrandSyncer$syncBrandSpotLocked$12.L$14;
                    apiResult2 = realLocalBrandSyncer$syncBrandSpotLocked$12.L$12;
                    str9 = realLocalBrandSyncer$syncBrandSpotLocked$12.L$9;
                    str10 = realLocalBrandSyncer$syncBrandSpotLocked$12.L$8;
                    brandProfileSyncRequestState3 = realLocalBrandSyncer$syncBrandSpotLocked$12.L$6;
                    brandSpot6 = realLocalBrandSyncer$syncBrandSpotLocked$12.L$1;
                    brandProfileSyncState4 = realLocalBrandSyncer$syncBrandSpotLocked$12.L$0;
                    SafeTrace.throwOnFailure(obj);
                    fallbackUserIntent = (FallbackUserIntent) obj;
                    localFulfillmentType4 = localFulfillmentType5;
                    brandSpot4 = brandSpot5;
                    localBrand2 = localBrand3;
                    apiResult = apiResult2;
                    str7 = str9;
                    str5 = str10;
                    brandProfileSyncState3 = brandProfileSyncState4;
                    brandProfileSyncRequestState2 = brandProfileSyncRequestState3;
                    brandSpot3 = brandSpot6;
                    str11 = brandProfileSyncRequestState2.resolvedUserIntentLinkContext;
                    if (str11 == null) {
                        if (fallbackUserIntent == null) {
                            str12 = null;
                            ApiResult.Success success = (ApiResult.Success) apiResult;
                            LocalUserIntent localUserIntent = ((GetBrandProfileResponse) success.response).user_intent;
                            consumeBrandProfileUserIntent(brandSpot3, localBrand2, brandProfileSyncRequestState2.effectiveSyncTokens, brandProfileSyncRequestState2.effectiveFulfillmentType, localUserIntent != null ? fallbackUserIntent != null ? fallbackUserIntent.userIntent : null : localUserIntent);
                            brandProfileSyncState3.update(brandSpot3, brandSpot4, localBrand2, str12, localFulfillmentType4, str12 == null);
                            brandSpot7 = brandSpot4;
                            LocalBrand localBrand5 = localBrand2;
                            this.cachedBrandProfileResponses.put(brandSpot7, new CachedBrandResponseData((GetBrandProfileResponse) success.response, brandProfileSyncRequestState2.effectiveSyncTokens, brandProfileSyncRequestState2.effectiveFulfillmentType, str12));
                            LocalInMemoryDatabase localInMemoryDatabase = this.localInMemoryDatabase;
                            str5.getClass();
                            if (Intrinsics.areEqual(brandSpot7.brandToken, str5)) {
                                String str22 = brandSpot7.locationToken;
                                if (str22 == null) {
                                    if (str7 == null) {
                                        equals = true;
                                    }
                                    equals = false;
                                } else {
                                    if (str7 != null) {
                                        equals = str22.equals(str7);
                                    }
                                    equals = false;
                                }
                                LocalInMemoryDatabase.getOrPutFlow$default(localInMemoryDatabase.brands, brandSpot7).tryEmit(localBrand5);
                                return LocalBrandSyncer$SyncResult.Success.INSTANCE;
                            }
                            linkedHashMap = localInMemoryDatabase.brandSpotMappings;
                            BrandSpot brandSpot9 = new BrandSpot(str5, str7);
                            synchronized (linkedHashMap) {
                                try {
                                    Object obj3 = linkedHashMap.get(brandSpot9);
                                    Object obj4 = obj3;
                                    if (obj3 == null) {
                                        SharedFlowImpl MutableSharedFlow$default = FlowKt.MutableSharedFlow$default(1, 0, null, 6);
                                        MutableSharedFlow$default.tryEmit(null);
                                        linkedHashMap.put(brandSpot9, MutableSharedFlow$default);
                                        obj4 = MutableSharedFlow$default;
                                    }
                                    mutableSharedFlow = (MutableSharedFlow) obj4;
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            mutableSharedFlow.tryEmit(brandSpot7);
                            LocalInMemoryDatabase.getOrPutFlow$default(localInMemoryDatabase.brands, brandSpot7).tryEmit(localBrand5);
                            return LocalBrandSyncer$SyncResult.Success.INSTANCE;
                        }
                        str11 = fallbackUserIntent.userIntentLinkContext;
                    }
                    str12 = str11;
                    ApiResult.Success success2 = (ApiResult.Success) apiResult;
                    LocalUserIntent localUserIntent2 = ((GetBrandProfileResponse) success2.response).user_intent;
                    consumeBrandProfileUserIntent(brandSpot3, localBrand2, brandProfileSyncRequestState2.effectiveSyncTokens, brandProfileSyncRequestState2.effectiveFulfillmentType, localUserIntent2 != null ? fallbackUserIntent != null ? fallbackUserIntent.userIntent : null : localUserIntent2);
                    brandProfileSyncState3.update(brandSpot3, brandSpot4, localBrand2, str12, localFulfillmentType4, str12 == null);
                    brandSpot7 = brandSpot4;
                    LocalBrand localBrand52 = localBrand2;
                    this.cachedBrandProfileResponses.put(brandSpot7, new CachedBrandResponseData((GetBrandProfileResponse) success2.response, brandProfileSyncRequestState2.effectiveSyncTokens, brandProfileSyncRequestState2.effectiveFulfillmentType, str12));
                    LocalInMemoryDatabase localInMemoryDatabase2 = this.localInMemoryDatabase;
                    str5.getClass();
                    if (Intrinsics.areEqual(brandSpot7.brandToken, str5)) {
                    }
                    linkedHashMap = localInMemoryDatabase2.brandSpotMappings;
                    BrandSpot brandSpot92 = new BrandSpot(str5, str7);
                    synchronized (linkedHashMap) {
                    }
                }
                apiResult = (ApiResult) obj;
                if (apiResult instanceof ApiResult.Success) {
                    if (apiResult instanceof ApiResult.Failure.HttpFailure) {
                        Timber.Forest.e(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(((ApiResult.Failure.HttpFailure) apiResult).code, "]", JsonLogicResult$Success$$ExternalSyntheticOutline0.m("HttpFailure fetching the BrandProfile for BrandToken(", BrandToken.m1229toStringimpl(str5), ") LocationToken(", str7 == null ? "null" : LocationToken.m1252toStringimpl(str7), ") [")), new Object[0]);
                        return LocalBrandSyncer$SyncResult.Failure.INSTANCE;
                    }
                    if (apiResult instanceof ApiResult.Failure.NetworkFailure) {
                        Timber.Forest.e(Boxes$$ExternalSyntheticOutline1.m("NetworkFailure fetching the BrandProfile for BrandToken(", BrandToken.m1229toStringimpl(str5), ") LocationToken(", str7 == null ? "null" : LocationToken.m1252toStringimpl(str7), ")"), new Object[0], ((ApiResult.Failure.NetworkFailure) apiResult).error);
                        return LocalBrandSyncer$SyncResult.Failure.INSTANCE;
                    }
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                ApiResult.Success success3 = (ApiResult.Success) apiResult;
                zzhx zzhxVar2 = ((GetBrandProfileResponse) success3.response).response;
                if (zzhxVar2 instanceof GetBrandProfileResponse$Response$RedirectToWeb) {
                    String str23 = ((GetBrandProfileResponse$Response$RedirectToWeb) zzhxVar2).value.url;
                    str23.getClass();
                    return new LocalBrandSyncer$SyncResult.RedirectToWeb(str23);
                }
                if (!(zzhxVar2 instanceof GetBrandProfileResponse$Response$Brand)) {
                    if ((zzhxVar2 instanceof GetBrandProfileResponse$Response$ErrorResponse) || zzhxVar2 == null) {
                        return LocalBrandSyncer$SyncResult.Failure.INSTANCE;
                    }
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                LocalBrand localBrand6 = ((GetBrandProfileResponse$Response$Brand) zzhxVar2).value;
                BrandSpot confirmedBrandSpot2 = confirmedBrandSpot(localBrand6);
                brandProfileSyncRequestState2.getClass();
                LocalFulfillmentType localFulfillmentType10 = brandProfileSyncRequestState2.normalizedFulfillmentType;
                if (localFulfillmentType10 == null) {
                    localFulfillmentType10 = brandProfileSyncRequestState2.preserveInStoreOrderingToken ? LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_IN_STORE : RealLocalBrandSyncerKt.defaultRemoteOrderingFulfillmentType(localBrand6);
                }
                LocalFulfillmentType localFulfillmentType11 = localFulfillmentType10;
                if (((GetBrandProfileResponse) success3.response).user_intent == null && !brandProfileSyncRequestState2.preserveInStoreOrderingToken) {
                    if (!brandProfileSyncRequestState2.buyerIntentAndroidEnabled) {
                        brandProfileSyncState2.getClass();
                    } else if (!brandProfileSyncState2.userIntentLinkContextConsumed) {
                        z = true;
                        if (z) {
                            boolean z5 = brandProfileSyncRequestState2.buyerIntentAndroidEnabled;
                            String str24 = brandProfileSyncRequestState2.resolvedUserIntentLinkContext;
                            realLocalBrandSyncer$syncBrandSpotLocked$12.L$0 = brandProfileSyncState2;
                            realLocalBrandSyncer$syncBrandSpotLocked$12.L$1 = brandSpot2;
                            realLocalBrandSyncer$syncBrandSpotLocked$12.L$2 = null;
                            realLocalBrandSyncer$syncBrandSpotLocked$12.L$6 = brandProfileSyncRequestState2;
                            realLocalBrandSyncer$syncBrandSpotLocked$12.L$8 = str5;
                            realLocalBrandSyncer$syncBrandSpotLocked$12.L$9 = str7;
                            realLocalBrandSyncer$syncBrandSpotLocked$12.L$12 = success3;
                            realLocalBrandSyncer$syncBrandSpotLocked$12.L$14 = localBrand6;
                            realLocalBrandSyncer$syncBrandSpotLocked$12.L$15 = confirmedBrandSpot2;
                            realLocalBrandSyncer$syncBrandSpotLocked$12.L$16 = localFulfillmentType11;
                            realLocalBrandSyncer$syncBrandSpotLocked$12.label = 2;
                            Object fetchFallbackUserIntent = fetchFallbackUserIntent(z5, str24, brandSpot2, confirmedBrandSpot2, localFulfillmentType11, str6, localBrand6, realLocalBrandSyncer$syncBrandSpotLocked$12);
                            if (fetchFallbackUserIntent != obj2) {
                                brandSpot5 = confirmedBrandSpot2;
                                str9 = str7;
                                brandProfileSyncRequestState3 = brandProfileSyncRequestState2;
                                brandProfileSyncState4 = brandProfileSyncState2;
                                obj = fetchFallbackUserIntent;
                                brandSpot6 = brandSpot2;
                                localFulfillmentType5 = localFulfillmentType11;
                                localBrand3 = localBrand6;
                                str10 = str5;
                                apiResult2 = apiResult;
                                fallbackUserIntent = (FallbackUserIntent) obj;
                                localFulfillmentType4 = localFulfillmentType5;
                                brandSpot4 = brandSpot5;
                                localBrand2 = localBrand3;
                                apiResult = apiResult2;
                                str7 = str9;
                                str5 = str10;
                                brandProfileSyncState3 = brandProfileSyncState4;
                                brandProfileSyncRequestState2 = brandProfileSyncRequestState3;
                                brandSpot3 = brandSpot6;
                                str11 = brandProfileSyncRequestState2.resolvedUserIntentLinkContext;
                                if (str11 == null) {
                                }
                                str12 = str11;
                                ApiResult.Success success22 = (ApiResult.Success) apiResult;
                                LocalUserIntent localUserIntent22 = ((GetBrandProfileResponse) success22.response).user_intent;
                                consumeBrandProfileUserIntent(brandSpot3, localBrand2, brandProfileSyncRequestState2.effectiveSyncTokens, brandProfileSyncRequestState2.effectiveFulfillmentType, localUserIntent22 != null ? fallbackUserIntent != null ? fallbackUserIntent.userIntent : null : localUserIntent22);
                                brandProfileSyncState3.update(brandSpot3, brandSpot4, localBrand2, str12, localFulfillmentType4, str12 == null);
                                brandSpot7 = brandSpot4;
                                LocalBrand localBrand522 = localBrand2;
                                this.cachedBrandProfileResponses.put(brandSpot7, new CachedBrandResponseData((GetBrandProfileResponse) success22.response, brandProfileSyncRequestState2.effectiveSyncTokens, brandProfileSyncRequestState2.effectiveFulfillmentType, str12));
                                LocalInMemoryDatabase localInMemoryDatabase22 = this.localInMemoryDatabase;
                                str5.getClass();
                                if (Intrinsics.areEqual(brandSpot7.brandToken, str5)) {
                                }
                                linkedHashMap = localInMemoryDatabase22.brandSpotMappings;
                                BrandSpot brandSpot922 = new BrandSpot(str5, str7);
                                synchronized (linkedHashMap) {
                                }
                            }
                            return obj2;
                        }
                    }
                    z = false;
                    if (z) {
                    }
                }
                brandSpot3 = brandSpot2;
                brandSpot4 = confirmedBrandSpot2;
                localFulfillmentType4 = localFulfillmentType11;
                localBrand2 = localBrand6;
                brandProfileSyncState3 = brandProfileSyncState2;
                fallbackUserIntent = null;
                str11 = brandProfileSyncRequestState2.resolvedUserIntentLinkContext;
                if (str11 == null) {
                }
                str12 = str11;
                ApiResult.Success success222 = (ApiResult.Success) apiResult;
                LocalUserIntent localUserIntent222 = ((GetBrandProfileResponse) success222.response).user_intent;
                consumeBrandProfileUserIntent(brandSpot3, localBrand2, brandProfileSyncRequestState2.effectiveSyncTokens, brandProfileSyncRequestState2.effectiveFulfillmentType, localUserIntent222 != null ? fallbackUserIntent != null ? fallbackUserIntent.userIntent : null : localUserIntent222);
                brandProfileSyncState3.update(brandSpot3, brandSpot4, localBrand2, str12, localFulfillmentType4, str12 == null);
                brandSpot7 = brandSpot4;
                LocalBrand localBrand5222 = localBrand2;
                this.cachedBrandProfileResponses.put(brandSpot7, new CachedBrandResponseData((GetBrandProfileResponse) success222.response, brandProfileSyncRequestState2.effectiveSyncTokens, brandProfileSyncRequestState2.effectiveFulfillmentType, str12));
                LocalInMemoryDatabase localInMemoryDatabase222 = this.localInMemoryDatabase;
                str5.getClass();
                if (Intrinsics.areEqual(brandSpot7.brandToken, str5)) {
                }
                linkedHashMap = localInMemoryDatabase222.brandSpotMappings;
                BrandSpot brandSpot9222 = new BrandSpot(str5, str7);
                synchronized (linkedHashMap) {
                }
            }
        }
        realLocalBrandSyncer$syncBrandSpotLocked$1 = new RealLocalBrandSyncer$syncBrandSpotLocked$1(this, continuationImpl);
        RealLocalBrandSyncer$syncBrandSpotLocked$1 realLocalBrandSyncer$syncBrandSpotLocked$122 = realLocalBrandSyncer$syncBrandSpotLocked$1;
        Object obj5 = realLocalBrandSyncer$syncBrandSpotLocked$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realLocalBrandSyncer$syncBrandSpotLocked$122.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj5;
        if (apiResult instanceof ApiResult.Success) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object syncBuyerInfo(BrandSpot brandSpot, ContinuationImpl continuationImpl) {
        RealLocalBrandSyncer$syncBuyerInfo$1 realLocalBrandSyncer$syncBuyerInfo$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof RealLocalBrandSyncer$syncBuyerInfo$1) {
            realLocalBrandSyncer$syncBuyerInfo$1 = (RealLocalBrandSyncer$syncBuyerInfo$1) continuationImpl;
            int i2 = realLocalBrandSyncer$syncBuyerInfo$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realLocalBrandSyncer$syncBuyerInfo$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realLocalBrandSyncer$syncBuyerInfo$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realLocalBrandSyncer$syncBuyerInfo$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!((FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options) ((RealFeatureFlagManager) this.featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$LocalBuyerInfoSync.INSTANCE)).enabled()) {
                        return Unit.INSTANCE;
                    }
                    String str = brandSpot.brandToken;
                    String str2 = brandSpot.locationToken;
                    GetBuyerInfoRequest getBuyerInfoRequest = new GetBuyerInfoRequest(str, str2 == null ? null : str2, null, null, ByteString.EMPTY);
                    realLocalBrandSyncer$syncBuyerInfo$1.L$0 = brandSpot;
                    realLocalBrandSyncer$syncBuyerInfo$1.label = 1;
                    obj = this.service.getBuyerInfo(getBuyerInfoRequest, realLocalBrandSyncer$syncBuyerInfo$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    brandSpot = realLocalBrandSyncer$syncBuyerInfo$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Success)) {
                    zzhz zzhzVar = ((GetBuyerInfoResponse) ((ApiResult.Success) apiResult).response).response;
                    if (zzhzVar instanceof GetBuyerInfoResponse$Response$ErrorResponse) {
                        Timber.Forest.e("Errors syncing buyer info: " + ((GetBuyerInfoResponse$Response$ErrorResponse) zzhzVar).value, new Object[0]);
                    } else if (zzhzVar instanceof GetBuyerInfoResponse$Response$BuyerInfo) {
                        GetBuyerInfoResponse.BuyerInfo buyerInfo = ((GetBuyerInfoResponse$Response$BuyerInfo) zzhzVar).value;
                        brandSpot.getClass();
                        buyerInfo.getClass();
                        LocalInMemoryDatabase.getOrPutFlow$default(this.localInMemoryDatabase.buyerInfos, brandSpot).tryEmit(buyerInfo);
                    } else if (zzhzVar != null) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                } else if (apiResult instanceof ApiResult.Failure.HttpFailure) {
                    Timber.Forest.e(Recorder$$ExternalSyntheticOutline1.m("HttpFailure syncing buyer info for ", ((ApiResult.Failure.HttpFailure) apiResult).code, BrandToken.m1229toStringimpl(brandSpot.brandToken), " [", "]"), new Object[0]);
                } else {
                    if (!(apiResult instanceof ApiResult.Failure.NetworkFailure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    Timber.Forest.e("NetworkFailure syncing buyer info for ".concat(BrandToken.m1229toStringimpl(brandSpot.brandToken)), new Object[0], ((ApiResult.Failure.NetworkFailure) apiResult).error);
                }
                return Unit.INSTANCE;
            }
        }
        realLocalBrandSyncer$syncBuyerInfo$1 = new RealLocalBrandSyncer$syncBuyerInfo$1(this, continuationImpl);
        Object obj2 = realLocalBrandSyncer$syncBuyerInfo$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realLocalBrandSyncer$syncBuyerInfo$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
    
        if (r6 == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0047, code lost:
    
        if (r7 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object syncLocalCashInformationalContent(ContinuationImpl continuationImpl) {
        RealLocalBrandSyncer$syncLocalCashInformationalContent$1 realLocalBrandSyncer$syncLocalCashInformationalContent$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof RealLocalBrandSyncer$syncLocalCashInformationalContent$1) {
            realLocalBrandSyncer$syncLocalCashInformationalContent$1 = (RealLocalBrandSyncer$syncLocalCashInformationalContent$1) continuationImpl;
            int i2 = realLocalBrandSyncer$syncLocalCashInformationalContent$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realLocalBrandSyncer$syncLocalCashInformationalContent$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realLocalBrandSyncer$syncLocalCashInformationalContent$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realLocalBrandSyncer$syncLocalCashInformationalContent$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    GetLocalCashDetailRequest getLocalCashDetailRequest = new GetLocalCashDetailRequest(null, ByteString.EMPTY);
                    realLocalBrandSyncer$syncLocalCashInformationalContent$1.label = 1;
                    obj = this.service.getLocalCashDetail(getLocalCashDetailRequest, realLocalBrandSyncer$syncLocalCashInformationalContent$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (apiResult instanceof ApiResult.Success) {
                    if (!(apiResult instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    ApiResult.Failure failure = (ApiResult.Failure) apiResult;
                    if (failure instanceof ApiResult.Failure.HttpFailure) {
                        Timber.Forest.e(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(((ApiResult.Failure.HttpFailure) apiResult).code, "HttpFailure fetching LocalCashDetail [", "]"), new Object[0]);
                    } else {
                        if (!(failure instanceof ApiResult.Failure.NetworkFailure)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        Timber.Forest forest = Timber.Forest;
                        Throwable th = ((ApiResult.Failure.NetworkFailure) apiResult).error;
                        forest.e(Recorder$$ExternalSyntheticOutline2.m("NetworkFailure fetching LocalCashDetail: ", ExceptionsKt__ExceptionsKt.stackTraceToString(th)), new Object[0], th);
                    }
                    return Unit.INSTANCE;
                }
                GetLocalCashDetailResponse getLocalCashDetailResponse = (GetLocalCashDetailResponse) ((ApiResult.Success) apiResult).response;
                realLocalBrandSyncer$syncLocalCashInformationalContent$1.label = 2;
                RealLocalInstalledStore realLocalInstalledStore = (RealLocalInstalledStore) this.store;
                Object withContext = JobKt.withContext(realLocalInstalledStore.ioDispatcher, new EventBridge$sendEvent$1(realLocalInstalledStore, getLocalCashDetailResponse, continuation, 11), realLocalBrandSyncer$syncLocalCashInformationalContent$1);
                if (withContext != coroutineSingletons) {
                    withContext = Unit.INSTANCE;
                }
            }
        }
        realLocalBrandSyncer$syncLocalCashInformationalContent$1 = new RealLocalBrandSyncer$syncLocalCashInformationalContent$1(this, continuationImpl);
        Object obj2 = realLocalBrandSyncer$syncLocalCashInformationalContent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realLocalBrandSyncer$syncLocalCashInformationalContent$1.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (apiResult instanceof ApiResult.Success) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00dd, code lost:
    
        if (r12 == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0079, code lost:
    
        if (r14 == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object syncLocalTab(boolean z, ContinuationImpl continuationImpl) {
        RealLocalBrandSyncer$syncLocalTab$1 realLocalBrandSyncer$syncLocalTab$1;
        int i;
        Object first;
        RealLocalBrandSyncer realLocalBrandSyncer;
        Object obj;
        int i2;
        long longValue;
        boolean z2;
        int i3;
        long j;
        ApiResult apiResult;
        if (continuationImpl instanceof RealLocalBrandSyncer$syncLocalTab$1) {
            realLocalBrandSyncer$syncLocalTab$1 = (RealLocalBrandSyncer$syncLocalTab$1) continuationImpl;
            int i4 = realLocalBrandSyncer$syncLocalTab$1.label;
            if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                realLocalBrandSyncer$syncLocalTab$1.label = i4 - PKIFailureInfo.systemUnavail;
                Object obj2 = realLocalBrandSyncer$syncLocalTab$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realLocalBrandSyncer$syncLocalTab$1.label;
                LocalInstalledStore localInstalledStore = this.store;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    if (z) {
                        first = new Long(0L);
                    } else {
                        RealLocalInstalledStore$hideBrands$$inlined$map$1 realLocalInstalledStore$hideBrands$$inlined$map$1 = new RealLocalInstalledStore$hideBrands$$inlined$map$1(((RealLocalInstalledStore) localInstalledStore).localTabContents, 19);
                        realLocalBrandSyncer$syncLocalTab$1.L$0 = this;
                        realLocalBrandSyncer$syncLocalTab$1.Z$0 = z;
                        realLocalBrandSyncer$syncLocalTab$1.I$0 = 0;
                        realLocalBrandSyncer$syncLocalTab$1.label = 1;
                        first = FlowKt.first(realLocalInstalledStore$hideBrands$$inlined$map$1, realLocalBrandSyncer$syncLocalTab$1);
                    }
                    realLocalBrandSyncer = this;
                    obj = first;
                    i2 = 0;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                SafeTrace.throwOnFailure(obj2);
                                return Unit.INSTANCE;
                            }
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        j = realLocalBrandSyncer$syncLocalTab$1.J$0;
                        i3 = realLocalBrandSyncer$syncLocalTab$1.I$0;
                        z2 = realLocalBrandSyncer$syncLocalTab$1.Z$0;
                        SafeTrace.throwOnFailure(obj2);
                        apiResult = (ApiResult) obj2;
                        if (apiResult instanceof ApiResult.Success) {
                            boolean z3 = apiResult instanceof ApiResult.Failure.HttpFailure;
                            Analytics analytics = this.analytics;
                            if (z3) {
                                Timber.Forest forest = Timber.Forest;
                                String simpleName = Reflection.factory.getOrCreateKotlinClass(GetNeighborhoodsTabContentResponse.class).getSimpleName();
                                int i5 = ((ApiResult.Failure.HttpFailure) apiResult).code;
                                forest.e(Recorder$$ExternalSyntheticOutline1.m("HttpFailure fetching ", i5, simpleName, " [", "]"), new Object[0]);
                                analytics.track(new LocalClientGetNeighborhoodsTabContentFailed(ErrorType.SERVER_ERROR, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i5, "HttpFailure [", "]")), null);
                            } else {
                                if (!(apiResult instanceof ApiResult.Failure.NetworkFailure)) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                Timber.Forest forest2 = Timber.Forest;
                                Throwable th = ((ApiResult.Failure.NetworkFailure) apiResult).error;
                                forest2.e(Recorder$$ExternalSyntheticOutline2.m("NetworkFailure fetching ", Reflection.factory.getOrCreateKotlinClass(GetNeighborhoodsTabContentResponse.class).getSimpleName()), new Object[0], th);
                                ErrorType errorType = ErrorType.NETWORK_ERROR;
                                String message = th.getMessage();
                                if (message == null) {
                                    message = "NetworkFailure";
                                }
                                analytics.track(new LocalClientGetNeighborhoodsTabContentFailed(errorType, message), null);
                            }
                        } else {
                            GetNeighborhoodsTabContentResponse getNeighborhoodsTabContentResponse = (GetNeighborhoodsTabContentResponse) ((ApiResult.Success) apiResult).response;
                            realLocalBrandSyncer$syncLocalTab$1.L$0 = null;
                            realLocalBrandSyncer$syncLocalTab$1.Z$0 = z2;
                            realLocalBrandSyncer$syncLocalTab$1.I$0 = i3;
                            realLocalBrandSyncer$syncLocalTab$1.J$0 = j;
                            realLocalBrandSyncer$syncLocalTab$1.label = 3;
                            RealLocalInstalledStore realLocalInstalledStore = (RealLocalInstalledStore) localInstalledStore;
                            Object withContext = JobKt.withContext(realLocalInstalledStore.ioDispatcher, new EventBridge$sendEvent$1(realLocalInstalledStore, getNeighborhoodsTabContentResponse, continuation, 12), realLocalBrandSyncer$syncLocalTab$1);
                            if (withContext != coroutineSingletons) {
                                withContext = Unit.INSTANCE;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    int i6 = realLocalBrandSyncer$syncLocalTab$1.I$0;
                    boolean z4 = realLocalBrandSyncer$syncLocalTab$1.Z$0;
                    realLocalBrandSyncer = realLocalBrandSyncer$syncLocalTab$1.L$0;
                    SafeTrace.throwOnFailure(obj2);
                    i2 = i6;
                    z = z4;
                    obj = obj2;
                }
                longValue = ((Number) obj).longValue();
                if (Instant.ofEpochMilli(longValue).compareTo(DimensionKt.now(realLocalBrandSyncer.clock)) <= 0) {
                    GetNeighborhoodsTabContentRequest getNeighborhoodsTabContentRequest = new GetNeighborhoodsTabContentRequest(ByteString.EMPTY);
                    realLocalBrandSyncer$syncLocalTab$1.L$0 = null;
                    realLocalBrandSyncer$syncLocalTab$1.Z$0 = z;
                    realLocalBrandSyncer$syncLocalTab$1.I$0 = i2;
                    realLocalBrandSyncer$syncLocalTab$1.J$0 = longValue;
                    realLocalBrandSyncer$syncLocalTab$1.label = 2;
                    Object neighborhoodsTabContent = this.service.getNeighborhoodsTabContent(getNeighborhoodsTabContentRequest, realLocalBrandSyncer$syncLocalTab$1);
                    if (neighborhoodsTabContent != coroutineSingletons) {
                        z2 = z;
                        i3 = i2;
                        obj2 = neighborhoodsTabContent;
                        j = longValue;
                        apiResult = (ApiResult) obj2;
                        if (apiResult instanceof ApiResult.Success) {
                        }
                    }
                    return coroutineSingletons;
                }
                return Unit.INSTANCE;
            }
        }
        realLocalBrandSyncer$syncLocalTab$1 = new RealLocalBrandSyncer$syncLocalTab$1(this, continuationImpl);
        Object obj22 = realLocalBrandSyncer$syncLocalTab$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realLocalBrandSyncer$syncLocalTab$1.label;
        LocalInstalledStore localInstalledStore2 = this.store;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        longValue = ((Number) obj).longValue();
        if (Instant.ofEpochMilli(longValue).compareTo(DimensionKt.now(realLocalBrandSyncer.clock)) <= 0) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object syncLocationStatuses(Set set, ContinuationImpl continuationImpl) {
        RealLocalBrandSyncer$syncLocationStatuses$1 realLocalBrandSyncer$syncLocationStatuses$1;
        int i;
        ApiResult apiResult;
        BrandSpot brandSpot;
        if (continuationImpl instanceof RealLocalBrandSyncer$syncLocationStatuses$1) {
            realLocalBrandSyncer$syncLocationStatuses$1 = (RealLocalBrandSyncer$syncLocationStatuses$1) continuationImpl;
            int i2 = realLocalBrandSyncer$syncLocationStatuses$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realLocalBrandSyncer$syncLocationStatuses$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realLocalBrandSyncer$syncLocationStatuses$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realLocalBrandSyncer$syncLocationStatuses$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (set.isEmpty()) {
                        return Unit.INSTANCE;
                    }
                    Set<BrandSpot> set2 = set;
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(set2, 10));
                    for (BrandSpot brandSpot2 : set2) {
                        String str = brandSpot2.brandToken;
                        String str2 = brandSpot2.locationToken;
                        if (str2 == null) {
                            str2 = null;
                        }
                        arrayList.add(new BatchGetLocationStatusRequest.GetLocationStatusRequest(str, str2, ByteString.EMPTY));
                    }
                    BatchGetLocationStatusRequest batchGetLocationStatusRequest = new BatchGetLocationStatusRequest(arrayList, ByteString.EMPTY);
                    realLocalBrandSyncer$syncLocationStatuses$1.L$0 = set;
                    realLocalBrandSyncer$syncLocationStatuses$1.label = 1;
                    obj = this.service.batchGetLocationStatus(batchGetLocationStatusRequest, realLocalBrandSyncer$syncLocationStatuses$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    set = realLocalBrandSyncer$syncLocationStatuses$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Success)) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Object obj2 : set) {
                        BrandToken brandToken = new BrandToken(((BrandSpot) obj2).brandToken);
                        Object obj3 = linkedHashMap.get(brandToken);
                        if (obj3 == null) {
                            obj3 = new ArrayList();
                            linkedHashMap.put(brandToken, obj3);
                        }
                        ((List) obj3).add(obj2);
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(linkedHashMap.size()));
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        Object key = entry.getKey();
                        List list = (List) entry.getValue();
                        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            String str3 = ((BrandSpot) it.next()).locationToken;
                            arrayList2.add(str3 != null ? new LocationToken(str3) : null);
                        }
                        linkedHashMap2.put(key, CollectionsKt.toSet(arrayList2));
                    }
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                        Set set3 = (Set) entry2.getValue();
                        if (set3.size() == 1 && CollectionsKt.single(set3) == null) {
                            linkedHashMap3.put(entry2.getKey(), entry2.getValue());
                        }
                    }
                    Set keySet = linkedHashMap3.keySet();
                    for (BatchGetLocationStatusResponse.GetLocationStatusResponse getLocationStatusResponse : ((BatchGetLocationStatusResponse) ((ApiResult.Success) apiResult).response).responses) {
                        String str4 = getLocationStatusResponse.brand_token;
                        str4.getClass();
                        if (keySet.contains(new BrandToken(str4))) {
                            brandSpot = new BrandSpot(str4, null);
                        } else {
                            String str5 = getLocationStatusResponse.location_token;
                            if (str5 == null) {
                                str5 = null;
                            }
                            brandSpot = new BrandSpot(str4, str5);
                        }
                        LocalOpenStatus localOpenStatus = getLocationStatusResponse.open_status;
                        if (localOpenStatus == null) {
                            localOpenStatus = LocalOpenStatus.LOCAL_OPEN_STATUS_UNSPECIFIED;
                        }
                        int i3 = LocationStatusKt$WhenMappings.$EnumSwitchMapping$0[localOpenStatus.ordinal()];
                        Object obj4 = LocationStatus$Unspecified.INSTANCE;
                        if (i3 != 1) {
                            if (i3 == 2) {
                                obj4 = LocationStatus$Closed.INSTANCE;
                            } else if (i3 == 3) {
                                obj4 = LocationStatus$Open24Hours.INSTANCE;
                            } else {
                                if (i3 != 4) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                final LocalOpenHours localOpenHours = getLocationStatusResponse.open_hours;
                                if (localOpenHours != null) {
                                    String str6 = getLocationStatusResponse.time_zone;
                                    str6.getClass();
                                    final ZoneId of = ZoneId.of(str6);
                                    of.getClass();
                                    obj4 = new Object(localOpenHours, of) { // from class: app.cash.local.primitives.LocationStatus$Hours
                                        public final LocalOpenHours hours;
                                        public final ZoneId zoneId;

                                        {
                                            localOpenHours.getClass();
                                            of.getClass();
                                            this.hours = localOpenHours;
                                            this.zoneId = of;
                                        }

                                        public final boolean equals(Object obj5) {
                                            if (this == obj5) {
                                                return true;
                                            }
                                            if (!(obj5 instanceof LocationStatus$Hours)) {
                                                return false;
                                            }
                                            LocationStatus$Hours locationStatus$Hours = (LocationStatus$Hours) obj5;
                                            return Intrinsics.areEqual(this.hours, locationStatus$Hours.hours) && Intrinsics.areEqual(this.zoneId, locationStatus$Hours.zoneId);
                                        }

                                        public final int hashCode() {
                                            return this.zoneId.hashCode() + (this.hours.hashCode() * 31);
                                        }

                                        public final String toString() {
                                            return "Hours(hours=" + this.hours + ", zoneId=" + this.zoneId + ")";
                                        }
                                    };
                                }
                            }
                        }
                        LocalInMemoryDatabase.getOrPutFlow$default(this.localInMemoryDatabase.locationStatuses, brandSpot).tryEmit(obj4);
                    }
                } else {
                    if (!(apiResult instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    ApiResult.Failure failure = (ApiResult.Failure) apiResult;
                    if (failure instanceof ApiResult.Failure.HttpFailure) {
                        Timber.Forest.e(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(((ApiResult.Failure.HttpFailure) apiResult).code, "HttpFailure fetching batchGetLocationStatus [", "]"), new Object[0]);
                    } else {
                        if (!(failure instanceof ApiResult.Failure.NetworkFailure)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        Timber.Forest forest = Timber.Forest;
                        Throwable th = ((ApiResult.Failure.NetworkFailure) apiResult).error;
                        forest.e(Recorder$$ExternalSyntheticOutline2.m("NetworkFailure fetching batchGetLocationStatus: ", ExceptionsKt__ExceptionsKt.stackTraceToString(th)), new Object[0], th);
                    }
                }
                return Unit.INSTANCE;
            }
        }
        realLocalBrandSyncer$syncLocationStatuses$1 = new RealLocalBrandSyncer$syncLocationStatuses$1(this, continuationImpl);
        Object obj5 = realLocalBrandSyncer$syncLocationStatuses$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realLocalBrandSyncer$syncLocationStatuses$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj5;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d7, code lost:
    
        if (r0 == r3) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object syncMarketScreen(ContinuationImpl continuationImpl) {
        RealLocalBrandSyncer$syncMarketScreen$1 realLocalBrandSyncer$syncMarketScreen$1;
        int i;
        RealLocalBrandSyncer realLocalBrandSyncer;
        int i2;
        long longValue;
        int i3;
        long j;
        ApiResult apiResult;
        if (continuationImpl instanceof RealLocalBrandSyncer$syncMarketScreen$1) {
            realLocalBrandSyncer$syncMarketScreen$1 = (RealLocalBrandSyncer$syncMarketScreen$1) continuationImpl;
            int i4 = realLocalBrandSyncer$syncMarketScreen$1.label;
            if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                realLocalBrandSyncer$syncMarketScreen$1.label = i4 - PKIFailureInfo.systemUnavail;
                Object obj = realLocalBrandSyncer$syncMarketScreen$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realLocalBrandSyncer$syncMarketScreen$1.label;
                LocalInstalledStore localInstalledStore = this.store;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealLocalInstalledStore$hideBrands$$inlined$map$1 realLocalInstalledStore$hideBrands$$inlined$map$1 = new RealLocalInstalledStore$hideBrands$$inlined$map$1(((RealLocalInstalledStore) localInstalledStore).screens, 20);
                    realLocalBrandSyncer$syncMarketScreen$1.L$0 = this;
                    realLocalBrandSyncer$syncMarketScreen$1.I$0 = 0;
                    realLocalBrandSyncer$syncMarketScreen$1.label = 1;
                    obj = FlowKt.first(realLocalInstalledStore$hideBrands$$inlined$map$1, realLocalBrandSyncer$syncMarketScreen$1);
                    if (obj != coroutineSingletons) {
                        realLocalBrandSyncer = this;
                        i2 = 0;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = realLocalBrandSyncer$syncMarketScreen$1.J$0;
                    i3 = realLocalBrandSyncer$syncMarketScreen$1.I$0;
                    SafeTrace.throwOnFailure(obj);
                    apiResult = (ApiResult) obj;
                    if (!(apiResult instanceof ApiResult.Success)) {
                        GetMarketScreenDataResponse getMarketScreenDataResponse = (GetMarketScreenDataResponse) ((ApiResult.Success) apiResult).response;
                        MarketTilesScreen marketTilesScreen = getMarketScreenDataResponse.market_tiles_screen;
                        Long l = getMarketScreenDataResponse.expires_at;
                        long longValue2 = l != null ? l.longValue() : 0L;
                        realLocalBrandSyncer$syncMarketScreen$1.L$0 = null;
                        realLocalBrandSyncer$syncMarketScreen$1.I$0 = i3;
                        realLocalBrandSyncer$syncMarketScreen$1.J$0 = j;
                        realLocalBrandSyncer$syncMarketScreen$1.label = 3;
                        RealLocalInstalledStore realLocalInstalledStore = (RealLocalInstalledStore) localInstalledStore;
                        Object withContext = JobKt.withContext(realLocalInstalledStore.ioDispatcher, new FlashControl$applyScreenFlash$2(realLocalInstalledStore, marketTilesScreen, longValue2, (Continuation) null, 1), realLocalBrandSyncer$syncMarketScreen$1);
                        if (withContext != coroutineSingletons) {
                            withContext = Unit.INSTANCE;
                        }
                    } else if (apiResult instanceof ApiResult.Failure.HttpFailure) {
                        Timber.Forest.e(Recorder$$ExternalSyntheticOutline1.m("HttpFailure fetching ", ((ApiResult.Failure.HttpFailure) apiResult).code, Reflection.factory.getOrCreateKotlinClass(GetMarketScreenDataResponse.class).getSimpleName(), " [", "]"), new Object[0]);
                    } else {
                        if (!(apiResult instanceof ApiResult.Failure.NetworkFailure)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        Timber.Forest.e(Recorder$$ExternalSyntheticOutline2.m("NetworkFailure fetching ", Reflection.factory.getOrCreateKotlinClass(GetMarketScreenDataResponse.class).getSimpleName()), new Object[0], ((ApiResult.Failure.NetworkFailure) apiResult).error);
                    }
                    return Unit.INSTANCE;
                }
                i2 = realLocalBrandSyncer$syncMarketScreen$1.I$0;
                realLocalBrandSyncer = realLocalBrandSyncer$syncMarketScreen$1.L$0;
                SafeTrace.throwOnFailure(obj);
                longValue = ((Number) obj).longValue();
                if (Instant.ofEpochMilli(longValue).compareTo(DimensionKt.now(realLocalBrandSyncer.clock)) <= 0) {
                    GetMarketScreenDataRequest getMarketScreenDataRequest = new GetMarketScreenDataRequest(null, ByteString.EMPTY);
                    realLocalBrandSyncer$syncMarketScreen$1.L$0 = null;
                    realLocalBrandSyncer$syncMarketScreen$1.I$0 = i2;
                    realLocalBrandSyncer$syncMarketScreen$1.J$0 = longValue;
                    realLocalBrandSyncer$syncMarketScreen$1.label = 2;
                    obj = this.service.getMarketScreenData(getMarketScreenDataRequest, realLocalBrandSyncer$syncMarketScreen$1);
                    if (obj != coroutineSingletons) {
                        i3 = i2;
                        j = longValue;
                        apiResult = (ApiResult) obj;
                        if (!(apiResult instanceof ApiResult.Success)) {
                        }
                    }
                    return coroutineSingletons;
                }
                return Unit.INSTANCE;
            }
        }
        realLocalBrandSyncer$syncMarketScreen$1 = new RealLocalBrandSyncer$syncMarketScreen$1(this, continuationImpl);
        Object obj2 = realLocalBrandSyncer$syncMarketScreen$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realLocalBrandSyncer$syncMarketScreen$1.label;
        LocalInstalledStore localInstalledStore2 = this.store;
        if (i != 0) {
        }
        longValue = ((Number) obj2).longValue();
        if (Instant.ofEpochMilli(longValue).compareTo(DimensionKt.now(realLocalBrandSyncer.clock)) <= 0) {
        }
        return Unit.INSTANCE;
    }
}
