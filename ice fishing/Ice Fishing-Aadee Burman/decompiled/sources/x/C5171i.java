package x;

import w.C5139d;

/* renamed from: x.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5171i extends AbstractC5178p {
    @Override // x.InterfaceC5166d
    public final void a(InterfaceC5166d interfaceC5166d) {
        C5168f c5168f = this.f41745h;
        if (c5168f.f41716c && !c5168f.f41722j) {
            c5168f.d((int) ((((C5168f) c5168f.f41724l.get(0)).f41720g * ((w.h) this.f41739b).f41613q0) + 0.5f));
        }
    }

    @Override // x.AbstractC5178p
    public final void d() {
        C5139d c5139d = this.f41739b;
        w.h hVar = (w.h) c5139d;
        int i = hVar.f41614r0;
        int i6 = hVar.f41615s0;
        int i9 = hVar.f41617u0;
        C5168f c5168f = this.f41745h;
        if (i9 == 1) {
            if (i != -1) {
                c5168f.f41724l.add(c5139d.f41494T.f41506d.f41745h);
                this.f41739b.f41494T.f41506d.f41745h.f41723k.add(c5168f);
                c5168f.f41719f = i;
            } else if (i6 != -1) {
                c5168f.f41724l.add(c5139d.f41494T.f41506d.i);
                this.f41739b.f41494T.f41506d.i.f41723k.add(c5168f);
                c5168f.f41719f = -i6;
            } else {
                c5168f.f41715b = true;
                c5168f.f41724l.add(c5139d.f41494T.f41506d.i);
                this.f41739b.f41494T.f41506d.i.f41723k.add(c5168f);
            }
            m(this.f41739b.f41506d.f41745h);
            m(this.f41739b.f41506d.i);
            return;
        }
        if (i != -1) {
            c5168f.f41724l.add(c5139d.f41494T.f41508e.f41745h);
            this.f41739b.f41494T.f41508e.f41745h.f41723k.add(c5168f);
            c5168f.f41719f = i;
        } else if (i6 != -1) {
            c5168f.f41724l.add(c5139d.f41494T.f41508e.i);
            this.f41739b.f41494T.f41508e.i.f41723k.add(c5168f);
            c5168f.f41719f = -i6;
        } else {
            c5168f.f41715b = true;
            c5168f.f41724l.add(c5139d.f41494T.f41508e.i);
            this.f41739b.f41494T.f41508e.i.f41723k.add(c5168f);
        }
        m(this.f41739b.f41508e.f41745h);
        m(this.f41739b.f41508e.i);
    }

    @Override // x.AbstractC5178p
    public final void e() {
        C5139d c5139d = this.f41739b;
        int i = ((w.h) c5139d).f41617u0;
        C5168f c5168f = this.f41745h;
        if (i == 1) {
            c5139d.Y = c5168f.f41720g;
        } else {
            c5139d.f41499Z = c5168f.f41720g;
        }
    }

    @Override // x.AbstractC5178p
    public final void f() {
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
