package com.gamericefishpro.space.d4;

import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class h1 extends g1 {
    public com.gamericefishpro.space.u3.b o;
    public com.gamericefishpro.space.u3.b p;
    public com.gamericefishpro.space.u3.b q;

    public h1(o1 o1Var, WindowInsets windowInsets) {
        super(o1Var, windowInsets);
        this.o = null;
        this.p = null;
        this.q = null;
    }

    @Override // com.gamericefishpro.space.d4.l1
    public com.gamericefishpro.space.u3.b i() {
        if (this.p == null) {
            this.p = com.gamericefishpro.space.u3.b.c(this.c.getMandatorySystemGestureInsets());
        }
        return this.p;
    }

    @Override // com.gamericefishpro.space.d4.l1
    public com.gamericefishpro.space.u3.b k() {
        if (this.o == null) {
            this.o = com.gamericefishpro.space.u3.b.c(this.c.getSystemGestureInsets());
        }
        return this.o;
    }

    @Override // com.gamericefishpro.space.d4.l1
    public com.gamericefishpro.space.u3.b m() {
        if (this.q == null) {
            this.q = com.gamericefishpro.space.u3.b.c(this.c.getTappableElementInsets());
        }
        return this.q;
    }

    @Override // com.gamericefishpro.space.d4.e1, com.gamericefishpro.space.d4.l1
    public o1 n(int i, int i2, int i3, int i4) {
        return o1.d(null, this.c.inset(i, i2, i3, i4));
    }

    public h1(o1 o1Var, h1 h1Var) {
        super(o1Var, h1Var);
        this.o = null;
        this.p = null;
        this.q = null;
    }

    @Override // com.gamericefishpro.space.d4.f1, com.gamericefishpro.space.d4.l1
    public void u(com.gamericefishpro.space.u3.b bVar) {
    }
}
