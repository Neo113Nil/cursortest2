package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.eats_orders.domain.entities.order.status.EatsOrderStatus;

/* loaded from: classes5.dex */
public final class ren {
    public final String a;
    public final h1p b;
    public final EatsOrderStatus c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final ten k;
    public final zzs l;
    public final String m;
    public final zzs n;
    public final String o;
    public final Integer p;
    public final nfn q;
    public final ffn r;
    public final pen s;
    public final List t;
    public final oen u;

    public ren(String str, h1p h1pVar, EatsOrderStatus eatsOrderStatus, String str2, String str3, String str4, String str5, String str6, String str7, String str8, ten tenVar, zzs zzsVar, String str9, zzs zzsVar2, String str10, Integer num, nfn nfnVar, ffn ffnVar, pen penVar, List list, oen oenVar) {
        this.a = str;
        this.b = h1pVar;
        this.c = eatsOrderStatus;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = tenVar;
        this.l = zzsVar;
        this.m = str9;
        this.n = zzsVar2;
        this.o = str10;
        this.p = num;
        this.q = nfnVar;
        this.r = ffnVar;
        this.s = penVar;
        this.t = list;
        this.u = oenVar;
    }

    public final oen a() {
        return this.u;
    }

    public final List b() {
        return this.t;
    }

    public final String c() {
        return this.e;
    }

    public final String d() {
        return this.g;
    }

    public final zzs e() {
        return this.n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ren)) {
            return false;
        }
        ren renVar = (ren) obj;
        return jl40.l(this.a, renVar.a) && jl40.l(this.b, renVar.b) && this.c == renVar.c && jl40.l(this.d, renVar.d) && jl40.l(this.e, renVar.e) && jl40.l(this.f, renVar.f) && jl40.l(this.g, renVar.g) && jl40.l(this.h, renVar.h) && jl40.l(this.i, renVar.i) && jl40.l(this.j, renVar.j) && jl40.l(this.k, renVar.k) && jl40.l(this.l, renVar.l) && jl40.l(this.m, renVar.m) && jl40.l(this.n, renVar.n) && jl40.l(this.o, renVar.o) && jl40.l(this.p, renVar.p) && jl40.l(this.q, renVar.q) && jl40.l(this.r, renVar.r) && jl40.l(this.s, renVar.s) && this.t.equals(renVar.t) && jl40.l(this.u, renVar.u);
    }

    public final ffn f() {
        return this.r;
    }

    public final String g() {
        return this.a;
    }

    public final String h() {
        return this.h;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        String str = this.d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.h;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.i;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.j;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        ten tenVar = this.k;
        int hashCode9 = (hashCode8 + (tenVar == null ? 0 : tenVar.hashCode())) * 31;
        zzs zzsVar = this.l;
        int hashCode10 = (hashCode9 + (zzsVar == null ? 0 : zzsVar.hashCode())) * 31;
        String str8 = this.m;
        int hashCode11 = (hashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        zzs zzsVar2 = this.n;
        int hashCode12 = (hashCode11 + (zzsVar2 == null ? 0 : zzsVar2.hashCode())) * 31;
        String str9 = this.o;
        int hashCode13 = (hashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Integer num = this.p;
        int hashCode14 = (hashCode13 + (num == null ? 0 : num.hashCode())) * 31;
        nfn nfnVar = this.q;
        int hashCode15 = (hashCode14 + (nfnVar == null ? 0 : nfnVar.hashCode())) * 31;
        ffn ffnVar = this.r;
        int hashCode16 = (hashCode15 + (ffnVar == null ? 0 : ffnVar.hashCode())) * 31;
        pen penVar = this.s;
        int c = unr0.c((hashCode16 + (penVar == null ? 0 : penVar.hashCode())) * 31, 31, this.t);
        oen oenVar = this.u;
        return c + (oenVar != null ? oenVar.a.hashCode() : 0);
    }

    public final String i() {
        return this.i;
    }

    public final String j() {
        return this.j;
    }

    public final String k() {
        return this.d;
    }

    public final zzs l() {
        return this.l;
    }

    public final h1p m() {
        return this.b;
    }

    public final EatsOrderStatus n() {
        return this.c;
    }

    public final nfn o() {
        return this.q;
    }

    public final String p() {
        return this.f;
    }

    public final pen q() {
        return this.s;
    }

    public final boolean r() {
        return (this.l == null && this.k == null && this.n == null) ? false : true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EatsOrder(id=");
        sb.append(this.a);
        sb.append(", service=");
        sb.append(this.b);
        sb.append(", status=");
        sb.append(this.c);
        sb.append(", rawStatus=");
        sb.append(this.d);
        sb.append(", deliveryDatetime=");
        g8e.D(sb, this.e, ", title=", this.f, ", description=");
        g8e.D(sb, this.g, ", imageTag=", this.h, ", imageUrl=");
        g8e.D(sb, this.i, ", overlayImageUrl=", this.j, ", courier=");
        sb.append(this.k);
        sb.append(", restaurant=");
        sb.append(this.l);
        sb.append(", restaurantIconTag=");
        sb.append(this.m);
        sb.append(", destination=");
        sb.append(this.n);
        sb.append(", destinationIconTag=");
        vfc.w(this.p, this.o, ", eta=", ", timeline=", sb);
        sb.append(this.q);
        sb.append(", header=");
        sb.append(this.r);
        sb.append(", trailButton=");
        sb.append(this.s);
        sb.append(", buttons=");
        sb.append(this.t);
        sb.append(", action=");
        sb.append(this.u);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
