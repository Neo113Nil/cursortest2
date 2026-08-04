package com.gamericefishpro.space.ri;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f extends com.gamericefishpro.space.ei.j implements Function2 {
    public static final f B = new f(2, g.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        long jLongValue = ((Number) obj).longValue();
        m mVar = (m) obj2;
        m mVar2 = g.a;
        e eVar = mVar.e;
        Intrinsics.b(eVar);
        return new m(jLongValue, mVar, eVar, 0);
    }
}
