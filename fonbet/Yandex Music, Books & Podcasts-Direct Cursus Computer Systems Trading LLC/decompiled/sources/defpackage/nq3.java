package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class nq3 {
    public final zvs a;
    public final long b;
    public final css c;
    public final o5n d;
    public final thr e;

    public nq3(zvs zvsVar, long j, css cssVar, o5n o5nVar, thr thrVar) {
        zvsVar.getClass();
        cssVar.getClass();
        o5nVar.getClass();
        thrVar.getClass();
        this.a = zvsVar;
        this.b = j;
        this.c = cssVar;
        this.d = o5nVar;
        this.e = thrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nq3)) {
            return false;
        }
        nq3 nq3Var = (nq3) obj;
        return Intrinsics.d(this.a, nq3Var.a) && this.b == nq3Var.b && this.c == nq3Var.c && this.d == nq3Var.d && this.e == nq3Var.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + tlm.c(this.b, this.a.a.hashCode() * 31, 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CacheTrackData(trackId=" + this.a + ", timeStamp=" + this.b + ", cacheType=" + this.c + ", quality=" + this.d + ", storage=" + this.e + ")";
    }
}
