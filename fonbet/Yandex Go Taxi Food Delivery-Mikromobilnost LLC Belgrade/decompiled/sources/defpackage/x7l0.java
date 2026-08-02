package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class x7l0 extends n351 {
    public final int c;
    public final oiz0 d;
    public final d41 e;
    public final fj00 f;
    public final txq g;
    public final txq h;
    public final txq i;
    public final txq j;
    public final txq k;
    public final nae l;
    public final rgb0 m;
    public final boolean n;
    public final g2q0 o;
    public final vu0 p;
    public final boolean q;
    public final wa31 r;
    public final String s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x7l0(int i, oiz0 oiz0Var, d41 d41Var, fj00 fj00Var, txq txqVar, txq txqVar2, txq txqVar3, txq txqVar4, txq txqVar5, nae naeVar, rgb0 rgb0Var, boolean z, g2q0 g2q0Var, vu0 vu0Var, boolean z2, wa31 wa31Var, String str, int i2) {
        super("route-point", false, 14);
        oiz0Var = (i2 & 2) != 0 ? null : oiz0Var;
        fj00Var = (i2 & 8) != 0 ? null : fj00Var;
        boolean z3 = (i2 & 2048) != 0 ? true : z;
        boolean z4 = (i2 & 16384) != 0 ? false : z2;
        wa31 wa31Var2 = (32768 & i2) != 0 ? null : wa31Var;
        String str2 = (i2 & 65536) == 0 ? str : null;
        this.c = i;
        this.d = oiz0Var;
        this.e = d41Var;
        this.f = fj00Var;
        this.g = txqVar;
        this.h = txqVar2;
        this.i = txqVar3;
        this.j = txqVar4;
        this.k = txqVar5;
        this.l = naeVar;
        this.m = rgb0Var;
        this.n = z3;
        this.o = g2q0Var;
        this.p = vu0Var;
        this.q = z4;
        this.r = wa31Var2;
        this.s = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x7l0)) {
            return false;
        }
        x7l0 x7l0Var = (x7l0) obj;
        return this.c == x7l0Var.c && jl40.l(this.d, x7l0Var.d) && jl40.l(this.e, x7l0Var.e) && jl40.l(this.f, x7l0Var.f) && jl40.l(this.g, x7l0Var.g) && jl40.l(this.h, x7l0Var.h) && jl40.l(this.i, x7l0Var.i) && jl40.l(this.j, x7l0Var.j) && jl40.l(this.k, x7l0Var.k) && jl40.l(this.l, x7l0Var.l) && jl40.l(this.m, x7l0Var.m) && this.n == x7l0Var.n && jl40.l(this.o, x7l0Var.o) && jl40.l(this.p, x7l0Var.p) && this.q == x7l0Var.q && jl40.l(this.r, x7l0Var.r) && jl40.l(this.s, x7l0Var.s);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.c) * 31;
        oiz0 oiz0Var = this.d;
        int hashCode2 = (this.e.hashCode() + ((hashCode + (oiz0Var == null ? 0 : oiz0Var.hashCode())) * 31)) * 31;
        fj00 fj00Var = this.f;
        int hashCode3 = (this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((hashCode2 + (fj00Var == null ? 0 : fj00Var.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        rgb0 rgb0Var = this.m;
        int e = unr0.e((hashCode3 + (rgb0Var == null ? 0 : rgb0Var.hashCode())) * 31, 31, this.n);
        g2q0 g2q0Var = this.o;
        int hashCode4 = (e + (g2q0Var == null ? 0 : g2q0Var.hashCode())) * 31;
        vu0 vu0Var = this.p;
        int e2 = unr0.e((hashCode4 + (vu0Var == null ? 0 : vu0Var.hashCode())) * 31, 31, this.q);
        wa31 wa31Var = this.r;
        int hashCode5 = (e2 + (wa31Var == null ? 0 : wa31Var.hashCode())) * 31;
        String str = this.s;
        return hashCode5 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RoutePointModel(routeIndex=");
        sb.append(this.c);
        sb.append(", routePointHeader=");
        sb.append(this.d);
        sb.append(", addressModel=");
        sb.append(this.e);
        sb.append(", mapImageConfig=");
        sb.append(this.f);
        sb.append(", porch=");
        sb.append(this.g);
        sb.append(", doorPhone=");
        sb.append(this.h);
        sb.append(", apartment=");
        sb.append(this.i);
        sb.append(", comment=");
        sb.append(this.j);
        sb.append(", floor=");
        sb.append(this.k);
        sb.append(", contactModel=");
        sb.append(this.l);
        sb.append(", photoComments=");
        sb.append(this.m);
        sb.append(", isAvailableForEditing=");
        sb.append(this.n);
        sb.append(", section=");
        sb.append(this.o);
        sb.append(", addressFlow=");
        sb.append(this.p);
        sb.append(", closeDetailsAfterAddressSelection=");
        sb.append(this.q);
        sb.append(", verticalBar=");
        sb.append(this.r);
        sb.append(", metricaLabel=");
        return oyr.t(sb, this.s, Extension.C_BRAKE);
    }
}
