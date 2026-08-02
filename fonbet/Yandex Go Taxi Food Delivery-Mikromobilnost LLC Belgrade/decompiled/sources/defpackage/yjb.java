package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.masstransit.geopayment.checkout.network.model.CheckoutResponse;

/* loaded from: classes6.dex */
public final class yjb implements zjb {
    public final CheckoutResponse a;
    public final q8j0 b;
    public final String c;
    public final boolean d;

    public yjb(CheckoutResponse checkoutResponse, q8j0 q8j0Var, String str, boolean z) {
        this.a = checkoutResponse;
        this.b = q8j0Var;
        this.c = str;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yjb)) {
            return false;
        }
        yjb yjbVar = (yjb) obj;
        return jl40.l(this.a, yjbVar.a) && jl40.l(this.b, yjbVar.b) && jl40.l(this.c, yjbVar.c) && this.d == yjbVar.d;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return Boolean.hashCode(this.d) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuccessPaymentCheckout(data=");
        sb.append(this.a);
        sb.append(", requestState=");
        sb.append(this.b);
        sb.append(", requestId=");
        return nnm.i(this.c, ", isLoading=", Extension.C_BRAKE, sb, this.d);
    }
}
