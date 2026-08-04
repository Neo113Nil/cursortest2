package com.gamericefishpro.space.pi;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class m1 extends s1 {
    public final com.gamericefishpro.space.th.a v;

    public m1(CoroutineContext coroutineContext, Function2 function2) {
        super(coroutineContext, false);
        this.v = com.gamericefishpro.space.uh.f.a(this, this, function2);
    }

    @Override // com.gamericefishpro.space.pi.l1
    public final void c0() throws Throwable {
        try {
            com.gamericefishpro.space.th.a aVarB = com.gamericefishpro.space.uh.f.b(this.v);
            com.gamericefishpro.space.oh.n nVar = com.gamericefishpro.space.oh.p.d;
            com.gamericefishpro.space.ui.a.g(aVarB, Unit.a);
        } catch (Throwable th) {
            th = th;
            if (th instanceof g0) {
                th = ((g0) th).d;
            }
            com.gamericefishpro.space.oh.n nVar2 = com.gamericefishpro.space.oh.p.d;
            resumeWith(com.gamericefishpro.space.wa.b.q(th));
            throw th;
        }
    }
}
