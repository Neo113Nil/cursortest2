package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class qzr {
    public final q1a0 a;
    public final dj70 b;
    public final phx0 c;

    public qzr(q1a0 q1a0Var, dj70 dj70Var, phx0 phx0Var) {
        this.a = q1a0Var;
        this.b = dj70Var;
        this.c = phx0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qzr)) {
            return false;
        }
        qzr qzrVar = (qzr) obj;
        return jl40.l(this.a, qzrVar.a) && jl40.l(this.b, qzrVar.b) && jl40.l(this.c, qzrVar.c);
    }

    public final int hashCode() {
        q1a0 q1a0Var = this.a;
        int hashCode = (this.b.hashCode() + ((q1a0Var == null ? 0 : q1a0Var.hashCode()) * 31)) * 31;
        phx0 phx0Var = this.c;
        return hashCode + (phx0Var != null ? phx0Var.hashCode() : 0);
    }

    public final String toString() {
        return "FooterButtonsUiState(paymentInfoButtonUiState=" + this.a + ", orderButtonUiState=" + this.b + ", tariffOptionsButtonUiState=" + this.c + Extension.C_BRAKE;
    }
}
