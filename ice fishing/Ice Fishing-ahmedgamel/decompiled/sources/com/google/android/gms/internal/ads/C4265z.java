package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4265z implements InterfaceC4049v {

    /* renamed from: n, reason: collision with root package name */
    public int f36041n;

    /* renamed from: u, reason: collision with root package name */
    public int f36042u;

    /* renamed from: v, reason: collision with root package name */
    public int f36043v;

    /* renamed from: w, reason: collision with root package name */
    public Object f36044w;

    public C4265z() {
        this.f36043v = 0;
        this.f36044w = new C3995u[100];
    }

    public static final void A(int i) {
        if ((i & 7) != 0) {
            throw new C3318hL("Failed to parse the message.");
        }
    }

    public static final void z(int i) {
        if ((i & 3) != 0) {
            throw new C3318hL("Failed to parse the message.");
        }
    }

    public int B() {
        int i = this.f36043v;
        if (i != 0) {
            this.f36041n = i;
            this.f36043v = 0;
        } else {
            i = ((W7.b) this.f36044w).j();
            this.f36041n = i;
        }
        if (i == 0 || i == this.f36042u) {
            return Integer.MAX_VALUE;
        }
        return i >>> 3;
    }

    public synchronized void C(int i) {
        int i4 = this.f36041n;
        this.f36041n = i;
        if (i < i4) {
            o();
        }
    }

    public JK D() {
        u(2);
        return ((W7.b) this.f36044w).x();
    }

    public void E(InterfaceC3049cL interfaceC3049cL) {
        int j6;
        int i = this.f36041n & 7;
        W7.b bVar = (W7.b) this.f36044w;
        if (i == 1) {
            do {
                interfaceC3049cL.add(Double.valueOf(bVar.n()));
                if (bVar.d()) {
                    return;
                } else {
                    j6 = bVar.j();
                }
            } while (j6 == this.f36041n);
            this.f36043v = j6;
            return;
        }
        if (i != 2) {
            throw new C3264gL();
        }
        int y7 = bVar.y();
        A(y7);
        int e9 = bVar.e() + y7;
        do {
            interfaceC3049cL.add(Double.valueOf(bVar.n()));
        } while (bVar.e() < e9);
    }

    public void F(InterfaceC3049cL interfaceC3049cL) {
        int j6;
        int i = this.f36041n & 7;
        W7.b bVar = (W7.b) this.f36044w;
        if (i == 2) {
            int y7 = bVar.y();
            z(y7);
            int e9 = bVar.e() + y7;
            do {
                interfaceC3049cL.add(Float.valueOf(bVar.o()));
            } while (bVar.e() < e9);
            return;
        }
        if (i != 5) {
            throw new C3264gL();
        }
        do {
            interfaceC3049cL.add(Float.valueOf(bVar.o()));
            if (bVar.d()) {
                return;
            } else {
                j6 = bVar.j();
            }
        } while (j6 == this.f36041n);
        this.f36043v = j6;
    }

    public void G(InterfaceC3049cL interfaceC3049cL) {
        int j6;
        int i;
        boolean z6 = interfaceC3049cL instanceof C3532lL;
        W7.b bVar = (W7.b) this.f36044w;
        if (z6) {
            C3532lL c3532lL = (C3532lL) interfaceC3049cL;
            int i4 = this.f36041n & 7;
            if (i4 != 0) {
                if (i4 != 2) {
                    throw new C3264gL();
                }
                int e9 = bVar.e() + bVar.y();
                do {
                    c3532lL.d(bVar.p());
                } while (bVar.e() < e9);
                y(e9);
                return;
            }
            do {
                c3532lL.d(bVar.p());
                if (bVar.d()) {
                    return;
                } else {
                    i = bVar.j();
                }
            } while (i == this.f36041n);
        } else {
            int i6 = this.f36041n & 7;
            if (i6 != 0) {
                if (i6 != 2) {
                    throw new C3264gL();
                }
                int e10 = bVar.e() + bVar.y();
                do {
                    interfaceC3049cL.add(Long.valueOf(bVar.p()));
                } while (bVar.e() < e10);
                y(e10);
                return;
            }
            do {
                interfaceC3049cL.add(Long.valueOf(bVar.p()));
                if (bVar.d()) {
                    return;
                } else {
                    j6 = bVar.j();
                }
            } while (j6 == this.f36041n);
            i = j6;
        }
        this.f36043v = i;
    }

    public void a(InterfaceC3049cL interfaceC3049cL) {
        int j6;
        int i;
        boolean z6 = interfaceC3049cL instanceof C3532lL;
        W7.b bVar = (W7.b) this.f36044w;
        if (z6) {
            C3532lL c3532lL = (C3532lL) interfaceC3049cL;
            int i4 = this.f36041n & 7;
            if (i4 != 0) {
                if (i4 != 2) {
                    throw new C3264gL();
                }
                int e9 = bVar.e() + bVar.y();
                do {
                    c3532lL.d(bVar.q());
                } while (bVar.e() < e9);
                y(e9);
                return;
            }
            do {
                c3532lL.d(bVar.q());
                if (bVar.d()) {
                    return;
                } else {
                    i = bVar.j();
                }
            } while (i == this.f36041n);
        } else {
            int i6 = this.f36041n & 7;
            if (i6 != 0) {
                if (i6 != 2) {
                    throw new C3264gL();
                }
                int e10 = bVar.e() + bVar.y();
                do {
                    interfaceC3049cL.add(Long.valueOf(bVar.q()));
                } while (bVar.e() < e10);
                y(e10);
                return;
            }
            do {
                interfaceC3049cL.add(Long.valueOf(bVar.q()));
                if (bVar.d()) {
                    return;
                } else {
                    j6 = bVar.j();
                }
            } while (j6 == this.f36041n);
            i = j6;
        }
        this.f36043v = i;
    }

    public void b(InterfaceC3049cL interfaceC3049cL) {
        int j6;
        int i;
        boolean z6 = interfaceC3049cL instanceof WK;
        W7.b bVar = (W7.b) this.f36044w;
        if (z6) {
            WK wk = (WK) interfaceC3049cL;
            int i4 = this.f36041n & 7;
            if (i4 != 0) {
                if (i4 != 2) {
                    throw new C3264gL();
                }
                int e9 = bVar.e() + bVar.y();
                do {
                    wk.e(bVar.r());
                } while (bVar.e() < e9);
                y(e9);
                return;
            }
            do {
                wk.e(bVar.r());
                if (bVar.d()) {
                    return;
                } else {
                    i = bVar.j();
                }
            } while (i == this.f36041n);
        } else {
            int i6 = this.f36041n & 7;
            if (i6 != 0) {
                if (i6 != 2) {
                    throw new C3264gL();
                }
                int e10 = bVar.e() + bVar.y();
                do {
                    interfaceC3049cL.add(Integer.valueOf(bVar.r()));
                } while (bVar.e() < e10);
                y(e10);
                return;
            }
            do {
                interfaceC3049cL.add(Integer.valueOf(bVar.r()));
                if (bVar.d()) {
                    return;
                } else {
                    j6 = bVar.j();
                }
            } while (j6 == this.f36041n);
            i = j6;
        }
        this.f36043v = i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4049v
    public synchronized C3995u c() {
        C3995u c3995u;
        try {
            int i = this.f36042u + 1;
            this.f36042u = i;
            int i4 = this.f36043v;
            if (i4 > 0) {
                C3995u[] c3995uArr = (C3995u[]) this.f36044w;
                int i6 = i4 - 1;
                this.f36043v = i6;
                c3995u = c3995uArr[i6];
                if (c3995u == null) {
                    throw null;
                }
                c3995uArr[i6] = null;
            } else {
                c3995u = new C3995u(new byte[com.anythink.basead.exoplayer.b.aX]);
                C3995u[] c3995uArr2 = (C3995u[]) this.f36044w;
                int length = c3995uArr2.length;
                if (i > length) {
                    this.f36044w = (C3995u[]) Arrays.copyOf(c3995uArr2, length + length);
                    return c3995u;
                }
            }
            return c3995u;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void d(InterfaceC3049cL interfaceC3049cL) {
        int j6;
        int i;
        boolean z6 = interfaceC3049cL instanceof C3532lL;
        W7.b bVar = (W7.b) this.f36044w;
        if (z6) {
            C3532lL c3532lL = (C3532lL) interfaceC3049cL;
            int i4 = this.f36041n & 7;
            if (i4 != 1) {
                if (i4 != 2) {
                    throw new C3264gL();
                }
                int y7 = bVar.y();
                A(y7);
                int e9 = bVar.e() + y7;
                do {
                    c3532lL.d(bVar.s());
                } while (bVar.e() < e9);
                return;
            }
            do {
                c3532lL.d(bVar.s());
                if (bVar.d()) {
                    return;
                } else {
                    i = bVar.j();
                }
            } while (i == this.f36041n);
        } else {
            int i6 = this.f36041n & 7;
            if (i6 != 1) {
                if (i6 != 2) {
                    throw new C3264gL();
                }
                int y9 = bVar.y();
                A(y9);
                int e10 = bVar.e() + y9;
                do {
                    interfaceC3049cL.add(Long.valueOf(bVar.s()));
                } while (bVar.e() < e10);
                return;
            }
            do {
                interfaceC3049cL.add(Long.valueOf(bVar.s()));
                if (bVar.d()) {
                    return;
                } else {
                    j6 = bVar.j();
                }
            } while (j6 == this.f36041n);
            i = j6;
        }
        this.f36043v = i;
    }

    public void e(InterfaceC3049cL interfaceC3049cL) {
        int j6;
        int i;
        boolean z6 = interfaceC3049cL instanceof WK;
        W7.b bVar = (W7.b) this.f36044w;
        if (z6) {
            WK wk = (WK) interfaceC3049cL;
            int i4 = this.f36041n & 7;
            if (i4 == 2) {
                int y7 = bVar.y();
                z(y7);
                int e9 = bVar.e() + y7;
                do {
                    wk.e(bVar.t());
                } while (bVar.e() < e9);
                return;
            }
            if (i4 != 5) {
                throw new C3264gL();
            }
            do {
                wk.e(bVar.t());
                if (bVar.d()) {
                    return;
                } else {
                    i = bVar.j();
                }
            } while (i == this.f36041n);
        } else {
            int i6 = this.f36041n & 7;
            if (i6 == 2) {
                int y9 = bVar.y();
                z(y9);
                int e10 = bVar.e() + y9;
                do {
                    interfaceC3049cL.add(Integer.valueOf(bVar.t()));
                } while (bVar.e() < e10);
                return;
            }
            if (i6 != 5) {
                throw new C3264gL();
            }
            do {
                interfaceC3049cL.add(Integer.valueOf(bVar.t()));
                if (bVar.d()) {
                    return;
                } else {
                    j6 = bVar.j();
                }
            } while (j6 == this.f36041n);
            i = j6;
        }
        this.f36043v = i;
    }

    public void f(InterfaceC3049cL interfaceC3049cL) {
        int j6;
        int i = this.f36041n & 7;
        W7.b bVar = (W7.b) this.f36044w;
        if (i == 0) {
            do {
                interfaceC3049cL.add(Boolean.valueOf(bVar.u()));
                if (bVar.d()) {
                    return;
                } else {
                    j6 = bVar.j();
                }
            } while (j6 == this.f36041n);
            this.f36043v = j6;
            return;
        }
        if (i != 2) {
            throw new C3264gL();
        }
        int e9 = bVar.e() + bVar.y();
        do {
            interfaceC3049cL.add(Boolean.valueOf(bVar.u()));
        } while (bVar.e() < e9);
        y(e9);
    }

    public void g(InterfaceC3049cL interfaceC3049cL, boolean z6) {
        String v9;
        int j6;
        if ((this.f36041n & 7) != 2) {
            throw new C3264gL();
        }
        do {
            W7.b bVar = (W7.b) this.f36044w;
            if (z6) {
                u(2);
                v9 = bVar.w();
            } else {
                u(2);
                v9 = bVar.v();
            }
            interfaceC3049cL.add(v9);
            if (bVar.d()) {
                return;
            } else {
                j6 = bVar.j();
            }
        } while (j6 == this.f36041n);
        this.f36043v = j6;
    }

    public void h(InterfaceC3049cL interfaceC3049cL, DL dl, PK pk) {
        int j6;
        int i = this.f36041n;
        if ((i & 7) != 2) {
            throw new C3264gL();
        }
        do {
            VK c9 = dl.c();
            v(c9, dl, pk);
            dl.g(c9);
            interfaceC3049cL.add(c9);
            W7.b bVar = (W7.b) this.f36044w;
            if (bVar.d() || this.f36043v != 0) {
                return;
            } else {
                j6 = bVar.j();
            }
        } while (j6 == i);
        this.f36043v = j6;
    }

    public void i(InterfaceC3049cL interfaceC3049cL, DL dl, PK pk) {
        int j6;
        int i = this.f36041n;
        if ((i & 7) != 3) {
            throw new C3264gL();
        }
        do {
            VK c9 = dl.c();
            w(c9, dl, pk);
            dl.g(c9);
            interfaceC3049cL.add(c9);
            W7.b bVar = (W7.b) this.f36044w;
            if (bVar.d() || this.f36043v != 0) {
                return;
            } else {
                j6 = bVar.j();
            }
        } while (j6 == i);
        this.f36043v = j6;
    }

    public void j(InterfaceC3049cL interfaceC3049cL) {
        int j6;
        if ((this.f36041n & 7) != 2) {
            throw new C3264gL();
        }
        do {
            interfaceC3049cL.add(D());
            W7.b bVar = (W7.b) this.f36044w;
            if (bVar.d()) {
                return;
            } else {
                j6 = bVar.j();
            }
        } while (j6 == this.f36041n);
        this.f36043v = j6;
    }

    public void k(InterfaceC3049cL interfaceC3049cL) {
        int j6;
        int i;
        boolean z6 = interfaceC3049cL instanceof WK;
        W7.b bVar = (W7.b) this.f36044w;
        if (z6) {
            WK wk = (WK) interfaceC3049cL;
            int i4 = this.f36041n & 7;
            if (i4 != 0) {
                if (i4 != 2) {
                    throw new C3264gL();
                }
                int e9 = bVar.e() + bVar.y();
                do {
                    wk.e(bVar.y());
                } while (bVar.e() < e9);
                y(e9);
                return;
            }
            do {
                wk.e(bVar.y());
                if (bVar.d()) {
                    return;
                } else {
                    i = bVar.j();
                }
            } while (i == this.f36041n);
        } else {
            int i6 = this.f36041n & 7;
            if (i6 != 0) {
                if (i6 != 2) {
                    throw new C3264gL();
                }
                int e10 = bVar.e() + bVar.y();
                do {
                    interfaceC3049cL.add(Integer.valueOf(bVar.y()));
                } while (bVar.e() < e10);
                y(e10);
                return;
            }
            do {
                interfaceC3049cL.add(Integer.valueOf(bVar.y()));
                if (bVar.d()) {
                    return;
                } else {
                    j6 = bVar.j();
                }
            } while (j6 == this.f36041n);
            i = j6;
        }
        this.f36043v = i;
    }

    public void l(InterfaceC3049cL interfaceC3049cL) {
        int j6;
        int i;
        boolean z6 = interfaceC3049cL instanceof WK;
        W7.b bVar = (W7.b) this.f36044w;
        if (z6) {
            WK wk = (WK) interfaceC3049cL;
            int i4 = this.f36041n & 7;
            if (i4 != 0) {
                if (i4 != 2) {
                    throw new C3264gL();
                }
                int e9 = bVar.e() + bVar.y();
                do {
                    wk.e(bVar.z());
                } while (bVar.e() < e9);
                y(e9);
                return;
            }
            do {
                wk.e(bVar.z());
                if (bVar.d()) {
                    return;
                } else {
                    i = bVar.j();
                }
            } while (i == this.f36041n);
        } else {
            int i6 = this.f36041n & 7;
            if (i6 != 0) {
                if (i6 != 2) {
                    throw new C3264gL();
                }
                int e10 = bVar.e() + bVar.y();
                do {
                    interfaceC3049cL.add(Integer.valueOf(bVar.z()));
                } while (bVar.e() < e10);
                y(e10);
                return;
            }
            do {
                interfaceC3049cL.add(Integer.valueOf(bVar.z()));
                if (bVar.d()) {
                    return;
                } else {
                    j6 = bVar.j();
                }
            } while (j6 == this.f36041n);
            i = j6;
        }
        this.f36043v = i;
    }

    public void m(InterfaceC3049cL interfaceC3049cL) {
        int j6;
        int i;
        boolean z6 = interfaceC3049cL instanceof WK;
        W7.b bVar = (W7.b) this.f36044w;
        if (z6) {
            WK wk = (WK) interfaceC3049cL;
            int i4 = this.f36041n & 7;
            if (i4 == 2) {
                int y7 = bVar.y();
                z(y7);
                int e9 = bVar.e() + y7;
                do {
                    wk.e(bVar.A());
                } while (bVar.e() < e9);
                return;
            }
            if (i4 != 5) {
                throw new C3264gL();
            }
            do {
                wk.e(bVar.A());
                if (bVar.d()) {
                    return;
                } else {
                    i = bVar.j();
                }
            } while (i == this.f36041n);
        } else {
            int i6 = this.f36041n & 7;
            if (i6 == 2) {
                int y9 = bVar.y();
                z(y9);
                int e10 = bVar.e() + y9;
                do {
                    interfaceC3049cL.add(Integer.valueOf(bVar.A()));
                } while (bVar.e() < e10);
                return;
            }
            if (i6 != 5) {
                throw new C3264gL();
            }
            do {
                interfaceC3049cL.add(Integer.valueOf(bVar.A()));
                if (bVar.d()) {
                    return;
                } else {
                    j6 = bVar.j();
                }
            } while (j6 == this.f36041n);
            i = j6;
        }
        this.f36043v = i;
    }

    public void n(InterfaceC3049cL interfaceC3049cL) {
        int j6;
        int i;
        boolean z6 = interfaceC3049cL instanceof C3532lL;
        W7.b bVar = (W7.b) this.f36044w;
        if (z6) {
            C3532lL c3532lL = (C3532lL) interfaceC3049cL;
            int i4 = this.f36041n & 7;
            if (i4 != 1) {
                if (i4 != 2) {
                    throw new C3264gL();
                }
                int y7 = bVar.y();
                A(y7);
                int e9 = bVar.e() + y7;
                do {
                    c3532lL.d(bVar.B());
                } while (bVar.e() < e9);
                return;
            }
            do {
                c3532lL.d(bVar.B());
                if (bVar.d()) {
                    return;
                } else {
                    i = bVar.j();
                }
            } while (i == this.f36041n);
        } else {
            int i6 = this.f36041n & 7;
            if (i6 != 1) {
                if (i6 != 2) {
                    throw new C3264gL();
                }
                int y9 = bVar.y();
                A(y9);
                int e10 = bVar.e() + y9;
                do {
                    interfaceC3049cL.add(Long.valueOf(bVar.B()));
                } while (bVar.e() < e10);
                return;
            }
            do {
                interfaceC3049cL.add(Long.valueOf(bVar.B()));
                if (bVar.d()) {
                    return;
                } else {
                    j6 = bVar.j();
                }
            } while (j6 == this.f36041n);
            i = j6;
        }
        this.f36043v = i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4049v
    public synchronized void o() {
        int i = this.f36041n;
        String str = AbstractC3182eu.f30782a;
        int max = Math.max(0, ((i + 65535) / com.anythink.basead.exoplayer.b.aX) - this.f36042u);
        int i4 = this.f36043v;
        if (max >= i4) {
            return;
        }
        Arrays.fill((C3995u[]) this.f36044w, max, i4, (Object) null);
        this.f36043v = max;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4049v
    public synchronized void p(C3995u c3995u) {
        C3995u[] c3995uArr = (C3995u[]) this.f36044w;
        int i = this.f36043v;
        this.f36043v = i + 1;
        c3995uArr[i] = c3995u;
        this.f36042u--;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4049v
    public synchronized void q(G2 g22) {
        while (g22 != null) {
            C3995u[] c3995uArr = (C3995u[]) this.f36044w;
            int i = this.f36043v;
            this.f36043v = i + 1;
            C3995u c3995u = (C3995u) g22.f25699v;
            c3995u.getClass();
            c3995uArr[i] = c3995u;
            this.f36042u--;
            g22 = (G2) g22.f25700w;
            if (g22 == null || ((C3995u) g22.f25699v) == null) {
                g22 = null;
            }
        }
    }

    public void r(InterfaceC3049cL interfaceC3049cL) {
        int j6;
        int i;
        boolean z6 = interfaceC3049cL instanceof WK;
        W7.b bVar = (W7.b) this.f36044w;
        if (z6) {
            WK wk = (WK) interfaceC3049cL;
            int i4 = this.f36041n & 7;
            if (i4 != 0) {
                if (i4 != 2) {
                    throw new C3264gL();
                }
                int e9 = bVar.e() + bVar.y();
                do {
                    wk.e(bVar.C());
                } while (bVar.e() < e9);
                y(e9);
                return;
            }
            do {
                wk.e(bVar.C());
                if (bVar.d()) {
                    return;
                } else {
                    i = bVar.j();
                }
            } while (i == this.f36041n);
        } else {
            int i6 = this.f36041n & 7;
            if (i6 != 0) {
                if (i6 != 2) {
                    throw new C3264gL();
                }
                int e10 = bVar.e() + bVar.y();
                do {
                    interfaceC3049cL.add(Integer.valueOf(bVar.C()));
                } while (bVar.e() < e10);
                y(e10);
                return;
            }
            do {
                interfaceC3049cL.add(Integer.valueOf(bVar.C()));
                if (bVar.d()) {
                    return;
                } else {
                    j6 = bVar.j();
                }
            } while (j6 == this.f36041n);
            i = j6;
        }
        this.f36043v = i;
    }

    public void s(InterfaceC3049cL interfaceC3049cL) {
        int j6;
        int i;
        boolean z6 = interfaceC3049cL instanceof C3532lL;
        W7.b bVar = (W7.b) this.f36044w;
        if (z6) {
            C3532lL c3532lL = (C3532lL) interfaceC3049cL;
            int i4 = this.f36041n & 7;
            if (i4 != 0) {
                if (i4 != 2) {
                    throw new C3264gL();
                }
                int e9 = bVar.e() + bVar.y();
                do {
                    c3532lL.d(bVar.D());
                } while (bVar.e() < e9);
                y(e9);
                return;
            }
            do {
                c3532lL.d(bVar.D());
                if (bVar.d()) {
                    return;
                } else {
                    i = bVar.j();
                }
            } while (i == this.f36041n);
        } else {
            int i6 = this.f36041n & 7;
            if (i6 != 0) {
                if (i6 != 2) {
                    throw new C3264gL();
                }
                int e10 = bVar.e() + bVar.y();
                do {
                    interfaceC3049cL.add(Long.valueOf(bVar.D()));
                } while (bVar.e() < e10);
                y(e10);
                return;
            }
            do {
                interfaceC3049cL.add(Long.valueOf(bVar.D()));
                if (bVar.d()) {
                    return;
                } else {
                    j6 = bVar.j();
                }
            } while (j6 == this.f36041n);
            i = j6;
        }
        this.f36043v = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0080, code lost:
    
        r12.put(r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0083, code lost:
    
        r1.c(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0086, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0045 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0044 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void t(C3640nL c3640nL, C4297ze c4297ze, PK pk) {
        int i;
        boolean z6;
        int i4;
        u(2);
        W7.b bVar = (W7.b) this.f36044w;
        int b9 = bVar.b(bVar.y());
        C3615mx c3615mx = (C3615mx) c4297ze.f36135w;
        Object obj = "";
        Object obj2 = c3615mx;
        while (true) {
            try {
                int B3 = B();
                if (B3 == Integer.MAX_VALUE || bVar.d()) {
                    break;
                }
                boolean z9 = false;
                if (B3 == 1) {
                    obj = x((SL) c4297ze.f36133u, null, null);
                } else if (B3 != 2) {
                    try {
                        if (!bVar.d() && (i4 = this.f36041n) != this.f36042u) {
                            z6 = bVar.m(i4);
                            if (z6) {
                                throw new C3318hL("Unable to parse map entry.");
                            }
                        }
                        z6 = false;
                        if (z6) {
                        }
                    } catch (C3264gL e9) {
                        if (!bVar.d() && (i = this.f36041n) != this.f36042u) {
                            z9 = bVar.m(i);
                        }
                        throw new C3318hL("Unable to parse map entry.", e9);
                    }
                } else {
                    obj2 = x((SL) c4297ze.f36134v, c3615mx.getClass(), pk);
                }
            } catch (Throwable th) {
                bVar.c(b9);
                throw th;
            }
        }
    }

    public void u(int i) {
        if ((this.f36041n & 7) != i) {
            throw new C3264gL();
        }
    }

    public void v(Object obj, DL dl, PK pk) {
        W7.b bVar = (W7.b) this.f36044w;
        int y7 = bVar.y();
        if (bVar.f3576n + bVar.f3577u >= 100) {
            throw new C3318hL("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int b9 = bVar.b(y7);
        bVar.f3576n++;
        dl.b(obj, this, pk);
        bVar.k(0);
        bVar.f3576n--;
        bVar.c(b9);
    }

    public void w(Object obj, DL dl, PK pk) {
        int i = this.f36042u;
        this.f36042u = ((this.f36041n >>> 3) << 3) | 4;
        try {
            dl.b(obj, this, pk);
            if (this.f36041n == this.f36042u) {
            } else {
                throw new C3318hL("Failed to parse the message.");
            }
        } finally {
            this.f36042u = i;
        }
    }

    public Object x(SL sl, Class cls, PK pk) {
        SL sl2 = SL.f28185v;
        int ordinal = sl.ordinal();
        W7.b bVar = (W7.b) this.f36044w;
        switch (ordinal) {
            case 0:
                u(1);
                return Double.valueOf(bVar.n());
            case 1:
                u(5);
                return Float.valueOf(bVar.o());
            case 2:
                u(0);
                return Long.valueOf(bVar.q());
            case 3:
                u(0);
                return Long.valueOf(bVar.p());
            case 4:
                u(0);
                return Integer.valueOf(bVar.r());
            case 5:
                u(1);
                return Long.valueOf(bVar.s());
            case 6:
                u(5);
                return Integer.valueOf(bVar.t());
            case 7:
                u(0);
                return Boolean.valueOf(bVar.u());
            case 8:
                u(2);
                return bVar.w();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                u(2);
                DL a9 = C4179xL.f35771c.a(cls);
                VK c9 = a9.c();
                v(c9, a9, pk);
                a9.g(c9);
                return c9;
            case 11:
                return D();
            case 12:
                u(0);
                return Integer.valueOf(bVar.y());
            case 13:
                u(0);
                return Integer.valueOf(bVar.z());
            case 14:
                u(5);
                return Integer.valueOf(bVar.A());
            case 15:
                u(1);
                return Long.valueOf(bVar.B());
            case 16:
                u(0);
                return Integer.valueOf(bVar.C());
            case 17:
                u(0);
                return Long.valueOf(bVar.D());
        }
    }

    public void y(int i) {
        if (((W7.b) this.f36044w).e() != i) {
            throw new C3318hL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public C4265z(W7.b bVar) {
        this.f36043v = 0;
        bVar.getClass();
        this.f36044w = bVar;
        bVar.f3578v = this;
    }
}
