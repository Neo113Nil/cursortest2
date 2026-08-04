package com.gamericefishpro.space.pi;

import java.io.Closeable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v0 extends t implements Closeable, AutoCloseable {
    static {
        com.gamericefishpro.space.j7.c safeCast = new com.gamericefishpro.space.j7.c(26);
        s baseKey = t.e;
        Intrinsics.checkNotNullParameter(baseKey, "baseKey");
        Intrinsics.checkNotNullParameter(safeCast, "safeCast");
        if (baseKey != null) {
            kotlin.coroutines.f fVar = baseKey.e;
        }
    }
}
