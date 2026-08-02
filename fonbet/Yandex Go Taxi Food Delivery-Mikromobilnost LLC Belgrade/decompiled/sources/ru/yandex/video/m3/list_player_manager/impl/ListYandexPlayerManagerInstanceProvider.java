package ru.yandex.video.m3.list_player_manager.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.media3.common.PriorityTaskManager;
import defpackage.bvf0;
import defpackage.cvw;
import defpackage.g050;
import defpackage.g221;
import defpackage.gtq0;
import defpackage.jl40;
import defpackage.kva1;
import defpackage.l8x;
import defpackage.lse;
import defpackage.mdh;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qhw0;
import defpackage.seu;
import defpackage.sjh;
import defpackage.sls;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.uyj;
import defpackage.yko;
import defpackage.zko;
import defpackage.zy11;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref$ObjectRef;
import okhttp3.OkHttpClient;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.ab.YandexPlayerAbConfigManager;
import ru.yandex.video.m3.ab.config.AbConfig;
import ru.yandex.video.m3.ab.util.UtilKt;
import ru.yandex.video.m3.config.AccountProvider;
import ru.yandex.video.m3.data.dto.JsonConverterImpl;
import ru.yandex.video.m3.debug.DebugViewToggleManager;
import ru.yandex.video.m3.debug.DebugViewToggleManagerImpl;
import ru.yandex.video.m3.debug.InitMediaItemManager;
import ru.yandex.video.m3.debug.ListSdkDebugDataManagerImpl;
import ru.yandex.video.m3.list_player_manager.ListYandexPlayerManager;
import ru.yandex.video.m3.list_player_manager.LogcatAndDebugReportPlayerLogger;
import ru.yandex.video.m3.list_player_manager.impl.audio.ListPlayerManagerAudioControlImpl;
import ru.yandex.video.m3.list_player_manager.impl.data.VideoDataRepository;
import ru.yandex.video.m3.list_player_manager.impl.ext_provider.ExternalMediaDataToVideoDataMapper;
import ru.yandex.video.m3.list_player_manager.impl.pool.Config;
import ru.yandex.video.m3.list_player_manager.impl.pool.YandexPlayerFactoryImpl;
import ru.yandex.video.m3.list_player_manager.impl.pool.YandexPlayerPool;
import ru.yandex.video.m3.list_player_manager.impl.preload.DefaultPreloadErrorHandler;
import ru.yandex.video.m3.list_player_manager.impl.preload.VideoDataPreloadManager;
import ru.yandex.video.m3.list_player_manager.impl.preload.cache.DataCache;
import ru.yandex.video.m3.list_player_manager.impl.telemetry.ListPlayerManagerEventTracker;
import ru.yandex.video.m3.list_player_manager.impl.telemetry.ListViewTelemetryRegistry;
import ru.yandex.video.m3.list_player_manager.impl.ypfactories.BitmapDownloaderFactory;
import ru.yandex.video.m3.list_player_manager.impl.ypfactories.DefaultFirstFrameCacheFactory;
import ru.yandex.video.m3.list_player_manager.impl.ypfactories.DefaultOkHttpClientFactory;
import ru.yandex.video.m3.list_player_manager.impl.ypfactories.DefaultPreloadManagerFactory;
import ru.yandex.video.m3.list_player_manager.impl.ypfactories.DefaultStrmTrackingApiFactory;
import ru.yandex.video.m3.list_player_manager.impl.ypfactories.DefaultTrackingArgumentsFactory;
import ru.yandex.video.m3.list_player_manager.impl.ypfactories.DefaultVideoDataCacheFactory;
import ru.yandex.video.m3.list_player_manager.impl.ypfactories.DefaultVideoDataPreloadManagerFactory;
import ru.yandex.video.m3.list_player_manager.impl.ypfactories.DefaultVideoDataRepositoryFactory;
import ru.yandex.video.m3.list_player_manager.impl.ypfactories.InternalVideoDataRepositoryFactory;
import ru.yandex.video.m3.list_player_manager.model.EngineCount;
import ru.yandex.video.m3.list_player_manager.model.FirstFrameData;
import ru.yandex.video.m3.list_player_manager.model.InitFlags;
import ru.yandex.video.m3.model.config.loadcontrol.LoadControlConfig;
import ru.yandex.video.m3.model.config.loadcontrol.LoadControlConfigKt;
import ru.yandex.video.m3.ott.data.dto.VhVideoData;
import ru.yandex.video.m3.player.SimpleIndexGenerator;
import ru.yandex.video.m3.player.impl.tracking.StrmTrackingApi;
import ru.yandex.video.m3.player.impl.tracking.TrackingCommonArguments;
import ru.yandex.video.m3.player.impl.trackselection.DisplaySizeTargetFormatProvider;
import ru.yandex.video.m3.player.impl.utils.InfoProviderImpl;
import ru.yandex.video.m3.player.impl.utils.SystemTimeProvider;
import ru.yandex.video.m3.player.impl.utils.VsidGenerator;
import ru.yandex.video.m3.player.report.builder.ReportBuilder;
import ru.yandex.video.m3.player.report.builder.ReportBuilderExtKt;
import ru.yandex.video.m3.player.utils.PlayerLogger;
import ru.yandex.video.m3.player.utils.PlayerLoggerExtensionsKt;
import ru.yandex.video.m3.player.utils.coroutine.CoroutineQueue;
import ru.yandex.video.m3.preload_manager.cache.PreloadCacheProvider;
import ru.yandex.video.m3.preload_manager.cache.PreloadCacheProviderKt;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ%\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0017\u001a\u00020\u0016*\u00020\u00152\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f*\u00020\u00152\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00100\u001b*\u00020\u00152\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u001e\u0010\u0003J\u0011\u0010!\u001a\u00020 *\u00020\u0015¢\u0006\u0004\b!\u0010\"J\u0011\u0010#\u001a\u00020\u0010*\u00020\u0015¢\u0006\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020(8\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010*R\u0018\u0010.\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010/\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00102\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00105\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00107\u001a\u00020%8\u0002X\u0082T¢\u0006\u0006\n\u0004\b7\u0010'R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u001a\u0010;\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\f\n\u0004\b;\u0010<\u0012\u0004\b=\u0010\u0003R\u0014\u0010@\u001a\u00020 8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0016\u0010C\u001a\u0004\u0018\u0001018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bA\u0010B¨\u0006D"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/ListYandexPlayerManagerInstanceProvider;", "", "<init>", "()V", "Ltse;", "setupScope", "()Ltse;", "scope", "Lru/yandex/video/m3/list_player_manager/impl/WorkHelper;", "setupWorkHelper", "(Ltse;)Lru/yandex/video/m3/list_player_manager/impl/WorkHelper;", "Landroid/content/Context;", "context", "Lru/yandex/video/m3/list_player_manager/impl/InitParameters;", "params", "Lnoh;", "Lru/yandex/video/m3/list_player_manager/ListYandexPlayerManager;", "initializeAsyncInternal", "(Landroid/content/Context;Lru/yandex/video/m3/list_player_manager/impl/InitParameters;)Lnoh;", "initializeInternal", "(Landroid/content/Context;Lru/yandex/video/m3/list_player_manager/impl/InitParameters;)Lru/yandex/video/m3/list_player_manager/ListYandexPlayerManager;", "Lru/yandex/video/m3/list_player_manager/ListYandexPlayerManager$Companion;", "Lzy11;", "initialize", "(Lru/yandex/video/m3/list_player_manager/ListYandexPlayerManager$Companion;Landroid/content/Context;Lru/yandex/video/m3/list_player_manager/impl/InitParameters;)V", "initializeAsync", "(Lru/yandex/video/m3/list_player_manager/ListYandexPlayerManager$Companion;Landroid/content/Context;Lru/yandex/video/m3/list_player_manager/impl/InitParameters;)Lnoh;", "Ljava/util/concurrent/Future;", "initializeFuture", "(Lru/yandex/video/m3/list_player_manager/ListYandexPlayerManager$Companion;Landroid/content/Context;Lru/yandex/video/m3/list_player_manager/impl/InitParameters;)Ljava/util/concurrent/Future;", "release$video_player_internalRelease", "release", "", "isInitialised", "(Lru/yandex/video/m3/list_player_manager/ListYandexPlayerManager$Companion;)Z", "get", "(Lru/yandex/video/m3/list_player_manager/ListYandexPlayerManager$Companion;)Lru/yandex/video/m3/list_player_manager/ListYandexPlayerManager;", "", "NO_INSTANCE_MESSAGE", "Ljava/lang/String;", "", "PICTURE_PRELOAD_COUNT", CA20Status.STATUS_USER_I, "DEFAULT_PLAYER_POOL_SIZE", "INSTANCE$1", "Lru/yandex/video/m3/list_player_manager/ListYandexPlayerManager;", "INSTANCE", "FAILFAST", "Z", "Lru/yandex/video/m3/list_player_manager/impl/telemetry/ListViewTelemetryRegistry;", "LIST_VIEW_TELEMETRY", "Lru/yandex/video/m3/list_player_manager/impl/telemetry/ListViewTelemetryRegistry;", "Lru/yandex/video/m3/preload_manager/cache/PreloadCacheProvider;", "CACHE_PROVIDER", "Lru/yandex/video/m3/preload_manager/cache/PreloadCacheProvider;", "TAG", "Lg050;", "mutex", "Lg050;", "initScope", "Ltse;", "getInitScope$annotations", "isFailFast$video_player_internalRelease", "()Z", "isFailFast", "getListViewTelemetryRegistry$video_player_internalRelease", "()Lru/yandex/video/m3/list_player_manager/impl/telemetry/ListViewTelemetryRegistry;", "listViewTelemetryRegistry", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ListYandexPlayerManagerInstanceProvider {
    public static final int $stable;
    private static volatile PreloadCacheProvider CACHE_PROVIDER = null;
    private static final int DEFAULT_PLAYER_POOL_SIZE = 2;
    private static volatile boolean FAILFAST = false;

    /* renamed from: INSTANCE$1, reason: from kotlin metadata */
    private static volatile ListYandexPlayerManager INSTANCE = null;
    private static volatile ListViewTelemetryRegistry LIST_VIEW_TELEMETRY = null;
    private static final String NO_INSTANCE_MESSAGE = "Object wasn't initialized. ListYandexPlayerManager::initialize(Async) should be called first!";
    private static final int PICTURE_PRELOAD_COUNT = 5;
    private static final String TAG = "LYPMProvider";
    private static final tse initScope;
    public static final ListYandexPlayerManagerInstanceProvider INSTANCE = new ListYandexPlayerManagerInstanceProvider();
    private static final g050 mutex = gtq0.a();

    static {
        sjh sjhVar = uyj.a;
        mdh.b.getClass();
        initScope = bvf0.a(g221.b.P(1));
        $stable = 8;
    }

    private ListYandexPlayerManagerInstanceProvider() {
    }

    private static /* synthetic */ void getInitScope$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final noh initializeAsyncInternal(Context context, InitParameters params) {
        return tje.h(initScope, null, null, new ListYandexPlayerManagerInstanceProvider$initializeAsyncInternal$1(context, params, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [T, okhttp3.OkHttpClient] */
    /* JADX WARN: Type inference failed for: r2v37, types: [T, okhttp3.OkHttpClient] */
    public final ListYandexPlayerManager initializeInternal(Context context, final InitParameters params) {
        LogcatAndDebugReportPlayerLogger logcatAndDebugReportPlayerLogger;
        int i;
        ListViewTelemetryRegistry listViewTelemetryRegistry;
        ItemsListAbsoluteIndicesAdapter itemsListAbsoluteIndicesAdapter;
        int i2;
        VideoDataRepository<VhVideoData> create;
        VideoDataRepository<VhVideoData> videoDataRepository;
        FAILFAST = isFailFast$video_player_internalRelease();
        ReportBuilder create2 = ReportBuilderExtKt.create(ReportBuilder.INSTANCE);
        LogcatAndDebugReportPlayerLogger logcatAndDebugReportPlayerLogger2 = new LogcatAndDebugReportPlayerLogger(create2);
        String generateVsid = new VsidGenerator(new SystemTimeProvider()).generateVsid();
        InitFlags fromJsonOrDefault = InitFlags.INSTANCE.fromJsonOrDefault(params.getJsonFlags(), logcatAndDebugReportPlayerLogger2);
        PlayerLoggerExtensionsKt.setEnabled(logcatAndDebugReportPlayerLogger2, params.getPlayerLogsEnabled());
        if (PlayerLoggerExtensionsKt.getEnabled(logcatAndDebugReportPlayerLogger2)) {
            logcatAndDebugReportPlayerLogger2.verbose(TAG, "initializeInternal", "failfast: " + INSTANCE.isFailFast$video_player_internalRelease() + ", thread:" + Thread.currentThread().getName() + ", version: 3.7.1(3071), vsid=" + generateVsid + ", params = " + params, new Object[0]);
        }
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = DefaultOkHttpClientFactory.INSTANCE.create();
        YandexPlayerAbConfigManager.Companion companion = YandexPlayerAbConfigManager.INSTANCE;
        companion.initialize(context, new tls() { // from class: ru.yandex.video.m3.list_player_manager.impl.ListYandexPlayerManagerInstanceProvider$initializeInternal$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(YandexPlayerAbConfigManager.Builder builder) {
                builder.setOkHttpClient(ref$ObjectRef.element);
                builder.setUpdateAbConfigStrategy(1);
            }

            @Override // defpackage.tls
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((YandexPlayerAbConfigManager.Builder) obj);
                return zy11.a;
            }
        });
        AbConfig configOrDefault = UtilKt.getConfigOrDefault(companion.getInstanceOrNull$video_player_internalRelease(), generateVsid);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(params.getTestIds());
        List<Integer> testIds = configOrDefault.getTestIds();
        ArrayList arrayList2 = new ArrayList(tcc.n(testIds, 10));
        Iterator<T> it = testIds.iterator();
        while (it.hasNext()) {
            arrayList2.add(String.valueOf(((Number) it.next()).intValue()));
        }
        arrayList.addAll(arrayList2);
        if (configOrDefault.getFlags().getDisableRetryOnConnectionFailureInListSDK()) {
            OkHttpClient.a b = ((OkHttpClient) ref$ObjectRef.element).b();
            b.f = false;
            ref$ObjectRef.element = new OkHttpClient(b);
        }
        TrackingCommonArguments create3 = DefaultTrackingArgumentsFactory.INSTANCE.create(context, params.getDeviceId(), arrayList, params.getFrom(), params.getYandexUid(), generateVsid);
        JsonConverterImpl jsonConverterImpl = new JsonConverterImpl();
        StrmTrackingApi create4 = DefaultStrmTrackingApiFactory.INSTANCE.create(context, logcatAndDebugReportPlayerLogger2, jsonConverterImpl, (OkHttpClient) ref$ObjectRef.element, params.getStrmTrackingUrl());
        DebugViewToggleManager companion2 = DebugViewToggleManagerImpl.INSTANCE.getInstance(configOrDefault.getFlags().getEnableDebugViewInListSDK(), configOrDefault.getFlags().getEnableBroadcastReceiverForDebugViewInListSDK(), context.getApplicationContext());
        InitMediaItemManager initMediaItemManager = new InitMediaItemManager(companion2);
        LoadControlConfig LoadControlConfig$default = LoadControlConfigKt.LoadControlConfig$default(null, 1, null);
        tse tseVar = setupScope();
        WorkHelper workHelper = setupWorkHelper(tseVar);
        ListSdkDebugDataManagerImpl listSdkDebugDataManagerImpl = new ListSdkDebugDataManagerImpl(logcatAndDebugReportPlayerLogger2, companion2, Integer.valueOf(LoadControlConfig$default.getBufferForPlaybackMs()), initMediaItemManager, tseVar);
        ListPlayerManagerEventTracker listPlayerManagerEventTracker = new ListPlayerManagerEventTracker(create4, create3, create2, jsonConverterImpl, initMediaItemManager);
        ItemsListAbsoluteIndicesAdapter itemsListAbsoluteIndicesAdapter2 = new ItemsListAbsoluteIndicesAdapter(logcatAndDebugReportPlayerLogger2, FAILFAST);
        ListViewTelemetryRegistry listViewTelemetryRegistry2 = new ListViewTelemetryRegistry(listPlayerManagerEventTracker, itemsListAbsoluteIndicesAdapter2);
        LIST_VIEW_TELEMETRY = listViewTelemetryRegistry2;
        PriorityTaskManager priorityTaskManager = new PriorityTaskManager();
        final Context applicationContext = context.getApplicationContext();
        PreloadCacheProvider preloadCacheProvider = CACHE_PROVIDER;
        if (preloadCacheProvider == null) {
            preloadCacheProvider = PreloadCacheProviderKt.PreloadCacheProvider(applicationContext, PlaybackStateCompat.ACTION_SET_REPEAT_MODE, new tls() { // from class: ru.yandex.video.m3.list_player_manager.impl.ListYandexPlayerManagerInstanceProvider$initializeInternal$cacheProvider$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void invoke(PreloadCacheProvider.Builder builder) {
                    final Context context2 = applicationContext;
                    builder.setGetCacheDir(new sls() { // from class: ru.yandex.video.m3.list_player_manager.impl.ListYandexPlayerManagerInstanceProvider$initializeInternal$cacheProvider$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // defpackage.sls
                        public final File invoke() {
                            return context2.getExternalFilesDir("Yandex-ListPlayerManager-Video-Cache");
                        }
                    });
                }

                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((PreloadCacheProvider.Builder) obj);
                    return zy11.a;
                }
            });
        }
        PreloadCacheProvider preloadCacheProvider2 = preloadCacheProvider;
        CACHE_PROVIDER = preloadCacheProvider2;
        SimpleIndexGenerator simpleIndexGenerator = new SimpleIndexGenerator();
        SimpleIndexGenerator simpleIndexGenerator2 = new SimpleIndexGenerator();
        DisplaySizeTargetFormatProvider build = new DisplaySizeTargetFormatProvider.Builder().context(context).availableFormatsJsonString("[{w: 480, h: 854}, {w: 720, h:1280}, {w: 1080, h: 1920}]").forceDegradationStep(1).build();
        InfoProviderImpl infoProviderImpl = new InfoProviderImpl(context);
        AccountProvider accountProvider = new AccountProvider() { // from class: ru.yandex.video.m3.list_player_manager.impl.ListYandexPlayerManagerInstanceProvider$initializeInternal$accountProvider$1
            @Override // ru.yandex.video.m3.config.AccountProvider
            public String getAuthToken() {
                return "";
            }

            @Override // ru.yandex.video.m3.config.AccountProvider
            public String getYandexUid() {
                String yandexUid = InitParameters.this.getYandexUid();
                return yandexUid == null ? "" : yandexUid;
            }
        };
        if ((!(params.getVideoSourceType() == 2 && params.getExternalMediaDataProvider() == null) && (params.getVideoSourceType() == 2 || params.getExternalMediaDataProvider() == null)) || !PlayerLoggerExtensionsKt.getEnabled(logcatAndDebugReportPlayerLogger2)) {
            logcatAndDebugReportPlayerLogger = logcatAndDebugReportPlayerLogger2;
            i = 0;
        } else {
            i = 0;
            logcatAndDebugReportPlayerLogger = logcatAndDebugReportPlayerLogger2;
            PlayerLogger.error$default(logcatAndDebugReportPlayerLogger, TAG, "initializeInternal", "Incorrect config of videoSourceType. videoSourceType = " + params.getVideoSourceType() + ", externalMediaDataProvider == " + params.getExternalMediaDataProvider(), null, new Object[0], 8, null);
        }
        if (params.getExternalMediaDataProvider() != null) {
            videoDataRepository = new ExternalMediaDataToVideoDataMapper(params.getExternalMediaDataProvider());
            listViewTelemetryRegistry = listViewTelemetryRegistry2;
            itemsListAbsoluteIndicesAdapter = itemsListAbsoluteIndicesAdapter2;
            i2 = i;
        } else {
            int videoSourceType = params.getVideoSourceType();
            T t = ref$ObjectRef.element;
            if (videoSourceType == 1) {
                listViewTelemetryRegistry = listViewTelemetryRegistry2;
                i2 = i;
                itemsListAbsoluteIndicesAdapter = itemsListAbsoluteIndicesAdapter2;
                create = new InternalVideoDataRepositoryFactory(accountProvider, infoProviderImpl, (OkHttpClient) t, jsonConverterImpl, params.getFrom(), params.getVhBackendService()).create();
            } else {
                listViewTelemetryRegistry = listViewTelemetryRegistry2;
                itemsListAbsoluteIndicesAdapter = itemsListAbsoluteIndicesAdapter2;
                i2 = i;
                create = new DefaultVideoDataRepositoryFactory(accountProvider, infoProviderImpl, (OkHttpClient) t, jsonConverterImpl, params.getFrom(), params.getVhBackendService()).create();
            }
            videoDataRepository = create;
        }
        LogcatAndDebugReportPlayerLogger logcatAndDebugReportPlayerLogger3 = logcatAndDebugReportPlayerLogger;
        VideoDataRepository<VhVideoData> videoDataRepository2 = videoDataRepository;
        YandexPlayerPool yandexPlayerPool = new YandexPlayerPool(configOrDefault.getFlags().getTargetPoolSizeInListSDK(), configOrDefault.getFlags().getMaxPoolSizeInListSDK(), configOrDefault.getFlags().getExceptionCountToDisablePoolIncreasingInListSDK(), new YandexPlayerFactoryImpl(new Config(context, generateVsid, params.getFrom(), params.getDeviceId(), params.getTestIds(), params.getYandexUid(), params.getStrmTrackingUrl(), params.getPerfTrackingUrl()), preloadCacheProvider2, priorityTaskManager, build, simpleIndexGenerator, simpleIndexGenerator2, true, params.getAutomaticallyHandleAudioFocus(), videoDataRepository2, (OkHttpClient) ref$ObjectRef.element, LoadControlConfig$default, configOrDefault.getFlags(), isFailFast$video_player_internalRelease(), logcatAndDebugReportPlayerLogger3), logcatAndDebugReportPlayerLogger3);
        DataCache<VhVideoData> create5 = new DefaultVideoDataCacheFactory(null, 1, null).create();
        DataCache<FirstFrameData> create6 = new DefaultFirstFrameCacheFactory(null, 1, null).create();
        ListPlayerManagerAudioControlImpl listPlayerManagerAudioControlImpl = new ListPlayerManagerAudioControlImpl();
        int i3 = i2;
        ListYandexPlayerFactory listYandexPlayerFactory = new ListYandexPlayerFactory(generateVsid, logcatAndDebugReportPlayerLogger3, isFailFast$video_player_internalRelease(), create5, create6, listPlayerManagerAudioControlImpl, configOrDefault.getFlags(), companion2, tseVar, listSdkDebugDataManagerImpl, context);
        noh create7 = new DefaultPreloadManagerFactory(build).create(context, preloadCacheProvider2, params.getFrom(), params.getDeviceId(), priorityTaskManager, (OkHttpClient) ref$ObjectRef.element, arrayList, generateVsid, configOrDefault.getFlags(), params.getStrmTrackingUrl());
        VideoDataPreloadManager create8 = new DefaultVideoDataPreloadManagerFactory(videoDataRepository2, create5, new Handler(Looper.getMainLooper())).create();
        BitmapDownloaderFactory bitmapDownloaderFactory = new BitmapDownloaderFactory(logcatAndDebugReportPlayerLogger3, create5, create6, 5, fromJsonOrDefault.getBlurHashOnOtherThread() ? workHelper : null, params.getUseHardcodedRatioForBlurs());
        EngineCount calculateEngineCount = EngineReuseManager.INSTANCE.calculateEngineCount(configOrDefault.getFlags().getBackwardEngineInListSDK(), configOrDefault.getFlags().getForwardEngineInListSDK(), configOrDefault.getFlags().getMaxPoolSizeInListSDK());
        if ((configOrDefault.getFlags().getForwardEngineInListSDK() != calculateEngineCount.getForward() || configOrDefault.getFlags().getBackwardEngineInListSDK() != calculateEngineCount.getBackward()) && PlayerLoggerExtensionsKt.getEnabled(logcatAndDebugReportPlayerLogger3)) {
            logcatAndDebugReportPlayerLogger3.verbose(TAG, "initializeInternal", "incorrect configuration; forwardEngineInListSDK = " + configOrDefault.getFlags().getForwardEngineInListSDK() + " backwardEngineInListSDK = " + configOrDefault.getFlags().getBackwardEngineInListSDK() + ", but maxPoolSizeInListSDK == " + configOrDefault.getFlags().getMaxPoolSizeInListSDK() + ". Corrected to " + calculateEngineCount, new Object[i3]);
        }
        return new ListYandexPlayerManagerImpl(logcatAndDebugReportPlayerLogger3, new EngineReuseManager(listYandexPlayerFactory, yandexPlayerPool, logcatAndDebugReportPlayerLogger3, FAILFAST, configOrDefault.getFlags().getEnableNotDetachingEngineFromPlayingPlayerInListSDK(), calculateEngineCount), new VideoPreloadManager(create7, create8, logcatAndDebugReportPlayerLogger3, generateVsid, simpleIndexGenerator, simpleIndexGenerator2, new DefaultPreloadErrorHandler(create5), listPlayerManagerAudioControlImpl, configOrDefault.getFlags(), tseVar), listViewTelemetryRegistry, itemsListAbsoluteIndicesAdapter, generateVsid, listPlayerManagerEventTracker, initMediaItemManager, bitmapDownloaderFactory, listPlayerManagerAudioControlImpl, preloadCacheProvider2, listSdkDebugDataManagerImpl, isFailFast$video_player_internalRelease(), tseVar, companion2);
    }

    private final tse setupScope() {
        qhw0 a = jl40.a();
        sjh sjhVar = uyj.a;
        return bvf0.a(cvw.U(a, mdh.b).plus(new ListYandexPlayerManagerInstanceProvider$setupScope$$inlined$CoroutineExceptionHandler$1(lse.a)));
    }

    private final WorkHelper setupWorkHelper(tse scope) {
        final zko zkoVar = new zko(Executors.newSingleThreadExecutor());
        WorkHelper workHelper = new WorkHelper(zkoVar, new CoroutineQueue(scope), scope);
        l8x l8xVar = (l8x) scope.getCoroutineContext().get(seu.C);
        if (l8xVar != null) {
            l8xVar.w(new tls() { // from class: ru.yandex.video.m3.list_player_manager.impl.ListYandexPlayerManagerInstanceProvider$setupWorkHelper$1
                {
                    super(1);
                }

                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return zy11.a;
                }

                public final void invoke(Throwable th) {
                    yko.this.close();
                }
            });
        }
        return workHelper;
    }

    public final ListYandexPlayerManager get(ListYandexPlayerManager.Companion companion) throws IllegalStateException {
        ListYandexPlayerManager listYandexPlayerManager = INSTANCE;
        if (listYandexPlayerManager != null) {
            return listYandexPlayerManager;
        }
        ny61.r(NO_INSTANCE_MESSAGE);
        return null;
    }

    public final ListViewTelemetryRegistry getListViewTelemetryRegistry$video_player_internalRelease() {
        ListViewTelemetryRegistry listViewTelemetryRegistry = LIST_VIEW_TELEMETRY;
        if (listViewTelemetryRegistry == null) {
            listViewTelemetryRegistry = null;
            if (!isFailFast$video_player_internalRelease()) {
                return null;
            }
            ny61.r(NO_INSTANCE_MESSAGE);
        }
        return listViewTelemetryRegistry;
    }

    public final void initialize(ListYandexPlayerManager.Companion companion, Context context, InitParameters initParameters) {
        kva1.c(initializeAsyncInternal(context, initParameters)).get();
    }

    public final noh initializeAsync(ListYandexPlayerManager.Companion companion, Context context, InitParameters initParameters) {
        return initializeAsyncInternal(context, initParameters);
    }

    public final Future<ListYandexPlayerManager> initializeFuture(ListYandexPlayerManager.Companion companion, Context context, InitParameters initParameters) {
        return kva1.c(initializeAsyncInternal(context, initParameters));
    }

    public final boolean isFailFast$video_player_internalRelease() {
        return FAILFAST;
    }

    public final boolean isInitialised(ListYandexPlayerManager.Companion companion) {
        return INSTANCE != null;
    }

    public final void release$video_player_internalRelease() {
        tje.N(initScope, null, null, new ListYandexPlayerManagerInstanceProvider$release$1(null), 3);
    }
}
