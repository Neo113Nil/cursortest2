package com.gamericefishpro.space.pi;

import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 extends r0 {
    public final h i;
    public final /* synthetic */ t0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(t0 t0Var, long j, h hVar) {
        super(j);
        this.v = t0Var;
        this.i = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws g0 {
        this.i.C(this.v, Unit.a);
    }

    @Override // com.gamericefishpro.space.pi.r0
    public final String toString() {
        return super.toString() + this.i;
    }
}
