package com.gamericefishpro.space.w;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 extends com.gamericefishpro.space.vh.i implements Function2 {
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object v;
    public final /* synthetic */ s0 w;
    public final /* synthetic */ l1 y;
    public final /* synthetic */ float z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(Object obj, Object obj2, s0 s0Var, l1 l1Var, float f, com.gamericefishpro.space.th.a aVar) {
        super(2, aVar);
        this.i = obj;
        this.v = obj2;
        this.w = s0Var;
        this.y = l1Var;
        this.z = f;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
        o0 o0Var = new o0(this.i, this.v, this.w, this.y, this.z, aVar);
        o0Var.e = obj;
        return o0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o0) create((com.gamericefishpro.space.pi.x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
        int i = this.d;
        s0 s0Var = this.w;
        if (i == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            com.gamericefishpro.space.pi.x xVar = (com.gamericefishpro.space.pi.x) this.e;
            Object obj2 = this.i;
            Object obj3 = this.v;
            if (Intrinsics.a(obj2, obj3)) {
                s0Var.G = null;
                if (Intrinsics.a(s0Var.i.getValue(), obj2)) {
                    return Unit.a;
                }
            } else {
                s0.s(s0Var);
            }
            boolean zA = Intrinsics.a(obj2, obj3);
            float f = this.z;
            if (!zA) {
                l1 l1Var = this.y;
                l1Var.p(obj2);
                l1Var.n(0L);
                s0Var.e.setValue(obj2);
                l1Var.j(f);
            }
            s0Var.B(f);
            if (s0Var.F.i()) {
                com.gamericefishpro.space.pi.a0.u(xVar, null, new com.gamericefishpro.space.b2.e0(s0Var, null, 14), 3);
            } else {
                s0Var.E = Long.MIN_VALUE;
            }
            this.d = 1;
            if (s0.v(s0Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.gamericefishpro.space.wa.b.P(obj);
        }
        s0Var.A();
        return Unit.a;
    }
}
