package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

/* renamed from: androidx.datastore.preferences.protobuf.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0111k {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0110j f2416a;

    /* renamed from: b, reason: collision with root package name */
    public int f2417b;

    /* renamed from: c, reason: collision with root package name */
    public int f2418c;

    /* renamed from: d, reason: collision with root package name */
    public int f2419d = 0;

    public C0111k(AbstractC0110j abstractC0110j) {
        Charset charset = AbstractC0124y.f2462a;
        this.f2416a = abstractC0110j;
        abstractC0110j.f2409b = this;
    }

    public final int a() {
        int i2 = this.f2419d;
        if (i2 != 0) {
            this.f2417b = i2;
            this.f2419d = 0;
        } else {
            this.f2417b = this.f2416a.u();
        }
        int i3 = this.f2417b;
        if (i3 == 0 || i3 == this.f2418c) {
            return Integer.MAX_VALUE;
        }
        return i3 >>> 3;
    }

    public final void b(Object obj, W w2, C0115o c0115o) {
        int i2 = this.f2418c;
        this.f2418c = ((this.f2417b >>> 3) << 3) | 4;
        try {
            w2.b(obj, this, c0115o);
            if (this.f2417b == this.f2418c) {
            } else {
                throw new A("Failed to parse the message.");
            }
        } finally {
            this.f2418c = i2;
        }
    }

    public final void c(Object obj, W w2, C0115o c0115o) {
        AbstractC0110j abstractC0110j = this.f2416a;
        int v2 = abstractC0110j.v();
        if (abstractC0110j.f2408a >= 100) {
            throw new A("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int e2 = abstractC0110j.e(v2);
        abstractC0110j.f2408a++;
        w2.b(obj, this, c0115o);
        abstractC0110j.a(0);
        abstractC0110j.f2408a--;
        abstractC0110j.d(e2);
    }

    public final void d(InterfaceC0123x interfaceC0123x) {
        int u2;
        int i2 = this.f2417b & 7;
        AbstractC0110j abstractC0110j = this.f2416a;
        if (i2 == 0) {
            do {
                ((U) interfaceC0123x).add(Boolean.valueOf(abstractC0110j.f()));
                if (abstractC0110j.c()) {
                    return;
                } else {
                    u2 = abstractC0110j.u();
                }
            } while (u2 == this.f2417b);
            this.f2419d = u2;
            return;
        }
        if (i2 != 2) {
            throw A.b();
        }
        int b2 = abstractC0110j.b() + abstractC0110j.v();
        do {
            ((U) interfaceC0123x).add(Boolean.valueOf(abstractC0110j.f()));
        } while (abstractC0110j.b() < b2);
        v(b2);
    }

    public final C0107g e() {
        w(2);
        return this.f2416a.g();
    }

    public final void f(InterfaceC0123x interfaceC0123x) {
        int u2;
        if ((this.f2417b & 7) != 2) {
            throw A.b();
        }
        do {
            ((U) interfaceC0123x).add(e());
            AbstractC0110j abstractC0110j = this.f2416a;
            if (abstractC0110j.c()) {
                return;
            } else {
                u2 = abstractC0110j.u();
            }
        } while (u2 == this.f2417b);
        this.f2419d = u2;
    }

    public final void g(InterfaceC0123x interfaceC0123x) {
        int u2;
        int i2 = this.f2417b & 7;
        AbstractC0110j abstractC0110j = this.f2416a;
        if (i2 == 1) {
            do {
                ((U) interfaceC0123x).add(Double.valueOf(abstractC0110j.h()));
                if (abstractC0110j.c()) {
                    return;
                } else {
                    u2 = abstractC0110j.u();
                }
            } while (u2 == this.f2417b);
            this.f2419d = u2;
            return;
        }
        if (i2 != 2) {
            throw A.b();
        }
        int v2 = abstractC0110j.v();
        if ((v2 & 7) != 0) {
            throw new A("Failed to parse the message.");
        }
        int b2 = abstractC0110j.b() + v2;
        do {
            ((U) interfaceC0123x).add(Double.valueOf(abstractC0110j.h()));
        } while (abstractC0110j.b() < b2);
    }

    public final void h(InterfaceC0123x interfaceC0123x) {
        int u2;
        int i2 = this.f2417b & 7;
        AbstractC0110j abstractC0110j = this.f2416a;
        if (i2 == 0) {
            do {
                ((U) interfaceC0123x).add(Integer.valueOf(abstractC0110j.i()));
                if (abstractC0110j.c()) {
                    return;
                } else {
                    u2 = abstractC0110j.u();
                }
            } while (u2 == this.f2417b);
            this.f2419d = u2;
            return;
        }
        if (i2 != 2) {
            throw A.b();
        }
        int b2 = abstractC0110j.b() + abstractC0110j.v();
        do {
            ((U) interfaceC0123x).add(Integer.valueOf(abstractC0110j.i()));
        } while (abstractC0110j.b() < b2);
        v(b2);
    }

    public final Object i(r0 r0Var, Class cls, C0115o c0115o) {
        int ordinal = r0Var.ordinal();
        AbstractC0110j abstractC0110j = this.f2416a;
        switch (ordinal) {
            case 0:
                w(1);
                return Double.valueOf(abstractC0110j.h());
            case 1:
                w(5);
                return Float.valueOf(abstractC0110j.l());
            case 2:
                w(0);
                return Long.valueOf(abstractC0110j.n());
            case 3:
                w(0);
                return Long.valueOf(abstractC0110j.w());
            case 4:
                w(0);
                return Integer.valueOf(abstractC0110j.m());
            case 5:
                w(1);
                return Long.valueOf(abstractC0110j.k());
            case 6:
                w(5);
                return Integer.valueOf(abstractC0110j.j());
            case 7:
                w(0);
                return Boolean.valueOf(abstractC0110j.f());
            case 8:
                w(2);
                return abstractC0110j.t();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                w(2);
                W a2 = T.f2345c.a(cls);
                AbstractC0122w g2 = a2.g();
                c(g2, a2, c0115o);
                a2.h(g2);
                return g2;
            case 11:
                return e();
            case 12:
                w(0);
                return Integer.valueOf(abstractC0110j.v());
            case 13:
                w(0);
                return Integer.valueOf(abstractC0110j.i());
            case 14:
                w(5);
                return Integer.valueOf(abstractC0110j.o());
            case 15:
                w(1);
                return Long.valueOf(abstractC0110j.p());
            case 16:
                w(0);
                return Integer.valueOf(abstractC0110j.q());
            case 17:
                w(0);
                return Long.valueOf(abstractC0110j.r());
        }
    }

    public final void j(InterfaceC0123x interfaceC0123x) {
        int u2;
        int i2 = this.f2417b & 7;
        AbstractC0110j abstractC0110j = this.f2416a;
        if (i2 == 2) {
            int v2 = abstractC0110j.v();
            if ((v2 & 3) != 0) {
                throw new A("Failed to parse the message.");
            }
            int b2 = abstractC0110j.b() + v2;
            do {
                ((U) interfaceC0123x).add(Integer.valueOf(abstractC0110j.j()));
            } while (abstractC0110j.b() < b2);
            return;
        }
        if (i2 != 5) {
            throw A.b();
        }
        do {
            ((U) interfaceC0123x).add(Integer.valueOf(abstractC0110j.j()));
            if (abstractC0110j.c()) {
                return;
            } else {
                u2 = abstractC0110j.u();
            }
        } while (u2 == this.f2417b);
        this.f2419d = u2;
    }

    public final void k(InterfaceC0123x interfaceC0123x) {
        int u2;
        int i2 = this.f2417b & 7;
        AbstractC0110j abstractC0110j = this.f2416a;
        if (i2 == 1) {
            do {
                ((U) interfaceC0123x).add(Long.valueOf(abstractC0110j.k()));
                if (abstractC0110j.c()) {
                    return;
                } else {
                    u2 = abstractC0110j.u();
                }
            } while (u2 == this.f2417b);
            this.f2419d = u2;
            return;
        }
        if (i2 != 2) {
            throw A.b();
        }
        int v2 = abstractC0110j.v();
        if ((v2 & 7) != 0) {
            throw new A("Failed to parse the message.");
        }
        int b2 = abstractC0110j.b() + v2;
        do {
            ((U) interfaceC0123x).add(Long.valueOf(abstractC0110j.k()));
        } while (abstractC0110j.b() < b2);
    }

    public final void l(InterfaceC0123x interfaceC0123x) {
        int u2;
        int i2 = this.f2417b & 7;
        AbstractC0110j abstractC0110j = this.f2416a;
        if (i2 == 2) {
            int v2 = abstractC0110j.v();
            if ((v2 & 3) != 0) {
                throw new A("Failed to parse the message.");
            }
            int b2 = abstractC0110j.b() + v2;
            do {
                ((U) interfaceC0123x).add(Float.valueOf(abstractC0110j.l()));
            } while (abstractC0110j.b() < b2);
            return;
        }
        if (i2 != 5) {
            throw A.b();
        }
        do {
            ((U) interfaceC0123x).add(Float.valueOf(abstractC0110j.l()));
            if (abstractC0110j.c()) {
                return;
            } else {
                u2 = abstractC0110j.u();
            }
        } while (u2 == this.f2417b);
        this.f2419d = u2;
    }

    public final void m(InterfaceC0123x interfaceC0123x) {
        int u2;
        int i2 = this.f2417b & 7;
        AbstractC0110j abstractC0110j = this.f2416a;
        if (i2 == 0) {
            do {
                ((U) interfaceC0123x).add(Integer.valueOf(abstractC0110j.m()));
                if (abstractC0110j.c()) {
                    return;
                } else {
                    u2 = abstractC0110j.u();
                }
            } while (u2 == this.f2417b);
            this.f2419d = u2;
            return;
        }
        if (i2 != 2) {
            throw A.b();
        }
        int b2 = abstractC0110j.b() + abstractC0110j.v();
        do {
            ((U) interfaceC0123x).add(Integer.valueOf(abstractC0110j.m()));
        } while (abstractC0110j.b() < b2);
        v(b2);
    }

    public final void n(InterfaceC0123x interfaceC0123x) {
        int u2;
        int i2 = this.f2417b & 7;
        AbstractC0110j abstractC0110j = this.f2416a;
        if (i2 == 0) {
            do {
                ((U) interfaceC0123x).add(Long.valueOf(abstractC0110j.n()));
                if (abstractC0110j.c()) {
                    return;
                } else {
                    u2 = abstractC0110j.u();
                }
            } while (u2 == this.f2417b);
            this.f2419d = u2;
            return;
        }
        if (i2 != 2) {
            throw A.b();
        }
        int b2 = abstractC0110j.b() + abstractC0110j.v();
        do {
            ((U) interfaceC0123x).add(Long.valueOf(abstractC0110j.n()));
        } while (abstractC0110j.b() < b2);
        v(b2);
    }

    public final void o(InterfaceC0123x interfaceC0123x) {
        int u2;
        int i2 = this.f2417b & 7;
        AbstractC0110j abstractC0110j = this.f2416a;
        if (i2 == 2) {
            int v2 = abstractC0110j.v();
            if ((v2 & 3) != 0) {
                throw new A("Failed to parse the message.");
            }
            int b2 = abstractC0110j.b() + v2;
            do {
                ((U) interfaceC0123x).add(Integer.valueOf(abstractC0110j.o()));
            } while (abstractC0110j.b() < b2);
            return;
        }
        if (i2 != 5) {
            throw A.b();
        }
        do {
            ((U) interfaceC0123x).add(Integer.valueOf(abstractC0110j.o()));
            if (abstractC0110j.c()) {
                return;
            } else {
                u2 = abstractC0110j.u();
            }
        } while (u2 == this.f2417b);
        this.f2419d = u2;
    }

    public final void p(InterfaceC0123x interfaceC0123x) {
        int u2;
        int i2 = this.f2417b & 7;
        AbstractC0110j abstractC0110j = this.f2416a;
        if (i2 == 1) {
            do {
                ((U) interfaceC0123x).add(Long.valueOf(abstractC0110j.p()));
                if (abstractC0110j.c()) {
                    return;
                } else {
                    u2 = abstractC0110j.u();
                }
            } while (u2 == this.f2417b);
            this.f2419d = u2;
            return;
        }
        if (i2 != 2) {
            throw A.b();
        }
        int v2 = abstractC0110j.v();
        if ((v2 & 7) != 0) {
            throw new A("Failed to parse the message.");
        }
        int b2 = abstractC0110j.b() + v2;
        do {
            ((U) interfaceC0123x).add(Long.valueOf(abstractC0110j.p()));
        } while (abstractC0110j.b() < b2);
    }

    public final void q(InterfaceC0123x interfaceC0123x) {
        int u2;
        int i2 = this.f2417b & 7;
        AbstractC0110j abstractC0110j = this.f2416a;
        if (i2 == 0) {
            do {
                ((U) interfaceC0123x).add(Integer.valueOf(abstractC0110j.q()));
                if (abstractC0110j.c()) {
                    return;
                } else {
                    u2 = abstractC0110j.u();
                }
            } while (u2 == this.f2417b);
            this.f2419d = u2;
            return;
        }
        if (i2 != 2) {
            throw A.b();
        }
        int b2 = abstractC0110j.b() + abstractC0110j.v();
        do {
            ((U) interfaceC0123x).add(Integer.valueOf(abstractC0110j.q()));
        } while (abstractC0110j.b() < b2);
        v(b2);
    }

    public final void r(InterfaceC0123x interfaceC0123x) {
        int u2;
        int i2 = this.f2417b & 7;
        AbstractC0110j abstractC0110j = this.f2416a;
        if (i2 == 0) {
            do {
                ((U) interfaceC0123x).add(Long.valueOf(abstractC0110j.r()));
                if (abstractC0110j.c()) {
                    return;
                } else {
                    u2 = abstractC0110j.u();
                }
            } while (u2 == this.f2417b);
            this.f2419d = u2;
            return;
        }
        if (i2 != 2) {
            throw A.b();
        }
        int b2 = abstractC0110j.b() + abstractC0110j.v();
        do {
            ((U) interfaceC0123x).add(Long.valueOf(abstractC0110j.r()));
        } while (abstractC0110j.b() < b2);
        v(b2);
    }

    public final void s(InterfaceC0123x interfaceC0123x, boolean z2) {
        String s2;
        int u2;
        if ((this.f2417b & 7) != 2) {
            throw A.b();
        }
        do {
            AbstractC0110j abstractC0110j = this.f2416a;
            if (z2) {
                w(2);
                s2 = abstractC0110j.t();
            } else {
                w(2);
                s2 = abstractC0110j.s();
            }
            ((U) interfaceC0123x).add(s2);
            if (abstractC0110j.c()) {
                return;
            } else {
                u2 = abstractC0110j.u();
            }
        } while (u2 == this.f2417b);
        this.f2419d = u2;
    }

    public final void t(InterfaceC0123x interfaceC0123x) {
        int u2;
        int i2 = this.f2417b & 7;
        AbstractC0110j abstractC0110j = this.f2416a;
        if (i2 == 0) {
            do {
                ((U) interfaceC0123x).add(Integer.valueOf(abstractC0110j.v()));
                if (abstractC0110j.c()) {
                    return;
                } else {
                    u2 = abstractC0110j.u();
                }
            } while (u2 == this.f2417b);
            this.f2419d = u2;
            return;
        }
        if (i2 != 2) {
            throw A.b();
        }
        int b2 = abstractC0110j.b() + abstractC0110j.v();
        do {
            ((U) interfaceC0123x).add(Integer.valueOf(abstractC0110j.v()));
        } while (abstractC0110j.b() < b2);
        v(b2);
    }

    public final void u(InterfaceC0123x interfaceC0123x) {
        int u2;
        int i2 = this.f2417b & 7;
        AbstractC0110j abstractC0110j = this.f2416a;
        if (i2 == 0) {
            do {
                ((U) interfaceC0123x).add(Long.valueOf(abstractC0110j.w()));
                if (abstractC0110j.c()) {
                    return;
                } else {
                    u2 = abstractC0110j.u();
                }
            } while (u2 == this.f2417b);
            this.f2419d = u2;
            return;
        }
        if (i2 != 2) {
            throw A.b();
        }
        int b2 = abstractC0110j.b() + abstractC0110j.v();
        do {
            ((U) interfaceC0123x).add(Long.valueOf(abstractC0110j.w()));
        } while (abstractC0110j.b() < b2);
        v(b2);
    }

    public final void v(int i2) {
        if (this.f2416a.b() != i2) {
            throw A.e();
        }
    }

    public final void w(int i2) {
        if ((this.f2417b & 7) != i2) {
            throw A.b();
        }
    }

    public final boolean x() {
        int i2;
        AbstractC0110j abstractC0110j = this.f2416a;
        if (abstractC0110j.c() || (i2 = this.f2417b) == this.f2418c) {
            return false;
        }
        return abstractC0110j.x(i2);
    }
}
