package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes13.dex */
public final class xea0 {
    public final PaymentMethod$Type a;
    public final String b;

    public xea0(String str, PaymentMethod$Type paymentMethod$Type) {
        this.a = paymentMethod$Type;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xea0)) {
            return false;
        }
        xea0 xea0Var = (xea0) obj;
        return this.a == xea0Var.a && jl40.l(this.b, xea0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PaymentNameSearchParams(paymentType=" + this.a + ", paymentId=" + this.b + Extension.C_BRAKE;
    }
}
