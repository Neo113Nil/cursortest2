package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.masstransit.geopayment.checkout.network.model.CheckoutResponse;

/* loaded from: classes6.dex */
public final class ujb implements zjb {
    public final CheckoutResponse a;
    public final q8j0 b;
    public final String c;

    public ujb(CheckoutResponse checkoutResponse, q8j0 q8j0Var, String str) {
        this.a = checkoutResponse;
        this.b = q8j0Var;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ujb)) {
            return false;
        }
        ujb ujbVar = (ujb) obj;
        return this.a.equals(ujbVar.a) && this.b.equals(ujbVar.b) && jl40.l(this.c, ujbVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChooseDirection(data=");
        sb.append(this.a);
        sb.append(", requestState=");
        sb.append(this.b);
        sb.append(", requestId=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
