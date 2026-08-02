package ru.yandex.video.m3.data;

import android.media.MediaCodecInfo;
import defpackage.eh20;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.sb10;
import defpackage.tw21;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b \b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0001.B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\u000fHÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\t\u0010'\u001a\u00020\u0007HÆ\u0003J\t\u0010(\u001a\u00020\u0007HÆ\u0003Jw\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u0010*\u001a\u00020\u00072\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\u000fHÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\r\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0012R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012¨\u0006/"}, d2 = {"Lru/yandex/video/m3/data/CodecInfo;", "", "name", "", "mimeType", "codecMimeType", "adaptive", "", "tunneling", "secure", "hardwareAccelerated", "softwareOnly", "fromVendor", "isVideo", "maxSupportedInstances", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZI)V", "getAdaptive", "()Z", "getCodecMimeType", "()Ljava/lang/String;", "getFromVendor", "getHardwareAccelerated", "getMaxSupportedInstances", "()I", "getMimeType", "getName", "getSecure", "getSoftwareOnly", "getTunneling", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class CodecInfo {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean adaptive;
    private final String codecMimeType;
    private final boolean fromVendor;
    private final boolean hardwareAccelerated;
    private final boolean isVideo;
    private final int maxSupportedInstances;
    private final String mimeType;
    private final String name;
    private final boolean secure;
    private final boolean softwareOnly;
    private final boolean tunneling;

    public CodecInfo(String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i) {
        this.name = str;
        this.mimeType = str2;
        this.codecMimeType = str3;
        this.adaptive = z;
        this.tunneling = z2;
        this.secure = z3;
        this.hardwareAccelerated = z4;
        this.softwareOnly = z5;
        this.fromVendor = z6;
        this.isVideo = z7;
        this.maxSupportedInstances = i;
    }

    public static /* synthetic */ CodecInfo copy$default(CodecInfo codecInfo, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = codecInfo.name;
        }
        if ((i2 & 2) != 0) {
            str2 = codecInfo.mimeType;
        }
        if ((i2 & 4) != 0) {
            str3 = codecInfo.codecMimeType;
        }
        if ((i2 & 8) != 0) {
            z = codecInfo.adaptive;
        }
        if ((i2 & 16) != 0) {
            z2 = codecInfo.tunneling;
        }
        if ((i2 & 32) != 0) {
            z3 = codecInfo.secure;
        }
        if ((i2 & 64) != 0) {
            z4 = codecInfo.hardwareAccelerated;
        }
        if ((i2 & 128) != 0) {
            z5 = codecInfo.softwareOnly;
        }
        if ((i2 & 256) != 0) {
            z6 = codecInfo.fromVendor;
        }
        if ((i2 & 512) != 0) {
            z7 = codecInfo.isVideo;
        }
        if ((i2 & 1024) != 0) {
            i = codecInfo.maxSupportedInstances;
        }
        boolean z8 = z7;
        int i3 = i;
        boolean z9 = z5;
        boolean z10 = z6;
        boolean z11 = z3;
        boolean z12 = z4;
        boolean z13 = z2;
        String str4 = str3;
        return codecInfo.copy(str, str2, str4, z, z13, z11, z12, z9, z10, z8, i3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsVideo() {
        return this.isVideo;
    }

    /* renamed from: component11, reason: from getter */
    public final int getMaxSupportedInstances() {
        return this.maxSupportedInstances;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMimeType() {
        return this.mimeType;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCodecMimeType() {
        return this.codecMimeType;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getAdaptive() {
        return this.adaptive;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getTunneling() {
        return this.tunneling;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getSecure() {
        return this.secure;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getHardwareAccelerated() {
        return this.hardwareAccelerated;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getSoftwareOnly() {
        return this.softwareOnly;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getFromVendor() {
        return this.fromVendor;
    }

    public final CodecInfo copy(String name, String mimeType, String codecMimeType, boolean adaptive, boolean tunneling, boolean secure, boolean hardwareAccelerated, boolean softwareOnly, boolean fromVendor, boolean isVideo, int maxSupportedInstances) {
        return new CodecInfo(name, mimeType, codecMimeType, adaptive, tunneling, secure, hardwareAccelerated, softwareOnly, fromVendor, isVideo, maxSupportedInstances);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CodecInfo)) {
            return false;
        }
        CodecInfo codecInfo = (CodecInfo) other;
        return jl40.l(this.name, codecInfo.name) && jl40.l(this.mimeType, codecInfo.mimeType) && jl40.l(this.codecMimeType, codecInfo.codecMimeType) && this.adaptive == codecInfo.adaptive && this.tunneling == codecInfo.tunneling && this.secure == codecInfo.secure && this.hardwareAccelerated == codecInfo.hardwareAccelerated && this.softwareOnly == codecInfo.softwareOnly && this.fromVendor == codecInfo.fromVendor && this.isVideo == codecInfo.isVideo && this.maxSupportedInstances == codecInfo.maxSupportedInstances;
    }

    public final boolean getAdaptive() {
        return this.adaptive;
    }

    public final String getCodecMimeType() {
        return this.codecMimeType;
    }

    public final boolean getFromVendor() {
        return this.fromVendor;
    }

    public final boolean getHardwareAccelerated() {
        return this.hardwareAccelerated;
    }

    public final int getMaxSupportedInstances() {
        return this.maxSupportedInstances;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean getSecure() {
        return this.secure;
    }

    public final boolean getSoftwareOnly() {
        return this.softwareOnly;
    }

    public final boolean getTunneling() {
        return this.tunneling;
    }

    public int hashCode() {
        return Integer.hashCode(this.maxSupportedInstances) + unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.b(unr0.b(this.name.hashCode() * 31, 31, this.mimeType), 31, this.codecMimeType), 31, this.adaptive), 31, this.tunneling), 31, this.secure), 31, this.hardwareAccelerated), 31, this.softwareOnly), 31, this.fromVendor), 31, this.isVideo);
    }

    public final boolean isVideo() {
        return this.isVideo;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CodecInfo(name=");
        sb.append(this.name);
        sb.append(", mimeType=");
        sb.append(this.mimeType);
        sb.append(", codecMimeType=");
        sb.append(this.codecMimeType);
        sb.append(", adaptive=");
        sb.append(this.adaptive);
        sb.append(", tunneling=");
        sb.append(this.tunneling);
        sb.append(", secure=");
        sb.append(this.secure);
        sb.append(", hardwareAccelerated=");
        sb.append(this.hardwareAccelerated);
        sb.append(", softwareOnly=");
        sb.append(this.softwareOnly);
        sb.append(", fromVendor=");
        sb.append(this.fromVendor);
        sb.append(", isVideo=");
        sb.append(this.isVideo);
        sb.append(", maxSupportedInstances=");
        return oyr.s(sb, this.maxSupportedInstances, ')');
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/video/m3/data/CodecInfo$Companion;", "", "<init>", "()V", "Lsb10;", "Lru/yandex/video/m3/data/CodecInfo;", "toCodecInfoDto", "(Lsb10;)Lru/yandex/video/m3/data/CodecInfo;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CodecInfo toCodecInfoDto(sb10 sb10Var) {
            MediaCodecInfo.CodecCapabilities codecCapabilities;
            String str = sb10Var.a;
            String str2 = sb10Var.b;
            return new CodecInfo(str, str2, sb10Var.c, sb10Var.e, sb10Var.f, sb10Var.g, sb10Var.h, sb10Var.i, sb10Var.j, eh20.p(str2), (tw21.a < 23 || (codecCapabilities = sb10Var.d) == null) ? -1 : codecCapabilities.getMaxSupportedInstances());
        }

        private Companion() {
        }
    }
}
