package x;

import android.view.KeyEvent;
import x1.r1;
import x1.u1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class s0 extends x1.m implements x1.h1, d1.m, p1.c, u1, r1, x1.k {
    public ad.e A;
    public y.b B;
    public boolean C;
    public r1.z D;
    public w.w0 E;
    public k F;
    public final x4.i G;
    public final j0 H;
    public final k I;
    public final z0 J;
    public final b4.m K;
    public final i L;
    public a M;
    public v N;
    public p0 O;

    /* renamed from: w, reason: collision with root package name */
    public e0 f7894w;

    /* renamed from: x, reason: collision with root package name */
    public e f7895x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f7896y;

    /* renamed from: z, reason: collision with root package name */
    public y.i f7897z;

    public s0(w.w0 w0Var, k kVar, e0 e0Var, t0 t0Var, y.i iVar, boolean z10, boolean z11) {
        e eVar = e.f7767i;
        this.f7894w = e0Var;
        this.f7895x = eVar;
        this.f7896y = z10;
        this.f7897z = iVar;
        this.E = w0Var;
        this.F = kVar;
        x4.i iVar2 = new x4.i();
        iVar2.f8305c = new b0.p0(12, iVar2);
        this.G = iVar2;
        j0 j0Var = new j0();
        j0Var.f7829u = z10;
        r0(j0Var);
        this.H = j0Var;
        k kVar2 = new k(new v.t(new m7.g(androidx.compose.foundation.gestures.a.f522c)));
        this.I = kVar2;
        w.w0 w0Var2 = this.E;
        k kVar3 = this.F;
        z0 z0Var = new z0(t0Var, w0Var2, kVar3 == null ? kVar2 : kVar3, e0Var, z11, iVar2);
        this.J = z0Var;
        b4.m mVar = new b4.m(3, z0Var, z10);
        this.K = mVar;
        i iVar3 = new i(e0Var, z0Var, z11);
        r0(iVar3);
        this.L = iVar3;
        r0(new q1.e(mVar, iVar2));
        r0(new d1.r(new d1.q(1, d1.t.f1614a, d1.t.class, "onDispatchEventsCompleted", "onDispatchEventsCompleted(Landroidx/compose/ui/focus/FocusTargetNode;)V", 0, 0, 0), 3));
        c0.f fVar = new c0.f();
        fVar.f1192u = iVar3;
        r0(fVar);
        wc.i iVar4 = new wc.i(1, this);
        w.e0 e0Var2 = new w.e0();
        e0Var2.f7412u = iVar4;
        r0(e0Var2);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object u0(s0 s0Var, hc.c cVar) {
        w wVar;
        int i10;
        if (cVar instanceof w) {
            wVar = (w) cVar;
            int i11 = wVar.f7920j;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                wVar.f7920j = i11 - Integer.MIN_VALUE;
                Object obj = wVar.f7918h;
                i10 = wVar.f7920j;
                if (i10 != 0) {
                    v6.a.W(obj);
                    y.b bVar = s0Var.B;
                    if (bVar != null) {
                        y.i iVar = s0Var.f7897z;
                        if (iVar != null) {
                            y.a aVar = new y.a(bVar);
                            wVar.f7917g = s0Var;
                            wVar.f7920j = 1;
                            Object a6 = iVar.a(aVar, wVar);
                            gc.a aVar2 = gc.a.f2559g;
                            if (a6 == aVar2) {
                                return aVar2;
                            }
                        }
                    }
                    s0Var.y0(0L);
                    return ac.o.f277a;
                }
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s0Var = wVar.f7917g;
                v6.a.W(obj);
                s0Var.B = null;
                s0Var.y0(0L);
                return ac.o.f277a;
            }
        }
        wVar = new w(s0Var, cVar);
        Object obj2 = wVar.f7918h;
        i10 = wVar.f7920j;
        if (i10 != 0) {
        }
        s0Var.B = null;
        s0Var.y0(0L);
        return ac.o.f277a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x005a, code lost:
    
        if (r1.a(r5, r0) == r4) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object v0(s0 s0Var, o oVar, hc.c cVar) {
        x xVar;
        int i10;
        y.b bVar;
        y.i iVar;
        s0 s0Var2;
        y.b bVar2;
        if (cVar instanceof x) {
            xVar = (x) cVar;
            int i11 = xVar.f7934l;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                xVar.f7934l = i11 - Integer.MIN_VALUE;
                Object obj = xVar.f7932j;
                i10 = xVar.f7934l;
                gc.a aVar = gc.a.f2559g;
                if (i10 != 0) {
                    v6.a.W(obj);
                    y.b bVar3 = s0Var.B;
                    if (bVar3 != null && (r1 = s0Var.f7897z) != null) {
                        y.a aVar2 = new y.a(bVar3);
                        xVar.f7929g = s0Var;
                        xVar.f7930h = oVar;
                        xVar.f7934l = 1;
                    }
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar2 = xVar.f7931i;
                        oVar = xVar.f7930h;
                        s0Var2 = xVar.f7929g;
                        v6.a.W(obj);
                        bVar = bVar2;
                        s0Var = s0Var2;
                        s0Var.B = bVar;
                        long j3 = oVar.f7860a;
                        return ac.o.f277a;
                    }
                    oVar = xVar.f7930h;
                    s0Var = xVar.f7929g;
                    v6.a.W(obj);
                }
                bVar = new y.b();
                iVar = s0Var.f7897z;
                if (iVar != null) {
                    xVar.f7929g = s0Var;
                    xVar.f7930h = oVar;
                    xVar.f7931i = bVar;
                    xVar.f7934l = 2;
                    if (iVar.a(bVar, xVar) != aVar) {
                        s0Var2 = s0Var;
                        bVar2 = bVar;
                        bVar = bVar2;
                        s0Var = s0Var2;
                    }
                    return aVar;
                }
                s0Var.B = bVar;
                long j32 = oVar.f7860a;
                return ac.o.f277a;
            }
        }
        xVar = new x(s0Var, cVar);
        Object obj2 = xVar.f7932j;
        i10 = xVar.f7934l;
        gc.a aVar3 = gc.a.f2559g;
        if (i10 != 0) {
        }
        bVar = new y.b();
        iVar = s0Var.f7897z;
        if (iVar != null) {
        }
        s0Var.B = bVar;
        long j322 = oVar.f7860a;
        return ac.o.f277a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object w0(s0 s0Var, p pVar, hc.c cVar) {
        y yVar;
        int i10;
        if (cVar instanceof y) {
            yVar = (y) cVar;
            int i11 = yVar.f7940k;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                yVar.f7940k = i11 - Integer.MIN_VALUE;
                Object obj = yVar.f7938i;
                i10 = yVar.f7940k;
                if (i10 != 0) {
                    v6.a.W(obj);
                    y.b bVar = s0Var.B;
                    if (bVar != null) {
                        y.i iVar = s0Var.f7897z;
                        if (iVar != null) {
                            y.c cVar2 = new y.c(bVar);
                            yVar.f7936g = s0Var;
                            yVar.f7937h = pVar;
                            yVar.f7940k = 1;
                            Object a6 = iVar.a(cVar2, yVar);
                            gc.a aVar = gc.a.f2559g;
                            if (a6 == aVar) {
                                return aVar;
                            }
                        }
                    }
                    s0Var.y0(pVar.f7865a);
                    return ac.o.f277a;
                }
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pVar = yVar.f7937h;
                s0Var = yVar.f7936g;
                v6.a.W(obj);
                s0Var.B = null;
                s0Var.y0(pVar.f7865a);
                return ac.o.f277a;
            }
        }
        yVar = new y(s0Var, cVar);
        Object obj2 = yVar.f7938i;
        i10 = yVar.f7940k;
        if (i10 != 0) {
        }
        s0Var.B = null;
        s0Var.y0(pVar.f7865a);
        return ac.o.f277a;
    }

    @Override // x1.h1
    public final void C() {
        x1.f.s(this, new u(this, 2));
    }

    @Override // p1.c
    public final boolean F(KeyEvent keyEvent) {
        long h10;
        if (!this.f7896y) {
            return false;
        }
        if ((!p1.a.a(v6.a.d(keyEvent.getKeyCode()), p1.a.f5420n) && !p1.a.a(v6.a.d(keyEvent.getKeyCode()), p1.a.f5419m)) || bc.a0.u(keyEvent) != 2 || keyEvent.isCtrlPressed()) {
            return false;
        }
        e0 e0Var = this.J.f7954d;
        e0 e0Var2 = e0.f7769g;
        i iVar = this.L;
        if (e0Var == e0Var2) {
            int i10 = (int) (iVar.B & 4294967295L);
            h10 = v6.a.h(0.0f, p1.a.a(v6.a.d(keyEvent.getKeyCode()), p1.a.f5419m) ? i10 : -i10);
        } else {
            int i11 = (int) (iVar.B >> 32);
            h10 = v6.a.h(p1.a.a(v6.a.d(keyEvent.getKeyCode()), p1.a.f5419m) ? i11 : -i11, 0.0f);
        }
        yc.a0.q(f0(), null, new p0(this, h10, null, 1), 3);
        return true;
    }

    @Override // x1.u1
    public final void I(e2.j jVar) {
        if (this.f7896y && (this.N == null || this.O == null)) {
            this.N = new v(this, 1);
            this.O = new p0(this, null);
        }
        v vVar = this.N;
        if (vVar != null) {
            vc.c[] cVarArr = e2.u.f2053a;
            jVar.d(e2.i.f1962d, new e2.a(null, vVar));
        }
        p0 p0Var = this.O;
        if (p0Var != null) {
            vc.c[] cVarArr2 = e2.u.f2053a;
            jVar.d(e2.i.f1963e, p0Var);
        }
    }

    @Override // x1.r1
    public final void P() {
        r1.z zVar = this.D;
        if (zVar != null) {
            zVar.P();
        }
    }

    @Override // y0.m
    public final boolean g0() {
        return false;
    }

    @Override // y0.m
    public final void j0() {
        x1.f.s(this, new u(this, 2));
        this.M = a.f7739a;
    }

    @Override // p1.c
    public final boolean k(KeyEvent keyEvent) {
        return false;
    }

    @Override // y0.m
    public final void k0() {
        this.C = false;
        x0();
    }

    @Override // d1.m
    public final void p(d1.j jVar) {
        jVar.b(false);
    }

    public final void x0() {
        y.b bVar = this.B;
        if (bVar != null) {
            y.i iVar = this.f7897z;
            if (iVar != null) {
                iVar.b(new y.a(bVar));
            }
            this.B = null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [oc.a, pc.k] */
    public final void y0(long j3) {
        yc.y yVar = (yc.y) ((pc.k) this.G.f8305c).invoke();
        if (yVar == null) {
            throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        }
        yc.a0.q(yVar, null, new p0(this, j3, null, 0), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, java.util.List] */
    @Override // x1.r1
    public final void z(r1.g gVar, r1.h hVar, long j3) {
        fc.d dVar;
        long j6;
        ?? r02 = gVar.f5954a;
        int size = r02.size();
        int i10 = 0;
        while (true) {
            dVar = null;
            if (i10 >= size) {
                break;
            }
            if (((Boolean) this.f7895x.invoke((r1.n) r02.get(i10))).booleanValue()) {
                if (this.f7896y && this.D == null) {
                    c0.d dVar2 = new c0.d(this, dVar, 13);
                    r1.g gVar2 = r1.u.f5994a;
                    r1.z zVar = new r1.z(null, null, r1.w.f5996a);
                    zVar.f6009w = dVar2;
                    r0(zVar);
                    this.D = zVar;
                }
                r1.z zVar2 = this.D;
                if (zVar2 != null) {
                    zVar2.z(gVar, hVar, j3);
                }
            } else {
                i10++;
            }
        }
        if (hVar == r1.h.f5957h && gVar.f5955b == 6) {
            ?? r11 = gVar.f5954a;
            int size2 = r11.size();
            for (int i11 = 0; i11 < size2; i11++) {
                if (((r1.n) r11.get(i11)).b()) {
                    return;
                }
            }
            pc.j.b(this.M);
            s2.c cVar = x1.f.v(this).B;
            e1.b bVar = new e1.b(0L);
            int size3 = r11.size();
            int i12 = 0;
            while (true) {
                j6 = bVar.f1929a;
                if (i12 >= size3) {
                    break;
                }
                bVar = new e1.b(e1.b.g(j6, ((r1.n) r11.get(i12)).f5972j));
                i12++;
            }
            yc.a0.q(f0(), null, new p0(this, e1.b.h(j6, -cVar.x(64)), dVar, 2), 3);
            int size4 = r11.size();
            for (int i13 = 0; i13 < size4; i13++) {
                ((r1.n) r11.get(i13)).a();
            }
        }
    }
}
