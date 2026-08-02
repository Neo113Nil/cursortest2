package ru.yandex.video.m3.player.lowlatency.bandwidth;

import android.content.Context;
import android.os.Handler;
import defpackage.cj01;
import defpackage.h5z0;
import defpackage.hp4;
import defpackage.ip4;
import defpackage.jl40;
import defpackage.kpg;
import defpackage.npg;
import defpackage.qv10;
import defpackage.tw21;
import defpackage.zy11;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;
import ru.yandex.video.m3.player.BandwidthMeterFactory;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.impl.utils.ObserverDispatcher;
import ru.yandex.video.m3.player.impl.utils.network.NetworkTypeProviderImpl;
import ru.yandex.video.m3.player.lowlatency.InitialBandwidthValueProvider;
import ru.yandex.video.m3.player.lowlatency.bandwidth.LowLatencyBandwidthMeter;
import ru.yandex.video.m3.player.lowlatency.bandwidth.ewma.EwmaBandwidthEstimator;
import ru.yandex.video.m3.player.lowlatency.source.ChunkDownloadListener;
import ru.yandex.video.m3.player.tracks.TrackType;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 K2\u00020\u00012\u00020\u00022\u00020\u0003:\u0003KLMB'\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001a\u0010\u0017J/\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\fH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010(\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b*\u0010+J'\u00101\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020\bH\u0016¢\u0006\u0004\b1\u00102J'\u00103\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020\bH\u0016¢\u0006\u0004\b3\u00102J/\u00106\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020\b2\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b6\u00107J'\u00108\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020\bH\u0016¢\u0006\u0004\b8\u00102R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00109R\u0014\u0010:\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010<\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010;R\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010C\u001a\u00020@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010BR\u0016\u0010D\u001a\u00020@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010BR\u0014\u0010E\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010BR\u0016\u0010F\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010;R\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020H0G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010J¨\u0006N"}, d2 = {"Lru/yandex/video/m3/player/lowlatency/bandwidth/LowLatencyBandwidthMeter;", "Lip4;", "Lcj01;", "Lru/yandex/video/m3/player/lowlatency/source/ChunkDownloadListener;", "Landroid/content/Context;", "context", "Lru/yandex/video/m3/player/lowlatency/InitialBandwidthValueProvider;", "initialBandwidthValueProvider", "", "useDynamicEstimatePrediction", "<init>", "(Landroid/content/Context;Lru/yandex/video/m3/player/lowlatency/InitialBandwidthValueProvider;Z)V", "", "bytes", RemoteBioParameters.TIME, "Lzy11;", "flushSample", "(JJ)V", "Lru/yandex/video/m3/player/tracks/TrackType;", PlaybackException.ErrorInRenderer.TRACK_TYPE, "segmentBytesDownloaded", "segmentDownloadTime", "flushSegment", "(Lru/yandex/video/m3/player/tracks/TrackType;JJ)V", "chunkDownloadBytes", "chunkDownloadTime", "flushChunk", "sampleBytes", "sampleTime", "currentTimeMs", "submitPendingSample", "(Lru/yandex/video/m3/player/tracks/TrackType;JJJ)V", "getBitrateEstimate", "()J", "getTransferListener", "()Lcj01;", "Landroid/os/Handler;", "eventHandler", "Lhp4;", "eventListener", "addEventListener", "(Landroid/os/Handler;Lhp4;)V", "removeEventListener", "(Lhp4;)V", "Lkpg;", "source", "Lnpg;", "dataSpec", "isNetwork", "onTransferInitializing", "(Lkpg;Lnpg;Z)V", "onTransferStart", "", "bytesTransferred", "onBytesTransferred", "(Lkpg;Lnpg;ZI)V", "onTransferEnd", "Z", "initialBitrateEstimate", "J", "bitrateEstimate", "Lru/yandex/video/m3/player/lowlatency/bandwidth/ewma/EwmaBandwidthEstimator;", "ewmaBandwidthEstimator", "Lru/yandex/video/m3/player/lowlatency/bandwidth/ewma/EwmaBandwidthEstimator;", "Ljava/util/concurrent/atomic/AtomicLong;", "lastAudioChunkBytes", "Ljava/util/concurrent/atomic/AtomicLong;", "lastAudioSegmentBytes", "pendingAudioSampleBytes", "pendingBandwidthPrediction", "lastPredictionUpdateTimestamp", "Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;", "Lru/yandex/video/m3/player/lowlatency/bandwidth/LowLatencyBandwidthMeter$HandlerAndListener;", "listeners", "Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;", "Companion", "Factory", "HandlerAndListener", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LowLatencyBandwidthMeter implements ip4, cj01, ChunkDownloadListener {
    private static final long INITIAL_BITRATE_ESTIMATE = 2300000;
    private static final long PREDICTION_RATE_MS = 50;
    private volatile long bitrateEstimate;
    private final EwmaBandwidthEstimator ewmaBandwidthEstimator;
    private final long initialBitrateEstimate;
    private final AtomicLong lastAudioChunkBytes;
    private AtomicLong lastAudioSegmentBytes;
    private long lastPredictionUpdateTimestamp;
    private final ObserverDispatcher<HandlerAndListener> listeners;
    private AtomicLong pendingAudioSampleBytes;
    private final AtomicLong pendingBandwidthPrediction;
    private final boolean useDynamicEstimatePrediction;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001c"}, d2 = {"Lru/yandex/video/m3/player/lowlatency/bandwidth/LowLatencyBandwidthMeter$HandlerAndListener;", "", "Landroid/os/Handler;", "handler", "Lhp4;", "listener", "<init>", "(Landroid/os/Handler;Lhp4;)V", "component1", "()Landroid/os/Handler;", "component2", "()Lhp4;", "copy", "(Landroid/os/Handler;Lhp4;)Lru/yandex/video/m3/player/lowlatency/bandwidth/LowLatencyBandwidthMeter$HandlerAndListener;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/os/Handler;", "getHandler", "Lhp4;", "getListener", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class HandlerAndListener {
        private final Handler handler;
        private final hp4 listener;

        public HandlerAndListener(Handler handler, hp4 hp4Var) {
            this.handler = handler;
            this.listener = hp4Var;
        }

        public static /* synthetic */ HandlerAndListener copy$default(HandlerAndListener handlerAndListener, Handler handler, hp4 hp4Var, int i, Object obj) {
            if ((i & 1) != 0) {
                handler = handlerAndListener.handler;
            }
            if ((i & 2) != 0) {
                hp4Var = handlerAndListener.listener;
            }
            return handlerAndListener.copy(handler, hp4Var);
        }

        /* renamed from: component1, reason: from getter */
        public final Handler getHandler() {
            return this.handler;
        }

        /* renamed from: component2, reason: from getter */
        public final hp4 getListener() {
            return this.listener;
        }

        public final HandlerAndListener copy(Handler handler, hp4 listener) {
            return new HandlerAndListener(handler, listener);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HandlerAndListener)) {
                return false;
            }
            HandlerAndListener handlerAndListener = (HandlerAndListener) other;
            return jl40.l(this.handler, handlerAndListener.handler) && jl40.l(this.listener, handlerAndListener.listener);
        }

        public final Handler getHandler() {
            return this.handler;
        }

        public final hp4 getListener() {
            return this.listener;
        }

        public int hashCode() {
            return this.listener.hashCode() + (this.handler.hashCode() * 31);
        }

        public String toString() {
            return "HandlerAndListener(handler=" + this.handler + ", listener=" + this.listener + ')';
        }
    }

    private LowLatencyBandwidthMeter(Context context, InitialBandwidthValueProvider initialBandwidthValueProvider, boolean z) {
        this.useDynamicEstimatePrediction = z;
        long initialBitrateEstimate = initialBandwidthValueProvider != null ? initialBandwidthValueProvider.getInitialBitrateEstimate(context, NetworkTypeProviderImpl.INSTANCE.getInstance(context).getForceNetworkType(context), tw21.y(context)) : INITIAL_BITRATE_ESTIMATE;
        this.initialBitrateEstimate = initialBitrateEstimate;
        h5z0.a.a(qv10.j(initialBitrateEstimate, "Initial Bitrate Estimate = "), new Object[0]);
        this.bitrateEstimate = initialBitrateEstimate;
        this.ewmaBandwidthEstimator = new EwmaBandwidthEstimator(true);
        this.lastAudioChunkBytes = new AtomicLong();
        this.lastAudioSegmentBytes = new AtomicLong();
        this.pendingAudioSampleBytes = new AtomicLong();
        this.pendingBandwidthPrediction = new AtomicLong();
        this.lastPredictionUpdateTimestamp = System.currentTimeMillis();
        this.listeners = new ObserverDispatcher<>();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void flushSample(long bytes, long time) {
        HashSet H0;
        final LowLatencyBandwidthMeter lowLatencyBandwidthMeter;
        final long j;
        final long j2;
        Object failure;
        Throwable a;
        this.ewmaBandwidthEstimator.sample(time, bytes);
        this.bitrateEstimate = (long) this.ewmaBandwidthEstimator.getBandwidthEstimate(this.initialBitrateEstimate);
        ObserverDispatcher<HandlerAndListener> observerDispatcher = this.listeners;
        synchronized (observerDispatcher.getObservers()) {
            H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            try {
                final HandlerAndListener handlerAndListener = (HandlerAndListener) it.next();
                lowLatencyBandwidthMeter = this;
                j = bytes;
                j2 = time;
                try {
                    handlerAndListener.getHandler().post(new Runnable() { // from class: ru.yandex.video.m3.player.lowlatency.bandwidth.a
                        @Override // java.lang.Runnable
                        public final void run() {
                            LowLatencyBandwidthMeter.flushSample$lambda$3$lambda$2(LowLatencyBandwidthMeter.HandlerAndListener.this, j2, j, lowLatencyBandwidthMeter);
                        }
                    });
                    failure = zy11.a;
                } catch (Throwable th) {
                    th = th;
                    failure = new Result.Failure(th);
                    a = Result.a(failure);
                    if (a == null) {
                    }
                    time = j2;
                    bytes = j;
                    this = lowLatencyBandwidthMeter;
                }
            } catch (Throwable th2) {
                th = th2;
                lowLatencyBandwidthMeter = this;
                j = bytes;
                j2 = time;
            }
            a = Result.a(failure);
            if (a == null) {
                h5z0.a.f(a, "notifyObservers", new Object[0]);
            }
            time = j2;
            bytes = j;
            this = lowLatencyBandwidthMeter;
        }
        LowLatencyBandwidthMeter lowLatencyBandwidthMeter2 = this;
        lowLatencyBandwidthMeter2.pendingBandwidthPrediction.set(lowLatencyBandwidthMeter2.bitrateEstimate);
        lowLatencyBandwidthMeter2.pendingAudioSampleBytes.set(0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void flushSample$lambda$3$lambda$2(HandlerAndListener handlerAndListener, long j, long j2, LowLatencyBandwidthMeter lowLatencyBandwidthMeter) {
        handlerAndListener.getListener().onBandwidthSample((int) j, j2, lowLatencyBandwidthMeter.bitrateEstimate);
    }

    @Override // defpackage.ip4
    public void addEventListener(Handler eventHandler, hp4 eventListener) {
        this.listeners.add((ObserverDispatcher<HandlerAndListener>) new HandlerAndListener(eventHandler, eventListener));
    }

    @Override // ru.yandex.video.m3.player.lowlatency.source.ChunkDownloadListener
    public void flushChunk(TrackType trackType, long chunkDownloadBytes, long chunkDownloadTime) {
        if (trackType == TrackType.Video) {
            flushSample(this.lastAudioChunkBytes.get() + chunkDownloadBytes, chunkDownloadTime);
        } else if (trackType == TrackType.Audio) {
            this.lastAudioChunkBytes.set(chunkDownloadBytes);
        }
    }

    @Override // ru.yandex.video.m3.player.lowlatency.source.ChunkDownloadListener
    public void flushSegment(TrackType trackType, long segmentBytesDownloaded, long segmentDownloadTime) {
        if (trackType == TrackType.Video) {
            flushSample(this.lastAudioSegmentBytes.get() + segmentBytesDownloaded, segmentDownloadTime);
        } else if (trackType == TrackType.Audio) {
            this.lastAudioSegmentBytes.set(segmentBytesDownloaded);
        }
    }

    @Override // defpackage.ip4
    public long getBitrateEstimate() {
        if (!this.useDynamicEstimatePrediction) {
            return this.bitrateEstimate;
        }
        Long valueOf = Long.valueOf(this.pendingBandwidthPrediction.get());
        if (valueOf.longValue() <= 0) {
            valueOf = null;
        }
        return valueOf != null ? valueOf.longValue() : this.bitrateEstimate;
    }

    @Override // defpackage.ip4
    public /* bridge */ /* synthetic */ long getTimeToFirstByteEstimateUs() {
        return -9223372036854775807L;
    }

    @Override // defpackage.ip4
    /* renamed from: getTransferListener */
    public cj01 getProxyTransferListener() {
        return this;
    }

    @Override // defpackage.cj01
    public void onBytesTransferred(kpg source, npg dataSpec, boolean isNetwork, int bytesTransferred) {
    }

    @Override // defpackage.cj01
    public void onTransferEnd(kpg source, npg dataSpec, boolean isNetwork) {
    }

    @Override // defpackage.cj01
    public void onTransferInitializing(kpg source, npg dataSpec, boolean isNetwork) {
    }

    @Override // defpackage.cj01
    public void onTransferStart(kpg source, npg dataSpec, boolean isNetwork) {
    }

    @Override // defpackage.ip4
    public void removeEventListener(hp4 eventListener) {
        Object obj;
        Iterator<T> it = this.listeners.getObservers().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (jl40.l(((HandlerAndListener) obj).getListener(), eventListener)) {
                    break;
                }
            }
        }
        HandlerAndListener handlerAndListener = (HandlerAndListener) obj;
        if (handlerAndListener != null) {
            this.listeners.remove(handlerAndListener);
        }
    }

    @Override // ru.yandex.video.m3.player.lowlatency.source.ChunkDownloadListener
    public void submitPendingSample(TrackType trackType, long sampleBytes, long sampleTime, long currentTimeMs) {
        if (trackType != TrackType.Video) {
            if (trackType == TrackType.Audio) {
                this.pendingAudioSampleBytes.set(sampleBytes);
            }
        } else {
            if (currentTimeMs - this.lastPredictionUpdateTimestamp < 50) {
                return;
            }
            this.pendingBandwidthPrediction.set((long) this.ewmaBandwidthEstimator.predictEstimate(this.initialBitrateEstimate, sampleTime, this.pendingAudioSampleBytes.get() + sampleBytes));
            this.lastPredictionUpdateTimestamp = currentTimeMs;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0007\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/yandex/video/m3/player/lowlatency/bandwidth/LowLatencyBandwidthMeter$Factory;", "Lru/yandex/video/m3/player/BandwidthMeterFactory;", "<init>", "()V", "Landroid/content/Context;", "context", "Lip4;", "create", "(Landroid/content/Context;)Lip4;", "Lru/yandex/video/m3/player/lowlatency/InitialBandwidthValueProvider;", "initialBandwidthValueProvider", "(Landroid/content/Context;Lru/yandex/video/m3/player/lowlatency/InitialBandwidthValueProvider;)Lip4;", "", "value", "shouldUseDynamicEstimatePrediction", "(Z)Lru/yandex/video/m3/player/lowlatency/bandwidth/LowLatencyBandwidthMeter$Factory;", "useDynamicEstimatePrediction", "Z", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Factory implements BandwidthMeterFactory {
        public static final int $stable = 8;
        private boolean useDynamicEstimatePrediction;

        @Override // ru.yandex.video.m3.player.BandwidthMeterFactory
        public ip4 create(Context context) {
            return new LowLatencyBandwidthMeter(context, null, false, 6, null);
        }

        public final Factory shouldUseDynamicEstimatePrediction(boolean value) {
            this.useDynamicEstimatePrediction = value;
            return this;
        }

        @Override // ru.yandex.video.m3.player.BandwidthMeterFactory
        public ip4 create(Context context, InitialBandwidthValueProvider initialBandwidthValueProvider) {
            return new LowLatencyBandwidthMeter(context, initialBandwidthValueProvider, this.useDynamicEstimatePrediction, null);
        }
    }

    public /* synthetic */ LowLatencyBandwidthMeter(Context context, InitialBandwidthValueProvider initialBandwidthValueProvider, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, initialBandwidthValueProvider, z);
    }

    public /* synthetic */ LowLatencyBandwidthMeter(Context context, InitialBandwidthValueProvider initialBandwidthValueProvider, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : initialBandwidthValueProvider, (i & 4) != 0 ? false : z);
    }
}
