package com.gamericefishpro.space.l4;

import com.android.installreferrer.api.InstallReferrerClient;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends com.gamericefishpro.space.vh.i implements Function1 {
    public final /* synthetic */ int d = 0;
    public int e;
    public final /* synthetic */ c0 i;
    public Object v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Serializable y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.gamericefishpro.space.ei.a0 a0Var, c0 c0Var, com.gamericefishpro.space.ei.y yVar, com.gamericefishpro.space.th.a aVar) {
        super(1, aVar);
        this.w = a0Var;
        this.i = c0Var;
        this.y = yVar;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [com.gamericefishpro.space.vh.i, kotlin.jvm.functions.Function2] */
    @Override // com.gamericefishpro.space.vh.a
    public final com.gamericefishpro.space.th.a create(com.gamericefishpro.space.th.a aVar) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new y((com.gamericefishpro.space.ei.a0) this.w, this.i, (com.gamericefishpro.space.ei.y) this.y, aVar);
            default:
                return new y(this.i, (CoroutineContext) this.w, (Function2) this.y, aVar);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        com.gamericefishpro.space.th.a aVar = (com.gamericefishpro.space.th.a) obj;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                break;
        }
        return ((y) create(aVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0061  */
    /* JADX WARN: Code duplicated, block: B:26:0x0066  */
    /* JADX WARN: Code duplicated, block: B:28:0x006e  */
    /* JADX WARN: Code duplicated, block: B:33:0x007b  */
    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v2, types: [com.gamericefishpro.space.vh.i, kotlin.jvm.functions.Function2] */
    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        com.gamericefishpro.space.ei.a0 a0Var;
        com.gamericefishpro.space.ei.y yVar;
        d dVar;
        Object obj2;
        int iHashCode;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                com.gamericefishpro.space.ei.y yVar2 = (com.gamericefishpro.space.ei.y) this.y;
                com.gamericefishpro.space.ei.a0 a0Var2 = (com.gamericefishpro.space.ei.a0) this.w;
                com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
                int i = this.e;
                c0 c0Var = this.i;
                try {
                    if (i != 0) {
                        if (i == 1) {
                            a0Var = (com.gamericefishpro.space.ei.a0) ((Serializable) this.v);
                            com.gamericefishpro.space.wa.b.P(obj);
                        } else {
                            if (i != 2) {
                                if (i != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                yVar2 = (com.gamericefishpro.space.ei.y) ((Serializable) this.v);
                                com.gamericefishpro.space.wa.b.P(obj);
                                yVar2.d = ((Number) obj).intValue();
                                return Unit.a;
                            }
                            yVar = (com.gamericefishpro.space.ei.y) ((Serializable) this.v);
                            com.gamericefishpro.space.wa.b.P(obj);
                        }
                        yVar.d = ((Number) obj).intValue();
                        return Unit.a;
                    }
                    com.gamericefishpro.space.wa.b.P(obj);
                    this.v = a0Var2;
                    this.e = 1;
                    obj = c0Var.h(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    a0Var = a0Var2;
                    a0Var.d = obj;
                    t0 t0VarF = c0Var.f();
                    this.v = yVar2;
                    this.e = 2;
                    obj = t0VarF.a();
                    if (obj == aVar) {
                        return aVar;
                    }
                    yVar = yVar2;
                    yVar.d = ((Number) obj).intValue();
                    return Unit.a;
                } catch (b unused) {
                    Object obj3 = a0Var2.d;
                    this.v = yVar2;
                    this.e = 3;
                    obj = c0Var.i(obj3, true, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
            default:
                com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
                int i2 = this.e;
                c0 c0Var2 = this.i;
                if (i2 != 0) {
                    if (i2 == 1) {
                        com.gamericefishpro.space.wa.b.P(obj);
                    } else {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Object obj4 = this.v;
                            com.gamericefishpro.space.wa.b.P(obj);
                            return obj4;
                        }
                        dVar = (d) this.v;
                        com.gamericefishpro.space.wa.b.P(obj);
                    }
                    obj2 = dVar.b;
                    if (obj2 != null) {
                        iHashCode = obj2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    if (iHashCode == dVar.c) {
                        throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                    }
                    if (!Intrinsics.a(dVar.b, obj)) {
                        this.v = obj;
                        this.e = 3;
                        if (c0Var2.i(obj, true, this) == aVar2) {
                            return aVar2;
                        }
                    }
                    return obj;
                }
                com.gamericefishpro.space.wa.b.P(obj);
                this.e = 1;
                obj = c0.e(c0Var2, true, this);
                if (obj == aVar2) {
                    return aVar2;
                }
                dVar = (d) obj;
                CoroutineContext coroutineContext = (CoroutineContext) this.w;
                com.gamericefishpro.space.b0.o oVar = new com.gamericefishpro.space.b0.o((Function2) this.y, dVar, (com.gamericefishpro.space.th.a) null);
                this.v = dVar;
                this.e = 2;
                obj = com.gamericefishpro.space.pi.a0.D(coroutineContext, oVar, this);
                if (obj == aVar2) {
                    return aVar2;
                }
                obj2 = dVar.b;
                if (obj2 != null) {
                    iHashCode = obj2.hashCode();
                } else {
                    iHashCode = 0;
                }
                if (iHashCode == dVar.c) {
                    throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                }
                if (!Intrinsics.a(dVar.b, obj)) {
                    this.v = obj;
                    this.e = 3;
                    if (c0Var2.i(obj, true, this) == aVar2) {
                        return aVar2;
                    }
                }
                return obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public y(c0 c0Var, CoroutineContext coroutineContext, Function2 function2, com.gamericefishpro.space.th.a aVar) {
        super(1, aVar);
        this.i = c0Var;
        this.w = coroutineContext;
        this.y = (com.gamericefishpro.space.vh.i) function2;
    }
}
