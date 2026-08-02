package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l68 {
    public final int a;
    public final String b;
    public final String c;
    public final g58 d;
    public final String e;
    public final String f;

    public l68(int i, String str, String str2, g58 g58Var, String str3, String str4) {
        str.getClass();
        str3.getClass();
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = g58Var;
        this.e = str3;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l68)) {
            return false;
        }
        l68 l68Var = (l68) obj;
        return this.a == l68Var.a && Intrinsics.d(this.b, l68Var.b) && Intrinsics.d(this.c, l68Var.c) && Intrinsics.d(this.d, l68Var.d) && Intrinsics.d(this.e, l68Var.e) && Intrinsics.d(this.f, l68Var.f);
    }

    public final int hashCode() {
        int c = k5r.c(Integer.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        g58 g58Var = this.d;
        int c2 = k5r.c((hashCode + (g58Var == null ? 0 : g58Var.hashCode())) * 31, 31, this.e);
        String str2 = this.f;
        return c2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder r = k5r.r(this.a, "DisclaimerUiData(icon=", ", title=", this.b, ", subtitle=");
        r.append(this.c);
        r.append(", detailsButton=");
        r.append(this.d);
        r.append(", cancelButton=");
        return ouj.q(r, this.e, ", continueButton=", this.f, ")");
    }
}
