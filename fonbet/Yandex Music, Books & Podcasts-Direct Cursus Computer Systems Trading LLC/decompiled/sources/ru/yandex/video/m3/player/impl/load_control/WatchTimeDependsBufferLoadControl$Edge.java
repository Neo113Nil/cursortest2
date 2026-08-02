package ru.yandex.video.m3.player.impl.load_control;

import androidx.annotation.Keep;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.eta;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\b¨\u0006\u001a"}, d2 = {"ru/yandex/video/m3/player/impl/load_control/WatchTimeDependsBufferLoadControl$Edge", "", "", "watchTimeMs", "bufferLengthMs", "<init>", "(JJ)V", "component1", "()J", "component2", "Lru/yandex/video/m3/player/impl/load_control/WatchTimeDependsBufferLoadControl$Edge;", "copy", "(JJ)Lru/yandex/video/m3/player/impl/load_control/WatchTimeDependsBufferLoadControl$Edge;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getWatchTimeMs", "getBufferLengthMs", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes6.dex */
public final /* data */ class WatchTimeDependsBufferLoadControl$Edge {
    public static final int $stable = 0;
    private final long bufferLengthMs;
    private final long watchTimeMs;

    public WatchTimeDependsBufferLoadControl$Edge(long j, long j2) {
        this.watchTimeMs = j;
        this.bufferLengthMs = j2;
    }

    public static /* synthetic */ WatchTimeDependsBufferLoadControl$Edge copy$default(WatchTimeDependsBufferLoadControl$Edge watchTimeDependsBufferLoadControl$Edge, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = watchTimeDependsBufferLoadControl$Edge.watchTimeMs;
        }
        if ((i & 2) != 0) {
            j2 = watchTimeDependsBufferLoadControl$Edge.bufferLengthMs;
        }
        return watchTimeDependsBufferLoadControl$Edge.copy(j, j2);
    }

    /* renamed from: component1, reason: from getter */
    public final long getWatchTimeMs() {
        return this.watchTimeMs;
    }

    /* renamed from: component2, reason: from getter */
    public final long getBufferLengthMs() {
        return this.bufferLengthMs;
    }

    @NotNull
    public final WatchTimeDependsBufferLoadControl$Edge copy(long watchTimeMs, long bufferLengthMs) {
        return new WatchTimeDependsBufferLoadControl$Edge(watchTimeMs, bufferLengthMs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WatchTimeDependsBufferLoadControl$Edge)) {
            return false;
        }
        WatchTimeDependsBufferLoadControl$Edge watchTimeDependsBufferLoadControl$Edge = (WatchTimeDependsBufferLoadControl$Edge) other;
        return this.watchTimeMs == watchTimeDependsBufferLoadControl$Edge.watchTimeMs && this.bufferLengthMs == watchTimeDependsBufferLoadControl$Edge.bufferLengthMs;
    }

    public final long getBufferLengthMs() {
        return this.bufferLengthMs;
    }

    public final long getWatchTimeMs() {
        return this.watchTimeMs;
    }

    public int hashCode() {
        return Long.hashCode(this.bufferLengthMs) + (Long.hashCode(this.watchTimeMs) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("Edge(watchTimeMs=");
        sb.append(this.watchTimeMs);
        sb.append(", bufferLengthMs=");
        return eta.g(sb, this.bufferLengthMs, ')');
    }
}
