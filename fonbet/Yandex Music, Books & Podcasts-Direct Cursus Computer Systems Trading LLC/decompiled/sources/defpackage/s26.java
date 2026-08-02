package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s26 {
    public final h06 a;
    public final uy5 b;

    public s26(h06 h06Var, uy5 uy5Var) {
        this.a = h06Var;
        this.b = uy5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s26)) {
            return false;
        }
        s26 s26Var = (s26) obj;
        return this.a.equals(s26Var.a) && Intrinsics.d(this.b, s26Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        uy5 uy5Var = this.b;
        return hashCode + (uy5Var == null ? 0 : uy5Var.hashCode());
    }

    public final String toString() {
        return "ConcertWithPrice(concert=" + this.a + ", price=" + this.b + ")";
    }
}
