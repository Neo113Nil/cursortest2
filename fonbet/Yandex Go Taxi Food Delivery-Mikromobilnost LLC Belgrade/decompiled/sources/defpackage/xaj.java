package defpackage;

/* loaded from: classes10.dex */
public final class xaj {
    public static final xaj c;
    public final int a;
    public final int b;

    static {
        i6z0 i6z0Var = new i6z0(2);
        d6z.l(i6z0Var.b <= i6z0Var.c);
        c = new xaj(i6z0Var);
        tw21.Q(0);
        tw21.Q(1);
        tw21.Q(2);
        tw21.Q(3);
    }

    public xaj(i6z0 i6z0Var) {
        this.a = i6z0Var.b;
        this.b = i6z0Var.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xaj)) {
            return false;
        }
        xaj xajVar = (xaj) obj;
        return this.a == xajVar.a && this.b == xajVar.b;
    }

    public final int hashCode() {
        return (((16337 + this.a) * 31) + this.b) * 31;
    }
}
