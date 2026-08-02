package defpackage;

/* loaded from: classes2.dex */
public final class qhd0 {
    public final oo2 a;
    public final c0d0 b;

    public qhd0(oo2 oo2Var, c0d0 c0d0Var) {
        this.a = oo2Var;
        this.b = c0d0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qhd0)) {
            return false;
        }
        qhd0 qhd0Var = (qhd0) obj;
        return this.a.equals(qhd0Var.a) && jl40.l(this.b, qhd0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Dependencies(plusAcqCommon=" + this.a + ", plusAcqPay=" + this.b + ')';
    }
}
