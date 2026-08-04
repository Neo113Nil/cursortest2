package com.gamericefishpro.space.f2;

import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class y implements h1, n0 {
    public final /* synthetic */ b0 d;
    public final /* synthetic */ h0 e;

    public y(h0 h0Var) {
        this.e = h0Var;
        this.d = h0Var.A;
    }

    @Override // com.gamericefishpro.space.c3.c
    public final float D(long j) {
        return this.d.D(j);
    }

    @Override // com.gamericefishpro.space.f2.n0
    public final m0 G(int i, int i2, Map map, Function1 function1, Function1 function2) {
        return this.d.G(i, i2, map, function1, function2);
    }

    @Override // com.gamericefishpro.space.c3.c
    public final int J(float f) {
        return this.d.J(f);
    }

    @Override // com.gamericefishpro.space.c3.c
    public final long S(long j) {
        return this.d.S(j);
    }

    @Override // com.gamericefishpro.space.c3.c
    public final float V(long j) {
        return this.d.V(j);
    }

    @Override // com.gamericefishpro.space.c3.c
    public final float b() {
        return this.d.e;
    }

    @Override // com.gamericefishpro.space.c3.c
    public final long b0(float f) {
        return this.d.b0(f);
    }

    @Override // com.gamericefishpro.space.c3.c
    public final float g() {
        return this.d.i;
    }

    @Override // com.gamericefishpro.space.c3.c
    public final float g0(int i) {
        return this.d.g0(i);
    }

    @Override // com.gamericefishpro.space.f2.p
    public final com.gamericefishpro.space.c3.l getLayoutDirection() {
        return this.d.d;
    }

    @Override // com.gamericefishpro.space.c3.c
    public final float i0(float f) {
        return f / this.d.b();
    }

    @Override // com.gamericefishpro.space.f2.h1
    public final List j(Object obj, Function2 function2) {
        h0 h0Var = this.e;
        com.gamericefishpro.space.h2.f0 f0Var = h0Var.d;
        com.gamericefishpro.space.t.h0 h0Var2 = h0Var.z;
        com.gamericefishpro.space.h2.f0 f0Var2 = (com.gamericefishpro.space.h2.f0) h0Var2.g(obj);
        if (f0Var2 != null && ((com.gamericefishpro.space.v0.b) f0Var.o()).d.i(f0Var2) < h0Var.v) {
            return f0Var2.m();
        }
        com.gamericefishpro.space.t.h0 h0Var3 = h0Var.E;
        com.gamericefishpro.space.t.h0 h0Var4 = h0Var.C;
        com.gamericefishpro.space.v0.e eVar = h0Var.F;
        if (eVar.i < h0Var.w) {
            com.gamericefishpro.space.e2.a.a("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        com.gamericefishpro.space.h2.f0 f0Var3 = (com.gamericefishpro.space.h2.f0) h0Var2.g(obj);
        int i = eVar.i;
        int i2 = h0Var.w;
        if (i == i2) {
            eVar.b(obj);
        } else {
            Object[] objArr = eVar.d;
            Object obj2 = objArr[i2];
            objArr[i2] = obj;
        }
        h0Var.w++;
        boolean zB = h0Var4.b(obj);
        if (zB || f0Var3 != null) {
            if (!zB && f0Var3 != null) {
                h0Var.j(((com.gamericefishpro.space.v0.b) f0Var.o()).d.i(f0Var3), ((com.gamericefishpro.space.v0.b) f0Var.o()).d.i);
                h0Var.H++;
                h0Var2.k(obj);
                h0Var4.m(obj, f0Var3);
                h0Var3.m(obj, h0Var.f(obj));
                if (f0Var.H()) {
                    h0Var.h();
                }
            }
            com.gamericefishpro.space.h2.f0 f0Var4 = (com.gamericefishpro.space.h2.f0) h0Var4.g(obj);
            z zVar = f0Var4 != null ? (z) h0Var.y.g(f0Var4) : null;
            if (zVar != null && zVar.d) {
                h0Var.m(f0Var4, obj, false, function2);
            }
            if ((zVar != null ? zVar.f : null) != null) {
                h0Var.b(zVar, true);
            }
        } else {
            h0Var.k(obj, function2, false);
            h0Var3.m(obj, h0Var.f(obj));
        }
        com.gamericefishpro.space.h2.f0 f0Var5 = (com.gamericefishpro.space.h2.f0) h0Var4.g(obj);
        if (f0Var5 == null) {
            return com.gamericefishpro.space.ph.g0.d;
        }
        List listE0 = f0Var5.a0.p.e0();
        com.gamericefishpro.space.v0.b bVar = (com.gamericefishpro.space.v0.b) listE0;
        int i3 = bVar.d.i;
        for (int i4 = 0; i4 < i3; i4++) {
            ((com.gamericefishpro.space.h2.v0) bVar.get(i4)).y.b = true;
        }
        return listE0;
    }

    @Override // com.gamericefishpro.space.f2.p
    public final boolean n() {
        return this.d.n();
    }

    @Override // com.gamericefishpro.space.c3.c
    public final long q(float f) {
        return this.d.q(f);
    }

    @Override // com.gamericefishpro.space.c3.c
    public final float r(float f) {
        return this.d.b() * f;
    }

    @Override // com.gamericefishpro.space.f2.n0
    public final m0 y(int i, int i2, Map map, Function1 function1) {
        return this.d.G(i, i2, map, null, function1);
    }
}
