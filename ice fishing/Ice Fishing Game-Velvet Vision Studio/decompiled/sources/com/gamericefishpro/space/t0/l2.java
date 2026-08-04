package com.gamericefishpro.space.t0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class l2 extends com.gamericefishpro.space.f1.e0 {
    public Object c;

    public l2(long j, Object obj) {
        super(j);
        this.c = obj;
    }

    @Override // com.gamericefishpro.space.f1.e0
    public final void a(com.gamericefishpro.space.f1.e0 e0Var) {
        Intrinsics.c(e0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord>");
        this.c = ((l2) e0Var).c;
    }

    @Override // com.gamericefishpro.space.f1.e0
    public final com.gamericefishpro.space.f1.e0 b(long j) {
        return new l2(com.gamericefishpro.space.f1.p.j().g(), this.c);
    }
}
