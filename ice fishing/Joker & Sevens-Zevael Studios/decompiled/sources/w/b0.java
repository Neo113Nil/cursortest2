package w;

import x1.f1;
import x1.u1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b0 extends x1.m implements d1.d, u1, x1.o, d1.o {

    /* renamed from: w, reason: collision with root package name */
    public d1.p f7377w;

    /* renamed from: x, reason: collision with root package name */
    public final a0 f7378x;

    /* renamed from: y, reason: collision with root package name */
    public final c0 f7379y;

    /* renamed from: z, reason: collision with root package name */
    public final d0 f7380z;

    public b0(y.i iVar) {
        a0 a0Var = new a0();
        a0Var.f7366u = iVar;
        r0(a0Var);
        this.f7378x = a0Var;
        c0 c0Var = new c0();
        r0(c0Var);
        this.f7379y = c0Var;
        d0 d0Var = new d0();
        r0(d0Var);
        this.f7380z = d0Var;
        r0(new d1.r(new d1.q(1, d1.t.f1614a, d1.t.class, "onDispatchEventsCompleted", "onDispatchEventsCompleted(Landroidx/compose/ui/focus/FocusTargetNode;)V", 0, 0, 0), 3));
    }

    @Override // x1.u1
    public final void I(e2.j jVar) {
        d1.p pVar = this.f7377w;
        boolean z10 = false;
        if (pVar != null && pVar.a()) {
            z10 = true;
        }
        vc.c[] cVarArr = e2.u.f2053a;
        e2.v vVar = e2.s.f2035k;
        vc.c cVar = e2.u.f2053a[4];
        vVar.a(jVar, Boolean.valueOf(z10));
        jVar.d(e2.i.f1979u, new e2.a(null, new b0.p0(18, this)));
    }

    @Override // x1.o
    public final void g(f1 f1Var) {
        this.f7380z.g(f1Var);
    }

    @Override // y0.m
    public final boolean g0() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // d1.d
    public final void n(d1.p pVar) {
        e0 r02;
        if (pc.j.a(this.f7377w, pVar)) {
            return;
        }
        boolean a6 = pVar.a();
        b0.z zVar = null;
        Object[] objArr = 0;
        if (a6) {
            yc.a0.q(f0(), null, new ld.c(this, objArr == true ? 1 : 0, 6), 3);
        }
        if (this.f8456t) {
            x1.f.o(this);
        }
        a0 a0Var = this.f7378x;
        y.i iVar = a0Var.f7366u;
        if (iVar != null) {
            if (a6) {
                y.d dVar = a0Var.f7367v;
                if (dVar != null) {
                    a0Var.r0(iVar, new y.e(dVar));
                    a0Var.f7367v = null;
                }
                y.d dVar2 = new y.d();
                a0Var.r0(iVar, dVar2);
                a0Var.f7367v = dVar2;
            } else {
                y.d dVar3 = a0Var.f7367v;
                if (dVar3 != null) {
                    a0Var.r0(iVar, new y.e(dVar3));
                    a0Var.f7367v = null;
                }
            }
        }
        d0 d0Var = this.f7380z;
        if (a6 != d0Var.f7402u) {
            if (a6) {
                f1 f1Var = d0Var.f7403v;
                if (f1Var != null && f1Var.B0().f8456t && (r02 = d0Var.r0()) != null) {
                    r02.r0(d0Var.f7403v);
                }
            } else {
                e0 r03 = d0Var.r0();
                if (r03 != null) {
                    r03.r0(null);
                }
            }
            d0Var.f7402u = a6;
        }
        c0 c0Var = this.f7379y;
        if (a6) {
            c0Var.getClass();
            pc.s sVar = new pc.s();
            x1.f.s(c0Var, new c1.b(6, sVar, c0Var));
            b0.z zVar2 = (b0.z) sVar.f5683g;
            if (zVar2 != null) {
                zVar2.a();
                zVar = zVar2;
            }
            c0Var.f7394u = zVar;
        } else {
            b0.z zVar3 = c0Var.f7394u;
            if (zVar3 != null) {
                zVar3.b();
            }
            c0Var.f7394u = null;
        }
        c0Var.f7395v = a6;
        this.f7377w = pVar;
    }

    public final void u0(y.i iVar) {
        y.d dVar;
        a0 a0Var = this.f7378x;
        if (pc.j.a(a0Var.f7366u, iVar)) {
            return;
        }
        y.i iVar2 = a0Var.f7366u;
        if (iVar2 != null && (dVar = a0Var.f7367v) != null) {
            iVar2.b(new y.e(dVar));
        }
        a0Var.f7367v = null;
        a0Var.f7366u = iVar;
    }
}
