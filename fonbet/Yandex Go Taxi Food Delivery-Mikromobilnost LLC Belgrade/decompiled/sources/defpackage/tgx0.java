package defpackage;

import com.yandex.plus.core.graphql.type.OFFER_VENDOR_TYPE;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes2.dex */
public final class tgx0 {
    public final String a;
    public final String b;
    public final rgx0 c;
    public final String d;
    public final String e;
    public final String f;
    public final pgx0 g;
    public final Object h;
    public final ArrayList i;
    public final OFFER_VENDOR_TYPE j;
    public final Map k;

    public tgx0(String str, String str2, rgx0 rgx0Var, String str3, String str4, String str5, pgx0 pgx0Var, Object obj, ArrayList arrayList, OFFER_VENDOR_TYPE offer_vendor_type, Map map) {
        this.a = str;
        this.b = str2;
        this.c = rgx0Var;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = pgx0Var;
        this.h = obj;
        this.i = arrayList;
        this.j = offer_vendor_type;
        this.k = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tgx0)) {
            return false;
        }
        tgx0 tgx0Var = (tgx0) obj;
        return this.a.equals(tgx0Var.a) && this.b.equals(tgx0Var.b) && this.c.equals(tgx0Var.c) && jl40.l(this.d, tgx0Var.d) && jl40.l(this.e, tgx0Var.e) && jl40.l(this.f, tgx0Var.f) && this.g.equals(tgx0Var.g) && this.h.equals(tgx0Var.h) && this.i.equals(tgx0Var.i) && this.j == tgx0Var.j && jl40.l(this.k, tgx0Var.k);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c.a);
        String str = this.d;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int hashCode3 = (this.j.hashCode() + ly3.b(smw0.c((this.g.hashCode() + ((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31, 31, this.h), 31, this.i)) * 31;
        Map map = this.k;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TariffOffer(name=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", tariff=");
        sb.append(this.c);
        sb.append(", description=");
        sb.append(this.d);
        sb.append(", text=");
        sb.append(this.e);
        sb.append(", additionText=");
        sb.append(this.f);
        sb.append(", commonPrice=");
        sb.append(this.g);
        sb.append(", commonPeriod=");
        sb.append(this.h);
        sb.append(", plans=");
        sb.append(this.i);
        sb.append(", offerVendorType=");
        sb.append(this.j);
        sb.append(", payload=");
        return smw0.n(sb, this.k, ')');
    }
}
