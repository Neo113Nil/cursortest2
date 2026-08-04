package com.gamericefishpro.space.o1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends o {
    public final com.gamericefishpro.space.n1.c f;

    public c0(com.gamericefishpro.space.n1.c cVar) {
        this.f = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c0) {
            return Intrinsics.a(this.f, ((c0) obj).f);
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode();
    }

    @Override // com.gamericefishpro.space.o1.o
    public final com.gamericefishpro.space.n1.c l() {
        return this.f;
    }
}
