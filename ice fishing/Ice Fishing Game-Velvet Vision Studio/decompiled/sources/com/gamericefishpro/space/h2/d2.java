package com.gamericefishpro.space.h2;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d2 implements com.gamericefishpro.space.t0.c {
    public final Object d;
    public final ArrayList e = new ArrayList();
    public Object i;

    public d2(f0 f0Var) {
        this.d = f0Var;
        this.i = f0Var;
    }

    public final void a() {
        this.e.clear();
        this.i = this.d;
        ((f0) this.d).P();
    }

    @Override // com.gamericefishpro.space.t0.c
    public final void c(int i, Object obj) {
        ((f0) this.i).B(i, (f0) obj);
    }

    @Override // com.gamericefishpro.space.t0.c
    public final void d(Object obj) {
        this.e.add(this.i);
        this.i = obj;
    }

    @Override // com.gamericefishpro.space.t0.c
    public final void e() {
        com.gamericefishpro.space.p2.b rectManager;
        com.gamericefishpro.space.i1.b bVar;
        com.gamericefishpro.space.p2.b rectManager2;
        f0 f0Var = (f0) this.i;
        a1 a1Var = f0Var.Z;
        if (!f0Var.H()) {
            com.gamericefishpro.space.e2.a.a("onReuse is only expected on attached node");
        }
        com.gamericefishpro.space.f3.z zVar = f0Var.I;
        if (zVar != null) {
            View view = zVar.e;
            if (view.getParent() != zVar) {
                zVar.addView(view);
            } else {
                zVar.y.invoke();
            }
        }
        com.gamericefishpro.space.f2.h0 h0Var = f0Var.b0;
        if (h0Var != null) {
            h0Var.i(false);
        }
        f0Var.N = false;
        if (f0Var.k0) {
            f0Var.k0 = false;
        } else {
            com.gamericefishpro.space.h1.l lVar = f0Var.Z.e;
            for (com.gamericefishpro.space.h1.l lVar2 = lVar; lVar2 != null; lVar2 = lVar2.w) {
                if (lVar2.G) {
                    lVar2.v0();
                }
            }
            for (com.gamericefishpro.space.h1.l lVar3 = lVar; lVar3 != null; lVar3 = lVar3.w) {
                if (lVar3.G) {
                    lVar3.x0();
                }
            }
            while (lVar != null) {
                if (lVar.G) {
                    lVar.r0();
                }
                lVar = lVar.w;
            }
        }
        int i = f0Var.e;
        o1 o1Var = f0Var.H;
        if (o1Var != null && (rectManager2 = ((com.gamericefishpro.space.i2.t) o1Var).getRectManager()) != null) {
            rectManager2.g(f0Var);
        }
        f0Var.e = com.gamericefishpro.space.o2.m.a.addAndGet(1);
        o1 o1Var2 = f0Var.H;
        if (o1Var2 != null) {
            com.gamericefishpro.space.i2.t tVar = (com.gamericefishpro.space.i2.t) o1Var2;
            tVar.getLayoutNodes().g(i);
            tVar.getLayoutNodes().h(f0Var.e, f0Var);
        }
        for (com.gamericefishpro.space.h1.l lVar4 = a1Var.f; lVar4 != null; lVar4 = lVar4.y) {
            lVar4.q0();
        }
        a1Var.e();
        if (a1Var.d(8)) {
            f0Var.F();
        }
        f0.W(f0Var);
        o1 o1Var3 = f0Var.H;
        if (o1Var3 != null && (bVar = ((com.gamericefishpro.space.i2.t) o1Var3).h0) != null) {
            com.gamericefishpro.space.i2.t tVar2 = bVar.i;
            com.gamericefishpro.space.vb.c cVar = bVar.d;
            com.gamericefishpro.space.t.x xVar = bVar.z;
            if (xVar.e(i)) {
                cVar.n(tVar2, i, false);
            }
            com.gamericefishpro.space.o2.l lVarX = f0Var.x();
            if (lVarX != null && lVarX.d.b(com.gamericefishpro.space.o2.s.q)) {
                xVar.a(f0Var.e);
                cVar.n(tVar2, f0Var.e, true);
            }
        }
        o1 o1Var4 = f0Var.H;
        if (o1Var4 == null || (rectManager = ((com.gamericefishpro.space.i2.t) o1Var4).getRectManager()) == null) {
            return;
        }
        rectManager.e(f0Var, true);
    }

    @Override // com.gamericefishpro.space.t0.c
    public final /* bridge */ /* synthetic */ void g(int i, Object obj) {
    }

    @Override // com.gamericefishpro.space.t0.c
    public final Object getCurrent() {
        return this.i;
    }

    @Override // com.gamericefishpro.space.t0.c
    public final void h() {
        o1 o1Var = ((f0) this.d).H;
        if (o1Var != null) {
            ((com.gamericefishpro.space.i2.t) o1Var).y();
        }
    }

    @Override // com.gamericefishpro.space.t0.c
    public final void i(int i, int i2, int i3) {
        ((f0) this.i).L(i, i2, i3);
    }

    @Override // com.gamericefishpro.space.t0.c
    public final void j(int i, int i2) {
        ((f0) this.i).Q(i, i2);
    }

    @Override // com.gamericefishpro.space.t0.c
    public final void l() {
        ArrayList arrayList = this.e;
        this.i = arrayList.remove(arrayList.size() - 1);
    }
}
