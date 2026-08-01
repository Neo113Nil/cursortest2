package x;

import java.util.Iterator;
import w.C0363a;

/* renamed from: x.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0375j extends o {
    @Override // x.InterfaceC0369d
    public final void a(InterfaceC0369d interfaceC0369d) {
        C0363a c0363a = (C0363a) this.f4707b;
        int i = c0363a.s0;
        C0371f c0371f = this.f4712h;
        Iterator it = c0371f.f4693l.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((C0371f) it.next()).f4690g;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            c0371f.d(i3 + c0363a.f4499u0);
        } else {
            c0371f.d(i2 + c0363a.f4499u0);
        }
    }

    @Override // x.o
    public final void d() {
        w.d dVar = this.f4707b;
        if (dVar instanceof C0363a) {
            C0371f c0371f = this.f4712h;
            c0371f.f4686b = true;
            C0363a c0363a = (C0363a) dVar;
            int i = c0363a.s0;
            boolean z2 = c0363a.f4498t0;
            int i2 = 0;
            if (i == 0) {
                c0371f.e = 4;
                while (i2 < c0363a.f4659r0) {
                    w.d dVar2 = c0363a.f4658q0[i2];
                    if (z2 || dVar2.f4559g0 != 8) {
                        C0371f c0371f2 = dVar2.f4553d.f4712h;
                        c0371f2.f4692k.add(c0371f);
                        c0371f.f4693l.add(c0371f2);
                    }
                    i2++;
                }
                m(this.f4707b.f4553d.f4712h);
                m(this.f4707b.f4553d.i);
                return;
            }
            if (i == 1) {
                c0371f.e = 5;
                while (i2 < c0363a.f4659r0) {
                    w.d dVar3 = c0363a.f4658q0[i2];
                    if (z2 || dVar3.f4559g0 != 8) {
                        C0371f c0371f3 = dVar3.f4553d.i;
                        c0371f3.f4692k.add(c0371f);
                        c0371f.f4693l.add(c0371f3);
                    }
                    i2++;
                }
                m(this.f4707b.f4553d.f4712h);
                m(this.f4707b.f4553d.i);
                return;
            }
            if (i == 2) {
                c0371f.e = 6;
                while (i2 < c0363a.f4659r0) {
                    w.d dVar4 = c0363a.f4658q0[i2];
                    if (z2 || dVar4.f4559g0 != 8) {
                        C0371f c0371f4 = dVar4.e.f4712h;
                        c0371f4.f4692k.add(c0371f);
                        c0371f.f4693l.add(c0371f4);
                    }
                    i2++;
                }
                m(this.f4707b.e.f4712h);
                m(this.f4707b.e.i);
                return;
            }
            if (i != 3) {
                return;
            }
            c0371f.e = 7;
            while (i2 < c0363a.f4659r0) {
                w.d dVar5 = c0363a.f4658q0[i2];
                if (z2 || dVar5.f4559g0 != 8) {
                    C0371f c0371f5 = dVar5.e.i;
                    c0371f5.f4692k.add(c0371f);
                    c0371f.f4693l.add(c0371f5);
                }
                i2++;
            }
            m(this.f4707b.e.f4712h);
            m(this.f4707b.e.i);
        }
    }

    @Override // x.o
    public final void e() {
        w.d dVar = this.f4707b;
        if (dVar instanceof C0363a) {
            int i = ((C0363a) dVar).s0;
            C0371f c0371f = this.f4712h;
            if (i == 0 || i == 1) {
                dVar.f4545Y = c0371f.f4690g;
            } else {
                dVar.f4546Z = c0371f.f4690g;
            }
        }
    }

    @Override // x.o
    public final void f() {
        this.f4708c = null;
        this.f4712h.c();
    }

    @Override // x.o
    public final boolean k() {
        return false;
    }

    public final void m(C0371f c0371f) {
        C0371f c0371f2 = this.f4712h;
        c0371f2.f4692k.add(c0371f);
        c0371f.f4693l.add(c0371f2);
    }
}
