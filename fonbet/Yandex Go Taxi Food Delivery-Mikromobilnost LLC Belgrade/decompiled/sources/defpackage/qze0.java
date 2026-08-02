package defpackage;

import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class qze0 {
    public final String a;
    public final Double b;
    public final fef c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final boolean h;
    public final Map i;
    public final String j;
    public final tpj0 k;
    public final wlq0 l;
    public final zcx0 m;
    public final dg31 n;
    public final fpw o;
    public final v0f0 p;

    public qze0(String str, Double d, fef fefVar, String str2, String str3, String str4, String str5, boolean z, Map map, String str6, tpj0 tpj0Var, wlq0 wlq0Var, zcx0 zcx0Var, dg31 dg31Var, fpw fpwVar, v0f0 v0f0Var) {
        this.a = str;
        this.b = d;
        this.c = fefVar;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = z;
        this.i = map;
        this.j = str6;
        this.k = tpj0Var;
        this.l = wlq0Var;
        this.m = zcx0Var;
        this.n = dg31Var;
        this.o = fpwVar;
        this.p = v0f0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qze0)) {
            return false;
        }
        qze0 qze0Var = (qze0) obj;
        return jl40.l(this.a, qze0Var.a) && jl40.l(this.b, qze0Var.b) && jl40.l(this.c, qze0Var.c) && jl40.l(this.d, qze0Var.d) && jl40.l(this.e, qze0Var.e) && jl40.l(this.f, qze0Var.f) && jl40.l(this.g, qze0Var.g) && this.h == qze0Var.h && this.i.equals(qze0Var.i) && jl40.l(this.j, qze0Var.j) && this.k.equals(qze0Var.k) && jl40.l(this.l, qze0Var.l) && jl40.l(this.m, qze0Var.m) && jl40.l(this.n, qze0Var.n) && jl40.l(this.o, qze0Var.o) && jl40.l(this.p, qze0Var.p);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Double d = this.b;
        int d2 = unr0.d(unr0.e(unr0.b(unr0.b(unr0.b(unr0.b((this.c.hashCode() + ((hashCode + (d == null ? 0 : d.hashCode())) * 31)) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
        String str = this.j;
        int d3 = unr0.d((d2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.k.a);
        wlq0 wlq0Var = this.l;
        int hashCode2 = (d3 + (wlq0Var == null ? 0 : wlq0Var.hashCode())) * 31;
        zcx0 zcx0Var = this.m;
        int hashCode3 = (hashCode2 + (zcx0Var == null ? 0 : zcx0Var.hashCode())) * 31;
        dg31 dg31Var = this.n;
        int hashCode4 = (hashCode3 + (dg31Var == null ? 0 : dg31Var.hashCode())) * 31;
        fpw fpwVar = this.o;
        int hashCode5 = (hashCode4 + (fpwVar == null ? 0 : fpwVar.hashCode())) * 31;
        v0f0 v0f0Var = this.p;
        return hashCode5 + (v0f0Var != null ? v0f0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PriceInfo(price=");
        sb.append(this.a);
        sb.append(", maxPriceAsDecimal=");
        sb.append(this.b);
        sb.append(", currencyRules=");
        sb.append(this.c);
        sb.append(", originalPrice=");
        sb.append(this.d);
        sb.append(", cleanOriginalPrice=");
        g8e.D(sb, this.e, ", priceDetailed=", this.f, ", priceOnSelect=");
        tse0.y(this.g, ", showPriceWhileUnavailable=", ", selectorHighlights=", sb, this.h);
        sb.append(this.i);
        sb.append(", additionalPriceIcon=");
        sb.append(this.j);
        sb.append(", requirements=");
        sb.append(this.k);
        sb.append(", selectorPriceUi=");
        sb.append(this.l);
        sb.append(", tariffCardPriceUi=");
        sb.append(this.m);
        sb.append(", verticalSelectorPriceUi=");
        sb.append(this.n);
        sb.append(", intercitySelectorPriceUi=");
        sb.append(this.o);
        sb.append(", multiclassTariffCardPriceUi=");
        sb.append(this.p);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
