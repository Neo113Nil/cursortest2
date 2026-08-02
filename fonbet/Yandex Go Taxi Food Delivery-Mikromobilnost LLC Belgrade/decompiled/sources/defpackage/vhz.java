package defpackage;

import java.util.List;
import java.util.UUID;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class vhz {
    public final String a;
    public final String b;
    public final UUID c;
    public final String d;
    public final String e;
    public final khz f;
    public final zhz g;
    public final vwa0 h;
    public final oxa0 i;
    public final List j;
    public final List k;
    public final ihz l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final List q;
    public final String r;

    public vhz(String str, String str2, UUID uuid, String str3, String str4, khz khzVar, zhz zhzVar, vwa0 vwa0Var, oxa0 oxa0Var, List list, List list2, ihz ihzVar, boolean z, boolean z2, boolean z3, boolean z4, List list3) {
        this.a = str;
        this.b = str2;
        this.c = uuid;
        this.d = str3;
        this.e = str4;
        this.f = khzVar;
        this.g = zhzVar;
        this.h = vwa0Var;
        this.i = oxa0Var;
        this.j = list;
        this.k = list2;
        this.l = ihzVar;
        this.m = z;
        this.n = z2;
        this.o = z3;
        this.p = z4;
        this.q = list3;
        if (str == null) {
            if (str2 != null) {
                str = "logistics_preorder/".concat(str2);
            } else if (uuid != null) {
                str = "logistics_preorder/" + uuid;
            } else {
                str = "unknown_id";
            }
        }
        this.r = str;
    }

    public final List a() {
        return this.k;
    }

    public final khz b() {
        return this.f;
    }

    public final ihz c() {
        return this.l;
    }

    public final List d() {
        return this.j;
    }

    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vhz)) {
            return false;
        }
        vhz vhzVar = (vhz) obj;
        return jl40.l(this.a, vhzVar.a) && jl40.l(this.b, vhzVar.b) && jl40.l(this.c, vhzVar.c) && jl40.l(this.d, vhzVar.d) && jl40.l(this.e, vhzVar.e) && jl40.l(this.f, vhzVar.f) && jl40.l(this.g, vhzVar.g) && jl40.l(this.h, vhzVar.h) && jl40.l(this.i, vhzVar.i) && jl40.l(this.j, vhzVar.j) && jl40.l(this.k, vhzVar.k) && jl40.l(this.l, vhzVar.l) && this.m == vhzVar.m && this.n == vhzVar.n && this.o == vhzVar.o && this.p == vhzVar.p && jl40.l(this.q, vhzVar.q);
    }

    public final boolean f() {
        return this.m;
    }

    public final zhz g() {
        return this.g;
    }

    public final UUID h() {
        return this.c;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        UUID uuid = this.c;
        int b = unr0.b((hashCode2 + (uuid == null ? 0 : uuid.hashCode())) * 31, 31, this.d);
        String str3 = this.e;
        int hashCode3 = (b + (str3 == null ? 0 : str3.hashCode())) * 31;
        khz khzVar = this.f;
        int hashCode4 = (hashCode3 + (khzVar == null ? 0 : khzVar.a.hashCode())) * 31;
        zhz zhzVar = this.g;
        int hashCode5 = (hashCode4 + (zhzVar == null ? 0 : zhzVar.hashCode())) * 31;
        vwa0 vwa0Var = this.h;
        int hashCode6 = (hashCode5 + (vwa0Var == null ? 0 : vwa0Var.hashCode())) * 31;
        oxa0 oxa0Var = this.i;
        int c = unr0.c(unr0.c((hashCode6 + (oxa0Var == null ? 0 : oxa0Var.hashCode())) * 31, 31, this.j), 31, this.k);
        ihz ihzVar = this.l;
        return this.q.hashCode() + unr0.e(unr0.e(unr0.e(unr0.e((c + (ihzVar != null ? ihzVar.hashCode() : 0)) * 31, 31, this.m), 31, this.n), 31, this.o), 31, this.p);
    }

    public final String i() {
        return this.r;
    }

    public final String j() {
        return this.b;
    }

    public final vwa0 k() {
        return this.h;
    }

    public final oxa0 l() {
        return this.i;
    }

    public final String m() {
        return this.e;
    }

    public final String n() {
        return this.d;
    }

    public final boolean o() {
        return this.o;
    }

    public final boolean p() {
        return this.n;
    }

    public final boolean q() {
        return this.p;
    }

    public final String toString() {
        StringBuilder v = b64.v("LogisticsOrder(deliveryId=", this.a, ", originalOrderId=", this.b, ", localUuid=");
        v.append(this.c);
        v.append(", title=");
        v.append(this.d);
        v.append(", subtitle=");
        v.append(this.e);
        v.append(", adsOnMapData=");
        v.append(this.f);
        v.append(", image=");
        v.append(this.g);
        v.append(", performer=");
        v.append(this.h);
        v.append(", performerSearch=");
        v.append(this.i);
        v.append(", cardBottomSections=");
        v.append(this.j);
        v.append(", actions=");
        v.append(this.k);
        v.append(", analyticsData=");
        v.append(this.l);
        v.append(", hasOngoingCall=");
        nnm.v(", isCompleted=", ", isCancelling=", v, this.m, this.n);
        nnm.v(", isStub=", ", displayTargets=", v, this.o, this.p);
        return ly3.s(v, this.q, Extension.C_BRAKE);
    }
}
