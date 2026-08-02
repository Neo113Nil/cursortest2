package ru.yandex.video.m3.player.lowlatency.bandwidth.ewma;

import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.player.lowlatency.bandwidth.BandwidthEstimator;
import ru.yandex.video.m3.player.lowlatency.bandwidth.ewma.HalfLife;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010$R\u0016\u0010&\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/yandex/video/m3/player/lowlatency/bandwidth/ewma/EwmaBandwidthEstimator;", "Lru/yandex/video/m3/player/lowlatency/bandwidth/BandwidthEstimator;", "", "isLowLatencyLive", "<init>", "(Z)V", "", "getCurrentEstimate", "()D", "", "bytes", "durationMs", "getBandwidth", "(JJ)J", "getWeight", "(J)D", "Lru/yandex/video/m3/player/lowlatency/bandwidth/ewma/HalfLife;", "halfLife", "Lzy11;", "setHalfLife", "(Lru/yandex/video/m3/player/lowlatency/bandwidth/ewma/HalfLife;)V", "numBytes", "sample", "(JJ)V", "defaultEstimate", "predictEstimate", "(DJJ)D", "getBandwidthEstimate", "(D)D", "hasGoodEstimate", "()Z", "reset", "()V", "Z", "Lru/yandex/video/m3/player/lowlatency/bandwidth/ewma/EWMA;", "fast", "Lru/yandex/video/m3/player/lowlatency/bandwidth/ewma/EWMA;", "slow", "bytesSampled", CA20Status.STATUS_REQUEST_D, "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class EwmaBandwidthEstimator implements BandwidthEstimator {
    public static final int $stable = 8;
    private double bytesSampled;
    private final EWMA fast;
    private final boolean isLowLatencyLive;
    private final EWMA slow;

    public EwmaBandwidthEstimator(boolean z) {
        this.isLowLatencyLive = z;
        HalfLife.Companion companion = HalfLife.INSTANCE;
        this.fast = new EWMA((z ? companion.getHALF_LIFE_LOW_LATENCY() : companion.getHALF_LIFE_DEFAULT()).getFast());
        this.slow = new EWMA((z ? HalfLife.INSTANCE.getHALF_LIFE_LOW_LATENCY() : HalfLife.INSTANCE.getHALF_LIFE_DEFAULT()).getSlow());
    }

    private final long getBandwidth(long bytes, long durationMs) {
        return (8000 * bytes) / durationMs;
    }

    private final double getCurrentEstimate() {
        return Math.min(this.fast.getEstimate(), this.slow.getEstimate());
    }

    private final double getWeight(long durationMs) {
        return durationMs / 1000.0d;
    }

    private final void setHalfLife(HalfLife halfLife) {
        this.fast.setHalfLife(halfLife.getFast());
        this.slow.setHalfLife(halfLife.getSlow());
    }

    @Override // ru.yandex.video.m3.player.lowlatency.bandwidth.BandwidthEstimator
    public double getBandwidthEstimate(double defaultEstimate) {
        return !hasGoodEstimate() ? defaultEstimate : getCurrentEstimate();
    }

    @Override // ru.yandex.video.m3.player.lowlatency.bandwidth.BandwidthEstimator
    public boolean hasGoodEstimate() {
        return this.bytesSampled >= 128000.0d;
    }

    @Override // ru.yandex.video.m3.player.lowlatency.bandwidth.BandwidthEstimator
    public double predictEstimate(double defaultEstimate, long durationMs, long numBytes) {
        if (durationMs > 0) {
            if (numBytes >= (this.isLowLatencyLive ? 2000.0d : 16000.0d)) {
                if (!hasGoodEstimate()) {
                    return defaultEstimate;
                }
                long bandwidth = getBandwidth(numBytes, durationMs);
                double weight = getWeight(durationMs);
                return Math.min(this.fast.predictEstimate(weight, bandwidth), this.slow.predictEstimate(weight, bandwidth));
            }
        }
        return getBandwidthEstimate(defaultEstimate);
    }

    @Override // ru.yandex.video.m3.player.lowlatency.bandwidth.BandwidthEstimator
    public void reset() {
    }

    @Override // ru.yandex.video.m3.player.lowlatency.bandwidth.BandwidthEstimator
    public void sample(long durationMs, long numBytes) {
        if (durationMs > 0) {
            double d = numBytes;
            boolean z = this.isLowLatencyLive;
            if (d < (z ? 2000.0d : 16000.0d)) {
                return;
            }
            setHalfLife(z ? HalfLife.INSTANCE.getHALF_LIFE_LOW_LATENCY() : HalfLife.INSTANCE.getHALF_LIFE_DEFAULT());
            long bandwidth = getBandwidth(numBytes, durationMs);
            double weight = getWeight(durationMs);
            this.bytesSampled += d;
            this.fast.sample(weight, bandwidth);
            this.slow.sample(weight, bandwidth);
        }
    }
}
