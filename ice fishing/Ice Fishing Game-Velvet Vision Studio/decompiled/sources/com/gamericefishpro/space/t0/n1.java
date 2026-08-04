package com.gamericefishpro.space.t0;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class n1 implements v0, com.gamericefishpro.space.pi.x {
    public final /* synthetic */ v0 d;
    public final CoroutineContext e;

    public n1(v0 v0Var, CoroutineContext coroutineContext) {
        this.d = v0Var;
        this.e = coroutineContext;
    }

    @Override // com.gamericefishpro.space.t0.s2
    public final Object getValue() {
        return this.d.getValue();
    }

    @Override // com.gamericefishpro.space.pi.x
    public final CoroutineContext l() {
        return this.e;
    }

    @Override // com.gamericefishpro.space.t0.v0
    public final void setValue(Object obj) {
        this.d.setValue(obj);
    }
}
