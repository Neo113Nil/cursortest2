package com.gamericefishpro.space.ui;

import com.gamericefishpro.space.pi.v1;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t {
    public static final com.gamericefishpro.space.d6.a a = new com.gamericefishpro.space.d6.a("NO_THREAD_ELEMENTS", 2);
    public static final com.gamericefishpro.space.r2.u b = new com.gamericefishpro.space.r2.u(22);
    public static final com.gamericefishpro.space.r2.u c = new com.gamericefishpro.space.r2.u(23);
    public static final com.gamericefishpro.space.r2.u d = new com.gamericefishpro.space.r2.u(24);

    public static final void a(CoroutineContext coroutineContext, Object obj) {
        if (obj == a) {
            return;
        }
        if (!(obj instanceof x)) {
            Object objW = coroutineContext.w(null, c);
            Intrinsics.c(objW, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            ((u) ((v1) objW)).a(obj);
            return;
        }
        x xVar = (x) obj;
        v1[] v1VarArr = xVar.c;
        int length = v1VarArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            v1 v1Var = v1VarArr[length];
            Intrinsics.b(v1Var);
            ((u) v1Var).a(xVar.b[length]);
            if (i < 0) {
                return;
            } else {
                length = i;
            }
        }
    }

    public static final Object b(CoroutineContext coroutineContext) {
        Object objW = coroutineContext.w(0, b);
        Intrinsics.b(objW);
        return objW;
    }

    public static final Object c(CoroutineContext coroutineContext, Object obj) {
        if (obj == null) {
            obj = b(coroutineContext);
        }
        if (obj == 0) {
            return a;
        }
        return obj instanceof Integer ? coroutineContext.w(new x(((Number) obj).intValue(), coroutineContext), d) : ((u) ((v1) obj)).M(coroutineContext);
    }
}
