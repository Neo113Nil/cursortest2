package com.gamericefishpro.space.t0;

import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends com.gamericefishpro.space.b1.c {
    public com.gamericefishpro.space.pi.h a;
    public Function1 b;

    @Override // com.gamericefishpro.space.b1.c
    public final void a() {
        this.b = null;
        this.a = null;
    }

    @Override // com.gamericefishpro.space.b1.c
    public final void b(Throwable th) {
        com.gamericefishpro.space.pi.h hVar = this.a;
        if (hVar != null) {
            com.gamericefishpro.space.oh.n nVar = com.gamericefishpro.space.oh.p.d;
            hVar.resumeWith(com.gamericefishpro.space.wa.b.q(th));
        }
    }
}
