package ru.yandex.video.m3.player.feature;

import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0007\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"Lru/yandex/video/m3/player/feature/PlaybackFeatures;", "", "lowLatency", "", "(Ljava/lang/Boolean;)V", "getLowLatency", "()Z", "equals", "other", "hashCode", "", "toString", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PlaybackFeatures {
    public static final int $stable = 0;
    private final boolean lowLatency;

    public PlaybackFeatures(Boolean bool) {
        this.lowLatency = bool != null ? bool.booleanValue() : false;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return PlaybackFeatures.class.equals(other != null ? other.getClass() : null) && this.lowLatency == ((PlaybackFeatures) other).lowLatency;
    }

    public final boolean getLowLatency() {
        return this.lowLatency;
    }

    public int hashCode() {
        return Boolean.hashCode(this.lowLatency);
    }

    public String toString() {
        return unr0.u(new StringBuilder("PlaybackFeatures(lowLatency="), this.lowLatency, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PlaybackFeatures() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ PlaybackFeatures(Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool);
    }
}
