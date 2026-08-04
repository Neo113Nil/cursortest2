package com.gamericefishpro.space.ic;

import com.gamericefishpro.space.ri.i;
import com.gamericefishpro.space.ri.j;
import com.gamericefishpro.space.ri.k;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    private final i channel = com.gamericefishpro.space.hj.c.a(-1, 6, null);

    public final Object waitForWake(com.gamericefishpro.space.th.a aVar) {
        return this.channel.a(aVar);
    }

    public final void wake() {
        Object objK = this.channel.k(null);
        if (objK instanceof k) {
            j jVar = objK instanceof j ? (j) objK : null;
            throw new Exception("Waiter.wait failed", jVar != null ? jVar.a : null);
        }
    }
}
