package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class wts0 {
    public final eqs0 a;
    public final hts0 b;
    public final eqs0 c;
    public final eqs0 d;
    public final nr e;
    public final pvs0 f;
    public final ous0 g;
    public final float h;
    public final float i;
    public final boolean j;

    public wts0(eqs0 eqs0Var, hts0 hts0Var, eqs0 eqs0Var2, eqs0 eqs0Var3, nr nrVar, pvs0 pvs0Var, ous0 ous0Var, float f, float f2, int i) {
        this(eqs0Var, hts0Var, eqs0Var2, eqs0Var3, nrVar, (i & 32) != 0 ? null : pvs0Var, ous0Var, f, f2, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wts0)) {
            return false;
        }
        wts0 wts0Var = (wts0) obj;
        return jl40.l(this.a, wts0Var.a) && jl40.l(this.b, wts0Var.b) && jl40.l(this.c, wts0Var.c) && jl40.l(this.d, wts0Var.d) && jl40.l(this.e, wts0Var.e) && jl40.l(this.f, wts0Var.f) && jl40.l(this.g, wts0Var.g) && y7m.b(this.h, wts0Var.h) && y7m.b(this.i, wts0Var.i) && this.j == wts0Var.j;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        hts0 hts0Var = this.b;
        int hashCode2 = (hashCode + (hts0Var == null ? 0 : hts0Var.hashCode())) * 31;
        eqs0 eqs0Var = this.c;
        int hashCode3 = (hashCode2 + (eqs0Var == null ? 0 : eqs0Var.hashCode())) * 31;
        eqs0 eqs0Var2 = this.d;
        int hashCode4 = (hashCode3 + (eqs0Var2 == null ? 0 : eqs0Var2.hashCode())) * 31;
        nr nrVar = this.e;
        int hashCode5 = (hashCode4 + (nrVar == null ? 0 : nrVar.hashCode())) * 31;
        pvs0 pvs0Var = this.f;
        return Boolean.hashCode(this.j) + g8e.c(this.i, g8e.c(this.h, (this.g.hashCode() + ((hashCode5 + (pvs0Var != null ? pvs0Var.hashCode() : 0)) * 31)) * 31, 31), 31);
    }

    public final String toString() {
        String c = y7m.c(this.h);
        String c2 = y7m.c(this.i);
        StringBuilder sb = new StringBuilder("SlotModel(body1=");
        sb.append(this.a);
        sb.append(", lead=");
        sb.append(this.b);
        sb.append(", body2=");
        sb.append(this.c);
        sb.append(", body3=");
        sb.append(this.d);
        sb.append(", action=");
        sb.append(this.e);
        sb.append(", trail=");
        sb.append(this.f);
        sb.append(", style=");
        sb.append(this.g);
        sb.append(", size=");
        sb.append(c);
        sb.append(", verticalPadding=");
        return nnm.i(c2, ", isShimmering=", Extension.C_BRAKE, sb, this.j);
    }

    public wts0(eqs0 eqs0Var, hts0 hts0Var, eqs0 eqs0Var2, eqs0 eqs0Var3, nr nrVar, pvs0 pvs0Var, ous0 ous0Var, float f, float f2, boolean z) {
        this.a = eqs0Var;
        this.b = hts0Var;
        this.c = eqs0Var2;
        this.d = eqs0Var3;
        this.e = nrVar;
        this.f = pvs0Var;
        this.g = ous0Var;
        this.h = f;
        this.i = f2;
        this.j = z;
    }
}
