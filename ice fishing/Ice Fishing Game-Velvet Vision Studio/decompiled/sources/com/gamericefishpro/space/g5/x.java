package com.gamericefishpro.space.g5;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.t0.k2;
import com.gamericefishpro.space.w.h0;
import com.gamericefishpro.space.w.l1;
import com.gamericefishpro.space.w.m0;
import com.gamericefishpro.space.w.s0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends com.gamericefishpro.space.vh.i implements Function2 {
    public final /* synthetic */ int d = 0;
    public int e;
    public float i;
    public /* synthetic */ Object v;
    public final /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(float f, s0 s0Var, com.gamericefishpro.space.f5.k kVar, com.gamericefishpro.space.th.a aVar) {
        super(2, aVar);
        this.i = f;
        this.v = s0Var;
        this.w = kVar;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new x(this.i, (s0) this.v, (com.gamericefishpro.space.f5.k) this.w, aVar);
            case 1:
                return new x((com.gamericefishpro.space.b2.p) this.v, this.i, (com.gamericefishpro.space.w.i) this.w, aVar);
            default:
                x xVar = new x((l1) this.w, aVar);
                xVar.v = obj;
                return xVar;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        com.gamericefishpro.space.pi.x xVar = (com.gamericefishpro.space.pi.x) obj;
        com.gamericefishpro.space.th.a aVar = (com.gamericefishpro.space.th.a) obj2;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                break;
            case 1:
                break;
        }
        return ((x) create(xVar, aVar)).invokeSuspend(Unit.a);
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        Object objA;
        final float fK;
        com.gamericefishpro.space.pi.x xVar;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                s0 s0Var = (s0) this.v;
                float f = this.i;
                com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
                int i = this.e;
                if (i != 0) {
                    if (i == 1) {
                        com.gamericefishpro.space.wa.b.P(obj);
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.gamericefishpro.space.wa.b.P(obj);
                    }
                    return Unit.a;
                }
                com.gamericefishpro.space.wa.b.P(obj);
                if (f > 0.0f) {
                    this.e = 1;
                    if (s0Var.z(f, s0Var.e.getValue(), this) == aVar) {
                        return aVar;
                    }
                }
                if (f == 0.0f) {
                    com.gamericefishpro.space.f5.k kVar = (com.gamericefishpro.space.f5.k) this.w;
                    this.e = 2;
                    l1 l1Var = s0Var.w;
                    if (l1Var == null) {
                        objA = Unit.a;
                    } else if ((Intrinsics.a(s0Var.i.getValue(), kVar) && Intrinsics.a(s0Var.e.getValue(), kVar)) || (objA = h0.a(s0Var.D, new m0(s0Var, kVar, l1Var, null), this)) != aVar) {
                        objA = Unit.a;
                    }
                    if (objA == aVar) {
                        return aVar;
                    }
                }
                return Unit.a;
            case 1:
                com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
                int i2 = this.e;
                if (i2 == 0) {
                    com.gamericefishpro.space.wa.b.P(obj);
                    com.gamericefishpro.space.w.b bVar = (com.gamericefishpro.space.w.b) ((com.gamericefishpro.space.b2.p) this.v).c;
                    Float f2 = new Float(this.i);
                    com.gamericefishpro.space.w.i iVar = (com.gamericefishpro.space.w.i) this.w;
                    this.e = 1;
                    if (com.gamericefishpro.space.w.b.b(bVar, f2, iVar, null, this, 12) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.gamericefishpro.space.wa.b.P(obj);
                }
                return Unit.a;
            default:
                com.gamericefishpro.space.uh.a aVar3 = com.gamericefishpro.space.uh.a.d;
                int i3 = this.e;
                if (i3 == 0) {
                    com.gamericefishpro.space.wa.b.P(obj);
                    com.gamericefishpro.space.pi.x xVar2 = (com.gamericefishpro.space.pi.x) this.v;
                    fK = com.gamericefishpro.space.w.c.k(xVar2.l());
                    xVar = xVar2;
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fK = this.i;
                    xVar = (com.gamericefishpro.space.pi.x) this.v;
                    com.gamericefishpro.space.wa.b.P(obj);
                }
                while (com.gamericefishpro.space.pi.a0.r(xVar)) {
                    final l1 l1Var2 = (l1) this.w;
                    Function1 function1 = new Function1() { // from class: com.gamericefishpro.space.w.j1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            long jLongValue = ((Long) obj2).longValue();
                            l1 l1Var3 = l1Var2;
                            boolean zG = l1Var3.g();
                            com.gamericefishpro.space.t0.d1 d1Var = l1Var3.g;
                            if (!zG) {
                                if (((k2) com.gamericefishpro.space.f1.p.t(d1Var.e, d1Var)).c == Long.MIN_VALUE) {
                                    d1Var.g(jLongValue);
                                    ((com.gamericefishpro.space.t0.f1) l1Var3.a.d).setValue(Boolean.TRUE);
                                }
                                long jB = jLongValue - ((k2) com.gamericefishpro.space.f1.p.t(d1Var.e, d1Var)).c;
                                float f3 = fK;
                                if (f3 != 0.0f) {
                                    jB = com.gamericefishpro.space.gi.c.b(jB / ((double) f3));
                                }
                                l1Var3.n(jB);
                                l1Var3.h(f3 == 0.0f, jB);
                            }
                            return Unit.a;
                        }
                    };
                    this.v = xVar;
                    this.i = fK;
                    this.e = 1;
                    if (com.gamericefishpro.space.t0.i.s(getContext()).E(function1, this) == aVar3) {
                        return aVar3;
                    }
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.gamericefishpro.space.b2.p pVar, float f, com.gamericefishpro.space.w.i iVar, com.gamericefishpro.space.th.a aVar) {
        super(2, aVar);
        this.v = pVar;
        this.i = f;
        this.w = iVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(l1 l1Var, com.gamericefishpro.space.th.a aVar) {
        super(2, aVar);
        this.w = l1Var;
    }
}
