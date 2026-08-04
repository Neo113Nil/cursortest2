package com.gamericefishpro.space.l4;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.i2.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends com.gamericefishpro.space.vh.i implements Function2 {
    public final /* synthetic */ int d;
    public int e;
    public final /* synthetic */ c0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(c0 c0Var, com.gamericefishpro.space.th.a aVar, int i) {
        super(2, aVar);
        this.d = i;
        this.i = c0Var;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new m(this.i, aVar, 0);
            case 1:
                return new m(this.i, aVar, 1);
            default:
                return new m(this.i, aVar, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((m) create((com.gamericefishpro.space.si.f) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((m) create((com.gamericefishpro.space.pi.x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            default:
                return ((m) create((com.gamericefishpro.space.pi.x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
        }
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
                int i = this.e;
                if (i == 0) {
                    com.gamericefishpro.space.wa.b.P(obj);
                    this.e = 1;
                    if (c0.c(this.i, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.gamericefishpro.space.wa.b.P(obj);
                }
                return Unit.a;
            case 1:
                com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
                int i2 = this.e;
                c0 c0Var = this.i;
                if (i2 != 0) {
                    if (i2 == 1) {
                        com.gamericefishpro.space.wa.b.P(obj);
                    } else {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.gamericefishpro.space.wa.b.P(obj);
                    }
                    return Unit.a;
                }
                com.gamericefishpro.space.wa.b.P(obj);
                com.gamericefishpro.space.u6.i iVar = c0Var.B;
                this.e = 1;
                Object objR = ((com.gamericefishpro.space.pi.n) iVar.b).r(this);
                if (objR != aVar2) {
                    objR = Unit.a;
                }
                if (objR == aVar2) {
                    return aVar2;
                }
                com.gamericefishpro.space.si.e eVarE = com.gamericefishpro.space.si.e0.e(c0Var.f().c, -1);
                h2 h2Var = new h2(1, c0Var);
                this.e = 2;
                if (eVarE.a(h2Var, this) == aVar2) {
                    return aVar2;
                }
                return Unit.a;
            default:
                c0 c0Var2 = this.i;
                d0 d0Var = c0Var2.A;
                com.gamericefishpro.space.uh.a aVar3 = com.gamericefishpro.space.uh.a.d;
                int i3 = this.e;
                try {
                    if (i3 != 0) {
                        if (i3 == 1) {
                            com.gamericefishpro.space.wa.b.P(obj);
                        } else {
                            if (i3 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            com.gamericefishpro.space.wa.b.P(obj);
                        }
                        return (u0) obj;
                    }
                    com.gamericefishpro.space.wa.b.P(obj);
                    if (d0Var.b() instanceof n0) {
                        return d0Var.b();
                    }
                    this.e = 1;
                    if (c0Var2.g(this) == aVar3) {
                        return aVar3;
                    }
                    this.e = 2;
                    obj = c0.d(c0Var2, false, this);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                    return (u0) obj;
                } catch (Throwable th) {
                    return new p0(th, -1);
                }
        }
    }
}
