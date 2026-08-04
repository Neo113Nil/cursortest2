package com.gamericefishpro.space.t0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class w implements com.gamericefishpro.space.g1.d {
    public final t d;

    public w(t tVar) {
        this.d = tVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            return Intrinsics.a(this.d, ((w) obj).d);
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() * 31;
    }
}
