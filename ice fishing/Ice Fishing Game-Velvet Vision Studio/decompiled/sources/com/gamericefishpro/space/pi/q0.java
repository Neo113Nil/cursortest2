package com.gamericefishpro.space.pi;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 extends r0 {
    public final z1 i;

    public q0(long j, z1 z1Var) {
        super(j);
        this.i = z1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.i.run();
    }

    @Override // com.gamericefishpro.space.pi.r0
    public final String toString() {
        return super.toString() + this.i;
    }
}
