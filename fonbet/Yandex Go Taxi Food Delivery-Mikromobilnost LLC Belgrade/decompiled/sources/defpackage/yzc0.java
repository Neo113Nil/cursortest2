package defpackage;

/* loaded from: classes8.dex */
public final class yzc0 {
    public final oo2 a;
    public final c0d0 b;
    public final b5d0 c;

    public yzc0(oo2 oo2Var, c0d0 c0d0Var, b5d0 b5d0Var) {
        this.a = oo2Var;
        this.b = c0d0Var;
        this.c = b5d0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof yzc0) {
            yzc0 yzc0Var = (yzc0) obj;
            if (this.a == yzc0Var.a && jl40.l(this.b, yzc0Var.b) && jl40.l(this.c, yzc0Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Dependencies(plusAcqCommon=" + this.a + ", plusAcqPay=" + this.b + ", imageLoader=" + this.c + ')';
    }
}
