package ru.yandex.video.m3.player.impl.load_control.provider;

import defpackage.zy50;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.collections.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.data.MediaCodecReuseLog;
import ru.yandex.video.m3.player.PlayerAnalyticsObserver;
import ru.yandex.video.m3.player.PlayerObserver;
import ru.yandex.video.m3.player.YandexPlayer;
import ru.yandex.video.m3.player.impl.load_control.DynamicBufferDependNetworkQualityParams;
import ru.yandex.video.m3.player.impl.utils.SystemTimeProvider;
import ru.yandex.video.m3.player.impl.utils.TimeProvider;
import ru.yandex.video.m3.player.tracks.TrackFormat;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000 F2\u00020\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004:\u0003FGHB\u0019\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0013\u001a\u00020\u00122\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ\u001b\u0010\u001e\u001a\u00020\u000f2\n\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010 \u001a\u00020\u000f2\n\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u001cH\u0016¢\u0006\u0004\b \u0010\u001fJ\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J!\u0010,\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020(2\b\u0010+\u001a\u0004\u0018\u00010*H\u0016¢\u0006\u0004\b,\u0010-J'\u00101\u001a\u00020\u000f2\u0006\u0010.\u001a\u00020!2\u0006\u0010/\u001a\u00020\u00152\u0006\u00100\u001a\u00020\u0015H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020$H\u0016¢\u0006\u0004\b3\u00104R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00105R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00106R\u0016\u00107\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u00109\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010;\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010:R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010?\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010A\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010:R\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010BR\u0016\u0010C\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010E\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010:¨\u0006I"}, d2 = {"Lru/yandex/video/m3/player/impl/load_control/provider/NetworkQualityProviderImpl;", "Lzy50;", "Lru/yandex/video/m3/player/impl/load_control/provider/DependentLifecycle;", "Lru/yandex/video/m3/player/PlayerAnalyticsObserver;", "Lru/yandex/video/m3/player/PlayerObserver;", "", "Lru/yandex/video/m3/player/impl/load_control/DynamicBufferDependNetworkQualityParams;", "params", "Lru/yandex/video/m3/player/impl/utils/TimeProvider;", "timeProvider", "<init>", "(Lru/yandex/video/m3/player/impl/load_control/DynamicBufferDependNetworkQualityParams;Lru/yandex/video/m3/player/impl/utils/TimeProvider;)V", "", "Lru/yandex/video/m3/player/impl/load_control/provider/NetworkQualityProviderImpl$NetworkQualityMeasurement;", "bitrateEstimates", "Lzy11;", "deleteOldEstimates", "(Ljava/util/List;)V", "Lru/yandex/video/m3/player/impl/load_control/provider/NetworkQualityProviderImpl$NetworkQuality;", "determineNetworkStability", "(Ljava/util/List;)Lru/yandex/video/m3/player/impl/load_control/provider/NetworkQualityProviderImpl$NetworkQuality;", "", "bandwidthEstimation", "getQualityForCurrentFormat", "(J)Lru/yandex/video/m3/player/impl/load_control/provider/NetworkQualityProviderImpl$NetworkQuality;", "updateSmoothCounter", "()V", "dropNetworkQualityEstimates", "Lru/yandex/video/m3/player/YandexPlayer;", "yandexPlayer", "start", "(Lru/yandex/video/m3/player/YandexPlayer;)V", "release", "", "getGoodNetworkCounter", "()I", "", "willPlayWhenReady", "onWillPlayWhenReadyChanged", "(Z)V", "Lru/yandex/video/m3/player/tracks/TrackFormat;", "format", "Lru/yandex/video/m3/data/MediaCodecReuseLog;", "codecReuseLog", "onVideoInputFormatChanged", "(Lru/yandex/video/m3/player/tracks/TrackFormat;Lru/yandex/video/m3/data/MediaCodecReuseLog;)V", "elapsedMs", "bytesTransferred", "bitrateEstimate", "onBandwidthSample", "(IJJ)V", "isGoodNetwork", "()Z", "Lru/yandex/video/m3/player/impl/load_control/DynamicBufferDependNetworkQualityParams;", "Lru/yandex/video/m3/player/impl/utils/TimeProvider;", "networkQuality", "Lru/yandex/video/m3/player/impl/load_control/provider/NetworkQualityProviderImpl$NetworkQuality;", "lastBitrateEstimateTime", "J", "lastCounterGoodNetworkEstimateUpdateTime", "Ljava/util/concurrent/atomic/AtomicInteger;", "counterGoodNetworkEstimateInRow", "Ljava/util/concurrent/atomic/AtomicInteger;", "playWhenReady", "Z", "lastBitrateEstimate", "Ljava/util/List;", "currentFormatBitrate", CA20Status.STATUS_USER_I, "duration", "Companion", "NetworkQuality", "NetworkQualityMeasurement", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NetworkQualityProviderImpl implements zy50, DependentLifecycle, PlayerAnalyticsObserver, PlayerObserver<Object> {
    private static final long SMOOTH_COUNTER_TIMEOUT_MS = 3000;
    private static final long TIME_LIMIT_BANDWIDTH_ESTIMATE_MS = 7000;
    private static final long TIME_LIMIT_IS_NETWORK_STABLE_MS = 10000;
    private List<NetworkQualityMeasurement> bitrateEstimates;
    private final AtomicInteger counterGoodNetworkEstimateInRow;
    private int currentFormatBitrate;
    private final long duration;
    private long lastBitrateEstimate;
    private volatile long lastBitrateEstimateTime;
    private volatile long lastCounterGoodNetworkEstimateUpdateTime;
    private volatile NetworkQuality networkQuality;
    private final DynamicBufferDependNetworkQualityParams params;
    private volatile boolean playWhenReady;
    private final TimeProvider timeProvider;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/yandex/video/m3/player/impl/load_control/provider/NetworkQualityProviderImpl$NetworkQuality;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "POOR", "GOOD", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum NetworkQuality {
        POOR(1),
        GOOD(0);

        private final int value;

        NetworkQuality(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lru/yandex/video/m3/player/impl/load_control/provider/NetworkQualityProviderImpl$NetworkQualityMeasurement;", "", "timeMillis", "", "networkQuality", "Lru/yandex/video/m3/player/impl/load_control/provider/NetworkQualityProviderImpl$NetworkQuality;", "(JLru/yandex/video/m3/player/impl/load_control/provider/NetworkQualityProviderImpl$NetworkQuality;)V", "getNetworkQuality", "()Lru/yandex/video/m3/player/impl/load_control/provider/NetworkQualityProviderImpl$NetworkQuality;", "getTimeMillis", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class NetworkQualityMeasurement {
        private final NetworkQuality networkQuality;
        private final long timeMillis;

        public NetworkQualityMeasurement(long j, NetworkQuality networkQuality) {
            this.timeMillis = j;
            this.networkQuality = networkQuality;
        }

        public static /* synthetic */ NetworkQualityMeasurement copy$default(NetworkQualityMeasurement networkQualityMeasurement, long j, NetworkQuality networkQuality, int i, Object obj) {
            if ((i & 1) != 0) {
                j = networkQualityMeasurement.timeMillis;
            }
            if ((i & 2) != 0) {
                networkQuality = networkQualityMeasurement.networkQuality;
            }
            return networkQualityMeasurement.copy(j, networkQuality);
        }

        /* renamed from: component1, reason: from getter */
        public final long getTimeMillis() {
            return this.timeMillis;
        }

        /* renamed from: component2, reason: from getter */
        public final NetworkQuality getNetworkQuality() {
            return this.networkQuality;
        }

        public final NetworkQualityMeasurement copy(long timeMillis, NetworkQuality networkQuality) {
            return new NetworkQualityMeasurement(timeMillis, networkQuality);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NetworkQualityMeasurement)) {
                return false;
            }
            NetworkQualityMeasurement networkQualityMeasurement = (NetworkQualityMeasurement) other;
            return this.timeMillis == networkQualityMeasurement.timeMillis && this.networkQuality == networkQualityMeasurement.networkQuality;
        }

        public final NetworkQuality getNetworkQuality() {
            return this.networkQuality;
        }

        public final long getTimeMillis() {
            return this.timeMillis;
        }

        public int hashCode() {
            return this.networkQuality.hashCode() + (Long.hashCode(this.timeMillis) * 31);
        }

        public String toString() {
            return "NetworkQualityMeasurement(timeMillis=" + this.timeMillis + ", networkQuality=" + this.networkQuality + ')';
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NetworkQuality.values().length];
            try {
                iArr[NetworkQuality.GOOD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NetworkQuality.POOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public NetworkQualityProviderImpl(DynamicBufferDependNetworkQualityParams dynamicBufferDependNetworkQualityParams, TimeProvider timeProvider) {
        this.params = dynamicBufferDependNetworkQualityParams;
        this.timeProvider = timeProvider;
        this.networkQuality = NetworkQuality.POOR;
        this.counterGoodNetworkEstimateInRow = new AtomicInteger(0);
        this.bitrateEstimates = new ArrayList();
        this.duration = dynamicBufferDependNetworkQualityParams.getDurationTimeInSeconds() * 1000;
    }

    private final void deleteOldEstimates(List<NetworkQualityMeasurement> bitrateEstimates) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : bitrateEstimates) {
            if (this.timeProvider.currentTimeMillis() - ((NetworkQualityMeasurement) obj).getTimeMillis() < this.duration + TIME_LIMIT_BANDWIDTH_ESTIMATE_MS) {
                arrayList.add(obj);
            }
        }
        this.bitrateEstimates = new ArrayList(arrayList);
    }

    private final NetworkQuality determineNetworkStability(List<NetworkQualityMeasurement> bitrateEstimates) {
        if (((NetworkQualityMeasurement) a.Z(bitrateEstimates)).getTimeMillis() - ((NetworkQualityMeasurement) a.P(bitrateEstimates)).getTimeMillis() < this.duration * 0.8d) {
            return NetworkQuality.POOR;
        }
        long pow = (long) (Math.pow(bitrateEstimates.get((bitrateEstimates.size() - 1) / 2).getTimeMillis() - ((NetworkQualityMeasurement) a.P(bitrateEstimates)).getTimeMillis(), 2.0d) + Math.pow(((NetworkQualityMeasurement) a.Z(bitrateEstimates)).getTimeMillis() - ((NetworkQualityMeasurement) a.P(bitrateEstimates)).getTimeMillis(), 2.0d));
        long j = 0;
        for (NetworkQualityMeasurement networkQualityMeasurement : bitrateEstimates) {
            j += ((long) Math.pow(networkQualityMeasurement.getTimeMillis() - ((NetworkQualityMeasurement) a.P(bitrateEstimates)).getTimeMillis(), 2.0d)) * networkQualityMeasurement.getNetworkQuality().getValue();
        }
        return j >= pow ? NetworkQuality.POOR : NetworkQuality.GOOD;
    }

    private final void dropNetworkQualityEstimates() {
        this.networkQuality = NetworkQuality.POOR;
        this.bitrateEstimates.clear();
    }

    private final NetworkQuality getQualityForCurrentFormat(long bandwidthEstimation) {
        return ((float) bandwidthEstimation) / ((float) this.currentFormatBitrate) >= this.params.getBandwidthFactor() ? NetworkQuality.GOOD : NetworkQuality.POOR;
    }

    private final void updateSmoothCounter() {
        long currentTimeMillis = this.timeProvider.currentTimeMillis();
        int i = WhenMappings.$EnumSwitchMapping$0[this.networkQuality.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            this.counterGoodNetworkEstimateInRow.set(0);
            this.lastCounterGoodNetworkEstimateUpdateTime = currentTimeMillis;
            return;
        }
        if (currentTimeMillis - this.lastCounterGoodNetworkEstimateUpdateTime > 3000) {
            this.counterGoodNetworkEstimateInRow.incrementAndGet();
            this.lastCounterGoodNetworkEstimateUpdateTime = currentTimeMillis;
        }
    }

    @Override // defpackage.zy50
    public int getGoodNetworkCounter() {
        return this.counterGoodNetworkEstimateInRow.get();
    }

    @Override // defpackage.zy50
    public boolean isGoodNetwork() {
        long currentTimeMillis = this.timeProvider.currentTimeMillis() - this.lastBitrateEstimateTime;
        if (this.playWhenReady && currentTimeMillis > 10000) {
            dropNetworkQualityEstimates();
        }
        return this.networkQuality == NetworkQuality.GOOD;
    }

    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onBandwidthSample(int elapsedMs, long bytesTransferred, long bitrateEstimate) {
        long currentTimeMillis = this.timeProvider.currentTimeMillis();
        if (bitrateEstimate != this.lastBitrateEstimate || currentTimeMillis - this.lastBitrateEstimateTime >= 1000) {
            if ((this.timeProvider.currentTimeMillis() - this.lastBitrateEstimateTime) - elapsedMs > TIME_LIMIT_BANDWIDTH_ESTIMATE_MS) {
                dropNetworkQualityEstimates();
            }
            this.lastBitrateEstimate = bitrateEstimate;
            this.lastBitrateEstimateTime = currentTimeMillis;
            if (this.currentFormatBitrate != 0) {
                this.bitrateEstimates.add(new NetworkQualityMeasurement(this.timeProvider.currentTimeMillis(), getQualityForCurrentFormat(bitrateEstimate)));
            }
            deleteOldEstimates(this.bitrateEstimates);
            this.networkQuality = determineNetworkStability(this.bitrateEstimates);
            updateSmoothCounter();
        }
    }

    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onVideoInputFormatChanged(TrackFormat format, MediaCodecReuseLog codecReuseLog) {
        this.currentFormatBitrate = format.getBitrate();
    }

    @Override // ru.yandex.video.m3.player.PlayerObserver
    public void onWillPlayWhenReadyChanged(boolean willPlayWhenReady) {
        this.playWhenReady = willPlayWhenReady;
    }

    @Override // ru.yandex.video.m3.player.impl.load_control.provider.DependentLifecycle
    public void release(YandexPlayer<?> yandexPlayer) {
        yandexPlayer.removeObserver(this);
        yandexPlayer.removeAnalyticsObserver(this);
    }

    @Override // ru.yandex.video.m3.player.impl.load_control.provider.DependentLifecycle
    public void start(YandexPlayer<?> yandexPlayer) {
        yandexPlayer.addObserver(this);
        yandexPlayer.addAnalyticsObserver(this);
    }

    public /* synthetic */ NetworkQualityProviderImpl(DynamicBufferDependNetworkQualityParams dynamicBufferDependNetworkQualityParams, TimeProvider timeProvider, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(dynamicBufferDependNetworkQualityParams, (i & 2) != 0 ? new SystemTimeProvider() : timeProvider);
    }
}
