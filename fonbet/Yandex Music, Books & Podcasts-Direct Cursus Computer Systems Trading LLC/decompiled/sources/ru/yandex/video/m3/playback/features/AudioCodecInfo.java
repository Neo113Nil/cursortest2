package ru.yandex.video.m3.playback.features;

import androidx.annotation.Keep;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.cw1;
import defpackage.k5r;
import defpackage.rq1;
import defpackage.vz1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001:\u0001\rB1\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0010\u001a\u00020\u00002\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u0005\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u0006\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u0007\u0010\u001cR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u0016¨\u0006\u001f"}, d2 = {"Lru/yandex/video/m3/playback/features/AudioCodecInfo;", "", "", "codecName", "", "isSecure", "isTunneled", "isHardwareAccelerated", "", "maxSupportedInstances", "<init>", "(Ljava/lang/String;ZZZI)V", "Lkotlin/Function1;", "Lcw1;", "", "builderAction", "copy", "(Lkotlin/jvm/functions/Function1;)Lru/yandex/video/m3/playback/features/AudioCodecInfo;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getCodecName", "Z", "()Z", "I", "getMaxSupportedInstances", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes6.dex */
public final class AudioCodecInfo {
    public static final int $stable = 0;

    @NotNull
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

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AudioCodecInfo copy$default(AudioCodecInfo audioCodecInfo, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = rq1.v;
        }
        return audioCodecInfo.copy(function1);
    }

    @NotNull
    public final AudioCodecInfo copy(@NotNull Function1<? super cw1, Unit> builderAction) {
        builderAction.getClass();
        String codecName = getCodecName();
        boolean isSecure = getIsSecure();
        boolean isTunneled = getIsTunneled();
        boolean isHardwareAccelerated = getIsHardwareAccelerated();
        int maxSupportedInstances = getMaxSupportedInstances();
        codecName.getClass();
        builderAction.invoke(new cw1());
        return new AudioCodecInfo(codecName, isSecure, isTunneled, isHardwareAccelerated, maxSupportedInstances, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!AudioCodecInfo.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        other.getClass();
        AudioCodecInfo audioCodecInfo = (AudioCodecInfo) other;
        return this.isSecure == audioCodecInfo.isSecure && this.isTunneled == audioCodecInfo.isTunneled && this.isHardwareAccelerated == audioCodecInfo.isHardwareAccelerated && this.maxSupportedInstances == audioCodecInfo.maxSupportedInstances && Intrinsics.d(this.codecName, audioCodecInfo.codecName);
    }

    @NotNull
    public final String getCodecName() {
        return this.codecName;
    }

    public final int getMaxSupportedInstances() {
        return this.maxSupportedInstances;
    }

    public int hashCode() {
        return this.codecName.hashCode() + ((k5r.e(k5r.e(Boolean.hashCode(this.isSecure) * 31, 31, this.isTunneled), 31, this.isHardwareAccelerated) + this.maxSupportedInstances) * 31);
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

    @NotNull
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
        return vz1.r(sb, this.maxSupportedInstances, ')');
    }

    public /* synthetic */ AudioCodecInfo(String str, boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, z2, z3, i);
    }
}
