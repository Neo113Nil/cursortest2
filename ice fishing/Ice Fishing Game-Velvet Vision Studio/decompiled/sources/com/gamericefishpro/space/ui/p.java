package com.gamericefishpro.space.ui;

import com.gamericefishpro.space.pi.a0;
import com.gamericefishpro.space.pi.g0;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class p extends com.gamericefishpro.space.pi.a implements com.gamericefishpro.space.vh.d {
    public final com.gamericefishpro.space.th.a v;

    public p(com.gamericefishpro.space.th.a aVar, CoroutineContext coroutineContext) {
        super(coroutineContext, true);
        this.v = aVar;
    }

    @Override // com.gamericefishpro.space.pi.l1
    public final boolean V() {
        return true;
    }

    @Override // com.gamericefishpro.space.vh.d
    public final com.gamericefishpro.space.vh.d getCallerFrame() {
        com.gamericefishpro.space.th.a aVar = this.v;
        if (aVar instanceof com.gamericefishpro.space.vh.d) {
            return (com.gamericefishpro.space.vh.d) aVar;
        }
        return null;
    }

    @Override // com.gamericefishpro.space.pi.l1
    public void m(Object obj) throws g0 {
        a.g(com.gamericefishpro.space.uh.f.b(this.v), a0.w(obj));
    }

    @Override // com.gamericefishpro.space.pi.l1
    public void q(Object obj) {
        this.v.resumeWith(a0.w(obj));
    }

    public void m0() {
    }
}
