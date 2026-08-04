package com.gamericefishpro.space.ti;

import com.gamericefishpro.space.ei.e0;
import com.gamericefishpro.space.pi.t1;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static final com.gamericefishpro.space.th.a[] a = new com.gamericefishpro.space.th.a[0];
    public static final com.gamericefishpro.space.d6.a b = new com.gamericefishpro.space.d6.a("NULL", 2);
    public static final com.gamericefishpro.space.d6.a c = new com.gamericefishpro.space.d6.a("UNINITIALIZED", 2);

    public static final Object a(com.gamericefishpro.space.di.c cVar, com.gamericefishpro.space.si.f fVar, com.gamericefishpro.space.th.a frame, com.gamericefishpro.space.si.e[] eVarArr) {
        o oVar = new o(cVar, fVar, null, eVarArr);
        t1 t1Var = new t1(frame.getContext(), frame, 1);
        Object objF = com.gamericefishpro.space.b9.a.F(t1Var, t1Var, oVar);
        com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
        if (objF == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objF == aVar ? objF : Unit.a;
    }

    public static final Object b(CoroutineContext coroutineContext, Object obj, Object obj2, Function2 function2, com.gamericefishpro.space.th.a frame) {
        Object objInvoke;
        Object objC = com.gamericefishpro.space.ui.t.c(coroutineContext, obj2);
        try {
            x xVar = new x(frame, coroutineContext);
            if (function2 == null) {
                objInvoke = com.gamericefishpro.space.uh.f.c(function2, obj, xVar);
            } else {
                e0.c(2, function2);
                objInvoke = function2.invoke(obj, xVar);
            }
            com.gamericefishpro.space.ui.t.a(coroutineContext, objC);
            if (objInvoke == com.gamericefishpro.space.uh.a.d) {
                Intrinsics.checkNotNullParameter(frame, "frame");
            }
            return objInvoke;
        } catch (Throwable th) {
            com.gamericefishpro.space.ui.t.a(coroutineContext, objC);
            throw th;
        }
    }
}
