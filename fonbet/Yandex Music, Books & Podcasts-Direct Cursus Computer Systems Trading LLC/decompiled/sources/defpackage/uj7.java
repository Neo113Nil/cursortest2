package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import com.yandex.pulse.metrics.c;
import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public final class uj7 implements f8l, bwh, xk2, dra {
    public final dzr a;
    public final ois b;
    public final ris c;
    public final mmo d;
    public final SparseArray e;
    public bdg f;
    public i8l g;
    public hzr h;
    public boolean i;

    public uj7(dzr dzrVar) {
        dzrVar.getClass();
        this.a = dzrVar;
        this.f = new bdg(dvt.C(), dzrVar, new qq6(27));
        ois oisVar = new ois();
        this.b = oisVar;
        this.c = new ris();
        this.d = new mmo(oisVar);
        this.e = new SparseArray();
    }

    @Override // defpackage.bwh
    public final void A(int i, uvh uvhVar, cfg cfgVar, boh bohVar, int i2) {
        c80 b0 = b0(i, uvhVar);
        d0(b0, 1000, new dj7(b0, cfgVar, bohVar, i2));
    }

    @Override // defpackage.bwh
    public final void C(int i, uvh uvhVar, boh bohVar) {
        c80 b0 = b0(i, uvhVar);
        d0(b0, 1004, new bj7(b0, bohVar, 0));
    }

    @Override // defpackage.f8l
    public final void D(dv1 dv1Var) {
        c80 c0 = c0();
        d0(c0, 20, new v13(10, c0, dv1Var));
    }

    @Override // defpackage.f8l
    public final void E(w0t w0tVar) {
        d0(Y(), 19, new qq6(20));
    }

    @Override // defpackage.f8l
    public final void F(boolean z) {
        c80 Y = Y();
        d0(Y, 3, new mj7(Y, z, 1));
    }

    @Override // defpackage.f8l
    public final void G(int i, boolean z) {
        c80 Y = Y();
        d0(Y, 5, new pj7(Y, z, i));
    }

    @Override // defpackage.f8l
    public final void H(float f) {
        c80 c0 = c0();
        d0(c0, 22, new oj7(c0, f));
    }

    @Override // defpackage.f8l
    public final void I(int i, onh onhVar) {
        c80 Y = Y();
        d0(Y, 1, new nj7(Y, onhVar, i, 0));
    }

    @Override // defpackage.bwh
    public final void J(int i, uvh uvhVar, cfg cfgVar, boh bohVar) {
        c80 b0 = b0(i, uvhVar);
        d0(b0, 1002, new dj7(b0, cfgVar, bohVar, 1, (byte) 0));
    }

    @Override // defpackage.bwh
    public final void K(int i, uvh uvhVar, cfg cfgVar, boh bohVar) {
        c80 b0 = b0(i, uvhVar);
        d0(b0, c.FINITE_SUM_FIELD_NUMBER, new dj7(b0, cfgVar, bohVar, 2, (byte) 0));
    }

    @Override // defpackage.f8l
    public final void L(hzk hzkVar) {
        uvh uvhVar;
        c80 Y = (!(hzkVar instanceof pqb) || (uvhVar = ((pqb) hzkVar).o) == null) ? Y() : Z(uvhVar);
        d0(Y, 10, new v13(11, Y, hzkVar));
    }

    @Override // defpackage.f8l
    public final void M(e3t e3tVar) {
        c80 Y = Y();
        d0(Y, 2, new v13(6, Y, e3tVar));
    }

    @Override // defpackage.f8l
    public final void O(hzk hzkVar) {
        uvh uvhVar;
        d0((!(hzkVar instanceof pqb) || (uvhVar = ((pqb) hzkVar).o) == null) ? Y() : Z(uvhVar), 10, new qq6(24));
    }

    @Override // defpackage.f8l
    public final void P(hoh hohVar) {
        c80 Y = Y();
        d0(Y, 14, new v13(7, Y, hohVar));
    }

    @Override // defpackage.f8l
    public final void Q(long j) {
        d0(Y(), 17, new qq6(21));
    }

    @Override // defpackage.f8l
    public final void R(sis sisVar, int i) {
        i8l i8lVar = this.g;
        i8lVar.getClass();
        mmo mmoVar = this.d;
        mmoVar.e = mmo.W(i8lVar, (yde) mmoVar.c, (uvh) mmoVar.f, (ois) mmoVar.b);
        mmoVar.Y0(i8lVar.V());
        c80 Y = Y();
        d0(Y, 0, new hj7(Y, i, 3));
    }

    @Override // defpackage.f8l
    public final void S(int i, boolean z) {
        d0(Y(), -1, new qq6(23));
    }

    @Override // defpackage.dra
    public final void T(int i, uvh uvhVar) {
        c80 b0 = b0(i, uvhVar);
        d0(b0, 1027, new gj7(b0, 3));
    }

    @Override // defpackage.f8l
    public final void U(p0l p0lVar) {
        c80 Y = Y();
        d0(Y, 12, new v13(5, Y, p0lVar));
    }

    @Override // defpackage.f8l
    public final void V(d8l d8lVar) {
        d0(Y(), 13, new qq6(22));
    }

    @Override // defpackage.f8l
    public final void W(long j) {
        d0(Y(), 18, new qq6(19));
    }

    @Override // defpackage.f8l
    public final void X(boolean z) {
        c80 Y = Y();
        d0(Y, 7, new mj7(Y, z, 2));
    }

    public final c80 Y() {
        return Z((uvh) this.d.e);
    }

    public final c80 Z(uvh uvhVar) {
        this.g.getClass();
        sis sisVar = uvhVar == null ? null : (sis) ((cee) this.d.d).get(uvhVar);
        if (uvhVar != null && sisVar != null) {
            return a0(sisVar, sisVar.g(uvhVar.a, this.b).c, uvhVar);
        }
        int v0 = this.g.v0();
        sis V = this.g.V();
        if (v0 >= V.o()) {
            V = sis.a;
        }
        return a0(V, v0, null);
    }

    @Override // defpackage.f8l
    public final void a(List list) {
        d0(Y(), 27, new qq6(26));
    }

    public final c80 a0(sis sisVar, int i, uvh uvhVar) {
        uvh uvhVar2 = sisVar.p() ? null : uvhVar;
        this.a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = sisVar.equals(this.g.V()) && i == this.g.v0();
        long j = 0;
        if (uvhVar2 == null || !uvhVar2.b()) {
            if (z) {
                j = this.g.s0();
            } else if (!sisVar.p()) {
                j = dvt.m0(sisVar.m(i, this.c, 0L).l);
            }
        } else if (z && this.g.R() == uvhVar2.b && this.g.p0() == uvhVar2.c) {
            j = this.g.J0();
        }
        return new c80(elapsedRealtime, sisVar, i, uvhVar2, j, this.g.V(), this.g.v0(), (uvh) this.d.e, this.g.J0(), this.g.w());
    }

    @Override // defpackage.f8l
    public final void b(int i) {
        c80 Y = Y();
        d0(Y, 8, new hj7(Y, i, 6));
    }

    public final c80 b0(int i, uvh uvhVar) {
        this.g.getClass();
        if (uvhVar != null) {
            return ((sis) ((cee) this.d.d).get(uvhVar)) != null ? Z(uvhVar) : a0(sis.a, i, uvhVar);
        }
        sis V = this.g.V();
        if (i >= V.o()) {
            V = sis.a;
        }
        return a0(V, i, null);
    }

    @Override // defpackage.xk2
    public final void c(int i, long j, long j2) {
        mmo mmoVar = this.d;
        c80 Z = Z(((yde) mmoVar.c).isEmpty() ? null : (uvh) ild.x((yde) mmoVar.c));
        d0(Z, 1006, new aj7(Z, i, j, j2));
    }

    public final c80 c0() {
        return Z((uvh) this.d.g);
    }

    @Override // defpackage.dra
    public final void d(int i, uvh uvhVar, Exception exc) {
        c80 b0 = b0(i, uvhVar);
        d0(b0, 1024, new ij7(b0, exc, 0));
    }

    public final void d0(c80 c80Var, int i, ycg ycgVar) {
        this.e.put(i, c80Var);
        this.f.f(i, ycgVar);
    }

    @Override // defpackage.f8l
    public final void e(boolean z) {
        c80 c0 = c0();
        d0(c0, 23, new mj7(c0, z, 0));
    }

    public final void e0(xrb xrbVar, Looper looper) {
        vq1.A(this.g == null || ((yde) this.d.c).isEmpty());
        xrbVar.getClass();
        this.g = xrbVar;
        this.h = this.a.a(looper, null);
        bdg bdgVar = this.f;
        this.f = new bdg(bdgVar.d, looper, bdgVar.a, new v13(9, this, xrbVar), bdgVar.i);
    }

    @Override // defpackage.bwh
    public final void f(int i, uvh uvhVar, boh bohVar) {
        c80 b0 = b0(i, uvhVar);
        d0(b0, 1005, new bj7(b0, bohVar, 1));
    }

    @Override // defpackage.dra
    public final void g(int i, uvh uvhVar, int i2) {
        c80 b0 = b0(i, uvhVar);
        d0(b0, 1022, new hj7(b0, i2, 1));
    }

    @Override // defpackage.f8l
    public final void h(u2i u2iVar) {
        c80 Y = Y();
        d0(Y, 28, new v13(8, Y, u2iVar));
    }

    @Override // defpackage.bwh
    public final void i(int i, uvh uvhVar, cfg cfgVar, boh bohVar, IOException iOException, boolean z) {
        c80 b0 = b0(i, uvhVar);
        d0(b0, 1003, new fj7(b0, cfgVar, bohVar, iOException, z));
    }

    @Override // defpackage.f8l
    public final void j(int i, int i2) {
        c80 c0 = c0();
        d0(c0, 24, new eq2(c0, i, i2));
    }

    @Override // defpackage.f8l
    public final void k(tcu tcuVar) {
        c80 c0 = c0();
        d0(c0, 25, new v13(12, c0, tcuVar));
    }

    @Override // defpackage.f8l
    public final void l(sv6 sv6Var) {
        d0(Y(), 27, new qq6(17));
    }

    @Override // defpackage.f8l
    public final void m(int i) {
        c80 Y = Y();
        d0(Y, 6, new hj7(Y, i, 4));
    }

    @Override // defpackage.f8l
    public final void o(int i) {
        c80 c0 = c0();
        d0(c0, 21, new hj7(c0, i, 2));
    }

    @Override // defpackage.f8l
    public final void p(int i) {
        c80 Y = Y();
        d0(Y, 4, new hj7(Y, i, 5));
    }

    @Override // defpackage.f8l
    public final void q(boolean z) {
        c80 Y = Y();
        d0(Y, 9, new mj7(Y, z, 3));
    }

    @Override // defpackage.dra
    public final void r(int i, uvh uvhVar) {
        c80 b0 = b0(i, uvhVar);
        d0(b0, 1025, new gj7(b0, 5));
    }

    @Override // defpackage.f8l
    public final void s(int i, boolean z) {
        d0(Y(), 30, new qq6(25));
    }

    @Override // defpackage.f8l
    public final void t(long j) {
        d0(Y(), 16, new qq6(18));
    }

    @Override // defpackage.f8l
    public final void u(int i, g8l g8lVar, g8l g8lVar2) {
        if (i == 1) {
            this.i = false;
        }
        i8l i8lVar = this.g;
        i8lVar.getClass();
        mmo mmoVar = this.d;
        mmoVar.e = mmo.W(i8lVar, (yde) mmoVar.c, (uvh) mmoVar.f, (ois) mmoVar.b);
        c80 Y = Y();
        d0(Y, 11, new sj7(i, Y, g8lVar, g8lVar2));
    }

    @Override // defpackage.f8l
    public final void v(hoh hohVar) {
        d0(Y(), 15, new qq6(29));
    }

    @Override // defpackage.dra
    public final void w(int i, uvh uvhVar) {
        c80 b0 = b0(i, uvhVar);
        d0(b0, 1026, new gj7(b0, 4));
    }

    @Override // defpackage.dra
    public final void x(int i, uvh uvhVar) {
        c80 b0 = b0(i, uvhVar);
        d0(b0, 1023, new gj7(b0, 6));
    }

    @Override // defpackage.f8l
    public final void z(p08 p08Var) {
        d0(Y(), 29, new qq6(28));
    }

    @Override // defpackage.f8l
    public final void y() {
    }

    @Override // defpackage.f8l
    public final void B(int i) {
    }

    @Override // defpackage.f8l
    public final void n(boolean z) {
    }

    @Override // defpackage.f8l
    public final void N(i8l i8lVar, e8l e8lVar) {
    }
}
