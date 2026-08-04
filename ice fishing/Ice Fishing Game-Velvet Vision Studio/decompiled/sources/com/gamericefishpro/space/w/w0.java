package com.gamericefishpro.space.w;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 implements i {
    public final i a;
    public final long b;

    public w0(u uVar, long j) {
        this.a = uVar;
        this.b = j;
    }

    @Override // com.gamericefishpro.space.w.i
    public final p1 a(com.gamericefishpro.space.u6.l lVar) {
        return new x0(this.a.a(lVar), this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return w0Var.b == this.b && Intrinsics.a(w0Var.a, this.a);
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
