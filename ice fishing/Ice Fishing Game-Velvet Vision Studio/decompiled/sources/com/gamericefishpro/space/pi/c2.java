package com.gamericefishpro.space.pi;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c2 extends com.gamericefishpro.space.ui.p {
    private volatile boolean threadLocalIsSet;
    public final ThreadLocal w;

    /* JADX WARN: Illegal instructions before constructor call */
    public c2(com.gamericefishpro.space.th.a aVar, CoroutineContext coroutineContext) {
        d2 d2Var = d2.d;
        super(aVar, coroutineContext.j(d2Var) == null ? coroutineContext.o(d2Var) : coroutineContext);
        this.w = new ThreadLocal();
        if (aVar.getContext().j(kotlin.coroutines.d.x) instanceof t) {
            return;
        }
        Object objC = com.gamericefishpro.space.ui.t.c(coroutineContext, null);
        com.gamericefishpro.space.ui.t.a(coroutineContext, objC);
        p0(coroutineContext, objC);
    }

    @Override // com.gamericefishpro.space.ui.p
    public final void m0() {
        o0();
    }

    public final boolean n0() {
        boolean z = this.threadLocalIsSet && this.w.get() == null;
        this.w.remove();
        return !z;
    }

    public final void o0() {
        if (this.threadLocalIsSet) {
            Pair pair = (Pair) this.w.get();
            if (pair != null) {
                com.gamericefishpro.space.ui.t.a((CoroutineContext) pair.d, pair.e);
            }
            this.w.remove();
        }
    }

    public final void p0(CoroutineContext coroutineContext, Object obj) {
        this.threadLocalIsSet = true;
        this.w.set(new Pair(coroutineContext, obj));
    }

    @Override // com.gamericefishpro.space.ui.p, com.gamericefishpro.space.pi.l1
    public final void q(Object obj) {
        o0();
        Object objW = a0.w(obj);
        com.gamericefishpro.space.th.a aVar = this.v;
        CoroutineContext context = aVar.getContext();
        Object objC = com.gamericefishpro.space.ui.t.c(context, null);
        c2 c2VarC = objC != com.gamericefishpro.space.ui.t.a ? r.c(aVar, context, objC) : null;
        try {
            aVar.resumeWith(objW);
            Unit unit = Unit.a;
        } finally {
            if (c2VarC == null || c2VarC.n0()) {
                com.gamericefishpro.space.ui.t.a(context, objC);
            }
        }
    }
}
