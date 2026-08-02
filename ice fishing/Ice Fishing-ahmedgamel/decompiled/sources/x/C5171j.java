package x;

import java.util.Iterator;
import w.C5126a;
import w.C5130e;

/* renamed from: x.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5171j extends AbstractC5177p {
    @Override // x.InterfaceC5165d
    public final void a(InterfaceC5165d interfaceC5165d) {
        C5126a c5126a = (C5126a) this.f41797b;
        int i = c5126a.f41230s0;
        C5167f c5167f = this.f41803h;
        Iterator it = c5167f.f41782l.iterator();
        int i4 = 0;
        int i6 = -1;
        while (it.hasNext()) {
            int i9 = ((C5167f) it.next()).f41778g;
            if (i6 == -1 || i9 < i6) {
                i6 = i9;
            }
            if (i4 < i9) {
                i4 = i9;
            }
        }
        if (i == 0 || i == 2) {
            c5167f.d(i6 + c5126a.f41232u0);
        } else {
            c5167f.d(i4 + c5126a.f41232u0);
        }
    }

    @Override // x.AbstractC5177p
    public final void d() {
        C5130e c5130e = this.f41797b;
        if (c5130e instanceof C5126a) {
            C5167f c5167f = this.f41803h;
            c5167f.f41773b = true;
            C5126a c5126a = (C5126a) c5130e;
            int i = c5126a.f41230s0;
            boolean z6 = c5126a.f41231t0;
            int i4 = 0;
            if (i == 0) {
                c5167f.f41776e = 4;
                while (i4 < c5126a.f41402r0) {
                    C5130e c5130e2 = c5126a.f41401q0[i4];
                    if (z6 || c5130e2.f41295g0 != 8) {
                        C5167f c5167f2 = c5130e2.f41288d.f41803h;
                        c5167f2.f41781k.add(c5167f);
                        c5167f.f41782l.add(c5167f2);
                    }
                    i4++;
                }
                m(this.f41797b.f41288d.f41803h);
                m(this.f41797b.f41288d.i);
                return;
            }
            if (i == 1) {
                c5167f.f41776e = 5;
                while (i4 < c5126a.f41402r0) {
                    C5130e c5130e3 = c5126a.f41401q0[i4];
                    if (z6 || c5130e3.f41295g0 != 8) {
                        C5167f c5167f3 = c5130e3.f41288d.i;
                        c5167f3.f41781k.add(c5167f);
                        c5167f.f41782l.add(c5167f3);
                    }
                    i4++;
                }
                m(this.f41797b.f41288d.f41803h);
                m(this.f41797b.f41288d.i);
                return;
            }
            if (i == 2) {
                c5167f.f41776e = 6;
                while (i4 < c5126a.f41402r0) {
                    C5130e c5130e4 = c5126a.f41401q0[i4];
                    if (z6 || c5130e4.f41295g0 != 8) {
                        C5167f c5167f4 = c5130e4.f41290e.f41803h;
                        c5167f4.f41781k.add(c5167f);
                        c5167f.f41782l.add(c5167f4);
                    }
                    i4++;
                }
                m(this.f41797b.f41290e.f41803h);
                m(this.f41797b.f41290e.i);
                return;
            }
            if (i != 3) {
                return;
            }
            c5167f.f41776e = 7;
            while (i4 < c5126a.f41402r0) {
                C5130e c5130e5 = c5126a.f41401q0[i4];
                if (z6 || c5130e5.f41295g0 != 8) {
                    C5167f c5167f5 = c5130e5.f41290e.i;
                    c5167f5.f41781k.add(c5167f);
                    c5167f.f41782l.add(c5167f5);
                }
                i4++;
            }
            m(this.f41797b.f41290e.f41803h);
            m(this.f41797b.f41290e.i);
        }
    }

    @Override // x.AbstractC5177p
    public final void e() {
        C5130e c5130e = this.f41797b;
        if (c5130e instanceof C5126a) {
            int i = ((C5126a) c5130e).f41230s0;
            C5167f c5167f = this.f41803h;
            if (i == 0 || i == 1) {
                c5130e.Y = c5167f.f41778g;
            } else {
                c5130e.f41281Z = c5167f.f41778g;
            }
        }
    }

    @Override // x.AbstractC5177p
    public final void f() {
        this.f41798c = null;
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
