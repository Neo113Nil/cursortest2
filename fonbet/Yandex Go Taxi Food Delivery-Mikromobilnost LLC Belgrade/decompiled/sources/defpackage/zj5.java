package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class zj5 implements m1j {
    public final obm a;
    public final String b;
    public final String c;
    public final k911 d;
    public final String e;
    public final ib11 f;
    public final String g;
    public final i911 h;
    public final String i;

    public zj5(obm obmVar, String str, String str2, k911 k911Var, String str3, ib11 ib11Var, String str4, i911 i911Var, String str5) {
        this.a = obmVar;
        this.b = str;
        this.c = str2;
        this.d = k911Var;
        this.e = str3;
        this.f = ib11Var;
        this.g = str4;
        this.h = i911Var;
        this.i = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zj5)) {
            return false;
        }
        zj5 zj5Var = (zj5) obj;
        return jl40.l(this.a, zj5Var.a) && this.b.equals(zj5Var.b) && jl40.l(this.c, zj5Var.c) && this.d.equals(zj5Var.d) && this.e.equals(zj5Var.e) && this.f.equals(zj5Var.f) && this.g.equals(zj5Var.g) && this.h.equals(zj5Var.h) && jl40.l(this.i, zj5Var.i);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.i;
    }

    public final int hashCode() {
        obm obmVar = this.a;
        return this.i.hashCode() + ((this.h.hashCode() + unr0.b((this.f.hashCode() + unr0.b(smw0.e(this.d, unr0.b((this.b.hashCode() + ((obmVar == null ? 0 : obmVar.a.hashCode()) * 31)) * 31, 31, this.c), 31), 31, this.e)) * 31, 31, this.g)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BeginUndergroundSection(icon=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append((Object) this.b);
        sb.append(", time=");
        sb.append(this.c);
        sb.append(", prevTransportType=");
        sb.append(this.d);
        sb.append(", contentDescription=");
        sb.append(this.e);
        sb.append(", variant=");
        sb.append(this.f);
        sb.append(", undergroundSubtitle=");
        sb.append(this.g);
        sb.append(", transportType=");
        sb.append(this.h);
        sb.append(", id=");
        return oyr.t(sb, this.i, Extension.C_BRAKE);
    }
}
