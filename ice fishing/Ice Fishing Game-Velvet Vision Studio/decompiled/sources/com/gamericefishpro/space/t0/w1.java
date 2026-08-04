package com.gamericefishpro.space.t0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class w1 extends i {
    public final i f;
    public final int g;

    public w1(i iVar, int i) {
        this.f = iVar;
        this.g = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w1)) {
            return false;
        }
        w1 w1Var = (w1) obj;
        return Intrinsics.a(w1Var.f, this.f) && w1Var.g == this.g;
    }

    public final int hashCode() {
        return this.f.hashCode() + (this.g * 31);
    }
}
