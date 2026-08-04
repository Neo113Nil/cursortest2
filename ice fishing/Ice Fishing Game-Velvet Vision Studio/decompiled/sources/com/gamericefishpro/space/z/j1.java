package com.gamericefishpro.space.z;

import android.os.Build;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.EdgeEffect;
import com.gamericefishpro.space.h2.x1;
import com.gamericefishpro.space.i2.z1;
import com.gamericefishpro.space.i9.a4;
import com.gamericefishpro.space.i9.d5;
import com.gamericefishpro.space.i9.y3;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class j1 extends com.gamericefishpro.space.h2.j implements com.gamericefishpro.space.z1.b, x1, com.gamericefishpro.space.h2.t1, com.gamericefishpro.space.y1.c, com.gamericefishpro.space.h2.h {
    public v0 J;
    public com.gamericefishpro.space.x7.e K;
    public boolean L;
    public com.gamericefishpro.space.b0.i M;
    public com.gamericefishpro.space.ri.e N;
    public com.gamericefishpro.space.b0.b O;
    public boolean P;
    public boolean Q;
    public n R;
    public q S;
    public p T;
    public o U;
    public com.gamericefishpro.space.z5.f V;
    public com.gamericefishpro.space.vb.c W;
    public long X;
    public com.gamericefishpro.space.n9.r0 Y;
    public m0 Z;
    public long a0;
    public com.gamericefishpro.space.y.l b0;
    public k c0;
    public final com.gamericefishpro.space.a2.e d0;
    public final y0 e0;
    public final k f0;
    public final q1 g0;
    public final com.gamericefishpro.space.b4.f h0;
    public final com.gamericefishpro.space.m1.u i0;
    public final i j0;
    public com.gamericefishpro.space.d0.n1 k0;
    public h1 l0;
    public com.gamericefishpro.space.p5.a m0;

    public j1(com.gamericefishpro.space.b0.i iVar, com.gamericefishpro.space.y.l lVar, k kVar, v0 v0Var, k1 k1Var, boolean z, boolean z2) {
        com.gamericefishpro.space.x7.e eVar = d1.a;
        this.J = v0Var;
        this.K = eVar;
        this.L = z;
        this.M = iVar;
        this.X = 9205357640488583168L;
        this.a0 = 0L;
        this.b0 = lVar;
        this.c0 = kVar;
        com.gamericefishpro.space.a2.e eVar2 = new com.gamericefishpro.space.a2.e();
        this.d0 = eVar2;
        y0 y0Var = new y0();
        y0Var.H = z;
        A0(y0Var);
        this.e0 = y0Var;
        k kVar2 = new k(new com.gamericefishpro.space.w.r(new com.gamericefishpro.space.tb.u(d1.d)));
        this.f0 = kVar2;
        com.gamericefishpro.space.y.l lVar2 = this.b0;
        k kVar3 = this.c0;
        q1 q1Var = new q1(k1Var, lVar2, kVar3 == null ? kVar2 : kVar3, v0Var, z2, eVar2, this, new f1(this, 0));
        this.g0 = q1Var;
        com.gamericefishpro.space.b4.f fVar = new com.gamericefishpro.space.b4.f(q1Var, z);
        this.h0 = fVar;
        com.gamericefishpro.space.m1.u uVar = new com.gamericefishpro.space.m1.u(2, null, 10);
        A0(uVar);
        this.i0 = uVar;
        i iVar2 = new i(v0Var, q1Var, z2, new f1(this, 1));
        A0(iVar2);
        this.j0 = iVar2;
        A0(new com.gamericefishpro.space.a2.j(fVar, eVar2));
        com.gamericefishpro.space.i0.c cVar = new com.gamericefishpro.space.i0.c();
        cVar.H = iVar2;
        A0(cVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object D0(j1 j1Var, com.gamericefishpro.space.vh.c cVar) {
        y yVar;
        if (cVar instanceof y) {
            yVar = (y) cVar;
            int i = yVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                yVar.i = i - Integer.MIN_VALUE;
            } else {
                yVar = new y(j1Var, cVar);
            }
        } else {
            yVar = new y(j1Var, cVar);
        }
        Object obj = yVar.d;
        com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
        int i2 = yVar.i;
        com.gamericefishpro.space.th.a aVar2 = null;
        if (i2 == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            com.gamericefishpro.space.b0.b bVar = j1Var.O;
            if (bVar != null) {
                com.gamericefishpro.space.b0.i iVar = j1Var.M;
                if (iVar != null) {
                    com.gamericefishpro.space.b0.a aVar3 = new com.gamericefishpro.space.b0.a(bVar);
                    yVar.i = 1;
                    if (iVar.a(aVar3, yVar) == aVar) {
                        return aVar;
                    }
                }
            }
            com.gamericefishpro.space.pi.a0.u(j1Var.d0.c(), null, new t0(new u(false, 0L), j1Var, aVar2, 2), 3);
            return Unit.a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        com.gamericefishpro.space.wa.b.P(obj);
        j1Var.O = null;
        com.gamericefishpro.space.pi.a0.u(j1Var.d0.c(), null, new t0(new u(false, 0L), j1Var, aVar2, 2), 3);
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object E0(j1 j1Var, t tVar, com.gamericefishpro.space.vh.c cVar) {
        z zVar;
        com.gamericefishpro.space.b0.i iVar;
        com.gamericefishpro.space.b0.b bVar;
        t tVar2;
        com.gamericefishpro.space.b0.b bVar2;
        if (cVar instanceof z) {
            zVar = (z) cVar;
            int i = zVar.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                zVar.w = i - Integer.MIN_VALUE;
            } else {
                zVar = new z(j1Var, cVar);
            }
        } else {
            zVar = new z(j1Var, cVar);
        }
        Object obj = zVar.i;
        com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
        int i2 = zVar.w;
        if (i2 == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            com.gamericefishpro.space.b0.b bVar3 = j1Var.O;
            if (bVar3 != null && (iVar = j1Var.M) != null) {
                com.gamericefishpro.space.b0.a aVar2 = new com.gamericefishpro.space.b0.a(bVar3);
                zVar.d = tVar;
                zVar.w = 1;
                if (iVar.a(aVar2, zVar) != aVar) {
                }
                return aVar;
            }
            j1Var.O = bVar;
            long j = tVar.a;
            return Unit.a;
        }
        if (i2 == 1) {
            tVar = zVar.d;
            com.gamericefishpro.space.wa.b.P(obj);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar2 = zVar.e;
            tVar2 = zVar.d;
            com.gamericefishpro.space.wa.b.P(obj);
        }
        bVar = bVar2;
        tVar = tVar2;
        j1Var.O = bVar;
        long j2 = tVar.a;
        return Unit.a;
        bVar = new com.gamericefishpro.space.b0.b();
        com.gamericefishpro.space.b0.i iVar2 = j1Var.M;
        if (iVar2 != null) {
            zVar.d = tVar;
            zVar.e = bVar;
            zVar.w = 2;
            if (iVar2.a(bVar, zVar) != aVar) {
                tVar2 = tVar;
                bVar2 = bVar;
                bVar = bVar2;
                tVar = tVar2;
            }
            return aVar;
        }
        j1Var.O = bVar;
        long j3 = tVar.a;
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object F0(j1 j1Var, u uVar, com.gamericefishpro.space.vh.c cVar) {
        a0 a0Var;
        if (cVar instanceof a0) {
            a0Var = (a0) cVar;
            int i = a0Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                a0Var.v = i - Integer.MIN_VALUE;
            } else {
                a0Var = new a0(j1Var, cVar);
            }
        } else {
            a0Var = new a0(j1Var, cVar);
        }
        Object obj = a0Var.e;
        com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
        int i2 = a0Var.v;
        com.gamericefishpro.space.th.a aVar2 = null;
        if (i2 == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            com.gamericefishpro.space.b0.b bVar = j1Var.O;
            if (bVar != null) {
                com.gamericefishpro.space.b0.i iVar = j1Var.M;
                if (iVar != null) {
                    com.gamericefishpro.space.b0.c cVar2 = new com.gamericefishpro.space.b0.c(bVar);
                    a0Var.d = uVar;
                    a0Var.v = 1;
                    if (iVar.a(cVar2, a0Var) == aVar) {
                        return aVar;
                    }
                }
            }
            com.gamericefishpro.space.pi.a0.u(j1Var.d0.c(), null, new t0(uVar, j1Var, aVar2, 2), 3);
            return Unit.a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        uVar = a0Var.d;
        com.gamericefishpro.space.wa.b.P(obj);
        j1Var.O = null;
        com.gamericefishpro.space.pi.a0.u(j1Var.d0.c(), null, new t0(uVar, j1Var, aVar2, 2), 3);
        return Unit.a;
    }

    public static void J0(j1 j1Var, com.gamericefishpro.space.b2.m mVar, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        p pVar = j1Var.T;
        if (pVar == null) {
            pVar = new p();
            pVar.a = null;
            pVar.b = Long.MAX_VALUE;
            pVar.c = false;
            j1Var.T = pVar;
        }
        pVar.a = mVar;
        pVar.b = j;
        com.gamericefishpro.space.n9.r0 r0Var = j1Var.Y;
        if (r0Var == null) {
            j1Var.Y = new com.gamericefishpro.space.n9.r0(j1Var.J);
        } else {
            r0Var.i = j1Var.J;
            r0Var.e = j2;
        }
        pVar.c = false;
        j1Var.V = pVar;
    }

    public final void G0() {
        com.gamericefishpro.space.b0.b bVar = this.O;
        if (bVar != null) {
            com.gamericefishpro.space.b0.i iVar = this.M;
            if (iVar != null) {
                iVar.b(new com.gamericefishpro.space.b0.a(bVar));
            }
            this.O = null;
        }
    }

    public final void H0() {
        n nVar = this.R;
        if (nVar == null) {
            m mVar = m.i;
            nVar = new n();
            nVar.a = mVar;
            nVar.b = false;
            this.R = nVar;
        }
        nVar.a = m.i;
        nVar.b = false;
        this.V = nVar;
    }

    public final void I0(com.gamericefishpro.space.b2.m mVar, long j, com.gamericefishpro.space.n9.r0 r0Var) {
        o oVar = this.U;
        if (oVar == null) {
            oVar = new o();
            oVar.a = null;
            oVar.b = Long.MAX_VALUE;
            this.U = oVar;
        }
        oVar.a = mVar;
        oVar.b = j;
        r0Var.e = 0L;
        this.V = oVar;
    }

    public final void K0(v vVar) {
        if ((vVar instanceof t) && !this.P) {
            this.P = true;
            Q0();
        }
        L0().k(vVar);
    }

    @Override // com.gamericefishpro.space.h2.x1
    public final void L(com.gamericefishpro.space.o2.w wVar) {
        if (this.L && (this.k0 == null || this.l0 == null)) {
            this.k0 = new com.gamericefishpro.space.d0.n1(16, this);
            this.l0 = new h1(this, null);
        }
        com.gamericefishpro.space.d0.n1 n1Var = this.k0;
        if (n1Var != null) {
            com.gamericefishpro.space.ki.d[] dVarArr = com.gamericefishpro.space.o2.u.a;
            wVar.b(com.gamericefishpro.space.o2.k.d, new com.gamericefishpro.space.o2.a(null, n1Var));
        }
        h1 h1Var = this.l0;
        if (h1Var != null) {
            com.gamericefishpro.space.ki.d[] dVarArr2 = com.gamericefishpro.space.o2.u.a;
            wVar.b(com.gamericefishpro.space.o2.k.e, h1Var);
        }
    }

    public final com.gamericefishpro.space.ri.i L0() {
        com.gamericefishpro.space.ri.e eVar = this.N;
        if (eVar != null) {
            return eVar;
        }
        throw new IllegalArgumentException("Events channel not initialized.");
    }

    public final com.gamericefishpro.space.vb.c M0() {
        com.gamericefishpro.space.vb.c cVar = this.W;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalArgumentException("Velocity Tracker not initialized.");
    }

    public final void N0(com.gamericefishpro.space.b2.m mVar, long j) {
        long jD = com.gamericefishpro.space.h2.k.r(this.d).d(0L);
        if (!com.gamericefishpro.space.n1.b.b(this.X, 9205357640488583168L) && !com.gamericefishpro.space.n1.b.b(jD, this.X)) {
            this.a0 = com.gamericefishpro.space.n1.b.e(this.a0, com.gamericefishpro.space.n1.b.d(jD, this.X));
        }
        this.X = jD;
        a4.l(M0(), mVar, this.a0);
        L0().k(new s(false, j));
    }

    public final void O0(com.gamericefishpro.space.b2.m mVar, com.gamericefishpro.space.b2.m mVar2, long j) {
        if (this.W == null) {
            this.W = new com.gamericefishpro.space.vb.c(3);
        }
        a4.l(M0(), mVar, 0L);
        long jD = com.gamericefishpro.space.n1.b.d(mVar2.c, j);
        this.a0 = 0L;
        com.gamericefishpro.space.x7.e eVar = this.K;
        int i = mVar.i;
        eVar.getClass();
        if (i == 2) {
            return;
        }
        if (!this.P) {
            if (this.N == null) {
                this.N = com.gamericefishpro.space.hj.c.a(Integer.MAX_VALUE, 6, null);
            }
            Q0();
        }
        this.X = com.gamericefishpro.space.h2.k.r(this).d(0L);
        L0().k(new t(jD));
    }

    @Override // com.gamericefishpro.space.z1.b
    public final boolean P(KeyEvent keyEvent) {
        long jFloatToRawIntBits;
        int iFloatToRawIntBits;
        if (!this.L) {
            return false;
        }
        if ((!com.gamericefishpro.space.z1.a.a(com.gamericefishpro.space.i.a.h(keyEvent.getKeyCode()), com.gamericefishpro.space.z1.a.n) && !com.gamericefishpro.space.z1.a.a(com.gamericefishpro.space.i.a.h(keyEvent.getKeyCode()), com.gamericefishpro.space.z1.a.m)) || a4.D(keyEvent) != 2 || keyEvent.isCtrlPressed()) {
            return false;
        }
        v0 v0Var = this.g0.d;
        v0 v0Var2 = v0.d;
        i iVar = this.j0;
        if (v0Var == v0Var2) {
            int i = (int) (iVar.N & 4294967295L);
            float f = com.gamericefishpro.space.z1.a.a(com.gamericefishpro.space.i.a.h(keyEvent.getKeyCode()), com.gamericefishpro.space.z1.a.m) ? i : -i;
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            iFloatToRawIntBits = Float.floatToRawIntBits(f);
        } else {
            int i2 = (int) (iVar.N >> 32);
            jFloatToRawIntBits = Float.floatToRawIntBits(com.gamericefishpro.space.z1.a.a(com.gamericefishpro.space.i.a.h(keyEvent.getKeyCode()), com.gamericefishpro.space.z1.a.m) ? i2 : -i2);
            iFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
        }
        com.gamericefishpro.space.pi.a0.u(o0(), null, new h1(this, (jFloatToRawIntBits << 32) | (((long) iFloatToRawIntBits) & 4294967295L), null, 0), 3);
        return true;
    }

    public final boolean P0() {
        q1 q1Var = this.g0;
        if (q1Var.a.b()) {
            return true;
        }
        com.gamericefishpro.space.y.l lVar = q1Var.b;
        if (lVar == null) {
            return false;
        }
        com.gamericefishpro.space.y.f0 f0Var = lVar.c;
        EdgeEffect edgeEffect = f0Var.d;
        if (edgeEffect != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? com.gamericefishpro.space.y.o.b(edgeEffect) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect2 = f0Var.e;
        if (edgeEffect2 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? com.gamericefishpro.space.y.o.b(edgeEffect2) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect3 = f0Var.f;
        if (edgeEffect3 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? com.gamericefishpro.space.y.o.b(edgeEffect3) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect4 = f0Var.g;
        if (edgeEffect4 != null) {
            return (Build.VERSION.SDK_INT >= 31 ? com.gamericefishpro.space.y.o.b(edgeEffect4) : 0.0f) != 0.0f;
        }
        return false;
    }

    public final void Q0() {
        this.P = true;
        if (this.N == null) {
            this.N = com.gamericefishpro.space.hj.c.a(Integer.MAX_VALUE, 6, null);
        }
        com.gamericefishpro.space.pi.a0.u(o0(), null, new b0(this, null), 3);
    }

    public final void R0(com.gamericefishpro.space.b0.i iVar, com.gamericefishpro.space.y.l lVar, k kVar, v0 v0Var, k1 k1Var, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        boolean z5 = true;
        if (this.L != z) {
            this.h0.d = z;
            this.e0.H = z;
            z3 = true;
        } else {
            z3 = false;
        }
        k kVar2 = kVar == null ? this.f0 : kVar;
        q1 q1Var = this.g0;
        if (Intrinsics.a(q1Var.a, k1Var)) {
            z4 = false;
        } else {
            q1Var.a = k1Var;
            z4 = true;
        }
        q1Var.b = lVar;
        if (q1Var.d != v0Var) {
            q1Var.d = v0Var;
            z4 = true;
        }
        if (q1Var.e != z2) {
            q1Var.e = z2;
            z4 = true;
        }
        q1Var.c = kVar2;
        q1Var.f = this.d0;
        i iVar2 = this.j0;
        iVar2.H = v0Var;
        iVar2.J = z2;
        this.b0 = lVar;
        this.c0 = kVar;
        com.gamericefishpro.space.x7.e eVar = d1.a;
        v0 v0Var2 = q1Var.d;
        v0 v0Var3 = v0.d;
        if (v0Var2 != v0Var3) {
            v0Var3 = v0.e;
        }
        this.K = eVar;
        if (this.L != z) {
            this.L = z;
            if (!z) {
                G0();
                this.Z = null;
            }
            z4 = true;
        }
        if (!Intrinsics.a(this.M, iVar)) {
            G0();
            this.M = iVar;
        }
        if (this.J != v0Var3) {
            this.J = v0Var3;
        } else {
            z5 = z4;
        }
        if (z5) {
            boolean z6 = this.Q;
            r rVar = r.a;
            if (z6) {
                H0();
                if (this.P) {
                    L0().k(rVar);
                }
                this.W = null;
            }
            m0 m0Var = this.Z;
            if (m0Var != null) {
                m0Var.a();
                j1 j1Var = m0Var.a;
                if (j1Var.P) {
                    j1Var.K0(rVar);
                }
                m0Var.g = null;
                n0 n0Var = m0Var.k;
                n0Var.a = 0;
                n0Var.b.clear();
            }
        }
        if (z3) {
            this.k0 = null;
            this.l0 = null;
            com.gamericefishpro.space.h2.k.l(this);
        }
    }

    @Override // com.gamericefishpro.space.h2.t1
    public final void X() {
        if (this.Q) {
            H0();
            if (this.P) {
                L0().k(r.a);
            }
            this.W = null;
        }
        this.Q = false;
    }

    @Override // com.gamericefishpro.space.h2.i, com.gamericefishpro.space.h2.t1
    public final void a() {
        X();
        if (this.G) {
            com.gamericefishpro.space.c3.c cVar = com.gamericefishpro.space.h2.k.s(this).S;
            k kVar = this.f0;
            kVar.getClass();
            kVar.a = new com.gamericefishpro.space.w.r(new com.gamericefishpro.space.tb.u(cVar));
        }
        com.gamericefishpro.space.p5.a aVar = this.m0;
        if (aVar != null) {
            aVar.e = com.gamericefishpro.space.h2.k.s(this).S;
        }
    }

    @Override // com.gamericefishpro.space.y1.c
    public final void h(com.gamericefishpro.space.f1.z zVar, com.gamericefishpro.space.b2.i iVar) {
        Object obj;
        Object obj2;
        float f;
        Object obj3;
        float fIntBitsToFloat;
        Object obj4;
        Object obj5;
        int i = zVar.a;
        ArrayList arrayList = (ArrayList) zVar.b;
        if (this.L) {
            if (this.Z == null) {
                this.Z = new m0(this);
            }
            m0 m0Var = this.Z;
            if (m0Var != null) {
                j1 j1Var = m0Var.a;
                if (m0Var.f == null) {
                    h0 h0Var = m0Var.b;
                    if (h0Var == null) {
                        g0 g0Var = g0.i;
                        h0Var = new h0();
                        h0Var.i = g0Var;
                        h0Var.j = false;
                        m0Var.b = h0Var;
                    }
                    m0Var.f = h0Var;
                }
                com.gamericefishpro.space.d9.h hVar = m0Var.f;
                if (hVar == null) {
                    throw new IllegalArgumentException("currentDragState should not be null");
                }
                boolean z = true;
                if (hVar instanceof h0) {
                    h0 h0Var2 = (h0) hVar;
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        com.gamericefishpro.space.y1.b bVar = (com.gamericefishpro.space.y1.b) arrayList.get(i2);
                        if (bVar.h || !bVar.d) {
                            return;
                        }
                    }
                    com.gamericefishpro.space.y1.b bVar2 = (com.gamericefishpro.space.y1.b) CollectionsKt.w(arrayList);
                    g0 g0Var2 = l0.a[h0Var2.i.ordinal()] == 1 ? !j1Var.P0() ? g0.d : g0.e : h0Var2.i;
                    h0Var2.i = g0Var2;
                    if (iVar == com.gamericefishpro.space.b2.i.d && g0Var2 == g0.e) {
                        bVar2.i = true;
                        h0Var2.j = true;
                    }
                    if (iVar == com.gamericefishpro.space.b2.i.e) {
                        if (g0Var2 == g0.d) {
                            m0.c(m0Var, bVar2, bVar2.a, 0L, 12);
                            return;
                        }
                        if (h0Var2.j) {
                            m0Var.f(bVar2, bVar2, new com.gamericefishpro.space.y1.a(i), 0L);
                            m0Var.e(bVar2, new com.gamericefishpro.space.y1.a(i), 0L);
                            long j = bVar2.a;
                            k0 k0Var = m0Var.c;
                            if (k0Var == null) {
                                k0Var = new k0();
                                k0Var.i = Long.MAX_VALUE;
                                m0Var.c = k0Var;
                            }
                            k0Var.i = j;
                            m0Var.f = k0Var;
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (!(hVar instanceof j0)) {
                    if (hVar instanceof i0) {
                        i0 i0Var = (i0) hVar;
                        if (iVar != com.gamericefishpro.space.b2.i.i) {
                            return;
                        }
                        int size2 = arrayList.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            if (((com.gamericefishpro.space.y1.b) arrayList.get(i3)).i) {
                                z = false;
                                break;
                            }
                        }
                        int size3 = arrayList.size();
                        for (int i4 = 0; i4 < size3; i4++) {
                            if (((com.gamericefishpro.space.y1.b) arrayList.get(i4)).d) {
                                if (arrayList.isEmpty()) {
                                    break;
                                }
                                if (z) {
                                    long J = com.gamericefishpro.space.hj.c.J((com.gamericefishpro.space.y1.b) CollectionsKt.w(arrayList), j1Var.J, new com.gamericefishpro.space.y1.a(i));
                                    com.gamericefishpro.space.y1.b bVar3 = i0Var.i;
                                    Intrinsics.b(bVar3);
                                    long jD = com.gamericefishpro.space.n1.b.d(J, com.gamericefishpro.space.hj.c.J(bVar3, j1Var.J, new com.gamericefishpro.space.y1.a(i)));
                                    com.gamericefishpro.space.y1.b bVar4 = i0Var.i;
                                    if (bVar4 == null) {
                                        throw new IllegalArgumentException("AwaitGesturePickup.initialDown was not initialized.");
                                    }
                                    m0.c(m0Var, bVar4, i0Var.j, jD, 8);
                                    return;
                                }
                                return;
                            }
                        }
                        m0Var.a();
                        return;
                    }
                    if (!(hVar instanceof k0)) {
                        throw new com.gamericefishpro.space.oh.k();
                    }
                    k0 k0Var2 = (k0) hVar;
                    if (iVar != com.gamericefishpro.space.b2.i.e) {
                        return;
                    }
                    long j2 = k0Var2.i;
                    int size4 = arrayList.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= size4) {
                            obj = null;
                            break;
                        }
                        obj = arrayList.get(i5);
                        if (com.gamericefishpro.space.u6.f.s(((com.gamericefishpro.space.y1.b) obj).a, j2)) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                    com.gamericefishpro.space.y1.b bVar5 = (com.gamericefishpro.space.y1.b) obj;
                    if (bVar5 == null) {
                        return;
                    }
                    boolean zI = com.gamericefishpro.space.hj.c.i(bVar5);
                    r rVar = r.a;
                    if (!zI) {
                        if (bVar5.i) {
                            j1Var.K0(rVar);
                            return;
                        }
                        v0 v0Var = j1Var.J;
                        com.gamericefishpro.space.y1.a aVar = new com.gamericefishpro.space.y1.a(i);
                        if (com.gamericefishpro.space.n1.b.c(com.gamericefishpro.space.n1.b.d(com.gamericefishpro.space.hj.c.J(bVar5, v0Var, aVar), com.gamericefishpro.space.hj.c.K(bVar5, v0Var, aVar))) == 0.0f) {
                            return;
                        }
                        v0 v0Var2 = j1Var.J;
                        com.gamericefishpro.space.y1.a aVar2 = new com.gamericefishpro.space.y1.a(i);
                        m0Var.e(bVar5, new com.gamericefishpro.space.y1.a(i), bVar5.i ? 0L : com.gamericefishpro.space.n1.b.d(com.gamericefishpro.space.hj.c.J(bVar5, v0Var2, aVar2), com.gamericefishpro.space.hj.c.K(bVar5, v0Var2, aVar2)));
                        bVar5.i = true;
                        return;
                    }
                    int size5 = arrayList.size();
                    int i6 = 0;
                    while (true) {
                        if (i6 >= size5) {
                            obj2 = null;
                            break;
                        }
                        obj2 = arrayList.get(i6);
                        if (((com.gamericefishpro.space.y1.b) obj2).d) {
                            break;
                        } else {
                            i6++;
                        }
                    }
                    com.gamericefishpro.space.y1.b bVar6 = (com.gamericefishpro.space.y1.b) obj2;
                    if (bVar6 != null) {
                        k0Var2.i = bVar6.a;
                        return;
                    }
                    if (bVar5.i || !com.gamericefishpro.space.hj.c.i(bVar5)) {
                        j1Var.K0(rVar);
                    } else {
                        com.gamericefishpro.space.hj.c.h(m0Var.d(), bVar5, j1Var.J, new com.gamericefishpro.space.y1.a(i), m0Var.j, m0Var.l);
                        float fA = ((z1) com.gamericefishpro.space.h2.k.h(j1Var, com.gamericefishpro.space.i2.b1.s)).a();
                        long jI = m0Var.d().i(y3.j(fA, fA));
                        com.gamericefishpro.space.c2.b bVar7 = (com.gamericefishpro.space.c2.b) m0Var.d().e;
                        com.gamericefishpro.space.c2.e eVar = (com.gamericefishpro.space.c2.e) bVar7.b;
                        com.gamericefishpro.space.c2.a[] aVarArr = eVar.d;
                        com.gamericefishpro.space.ph.u.i(0, aVarArr.length, null, aVarArr);
                        eVar.e = 0;
                        com.gamericefishpro.space.c2.e eVar2 = (com.gamericefishpro.space.c2.e) bVar7.c;
                        com.gamericefishpro.space.c2.a[] aVarArr2 = eVar2.d;
                        com.gamericefishpro.space.ph.u.i(0, aVarArr2.length, null, aVarArr2);
                        eVar2.e = 0;
                        bVar7.a = 0L;
                        j1Var.K0(new u(true, d0.a(jI)));
                    }
                    m0Var.a();
                    return;
                }
                j0 j0Var = (j0) hVar;
                if (iVar == com.gamericefishpro.space.b2.i.d) {
                    return;
                }
                int size6 = arrayList.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size6) {
                        f = 0.0f;
                        obj3 = null;
                        break;
                    } else {
                        obj3 = arrayList.get(i7);
                        f = 0.0f;
                        if (com.gamericefishpro.space.u6.f.s(((com.gamericefishpro.space.y1.b) obj3).a, j0Var.j)) {
                            break;
                        } else {
                            i7++;
                        }
                    }
                }
                com.gamericefishpro.space.y1.b bVar8 = (com.gamericefishpro.space.y1.b) obj3;
                if (bVar8 == null) {
                    int size7 = arrayList.size();
                    int i8 = 0;
                    while (true) {
                        if (i8 >= size7) {
                            obj5 = null;
                            break;
                        }
                        obj5 = arrayList.get(i8);
                        if (((com.gamericefishpro.space.y1.b) obj5).d) {
                            break;
                        } else {
                            i8++;
                        }
                    }
                    bVar8 = (com.gamericefishpro.space.y1.b) obj5;
                    if (bVar8 == null) {
                        m0Var.a();
                        return;
                    }
                    j0Var.j = bVar8.a;
                }
                com.gamericefishpro.space.y1.b bVar9 = bVar8;
                if (iVar != com.gamericefishpro.space.b2.i.e) {
                    bVar9 = bVar9;
                } else if (bVar9.i) {
                    bVar9 = bVar9;
                    com.gamericefishpro.space.y1.b bVar10 = j0Var.i;
                    if (bVar10 == null) {
                        throw new IllegalArgumentException("AwaitTouchSlop.initialDown was not initialized");
                    }
                    long j3 = j0Var.j;
                    com.gamericefishpro.space.n9.r0 r0Var = m0Var.i;
                    if (r0Var == null) {
                        throw new IllegalArgumentException("AwaitTouchSlop.touchSlopDetector was not initialized");
                    }
                    m0Var.b(bVar10, j3, r0Var);
                } else if (com.gamericefishpro.space.hj.c.i(bVar9)) {
                    int size8 = arrayList.size();
                    int i9 = 0;
                    while (true) {
                        if (i9 >= size8) {
                            obj4 = null;
                            break;
                        }
                        Object obj6 = arrayList.get(i9);
                        if (((com.gamericefishpro.space.y1.b) obj6).d) {
                            obj4 = obj6;
                            break;
                        }
                        i9++;
                    }
                    com.gamericefishpro.space.y1.b bVar11 = (com.gamericefishpro.space.y1.b) obj4;
                    if (bVar11 == null) {
                        m0Var.a();
                    } else {
                        j0Var.j = bVar11.a;
                    }
                    bVar9 = bVar9;
                } else {
                    z1 z1Var = (z1) com.gamericefishpro.space.h2.k.h(j1Var, com.gamericefishpro.space.i2.b1.s);
                    float f2 = w.a;
                    float fB = z1Var.b();
                    com.gamericefishpro.space.n9.r0 r0Var2 = m0Var.i;
                    if (r0Var2 == null) {
                        throw new IllegalArgumentException("Touch slop detector not initialized.");
                    }
                    long J2 = com.gamericefishpro.space.hj.c.J(bVar9, j1Var.J, new com.gamericefishpro.space.y1.a(i));
                    v0 v0Var3 = j1Var.J;
                    long jFloatToRawIntBits = bVar9.g;
                    if (v0Var3 == null) {
                        bVar9 = bVar9;
                    } else {
                        if (i == 1) {
                            fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
                        } else if (i == 2) {
                            fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
                        }
                        jFloatToRawIntBits = v0Var3 == v0.e ? (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L) : (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32);
                    }
                    long jA = r0Var2.a(J2, jFloatToRawIntBits, fB);
                    if ((9223372034707292159L & jA) != 9205357640488583168L) {
                        bVar9.i = true;
                        com.gamericefishpro.space.y1.b bVar12 = j0Var.i;
                        Intrinsics.b(bVar12);
                        m0Var.f(bVar12, bVar9, new com.gamericefishpro.space.y1.a(i), jA);
                        m0Var.e(bVar9, new com.gamericefishpro.space.y1.a(i), jA);
                        long j4 = bVar9.a;
                        k0 k0Var3 = m0Var.c;
                        if (k0Var3 == null) {
                            k0Var3 = new k0();
                            k0Var3.i = Long.MAX_VALUE;
                            m0Var.c = k0Var3;
                        }
                        k0Var3.i = j4;
                        m0Var.f = k0Var3;
                    } else {
                        j0Var.k = true;
                    }
                }
                if (iVar == com.gamericefishpro.space.b2.i.i && j0Var.k) {
                    if (!bVar9.i) {
                        j0Var.k = false;
                        return;
                    }
                    com.gamericefishpro.space.y1.b bVar13 = j0Var.i;
                    if (bVar13 == null) {
                        throw new IllegalArgumentException("AwaitTouchSlop.initialDown was not initialized");
                    }
                    long j5 = j0Var.j;
                    com.gamericefishpro.space.n9.r0 r0Var3 = m0Var.i;
                    if (r0Var3 == null) {
                        throw new IllegalArgumentException("AwaitTouchSlop.touchSlopDetector was not initialized");
                    }
                    m0Var.b(bVar13, j5, r0Var3);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:102:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:104:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:106:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:108:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:109:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:111:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:255:0x0149 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:256:0x014a A[EDGE_INSN: B:256:0x014a->B:88:0x014a BREAK  A[LOOP:6: B:82:0x0138->B:86:0x0146], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x0127  */
    /* JADX WARN: Code duplicated, block: B:79:0x012d  */
    /* JADX WARN: Code duplicated, block: B:81:0x0133  */
    /* JADX WARN: Code duplicated, block: B:83:0x013a  */
    /* JADX WARN: Code duplicated, block: B:86:0x0146 A[LOOP:6: B:82:0x0138->B:86:0x0146, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:90:0x014e  */
    /* JADX WARN: Code duplicated, block: B:91:0x0151  */
    /* JADX WARN: Code duplicated, block: B:92:0x0154  */
    /* JADX WARN: Code duplicated, block: B:93:0x0159  */
    /* JADX WARN: Code duplicated, block: B:95:0x016b  */
    /* JADX WARN: Code duplicated, block: B:97:0x0188  */
    /* JADX WARN: Code duplicated, block: B:99:0x019c  */
    @Override // com.gamericefishpro.space.h2.t1
    public final void p(com.gamericefishpro.space.b2.h hVar, com.gamericefishpro.space.b2.i iVar, long j) {
        int i;
        Object obj;
        Object obj2;
        boolean z;
        Object obj3;
        String str;
        com.gamericefishpro.space.b2.m mVar;
        long j2;
        com.gamericefishpro.space.n9.r0 r0Var;
        float fA;
        com.gamericefishpro.space.n9.r0 r0Var2;
        long jA;
        q qVar;
        int size;
        int i2;
        Object obj4;
        com.gamericefishpro.space.b2.m mVar2;
        Object obj5;
        j1 j1Var = this;
        List list = hVar.a;
        List list2 = hVar.a;
        int size2 = list.size();
        int i3 = 0;
        while (true) {
            if (i3 < size2) {
                com.gamericefishpro.space.b2.m mVar3 = (com.gamericefishpro.space.b2.m) list.get(i3);
                com.gamericefishpro.space.x7.e eVar = j1Var.K;
                int i4 = mVar3.i;
                eVar.getClass();
                if (i4 == 2) {
                    i3++;
                } else {
                    j1Var.Q = true;
                    if (!j1Var.L) {
                        break;
                    }
                    if (j1Var.V == null) {
                        n nVar = j1Var.R;
                        if (nVar == null) {
                            m mVar4 = m.i;
                            nVar = new n();
                            nVar.a = mVar4;
                            nVar.b = false;
                            j1Var.R = nVar;
                        }
                        j1Var.V = nVar;
                    }
                    com.gamericefishpro.space.z5.f fVar = j1Var.V;
                    if (fVar == null) {
                        throw new IllegalArgumentException("currentDragState should not be null");
                    }
                    if (!(fVar instanceof n)) {
                        if (!(fVar instanceof p)) {
                            if (!(fVar instanceof o)) {
                                if (!(fVar instanceof q)) {
                                    throw new com.gamericefishpro.space.oh.k();
                                }
                                q qVar2 = (q) fVar;
                                if (iVar != com.gamericefishpro.space.b2.i.e) {
                                    break;
                                }
                                long j3 = qVar2.a;
                                int size3 = list.size();
                                int i5 = 0;
                                while (true) {
                                    if (i5 >= size3) {
                                        obj = null;
                                        break;
                                    }
                                    obj = list.get(i5);
                                    if (com.gamericefishpro.space.u6.f.s(((com.gamericefishpro.space.b2.m) obj).a, j3)) {
                                        break;
                                    } else {
                                        i5++;
                                    }
                                }
                                com.gamericefishpro.space.b2.m mVar5 = (com.gamericefishpro.space.b2.m) obj;
                                if (mVar5 == null) {
                                    break;
                                }
                                boolean zP = d5.p(mVar5);
                                r rVar = r.a;
                                if (!zP) {
                                    if (!mVar5.b()) {
                                        if (com.gamericefishpro.space.n1.b.c(d5.Q(mVar5, true)) != 0.0f) {
                                            i = 0;
                                            j1Var.N0(mVar5, d5.Q(mVar5, false));
                                            mVar5.a();
                                            break;
                                        }
                                        break;
                                    }
                                    j1Var.L0().k(rVar);
                                } else {
                                    int size4 = list.size();
                                    int i6 = 0;
                                    while (true) {
                                        if (i6 >= size4) {
                                            obj2 = null;
                                            break;
                                        }
                                        obj2 = list.get(i6);
                                        if (((com.gamericefishpro.space.b2.m) obj2).d) {
                                            break;
                                        } else {
                                            i6++;
                                        }
                                    }
                                    com.gamericefishpro.space.b2.m mVar6 = (com.gamericefishpro.space.b2.m) obj2;
                                    if (mVar6 == null) {
                                        if (mVar5.b() || !d5.p(mVar5)) {
                                            j1Var.L0().k(rVar);
                                        } else {
                                            a4.l(j1Var.M0(), mVar5, 0L);
                                            float fA2 = ((z1) com.gamericefishpro.space.h2.k.h(j1Var, com.gamericefishpro.space.i2.b1.s)).a();
                                            long jI = j1Var.M0().i(y3.j(fA2, fA2));
                                            com.gamericefishpro.space.c2.b bVar = (com.gamericefishpro.space.c2.b) j1Var.M0().e;
                                            com.gamericefishpro.space.c2.e eVar2 = (com.gamericefishpro.space.c2.e) bVar.b;
                                            com.gamericefishpro.space.c2.a[] aVarArr = eVar2.d;
                                            com.gamericefishpro.space.ph.u.i(0, aVarArr.length, null, aVarArr);
                                            eVar2.e = 0;
                                            com.gamericefishpro.space.c2.e eVar3 = (com.gamericefishpro.space.c2.e) bVar.c;
                                            com.gamericefishpro.space.c2.a[] aVarArr2 = eVar3.d;
                                            com.gamericefishpro.space.ph.u.i(0, aVarArr2.length, null, aVarArr2);
                                            eVar3.e = 0;
                                            bVar.a = 0L;
                                            j1Var.L0().k(new u(false, d0.a(jI)));
                                            j1Var.Q = false;
                                        }
                                        j1Var.H0();
                                    } else {
                                        qVar2.a = mVar6.a;
                                    }
                                }
                            } else {
                                o oVar = (o) fVar;
                                if (iVar == com.gamericefishpro.space.b2.i.i) {
                                    int size5 = list.size();
                                    int i7 = 0;
                                    while (true) {
                                        if (i7 >= size5) {
                                            z = true;
                                            break;
                                        } else {
                                            if (((com.gamericefishpro.space.b2.m) list.get(i7)).b()) {
                                                z = false;
                                                break;
                                            }
                                            i7++;
                                        }
                                    }
                                    int size6 = list.size();
                                    int i8 = 0;
                                    while (true) {
                                        if (i8 < size6) {
                                            if (((com.gamericefishpro.space.b2.m) list.get(i8)).d) {
                                                if (!list.isEmpty()) {
                                                    if (!z) {
                                                        break;
                                                    }
                                                    long j4 = ((com.gamericefishpro.space.b2.m) CollectionsKt.w(list)).c;
                                                    com.gamericefishpro.space.b2.m mVar7 = oVar.a;
                                                    Intrinsics.b(mVar7);
                                                    long jD = com.gamericefishpro.space.n1.b.d(j4, mVar7.c);
                                                    com.gamericefishpro.space.b2.m mVar8 = oVar.a;
                                                    if (mVar8 == null) {
                                                        throw new IllegalArgumentException("AwaitGesturePickup.initialDown was not initialized.");
                                                    }
                                                    J0(j1Var, mVar8, oVar.b, jD, 8);
                                                    break;
                                                }
                                                break;
                                            }
                                            i8++;
                                        }
                                        j1Var.H0();
                                        break;
                                    }
                                }
                            }
                            i = 0;
                            break;
                        }
                        p pVar = (p) fVar;
                        if (iVar != com.gamericefishpro.space.b2.i.d) {
                            int size7 = list.size();
                            int i9 = 0;
                            while (true) {
                                if (i9 >= size7) {
                                    obj3 = null;
                                    break;
                                }
                                obj3 = list.get(i9);
                                if (com.gamericefishpro.space.u6.f.s(((com.gamericefishpro.space.b2.m) obj3).a, pVar.b)) {
                                    break;
                                } else {
                                    i9++;
                                }
                            }
                            com.gamericefishpro.space.b2.m mVar9 = (com.gamericefishpro.space.b2.m) obj3;
                            if (mVar9 != null) {
                                if (iVar != com.gamericefishpro.space.b2.i.e) {
                                    str = "AwaitTouchSlop.touchSlopDetector was not initialized";
                                } else if (!mVar9.b()) {
                                    str = "AwaitTouchSlop.touchSlopDetector was not initialized";
                                    mVar = pVar.a;
                                    if (mVar != null) {
                                        throw new IllegalArgumentException("AwaitTouchSlop.initialDown was not initialized");
                                    }
                                    j2 = pVar.b;
                                    r0Var = j1Var.Y;
                                    if (r0Var != null) {
                                        throw new IllegalArgumentException(str);
                                    }
                                    j1Var.I0(mVar, j2, r0Var);
                                } else if (d5.p(mVar9)) {
                                    size = list.size();
                                    i2 = 0;
                                    while (true) {
                                        if (i2 < size) {
                                            obj4 = null;
                                            break;
                                        }
                                        obj4 = list.get(i2);
                                        if (((com.gamericefishpro.space.b2.m) obj4).d) {
                                            break;
                                            break;
                                        }
                                        i2++;
                                    }
                                    mVar2 = (com.gamericefishpro.space.b2.m) obj4;
                                    if (mVar2 == null) {
                                        j1Var.H0();
                                    } else {
                                        pVar.b = mVar2.a;
                                    }
                                    str = "AwaitTouchSlop.touchSlopDetector was not initialized";
                                } else {
                                    fA = w.a((z1) com.gamericefishpro.space.h2.k.h(j1Var, com.gamericefishpro.space.i2.b1.s), mVar9.i);
                                    r0Var2 = j1Var.Y;
                                    if (r0Var2 != null) {
                                        throw new IllegalArgumentException("Touch slop detector not initialized.");
                                    }
                                    str = "AwaitTouchSlop.touchSlopDetector was not initialized";
                                    jA = r0Var2.a(mVar9.c, mVar9.g, fA);
                                    if ((9223372034707292159L & jA) != 9205357640488583168L) {
                                        mVar9.a();
                                        com.gamericefishpro.space.b2.m mVar10 = pVar.a;
                                        Intrinsics.b(mVar10);
                                        j1Var.O0(mVar10, mVar9, jA);
                                        j1Var.N0(mVar9, jA);
                                        long j5 = mVar9.a;
                                        qVar = j1Var.S;
                                        if (qVar == null) {
                                            qVar = new q();
                                            qVar.a = Long.MAX_VALUE;
                                            j1Var.S = qVar;
                                        }
                                        qVar.a = j5;
                                        j1Var.V = qVar;
                                    } else {
                                        pVar.c = true;
                                    }
                                }
                                if (iVar == com.gamericefishpro.space.b2.i.i) {
                                    i = 0;
                                    break;
                                } else {
                                    i = 0;
                                    break;
                                }
                            }
                            int size8 = list.size();
                            int i10 = 0;
                            while (true) {
                                if (i10 >= size8) {
                                    obj5 = null;
                                    break;
                                }
                                obj5 = list.get(i10);
                                if (((com.gamericefishpro.space.b2.m) obj5).d) {
                                    break;
                                } else {
                                    i10++;
                                }
                            }
                            mVar9 = (com.gamericefishpro.space.b2.m) obj5;
                            if (mVar9 != null) {
                                pVar.b = mVar9.a;
                                if (iVar != com.gamericefishpro.space.b2.i.e) {
                                    str = "AwaitTouchSlop.touchSlopDetector was not initialized";
                                } else if (!mVar9.b()) {
                                    str = "AwaitTouchSlop.touchSlopDetector was not initialized";
                                    mVar = pVar.a;
                                    if (mVar != null) {
                                        throw new IllegalArgumentException("AwaitTouchSlop.initialDown was not initialized");
                                    }
                                    j2 = pVar.b;
                                    r0Var = j1Var.Y;
                                    if (r0Var != null) {
                                        throw new IllegalArgumentException(str);
                                    }
                                    j1Var.I0(mVar, j2, r0Var);
                                } else if (d5.p(mVar9)) {
                                    size = list.size();
                                    i2 = 0;
                                    while (true) {
                                        if (i2 < size) {
                                            obj4 = null;
                                            break;
                                        }
                                        obj4 = list.get(i2);
                                        if (((com.gamericefishpro.space.b2.m) obj4).d) {
                                            break;
                                        } else {
                                            i2++;
                                        }
                                    }
                                    mVar2 = (com.gamericefishpro.space.b2.m) obj4;
                                    if (mVar2 == null) {
                                        j1Var.H0();
                                    } else {
                                        pVar.b = mVar2.a;
                                    }
                                    str = "AwaitTouchSlop.touchSlopDetector was not initialized";
                                } else {
                                    fA = w.a((z1) com.gamericefishpro.space.h2.k.h(j1Var, com.gamericefishpro.space.i2.b1.s), mVar9.i);
                                    r0Var2 = j1Var.Y;
                                    if (r0Var2 != null) {
                                        throw new IllegalArgumentException("Touch slop detector not initialized.");
                                    }
                                    str = "AwaitTouchSlop.touchSlopDetector was not initialized";
                                    jA = r0Var2.a(mVar9.c, mVar9.g, fA);
                                    if ((9223372034707292159L & jA) != 9205357640488583168L) {
                                        mVar9.a();
                                        com.gamericefishpro.space.b2.m mVar11 = pVar.a;
                                        Intrinsics.b(mVar11);
                                        j1Var.O0(mVar11, mVar9, jA);
                                        j1Var.N0(mVar9, jA);
                                        long j6 = mVar9.a;
                                        qVar = j1Var.S;
                                        if (qVar == null) {
                                            qVar = new q();
                                            qVar.a = Long.MAX_VALUE;
                                            j1Var.S = qVar;
                                        }
                                        qVar.a = j6;
                                        j1Var.V = qVar;
                                    } else {
                                        pVar.c = true;
                                    }
                                }
                                if (iVar == com.gamericefishpro.space.b2.i.i || !pVar.c) {
                                    break;
                                }
                                if (!mVar9.b()) {
                                    pVar.c = false;
                                    i = 0;
                                    break;
                                }
                                com.gamericefishpro.space.b2.m mVar12 = pVar.a;
                                if (mVar12 == null) {
                                    throw new IllegalArgumentException("AwaitTouchSlop.initialDown was not initialized");
                                }
                                long j7 = pVar.b;
                                com.gamericefishpro.space.n9.r0 r0Var3 = j1Var.Y;
                                if (r0Var3 == null) {
                                    throw new IllegalArgumentException(str);
                                }
                                j1Var.I0(mVar12, j7, r0Var3);
                            } else {
                                j1Var.H0();
                            }
                            i = 0;
                            break;
                        }
                        break;
                    }
                    n nVar2 = (n) fVar;
                    if (!list.isEmpty() && s1.c(hVar, false)) {
                        com.gamericefishpro.space.b2.m mVar13 = (com.gamericefishpro.space.b2.m) CollectionsKt.w(list);
                        m mVar14 = x.a[nVar2.a.ordinal()] == 1 ? !j1Var.P0() ? m.d : m.e : nVar2.a;
                        nVar2.a = mVar14;
                        if (iVar == com.gamericefishpro.space.b2.i.d && mVar14 == m.e) {
                            mVar13.a();
                            nVar2.b = true;
                        }
                        if (iVar == com.gamericefishpro.space.b2.i.e) {
                            if (mVar14 == m.d) {
                                J0(j1Var, mVar13, mVar13.a, 0L, 12);
                            } else if (nVar2.b) {
                                j1Var.O0(mVar13, mVar13, 0L);
                                j1Var.N0(mVar13, 0L);
                                long j8 = mVar13.a;
                                q qVar3 = j1Var.S;
                                if (qVar3 == null) {
                                    qVar3 = new q();
                                    qVar3.a = Long.MAX_VALUE;
                                    j1Var.S = qVar3;
                                }
                                qVar3.a = j8;
                                j1Var.V = qVar3;
                            }
                        }
                    }
                }
            }
            i = 0;
            break;
        }
        if (j1Var.L) {
            if (iVar == com.gamericefishpro.space.b2.i.d && hVar.c == 6) {
                if (j1Var.m0 == null) {
                    j1Var = this;
                    j1Var.m0 = new com.gamericefishpro.space.p5.a(j1Var.g0, new com.gamericefishpro.space.tb.u(29, ViewConfiguration.get(com.gamericefishpro.space.h2.k.u(j1Var).getContext())), new com.gamericefishpro.space.b1.g(2, this, j1.class, "onWheelScrollStopped", "onWheelScrollStopped-TH1AsA0(J)V", 4, 1), com.gamericefishpro.space.h2.k.s(j1Var).S);
                }
                com.gamericefishpro.space.p5.a aVar = j1Var.m0;
                if (aVar != null) {
                    com.gamericefishpro.space.pi.x xVarO0 = j1Var.o0();
                    if (((com.gamericefishpro.space.pi.s1) aVar.g) == null) {
                        aVar.g = com.gamericefishpro.space.pi.a0.u(xVarO0, null, new t0(aVar, null), 3);
                    }
                }
            }
            com.gamericefishpro.space.p5.a aVar2 = j1Var.m0;
            if (aVar2 == null || hVar.c != 6) {
                return;
            }
            int size9 = list.size();
            for (int i11 = i; i11 < size9; i11++) {
                if (((com.gamericefishpro.space.b2.m) list.get(i11)).b()) {
                    return;
                }
            }
            if (iVar == com.gamericefishpro.space.b2.i.d && aVar2.a) {
                aVar2.d(hVar);
                int size10 = list2.size();
                for (int i12 = i; i12 < size10; i12++) {
                    ((com.gamericefishpro.space.b2.m) list2.get(i12)).a();
                }
            }
            if (iVar == com.gamericefishpro.space.b2.i.e && !aVar2.a && aVar2.d(hVar)) {
                int size11 = list2.size();
                for (int i13 = i; i13 < size11; i13++) {
                    ((com.gamericefishpro.space.b2.m) list2.get(i13)).a();
                }
            }
        }
    }

    @Override // com.gamericefishpro.space.h1.l
    public final boolean p0() {
        return false;
    }

    @Override // com.gamericefishpro.space.h1.l
    public final void s0() {
        if (this.G) {
            com.gamericefishpro.space.c3.c cVar = com.gamericefishpro.space.h2.k.s(this).S;
            k kVar = this.f0;
            kVar.getClass();
            kVar.a = new com.gamericefishpro.space.w.r(new com.gamericefishpro.space.tb.u(cVar));
        }
        com.gamericefishpro.space.p5.a aVar = this.m0;
        if (aVar != null) {
            aVar.e = com.gamericefishpro.space.h2.k.s(this).S;
        }
    }

    @Override // com.gamericefishpro.space.h1.l
    public final void t0() {
        this.P = false;
        G0();
        this.a0 = 0L;
    }

    @Override // com.gamericefishpro.space.y1.c
    public final void u() {
        m0 m0Var = this.Z;
        if (m0Var != null) {
            m0Var.a();
            j1 j1Var = m0Var.a;
            if (j1Var.P) {
                j1Var.K0(r.a);
            }
            m0Var.g = null;
            n0 n0Var = m0Var.k;
            n0Var.a = 0;
            n0Var.b.clear();
        }
    }
}
