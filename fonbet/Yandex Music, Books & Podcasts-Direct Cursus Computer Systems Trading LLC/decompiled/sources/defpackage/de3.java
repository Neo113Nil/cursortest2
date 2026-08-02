package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class de3 extends xv {
    public final String k;
    public final String l;
    public final String m;

    public de3(String str, String str2, String str3) {
        str2.getClass();
        str3.getClass();
        this.k = str;
        this.l = str2;
        this.m = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof de3)) {
            return false;
        }
        de3 de3Var = (de3) obj;
        return Intrinsics.d(this.k, de3Var.k) && Intrinsics.d(this.l, de3Var.l) && Intrinsics.d(this.m, de3Var.m);
    }

    public final int hashCode() {
        String str = this.k;
        return this.m.hashCode() + k5r.c((str == null ? 0 : str.hashCode()) * 31, 31, this.l);
    }

    public final String toString() {
        return su4.o(f1d.m("ActionButton(imageUrl=", this.k, ", title=", this.l, ", deeplink="), this.m, ")");
    }
}
