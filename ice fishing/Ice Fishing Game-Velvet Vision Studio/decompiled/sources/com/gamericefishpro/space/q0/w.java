package com.gamericefishpro.space.q0;

import com.gamericefishpro.space.t0.y0;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class w implements com.gamericefishpro.space.y.q0 {
    public final boolean a;
    public final float b;
    public final long c;

    public w(boolean z, float f, long j) {
        this.a = z;
        this.b = f;
        this.c = j;
    }

    @Override // com.gamericefishpro.space.y.q0
    public final com.gamericefishpro.space.h2.i a(com.gamericefishpro.space.b0.i iVar) {
        return new h(iVar, this.a, this.b, new com.gamericefishpro.space.m.d(22, this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (this.a == wVar.a && com.gamericefishpro.space.c3.f.b(this.b, wVar.b)) {
            return com.gamericefishpro.space.o1.s.d(this.c, wVar.c);
        }
        return false;
    }

    @Override // com.gamericefishpro.space.y.q0
    public final int hashCode() {
        int iA = y0.a(this.b, Boolean.hashCode(this.a) * 31, 961);
        int i = com.gamericefishpro.space.o1.s.h;
        com.gamericefishpro.space.oh.w wVar = com.gamericefishpro.space.oh.x.d;
        return Long.hashCode(this.c) + iA;
    }
}
