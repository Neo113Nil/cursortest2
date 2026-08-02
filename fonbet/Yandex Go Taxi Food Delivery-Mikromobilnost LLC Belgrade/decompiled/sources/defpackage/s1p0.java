package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class s1p0 {
    public final r1p0 a;
    public final q1p0 b;
    public final n1p0 c;
    public final o1p0 d;
    public final boolean e;

    public s1p0(r1p0 r1p0Var, q1p0 q1p0Var, n1p0 n1p0Var, o1p0 o1p0Var, boolean z) {
        this.a = r1p0Var;
        this.b = q1p0Var;
        this.c = n1p0Var;
        this.d = o1p0Var;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s1p0)) {
            return false;
        }
        s1p0 s1p0Var = (s1p0) obj;
        return jl40.l(this.a, s1p0Var.a) && jl40.l(this.b, s1p0Var.b) && jl40.l(this.c, s1p0Var.c) && jl40.l(this.d, s1p0Var.d) && this.e == s1p0Var.e;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        q1p0 q1p0Var = this.b;
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (q1p0Var == null ? 0 : q1p0Var.a.hashCode())) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScootersSuperPassesPurchaseUiState(title=");
        sb.append(this.a);
        sb.append(", termsGroup=");
        sb.append(this.b);
        sb.append(", passesGroup=");
        sb.append(this.c);
        sb.append(", paymentMethodItem=");
        sb.append(this.d);
        sb.append(", inProgress=");
        return x4e.i(sb, this.e, Extension.C_BRAKE);
    }
}
