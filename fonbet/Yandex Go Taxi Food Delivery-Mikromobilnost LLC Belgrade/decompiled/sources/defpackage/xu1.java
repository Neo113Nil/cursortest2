package defpackage;

import com.yandex.go.preorder.source.altpins.Alternatives;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class xu1 implements ex1 {
    public final pex0 a;
    public final Alternatives.AlternativePaymentMethod b;
    public final String c;

    public xu1(pex0 pex0Var, Alternatives.AlternativePaymentMethod alternativePaymentMethod, String str) {
        this.a = pex0Var;
        this.b = alternativePaymentMethod;
        this.c = str;
    }

    @Override // defpackage.ex1
    public final pex0 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xu1)) {
            return false;
        }
        xu1 xu1Var = (xu1) obj;
        return this.a.equals(xu1Var.a) && jl40.l(this.b, xu1Var.b) && this.c.equals(xu1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AltPaymentMethodOption(tariff=");
        sb.append(this.a);
        sb.append(", alternativePaymentMethod=");
        sb.append(this.b);
        sb.append(", contentDescription=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
