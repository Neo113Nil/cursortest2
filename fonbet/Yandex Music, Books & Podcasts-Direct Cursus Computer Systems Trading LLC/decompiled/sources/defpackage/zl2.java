package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class zl2 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final String f;

    public zl2(String str, String str2, String str3, boolean z, boolean z2, String str4) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = z2;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zl2)) {
            return false;
        }
        zl2 zl2Var = (zl2) obj;
        return Intrinsics.d(this.a, zl2Var.a) && Intrinsics.d(this.b, zl2Var.b) && this.c.equals(zl2Var.c) && this.d == zl2Var.d && this.e == zl2Var.e && this.f.equals(zl2Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + k5r.e(k5r.e(k5r.c(k5r.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder m = f1d.m("BankInfo(bankName=", this.a, ", logoUrl=", this.b, ", scheme=");
        m.append(this.c);
        m.append(", isFavorite=");
        m.append(this.d);
        m.append(", isInstalled=");
        m.append(this.e);
        m.append(", urlTemplate=");
        m.append(this.f);
        m.append(")");
        return m.toString();
    }
}
