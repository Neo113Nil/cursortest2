package com.gamericefishpro.space.u8;

import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends com.gamericefishpro.space.p9.c {
    public final WeakReference d;

    public o(r rVar) {
        this.d = new WeakReference(rVar);
    }

    @Override // com.gamericefishpro.space.p9.d
    public final void a(com.gamericefishpro.space.p9.g gVar) {
        r rVar = (r) this.d.get();
        if (rVar == null) {
            return;
        }
        x xVar = rVar.d;
        l lVar = new l(rVar, rVar, gVar);
        s sVar = xVar.h;
        sVar.sendMessage(sVar.obtainMessage(1, lVar));
    }
}
