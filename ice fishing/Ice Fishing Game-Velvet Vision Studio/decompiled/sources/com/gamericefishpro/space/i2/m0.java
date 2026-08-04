package com.gamericefishpro.space.i2;

import android.view.Choreographer;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 implements Choreographer.FrameCallback {
    public final /* synthetic */ com.gamericefishpro.space.pi.h d;
    public final /* synthetic */ Function1 e;

    public m0(com.gamericefishpro.space.pi.h hVar, n0 n0Var, Function1 function1) {
        this.d = hVar;
        this.e = function1;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        Object objQ;
        Function1 function1 = this.e;
        try {
            com.gamericefishpro.space.oh.n nVar = com.gamericefishpro.space.oh.p.d;
            objQ = function1.invoke(Long.valueOf(j));
        } catch (Throwable th) {
            com.gamericefishpro.space.oh.n nVar2 = com.gamericefishpro.space.oh.p.d;
            objQ = com.gamericefishpro.space.wa.b.q(th);
        }
        this.d.resumeWith(objQ);
    }
}
