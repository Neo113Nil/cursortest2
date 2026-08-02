package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class xb1 {
    public final c01 a;
    public final jd1 b;

    public xb1(c01 c01Var, jd1 jd1Var) {
        c01Var.getClass();
        this.a = c01Var;
        this.b = jd1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xb1)) {
            return false;
        }
        xb1 xb1Var = (xb1) obj;
        return Intrinsics.d(this.a, xb1Var.a) && this.b.equals(xb1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "ArtistItem(artist=" + this.a + ", uiData=" + this.b + ")";
    }
}
