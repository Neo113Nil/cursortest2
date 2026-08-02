package defpackage;

import android.view.ActionMode;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class qbs {
    public final mit a;
    public axf d;
    public uif g;
    public kp4 h;
    public mm6 i;
    public hes j;
    public msd k;
    public yoc l;
    public final x6k m;
    public final x6k n;
    public long o;
    public Integer p;
    public long q;
    public final x6k r;
    public final x6k s;
    public int t;
    public ybs u;
    public xlq v;
    public final mbs w;
    public final uiq x;
    public mnj b = nt0.t;
    public Function1 c = rvr.E;
    public final x6k e = szf.g0(new ybs((String) null, 0, 7));
    public tiu f = i9w.h;

    public qbs(mit mitVar) {
        this.a = mitVar;
        Boolean bool = Boolean.TRUE;
        this.m = szf.g0(bool);
        this.n = szf.g0(bool);
        this.o = 0L;
        this.q = 0L;
        this.r = szf.g0(null);
        this.s = szf.g0(null);
        this.t = -1;
        this.u = new ybs((String) null, 0L, 7);
        this.w = new mbs(this, 1);
        this.x = new uiq(4, this);
    }

    public static final long a(qbs qbsVar, ybs ybsVar, long j, boolean z, boolean z2, zdp zdpVar, boolean z3) {
        dds d;
        long j2;
        long j3;
        ydp ydpVar;
        boolean z4;
        boolean z5;
        msd msdVar;
        int i;
        axf axfVar = qbsVar.d;
        if (axfVar == null || (d = axfVar.d()) == null) {
            return rds.b;
        }
        mnj mnjVar = qbsVar.b;
        long j4 = ybsVar.b;
        mn0 mn0Var = ybsVar.a;
        int i2 = rds.c;
        long P = y5g.P(mnjVar.d((int) (j4 >> 32)), qbsVar.b.d((int) (j4 & 4294967295L)));
        int b = d.b(j, false);
        int i3 = (z2 || z) ? b : (int) (P >> 32);
        int i4 = (!z2 || z) ? b : (int) (P & 4294967295L);
        xlq xlqVar = qbsVar.v;
        int i5 = (z || xlqVar == null || (i = qbsVar.t) == -1) ? -1 : i;
        cds cdsVar = d.a;
        if (z) {
            j3 = j4;
            j2 = 4294967295L;
            ydpVar = null;
        } else {
            j2 = 4294967295L;
            int i6 = (int) (P >> 32);
            j3 = j4;
            xdp xdpVar = new xdp(ldg.w(cdsVar, i6), i6, 1L);
            int i7 = (int) (P & 4294967295L);
            ydpVar = new ydp(xdpVar, new xdp(ldg.w(cdsVar, i7), i7, 1L), rds.f(P));
        }
        xlq xlqVar2 = new xlq(z2, 1, 1, ydpVar, new idp(1L, 1, i3, i4, i5, cdsVar));
        if (!xlqVar2.l(xlqVar)) {
            return j3;
        }
        qbsVar.v = xlqVar2;
        qbsVar.t = b;
        ydp a = zdpVar.a(xlqVar2);
        long P2 = y5g.P(qbsVar.b.c(a.a.b), qbsVar.b.c(a.b.b));
        long j5 = j3;
        if (rds.a(P2, j5)) {
            return j5;
        }
        boolean z6 = rds.f(P2) != rds.f(j5) && rds.a(y5g.P((int) (P2 & j2), (int) (P2 >> 32)), j5);
        boolean z7 = rds.b(P2) && rds.b(j5);
        if (z3 && mn0Var.b.length() > 0 && !z6 && !z7 && (msdVar = qbsVar.k) != null) {
            msdVar.a(9);
        }
        qbsVar.c.invoke(c(mn0Var, P2));
        if (!z3) {
            qbsVar.q(!rds.b(P2));
        }
        axf axfVar2 = qbsVar.d;
        if (axfVar2 != null) {
            axfVar2.q.setValue(Boolean.valueOf(z3));
        }
        axf axfVar3 = qbsVar.d;
        if (axfVar3 != null) {
            axfVar3.m.setValue(Boolean.valueOf(!rds.b(P2) && a0g.B(qbsVar, true)));
        }
        axf axfVar4 = qbsVar.d;
        if (axfVar4 == null) {
            z4 = false;
        } else {
            if (rds.b(P2)) {
                z4 = false;
            } else {
                z4 = false;
                if (a0g.B(qbsVar, false)) {
                    z5 = true;
                    axfVar4.n.setValue(Boolean.valueOf(z5));
                }
            }
            z5 = z4;
            axfVar4.n.setValue(Boolean.valueOf(z5));
        }
        axf axfVar5 = qbsVar.d;
        if (axfVar5 == null) {
            return P2;
        }
        axfVar5.o.setValue(Boolean.valueOf((rds.b(P2) && a0g.B(qbsVar, true)) ? true : z4));
        return P2;
    }

    public static ybs c(mn0 mn0Var, long j) {
        return new ybs(mn0Var, j, (rds) null);
    }

    public final rar b(boolean z) {
        mm6 mm6Var = this.i;
        Continuation continuation = null;
        if (mm6Var != null) {
            return x97.y(mm6Var, null, pm6.d, new z11(this, z, continuation, 21), 1);
        }
        return null;
    }

    public final void d() {
        mm6 mm6Var = this.i;
        if (mm6Var != null) {
            x97.y(mm6Var, null, pm6.d, new nbs(this, null, 0), 1);
        }
    }

    public final void e(enj enjVar) {
        if (!rds.b(k().b)) {
            axf axfVar = this.d;
            dds d = axfVar != null ? axfVar.d() : null;
            int d2 = (enjVar == null || d == null) ? rds.d(k().b) : this.b.c(d.b(enjVar.a, true));
            this.c.invoke(ybs.a(k(), null, y5g.P(d2, d2), 5));
        }
        o((enjVar == null || k().a.b.length() <= 0) ? zrd.a : zrd.c);
        q(false);
    }

    public final void f(boolean z) {
        yoc yocVar;
        axf axfVar = this.d;
        if (axfVar != null && !axfVar.b() && (yocVar = this.l) != null) {
            yoc.b(yocVar);
        }
        this.u = k();
        q(z);
        o(zrd.b);
    }

    public final enj g() {
        return (enj) this.s.getValue();
    }

    public final boolean h() {
        return ((Boolean) this.m.getValue()).booleanValue();
    }

    public final boolean i() {
        return ((Boolean) this.n.getValue()).booleanValue();
    }

    public final long j(boolean z) {
        dds d;
        long j;
        axf axfVar = this.d;
        if (axfVar == null || (d = axfVar.d()) == null) {
            return 9205357640488583168L;
        }
        cds cdsVar = d.a;
        axf axfVar2 = this.d;
        mn0 mn0Var = axfVar2 != null ? axfVar2.a.a : null;
        if (mn0Var == null) {
            return 9205357640488583168L;
        }
        if (!Intrinsics.d(mn0Var.b, cdsVar.a.a.b)) {
            return 9205357640488583168L;
        }
        ybs k = k();
        if (z) {
            long j2 = k.b;
            int i = rds.c;
            j = j2 >> 32;
        } else {
            long j3 = k.b;
            int i2 = rds.c;
            j = j3 & 4294967295L;
        }
        return p6g.y(cdsVar, this.b.d((int) j), z, rds.f(k().b));
    }

    public final ybs k() {
        return (ybs) this.e.getValue();
    }

    public final void l() {
        hes hesVar = this.j;
        if ((hesVar != null ? ((zi0) hesVar).d : null) != ies.a || hesVar == null) {
            return;
        }
        zi0 zi0Var = (zi0) hesVar;
        zi0Var.d = ies.b;
        ActionMode actionMode = zi0Var.b;
        if (actionMode != null) {
            actionMode.finish();
        }
        zi0Var.b = null;
    }

    public final void m() {
        mm6 mm6Var = this.i;
        if (mm6Var != null) {
            x97.y(mm6Var, null, pm6.d, new nbs(this, null, 1), 1);
        }
    }

    public final void n() {
        ybs c = c(k().a, y5g.P(0, k().a.b.length()));
        this.c.invoke(c);
        this.u = ybs.a(this.u, null, c.b, 5);
        f(true);
    }

    public final void o(zrd zrdVar) {
        axf axfVar = this.d;
        if (axfVar != null) {
            if (axfVar.a() == zrdVar) {
                axfVar = null;
            }
            if (axfVar != null) {
                axfVar.k.setValue(zrdVar);
            }
        }
    }

    public final void p() {
        mm6 mm6Var = this.i;
        if (mm6Var != null) {
            x97.y(mm6Var, null, pm6.d, new fpq(this, (Continuation) null, 19), 1);
        }
    }

    public final void q(boolean z) {
        axf axfVar = this.d;
        if (axfVar != null) {
            axfVar.l.setValue(Boolean.valueOf(z));
        }
        if (z) {
            p();
        } else {
            l();
        }
    }
}
