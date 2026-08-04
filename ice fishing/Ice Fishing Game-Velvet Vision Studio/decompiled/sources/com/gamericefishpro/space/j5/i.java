package com.gamericefishpro.space.j5;

import com.gamericefishpro.space.i9.a4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends a4 {
    public final b e;

    public i(b latestEvent) {
        Intrinsics.checkNotNullParameter(latestEvent, "latestEvent");
        this.e = latestEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && i.class == obj.getClass() && Intrinsics.a(this.e, ((i) obj).e);
    }

    public final int hashCode() {
        return this.e.hashCode() - 31;
    }

    public final String toString() {
        return "InProgress(latestEvent=" + this.e + ", direction=-1)";
    }
}
