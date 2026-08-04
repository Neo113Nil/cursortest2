package com.gamericefishpro.space.t0;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class h1 implements s0 {
    public final s0 d;
    public final com.gamericefishpro.space.h0.z0 e = new com.gamericefishpro.space.h0.z0();

    public h1(s0 s0Var) {
        this.d = s0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.gamericefishpro.space.t0.s0
    public final Object E(Function1 function1, com.gamericefishpro.space.vh.c cVar) {
        g1 frame;
        boolean z;
        Object objR;
        if (cVar instanceof g1) {
            frame = (g1) cVar;
            int i = frame.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                frame.v = i - Integer.MIN_VALUE;
            } else {
                frame = new g1(this, cVar);
            }
        } else {
            frame = new g1(this, cVar);
        }
        Object obj = frame.e;
        com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
        int i2 = frame.v;
        if (i2 == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            com.gamericefishpro.space.h0.z0 z0Var = this.e;
            frame.d = function1;
            frame.v = 1;
            synchronized (z0Var.b) {
                z = z0Var.a;
            }
            if (z) {
                objR = Unit.a;
            } else {
                com.gamericefishpro.space.pi.h hVar = new com.gamericefishpro.space.pi.h(1, com.gamericefishpro.space.uh.f.b(frame));
                hVar.s();
                synchronized (z0Var.b) {
                    ((ArrayList) z0Var.c).add(hVar);
                }
                hVar.u(new com.gamericefishpro.space.f1.a(1, z0Var, hVar));
                objR = hVar.r();
                if (objR == aVar) {
                    Intrinsics.checkNotNullParameter(frame, "frame");
                }
                if (objR != aVar) {
                    objR = Unit.a;
                }
            }
            if (objR != aVar) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.gamericefishpro.space.wa.b.P(obj);
            return obj;
        }
        function1 = frame.d;
        com.gamericefishpro.space.wa.b.P(obj);
        s0 s0Var = this.d;
        frame.d = null;
        frame.v = 2;
        Object objE = s0Var.E(function1, frame);
        return objE == aVar ? aVar : objE;
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
