package com.gamericefishpro.space.l4;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 {
    public final com.gamericefishpro.space.xi.c a;
    public final com.gamericefishpro.space.vb.c b;
    public final p c;

    public t0(String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        this.a = new com.gamericefishpro.space.xi.c();
        this.b = new com.gamericefishpro.space.vb.c(29);
        this.c = new p(new com.gamericefishpro.space.e.k(2, 2, null));
    }

    public final Integer a() {
        return new Integer(((AtomicInteger) this.b.e).get());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(Function1 function1, com.gamericefishpro.space.vh.c cVar) {
        r0 r0Var;
        com.gamericefishpro.space.xi.c cVar2;
        Throwable th;
        com.gamericefishpro.space.xi.a aVar;
        if (cVar instanceof r0) {
            r0Var = (r0) cVar;
            int i = r0Var.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                r0Var.w = i - Integer.MIN_VALUE;
            } else {
                r0Var = new r0(this, cVar);
            }
        } else {
            r0Var = new r0(this, cVar);
        }
        Object obj = r0Var.i;
        com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
        int i2 = r0Var.w;
        try {
            if (i2 == 0) {
                com.gamericefishpro.space.wa.b.P(obj);
                r0Var.d = function1;
                cVar2 = this.a;
                r0Var.e = cVar2;
                r0Var.w = 1;
                if (cVar2.c(r0Var) != aVar2) {
                }
                return aVar2;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (com.gamericefishpro.space.xi.a) r0Var.d;
                try {
                    com.gamericefishpro.space.wa.b.P(obj);
                    aVar.b(null);
                    return obj;
                } catch (Throwable th2) {
                    th = th2;
                    aVar.b(null);
                    throw th;
                }
            }
            com.gamericefishpro.space.xi.c cVar3 = r0Var.e;
            Function1 function2 = (Function1) r0Var.d;
            com.gamericefishpro.space.wa.b.P(obj);
            cVar2 = cVar3;
            function1 = function2;
            r0Var.d = cVar2;
            r0Var.e = null;
            r0Var.w = 2;
            Object objInvoke = function1.invoke(r0Var);
            if (objInvoke != aVar2) {
                com.gamericefishpro.space.xi.c cVar4 = cVar2;
                obj = objInvoke;
                aVar = cVar4;
                aVar.b(null);
                return obj;
            }
            return aVar2;
        } catch (Throwable th3) {
            com.gamericefishpro.space.xi.c cVar5 = cVar2;
            th = th3;
            aVar = cVar5;
            aVar.b(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0055  */
    /* JADX WARN: Code duplicated, block: B:29:0x005f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(Function2 function2, com.gamericefishpro.space.vh.c cVar) throws Throwable {
        s0 s0Var;
        com.gamericefishpro.space.xi.c cVar2;
        Throwable th;
        boolean z;
        if (cVar instanceof s0) {
            s0Var = (s0) cVar;
            int i = s0Var.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                s0Var.w = i - Integer.MIN_VALUE;
            } else {
                s0Var = new s0(this, cVar);
            }
        } else {
            s0Var = new s0(this, cVar);
        }
        Object obj = s0Var.i;
        Object obj2 = com.gamericefishpro.space.uh.a.d;
        int i2 = s0Var.w;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = s0Var.e;
            cVar2 = s0Var.d;
            try {
                com.gamericefishpro.space.wa.b.P(obj);
                if (z) {
                    cVar2.b(null);
                }
                return obj;
            } catch (Throwable th2) {
                th = th2;
                if (z) {
                    cVar2.b(null);
                }
                throw th;
            }
        }
        com.gamericefishpro.space.wa.b.P(obj);
        com.gamericefishpro.space.xi.c cVar3 = this.a;
        boolean zF = cVar3.f();
        try {
            Object objValueOf = Boolean.valueOf(zF);
            s0Var.d = cVar3;
            s0Var.e = zF;
            s0Var.w = 1;
            Object objInvoke = function2.invoke(objValueOf, s0Var);
            if (objInvoke == obj2) {
                return obj2;
            }
            cVar2 = cVar3;
            obj = objInvoke;
            z = zF;
            if (z) {
                cVar2.b(null);
            }
            return obj;
        } catch (Throwable th3) {
            cVar2 = cVar3;
            th = th3;
            z = zF;
            if (z) {
                cVar2.b(null);
            }
            throw th;
        }
    }
}
