package ru.yandex.video.m3.player.tracking;

import defpackage.jl40;
import defpackage.oyr;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.player.tracking.FullscreenDataBundle;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001cB#\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00020\u00002\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0003\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001b\u0010\u0013¨\u0006\u001d"}, d2 = {"Lru/yandex/video/m3/player/tracking/FullscreenDataBundle;", "", "", "isFullscreenExternal", "", "surfaceHeight", "surfaceWidth", "<init>", "(Ljava/lang/Boolean;II)V", "Lkotlin/Function1;", "Lru/yandex/video/m3/player/tracking/FullscreenDataBundle$Builder;", "Lzy11;", "builderAction", "copy", "(Ltls;)Lru/yandex/video/m3/player/tracking/FullscreenDataBundle;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", CA20Status.STATUS_USER_I, "getSurfaceHeight", "getSurfaceWidth", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FullscreenDataBundle {
    public static final int $stable = 0;
    private final Boolean isFullscreenExternal;
    private final int surfaceHeight;
    private final int surfaceWidth;

    private FullscreenDataBundle(Boolean bool, int i, int i2) {
        this.isFullscreenExternal = bool;
        this.surfaceHeight = i;
        this.surfaceWidth = i2;
    }

    public static /* synthetic */ FullscreenDataBundle copy$default(FullscreenDataBundle fullscreenDataBundle, tls tlsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.player.tracking.FullscreenDataBundle$copy$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((FullscreenDataBundle.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(FullscreenDataBundle.Builder builder) {
                }
            };
        }
        return fullscreenDataBundle.copy(tlsVar);
    }

    public final FullscreenDataBundle copy(tls builderAction) {
        Builder builder = new Builder(this);
        builderAction.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!FullscreenDataBundle.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        FullscreenDataBundle fullscreenDataBundle = (FullscreenDataBundle) other;
        return jl40.l(this.isFullscreenExternal, fullscreenDataBundle.isFullscreenExternal) && this.surfaceHeight == fullscreenDataBundle.surfaceHeight && this.surfaceWidth == fullscreenDataBundle.surfaceWidth;
    }

    public final int getSurfaceHeight() {
        return this.surfaceHeight;
    }

    public final int getSurfaceWidth() {
        return this.surfaceWidth;
    }

    public int hashCode() {
        Boolean bool = this.isFullscreenExternal;
        return ((((bool != null ? bool.hashCode() : 0) * 31) + this.surfaceHeight) * 31) + this.surfaceWidth;
    }

    /* renamed from: isFullscreenExternal, reason: from getter */
    public final Boolean getIsFullscreenExternal() {
        return this.isFullscreenExternal;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FullscreenDataBundle(isFullscreenExternal=");
        sb.append(this.isFullscreenExternal);
        sb.append(", surfaceHeight=");
        sb.append(this.surfaceHeight);
        sb.append(", surfaceWidth=");
        return oyr.s(sb, this.surfaceWidth, ')');
    }

    public /* synthetic */ FullscreenDataBundle(Boolean bool, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(bool, i, i2);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B!\b\u0000\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\nJ\r\u0010\u0015\u001a\u00020\u0003H\u0000¢\u0006\u0002\b\u0016R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\u0005\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\t\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012¨\u0006\u0017"}, d2 = {"Lru/yandex/video/m3/player/tracking/FullscreenDataBundle$Builder;", "", "fullscreenDataBundle", "Lru/yandex/video/m3/player/tracking/FullscreenDataBundle;", "(Lru/yandex/video/m3/player/tracking/FullscreenDataBundle;)V", "isFullscreenExternal", "", "surfaceHeight", "", "surfaceWidth", "(Ljava/lang/Boolean;II)V", "()Ljava/lang/Boolean;", "setFullscreenExternal", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getSurfaceHeight", "()I", "setSurfaceHeight", "(I)V", "getSurfaceWidth", "setSurfaceWidth", "build", "build$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private Boolean isFullscreenExternal;
        private int surfaceHeight;
        private int surfaceWidth;

        public Builder(FullscreenDataBundle fullscreenDataBundle) {
            this(fullscreenDataBundle.getIsFullscreenExternal(), fullscreenDataBundle.getSurfaceHeight(), fullscreenDataBundle.getSurfaceWidth());
        }

        public final FullscreenDataBundle build$video_player_internalRelease() {
            return new FullscreenDataBundle(this.isFullscreenExternal, this.surfaceHeight, this.surfaceWidth, null);
        }

        public final int getSurfaceHeight() {
            return this.surfaceHeight;
        }

        public final int getSurfaceWidth() {
            return this.surfaceWidth;
        }

        /* renamed from: isFullscreenExternal, reason: from getter */
        public final Boolean getIsFullscreenExternal() {
            return this.isFullscreenExternal;
        }

        public final void setFullscreenExternal(Boolean bool) {
            this.isFullscreenExternal = bool;
        }

        public final void setSurfaceHeight(int i) {
            this.surfaceHeight = i;
        }

        public final void setSurfaceWidth(int i) {
            this.surfaceWidth = i;
        }

        public Builder(Boolean bool, int i, int i2) {
            this.isFullscreenExternal = bool;
            this.surfaceHeight = i;
            this.surfaceWidth = i2;
        }
    }
}
