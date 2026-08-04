package com.gamericefishpro.space.m1;

import com.gamericefishpro.space.t.d0;
import com.gamericefishpro.space.t.i0;
import com.gamericefishpro.space.t.q0;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    public final k a;
    public final com.gamericefishpro.space.i2.t b;
    public final i0 c;
    public final i0 d;
    public boolean e;

    public e(k kVar, com.gamericefishpro.space.i2.t tVar) {
        this.a = kVar;
        this.b = tVar;
        i0 i0Var = q0.a;
        this.c = new i0();
        this.d = new i0();
    }

    public final void a() {
        if (this.e) {
            return;
        }
        com.gamericefishpro.space.i2.o oVar = new com.gamericefishpro.space.i2.o(0, this, e.class, "invalidateNodes", "invalidateNodes()V", 0, 1);
        d0 d0Var = this.b.P0;
        if (d0Var.g(oVar) < 0) {
            d0Var.a(oVar);
        }
        this.e = true;
    }
}
