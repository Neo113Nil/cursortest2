package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class uda0 {
    public final List a;
    public final List b;

    public uda0(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uda0)) {
            return false;
        }
        uda0 uda0Var = (uda0) obj;
        return this.a.equals(uda0Var.a) && this.b.equals(uda0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.l("PaymentMethodsWithButtonsEntity(paymentMethods=", this.a, ", buttons=", this.b, Extension.C_BRAKE);
    }
}
