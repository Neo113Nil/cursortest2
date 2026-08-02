package defpackage;

/* loaded from: classes.dex */
public final class wep implements has {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public wep(qbs qbsVar, boolean z) {
        this.c = qbsVar;
        this.b = z;
    }

    @Override // defpackage.has
    public final void a() {
        ydp e;
        wof c;
        dds d;
        switch (this.a) {
            case 0:
                xep xepVar = (xep) this.c;
                boolean z = this.b;
                if ((z ? (enj) xepVar.n.getValue() : (enj) xepVar.o.getValue()) != null && (e = xepVar.e()) != null) {
                    ugi c2 = xepVar.c(z ? e.a : e.b);
                    if (c2 != null && (c = c2.c()) != null) {
                        long a = c2.a(e, z);
                        if ((9223372034707292159L & a) != 9205357640488583168L) {
                            xepVar.q.setValue(new enj(xepVar.j().v(c, pep.a(a))));
                            xepVar.p.setValue(z ? xrd.b : xrd.c);
                            xepVar.n(false);
                            break;
                        }
                    }
                }
                break;
            default:
                qbs qbsVar = (qbs) this.c;
                boolean z2 = this.b;
                qbsVar.r.setValue(z2 ? xrd.b : xrd.c);
                long a2 = pep.a(qbsVar.j(z2));
                axf axfVar = qbsVar.d;
                if (axfVar != null && (d = axfVar.d()) != null) {
                    long e2 = d.e(a2);
                    qbsVar.o = e2;
                    qbsVar.s.setValue(new enj(e2));
                    qbsVar.q = 0L;
                    qbsVar.t = -1;
                    axf axfVar2 = qbsVar.d;
                    if (axfVar2 != null) {
                        axfVar2.q.setValue(Boolean.TRUE);
                    }
                    qbsVar.q(false);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.has
    public final void b(long j) {
        switch (this.a) {
            case 0:
                xep xepVar = (xep) this.c;
                if (xepVar.d() != null) {
                    ydp e = xepVar.e();
                    e.getClass();
                    boolean z = this.b;
                    Object e2 = xepVar.a.c.e((z ? e.a : e.b).c);
                    if (e2 == null) {
                        vme.d("SelectionRegistrar should contain the current selection's selectableIds");
                        rj7.f();
                        break;
                    } else {
                        ugi ugiVar = (ugi) e2;
                        wof c = ugiVar.c();
                        if (c == null) {
                            vme.d("Current selectable should have layout coordinates.");
                            rj7.f();
                            break;
                        } else {
                            long a = ugiVar.a(e, z);
                            if ((9223372034707292159L & a) != 9205357640488583168L) {
                                xepVar.l.setValue(new enj(xepVar.j().v(c, pep.a(a))));
                                xepVar.m.setValue(new enj(0L));
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }

    @Override // defpackage.has
    public final void c() {
        switch (this.a) {
            case 0:
                xep xepVar = (xep) this.c;
                xepVar.n(true);
                xepVar.p.setValue(null);
                xepVar.q.setValue(null);
                break;
            default:
                qbs qbsVar = (qbs) this.c;
                qbsVar.r.setValue(null);
                qbsVar.s.setValue(null);
                qbsVar.q(true);
                break;
        }
    }

    @Override // defpackage.has
    public final void d(long j) {
        switch (this.a) {
            case 0:
                xep xepVar = (xep) this.c;
                x6k x6kVar = xepVar.l;
                x6k x6kVar2 = xepVar.m;
                if (xepVar.d() != null) {
                    x6kVar2.setValue(new enj(enj.h(((enj) x6kVar2.getValue()).a, j)));
                    long h = enj.h(((enj) x6kVar.getValue()).a, ((enj) x6kVar2.getValue()).a);
                    if (xepVar.p(h, ((enj) x6kVar.getValue()).a, this.b, o6c.r)) {
                        x6kVar.setValue(new enj(h));
                        x6kVar2.setValue(new enj(0L));
                        break;
                    }
                }
                break;
            default:
                qbs qbsVar = (qbs) this.c;
                long h2 = enj.h(qbsVar.q, j);
                qbsVar.q = h2;
                qbsVar.s.setValue(new enj(enj.h(qbsVar.o, h2)));
                ybs k = qbsVar.k();
                enj g = qbsVar.g();
                g.getClass();
                qbs.a(qbsVar, k, g.a, false, this.b, o6c.r, true);
                qbsVar.q(false);
                break;
        }
    }

    @Override // defpackage.has
    public final void onCancel() {
        switch (this.a) {
            case 0:
                xep xepVar = (xep) this.c;
                xepVar.n(true);
                xepVar.p.setValue(null);
                xepVar.q.setValue(null);
                break;
        }
    }

    @Override // defpackage.has
    public final void onStop() {
        switch (this.a) {
            case 0:
                xep xepVar = (xep) this.c;
                xepVar.n(true);
                xepVar.p.setValue(null);
                xepVar.q.setValue(null);
                break;
            default:
                qbs qbsVar = (qbs) this.c;
                qbsVar.r.setValue(null);
                qbsVar.s.setValue(null);
                qbsVar.q(true);
                break;
        }
    }

    public wep(boolean z, xep xepVar) {
        this.b = z;
        this.c = xepVar;
    }

    private final void e() {
    }

    private final void f(long j) {
    }
}
