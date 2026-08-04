package com.gamericefishpro.space.pi;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r {
    public static final CoroutineContext a(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, boolean z) {
        Boolean bool = Boolean.FALSE;
        boolean zBooleanValue = ((Boolean) coroutineContext.w(bool, new com.gamericefishpro.space.g7.a(5))).booleanValue();
        boolean zBooleanValue2 = ((Boolean) coroutineContext2.w(bool, new com.gamericefishpro.space.g7.a(5))).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return coroutineContext.o(coroutineContext2);
        }
        com.gamericefishpro.space.ei.a0 a0Var = new com.gamericefishpro.space.ei.a0();
        a0Var.d = coroutineContext2;
        kotlin.coroutines.g gVar = kotlin.coroutines.g.d;
        CoroutineContext coroutineContext3 = (CoroutineContext) coroutineContext.w(gVar, new com.gamericefishpro.space.g7.a(6));
        if (zBooleanValue2) {
            a0Var.d = ((CoroutineContext) a0Var.d).w(gVar, new com.gamericefishpro.space.g7.a(7));
        }
        return coroutineContext3.o((CoroutineContext) a0Var.d);
    }

    public static final CoroutineContext b(x xVar, CoroutineContext coroutineContext) {
        CoroutineContext coroutineContextA = a(xVar.l(), coroutineContext, true);
        com.gamericefishpro.space.wi.e eVar = k0.a;
        return (coroutineContextA == eVar || coroutineContextA.j(kotlin.coroutines.d.x) != null) ? coroutineContextA : coroutineContextA.o(eVar);
    }

    public static final c2 c(com.gamericefishpro.space.th.a aVar, CoroutineContext coroutineContext, Object obj) {
        c2 c2Var = null;
        if ((aVar instanceof com.gamericefishpro.space.vh.d) && coroutineContext.j(d2.d) != null) {
            com.gamericefishpro.space.vh.d callerFrame = (com.gamericefishpro.space.vh.d) aVar;
            while (!(callerFrame instanceof h0) && (callerFrame = callerFrame.getCallerFrame()) != null) {
                if (callerFrame instanceof c2) {
                    c2Var = (c2) callerFrame;
                    break;
                }
            }
            if (c2Var != null) {
                c2Var.p0(coroutineContext, obj);
            }
        }
        return c2Var;
    }
}
