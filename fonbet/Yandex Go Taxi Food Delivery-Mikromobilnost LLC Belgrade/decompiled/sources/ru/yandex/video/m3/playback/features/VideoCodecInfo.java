package ru.yandex.video.m3.playback.features;

import android.graphics.Point;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.tls;
import defpackage.unr0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.playback.features.VideoCodecInfo;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001:\u0001$B9\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0012\u001a\u00020\u00002\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b\u0007\u0010!R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b\b\u0010!R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b\t\u0010!R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b#\u0010\u0018¨\u0006%"}, d2 = {"Lru/yandex/video/m3/playback/features/VideoCodecInfo;", "", "", "codecName", "Landroid/graphics/Point;", "size", "", "isSecure", "isTunneled", "isHardwareAccelerated", "", "maxSupportedInstances", "<init>", "(Ljava/lang/String;Landroid/graphics/Point;ZZZI)V", "Lkotlin/Function1;", "Lru/yandex/video/m3/playback/features/VideoCodecInfo$Builder;", "Lzy11;", "builderAction", "copy", "(Ltls;)Lru/yandex/video/m3/playback/features/VideoCodecInfo;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getCodecName", "Landroid/graphics/Point;", "getSize", "()Landroid/graphics/Point;", "Z", "()Z", CA20Status.STATUS_USER_I, "getMaxSupportedInstances", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class VideoCodecInfo {
    public static final int $stable = 8;
    private final String codecName;
    private final boolean isHardwareAccelerated;
    private final boolean isSecure;
    private final boolean isTunneled;
    private final int maxSupportedInstances;
    private final Point size;

    private VideoCodecInfo(String str, Point point, boolean z, boolean z2, boolean z3, int i) {
        this.codecName = str;
        this.size = point;
        this.isSecure = z;
        this.isTunneled = z2;
        this.isHardwareAccelerated = z3;
        this.maxSupportedInstances = i;
    }

    public static /* synthetic */ VideoCodecInfo copy$default(VideoCodecInfo videoCodecInfo, tls tlsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.playback.features.VideoCodecInfo$copy$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((VideoCodecInfo.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(VideoCodecInfo.Builder builder) {
                }
            };
        }
        return videoCodecInfo.copy(tlsVar);
    }

    public final VideoCodecInfo copy(tls builderAction) {
        Builder builder = new Builder(this);
        builderAction.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!VideoCodecInfo.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        VideoCodecInfo videoCodecInfo = (VideoCodecInfo) other;
        return this.isSecure == videoCodecInfo.isSecure && this.isTunneled == videoCodecInfo.isTunneled && this.isHardwareAccelerated == videoCodecInfo.isHardwareAccelerated && this.maxSupportedInstances == videoCodecInfo.maxSupportedInstances && jl40.l(this.codecName, videoCodecInfo.codecName) && jl40.l(this.size, videoCodecInfo.size);
    }

    public final String getCodecName() {
        return this.codecName;
    }

    public final int getMaxSupportedInstances() {
        return this.maxSupportedInstances;
    }

    public final Point getSize() {
        return this.size;
    }

    public int hashCode() {
        return this.size.hashCode() + unr0.b((unr0.e(unr0.e(Boolean.hashCode(this.isSecure) * 31, 31, this.isTunneled), 31, this.isHardwareAccelerated) + this.maxSupportedInstances) * 31, 31, this.codecName);
    }

    /* renamed from: isHardwareAccelerated, reason: from getter */
    public final boolean getIsHardwareAccelerated() {
        return this.isHardwareAccelerated;
    }

    /* renamed from: isSecure, reason: from getter */
    public final boolean getIsSecure() {
        return this.isSecure;
    }

    /* renamed from: isTunneled, reason: from getter */
    public final boolean getIsTunneled() {
        return this.isTunneled;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("VideoCodecInfo(codecName='");
        sb.append(this.codecName);
        sb.append("', size=");
        sb.append(this.size);
        sb.append(", isSecure=");
        sb.append(this.isSecure);
        sb.append(", isTunneled=");
        sb.append(this.isTunneled);
        sb.append(", isHardwareAccelerated=");
        sb.append(this.isHardwareAccelerated);
        sb.append(", maxSupportedInstances=");
        return oyr.s(sb, this.maxSupportedInstances, ')');
    }

    public /* synthetic */ VideoCodecInfo(String str, Point point, boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, point, z, z2, z3, i);
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B7\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\r\u0010!\u001a\u00020\u0003H\u0000¢\u0006\u0002\b\"R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\f\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0014\"\u0004\b\u0017\u0010\u0016R\u001a\u0010\u000b\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lru/yandex/video/m3/playback/features/VideoCodecInfo$Builder;", "", "videoCodecInfo", "Lru/yandex/video/m3/playback/features/VideoCodecInfo;", "(Lru/yandex/video/m3/playback/features/VideoCodecInfo;)V", "codecName", "", "size", "Landroid/graphics/Point;", "isSecure", "", "isTunneled", "isHardwareAccelerated", "maxSupportedInstances", "", "(Ljava/lang/String;Landroid/graphics/Point;ZZZI)V", "getCodecName", "()Ljava/lang/String;", "setCodecName", "(Ljava/lang/String;)V", "()Z", "setHardwareAccelerated", "(Z)V", "setSecure", "setTunneled", "getMaxSupportedInstances", "()I", "setMaxSupportedInstances", "(I)V", "getSize", "()Landroid/graphics/Point;", "setSize", "(Landroid/graphics/Point;)V", "build", "build$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private String codecName;
        private boolean isHardwareAccelerated;
        private boolean isSecure;
        private boolean isTunneled;
        private int maxSupportedInstances;
        private Point size;

        public Builder(VideoCodecInfo videoCodecInfo) {
            this(videoCodecInfo.getCodecName(), videoCodecInfo.getSize(), videoCodecInfo.getIsSecure(), videoCodecInfo.getIsTunneled(), videoCodecInfo.getIsHardwareAccelerated(), videoCodecInfo.getMaxSupportedInstances());
        }

        public final VideoCodecInfo build$video_player_internalRelease() {
            return new VideoCodecInfo(this.codecName, this.size, this.isSecure, this.isTunneled, this.isHardwareAccelerated, this.maxSupportedInstances, null);
        }

        public final String getCodecName() {
            return this.codecName;
        }

        public final int getMaxSupportedInstances() {
            return this.maxSupportedInstances;
        }

        public final Point getSize() {
            return this.size;
        }

        /* renamed from: isHardwareAccelerated, reason: from getter */
        public final boolean getIsHardwareAccelerated() {
            return this.isHardwareAccelerated;
        }

        /* renamed from: isSecure, reason: from getter */
        public final boolean getIsSecure() {
            return this.isSecure;
        }

        /* renamed from: isTunneled, reason: from getter */
        public final boolean getIsTunneled() {
            return this.isTunneled;
        }

        public final void setCodecName(String str) {
            this.codecName = str;
        }

        public final void setHardwareAccelerated(boolean z) {
            this.isHardwareAccelerated = z;
        }

        public final void setMaxSupportedInstances(int i) {
            this.maxSupportedInstances = i;
        }

        public final void setSecure(boolean z) {
            this.isSecure = z;
        }

        public final void setSize(Point point) {
            this.size = point;
        }

        public final void setTunneled(boolean z) {
            this.isTunneled = z;
        }

        public Builder(String str, Point point, boolean z, boolean z2, boolean z3, int i) {
            this.codecName = str;
            this.size = point;
            this.isSecure = z;
            this.isTunneled = z2;
            this.isHardwareAccelerated = z3;
            this.maxSupportedInstances = i;
        }
    }
}
