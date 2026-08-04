package com.gamericefishpro.space.e6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends RuntimeException {
    public final f d;
    public final Throwable e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f callbackName, Throwable cause) {
        super(cause);
        Intrinsics.checkNotNullParameter(callbackName, "callbackName");
        Intrinsics.checkNotNullParameter(cause, "cause");
        this.d = callbackName;
        this.e = cause;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.e;
    }
}
