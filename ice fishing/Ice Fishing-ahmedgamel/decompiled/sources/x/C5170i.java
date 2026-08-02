package x;

import w.C5130e;

/* renamed from: x.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5170i extends AbstractC5177p {
    @Override // x.InterfaceC5165d
    public final void a(InterfaceC5165d interfaceC5165d) {
        C5167f c5167f = this.f41803h;
        if (c5167f.f41774c && !c5167f.f41780j) {
            c5167f.d((int) ((((C5167f) c5167f.f41782l.get(0)).f41778g * ((w.i) this.f41797b).f41395q0) + 0.5f));
        }
    }

    @Override // x.AbstractC5177p
    public final void d() {
        C5130e c5130e = this.f41797b;
        w.i iVar = (w.i) c5130e;
        int i = iVar.f41396r0;
        int i4 = iVar.f41397s0;
        int i6 = iVar.f41399u0;
        C5167f c5167f = this.f41803h;
        if (i6 == 1) {
            if (i != -1) {
                c5167f.f41782l.add(c5130e.f41276T.f41288d.f41803h);
                this.f41797b.f41276T.f41288d.f41803h.f41781k.add(c5167f);
                c5167f.f41777f = i;
            } else if (i4 != -1) {
                c5167f.f41782l.add(c5130e.f41276T.f41288d.i);
                this.f41797b.f41276T.f41288d.i.f41781k.add(c5167f);
                c5167f.f41777f = -i4;
            } else {
                c5167f.f41773b = true;
                c5167f.f41782l.add(c5130e.f41276T.f41288d.i);
                this.f41797b.f41276T.f41288d.i.f41781k.add(c5167f);
            }
            m(this.f41797b.f41288d.f41803h);
            m(this.f41797b.f41288d.i);
            return;
        }
        if (i != -1) {
            c5167f.f41782l.add(c5130e.f41276T.f41290e.f41803h);
            this.f41797b.f41276T.f41290e.f41803h.f41781k.add(c5167f);
            c5167f.f41777f = i;
        } else if (i4 != -1) {
            c5167f.f41782l.add(c5130e.f41276T.f41290e.i);
            this.f41797b.f41276T.f41290e.i.f41781k.add(c5167f);
            c5167f.f41777f = -i4;
        } else {
            c5167f.f41773b = true;
            c5167f.f41782l.add(c5130e.f41276T.f41290e.i);
            this.f41797b.f41276T.f41290e.i.f41781k.add(c5167f);
        }
        m(this.f41797b.f41290e.f41803h);
        m(this.f41797b.f41290e.i);
    }

    @Override // x.AbstractC5177p
    public final void e() {
        C5130e c5130e = this.f41797b;
        int i = ((w.i) c5130e).f41399u0;
        C5167f c5167f = this.f41803h;
        if (i == 1) {
            c5130e.Y = c5167f.f41778g;
        } else {
            c5130e.f41281Z = c5167f.f41778g;
        }
    }

    @Override // x.AbstractC5177p
    public final void f() {
        this.f41803h.c();
    }

    @Override // x.AbstractC5177p
    public final boolean k() {
        return false;
    }

    public final void m(C5167f c5167f) {
        C5167f c5167f2 = this.f41803h;
        c5167f2.f41781k.add(c5167f);
        c5167f.f41782l.add(c5167f2);
    }
}
