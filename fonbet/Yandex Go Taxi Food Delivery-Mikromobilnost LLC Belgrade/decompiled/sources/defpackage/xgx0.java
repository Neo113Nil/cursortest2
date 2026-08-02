package defpackage;

import java.util.Map;

/* loaded from: classes2.dex */
public final class xgx0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Map e;
    public final Map f;
    public final String g;
    public final wgx0 h;
    public final ugx0 i;
    public final vgx0 j;

    public xgx0(String str, String str2, String str3, String str4, Map map, Map map2, String str5, wgx0 wgx0Var, ugx0 ugx0Var, vgx0 vgx0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = map;
        this.f = map2;
        this.g = str5;
        this.h = wgx0Var;
        this.i = ugx0Var;
        this.j = vgx0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xgx0)) {
            return false;
        }
        xgx0 xgx0Var = (xgx0) obj;
        return this.a.equals(xgx0Var.a) && jl40.l(this.b, xgx0Var.b) && jl40.l(this.c, xgx0Var.c) && jl40.l(this.d, xgx0Var.d) && jl40.l(this.e, xgx0Var.e) && this.f.equals(xgx0Var.f) && this.g.equals(xgx0Var.g) && this.h.equals(xgx0Var.h) && jl40.l(this.i, xgx0Var.i) && jl40.l(this.j, xgx0Var.j);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Map map = this.e;
        int b = unr0.b(unr0.b(unr0.d((hashCode4 + (map == null ? 0 : map.hashCode())) * 31, 31, this.f), 31, this.g), 31, this.h.a);
        ugx0 ugx0Var = this.i;
        int hashCode5 = (b + (ugx0Var == null ? 0 : ugx0Var.hashCode())) * 31;
        vgx0 vgx0Var = this.j;
        return hashCode5 + (vgx0Var != null ? vgx0Var.hashCode() : 0);
    }

    public final String toString() {
        return "TariffOfferDetails(title=" + this.a + ", text=" + this.b + ", description=" + this.c + ", additionText=" + this.d + ", payload=" + this.e + ", image=" + this.f + ", offerName=" + this.g + ", tariff=" + this.h + ", backgroundTv=" + this.i + ", storePurchaseInfo=" + this.j + ')';
    }
}
