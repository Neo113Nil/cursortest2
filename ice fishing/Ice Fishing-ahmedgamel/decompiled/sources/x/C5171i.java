package x;

import w.C5139d;

/* renamed from: x.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5171i extends AbstractC5178p {
    @Override // x.InterfaceC5166d
    public final void a(InterfaceC5166d interfaceC5166d) {
        C5168f c5168f = this.f41748h;
        if (c5168f.f41719c && !c5168f.f41725j) {
            c5168f.d((int) ((((C5168f) c5168f.f41727l.get(0)).f41723g * ((w.h) this.f41742b).f41616q0) + 0.5f));
        }
    }

    @Override // x.AbstractC5178p
    public final void d() {
        C5139d c5139d = this.f41742b;
        w.h hVar = (w.h) c5139d;
        int i = hVar.f41617r0;
        int i6 = hVar.f41618s0;
        int i9 = hVar.f41620u0;
        C5168f c5168f = this.f41748h;
        if (i9 == 1) {
            if (i != -1) {
                c5168f.f41727l.add(c5139d.f41497T.f41509d.f41748h);
                this.f41742b.f41497T.f41509d.f41748h.f41726k.add(c5168f);
                c5168f.f41722f = i;
            } else if (i6 != -1) {
                c5168f.f41727l.add(c5139d.f41497T.f41509d.i);
                this.f41742b.f41497T.f41509d.i.f41726k.add(c5168f);
                c5168f.f41722f = -i6;
            } else {
                c5168f.f41718b = true;
                c5168f.f41727l.add(c5139d.f41497T.f41509d.i);
                this.f41742b.f41497T.f41509d.i.f41726k.add(c5168f);
            }
            m(this.f41742b.f41509d.f41748h);
            m(this.f41742b.f41509d.i);
            return;
        }
        if (i != -1) {
            c5168f.f41727l.add(c5139d.f41497T.f41511e.f41748h);
            this.f41742b.f41497T.f41511e.f41748h.f41726k.add(c5168f);
            c5168f.f41722f = i;
        } else if (i6 != -1) {
            c5168f.f41727l.add(c5139d.f41497T.f41511e.i);
            this.f41742b.f41497T.f41511e.i.f41726k.add(c5168f);
            c5168f.f41722f = -i6;
        } else {
            c5168f.f41718b = true;
            c5168f.f41727l.add(c5139d.f41497T.f41511e.i);
            this.f41742b.f41497T.f41511e.i.f41726k.add(c5168f);
        }
        m(this.f41742b.f41511e.f41748h);
        m(this.f41742b.f41511e.i);
    }

    @Override // x.AbstractC5178p
    public final void e() {
        C5139d c5139d = this.f41742b;
        int i = ((w.h) c5139d).f41620u0;
        C5168f c5168f = this.f41748h;
        if (i == 1) {
            c5139d.Y = c5168f.f41723g;
        } else {
            c5139d.f41502Z = c5168f.f41723g;
        }
    }

    @Override // x.AbstractC5178p
    public final void f() {
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
