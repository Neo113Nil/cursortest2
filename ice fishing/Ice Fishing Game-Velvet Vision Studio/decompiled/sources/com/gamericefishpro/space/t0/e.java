package com.gamericefishpro.space.t0;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements s0 {
    public final q1 d;
    public final com.gamericefishpro.space.b1.d e = new com.gamericefishpro.space.b1.d(0);

    public e(q1 q1Var) {
        this.d = q1Var;
    }

    @Override // com.gamericefishpro.space.t0.s0
    public final Object E(Function1 function1, com.gamericefishpro.space.vh.c frame) {
        com.gamericefishpro.space.pi.h hVar = new com.gamericefishpro.space.pi.h(1, com.gamericefishpro.space.uh.f.b(frame));
        hVar.s();
        d dVar = new d();
        dVar.a = hVar;
        dVar.b = function1;
        hVar.u(new com.gamericefishpro.space.b2.z(5, this.e.j(dVar, this.d)));
        Object objR = hVar.r();
        if (objR == com.gamericefishpro.space.uh.a.d) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objR;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext K(kotlin.coroutines.f fVar) {
        return kotlin.coroutines.e.b(this, fVar);
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
