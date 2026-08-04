package com.gamericefishpro.space.si;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 implements l0, e, com.gamericefishpro.space.ti.q {
    public final /* synthetic */ n0 d;

    public a0(n0 n0Var) {
        this.d = n0Var;
    }

    @Override // com.gamericefishpro.space.si.e
    public final Object a(f fVar, com.gamericefishpro.space.th.a aVar) {
        this.d.a(fVar, aVar);
        return com.gamericefishpro.space.uh.a.d;
    }

    @Override // com.gamericefishpro.space.ti.q
    public final e b(CoroutineContext coroutineContext, int i, com.gamericefishpro.space.ri.a aVar) {
        return ((((i < 0 || i >= 2) && i != -2) || aVar != com.gamericefishpro.space.ri.a.e) && !((i == 0 || i == -3) && aVar == com.gamericefishpro.space.ri.a.d)) ? new com.gamericefishpro.space.ti.g(this, coroutineContext, i, aVar) : this;
    }

    @Override // com.gamericefishpro.space.si.l0
    public final Object getValue() {
        return this.d.getValue();
    }
}
