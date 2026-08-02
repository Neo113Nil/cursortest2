package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class kh5 implements xh5 {
    public final String a;
    public final String b;
    public final qh5 c;
    public final jh5 d;

    public kh5(String str, String str2, qh5 qh5Var, jh5 jh5Var) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = qh5Var;
        this.d = jh5Var;
    }

    @Override // defpackage.xh5
    public final qh5 a() {
        return this.c;
    }

    @Override // defpackage.xh5
    public final String b() {
        return this.a;
    }

    @Override // defpackage.xh5
    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kh5)) {
            return false;
        }
        kh5 kh5Var = (kh5) obj;
        return Intrinsics.d(this.a, kh5Var.a) && Intrinsics.d(this.b, kh5Var.b) && this.c.equals(kh5Var.c) && this.d.equals(kh5Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder m = f1d.m("BarAbove(screenId=", this.a, ", feedbackToken=", this.b, ", meta=");
        m.append(this.c);
        m.append(", data=");
        m.append(this.d);
        m.append(")");
        return m.toString();
    }
}
