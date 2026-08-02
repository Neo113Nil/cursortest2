package ru.yandex.video.m3.player.impl.tracking.event;

import defpackage.b64;
import defpackage.ysq0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0014"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/event/SeekEventData;", "Lru/yandex/video/m3/player/impl/tracking/event/DefaultEventData;", "newPositionMs", "", "oldPositionMs", "(JJ)V", "getNewPositionMs", "()J", "getOldPositionMs", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class SeekEventData extends DefaultEventData {
    public static final int $stable = 0;

    @ysq0("newPositionMs")
    private final long newPositionMs;

    @ysq0("oldPositionMs")
    private final long oldPositionMs;

    public SeekEventData(long j, long j2) {
        super(null, 1, null);
        this.newPositionMs = j;
        this.oldPositionMs = j2;
    }

    public static /* synthetic */ SeekEventData copy$default(SeekEventData seekEventData, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = seekEventData.newPositionMs;
        }
        if ((i & 2) != 0) {
            j2 = seekEventData.oldPositionMs;
        }
        return seekEventData.copy(j, j2);
    }

    /* renamed from: component1, reason: from getter */
    public final long getNewPositionMs() {
        return this.newPositionMs;
    }

    /* renamed from: component2, reason: from getter */
    public final long getOldPositionMs() {
        return this.oldPositionMs;
    }

    public final SeekEventData copy(long newPositionMs, long oldPositionMs) {
        return new SeekEventData(newPositionMs, oldPositionMs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SeekEventData)) {
            return false;
        }
        SeekEventData seekEventData = (SeekEventData) other;
        return this.newPositionMs == seekEventData.newPositionMs && this.oldPositionMs == seekEventData.oldPositionMs;
    }

    public final long getNewPositionMs() {
        return this.newPositionMs;
    }

    public final long getOldPositionMs() {
        return this.oldPositionMs;
    }

    public int hashCode() {
        return Long.hashCode(this.oldPositionMs) + (Long.hashCode(this.newPositionMs) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SeekEventData(newPositionMs=");
        sb.append(this.newPositionMs);
        sb.append(", oldPositionMs=");
        return b64.o(sb, this.oldPositionMs, ')');
    }
}
