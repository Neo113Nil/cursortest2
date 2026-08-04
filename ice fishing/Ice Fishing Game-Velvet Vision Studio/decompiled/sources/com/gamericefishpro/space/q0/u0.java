package com.gamericefishpro.space.q0;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 extends com.gamericefishpro.space.vh.i implements Function2 {
    public final /* synthetic */ int d;
    public int e;
    public final /* synthetic */ Object i;
    public /* synthetic */ float v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(com.gamericefishpro.space.n2.c cVar, com.gamericefishpro.space.th.a aVar) {
        super(2, aVar);
        this.d = 2;
        this.i = cVar;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new u0((v0) this.i, this.v, aVar, 0);
            case 1:
                return new u0((v0) this.i, this.v, aVar, 1);
            default:
                u0 u0Var = new u0((com.gamericefishpro.space.n2.c) this.i, aVar);
                u0Var.v = ((Number) obj).floatValue();
                return u0Var;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((u0) create((com.gamericefishpro.space.pi.x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((u0) create((com.gamericefishpro.space.pi.x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            default:
                return ((u0) create(Float.valueOf(((Number) obj).floatValue()), (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
        }
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                v0 v0Var = (v0) this.i;
                com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
                int i = this.e;
                if (i == 0) {
                    com.gamericefishpro.space.wa.b.P(obj);
                    com.gamericefishpro.space.w.b bVar = v0Var.M;
                    if (bVar != null) {
                        Float f = new Float(this.v);
                        com.gamericefishpro.space.w.i iVar = v0Var.K ? p0.f : v0Var.J;
                        this.e = 1;
                        obj = com.gamericefishpro.space.w.b.b(bVar, f, iVar, null, this, 12);
                        if (obj == aVar) {
                            return aVar;
                        }
                    }
                    return Unit.a;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.gamericefishpro.space.wa.b.P(obj);
                return Unit.a;
            case 1:
                v0 v0Var2 = (v0) this.i;
                com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
                int i2 = this.e;
                if (i2 == 0) {
                    com.gamericefishpro.space.wa.b.P(obj);
                    com.gamericefishpro.space.w.b bVar2 = v0Var2.L;
                    if (bVar2 != null) {
                        Float f2 = new Float(this.v);
                        com.gamericefishpro.space.w.i iVar2 = v0Var2.K ? p0.f : v0Var2.J;
                        this.e = 1;
                        obj = com.gamericefishpro.space.w.b.b(bVar2, f2, iVar2, null, this, 12);
                        if (obj == aVar2) {
                            return aVar2;
                        }
                    }
                    return Unit.a;
                }
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.gamericefishpro.space.wa.b.P(obj);
                return Unit.a;
            default:
                com.gamericefishpro.space.n2.c cVar = (com.gamericefishpro.space.n2.c) this.i;
                com.gamericefishpro.space.uh.a aVar3 = com.gamericefishpro.space.uh.a.d;
                int i3 = this.e;
                if (i3 == 0) {
                    com.gamericefishpro.space.wa.b.P(obj);
                    float f3 = this.v;
                    Object objG = cVar.a.d.d.g(com.gamericefishpro.space.o2.k.e);
                    if (objG == null) {
                        objG = null;
                    }
                    Function2 function2 = (Function2) objG;
                    if (function2 == null) {
                        throw com.gamericefishpro.space.m5.a.e("Required value was null.");
                    }
                    com.gamericefishpro.space.n1.b bVar3 = new com.gamericefishpro.space.n1.b((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L));
                    this.e = 1;
                    obj = function2.invoke(bVar3, this);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.gamericefishpro.space.wa.b.P(obj);
                }
                return new Float(Float.intBitsToFloat((int) (((com.gamericefishpro.space.n1.b) obj).a & 4294967295L)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(v0 v0Var, float f, com.gamericefishpro.space.th.a aVar, int i) {
        super(2, aVar);
        this.d = i;
        this.i = v0Var;
        this.v = f;
    }
}
