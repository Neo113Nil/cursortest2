package com.gamericefishpro.space.f0;

import com.gamericefishpro.space.h0.d0;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends com.gamericefishpro.space.g1.b {
    public final /* synthetic */ com.gamericefishpro.space.h1.c A;
    public final /* synthetic */ int B;
    public final /* synthetic */ int C;
    public final /* synthetic */ long D;
    public final /* synthetic */ w E;
    public final j e;
    public final d0 i;
    public final long v;
    public final /* synthetic */ d0 w;
    public final /* synthetic */ int y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(long j, j jVar, d0 d0Var, int i, int i2, com.gamericefishpro.space.h1.c cVar, int i3, int i4, long j2, w wVar) {
        super(1);
        this.w = d0Var;
        this.y = i;
        this.z = i2;
        this.A = cVar;
        this.B = i3;
        this.C = i4;
        this.D = j2;
        this.E = wVar;
        this.e = jVar;
        this.i = d0Var;
        this.v = com.gamericefishpro.space.c3.b.b(com.gamericefishpro.space.c3.a.h(j), Integer.MAX_VALUE, 5);
    }

    public final r s(int i, long j) {
        j jVar = this.e;
        Object objB = jVar.b(i);
        Object objJ = jVar.b.j(i);
        return new r(i, l(this.i, i, j), this.A, this.w.e.getLayoutDirection(), this.B, this.C, i == this.y + (-1) ? 0 : this.z, this.D, objB, objJ, this.E.n, j);
    }
}
