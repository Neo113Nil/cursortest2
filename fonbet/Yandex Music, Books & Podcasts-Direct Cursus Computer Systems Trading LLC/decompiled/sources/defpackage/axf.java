package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class axf {
    public final x6k A;
    public das a;
    public final xmn b;
    public final c3r c;
    public final pt0 d;
    public pcs e;
    public final x6k f;
    public final x6k g;
    public wof h;
    public final x6k i;
    public mn0 j;
    public final x6k k;
    public final x6k l;
    public final x6k m;
    public final x6k n;
    public final x6k o;
    public boolean p;
    public final x6k q;
    public final obf r;
    public final x6k s;
    public final x6k t;
    public Function1 u;
    public final nl6 v;
    public final nl6 w;
    public final gh0 x;
    public long y;
    public final x6k z;

    public axf(das dasVar, xmn xmnVar, c3r c3rVar) {
        this.a = dasVar;
        this.b = xmnVar;
        this.c = c3rVar;
        pt0 pt0Var = new pt0();
        mn0 mn0Var = nn0.a;
        long j = rds.b;
        ybs ybsVar = new ybs(mn0Var, j, (rds) null);
        pt0Var.a = ybsVar;
        pt0Var.b = new bh3(mn0Var, ybsVar.b);
        this.d = pt0Var;
        Boolean bool = Boolean.FALSE;
        this.f = szf.g0(bool);
        this.g = szf.g0(new cma(0));
        this.i = szf.g0(null);
        this.k = szf.g0(zrd.a);
        this.l = szf.g0(bool);
        this.m = szf.g0(bool);
        this.n = szf.g0(bool);
        this.o = szf.g0(bool);
        this.p = true;
        this.q = szf.g0(Boolean.TRUE);
        this.r = new obf(c3rVar);
        this.s = szf.g0(bool);
        this.t = szf.g0(bool);
        this.u = vsf.x;
        this.v = new nl6(this, 3);
        this.w = new nl6(this, 2);
        this.x = hld.p();
        this.y = d85.n;
        this.z = szf.g0(new rds(j));
        this.A = szf.g0(new rds(j));
    }

    public final zrd a() {
        return (zrd) this.k.getValue();
    }

    public final boolean b() {
        return ((Boolean) this.f.getValue()).booleanValue();
    }

    public final wof c() {
        wof wofVar = this.h;
        if (wofVar == null || !wofVar.d()) {
            return null;
        }
        return wofVar;
    }

    public final dds d() {
        return (dds) this.i.getValue();
    }

    public final void e(long j) {
        this.A.setValue(new rds(j));
    }

    public final void f(long j) {
        this.z.setValue(new rds(j));
    }
}
