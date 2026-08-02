package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class yi5 implements m1j {
    public final String a;
    public final String b;
    public final obm c;
    public final v1u d;
    public final k911 e;
    public final String f;
    public final String g;
    public final h911 h;
    public final String i;

    public yi5(String str, String str2, obm obmVar, v1u v1uVar, k911 k911Var, String str3, String str4, h911 h911Var, String str5) {
        this.a = str;
        this.b = str2;
        this.c = obmVar;
        this.d = v1uVar;
        this.e = k911Var;
        this.f = str3;
        this.g = str4;
        this.h = h911Var;
        this.i = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yi5)) {
            return false;
        }
        yi5 yi5Var = (yi5) obj;
        return this.a.equals(yi5Var.a) && jl40.l(this.b, yi5Var.b) && jl40.l(this.c, yi5Var.c) && this.d.equals(yi5Var.d) && jl40.l(this.e, yi5Var.e) && this.f.equals(yi5Var.f) && this.g.equals(yi5Var.g) && this.h.equals(yi5Var.h) && jl40.l(this.i, yi5Var.i);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.i;
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        obm obmVar = this.c;
        return this.i.hashCode() + ((this.h.hashCode() + unr0.b(unr0.b(smw0.e(this.e, (this.d.hashCode() + ((b + (obmVar == null ? 0 : obmVar.a.hashCode())) * 31)) * 31, 31), 31, this.f), 31, this.g)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("BeginGroundSectionItem(title=", this.a, ", time=", this.b, ", icon=");
        v.append(this.c);
        v.append(", subtitleState=");
        v.append(this.d);
        v.append(", prevTransportType=");
        v.append(this.e);
        v.append(", contentDescription=");
        v.append(this.f);
        v.append(", v2ContentDescription=");
        v.append(this.g);
        v.append(", transportType=");
        v.append(this.h);
        v.append(", id=");
        return oyr.t(v, this.i, Extension.C_BRAKE);
    }
}
