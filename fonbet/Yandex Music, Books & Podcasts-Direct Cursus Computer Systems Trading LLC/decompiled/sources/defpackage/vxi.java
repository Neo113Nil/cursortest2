package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class vxi extends b2r {
    public final Function1 e;
    public final b2r f;

    public vxi(long j, f2r f2rVar, Function1 function1, b2r b2rVar) {
        super(j, f2rVar);
        this.e = function1;
        this.f = b2rVar;
        b2rVar.k();
    }

    @Override // defpackage.b2r
    public final void c() {
        b2r b2rVar = this.f;
        if (this.c) {
            return;
        }
        if (this.b != b2rVar.g()) {
            a();
        }
        b2rVar.l();
        this.c = true;
        synchronized (g2r.b) {
            o();
        }
    }

    @Override // defpackage.b2r
    public final Function1 e() {
        return this.e;
    }

    @Override // defpackage.b2r
    public final boolean f() {
        return true;
    }

    @Override // defpackage.b2r
    public final Function1 i() {
        return null;
    }

    @Override // defpackage.b2r
    public final void k() {
        wct.N();
        throw null;
    }

    @Override // defpackage.b2r
    public final void l() {
        wct.N();
        throw null;
    }

    @Override // defpackage.b2r
    public final void n(mer merVar) {
        sfm sfmVar = g2r.a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // defpackage.b2r
    public final b2r u(Function1 function1) {
        return new vxi(this.b, this.a, g2r.l(function1, this.e, true), this.f);
    }

    @Override // defpackage.b2r
    public final void m() {
    }
}
