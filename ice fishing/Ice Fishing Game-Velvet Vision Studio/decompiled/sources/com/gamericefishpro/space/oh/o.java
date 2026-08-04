package com.gamericefishpro.space.oh;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements Serializable {
    public final Throwable d;

    public o(Throwable exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        this.d = exception;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return Intrinsics.a(this.d, ((o) obj).d);
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.d + ')';
    }
}
