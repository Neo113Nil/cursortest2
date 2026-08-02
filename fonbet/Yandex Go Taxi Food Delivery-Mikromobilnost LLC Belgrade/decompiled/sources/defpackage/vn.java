package defpackage;

import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class vn extends nr implements tv7 {
    public final String a;
    public final String b;
    public final zi8 c;
    public final Map d;
    public final String e;
    public final boolean f;
    public final String g;
    public final String h;
    public final cw i;
    public final String j;
    public final String k;

    public vn(String str, String str2, zi8 zi8Var, Map map, String str3, boolean z, String str4, String str5, cw cwVar, String str6, String str7) {
        this.a = str;
        this.b = str2;
        this.c = zi8Var;
        this.d = map;
        this.e = str3;
        this.f = z;
        this.g = str4;
        this.h = str5;
        this.i = cwVar;
        this.j = str6;
        this.k = str7;
    }

    @Override // defpackage.nr
    public final String a() {
        return this.j;
    }

    @Override // defpackage.nr
    public final String b() {
        return this.k;
    }

    @Override // defpackage.nr
    public final String c() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vn)) {
            return false;
        }
        vn vnVar = (vn) obj;
        return jl40.l(this.a, vnVar.a) && jl40.l(this.b, vnVar.b) && this.c.equals(vnVar.c) && jl40.l(this.d, vnVar.d) && jl40.l(this.e, vnVar.e) && this.f == vnVar.f && jl40.l(this.g, vnVar.g) && jl40.l(this.h, vnVar.h) && jl40.l(this.i, vnVar.i) && jl40.l(this.j, vnVar.j) && jl40.l(this.k, vnVar.k);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        Map map = this.d;
        int hashCode3 = (hashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        String str2 = this.e;
        int e = unr0.e((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f);
        String str3 = this.g;
        int hashCode4 = (e + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.h;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        cw cwVar = this.i;
        int hashCode6 = (hashCode5 + (cwVar == null ? 0 : cwVar.hashCode())) * 31;
        String str5 = this.j;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.k;
        return hashCode7 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("ActionOpenForm(mode=", this.a, ", scenario=", this.b, ", cardMode=");
        v.append(this.c);
        v.append(", state=");
        v.append(this.d);
        v.append(", taskId=");
        tse0.y(this.e, ", shouldCacheState=", ", title=", v, this.f);
        g8e.D(v, this.g, ", badgeText=", this.h, ", actionGuardPolicy=");
        v.append(this.i);
        v.append(", imageTag=");
        v.append(this.j);
        v.append(", metricaLabel=");
        return oyr.t(v, this.k, Extension.C_BRAKE);
    }
}
