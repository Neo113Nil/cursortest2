package ru.yandex.video.m3.data;

import defpackage.jl40;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0011B\u001e\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\r\u0010\u0004\u001a\t\u0018\u00010\u0005¢\u0006\u0002\b\u0006¢\u0006\u0002\u0010\u0007J\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000e\u001a\u00020\u0005H\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u001a\u0010\u0004\u001a\t\u0018\u00010\u0005¢\u0006\u0002\b\u0006¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u0012"}, d2 = {"Lru/yandex/video/m3/data/PlaybackViewState;", "", "isVisible", "", "surfaceType", "", "Lru/yandex/video/m3/data/SurfaceType;", "(ZLjava/lang/Integer;)V", "()Z", "getSurfaceType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "equals", "other", "hashCode", "toString", "", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PlaybackViewState {
    public static final int $stable = 0;
    private final boolean isVisible;
    private final Integer surfaceType;

    private PlaybackViewState(boolean z, Integer num) {
        this.isVisible = z;
        this.surfaceType = num;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!PlaybackViewState.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        PlaybackViewState playbackViewState = (PlaybackViewState) other;
        return this.isVisible == playbackViewState.isVisible && jl40.l(this.surfaceType, playbackViewState.surfaceType);
    }

    public final Integer getSurfaceType() {
        return this.surfaceType;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.isVisible) * 31;
        Integer num = this.surfaceType;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    /* renamed from: isVisible, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
    }

    public String toString() {
        return "PlaybackViewState(isVisible=" + this.isVisible + ", surfaceType=" + SurfaceType.INSTANCE.toAnalyticsString(this.surfaceType) + ')';
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0012\u001a\u00020\u0013J\u0015\u0010\u0014\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0015J\u001a\u0010\u000f\u001a\u00020\u00002\r\u0010\n\u001a\t\u0018\u00010\u000b¢\u0006\u0002\b\f¢\u0006\u0002\u0010\u0016R*\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR#\u0010\n\u001a\t\u0018\u00010\u000b¢\u0006\u0002\b\fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0017"}, d2 = {"Lru/yandex/video/m3/data/PlaybackViewState$Builder;", "", "()V", "<set-?>", "", "isVisible", "()Ljava/lang/Boolean;", "setVisible", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "surfaceType", "", "Lru/yandex/video/m3/data/SurfaceType;", "getSurfaceType", "()Ljava/lang/Integer;", "setSurfaceType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "build", "Lru/yandex/video/m3/data/PlaybackViewState;", "setIsVisible", "(Ljava/lang/Boolean;)Lru/yandex/video/m3/data/PlaybackViewState$Builder;", "(Ljava/lang/Integer;)Lru/yandex/video/m3/data/PlaybackViewState$Builder;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private Boolean isVisible;
        private Integer surfaceType;

        public final PlaybackViewState build() {
            Boolean bool = this.isVisible;
            return new PlaybackViewState(bool != null ? bool.booleanValue() : false, this.surfaceType, null);
        }

        public final Integer getSurfaceType() {
            return this.surfaceType;
        }

        /* renamed from: isVisible, reason: from getter */
        public final Boolean getIsVisible() {
            return this.isVisible;
        }

        public final Builder setIsVisible(Boolean isVisible) {
            this.isVisible = isVisible;
            return this;
        }

        /* renamed from: setSurfaceType, reason: collision with other method in class */
        public final void m738setSurfaceType(Integer num) {
            this.surfaceType = num;
        }

        public final /* synthetic */ void setVisible(Boolean bool) {
            this.isVisible = bool;
        }

        public final Builder setSurfaceType(Integer surfaceType) {
            this.surfaceType = surfaceType;
            return this;
        }
    }

    public /* synthetic */ PlaybackViewState(boolean z, Integer num, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, num);
    }
}
