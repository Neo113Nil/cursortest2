package ru.yandex.video.m3.ott.vh;

import android.content.Context;
import defpackage.jl40;
import defpackage.p16;
import defpackage.tls;
import defpackage.zy11;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.OkHttpClient;
import ru.yandex.video.m3.data.PlaybackParameters;
import ru.yandex.video.m3.data.PlaybackParametersKt;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.ott.data.dto.VhVideoData;
import ru.yandex.video.m3.ott.data.dto.drm.DrmProxy;
import ru.yandex.video.m3.ott.data.dto.drm.DrmProxyWithFreeRequestParams;
import ru.yandex.video.m3.ott.data.dto.drm.DrmProxyWithFreeRequestParamsKt;
import ru.yandex.video.m3.ott.data.dto.drm.DrmRequestParams;
import ru.yandex.video.m3.ott.data.repository.ManifestRepository;
import ru.yandex.video.m3.ott.impl.TrackingManagerFactoryImpl;
import ru.yandex.video.m3.ott.ott.DefaultPictureInPictureProvider;
import ru.yandex.video.m3.ott.ott.DeviceProvider;
import ru.yandex.video.m3.ott.ott.OttMediaDrmCallbackDelegateFactory;
import ru.yandex.video.m3.ott.ott.TrackingManager;
import ru.yandex.video.m3.player.BasePlayerStrategy;
import ru.yandex.video.m3.player.YandexPlayer;
import ru.yandex.video.m3.player.drm.PrepareDrm;
import ru.yandex.video.m3.player.drm.PrepareDrmKt;
import ru.yandex.video.m3.player.impl.utils.InfoProvider;
import ru.yandex.video.m3.player.impl.utils.InfoProviderImpl;
import ru.yandex.video.m3.player.impl.utils.SystemTimeProvider;
import ru.yandex.video.m3.player.utils.DefaultResourceProvider;
import ru.yandex.video.m3.player.utils.PlayerLogger;
import ru.yandex.video.m3.player.utils.PlayerLoggerExtensionsKt;

@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 D2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001DBK\b\u0000\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012BC\b\u0016\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0013J\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001c\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010\"\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\u001c\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u0002H\u0016¢\u0006\u0004\b$\u0010%J+\u0010+\u001a\u00020*2\u001a\u0010)\u001a\u0016\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020'\u0018\u00010&j\u0004\u0018\u0001`(H\u0016¢\u0006\u0004\b+\u0010,J)\u0010/\u001a\u00020*2\u0006\u0010\u001c\u001a\u00020\u00022\b\u0010-\u001a\u0004\u0018\u00010 2\u0006\u0010.\u001a\u00020\u0019H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020*H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020*H\u0016¢\u0006\u0004\b3\u00102J\u000f\u00104\u001a\u00020*H\u0016¢\u0006\u0004\b4\u00102R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00105R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00106R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00107R\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u00108R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00109R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010:R\u0018\u0010<\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010?\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010B\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010C¨\u0006E"}, d2 = {"Lru/yandex/video/m3/ott/vh/VhPlayerStrategy;", "Lru/yandex/video/m3/player/BasePlayerStrategy;", "Lru/yandex/video/m3/ott/data/dto/VhVideoData;", "Lru/yandex/video/m3/player/YandexPlayer;", "player", "Landroid/content/Context;", "context", "Lru/yandex/video/m3/ott/ott/DeviceProvider;", "deviceProvider", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "playerLogger", "Lru/yandex/video/m3/ott/data/repository/ManifestRepository;", "manifestRepository", "Lru/yandex/video/m3/ott/ott/OttMediaDrmCallbackDelegateFactory;", "mediaDrmCallbackDelegateFactory", "Lru/yandex/video/m3/player/impl/utils/InfoProvider;", "infoProvider", "<init>", "(Lru/yandex/video/m3/player/YandexPlayer;Landroid/content/Context;Lru/yandex/video/m3/ott/ott/DeviceProvider;Lru/yandex/video/m3/player/utils/PlayerLogger;Lru/yandex/video/m3/ott/data/repository/ManifestRepository;Lru/yandex/video/m3/ott/ott/OttMediaDrmCallbackDelegateFactory;Lru/yandex/video/m3/player/impl/utils/InfoProvider;)V", "(Lru/yandex/video/m3/player/YandexPlayer;Landroid/content/Context;Lru/yandex/video/m3/ott/ott/DeviceProvider;Lru/yandex/video/m3/player/utils/PlayerLogger;Lru/yandex/video/m3/ott/data/repository/ManifestRepository;Lru/yandex/video/m3/ott/ott/OttMediaDrmCallbackDelegateFactory;)V", "", "contentId", "Ljava/util/concurrent/Future;", "prepareVideoData", "(Ljava/lang/String;)Ljava/util/concurrent/Future;", "", "reloadVideoData", "()Z", "videoData", "Lru/yandex/video/m3/player/drm/PrepareDrm;", "prepareDrm", "(Lru/yandex/video/m3/ott/data/dto/VhVideoData;)Lru/yandex/video/m3/player/drm/PrepareDrm;", "", "userAskedStartPosition", "getStartPosition", "(Ljava/lang/Long;Lru/yandex/video/m3/ott/data/dto/VhVideoData;)Ljava/lang/Long;", "getContentId", "(Lru/yandex/video/m3/ott/data/dto/VhVideoData;)Ljava/lang/String;", "", "", "Lru/yandex/video/m3/data/AdditionalParameters;", "additionalParameters", "Lzy11;", "onPreparing", "(Ljava/util/Map;)V", "startPosition", "autoPlay", "onPrepared", "(Lru/yandex/video/m3/ott/data/dto/VhVideoData;Ljava/lang/Long;Z)V", "onRelease", "()V", "onBufferingStart", "onBufferingEnd", "Landroid/content/Context;", "Lru/yandex/video/m3/ott/ott/DeviceProvider;", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "Lru/yandex/video/m3/ott/data/repository/ManifestRepository;", "Lru/yandex/video/m3/ott/ott/OttMediaDrmCallbackDelegateFactory;", "Lru/yandex/video/m3/player/impl/utils/InfoProvider;", "Lru/yandex/video/m3/ott/ott/TrackingManager;", "trackingManager", "Lru/yandex/video/m3/ott/ott/TrackingManager;", "Ljava/util/concurrent/ExecutorService;", "executorService", "Ljava/util/concurrent/ExecutorService;", "Ljava/util/concurrent/ScheduledExecutorService;", "scheduledExecutorService", "Ljava/util/concurrent/ScheduledExecutorService;", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class VhPlayerStrategy extends BasePlayerStrategy<VhVideoData> {
    private static final String TAG = "VhPlayerStrategy";
    private final Context context;
    private final DeviceProvider deviceProvider;
    private ExecutorService executorService;
    private final InfoProvider infoProvider;
    private ManifestRepository<VhVideoData> manifestRepository;
    private final OttMediaDrmCallbackDelegateFactory mediaDrmCallbackDelegateFactory;
    private final PlayerLogger playerLogger;
    private ScheduledExecutorService scheduledExecutorService;
    private TrackingManager trackingManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public VhPlayerStrategy(YandexPlayer<?> yandexPlayer, Context context, DeviceProvider deviceProvider, PlayerLogger playerLogger, ManifestRepository<VhVideoData> manifestRepository, OttMediaDrmCallbackDelegateFactory ottMediaDrmCallbackDelegateFactory, InfoProvider infoProvider) {
        super(yandexPlayer, new DefaultResourceProvider(context), playerLogger);
        this.context = context;
        this.deviceProvider = deviceProvider;
        this.playerLogger = playerLogger;
        this.manifestRepository = manifestRepository;
        this.mediaDrmCallbackDelegateFactory = ottMediaDrmCallbackDelegateFactory;
        this.infoProvider = infoProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread onPrepared$lambda$11$lambda$10(ThreadFactory threadFactory, Runnable runnable) {
        Thread newThread = threadFactory.newThread(runnable);
        newThread.setName("YP:VhPlayerStrategy");
        return newThread;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread onPrepared$lambda$8$lambda$7(ThreadFactory threadFactory, Runnable runnable) {
        Thread newThread = threadFactory.newThread(runnable);
        newThread.setName("YP:VhPlayerStrategyScheduled");
        return newThread;
    }

    @Override // ru.yandex.video.m3.player.BasePlayerStrategy, ru.yandex.video.m3.player.PlayerStrategy
    public Long getStartPosition(Long userAskedStartPosition, VhVideoData videoData) {
        PlayerLogger playerLogger = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
            PlayerLogger.verbose$default(playerLogger, TAG, "getStartPosition", null, new Object[]{"userAskedStartPosition=" + userAskedStartPosition, "videoData.watchProgressPosition=" + videoData.getWatchProgressPositionMs()}, 4, null);
        }
        return Long.valueOf(userAskedStartPosition != null ? userAskedStartPosition.longValue() : videoData.getWatchProgressPositionMs());
    }

    @Override // ru.yandex.video.m3.player.BasePlayerStrategy, ru.yandex.video.m3.player.PlayerStrategy
    public void onBufferingEnd() {
        super.onBufferingEnd();
        TrackingManager trackingManager = this.trackingManager;
        if (trackingManager != null) {
            trackingManager.onBufferingEnd();
        }
    }

    @Override // ru.yandex.video.m3.player.BasePlayerStrategy, ru.yandex.video.m3.player.PlayerStrategy
    public void onBufferingStart() {
        super.onBufferingStart();
        TrackingManager trackingManager = this.trackingManager;
        if (trackingManager != null) {
            trackingManager.onBufferingStart();
        }
    }

    @Override // ru.yandex.video.m3.player.BasePlayerStrategy
    public void onPrepared(VhVideoData videoData, Long startPosition, boolean autoPlay) {
        if (videoData.getShouldUseOttTracking() && this.trackingManager == null) {
            SystemTimeProvider systemTimeProvider = new SystemTimeProvider();
            ScheduledExecutorService scheduledExecutorService = this.scheduledExecutorService;
            if (scheduledExecutorService == null) {
                scheduledExecutorService = Executors.newSingleThreadScheduledExecutor(new p16(Executors.defaultThreadFactory(), 14));
            }
            ScheduledExecutorService scheduledExecutorService2 = scheduledExecutorService;
            ExecutorService executorService = this.executorService;
            if (executorService == null) {
                executorService = Executors.newCachedThreadPool(new p16(Executors.defaultThreadFactory(), 15));
            }
            this.trackingManager = new TrackingManagerFactoryImpl(systemTimeProvider, this.context, this.deviceProvider, new DefaultPictureInPictureProvider(false, 1, null), scheduledExecutorService2, executorService, new OkHttpClient(new OkHttpClient.a())).create();
        }
        TrackingManager trackingManager = this.trackingManager;
        if (trackingManager != null) {
            trackingManager.start(getPlayer());
        }
        TrackingManager trackingManager2 = this.trackingManager;
        if (trackingManager2 != null) {
            trackingManager2.onPrepared(videoData);
        }
        super.onPrepared((VhPlayerStrategy) videoData, startPosition, autoPlay);
    }

    @Override // ru.yandex.video.m3.player.BasePlayerStrategy
    public void onPreparing(Map<String, ? extends Object> additionalParameters) {
        super.onPreparing(additionalParameters);
        TrackingManager trackingManager = this.trackingManager;
        if (trackingManager != null) {
            trackingManager.stop();
        }
    }

    @Override // ru.yandex.video.m3.player.BasePlayerStrategy
    public void onRelease() {
        TrackingManager trackingManager = this.trackingManager;
        if (trackingManager != null) {
            trackingManager.stop();
        }
        super.onRelease();
        ScheduledExecutorService scheduledExecutorService = this.scheduledExecutorService;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdown();
        }
        ExecutorService executorService = this.executorService;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // ru.yandex.video.m3.player.BasePlayerStrategy, ru.yandex.video.m3.player.PlayerStrategy
    public PrepareDrm prepareDrm(VhVideoData videoData) {
        PlayerLogger playerLogger = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
            PlayerLogger.verbose$default(playerLogger, TAG, "prepareDrm", null, new Object[]{"videoData=" + INSTANCE.toLog(videoData)}, 4, null);
        }
        final DrmProxy drmConfig = videoData.getDrmConfig();
        if (drmConfig != null) {
            return PrepareDrmKt.PrepareDrm(new tls() { // from class: ru.yandex.video.m3.ott.vh.VhPlayerStrategy$prepareDrm$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void invoke(PrepareDrm.Builder builder) {
                    OttMediaDrmCallbackDelegateFactory ottMediaDrmCallbackDelegateFactory;
                    ottMediaDrmCallbackDelegateFactory = VhPlayerStrategy.this.mediaDrmCallbackDelegateFactory;
                    builder.setMediaDrmCallbackDelegate(ottMediaDrmCallbackDelegateFactory.create(drmConfig));
                }

                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((PrepareDrm.Builder) obj);
                    return zy11.a;
                }
            });
        }
        return null;
    }

    @Override // ru.yandex.video.m3.player.BasePlayerStrategy, ru.yandex.video.m3.player.PlayerStrategy
    public Future<VhVideoData> prepareVideoData(String contentId) {
        PlayerLogger playerLogger = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
            PlayerLogger.verbose$default(playerLogger, TAG, "prepareVideoData", null, new Object[]{"contentId=".concat(contentId)}, 4, null);
        }
        return this.manifestRepository.loadVideoData(contentId, this.infoProvider.getVpuid());
    }

    @Override // ru.yandex.video.m3.player.BasePlayerStrategy, ru.yandex.video.m3.player.PlayerStrategy
    public boolean reloadVideoData() {
        VideoData videoDataInternal = getPlayer().getVideoDataInternal();
        if (videoDataInternal == null) {
            return false;
        }
        VhVideoData vhVideoData = videoDataInternal instanceof VhVideoData ? (VhVideoData) videoDataInternal : null;
        if (vhVideoData == null) {
            return false;
        }
        getPlayer().prepare(vhVideoData.getContentId(), PlaybackParametersKt.PlaybackParameters(true, new tls() { // from class: ru.yandex.video.m3.ott.vh.VhPlayerStrategy$reloadVideoData$2$1
            {
                super(1);
            }

            public final void invoke(PlaybackParameters.Builder builder) {
                YandexPlayer player;
                player = VhPlayerStrategy.this.getPlayer();
                builder.setStartPosition(Long.valueOf(player.getPosition()));
            }

            @Override // defpackage.tls
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((PlaybackParameters.Builder) obj);
                return zy11.a;
            }
        }));
        return true;
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/yandex/video/m3/ott/vh/VhPlayerStrategy$Companion;", "", "()V", "TAG", "", "toLog", "Lru/yandex/video/m3/ott/data/dto/VhVideoData;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final VhVideoData toLog(VhVideoData vhVideoData) {
            return vhVideoData.getDrmConfig() instanceof DrmProxyWithFreeRequestParams ? vhVideoData.copy(new tls() { // from class: ru.yandex.video.m3.ott.vh.VhPlayerStrategy$Companion$toLog$1
                public final void invoke(VhVideoData.Builder builder) {
                    DrmProxy drmConfig = builder.getDrmConfig();
                    DrmProxyWithFreeRequestParams drmProxyWithFreeRequestParams = null;
                    DrmProxyWithFreeRequestParams drmProxyWithFreeRequestParams2 = drmConfig instanceof DrmProxyWithFreeRequestParams ? (DrmProxyWithFreeRequestParams) drmConfig : null;
                    if (drmProxyWithFreeRequestParams2 != null) {
                        String proxyUrl = drmProxyWithFreeRequestParams2.getProxyUrl();
                        String provisioningUrl = drmProxyWithFreeRequestParams2.getProvisioningUrl();
                        Map<String, String> freeRequestParams = drmProxyWithFreeRequestParams2.getFreeRequestParams();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry<String, String> entry : freeRequestParams.entrySet()) {
                            if (!jl40.l(entry.getKey(), "sessionId")) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        drmProxyWithFreeRequestParams = DrmProxyWithFreeRequestParamsKt.DrmProxyWithFreeRequestParams$default(proxyUrl, provisioningUrl, linkedHashMap, null, 8, null);
                    }
                    builder.setDrmConfig(drmProxyWithFreeRequestParams);
                }

                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((VhVideoData.Builder) obj);
                    return zy11.a;
                }
            }) : vhVideoData.copy(new tls() { // from class: ru.yandex.video.m3.ott.vh.VhPlayerStrategy$Companion$toLog$2
                public final void invoke(VhVideoData.Builder builder) {
                    final DrmProxy drmConfig = builder.getDrmConfig();
                    builder.setDrmConfig(drmConfig != null ? drmConfig.copy(new tls() { // from class: ru.yandex.video.m3.ott.vh.VhPlayerStrategy$Companion$toLog$2$1$1
                        {
                            super(1);
                        }

                        public final void invoke(DrmProxy.Builder builder2) {
                            DrmRequestParams drmRequestParams = DrmProxy.this.getDrmRequestParams();
                            final DrmProxy drmProxy = DrmProxy.this;
                            builder2.setDrmRequestParams(drmRequestParams.copy(new tls() { // from class: ru.yandex.video.m3.ott.vh.VhPlayerStrategy$Companion$toLog$2$1$1.1
                                {
                                    super(1);
                                }

                                public final void invoke(DrmRequestParams.Builder builder3) {
                                    builder3.setPuid(null);
                                    builder3.setSessionId(DrmProxy.this.getDrmRequestParams().getSessionId() != null ? "***" : null);
                                }

                                @Override // defpackage.tls
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    invoke((DrmRequestParams.Builder) obj);
                                    return zy11.a;
                                }
                            }));
                        }

                        @Override // defpackage.tls
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((DrmProxy.Builder) obj);
                            return zy11.a;
                        }
                    }) : null);
                }

                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((VhVideoData.Builder) obj);
                    return zy11.a;
                }
            });
        }

        private Companion() {
        }
    }

    @Override // ru.yandex.video.m3.player.BasePlayerStrategy
    public String getContentId(VhVideoData videoData) {
        return videoData.getContentId();
    }

    public VhPlayerStrategy(YandexPlayer<?> yandexPlayer, Context context, DeviceProvider deviceProvider, PlayerLogger playerLogger, ManifestRepository<VhVideoData> manifestRepository, OttMediaDrmCallbackDelegateFactory ottMediaDrmCallbackDelegateFactory) {
        this(yandexPlayer, context, deviceProvider, playerLogger, manifestRepository, ottMediaDrmCallbackDelegateFactory, new InfoProviderImpl(context));
    }
}
