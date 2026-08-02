package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ch5 {
    public final String a;
    public final String b;
    public final String c;
    public final bh5 d;
    public final bh5 e;
    public final zg5 f;
    public final ah5 g;

    public ch5(String str, String str2, String str3, bh5 bh5Var, bh5 bh5Var2, zg5 zg5Var, ah5 ah5Var) {
        dfi.s(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = bh5Var;
        this.e = bh5Var2;
        this.f = zg5Var;
        this.g = ah5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ch5)) {
            return false;
        }
        ch5 ch5Var = (ch5) obj;
        return Intrinsics.d(this.a, ch5Var.a) && Intrinsics.d(this.b, ch5Var.b) && Intrinsics.d(this.c, ch5Var.c) && Intrinsics.d(this.d, ch5Var.d) && Intrinsics.d(this.e, ch5Var.e) && Intrinsics.d(this.f, ch5Var.f) && Intrinsics.d(this.g, ch5Var.g);
    }

    public final int hashCode() {
        int c = k5r.c(k5r.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        bh5 bh5Var = this.d;
        int hashCode = (c + (bh5Var == null ? 0 : bh5Var.hashCode())) * 31;
        bh5 bh5Var2 = this.e;
        int hashCode2 = (hashCode + (bh5Var2 == null ? 0 : bh5Var2.hashCode())) * 31;
        zg5 zg5Var = this.f;
        int hashCode3 = (hashCode2 + (zg5Var == null ? 0 : zg5Var.hashCode())) * 31;
        ah5 ah5Var = this.g;
        return hashCode3 + (ah5Var != null ? ah5Var.a.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = f1d.m("Data(title=", this.a, ", subtitle=", this.b, ", imageUrl=");
        m.append(this.c);
        m.append(", lightTheme=");
        m.append(this.d);
        m.append(", darkTheme=");
        m.append(this.e);
        m.append(", action=");
        m.append(this.f);
        m.append(", adv=");
        m.append(this.g);
        m.append(")");
        return m.toString();
    }
}
