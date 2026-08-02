package ru.yandex.video.m3.player;

import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lru/yandex/video/m3/player/RepeatMode;", "", "()V", "Fixed", "Infinity", "None", "Lru/yandex/video/m3/player/RepeatMode$Fixed;", "Lru/yandex/video/m3/player/RepeatMode$Infinity;", "Lru/yandex/video/m3/player/RepeatMode$None;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class RepeatMode {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/RepeatMode$Infinity;", "Lru/yandex/video/m3/player/RepeatMode;", "()V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Infinity extends RepeatMode {
        public static final int $stable = 0;
        public static final Infinity INSTANCE = new Infinity();

        private Infinity() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/RepeatMode$None;", "Lru/yandex/video/m3/player/RepeatMode;", "()V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class None extends RepeatMode {
        public static final int $stable = 0;
        public static final None INSTANCE = new None();

        private None() {
            super(null);
        }
    }

    public /* synthetic */ RepeatMode(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private RepeatMode() {
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lru/yandex/video/m3/player/RepeatMode$Fixed;", "Lru/yandex/video/m3/player/RepeatMode;", "count", "", "watched", "isFinished", "", "(IIZ)V", "getCount", "()I", "()Z", "getWatched", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "toString", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Fixed extends RepeatMode {
        public static final int $stable = 0;
        private final int count;
        private final boolean isFinished;
        private final int watched;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ Fixed(int i, int i2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, i2, (i3 & 4) != 0 ? i == i2 : z);
            i2 = (i3 & 2) != 0 ? 0 : i2;
        }

        public static /* synthetic */ Fixed copy$default(Fixed fixed, int i, int i2, boolean z, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = fixed.count;
            }
            if ((i3 & 2) != 0) {
                i2 = fixed.watched;
            }
            if ((i3 & 4) != 0) {
                z = fixed.isFinished;
            }
            return fixed.copy(i, i2, z);
        }

        /* renamed from: component1, reason: from getter */
        public final int getCount() {
            return this.count;
        }

        /* renamed from: component2, reason: from getter */
        public final int getWatched() {
            return this.watched;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsFinished() {
            return this.isFinished;
        }

        public final Fixed copy(int count, int watched, boolean isFinished) {
            return new Fixed(count, watched, isFinished);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Fixed)) {
                return false;
            }
            Fixed fixed = (Fixed) other;
            return this.count == fixed.count && this.watched == fixed.watched && this.isFinished == fixed.isFinished;
        }

        public final int getCount() {
            return this.count;
        }

        public final int getWatched() {
            return this.watched;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isFinished) + oyr.b(this.watched, Integer.hashCode(this.count) * 31, 31);
        }

        public final boolean isFinished() {
            return this.isFinished;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Fixed(count=");
            sb.append(this.count);
            sb.append(", watched=");
            sb.append(this.watched);
            sb.append(", isFinished=");
            return unr0.u(sb, this.isFinished, ')');
        }

        public Fixed(int i, int i2, boolean z) {
            super(null);
            this.count = i;
            this.watched = i2;
            this.isFinished = z;
        }
    }
}
