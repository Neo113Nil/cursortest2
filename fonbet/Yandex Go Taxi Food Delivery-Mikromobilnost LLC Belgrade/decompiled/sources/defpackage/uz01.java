package defpackage;

import androidx.compose.runtime.snapshots.a;

/* loaded from: classes.dex */
public final class uz01 extends i2t0 {
    public final i2t0 e;
    public final boolean f;
    public final boolean g;
    public tls h;
    public final long i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uz01(i2t0 i2t0Var, tls tlsVar, boolean z, boolean z2) {
        super(0L, a.x);
        tls e;
        q2m0 q2m0Var = q2t0.a;
        this.e = i2t0Var;
        this.f = z;
        this.g = z2;
        this.h = q2t0.k(tlsVar, (i2t0Var == null || (e = i2t0Var.e()) == null) ? q2t0.j.e : e, z);
        this.i = qke.i();
    }

    @Override // defpackage.i2t0
    public final void c() {
        i2t0 i2t0Var;
        this.c = true;
        if (!this.g || (i2t0Var = this.e) == null) {
            return;
        }
        i2t0Var.c();
    }

    @Override // defpackage.i2t0
    public final a d() {
        return v().d();
    }

    @Override // defpackage.i2t0
    public final tls e() {
        return this.h;
    }

    @Override // defpackage.i2t0
    public final boolean f() {
        return v().f();
    }

    @Override // defpackage.i2t0
    public final long g() {
        return v().g();
    }

    @Override // defpackage.i2t0
    public final tls i() {
        return null;
    }

    @Override // defpackage.i2t0
    public final void k() {
        yz91.e();
        throw null;
    }

    @Override // defpackage.i2t0
    public final void l() {
        yz91.e();
        throw null;
    }

    @Override // defpackage.i2t0
    public final void m() {
        v().m();
    }

    @Override // defpackage.i2t0
    public final void n(g5u0 g5u0Var) {
        v().n(g5u0Var);
    }

    @Override // defpackage.i2t0
    public final i2t0 u(tls tlsVar) {
        tls k = q2t0.k(tlsVar, this.h, true);
        return !this.f ? q2t0.g(v().u(null), k, true) : v().u(k);
    }

    public final i2t0 v() {
        i2t0 i2t0Var = this.e;
        return i2t0Var == null ? q2t0.j : i2t0Var;
    }
}
