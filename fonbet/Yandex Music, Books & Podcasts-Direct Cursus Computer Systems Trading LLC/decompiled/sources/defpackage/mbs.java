package defpackage;

/* loaded from: classes.dex */
public final class mbs implements has {
    public final /* synthetic */ int a;
    public final /* synthetic */ qbs b;

    public /* synthetic */ mbs(qbs qbsVar, int i) {
        this.a = i;
        this.b = qbsVar;
    }

    @Override // defpackage.has
    public final void a() {
        int i = this.a;
    }

    @Override // defpackage.has
    public final void b(long j) {
        dds d;
        qbs qbsVar;
        long j2;
        dds d2;
        dds d3;
        switch (this.a) {
            case 0:
                qbs qbsVar2 = this.b;
                long a = pep.a(qbsVar2.j(true));
                axf axfVar = qbsVar2.d;
                if (axfVar != null && (d = axfVar.d()) != null) {
                    long e = d.e(a);
                    qbsVar2.o = e;
                    qbsVar2.s.setValue(new enj(e));
                    qbsVar2.q = 0L;
                    qbsVar2.r.setValue(xrd.a);
                    qbsVar2.q(false);
                    break;
                }
                break;
            default:
                qbs qbsVar3 = this.b;
                x6k x6kVar = qbsVar3.r;
                if (qbsVar3.i() && ((xrd) x6kVar.getValue()) == null) {
                    x6kVar.setValue(xrd.c);
                    qbsVar3.t = -1;
                    qbsVar3.l();
                    axf axfVar2 = qbsVar3.d;
                    if (axfVar2 == null || (d3 = axfVar2.d()) == null || !d3.c(j)) {
                        qbsVar = qbsVar3;
                        j2 = j;
                        axf axfVar3 = qbsVar.d;
                        if (axfVar3 != null && (d2 = axfVar3.d()) != null) {
                            int c = qbsVar.b.c(d2.b(j2, true));
                            ybs c2 = qbs.c(qbsVar.k().a, y5g.P(c, c));
                            qbsVar.f(false);
                            msd msdVar = qbsVar.k;
                            if (msdVar != null) {
                                msdVar.a(9);
                            }
                            qbsVar.c.invoke(c2);
                        }
                    } else if (qbsVar3.k().a.b.length() != 0) {
                        qbsVar3.f(false);
                        qbsVar = qbsVar3;
                        j2 = j;
                        qbsVar.p = Integer.valueOf((int) (qbs.a(qbsVar3, ybs.a(qbsVar3.k(), null, rds.b, 5), j, true, false, o6c.p, true) >> 32));
                    }
                    qbsVar.o(zrd.a);
                    qbsVar.o = j2;
                    qbsVar.s.setValue(new enj(j2));
                    qbsVar.q = 0L;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.has
    public final void c() {
        switch (this.a) {
            case 0:
                qbs qbsVar = this.b;
                qbsVar.r.setValue(null);
                qbsVar.s.setValue(null);
                break;
        }
    }

    @Override // defpackage.has
    public final void d(long j) {
        dds d;
        msd msdVar;
        dds d2;
        switch (this.a) {
            case 0:
                qbs qbsVar = this.b;
                qbsVar.q = enj.h(qbsVar.q, j);
                axf axfVar = qbsVar.d;
                if (axfVar != null && (d = axfVar.d()) != null) {
                    qbsVar.s.setValue(new enj(enj.h(qbsVar.o, qbsVar.q)));
                    mnj mnjVar = qbsVar.b;
                    enj g = qbsVar.g();
                    g.getClass();
                    int c = mnjVar.c(d.b(g.a, true));
                    long P = y5g.P(c, c);
                    if (!rds.a(P, qbsVar.k().b)) {
                        axf axfVar2 = qbsVar.d;
                        if ((axfVar2 == null || ((Boolean) axfVar2.q.getValue()).booleanValue()) && (msdVar = qbsVar.k) != null) {
                            msdVar.a(9);
                        }
                        qbsVar.c.invoke(qbs.c(qbsVar.k().a, P));
                        break;
                    }
                }
                break;
            default:
                zdp zdpVar = o6c.p;
                qbs qbsVar2 = this.b;
                if (qbsVar2.i() && qbsVar2.k().a.b.length() != 0) {
                    qbsVar2.q = enj.h(qbsVar2.q, j);
                    axf axfVar3 = qbsVar2.d;
                    if (axfVar3 != null && (d2 = axfVar3.d()) != null) {
                        qbsVar2.s.setValue(new enj(enj.h(qbsVar2.o, qbsVar2.q)));
                        if (qbsVar2.p == null) {
                            enj g2 = qbsVar2.g();
                            g2.getClass();
                            if (!d2.c(g2.a)) {
                                int c2 = qbsVar2.b.c(d2.b(qbsVar2.o, true));
                                mnj mnjVar2 = qbsVar2.b;
                                enj g3 = qbsVar2.g();
                                g3.getClass();
                                if (c2 == mnjVar2.c(d2.b(g3.a, true))) {
                                    zdpVar = o6c.o;
                                }
                                ybs k = qbsVar2.k();
                                enj g4 = qbsVar2.g();
                                g4.getClass();
                                qbs.a(qbsVar2, k, g4.a, false, false, zdpVar, true);
                                int i = rds.c;
                            }
                        }
                        Integer num = qbsVar2.p;
                        int intValue = num != null ? num.intValue() : d2.b(qbsVar2.o, false);
                        enj g5 = qbsVar2.g();
                        g5.getClass();
                        int b = d2.b(g5.a, false);
                        if (qbsVar2.p != null || intValue != b) {
                            ybs k2 = qbsVar2.k();
                            enj g6 = qbsVar2.g();
                            g6.getClass();
                            qbs.a(qbsVar2, k2, g6.a, false, false, zdpVar, true);
                            int i2 = rds.c;
                        }
                    }
                    qbsVar2.q(false);
                    break;
                }
                break;
        }
    }

    public void h() {
        qbs qbsVar = this.b;
        qbsVar.r.setValue(null);
        qbsVar.s.setValue(null);
        qbsVar.q(true);
        qbsVar.p = null;
        boolean b = rds.b(qbsVar.k().b);
        qbsVar.o(b ? zrd.c : zrd.b);
        axf axfVar = qbsVar.d;
        if (axfVar != null) {
            axfVar.m.setValue(Boolean.valueOf(!b && a0g.B(qbsVar, true)));
        }
        axf axfVar2 = qbsVar.d;
        if (axfVar2 != null) {
            axfVar2.n.setValue(Boolean.valueOf(!b && a0g.B(qbsVar, false)));
        }
        axf axfVar3 = qbsVar.d;
        if (axfVar3 == null) {
            return;
        }
        axfVar3.o.setValue(Boolean.valueOf(b && a0g.B(qbsVar, true)));
    }

    @Override // defpackage.has
    public final void onCancel() {
        switch (this.a) {
            case 0:
                break;
            default:
                h();
                break;
        }
    }

    @Override // defpackage.has
    public final void onStop() {
        switch (this.a) {
            case 0:
                qbs qbsVar = this.b;
                qbsVar.r.setValue(null);
                qbsVar.s.setValue(null);
                break;
            default:
                h();
                break;
        }
    }

    private final void e() {
    }

    private final void f() {
    }

    private final void g() {
    }

    private final void i() {
    }
}
