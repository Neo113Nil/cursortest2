package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class k4 implements l4 {
    public final String a;
    public final String b;
    public final mqs c;
    public final a63 d;

    public k4(String str, String str2, mqs mqsVar, a63 a63Var) {
        this.a = str;
        this.b = str2;
        this.c = mqsVar;
        this.d = a63Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k4)) {
            return false;
        }
        k4 k4Var = (k4) obj;
        return Intrinsics.d(this.a, k4Var.a) && this.b.equals(k4Var.b) && this.c.equals(k4Var.c) && Intrinsics.d(this.d, k4Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int c = k5r.c(k5r.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c.a);
        a63 a63Var = this.d;
        return c + (a63Var != null ? a63Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = f1d.m("Success(title=", this.a, ", shortDescription=", this.b, ", track=");
        m.append(this.c);
        m.append(", analyticsPayload=");
        m.append(this.d);
        m.append(")");
        return m.toString();
    }
}
