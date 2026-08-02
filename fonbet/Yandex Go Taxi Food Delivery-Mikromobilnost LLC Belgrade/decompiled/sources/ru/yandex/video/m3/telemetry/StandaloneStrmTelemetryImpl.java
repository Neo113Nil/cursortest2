package ru.yandex.video.m3.telemetry;

import android.content.Context;
import android.os.Handler;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.f;
import defpackage.aw60;
import defpackage.ip4;
import defpackage.ono;
import defpackage.rf10;
import defpackage.sls;
import defpackage.tls;
import defpackage.vmh;
import defpackage.vuu;
import defpackage.x001;
import defpackage.xf7;
import defpackage.zy11;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import ru.yandex.video.m3.player.IndexGenerator;
import ru.yandex.video.m3.player.impl.BandwidthMeterWithProxyTransferListener;
import ru.yandex.video.m3.player.impl.codecs.LoggingMediaCodecSelectorImpl;
import ru.yandex.video.m3.player.impl.listeners.InternalAnalyticsListener;
import ru.yandex.video.m3.player.impl.listeners.InternalBandwidthMeterEventListener;
import ru.yandex.video.m3.player.impl.listeners.InternalPlayerEventListener;
import ru.yandex.video.m3.player.impl.listeners.TracksChangeListener;
import ru.yandex.video.m3.player.impl.tracking.utils.ManifestUrlInflater;
import ru.yandex.video.m3.player.impl.utils.CurrentWindowStateProvider;
import ru.yandex.video.m3.player.impl.utils.ObserverDispatcher;
import ru.yandex.video.m3.player.netperf.NetPerfManager;
import ru.yandex.video.m3.telemetry.datasource.StrmTelemetryDataSourceFactory;
import ru.yandex.video.m3.telemetry.datasource.impl.DataSourceErrorNotifierImpl;
import ru.yandex.video.m3.telemetry.exo.StrmTelemetryExoPlayer;
import ru.yandex.video.m3.telemetry.helpers.PlaybackStatsProvider;
import ru.yandex.video.m3.telemetry.helpers.StandaloneTelemetryHelper;
import ru.yandex.video.m3.telemetry.helpers.netperf.NetPerfManagerControlCallRestrictor;
import ru.yandex.video.m3.telemetry.player.StandaloneTelemetryPlayerDelegateObserver;
import ru.yandex.video.m3.telemetry.player.StandaloneTelemetryYandexPlayerFactory;

@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J?\u0010!\u001a\u00020 2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b!\u0010\"J#\u0010(\u001a\u00020'2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0#H\u0016¢\u0006\u0004\b(\u0010)J+\u0010,\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00142\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020%0#H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0002H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020%H\u0016¢\u0006\u0004\b0\u00101R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00102R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00103R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00104R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00105R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00106R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00107R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00108R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006="}, d2 = {"Lru/yandex/video/m3/telemetry/StandaloneStrmTelemetryImpl;", "Lru/yandex/video/m3/telemetry/StandaloneStrmTelemetry;", "", "sessionId", "Lru/yandex/video/m3/player/netperf/NetPerfManager;", "netPerfManager", "Lxf7;", "netPerfCallFactory", "Lru/yandex/video/m3/player/impl/tracking/utils/ManifestUrlInflater;", "manifestUrlInflater", "Lru/yandex/video/m3/player/IndexGenerator;", "sourceIndexGenerator", "Lru/yandex/video/m3/telemetry/player/StandaloneTelemetryYandexPlayerFactory;", "standaloneTelemetryYandexPlayerFactory", "Ljava/util/concurrent/ExecutorService;", "cachedThreadPool", "Lru/yandex/video/m3/telemetry/datasource/impl/DataSourceErrorNotifierImpl;", "dataSourceErrorNotifier", "<init>", "(Ljava/lang/String;Lru/yandex/video/m3/player/netperf/NetPerfManager;Lxf7;Lru/yandex/video/m3/player/impl/tracking/utils/ManifestUrlInflater;Lru/yandex/video/m3/player/IndexGenerator;Lru/yandex/video/m3/telemetry/player/StandaloneTelemetryYandexPlayerFactory;Ljava/util/concurrent/ExecutorService;Lru/yandex/video/m3/telemetry/datasource/impl/DataSourceErrorNotifierImpl;)V", "Landroid/content/Context;", "context", "Landroidx/media3/exoplayer/ExoPlayer;", "exoPlayer", "Lru/yandex/video/m3/telemetry/player/StandaloneTelemetryPlayerDelegateObserver;", "observer", "Lru/yandex/video/m3/telemetry/helpers/PlaybackStatsProvider;", "playbackStatsProvider", "Lrf10;", "externalMediaSourceFactory", "Lip4;", "externalBandwidthMeter", "Lru/yandex/video/m3/telemetry/exo/StrmTelemetryExoPlayer;", "buildStrmTelemetryExoPlayer", "(Landroid/content/Context;Landroidx/media3/exoplayer/ExoPlayer;Lru/yandex/video/m3/telemetry/player/StandaloneTelemetryPlayerDelegateObserver;Lru/yandex/video/m3/telemetry/helpers/PlaybackStatsProvider;Lrf10;Lip4;)Lru/yandex/video/m3/telemetry/exo/StrmTelemetryExoPlayer;", "Lkotlin/Function1;", "Law60;", "Lzy11;", "okHttpDataSourceFactoryAction", "Lvuu;", "createFlavouredHttpDataSourceFactory", "(Ltls;)Lvuu;", "Lono;", "exoPlayerBuilderAction", "createFlavouredExoPlayer", "(Landroid/content/Context;Ltls;)Landroidx/media3/exoplayer/ExoPlayer;", "getSessionId", "()Ljava/lang/String;", "release", "()V", "Ljava/lang/String;", "Lru/yandex/video/m3/player/netperf/NetPerfManager;", "Lxf7;", "Lru/yandex/video/m3/player/impl/tracking/utils/ManifestUrlInflater;", "Lru/yandex/video/m3/player/IndexGenerator;", "Lru/yandex/video/m3/telemetry/player/StandaloneTelemetryYandexPlayerFactory;", "Ljava/util/concurrent/ExecutorService;", "Lru/yandex/video/m3/telemetry/datasource/impl/DataSourceErrorNotifierImpl;", "Lru/yandex/video/m3/telemetry/helpers/netperf/NetPerfManagerControlCallRestrictor;", "netPerfManagerCallRestrictor", "Lru/yandex/video/m3/telemetry/helpers/netperf/NetPerfManagerControlCallRestrictor;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StandaloneStrmTelemetryImpl implements StandaloneStrmTelemetry {
    public static final int $stable = 8;
    private final ExecutorService cachedThreadPool;
    private final DataSourceErrorNotifierImpl dataSourceErrorNotifier;
    private final ManifestUrlInflater manifestUrlInflater;
    private final xf7 netPerfCallFactory;
    private final NetPerfManager netPerfManager;
    private final NetPerfManagerControlCallRestrictor netPerfManagerCallRestrictor;
    private final String sessionId;
    private final IndexGenerator sourceIndexGenerator;
    private final StandaloneTelemetryYandexPlayerFactory standaloneTelemetryYandexPlayerFactory;

    public StandaloneStrmTelemetryImpl(String str, NetPerfManager netPerfManager, xf7 xf7Var, ManifestUrlInflater manifestUrlInflater, IndexGenerator indexGenerator, StandaloneTelemetryYandexPlayerFactory standaloneTelemetryYandexPlayerFactory, ExecutorService executorService, DataSourceErrorNotifierImpl dataSourceErrorNotifierImpl) {
        this.sessionId = str;
        this.netPerfManager = netPerfManager;
        this.netPerfCallFactory = xf7Var;
        this.manifestUrlInflater = manifestUrlInflater;
        this.sourceIndexGenerator = indexGenerator;
        this.standaloneTelemetryYandexPlayerFactory = standaloneTelemetryYandexPlayerFactory;
        this.cachedThreadPool = executorService;
        this.dataSourceErrorNotifier = dataSourceErrorNotifierImpl;
        this.netPerfManagerCallRestrictor = new NetPerfManagerControlCallRestrictor(netPerfManager);
    }

    private final StrmTelemetryExoPlayer buildStrmTelemetryExoPlayer(Context context, ExoPlayer exoPlayer, final StandaloneTelemetryPlayerDelegateObserver observer, PlaybackStatsProvider playbackStatsProvider, rf10 externalMediaSourceFactory, final ip4 externalBandwidthMeter) {
        Handler handler = new Handler(exoPlayer.getApplicationLooper());
        ObserverDispatcher observerDispatcher = new ObserverDispatcher();
        observerDispatcher.add((ObserverDispatcher) observer);
        InternalPlayerEventListener internalPlayerEventListener = new InternalPlayerEventListener(null, observerDispatcher, new CurrentWindowStateProvider(exoPlayer));
        exoPlayer.addListener(internalPlayerEventListener);
        x001 trackSelector = exoPlayer.getTrackSelector();
        if (trackSelector instanceof vmh) {
            exoPlayer.addListener(new TracksChangeListener(null, (vmh) trackSelector, observerDispatcher));
        }
        exoPlayer.addAnalyticsListener(new InternalAnalyticsListener(observerDispatcher, new LoggingMediaCodecSelectorImpl()));
        final InternalBandwidthMeterEventListener internalBandwidthMeterEventListener = new InternalBandwidthMeterEventListener(observerDispatcher);
        BandwidthMeterWithProxyTransferListener bandwidthMeterWithProxyTransferListener = new BandwidthMeterWithProxyTransferListener(externalBandwidthMeter);
        externalBandwidthMeter.addEventListener(handler, internalBandwidthMeterEventListener);
        StandaloneTelemetryHelper standaloneTelemetryHelper = new StandaloneTelemetryHelper(playbackStatsProvider, internalPlayerEventListener, observer);
        this.dataSourceErrorNotifier.addObserver(observer);
        return new StrmTelemetryExoPlayer(exoPlayer, standaloneTelemetryHelper, handler, externalMediaSourceFactory, bandwidthMeterWithProxyTransferListener.getProxyTransferListener(), this.netPerfManagerCallRestrictor, new sls() { // from class: ru.yandex.video.m3.telemetry.StandaloneStrmTelemetryImpl$buildStrmTelemetryExoPlayer$onReleaseAction$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m902invoke() {
                DataSourceErrorNotifierImpl dataSourceErrorNotifierImpl;
                ip4.this.removeEventListener(internalBandwidthMeterEventListener);
                dataSourceErrorNotifierImpl = this.dataSourceErrorNotifier;
                dataSourceErrorNotifierImpl.removeObserver(observer);
            }

            @Override // defpackage.sls
            public /* bridge */ /* synthetic */ Object invoke() {
                m902invoke();
                return zy11.a;
            }
        });
    }

    @Override // ru.yandex.video.m3.telemetry.StandaloneStrmTelemetry
    public ExoPlayer createFlavouredExoPlayer(Context context, tls exoPlayerBuilderAction) {
        Context applicationContext = context.getApplicationContext();
        ono onoVar = new ono(applicationContext);
        exoPlayerBuilderAction.invoke(onoVar);
        rf10 rf10Var = (rf10) onoVar.d.get();
        ip4 ip4Var = (ip4) onoVar.g.get();
        f a = onoVar.a();
        PlaybackStatsProvider playbackStatsProvider = new PlaybackStatsProvider(a);
        return buildStrmTelemetryExoPlayer(applicationContext, a, this.standaloneTelemetryYandexPlayerFactory.create(playbackStatsProvider, this.sourceIndexGenerator).getObserver(), playbackStatsProvider, rf10Var, ip4Var);
    }

    @Override // ru.yandex.video.m3.telemetry.StandaloneStrmTelemetry
    public vuu createFlavouredHttpDataSourceFactory(tls okHttpDataSourceFactoryAction) {
        aw60 aw60Var = new aw60(this.netPerfCallFactory);
        okHttpDataSourceFactoryAction.invoke(aw60Var);
        return new StrmTelemetryDataSourceFactory(this.sessionId, aw60Var, this.dataSourceErrorNotifier, this.manifestUrlInflater, this.netPerfManagerCallRestrictor);
    }

    @Override // ru.yandex.video.m3.telemetry.StandaloneStrmTelemetry
    public String getSessionId() {
        return this.sessionId;
    }

    @Override // ru.yandex.video.m3.telemetry.StandaloneStrmTelemetry
    public void release() {
        this.netPerfManager.stop$video_player_internalRelease();
        this.cachedThreadPool.shutdown();
    }
}
