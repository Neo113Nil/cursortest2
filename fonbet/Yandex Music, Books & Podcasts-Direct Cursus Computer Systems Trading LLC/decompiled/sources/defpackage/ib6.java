package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ib6 {
    public final vqf a;
    public final int b;
    public final d40 c;
    public final e40 d;

    public /* synthetic */ ib6(vqf vqfVar, int i, d40 d40Var, e40 e40Var, int i2) {
        this(vqfVar, i, (i2 & 4) != 0 ? null : d40Var, (i2 & 8) != 0 ? null : e40Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ib6)) {
            return false;
        }
        ib6 ib6Var = (ib6) obj;
        return this.a == ib6Var.a && this.b == ib6Var.b && Intrinsics.d(this.c, ib6Var.c) && Intrinsics.d(this.d, ib6Var.d);
    }

    public final int hashCode() {
        int a = f1d.a(this.b, this.a.hashCode() * 31, 31);
        d40 d40Var = this.c;
        int hashCode = (a + (d40Var == null ? 0 : Integer.hashCode(d40Var.a))) * 31;
        e40 e40Var = this.d;
        return hashCode + (e40Var != null ? Integer.hashCode(e40Var.a) : 0);
    }

    public final String toString() {
        return "ContainerSelector(type=" + this.a + ", numChildren=" + this.b + ", horizontalAlignment=" + this.c + ", verticalAlignment=" + this.d + ')';
    }

    public ib6(vqf vqfVar, int i, d40 d40Var, e40 e40Var) {
        this.a = vqfVar;
        this.b = i;
        this.c = d40Var;
        this.d = e40Var;
    }
}
