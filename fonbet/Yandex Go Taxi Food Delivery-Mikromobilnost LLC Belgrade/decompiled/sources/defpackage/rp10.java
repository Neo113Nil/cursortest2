package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class rp10 {
    public final List a;
    public final List b;
    public final String c;
    public final List d;
    public final List e;

    public rp10(List list, List list2, List list3, String str, List list4) {
        this.a = list;
        this.b = list2;
        this.c = str;
        this.d = list3;
        this.e = list4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rp10)) {
            return false;
        }
        rp10 rp10Var = (rp10) obj;
        return jl40.l(this.a, rp10Var.a) && jl40.l(this.b, rp10Var.b) && jl40.l(this.c, rp10Var.c) && jl40.l(this.d, rp10Var.d) && jl40.l(this.e, rp10Var.e);
    }

    public final int hashCode() {
        List list = this.a;
        int c = unr0.c((list == null ? 0 : list.hashCode()) * 31, 31, this.b);
        String str = this.c;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        List list2 = this.d;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.e;
        return hashCode2 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = qv10.v("MerchantOffersScreenEntity(banners=", this.a, ", screenItems=", this.b, ", mlRequestId=");
        tse0.x(this.c, ", remainingOfferIds=", ", fullScreens=", v, this.d);
        return ly3.s(v, this.e, Extension.C_BRAKE);
    }
}
