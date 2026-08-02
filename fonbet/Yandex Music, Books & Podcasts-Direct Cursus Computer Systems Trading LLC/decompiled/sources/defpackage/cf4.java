package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class cf4 {
    public final String a;
    public final String b;
    public final String c;
    public final etq d;

    public cf4(String str, String str2, String str3, etq etqVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = etqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cf4)) {
            return false;
        }
        cf4 cf4Var = (cf4) obj;
        return Intrinsics.d(this.a, cf4Var.a) && Intrinsics.d(this.b, cf4Var.b) && this.c.equals(cf4Var.c) && this.d == cf4Var.d;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return this.d.hashCode() + k5r.c((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder m = f1d.m("ChartFavoriteItem(title=", this.a, ", subtitle=", this.b, ", cover=");
        m.append(this.c);
        m.append(", coverType=");
        m.append(this.d);
        m.append(")");
        return m.toString();
    }
}
