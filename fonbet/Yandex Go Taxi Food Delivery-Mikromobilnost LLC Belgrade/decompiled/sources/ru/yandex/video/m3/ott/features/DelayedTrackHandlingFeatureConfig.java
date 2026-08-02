package ru.yandex.video.m3.ott.features;

import defpackage.b64;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.ott.ott.TrackSelectionManager;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b\u0082\u0001\u0003\f\r\u000e¨\u0006\u000f"}, d2 = {"Lru/yandex/video/m3/ott/features/DelayedTrackHandlingFeatureConfig;", "", "<init>", "()V", "Lru/yandex/video/m3/ott/ott/TrackSelectionManager;", "manager", "Lzy11;", "applyTo", "(Lru/yandex/video/m3/ott/ott/TrackSelectionManager;)V", "CUSTOM", "DEFAULT", "OFF", "Lru/yandex/video/m3/ott/features/DelayedTrackHandlingFeatureConfig$CUSTOM;", "Lru/yandex/video/m3/ott/features/DelayedTrackHandlingFeatureConfig$DEFAULT;", "Lru/yandex/video/m3/ott/features/DelayedTrackHandlingFeatureConfig$OFF;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class DelayedTrackHandlingFeatureConfig {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lru/yandex/video/m3/ott/features/DelayedTrackHandlingFeatureConfig$CUSTOM;", "Lru/yandex/video/m3/ott/features/DelayedTrackHandlingFeatureConfig;", "delayMs", "", "(J)V", "getDelayMs", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class CUSTOM extends DelayedTrackHandlingFeatureConfig {
        public static final int $stable = 0;
        private final long delayMs;

        public CUSTOM(long j) {
            super(null);
            this.delayMs = j;
        }

        public static /* synthetic */ CUSTOM copy$default(CUSTOM custom, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = custom.delayMs;
            }
            return custom.copy(j);
        }

        /* renamed from: component1, reason: from getter */
        public final long getDelayMs() {
            return this.delayMs;
        }

        public final CUSTOM copy(long delayMs) {
            return new CUSTOM(delayMs);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CUSTOM) && this.delayMs == ((CUSTOM) other).delayMs;
        }

        public final long getDelayMs() {
            return this.delayMs;
        }

        public int hashCode() {
            return Long.hashCode(this.delayMs);
        }

        public String toString() {
            return b64.o(new StringBuilder("CUSTOM(delayMs="), this.delayMs, ')');
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/ott/features/DelayedTrackHandlingFeatureConfig$DEFAULT;", "Lru/yandex/video/m3/ott/features/DelayedTrackHandlingFeatureConfig;", "()V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DEFAULT extends DelayedTrackHandlingFeatureConfig {
        public static final int $stable = 0;
        public static final DEFAULT INSTANCE = new DEFAULT();

        private DEFAULT() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/ott/features/DelayedTrackHandlingFeatureConfig$OFF;", "Lru/yandex/video/m3/ott/features/DelayedTrackHandlingFeatureConfig;", "()V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class OFF extends DelayedTrackHandlingFeatureConfig {
        public static final int $stable = 0;
        public static final OFF INSTANCE = new OFF();

        private OFF() {
            super(null);
        }
    }

    public /* synthetic */ DelayedTrackHandlingFeatureConfig(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final void applyTo(TrackSelectionManager manager) {
        if (this instanceof CUSTOM) {
            manager.useDelayedHandling(((CUSTOM) this).getDelayMs());
        } else if (equals(DEFAULT.INSTANCE)) {
            TrackSelectionManager.useDelayedHandling$default(manager, 0L, 1, null);
        } else {
            equals(OFF.INSTANCE);
        }
    }

    private DelayedTrackHandlingFeatureConfig() {
    }
}
