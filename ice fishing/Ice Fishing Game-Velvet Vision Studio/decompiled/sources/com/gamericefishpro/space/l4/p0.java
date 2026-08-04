package com.gamericefishpro.space.l4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 extends u0 {
    public final Throwable b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(Throwable readException, int i) {
        super(i);
        Intrinsics.checkNotNullParameter(readException, "readException");
        this.b = readException;
    }
}
