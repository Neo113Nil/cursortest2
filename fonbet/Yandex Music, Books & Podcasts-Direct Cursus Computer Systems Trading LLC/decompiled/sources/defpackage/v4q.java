package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class v4q {
    public final pfn a;
    public final String b;
    public final gxc c;

    public v4q(pfn pfnVar, String str, gxc gxcVar) {
        pfnVar.getClass();
        str.getClass();
        gxcVar.getClass();
        this.a = pfnVar;
        this.b = str;
        this.c = gxcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v4q)) {
            return false;
        }
        v4q v4qVar = (v4q) obj;
        return Intrinsics.d(this.a, v4qVar.a) && Intrinsics.d(this.b, v4qVar.b) && Intrinsics.d(this.c, v4qVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "AnalyticsOptions(radioFrom=" + this.a + ", idWaveForFrom=" + this.b + ", fromData=" + this.c + ")";
    }
}
