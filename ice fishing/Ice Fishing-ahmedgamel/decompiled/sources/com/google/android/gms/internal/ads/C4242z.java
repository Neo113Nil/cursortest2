package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4242z implements InterfaceC4026v {

    /* renamed from: n, reason: collision with root package name */
    public int f35257n;

    /* renamed from: u, reason: collision with root package name */
    public int f35258u;

    /* renamed from: v, reason: collision with root package name */
    public int f35259v;

    /* renamed from: w, reason: collision with root package name */
    public Object f35260w;

    public C4242z() {
        this.f35259v = 0;
        this.f35260w = new C3972u[100];
    }

    public static final void A(int i) {
        if ((i & 7) != 0) {
            throw new C3295hL("Failed to parse the message.");
        }
    }

    public static final void z(int i) {
        if ((i & 3) != 0) {
            throw new C3295hL("Failed to parse the message.");
        }
    }

    public int B() {
        int i = this.f35259v;
        if (i != 0) {
            this.f35257n = i;
            this.f35259v = 0;
        } else {
            i = ((W7.b) this.f35260w).j();
            this.f35257n = i;
        }
        if (i == 0 || i == this.f35258u) {
            return Integer.MAX_VALUE;
        }
        return i >>> 3;
    }

    public synchronized void C(int i) {
        int i6 = this.f35257n;
        this.f35257n = i;
        if (i < i6) {
            o();
        }
    }

    public JK D() {
        u(2);
        return ((W7.b) this.f35260w).x();
    }

    public void E(InterfaceC3026cL interfaceC3026cL) {
        int j6;
        int i = this.f35257n & 7;
        W7.b bVar = (W7.b) this.f35260w;
        if (i == 1) {
            do {
                interfaceC3026cL.add(Double.valueOf(bVar.m()));
                if (bVar.d()) {
                    return;
                } else {
                    j6 = bVar.j();
                }
            } while (j6 == this.f35257n);
            this.f35259v = j6;
            return;
        }
        if (i != 2) {
            throw new C3241gL();
        }
        int y7 = bVar.y();
        A(y7);
        int e9 = bVar.e() + y7;
        do {
            interfaceC3026cL.add(Double.valueOf(bVar.m()));
        } while (bVar.e() < e9);
    }

    public void F(InterfaceC3026cL interfaceC3026cL) {
        int j6;
        int i = this.f35257n & 7;
        W7.b bVar = (W7.b) this.f35260w;
        if (i == 2) {
            int y7 = bVar.y();
            z(y7);
            int e9 = bVar.e() + y7;
            do {
                interfaceC3026cL.add(Float.valueOf(bVar.n()));
            } while (bVar.e() < e9);
            return;
        }
        if (i != 5) {
            throw new C3241gL();
        }
        do {
            interfaceC3026cL.add(Float.valueOf(bVar.n()));
            if (bVar.d()) {
                return;
            } else {
                j6 = bVar.j();
            }
        } while (j6 == this.f35257n);
        this.f35259v = j6;
    }

    public void G(InterfaceC3026cL interfaceC3026cL) {
        int j6;
        int i;
        boolean z3 = interfaceC3026cL instanceof C3509lL;
        W7.b bVar = (W7.b) this.f35260w;
        if (z3) {
            C3509lL c3509lL = (C3509lL) interfaceC3026cL;
            int i6 = this.f35257n & 7;
            if (i6 != 0) {
                if (i6 != 2) {
                    throw new C3241gL();
                }
                int e9 = bVar.e() + bVar.y();
                do {
                    c3509lL.d(bVar.o());
                } while (bVar.e() < e9);
                y(e9);
                return;
            }
            do {
                c3509lL.d(bVar.o());
                if (bVar.d()) {
                    return;
                } else {
                    i = bVar.j();
                }
            } while (i == this.f35257n);
        } else {
            int i9 = this.f35257n & 7;
            if (i9 != 0) {
                if (i9 != 2) {
                    throw new C3241gL();
                }
                int e10 = bVar.e() + bVar.y();
                do {
                    interfaceC3026cL.add(Long.valueOf(bVar.o()));
                } while (bVar.e() < e10);
                y(e10);
                return;
            }
            do {
                interfaceC3026cL.add(Long.valueOf(bVar.o()));
                if (bVar.d()) {
                    return;
                } else {
                    j6 = bVar.j();
                }
            } while (j6 == this.f35257n);
            i = j6;
        }
        this.f35259v = i;
    }

    public void a(InterfaceC3026cL interfaceC3026cL) {
        int j6;
        int i;
        boolean z3 = interfaceC3026cL instanceof C3509lL;
        W7.b bVar = (W7.b) this.f35260w;
        if (z3) {
            C3509lL c3509lL = (C3509lL) interfaceC3026cL;
            int i6 = this.f35257n & 7;
            if (i6 != 0) {
                if (i6 != 2) {
                    throw new C3241gL();
                }
                int e9 = bVar.e() + bVar.y();
                do {
                    c3509lL.d(bVar.q());
                } while (bVar.e() < e9);
                y(e9);
                return;
            }
            do {
                c3509lL.d(bVar.q());
                if (bVar.d()) {
                    return;
                } else {
                    i = bVar.j();
                }
            } while (i == this.f35257n);
        } else {
            int i9 = this.f35257n & 7;
            if (i9 != 0) {
                if (i9 != 2) {
                    throw new C3241gL();
                }
                int e10 = bVar.e() + bVar.y();
                do {
                    interfaceC3026cL.add(Long.valueOf(bVar.q()));
                } while (bVar.e() < e10);
                y(e10);
                return;
            }
            do {
                interfaceC3026cL.add(Long.valueOf(bVar.q()));
                if (bVar.d()) {
                    return;
                } else {
                    j6 = bVar.j();
                }
            } while (j6 == this.f35257n);
            i = j6;
        }
        this.f35259v = i;
    }

    public void b(InterfaceC3026cL interfaceC3026cL) {
        int j6;
        int i;
        boolean z3 = interfaceC3026cL instanceof WK;
        W7.b bVar = (W7.b) this.f35260w;
        if (z3) {
            WK wk = (WK) interfaceC3026cL;
            int i6 = this.f35257n & 7;
            if (i6 != 0) {
                if (i6 != 2) {
                    throw new C3241gL();
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
            } while (i == this.f35257n);
        } else {
            int i9 = this.f35257n & 7;
            if (i9 != 0) {
                if (i9 != 2) {
                    throw new C3241gL();
                }
                int e10 = bVar.e() + bVar.y();
                do {
                    interfaceC3026cL.add(Integer.valueOf(bVar.r()));
                } while (bVar.e() < e10);
                y(e10);
                return;
            }
            do {
                interfaceC3026cL.add(Integer.valueOf(bVar.r()));
                if (bVar.d()) {
                    return;
                } else {
                    j6 = bVar.j();
                }
            } while (j6 == this.f35257n);
            i = j6;
        }
        this.f35259v = i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4026v
    public synchronized C3972u c() {
        C3972u c3972u;
        try {
            int i = this.f35258u + 1;
            this.f35258u = i;
            int i6 = this.f35259v;
            if (i6 > 0) {
                C3972u[] c3972uArr = (C3972u[]) this.f35260w;
                int i9 = i6 - 1;
                this.f35259v = i9;
                c3972u = c3972uArr[i9];
                if (c3972u == null) {
                    throw null;
                }
                c3972uArr[i9] = null;
            } else {
                c3972u = new C3972u(new byte[com.anythink.basead.exoplayer.b.aX]);
                C3972u[] c3972uArr2 = (C3972u[]) this.f35260w;
                int length = c3972uArr2.length;
                if (i > length) {
                    this.f35260w = (C3972u[]) Arrays.copyOf(c3972uArr2, length + length);
                    return c3972u;
                }
            }
            return c3972u;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void d(InterfaceC3026cL interfaceC3026cL) {
        int j6;
        int i;
        boolean z3 = interfaceC3026cL instanceof C3509lL;
        W7.b bVar = (W7.b) this.f35260w;
        if (z3) {
            C3509lL c3509lL = (C3509lL) interfaceC3026cL;
            int i6 = this.f35257n & 7;
            if (i6 != 1) {
                if (i6 != 2) {
                    throw new C3241gL();
                }
                int y7 = bVar.y();
                A(y7);
                int e9 = bVar.e() + y7;
                do {
                    c3509lL.d(bVar.s());
                } while (bVar.e() < e9);
                return;
            }
            do {
                c3509lL.d(bVar.s());
                if (bVar.d()) {
                    return;
                } else {
                    i = bVar.j();
                }
            } while (i == this.f35257n);
        } else {
            int i9 = this.f35257n & 7;
            if (i9 != 1) {
                if (i9 != 2) {
                    throw new C3241gL();
                }
                int y9 = bVar.y();
                A(y9);
                int e10 = bVar.e() + y9;
                do {
                    interfaceC3026cL.add(Long.valueOf(bVar.s()));
                } while (bVar.e() < e10);
                return;
            }
            do {
                interfaceC3026cL.add(Long.valueOf(bVar.s()));
                if (bVar.d()) {
                    return;
                } else {
                    j6 = bVar.j();
                }
            } while (j6 == this.f35257n);
            i = j6;
        }
        this.f35259v = i;
    }

    public void e(InterfaceC3026cL interfaceC3026cL) {
        int j6;
        int i;
        boolean z3 = interfaceC3026cL instanceof WK;
        W7.b bVar = (W7.b) this.f35260w;
        if (z3) {
            WK wk = (WK) interfaceC3026cL;
            int i6 = this.f35257n & 7;
            if (i6 == 2) {
                int y7 = bVar.y();
                z(y7);
                int e9 = bVar.e() + y7;
                do {
                    wk.e(bVar.t());
                } while (bVar.e() < e9);
                return;
            }
            if (i6 != 5) {
                throw new C3241gL();
            }
            do {
                wk.e(bVar.t());
                if (bVar.d()) {
                    return;
                } else {
                    i = bVar.j();
                }
            } while (i == this.f35257n);
        } else {
            int i9 = this.f35257n & 7;
            if (i9 == 2) {
                int y9 = bVar.y();
                z(y9);
                int e10 = bVar.e() + y9;
                do {
                    interfaceC3026cL.add(Integer.valueOf(bVar.t()));
                } while (bVar.e() < e10);
                return;
            }
            if (i9 != 5) {
                throw new C3241gL();
            }
            do {
                interfaceC3026cL.add(Integer.valueOf(bVar.t()));
                if (bVar.d()) {
                    return;
                } else {
                    j6 = bVar.j();
                }
            } while (j6 == this.f35257n);
            i = j6;
        }
        this.f35259v = i;
    }

    public void f(InterfaceC3026cL interfaceC3026cL) {
        int j6;
        int i = this.f35257n & 7;
        W7.b bVar = (W7.b) this.f35260w;
        if (i == 0) {
            do {
                interfaceC3026cL.add(Boolean.valueOf(bVar.u()));
                if (bVar.d()) {
                    return;
                } else {
                    j6 = bVar.j();
                }
            } while (j6 == this.f35257n);
            this.f35259v = j6;
            return;
        }
        if (i != 2) {
            throw new C3241gL();
        }
        int e9 = bVar.e() + bVar.y();
        do {
            interfaceC3026cL.add(Boolean.valueOf(bVar.u()));
        } while (bVar.e() < e9);
        y(e9);
    }

    public void g(InterfaceC3026cL interfaceC3026cL, boolean z3) {
        String v9;
        int j6;
        if ((this.f35257n & 7) != 2) {
            throw new C3241gL();
        }
        do {
            W7.b bVar = (W7.b) this.f35260w;
            if (z3) {
                u(2);
                v9 = bVar.w();
            } else {
                u(2);
                v9 = bVar.v();
            }
            interfaceC3026cL.add(v9);
            if (bVar.d()) {
                return;
            } else {
                j6 = bVar.j();
            }
        } while (j6 == this.f35257n);
        this.f35259v = j6;
    }

    public void h(InterfaceC3026cL interfaceC3026cL, DL dl, PK pk) {
        int j6;
        int i = this.f35257n;
        if ((i & 7) != 2) {
            throw new C3241gL();
        }
        do {
            VK c9 = dl.c();
            v(c9, dl, pk);
            dl.g(c9);
            interfaceC3026cL.add(c9);
            W7.b bVar = (W7.b) this.f35260w;
            if (bVar.d() || this.f35259v != 0) {
                return;
            } else {
                j6 = bVar.j();
            }
        } while (j6 == i);
        this.f35259v = j6;
    }

    public void i(InterfaceC3026cL interfaceC3026cL, DL dl, PK pk) {
        int j6;
        int i = this.f35257n;
        if ((i & 7) != 3) {
            throw new C3241gL();
        }
        do {
            VK c9 = dl.c();
            w(c9, dl, pk);
            dl.g(c9);
            interfaceC3026cL.add(c9);
            W7.b bVar = (W7.b) this.f35260w;
            if (bVar.d() || this.f35259v != 0) {
                return;
            } else {
                j6 = bVar.j();
            }
        } while (j6 == i);
        this.f35259v = j6;
    }

    public void j(InterfaceC3026cL interfaceC3026cL) {
        int j6;
        if ((this.f35257n & 7) != 2) {
            throw new C3241gL();
        }
        do {
            interfaceC3026cL.add(D());
            W7.b bVar = (W7.b) this.f35260w;
            if (bVar.d()) {
                return;
            } else {
                j6 = bVar.j();
            }
        } while (j6 == this.f35257n);
        this.f35259v = j6;
    }

    public void k(InterfaceC3026cL interfaceC3026cL) {
        int j6;
        int i;
        boolean z3 = interfaceC3026cL instanceof WK;
        W7.b bVar = (W7.b) this.f35260w;
        if (z3) {
            WK wk = (WK) interfaceC3026cL;
            int i6 = this.f35257n & 7;
            if (i6 != 0) {
                if (i6 != 2) {
                    throw new C3241gL();
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
            } while (i == this.f35257n);
        } else {
            int i9 = this.f35257n & 7;
            if (i9 != 0) {
                if (i9 != 2) {
                    throw new C3241gL();
                }
                int e10 = bVar.e() + bVar.y();
                do {
                    interfaceC3026cL.add(Integer.valueOf(bVar.y()));
                } while (bVar.e() < e10);
                y(e10);
                return;
            }
            do {
                interfaceC3026cL.add(Integer.valueOf(bVar.y()));
                if (bVar.d()) {
                    return;
                } else {
                    j6 = bVar.j();
                }
            } while (j6 == this.f35257n);
            i = j6;
        }
        this.f35259v = i;
    }

    public void l(InterfaceC3026cL interfaceC3026cL) {
        int j6;
        int i;
        boolean z3 = interfaceC3026cL instanceof WK;
        W7.b bVar = (W7.b) this.f35260w;
        if (z3) {
            WK wk = (WK) interfaceC3026cL;
            int i6 = this.f35257n & 7;
            if (i6 != 0) {
                if (i6 != 2) {
                    throw new C3241gL();
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
            } while (i == this.f35257n);
        } else {
            int i9 = this.f35257n & 7;
            if (i9 != 0) {
                if (i9 != 2) {
                    throw new C3241gL();
                }
                int e10 = bVar.e() + bVar.y();
                do {
                    interfaceC3026cL.add(Integer.valueOf(bVar.z()));
                } while (bVar.e() < e10);
                y(e10);
                return;
            }
            do {
                interfaceC3026cL.add(Integer.valueOf(bVar.z()));
                if (bVar.d()) {
                    return;
                } else {
                    j6 = bVar.j();
                }
            } while (j6 == this.f35257n);
            i = j6;
        }
        this.f35259v = i;
    }

    public void m(InterfaceC3026cL interfaceC3026cL) {
        int j6;
        int i;
        boolean z3 = interfaceC3026cL instanceof WK;
        W7.b bVar = (W7.b) this.f35260w;
        if (z3) {
            WK wk = (WK) interfaceC3026cL;
            int i6 = this.f35257n & 7;
            if (i6 == 2) {
                int y7 = bVar.y();
                z(y7);
                int e9 = bVar.e() + y7;
                do {
                    wk.e(bVar.A());
                } while (bVar.e() < e9);
                return;
            }
            if (i6 != 5) {
                throw new C3241gL();
            }
            do {
                wk.e(bVar.A());
                if (bVar.d()) {
                    return;
                } else {
                    i = bVar.j();
                }
            } while (i == this.f35257n);
        } else {
            int i9 = this.f35257n & 7;
            if (i9 == 2) {
                int y9 = bVar.y();
                z(y9);
                int e10 = bVar.e() + y9;
                do {
                    interfaceC3026cL.add(Integer.valueOf(bVar.A()));
                } while (bVar.e() < e10);
                return;
            }
            if (i9 != 5) {
                throw new C3241gL();
            }
            do {
                interfaceC3026cL.add(Integer.valueOf(bVar.A()));
                if (bVar.d()) {
                    return;
                } else {
                    j6 = bVar.j();
                }
            } while (j6 == this.f35257n);
            i = j6;
        }
        this.f35259v = i;
    }

    public void n(InterfaceC3026cL interfaceC3026cL) {
        int j6;
        int i;
        boolean z3 = interfaceC3026cL instanceof C3509lL;
        W7.b bVar = (W7.b) this.f35260w;
        if (z3) {
            C3509lL c3509lL = (C3509lL) interfaceC3026cL;
            int i6 = this.f35257n & 7;
            if (i6 != 1) {
                if (i6 != 2) {
                    throw new C3241gL();
                }
                int y7 = bVar.y();
                A(y7);
                int e9 = bVar.e() + y7;
                do {
                    c3509lL.d(bVar.B());
                } while (bVar.e() < e9);
                return;
            }
            do {
                c3509lL.d(bVar.B());
                if (bVar.d()) {
                    return;
                } else {
                    i = bVar.j();
                }
            } while (i == this.f35257n);
        } else {
            int i9 = this.f35257n & 7;
            if (i9 != 1) {
                if (i9 != 2) {
                    throw new C3241gL();
                }
                int y9 = bVar.y();
                A(y9);
                int e10 = bVar.e() + y9;
                do {
                    interfaceC3026cL.add(Long.valueOf(bVar.B()));
                } while (bVar.e() < e10);
                return;
            }
            do {
                interfaceC3026cL.add(Long.valueOf(bVar.B()));
                if (bVar.d()) {
                    return;
                } else {
                    j6 = bVar.j();
                }
            } while (j6 == this.f35257n);
            i = j6;
        }
        this.f35259v = i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4026v
    public synchronized void o() {
        int i = this.f35257n;
        String str = AbstractC3159eu.f29993a;
        int max = Math.max(0, ((i + 65535) / com.anythink.basead.exoplayer.b.aX) - this.f35258u);
        int i6 = this.f35259v;
        if (max >= i6) {
            return;
        }
        Arrays.fill((C3972u[]) this.f35260w, max, i6, (Object) null);
        this.f35259v = max;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4026v
    public synchronized void p(C3972u c3972u) {
        C3972u[] c3972uArr = (C3972u[]) this.f35260w;
        int i = this.f35259v;
        this.f35259v = i + 1;
        c3972uArr[i] = c3972u;
        this.f35258u--;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4026v
    public synchronized void q(G2 g22) {
        while (g22 != null) {
            C3972u[] c3972uArr = (C3972u[]) this.f35260w;
            int i = this.f35259v;
            this.f35259v = i + 1;
            C3972u c3972u = (C3972u) g22.f24909v;
            c3972u.getClass();
            c3972uArr[i] = c3972u;
            this.f35258u--;
            g22 = (G2) g22.f24910w;
            if (g22 == null || ((C3972u) g22.f24909v) == null) {
                g22 = null;
            }
        }
    }

    public void r(InterfaceC3026cL interfaceC3026cL) {
        int j6;
        int i;
        boolean z3 = interfaceC3026cL instanceof WK;
        W7.b bVar = (W7.b) this.f35260w;
        if (z3) {
            WK wk = (WK) interfaceC3026cL;
            int i6 = this.f35257n & 7;
            if (i6 != 0) {
                if (i6 != 2) {
                    throw new C3241gL();
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
            } while (i == this.f35257n);
        } else {
            int i9 = this.f35257n & 7;
            if (i9 != 0) {
                if (i9 != 2) {
                    throw new C3241gL();
                }
                int e10 = bVar.e() + bVar.y();
                do {
                    interfaceC3026cL.add(Integer.valueOf(bVar.C()));
                } while (bVar.e() < e10);
                y(e10);
                return;
            }
            do {
                interfaceC3026cL.add(Integer.valueOf(bVar.C()));
                if (bVar.d()) {
                    return;
                } else {
                    j6 = bVar.j();
                }
            } while (j6 == this.f35257n);
            i = j6;
        }
        this.f35259v = i;
    }

    public void s(InterfaceC3026cL interfaceC3026cL) {
        int j6;
        int i;
        boolean z3 = interfaceC3026cL instanceof C3509lL;
        W7.b bVar = (W7.b) this.f35260w;
        if (z3) {
            C3509lL c3509lL = (C3509lL) interfaceC3026cL;
            int i6 = this.f35257n & 7;
            if (i6 != 0) {
                if (i6 != 2) {
                    throw new C3241gL();
                }
                int e9 = bVar.e() + bVar.y();
                do {
                    c3509lL.d(bVar.D());
                } while (bVar.e() < e9);
                y(e9);
                return;
            }
            do {
                c3509lL.d(bVar.D());
                if (bVar.d()) {
                    return;
                } else {
                    i = bVar.j();
                }
            } while (i == this.f35257n);
        } else {
            int i9 = this.f35257n & 7;
            if (i9 != 0) {
                if (i9 != 2) {
                    throw new C3241gL();
                }
                int e10 = bVar.e() + bVar.y();
                do {
                    interfaceC3026cL.add(Long.valueOf(bVar.D()));
                } while (bVar.e() < e10);
                y(e10);
                return;
            }
            do {
                interfaceC3026cL.add(Long.valueOf(bVar.D()));
                if (bVar.d()) {
                    return;
                } else {
                    j6 = bVar.j();
                }
            } while (j6 == this.f35257n);
            i = j6;
        }
        this.f35259v = i;
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
    public void t(C3617nL c3617nL, C4274ze c4274ze, PK pk) {
        int i;
        boolean z3;
        int i6;
        u(2);
        W7.b bVar = (W7.b) this.f35260w;
        int b9 = bVar.b(bVar.y());
        C3592mx c3592mx = (C3592mx) c4274ze.f35362w;
        Object obj = "";
        Object obj2 = c3592mx;
        while (true) {
            try {
                int B9 = B();
                if (B9 == Integer.MAX_VALUE || bVar.d()) {
                    break;
                }
                boolean z6 = false;
                if (B9 == 1) {
                    obj = x((SL) c4274ze.f35360u, null, null);
                } else if (B9 != 2) {
                    try {
                        if (!bVar.d() && (i6 = this.f35257n) != this.f35258u) {
                            z3 = bVar.l(i6);
                            if (z3) {
                                throw new C3295hL("Unable to parse map entry.");
                            }
                        }
                        z3 = false;
                        if (z3) {
                        }
                    } catch (C3241gL e9) {
                        if (!bVar.d() && (i = this.f35257n) != this.f35258u) {
                            z6 = bVar.l(i);
                        }
                        throw new C3295hL("Unable to parse map entry.", e9);
                    }
                } else {
                    obj2 = x((SL) c4274ze.f35361v, c3592mx.getClass(), pk);
                }
            } catch (Throwable th) {
                bVar.c(b9);
                throw th;
            }
        }
    }

    public void u(int i) {
        if ((this.f35257n & 7) != i) {
            throw new C3241gL();
        }
    }

    public void v(Object obj, DL dl, PK pk) {
        W7.b bVar = (W7.b) this.f35260w;
        int y7 = bVar.y();
        if (bVar.f3414n + bVar.f3415u >= 100) {
            throw new C3295hL("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int b9 = bVar.b(y7);
        bVar.f3414n++;
        dl.b(obj, this, pk);
        bVar.k(0);
        bVar.f3414n--;
        bVar.c(b9);
    }

    public void w(Object obj, DL dl, PK pk) {
        int i = this.f35258u;
        this.f35258u = ((this.f35257n >>> 3) << 3) | 4;
        try {
            dl.b(obj, this, pk);
            if (this.f35257n == this.f35258u) {
            } else {
                throw new C3295hL("Failed to parse the message.");
            }
        } finally {
            this.f35258u = i;
        }
    }

    public Object x(SL sl, Class cls, PK pk) {
        SL sl2 = SL.f27472v;
        int ordinal = sl.ordinal();
        W7.b bVar = (W7.b) this.f35260w;
        switch (ordinal) {
            case 0:
                u(1);
                return Double.valueOf(bVar.m());
            case 1:
                u(5);
                return Float.valueOf(bVar.n());
            case 2:
                u(0);
                return Long.valueOf(bVar.q());
            case 3:
                u(0);
                return Long.valueOf(bVar.o());
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
                DL a9 = C4156xL.f34990c.a(cls);
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
        if (((W7.b) this.f35260w).e() != i) {
            throw new C3295hL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public C4242z(W7.b bVar) {
        this.f35259v = 0;
        bVar.getClass();
        this.f35260w = bVar;
        bVar.f3416v = this;
    }
}
