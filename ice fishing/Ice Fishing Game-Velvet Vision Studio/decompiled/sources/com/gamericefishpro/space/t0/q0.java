package com.gamericefishpro.space.t0;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 implements x1, com.gamericefishpro.space.pi.v {
    public final CoroutineContext d;
    public final Function2 e;
    public final com.gamericefishpro.space.ui.c i;
    public com.gamericefishpro.space.pi.s1 v;

    public q0(CoroutineContext coroutineContext, Function2 function2) {
        this.d = coroutineContext;
        this.e = function2;
        this.i = com.gamericefishpro.space.pi.a0.b(coroutineContext.o(this));
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext K(kotlin.coroutines.f fVar) {
        return kotlin.coroutines.e.b(this, fVar);
    }

    @Override // com.gamericefishpro.space.pi.v
    public final void N(Throwable th, CoroutineContext coroutineContext) throws Throwable {
        com.gamericefishpro.space.g1.f fVar = (com.gamericefishpro.space.g1.f) coroutineContext.j(com.gamericefishpro.space.g1.f.e);
        if (fVar != null) {
            com.gamericefishpro.space.wa.b.R(th, new com.gamericefishpro.space.e.e(3, fVar, this));
        }
        com.gamericefishpro.space.pi.v vVar = (com.gamericefishpro.space.pi.v) this.d.j(com.gamericefishpro.space.pi.u.d);
        if (vVar == null) {
            throw th;
        }
        vVar.N(th, coroutineContext);
    }

    @Override // com.gamericefishpro.space.t0.x1
    public final void a() {
        com.gamericefishpro.space.pi.s1 s1Var = this.v;
        if (s1Var != null) {
            CancellationException cancellationException = new CancellationException("Old job was still running!");
            cancellationException.initCause(null);
            s1Var.c(cancellationException);
        }
        this.v = com.gamericefishpro.space.pi.a0.u(this.i, null, this.e, 3);
    }

    @Override // com.gamericefishpro.space.t0.x1
    public final void d() {
        com.gamericefishpro.space.pi.s1 s1Var = this.v;
        if (s1Var != null) {
            s1Var.u(new i0(1));
        }
        this.v = null;
    }

    @Override // com.gamericefishpro.space.t0.x1
    public final void e() {
        com.gamericefishpro.space.pi.s1 s1Var = this.v;
        if (s1Var != null) {
            s1Var.u(new i0(1));
        }
        this.v = null;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final kotlin.coroutines.f getKey() {
        return com.gamericefishpro.space.pi.u.d;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element j(kotlin.coroutines.f fVar) {
        return kotlin.coroutines.e.a(this, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext o(CoroutineContext coroutineContext) {
        return kotlin.coroutines.e.c(this, coroutineContext);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object w(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(obj, this);
    }
}
