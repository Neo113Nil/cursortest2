package com.gamericefishpro.space.l4;

import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 {
    public static final LinkedHashSet b = new LinkedHashSet();
    public static final Object c = new Object();
    public final com.gamericefishpro.space.a2.b a;

    public h0(com.gamericefishpro.space.a2.b produceFile) {
        com.gamericefishpro.space.p4.g serializer = com.gamericefishpro.space.p4.g.a;
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        g0 coordinatorProducer = g0.d;
        Intrinsics.checkNotNullParameter(coordinatorProducer, "coordinatorProducer");
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        this.a = produceFile;
    }
}
