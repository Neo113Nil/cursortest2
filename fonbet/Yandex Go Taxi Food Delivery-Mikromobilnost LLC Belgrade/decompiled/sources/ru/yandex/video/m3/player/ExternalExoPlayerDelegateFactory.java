package ru.yandex.video.m3.player;

import android.os.Looper;
import androidx.media3.exoplayer.ExoPlayer;
import defpackage.ip4;
import defpackage.p16;
import defpackage.sls;
import defpackage.uf10;
import defpackage.vmh;
import defpackage.zxc0;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.bandwidth.CommonBandwidthMeterFactory;
import ru.yandex.video.m3.player.drm.DrmSecurityLevel;
import ru.yandex.video.m3.player.drm.ExoDrmSessionManager;
import ru.yandex.video.m3.player.drm.ExoDrmSessionManagerFactory;
import ru.yandex.video.m3.player.drm.ExoDrmSessionManagerListener;
import ru.yandex.video.m3.player.impl.BandwidthMeterWithProxyTransferListener;
import ru.yandex.video.m3.player.impl.DefaultExoVideoComponent;
import ru.yandex.video.m3.player.impl.ExoPlayerDelegate;
import ru.yandex.video.m3.player.impl.SurfaceControlVideoComponent;
import ru.yandex.video.m3.player.impl.VideoComponent;
import ru.yandex.video.m3.player.impl.codecs.LoggingMediaCodecSelector;
import ru.yandex.video.m3.player.impl.codecs.LoggingMediaCodecSelectorImpl;
import ru.yandex.video.m3.player.impl.utils.ExoPlayerProperThreadRunner;
import ru.yandex.video.m3.player.parameters.PlayerDelegateParameters;
import ru.yandex.video.m3.player.report.logger.RecordLogger;
import ru.yandex.video.m3.player.report.logger.RecordLoggerExtKt;
import ru.yandex.video.m3.source.MediaSourceFactory;
import ru.yandex.video.m3.source.MediaSourceParameters;
import ru.yandex.video.m3.util.MarkedScheduledExecutorService;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0016R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0017R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/yandex/video/m3/player/ExternalExoPlayerDelegateFactory;", "Lru/yandex/video/m3/player/PlayerDelegateFactory;", "Lzxc0;", "Landroidx/media3/exoplayer/ExoPlayer;", "exoPlayer", "Lip4;", "bandwidthMeter", "Ljava/util/concurrent/ScheduledExecutorService;", "scheduledExecutorService", "Lru/yandex/video/m3/player/AnalyticsListenerExtended;", "analyticsListener", "", "experimental_enableSurfaceControl", "<init>", "(Landroidx/media3/exoplayer/ExoPlayer;Lip4;Ljava/util/concurrent/ScheduledExecutorService;Lru/yandex/video/m3/player/AnalyticsListenerExtended;Z)V", "Lru/yandex/video/m3/player/parameters/PlayerDelegateParameters;", "parameters", "Lru/yandex/video/m3/player/PlayerDelegate;", "create", "(Lru/yandex/video/m3/player/parameters/PlayerDelegateParameters;)Lru/yandex/video/m3/player/PlayerDelegate;", "Landroidx/media3/exoplayer/ExoPlayer;", "Lip4;", "Ljava/util/concurrent/ScheduledExecutorService;", "Lru/yandex/video/m3/player/AnalyticsListenerExtended;", "Z", "Lru/yandex/video/m3/player/impl/codecs/LoggingMediaCodecSelector;", "mediaCodecSelector", "Lru/yandex/video/m3/player/impl/codecs/LoggingMediaCodecSelector;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ExternalExoPlayerDelegateFactory implements PlayerDelegateFactory<zxc0> {
    public static final int $stable = 8;
    private final AnalyticsListenerExtended analyticsListener;
    private final ip4 bandwidthMeter;
    private final ExoPlayer exoPlayer;
    private final boolean experimental_enableSurfaceControl;
    private LoggingMediaCodecSelector mediaCodecSelector;
    private final ScheduledExecutorService scheduledExecutorService;

    public /* synthetic */ ExternalExoPlayerDelegateFactory(ExoPlayer exoPlayer, ip4 ip4Var, ScheduledExecutorService scheduledExecutorService, AnalyticsListenerExtended analyticsListenerExtended, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(exoPlayer, ip4Var, (i & 4) != 0 ? Executors.newSingleThreadScheduledExecutor(new p16(Executors.defaultThreadFactory(), 6)) : scheduledExecutorService, (i & 8) != 0 ? new DummyAnalyticsListenerExtended() : analyticsListenerExtended, (i & 16) != 0 ? false : z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread _init_$lambda$2$lambda$1(ThreadFactory threadFactory, Runnable runnable) {
        Thread newThread = threadFactory.newThread(runnable);
        newThread.setName("YP:ExternalExoPlayerDelegate");
        return newThread;
    }

    @Override // ru.yandex.video.m3.player.PlayerDelegateFactory
    public PlayerDelegate<zxc0> create(PlayerDelegateParameters parameters) throws PlaybackException.ErrorGeneric, PlaybackException.DrmThrowable, PlaybackException.UnsupportedContentException {
        BandwidthMeterWithProxyTransferListener bandwidthMeterWithProxyTransferListener = new BandwidthMeterWithProxyTransferListener(parameters.getUseMultiplatformBandwidthEstimator() ? new CommonBandwidthMeterFactory(parameters.getUseMultiplatformBandwidthEstimatorWithPlatformSync()).create() : this.bandwidthMeter);
        Looper exoPlayerLooper = parameters.getExoPlayerLooper();
        final ExoPlayerProperThreadRunner exoPlayerProperThreadRunner = new ExoPlayerProperThreadRunner(exoPlayerLooper);
        return new ExternalExoPlayerDelegate(new ExoPlayerDelegate(this.exoPlayer, new MediaSourceFactory() { // from class: ru.yandex.video.m3.player.ExternalExoPlayerDelegateFactory$create$1
            @Override // ru.yandex.video.m3.source.MediaSourceFactory
            public uf10 create(MediaSourceParameters parameters2) {
                throw new RuntimeException("wrong usage!. With external delegate factory you have to create MediaSource by yourself");
            }
        }, (vmh) this.exoPlayer.getTrackSelector(), new ExoDrmSessionManagerFactory() { // from class: ru.yandex.video.m3.player.ExternalExoPlayerDelegateFactory$create$2
            @Override // ru.yandex.video.m3.player.drm.ExoDrmSessionManagerFactory
            public ExoDrmSessionManager create(DrmSecurityLevel securityLevel, ExoDrmSessionManagerListener listener) {
                throw new RuntimeException("wrong usage! With external delegate factory you have to create DrmSession by yourself");
            }
        }, new MarkedScheduledExecutorService(false, this.scheduledExecutorService), exoPlayerProperThreadRunner, bandwidthMeterWithProxyTransferListener, this.analyticsListener, (VideoComponent) exoPlayerProperThreadRunner.runOnProperThread(new sls() { // from class: ru.yandex.video.m3.player.ExternalExoPlayerDelegateFactory$create$exoVideoComponent$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final VideoComponent invoke() {
                boolean z;
                ExoPlayer exoPlayer;
                ExoPlayer exoPlayer2;
                z = ExternalExoPlayerDelegateFactory.this.experimental_enableSurfaceControl;
                if (z) {
                    exoPlayer2 = ExternalExoPlayerDelegateFactory.this.exoPlayer;
                    return new SurfaceControlVideoComponent(exoPlayer2, exoPlayerProperThreadRunner);
                }
                exoPlayer = ExternalExoPlayerDelegateFactory.this.exoPlayer;
                return new DefaultExoVideoComponent(exoPlayer, exoPlayerProperThreadRunner);
            }
        }), false, this.mediaCodecSelector, exoPlayerLooper, null, false, null, null, null, null, parameters.getDrmTypeConsumer(), null, RecordLoggerExtKt.createNoOp(RecordLogger.INSTANCE), false, null, null, false, false, null, null, false, false, null, false, null, -70541312, 1, null));
    }

    public ExternalExoPlayerDelegateFactory(ExoPlayer exoPlayer, ip4 ip4Var, ScheduledExecutorService scheduledExecutorService, AnalyticsListenerExtended analyticsListenerExtended, boolean z) {
        this.exoPlayer = exoPlayer;
        this.bandwidthMeter = ip4Var;
        this.scheduledExecutorService = scheduledExecutorService;
        this.analyticsListener = analyticsListenerExtended;
        this.experimental_enableSurfaceControl = z;
        this.mediaCodecSelector = new LoggingMediaCodecSelectorImpl();
    }
}
