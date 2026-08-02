package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ybs {
    public final mn0 a;
    public final long b;
    public final rds c;

    static {
        apo apoVar = bpo.a;
    }

    public ybs(mn0 mn0Var, long j, rds rdsVar) {
        rds rdsVar2;
        this.a = mn0Var;
        this.b = y5g.V(mn0Var.b.length(), j);
        if (rdsVar != null) {
            rdsVar2 = new rds(y5g.V(mn0Var.b.length(), rdsVar.a));
        } else {
            rdsVar2 = null;
        }
        this.c = rdsVar2;
    }

    public static ybs a(ybs ybsVar, mn0 mn0Var, long j, int i) {
        if ((i & 1) != 0) {
            mn0Var = ybsVar.a;
        }
        if ((i & 2) != 0) {
            j = ybsVar.b;
        }
        rds rdsVar = (i & 4) != 0 ? ybsVar.c : null;
        ybsVar.getClass();
        return new ybs(mn0Var, j, rdsVar);
    }

    public static ybs b(ybs ybsVar, String str, long j, int i) {
        if ((i & 2) != 0) {
            j = ybsVar.b;
        }
        rds rdsVar = ybsVar.c;
        ybsVar.getClass();
        return new ybs(new mn0(str), j, rdsVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ybs)) {
            return false;
        }
        ybs ybsVar = (ybs) obj;
        return rds.a(this.b, ybsVar.b) && Intrinsics.d(this.c, ybsVar.c) && Intrinsics.d(this.a, ybsVar.a);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i = rds.c;
        int c = tlm.c(this.b, hashCode, 31);
        rds rdsVar = this.c;
        return c + (rdsVar != null ? Long.hashCode(rdsVar.a) : 0);
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.a) + "', selection=" + ((Object) rds.g(this.b)) + ", composition=" + this.c + ')';
    }

    public ybs(String str, long j, int i) {
        this(new mn0((i & 1) != 0 ? "" : str), (i & 2) != 0 ? rds.b : j, (rds) null);
    }
}
