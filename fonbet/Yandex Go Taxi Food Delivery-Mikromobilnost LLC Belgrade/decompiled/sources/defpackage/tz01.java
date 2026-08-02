package defpackage;

import androidx.compose.runtime.snapshots.a;

/* loaded from: classes.dex */
public final class tz01 extends mz40 {
    public final mz40 o;
    public final boolean p;
    public final boolean q;
    public tls r;
    public tls s;
    public final long t;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public tz01(mz40 mz40Var, tls tlsVar, tls tlsVar2, boolean z, boolean z2) {
        super(0L, a.x, q2t0.k(tlsVar, (mz40Var == null || (r0 = mz40Var.e()) == null) ? q2t0.j.e : r0, z), q2t0.l(tlsVar2, (mz40Var == null || (r9 = mz40Var.i()) == null) ? q2t0.j.f : r9));
        tls i;
        tls e;
        q2m0 q2m0Var = q2t0.a;
        this.o = mz40Var;
        this.p = z;
        this.q = z2;
        this.r = this.e;
        this.s = this.f;
        this.t = qke.i();
    }

    @Override // defpackage.mz40
    public final void B(iz40 iz40Var) {
        yz91.e();
        throw null;
    }

    @Override // defpackage.mz40
    public final mz40 C(tls tlsVar, tls tlsVar2) {
        tls k = q2t0.k(tlsVar, this.r, true);
        tls l = q2t0.l(tlsVar2, this.s);
        return !this.p ? new tz01(D().C(null, l), k, l, false, true) : D().C(k, l);
    }

    public final mz40 D() {
        mz40 mz40Var = this.o;
        return mz40Var == null ? q2t0.j : mz40Var;
    }

    @Override // defpackage.mz40, defpackage.i2t0
    public final void c() {
        mz40 mz40Var;
        this.c = true;
        if (!this.q || (mz40Var = this.o) == null) {
            return;
        }
        mz40Var.c();
    }

    @Override // defpackage.i2t0
    public final a d() {
        return D().d();
    }

    @Override // defpackage.mz40, defpackage.i2t0
    public final tls e() {
        return this.r;
    }

    @Override // defpackage.mz40, defpackage.i2t0
    public final boolean f() {
        return D().f();
    }

    @Override // defpackage.i2t0
    public final long g() {
        return D().g();
    }

    @Override // defpackage.mz40, defpackage.i2t0
    public final int h() {
        return D().h();
    }

    @Override // defpackage.mz40, defpackage.i2t0
    public final tls i() {
        return this.s;
    }

    @Override // defpackage.mz40, defpackage.i2t0
    public final void k() {
        yz91.e();
        throw null;
    }

    @Override // defpackage.mz40, defpackage.i2t0
    public final void l() {
        yz91.e();
        throw null;
    }

    @Override // defpackage.mz40, defpackage.i2t0
    public final void m() {
        D().m();
    }

    @Override // defpackage.mz40, defpackage.i2t0
    public final void n(g5u0 g5u0Var) {
        D().n(g5u0Var);
    }

    @Override // defpackage.i2t0
    public final void r(a aVar) {
        yz91.e();
        throw null;
    }

    @Override // defpackage.i2t0
    public final void s(long j) {
        yz91.e();
        throw null;
    }

    @Override // defpackage.mz40, defpackage.i2t0
    public final void t(int i) {
        D().t(i);
    }

    @Override // defpackage.mz40, defpackage.i2t0
    public final i2t0 u(tls tlsVar) {
        tls k = q2t0.k(tlsVar, this.r, true);
        return !this.p ? q2t0.g(D().u(null), k, true) : D().u(k);
    }

    @Override // defpackage.mz40
    public final qke w() {
        return D().w();
    }

    @Override // defpackage.mz40
    public final iz40 x() {
        return D().x();
    }

    @Override // defpackage.mz40
    /* renamed from: y */
    public final tls e() {
        return this.r;
    }
}
