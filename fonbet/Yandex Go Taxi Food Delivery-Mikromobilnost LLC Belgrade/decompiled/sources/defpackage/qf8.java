package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.payment_options.model.PaymentIconType;

/* loaded from: classes13.dex */
public final class qf8 {
    public final String a;
    public final String b;
    public final String c;
    public final PaymentIconType d;

    public qf8(String str, String str2, String str3, PaymentIconType paymentIconType) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = paymentIconType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qf8)) {
            return false;
        }
        qf8 qf8Var = (qf8) obj;
        return jl40.l(this.a, qf8Var.a) && jl40.l(this.b, qf8Var.b) && this.c.equals(qf8Var.c) && this.d == qf8Var.d;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.d.hashCode() + unr0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder v = b64.v("CardInfo(number=", this.a, ", system=", this.b, ", expDate=");
        v.append(this.c);
        v.append(", iconType=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
