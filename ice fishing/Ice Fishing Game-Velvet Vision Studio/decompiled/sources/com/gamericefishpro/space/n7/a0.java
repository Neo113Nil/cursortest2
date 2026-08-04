package com.gamericefishpro.space.n7;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {
    public final com.gamericefishpro.space.i7.d a;
    public final Set b;

    public a0(com.gamericefishpro.space.i7.d type, Set cells) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(cells, "cells");
        this.a = type;
        this.b = cells;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.a == a0Var.a && Intrinsics.a(this.b, a0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PowerUpPreview(type=" + this.a + ", cells=" + this.b + ")";
    }
}
