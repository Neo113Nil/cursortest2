package com.gamericefishpro.space.ph;

import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class w {
    public static com.gamericefishpro.space.qh.d a(com.gamericefishpro.space.qh.d builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.i();
        builder.i = true;
        return builder.e > 0 ? builder : com.gamericefishpro.space.qh.d.w;
    }

    public static com.gamericefishpro.space.qh.d b() {
        return new com.gamericefishpro.space.qh.d(0, 1, null);
    }

    public static List c(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        Intrinsics.checkNotNullExpressionValue(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }
}
