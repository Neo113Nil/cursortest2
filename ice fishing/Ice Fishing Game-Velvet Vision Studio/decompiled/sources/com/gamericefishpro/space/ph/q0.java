package com.gamericefishpro.space.ph;

import java.util.Collections;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class q0 {
    public static com.gamericefishpro.space.qh.m a(com.gamericefishpro.space.qh.m builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        com.gamericefishpro.space.qh.i iVar = builder.d;
        iVar.b();
        return iVar.B > 0 ? builder : com.gamericefishpro.space.qh.m.i;
    }

    public static Set b(Object obj) {
        Set setSingleton = Collections.singleton(obj);
        Intrinsics.checkNotNullExpressionValue(setSingleton, "singleton(...)");
        return setSingleton;
    }
}
