package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class nf1 {
    public final ikm a;
    public final boolean b;
    public final p43 c;

    public nf1(ikm ikmVar, boolean z, p43 p43Var) {
        this.a = ikmVar;
        this.b = z;
        this.c = p43Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nf1)) {
            return false;
        }
        nf1 nf1Var = (nf1) obj;
        return this.a.equals(nf1Var.a) && this.b == nf1Var.b && Intrinsics.d(this.c, nf1Var.c);
    }

    public final int hashCode() {
        int e = k5r.e(this.a.hashCode() * 31, 31, this.b);
        p43 p43Var = this.c;
        return e + (p43Var == null ? 0 : p43Var.a.hashCode());
    }

    public final String toString() {
        return "ArtistPreSaveBlockData(release=" + this.a + ", presaved=" + this.b + ", analyticsData=" + this.c + ")";
    }
}
