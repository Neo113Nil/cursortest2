package x1;

import androidx.compose.ui.semantics.AppendedSemanticsElement;
import java.util.HashSet;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c extends y0.m implements w, n, u1, r1, w1.d, w1.f, p1, v, o, d1.d, d1.m, d1.o, n1, c1.a {

    /* renamed from: u, reason: collision with root package name */
    public y0.l f7977u;

    /* renamed from: v, reason: collision with root package name */
    public w1.a f7978v;

    /* renamed from: w, reason: collision with root package name */
    public HashSet f7979w;

    @Override // x1.u1
    public final void I(e2.j jVar) {
        int i10;
        y0.l lVar = this.f7977u;
        pc.j.c(lVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        AppendedSemanticsElement appendedSemanticsElement = (AppendedSemanticsElement) lVar;
        e2.j jVar2 = new e2.j();
        jVar2.f1987i = appendedSemanticsElement.f608a;
        appendedSemanticsElement.f609b.invoke(jVar2);
        pc.j.c(jVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsConfiguration");
        s.g0 g0Var = jVar.f1985g;
        if (jVar2.f1987i) {
            jVar.f1987i = true;
        }
        if (jVar2.f1988j) {
            jVar.f1988j = true;
        }
        s.g0 g0Var2 = jVar2.f1985g;
        Object[] objArr = g0Var2.f6267b;
        Object[] objArr2 = g0Var2.f6268c;
        long[] jArr = g0Var2.f6266a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            long j3 = jArr[i11];
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8;
                int i13 = 8 - ((~(i11 - length)) >>> 31);
                int i14 = 0;
                while (i14 < i13) {
                    if ((255 & j3) < 128) {
                        int i15 = (i11 << 3) + i14;
                        Object obj = objArr[i15];
                        Object obj2 = objArr2[i15];
                        e2.v vVar = (e2.v) obj;
                        if (!g0Var.b(vVar)) {
                            g0Var.m(vVar, obj2);
                        } else if (obj2 instanceof e2.a) {
                            Object g8 = g0Var.g(vVar);
                            pc.j.c(g8, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                            e2.a aVar = (e2.a) g8;
                            i10 = i12;
                            String str = aVar.f1944a;
                            if (str == null) {
                                str = ((e2.a) obj2).f1944a;
                            }
                            ac.c cVar = aVar.f1945b;
                            if (cVar == null) {
                                cVar = ((e2.a) obj2).f1945b;
                            }
                            g0Var.m(vVar, new e2.a(str, cVar));
                            j3 >>= i10;
                            i14++;
                            i12 = i10;
                        }
                    }
                    i10 = i12;
                    j3 >>= i10;
                    i14++;
                    i12 = i10;
                }
                if (i13 != i12) {
                    return;
                }
            }
            if (i11 == length) {
                return;
            } else {
                i11++;
            }
        }
    }

    @Override // x1.r1
    public final boolean K() {
        pc.j.c(this.f7977u, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        throw new ClassCastException();
    }

    @Override // x1.r1
    public final void P() {
        pc.j.c(this.f7977u, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        throw new ClassCastException();
    }

    @Override // x1.p1
    public final Object W(Object obj) {
        y0.l lVar = this.f7977u;
        pc.j.c(lVar, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        return (u.j) lVar;
    }

    @Override // x1.n
    public final void X() {
        f.m(this);
    }

    @Override // x1.r1
    public final boolean a0() {
        pc.j.c(this.f7977u, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        throw new ClassCastException();
    }

    @Override // x1.n
    public final void b(i0 i0Var) {
        y0.l lVar = this.f7977u;
        pc.j.c(lVar, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        ((c1.f) lVar).b(i0Var);
    }

    @Override // c1.a
    public final s2.c c() {
        return f.v(this).B;
    }

    @Override // c1.a
    public final long d() {
        return i7.b.F(f.t(this, 128).f7087i);
    }

    @Override // x1.w
    public final v1.f0 e(o0 o0Var, v1.d0 d0Var, long j3) {
        y0.l lVar = this.f7977u;
        pc.j.c(lVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((v1.q) lVar).e(o0Var, d0Var, j3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [oc.a, pc.k] */
    /* JADX WARN: Type inference failed for: r2v10, types: [y0.m] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [y0.m] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // w1.d, w1.f
    public final Object f(w1.g gVar) {
        c1 c1Var;
        this.f7979w.add(gVar);
        if (!this.f8443g.f8456t) {
            u1.a.b("visitAncestors called on an unattached node");
        }
        y0.m mVar = this.f8443g.f8447k;
        g0 v10 = f.v(this);
        while (v10 != null) {
            if ((v10.I.f7991f.f8446j & 32) != 0) {
                while (mVar != null) {
                    if ((mVar.f8445i & 32) != 0) {
                        m mVar2 = mVar;
                        ?? r42 = 0;
                        while (mVar2 != 0) {
                            if (mVar2 instanceof w1.d) {
                                w1.d dVar = (w1.d) mVar2;
                                if (dVar.i().e(gVar)) {
                                    return dVar.i().f(gVar);
                                }
                            } else if ((mVar2.f8445i & 32) != 0 && (mVar2 instanceof m)) {
                                y0.m mVar3 = mVar2.f8110v;
                                int i10 = 0;
                                mVar2 = mVar2;
                                r42 = r42;
                                while (mVar3 != null) {
                                    if ((mVar3.f8445i & 32) != 0) {
                                        i10++;
                                        r42 = r42;
                                        if (i10 == 1) {
                                            mVar2 = mVar3;
                                        } else {
                                            if (r42 == 0) {
                                                r42 = new o0.e(new y0.m[16]);
                                            }
                                            if (mVar2 != 0) {
                                                r42.b(mVar2);
                                                mVar2 = 0;
                                            }
                                            r42.b(mVar3);
                                        }
                                    }
                                    mVar3 = mVar3.f8448l;
                                    mVar2 = mVar2;
                                    r42 = r42;
                                }
                                if (i10 == 1) {
                                }
                            }
                            mVar2 = f.f(r42);
                        }
                    }
                    mVar = mVar.f8447k;
                }
            }
            v10 = v10.s();
            mVar = (v10 == null || (c1Var = v10.I) == null) ? null : c1Var.f7990e;
        }
        return gVar.f7640a.invoke();
    }

    @Override // x1.o
    public final void g(f1 f1Var) {
        y0.l lVar = this.f7977u;
        pc.j.c(lVar, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        b0.d dVar = (b0.d) lVar;
        if (dVar.f811a) {
            return;
        }
        dVar.f811a = true;
        fc.k kVar = dVar.f812b;
        if (kVar != null) {
            kVar.resumeWith(ac.o.f277a);
        }
        dVar.f812b = null;
    }

    @Override // c1.a
    public final s2.l getLayoutDirection() {
        return f.v(this).C;
    }

    @Override // w1.d
    public final u5.d i() {
        w1.a aVar = this.f7978v;
        return aVar != null ? aVar : w1.b.f7633a;
    }

    @Override // y0.m
    public final void j0() {
        r0(true);
    }

    @Override // y0.m
    public final void k0() {
        s0();
    }

    @Override // d1.d
    public final void n(d1.p pVar) {
        y0.l lVar = this.f7977u;
        u1.a.b("onFocusEvent called on wrong node");
        lVar.getClass();
        throw new ClassCastException();
    }

    @Override // d1.m
    public final void p(d1.j jVar) {
        y0.l lVar = this.f7977u;
        u1.a.b("applyFocusProperties called on wrong node");
        lVar.getClass();
        throw new ClassCastException();
    }

    public final void r0(boolean z10) {
        if (!this.f8456t) {
            u1.a.b("initializeModifier called on unattached node");
        }
        y0.l lVar = this.f7977u;
        if ((this.f8445i & 32) != 0) {
            if (lVar instanceof z.x) {
                b bVar = new b(this, 0);
                s.a0 a0Var = ((y1.r) f.w(this)).f8645z0;
                if (a0Var.f(bVar) < 0) {
                    a0Var.a(bVar);
                }
            }
            if (lVar instanceof w1.e) {
                w1.e eVar = (w1.e) lVar;
                w1.a aVar = this.f7978v;
                if (aVar == null || !aVar.e(eVar.getKey())) {
                    w1.a aVar2 = new w1.a();
                    aVar2.f7632a = eVar;
                    this.f7978v = aVar2;
                    if (f.d(this)) {
                        w1.c modifierLocalManager = ((y1.r) f.w(this)).getModifierLocalManager();
                        w1.g key = eVar.getKey();
                        modifierLocalManager.f7635b.b(this);
                        modifierLocalManager.f7636c.b(key);
                        modifierLocalManager.a();
                    }
                } else {
                    aVar.f7632a = eVar;
                    w1.c modifierLocalManager2 = ((y1.r) f.w(this)).getModifierLocalManager();
                    w1.g key2 = eVar.getKey();
                    modifierLocalManager2.f7635b.b(this);
                    modifierLocalManager2.f7636c.b(key2);
                    modifierLocalManager2.a();
                }
            }
        }
        if ((this.f8445i & 4) != 0 && !z10) {
            f.t(this, 2).I0();
        }
        if ((this.f8445i & 2) != 0) {
            if (f.d(this)) {
                f1 f1Var = this.f8450n;
                pc.j.b(f1Var);
                ((y) f1Var).Z0(this);
                l1 l1Var = f1Var.O;
                if (l1Var != null) {
                    ((y1.f1) l1Var).invalidate();
                }
            }
            if (!z10) {
                f.t(this, 2).I0();
                f.v(this).C();
            }
        }
        if (lVar instanceof a0.x) {
            ((a0.x) lVar).f143a.f25j = f.v(this);
        }
        if ((this.f8445i & 256) != 0 && (lVar instanceof b0.d) && f.d(this)) {
            f.v(this).C();
        }
        if ((this.f8445i & 8) != 0) {
            ((y1.r) f.w(this)).A();
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [oc.a, pc.k] */
    public final void s0() {
        if (!this.f8456t) {
            u1.a.b("unInitializeModifier called on unattached node");
        }
        y0.l lVar = this.f7977u;
        if ((this.f8445i & 32) != 0) {
            if (lVar instanceof w1.e) {
                w1.c modifierLocalManager = ((y1.r) f.w(this)).getModifierLocalManager();
                w1.g key = ((w1.e) lVar).getKey();
                modifierLocalManager.f7637d.b(f.v(this));
                modifierLocalManager.f7638e.b(key);
                modifierLocalManager.a();
            }
            if (lVar instanceof z.x) {
                z.x xVar = (z.x) lVar;
                z.o0 o0Var = (z.o0) z.r0.f9028a.f7640a.invoke();
                z.o0 o0Var2 = xVar.f9039a;
                xVar.f9040b.setValue(new z.t(o0Var2, o0Var));
                xVar.f9041c.setValue(new z.l0(o0Var, o0Var2));
            }
        }
        if ((this.f8445i & 8) != 0) {
            ((y1.r) f.w(this)).A();
        }
    }

    public final void t0() {
        if (this.f8456t) {
            this.f7979w.clear();
            ((y1.r) f.w(this)).getSnapshotObserver().a(this, e.f8006h, new b(this, 1));
        }
    }

    public final String toString() {
        return this.f7977u.toString();
    }

    @Override // x1.n1
    public final boolean y() {
        return this.f8456t;
    }

    @Override // x1.r1
    public final void z(r1.g gVar, r1.h hVar, long j3) {
        pc.j.c(this.f7977u, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        throw new ClassCastException();
    }

    @Override // x1.l
    public final void a() {
    }

    @Override // x1.v
    public final void j(v1.p pVar) {
    }

    @Override // x1.v
    public final void s(long j3) {
    }
}
