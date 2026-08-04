package com.gamericefishpro.space.d0;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.i9.a4;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object v;

    public /* synthetic */ x(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.i = obj;
        this.v = obj2;
        this.e = obj3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((Integer) obj2).getClass();
                j.a((com.gamericefishpro.space.h1.m) this.i, (com.gamericefishpro.space.h1.e) this.v, (com.gamericefishpro.space.b1.h) this.e, (com.gamericefishpro.space.t0.r) obj, com.gamericefishpro.space.t0.i.D(3079));
                break;
            case 1:
                ((Integer) obj2).getClass();
                a4.i((com.gamericefishpro.space.f5.k) this.i, (com.gamericefishpro.space.e1.c) this.v, (com.gamericefishpro.space.b1.h) this.e, (com.gamericefishpro.space.t0.r) obj, com.gamericefishpro.space.t0.i.D(385));
                break;
            case 2:
                com.gamericefishpro.space.pi.x xVar = (com.gamericefishpro.space.pi.x) this.i;
                com.gamericefishpro.space.w.s0 s0Var = (com.gamericefishpro.space.w.s0) this.v;
                com.gamericefishpro.space.f5.k kVar = (com.gamericefishpro.space.f5.k) this.e;
                float fFloatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                com.gamericefishpro.space.pi.a0.u(xVar, null, new com.gamericefishpro.space.g5.x(fFloatValue, s0Var, kVar, (com.gamericefishpro.space.th.a) null), 3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                com.gamericefishpro.space.r7.c.a((Function1) this.i, (Function0) this.v, (com.gamericefishpro.space.r7.e) this.e, (com.gamericefishpro.space.t0.r) obj, com.gamericefishpro.space.t0.i.D(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                com.gamericefishpro.space.t7.b.a((Function0) this.i, (Function1) this.v, (com.gamericefishpro.space.t7.d) this.e, (com.gamericefishpro.space.t0.r) obj, com.gamericefishpro.space.t0.i.D(1));
                break;
            default:
                com.gamericefishpro.space.ei.x xVar2 = (com.gamericefishpro.space.ei.x) this.i;
                com.gamericefishpro.space.z.q1 q1Var = (com.gamericefishpro.space.z.q1) this.v;
                com.gamericefishpro.space.z.o1 o1Var = (com.gamericefishpro.space.z.o1) this.e;
                float fFloatValue2 = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                long jH = q1Var.h(q1Var.d(fFloatValue2 - xVar2.d));
                com.gamericefishpro.space.z.q1 q1Var2 = o1Var.a;
                xVar2.d += q1Var.d(q1Var.g(q1Var2.c(q1Var2.k, jH, 1)));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ x(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.d = i2;
        this.i = obj;
        this.v = obj2;
        this.e = obj3;
    }
}
