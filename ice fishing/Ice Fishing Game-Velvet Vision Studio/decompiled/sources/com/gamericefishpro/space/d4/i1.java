package com.gamericefishpro.space.d4;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class i1 extends h1 {
    public static final o1 r = o1.d(null, WindowInsets.CONSUMED);

    public i1(o1 o1Var, WindowInsets windowInsets) {
        super(o1Var, windowInsets);
    }

    @Override // com.gamericefishpro.space.d4.e1, com.gamericefishpro.space.d4.l1
    public com.gamericefishpro.space.u3.b g(int i) {
        return com.gamericefishpro.space.u3.b.c(this.c.getInsets(m1.a(i)));
    }

    @Override // com.gamericefishpro.space.d4.e1, com.gamericefishpro.space.d4.l1
    public com.gamericefishpro.space.u3.b h(int i) {
        return com.gamericefishpro.space.u3.b.c(this.c.getInsetsIgnoringVisibility(m1.a(i)));
    }

    @Override // com.gamericefishpro.space.d4.e1, com.gamericefishpro.space.d4.l1
    public boolean q(int i) {
        return this.c.isVisible(m1.a(i));
    }

    public i1(o1 o1Var, i1 i1Var) {
        super(o1Var, i1Var);
    }

    @Override // com.gamericefishpro.space.d4.e1, com.gamericefishpro.space.d4.l1
    public final void d(View view) {
    }
}
