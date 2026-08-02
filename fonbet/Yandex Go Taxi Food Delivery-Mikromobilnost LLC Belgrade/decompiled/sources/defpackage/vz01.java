package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.masstransit.geopayment.checkout.network.model.CheckoutResponse;

/* loaded from: classes6.dex */
public final class vz01 {
    public final String a;
    public final CheckoutResponse.TransportItem.TransportType b;
    public final CharSequence c;
    public final CharSequence d;
    public final aw6 e;

    public /* synthetic */ vz01(String str, CheckoutResponse.TransportItem.TransportType transportType, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? CheckoutResponse.TransportItem.TransportType.BUS : transportType, "", "", new aw6(0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vz01)) {
            return false;
        }
        vz01 vz01Var = (vz01) obj;
        return jl40.l(this.a, vz01Var.a) && this.b == vz01Var.b && jl40.l(this.c, vz01Var.c) && jl40.l(this.d, vz01Var.d) && jl40.l(this.e, vz01Var.e);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        CharSequence charSequence = this.c;
        int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.d;
        return this.e.hashCode() + ((hashCode2 + (charSequence2 != null ? charSequence2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Transport(id=");
        sb.append(this.a);
        sb.append(", transportType=");
        sb.append(this.b);
        sb.append(", title=");
        vfc.A(sb, this.c, ", subtitle=", this.d, ", trail=");
        sb.append(this.e);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    public vz01(String str, CheckoutResponse.TransportItem.TransportType transportType, CharSequence charSequence, CharSequence charSequence2, aw6 aw6Var) {
        this.a = str;
        this.b = transportType;
        this.c = charSequence;
        this.d = charSequence2;
        this.e = aw6Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public vz01() {
        this(null, 0 == true ? 1 : 0, 31);
    }
}
