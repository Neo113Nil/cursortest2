package com.gamericefishpro.space.uh;

import com.gamericefishpro.space.ei.e0;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class f {
    /* JADX WARN: Multi-variable type inference failed */
    public static com.gamericefishpro.space.th.a a(com.gamericefishpro.space.th.a aVar, com.gamericefishpro.space.th.a completion, Function2 function2) {
        Intrinsics.checkNotNullParameter(function2, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        Intrinsics.checkNotNullParameter(completion, "completion");
        if (function2 instanceof com.gamericefishpro.space.vh.a) {
            return ((com.gamericefishpro.space.vh.a) function2).create(aVar, completion);
        }
        CoroutineContext context = completion.getContext();
        return context == g.d ? new b(completion, aVar, function2) : new c(completion, context, function2, aVar);
    }

    public static com.gamericefishpro.space.th.a b(com.gamericefishpro.space.th.a aVar) {
        com.gamericefishpro.space.th.a aVarIntercepted;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        com.gamericefishpro.space.vh.c cVar = aVar instanceof com.gamericefishpro.space.vh.c ? (com.gamericefishpro.space.vh.c) aVar : null;
        return (cVar == null || (aVarIntercepted = cVar.intercepted()) == null) ? aVar : aVarIntercepted;
    }

    public static Object c(Function2 function2, Object obj, com.gamericefishpro.space.th.a completion) {
        Intrinsics.checkNotNullParameter(function2, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        Intrinsics.checkNotNullParameter(completion, "completion");
        CoroutineContext context = completion.getContext();
        Object dVar = context == g.d ? new d(completion) : new e(completion, context);
        e0.c(2, function2);
        return function2.invoke(obj, dVar);
    }
}
