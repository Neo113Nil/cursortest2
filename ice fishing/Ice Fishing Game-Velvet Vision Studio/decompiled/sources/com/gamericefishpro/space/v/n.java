package com.gamericefishpro.space.v;

import com.gamericefishpro.space.f2.t0;
import com.gamericefishpro.space.f2.u0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends com.gamericefishpro.space.ei.l implements Function1 {
    public final /* synthetic */ p d;
    public final /* synthetic */ u0 e;
    public final /* synthetic */ long i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p pVar, u0 u0Var, long j) {
        super(1);
        this.d = pVar;
        this.e = u0Var;
        this.i = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        com.gamericefishpro.space.h1.e eVar = this.d.J.b;
        u0 u0Var = this.e;
        t0.k((t0) obj, u0Var, eVar.a((((long) u0Var.e) & 4294967295L) | (((long) u0Var.d) << 32), this.i, com.gamericefishpro.space.c3.l.d));
        return Unit.a;
    }
}
