package com.gamericefishpro.space.i2;

import com.gamericefishpro.space.R;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class p2 implements com.gamericefishpro.space.t0.t, com.gamericefishpro.space.z4.s {
    public final t d;
    public final com.gamericefishpro.space.t0.x e;
    public boolean i;
    public com.gamericefishpro.space.z4.w v;
    public Function2 w = z0.a;

    public p2(t tVar, com.gamericefishpro.space.t0.x xVar) {
        this.d = tVar;
        this.e = xVar;
    }

    public final void a() {
        if (!this.i) {
            this.i = true;
            this.d.getView().setTag(R.id.wrapped_composition_tag, null);
            com.gamericefishpro.space.z4.w wVar = this.v;
            if (wVar != null) {
                wVar.f(this);
            }
        }
        this.e.m();
    }

    public final void d(Function2 function2) {
        this.d.setOnViewTreeOwnersAvailable(new com.gamericefishpro.space.b2.t(7, this, function2));
    }

    @Override // com.gamericefishpro.space.z4.s
    public final void j(com.gamericefishpro.space.z4.u uVar, com.gamericefishpro.space.z4.o oVar) {
        if (oVar == com.gamericefishpro.space.z4.o.ON_DESTROY) {
            a();
        } else {
            if (oVar != com.gamericefishpro.space.z4.o.ON_CREATE || this.i) {
                return;
            }
            d(this.w);
        }
    }
}
