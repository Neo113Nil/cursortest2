package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ln0 {
    public final Object a;
    public final int b;
    public final int c;
    public final String d;

    public ln0(int i, int i2, Object obj, String str) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = str;
        if (i <= i2) {
            return;
        }
        tme.a("Reversed range is not supported");
    }

    public static ln0 a(ln0 ln0Var, x5k x5kVar, int i, int i2) {
        Object obj = x5kVar;
        if ((i2 & 1) != 0) {
            obj = ln0Var.a;
        }
        int i3 = ln0Var.b;
        if ((i2 & 4) != 0) {
            i = ln0Var.c;
        }
        return new ln0(i3, i, obj, ln0Var.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ln0)) {
            return false;
        }
        ln0 ln0Var = (ln0) obj;
        return Intrinsics.d(this.a, ln0Var.a) && this.b == ln0Var.b && this.c == ln0Var.c && Intrinsics.d(this.d, ln0Var.d);
    }

    public final int hashCode() {
        Object obj = this.a;
        return this.d.hashCode() + f1d.a(this.c, f1d.a(this.b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Range(item=");
        sb.append(this.a);
        sb.append(", start=");
        sb.append(this.b);
        sb.append(", end=");
        sb.append(this.c);
        sb.append(", tag=");
        return dfi.i(sb, this.d, ')');
    }

    public ln0(Object obj, int i, int i2) {
        this(i, i2, obj, "");
    }
}
