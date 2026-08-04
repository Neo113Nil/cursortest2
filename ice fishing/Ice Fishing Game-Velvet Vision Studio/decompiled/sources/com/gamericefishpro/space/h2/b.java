package com.gamericefishpro.space.h2;

import android.os.SystemClock;
import android.view.MotionEvent;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.i9.d5;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends com.gamericefishpro.space.h1.l implements v, l, x1, t1, com.gamericefishpro.space.g2.c, r1, u, m, com.gamericefishpro.space.m1.p, p1, com.gamericefishpro.space.l1.b, i {
    public com.gamericefishpro.space.h1.k H;

    public final void A0(boolean z) {
        if (!this.G) {
            com.gamericefishpro.space.e2.a.b("initializeModifier called on unattached node");
        }
        com.gamericefishpro.space.h1.k kVar = this.H;
        if ((this.i & 4) != 0 && !z) {
            k.q(this, 2).R0();
        }
        if ((this.i & 2) != 0) {
            z1 z1Var = k.s(this).Z.e;
            Intrinsics.c(z1Var, "null cannot be cast to non-null type androidx.compose.ui.node.TailModifierNode");
            if (z1Var.H) {
                f1 f1Var = this.A;
                Intrinsics.b(f1Var);
                ((x) f1Var).i1(this);
                n1 n1Var = f1Var.e0;
                if (n1Var != null) {
                    ((com.gamericefishpro.space.i2.g1) n1Var).invalidate();
                }
            }
            if (!z) {
                k.q(this, 2).R0();
                k.s(this).E();
            }
        }
        if (kVar instanceof com.gamericefishpro.space.f0.u) {
            com.gamericefishpro.space.f0.u uVar = (com.gamericefishpro.space.f0.u) kVar;
            f0 f0VarS = k.s(this);
            switch (uVar.a) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    ((com.gamericefishpro.space.f0.w) uVar.b).k = f0VarS;
                    break;
                default:
                    ((com.gamericefishpro.space.g0.v) uVar.b).j = f0VarS;
                    break;
            }
        }
        int i = this.i;
        if ((i & 16) != 0 && (kVar instanceof com.gamericefishpro.space.b2.v)) {
            ((com.gamericefishpro.space.b2.v) kVar).d.d = this.A;
        }
        if ((i & 8) != 0) {
            ((com.gamericefishpro.space.i2.t) k.t(this)).C();
        }
    }

    public final void B0() {
        com.gamericefishpro.space.h1.k kVar = this.H;
        com.gamericefishpro.space.e2.a.b("onFocusEvent called on wrong node");
        kVar.getClass();
        throw new ClassCastException();
    }

    @Override // com.gamericefishpro.space.h2.v
    public final int C(n0 n0Var, com.gamericefishpro.space.f2.k0 k0Var, int i) {
        Intrinsics.c(this.H, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        throw new ClassCastException();
    }

    @Override // com.gamericefishpro.space.h2.v
    public final com.gamericefishpro.space.f2.m0 F(com.gamericefishpro.space.f2.n0 n0Var, com.gamericefishpro.space.f2.k0 k0Var, long j) {
        Intrinsics.c(this.H, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        throw new ClassCastException();
    }

    @Override // com.gamericefishpro.space.h2.x1
    public final void L(com.gamericefishpro.space.o2.w wVar) {
        com.gamericefishpro.space.h1.k kVar = this.H;
        Intrinsics.c(kVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        com.gamericefishpro.space.o2.b bVar = (com.gamericefishpro.space.o2.b) kVar;
        com.gamericefishpro.space.o2.l lVar = new com.gamericefishpro.space.o2.l();
        lVar.i = bVar.a;
        bVar.b.invoke(lVar);
        Intrinsics.c(wVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsConfiguration");
        com.gamericefishpro.space.o2.l lVar2 = (com.gamericefishpro.space.o2.l) wVar;
        com.gamericefishpro.space.t.h0 h0Var = lVar2.d;
        if (lVar.i) {
            lVar2.i = true;
        }
        if (lVar.v) {
            lVar2.v = true;
        }
        com.gamericefishpro.space.t.h0 h0Var2 = lVar.d;
        Object[] objArr = h0Var2.b;
        Object[] objArr2 = h0Var2.c;
        long[] jArr = h0Var2.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8;
                int i3 = 8 - ((~(i - length)) >>> 31);
                int i4 = 0;
                while (i4 < i3) {
                    if ((255 & j) < 128) {
                        int i5 = (i << 3) + i4;
                        Object obj = objArr[i5];
                        Object obj2 = objArr2[i5];
                        com.gamericefishpro.space.o2.v vVar = (com.gamericefishpro.space.o2.v) obj;
                        if (!h0Var.b(vVar)) {
                            h0Var.m(vVar, obj2);
                        } else if (obj2 instanceof com.gamericefishpro.space.o2.a) {
                            Object objG = h0Var.g(vVar);
                            Intrinsics.c(objG, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                            com.gamericefishpro.space.o2.a aVar = (com.gamericefishpro.space.o2.a) objG;
                            String str = aVar.a;
                            if (str == null) {
                                str = ((com.gamericefishpro.space.o2.a) obj2).a;
                            }
                            com.gamericefishpro.space.oh.d dVar = aVar.b;
                            if (dVar == null) {
                                dVar = ((com.gamericefishpro.space.o2.a) obj2).b;
                            }
                            h0Var.m(vVar, new com.gamericefishpro.space.o2.a(str, dVar));
                        }
                    }
                    j >>= i2;
                    i4++;
                    i2 = i2;
                }
                if (i3 != i2) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // com.gamericefishpro.space.h2.v
    public final int N(n0 n0Var, com.gamericefishpro.space.f2.k0 k0Var, int i) {
        Intrinsics.c(this.H, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        throw new ClassCastException();
    }

    @Override // com.gamericefishpro.space.h2.t1
    public final boolean R() {
        com.gamericefishpro.space.h1.k kVar = this.H;
        Intrinsics.c(kVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((com.gamericefishpro.space.b2.v) kVar).d.getClass();
        return true;
    }

    @Override // com.gamericefishpro.space.h2.t1
    public final void X() {
        com.gamericefishpro.space.h1.k kVar = this.H;
        Intrinsics.c(kVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        com.gamericefishpro.space.tb.s sVar = ((com.gamericefishpro.space.b2.v) kVar).d;
        com.gamericefishpro.space.b2.s sVar2 = (com.gamericefishpro.space.b2.s) sVar.e;
        com.gamericefishpro.space.b2.v vVar = (com.gamericefishpro.space.b2.v) sVar.v;
        if (sVar2 == com.gamericefishpro.space.b2.s.e) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            com.gamericefishpro.space.b2.u uVar = new com.gamericefishpro.space.b2.u(vVar, 0);
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            motionEventObtain.setSource(0);
            uVar.invoke(motionEventObtain);
            motionEventObtain.recycle();
            sVar.e = com.gamericefishpro.space.b2.s.d;
            vVar.c = false;
            sVar.i = null;
        }
    }

    @Override // com.gamericefishpro.space.h2.v
    public final int Z(n0 n0Var, com.gamericefishpro.space.f2.k0 k0Var, int i) {
        Intrinsics.c(this.H, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        throw new ClassCastException();
    }

    @Override // com.gamericefishpro.space.h2.i, com.gamericefishpro.space.h2.t1
    public final void a() {
        if (this.H instanceof com.gamericefishpro.space.b2.v) {
            X();
        }
    }

    @Override // com.gamericefishpro.space.l1.b
    public final com.gamericefishpro.space.c3.c b() {
        return k.s(this).S;
    }

    @Override // com.gamericefishpro.space.l1.b
    public final long c() {
        return com.gamericefishpro.space.d9.h.Q(k.q(this, 128).i);
    }

    @Override // com.gamericefishpro.space.h2.r1
    public final Object d0(Object obj) {
        com.gamericefishpro.space.h1.k kVar = this.H;
        Intrinsics.c(kVar, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        return (com.gamericefishpro.space.v.l) kVar;
    }

    @Override // com.gamericefishpro.space.g2.c
    public final com.gamericefishpro.space.g2.a e() {
        return com.gamericefishpro.space.g2.a.a;
    }

    @Override // com.gamericefishpro.space.h2.l
    public final void e0() {
        k.j(this);
    }

    @Override // com.gamericefishpro.space.h2.l
    public final void f(h0 h0Var) {
        com.gamericefishpro.space.h1.k kVar = this.H;
        Intrinsics.c(kVar, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        h0Var.a();
    }

    @Override // com.gamericefishpro.space.h2.t1
    public final void f0() {
        com.gamericefishpro.space.h1.k kVar = this.H;
        Intrinsics.c(kVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((com.gamericefishpro.space.b2.v) kVar).d.getClass();
    }

    @Override // com.gamericefishpro.space.l1.b
    public final com.gamericefishpro.space.c3.l getLayoutDirection() {
        return k.s(this).T;
    }

    @Override // com.gamericefishpro.space.h2.v
    public final int k0(n0 n0Var, com.gamericefishpro.space.f2.k0 k0Var, int i) {
        Intrinsics.c(this.H, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        throw new ClassCastException();
    }

    @Override // com.gamericefishpro.space.h2.m
    public final void m0(f1 f1Var) {
        Intrinsics.c(this.H, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        throw new ClassCastException();
    }

    @Override // com.gamericefishpro.space.m1.p
    public final void o(com.gamericefishpro.space.m1.m mVar) {
        com.gamericefishpro.space.h1.k kVar = this.H;
        com.gamericefishpro.space.e2.a.b("applyFocusProperties called on wrong node");
        kVar.getClass();
        throw new ClassCastException();
    }

    @Override // com.gamericefishpro.space.h2.t1
    public final void p(com.gamericefishpro.space.b2.h hVar, com.gamericefishpro.space.b2.i iVar, long j) {
        boolean z;
        boolean z2;
        boolean z3;
        com.gamericefishpro.space.h1.k kVar = this.H;
        Intrinsics.c(kVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        com.gamericefishpro.space.tb.s sVar = ((com.gamericefishpro.space.b2.v) kVar).d;
        com.gamericefishpro.space.b2.v vVar = (com.gamericefishpro.space.b2.v) sVar.v;
        List list = hVar.a;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                z = true;
                break;
            }
            com.gamericefishpro.space.b2.m mVar = (com.gamericefishpro.space.b2.m) list.get(i);
            if (d5.o(mVar) || d5.p(mVar)) {
                z = false;
                break;
            }
            i++;
        }
        if (!z) {
            z2 = false;
            break;
        }
        int size2 = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size2) {
                z2 = true;
                break;
            } else {
                if (((com.gamericefishpro.space.b2.m) list.get(i2)).b()) {
                    z2 = false;
                    break;
                }
                i2++;
            }
        }
        if (vVar.c) {
            z3 = true;
            break;
        }
        int size3 = list.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size3) {
                if (!z2) {
                    z3 = false;
                    break;
                }
                break;
            } else {
                com.gamericefishpro.space.b2.m mVar2 = (com.gamericefishpro.space.b2.m) list.get(i3);
                if (!d5.o(mVar2) && !d5.p(mVar2)) {
                    i3++;
                }
            }
            z3 = true;
            break;
        }
        if (((com.gamericefishpro.space.b2.s) sVar.e) != com.gamericefishpro.space.b2.s.i) {
            if (iVar == com.gamericefishpro.space.b2.i.d && z3) {
                sVar.i = hVar;
                sVar.e(hVar, !z || vVar.c);
            }
            if (iVar == com.gamericefishpro.space.b2.i.e && z && hVar.equals((com.gamericefishpro.space.b2.h) sVar.i) && vVar.c) {
                int size4 = list.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    ((com.gamericefishpro.space.b2.m) list.get(i4)).a();
                }
            }
            if (iVar == com.gamericefishpro.space.b2.i.i && !z3 && !hVar.equals((com.gamericefishpro.space.b2.h) sVar.i)) {
                sVar.e(hVar, true);
            }
        }
        if (iVar == com.gamericefishpro.space.b2.i.i) {
            int size5 = list.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size5) {
                    sVar.e = com.gamericefishpro.space.b2.s.d;
                    ((com.gamericefishpro.space.b2.v) sVar.v).c = false;
                    sVar.i = null;
                    break;
                } else if (!d5.p((com.gamericefishpro.space.b2.m) list.get(i5))) {
                    break;
                } else {
                    i5++;
                }
            }
            if (hVar.equals((com.gamericefishpro.space.b2.h) sVar.i) && z) {
                int size6 = list.size();
                for (int i6 = 0; i6 < size6; i6++) {
                    if (((com.gamericefishpro.space.b2.m) list.get(i6)).b()) {
                        if (vVar.c) {
                            break;
                        }
                        sVar.j(hVar);
                        return;
                    }
                }
                int size7 = list.size();
                for (int i7 = 0; i7 < size7; i7++) {
                    ((com.gamericefishpro.space.b2.m) list.get(i7)).a();
                }
            }
        }
    }

    @Override // com.gamericefishpro.space.h1.l
    public final void s0() {
        A0(true);
    }

    @Override // com.gamericefishpro.space.h2.p1
    public final boolean t() {
        return this.G;
    }

    @Override // com.gamericefishpro.space.h1.l
    public final void t0() {
        if (!this.G) {
            com.gamericefishpro.space.e2.a.b("unInitializeModifier called on unattached node");
        }
        if ((this.i & 8) != 0) {
            ((com.gamericefishpro.space.i2.t) k.t(this)).C();
        }
    }

    public final String toString() {
        return this.H.toString();
    }

    @Override // com.gamericefishpro.space.h2.u
    public final void l(long j) {
    }

    @Override // com.gamericefishpro.space.h2.u
    public final void z(com.gamericefishpro.space.f2.u uVar) {
    }
}
