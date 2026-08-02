package ru.yandex.video.m3.playback.features;

import android.graphics.Point;
import defpackage.jl40;
import defpackage.oo31;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.playback.features.DisplayInfo;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001dB%\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00020\u00002\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u0005\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u0006\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/yandex/video/m3/playback/features/DisplayInfo;", "", "Landroid/graphics/Point;", "size", "", "isProtected", "isSecure", "<init>", "(Landroid/graphics/Point;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "Lkotlin/Function1;", "Lru/yandex/video/m3/playback/features/DisplayInfo$Builder;", "Lzy11;", "builderAction", "copy", "(Ltls;)Lru/yandex/video/m3/playback/features/DisplayInfo;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroid/graphics/Point;", "getSize", "()Landroid/graphics/Point;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DisplayInfo {
    public static final int $stable = 8;
    private final Boolean isProtected;
    private final Boolean isSecure;
    private final Point size;

    private DisplayInfo(Point point, Boolean bool, Boolean bool2) {
        this.size = point;
        this.isProtected = bool;
        this.isSecure = bool2;
    }

    public static /* synthetic */ DisplayInfo copy$default(DisplayInfo displayInfo, tls tlsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.playback.features.DisplayInfo$copy$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((DisplayInfo.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(DisplayInfo.Builder builder) {
                }
            };
        }
        return displayInfo.copy(tlsVar);
    }

    public final DisplayInfo copy(tls builderAction) {
        Builder builder = new Builder(this);
        builderAction.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!DisplayInfo.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        DisplayInfo displayInfo = (DisplayInfo) other;
        return jl40.l(this.isProtected, displayInfo.isProtected) && jl40.l(this.isSecure, displayInfo.isSecure) && jl40.l(this.size, displayInfo.size);
    }

    public final Point getSize() {
        return this.size;
    }

    public int hashCode() {
        Boolean bool = this.isProtected;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        Boolean bool2 = this.isSecure;
        return this.size.hashCode() + ((hashCode + (bool2 != null ? bool2.hashCode() : 0)) * 31);
    }

    /* renamed from: isProtected, reason: from getter */
    public final Boolean getIsProtected() {
        return this.isProtected;
    }

    /* renamed from: isSecure, reason: from getter */
    public final Boolean getIsSecure() {
        return this.isSecure;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DisplayInfo(size=");
        sb.append(this.size);
        sb.append(", isProtected=");
        sb.append(this.isProtected);
        sb.append(", isSecure=");
        return oo31.i(sb, this.isSecure, ')');
    }

    public /* synthetic */ DisplayInfo(Point point, Boolean bool, Boolean bool2, DefaultConstructorMarker defaultConstructorMarker) {
        this(point, bool, bool2);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B#\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\nJ\r\u0010\u0014\u001a\u00020\u0003H\u0000¢\u0006\u0002\b\u0015R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\u0007\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\t\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\t\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lru/yandex/video/m3/playback/features/DisplayInfo$Builder;", "", "displayInfo", "Lru/yandex/video/m3/playback/features/DisplayInfo;", "(Lru/yandex/video/m3/playback/features/DisplayInfo;)V", "size", "Landroid/graphics/Point;", "isProtected", "", "isSecure", "(Landroid/graphics/Point;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "()Ljava/lang/Boolean;", "setProtected", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "setSecure", "getSize", "()Landroid/graphics/Point;", "setSize", "(Landroid/graphics/Point;)V", "build", "build$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private Boolean isProtected;
        private Boolean isSecure;
        private Point size;

        public Builder(DisplayInfo displayInfo) {
            this(displayInfo.getSize(), displayInfo.getIsProtected(), displayInfo.getIsSecure());
        }

        public final DisplayInfo build$video_player_internalRelease() {
            return new DisplayInfo(this.size, this.isProtected, this.isSecure, null);
        }

        public final Point getSize() {
            return this.size;
        }

        /* renamed from: isProtected, reason: from getter */
        public final Boolean getIsProtected() {
            return this.isProtected;
        }

        /* renamed from: isSecure, reason: from getter */
        public final Boolean getIsSecure() {
            return this.isSecure;
        }

        public final void setProtected(Boolean bool) {
            this.isProtected = bool;
        }

        public final void setSecure(Boolean bool) {
            this.isSecure = bool;
        }

        public final void setSize(Point point) {
            this.size = point;
        }

        public Builder(Point point, Boolean bool, Boolean bool2) {
            this.size = point;
            this.isProtected = bool;
            this.isSecure = bool2;
        }
    }
}
