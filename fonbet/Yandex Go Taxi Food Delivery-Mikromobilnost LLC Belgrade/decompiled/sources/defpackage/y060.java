package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class y060 extends a160 {
    public final x060 a;
    public final v060 b;

    public y060(x060 x060Var, v060 v060Var) {
        this.a = x060Var;
        this.b = v060Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y060)) {
            return false;
        }
        y060 y060Var = (y060) obj;
        return jl40.l(this.a, y060Var.a) && this.b.equals(y060Var.b);
    }

    public final int hashCode() {
        x060 x060Var = this.a;
        return this.b.hashCode() + ((x060Var == null ? 0 : x060Var.hashCode()) * 31);
    }

    public final String toString() {
        return "NoInternet(info=" + this.a + ", reason=" + this.b + Extension.C_BRAKE;
    }
}
