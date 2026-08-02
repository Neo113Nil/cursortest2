package defpackage;

import kotlin.Unit;

/* loaded from: classes.dex */
public final class svf implements luf {
    public final /* synthetic */ tsf a;

    public svf(tsf tsfVar) {
        this.a = tsfVar;
    }

    @Override // defpackage.luf
    public final int a() {
        tsf tsfVar = this.a;
        return (-tsfVar.h().m) + tsfVar.h().q;
    }

    @Override // defpackage.luf
    public final float b() {
        tsf tsfVar = this.a;
        int g = tsfVar.g();
        int h = tsfVar.d.c.h();
        return tsfVar.d() ? (g * 500) + h + 100 : (g * 500) + h;
    }

    @Override // defpackage.luf
    public final ky4 c() {
        return new ky4(-1, -1);
    }

    @Override // defpackage.luf
    public final int d() {
        tsf tsfVar = this.a;
        return (int) (tsfVar.h().p == bxj.a ? tsfVar.h().g() & 4294967295L : tsfVar.h().g() >> 32);
    }

    @Override // defpackage.luf
    public final float e() {
        tsf tsfVar = this.a;
        return (tsfVar.g() * 500) + tsfVar.d.c.h();
    }

    @Override // defpackage.luf
    public final Object f(int i, dv0 dv0Var) {
        Object j = tsf.j(this.a, i, dv0Var);
        return j == nm6.a ? j : Unit.a;
    }
}
