package ru.yandex.video.m3.benchmark.models;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u00020\u0012H\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u0004\u0018\u00010\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\nR\u0012\u0010\u0011\u001a\u00020\u0012X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/yandex/video/m3/benchmark/models/MetricsEvent;", "", "()V", "buckets", "", "getBuckets", "()I", "maxMs", "", "getMaxMs", "()J", "measurement", "Lru/yandex/video/m3/benchmark/models/MetricsMeasurement;", "getMeasurement", "()Lru/yandex/video/m3/benchmark/models/MetricsMeasurement;", "minMs", "getMinMs", "name", "", "getName", "()Ljava/lang/String;", "toString", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class MetricsEvent {
    public static final int $stable = 0;
    private final long minMs;
    private final long maxMs = 10000;
    private final int buckets = 100;

    public int getBuckets() {
        return this.buckets;
    }

    public long getMaxMs() {
        return this.maxMs;
    }

    public abstract MetricsMeasurement getMeasurement();

    public long getMinMs() {
        return this.minMs;
    }

    public abstract String getName();

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(Extension.COLON_SPACE);
        sb.append(getName());
        sb.append(" -> ");
        MetricsMeasurement measurement = getMeasurement();
        sb.append(measurement != null ? Long.valueOf(measurement.getDuration()) : null);
        sb.append(", buckets [");
        sb.append(getMinMs());
        sb.append(Extension.FIX_SPACE);
        sb.append(getMaxMs());
        sb.append("] : ");
        sb.append(getBuckets());
        return sb.toString();
    }
}
