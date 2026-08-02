package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class nn6 extends saf {
    public final String n;
    public final String o;
    public final String p;

    public nn6(String str, String str2, String str3) {
        str2.getClass();
        str3.getClass();
        this.n = str;
        this.o = str2;
        this.p = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nn6)) {
            return false;
        }
        nn6 nn6Var = (nn6) obj;
        return this.n.equals(nn6Var.n) && Intrinsics.d(this.o, nn6Var.o) && Intrinsics.d(this.p, nn6Var.p);
    }

    public final int hashCode() {
        return this.p.hashCode() + k5r.c(this.n.hashCode() * 31, 31, this.o);
    }

    public final String toString() {
        return su4.o(f1d.m("WithMask(cover=", this.n, ", coverMask=", this.o, ", coverBackground="), this.p, ")");
    }
}
