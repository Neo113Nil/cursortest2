package defpackage;

import java.util.List;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import yads.w4;

/* loaded from: classes7.dex */
public final class qb71 {
    public final List a;
    public final List b;
    public final List c;
    public final w4 d;
    public final Map e;
    public final List f;
    public final List g;
    public final String h;
    public final ak81 i;
    public final bx81 j;

    public qb71(List list, List list2, List list3, w4 w4Var, Map map, List list4, List list5, String str, ak81 ak81Var, bx81 bx81Var) {
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = w4Var;
        this.e = map;
        this.f = list4;
        this.g = list5;
        this.h = str;
        this.i = ak81Var;
        this.j = bx81Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qb71)) {
            return false;
        }
        qb71 qb71Var = (qb71) obj;
        return this.a.equals(qb71Var.a) && this.b.equals(qb71Var.b) && this.c.equals(qb71Var.c) && jl40.l(this.d, qb71Var.d) && this.e.equals(qb71Var.e) && this.f.equals(qb71Var.f) && this.g.equals(qb71Var.g) && jl40.l(this.h, qb71Var.h) && jl40.l(this.i, qb71Var.i) && jl40.l(this.j, qb71Var.j);
    }

    public final int hashCode() {
        int c = unr0.c(unr0.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        w4 w4Var = this.d;
        int c2 = unr0.c(unr0.c(unr0.d((c + (w4Var == null ? 0 : w4Var.b.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g);
        String str = this.h;
        int hashCode = (c2 + (str == null ? 0 : str.hashCode())) * 31;
        ak81 ak81Var = this.i;
        int hashCode2 = (hashCode + (ak81Var == null ? 0 : ak81Var.hashCode())) * 31;
        bx81 bx81Var = this.j;
        return hashCode2 + (bx81Var != null ? bx81Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = qv10.v("NativeAdResponse(nativeAds=", this.a, ", assets=", this.b, ", renderTrackingUrls=");
        v.append(this.c);
        v.append(", impressionData=");
        v.append(this.d);
        v.append(", properties=");
        v.append(this.e);
        v.append(", divKitDesigns=");
        v.append(this.f);
        v.append(", showNotices=");
        oyr.D(", version=", this.h, ", settings=", v, this.g);
        v.append(this.i);
        v.append(", adPod=");
        v.append(this.j);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
