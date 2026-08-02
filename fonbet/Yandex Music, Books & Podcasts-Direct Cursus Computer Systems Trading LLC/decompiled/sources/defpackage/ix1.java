package defpackage;

/* loaded from: classes.dex */
public final class ix1 {
    public static final ix1 d = new hx1().a();
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public ix1(hx1 hx1Var) {
        this.a = hx1Var.a;
        this.b = hx1Var.b;
        this.c = hx1Var.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ix1.class != obj.getClass()) {
            return false;
        }
        ix1 ix1Var = (ix1) obj;
        return this.a == ix1Var.a && this.b == ix1Var.b && this.c == ix1Var.c;
    }

    public final int hashCode() {
        return ((this.a ? 1 : 0) << 2) + ((this.b ? 1 : 0) << 1) + (this.c ? 1 : 0);
    }
}
