package com.gamericefishpro.space.v;

import com.gamericefishpro.space.f2.t0;
import com.gamericefishpro.space.f2.u0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends com.gamericefishpro.space.ei.l implements Function1 {
    public final /* synthetic */ u0 d;
    public final /* synthetic */ long e;
    public final /* synthetic */ long i;
    public final /* synthetic */ com.gamericefishpro.space.f3.f v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(u0 u0Var, long j, long j2, com.gamericefishpro.space.f3.f fVar) {
        super(1);
        this.d = u0Var;
        this.e = j;
        this.i = j2;
        this.v = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        t0 t0Var = (t0) obj;
        long j = this.e;
        long j2 = this.i;
        t0Var.getClass();
        u0 u0Var = this.d;
        t0.a(t0Var, u0Var);
        u0Var.a0(com.gamericefishpro.space.c3.i.c((((long) (((int) (j >> 32)) + ((int) (j2 >> 32)))) << 32) | (((long) (((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L)))) & 4294967295L), u0Var.w), 0.0f, this.v);
        return Unit.a;
    }
}
