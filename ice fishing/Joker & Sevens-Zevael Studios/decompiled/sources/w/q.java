package w;

import android.view.KeyEvent;
import java.util.Iterator;
import java.util.LinkedHashMap;
import x1.r1;
import x1.u1;
import x1.z1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class q extends x1.m implements r1, p1.c, d1.d, u1, z1 {
    public static final t0 M = new t0();
    public oc.a A;
    public final b0 C;
    public r1.z D;
    public x1.l E;
    public y.k F;
    public y.f G;
    public y.i J;
    public boolean K;
    public final t0 L;

    /* renamed from: w, reason: collision with root package name */
    public y.i f7483w;

    /* renamed from: x, reason: collision with root package name */
    public o0 f7484x;

    /* renamed from: y, reason: collision with root package name */
    public e2.g f7485y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f7486z;
    public final z B = new z();
    public final LinkedHashMap H = new LinkedHashMap();
    public long I = 0;

    public q(y.i iVar, o0 o0Var, boolean z10, e2.g gVar, oc.a aVar) {
        this.f7483w = iVar;
        this.f7484x = o0Var;
        this.f7485y = gVar;
        this.f7486z = z10;
        this.A = aVar;
        this.C = new b0(iVar);
        y.i iVar2 = this.f7483w;
        this.J = iVar2;
        this.K = iVar2 == null && this.f7484x != null;
        this.L = M;
    }

    @Override // p1.c
    public final boolean F(KeyEvent keyEvent) {
        int d10;
        v0();
        boolean z10 = this.f7486z;
        int i10 = 0;
        int i11 = 1;
        fc.d dVar = null;
        LinkedHashMap linkedHashMap = this.H;
        if (z10) {
            int i12 = r.f7490b;
            if (bc.a0.u(keyEvent) == 2 && ((d10 = (int) (v6.a.d(keyEvent.getKeyCode()) >> 32)) == 23 || d10 == 66 || d10 == 160)) {
                if (!linkedHashMap.containsKey(new p1.a(v6.a.d(keyEvent.getKeyCode())))) {
                    y.k kVar = new y.k(this.I);
                    linkedHashMap.put(new p1.a(v6.a.d(keyEvent.getKeyCode())), kVar);
                    if (this.f7483w != null) {
                        yc.a0.q(f0(), null, new c(this, kVar, dVar, i10), 3);
                    }
                    return true;
                }
                return false;
            }
        }
        if (this.f7486z) {
            int i13 = r.f7490b;
            if (bc.a0.u(keyEvent) == 1) {
                int d11 = (int) (v6.a.d(keyEvent.getKeyCode()) >> 32);
                if (d11 != 23 && d11 != 66 && d11 != 160) {
                    return false;
                }
                y.k kVar2 = (y.k) linkedHashMap.remove(new p1.a(v6.a.d(keyEvent.getKeyCode())));
                if (kVar2 != null && this.f7483w != null) {
                    yc.a0.q(f0(), null, new c(this, kVar2, dVar, i11), 3);
                }
                this.A.invoke();
                return true;
            }
        }
        return false;
    }

    @Override // x1.u1
    public final void I(e2.j jVar) {
        e2.g gVar = this.f7485y;
        if (gVar != null) {
            e2.u.a(jVar, gVar.f1956a);
        }
        b0.p0 p0Var = new b0.p0(17, this);
        vc.c[] cVarArr = e2.u.f2053a;
        jVar.d(e2.i.f1960b, new e2.a(null, p0Var));
        if (this.f7486z) {
            this.C.I(jVar);
        } else {
            jVar.d(e2.s.f2033i, ac.o.f277a);
        }
    }

    @Override // x1.r1
    public final void P() {
        y.f fVar;
        y.i iVar = this.f7483w;
        if (iVar != null && (fVar = this.G) != null) {
            iVar.b(new y.g(fVar));
        }
        this.G = null;
        r1.z zVar = this.D;
        if (zVar != null) {
            zVar.P();
        }
    }

    @Override // x1.u1
    public final boolean T() {
        return true;
    }

    @Override // y0.m
    public final boolean g0() {
        return false;
    }

    @Override // y0.m
    public final void j0() {
        if (!this.K) {
            v0();
        }
        if (this.f7486z) {
            r0(this.B);
            r0(this.C);
        }
    }

    @Override // p1.c
    public final boolean k(KeyEvent keyEvent) {
        return false;
    }

    @Override // y0.m
    public final void k0() {
        u0();
        if (this.J == null) {
            this.f7483w = null;
        }
        x1.l lVar = this.E;
        if (lVar != null) {
            s0(lVar);
        }
        this.E = null;
    }

    @Override // d1.d
    public final void n(d1.p pVar) {
        if (pVar.a()) {
            v0();
        }
        if (this.f7486z) {
            this.C.n(pVar);
        }
    }

    @Override // x1.z1
    public final Object r() {
        return this.L;
    }

    public final void u0() {
        y.i iVar = this.f7483w;
        LinkedHashMap linkedHashMap = this.H;
        if (iVar != null) {
            y.k kVar = this.F;
            if (kVar != null) {
                iVar.b(new y.j(kVar));
            }
            y.f fVar = this.G;
            if (fVar != null) {
                iVar.b(new y.g(fVar));
            }
            Iterator it = linkedHashMap.values().iterator();
            while (it.hasNext()) {
                iVar.b(new y.j((y.k) it.next()));
            }
        }
        this.F = null;
        this.G = null;
        linkedHashMap.clear();
    }

    public final void v0() {
        o0 o0Var;
        if (this.E == null && (o0Var = this.f7484x) != null) {
            if (this.f7483w == null) {
                this.f7483w = new y.i();
            }
            this.C.u0(this.f7483w);
            y.i iVar = this.f7483w;
            pc.j.b(iVar);
            x1.l a6 = o0Var.a(iVar);
            r0(a6);
            this.E = a6;
        }
    }

    @Override // x1.r1
    public final void z(r1.g gVar, r1.h hVar, long j3) {
        long j6 = ((j3 >> 33) << 32) | (((j3 << 32) >> 33) & 4294967295L);
        this.I = v6.a.h((int) (j6 >> 32), (int) (j6 & 4294967295L));
        v0();
        fc.d dVar = null;
        if (this.f7486z && hVar == r1.h.f5957h) {
            int i10 = gVar.f5955b;
            if (i10 == 4) {
                yc.a0.q(f0(), null, new d(this, dVar, 0), 3);
            } else if (i10 == 5) {
                yc.a0.q(f0(), null, new d(this, dVar, 1), 3);
            }
        }
        if (this.D == null) {
            c0.d dVar2 = new c0.d(this, dVar, 11);
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
    }
}
