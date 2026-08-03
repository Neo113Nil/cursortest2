package x1;

import android.graphics.Paint;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class y extends f1 {
    public static final l6.l V;
    public w T;
    public x U;

    static {
        l6.l f10 = f1.d0.f();
        f10.f(f1.q.f2281f);
        ((Paint) f10.f4199b).setStrokeWidth(1.0f);
        f10.k(1);
        V = f10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public y(g0 g0Var, w wVar) {
        super(g0Var);
        this.T = wVar;
        this.U = g0Var.f8047m != null ? new x(this) : null;
        if ((((y0.m) wVar).f8443g.f8445i & 512) != 0) {
            throw new ClassCastException();
        }
    }

    @Override // x1.f1
    public final y0.m B0() {
        return ((y0.m) this.T).f8443g;
    }

    @Override // v1.j0
    public final void P(long j3, float f10, oc.c cVar) {
        R0(j3, f10, cVar);
        if (this.f8125p) {
            return;
        }
        O0();
        j0().b();
        pc.j.b(this.f8034v);
    }

    @Override // x1.f1
    public final void Q0(f1.o oVar, i1.b bVar) {
        f1 f1Var;
        f1 f1Var2 = this.f8034v;
        pc.j.b(f1Var2);
        f1Var2.u0(oVar, bVar);
        if (!((y1.r) j0.a(this.f8033u)).getShowLayoutBounds() || (f1Var = this.f8034v) == null) {
            return;
        }
        if (s2.k.a(this.f7087i, f1Var.f7087i) && s2.i.a(f1Var.F, 0L)) {
            return;
        }
        long j3 = this.f7087i;
        oVar.c(0.5f, 0.5f, ((int) (j3 >> 32)) - 0.5f, ((int) (j3 & 4294967295L)) - 0.5f, V);
    }

    @Override // x1.o0
    public final int W(v1.k kVar) {
        x xVar = this.U;
        if (xVar == null) {
            return f.c(this, kVar);
        }
        s.z zVar = xVar.f8146z;
        int d10 = zVar.d(kVar);
        if (d10 >= 0) {
            return zVar.f6364c[d10];
        }
        return Integer.MIN_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Z0(w wVar) {
        if (!wVar.equals(this.T) && (((y0.m) wVar).f8443g.f8445i & 512) != 0) {
            throw new ClassCastException();
        }
        this.T = wVar;
    }

    @Override // v1.d0
    public final v1.j0 e(long j3) {
        S(j3);
        w wVar = this.T;
        f1 f1Var = this.f8034v;
        pc.j.b(f1Var);
        U0(wVar.e(this, f1Var, j3));
        N0();
        return this;
    }

    @Override // x1.f1
    public final void w0() {
        if (this.U == null) {
            this.U = new x(this);
        }
    }

    @Override // x1.f1
    public final p0 z0() {
        return this.U;
    }
}
