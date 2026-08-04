package com.gamericefishpro.space.f1;

import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends g {
    public final Function1 e;
    public int f;

    public f(long j, m mVar, Function1 function1) {
        super(j, mVar);
        this.e = function1;
        this.f = 1;
    }

    @Override // com.gamericefishpro.space.f1.g
    public final void c() {
        if (this.c) {
            return;
        }
        l();
        super.c();
    }

    @Override // com.gamericefishpro.space.f1.g
    public final Function1 e() {
        return this.e;
    }

    @Override // com.gamericefishpro.space.f1.g
    public final boolean f() {
        return true;
    }

    @Override // com.gamericefishpro.space.f1.g
    public final Function1 i() {
        return null;
    }

    @Override // com.gamericefishpro.space.f1.g
    public final void k() {
        this.f++;
    }

    @Override // com.gamericefishpro.space.f1.g
    public final void l() {
        int i = this.f - 1;
        this.f = i;
        if (i == 0) {
            a();
        }
    }

    @Override // com.gamericefishpro.space.f1.g
    public final void n(c0 c0Var) {
        com.gamericefishpro.space.d0.p pVar = p.a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // com.gamericefishpro.space.f1.g
    public final g u(Function1 function1) {
        p.c(this);
        return new e(this.b, this.a, p.k(function1, this.e, true), this);
    }

    @Override // com.gamericefishpro.space.f1.g
    public final void m() {
    }
}
