package com.gamericefishpro.space.d0;

import com.gamericefishpro.space.h2.r1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 extends com.gamericefishpro.space.h1.l implements r1 {
    public float H;
    public boolean I;

    @Override // com.gamericefishpro.space.h2.r1
    public final Object d0(Object obj) {
        a1 a1Var = obj instanceof a1 ? (a1) obj : null;
        if (a1Var == null) {
            a1Var = new a1();
            a1Var.a = 0.0f;
            a1Var.b = true;
        }
        a1Var.a = this.H;
        a1Var.b = this.I;
        return a1Var;
    }
}
