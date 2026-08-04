package com.gamericefishpro.space.w;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class h1 implements g1 {
    public final Object a;
    public final Object b;

    public h1(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // com.gamericefishpro.space.w.g1
    public final Object a() {
        return this.a;
    }

    @Override // com.gamericefishpro.space.w.g1
    public final Object c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        return Intrinsics.a(this.a, g1Var.a()) && Intrinsics.a(this.b, g1Var.c());
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }
}
