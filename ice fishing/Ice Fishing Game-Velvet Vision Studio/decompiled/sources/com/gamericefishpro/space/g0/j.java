package com.gamericefishpro.space.g0;

import com.gamericefishpro.space.h0.d0;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends com.gamericefishpro.space.g1.b {
    public final /* synthetic */ int A;
    public final /* synthetic */ long B;
    public final h e;
    public final d0 i;
    public final int v;
    public final /* synthetic */ d0 w;
    public final /* synthetic */ v y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(h hVar, d0 d0Var, int i, v vVar, int i2, int i3, long j) {
        super(1);
        this.w = d0Var;
        this.y = vVar;
        this.z = i2;
        this.A = i3;
        this.B = j;
        this.e = hVar;
        this.i = d0Var;
        this.v = i;
    }

    public final m s(int i, long j, int i2, int i3, int i4) {
        int i5;
        h hVar = this.e;
        Object objB = hVar.b(i);
        Object objJ = hVar.b.j(i);
        List listL = l(this.i, i, j);
        if (com.gamericefishpro.space.c3.a.f(j)) {
            i5 = com.gamericefishpro.space.c3.a.j(j);
        } else {
            if (!com.gamericefishpro.space.c3.a.e(j)) {
                com.gamericefishpro.space.c0.a.a("does not have fixed height");
            }
            i5 = com.gamericefishpro.space.c3.a.i(j);
        }
        int i6 = i5;
        com.gamericefishpro.space.c3.l layoutDirection = this.w.e.getLayoutDirection();
        com.gamericefishpro.space.h0.w wVar = this.y.m;
        return new m(i, objB, i6, i4, layoutDirection, this.z, this.A, listL, this.B, objJ, wVar, j, i2, i3);
    }
}
