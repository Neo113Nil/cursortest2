package com.gamericefishpro.space.w;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 implements u {
    public final float a;
    public final float b;
    public final Object c;

    public v0(float f, float f2, Object obj) {
        this.a = f;
        this.b = f2;
        this.c = obj;
    }

    @Override // com.gamericefishpro.space.w.i
    public final p1 a(com.gamericefishpro.space.u6.l lVar) {
        Object obj = this.c;
        return new com.gamericefishpro.space.tb.u(this.a, this.b, obj == null ? null : (o) ((Function1) lVar.d).invoke(obj));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v0) {
            v0 v0Var = (v0) obj;
            if (v0Var.a == this.a && v0Var.b == this.b && Intrinsics.a(v0Var.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.c;
        return Float.hashCode(this.b) + com.gamericefishpro.space.t0.y0.a(this.a, (obj != null ? obj.hashCode() : 0) * 31, 31);
    }
}
