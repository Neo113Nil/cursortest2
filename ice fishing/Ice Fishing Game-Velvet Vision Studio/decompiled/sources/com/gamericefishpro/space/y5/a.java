package com.gamericefishpro.space.y5;

import com.gamericefishpro.space.s5.a0;
import com.gamericefishpro.space.s5.t;
import com.gamericefishpro.space.s5.z;
import com.gamericefishpro.space.u5.r;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends com.gamericefishpro.space.vh.i implements Function2 {
    public z d;
    public int e;
    public /* synthetic */ Object i;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ t w;
    public final /* synthetic */ com.gamericefishpro.space.a7.c y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(boolean z, t tVar, com.gamericefishpro.space.th.a aVar, com.gamericefishpro.space.a7.c cVar) {
        super(2, aVar);
        this.v = z;
        this.w = tVar;
        this.y = cVar;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
        a aVar2 = new a(this.v, this.w, aVar, this.y);
        aVar2.i = obj;
        return aVar2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((a0) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0091 A[PHI: r1 r10
      0x0091: PHI (r1v8 com.gamericefishpro.space.s5.a0) = (r1v5 com.gamericefishpro.space.s5.a0), (r1v14 com.gamericefishpro.space.s5.a0) binds: [B:29:0x008e, B:11:0x0025] A[DONT_GENERATE, DONT_INLINE]
      0x0091: PHI (r10v16 java.lang.Object) = (r10v14 java.lang.Object), (r10v0 java.lang.Object) binds: [B:29:0x008e, B:11:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x009c  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a6  */
    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        z zVar;
        a0 a0Var;
        z zVar2;
        a0 a0Var2;
        a0 a0Var3;
        Object objA;
        Object obj2;
        com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
        int i = this.e;
        com.gamericefishpro.space.a7.c cVar = this.y;
        t tVar = this.w;
        if (i == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            a0 a0Var4 = (a0) this.i;
            if (!this.v) {
                Intrinsics.c(a0Var4, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
                return cVar.invoke(((r) a0Var4).d());
            }
            zVar = z.e;
            this.i = a0Var4;
            this.d = zVar;
            this.e = 1;
            Object objA2 = a0Var4.a(this);
            if (objA2 != aVar) {
                a0Var = a0Var4;
                obj = objA2;
            }
            return aVar;
        }
        if (i == 1) {
            zVar = this.d;
            a0Var = (a0) this.i;
            com.gamericefishpro.space.wa.b.P(obj);
        } else {
            if (i == 2) {
                zVar = this.d;
                a0Var3 = (a0) this.i;
                com.gamericefishpro.space.wa.b.P(obj);
                zVar2 = zVar;
                a0Var2 = a0Var3;
                com.gamericefishpro.space.k7.e eVar = new com.gamericefishpro.space.k7.e((com.gamericefishpro.space.th.a) null, cVar);
                this.i = a0Var2;
                this.d = null;
                this.e = 3;
                obj = a0Var2.b(zVar2, eVar, this);
                if (obj != aVar) {
                    this.i = obj;
                    this.e = 4;
                    objA = a0Var2.a(this);
                    if (objA != aVar) {
                        obj2 = obj;
                        obj = objA;
                    }
                }
                return aVar;
            }
            if (i == 3) {
                a0Var2 = (a0) this.i;
                com.gamericefishpro.space.wa.b.P(obj);
                this.i = obj;
                this.e = 4;
                objA = a0Var2.a(this);
                if (objA != aVar) {
                    obj2 = obj;
                    obj = objA;
                }
                return aVar;
            }
            if (i != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj2 = this.i;
            com.gamericefishpro.space.wa.b.P(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            com.gamericefishpro.space.s5.g gVarI = tVar.i();
            gVarI.b.e(gVarI.e, gVarI.f);
        }
        return obj2;
        if (((Boolean) obj).booleanValue()) {
            zVar2 = zVar;
            a0Var2 = a0Var;
            com.gamericefishpro.space.k7.e eVar2 = new com.gamericefishpro.space.k7.e((com.gamericefishpro.space.th.a) null, cVar);
            this.i = a0Var2;
            this.d = null;
            this.e = 3;
            obj = a0Var2.b(zVar2, eVar2, this);
            if (obj != aVar) {
                this.i = obj;
                this.e = 4;
                objA = a0Var2.a(this);
                if (objA != aVar) {
                    obj2 = obj;
                    obj = objA;
                    if (!((Boolean) obj).booleanValue()) {
                        com.gamericefishpro.space.s5.g gVarI2 = tVar.i();
                        gVarI2.b.e(gVarI2.e, gVarI2.f);
                    }
                    return obj2;
                }
            }
        } else {
            com.gamericefishpro.space.s5.g gVarI3 = tVar.i();
            this.i = a0Var;
            this.d = zVar;
            this.e = 2;
            if (gVarI3.a(this) != aVar) {
                a0Var3 = a0Var;
                zVar2 = zVar;
                a0Var2 = a0Var3;
                com.gamericefishpro.space.k7.e eVar3 = new com.gamericefishpro.space.k7.e((com.gamericefishpro.space.th.a) null, cVar);
                this.i = a0Var2;
                this.d = null;
                this.e = 3;
                obj = a0Var2.b(zVar2, eVar3, this);
                if (obj != aVar) {
                    this.i = obj;
                    this.e = 4;
                    objA = a0Var2.a(this);
                    if (objA != aVar) {
                        obj2 = obj;
                        obj = objA;
                        if (!((Boolean) obj).booleanValue()) {
                            com.gamericefishpro.space.s5.g gVarI4 = tVar.i();
                            gVarI4.b.e(gVarI4.e, gVarI4.f);
                        }
                        return obj2;
                    }
                }
            }
        }
        return aVar;
    }
}
