package com.gamericefishpro.space.mj;

import com.gamericefishpro.space.ei.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements a {
    public final String a;

    public c(g type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.a = com.gamericefishpro.space.qj.a.a(type);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && c.class == obj.getClass() && Intrinsics.a(this.a, ((c) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
