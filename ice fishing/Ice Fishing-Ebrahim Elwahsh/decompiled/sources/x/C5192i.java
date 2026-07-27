package x;

import w.C5144d;

/* renamed from: x.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5192i extends AbstractC5199p {
    @Override // x.InterfaceC5187d
    public final void a(InterfaceC5187d interfaceC5187d) {
        C5189f c5189f = this.f41764h;
        if (c5189f.f41735c && !c5189f.f41741j) {
            c5189f.d((int) ((((C5189f) c5189f.f41743l.get(0)).f41739g * ((w.h) this.f41758b).f41551q0) + 0.5f));
        }
    }

    @Override // x.AbstractC5199p
    public final void d() {
        C5144d c5144d = this.f41758b;
        w.h hVar = (w.h) c5144d;
        int i = hVar.f41552r0;
        int i4 = hVar.f41553s0;
        int i9 = hVar.f41555u0;
        C5189f c5189f = this.f41764h;
        if (i9 == 1) {
            if (i != -1) {
                c5189f.f41743l.add(c5144d.f41432T.f41444d.f41764h);
                this.f41758b.f41432T.f41444d.f41764h.f41742k.add(c5189f);
                c5189f.f41738f = i;
            } else if (i4 != -1) {
                c5189f.f41743l.add(c5144d.f41432T.f41444d.i);
                this.f41758b.f41432T.f41444d.i.f41742k.add(c5189f);
                c5189f.f41738f = -i4;
            } else {
                c5189f.f41734b = true;
                c5189f.f41743l.add(c5144d.f41432T.f41444d.i);
                this.f41758b.f41432T.f41444d.i.f41742k.add(c5189f);
            }
            m(this.f41758b.f41444d.f41764h);
            m(this.f41758b.f41444d.i);
            return;
        }
        if (i != -1) {
            c5189f.f41743l.add(c5144d.f41432T.f41446e.f41764h);
            this.f41758b.f41432T.f41446e.f41764h.f41742k.add(c5189f);
            c5189f.f41738f = i;
        } else if (i4 != -1) {
            c5189f.f41743l.add(c5144d.f41432T.f41446e.i);
            this.f41758b.f41432T.f41446e.i.f41742k.add(c5189f);
            c5189f.f41738f = -i4;
        } else {
            c5189f.f41734b = true;
            c5189f.f41743l.add(c5144d.f41432T.f41446e.i);
            this.f41758b.f41432T.f41446e.i.f41742k.add(c5189f);
        }
        m(this.f41758b.f41446e.f41764h);
        m(this.f41758b.f41446e.i);
    }

    @Override // x.AbstractC5199p
    public final void e() {
        C5144d c5144d = this.f41758b;
        int i = ((w.h) c5144d).f41555u0;
        C5189f c5189f = this.f41764h;
        if (i == 1) {
            c5144d.Y = c5189f.f41739g;
        } else {
            c5144d.f41437Z = c5189f.f41739g;
        }
    }

    @Override // x.AbstractC5199p
    public final void f() {
        this.f41764h.c();
    }

    @Override // x.AbstractC5199p
    public final boolean k() {
        return false;
    }

    public final void m(C5189f c5189f) {
        C5189f c5189f2 = this.f41764h;
        c5189f2.f41742k.add(c5189f);
        c5189f.f41743l.add(c5189f2);
    }
}
