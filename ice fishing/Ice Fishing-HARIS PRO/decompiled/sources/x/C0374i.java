package x;

/* renamed from: x.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0374i extends o {
    @Override // x.InterfaceC0369d
    public final void a(InterfaceC0369d interfaceC0369d) {
        C0371f c0371f = this.f4712h;
        if (c0371f.f4687c && !c0371f.j) {
            c0371f.d((int) ((((C0371f) c0371f.f4693l.get(0)).f4690g * ((w.h) this.f4707b).f4653q0) + 0.5f));
        }
    }

    @Override // x.o
    public final void d() {
        w.d dVar = this.f4707b;
        w.h hVar = (w.h) dVar;
        int i = hVar.f4654r0;
        int i2 = hVar.s0;
        int i3 = hVar.f4656u0;
        C0371f c0371f = this.f4712h;
        if (i3 == 1) {
            if (i != -1) {
                c0371f.f4693l.add(dVar.f4540T.f4553d.f4712h);
                this.f4707b.f4540T.f4553d.f4712h.f4692k.add(c0371f);
                c0371f.f4689f = i;
            } else if (i2 != -1) {
                c0371f.f4693l.add(dVar.f4540T.f4553d.i);
                this.f4707b.f4540T.f4553d.i.f4692k.add(c0371f);
                c0371f.f4689f = -i2;
            } else {
                c0371f.f4686b = true;
                c0371f.f4693l.add(dVar.f4540T.f4553d.i);
                this.f4707b.f4540T.f4553d.i.f4692k.add(c0371f);
            }
            m(this.f4707b.f4553d.f4712h);
            m(this.f4707b.f4553d.i);
            return;
        }
        if (i != -1) {
            c0371f.f4693l.add(dVar.f4540T.e.f4712h);
            this.f4707b.f4540T.e.f4712h.f4692k.add(c0371f);
            c0371f.f4689f = i;
        } else if (i2 != -1) {
            c0371f.f4693l.add(dVar.f4540T.e.i);
            this.f4707b.f4540T.e.i.f4692k.add(c0371f);
            c0371f.f4689f = -i2;
        } else {
            c0371f.f4686b = true;
            c0371f.f4693l.add(dVar.f4540T.e.i);
            this.f4707b.f4540T.e.i.f4692k.add(c0371f);
        }
        m(this.f4707b.e.f4712h);
        m(this.f4707b.e.i);
    }

    @Override // x.o
    public final void e() {
        w.d dVar = this.f4707b;
        int i = ((w.h) dVar).f4656u0;
        C0371f c0371f = this.f4712h;
        if (i == 1) {
            dVar.f4545Y = c0371f.f4690g;
        } else {
            dVar.f4546Z = c0371f.f4690g;
        }
    }

    @Override // x.o
    public final void f() {
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
