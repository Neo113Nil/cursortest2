package ru.yandex.video.m3.ui.debug;

import defpackage.b64;
import defpackage.jl40;
import java.lang.Number;
import kotlin.Metadata;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010\r\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J(\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0004\u001a\u00028\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"Lru/yandex/video/m3/ui/debug/GraphData;", "T", "", "", "value", ClidProvider.TIMESTAMP, "", "(Ljava/lang/Number;J)V", "getTimestamp", "()J", "getValue", "()Ljava/lang/Number;", "Ljava/lang/Number;", "component1", "component2", "copy", "(Ljava/lang/Number;J)Lru/yandex/video/m3/ui/debug/GraphData;", "equals", "", "other", "hashCode", "", "toString", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class GraphData<T extends Number> {
    public static final int $stable = 0;
    private final long timestamp;
    private final T value;

    public GraphData(T t, long j) {
        this.value = t;
        this.timestamp = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GraphData copy$default(GraphData graphData, Number number, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            number = graphData.value;
        }
        if ((i & 2) != 0) {
            j = graphData.timestamp;
        }
        return graphData.copy(number, j);
    }

    public final T component1() {
        return this.value;
    }

    /* renamed from: component2, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    public final GraphData<T> copy(T value, long timestamp) {
        return new GraphData<>(value, timestamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GraphData)) {
            return false;
        }
        GraphData graphData = (GraphData) other;
        return jl40.l(this.value, graphData.value) && this.timestamp == graphData.timestamp;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final T getValue() {
        return this.value;
    }

    public int hashCode() {
        return Long.hashCode(this.timestamp) + (this.value.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GraphData(value=");
        sb.append(this.value);
        sb.append(", timestamp=");
        return b64.o(sb, this.timestamp, ')');
    }
}
