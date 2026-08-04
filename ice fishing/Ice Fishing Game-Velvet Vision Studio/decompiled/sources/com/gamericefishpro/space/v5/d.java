package com.gamericefishpro.space.v5;

import com.gamericefishpro.space.i9.y3;
import com.gamericefishpro.space.oh.k;
import com.gamericefishpro.space.s5.a0;
import com.gamericefishpro.space.s5.z;
import com.gamericefishpro.space.u5.r;
import com.gamericefishpro.space.vh.i;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements a0, r {
    public final a a;

    public d(a delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.a = delegate;
    }

    @Override // com.gamericefishpro.space.s5.a0
    public final Object a(i iVar) {
        return Boolean.valueOf(this.a.d.r());
    }

    @Override // com.gamericefishpro.space.s5.a0
    public final Object b(z zVar, Function2 function2, i iVar) {
        return e(zVar, function2, iVar);
    }

    @Override // com.gamericefishpro.space.s5.m
    public final Object c(String str, Function1 function1, com.gamericefishpro.space.vh.c cVar) {
        g gVarO = this.a.O(str);
        try {
            Object objInvoke = function1.invoke(gVarO);
            y3.r(gVarO, null);
            return objInvoke;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                y3.r(gVarO, th);
                throw th2;
            }
        }
    }

    @Override // com.gamericefishpro.space.u5.r
    public final com.gamericefishpro.space.c6.a d() {
        return this.a;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0090  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(z zVar, Function2 function2, com.gamericefishpro.space.vh.c cVar) throws Throwable {
        c cVar2;
        Throwable th;
        com.gamericefishpro.space.d6.b bVar;
        d dVar;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i = cVar2.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                cVar2.w = i - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        Object obj = cVar2.i;
        Object obj2 = com.gamericefishpro.space.uh.a.d;
        int i2 = cVar2.w;
        if (i2 == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            com.gamericefishpro.space.d6.b bVar2 = this.a.d;
            bVar2.r();
            int iOrdinal = zVar.ordinal();
            if (iOrdinal == 0) {
                bVar2.q();
            } else if (iOrdinal == 1) {
                bVar2.D();
            } else {
                if (iOrdinal != 2) {
                    throw new k();
                }
                bVar2.e();
            }
            try {
                Object kVar = new com.gamericefishpro.space.u5.k(1, this);
                cVar2.d = this;
                cVar2.e = bVar2;
                cVar2.w = 1;
                Object objInvoke = function2.invoke(kVar, cVar2);
                if (objInvoke == obj2) {
                    return obj2;
                }
                obj = objInvoke;
                bVar = bVar2;
                dVar = this;
            } catch (Throwable th2) {
                th = th2;
                bVar = bVar2;
                dVar = this;
                bVar.d();
                if (!bVar.r()) {
                    dVar.getClass();
                }
                throw th;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar = cVar2.e;
            dVar = cVar2.d;
            try {
                com.gamericefishpro.space.wa.b.P(obj);
            } catch (Throwable th3) {
                th = th3;
                bVar.d();
                if (!bVar.r()) {
                    dVar.getClass();
                }
                throw th;
            }
        }
        bVar.B();
        bVar.d();
        if (!bVar.r()) {
            dVar.getClass();
        }
        return obj;
    }
}
