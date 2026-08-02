package ru.yandex.video.m3.list_player_manager.impl.ypfactories;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.media3.common.PriorityTaskManager;
import defpackage.eyc;
import defpackage.fyc;
import defpackage.gwk0;
import defpackage.ip4;
import defpackage.jl40;
import defpackage.nmh;
import defpackage.noh;
import defpackage.omh;
import defpackage.sls;
import defpackage.tls;
import defpackage.zvg;
import defpackage.zy11;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.OkHttpClient;
import ru.yandex.video.m3.ab.config.AbFlags;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.data.network.UrlParams;
import ru.yandex.video.m3.list_player_manager.impl.VideoPreloadManager;
import ru.yandex.video.m3.player.BandwidthMeterFactory;
import ru.yandex.video.m3.player.bandwidth.CommonBandwidthMeterFactoryKt;
import ru.yandex.video.m3.player.impl.DefaultBandwidthMeterFactoryKt;
import ru.yandex.video.m3.player.impl.bandwidth.InitialBandwidthLastValueProvider;
import ru.yandex.video.m3.player.impl.source.DefaultDataSourceFactory;
import ru.yandex.video.m3.player.impl.tracking.device.DeviceInfoKt;
import ru.yandex.video.m3.player.impl.tracking.device.DeviceInfoProviderImpl;
import ru.yandex.video.m3.player.impl.tracking.device.DeviceType;
import ru.yandex.video.m3.player.impl.trackselection.DisplaySizeTargetFormatProvider;
import ru.yandex.video.m3.player.impl.trackselection.TargetFormatTrackSelectionConfig;
import ru.yandex.video.m3.player.impl.trackselection.TargetFormatTrackSelectionConfigKt;
import ru.yandex.video.m3.player.impl.trackselection.TargetFormatTrackSelectorFactory;
import ru.yandex.video.m3.player.impl.trackselection.TargetFormatTrackSelectorFactoryKt;
import ru.yandex.video.m3.player.impl.trackselection.TrackSelectorFactory;
import ru.yandex.video.m3.player.provider.internal.DeviceIdProvider;
import ru.yandex.video.m3.player.provider.internal.DeviceIdProviderKt;
import ru.yandex.video.m3.preload_manager.PreloadManager;
import ru.yandex.video.m3.preload_manager.PreloadManagerBuilder;
import ru.yandex.video.m3.preload_manager.cache.PreloadCacheProvider;
import ru.yandex.video.m3.preload_manager.tracking.ContentIdProvider;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000  2\u00020\u0001:\u0001 B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJk\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\u00142\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001f¨\u0006!"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/ypfactories/DefaultPreloadManagerFactory;", "", "Lru/yandex/video/m3/player/impl/trackselection/DisplaySizeTargetFormatProvider;", "targetFormatProvider", "<init>", "(Lru/yandex/video/m3/player/impl/trackselection/DisplaySizeTargetFormatProvider;)V", "Landroid/content/Context;", "context", "Lzy11;", "passContextToDeviceIdProvider", "(Landroid/content/Context;)V", "Lru/yandex/video/m3/preload_manager/cache/PreloadCacheProvider;", "preloadCacheProvider", "", "from", "deviceId", "Landroidx/media3/common/PriorityTaskManager;", "preloadPriorityTaskManager", "Lokhttp3/OkHttpClient;", "okHttpClient", "", "testIds", "vsid", "Lru/yandex/video/m3/ab/config/AbFlags;", "abFlags", "Lru/yandex/video/m3/data/network/UrlParams;", "strmTrackingUrl", "Lnoh;", "Lru/yandex/video/m3/preload_manager/PreloadManager;", "create", "(Landroid/content/Context;Lru/yandex/video/m3/preload_manager/cache/PreloadCacheProvider;Ljava/lang/String;Ljava/lang/String;Landroidx/media3/common/PriorityTaskManager;Lokhttp3/OkHttpClient;Ljava/util/List;Ljava/lang/String;Lru/yandex/video/m3/ab/config/AbFlags;Lru/yandex/video/m3/data/network/UrlParams;)Lnoh;", "Lru/yandex/video/m3/player/impl/trackselection/DisplaySizeTargetFormatProvider;", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DefaultPreloadManagerFactory {
    public static final int $stable = 0;
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final int DASH_PRELOAD_THREAD_MULTIPLIER = 3;

    @Deprecated
    public static final String HANDLER_THREAD_NAME = "PreloaderHandler";

    @Deprecated
    public static final long TRACK_PRELOAD_TIMEOUT_SEC = 30;

    @Deprecated
    public static final int maxSimultaneous = 3;
    private final DisplaySizeTargetFormatProvider targetFormatProvider;

    public DefaultPreloadManagerFactory(DisplaySizeTargetFormatProvider displaySizeTargetFormatProvider) {
        this.targetFormatProvider = displaySizeTargetFormatProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void create$lambda$1(eyc eycVar, sls slsVar) {
        ((fyc) eycVar).T(slsVar.invoke());
    }

    private final void passContextToDeviceIdProvider(Context context) {
        DeviceIdProviderKt.provideContext(DeviceIdProvider.INSTANCE, context);
    }

    public final noh create(final Context context, final PreloadCacheProvider preloadCacheProvider, final String from, final String deviceId, final PriorityTaskManager preloadPriorityTaskManager, final OkHttpClient okHttpClient, final List<String> testIds, final String vsid, final AbFlags abFlags, final UrlParams strmTrackingUrl) {
        HandlerThread handlerThread = new HandlerThread(HANDLER_THREAD_NAME);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        final ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(9, new ThreadFactory() { // from class: ru.yandex.video.m3.list_player_manager.impl.ypfactories.DefaultPreloadManagerFactory$create$executor$1
            private final AtomicInteger counter = new AtomicInteger();

            public final AtomicInteger getCounter() {
                return this.counter;
            }

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable r) {
                return new Thread(r, "Downloader-" + this.counter.incrementAndGet());
            }
        });
        passContextToDeviceIdProvider(context);
        final DefaultDataSourceFactory defaultDataSourceFactory = new DefaultDataSourceFactory(okHttpClient, null, 2, null);
        sls slsVar = new sls() { // from class: ru.yandex.video.m3.list_player_manager.impl.ypfactories.DefaultPreloadManagerFactory$create$factory$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final PreloadManager invoke() {
                BandwidthMeterFactory commonFactoryInstance = AbFlags.this.getUseMultiplatformBandwidthEstimator() ? CommonBandwidthMeterFactoryKt.getCommonFactoryInstance(BandwidthMeterFactory.INSTANCE, AbFlags.this.getUseMultiplatformBandwidthEstimatorWithPlatformSync()) : DefaultBandwidthMeterFactoryKt.DefaultBandwidthMeterFactory$default(null, 1, null);
                boolean l = jl40.l(AbFlags.this.getUseLastBandwidthEstimate(), Boolean.TRUE);
                Context context2 = context;
                ip4 create = l ? commonFactoryInstance.create(context2, new InitialBandwidthLastValueProvider(null, 1, null)) : commonFactoryInstance.create(context2);
                PreloadManagerBuilder preloadManagerBuilder = new PreloadManagerBuilder(context);
                String str = from;
                List<String> list = testIds;
                String str2 = vsid;
                ExecutorService executorService = newFixedThreadPool;
                PreloadCacheProvider preloadCacheProvider2 = preloadCacheProvider;
                DefaultDataSourceFactory defaultDataSourceFactory2 = defaultDataSourceFactory;
                OkHttpClient okHttpClient2 = okHttpClient;
                String str3 = deviceId;
                PriorityTaskManager priorityTaskManager = preloadPriorityTaskManager;
                UrlParams urlParams = strmTrackingUrl;
                final Context context3 = context;
                final DefaultPreloadManagerFactory defaultPreloadManagerFactory = this;
                final AbFlags abFlags2 = AbFlags.this;
                preloadManagerBuilder.setFrom(str);
                preloadManagerBuilder.setTestIds(list);
                preloadManagerBuilder.setVsid(str2);
                preloadManagerBuilder.downloadExecutorService(executorService);
                preloadManagerBuilder.maxSimultaneousDownloads(3);
                preloadManagerBuilder.cacheProvider(preloadCacheProvider2);
                preloadManagerBuilder.upstreamDataSourceFactory(defaultDataSourceFactory2.create(create.getProxyTransferListener()));
                preloadManagerBuilder.bandwidthMeter(create);
                preloadManagerBuilder.strmOkHttpClient(okHttpClient2);
                preloadManagerBuilder.deviceInfoProvider(new DeviceInfoProviderImpl(DeviceInfoKt.DeviceInfo$default(DeviceType.OTHER, str3, null, 4, null)));
                preloadManagerBuilder.trackSelectorFactoryBuilder(new tls() { // from class: ru.yandex.video.m3.list_player_manager.impl.ypfactories.DefaultPreloadManagerFactory$create$factory$1$builder$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.tls
                    public final TrackSelectorFactory invoke(VideoData videoData) {
                        DisplaySizeTargetFormatProvider displaySizeTargetFormatProvider;
                        Context context4 = context3;
                        displaySizeTargetFormatProvider = defaultPreloadManagerFactory.targetFormatProvider;
                        omh omhVar = new omh(new nmh());
                        final AbFlags abFlags3 = abFlags2;
                        return TargetFormatTrackSelectorFactoryKt.TargetFormatTrackSelectorFactory(context4, displaySizeTargetFormatProvider, omhVar, new tls() { // from class: ru.yandex.video.m3.list_player_manager.impl.ypfactories.DefaultPreloadManagerFactory$create$factory$1$builder$1$1.1
                            {
                                super(1);
                            }

                            public final void invoke(TargetFormatTrackSelectorFactory.Builder builder) {
                                final AbFlags abFlags4 = AbFlags.this;
                                builder.setTargetFormatTrackSelectionConfig(TargetFormatTrackSelectionConfigKt.TargetFormatTrackSelectionConfig(new tls() { // from class: ru.yandex.video.m3.list_player_manager.impl.ypfactories.DefaultPreloadManagerFactory.create.factory.1.builder.1.1.1.1
                                    {
                                        super(1);
                                    }

                                    public final void invoke(TargetFormatTrackSelectionConfig.Builder builder2) {
                                        builder2.setSelectMonoBitrate(Boolean.valueOf(AbFlags.this.getEnableSelectMonoBitrateInListSDK()));
                                        builder2.setDegradationSteps(Integer.valueOf(AbFlags.this.getDegradationStepsMonoBitrateInListSDK()));
                                    }

                                    @Override // defpackage.tls
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        invoke((TargetFormatTrackSelectionConfig.Builder) obj);
                                        return zy11.a;
                                    }
                                }));
                            }

                            @Override // defpackage.tls
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((TargetFormatTrackSelectorFactory.Builder) obj);
                                return zy11.a;
                            }
                        });
                    }
                });
                preloadManagerBuilder.upstreamPriorityTaskManager(priorityTaskManager);
                preloadManagerBuilder.setStrmTrackingUrlParams(urlParams);
                preloadManagerBuilder.trackPreloadTimeoutInSec(30L);
                preloadManagerBuilder.setContentIdProvider(new ContentIdProvider() { // from class: ru.yandex.video.m3.list_player_manager.impl.ypfactories.DefaultPreloadManagerFactory$create$factory$1$builder$1$2
                    @Override // ru.yandex.video.m3.preload_manager.tracking.ContentIdProvider
                    public String getContentId(VideoData videoData) {
                        VideoPreloadManager.InternalContentIdProvider internalContentIdProvider = videoData instanceof VideoPreloadManager.InternalContentIdProvider ? (VideoPreloadManager.InternalContentIdProvider) videoData : null;
                        if (internalContentIdProvider != null) {
                            return internalContentIdProvider.getContentId();
                        }
                        return null;
                    }
                });
                preloadManagerBuilder.releaseCacheOnShutdown(false);
                return preloadManagerBuilder.build();
            }
        };
        fyc b = gwk0.b();
        handler.post(new zvg(7, b, slsVar));
        return b;
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/ypfactories/DefaultPreloadManagerFactory$Companion;", "", "()V", "DASH_PRELOAD_THREAD_MULTIPLIER", "", "HANDLER_THREAD_NAME", "", "TRACK_PRELOAD_TIMEOUT_SEC", "", "maxSimultaneous", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
