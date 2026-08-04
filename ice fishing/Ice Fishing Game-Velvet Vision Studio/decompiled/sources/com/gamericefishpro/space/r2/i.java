package com.gamericefishpro.space.r2;

import com.gamericefishpro.space.t0.y0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends k {
    public final String a;
    public final g0 b;

    public i(String str, g0 g0Var) {
        this.a = str;
        this.b = g0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.a(this.a, iVar.a) && Intrinsics.a(this.b, iVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        g0 g0Var = this.b;
        return (iHashCode + (g0Var != null ? g0Var.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return y0.i(new StringBuilder("LinkAnnotation.Clickable(tag="), this.a, ')');
    }
}
