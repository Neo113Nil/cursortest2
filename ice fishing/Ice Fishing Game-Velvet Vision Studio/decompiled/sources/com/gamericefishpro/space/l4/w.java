package com.gamericefishpro.space.l4;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends com.gamericefishpro.space.vh.i implements Function2 {
    public final /* synthetic */ int d;
    public int e;
    public /* synthetic */ boolean i;
    public final /* synthetic */ c0 v;
    public final /* synthetic */ int w;
    public Object y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(c0 c0Var, int i, com.gamericefishpro.space.th.a aVar, int i2) {
        super(2, aVar);
        this.d = i2;
        this.v = c0Var;
        this.w = i;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                w wVar = new w(this.v, this.w, aVar, 0);
                wVar.i = ((Boolean) obj).booleanValue();
                return wVar;
            default:
                w wVar2 = new w(this.v, this.w, aVar, 1);
                wVar2.i = ((Boolean) obj).booleanValue();
                return wVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        com.gamericefishpro.space.th.a aVar = (com.gamericefishpro.space.th.a) obj2;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                break;
        }
        return ((w) create(bool, aVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005a  */
    /* JADX WARN: Code duplicated, block: B:25:0x005f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r5v0 */
    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        int iIntValue;
        ?? r0;
        ?? r1;
        u0 u0Var;
        ?? r2;
        boolean z;
        Object obj2;
        int iIntValue2;
        int iHashCode;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
                ?? r3 = this.e;
                c0 c0Var = this.v;
                try {
                    if (r3 == 0) {
                        com.gamericefishpro.space.wa.b.P(obj);
                        boolean z2 = this.i;
                        this.i = z2;
                        this.e = 1;
                        obj = c0.e(c0Var, z2, this);
                        r3 = z2;
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (r3 != 1) {
                            if (r3 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            boolean z3 = this.i;
                            th = (Throwable) this.y;
                            com.gamericefishpro.space.wa.b.P(obj);
                            r1 = z3;
                            iIntValue = ((Number) obj).intValue();
                            r0 = r1;
                            p0 p0Var = new p0(th, iIntValue);
                            r2 = r0;
                            u0Var = p0Var;
                            return new Pair(u0Var, Boolean.valueOf((boolean) r2));
                        }
                        boolean z4 = this.i;
                        com.gamericefishpro.space.wa.b.P(obj);
                        r3 = z4;
                    }
                    u0Var = (u0) obj;
                    r2 = r3;
                    break;
                } catch (Throwable th2) {
                    if (r3 != 0) {
                        t0 t0VarF = c0Var.f();
                        this.y = th2;
                        this.i = r3;
                        this.e = 2;
                        Integer numA = t0VarF.a();
                        if (numA == aVar) {
                            return aVar;
                        }
                        r1 = r3;
                        th = th2;
                        obj = numA;
                    } else {
                        ?? r5 = r3;
                        th = th2;
                        iIntValue = this.w;
                        r0 = r5 == true ? 1 : 0;
                    }
                    p0 p0Var2 = new p0(th, iIntValue);
                    r2 = r0;
                    u0Var = p0Var2;
                    return new Pair(u0Var, Boolean.valueOf((boolean) r2));
                }
                return new Pair(u0Var, Boolean.valueOf((boolean) r2));
            default:
                com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
                int i = this.e;
                c0 c0Var2 = this.v;
                if (i != 0) {
                    if (i == 1) {
                        z = this.i;
                        com.gamericefishpro.space.wa.b.P(obj);
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj2 = this.y;
                        com.gamericefishpro.space.wa.b.P(obj);
                    }
                    iIntValue2 = ((Number) obj).intValue();
                    if (obj2 != null) {
                        iHashCode = obj2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    return new d(iHashCode, iIntValue2, obj2);
                }
                com.gamericefishpro.space.wa.b.P(obj);
                z = this.i;
                this.i = z;
                this.e = 1;
                obj = c0Var2.h(this);
                if (obj == aVar2) {
                    return aVar2;
                }
                if (z) {
                    t0 t0VarF2 = c0Var2.f();
                    this.y = obj;
                    this.e = 2;
                    Integer numA2 = t0VarF2.a();
                    if (numA2 == aVar2) {
                        return aVar2;
                    }
                    obj2 = obj;
                    obj = numA2;
                    iIntValue2 = ((Number) obj).intValue();
                } else {
                    obj2 = obj;
                    iIntValue2 = this.w;
                }
                if (obj2 != null) {
                    iHashCode = obj2.hashCode();
                } else {
                    iHashCode = 0;
                }
                return new d(iHashCode, iIntValue2, obj2);
        }
    }
}
