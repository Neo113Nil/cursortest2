package ru.yandex.video.m3.player.ui.debug.model;

import defpackage.b64;
import kotlin.Metadata;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.video.m3.player.ui.debug.view.graph.LineGraphView;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0014"}, d2 = {"Lru/yandex/video/m3/player/ui/debug/model/BufferSize;", "Lru/yandex/video/m3/player/ui/debug/view/graph/LineGraphView$Event;", ClidProvider.TIMESTAMP, "", "value", "(JJ)V", "getTimestamp", "()J", "getValue", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class BufferSize implements LineGraphView.Event {
    public static final int $stable = 0;
    private final long timestamp;
    private final long value;

    public BufferSize(long j, long j2) {
        this.timestamp = j;
        this.value = j2;
    }

    public static /* synthetic */ BufferSize copy$default(BufferSize bufferSize, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = bufferSize.timestamp;
        }
        if ((i & 2) != 0) {
            j2 = bufferSize.value;
        }
        return bufferSize.copy(j, j2);
    }

    /* renamed from: component1, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* renamed from: component2, reason: from getter */
    public final long getValue() {
        return this.value;
    }

    public final BufferSize copy(long timestamp, long value) {
        return new BufferSize(timestamp, value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BufferSize)) {
            return false;
        }
        BufferSize bufferSize = (BufferSize) other;
        return this.timestamp == bufferSize.timestamp && this.value == bufferSize.value;
    }

    @Override // ru.yandex.video.m3.player.ui.debug.view.graph.LineGraphView.Event
    public long getTimestamp() {
        return this.timestamp;
    }

    @Override // ru.yandex.video.m3.player.ui.debug.view.graph.LineGraphView.Event
    public long getValue() {
        return this.value;
    }

    public int hashCode() {
        return Long.hashCode(this.value) + (Long.hashCode(this.timestamp) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BufferSize(timestamp=");
        sb.append(this.timestamp);
        sb.append(", value=");
        return b64.o(sb, this.value, ')');
    }
}
