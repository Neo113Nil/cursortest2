package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class qd3 extends ox6 {
    public final String j;
    public final String k;
    public final String l;

    public qd3(String str, String str2, String str3) {
        str2.getClass();
        str3.getClass();
        this.j = str;
        this.k = str2;
        this.l = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qd3)) {
            return false;
        }
        qd3 qd3Var = (qd3) obj;
        return Intrinsics.d(this.j, qd3Var.j) && Intrinsics.d(this.k, qd3Var.k) && Intrinsics.d(this.l, qd3Var.l);
    }

    public final int hashCode() {
        String str = this.j;
        return this.l.hashCode() + k5r.c((str == null ? 0 : str.hashCode()) * 31, 31, this.k);
    }

    public final String toString() {
        return su4.o(f1d.m("ActionButton(imageUrl=", this.j, ", title=", this.k, ", deeplink="), this.l, ")");
    }
}
