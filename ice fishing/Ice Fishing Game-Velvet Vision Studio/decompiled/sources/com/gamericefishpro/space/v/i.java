package com.gamericefishpro.space.v;

import com.gamericefishpro.space.f2.t0;
import com.gamericefishpro.space.f2.u0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends com.gamericefishpro.space.ei.l implements Function1 {
    public final /* synthetic */ u0[] d;
    public final /* synthetic */ j e;
    public final /* synthetic */ int i;
    public final /* synthetic */ int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(u0[] u0VarArr, j jVar, int i, int i2) {
        super(1);
        this.d = u0VarArr;
        this.e = jVar;
        this.i = i;
        this.v = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        t0 t0Var = (t0) obj;
        for (u0 u0Var : this.d) {
            if (u0Var != null) {
                long jA = this.e.a.b.a((((long) u0Var.d) << 32) | (((long) u0Var.e) & 4294967295L), (((long) this.i) << 32) | (((long) this.v) & 4294967295L), com.gamericefishpro.space.c3.l.d);
                t0Var.h(u0Var, (int) (jA >> 32), (int) (jA & 4294967295L), 0.0f);
            }
        }
        return Unit.a;
    }
}
