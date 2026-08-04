package com.gamericefishpro.space.u8;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 {
    public final a a;
    public final com.gamericefishpro.space.s8.d b;

    public /* synthetic */ b0(a aVar, com.gamericefishpro.space.s8.d dVar) {
        this.a = aVar;
        this.b = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof b0)) {
            b0 b0Var = (b0) obj;
            if (com.gamericefishpro.space.v8.c0.j(this.a, b0Var.a) && com.gamericefishpro.space.v8.c0.j(this.b, b0Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        com.gamericefishpro.space.u6.s sVar = new com.gamericefishpro.space.u6.s(this);
        sVar.c(this.a, "key");
        sVar.c(this.b, "feature");
        return sVar.toString();
    }
}
