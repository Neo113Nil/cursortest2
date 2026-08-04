package com.gamericefishpro.space.q0;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.z.u1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t0 implements Function1 {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ float e;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object v;

    public /* synthetic */ t0(com.gamericefishpro.space.f2.u0 u0Var, v0 v0Var, float f) {
        this.i = u0Var;
        this.v = v0Var;
        this.e = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                com.gamericefishpro.space.f2.u0 u0Var = (com.gamericefishpro.space.f2.u0) this.i;
                com.gamericefishpro.space.f2.t0 t0Var = (com.gamericefishpro.space.f2.t0) obj;
                com.gamericefishpro.space.w.b bVar = ((v0) this.v).L;
                com.gamericefishpro.space.f2.t0.l(t0Var, u0Var, (int) (bVar != null ? ((Number) bVar.c()).floatValue() : this.e), 0);
                break;
            default:
                u1 u1Var = (u1) this.i;
                Function1 function1 = (Function1) this.v;
                long jLongValue = ((Long) obj).longValue();
                if (u1Var.b == Long.MIN_VALUE) {
                    u1Var.b = jLongValue;
                }
                float f = u1Var.e;
                com.gamericefishpro.space.w.k kVar = new com.gamericefishpro.space.w.k(f);
                float f2 = this.e;
                com.gamericefishpro.space.w.k kVar2 = u1.f;
                long jB = f2 == 0.0f ? u1Var.a.b(new com.gamericefishpro.space.w.k(f), kVar2, u1Var.c) : com.gamericefishpro.space.gi.c.b((jLongValue - u1Var.b) / f2);
                float f3 = ((com.gamericefishpro.space.w.k) u1Var.a.r(jB, kVar, kVar2, u1Var.c)).a;
                u1Var.c = (com.gamericefishpro.space.w.k) u1Var.a.f(jB, kVar, kVar2, u1Var.c);
                u1Var.b = jLongValue;
                float f4 = u1Var.e - f3;
                u1Var.e = f3;
                function1.invoke(Float.valueOf(f4));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ t0(u1 u1Var, float f, Function1 function1) {
        this.i = u1Var;
        this.e = f;
        this.v = function1;
    }
}
