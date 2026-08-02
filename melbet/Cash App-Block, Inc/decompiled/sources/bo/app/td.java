package bo.app;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class td {
    public boolean a;
    public Long b;
    public String c;
    public long d;
    public long e;
    public long f;

    public td(boolean z, Long l, String str, long j, long j2, long j3) {
        this.a = z;
        this.b = l;
        this.c = str;
        this.d = j;
        this.e = j2;
        this.f = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof td)) {
            return false;
        }
        td tdVar = (td) obj;
        return this.a == tdVar.a && Intrinsics.areEqual(this.b, tdVar.b) && Intrinsics.areEqual(this.c, tdVar.c) && this.d == tdVar.d && this.e == tdVar.e && this.f == tdVar.f;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        Long l = this.b;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.c;
        return Long.hashCode(this.f) + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        boolean z = this.a;
        Long l = this.b;
        String str = this.c;
        long j = this.d;
        long j2 = this.e;
        long j3 = this.f;
        StringBuilder sb = new StringBuilder("Config(isEnabled=");
        sb.append(z);
        sb.append(", sdkDebuggerExpirationTime=");
        sb.append(l);
        sb.append(", sdkDebuggerAuthCode=");
        sb.append(str);
        sb.append(", sdkDebuggerFlushIntervalBytes=");
        sb.append(j);
        Boxes$$ExternalSyntheticOutline1.m1151m(j2, ", sdkDebuggerFlushIntervalSeconds=", ", sdkDebuggerMaxPayloadBytes=", sb);
        return CameraState$Type$EnumUnboxingLocalUtility.m(j3, ")", sb);
    }

    public /* synthetic */ td() {
        this(false, null, null, 0L, 0L, 0L);
    }
}
