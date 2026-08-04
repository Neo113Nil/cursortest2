package com.gamericefishpro.space.li;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class j extends i {
    public static a b(Iterator it) {
        Intrinsics.checkNotNullParameter(it, "<this>");
        com.gamericefishpro.space.ai.n nVar = new com.gamericefishpro.space.ai.n(2, it);
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        return new a(nVar);
    }

    public static Sequence c(Object obj, Function1 nextFunction) {
        Intrinsics.checkNotNullParameter(nextFunction, "nextFunction");
        return obj == null ? b.a : new d(new com.gamericefishpro.space.a3.b(12, obj), nextFunction);
    }
}
