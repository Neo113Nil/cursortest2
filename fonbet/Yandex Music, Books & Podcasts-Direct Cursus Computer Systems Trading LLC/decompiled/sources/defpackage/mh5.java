package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class mh5 implements xh5 {
    public final String a;
    public final String b;
    public final qh5 c;
    public final rv8 d;

    public mh5(String str, String str2, qh5 qh5Var, rv8 rv8Var) {
        str.getClass();
        str2.getClass();
        rv8Var.getClass();
        this.a = str;
        this.b = str2;
        this.c = qh5Var;
        this.d = rv8Var;
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
        if (!(obj instanceof mh5)) {
            return false;
        }
        mh5 mh5Var = (mh5) obj;
        return Intrinsics.d(this.a, mh5Var.a) && Intrinsics.d(this.b, mh5Var.b) && this.c.equals(mh5Var.c) && Intrinsics.d(this.d, mh5Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder m = f1d.m("Div(screenId=", this.a, ", feedbackToken=", this.b, ", meta=");
        m.append(this.c);
        m.append(", div=");
        m.append(this.d);
        m.append(")");
        return m.toString();
    }
}
