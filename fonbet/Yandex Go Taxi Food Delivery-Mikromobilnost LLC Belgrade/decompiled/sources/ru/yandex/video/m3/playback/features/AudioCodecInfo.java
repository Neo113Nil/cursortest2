package ru.yandex.video.m3.playback.features;

import defpackage.jl40;
import defpackage.oyr;
import defpackage.tls;
import defpackage.unr0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.playback.features.AudioCodecInfo;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001fB1\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0010\u001a\u00020\u00002\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u0005\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u0006\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u0007\u0010\u001cR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u0016¨\u0006 "}, d2 = {"Lru/yandex/video/m3/playback/features/AudioCodecInfo;", "", "", "codecName", "", "isSecure", "isTunneled", "isHardwareAccelerated", "", "maxSupportedInstances", "<init>", "(Ljava/lang/String;ZZZI)V", "Lkotlin/Function1;", "Lru/yandex/video/m3/playback/features/AudioCodecInfo$Builder;", "Lzy11;", "builderAction", "copy", "(Ltls;)Lru/yandex/video/m3/playback/features/AudioCodecInfo;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getCodecName", "Z", "()Z", CA20Status.STATUS_USER_I, "getMaxSupportedInstances", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AudioCodecInfo {
    public static final int $stable = 0;
    private final String codecName;
    private final boolean isHardwareAccelerated;
    private final boolean isSecure;
    private final boolean isTunneled;
    private final int maxSupportedInstances;

    private AudioCodecInfo(String str, boolean z, boolean z2, boolean z3, int i) {
        this.codecName = str;
        this.isSecure = z;
        this.isTunneled = z2;
        this.isHardwareAccelerated = z3;
        this.maxSupportedInstances = i;
    }

    public static /* synthetic */ AudioCodecInfo copy$default(AudioCodecInfo audioCodecInfo, tls tlsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.playback.features.AudioCodecInfo$copy$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((AudioCodecInfo.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(AudioCodecInfo.Builder builder) {
                }
            };
        }
        return audioCodecInfo.copy(tlsVar);
    }

    public final AudioCodecInfo copy(tls builderAction) {
        Builder builder = new Builder(this);
        builderAction.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!AudioCodecInfo.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        AudioCodecInfo audioCodecInfo = (AudioCodecInfo) other;
        return this.isSecure == audioCodecInfo.isSecure && this.isTunneled == audioCodecInfo.isTunneled && this.isHardwareAccelerated == audioCodecInfo.isHardwareAccelerated && this.maxSupportedInstances == audioCodecInfo.maxSupportedInstances && jl40.l(this.codecName, audioCodecInfo.codecName);
    }

    public final String getCodecName() {
        return this.codecName;
    }

    public final int getMaxSupportedInstances() {
        return this.maxSupportedInstances;
    }

    public int hashCode() {
        return this.codecName.hashCode() + ((unr0.e(unr0.e(Boolean.hashCode(this.isSecure) * 31, 31, this.isTunneled), 31, this.isHardwareAccelerated) + this.maxSupportedInstances) * 31);
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
        StringBuilder sb = new StringBuilder("AudioCodecInfo(codecName='");
        sb.append(this.codecName);
        sb.append("', isSecure=");
        sb.append(this.isSecure);
        sb.append(", isTunneled=");
        sb.append(this.isTunneled);
        sb.append(", isHardwareAccelerated=");
        sb.append(this.isHardwareAccelerated);
        sb.append(", maxSupportedInstances=");
        return oyr.s(sb, this.maxSupportedInstances, ')');
    }

    public /* synthetic */ AudioCodecInfo(String str, boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, z2, z3, i);
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B/\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\r\u0010\u001b\u001a\u00020\u0003H\u0000¢\u0006\u0002\b\u001cR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\n\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\u0012\"\u0004\b\u0015\u0010\u0014R\u001a\u0010\t\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lru/yandex/video/m3/playback/features/AudioCodecInfo$Builder;", "", "AudioCodecInfo", "Lru/yandex/video/m3/playback/features/AudioCodecInfo;", "(Lru/yandex/video/m3/playback/features/AudioCodecInfo;)V", "codecName", "", "isSecure", "", "isTunneled", "isHardwareAccelerated", "maxSupportedInstances", "", "(Ljava/lang/String;ZZZI)V", "getCodecName", "()Ljava/lang/String;", "setCodecName", "(Ljava/lang/String;)V", "()Z", "setHardwareAccelerated", "(Z)V", "setSecure", "setTunneled", "getMaxSupportedInstances", "()I", "setMaxSupportedInstances", "(I)V", "build", "build$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private String codecName;
        private boolean isHardwareAccelerated;
        private boolean isSecure;
        private boolean isTunneled;
        private int maxSupportedInstances;

        public Builder(AudioCodecInfo audioCodecInfo) {
            this(audioCodecInfo.getCodecName(), audioCodecInfo.getIsSecure(), audioCodecInfo.getIsTunneled(), audioCodecInfo.getIsHardwareAccelerated(), audioCodecInfo.getMaxSupportedInstances());
        }

        public final AudioCodecInfo build$video_player_internalRelease() {
            return new AudioCodecInfo(this.codecName, this.isSecure, this.isTunneled, this.isHardwareAccelerated, this.maxSupportedInstances, null);
        }

        public final String getCodecName() {
            return this.codecName;
        }

        public final int getMaxSupportedInstances() {
            return this.maxSupportedInstances;
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

        public final void setTunneled(boolean z) {
            this.isTunneled = z;
        }

        public Builder(String str, boolean z, boolean z2, boolean z3, int i) {
            this.codecName = str;
            this.isSecure = z;
            this.isTunneled = z2;
            this.isHardwareAccelerated = z3;
            this.maxSupportedInstances = i;
        }
    }
}
