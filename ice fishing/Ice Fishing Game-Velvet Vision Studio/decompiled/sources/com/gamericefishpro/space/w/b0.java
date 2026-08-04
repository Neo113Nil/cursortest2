package com.gamericefishpro.space.w;

import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 {
    public final com.gamericefishpro.space.v0.e a = new com.gamericefishpro.space.v0.e(new z[16]);
    public final com.gamericefishpro.space.t0.f1 b = com.gamericefishpro.space.t0.i.v(Boolean.FALSE);
    public long c = Long.MIN_VALUE;
    public final com.gamericefishpro.space.t0.f1 d = com.gamericefishpro.space.t0.i.v(Boolean.TRUE);

    public final void a(com.gamericefishpro.space.t0.r rVar, int i) {
        rVar.b0(-318043801);
        int i2 = (rVar.h(this) ? 4 : 2) | i;
        if (rVar.S(i2 & 1, (i2 & 3) != 2)) {
            Object objP = rVar.P();
            com.gamericefishpro.space.t0.f fVar = com.gamericefishpro.space.t0.n.a;
            if (objP == fVar) {
                objP = com.gamericefishpro.space.t0.i.v(null);
                rVar.k0(objP);
            }
            com.gamericefishpro.space.t0.v0 v0Var = (com.gamericefishpro.space.t0.v0) objP;
            if (((Boolean) this.d.getValue()).booleanValue() || ((Boolean) this.b.getValue()).booleanValue()) {
                rVar.a0(-144841960);
                boolean zH = rVar.h(this);
                Object objP2 = rVar.P();
                if (zH || objP2 == fVar) {
                    objP2 = new com.gamericefishpro.space.g5.y(v0Var, this, null);
                    rVar.k0(objP2);
                }
                com.gamericefishpro.space.t0.i.e(rVar, this, (Function2) objP2);
            } else {
                rVar.a0(-151918981);
            }
            rVar.p(false);
        } else {
            rVar.V();
        }
        com.gamericefishpro.space.t0.p1 p1VarT = rVar.t();
        if (p1VarT != null) {
            p1VarT.d = new com.gamericefishpro.space.d0.n1(i, 15, this);
        }
    }
}
