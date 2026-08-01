package x;

import java.util.Iterator;
import w.C5136a;
import w.C5139d;

/* renamed from: x.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5172j extends AbstractC5178p {
    @Override // x.InterfaceC5166d
    public final void a(InterfaceC5166d interfaceC5166d) {
        C5136a c5136a = (C5136a) this.f41742b;
        int i = c5136a.f41451s0;
        C5168f c5168f = this.f41748h;
        Iterator it = c5168f.f41727l.iterator();
        int i6 = 0;
        int i9 = -1;
        while (it.hasNext()) {
            int i10 = ((C5168f) it.next()).f41723g;
            if (i9 == -1 || i10 < i9) {
                i9 = i10;
            }
            if (i6 < i10) {
                i6 = i10;
            }
        }
        if (i == 0 || i == 2) {
            c5168f.d(i9 + c5136a.f41453u0);
        } else {
            c5168f.d(i6 + c5136a.f41453u0);
        }
    }

    @Override // x.AbstractC5178p
    public final void d() {
        C5139d c5139d = this.f41742b;
        if (c5139d instanceof C5136a) {
            C5168f c5168f = this.f41748h;
            c5168f.f41718b = true;
            C5136a c5136a = (C5136a) c5139d;
            int i = c5136a.f41451s0;
            boolean z3 = c5136a.f41452t0;
            int i6 = 0;
            if (i == 0) {
                c5168f.f41721e = 4;
                while (i6 < c5136a.f41623r0) {
                    C5139d c5139d2 = c5136a.f41622q0[i6];
                    if (z3 || c5139d2.f41516g0 != 8) {
                        C5168f c5168f2 = c5139d2.f41509d.f41748h;
                        c5168f2.f41726k.add(c5168f);
                        c5168f.f41727l.add(c5168f2);
                    }
                    i6++;
                }
                m(this.f41742b.f41509d.f41748h);
                m(this.f41742b.f41509d.i);
                return;
            }
            if (i == 1) {
                c5168f.f41721e = 5;
                while (i6 < c5136a.f41623r0) {
                    C5139d c5139d3 = c5136a.f41622q0[i6];
                    if (z3 || c5139d3.f41516g0 != 8) {
                        C5168f c5168f3 = c5139d3.f41509d.i;
                        c5168f3.f41726k.add(c5168f);
                        c5168f.f41727l.add(c5168f3);
                    }
                    i6++;
                }
                m(this.f41742b.f41509d.f41748h);
                m(this.f41742b.f41509d.i);
                return;
            }
            if (i == 2) {
                c5168f.f41721e = 6;
                while (i6 < c5136a.f41623r0) {
                    C5139d c5139d4 = c5136a.f41622q0[i6];
                    if (z3 || c5139d4.f41516g0 != 8) {
                        C5168f c5168f4 = c5139d4.f41511e.f41748h;
                        c5168f4.f41726k.add(c5168f);
                        c5168f.f41727l.add(c5168f4);
                    }
                    i6++;
                }
                m(this.f41742b.f41511e.f41748h);
                m(this.f41742b.f41511e.i);
                return;
            }
            if (i != 3) {
                return;
            }
            c5168f.f41721e = 7;
            while (i6 < c5136a.f41623r0) {
                C5139d c5139d5 = c5136a.f41622q0[i6];
                if (z3 || c5139d5.f41516g0 != 8) {
                    C5168f c5168f5 = c5139d5.f41511e.i;
                    c5168f5.f41726k.add(c5168f);
                    c5168f.f41727l.add(c5168f5);
                }
                i6++;
            }
            m(this.f41742b.f41511e.f41748h);
            m(this.f41742b.f41511e.i);
        }
    }

    @Override // x.AbstractC5178p
    public final void e() {
        C5139d c5139d = this.f41742b;
        if (c5139d instanceof C5136a) {
            int i = ((C5136a) c5139d).f41451s0;
            C5168f c5168f = this.f41748h;
            if (i == 0 || i == 1) {
                c5139d.Y = c5168f.f41723g;
            } else {
                c5139d.f41502Z = c5168f.f41723g;
            }
        }
    }

    @Override // x.AbstractC5178p
    public final void f() {
        this.f41743c = null;
        this.f41748h.c();
    }

    @Override // x.AbstractC5178p
    public final boolean k() {
        return false;
    }

    public final void m(C5168f c5168f) {
        C5168f c5168f2 = this.f41748h;
        c5168f2.f41726k.add(c5168f);
        c5168f.f41727l.add(c5168f2);
    }
}
