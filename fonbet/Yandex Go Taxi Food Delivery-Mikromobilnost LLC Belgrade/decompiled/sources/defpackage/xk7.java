package defpackage;

/* loaded from: classes9.dex */
public final class xk7 {
    public final sls a;
    public final Object b;

    public xk7(sls slsVar, zrl zrlVar) {
        this.a = slsVar;
        this.b = zrlVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xk7)) {
            return false;
        }
        xk7 xk7Var = (xk7) obj;
        return jl40.l(this.b, xk7Var.b) && this.a.equals(xk7Var.a);
    }

    public final int hashCode() {
        Object obj = this.b;
        return this.a.hashCode() + ((obj != null ? obj.hashCode() : 0) * 31);
    }
}
