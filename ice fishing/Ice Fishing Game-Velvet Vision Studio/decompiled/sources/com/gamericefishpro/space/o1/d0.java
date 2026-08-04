package com.gamericefishpro.space.o1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends o {
    public final com.gamericefishpro.space.n1.d f;
    public final h g;

    public d0(com.gamericefishpro.space.n1.d dVar) {
        h hVarA;
        this.f = dVar;
        if (com.gamericefishpro.space.u6.f.H(dVar)) {
            hVarA = null;
        } else {
            hVarA = j.a();
            h.b(hVarA, dVar);
        }
        this.g = hVarA;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d0) {
            return Intrinsics.a(this.f, ((d0) obj).f);
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode();
    }

    @Override // com.gamericefishpro.space.o1.o
    public final com.gamericefishpro.space.n1.c l() {
        com.gamericefishpro.space.n1.d dVar = this.f;
        return new com.gamericefishpro.space.n1.c(dVar.a, dVar.b, dVar.c, dVar.d);
    }
}
