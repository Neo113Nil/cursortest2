package defpackage;

import android.os.SystemClock;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b2k {
    public final long a = SystemClock.elapsedRealtime();
    public Long b = null;
    public Long c = null;
    public Long d = null;
    public Long e = null;
    public Long f = null;
    public Long g = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b2k)) {
            return false;
        }
        b2k b2kVar = (b2k) obj;
        return this.a == b2kVar.a && Intrinsics.d(this.b, b2kVar.b) && Intrinsics.d(this.c, b2kVar.c) && Intrinsics.d(this.d, b2kVar.d) && Intrinsics.d(this.e, b2kVar.e) && Intrinsics.d(this.f, b2kVar.f) && Intrinsics.d(this.g, b2kVar.g);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        Long l = this.b;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.c;
        int hashCode3 = (hashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.d;
        int hashCode4 = (hashCode3 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.e;
        int hashCode5 = (hashCode4 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.f;
        int hashCode6 = (hashCode5 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Long l6 = this.g;
        return hashCode6 + (l6 != null ? l6.hashCode() : 0);
    }

    public final String toString() {
        return "PageMoments(pageLoadStarted=" + this.a + ", pageLoadFinished=" + this.b + ", pageLoadCompletelyFinished=" + this.c + ", authSucceeded=" + this.d + ", pageReadyForChat=" + this.e + ", loaderHidden=" + this.f + ", preloaded=" + this.g + ")";
    }
}
