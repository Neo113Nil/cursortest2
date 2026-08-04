package com.gamericefishpro.space.si;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends com.gamericefishpro.space.vh.i implements com.gamericefishpro.space.di.c {
    public final /* synthetic */ int d = 2;
    public int e;
    public /* synthetic */ f i;
    public /* synthetic */ Object v;
    public final /* synthetic */ com.gamericefishpro.space.vh.i w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.gamericefishpro.space.l4.n nVar, com.gamericefishpro.space.th.a aVar) {
        super(3, aVar);
        this.w = nVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.gamericefishpro.space.vh.i, kotlin.jvm.functions.Function2] */
    @Override // com.gamericefishpro.space.di.c
    public final Object a(Object obj, Object obj2, Object obj3) {
        f fVar = (f) obj;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                q qVar = new q((Function2) this.w, (com.gamericefishpro.space.th.a) obj3);
                qVar.i = fVar;
                qVar.v = obj2;
                return qVar.invokeSuspend(Unit.a);
            case 1:
                q qVar2 = new q((com.gamericefishpro.space.th.a) obj3, (com.gamericefishpro.space.s7.f) this.w);
                qVar2.i = fVar;
                qVar2.v = (Object[]) obj2;
                return qVar2.invokeSuspend(Unit.a);
            default:
                q qVar3 = new q((com.gamericefishpro.space.l4.n) this.w, (com.gamericefishpro.space.th.a) obj3);
                qVar3.i = fVar;
                qVar3.v = (Object[]) obj2;
                return qVar3.invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [com.gamericefishpro.space.vh.i, kotlin.jvm.functions.Function2] */
    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        f fVar;
        f fVar2;
        f fVar3;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
                int i = this.e;
                if (i != 0) {
                    if (i == 1) {
                        fVar = this.i;
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
                fVar = this.i;
                Object obj2 = this.v;
                this.i = fVar;
                this.e = 1;
                obj = this.w.invoke(obj2, this);
                if (obj == aVar) {
                    return aVar;
                }
                this.i = null;
                this.e = 2;
                if (fVar.d(obj, this) == aVar) {
                    return aVar;
                }
                return Unit.a;
            case 1:
                com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
                int i2 = this.e;
                if (i2 != 0) {
                    if (i2 == 1) {
                        fVar2 = this.i;
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
                fVar2 = this.i;
                Object[] objArr = (Object[]) this.v;
                com.gamericefishpro.space.s7.f fVar4 = (com.gamericefishpro.space.s7.f) this.w;
                Object obj3 = objArr[0];
                Object obj4 = objArr[1];
                Object obj5 = objArr[2];
                this.i = fVar2;
                this.e = 1;
                obj = fVar4.c(obj3, obj4, obj5, this);
                if (obj == aVar2) {
                    return aVar2;
                }
                this.i = null;
                this.e = 2;
                if (fVar2.d(obj, this) == aVar2) {
                    return aVar2;
                }
                return Unit.a;
            default:
                com.gamericefishpro.space.uh.a aVar3 = com.gamericefishpro.space.uh.a.d;
                int i3 = this.e;
                if (i3 != 0) {
                    if (i3 == 1) {
                        fVar3 = this.i;
                        com.gamericefishpro.space.wa.b.P(obj);
                    } else {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.gamericefishpro.space.wa.b.P(obj);
                    }
                    return Unit.a;
                }
                com.gamericefishpro.space.wa.b.P(obj);
                fVar3 = this.i;
                Object[] objArr2 = (Object[]) this.v;
                com.gamericefishpro.space.l4.n nVar = (com.gamericefishpro.space.l4.n) this.w;
                Object obj6 = objArr2[0];
                Object obj7 = objArr2[1];
                this.i = fVar3;
                this.e = 1;
                obj = nVar.a(obj6, obj7, this);
                if (obj == aVar3) {
                    return aVar3;
                }
                this.i = null;
                this.e = 2;
                if (fVar3.d(obj, this) == aVar3) {
                    return aVar3;
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.gamericefishpro.space.th.a aVar, com.gamericefishpro.space.s7.f fVar) {
        super(3, aVar);
        this.w = fVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public q(Function2 function2, com.gamericefishpro.space.th.a aVar) {
        super(3, aVar);
        this.w = (com.gamericefishpro.space.vh.i) function2;
    }
}
