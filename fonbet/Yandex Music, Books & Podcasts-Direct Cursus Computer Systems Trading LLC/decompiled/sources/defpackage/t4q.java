package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class t4q {
    public final pfn a;
    public final String b;
    public final gxc c;
    public final boolean d;
    public final String e;
    public final v80 f;

    public t4q(pfn pfnVar, String str, gxc gxcVar, boolean z) {
        pfnVar.getClass();
        str.getClass();
        gxcVar.getClass();
        this.a = pfnVar;
        this.b = str;
        this.c = gxcVar;
        this.d = z;
        this.e = pfnVar.a(str);
        this.f = new v80(pfnVar.a(str), gxcVar, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t4q)) {
            return false;
        }
        t4q t4qVar = (t4q) obj;
        return Intrinsics.d(this.a, t4qVar.a) && Intrinsics.d(this.b, t4qVar.b) && Intrinsics.d(this.c, t4qVar.c) && this.d == t4qVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        return "AnalyticsOptions(aliceSessionId=null, radioFrom=" + this.a + ", idWaveForFrom=" + this.b + ", fromData=" + this.c + ", autoflow=" + this.d + ")";
    }
}
