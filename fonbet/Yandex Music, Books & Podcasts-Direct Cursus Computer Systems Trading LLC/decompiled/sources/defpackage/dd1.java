package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class dd1 implements ed1 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final thj e;

    public dd1(String str, String str2, String str3, String str4) {
        dfi.s(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = new thj(pkb.Shortcut, str, 1, 1, "");
    }

    @Override // defpackage.ed1
    public final thj a() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd1)) {
            return false;
        }
        dd1 dd1Var = (dd1) obj;
        return Intrinsics.d(this.a, dd1Var.a) && Intrinsics.d(this.b, dd1Var.b) && Intrinsics.d(this.c, dd1Var.c) && this.d.equals(dd1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + k5r.c(k5r.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ouj.q(f1d.m("Success(title=", this.a, ", subtitle=", this.b, ", url="), this.c, ", imgUrl=", this.d, ")");
    }
}
