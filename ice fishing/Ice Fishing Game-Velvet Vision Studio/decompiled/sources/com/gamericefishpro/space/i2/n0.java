package com.gamericefishpro.space.i2;

import android.view.Choreographer;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 implements com.gamericefishpro.space.t0.s0 {
    public final Choreographer d;
    public final l0 e;

    public n0(Choreographer choreographer, l0 l0Var) {
        this.d = choreographer;
        this.e = l0Var;
    }

    @Override // com.gamericefishpro.space.t0.s0
    public final Object E(Function1 function1, com.gamericefishpro.space.vh.c frame) {
        l0 l0Var = this.e;
        com.gamericefishpro.space.pi.h hVar = new com.gamericefishpro.space.pi.h(1, com.gamericefishpro.space.uh.f.b(frame));
        hVar.s();
        m0 m0Var = new m0(hVar, this, function1);
        if (Intrinsics.a(l0Var.i, this.d)) {
            synchronized (l0Var.w) {
                try {
                    l0Var.z.add(m0Var);
                    if (!l0Var.C) {
                        l0Var.C = true;
                        l0Var.i.postFrameCallback(l0Var.D);
                    }
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            hVar.u(new com.gamericefishpro.space.b2.t(5, l0Var, m0Var));
        } else {
            this.d.postFrameCallback(m0Var);
            hVar.u(new com.gamericefishpro.space.b2.t(6, this, m0Var));
        }
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
