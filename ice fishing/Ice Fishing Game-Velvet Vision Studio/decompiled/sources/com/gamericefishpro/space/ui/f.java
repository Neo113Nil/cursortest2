package com.gamericefishpro.space.ui;

import com.gamericefishpro.space.pi.a0;
import com.gamericefishpro.space.pi.g0;
import com.gamericefishpro.space.pi.i0;
import com.gamericefishpro.space.pi.u0;
import com.gamericefishpro.space.pi.w1;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends i0 implements com.gamericefishpro.space.vh.d, com.gamericefishpro.space.th.a {
    public static final /* synthetic */ AtomicReferenceFieldUpdater A = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;
    public final com.gamericefishpro.space.pi.t v;
    public final com.gamericefishpro.space.vh.c w;
    public Object y;
    public final Object z;

    public f(com.gamericefishpro.space.pi.t tVar, com.gamericefishpro.space.vh.c cVar) {
        super(-1);
        this.v = tVar;
        this.w = cVar;
        this.y = a.b;
        this.z = t.b(cVar.getContext());
    }

    @Override // com.gamericefishpro.space.vh.d
    public final com.gamericefishpro.space.vh.d getCallerFrame() {
        return this.w;
    }

    @Override // com.gamericefishpro.space.th.a
    public final CoroutineContext getContext() {
        return this.w.getContext();
    }

    @Override // com.gamericefishpro.space.pi.i0
    public final Object j() {
        Object obj = this.y;
        this.y = a.b;
        return obj;
    }

    @Override // com.gamericefishpro.space.th.a
    public final void resumeWith(Object obj) throws g0 {
        Throwable thA = com.gamericefishpro.space.oh.p.a(obj);
        Object qVar = thA == null ? obj : new com.gamericefishpro.space.pi.q(thA, false);
        com.gamericefishpro.space.vh.c cVar = this.w;
        CoroutineContext context = cVar.getContext();
        com.gamericefishpro.space.pi.t tVar = this.v;
        if (a.i(tVar, context)) {
            this.y = qVar;
            this.i = 0;
            a.h(tVar, cVar.getContext(), this);
            return;
        }
        u0 u0VarA = w1.a();
        if (u0VarA.i >= 4294967296L) {
            this.y = qVar;
            this.i = 0;
            u0VarA.U(this);
            return;
        }
        u0VarA.W(true);
        try {
            CoroutineContext context2 = cVar.getContext();
            Object objC = t.c(context2, this.z);
            try {
                cVar.resumeWith(obj);
                Unit unit = Unit.a;
                t.a(context2, objC);
                while (u0VarA.Y()) {
                }
            } catch (Throwable th) {
                t.a(context2, objC);
                throw th;
            }
        } catch (Throwable th2) {
            try {
                g(th2);
            } finally {
                u0VarA.T(true);
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.v + ", " + a0.B(this.w) + ']';
    }

    @Override // com.gamericefishpro.space.pi.i0
    public final com.gamericefishpro.space.th.a c() {
        return this;
    }
}
