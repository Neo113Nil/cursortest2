package com.gamericefishpro.space.ti;

import com.gamericefishpro.space.d0.n1;
import com.gamericefishpro.space.pi.a0;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends com.gamericefishpro.space.vh.c implements com.gamericefishpro.space.si.f {
    public final com.gamericefishpro.space.si.f d;
    public final CoroutineContext e;
    public final int i;
    public CoroutineContext v;
    public com.gamericefishpro.space.th.a w;

    public t(com.gamericefishpro.space.si.f fVar, CoroutineContext coroutineContext) {
        super(r.d, kotlin.coroutines.g.d);
        this.d = fVar;
        this.e = coroutineContext;
        this.i = ((Number) coroutineContext.w(0, new com.gamericefishpro.space.r2.u(21))).intValue();
    }

    @Override // com.gamericefishpro.space.si.f
    public final Object d(Object obj, com.gamericefishpro.space.th.a frame) {
        try {
            Object objE = e(frame, obj);
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            if (objE == aVar) {
                Intrinsics.checkNotNullParameter(frame, "frame");
            }
            return objE == aVar ? objE : Unit.a;
        } catch (Throwable th) {
            this.v = new p(th, frame.getContext());
            throw th;
        }
    }

    public final Object e(com.gamericefishpro.space.th.a aVar, Object obj) {
        CoroutineContext context = aVar.getContext();
        a0.j(context);
        CoroutineContext coroutineContext = this.v;
        if (coroutineContext != context) {
            if (coroutineContext instanceof p) {
                throw new IllegalStateException(com.gamericefishpro.space.mi.h.c("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((p) coroutineContext).e + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) context.w(0, new n1(14, this))).intValue() != this.i) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.e + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.v = context;
        }
        this.w = aVar;
        com.gamericefishpro.space.di.c cVar = v.a;
        com.gamericefishpro.space.si.f fVar = this.d;
        Intrinsics.c(fVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Object objA = cVar.a(fVar, obj, this);
        if (!Intrinsics.a(objA, com.gamericefishpro.space.uh.a.d)) {
            this.w = null;
        }
        return objA;
    }

    @Override // com.gamericefishpro.space.vh.a, com.gamericefishpro.space.vh.d
    public final com.gamericefishpro.space.vh.d getCallerFrame() {
        com.gamericefishpro.space.th.a aVar = this.w;
        if (aVar instanceof com.gamericefishpro.space.vh.d) {
            return (com.gamericefishpro.space.vh.d) aVar;
        }
        return null;
    }

    @Override // com.gamericefishpro.space.vh.c, com.gamericefishpro.space.th.a
    public final CoroutineContext getContext() {
        CoroutineContext coroutineContext = this.v;
        return coroutineContext == null ? kotlin.coroutines.g.d : coroutineContext;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        Throwable thA = com.gamericefishpro.space.oh.p.a(obj);
        if (thA != null) {
            this.v = new p(thA, getContext());
        }
        com.gamericefishpro.space.th.a aVar = this.w;
        if (aVar != null) {
            aVar.resumeWith(obj);
        }
        return com.gamericefishpro.space.uh.a.d;
    }
}
