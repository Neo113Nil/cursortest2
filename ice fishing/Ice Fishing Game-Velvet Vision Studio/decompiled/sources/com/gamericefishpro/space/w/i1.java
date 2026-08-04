package com.gamericefishpro.space.w;

import com.gamericefishpro.space.t0.k2;
import com.gamericefishpro.space.t0.s2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class i1 implements s2 {
    public final com.gamericefishpro.space.t0.b1 A;
    public boolean B;
    public final com.gamericefishpro.space.t0.f1 C;
    public o D;
    public final com.gamericefishpro.space.t0.d1 E;
    public boolean F;
    public final v0 G;
    public final /* synthetic */ l1 H;
    public final com.gamericefishpro.space.u6.l d;
    public final com.gamericefishpro.space.t0.f1 e;
    public final com.gamericefishpro.space.t0.f1 i;
    public final com.gamericefishpro.space.t0.f1 v;
    public l0 w;
    public c1 y;
    public final com.gamericefishpro.space.t0.f1 z;

    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.Object, java.util.Map] */
    public i1(l1 l1Var, Object obj, o oVar, com.gamericefishpro.space.u6.l lVar) {
        this.H = l1Var;
        this.d = lVar;
        com.gamericefishpro.space.t0.f1 f1VarV = com.gamericefishpro.space.t0.i.v(obj);
        this.e = f1VarV;
        Object objInvoke = null;
        com.gamericefishpro.space.t0.f1 f1VarV2 = com.gamericefishpro.space.t0.i.v(c.n(0.0f, 0.0f, null, 7));
        this.i = f1VarV2;
        this.v = com.gamericefishpro.space.t0.i.v(new c1((u) f1VarV2.getValue(), lVar, obj, f1VarV.getValue(), oVar));
        this.z = com.gamericefishpro.space.t0.i.v(Boolean.TRUE);
        this.A = new com.gamericefishpro.space.t0.b1(-1.0f);
        this.C = com.gamericefishpro.space.t0.i.v(obj);
        this.D = oVar;
        this.E = new com.gamericefishpro.space.t0.d1(b().c());
        Float f = (Float) t1.a.get(lVar);
        if (f != null) {
            float fFloatValue = f.floatValue();
            o oVar2 = (o) ((Function1) lVar.d).invoke(obj);
            int iB = oVar2.b();
            for (int i = 0; i < iB; i++) {
                oVar2.e(i, fFloatValue);
            }
            objInvoke = ((Function1) this.d.e).invoke(oVar2);
        }
        this.G = c.n(0.0f, 0.0f, objInvoke, 3);
    }

    public final c1 b() {
        return (c1) this.v.getValue();
    }

    public final void c(long j) {
        if (this.A.g() == -1.0f) {
            this.F = true;
            if (Intrinsics.a(b().c, b().d)) {
                d(b().c);
            } else {
                d(b().b(j));
                this.D = b().f(j);
            }
        }
    }

    public final void d(Object obj) {
        this.C.setValue(obj);
    }

    public final void e(Object obj, boolean z) {
        u uVar;
        c1 c1Var = this.y;
        Object obj2 = c1Var != null ? c1Var.c : null;
        com.gamericefishpro.space.t0.f1 f1Var = this.e;
        boolean zA = Intrinsics.a(obj2, f1Var.getValue());
        com.gamericefishpro.space.t0.d1 d1Var = this.E;
        com.gamericefishpro.space.t0.f1 f1Var2 = this.v;
        com.gamericefishpro.space.u6.l lVar = this.d;
        v0 v0Var = this.G;
        if (zA) {
            f1Var2.setValue(new c1(v0Var, lVar, obj, obj, this.D.c()));
            this.B = true;
            d1Var.g(b().c());
            return;
        }
        com.gamericefishpro.space.t0.f1 f1Var3 = this.i;
        if (!z || this.F) {
            uVar = (u) f1Var3.getValue();
        } else if (((u) f1Var3.getValue()) instanceof v0) {
            uVar = v0Var;
            uVar = (u) f1Var3.getValue();
        }
        uVar = v0Var;
        l1 l1Var = this.H;
        long jE = l1Var.e();
        com.gamericefishpro.space.t0.f1 f1Var4 = l1Var.h;
        i w0Var = uVar;
        if (jE > 0) {
            w0Var = new w0(uVar, l1Var.e());
        }
        f1Var2.setValue(new c1(w0Var, lVar, obj, f1Var.getValue(), this.D));
        d1Var.g(b().c());
        this.B = false;
        f1Var4.setValue(Boolean.TRUE);
        if (l1Var.g()) {
            com.gamericefishpro.space.f1.u uVar2 = l1Var.i;
            int size = uVar2.size();
            long jMax = 0;
            for (int i = 0; i < size; i++) {
                i1 i1Var = (i1) uVar2.get(i);
                com.gamericefishpro.space.t0.d1 d1Var2 = i1Var.E;
                jMax = Math.max(jMax, ((k2) com.gamericefishpro.space.f1.p.t(d1Var2.e, d1Var2)).c);
                i1Var.c(0L);
            }
            f1Var4.setValue(Boolean.FALSE);
        }
    }

    public final void f(Object obj, Object obj2, u uVar) {
        this.e.setValue(obj2);
        this.i.setValue(uVar);
        if (Intrinsics.a(b().d, obj) && Intrinsics.a(b().c, obj2)) {
            return;
        }
        e(obj, false);
    }

    @Override // com.gamericefishpro.space.t0.s2
    public final Object getValue() {
        return this.C.getValue();
    }

    public final String toString() {
        return "current value: " + this.C.getValue() + ", target: " + this.e.getValue() + ", spec: " + ((u) this.i.getValue());
    }
}
