package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ad5 implements bd5 {
    public final String a;
    public final String b;
    public final String c;

    public ad5(String str, String str2, String str3) {
        dfi.s(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // defpackage.bd5
    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ad5)) {
            return false;
        }
        ad5 ad5Var = (ad5) obj;
        return Intrinsics.d(this.a, ad5Var.a) && Intrinsics.d(this.b, ad5Var.b) && Intrinsics.d(this.c, ad5Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // defpackage.bd5
    public final String s() {
        return this.a;
    }

    public final String toString() {
        return su4.o(f1d.m("WithFilter(owner=", this.a, ", kind=", this.b, ", filterId="), this.c, ")");
    }
}
