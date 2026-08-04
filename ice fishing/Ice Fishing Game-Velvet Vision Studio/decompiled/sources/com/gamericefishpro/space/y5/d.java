package com.gamericefishpro.space.y5;

import com.gamericefishpro.space.s5.a0;
import com.gamericefishpro.space.s5.t;
import com.gamericefishpro.space.s5.z;
import com.gamericefishpro.space.u5.r;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends com.gamericefishpro.space.vh.i implements Function2 {
    public z d;
    public int e;
    public /* synthetic */ Object i;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ t y;
    public final /* synthetic */ Function1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(t tVar, com.gamericefishpro.space.th.a aVar, Function1 function1, boolean z, boolean z2) {
        super(2, aVar);
        this.v = z;
        this.w = z2;
        this.y = tVar;
        this.z = function1;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
        d dVar = new d(this.y, aVar, this.z, this.v, this.w);
        dVar.i = obj;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((a0) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x009e A[DONT_INVERT, PHI: r1 r11
      0x009e: PHI (r1v11 com.gamericefishpro.space.s5.a0) = (r1v8 com.gamericefishpro.space.s5.a0), (r1v17 com.gamericefishpro.space.s5.a0) binds: [B:34:0x009b, B:11:0x0027] A[DONT_GENERATE, DONT_INLINE]
      0x009e: PHI (r11v17 java.lang.Object) = (r11v15 java.lang.Object), (r11v0 java.lang.Object) binds: [B:34:0x009b, B:11:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c3 A[RETURN] */
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
        Function1 function1 = this.z;
        t tVar = this.y;
        boolean z = this.w;
        if (i == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            a0 a0Var4 = (a0) this.i;
            if (!this.v) {
                Intrinsics.c(a0Var4, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
                return function1.invoke(((r) a0Var4).d());
            }
            zVar = z ? z.d : z.e;
            if (z) {
                z zVar3 = zVar;
                a0Var = a0Var4;
                zVar2 = zVar3;
                com.gamericefishpro.space.db.b bVar = new com.gamericefishpro.space.db.b((com.gamericefishpro.space.th.a) null, function1);
                this.i = a0Var;
                this.d = null;
                this.e = 3;
                obj = a0Var.b(zVar2, bVar, this);
                if (obj != aVar) {
                    if (z) {
                        return obj;
                    }
                    this.i = obj;
                    this.e = 4;
                    objA = a0Var.a(this);
                    if (objA != aVar) {
                        obj2 = obj;
                        obj = objA;
                        if (!((Boolean) obj).booleanValue()) {
                            com.gamericefishpro.space.s5.g gVarI = tVar.i();
                            gVarI.b.e(gVarI.e, gVarI.f);
                        }
                        return obj2;
                    }
                }
            } else {
                this.i = a0Var4;
                this.d = zVar;
                this.e = 1;
                Object objA2 = a0Var4.a(this);
                if (objA2 != aVar) {
                    a0Var2 = a0Var4;
                    obj = objA2;
                }
            }
            return aVar;
        }
        if (i == 1) {
            zVar = this.d;
            a0Var2 = (a0) this.i;
            com.gamericefishpro.space.wa.b.P(obj);
        } else {
            if (i == 2) {
                zVar = this.d;
                a0Var3 = (a0) this.i;
                com.gamericefishpro.space.wa.b.P(obj);
                zVar2 = zVar;
                a0Var = a0Var3;
                com.gamericefishpro.space.db.b bVar2 = new com.gamericefishpro.space.db.b((com.gamericefishpro.space.th.a) null, function1);
                this.i = a0Var;
                this.d = null;
                this.e = 3;
                obj = a0Var.b(zVar2, bVar2, this);
                if (obj != aVar) {
                    if (z) {
                        return obj;
                    }
                    this.i = obj;
                    this.e = 4;
                    objA = a0Var.a(this);
                    if (objA != aVar) {
                        obj2 = obj;
                        obj = objA;
                    }
                }
                return aVar;
            }
            if (i == 3) {
                a0Var = (a0) this.i;
                com.gamericefishpro.space.wa.b.P(obj);
                if (z) {
                    return obj;
                }
                this.i = obj;
                this.e = 4;
                objA = a0Var.a(this);
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
            com.gamericefishpro.space.s5.g gVarI2 = tVar.i();
            gVarI2.b.e(gVarI2.e, gVarI2.f);
        }
        return obj2;
        if (((Boolean) obj).booleanValue()) {
            zVar2 = zVar;
            a0Var = a0Var2;
            com.gamericefishpro.space.db.b bVar3 = new com.gamericefishpro.space.db.b((com.gamericefishpro.space.th.a) null, function1);
            this.i = a0Var;
            this.d = null;
            this.e = 3;
            obj = a0Var.b(zVar2, bVar3, this);
            if (obj != aVar) {
                if (z) {
                    return obj;
                }
                this.i = obj;
                this.e = 4;
                objA = a0Var.a(this);
                if (objA != aVar) {
                    obj2 = obj;
                    obj = objA;
                    if (!((Boolean) obj).booleanValue()) {
                        com.gamericefishpro.space.s5.g gVarI3 = tVar.i();
                        gVarI3.b.e(gVarI3.e, gVarI3.f);
                    }
                    return obj2;
                }
            }
        } else {
            com.gamericefishpro.space.s5.g gVarI4 = tVar.i();
            this.i = a0Var2;
            this.d = zVar;
            this.e = 2;
            if (gVarI4.a(this) != aVar) {
                a0Var3 = a0Var2;
                zVar2 = zVar;
                a0Var = a0Var3;
                com.gamericefishpro.space.db.b bVar4 = new com.gamericefishpro.space.db.b((com.gamericefishpro.space.th.a) null, function1);
                this.i = a0Var;
                this.d = null;
                this.e = 3;
                obj = a0Var.b(zVar2, bVar4, this);
                if (obj != aVar) {
                    if (z) {
                        return obj;
                    }
                    this.i = obj;
                    this.e = 4;
                    objA = a0Var.a(this);
                    if (objA != aVar) {
                        obj2 = obj;
                        obj = objA;
                        if (!((Boolean) obj).booleanValue()) {
                            com.gamericefishpro.space.s5.g gVarI5 = tVar.i();
                            gVarI5.b.e(gVarI5.e, gVarI5.f);
                        }
                        return obj2;
                    }
                }
            }
        }
        return aVar;
    }
}
