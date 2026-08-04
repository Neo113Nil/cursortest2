package com.gamericefishpro.space.b2;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 implements com.gamericefishpro.space.c3.c, com.gamericefishpro.space.th.a {
    public final /* synthetic */ f0 d;
    public final com.gamericefishpro.space.pi.h e;
    public com.gamericefishpro.space.pi.h i;
    public i v = i.e;
    public final kotlin.coroutines.g w = kotlin.coroutines.g.d;
    public final /* synthetic */ f0 y;

    public c0(f0 f0Var, com.gamericefishpro.space.pi.h hVar) {
        this.y = f0Var;
        this.d = f0Var;
        this.e = hVar;
    }

    @Override // com.gamericefishpro.space.c3.c
    public final float D(long j) {
        return this.d.D(j);
    }

    @Override // com.gamericefishpro.space.c3.c
    public final int J(float f) {
        return this.d.J(f);
    }

    @Override // com.gamericefishpro.space.c3.c
    public final long S(long j) {
        return this.d.S(j);
    }

    @Override // com.gamericefishpro.space.c3.c
    public final float V(long j) {
        return this.d.V(j);
    }

    public final Object a(i iVar, com.gamericefishpro.space.vh.a frame) {
        com.gamericefishpro.space.pi.h hVar = new com.gamericefishpro.space.pi.h(1, com.gamericefishpro.space.uh.f.b(frame));
        hVar.s();
        this.v = iVar;
        this.i = hVar;
        Object objR = hVar.r();
        if (objR == com.gamericefishpro.space.uh.a.d) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objR;
    }

    @Override // com.gamericefishpro.space.c3.c
    public final float b() {
        return this.d.b();
    }

    @Override // com.gamericefishpro.space.c3.c
    public final long b0(float f) {
        return this.d.b0(f);
    }

    @Override // com.gamericefishpro.space.c3.c
    public final float g() {
        return this.d.g();
    }

    @Override // com.gamericefishpro.space.c3.c
    public final float g0(int i) {
        return this.d.g0(i);
    }

    @Override // com.gamericefishpro.space.th.a
    public final CoroutineContext getContext() {
        return this.w;
    }

    @Override // com.gamericefishpro.space.c3.c
    public final float i0(float f) {
        return f / this.d.b();
    }

    @Override // com.gamericefishpro.space.c3.c
    public final long q(float f) {
        return this.d.q(f);
    }

    @Override // com.gamericefishpro.space.c3.c
    public final float r(float f) {
        return this.d.b() * f;
    }

    @Override // com.gamericefishpro.space.th.a
    public final void resumeWith(Object obj) {
        f0 f0Var = this.y;
        synchronized (f0Var.N) {
            f0Var.M.k(this);
            Unit unit = Unit.a;
        }
        this.e.resumeWith(obj);
    }
}
