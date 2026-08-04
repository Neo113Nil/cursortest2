package com.gamericefishpro.space.n9;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class t3 implements Runnable {
    public final long d;
    public final long e;
    public final /* synthetic */ com.gamericefishpro.space.u6.s i;

    public t3(com.gamericefishpro.space.u6.s sVar, long j, long j2) {
        Objects.requireNonNull(sVar);
        this.i = sVar;
        this.d = j;
        this.e = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p1 p1Var = ((r1) ((w3) this.i.i).d).z;
        r1.l(p1Var);
        p1Var.A(new com.gamericefishpro.space.h4.b(10, this));
    }
}
