package com.gamericefishpro.space.r2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 {
    public final b0 a;
    public final b0 b;
    public final b0 c;
    public final b0 d;

    public g0(b0 b0Var, b0 b0Var2, b0 b0Var3, b0 b0Var4) {
        this.a = b0Var;
        this.b = b0Var2;
        this.c = b0Var3;
        this.d = b0Var4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return Intrinsics.a(this.a, g0Var.a) && Intrinsics.a(this.b, g0Var.b) && Intrinsics.a(this.c, g0Var.c) && Intrinsics.a(this.d, g0Var.d);
    }

    public final int hashCode() {
        b0 b0Var = this.a;
        int iHashCode = (b0Var != null ? b0Var.hashCode() : 0) * 31;
        b0 b0Var2 = this.b;
        int iHashCode2 = (iHashCode + (b0Var2 != null ? b0Var2.hashCode() : 0)) * 31;
        b0 b0Var3 = this.c;
        int iHashCode3 = (iHashCode2 + (b0Var3 != null ? b0Var3.hashCode() : 0)) * 31;
        b0 b0Var4 = this.d;
        return iHashCode3 + (b0Var4 != null ? b0Var4.hashCode() : 0);
    }
}
