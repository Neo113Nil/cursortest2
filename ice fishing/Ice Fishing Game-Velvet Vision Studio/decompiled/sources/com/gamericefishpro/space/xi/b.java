package com.gamericefishpro.space.xi;

import com.gamericefishpro.space.pi.e2;
import com.gamericefishpro.space.pi.g0;
import com.gamericefishpro.space.ui.q;
import com.gamericefishpro.space.w.m1;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements com.gamericefishpro.space.pi.f, e2 {
    public final com.gamericefishpro.space.pi.h d;
    public final /* synthetic */ c e;

    public b(c cVar, com.gamericefishpro.space.pi.h hVar) {
        this.e = cVar;
        this.d = hVar;
    }

    @Override // com.gamericefishpro.space.pi.e2
    public final void a(q qVar, int i) {
        this.d.a(qVar, i);
    }

    @Override // com.gamericefishpro.space.pi.f
    public final com.gamericefishpro.space.d6.a f(Object obj, com.gamericefishpro.space.di.c cVar) {
        c cVar2 = this.e;
        com.gamericefishpro.space.pi.g gVar = new com.gamericefishpro.space.pi.g(cVar2, this);
        com.gamericefishpro.space.d6.a aVarF = this.d.f((Unit) obj, gVar);
        if (aVarF != null) {
            c.A.set(cVar2, null);
        }
        return aVarF;
    }

    @Override // com.gamericefishpro.space.th.a
    public final CoroutineContext getContext() {
        return this.d.w;
    }

    @Override // com.gamericefishpro.space.pi.f
    public final void h(Object obj, com.gamericefishpro.space.di.c cVar) throws g0 {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.A;
        c cVar2 = this.e;
        atomicReferenceFieldUpdater.set(cVar2, null);
        m1 m1Var = new m1(cVar2, this);
        com.gamericefishpro.space.pi.h hVar = this.d;
        hVar.B((Unit) obj, hVar.i, new com.gamericefishpro.space.pi.g(0, m1Var));
    }

    @Override // com.gamericefishpro.space.pi.f
    public final boolean i(Throwable th) {
        return this.d.i(th);
    }

    @Override // com.gamericefishpro.space.pi.f
    public final void p(Object obj) throws g0 {
        this.d.p(obj);
    }

    @Override // com.gamericefishpro.space.th.a
    public final void resumeWith(Object obj) {
        this.d.resumeWith(obj);
    }
}
