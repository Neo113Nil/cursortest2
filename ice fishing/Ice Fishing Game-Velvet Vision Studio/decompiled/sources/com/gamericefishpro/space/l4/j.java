package com.gamericefishpro.space.l4;

import com.gamericefishpro.space.i2.i2;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class j {
    public final /* synthetic */ com.gamericefishpro.space.xi.a a;
    public final /* synthetic */ com.gamericefishpro.space.ei.w b;
    public final /* synthetic */ com.gamericefishpro.space.ei.a0 c;
    public final /* synthetic */ c0 d;

    public j(com.gamericefishpro.space.xi.a aVar, com.gamericefishpro.space.ei.w wVar, com.gamericefishpro.space.ei.a0 a0Var, c0 c0Var) {
        this.a = aVar;
        this.b = wVar;
        this.c = a0Var;
        this.d = c0Var;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00b4 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #1 {all -> 0x0054, blocks: (B:21:0x0050, B:36:0x00ac, B:38:0x00b4), top: B:54:0x0050 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(i2 i2Var, com.gamericefishpro.space.vh.c cVar) throws Throwable {
        i iVar;
        com.gamericefishpro.space.xi.a aVar;
        c0 c0Var;
        com.gamericefishpro.space.ei.w wVar;
        com.gamericefishpro.space.ei.a0 a0Var;
        Function2 function2;
        com.gamericefishpro.space.xi.a aVar2;
        com.gamericefishpro.space.xi.a aVar3;
        c0 c0Var2;
        Object obj;
        com.gamericefishpro.space.ei.a0 a0Var2;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i = iVar.A;
            if ((i & Integer.MIN_VALUE) != 0) {
                iVar.A = i - Integer.MIN_VALUE;
            } else {
                iVar = new i(this, cVar);
            }
        } else {
            iVar = new i(this, cVar);
        }
        Object obj2 = iVar.y;
        com.gamericefishpro.space.uh.a aVar4 = com.gamericefishpro.space.uh.a.d;
        int i2 = iVar.A;
        try {
            if (i2 == 0) {
                com.gamericefishpro.space.wa.b.P(obj2);
                iVar.d = i2Var;
                aVar = this.a;
                iVar.e = aVar;
                com.gamericefishpro.space.ei.w wVar2 = this.b;
                iVar.i = wVar2;
                com.gamericefishpro.space.ei.a0 a0Var3 = this.c;
                iVar.v = a0Var3;
                c0Var = this.d;
                iVar.w = c0Var;
                iVar.A = 1;
                if (aVar.c(iVar) != aVar4) {
                    wVar = wVar2;
                    a0Var = a0Var3;
                    function2 = i2Var;
                }
                return aVar4;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = iVar.i;
                    a0Var2 = (com.gamericefishpro.space.ei.a0) iVar.e;
                    aVar2 = (com.gamericefishpro.space.xi.a) iVar.d;
                    try {
                        com.gamericefishpro.space.wa.b.P(obj2);
                        a0Var2.d = obj;
                        a0Var = a0Var2;
                        Object obj3 = a0Var.d;
                        aVar2.b(null);
                        return obj3;
                    } catch (Throwable th) {
                        th = th;
                        aVar2.b(null);
                        throw th;
                    }
                }
                c0Var2 = (c0) iVar.i;
                a0Var = (com.gamericefishpro.space.ei.a0) iVar.e;
                aVar3 = (com.gamericefishpro.space.xi.a) iVar.d;
                try {
                    com.gamericefishpro.space.wa.b.P(obj2);
                    if (!Intrinsics.a(obj2, a0Var.d)) {
                        iVar.d = aVar3;
                        iVar.e = a0Var;
                        iVar.i = obj2;
                        iVar.A = 3;
                        if (c0Var2.i(obj2, false, iVar) != aVar4) {
                            obj = obj2;
                            a0Var2 = a0Var;
                            aVar2 = aVar3;
                            a0Var2.d = obj;
                            a0Var = a0Var2;
                        }
                        return aVar4;
                    }
                    aVar2 = aVar3;
                    Object obj4 = a0Var.d;
                    aVar2.b(null);
                    return obj4;
                } catch (Throwable th2) {
                    th = th2;
                    aVar2 = aVar3;
                    aVar2.b(null);
                    throw th;
                }
            }
            c0 c0Var3 = iVar.w;
            a0Var = iVar.v;
            wVar = (com.gamericefishpro.space.ei.w) iVar.i;
            com.gamericefishpro.space.xi.a aVar5 = (com.gamericefishpro.space.xi.a) iVar.e;
            Function2 function3 = (Function2) iVar.d;
            com.gamericefishpro.space.wa.b.P(obj2);
            c0Var = c0Var3;
            function2 = function3;
            aVar = aVar5;
            if (wVar.d) {
                throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
            }
            Object obj5 = a0Var.d;
            iVar.d = aVar;
            iVar.e = a0Var;
            iVar.i = c0Var;
            iVar.v = null;
            iVar.w = null;
            iVar.A = 2;
            Object objInvoke = function2.invoke(obj5, iVar);
            if (objInvoke != aVar4) {
                aVar3 = aVar;
                obj2 = objInvoke;
                c0Var2 = c0Var;
                if (!Intrinsics.a(obj2, a0Var.d)) {
                    iVar.d = aVar3;
                    iVar.e = a0Var;
                    iVar.i = obj2;
                    iVar.A = 3;
                    if (c0Var2.i(obj2, false, iVar) != aVar4) {
                        obj = obj2;
                        a0Var2 = a0Var;
                        aVar2 = aVar3;
                        a0Var2.d = obj;
                        a0Var = a0Var2;
                    }
                } else {
                    aVar2 = aVar3;
                }
                Object obj6 = a0Var.d;
                aVar2.b(null);
                return obj6;
            }
            return aVar4;
        } catch (Throwable th3) {
            th = th3;
            aVar2 = aVar;
            aVar2.b(null);
            throw th;
        }
    }
}
