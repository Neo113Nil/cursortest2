package com.gamericefishpro.space.f1;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends e0 {
    public com.gamericefishpro.space.w0.b c;
    public int d;
    public int e;

    public b0(long j, com.gamericefishpro.space.w0.b bVar) {
        super(j);
        this.c = bVar;
    }

    @Override // com.gamericefishpro.space.f1.e0
    public final void a(e0 e0Var) {
        synchronized (v.a) {
            Intrinsics.c(e0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.StateListStateRecord>");
            this.c = ((b0) e0Var).c;
            this.d = ((b0) e0Var).d;
            this.e = ((b0) e0Var).e;
            Unit unit = Unit.a;
        }
    }

    @Override // com.gamericefishpro.space.f1.e0
    public final e0 b(long j) {
        return new b0(j, this.c);
    }
}
