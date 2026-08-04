package com.gamericefishpro.space.pi;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i0 extends com.gamericefishpro.space.wi.i {
    public int i;

    public i0(int i) {
        super(false, 0L);
        this.i = i;
    }

    public abstract com.gamericefishpro.space.th.a c();

    public Throwable d(Object obj) {
        q qVar = obj instanceof q ? (q) obj : null;
        if (qVar != null) {
            return qVar.a;
        }
        return null;
    }

    public final void g(Throwable th) {
        a0.p(new z("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th), c().getContext());
    }

    public abstract Object j();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            com.gamericefishpro.space.th.a aVarC = c();
            Intrinsics.c(aVarC, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            com.gamericefishpro.space.ui.f fVar = (com.gamericefishpro.space.ui.f) aVarC;
            com.gamericefishpro.space.vh.c cVar = fVar.w;
            Object obj = fVar.z;
            CoroutineContext context = cVar.getContext();
            Object objC = com.gamericefishpro.space.ui.t.c(context, obj);
            d1 d1Var = null;
            c2 c2VarC = objC != com.gamericefishpro.space.ui.t.a ? r.c(cVar, context, objC) : null;
            try {
                CoroutineContext context2 = cVar.getContext();
                Object objJ = j();
                Throwable thD = d(objJ);
                if (thD == null) {
                    int i = this.i;
                    boolean z = true;
                    if (i != 1 && i != 2) {
                        z = false;
                    }
                    if (z) {
                        d1Var = (d1) context2.j(u.e);
                    }
                }
                if (d1Var != null && !d1Var.b()) {
                    CancellationException cancellationExceptionT = d1Var.t();
                    b(cancellationExceptionT);
                    com.gamericefishpro.space.oh.n nVar = com.gamericefishpro.space.oh.p.d;
                    cVar.resumeWith(com.gamericefishpro.space.wa.b.q(cancellationExceptionT));
                } else if (thD != null) {
                    com.gamericefishpro.space.oh.n nVar2 = com.gamericefishpro.space.oh.p.d;
                    cVar.resumeWith(com.gamericefishpro.space.wa.b.q(thD));
                } else {
                    com.gamericefishpro.space.oh.n nVar3 = com.gamericefishpro.space.oh.p.d;
                    cVar.resumeWith(e(objJ));
                }
                Unit unit = Unit.a;
            } finally {
                if (c2VarC == null || c2VarC.n0()) {
                    com.gamericefishpro.space.ui.t.a(context, objC);
                }
            }
        } catch (g0 e) {
            a0.p(e.d, c().getContext());
        } catch (Throwable th) {
            g(th);
        }
    }

    public void b(CancellationException cancellationException) {
    }

    public Object e(Object obj) {
        return obj;
    }
}
