package com.gamericefishpro.space.u1;

import com.gamericefishpro.space.t0.f1;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends com.gamericefishpro.space.t1.b {
    public final f1 e = com.gamericefishpro.space.t0.i.v(new com.gamericefishpro.space.n1.e(0));
    public final f1 f = com.gamericefishpro.space.t0.i.v(Boolean.FALSE);
    public final e0 g;
    public final f1 h;
    public float i;
    public com.gamericefishpro.space.o1.k j;

    public i0(c cVar) {
        e0 e0Var = new e0(cVar);
        e0Var.f = new com.gamericefishpro.space.a2.b(11, this);
        this.g = e0Var;
        this.h = new f1(Unit.a, com.gamericefishpro.space.t0.f.v);
        this.i = 1.0f;
    }

    @Override // com.gamericefishpro.space.t1.b
    public final void a(float f) {
        this.i = f;
    }

    @Override // com.gamericefishpro.space.t1.b
    public final void b(com.gamericefishpro.space.o1.k kVar) {
        this.j = kVar;
    }

    @Override // com.gamericefishpro.space.t1.b
    public final long d() {
        return ((com.gamericefishpro.space.n1.e) this.e.getValue()).a;
    }

    @Override // com.gamericefishpro.space.t1.b
    public final void e(com.gamericefishpro.space.q1.d dVar) {
        com.gamericefishpro.space.o1.k kVar = this.j;
        e0 e0Var = this.g;
        if (kVar == null) {
            kVar = (com.gamericefishpro.space.o1.k) e0Var.g.getValue();
        }
        if (((Boolean) this.f.getValue()).booleanValue() && dVar.getLayoutDirection() == com.gamericefishpro.space.c3.l.e) {
            long jQ = dVar.Q();
            com.gamericefishpro.space.a8.c cVarX = dVar.x();
            long jO = cVarX.o();
            cVarX.j().k();
            try {
                ((com.gamericefishpro.space.m.d) cVarX.e).A(-1.0f, 1.0f, jQ);
                e0Var.e(dVar, this.i, kVar);
                cVarX.j().i();
                cVarX.H(jO);
            } catch (Throwable th) {
                cVarX.j().i();
                cVarX.H(jO);
                throw th;
            }
        } else {
            e0Var.e(dVar, this.i, kVar);
        }
        this.h.getValue();
        Unit unit = Unit.a;
    }
}
