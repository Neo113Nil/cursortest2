package defpackage;

import com.yandex.go.preorder.source.altpins.Alternatives;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class yu1 implements wu1 {
    public final String a;
    public final Alternatives.AlternativePaymentMethod b;

    public yu1(String str, Alternatives.AlternativePaymentMethod alternativePaymentMethod) {
        this.a = str;
        this.b = alternativePaymentMethod;
    }

    @Override // defpackage.wu1
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yu1)) {
            return false;
        }
        yu1 yu1Var = (yu1) obj;
        return jl40.l(this.a, yu1Var.a) && jl40.l(this.b, yu1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AltPaymentMethodOptionGroup(alternativeType=" + this.a + ", paymentMethod=" + this.b + Extension.C_BRAKE;
    }
}
