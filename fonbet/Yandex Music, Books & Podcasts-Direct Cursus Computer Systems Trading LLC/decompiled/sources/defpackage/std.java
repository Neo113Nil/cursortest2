package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class std {
    public static final std d = new std(d85.n, 3, null);
    public final long a;
    public final int b;
    public final ai3 c;

    public std(long j, int i, ai3 ai3Var) {
        this.a = j;
        this.b = i;
        this.c = ai3Var;
    }

    public final boolean a() {
        return (this.a == 16 && this.c == null) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof std)) {
            return false;
        }
        std stdVar = (std) obj;
        return d85.c(this.a, stdVar.a) && this.b == stdVar.b && Intrinsics.d(this.c, stdVar.c);
    }

    public final int hashCode() {
        int i = d85.o;
        met metVar = net.b;
        int a = f1d.a(this.b, Long.hashCode(this.a) * 31, 31);
        ai3 ai3Var = this.c;
        return a + (ai3Var == null ? 0 : ai3Var.hashCode());
    }

    public final String toString() {
        StringBuilder m = f1d.m("HazeTint(color=", d85.i(this.a), ", blendMode=", lxe.J(this.b), ", brush=");
        m.append(this.c);
        m.append(")");
        return m.toString();
    }
}
