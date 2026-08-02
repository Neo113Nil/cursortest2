package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes8.dex */
public final class u19 extends lea0 {
    public final String a;

    public u19(String str) {
        this.a = str;
    }

    @Override // defpackage.lea0
    public final String b() {
        return null;
    }

    @Override // defpackage.lea0
    public final PaymentMethod$Type c() {
        return PaymentMethod$Type.CASH;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u19) && jl40.l(this.a, ((u19) obj).a);
    }

    @Override // defpackage.lea0, defpackage.f731
    public final String getId() {
        return null;
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return oyr.p("CashPayment(currencyCode=", this.a, Extension.C_BRAKE);
    }
}
