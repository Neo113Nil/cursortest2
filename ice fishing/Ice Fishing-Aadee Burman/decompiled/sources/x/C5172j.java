package x;

import java.util.Iterator;
import w.C5136a;
import w.C5139d;

/* renamed from: x.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5172j extends AbstractC5178p {
    @Override // x.InterfaceC5166d
    public final void a(InterfaceC5166d interfaceC5166d) {
        C5136a c5136a = (C5136a) this.f41739b;
        int i = c5136a.f41448s0;
        C5168f c5168f = this.f41745h;
        Iterator it = c5168f.f41724l.iterator();
        int i6 = 0;
        int i9 = -1;
        while (it.hasNext()) {
            int i10 = ((C5168f) it.next()).f41720g;
            if (i9 == -1 || i10 < i9) {
                i9 = i10;
            }
            if (i6 < i10) {
                i6 = i10;
            }
        }
        if (i == 0 || i == 2) {
            c5168f.d(i9 + c5136a.f41450u0);
        } else {
            c5168f.d(i6 + c5136a.f41450u0);
        }
    }

    @Override // x.AbstractC5178p
    public final void d() {
        C5139d c5139d = this.f41739b;
        if (c5139d instanceof C5136a) {
            C5168f c5168f = this.f41745h;
            c5168f.f41715b = true;
            C5136a c5136a = (C5136a) c5139d;
            int i = c5136a.f41448s0;
            boolean z3 = c5136a.f41449t0;
            int i6 = 0;
            if (i == 0) {
                c5168f.f41718e = 4;
                while (i6 < c5136a.f41620r0) {
                    C5139d c5139d2 = c5136a.f41619q0[i6];
                    if (z3 || c5139d2.f41513g0 != 8) {
                        C5168f c5168f2 = c5139d2.f41506d.f41745h;
                        c5168f2.f41723k.add(c5168f);
                        c5168f.f41724l.add(c5168f2);
                    }
                    i6++;
                }
                m(this.f41739b.f41506d.f41745h);
                m(this.f41739b.f41506d.i);
                return;
            }
            if (i == 1) {
                c5168f.f41718e = 5;
                while (i6 < c5136a.f41620r0) {
                    C5139d c5139d3 = c5136a.f41619q0[i6];
                    if (z3 || c5139d3.f41513g0 != 8) {
                        C5168f c5168f3 = c5139d3.f41506d.i;
                        c5168f3.f41723k.add(c5168f);
                        c5168f.f41724l.add(c5168f3);
                    }
                    i6++;
                }
                m(this.f41739b.f41506d.f41745h);
                m(this.f41739b.f41506d.i);
                return;
            }
            if (i == 2) {
                c5168f.f41718e = 6;
                while (i6 < c5136a.f41620r0) {
                    C5139d c5139d4 = c5136a.f41619q0[i6];
                    if (z3 || c5139d4.f41513g0 != 8) {
                        C5168f c5168f4 = c5139d4.f41508e.f41745h;
                        c5168f4.f41723k.add(c5168f);
                        c5168f.f41724l.add(c5168f4);
                    }
                    i6++;
                }
                m(this.f41739b.f41508e.f41745h);
                m(this.f41739b.f41508e.i);
                return;
            }
            if (i != 3) {
                return;
            }
            c5168f.f41718e = 7;
            while (i6 < c5136a.f41620r0) {
                C5139d c5139d5 = c5136a.f41619q0[i6];
                if (z3 || c5139d5.f41513g0 != 8) {
                    C5168f c5168f5 = c5139d5.f41508e.i;
                    c5168f5.f41723k.add(c5168f);
                    c5168f.f41724l.add(c5168f5);
                }
                i6++;
            }
            m(this.f41739b.f41508e.f41745h);
            m(this.f41739b.f41508e.i);
        }
    }

    @Override // x.AbstractC5178p
    public final void e() {
        C5139d c5139d = this.f41739b;
        if (c5139d instanceof C5136a) {
            int i = ((C5136a) c5139d).f41448s0;
            C5168f c5168f = this.f41745h;
            if (i == 0 || i == 1) {
                c5139d.Y = c5168f.f41720g;
            } else {
                c5139d.f41499Z = c5168f.f41720g;
            }
        }
    }

    @Override // x.AbstractC5178p
    public final void f() {
        this.f41740c = null;
        this.f41745h.c();
    }

    @Override // x.AbstractC5178p
    public final boolean k() {
        return false;
    }

    public final void m(C5168f c5168f) {
        C5168f c5168f2 = this.f41745h;
        c5168f2.f41723k.add(c5168f);
        c5168f.f41724l.add(c5168f2);
    }
}
