package com.gamericefishpro.space.d4;

import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class z0 extends d1 {
    public final WindowInsets.Builder c;

    public z0() {
        this.c = com.gamericefishpro.space.a4.a.g();
    }

    @Override // com.gamericefishpro.space.d4.d1
    public o1 b() {
        a();
        o1 o1VarD = o1.d(null, this.c.build());
        o1VarD.a.r(this.b);
        return o1VarD;
    }

    @Override // com.gamericefishpro.space.d4.d1
    public void d(com.gamericefishpro.space.u3.b bVar) {
        this.c.setMandatorySystemGestureInsets(bVar.d());
    }

    @Override // com.gamericefishpro.space.d4.d1
    public void e(com.gamericefishpro.space.u3.b bVar) {
        this.c.setStableInsets(bVar.d());
    }

    @Override // com.gamericefishpro.space.d4.d1
    public void f(com.gamericefishpro.space.u3.b bVar) {
        this.c.setSystemGestureInsets(bVar.d());
    }

    @Override // com.gamericefishpro.space.d4.d1
    public void g(com.gamericefishpro.space.u3.b bVar) {
        this.c.setSystemWindowInsets(bVar.d());
    }

    @Override // com.gamericefishpro.space.d4.d1
    public void h(com.gamericefishpro.space.u3.b bVar) {
        this.c.setTappableElementInsets(bVar.d());
    }

    public z0(o1 o1Var) {
        WindowInsets.Builder builderG;
        super(o1Var);
        WindowInsets windowInsetsC = o1Var.c();
        if (windowInsetsC != null) {
            builderG = com.gamericefishpro.space.a4.a.h(windowInsetsC);
        } else {
            builderG = com.gamericefishpro.space.a4.a.g();
        }
        this.c = builderG;
    }
}
