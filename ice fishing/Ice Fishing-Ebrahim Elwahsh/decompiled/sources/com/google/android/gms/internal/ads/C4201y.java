package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.y, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4201y implements InterfaceC3985u {

    /* renamed from: n, reason: collision with root package name */
    public int f35292n;

    /* renamed from: u, reason: collision with root package name */
    public int f35293u;

    /* renamed from: v, reason: collision with root package name */
    public int f35294v;

    /* renamed from: w, reason: collision with root package name */
    public Object f35295w;

    public C4201y() {
        this.f35294v = 0;
        this.f35295w = new C3931t[100];
    }

    public static final void A(int i) {
        if ((i & 7) != 0) {
            throw new C3845rL("Failed to parse the message.");
        }
    }

    public static final void z(int i) {
        if ((i & 3) != 0) {
            throw new C3845rL("Failed to parse the message.");
        }
    }

    public int B() {
        int i = this.f35294v;
        if (i != 0) {
            this.f35292n = i;
            this.f35294v = 0;
        } else {
            i = ((S7.b) this.f35295w).k();
            this.f35292n = i;
        }
        if (i == 0 || i == this.f35293u) {
            return Integer.MAX_VALUE;
        }
        return i >>> 3;
    }

    public synchronized void C(int i) {
        int i4 = this.f35292n;
        this.f35292n = i;
        if (i < i4) {
            o();
        }
    }

    public SK D() {
        u(2);
        return ((S7.b) this.f35295w).x();
    }

    public void E(InterfaceC3630nL interfaceC3630nL) {
        int k6;
        int i = this.f35292n & 7;
        S7.b bVar = (S7.b) this.f35295w;
        if (i == 1) {
            do {
                interfaceC3630nL.add(Double.valueOf(bVar.n()));
                if (bVar.d()) {
                    return;
                } else {
                    k6 = bVar.k();
                }
            } while (k6 == this.f35292n);
            this.f35294v = k6;
            return;
        }
        if (i != 2) {
            throw new C3792qL();
        }
        int y6 = bVar.y();
        A(y6);
        int e6 = bVar.e() + y6;
        do {
            interfaceC3630nL.add(Double.valueOf(bVar.n()));
        } while (bVar.e() < e6);
    }

    public void F(InterfaceC3630nL interfaceC3630nL) {
        int k6;
        int i = this.f35292n & 7;
        S7.b bVar = (S7.b) this.f35295w;
        if (i == 2) {
            int y6 = bVar.y();
            z(y6);
            int e6 = bVar.e() + y6;
            do {
                interfaceC3630nL.add(Float.valueOf(bVar.o()));
            } while (bVar.e() < e6);
            return;
        }
        if (i != 5) {
            throw new C3792qL();
        }
        do {
            interfaceC3630nL.add(Float.valueOf(bVar.o()));
            if (bVar.d()) {
                return;
            } else {
                k6 = bVar.k();
            }
        } while (k6 == this.f35292n);
        this.f35294v = k6;
    }

    public void G(InterfaceC3630nL interfaceC3630nL) {
        int k6;
        int i;
        boolean z8 = interfaceC3630nL instanceof C4061vL;
        S7.b bVar = (S7.b) this.f35295w;
        if (z8) {
            C4061vL c4061vL = (C4061vL) interfaceC3630nL;
            int i4 = this.f35292n & 7;
            if (i4 != 0) {
                if (i4 != 2) {
                    throw new C3792qL();
                }
                int e6 = bVar.e() + bVar.y();
                do {
                    c4061vL.d(bVar.p());
                } while (bVar.e() < e6);
                y(e6);
                return;
            }
            do {
                c4061vL.d(bVar.p());
                if (bVar.d()) {
                    return;
                } else {
                    i = bVar.k();
                }
            } while (i == this.f35292n);
        } else {
            int i9 = this.f35292n & 7;
            if (i9 != 0) {
                if (i9 != 2) {
                    throw new C3792qL();
                }
                int e9 = bVar.e() + bVar.y();
                do {
                    interfaceC3630nL.add(Long.valueOf(bVar.p()));
                } while (bVar.e() < e9);
                y(e9);
                return;
            }
            do {
                interfaceC3630nL.add(Long.valueOf(bVar.p()));
                if (bVar.d()) {
                    return;
                } else {
                    k6 = bVar.k();
                }
            } while (k6 == this.f35292n);
            i = k6;
        }
        this.f35294v = i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3985u
    public synchronized C3931t a() {
        C3931t c3931t;
        try {
            int i = this.f35293u + 1;
            this.f35293u = i;
            int i4 = this.f35294v;
            if (i4 > 0) {
                C3931t[] c3931tArr = (C3931t[]) this.f35295w;
                int i9 = i4 - 1;
                this.f35294v = i9;
                c3931t = c3931tArr[i9];
                if (c3931t == null) {
                    throw null;
                }
                c3931tArr[i9] = null;
            } else {
                c3931t = new C3931t(new byte[com.anythink.basead.exoplayer.b.aX]);
                C3931t[] c3931tArr2 = (C3931t[]) this.f35295w;
                int length = c3931tArr2.length;
                if (i > length) {
                    this.f35295w = (C3931t[]) Arrays.copyOf(c3931tArr2, length + length);
                    return c3931t;
                }
            }
            return c3931t;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void b(InterfaceC3630nL interfaceC3630nL) {
        int k6;
        int i;
        boolean z8 = interfaceC3630nL instanceof C4061vL;
        S7.b bVar = (S7.b) this.f35295w;
        if (z8) {
            C4061vL c4061vL = (C4061vL) interfaceC3630nL;
            int i4 = this.f35292n & 7;
            if (i4 != 0) {
                if (i4 != 2) {
                    throw new C3792qL();
                }
                int e6 = bVar.e() + bVar.y();
                do {
                    c4061vL.d(bVar.q());
                } while (bVar.e() < e6);
                y(e6);
                return;
            }
            do {
                c4061vL.d(bVar.q());
                if (bVar.d()) {
                    return;
                } else {
                    i = bVar.k();
                }
            } while (i == this.f35292n);
        } else {
            int i9 = this.f35292n & 7;
            if (i9 != 0) {
                if (i9 != 2) {
                    throw new C3792qL();
                }
                int e9 = bVar.e() + bVar.y();
                do {
                    interfaceC3630nL.add(Long.valueOf(bVar.q()));
                } while (bVar.e() < e9);
                y(e9);
                return;
            }
            do {
                interfaceC3630nL.add(Long.valueOf(bVar.q()));
                if (bVar.d()) {
                    return;
                } else {
                    k6 = bVar.k();
                }
            } while (k6 == this.f35292n);
            i = k6;
        }
        this.f35294v = i;
    }

    public void c(InterfaceC3630nL interfaceC3630nL) {
        int k6;
        int i;
        boolean z8 = interfaceC3630nL instanceof C3254gL;
        S7.b bVar = (S7.b) this.f35295w;
        if (z8) {
            C3254gL c3254gL = (C3254gL) interfaceC3630nL;
            int i4 = this.f35292n & 7;
            if (i4 != 0) {
                if (i4 != 2) {
                    throw new C3792qL();
                }
                int e6 = bVar.e() + bVar.y();
                do {
                    c3254gL.e(bVar.r());
                } while (bVar.e() < e6);
                y(e6);
                return;
            }
            do {
                c3254gL.e(bVar.r());
                if (bVar.d()) {
                    return;
                } else {
                    i = bVar.k();
                }
            } while (i == this.f35292n);
        } else {
            int i9 = this.f35292n & 7;
            if (i9 != 0) {
                if (i9 != 2) {
                    throw new C3792qL();
                }
                int e9 = bVar.e() + bVar.y();
                do {
                    interfaceC3630nL.add(Integer.valueOf(bVar.r()));
                } while (bVar.e() < e9);
                y(e9);
                return;
            }
            do {
                interfaceC3630nL.add(Integer.valueOf(bVar.r()));
                if (bVar.d()) {
                    return;
                } else {
                    k6 = bVar.k();
                }
            } while (k6 == this.f35292n);
            i = k6;
        }
        this.f35294v = i;
    }

    public void d(InterfaceC3630nL interfaceC3630nL) {
        int k6;
        int i;
        boolean z8 = interfaceC3630nL instanceof C4061vL;
        S7.b bVar = (S7.b) this.f35295w;
        if (z8) {
            C4061vL c4061vL = (C4061vL) interfaceC3630nL;
            int i4 = this.f35292n & 7;
            if (i4 != 1) {
                if (i4 != 2) {
                    throw new C3792qL();
                }
                int y6 = bVar.y();
                A(y6);
                int e6 = bVar.e() + y6;
                do {
                    c4061vL.d(bVar.s());
                } while (bVar.e() < e6);
                return;
            }
            do {
                c4061vL.d(bVar.s());
                if (bVar.d()) {
                    return;
                } else {
                    i = bVar.k();
                }
            } while (i == this.f35292n);
        } else {
            int i9 = this.f35292n & 7;
            if (i9 != 1) {
                if (i9 != 2) {
                    throw new C3792qL();
                }
                int y8 = bVar.y();
                A(y8);
                int e9 = bVar.e() + y8;
                do {
                    interfaceC3630nL.add(Long.valueOf(bVar.s()));
                } while (bVar.e() < e9);
                return;
            }
            do {
                interfaceC3630nL.add(Long.valueOf(bVar.s()));
                if (bVar.d()) {
                    return;
                } else {
                    k6 = bVar.k();
                }
            } while (k6 == this.f35292n);
            i = k6;
        }
        this.f35294v = i;
    }

    public void e(InterfaceC3630nL interfaceC3630nL) {
        int k6;
        int i;
        boolean z8 = interfaceC3630nL instanceof C3254gL;
        S7.b bVar = (S7.b) this.f35295w;
        if (z8) {
            C3254gL c3254gL = (C3254gL) interfaceC3630nL;
            int i4 = this.f35292n & 7;
            if (i4 == 2) {
                int y6 = bVar.y();
                z(y6);
                int e6 = bVar.e() + y6;
                do {
                    c3254gL.e(bVar.t());
                } while (bVar.e() < e6);
                return;
            }
            if (i4 != 5) {
                throw new C3792qL();
            }
            do {
                c3254gL.e(bVar.t());
                if (bVar.d()) {
                    return;
                } else {
                    i = bVar.k();
                }
            } while (i == this.f35292n);
        } else {
            int i9 = this.f35292n & 7;
            if (i9 == 2) {
                int y8 = bVar.y();
                z(y8);
                int e9 = bVar.e() + y8;
                do {
                    interfaceC3630nL.add(Integer.valueOf(bVar.t()));
                } while (bVar.e() < e9);
                return;
            }
            if (i9 != 5) {
                throw new C3792qL();
            }
            do {
                interfaceC3630nL.add(Integer.valueOf(bVar.t()));
                if (bVar.d()) {
                    return;
                } else {
                    k6 = bVar.k();
                }
            } while (k6 == this.f35292n);
            i = k6;
        }
        this.f35294v = i;
    }

    public void f(InterfaceC3630nL interfaceC3630nL) {
        int k6;
        int i = this.f35292n & 7;
        S7.b bVar = (S7.b) this.f35295w;
        if (i == 0) {
            do {
                interfaceC3630nL.add(Boolean.valueOf(bVar.u()));
                if (bVar.d()) {
                    return;
                } else {
                    k6 = bVar.k();
                }
            } while (k6 == this.f35292n);
            this.f35294v = k6;
            return;
        }
        if (i != 2) {
            throw new C3792qL();
        }
        int e6 = bVar.e() + bVar.y();
        do {
            interfaceC3630nL.add(Boolean.valueOf(bVar.u()));
        } while (bVar.e() < e6);
        y(e6);
    }

    public void g(InterfaceC3630nL interfaceC3630nL, boolean z8) {
        String v6;
        int k6;
        if ((this.f35292n & 7) != 2) {
            throw new C3792qL();
        }
        do {
            S7.b bVar = (S7.b) this.f35295w;
            if (z8) {
                u(2);
                v6 = bVar.w();
            } else {
                u(2);
                v6 = bVar.v();
            }
            interfaceC3630nL.add(v6);
            if (bVar.d()) {
                return;
            } else {
                k6 = bVar.k();
            }
        } while (k6 == this.f35292n);
        this.f35294v = k6;
    }

    public void h(InterfaceC3630nL interfaceC3630nL, OL ol, YK yk) {
        int k6;
        int i = this.f35292n;
        if ((i & 7) != 2) {
            throw new C3792qL();
        }
        do {
            AbstractC3199fL a9 = ol.a();
            v(a9, ol, yk);
            ol.h(a9);
            interfaceC3630nL.add(a9);
            S7.b bVar = (S7.b) this.f35295w;
            if (bVar.d() || this.f35294v != 0) {
                return;
            } else {
                k6 = bVar.k();
            }
        } while (k6 == i);
        this.f35294v = k6;
    }

    public void i(InterfaceC3630nL interfaceC3630nL, OL ol, YK yk) {
        int k6;
        int i = this.f35292n;
        if ((i & 7) != 3) {
            throw new C3792qL();
        }
        do {
            AbstractC3199fL a9 = ol.a();
            w(a9, ol, yk);
            ol.h(a9);
            interfaceC3630nL.add(a9);
            S7.b bVar = (S7.b) this.f35295w;
            if (bVar.d() || this.f35294v != 0) {
                return;
            } else {
                k6 = bVar.k();
            }
        } while (k6 == i);
        this.f35294v = k6;
    }

    public void j(InterfaceC3630nL interfaceC3630nL) {
        int k6;
        if ((this.f35292n & 7) != 2) {
            throw new C3792qL();
        }
        do {
            interfaceC3630nL.add(D());
            S7.b bVar = (S7.b) this.f35295w;
            if (bVar.d()) {
                return;
            } else {
                k6 = bVar.k();
            }
        } while (k6 == this.f35292n);
        this.f35294v = k6;
    }

    public void k(InterfaceC3630nL interfaceC3630nL) {
        int k6;
        int i;
        boolean z8 = interfaceC3630nL instanceof C3254gL;
        S7.b bVar = (S7.b) this.f35295w;
        if (z8) {
            C3254gL c3254gL = (C3254gL) interfaceC3630nL;
            int i4 = this.f35292n & 7;
            if (i4 != 0) {
                if (i4 != 2) {
                    throw new C3792qL();
                }
                int e6 = bVar.e() + bVar.y();
                do {
                    c3254gL.e(bVar.y());
                } while (bVar.e() < e6);
                y(e6);
                return;
            }
            do {
                c3254gL.e(bVar.y());
                if (bVar.d()) {
                    return;
                } else {
                    i = bVar.k();
                }
            } while (i == this.f35292n);
        } else {
            int i9 = this.f35292n & 7;
            if (i9 != 0) {
                if (i9 != 2) {
                    throw new C3792qL();
                }
                int e9 = bVar.e() + bVar.y();
                do {
                    interfaceC3630nL.add(Integer.valueOf(bVar.y()));
                } while (bVar.e() < e9);
                y(e9);
                return;
            }
            do {
                interfaceC3630nL.add(Integer.valueOf(bVar.y()));
                if (bVar.d()) {
                    return;
                } else {
                    k6 = bVar.k();
                }
            } while (k6 == this.f35292n);
            i = k6;
        }
        this.f35294v = i;
    }

    public void l(InterfaceC3630nL interfaceC3630nL) {
        int k6;
        int i;
        boolean z8 = interfaceC3630nL instanceof C3254gL;
        S7.b bVar = (S7.b) this.f35295w;
        if (z8) {
            C3254gL c3254gL = (C3254gL) interfaceC3630nL;
            int i4 = this.f35292n & 7;
            if (i4 != 0) {
                if (i4 != 2) {
                    throw new C3792qL();
                }
                int e6 = bVar.e() + bVar.y();
                do {
                    c3254gL.e(bVar.z());
                } while (bVar.e() < e6);
                y(e6);
                return;
            }
            do {
                c3254gL.e(bVar.z());
                if (bVar.d()) {
                    return;
                } else {
                    i = bVar.k();
                }
            } while (i == this.f35292n);
        } else {
            int i9 = this.f35292n & 7;
            if (i9 != 0) {
                if (i9 != 2) {
                    throw new C3792qL();
                }
                int e9 = bVar.e() + bVar.y();
                do {
                    interfaceC3630nL.add(Integer.valueOf(bVar.z()));
                } while (bVar.e() < e9);
                y(e9);
                return;
            }
            do {
                interfaceC3630nL.add(Integer.valueOf(bVar.z()));
                if (bVar.d()) {
                    return;
                } else {
                    k6 = bVar.k();
                }
            } while (k6 == this.f35292n);
            i = k6;
        }
        this.f35294v = i;
    }

    public void m(InterfaceC3630nL interfaceC3630nL) {
        int k6;
        int i;
        boolean z8 = interfaceC3630nL instanceof C3254gL;
        S7.b bVar = (S7.b) this.f35295w;
        if (z8) {
            C3254gL c3254gL = (C3254gL) interfaceC3630nL;
            int i4 = this.f35292n & 7;
            if (i4 == 2) {
                int y6 = bVar.y();
                z(y6);
                int e6 = bVar.e() + y6;
                do {
                    c3254gL.e(bVar.A());
                } while (bVar.e() < e6);
                return;
            }
            if (i4 != 5) {
                throw new C3792qL();
            }
            do {
                c3254gL.e(bVar.A());
                if (bVar.d()) {
                    return;
                } else {
                    i = bVar.k();
                }
            } while (i == this.f35292n);
        } else {
            int i9 = this.f35292n & 7;
            if (i9 == 2) {
                int y8 = bVar.y();
                z(y8);
                int e9 = bVar.e() + y8;
                do {
                    interfaceC3630nL.add(Integer.valueOf(bVar.A()));
                } while (bVar.e() < e9);
                return;
            }
            if (i9 != 5) {
                throw new C3792qL();
            }
            do {
                interfaceC3630nL.add(Integer.valueOf(bVar.A()));
                if (bVar.d()) {
                    return;
                } else {
                    k6 = bVar.k();
                }
            } while (k6 == this.f35292n);
            i = k6;
        }
        this.f35294v = i;
    }

    public void n(InterfaceC3630nL interfaceC3630nL) {
        int k6;
        int i;
        boolean z8 = interfaceC3630nL instanceof C4061vL;
        S7.b bVar = (S7.b) this.f35295w;
        if (z8) {
            C4061vL c4061vL = (C4061vL) interfaceC3630nL;
            int i4 = this.f35292n & 7;
            if (i4 != 1) {
                if (i4 != 2) {
                    throw new C3792qL();
                }
                int y6 = bVar.y();
                A(y6);
                int e6 = bVar.e() + y6;
                do {
                    c4061vL.d(bVar.B());
                } while (bVar.e() < e6);
                return;
            }
            do {
                c4061vL.d(bVar.B());
                if (bVar.d()) {
                    return;
                } else {
                    i = bVar.k();
                }
            } while (i == this.f35292n);
        } else {
            int i9 = this.f35292n & 7;
            if (i9 != 1) {
                if (i9 != 2) {
                    throw new C3792qL();
                }
                int y8 = bVar.y();
                A(y8);
                int e9 = bVar.e() + y8;
                do {
                    interfaceC3630nL.add(Long.valueOf(bVar.B()));
                } while (bVar.e() < e9);
                return;
            }
            do {
                interfaceC3630nL.add(Long.valueOf(bVar.B()));
                if (bVar.d()) {
                    return;
                } else {
                    k6 = bVar.k();
                }
            } while (k6 == this.f35292n);
            i = k6;
        }
        this.f35294v = i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3985u
    public synchronized void o() {
        int i = this.f35292n;
        String str = AbstractC3548lu.f32613a;
        int max = Math.max(0, ((i + 65535) / com.anythink.basead.exoplayer.b.aX) - this.f35293u);
        int i4 = this.f35294v;
        if (max >= i4) {
            return;
        }
        Arrays.fill((C3931t[]) this.f35295w, max, i4, (Object) null);
        this.f35294v = max;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3985u
    public synchronized void p(C3931t c3931t) {
        C3931t[] c3931tArr = (C3931t[]) this.f35295w;
        int i = this.f35294v;
        this.f35294v = i + 1;
        c3931tArr[i] = c3931t;
        this.f35293u--;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3985u
    public synchronized void q(E2 e22) {
        while (e22 != null) {
            C3931t[] c3931tArr = (C3931t[]) this.f35295w;
            int i = this.f35294v;
            this.f35294v = i + 1;
            C3931t c3931t = (C3931t) e22.f24634v;
            c3931t.getClass();
            c3931tArr[i] = c3931t;
            this.f35293u--;
            e22 = (E2) e22.f24635w;
            if (e22 == null || ((C3931t) e22.f24634v) == null) {
                e22 = null;
            }
        }
    }

    public void r(InterfaceC3630nL interfaceC3630nL) {
        int k6;
        int i;
        boolean z8 = interfaceC3630nL instanceof C3254gL;
        S7.b bVar = (S7.b) this.f35295w;
        if (z8) {
            C3254gL c3254gL = (C3254gL) interfaceC3630nL;
            int i4 = this.f35292n & 7;
            if (i4 != 0) {
                if (i4 != 2) {
                    throw new C3792qL();
                }
                int e6 = bVar.e() + bVar.y();
                do {
                    c3254gL.e(bVar.C());
                } while (bVar.e() < e6);
                y(e6);
                return;
            }
            do {
                c3254gL.e(bVar.C());
                if (bVar.d()) {
                    return;
                } else {
                    i = bVar.k();
                }
            } while (i == this.f35292n);
        } else {
            int i9 = this.f35292n & 7;
            if (i9 != 0) {
                if (i9 != 2) {
                    throw new C3792qL();
                }
                int e9 = bVar.e() + bVar.y();
                do {
                    interfaceC3630nL.add(Integer.valueOf(bVar.C()));
                } while (bVar.e() < e9);
                y(e9);
                return;
            }
            do {
                interfaceC3630nL.add(Integer.valueOf(bVar.C()));
                if (bVar.d()) {
                    return;
                } else {
                    k6 = bVar.k();
                }
            } while (k6 == this.f35292n);
            i = k6;
        }
        this.f35294v = i;
    }

    public void s(InterfaceC3630nL interfaceC3630nL) {
        int k6;
        int i;
        boolean z8 = interfaceC3630nL instanceof C4061vL;
        S7.b bVar = (S7.b) this.f35295w;
        if (z8) {
            C4061vL c4061vL = (C4061vL) interfaceC3630nL;
            int i4 = this.f35292n & 7;
            if (i4 != 0) {
                if (i4 != 2) {
                    throw new C3792qL();
                }
                int e6 = bVar.e() + bVar.y();
                do {
                    c4061vL.d(bVar.D());
                } while (bVar.e() < e6);
                y(e6);
                return;
            }
            do {
                c4061vL.d(bVar.D());
                if (bVar.d()) {
                    return;
                } else {
                    i = bVar.k();
                }
            } while (i == this.f35292n);
        } else {
            int i9 = this.f35292n & 7;
            if (i9 != 0) {
                if (i9 != 2) {
                    throw new C3792qL();
                }
                int e9 = bVar.e() + bVar.y();
                do {
                    interfaceC3630nL.add(Long.valueOf(bVar.D()));
                } while (bVar.e() < e9);
                y(e9);
                return;
            }
            do {
                interfaceC3630nL.add(Long.valueOf(bVar.D()));
                if (bVar.d()) {
                    return;
                } else {
                    k6 = bVar.k();
                }
            } while (k6 == this.f35292n);
            i = k6;
        }
        this.f35294v = i;
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
    public void t(C4169xL c4169xL, C4017ue c4017ue, YK yk) {
        int i;
        boolean z8;
        int i4;
        u(2);
        S7.b bVar = (S7.b) this.f35295w;
        int b9 = bVar.b(bVar.y());
        C3713ox c3713ox = (C3713ox) c4017ue.f34632w;
        Object obj = "";
        Object obj2 = c3713ox;
        while (true) {
            try {
                int B8 = B();
                if (B8 == Integer.MAX_VALUE || bVar.d()) {
                    break;
                }
                boolean z9 = false;
                if (B8 == 1) {
                    obj = x((EnumC3200fM) c4017ue.f34630u, null, null);
                } else if (B8 != 2) {
                    try {
                        if (!bVar.d() && (i4 = this.f35292n) != this.f35293u) {
                            z8 = bVar.m(i4);
                            if (z8) {
                                throw new C3845rL("Unable to parse map entry.");
                            }
                        }
                        z8 = false;
                        if (z8) {
                        }
                    } catch (C3792qL e6) {
                        if (!bVar.d() && (i = this.f35292n) != this.f35293u) {
                            z9 = bVar.m(i);
                        }
                        throw new C3845rL("Unable to parse map entry.", e6);
                    }
                } else {
                    obj2 = x((EnumC3200fM) c4017ue.f34631v, c3713ox.getClass(), yk);
                }
            } catch (Throwable th) {
                bVar.c(b9);
                throw th;
            }
        }
    }

    public void u(int i) {
        if ((this.f35292n & 7) != i) {
            throw new C3792qL();
        }
    }

    public void v(Object obj, OL ol, YK yk) {
        S7.b bVar = (S7.b) this.f35295w;
        int y6 = bVar.y();
        if (bVar.f2980n + bVar.f2981u >= 100) {
            throw new C3845rL("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int b9 = bVar.b(y6);
        bVar.f2980n++;
        ol.c(obj, this, yk);
        bVar.l(0);
        bVar.f2980n--;
        bVar.c(b9);
    }

    public void w(Object obj, OL ol, YK yk) {
        int i = this.f35293u;
        this.f35293u = ((this.f35292n >>> 3) << 3) | 4;
        try {
            ol.c(obj, this, yk);
            if (this.f35292n == this.f35293u) {
            } else {
                throw new C3845rL("Failed to parse the message.");
            }
        } finally {
            this.f35293u = i;
        }
    }

    public Object x(EnumC3200fM enumC3200fM, Class cls, YK yk) {
        EnumC3200fM enumC3200fM2 = EnumC3200fM.f30691v;
        int ordinal = enumC3200fM.ordinal();
        S7.b bVar = (S7.b) this.f35295w;
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
                OL a9 = IL.f25547c.a(cls);
                AbstractC3199fL a10 = a9.a();
                v(a10, a9, yk);
                a9.h(a10);
                return a10;
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
        if (((S7.b) this.f35295w).e() != i) {
            throw new C3845rL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public C4201y(S7.b bVar) {
        this.f35294v = 0;
        bVar.getClass();
        this.f35295w = bVar;
        bVar.f2982v = this;
    }
}
