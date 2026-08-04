package com.gamericefishpro.space.pi;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends l1 implements com.gamericefishpro.space.th.a, x {
    public final CoroutineContext i;

    public a(CoroutineContext coroutineContext, boolean z) {
        super(z);
        S((d1) coroutineContext.j(u.e));
        this.i = coroutineContext.o(this);
    }

    @Override // com.gamericefishpro.space.pi.l1
    public final String A() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // com.gamericefishpro.space.pi.l1
    public final void R(com.gamericefishpro.space.bb.n nVar) {
        a0.p(nVar, this.i);
    }

    @Override // com.gamericefishpro.space.pi.l1
    public final void b0(Object obj) {
        if (!(obj instanceof q)) {
            k0(obj);
        } else {
            q qVar = (q) obj;
            j0(qVar.a, q.b.get(qVar) == 1);
        }
    }

    @Override // com.gamericefishpro.space.th.a
    public final CoroutineContext getContext() {
        return this.i;
    }

    @Override // com.gamericefishpro.space.pi.x
    public final CoroutineContext l() {
        return this.i;
    }

    public final void l0(y yVar, a aVar, Function2 function2) {
        Object objInvoke;
        int iOrdinal = yVar.ordinal();
        if (iOrdinal == 0) {
            com.gamericefishpro.space.a.a.E(function2, aVar, this);
            return;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                Intrinsics.checkNotNullParameter(function2, "<this>");
                Intrinsics.checkNotNullParameter(this, "completion");
                com.gamericefishpro.space.th.a aVarB = com.gamericefishpro.space.uh.f.b(com.gamericefishpro.space.uh.f.a(aVar, this, function2));
                com.gamericefishpro.space.oh.n nVar = com.gamericefishpro.space.oh.p.d;
                aVarB.resumeWith(Unit.a);
                return;
            }
            if (iOrdinal != 3) {
                throw new com.gamericefishpro.space.oh.k();
            }
            Intrinsics.checkNotNullParameter(this, "completion");
            try {
                CoroutineContext coroutineContext = this.i;
                Object objC = com.gamericefishpro.space.ui.t.c(coroutineContext, null);
                try {
                    Intrinsics.checkNotNullParameter(this, "frame");
                    if (function2 instanceof com.gamericefishpro.space.vh.a) {
                        com.gamericefishpro.space.ei.e0.c(2, function2);
                        objInvoke = function2.invoke(aVar, this);
                    } else {
                        objInvoke = com.gamericefishpro.space.uh.f.c(function2, aVar, this);
                    }
                    com.gamericefishpro.space.ui.t.a(coroutineContext, objC);
                    if (objInvoke != com.gamericefishpro.space.uh.a.d) {
                        com.gamericefishpro.space.oh.n nVar2 = com.gamericefishpro.space.oh.p.d;
                        resumeWith(objInvoke);
                    }
                } catch (Throwable th) {
                    com.gamericefishpro.space.ui.t.a(coroutineContext, objC);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                if (th instanceof g0) {
                    th = ((g0) th).d;
                }
                com.gamericefishpro.space.oh.n nVar3 = com.gamericefishpro.space.oh.p.d;
                resumeWith(com.gamericefishpro.space.wa.b.q(th));
            }
        }
    }

    @Override // com.gamericefishpro.space.th.a
    public final void resumeWith(Object obj) {
        Throwable thA = com.gamericefishpro.space.oh.p.a(obj);
        if (thA != null) {
            obj = new q(thA, false);
        }
        Object objX = X(obj);
        if (objX == a0.e) {
            return;
        }
        q(objX);
    }

    public void k0(Object obj) {
    }

    public void j0(Throwable th, boolean z) {
    }
}
