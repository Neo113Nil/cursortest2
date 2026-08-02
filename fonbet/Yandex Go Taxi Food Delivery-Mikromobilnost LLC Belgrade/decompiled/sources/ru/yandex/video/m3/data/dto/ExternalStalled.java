package ru.yandex.video.m3.data.dto;

import defpackage.b64;
import defpackage.xfx;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0017B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0002HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lru/yandex/video/m3/data/dto/ExternalStalled;", "", "", "", "duration", "(J)V", "getDuration", "()J", "key", "getKey", "()Ljava/lang/String;", "value", "getValue", "()Ljava/lang/Long;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ExternalStalled implements Map.Entry<String, Long>, xfx {
    public static final int $stable = 0;
    public static final String key = "EXTERNAL_STALLED_KEY";
    public static final String streamBlockKey = "stream_block";
    private final long duration;

    public ExternalStalled(long j) {
        this.duration = j;
    }

    public static /* synthetic */ ExternalStalled copy$default(ExternalStalled externalStalled, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = externalStalled.duration;
        }
        return externalStalled.copy(j);
    }

    /* renamed from: component1, reason: from getter */
    public final long getDuration() {
        return this.duration;
    }

    public final ExternalStalled copy(long duration) {
        return new ExternalStalled(duration);
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ExternalStalled) && this.duration == ((ExternalStalled) other).duration;
    }

    public final long getDuration() {
        return this.duration;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Map.Entry
    public Long getValue() {
        return Long.valueOf(this.duration);
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        return Long.hashCode(this.duration);
    }

    public Long setValue(long j) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public String toString() {
        return b64.o(new StringBuilder("ExternalStalled(duration="), this.duration, ')');
    }

    @Override // java.util.Map.Entry
    public String getKey() {
        return key;
    }

    @Override // java.util.Map.Entry
    public /* bridge */ /* synthetic */ Long setValue(Long l) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
