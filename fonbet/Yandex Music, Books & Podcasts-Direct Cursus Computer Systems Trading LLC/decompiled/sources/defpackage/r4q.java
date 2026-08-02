package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class r4q {
    public final pfn a;
    public final String b;
    public final gxc c;
    public final String d;
    public final v80 e;

    public r4q(pfn pfnVar, String str, gxc gxcVar) {
        pfnVar.getClass();
        gxcVar.getClass();
        this.a = pfnVar;
        this.b = str;
        this.c = gxcVar;
        this.d = pfnVar.a(str);
        this.e = new v80(pfnVar.a(str), gxcVar, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r4q)) {
            return false;
        }
        r4q r4qVar = (r4q) obj;
        return Intrinsics.d(this.a, r4qVar.a) && this.b.equals(r4qVar.b) && Intrinsics.d(this.c, r4qVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "AnalyticsOptions(radioFrom=" + this.a + ", idWaveForFrom=" + this.b + ", fromData=" + this.c + ")";
    }
}
