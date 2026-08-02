package ru.yandex.video.m3.player.tracking;

import defpackage.jl40;
import defpackage.oo31;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eB\u001b\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0013\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0002\u0010\u0006R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0004\u0010\u0006¨\u0006\u000f"}, d2 = {"Lru/yandex/video/m3/player/tracking/FullscreenInfo;", "", "isFullscreenExternal", "", "isFullscreenInternal", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "equals", "other", "hashCode", "", "toString", "", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FullscreenInfo {
    public static final int $stable = 0;
    private final Boolean isFullscreenExternal;
    private final Boolean isFullscreenInternal;

    private FullscreenInfo(Boolean bool, Boolean bool2) {
        this.isFullscreenExternal = bool;
        this.isFullscreenInternal = bool2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!FullscreenInfo.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        FullscreenInfo fullscreenInfo = (FullscreenInfo) other;
        return jl40.l(this.isFullscreenExternal, fullscreenInfo.isFullscreenExternal) && jl40.l(this.isFullscreenInternal, fullscreenInfo.isFullscreenInternal);
    }

    public int hashCode() {
        Boolean bool = this.isFullscreenExternal;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        Boolean bool2 = this.isFullscreenInternal;
        return hashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    /* renamed from: isFullscreenExternal, reason: from getter */
    public final Boolean getIsFullscreenExternal() {
        return this.isFullscreenExternal;
    }

    /* renamed from: isFullscreenInternal, reason: from getter */
    public final Boolean getIsFullscreenInternal() {
        return this.isFullscreenInternal;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FullscreenInfo(isFullscreenExternal=");
        sb.append(this.isFullscreenExternal);
        sb.append(", isFullscreenInternal=");
        return oo31.i(sb, this.isFullscreenInternal, ')');
    }

    public /* synthetic */ FullscreenInfo(Boolean bool, Boolean bool2, DefaultConstructorMarker defaultConstructorMarker) {
        this(bool, bool2);
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0000\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\r\u0010\u000e\u001a\u00020\u0003H\u0000¢\u0006\u0002\b\u000fR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\u0005\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\u0007\u0010\t\"\u0004\b\r\u0010\u000b¨\u0006\u0010"}, d2 = {"Lru/yandex/video/m3/player/tracking/FullscreenInfo$Builder;", "", "fullscreenInfo", "Lru/yandex/video/m3/player/tracking/FullscreenInfo;", "(Lru/yandex/video/m3/player/tracking/FullscreenInfo;)V", "isFullscreenExternal", "", "isFullscreenInternal", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "()Ljava/lang/Boolean;", "setFullscreenExternal", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "setFullscreenInternal", "build", "build$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private Boolean isFullscreenExternal;
        private Boolean isFullscreenInternal;

        public Builder(FullscreenInfo fullscreenInfo) {
            this(fullscreenInfo.getIsFullscreenExternal(), fullscreenInfo.getIsFullscreenInternal());
        }

        public final FullscreenInfo build$video_player_internalRelease() {
            return new FullscreenInfo(this.isFullscreenExternal, this.isFullscreenInternal, null);
        }

        /* renamed from: isFullscreenExternal, reason: from getter */
        public final Boolean getIsFullscreenExternal() {
            return this.isFullscreenExternal;
        }

        /* renamed from: isFullscreenInternal, reason: from getter */
        public final Boolean getIsFullscreenInternal() {
            return this.isFullscreenInternal;
        }

        public final void setFullscreenExternal(Boolean bool) {
            this.isFullscreenExternal = bool;
        }

        public final void setFullscreenInternal(Boolean bool) {
            this.isFullscreenInternal = bool;
        }

        public Builder(Boolean bool, Boolean bool2) {
            this.isFullscreenExternal = bool;
            this.isFullscreenInternal = bool2;
        }
    }
}
