package defpackage;

import com.yandex.delivery.mapper.model.PointType;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.PointVisitStatusDto;

/* loaded from: classes5.dex */
public final class wqi implements xqi {
    public final String a;
    public final boolean b;
    public final PointVisitStatusDto c;
    public final PointType d;
    public final String e;
    public final doe f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final cqi n;
    public final String o;
    public final mm91 p;
    public final List q;

    public wqi(String str, boolean z, PointVisitStatusDto pointVisitStatusDto, PointType pointType, String str2, doe doeVar, String str3, String str4, String str5, String str6, String str7, String str8, String str9, cqi cqiVar, String str10, mm91 mm91Var, List list) {
        this.a = str;
        this.b = z;
        this.c = pointVisitStatusDto;
        this.d = pointType;
        this.e = str2;
        this.f = doeVar;
        this.g = str3;
        this.h = str4;
        this.i = str5;
        this.j = str6;
        this.k = str7;
        this.l = str8;
        this.m = str9;
        this.n = cqiVar;
        this.o = str10;
        this.p = mm91Var;
        this.q = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wqi)) {
            return false;
        }
        wqi wqiVar = (wqi) obj;
        return jl40.l(this.a, wqiVar.a) && this.b == wqiVar.b && this.c == wqiVar.c && this.d == wqiVar.d && jl40.l(this.e, wqiVar.e) && this.f.equals(wqiVar.f) && jl40.l(this.g, wqiVar.g) && jl40.l(this.h, wqiVar.h) && jl40.l(this.i, wqiVar.i) && jl40.l(this.j, wqiVar.j) && jl40.l(this.k, wqiVar.k) && jl40.l(this.l, wqiVar.l) && jl40.l(this.m, wqiVar.m) && jl40.l(this.n, wqiVar.n) && jl40.l(this.o, wqiVar.o) && this.p.equals(wqiVar.p) && this.q.equals(wqiVar.q);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(unr0.b((this.f.hashCode() + unr0.b((this.d.hashCode() + ((this.c.hashCode() + unr0.e(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31, 31, this.e)) * 31, 31, this.g), 31, this.h), 31, this.i);
        String str = this.j;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.k;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.l;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.m;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        cqi cqiVar = this.n;
        int hashCode5 = (hashCode4 + (cqiVar == null ? 0 : cqiVar.hashCode())) * 31;
        String str5 = this.o;
        return this.q.hashCode() + ((this.p.hashCode() + ((hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder l = oo31.l("OrderPoint(pointId=", this.a, ", isActive=", ", visitStatus=", this.b);
        l.append(this.c);
        l.append(", type=");
        l.append(this.d);
        l.append(", uri=");
        l.append(this.e);
        l.append(", coordinates=");
        l.append(this.f);
        l.append(", fullText=");
        g8e.D(l, this.g, ", shortText=", this.h, ", areaDescription=");
        g8e.D(l, this.i, ", entrance=", this.j, ", floor=");
        g8e.D(l, this.k, ", room=", this.l, ", code=");
        l.append(this.m);
        l.append(", contact=");
        l.append(this.n);
        l.append(", comment=");
        l.append(this.o);
        l.append(", pinModel=");
        l.append(this.p);
        l.append(", commentImages=");
        return ly3.s(l, this.q, Extension.C_BRAKE);
    }
}
