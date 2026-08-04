package com.gamericefishpro.space.v6;

import androidx.work.impl.WorkDatabase;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class p {
    public final com.gamericefishpro.space.x6.a a;
    public final com.gamericefishpro.space.t6.a b;
    public final com.gamericefishpro.space.u6.q c;

    static {
        com.gamericefishpro.space.l6.q.d("WMFgUpdater");
    }

    public p(WorkDatabase workDatabase, com.gamericefishpro.space.m6.f fVar, com.gamericefishpro.space.r5.b bVar) {
        this.b = fVar;
        this.a = bVar;
        this.c = workDatabase.B();
    }
}
