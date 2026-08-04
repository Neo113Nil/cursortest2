package com.gamericefishpro.space.t0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class j2 extends com.gamericefishpro.space.f1.e0 {
    public int c;

    public j2(int i, long j) {
        super(j);
        this.c = i;
    }

    @Override // com.gamericefishpro.space.f1.e0
    public final void a(com.gamericefishpro.space.f1.e0 e0Var) {
        Intrinsics.c(e0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.c = ((j2) e0Var).c;
    }

    @Override // com.gamericefishpro.space.f1.e0
    public final com.gamericefishpro.space.f1.e0 b(long j) {
        return new j2(this.c, j);
    }
}
