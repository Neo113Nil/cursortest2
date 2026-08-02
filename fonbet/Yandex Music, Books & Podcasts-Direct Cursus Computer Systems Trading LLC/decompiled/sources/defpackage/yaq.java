package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class yaq {
    public final pfn a;
    public final String b;
    public final gxc c;

    public yaq(pfn pfnVar, String str, gxc gxcVar) {
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
        if (!(obj instanceof yaq)) {
            return false;
        }
        yaq yaqVar = (yaq) obj;
        return Intrinsics.d(this.a, yaqVar.a) && Intrinsics.d(this.b, yaqVar.b) && Intrinsics.d(this.c, yaqVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "AnalyticsOptions(radioFrom=" + this.a + ", idForFrom=" + this.b + ", fromData=" + this.c + ")";
    }
}
