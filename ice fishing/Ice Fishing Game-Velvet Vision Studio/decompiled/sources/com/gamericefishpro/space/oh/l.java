package com.gamericefishpro.space.oh;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends Error {
    public l() {
        this(null, 1, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public l(String message, int i, DefaultConstructorMarker defaultConstructorMarker) {
        message = (i & 1) != 0 ? "An operation is not implemented." : message;
        Intrinsics.checkNotNullParameter(message, "message");
        super(message);
    }
}
