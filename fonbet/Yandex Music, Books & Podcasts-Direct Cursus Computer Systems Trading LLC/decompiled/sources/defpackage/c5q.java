package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c5q {
    public final pfn a;
    public final gxc b;

    public c5q(pfn pfnVar, gxc gxcVar) {
        pfnVar.getClass();
        gxcVar.getClass();
        this.a = pfnVar;
        this.b = gxcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c5q)) {
            return false;
        }
        c5q c5qVar = (c5q) obj;
        return Intrinsics.d(this.a, c5qVar.a) && Intrinsics.d(this.b, c5qVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AnalyticsOptions(radioFrom=" + this.a + ", fromData=" + this.b + ")";
    }
}
