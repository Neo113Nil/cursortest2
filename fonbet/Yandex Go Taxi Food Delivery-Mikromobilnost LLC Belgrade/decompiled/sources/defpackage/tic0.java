package defpackage;

/* loaded from: classes2.dex */
public final class tic0 {
    public final sic0 a;
    public final ric0 b;
    public final nic0 c;

    public tic0(sic0 sic0Var, ric0 ric0Var, nic0 nic0Var) {
        this.a = sic0Var;
        this.b = ric0Var;
        this.c = nic0Var;
    }

    public final nic0 a() {
        return this.c;
    }

    public final ric0 b() {
        return this.b;
    }

    public final sic0 c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tic0)) {
            return false;
        }
        tic0 tic0Var = (tic0) obj;
        return jl40.l(this.a, tic0Var.a) && jl40.l(this.b, tic0Var.b) && this.c.equals(tic0Var.c);
    }

    public final int hashCode() {
        sic0 sic0Var = this.a;
        int hashCode = (sic0Var == null ? 0 : sic0Var.a.hashCode()) * 31;
        ric0 ric0Var = this.b;
        return this.c.a.hashCode() + ((hashCode + (ric0Var != null ? ric0Var.a.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "PlaqueBalanceWidget(title=" + this.a + ", subtitle=" + this.b + ", balance=" + this.c + ')';
    }
}
