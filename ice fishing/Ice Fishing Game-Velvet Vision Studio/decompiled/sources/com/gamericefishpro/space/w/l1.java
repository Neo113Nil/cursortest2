package com.gamericefishpro.space.w;

import com.gamericefishpro.space.t0.k2;
import com.gamericefishpro.space.t0.s2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class l1 {
    public final com.gamericefishpro.space.g1.b a;
    public final l1 b;
    public final String c;
    public final com.gamericefishpro.space.t0.f1 d;
    public final com.gamericefishpro.space.t0.f1 e;
    public final com.gamericefishpro.space.t0.d1 f = new com.gamericefishpro.space.t0.d1(0);
    public final com.gamericefishpro.space.t0.d1 g = new com.gamericefishpro.space.t0.d1(Long.MIN_VALUE);
    public final com.gamericefishpro.space.t0.f1 h;
    public final com.gamericefishpro.space.f1.u i;
    public final com.gamericefishpro.space.f1.u j;
    public final com.gamericefishpro.space.t0.f1 k;
    public final com.gamericefishpro.space.t0.d0 l;

    public l1(com.gamericefishpro.space.g1.b bVar, l1 l1Var, String str) {
        this.a = bVar;
        this.b = l1Var;
        this.c = str;
        this.d = com.gamericefishpro.space.t0.i.v(bVar.k());
        this.e = com.gamericefishpro.space.t0.i.v(new h1(bVar.k(), bVar.k()));
        Boolean bool = Boolean.FALSE;
        this.h = com.gamericefishpro.space.t0.i.v(bool);
        this.i = new com.gamericefishpro.space.f1.u();
        this.j = new com.gamericefishpro.space.f1.u();
        this.k = com.gamericefishpro.space.t0.i.v(bool);
        this.l = com.gamericefishpro.space.t0.i.p(new d1(this, 1));
        bVar.p(this);
    }

    public final void a(Object obj, com.gamericefishpro.space.t0.r rVar, int i) {
        rVar.b0(-1493585151);
        int i2 = (rVar.f(obj) ? 4 : 2) | i | (rVar.f(this) ? 32 : 16);
        if (rVar.S(i2 & 1, (i2 & 19) != 18)) {
            if (g()) {
                rVar.a0(416369985);
            } else {
                rVar.a0(466062241);
                p(obj);
                int i3 = i2 & 112;
                boolean z = i3 == 32;
                Object objP = rVar.P();
                com.gamericefishpro.space.t0.f fVar = com.gamericefishpro.space.t0.n.a;
                if (z || objP == fVar) {
                    objP = com.gamericefishpro.space.t0.i.p(new d1(this, 0));
                    rVar.k0(objP);
                }
                if (((Boolean) ((s2) objP).getValue()).booleanValue()) {
                    rVar.a0(466470356);
                    Object objP2 = rVar.P();
                    if (objP2 == fVar) {
                        objP2 = com.gamericefishpro.space.t0.i.n(kotlin.coroutines.g.d, rVar);
                        rVar.k0(objP2);
                    }
                    com.gamericefishpro.space.pi.x xVar = (com.gamericefishpro.space.pi.x) objP2;
                    boolean zH = rVar.h(xVar) | (i3 == 32);
                    Object objP3 = rVar.P();
                    if (zH || objP3 == fVar) {
                        objP3 = new com.gamericefishpro.space.d0.q0(26, xVar, this);
                        rVar.k0(objP3);
                    }
                    com.gamericefishpro.space.t0.i.c(xVar, this, (Function1) objP3, rVar);
                } else {
                    rVar.a0(416369985);
                }
                rVar.p(false);
            }
            rVar.p(false);
        } else {
            rVar.V();
        }
        com.gamericefishpro.space.t0.p1 p1VarT = rVar.t();
        if (p1VarT != null) {
            p1VarT.d = new com.gamericefishpro.space.d0.w(i, 16, this, obj);
        }
    }

    public final long b() {
        com.gamericefishpro.space.f1.u uVar = this.i;
        int size = uVar.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            com.gamericefishpro.space.t0.d1 d1Var = ((i1) uVar.get(i)).E;
            jMax = Math.max(jMax, ((k2) com.gamericefishpro.space.f1.p.t(d1Var.e, d1Var)).c);
        }
        com.gamericefishpro.space.f1.u uVar2 = this.j;
        int size2 = uVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            jMax = Math.max(jMax, ((l1) uVar2.get(i2)).b());
        }
        return jMax;
    }

    public final void c() {
        com.gamericefishpro.space.f1.u uVar = this.i;
        int size = uVar.size();
        for (int i = 0; i < size; i++) {
            i1 i1Var = (i1) uVar.get(i);
            i1Var.y = null;
            i1Var.w = null;
            i1Var.B = false;
        }
        com.gamericefishpro.space.f1.u uVar2 = this.j;
        int size2 = uVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((l1) uVar2.get(i2)).c();
        }
    }

    public final boolean d() {
        com.gamericefishpro.space.f1.u uVar = this.i;
        int size = uVar.size();
        for (int i = 0; i < size; i++) {
            if (((i1) uVar.get(i)).w != null) {
                return true;
            }
        }
        com.gamericefishpro.space.f1.u uVar2 = this.j;
        int size2 = uVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (((l1) uVar2.get(i2)).d()) {
                return true;
            }
        }
        return false;
    }

    public final long e() {
        l1 l1Var = this.b;
        if (l1Var != null) {
            return l1Var.e();
        }
        com.gamericefishpro.space.t0.d1 d1Var = this.f;
        return ((k2) com.gamericefishpro.space.f1.p.t(d1Var.e, d1Var)).c;
    }

    public final g1 f() {
        return (g1) this.e.getValue();
    }

    public final boolean g() {
        return ((Boolean) this.k.getValue()).booleanValue();
    }

    public final void h(boolean z, long j) {
        com.gamericefishpro.space.t0.d1 d1Var = this.g;
        long j2 = ((k2) com.gamericefishpro.space.f1.p.t(d1Var.e, d1Var)).c;
        com.gamericefishpro.space.g1.b bVar = this.a;
        if (j2 == Long.MIN_VALUE) {
            d1Var.g(j);
            ((com.gamericefishpro.space.t0.f1) bVar.d).setValue(Boolean.TRUE);
        } else if (!((Boolean) ((com.gamericefishpro.space.t0.f1) bVar.d).getValue()).booleanValue()) {
            ((com.gamericefishpro.space.t0.f1) bVar.d).setValue(Boolean.TRUE);
        }
        this.h.setValue(Boolean.FALSE);
        com.gamericefishpro.space.f1.u uVar = this.i;
        int size = uVar.size();
        boolean z2 = true;
        for (int i = 0; i < size; i++) {
            i1 i1Var = (i1) uVar.get(i);
            com.gamericefishpro.space.t0.f1 f1Var = i1Var.z;
            com.gamericefishpro.space.t0.f1 f1Var2 = i1Var.z;
            if (!((Boolean) f1Var.getValue()).booleanValue()) {
                long jC = z ? i1Var.b().c() : j;
                i1Var.d(i1Var.b().b(jC));
                i1Var.D = i1Var.b().f(jC);
                if (i1Var.b().g(jC)) {
                    f1Var2.setValue(Boolean.TRUE);
                }
            }
            if (!((Boolean) f1Var2.getValue()).booleanValue()) {
                z2 = false;
            }
        }
        com.gamericefishpro.space.f1.u uVar2 = this.j;
        int size2 = uVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            l1 l1Var = (l1) uVar2.get(i2);
            com.gamericefishpro.space.t0.f1 f1Var3 = l1Var.d;
            com.gamericefishpro.space.g1.b bVar2 = l1Var.a;
            if (!Intrinsics.a(f1Var3.getValue(), bVar2.k())) {
                l1Var.h(z, j);
            }
            if (!Intrinsics.a(l1Var.d.getValue(), bVar2.k())) {
                z2 = false;
            }
        }
        if (z2) {
            i();
        }
    }

    public final void i() {
        this.g.g(Long.MIN_VALUE);
        com.gamericefishpro.space.g1.b bVar = this.a;
        if (bVar instanceof d0) {
            ((d0) bVar).o(this.d.getValue());
        }
        n(0L);
        ((com.gamericefishpro.space.t0.f1) bVar.d).setValue(Boolean.FALSE);
        com.gamericefishpro.space.f1.u uVar = this.j;
        int size = uVar.size();
        for (int i = 0; i < size; i++) {
            ((l1) uVar.get(i)).i();
        }
    }

    public final void j(float f) {
        com.gamericefishpro.space.f1.u uVar = this.i;
        int size = uVar.size();
        for (int i = 0; i < size; i++) {
            i1 i1Var = (i1) uVar.get(i);
            i1Var.getClass();
            if (f == -4.0f || f == -5.0f) {
                c1 c1Var = i1Var.y;
                if (c1Var != null) {
                    i1Var.b().h(c1Var.c);
                    i1Var.w = null;
                    i1Var.y = null;
                }
                Object obj = f == -4.0f ? i1Var.b().d : i1Var.b().c;
                i1Var.b().h(obj);
                i1Var.b().i(obj);
                i1Var.d(obj);
                i1Var.E.g(i1Var.b().c());
            } else {
                i1Var.A.h(f);
            }
        }
        com.gamericefishpro.space.f1.u uVar2 = this.j;
        int size2 = uVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((l1) uVar2.get(i2)).j(f);
        }
    }

    public final void k(Object obj, Object obj2) {
        this.g.g(Long.MIN_VALUE);
        com.gamericefishpro.space.g1.b bVar = this.a;
        ((com.gamericefishpro.space.t0.f1) bVar.d).setValue(Boolean.FALSE);
        boolean zG = g();
        com.gamericefishpro.space.t0.f1 f1Var = this.d;
        if (!zG || !Intrinsics.a(bVar.k(), obj) || !Intrinsics.a(f1Var.getValue(), obj2)) {
            if (!Intrinsics.a(bVar.k(), obj) && (bVar instanceof d0)) {
                ((d0) bVar).o(obj);
            }
            f1Var.setValue(obj2);
            this.k.setValue(Boolean.TRUE);
            this.e.setValue(new h1(obj, obj2));
        }
        com.gamericefishpro.space.f1.u uVar = this.j;
        int size = uVar.size();
        for (int i = 0; i < size; i++) {
            l1 l1Var = (l1) uVar.get(i);
            Intrinsics.c(l1Var, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Any>");
            if (l1Var.g()) {
                l1Var.k(l1Var.a.k(), l1Var.d.getValue());
            }
        }
        com.gamericefishpro.space.f1.u uVar2 = this.i;
        int size2 = uVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((i1) uVar2.get(i2)).c(0L);
        }
    }

    public final void l(long j) {
        com.gamericefishpro.space.t0.d1 d1Var = this.g;
        if (((k2) com.gamericefishpro.space.f1.p.t(d1Var.e, d1Var)).c == Long.MIN_VALUE) {
            d1Var.g(j);
        }
        n(j);
        this.h.setValue(Boolean.FALSE);
        com.gamericefishpro.space.f1.u uVar = this.i;
        int size = uVar.size();
        for (int i = 0; i < size; i++) {
            ((i1) uVar.get(i)).c(j);
        }
        com.gamericefishpro.space.f1.u uVar2 = this.j;
        int size2 = uVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            l1 l1Var = (l1) uVar2.get(i2);
            if (!Intrinsics.a(l1Var.d.getValue(), l1Var.a.k())) {
                l1Var.l(j);
            }
        }
    }

    public final void m(l0 l0Var) {
        com.gamericefishpro.space.f1.u uVar = this.i;
        int size = uVar.size();
        for (int i = 0; i < size; i++) {
            i1 i1Var = (i1) uVar.get(i);
            com.gamericefishpro.space.t0.f1 f1Var = i1Var.C;
            if (!Intrinsics.a(i1Var.b().c, i1Var.b().d)) {
                i1Var.y = i1Var.b();
                i1Var.w = l0Var;
            }
            i1Var.v.setValue(new c1(i1Var.G, i1Var.d, f1Var.getValue(), f1Var.getValue(), i1Var.D.c()));
            i1Var.E.g(i1Var.b().c());
            i1Var.B = true;
        }
        com.gamericefishpro.space.f1.u uVar2 = this.j;
        int size2 = uVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((l1) uVar2.get(i2)).m(l0Var);
        }
    }

    public final void n(long j) {
        if (this.b == null) {
            this.f.g(j);
        }
    }

    public final void o() {
        c1 c1Var;
        com.gamericefishpro.space.f1.u uVar = this.i;
        int size = uVar.size();
        for (int i = 0; i < size; i++) {
            i1 i1Var = (i1) uVar.get(i);
            l0 l0Var = i1Var.w;
            if (l0Var != null && (c1Var = i1Var.y) != null) {
                long jB = com.gamericefishpro.space.gi.c.b(l0Var.g * ((double) l0Var.d));
                Object objB = c1Var.b(jB);
                if (i1Var.B) {
                    i1Var.b().i(objB);
                }
                i1Var.b().h(objB);
                i1Var.E.g(i1Var.b().c());
                if (i1Var.A.g() == -2.0f || i1Var.B) {
                    i1Var.d(objB);
                } else {
                    i1Var.c(i1Var.H.e());
                }
                if (jB >= l0Var.g) {
                    i1Var.w = null;
                    i1Var.y = null;
                } else {
                    l0Var.c = false;
                }
            }
        }
        com.gamericefishpro.space.f1.u uVar2 = this.j;
        int size2 = uVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((l1) uVar2.get(i2)).o();
        }
    }

    public final void p(Object obj) {
        com.gamericefishpro.space.t0.f1 f1Var = this.d;
        if (Intrinsics.a(f1Var.getValue(), obj)) {
            return;
        }
        this.e.setValue(new h1(f1Var.getValue(), obj));
        com.gamericefishpro.space.g1.b bVar = this.a;
        if (!Intrinsics.a(bVar.k(), f1Var.getValue())) {
            bVar.o(f1Var.getValue());
        }
        f1Var.setValue(obj);
        com.gamericefishpro.space.t0.d1 d1Var = this.g;
        if (((k2) com.gamericefishpro.space.f1.p.t(d1Var.e, d1Var)).c == Long.MIN_VALUE) {
            this.h.setValue(Boolean.TRUE);
        }
        com.gamericefishpro.space.f1.u uVar = this.i;
        int size = uVar.size();
        for (int i = 0; i < size; i++) {
            ((i1) uVar.get(i)).A.h(-2.0f);
        }
    }

    public final String toString() {
        com.gamericefishpro.space.f1.u uVar = this.i;
        int size = uVar.size();
        String str = "Transition animation values: ";
        for (int i = 0; i < size; i++) {
            str = str + ((i1) uVar.get(i)) + ", ";
        }
        return str;
    }
}
