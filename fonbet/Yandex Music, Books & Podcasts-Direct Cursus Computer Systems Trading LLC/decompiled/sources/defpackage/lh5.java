package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class lh5 implements xh5 {
    public final String a;
    public final String b;
    public final qh5 c;
    public final String d;

    public lh5(String str, String str2, qh5 qh5Var, String str3) {
        dfi.s(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = qh5Var;
        this.d = str3;
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
        if (!(obj instanceof lh5)) {
            return false;
        }
        lh5 lh5Var = (lh5) obj;
        return Intrinsics.d(this.a, lh5Var.a) && Intrinsics.d(this.b, lh5Var.b) && this.c.equals(lh5Var.c) && Intrinsics.d(this.d, lh5Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder m = f1d.m("Deeplink(screenId=", this.a, ", feedbackToken=", this.b, ", meta=");
        m.append(this.c);
        m.append(", deeplink=");
        m.append(this.d);
        m.append(")");
        return m.toString();
    }
}
