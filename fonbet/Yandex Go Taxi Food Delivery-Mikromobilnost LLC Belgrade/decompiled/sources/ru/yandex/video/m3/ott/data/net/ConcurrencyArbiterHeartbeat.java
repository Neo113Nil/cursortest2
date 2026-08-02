package ru.yandex.video.m3.ott.data.net;

import defpackage.b64;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lru/yandex/video/m3/ott/data/net/ConcurrencyArbiterHeartbeat;", "", "heartbeatInMillis", "", "(J)V", "getHeartbeatInMillis", "()J", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ConcurrencyArbiterHeartbeat {
    public static final int $stable = 0;
    private final long heartbeatInMillis;

    public ConcurrencyArbiterHeartbeat(long j) {
        this.heartbeatInMillis = j;
    }

    public static /* synthetic */ ConcurrencyArbiterHeartbeat copy$default(ConcurrencyArbiterHeartbeat concurrencyArbiterHeartbeat, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = concurrencyArbiterHeartbeat.heartbeatInMillis;
        }
        return concurrencyArbiterHeartbeat.copy(j);
    }

    /* renamed from: component1, reason: from getter */
    public final long getHeartbeatInMillis() {
        return this.heartbeatInMillis;
    }

    public final ConcurrencyArbiterHeartbeat copy(long heartbeatInMillis) {
        return new ConcurrencyArbiterHeartbeat(heartbeatInMillis);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ConcurrencyArbiterHeartbeat) && this.heartbeatInMillis == ((ConcurrencyArbiterHeartbeat) other).heartbeatInMillis;
    }

    public final long getHeartbeatInMillis() {
        return this.heartbeatInMillis;
    }

    public int hashCode() {
        return Long.hashCode(this.heartbeatInMillis);
    }

    public String toString() {
        return b64.o(new StringBuilder("ConcurrencyArbiterHeartbeat(heartbeatInMillis="), this.heartbeatInMillis, ')');
    }
}
