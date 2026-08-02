package ru.yandex.video.m3.player;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.common.PriorityTaskManager;
import androidx.media3.exoplayer.ExoPlayer;
import defpackage.aac;
import defpackage.bvf0;
import defpackage.cvw;
import defpackage.d6z;
import defpackage.g221;
import defpackage.i3y;
import defpackage.ip4;
import defpackage.j5h;
import defpackage.jl40;
import defpackage.lbh;
import defpackage.lse;
import defpackage.mdh;
import defpackage.nmh;
import defpackage.omh;
import defpackage.ono;
import defpackage.p16;
import defpackage.pse;
import defpackage.qhw0;
import defpackage.seh;
import defpackage.sjh;
import defpackage.sls;
import defpackage.syi0;
import defpackage.te3;
import defpackage.tls;
import defpackage.tse;
import defpackage.ub10;
import defpackage.ue3;
import defpackage.ueh;
import defpackage.uyj;
import defpackage.vmh;
import defpackage.xen;
import defpackage.y3c;
import defpackage.yl51;
import defpackage.zl51;
import defpackage.zxc0;
import defpackage.zy11;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import kotlin.Metadata;
import kotlin.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.OkHttpClient;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.video.m3.model.config.delegate.ExoPlayerDelegateConfig;
import ru.yandex.video.m3.model.config.delegate.ExoPlayerDelegateConfigKt;
import ru.yandex.video.m3.model.config.mediasource.LoadErrorHandlingConfig;
import ru.yandex.video.m3.model.config.mediasource.MediaSourceConfig;
import ru.yandex.video.m3.player.ExoRenderersFactory;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.bandwidth.CommonBandwidthMeterFactoryKt;
import ru.yandex.video.m3.player.feature.PlaybackFeaturesProvider;
import ru.yandex.video.m3.player.impl.BandwidthMeterWithProxyTransferListener;
import ru.yandex.video.m3.player.impl.CompositeBandwidthMeter;
import ru.yandex.video.m3.player.impl.DefaultBandwidthMeterFactoryKt;
import ru.yandex.video.m3.player.impl.DefaultExoVideoComponent;
import ru.yandex.video.m3.player.impl.ExoPlayerDelegate;
import ru.yandex.video.m3.player.impl.SurfaceControlVideoComponent;
import ru.yandex.video.m3.player.impl.VideoComponent;
import ru.yandex.video.m3.player.impl.bandwidth.BandwidthEstimateObserver;
import ru.yandex.video.m3.player.impl.bandwidth.InitialBandwidthLastValueProvider;
import ru.yandex.video.m3.player.impl.bandwidth.InitialBandwidthValueProviderImpl;
import ru.yandex.video.m3.player.impl.codecs.LoggingMediaCodecSelector;
import ru.yandex.video.m3.player.impl.codecs.LoggingMediaCodecSelectorImpl;
import ru.yandex.video.m3.player.impl.drm.WidevineDrmSessionManagerFactory;
import ru.yandex.video.m3.player.impl.load_control.LoadControlFactory;
import ru.yandex.video.m3.player.impl.load_control.MemoryDependsLoadControlFactoryKt;
import ru.yandex.video.m3.player.impl.load_control.YandexLoadControl;
import ru.yandex.video.m3.player.impl.managers.AllowInitCodecManager;
import ru.yandex.video.m3.player.impl.managers.AllowInitCodecManagerImpl;
import ru.yandex.video.m3.player.impl.scaling.ExoScalingModeKt;
import ru.yandex.video.m3.player.impl.source.DefaultMediaSourceFactory;
import ru.yandex.video.m3.player.impl.source.DefaultMediaSourceFactoryKt;
import ru.yandex.video.m3.player.impl.trackselection.DefaultTrackSelectorFactoryKt;
import ru.yandex.video.m3.player.impl.trackselection.TrackSelectorFactory;
import ru.yandex.video.m3.player.impl.utils.ExoPlayerProperThreadRunner;
import ru.yandex.video.m3.player.impl.utils.ObserverDispatcher;
import ru.yandex.video.m3.player.live.LiveSpeedControlObserver;
import ru.yandex.video.m3.player.lowlatency.InitialBandwidthValueProvider;
import ru.yandex.video.m3.player.lowlatency.bandwidth.LowLatencyBandwidthMeter;
import ru.yandex.video.m3.player.parameters.PlayerDelegateParameters;
import ru.yandex.video.m3.player.provider.drm.DrmTypeConsumer;
import ru.yandex.video.m3.player.report.CodecReportEventLogger;
import ru.yandex.video.m3.player.report.builder.ReportBuilder;
import ru.yandex.video.m3.player.report.logger.RecordLogger;
import ru.yandex.video.m3.player.report.logger.RecordLoggerExtKt;
import ru.yandex.video.m3.preload.PreloadPrioritySettings;
import ru.yandex.video.m3.source.MediaSourceFactory;
import ru.yandex.video.m3.util.MarkedScheduledExecutorService;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 ;2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002<;BY\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001bH\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ3\u0010%\u001a\u00020$2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010*\u001a\u00020)2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b*\u0010+J\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b,\u0010-J%\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b,\u0010\u001fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010.R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010/R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00100R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00101R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00102R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00103R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00104R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u00105R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u00106R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u00107R\u0016\u00109\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006="}, d2 = {"Lru/yandex/video/m3/player/ExoPlayerDelegateFactory;", "Lru/yandex/video/m3/player/PlayerDelegateFactory;", "Lzxc0;", "Landroid/content/Context;", "context", "Lokhttp3/OkHttpClient;", "drmOkHttpClient", "Lru/yandex/video/m3/source/MediaSourceFactory;", "mediaSourceFactory", "Lru/yandex/video/m3/util/MarkedScheduledExecutorService;", "scheduledExecutorService", "Lru/yandex/video/m3/player/BandwidthMeterFactory;", "bandwidthMeterFactory", "Lru/yandex/video/m3/player/impl/trackselection/TrackSelectorFactory;", "trackSelectorFactory", "Lru/yandex/video/m3/player/impl/load_control/LoadControlFactory;", "loadControlFactory", "Lru/yandex/video/m3/player/ExoRenderersFactory;", "renderersFactory", "Lru/yandex/video/m3/player/AnalyticsListenerExtended;", "analyticsListener", "Lru/yandex/video/m3/model/config/delegate/ExoPlayerDelegateConfig;", ConfigConstants.CONFIG, "<init>", "(Landroid/content/Context;Lokhttp3/OkHttpClient;Lru/yandex/video/m3/source/MediaSourceFactory;Lru/yandex/video/m3/util/MarkedScheduledExecutorService;Lru/yandex/video/m3/player/BandwidthMeterFactory;Lru/yandex/video/m3/player/impl/trackselection/TrackSelectorFactory;Lru/yandex/video/m3/player/impl/load_control/LoadControlFactory;Lru/yandex/video/m3/player/ExoRenderersFactory;Lru/yandex/video/m3/player/AnalyticsListenerExtended;Lru/yandex/video/m3/model/config/delegate/ExoPlayerDelegateConfig;)V", "Lru/yandex/video/m3/player/parameters/PlayerDelegateParameters;", "parameters", "Lru/yandex/video/m3/player/feature/PlaybackFeaturesProvider;", "playbackFeaturesProvider", "Lru/yandex/video/m3/player/PlayerDelegate;", "createInternal", "(Lru/yandex/video/m3/player/parameters/PlayerDelegateParameters;Lru/yandex/video/m3/player/feature/PlaybackFeaturesProvider;)Lru/yandex/video/m3/player/PlayerDelegate;", "Lru/yandex/video/m3/player/impl/managers/AllowInitCodecManager;", "allowInitCodecManager", "Lub10;", "mediaCodecLifecycleObserverFactory", "Lsyi0;", "setupRenderersFactory", "(Lru/yandex/video/m3/player/ExoRenderersFactory;Lru/yandex/video/m3/player/parameters/PlayerDelegateParameters;Lru/yandex/video/m3/player/impl/managers/AllowInitCodecManager;Lub10;)Lsyi0;", "", "enable", "Lzy11;", "enableDecoderFallback", "(Z)V", "create", "(Lru/yandex/video/m3/player/parameters/PlayerDelegateParameters;)Lru/yandex/video/m3/player/PlayerDelegate;", "Landroid/content/Context;", "Lokhttp3/OkHttpClient;", "Lru/yandex/video/m3/source/MediaSourceFactory;", "Lru/yandex/video/m3/util/MarkedScheduledExecutorService;", "Lru/yandex/video/m3/player/BandwidthMeterFactory;", "Lru/yandex/video/m3/player/impl/trackselection/TrackSelectorFactory;", "Lru/yandex/video/m3/player/impl/load_control/LoadControlFactory;", "Lru/yandex/video/m3/player/ExoRenderersFactory;", "Lru/yandex/video/m3/player/AnalyticsListenerExtended;", "Lru/yandex/video/m3/model/config/delegate/ExoPlayerDelegateConfig;", "Lru/yandex/video/m3/player/impl/codecs/LoggingMediaCodecSelector;", "mediaCodecSelector", "Lru/yandex/video/m3/player/impl/codecs/LoggingMediaCodecSelector;", "Companion", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ExoPlayerDelegateFactory implements PlayerDelegateFactory<zxc0> {
    private static final String LOG_TAG = "CodecDebugReporter";
    private static final String MALEVICH_BUILD_MODEL = "SK68Y";
    private static final String TAG = "ExoPlayerDelegateFactor";
    private final AnalyticsListenerExtended analyticsListener;
    private final BandwidthMeterFactory bandwidthMeterFactory;
    private final ExoPlayerDelegateConfig config;
    private final Context context;
    private final OkHttpClient drmOkHttpClient;
    private final LoadControlFactory loadControlFactory;
    private LoggingMediaCodecSelector mediaCodecSelector;
    private final MediaSourceFactory mediaSourceFactory;
    private final ExoRenderersFactory renderersFactory;
    private final MarkedScheduledExecutorService scheduledExecutorService;
    private final TrackSelectorFactory trackSelectorFactory;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final i3y reportLoggerScope$delegate = a.a(new sls() { // from class: ru.yandex.video.m3.player.ExoPlayerDelegateFactory$Companion$reportLoggerScope$2
        @Override // defpackage.sls
        public final tse invoke() {
            qhw0 a = jl40.a();
            sjh sjhVar = uyj.a;
            mdh.b.getClass();
            return bvf0.a(cvw.U(a, g221.b.P(1)).plus(new pse("YP:reportLogger")).plus(new ExoPlayerDelegateFactory$Companion$reportLoggerScope$2$invoke$$inlined$CoroutineExceptionHandler$1(lse.a)));
        }
    });

    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\r\u00108\u001a\u000209H\u0000¢\u0006\u0002\b:R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u0004R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010 \u001a\u0004\u0018\u00010!X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001c\u0010&\u001a\u0004\u0018\u00010'X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001c\u0010,\u001a\u0004\u0018\u00010-X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001c\u00102\u001a\u0004\u0018\u000103X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107¨\u0006;"}, d2 = {"Lru/yandex/video/m3/player/ExoPlayerDelegateFactory$Builder;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "analyticsListener", "Lru/yandex/video/m3/player/AnalyticsListenerExtended;", "getAnalyticsListener", "()Lru/yandex/video/m3/player/AnalyticsListenerExtended;", "setAnalyticsListener", "(Lru/yandex/video/m3/player/AnalyticsListenerExtended;)V", "bandwidthMeterFactory", "Lru/yandex/video/m3/player/BandwidthMeterFactory;", "getBandwidthMeterFactory", "()Lru/yandex/video/m3/player/BandwidthMeterFactory;", "setBandwidthMeterFactory", "(Lru/yandex/video/m3/player/BandwidthMeterFactory;)V", ConfigConstants.CONFIG, "Lru/yandex/video/m3/model/config/delegate/ExoPlayerDelegateConfig;", "getConfig", "()Lru/yandex/video/m3/model/config/delegate/ExoPlayerDelegateConfig;", "setConfig", "(Lru/yandex/video/m3/model/config/delegate/ExoPlayerDelegateConfig;)V", "getContext", "()Landroid/content/Context;", "setContext", "drmOkHttpClient", "Lokhttp3/OkHttpClient;", "getDrmOkHttpClient", "()Lokhttp3/OkHttpClient;", "setDrmOkHttpClient", "(Lokhttp3/OkHttpClient;)V", "loadControlFactory", "Lru/yandex/video/m3/player/impl/load_control/LoadControlFactory;", "getLoadControlFactory", "()Lru/yandex/video/m3/player/impl/load_control/LoadControlFactory;", "setLoadControlFactory", "(Lru/yandex/video/m3/player/impl/load_control/LoadControlFactory;)V", "mediaSourceFactory", "Lru/yandex/video/m3/source/MediaSourceFactory;", "getMediaSourceFactory", "()Lru/yandex/video/m3/source/MediaSourceFactory;", "setMediaSourceFactory", "(Lru/yandex/video/m3/source/MediaSourceFactory;)V", "scheduledExecutorService", "Ljava/util/concurrent/ScheduledExecutorService;", "getScheduledExecutorService", "()Ljava/util/concurrent/ScheduledExecutorService;", "setScheduledExecutorService", "(Ljava/util/concurrent/ScheduledExecutorService;)V", "trackSelectorFactory", "Lru/yandex/video/m3/player/impl/trackselection/TrackSelectorFactory;", "getTrackSelectorFactory", "()Lru/yandex/video/m3/player/impl/trackselection/TrackSelectorFactory;", "setTrackSelectorFactory", "(Lru/yandex/video/m3/player/impl/trackselection/TrackSelectorFactory;)V", "build", "Lru/yandex/video/m3/player/ExoPlayerDelegateFactory;", "build$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private AnalyticsListenerExtended analyticsListener;
        private BandwidthMeterFactory bandwidthMeterFactory;
        private ExoPlayerDelegateConfig config;
        private Context context;
        private OkHttpClient drmOkHttpClient;
        private LoadControlFactory loadControlFactory;
        private MediaSourceFactory mediaSourceFactory;
        private ScheduledExecutorService scheduledExecutorService;
        private TrackSelectorFactory trackSelectorFactory;

        public Builder(Context context) {
            this.context = context;
        }

        public final ExoPlayerDelegateFactory build$video_player_internalRelease() {
            ScheduledExecutorService scheduledExecutorService = this.scheduledExecutorService;
            MarkedScheduledExecutorService markedScheduledExecutorService = scheduledExecutorService != null ? new MarkedScheduledExecutorService(false, scheduledExecutorService) : ExoPlayerDelegateFactory.INSTANCE.createDefaultExecutorService();
            ExoPlayerDelegateConfig exoPlayerDelegateConfig = this.config;
            if (exoPlayerDelegateConfig == null) {
                exoPlayerDelegateConfig = ExoPlayerDelegateConfigKt.ExoPlayerDelegateConfig$default(null, 1, null);
            }
            final ExoPlayerDelegateConfig exoPlayerDelegateConfig2 = exoPlayerDelegateConfig;
            ExoRenderersFactory ExoRenderersFactory = ExoRenderersFactoryKt.ExoRenderersFactory(this.context, new tls() { // from class: ru.yandex.video.m3.player.ExoPlayerDelegateFactory$Builder$build$renderersFactory$1
                {
                    super(1);
                }

                public final void invoke(ExoRenderersFactory.Builder builder) {
                    builder.setEnableOutputSurfaceWorkaround(ExoPlayerDelegateConfig.this.getEnableOutputSurfaceWorkaround());
                    builder.setMaxRecoverAttempts(ExoPlayerDelegateConfig.this.getMaxRecoverAttempts());
                    builder.setRecoverType(ExoPlayerDelegateConfig.this.getRecoverType());
                }

                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((ExoRenderersFactory.Builder) obj);
                    return zy11.a;
                }
            });
            Context context = this.context;
            OkHttpClient okHttpClient = this.drmOkHttpClient;
            if (okHttpClient == null) {
                okHttpClient = new OkHttpClient(new OkHttpClient.a());
            }
            MediaSourceFactory mediaSourceFactory = this.mediaSourceFactory;
            if (mediaSourceFactory == null) {
                mediaSourceFactory = DefaultMediaSourceFactoryKt.DefaultMediaSourceFactory$default(null, 1, null);
            }
            BandwidthMeterFactory bandwidthMeterFactory = this.bandwidthMeterFactory;
            if (bandwidthMeterFactory == null) {
                bandwidthMeterFactory = DefaultBandwidthMeterFactoryKt.DefaultBandwidthMeterFactory$default(null, 1, null);
            }
            TrackSelectorFactory trackSelectorFactory = this.trackSelectorFactory;
            if (trackSelectorFactory == null) {
                trackSelectorFactory = ExoPlayerDelegateFactory.INSTANCE.createDefaultTrackSelectorFactory(this.context);
            }
            TrackSelectorFactory trackSelectorFactory2 = trackSelectorFactory;
            LoadControlFactory loadControlFactory = this.loadControlFactory;
            if (loadControlFactory == null) {
                loadControlFactory = MemoryDependsLoadControlFactoryKt.MemoryDependsLoadControlFactory$default(this.context, null, 2, null);
            }
            LoadControlFactory loadControlFactory2 = loadControlFactory;
            AnalyticsListenerExtended analyticsListenerExtended = this.analyticsListener;
            if (analyticsListenerExtended == null) {
                analyticsListenerExtended = new DummyAnalyticsListenerExtended();
            }
            return new ExoPlayerDelegateFactory(context, okHttpClient, mediaSourceFactory, markedScheduledExecutorService, bandwidthMeterFactory, trackSelectorFactory2, loadControlFactory2, ExoRenderersFactory, analyticsListenerExtended, exoPlayerDelegateConfig2, null);
        }

        public final AnalyticsListenerExtended getAnalyticsListener() {
            return this.analyticsListener;
        }

        public final BandwidthMeterFactory getBandwidthMeterFactory() {
            return this.bandwidthMeterFactory;
        }

        public final ExoPlayerDelegateConfig getConfig() {
            return this.config;
        }

        public final Context getContext() {
            return this.context;
        }

        public final OkHttpClient getDrmOkHttpClient() {
            return this.drmOkHttpClient;
        }

        public final LoadControlFactory getLoadControlFactory() {
            return this.loadControlFactory;
        }

        public final MediaSourceFactory getMediaSourceFactory() {
            return this.mediaSourceFactory;
        }

        public final ScheduledExecutorService getScheduledExecutorService() {
            return this.scheduledExecutorService;
        }

        public final TrackSelectorFactory getTrackSelectorFactory() {
            return this.trackSelectorFactory;
        }

        public final void setAnalyticsListener(AnalyticsListenerExtended analyticsListenerExtended) {
            this.analyticsListener = analyticsListenerExtended;
        }

        public final void setBandwidthMeterFactory(BandwidthMeterFactory bandwidthMeterFactory) {
            this.bandwidthMeterFactory = bandwidthMeterFactory;
        }

        public final void setConfig(ExoPlayerDelegateConfig exoPlayerDelegateConfig) {
            this.config = exoPlayerDelegateConfig;
        }

        public final void setContext(Context context) {
            this.context = context;
        }

        public final void setDrmOkHttpClient(OkHttpClient okHttpClient) {
            this.drmOkHttpClient = okHttpClient;
        }

        public final void setLoadControlFactory(LoadControlFactory loadControlFactory) {
            this.loadControlFactory = loadControlFactory;
        }

        public final void setMediaSourceFactory(MediaSourceFactory mediaSourceFactory) {
            this.mediaSourceFactory = mediaSourceFactory;
        }

        public final void setScheduledExecutorService(ScheduledExecutorService scheduledExecutorService) {
            this.scheduledExecutorService = scheduledExecutorService;
        }

        public final void setTrackSelectorFactory(TrackSelectorFactory trackSelectorFactory) {
            this.trackSelectorFactory = trackSelectorFactory;
        }
    }

    private ExoPlayerDelegateFactory(Context context, OkHttpClient okHttpClient, MediaSourceFactory mediaSourceFactory, MarkedScheduledExecutorService markedScheduledExecutorService, BandwidthMeterFactory bandwidthMeterFactory, TrackSelectorFactory trackSelectorFactory, LoadControlFactory loadControlFactory, ExoRenderersFactory exoRenderersFactory, AnalyticsListenerExtended analyticsListenerExtended, ExoPlayerDelegateConfig exoPlayerDelegateConfig) {
        this.context = context;
        this.drmOkHttpClient = okHttpClient;
        this.mediaSourceFactory = mediaSourceFactory;
        this.scheduledExecutorService = markedScheduledExecutorService;
        this.bandwidthMeterFactory = bandwidthMeterFactory;
        this.trackSelectorFactory = trackSelectorFactory;
        this.loadControlFactory = loadControlFactory;
        this.renderersFactory = exoRenderersFactory;
        this.analyticsListener = analyticsListenerExtended;
        this.config = exoPlayerDelegateConfig;
        this.mediaCodecSelector = new LoggingMediaCodecSelectorImpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final PlayerDelegate<zxc0> createInternal(final PlayerDelegateParameters parameters, PlaybackFeaturesProvider playbackFeaturesProvider) {
        ip4 create;
        MediaSourceConfig config;
        ReportBuilder reportBuilder = parameters.getReportBuilder();
        InitialBandwidthValueProvider initialBandwidthValueProvider = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        RecordLogger orNoOp = RecordLoggerExtKt.orNoOp(reportBuilder != null ? reportBuilder.registerLogger(LOG_TAG, parameters.getCodecTelemetryReportLoggerRecordsCount()) : null);
        enableDecoderFallback(this.config.getSupplementalDelegateProperties().getEnableDecoderFallback());
        PreloadPrioritySettings preloadPrioritySettings = this.config.getPreloadPrioritySettings();
        if (preloadPrioritySettings != null) {
            preloadPrioritySettings.getPreloadPriorityTaskManager();
        }
        this.config.getPriorityTaskManager();
        ObserverDispatcher observerDispatcher = new ObserverDispatcher();
        int i = 1;
        InitialBandwidthValueProvider initialBandwidthLastValueProvider = jl40.l(parameters.getEnableUseLastBandwidthEstimate(), Boolean.TRUE) ? new InitialBandwidthLastValueProvider(initialBandwidthValueProvider, i, objArr3 == true ? 1 : 0) : jl40.l(parameters.getEnableUseLastBandwidthEstimate(), Boolean.FALSE) ? InitialBandwidthValueProviderImpl.INSTANCE : this.config.getUseBandwidthLastValueProvider() ? new InitialBandwidthLastValueProvider(objArr2 == true ? 1 : 0, i, objArr == true ? 1 : 0) : this.config.getInitialBandwidthValueProvider() != null ? this.config.getInitialBandwidthValueProvider() : InitialBandwidthValueProviderImpl.INSTANCE;
        BandwidthEstimateObserver bandwidthEstimateObserver = initialBandwidthLastValueProvider instanceof InitialBandwidthLastValueProvider ? new BandwidthEstimateObserver(this.context) : null;
        BandwidthMeterFactory commonFactoryInstance = parameters.getUseMultiplatformBandwidthEstimator() ? CommonBandwidthMeterFactoryKt.getCommonFactoryInstance(BandwidthMeterFactory.INSTANCE, parameters.getUseMultiplatformBandwidthEstimatorWithPlatformSync()) : this.bandwidthMeterFactory;
        boolean supportLowLatency = playbackFeaturesProvider.getSupportLowLatency();
        Context context = this.context;
        if (supportLowLatency) {
            create = new CompositeBandwidthMeter(commonFactoryInstance.create(context, initialBandwidthLastValueProvider), new LowLatencyBandwidthMeter.Factory().create(this.context, initialBandwidthLastValueProvider), new Handler(parameters.getExoPlayerLooper()));
            observerDispatcher.add((ObserverDispatcher) create);
        } else {
            create = commonFactoryInstance.create(context, initialBandwidthLastValueProvider);
        }
        final BandwidthMeterWithProxyTransferListener bandwidthMeterWithProxyTransferListener = new BandwidthMeterWithProxyTransferListener(create);
        WidevineDrmSessionManagerFactory widevineDrmSessionManagerFactory = new WidevineDrmSessionManagerFactory(this.drmOkHttpClient, this.config.getDrmConfig().getMinLoadableRetryCount(), this.config.getDrmConfig().getPreferL3DRMSecurityLevel());
        if (this.config.getDrmConfig().getExperimentalEnableDrmSessionForClearVideo()) {
            widevineDrmSessionManagerFactory.enableDrmSessionForClearVideo(true);
        }
        AllowInitCodecManagerImpl allowInitCodecManagerImpl = this.config.getSupplementalDelegateProperties().getExperimentalAllowPreloadWithoutInitCodecs() ? new AllowInitCodecManagerImpl() : null;
        CodecReportEventLogger codecReportEventLogger = parameters.getEnableCodecTelemetryReportLogger() ? new CodecReportEventLogger(orNoOp, INSTANCE.getReportLoggerScope()) : null;
        final syi0 syi0Var = setupRenderersFactory(this.renderersFactory, parameters, allowInitCodecManagerImpl, codecReportEventLogger);
        final vmh create2 = this.trackSelectorFactory.create(parameters.getTrackSelectionRestrictionsProvider());
        final ExoPlayerProperThreadRunner exoPlayerProperThreadRunner = new ExoPlayerProperThreadRunner(parameters.getExoPlayerLooper());
        final YandexLoadControl create3 = this.loadControlFactory.create();
        yl51 yl51Var = new yl51();
        LiveSpeedControlObserver liveSpeedControlObserver = this.config.getLiveSpeedControlObserver();
        yl51Var.d = liveSpeedControlObserver;
        final zl51 zl51Var = new zl51(yl51Var.a, yl51Var.b, yl51Var.c, liveSpeedControlObserver);
        final ExoPlayer exoPlayer = (ExoPlayer) exoPlayerProperThreadRunner.runOnProperThread(new sls() { // from class: ru.yandex.video.m3.player.ExoPlayerDelegateFactory$createInternal$exoPlayer$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final ExoPlayer invoke() {
                Context context2;
                Context context3;
                ExoPlayerDelegateConfig exoPlayerDelegateConfig;
                ExoPlayerDelegateConfig exoPlayerDelegateConfig2;
                ExoPlayerDelegateConfig exoPlayerDelegateConfig3;
                ExoPlayerDelegateConfig exoPlayerDelegateConfig4;
                context2 = ExoPlayerDelegateFactory.this.context;
                ueh uehVar = new ueh(context2, new lbh());
                j5h j5hVar = new j5h(y3c.a);
                context3 = ExoPlayerDelegateFactory.this.context;
                syi0 syi0Var2 = syi0Var;
                vmh vmhVar = create2;
                YandexLoadControl yandexLoadControl = create3;
                BandwidthMeterWithProxyTransferListener bandwidthMeterWithProxyTransferListener2 = bandwidthMeterWithProxyTransferListener;
                ono onoVar = new ono(context3, new seh(4, syi0Var2), new seh(5, uehVar), new seh(6, vmhVar), new seh(7, yandexLoadControl), new seh(8, bandwidthMeterWithProxyTransferListener2), new xen(3, j5hVar));
                syi0Var2.getClass();
                vmhVar.getClass();
                bandwidthMeterWithProxyTransferListener2.getClass();
                PlayerDelegateParameters playerDelegateParameters = parameters;
                ExoPlayerDelegateFactory exoPlayerDelegateFactory = ExoPlayerDelegateFactory.this;
                zl51 zl51Var2 = zl51Var;
                Looper exoPlayerLooper = playerDelegateParameters.getExoPlayerLooper();
                d6z.x(!onoVar.y);
                exoPlayerLooper.getClass();
                onoVar.i = exoPlayerLooper;
                exoPlayerDelegateConfig = exoPlayerDelegateFactory.config;
                PriorityTaskManager priorityTaskManager = exoPlayerDelegateConfig.getPriorityTaskManager();
                d6z.x(!onoVar.y);
                onoVar.k = priorityTaskManager;
                d6z.x(!onoVar.y);
                zl51Var2.getClass();
                onoVar.u = zl51Var2;
                int exoScalingMode = ExoScalingModeKt.toExoScalingMode(playerDelegateParameters.getVideoScalingMode());
                d6z.x(!onoVar.y);
                onoVar.o = exoScalingMode;
                exoPlayerDelegateConfig2 = exoPlayerDelegateFactory.config;
                boolean audioBecomingNoisy = exoPlayerDelegateConfig2.getAudioDelegateConfig().getAudioBecomingNoisy();
                d6z.x(!onoVar.y);
                onoVar.n = audioBecomingNoisy;
                exoPlayerDelegateConfig3 = exoPlayerDelegateFactory.config;
                Long releaseTimeoutMs = exoPlayerDelegateConfig3.getSupplementalDelegateProperties().getReleaseTimeoutMs();
                if (releaseTimeoutMs != null) {
                    long longValue = releaseTimeoutMs.longValue();
                    d6z.x(!onoVar.y);
                    onoVar.v = longValue;
                }
                exoPlayerDelegateConfig4 = exoPlayerDelegateFactory.config;
                if (exoPlayerDelegateConfig4.getAudioDelegateConfig().getAutomaticallyHandleAudioFocus()) {
                    te3 te3Var = new te3();
                    te3Var.a = 3;
                    ue3 ue3Var = new ue3(te3Var.a);
                    d6z.x(!onoVar.y);
                    onoVar.l = ue3Var;
                    onoVar.m = true;
                }
                return onoVar.a();
            }
        });
        exoPlayer.addAnalyticsListener(this.analyticsListener);
        if (codecReportEventLogger != null) {
            exoPlayer.addAnalyticsListener(codecReportEventLogger);
        }
        VideoComponent videoComponent = (VideoComponent) exoPlayerProperThreadRunner.runOnProperThread(new sls() { // from class: ru.yandex.video.m3.player.ExoPlayerDelegateFactory$createInternal$videoComponent$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final VideoComponent invoke() {
                ExoPlayerDelegateConfig exoPlayerDelegateConfig;
                exoPlayerDelegateConfig = ExoPlayerDelegateFactory.this.config;
                return (exoPlayerDelegateConfig.getSupplementalDelegateProperties().getExperimental_enableSurfaceControl() || parameters.getUseSurfaceControl()) ? new SurfaceControlVideoComponent(exoPlayer, exoPlayerProperThreadRunner) : new DefaultExoVideoComponent(exoPlayer, exoPlayerProperThreadRunner);
            }
        });
        MediaSourceFactory mediaSourceFactory = this.mediaSourceFactory;
        DefaultMediaSourceFactory defaultMediaSourceFactory = mediaSourceFactory instanceof DefaultMediaSourceFactory ? (DefaultMediaSourceFactory) mediaSourceFactory : null;
        LoadErrorHandlingConfig loadErrorHandlingConfig = (defaultMediaSourceFactory == null || (config = defaultMediaSourceFactory.getConfig()) == null) ? null : config.getLoadErrorHandlingConfig();
        AllowInitCodecManagerImpl allowInitCodecManagerImpl2 = allowInitCodecManagerImpl;
        MediaSourceFactory mediaSourceFactory2 = this.mediaSourceFactory;
        MarkedScheduledExecutorService markedScheduledExecutorService = this.scheduledExecutorService;
        AnalyticsListenerExtended analyticsListenerExtended = this.analyticsListener;
        boolean eventLoggerEnabled = this.config.getSupplementalDelegateProperties().getEventLoggerEnabled();
        LoggingMediaCodecSelector loggingMediaCodecSelector = this.mediaCodecSelector;
        Looper exoPlayerLooper = parameters.getExoPlayerLooper();
        boolean expDoNotRecreateWrapper = this.config.getSupplementalDelegateProperties().getExpDoNotRecreateWrapper();
        LiveSpeedControlObserver liveSpeedControlObserver2 = this.config.getLiveSpeedControlObserver();
        PreloadPrioritySettings preloadPrioritySettings2 = this.config.getPreloadPrioritySettings();
        DrmTypeConsumer drmTypeConsumer = parameters.getDrmTypeConsumer();
        boolean shouldHandleZeroStartPositionAsDefault = this.config.getSupplementalDelegateProperties().getShouldHandleZeroStartPositionAsDefault();
        boolean allowDisabledTrackVariant = this.config.getSupplementalDelegateProperties().getAllowDisabledTrackVariant();
        boolean monitorFrameDrops = this.config.getSupplementalDelegateProperties().getMonitorFrameDrops();
        boolean allowDisabledAudioTrackVariant = this.config.getSupplementalDelegateProperties().getAllowDisabledAudioTrackVariant();
        boolean allowPendingAudioTrackDisabling = this.config.getSupplementalDelegateProperties().getAllowPendingAudioTrackDisabling();
        Boolean ignoreSeekOnSamePosition = parameters.getIgnoreSeekOnSamePosition();
        return new ExoPlayerDelegate(exoPlayer, mediaSourceFactory2, create2, widevineDrmSessionManagerFactory, markedScheduledExecutorService, exoPlayerProperThreadRunner, bandwidthMeterWithProxyTransferListener, analyticsListenerExtended, videoComponent, eventLoggerEnabled, loggingMediaCodecSelector, exoPlayerLooper, create3, expDoNotRecreateWrapper, liveSpeedControlObserver2, preloadPrioritySettings2, null, null, drmTypeConsumer, null, orNoOp, shouldHandleZeroStartPositionAsDefault, playbackFeaturesProvider, observerDispatcher, allowDisabledTrackVariant, monitorFrameDrops, loadErrorHandlingConfig, bandwidthEstimateObserver, allowDisabledAudioTrackVariant, allowPendingAudioTrackDisabling, allowInitCodecManagerImpl2, ignoreSeekOnSamePosition != null ? ignoreSeekOnSamePosition.booleanValue() : false, parameters.getStuckStalledConfig(), 720896, 0, null);
    }

    public static /* synthetic */ PlayerDelegate createInternal$default(ExoPlayerDelegateFactory exoPlayerDelegateFactory, PlayerDelegateParameters playerDelegateParameters, PlaybackFeaturesProvider playbackFeaturesProvider, int i, Object obj) {
        if ((i & 2) != 0) {
            playbackFeaturesProvider = PlaybackFeaturesProvider.INSTANCE;
        }
        return exoPlayerDelegateFactory.createInternal(playerDelegateParameters, playbackFeaturesProvider);
    }

    private final void enableDecoderFallback(boolean enable) {
        if (enable) {
            ExoRenderersFactory exoRenderersFactory = this.renderersFactory;
            if (exoRenderersFactory == null) {
                exoRenderersFactory = null;
            }
            if (exoRenderersFactory != null) {
                exoRenderersFactory.setEnableDecoderFallback(true);
                exoRenderersFactory.setMediaCodecSelector(this.mediaCodecSelector);
            }
        }
    }

    private final syi0 setupRenderersFactory(ExoRenderersFactory renderersFactory, final PlayerDelegateParameters parameters, final AllowInitCodecManager allowInitCodecManager, final ub10 mediaCodecLifecycleObserverFactory) {
        return renderersFactory.copy$video_player_internalRelease(new tls() { // from class: ru.yandex.video.m3.player.ExoPlayerDelegateFactory$setupRenderersFactory$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(ExoRenderersFactory.Builder builder) {
                builder.setStrmEventLogger$video_player_internalRelease(PlayerDelegateParameters.this.getStrmEventLogger());
                builder.setAllowInitCodecManager$video_player_internalRelease(allowInitCodecManager);
                builder.setMediaCodecLifecycleObserverFactory$video_player_internalRelease(mediaCodecLifecycleObserverFactory);
                builder.setRecoverType(PlayerDelegateParameters.this.getCodecRecoverStrategy());
                builder.setMaxRecoverAttempts(Integer.valueOf(PlayerDelegateParameters.this.getCodecRecoverStrategyAttempts()));
                PlayerDelegateParameters playerDelegateParameters = PlayerDelegateParameters.this;
                builder.setCodecInitializationConfiguration$video_player_internalRelease(new aac(playerDelegateParameters.getShouldTryInitCodecsWithRetries(), playerDelegateParameters.getInitCodecRetriesCount(), playerDelegateParameters.getInitCodecTimeoutMs(), playerDelegateParameters.getUseIncrementalCodecInitTimeout()));
                builder.setDisableTooEarlyMediaCodecNativeReleaseReturnWorkaround(Boolean.valueOf(PlayerDelegateParameters.this.getDisableTooEarlyMediaCodecNativeReleaseReturnWorkaround()));
                List<String> modelsNeedsSetOutputSurfaceWorkaround = PlayerDelegateParameters.this.getModelsNeedsSetOutputSurfaceWorkaround();
                String str = Build.MODEL;
                if (modelsNeedsSetOutputSurfaceWorkaround.contains(str)) {
                    builder.setEnableOutputSurfaceWorkaround(Boolean.TRUE);
                }
                if (PlayerDelegateParameters.this.getEnableAsyncDecoderQueue() != null) {
                    builder.setEnableAsyncDecoderQueue(PlayerDelegateParameters.this.getEnableAsyncDecoderQueue());
                } else if (jl40.l(str, "SK68Y")) {
                    builder.setEnableAsyncDecoderQueue(Boolean.FALSE);
                }
                builder.setDisableCodecReuseInCaseOfCodecProfileOrLevelChange$video_player_internalRelease(Boolean.valueOf(PlayerDelegateParameters.this.getDisableCodecReuseInCaseOfCodecProfileOrLevelUpgrade()));
            }

            @Override // defpackage.tls
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((ExoRenderersFactory.Builder) obj);
                return zy11.a;
            }
        });
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegateFactory
    public PlayerDelegate<zxc0> create(PlayerDelegateParameters parameters) throws PlaybackException.ErrorGeneric, PlaybackException.DrmThrowable, PlaybackException.UnsupportedContentException {
        return createInternal$default(this, parameters, null, 2, null);
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, d2 = {"Lru/yandex/video/m3/player/ExoPlayerDelegateFactory$Companion;", "", "<init>", "()V", "Lru/yandex/video/m3/util/MarkedScheduledExecutorService;", "createDefaultExecutorService", "()Lru/yandex/video/m3/util/MarkedScheduledExecutorService;", "Landroid/content/Context;", "context", "Lru/yandex/video/m3/player/impl/trackselection/TrackSelectorFactory;", "createDefaultTrackSelectorFactory", "(Landroid/content/Context;)Lru/yandex/video/m3/player/impl/trackselection/TrackSelectorFactory;", "Ltse;", "reportLoggerScope$delegate", "Li3y;", "getReportLoggerScope", "()Ltse;", "reportLoggerScope", "", "LOG_TAG", "Ljava/lang/String;", "MALEVICH_BUILD_MODEL", "TAG", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final MarkedScheduledExecutorService createDefaultExecutorService() {
            return new MarkedScheduledExecutorService(true, Executors.newSingleThreadScheduledExecutor(new p16(Executors.defaultThreadFactory(), 5)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Thread createDefaultExecutorService$lambda$1(ThreadFactory threadFactory, Runnable runnable) {
            Thread newThread = threadFactory.newThread(runnable);
            newThread.setName("YP:EPD");
            return newThread;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final TrackSelectorFactory createDefaultTrackSelectorFactory(Context context) {
            return DefaultTrackSelectorFactoryKt.DefaultTrackSelectorFactory$default(context, new omh(new nmh()), null, 4, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final tse getReportLoggerScope() {
            return (tse) ExoPlayerDelegateFactory.reportLoggerScope$delegate.getValue();
        }

        private Companion() {
        }
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegateFactory
    public PlayerDelegate<zxc0> create(PlayerDelegateParameters parameters, PlaybackFeaturesProvider playbackFeaturesProvider) {
        return createInternal(parameters, playbackFeaturesProvider);
    }

    public /* synthetic */ ExoPlayerDelegateFactory(Context context, OkHttpClient okHttpClient, MediaSourceFactory mediaSourceFactory, MarkedScheduledExecutorService markedScheduledExecutorService, BandwidthMeterFactory bandwidthMeterFactory, TrackSelectorFactory trackSelectorFactory, LoadControlFactory loadControlFactory, ExoRenderersFactory exoRenderersFactory, AnalyticsListenerExtended analyticsListenerExtended, ExoPlayerDelegateConfig exoPlayerDelegateConfig, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, okHttpClient, mediaSourceFactory, markedScheduledExecutorService, bandwidthMeterFactory, trackSelectorFactory, loadControlFactory, exoRenderersFactory, analyticsListenerExtended, exoPlayerDelegateConfig);
    }
}
