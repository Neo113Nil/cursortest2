package ru.yandex.video.m3.player.ui.debug.model;

import defpackage.jl40;
import defpackage.qv10;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\t\u0010\u0007¨\u0006\u0015"}, d2 = {"Lru/yandex/video/m3/player/ui/debug/model/LatencyData;", "", "currentLatency", "", "targetLatency", "(Ljava/lang/Long;Ljava/lang/Long;)V", "getCurrentLatency", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getTargetLatency", "component1", "component2", "copy", "(Ljava/lang/Long;Ljava/lang/Long;)Lru/yandex/video/m3/player/ui/debug/model/LatencyData;", "equals", "", "other", "hashCode", "", "toString", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class LatencyData {
    public static final int $stable = 0;
    private final Long currentLatency;
    private final Long targetLatency;

    public /* synthetic */ LatencyData(Long l, Long l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : l, (i & 2) != 0 ? 0L : l2);
    }

    public static /* synthetic */ LatencyData copy$default(LatencyData latencyData, Long l, Long l2, int i, Object obj) {
        if ((i & 1) != 0) {
            l = latencyData.currentLatency;
        }
        if ((i & 2) != 0) {
            l2 = latencyData.targetLatency;
        }
        return latencyData.copy(l, l2);
    }

    /* renamed from: component1, reason: from getter */
    public final Long getCurrentLatency() {
        return this.currentLatency;
    }

    /* renamed from: component2, reason: from getter */
    public final Long getTargetLatency() {
        return this.targetLatency;
    }

    public final LatencyData copy(Long currentLatency, Long targetLatency) {
        return new LatencyData(currentLatency, targetLatency);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LatencyData)) {
            return false;
        }
        LatencyData latencyData = (LatencyData) other;
        return jl40.l(this.currentLatency, latencyData.currentLatency) && jl40.l(this.targetLatency, latencyData.targetLatency);
    }

    public final Long getCurrentLatency() {
        return this.currentLatency;
    }

    public final Long getTargetLatency() {
        return this.targetLatency;
    }

    public int hashCode() {
        Long l = this.currentLatency;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.targetLatency;
        return hashCode + (l2 != null ? l2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LatencyData(currentLatency=");
        sb.append(this.currentLatency);
        sb.append(", targetLatency=");
        return qv10.q(sb, this.targetLatency, ')');
    }

    public LatencyData(Long l, Long l2) {
        this.currentLatency = l;
        this.targetLatency = l2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LatencyData() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
