package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class ekn extends b2r {
    public final Function1 e;
    public int f;

    public ekn(long j, f2r f2rVar, Function1 function1) {
        super(j, f2rVar);
        this.e = function1;
        this.f = 1;
    }

    @Override // defpackage.b2r
    public final void c() {
        if (this.c) {
            return;
        }
        l();
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
        this.f++;
    }

    @Override // defpackage.b2r
    public final void l() {
        int i = this.f - 1;
        this.f = i;
        if (i == 0) {
            a();
        }
    }

    @Override // defpackage.b2r
    public final void n(mer merVar) {
        sfm sfmVar = g2r.a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // defpackage.b2r
    public final b2r u(Function1 function1) {
        g2r.d(this);
        return new vxi(this.b, this.a, g2r.l(function1, this.e, true), this);
    }

    @Override // defpackage.b2r
    public final void m() {
    }
}
