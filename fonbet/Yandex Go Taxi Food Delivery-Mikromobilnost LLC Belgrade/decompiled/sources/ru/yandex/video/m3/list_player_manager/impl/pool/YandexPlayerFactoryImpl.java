package ru.yandex.video.m3.list_player_manager.impl.pool;

import androidx.media3.common.PriorityTaskManager;
import defpackage.gw00;
import defpackage.p16;
import defpackage.tls;
import defpackage.zxc0;
import defpackage.zy11;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import kotlin.Metadata;
import kotlin.Pair;
import okhttp3.OkHttpClient;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.video.m3.ab.config.AbFlags;
import ru.yandex.video.m3.config.AccountProvider;
import ru.yandex.video.m3.data.MediaCodecReuseLog;
import ru.yandex.video.m3.data.MediaCodecSelectorLog;
import ru.yandex.video.m3.data.dto.JsonConverterImpl;
import ru.yandex.video.m3.debug.DecoderUsageHelper;
import ru.yandex.video.m3.debug.DecoderUsageListener;
import ru.yandex.video.m3.list_player_manager.UtilKt;
import ru.yandex.video.m3.list_player_manager.impl.pool.YandexPlayerFactoryImpl;
import ru.yandex.video.m3.list_player_manager.impl.ypfactories.DefaultPlayerDelegateFactory;
import ru.yandex.video.m3.list_player_manager.impl.ypfactories.DefaultPlayerStrategyFactory;
import ru.yandex.video.m3.model.config.loadcontrol.LoadControlConfig;
import ru.yandex.video.m3.ott.data.dto.VhVideoData;
import ru.yandex.video.m3.ott.data.repository.ManifestRepository;
import ru.yandex.video.m3.player.DecoderCounter;
import ru.yandex.video.m3.player.IndexGenerator;
import ru.yandex.video.m3.player.PlayerAnalyticsObserver;
import ru.yandex.video.m3.player.YandexPlayer;
import ru.yandex.video.m3.player.YandexPlayerBuilder;
import ru.yandex.video.m3.player.impl.tracking.device.DeviceInfoKt;
import ru.yandex.video.m3.player.impl.tracking.device.DeviceInfoProviderImpl;
import ru.yandex.video.m3.player.impl.tracking.device.DeviceType;
import ru.yandex.video.m3.player.impl.trackselection.DisplaySizeTargetFormatProvider;
import ru.yandex.video.m3.player.tracking.config.DefaultStrmManagerConfig;
import ru.yandex.video.m3.player.tracking.config.DefaultStrmManagerConfigKt;
import ru.yandex.video.m3.player.tracks.TrackFormat;
import ru.yandex.video.m3.player.tracks.TrackType;
import ru.yandex.video.m3.player.utils.PlayerLogger;
import ru.yandex.video.m3.preload_manager.cache.PreloadCacheProvider;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B}\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0019\u001a\u00020\r\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010'R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010(R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010(R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010)R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010)R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010*R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010+R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010,R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010-R\u0014\u0010\u0019\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010)R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010.R\u0016\u00100\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u00065"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/pool/YandexPlayerFactoryImpl;", "Lru/yandex/video/m3/list_player_manager/impl/pool/YandexPlayerFactory;", "Lru/yandex/video/m3/list_player_manager/impl/pool/Config;", ConfigConstants.CONFIG, "Lru/yandex/video/m3/preload_manager/cache/PreloadCacheProvider;", "preloadCacheProvider", "Landroidx/media3/common/PriorityTaskManager;", "preloadPriorityTaskManager", "Lru/yandex/video/m3/player/impl/trackselection/DisplaySizeTargetFormatProvider;", "targetFormatProvider", "Lru/yandex/video/m3/player/IndexGenerator;", "sourceIndexGenerator", "eventIndexGenerator", "", "allowRemoteConfiguration", "automaticallyHandleAudioFocus", "Lru/yandex/video/m3/ott/data/repository/ManifestRepository;", "Lru/yandex/video/m3/ott/data/dto/VhVideoData;", "manifestRepository", "Lokhttp3/OkHttpClient;", "okHttpClient", "Lru/yandex/video/m3/model/config/loadcontrol/LoadControlConfig;", "loadControlConfig", "Lru/yandex/video/m3/ab/config/AbFlags;", "abFlags", "failFast", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "playerLogger", "<init>", "(Lru/yandex/video/m3/list_player_manager/impl/pool/Config;Lru/yandex/video/m3/preload_manager/cache/PreloadCacheProvider;Landroidx/media3/common/PriorityTaskManager;Lru/yandex/video/m3/player/impl/trackselection/DisplaySizeTargetFormatProvider;Lru/yandex/video/m3/player/IndexGenerator;Lru/yandex/video/m3/player/IndexGenerator;ZZLru/yandex/video/m3/ott/data/repository/ManifestRepository;Lokhttp3/OkHttpClient;Lru/yandex/video/m3/model/config/loadcontrol/LoadControlConfig;Lru/yandex/video/m3/ab/config/AbFlags;ZLru/yandex/video/m3/player/utils/PlayerLogger;)V", "Lru/yandex/video/m3/debug/DecoderUsageListener;", "decoderUsageListener", "Lru/yandex/video/m3/player/YandexPlayer;", "Lzxc0;", "create", "(Lru/yandex/video/m3/debug/DecoderUsageListener;)Lru/yandex/video/m3/player/YandexPlayer;", "Lru/yandex/video/m3/list_player_manager/impl/pool/Config;", "Lru/yandex/video/m3/preload_manager/cache/PreloadCacheProvider;", "Landroidx/media3/common/PriorityTaskManager;", "Lru/yandex/video/m3/player/impl/trackselection/DisplaySizeTargetFormatProvider;", "Lru/yandex/video/m3/player/IndexGenerator;", "Z", "Lru/yandex/video/m3/ott/data/repository/ManifestRepository;", "Lokhttp3/OkHttpClient;", "Lru/yandex/video/m3/model/config/loadcontrol/LoadControlConfig;", "Lru/yandex/video/m3/ab/config/AbFlags;", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "", "createdPlayerCount", CA20Status.STATUS_USER_I, "Ljava/util/concurrent/ExecutorService;", "cachedThreadPool", "Ljava/util/concurrent/ExecutorService;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class YandexPlayerFactoryImpl implements YandexPlayerFactory {
    public static final int $stable = 8;
    private final AbFlags abFlags;
    private final boolean allowRemoteConfiguration;
    private final boolean automaticallyHandleAudioFocus;
    private final ExecutorService cachedThreadPool = Executors.newCachedThreadPool(new p16(Executors.defaultThreadFactory(), 16));
    private final Config config;
    private int createdPlayerCount;
    private final IndexGenerator eventIndexGenerator;
    private final boolean failFast;
    private final LoadControlConfig loadControlConfig;
    private final ManifestRepository<VhVideoData> manifestRepository;
    private final OkHttpClient okHttpClient;
    private final PlayerLogger playerLogger;
    private final PreloadCacheProvider preloadCacheProvider;
    private final PriorityTaskManager preloadPriorityTaskManager;
    private final IndexGenerator sourceIndexGenerator;
    private final DisplaySizeTargetFormatProvider targetFormatProvider;

    public YandexPlayerFactoryImpl(Config config, PreloadCacheProvider preloadCacheProvider, PriorityTaskManager priorityTaskManager, DisplaySizeTargetFormatProvider displaySizeTargetFormatProvider, IndexGenerator indexGenerator, IndexGenerator indexGenerator2, boolean z, boolean z2, ManifestRepository<VhVideoData> manifestRepository, OkHttpClient okHttpClient, LoadControlConfig loadControlConfig, AbFlags abFlags, boolean z3, PlayerLogger playerLogger) {
        this.config = config;
        this.preloadCacheProvider = preloadCacheProvider;
        this.preloadPriorityTaskManager = priorityTaskManager;
        this.targetFormatProvider = displaySizeTargetFormatProvider;
        this.sourceIndexGenerator = indexGenerator;
        this.eventIndexGenerator = indexGenerator2;
        this.allowRemoteConfiguration = z;
        this.automaticallyHandleAudioFocus = z2;
        this.manifestRepository = manifestRepository;
        this.okHttpClient = okHttpClient;
        this.loadControlConfig = loadControlConfig;
        this.abFlags = abFlags;
        this.failFast = z3;
        this.playerLogger = playerLogger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread _init_$lambda$1(ThreadFactory threadFactory, Runnable runnable) {
        Thread newThread = threadFactory.newThread(runnable);
        newThread.setName("YP:StrmManager");
        return newThread;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread create$lambda$3(ThreadFactory threadFactory, YandexPlayerFactoryImpl yandexPlayerFactoryImpl, Runnable runnable) {
        Thread newThread = threadFactory.newThread(runnable);
        StringBuilder sb = new StringBuilder("YP:SStrmManager[");
        int i = yandexPlayerFactoryImpl.createdPlayerCount;
        yandexPlayerFactoryImpl.createdPlayerCount = i + 1;
        sb.append(i);
        sb.append(']');
        newThread.setName(sb.toString());
        return newThread;
    }

    @Override // ru.yandex.video.m3.list_player_manager.impl.pool.YandexPlayerFactory
    public YandexPlayer<zxc0> create(DecoderUsageListener decoderUsageListener) {
        UtilKt.verifyMainThread(this.failFast, this.playerLogger);
        final ThreadFactory defaultThreadFactory = Executors.defaultThreadFactory();
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new ThreadFactory() { // from class: jm51
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread create$lambda$3;
                create$lambda$3 = YandexPlayerFactoryImpl.create$lambda$3(defaultThreadFactory, this, runnable);
                return create$lambda$3;
            }
        });
        YandexPlayerBuilder yandexPlayerBuilder = new YandexPlayerBuilder();
        yandexPlayerBuilder.context(this.config.getContext());
        yandexPlayerBuilder.playerDelegateFactory(DefaultPlayerDelegateFactory.INSTANCE.create$video_player_internalRelease(this.config.getContext(), this.okHttpClient, this.preloadCacheProvider, this.preloadPriorityTaskManager, this.targetFormatProvider, this.automaticallyHandleAudioFocus, this.loadControlConfig, this.config.getPerfTrackingUrl(), this.playerLogger, this.abFlags.getUseDataSourceFactoryCreatorInListSDK(), this.failFast));
        yandexPlayerBuilder.playerStrategyFactory(DefaultPlayerStrategyFactory.INSTANCE.create(this.config.getContext(), this.manifestRepository));
        String str = this.abFlags.getAddFallbackToAVCInListSDK() ? "Cache,NoInternetConnection,QueueSecureInputBuffer,DequeueInputBuffer,DequeueOutputBuffer,FailedReleaseOutputBuffer,InstantiatingDecoder,PreferH264HandlingRule" : "Cache,NoInternetConnection,QueueSecureInputBuffer,DequeueInputBuffer,DequeueOutputBuffer,FailedReleaseOutputBuffer,InstantiatingDecoder";
        yandexPlayerBuilder.strmManagerConfig(DefaultStrmManagerConfigKt.DefaultStrmManagerConfig(this.config.getContext(), this.okHttpClient, this.cachedThreadPool, newSingleThreadScheduledExecutor, DefaultStrmManagerConfig.Companion.InfoProviders$default(DefaultStrmManagerConfig.INSTANCE, new AccountProvider() { // from class: ru.yandex.video.m3.list_player_manager.impl.pool.YandexPlayerFactoryImpl$create$player$1$1
            @Override // ru.yandex.video.m3.config.AccountProvider
            public String getAuthToken() {
                return "";
            }

            @Override // ru.yandex.video.m3.config.AccountProvider
            public String getYandexUid() {
                Config config;
                config = YandexPlayerFactoryImpl.this.config;
                String yandexUid = config.getYandexUid();
                return yandexUid == null ? "" : yandexUid;
            }
        }, new DeviceInfoProviderImpl(DeviceInfoKt.DeviceInfo$default(DeviceType.OTHER, this.config.getDeviceId(), null, 4, null)), null, 4, null), this.config.getTestIds(), new tls() { // from class: ru.yandex.video.m3.list_player_manager.impl.pool.YandexPlayerFactoryImpl$create$player$1$2
            {
                super(1);
            }

            public final void invoke(DefaultStrmManagerConfig.Builder builder) {
                Config config;
                config = YandexPlayerFactoryImpl.this.config;
                builder.setFrom(config.getFrom());
                DefaultStrmManagerConfig.Companion companion = DefaultStrmManagerConfig.INSTANCE;
                final YandexPlayerFactoryImpl yandexPlayerFactoryImpl = YandexPlayerFactoryImpl.this;
                builder.setAdditionalFeatures(companion.AdditionalFeatures(new tls() { // from class: ru.yandex.video.m3.list_player_manager.impl.pool.YandexPlayerFactoryImpl$create$player$1$2.1
                    {
                        super(1);
                    }

                    public final void invoke(DefaultStrmManagerConfig.AdditionalFeatures.Builder builder2) {
                        Config config2;
                        config2 = YandexPlayerFactoryImpl.this.config;
                        builder2.setStrmTrackingUrlParams(config2.getStrmTrackingUrl());
                        builder2.setJsonConverter(new JsonConverterImpl());
                    }

                    @Override // defpackage.tls
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((DefaultStrmManagerConfig.AdditionalFeatures.Builder) obj);
                        return zy11.a;
                    }
                }));
                builder.setAdditionalParameters(gw00.e(new Pair("from_block", "list_sdk")));
            }

            @Override // defpackage.tls
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((DefaultStrmManagerConfig.Builder) obj);
                return zy11.a;
            }
        }));
        yandexPlayerBuilder.optimizeConcurrentCommandExecution(true);
        yandexPlayerBuilder.experimentalDoAutoPlayLogicInsidePlayer(true);
        yandexPlayerBuilder.setSourceIndexGenerator$video_player_internalRelease(this.sourceIndexGenerator);
        yandexPlayerBuilder.setRecoveredErrors(str);
        yandexPlayerBuilder.setEventIndexGenerator$video_player_internalRelease(this.eventIndexGenerator);
        YandexPlayer<zxc0> build = yandexPlayerBuilder.build(this.config.getListSdkVsid());
        build.getHidedPlayer();
        if (decoderUsageListener != null) {
            final DecoderUsageHelper decoderUsageHelper = new DecoderUsageHelper(build.getPlayerIndex(), decoderUsageListener);
            build.addAnalyticsObserver(new PlayerAnalyticsObserver() { // from class: ru.yandex.video.m3.list_player_manager.impl.pool.YandexPlayerFactoryImpl$create$1$1$1
                @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
                public void onAudioDecoderEnabled(DecoderCounter decoderCounter) {
                    DecoderUsageHelper.this.onAudioDecoderEnabled(decoderCounter);
                }

                @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
                public void onAudioInputFormatChanged(TrackFormat format, MediaCodecReuseLog codecReuseLog) {
                    DecoderUsageHelper.this.onAudioInputFormatChanged(format, codecReuseLog);
                }

                @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
                public void onDecoderInitialized(TrackType trackType, String decoderName, MediaCodecSelectorLog mediaCodecSelectorLog) {
                    DecoderUsageHelper.this.onDecoderInitialized(trackType, decoderName, mediaCodecSelectorLog);
                }

                @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
                public void onVideoDecoderEnabled(DecoderCounter decoderCounter) {
                    DecoderUsageHelper.this.onVideoDecoderEnabled(decoderCounter);
                }

                @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
                public void onVideoInputFormatChanged(TrackFormat format, MediaCodecReuseLog codecReuseLog) {
                    DecoderUsageHelper.this.onVideoInputFormatChanged(format, codecReuseLog);
                }
            });
        }
        return build;
    }
}
