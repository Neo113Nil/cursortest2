package com.gamericefishpro.space.w;

import com.gamericefishpro.space.t0.s2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class z implements s2 {
    public long A;
    public final /* synthetic */ b0 B;
    public Comparable d;
    public Comparable e;
    public final com.gamericefishpro.space.u6.l i;
    public final com.gamericefishpro.space.t0.f1 v;
    public c1 w;
    public boolean y;
    public boolean z;

    public z(b0 b0Var, Comparable comparable, Comparable comparable2, com.gamericefishpro.space.u6.l lVar, y yVar) {
        this.B = b0Var;
        this.d = comparable;
        this.e = comparable2;
        this.i = lVar;
        this.v = com.gamericefishpro.space.t0.i.v(comparable);
        this.w = new c1(yVar, lVar, this.d, this.e, null);
    }

    @Override // com.gamericefishpro.space.t0.s2
    public final Object getValue() {
        return this.v.getValue();
    }
}
