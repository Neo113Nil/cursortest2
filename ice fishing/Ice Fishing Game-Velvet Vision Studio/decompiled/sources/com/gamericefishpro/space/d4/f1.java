package com.gamericefishpro.space.d4;

import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class f1 extends e1 {
    public com.gamericefishpro.space.u3.b n;

    public f1(o1 o1Var, WindowInsets windowInsets) {
        super(o1Var, windowInsets);
        this.n = null;
    }

    @Override // com.gamericefishpro.space.d4.l1
    public o1 b() {
        return o1.d(null, this.c.consumeStableInsets());
    }

    @Override // com.gamericefishpro.space.d4.l1
    public o1 c() {
        return o1.d(null, this.c.consumeSystemWindowInsets());
    }

    @Override // com.gamericefishpro.space.d4.l1
    public final com.gamericefishpro.space.u3.b j() {
        if (this.n == null) {
            WindowInsets windowInsets = this.c;
            this.n = com.gamericefishpro.space.u3.b.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.n;
    }

    @Override // com.gamericefishpro.space.d4.l1
    public boolean o() {
        return this.c.isConsumed();
    }

    @Override // com.gamericefishpro.space.d4.l1
    public void u(com.gamericefishpro.space.u3.b bVar) {
        this.n = bVar;
    }

    public f1(o1 o1Var, f1 f1Var) {
        super(o1Var, f1Var);
        this.n = null;
        this.n = f1Var.n;
    }
}
