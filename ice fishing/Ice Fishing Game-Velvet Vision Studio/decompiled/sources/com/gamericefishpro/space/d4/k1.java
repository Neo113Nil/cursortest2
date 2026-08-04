package com.gamericefishpro.space.d4;

import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class k1 extends j1 {
    public static final o1 s = o1.d(null, WindowInsets.CONSUMED);

    public k1(o1 o1Var, WindowInsets windowInsets) {
        super(o1Var, windowInsets);
    }

    @Override // com.gamericefishpro.space.d4.i1, com.gamericefishpro.space.d4.e1, com.gamericefishpro.space.d4.l1
    public com.gamericefishpro.space.u3.b g(int i) {
        return com.gamericefishpro.space.u3.b.c(this.c.getInsets(n1.a(i)));
    }

    @Override // com.gamericefishpro.space.d4.i1, com.gamericefishpro.space.d4.e1, com.gamericefishpro.space.d4.l1
    public com.gamericefishpro.space.u3.b h(int i) {
        return com.gamericefishpro.space.u3.b.c(this.c.getInsetsIgnoringVisibility(n1.a(i)));
    }

    @Override // com.gamericefishpro.space.d4.i1, com.gamericefishpro.space.d4.e1, com.gamericefishpro.space.d4.l1
    public boolean q(int i) {
        return this.c.isVisible(n1.a(i));
    }

    public k1(o1 o1Var, k1 k1Var) {
        super(o1Var, k1Var);
    }
}
