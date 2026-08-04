package com.gamericefishpro.space.t0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class k2 extends com.gamericefishpro.space.f1.e0 {
    public long c;

    public k2(long j, long j2) {
        super(j);
        this.c = j2;
    }

    @Override // com.gamericefishpro.space.f1.e0
    public final void a(com.gamericefishpro.space.f1.e0 e0Var) {
        Intrinsics.c(e0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.c = ((k2) e0Var).c;
    }

    @Override // com.gamericefishpro.space.f1.e0
    public final com.gamericefishpro.space.f1.e0 b(long j) {
        return new k2(j, this.c);
    }
}
