package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class u7k0 {
    public final l7k0 a;
    public final l7k0 b;
    public final t7k0 c;
    public final m7k0 d;
    public final r7k0 e;
    public final s7k0 f;
    public final n7k0 g;

    public u7k0(l7k0 l7k0Var, l7k0 l7k0Var2, t7k0 t7k0Var, m7k0 m7k0Var, r7k0 r7k0Var, s7k0 s7k0Var, n7k0 n7k0Var) {
        this.a = l7k0Var;
        this.b = l7k0Var2;
        this.c = t7k0Var;
        this.d = m7k0Var;
        this.e = r7k0Var;
        this.f = s7k0Var;
        this.g = n7k0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u7k0)) {
            return false;
        }
        u7k0 u7k0Var = (u7k0) obj;
        return jl40.l(this.a, u7k0Var.a) && jl40.l(this.b, u7k0Var.b) && jl40.l(this.c, u7k0Var.c) && jl40.l(this.d, u7k0Var.d) && jl40.l(this.e, u7k0Var.e) && jl40.l(this.f, u7k0Var.f) && jl40.l(this.g, u7k0Var.g);
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        n7k0 n7k0Var = this.g;
        return hashCode + (n7k0Var == null ? 0 : n7k0Var.hashCode());
    }

    public final String toString() {
        return "RidaSummaryUiState(sourceAddress=" + this.a + ", destinationAddress=" + this.b + ", priceSelector=" + this.c + ", autoAcceptSwitch=" + this.d + ", orderButtonUiState=" + this.e + ", paymentButtonUiState=" + this.f + ", mapActionButtonUiState=" + this.g + Extension.C_BRAKE;
    }
}
