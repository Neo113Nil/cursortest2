package com.squareup.cash.braze;

import android.content.Context;
import android.content.SharedPreferences;
import app.cash.sqldelight.db.AfterVersion;
import app.cash.sqldelight.driver.android.AndroidSqliteDriver;
import coil3.RealImageLoader;
import com.braze.Braze;
import com.braze.configuration.BrazeConfig;
import com.google.crypto.tink.KeysetHandle;
import com.google.mlkit.common.internal.zza;
import com.google.mlkit.common.internal.zzb;
import com.google.mlkit.common.internal.zzc;
import com.google.mlkit.common.internal.zzd;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.attribution.ConversionListener;
import com.squareup.cash.bitcoin.navigation.RealBitcoinInboundNavigator$Factory$Impl;
import com.squareup.cash.bitcoin.presenters.sell.SellBitcoinNavigator;
import com.squareup.cash.blockers.presenters.EarnerOnboardingAnalytics;
import com.squareup.cash.blockers.treehouse.TreehouseBlockerScreenMapper;
import com.squareup.cash.blockers.web.delegates.RealWebViewBlockerCookieManager;
import com.squareup.cash.businessaccount.backend.real.RealBusinessProfileManager;
import com.squareup.cash.card.onboarding.PdpNotifiedPreference;
import com.squareup.cash.checks.CheckDepositUiFactory;
import com.squareup.cash.clientroutes.DeepLinksConfig;
import com.squareup.cash.clientroutes.RealClientRouteFormatter;
import com.squareup.cash.clientroutes.RealDeepLinkParser;
import com.squareup.cash.clientrouting.RealBTCxClientRouterLogger;
import com.squareup.cash.clientrouting.validation.LoginStateValidator;
import com.squareup.cash.clientsync.MultiplatformEntitySyncer;
import com.squareup.cash.clientsync.ResponseContextProcessors;
import com.squareup.cash.clientsync.database.AndroidDatabaseFactory$createDriver$1;
import com.squareup.cash.clientsync.database.ClientSyncDatabaseImpl;
import com.squareup.cash.clientsync.network.RealClientSyncResponseContextProcessor;
import com.squareup.cash.clientsync.persistence.SqlClientSyncTransactor;
import com.squareup.cash.clientsync.persistence.SqlComponentMigrationStore;
import com.squareup.cash.clientsync.persistence.SqlSyncEntityStore;
import com.squareup.cash.clientsync.persistence.SqlSyncRangeStore;
import com.squareup.cash.clientsync.pipeline.CustomerSyncEntityStorageObserver;
import com.squareup.cash.clientsync.pipeline.ResetTracingObserver;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.clientsync.telemetry.RealClientSyncTracer;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.db.StorageLinkQueries$$ExternalSyntheticLambda8;
import com.squareup.cash.db.WireAdapter;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.limits.views.LimitsViewFactory;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.recipients.data.RealCustomerStore;
import com.squareup.cash.score.views.ScoreUiFactory;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.webview.android.AndroidCookieManager;
import com.squareup.wire.GrpcClient;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;

/* loaded from: classes.dex */
public final class RealBrazeConfigurator implements BrazeConfigurator {
    public final AtomicBoolean configured = new AtomicBoolean(false);
    public final Context context;

    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId;
        public final Provider context;

        public /* synthetic */ MetroFactory(Provider provider, int i) {
            this.$r8$classId = i;
            this.context = provider;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = this.$r8$classId;
            int i2 = 2;
            int i3 = 0;
            int i4 = 29;
            Provider provider = this.context;
            switch (i) {
                case 0:
                    Context context = (Context) provider.invoke();
                    context.getClass();
                    return new RealBrazeConfigurator(context);
                case 1:
                    RealBitcoinInboundNavigator$Factory$Impl realBitcoinInboundNavigator$Factory$Impl = (RealBitcoinInboundNavigator$Factory$Impl) provider.invoke();
                    realBitcoinInboundNavigator$Factory$Impl.getClass();
                    return new SellBitcoinNavigator(realBitcoinInboundNavigator$Factory$Impl);
                case 2:
                    RealImageLoader realImageLoader = (RealImageLoader) provider.invoke();
                    realImageLoader.getClass();
                    return new ScoreUiFactory(realImageLoader, i2);
                case 3:
                    Analytics analytics = (Analytics) provider.invoke();
                    analytics.getClass();
                    return new EarnerOnboardingAnalytics(analytics);
                case 4:
                    FlowStarter flowStarter = (FlowStarter) provider.invoke();
                    flowStarter.getClass();
                    return new TreehouseBlockerScreenMapper(flowStarter);
                case 5:
                    BlockersDataNavigator blockersDataNavigator = (BlockersDataNavigator) provider.invoke();
                    blockersDataNavigator.getClass();
                    return new KeysetHandle(blockersDataNavigator);
                case 6:
                    AndroidCookieManager androidCookieManager = new AndroidCookieManager();
                    AndroidClock androidClock = (AndroidClock) provider.invoke();
                    androidClock.getClass();
                    return new RealWebViewBlockerCookieManager(androidCookieManager, androidClock);
                case 7:
                    SyncValueReader syncValueReader = (SyncValueReader) provider.invoke();
                    syncValueReader.getClass();
                    return new RealBusinessProfileManager(syncValueReader);
                case 8:
                    Analytics analytics2 = (Analytics) provider.invoke();
                    analytics2.getClass();
                    return new ConversionListener(analytics2);
                case 9:
                    RealImageLoader realImageLoader2 = (RealImageLoader) provider.invoke();
                    realImageLoader2.getClass();
                    return new LimitsViewFactory(realImageLoader2, 1);
                case 10:
                    SharedPreferences sharedPreferences = (SharedPreferences) provider.invoke();
                    sharedPreferences.getClass();
                    return new PdpNotifiedPreference(sharedPreferences);
                case 11:
                    RealImageLoader realImageLoader3 = (RealImageLoader) provider.invoke();
                    realImageLoader3.getClass();
                    return new LimitsViewFactory(realImageLoader3, i2);
                case 12:
                    RealCashVibrator realCashVibrator = (RealCashVibrator) provider.invoke();
                    realCashVibrator.getClass();
                    return new CheckDepositUiFactory(realCashVibrator, i3);
                case 13:
                    RealClientRouteFormatter realClientRouteFormatter = (RealClientRouteFormatter) provider.invoke();
                    realClientRouteFormatter.getClass();
                    return new StorageLinkQueries$$ExternalSyntheticLambda8(realClientRouteFormatter, 4);
                case 14:
                    DeepLinksConfig deepLinksConfig = (DeepLinksConfig) provider.invoke();
                    deepLinksConfig.getClass();
                    return new RealDeepLinkParser(deepLinksConfig);
                case 15:
                    ((ErrorReporter) provider.invoke()).getClass();
                    return new RealBTCxClientRouterLogger();
                case 16:
                    SessionManager sessionManager = (SessionManager) provider.invoke();
                    sessionManager.getClass();
                    return new WireAdapter(sessionManager);
                case 17:
                    SessionManager sessionManager2 = (SessionManager) provider.invoke();
                    sessionManager2.getClass();
                    return new LoginStateValidator(sessionManager2);
                case 18:
                    SessionManager sessionManager3 = (SessionManager) provider.invoke();
                    zza zzaVar = new zza(i4);
                    sessionManager3.getClass();
                    return new LoginStateValidator(sessionManager3, zzaVar);
                case 19:
                    provider.getClass();
                    return new MultiplatformEntitySyncer(provider instanceof Lazy ? (Lazy) provider : new DoubleCheck(provider));
                case 20:
                    RealClientSyncResponseContextProcessor realClientSyncResponseContextProcessor = (RealClientSyncResponseContextProcessor) provider.invoke();
                    realClientSyncResponseContextProcessor.getClass();
                    return new ResponseContextProcessors(realClientSyncResponseContextProcessor);
                case 21:
                    ClientSyncDatabaseImpl clientSyncDatabaseImpl = (ClientSyncDatabaseImpl) provider.invoke();
                    clientSyncDatabaseImpl.getClass();
                    return new KeysetHandle(clientSyncDatabaseImpl);
                case 22:
                    GrpcClient grpcClient = (GrpcClient) provider.invoke();
                    grpcClient.getClass();
                    return new WireAdapter(grpcClient);
                case 23:
                    RealCustomerStore realCustomerStore = (RealCustomerStore) provider.invoke();
                    realCustomerStore.getClass();
                    return new CustomerSyncEntityStorageObserver(realCustomerStore);
                case 24:
                    ClientSyncDatabaseImpl clientSyncDatabaseImpl2 = (ClientSyncDatabaseImpl) provider.invoke();
                    clientSyncDatabaseImpl2.getClass();
                    return new SqlComponentMigrationStore(clientSyncDatabaseImpl2);
                case 25:
                    Context context2 = (Context) provider.invoke();
                    context2.getClass();
                    ReflectionFactory reflectionFactory = Reflection.factory;
                    reflectionFactory.getOrCreateKotlinClass(ClientSyncDatabaseImpl.class);
                    reflectionFactory.getOrCreateKotlinClass(ClientSyncDatabaseImpl.class);
                    ClientSyncDatabaseImpl.Schema schema = ClientSyncDatabaseImpl.Schema.INSTANCE;
                    AndroidSqliteDriver androidSqliteDriver = new AndroidSqliteDriver(schema, context2, "clientsync.db", new AndroidDatabaseFactory$createDriver$1(schema, new AfterVersion[0]), EnumC0170g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE);
                    zzb zzbVar = new zzb(29);
                    zzc zzcVar = new zzc(i4);
                    reflectionFactory.getOrCreateKotlinClass(ClientSyncDatabaseImpl.class);
                    return new ClientSyncDatabaseImpl(androidSqliteDriver, zzbVar, zzcVar);
                case 26:
                    ClientSyncDatabaseImpl clientSyncDatabaseImpl3 = (ClientSyncDatabaseImpl) provider.invoke();
                    zzd zzdVar = new zzd(29);
                    clientSyncDatabaseImpl3.getClass();
                    return new SqlSyncEntityStore(clientSyncDatabaseImpl3, zzdVar);
                case 27:
                    ClientSyncDatabaseImpl clientSyncDatabaseImpl4 = (ClientSyncDatabaseImpl) provider.invoke();
                    clientSyncDatabaseImpl4.getClass();
                    return new SqlSyncRangeStore(clientSyncDatabaseImpl4);
                case 28:
                    ClientSyncDatabaseImpl clientSyncDatabaseImpl5 = (ClientSyncDatabaseImpl) provider.invoke();
                    clientSyncDatabaseImpl5.getClass();
                    return new SqlClientSyncTransactor(clientSyncDatabaseImpl5, i3);
                default:
                    RealClientSyncTracer realClientSyncTracer = (RealClientSyncTracer) provider.invoke();
                    realClientSyncTracer.getClass();
                    return new ResetTracingObserver(realClientSyncTracer);
            }
        }
    }

    public RealBrazeConfigurator(Context context) {
        this.context = context;
    }

    public final boolean configure() {
        AtomicBoolean atomicBoolean = this.configured;
        if (atomicBoolean.get()) {
            return true;
        }
        BrazeConfig.Builder builder = new BrazeConfig.Builder();
        Context context = this.context;
        String string2 = context.getString(R.string.braze_api_key);
        string2.getClass();
        BrazeConfig.Builder apiKey = builder.setApiKey(string2);
        String string3 = context.getString(R.string.braze_endpoint);
        string3.getClass();
        BrazeConfig build = apiKey.setCustomEndpoint(string3).setSessionTimeout(60).setHandlePushDeepLinksAutomatically(true).setGreatNetworkDataFlushInterval(10).setIsFirebaseCloudMessagingRegistrationEnabled(true).setFirebaseCloudMessagingSenderIdKey("146513644742").setSmallNotificationIcon("braze_notification_icon").setDefaultNotificationAccentColor(-16009676).build();
        Braze.Companion companion = Braze.INSTANCE;
        boolean configure = companion.configure(context, build);
        if (configure) {
            companion.disableDelayedInitialization(context);
            atomicBoolean.set(true);
        }
        return configure;
    }
}
