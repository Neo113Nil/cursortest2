package com.gamericefishpro.space.si;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 implements com.gamericefishpro.space.pi.m0 {
    public final d0 d;
    public final long e;
    public final Object i;
    public final com.gamericefishpro.space.pi.h v;

    public b0(d0 d0Var, long j, Object obj, com.gamericefishpro.space.pi.h hVar) {
        this.d = d0Var;
        this.e = j;
        this.i = obj;
        this.v = hVar;
    }

    @Override // com.gamericefishpro.space.pi.m0
    public final void a() {
        d0 d0Var = this.d;
        synchronized (d0Var) {
            if (this.e < d0Var.o()) {
                return;
            }
            Object[] objArr = d0Var.A;
            Intrinsics.b(objArr);
            long j = this.e;
            if (objArr[((int) j) & (objArr.length - 1)] != this) {
                return;
            }
            e0.d(objArr, j, e0.a);
            d0Var.j();
            Unit unit = Unit.a;
        }
    }
}
