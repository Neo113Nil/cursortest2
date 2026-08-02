package defpackage;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class n8n {
    public static final q0f f = new q0f(0);
    public static final q0f g = new q0f(1);
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public int d;
    public Object e;

    public n8n(qr4 qr4Var) {
        this.a = 2;
        this.d = 0;
        use.a(qr4Var, "input");
        this.e = qr4Var;
        qr4Var.d = this;
    }

    public static void F0(int i) {
        if ((i & 3) != 0) {
            throw bye.g();
        }
    }

    public static void G0(int i) {
        if ((i & 3) != 0) {
            throw aye.d();
        }
    }

    public static void H0(int i) {
        if ((i & 3) != 0) {
            throw new cye("Failed to parse the message.");
        }
    }

    public static void I0(int i) {
        if ((i & 7) != 0) {
            throw bye.g();
        }
    }

    public static void J0(int i) {
        if ((i & 7) != 0) {
            throw aye.d();
        }
    }

    public static void K0(int i) {
        if ((i & 7) != 0) {
            throw new cye("Failed to parse the message.");
        }
    }

    public static int e(int i, int i2) {
        int i3;
        int i4 = i & 3158064;
        if (i4 == 0) {
            return i;
        }
        int i5 = i & (~i4);
        if (i2 == 0) {
            i3 = i4 >> 2;
        } else {
            int i6 = i4 >> 1;
            i5 |= (-3158065) & i6;
            i3 = (i6 & 3158064) >> 2;
        }
        return i5 | i3;
    }

    public static int f(int i, int i2) {
        int i3;
        int i4 = i & 789516;
        if (i4 == 0) {
            return i;
        }
        int i5 = i & (~i4);
        if (i2 == 0) {
            i3 = i4 << 2;
        } else {
            int i6 = i4 << 1;
            i5 |= (-789517) & i6;
            i3 = (i6 & 789516) << 2;
        }
        return i5 | i3;
    }

    public double A() {
        D0(1);
        return Double.longBitsToDouble(((kr4) this.e).h());
    }

    public void A0(int i) {
        switch (this.a) {
            case 2:
                if (((qr4) this.e).d() != i) {
                    throw bye.h();
                }
                return;
            default:
                if (((rr4) this.e).d() != i) {
                    throw cye.e();
                }
                return;
        }
    }

    public void B(sse sseVar) {
        int A;
        rr4 rr4Var = (rr4) this.e;
        int i = this.b & 7;
        if (i == 1) {
            do {
                sseVar.add(Double.valueOf(rr4Var.n()));
                if (rr4Var.e()) {
                    return;
                } else {
                    A = rr4Var.A();
                }
            } while (A == this.b);
            this.d = A;
            return;
        }
        if (i != 2) {
            throw cye.b();
        }
        int B = rr4Var.B();
        K0(B);
        int d = rr4Var.d() + B;
        do {
            sseVar.add(Double.valueOf(rr4Var.n()));
        } while (rr4Var.d() < d);
    }

    public void B0(int i) {
        if (((kr4) this.e).c() != i) {
            throw aye.e();
        }
    }

    public void C(List list) {
        int l;
        int l2;
        int z;
        int z2;
        switch (this.a) {
            case 1:
                kr4 kr4Var = (kr4) this.e;
                boolean z3 = list instanceof n8a;
                int i = this.b;
                if (!z3) {
                    int i2 = i & 7;
                    if (i2 == 1) {
                        do {
                            list.add(Double.valueOf(Double.longBitsToDouble(kr4Var.h())));
                            if (kr4Var.d()) {
                                return;
                            } else {
                                l = kr4Var.l();
                            }
                        } while (l == this.b);
                        this.d = l;
                        return;
                    }
                    if (i2 != 2) {
                        throw aye.b();
                    }
                    int i3 = kr4Var.i();
                    J0(i3);
                    int c = kr4Var.c() + i3;
                    do {
                        list.add(Double.valueOf(Double.longBitsToDouble(kr4Var.h())));
                    } while (kr4Var.c() < c);
                    return;
                }
                n8a n8aVar = (n8a) list;
                int i4 = i & 7;
                if (i4 == 1) {
                    do {
                        n8aVar.g(Double.longBitsToDouble(kr4Var.h()));
                        if (kr4Var.d()) {
                            return;
                        } else {
                            l2 = kr4Var.l();
                        }
                    } while (l2 == this.b);
                    this.d = l2;
                    return;
                }
                if (i4 != 2) {
                    throw aye.b();
                }
                int i5 = kr4Var.i();
                J0(i5);
                int c2 = kr4Var.c() + i5;
                do {
                    n8aVar.g(Double.longBitsToDouble(kr4Var.h()));
                } while (kr4Var.c() < c2);
                return;
            default:
                qr4 qr4Var = (qr4) this.e;
                boolean z4 = list instanceof o8a;
                int i6 = this.b;
                if (!z4) {
                    int i7 = i6 & 7;
                    if (i7 == 1) {
                        do {
                            list.add(Double.valueOf(qr4Var.l()));
                            if (qr4Var.e()) {
                                return;
                            } else {
                                z = qr4Var.z();
                            }
                        } while (z == this.b);
                        this.d = z;
                        return;
                    }
                    if (i7 != 2) {
                        throw bye.d();
                    }
                    int A = qr4Var.A();
                    I0(A);
                    int d = qr4Var.d() + A;
                    do {
                        list.add(Double.valueOf(qr4Var.l()));
                    } while (qr4Var.d() < d);
                    return;
                }
                o8a o8aVar = (o8a) list;
                int i8 = i6 & 7;
                if (i8 == 1) {
                    do {
                        o8aVar.g(qr4Var.l());
                        if (qr4Var.e()) {
                            return;
                        } else {
                            z2 = qr4Var.z();
                        }
                    } while (z2 == this.b);
                    this.d = z2;
                    return;
                }
                if (i8 != 2) {
                    throw bye.d();
                }
                int A2 = qr4Var.A();
                I0(A2);
                int d2 = qr4Var.d() + A2;
                do {
                    o8aVar.g(qr4Var.l());
                } while (qr4Var.d() < d2);
                return;
        }
    }

    public void C0(int i) {
        switch (this.a) {
            case 2:
                if ((this.b & 7) != i) {
                    throw bye.d();
                }
                return;
            default:
                if ((this.b & 7) != i) {
                    throw cye.b();
                }
                return;
        }
    }

    public int D() {
        D0(0);
        return ((kr4) this.e).i();
    }

    public void D0(int i) {
        if ((this.b & 7) != i) {
            throw aye.b();
        }
    }

    public void E(sse sseVar) {
        int A;
        rr4 rr4Var = (rr4) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                sseVar.add(Integer.valueOf(rr4Var.o()));
                if (rr4Var.e()) {
                    return;
                } else {
                    A = rr4Var.A();
                }
            } while (A == this.b);
            this.d = A;
            return;
        }
        if (i != 2) {
            throw cye.b();
        }
        int d = rr4Var.d() + rr4Var.B();
        do {
            sseVar.add(Integer.valueOf(rr4Var.o()));
        } while (rr4Var.d() < d);
        A0(d);
    }

    public boolean E0() {
        int i;
        qr4 qr4Var = (qr4) this.e;
        if (qr4Var.e() || (i = this.b) == this.c) {
            return false;
        }
        return qr4Var.C(i);
    }

    public void F(List list) {
        int l;
        int l2;
        int z;
        int z2;
        switch (this.a) {
            case 1:
                kr4 kr4Var = (kr4) this.e;
                boolean z3 = list instanceof hpe;
                int i = this.b;
                if (!z3) {
                    int i2 = i & 7;
                    if (i2 == 0) {
                        do {
                            list.add(Integer.valueOf(kr4Var.i()));
                            if (kr4Var.d()) {
                                return;
                            } else {
                                l = kr4Var.l();
                            }
                        } while (l == this.b);
                        this.d = l;
                        return;
                    }
                    if (i2 != 2) {
                        throw aye.b();
                    }
                    int c = kr4Var.c() + kr4Var.i();
                    do {
                        list.add(Integer.valueOf(kr4Var.i()));
                    } while (kr4Var.c() < c);
                    B0(c);
                    return;
                }
                hpe hpeVar = (hpe) list;
                int i3 = i & 7;
                if (i3 == 0) {
                    do {
                        hpeVar.g(kr4Var.i());
                        if (kr4Var.d()) {
                            return;
                        } else {
                            l2 = kr4Var.l();
                        }
                    } while (l2 == this.b);
                    this.d = l2;
                    return;
                }
                if (i3 != 2) {
                    throw aye.b();
                }
                int c2 = kr4Var.c() + kr4Var.i();
                do {
                    hpeVar.g(kr4Var.i());
                } while (kr4Var.c() < c2);
                B0(c2);
                return;
            default:
                qr4 qr4Var = (qr4) this.e;
                boolean z4 = list instanceof ipe;
                int i4 = this.b;
                if (!z4) {
                    int i5 = i4 & 7;
                    if (i5 == 0) {
                        do {
                            list.add(Integer.valueOf(qr4Var.m()));
                            if (qr4Var.e()) {
                                return;
                            } else {
                                z = qr4Var.z();
                            }
                        } while (z == this.b);
                        this.d = z;
                        return;
                    }
                    if (i5 != 2) {
                        throw bye.d();
                    }
                    int d = qr4Var.d() + qr4Var.A();
                    do {
                        list.add(Integer.valueOf(qr4Var.m()));
                    } while (qr4Var.d() < d);
                    A0(d);
                    return;
                }
                ipe ipeVar = (ipe) list;
                int i6 = i4 & 7;
                if (i6 == 0) {
                    do {
                        ipeVar.g(qr4Var.m());
                        if (qr4Var.e()) {
                            return;
                        } else {
                            z2 = qr4Var.z();
                        }
                    } while (z2 == this.b);
                    this.d = z2;
                    return;
                }
                if (i6 != 2) {
                    throw bye.d();
                }
                int d2 = qr4Var.d() + qr4Var.A();
                do {
                    ipeVar.g(qr4Var.m());
                } while (qr4Var.d() < d2);
                A0(d2);
                return;
        }
    }

    public Object G(prv prvVar, Class cls, z0c z0cVar) {
        qr4 qr4Var = (qr4) this.e;
        switch (prvVar.ordinal()) {
            case 0:
                C0(1);
                return Double.valueOf(qr4Var.l());
            case 1:
                C0(5);
                return Float.valueOf(qr4Var.p());
            case 2:
                C0(0);
                return Long.valueOf(qr4Var.r());
            case 3:
                C0(0);
                return Long.valueOf(qr4Var.B());
            case 4:
                C0(0);
                return Integer.valueOf(qr4Var.q());
            case 5:
                C0(1);
                return Long.valueOf(qr4Var.o());
            case 6:
                C0(5);
                return Integer.valueOf(qr4Var.n());
            case 7:
                C0(0);
                return Boolean.valueOf(qr4Var.j());
            case 8:
                C0(2);
                return qr4Var.y();
            case 9:
            default:
                xq0.x("unsupported field type.");
                return null;
            case 10:
                C0(2);
                wto a = yym.c.a(cls);
                o3d c = a.c();
                o(c, a, z0cVar);
                a.a(c);
                return c;
            case 11:
                return v();
            case 12:
                C0(0);
                return Integer.valueOf(qr4Var.A());
            case 13:
                C0(0);
                return Integer.valueOf(qr4Var.m());
            case 14:
                C0(5);
                return Integer.valueOf(qr4Var.t());
            case 15:
                C0(1);
                return Long.valueOf(qr4Var.u());
            case 16:
                C0(0);
                return Integer.valueOf(qr4Var.v());
            case 17:
                C0(0);
                return Long.valueOf(qr4Var.w());
        }
    }

    public int H() {
        D0(5);
        return ((kr4) this.e).g();
    }

    public void I(sse sseVar) {
        int A;
        rr4 rr4Var = (rr4) this.e;
        int i = this.b & 7;
        if (i == 2) {
            int B = rr4Var.B();
            H0(B);
            int d = rr4Var.d() + B;
            do {
                sseVar.add(Integer.valueOf(rr4Var.p()));
            } while (rr4Var.d() < d);
            return;
        }
        if (i != 5) {
            throw cye.b();
        }
        do {
            sseVar.add(Integer.valueOf(rr4Var.p()));
            if (rr4Var.e()) {
                return;
            } else {
                A = rr4Var.A();
            }
        } while (A == this.b);
        this.d = A;
    }

    public void J(List list) {
        int l;
        int l2;
        int z;
        int z2;
        switch (this.a) {
            case 1:
                kr4 kr4Var = (kr4) this.e;
                boolean z3 = list instanceof hpe;
                int i = this.b;
                if (!z3) {
                    int i2 = i & 7;
                    if (i2 == 2) {
                        int i3 = kr4Var.i();
                        G0(i3);
                        int c = kr4Var.c() + i3;
                        do {
                            list.add(Integer.valueOf(kr4Var.g()));
                        } while (kr4Var.c() < c);
                        return;
                    }
                    if (i2 != 5) {
                        throw aye.b();
                    }
                    do {
                        list.add(Integer.valueOf(kr4Var.g()));
                        if (kr4Var.d()) {
                            return;
                        } else {
                            l = kr4Var.l();
                        }
                    } while (l == this.b);
                    this.d = l;
                    return;
                }
                hpe hpeVar = (hpe) list;
                int i4 = i & 7;
                if (i4 == 2) {
                    int i5 = kr4Var.i();
                    G0(i5);
                    int c2 = kr4Var.c() + i5;
                    do {
                        hpeVar.g(kr4Var.g());
                    } while (kr4Var.c() < c2);
                    return;
                }
                if (i4 != 5) {
                    throw aye.b();
                }
                do {
                    hpeVar.g(kr4Var.g());
                    if (kr4Var.d()) {
                        return;
                    } else {
                        l2 = kr4Var.l();
                    }
                } while (l2 == this.b);
                this.d = l2;
                return;
            default:
                qr4 qr4Var = (qr4) this.e;
                boolean z4 = list instanceof ipe;
                int i6 = this.b;
                if (!z4) {
                    int i7 = i6 & 7;
                    if (i7 == 2) {
                        int A = qr4Var.A();
                        F0(A);
                        int d = qr4Var.d() + A;
                        do {
                            list.add(Integer.valueOf(qr4Var.n()));
                        } while (qr4Var.d() < d);
                        return;
                    }
                    if (i7 != 5) {
                        throw bye.d();
                    }
                    do {
                        list.add(Integer.valueOf(qr4Var.n()));
                        if (qr4Var.e()) {
                            return;
                        } else {
                            z = qr4Var.z();
                        }
                    } while (z == this.b);
                    this.d = z;
                    return;
                }
                ipe ipeVar = (ipe) list;
                int i8 = i6 & 7;
                if (i8 == 2) {
                    int A2 = qr4Var.A();
                    F0(A2);
                    int d2 = qr4Var.d() + A2;
                    do {
                        ipeVar.g(qr4Var.n());
                    } while (qr4Var.d() < d2);
                    return;
                }
                if (i8 != 5) {
                    throw bye.d();
                }
                do {
                    ipeVar.g(qr4Var.n());
                    if (qr4Var.e()) {
                        return;
                    } else {
                        z2 = qr4Var.z();
                    }
                } while (z2 == this.b);
                this.d = z2;
                return;
        }
    }

    public long K() {
        D0(1);
        return ((kr4) this.e).h();
    }

    public void L(sse sseVar) {
        int A;
        rr4 rr4Var = (rr4) this.e;
        int i = this.b & 7;
        if (i == 1) {
            do {
                sseVar.add(Long.valueOf(rr4Var.q()));
                if (rr4Var.e()) {
                    return;
                } else {
                    A = rr4Var.A();
                }
            } while (A == this.b);
            this.d = A;
            return;
        }
        if (i != 2) {
            throw cye.b();
        }
        int B = rr4Var.B();
        K0(B);
        int d = rr4Var.d() + B;
        do {
            sseVar.add(Long.valueOf(rr4Var.q()));
        } while (rr4Var.d() < d);
    }

    public void M(List list) {
        int l;
        int l2;
        int z;
        int z2;
        switch (this.a) {
            case 1:
                kr4 kr4Var = (kr4) this.e;
                boolean z3 = list instanceof pug;
                int i = this.b;
                if (!z3) {
                    int i2 = i & 7;
                    if (i2 == 1) {
                        do {
                            list.add(Long.valueOf(kr4Var.h()));
                            if (kr4Var.d()) {
                                return;
                            } else {
                                l = kr4Var.l();
                            }
                        } while (l == this.b);
                        this.d = l;
                        return;
                    }
                    if (i2 != 2) {
                        throw aye.b();
                    }
                    int i3 = kr4Var.i();
                    J0(i3);
                    int c = kr4Var.c() + i3;
                    do {
                        list.add(Long.valueOf(kr4Var.h()));
                    } while (kr4Var.c() < c);
                    return;
                }
                pug pugVar = (pug) list;
                int i4 = i & 7;
                if (i4 == 1) {
                    do {
                        pugVar.g(kr4Var.h());
                        if (kr4Var.d()) {
                            return;
                        } else {
                            l2 = kr4Var.l();
                        }
                    } while (l2 == this.b);
                    this.d = l2;
                    return;
                }
                if (i4 != 2) {
                    throw aye.b();
                }
                int i5 = kr4Var.i();
                J0(i5);
                int c2 = kr4Var.c() + i5;
                do {
                    pugVar.g(kr4Var.h());
                } while (kr4Var.c() < c2);
                return;
            default:
                qr4 qr4Var = (qr4) this.e;
                boolean z4 = list instanceof qug;
                int i6 = this.b;
                if (!z4) {
                    int i7 = i6 & 7;
                    if (i7 == 1) {
                        do {
                            list.add(Long.valueOf(qr4Var.o()));
                            if (qr4Var.e()) {
                                return;
                            } else {
                                z = qr4Var.z();
                            }
                        } while (z == this.b);
                        this.d = z;
                        return;
                    }
                    if (i7 != 2) {
                        throw bye.d();
                    }
                    int A = qr4Var.A();
                    I0(A);
                    int d = qr4Var.d() + A;
                    do {
                        list.add(Long.valueOf(qr4Var.o()));
                    } while (qr4Var.d() < d);
                    return;
                }
                qug qugVar = (qug) list;
                int i8 = i6 & 7;
                if (i8 == 1) {
                    do {
                        qugVar.g(qr4Var.o());
                        if (qr4Var.e()) {
                            return;
                        } else {
                            z2 = qr4Var.z();
                        }
                    } while (z2 == this.b);
                    this.d = z2;
                    return;
                }
                if (i8 != 2) {
                    throw bye.d();
                }
                int A2 = qr4Var.A();
                I0(A2);
                int d2 = qr4Var.d() + A2;
                do {
                    qugVar.g(qr4Var.o());
                } while (qr4Var.d() < d2);
                return;
        }
    }

    public float N() {
        D0(5);
        return Float.intBitsToFloat(((kr4) this.e).g());
    }

    public void O(sse sseVar) {
        int A;
        rr4 rr4Var = (rr4) this.e;
        int i = this.b & 7;
        if (i == 2) {
            int B = rr4Var.B();
            H0(B);
            int d = rr4Var.d() + B;
            do {
                sseVar.add(Float.valueOf(rr4Var.r()));
            } while (rr4Var.d() < d);
            return;
        }
        if (i != 5) {
            throw cye.b();
        }
        do {
            sseVar.add(Float.valueOf(rr4Var.r()));
            if (rr4Var.e()) {
                return;
            } else {
                A = rr4Var.A();
            }
        } while (A == this.b);
        this.d = A;
    }

    public void P(List list) {
        int l;
        int l2;
        int z;
        int z2;
        switch (this.a) {
            case 1:
                kr4 kr4Var = (kr4) this.e;
                boolean z3 = list instanceof sic;
                int i = this.b;
                if (!z3) {
                    int i2 = i & 7;
                    if (i2 == 2) {
                        int i3 = kr4Var.i();
                        G0(i3);
                        int c = kr4Var.c() + i3;
                        do {
                            list.add(Float.valueOf(Float.intBitsToFloat(kr4Var.g())));
                        } while (kr4Var.c() < c);
                        return;
                    }
                    if (i2 != 5) {
                        throw aye.b();
                    }
                    do {
                        list.add(Float.valueOf(Float.intBitsToFloat(kr4Var.g())));
                        if (kr4Var.d()) {
                            return;
                        } else {
                            l = kr4Var.l();
                        }
                    } while (l == this.b);
                    this.d = l;
                    return;
                }
                sic sicVar = (sic) list;
                int i4 = i & 7;
                if (i4 == 2) {
                    int i5 = kr4Var.i();
                    G0(i5);
                    int c2 = kr4Var.c() + i5;
                    do {
                        sicVar.g(Float.intBitsToFloat(kr4Var.g()));
                    } while (kr4Var.c() < c2);
                    return;
                }
                if (i4 != 5) {
                    throw aye.b();
                }
                do {
                    sicVar.g(Float.intBitsToFloat(kr4Var.g()));
                    if (kr4Var.d()) {
                        return;
                    } else {
                        l2 = kr4Var.l();
                    }
                } while (l2 == this.b);
                this.d = l2;
                return;
            default:
                qr4 qr4Var = (qr4) this.e;
                boolean z4 = list instanceof tic;
                int i6 = this.b;
                if (!z4) {
                    int i7 = i6 & 7;
                    if (i7 == 2) {
                        int A = qr4Var.A();
                        F0(A);
                        int d = qr4Var.d() + A;
                        do {
                            list.add(Float.valueOf(qr4Var.p()));
                        } while (qr4Var.d() < d);
                        return;
                    }
                    if (i7 != 5) {
                        throw bye.d();
                    }
                    do {
                        list.add(Float.valueOf(qr4Var.p()));
                        if (qr4Var.e()) {
                            return;
                        } else {
                            z = qr4Var.z();
                        }
                    } while (z == this.b);
                    this.d = z;
                    return;
                }
                tic ticVar = (tic) list;
                int i8 = i6 & 7;
                if (i8 == 2) {
                    int A2 = qr4Var.A();
                    F0(A2);
                    int d2 = qr4Var.d() + A2;
                    do {
                        ticVar.g(qr4Var.p());
                    } while (qr4Var.d() < d2);
                    return;
                }
                if (i8 != 5) {
                    throw bye.d();
                }
                do {
                    ticVar.g(qr4Var.p());
                    if (qr4Var.e()) {
                        return;
                    } else {
                        z2 = qr4Var.z();
                    }
                } while (z2 == this.b);
                this.d = z2;
                return;
        }
    }

    public Object Q(vto vtoVar, y0c y0cVar) {
        int i = this.c;
        this.c = ((this.b >>> 3) << 3) | 4;
        try {
            Object c = vtoVar.c();
            vtoVar.d(c, this, y0cVar);
            vtoVar.a(c);
            if (this.b == this.c) {
                return c;
            }
            throw aye.d();
        } finally {
            this.c = i;
        }
    }

    public Object R(vto vtoVar, y0c y0cVar) {
        D0(3);
        return Q(vtoVar, y0cVar);
    }

    public void S(List list, vto vtoVar, y0c y0cVar) {
        int l;
        kr4 kr4Var = (kr4) this.e;
        int i = this.b;
        if ((i & 7) != 3) {
            throw aye.b();
        }
        do {
            list.add(Q(vtoVar, y0cVar));
            if (kr4Var.d() || this.d != 0) {
                return;
            } else {
                l = kr4Var.l();
            }
        } while (l == i);
        this.d = l;
    }

    public int T() {
        D0(0);
        return ((kr4) this.e).i();
    }

    public void U(sse sseVar) {
        int A;
        rr4 rr4Var = (rr4) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                sseVar.add(Integer.valueOf(rr4Var.s()));
                if (rr4Var.e()) {
                    return;
                } else {
                    A = rr4Var.A();
                }
            } while (A == this.b);
            this.d = A;
            return;
        }
        if (i != 2) {
            throw cye.b();
        }
        int d = rr4Var.d() + rr4Var.B();
        do {
            sseVar.add(Integer.valueOf(rr4Var.s()));
        } while (rr4Var.d() < d);
        A0(d);
    }

    public void V(List list) {
        int l;
        int l2;
        int z;
        int z2;
        switch (this.a) {
            case 1:
                kr4 kr4Var = (kr4) this.e;
                boolean z3 = list instanceof hpe;
                int i = this.b;
                if (!z3) {
                    int i2 = i & 7;
                    if (i2 == 0) {
                        do {
                            list.add(Integer.valueOf(kr4Var.i()));
                            if (kr4Var.d()) {
                                return;
                            } else {
                                l = kr4Var.l();
                            }
                        } while (l == this.b);
                        this.d = l;
                        return;
                    }
                    if (i2 != 2) {
                        throw aye.b();
                    }
                    int c = kr4Var.c() + kr4Var.i();
                    do {
                        list.add(Integer.valueOf(kr4Var.i()));
                    } while (kr4Var.c() < c);
                    B0(c);
                    return;
                }
                hpe hpeVar = (hpe) list;
                int i3 = i & 7;
                if (i3 == 0) {
                    do {
                        hpeVar.g(kr4Var.i());
                        if (kr4Var.d()) {
                            return;
                        } else {
                            l2 = kr4Var.l();
                        }
                    } while (l2 == this.b);
                    this.d = l2;
                    return;
                }
                if (i3 != 2) {
                    throw aye.b();
                }
                int c2 = kr4Var.c() + kr4Var.i();
                do {
                    hpeVar.g(kr4Var.i());
                } while (kr4Var.c() < c2);
                B0(c2);
                return;
            default:
                qr4 qr4Var = (qr4) this.e;
                boolean z4 = list instanceof ipe;
                int i4 = this.b;
                if (!z4) {
                    int i5 = i4 & 7;
                    if (i5 == 0) {
                        do {
                            list.add(Integer.valueOf(qr4Var.q()));
                            if (qr4Var.e()) {
                                return;
                            } else {
                                z = qr4Var.z();
                            }
                        } while (z == this.b);
                        this.d = z;
                        return;
                    }
                    if (i5 != 2) {
                        throw bye.d();
                    }
                    int d = qr4Var.d() + qr4Var.A();
                    do {
                        list.add(Integer.valueOf(qr4Var.q()));
                    } while (qr4Var.d() < d);
                    A0(d);
                    return;
                }
                ipe ipeVar = (ipe) list;
                int i6 = i4 & 7;
                if (i6 == 0) {
                    do {
                        ipeVar.g(qr4Var.q());
                        if (qr4Var.e()) {
                            return;
                        } else {
                            z2 = qr4Var.z();
                        }
                    } while (z2 == this.b);
                    this.d = z2;
                    return;
                }
                if (i6 != 2) {
                    throw bye.d();
                }
                int d2 = qr4Var.d() + qr4Var.A();
                do {
                    ipeVar.g(qr4Var.q());
                } while (qr4Var.d() < d2);
                A0(d2);
                return;
        }
    }

    public long W() {
        D0(0);
        return ((kr4) this.e).j();
    }

    public void X(sse sseVar) {
        int A;
        rr4 rr4Var = (rr4) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                sseVar.add(Long.valueOf(rr4Var.t()));
                if (rr4Var.e()) {
                    return;
                } else {
                    A = rr4Var.A();
                }
            } while (A == this.b);
            this.d = A;
            return;
        }
        if (i != 2) {
            throw cye.b();
        }
        int d = rr4Var.d() + rr4Var.B();
        do {
            sseVar.add(Long.valueOf(rr4Var.t()));
        } while (rr4Var.d() < d);
        A0(d);
    }

    public void Y(List list) {
        int l;
        int l2;
        int z;
        int z2;
        switch (this.a) {
            case 1:
                kr4 kr4Var = (kr4) this.e;
                boolean z3 = list instanceof pug;
                int i = this.b;
                if (!z3) {
                    int i2 = i & 7;
                    if (i2 == 0) {
                        do {
                            list.add(Long.valueOf(kr4Var.j()));
                            if (kr4Var.d()) {
                                return;
                            } else {
                                l = kr4Var.l();
                            }
                        } while (l == this.b);
                        this.d = l;
                        return;
                    }
                    if (i2 != 2) {
                        throw aye.b();
                    }
                    int c = kr4Var.c() + kr4Var.i();
                    do {
                        list.add(Long.valueOf(kr4Var.j()));
                    } while (kr4Var.c() < c);
                    B0(c);
                    return;
                }
                pug pugVar = (pug) list;
                int i3 = i & 7;
                if (i3 == 0) {
                    do {
                        pugVar.g(kr4Var.j());
                        if (kr4Var.d()) {
                            return;
                        } else {
                            l2 = kr4Var.l();
                        }
                    } while (l2 == this.b);
                    this.d = l2;
                    return;
                }
                if (i3 != 2) {
                    throw aye.b();
                }
                int c2 = kr4Var.c() + kr4Var.i();
                do {
                    pugVar.g(kr4Var.j());
                } while (kr4Var.c() < c2);
                B0(c2);
                return;
            default:
                qr4 qr4Var = (qr4) this.e;
                boolean z4 = list instanceof qug;
                int i4 = this.b;
                if (!z4) {
                    int i5 = i4 & 7;
                    if (i5 == 0) {
                        do {
                            list.add(Long.valueOf(qr4Var.r()));
                            if (qr4Var.e()) {
                                return;
                            } else {
                                z = qr4Var.z();
                            }
                        } while (z == this.b);
                        this.d = z;
                        return;
                    }
                    if (i5 != 2) {
                        throw bye.d();
                    }
                    int d = qr4Var.d() + qr4Var.A();
                    do {
                        list.add(Long.valueOf(qr4Var.r()));
                    } while (qr4Var.d() < d);
                    A0(d);
                    return;
                }
                qug qugVar = (qug) list;
                int i6 = i4 & 7;
                if (i6 == 0) {
                    do {
                        qugVar.g(qr4Var.r());
                        if (qr4Var.e()) {
                            return;
                        } else {
                            z2 = qr4Var.z();
                        }
                    } while (z2 == this.b);
                    this.d = z2;
                    return;
                }
                if (i6 != 2) {
                    throw bye.d();
                }
                int d2 = qr4Var.d() + qr4Var.A();
                do {
                    qugVar.g(qr4Var.r());
                } while (qr4Var.d() < d2);
                A0(d2);
                return;
        }
    }

    public Object Z(vto vtoVar, y0c y0cVar) {
        kr4 kr4Var = (kr4) this.e;
        int i = kr4Var.i();
        if (kr4Var.a >= 100) {
            throw new aye("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int e = kr4Var.e(i);
        Object c = vtoVar.c();
        kr4Var.a++;
        vtoVar.d(c, this, y0cVar);
        vtoVar.a(c);
        if (kr4Var.h != 0) {
            throw new aye("Protocol message end-group tag did not match expected tag.");
        }
        kr4Var.a--;
        kr4Var.i = e;
        kr4Var.m();
        return c;
    }

    public void a(ka8 ka8Var) {
        Object obj;
        Object obj2;
        Object[] objArr = (Object[]) this.e;
        int i = this.b;
        int hashCode = ka8Var.hashCode() * (-1640531527);
        int i2 = (hashCode ^ (hashCode >>> 16)) & i;
        Object obj3 = objArr[i2];
        if (obj3 != null) {
            if (obj3.equals(ka8Var)) {
                return;
            }
            do {
                i2 = (i2 + 1) & i;
                obj2 = objArr[i2];
                if (obj2 == null) {
                }
            } while (!obj2.equals(ka8Var));
            return;
        }
        objArr[i2] = ka8Var;
        int i3 = this.c + 1;
        this.c = i3;
        if (i3 < this.d) {
            return;
        }
        Object[] objArr2 = (Object[]) this.e;
        int length = objArr2.length;
        int i4 = length << 1;
        int i5 = i4 - 1;
        Object[] objArr3 = new Object[i4];
        while (true) {
            int i6 = i3 - 1;
            if (i3 == 0) {
                this.b = i5;
                this.d = (int) (i4 * 0.75f);
                this.e = objArr3;
                return;
            }
            do {
                length--;
                obj = objArr2[length];
            } while (obj == null);
            int hashCode2 = obj.hashCode() * (-1640531527);
            int i7 = (hashCode2 ^ (hashCode2 >>> 16)) & i5;
            if (objArr3[i7] != null) {
                do {
                    i7 = (i7 + 1) & i5;
                } while (objArr3[i7] != null);
            }
            objArr3[i7] = objArr2[length];
            i3 = i6;
        }
    }

    public Object a0(vto vtoVar, y0c y0cVar) {
        D0(2);
        return Z(vtoVar, y0cVar);
    }

    public void b(d8g d8gVar) {
        d8gVar.c = null;
        d8gVar.a = null;
        d8gVar.b = null;
        d8gVar.i = 1;
        int i = this.b;
        if (i > 0) {
            int i2 = this.d;
            if ((i2 & 1) == 0) {
                this.d = i2 + 1;
                this.b = i - 1;
                this.c++;
            }
        }
        d8gVar.a = (d8g) this.e;
        this.e = d8gVar;
        int i3 = this.d;
        int i4 = i3 + 1;
        this.d = i4;
        int i5 = this.b;
        if (i5 > 0 && (i4 & 1) == 0) {
            this.d = i3 + 2;
            this.b = i5 - 1;
            this.c++;
        }
        int i6 = 4;
        while (true) {
            int i7 = i6 - 1;
            if ((this.d & i7) != i7) {
                return;
            }
            int i8 = this.c;
            if (i8 == 0) {
                d8g d8gVar2 = (d8g) this.e;
                d8g d8gVar3 = d8gVar2.a;
                d8g d8gVar4 = d8gVar3.a;
                d8gVar3.a = d8gVar4.a;
                this.e = d8gVar3;
                d8gVar3.b = d8gVar4;
                d8gVar3.c = d8gVar2;
                d8gVar3.i = d8gVar2.i + 1;
                d8gVar4.a = d8gVar3;
                d8gVar2.a = d8gVar3;
            } else if (i8 == 1) {
                d8g d8gVar5 = (d8g) this.e;
                d8g d8gVar6 = d8gVar5.a;
                this.e = d8gVar6;
                d8gVar6.c = d8gVar5;
                d8gVar6.i = d8gVar5.i + 1;
                d8gVar5.a = d8gVar6;
                this.c = 0;
            } else if (i8 == 2) {
                this.c = 0;
            }
            i6 *= 2;
        }
    }

    public int b0() {
        D0(5);
        return ((kr4) this.e).g();
    }

    public p08 c() {
        vq1.v(this.c <= this.d);
        return new p08(this);
    }

    public void c0(sse sseVar) {
        int A;
        rr4 rr4Var = (rr4) this.e;
        int i = this.b & 7;
        if (i == 2) {
            int B = rr4Var.B();
            H0(B);
            int d = rr4Var.d() + B;
            do {
                sseVar.add(Integer.valueOf(rr4Var.u()));
            } while (rr4Var.d() < d);
            return;
        }
        if (i != 5) {
            throw cye.b();
        }
        do {
            sseVar.add(Integer.valueOf(rr4Var.u()));
            if (rr4Var.e()) {
                return;
            } else {
                A = rr4Var.A();
            }
        } while (A == this.b);
        this.d = A;
    }

    public void d(RecyclerView recyclerView, opn opnVar) {
        g4q g4qVar;
        dyk dykVar;
        recyclerView.getClass();
        opnVar.getClass();
        View view = opnVar.a;
        Object tag = view.getTag(R.id.item_touch_helper_previous_elevation);
        if (tag instanceof Float) {
            float floatValue = ((Float) tag).floatValue();
            WeakHashMap weakHashMap = wdu.a;
            ndu.l(view, floatValue);
        }
        view.setTag(R.id.item_touch_helper_previous_elevation, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        int i = this.c;
        if (i != -1) {
            p8n p8nVar = (p8n) this.e;
            p8nVar.h = false;
            xan xanVar = p8nVar.d;
            int i2 = this.d;
            j4l j4lVar = xanVar.a;
            if (i != i2 && (g4qVar = (g4q) j4lVar.k.b.c.getValue()) != null && (dykVar = (dyk) zdg.p(g4qVar, new yb4(i, i2))) != null) {
                j4lVar.l.a(dykVar, new b3t("queue_move"));
            }
            this.c = -1;
        }
    }

    public void d0(List list) {
        int l;
        int l2;
        int z;
        int z2;
        switch (this.a) {
            case 1:
                kr4 kr4Var = (kr4) this.e;
                boolean z3 = list instanceof hpe;
                int i = this.b;
                if (!z3) {
                    int i2 = i & 7;
                    if (i2 == 2) {
                        int i3 = kr4Var.i();
                        G0(i3);
                        int c = kr4Var.c() + i3;
                        do {
                            list.add(Integer.valueOf(kr4Var.g()));
                        } while (kr4Var.c() < c);
                        return;
                    }
                    if (i2 != 5) {
                        throw aye.b();
                    }
                    do {
                        list.add(Integer.valueOf(kr4Var.g()));
                        if (kr4Var.d()) {
                            return;
                        } else {
                            l = kr4Var.l();
                        }
                    } while (l == this.b);
                    this.d = l;
                    return;
                }
                hpe hpeVar = (hpe) list;
                int i4 = i & 7;
                if (i4 == 2) {
                    int i5 = kr4Var.i();
                    G0(i5);
                    int c2 = kr4Var.c() + i5;
                    do {
                        hpeVar.g(kr4Var.g());
                    } while (kr4Var.c() < c2);
                    return;
                }
                if (i4 != 5) {
                    throw aye.b();
                }
                do {
                    hpeVar.g(kr4Var.g());
                    if (kr4Var.d()) {
                        return;
                    } else {
                        l2 = kr4Var.l();
                    }
                } while (l2 == this.b);
                this.d = l2;
                return;
            default:
                qr4 qr4Var = (qr4) this.e;
                boolean z4 = list instanceof ipe;
                int i6 = this.b;
                if (!z4) {
                    int i7 = i6 & 7;
                    if (i7 == 2) {
                        int A = qr4Var.A();
                        F0(A);
                        int d = qr4Var.d() + A;
                        do {
                            list.add(Integer.valueOf(qr4Var.t()));
                        } while (qr4Var.d() < d);
                        return;
                    }
                    if (i7 != 5) {
                        throw bye.d();
                    }
                    do {
                        list.add(Integer.valueOf(qr4Var.t()));
                        if (qr4Var.e()) {
                            return;
                        } else {
                            z = qr4Var.z();
                        }
                    } while (z == this.b);
                    this.d = z;
                    return;
                }
                ipe ipeVar = (ipe) list;
                int i8 = i6 & 7;
                if (i8 == 2) {
                    int A2 = qr4Var.A();
                    F0(A2);
                    int d2 = qr4Var.d() + A2;
                    do {
                        ipeVar.g(qr4Var.t());
                    } while (qr4Var.d() < d2);
                    return;
                }
                if (i8 != 5) {
                    throw bye.d();
                }
                do {
                    ipeVar.g(qr4Var.t());
                    if (qr4Var.e()) {
                        return;
                    } else {
                        z2 = qr4Var.z();
                    }
                } while (z2 == this.b);
                this.d = z2;
                return;
        }
    }

    public long e0() {
        D0(1);
        return ((kr4) this.e).h();
    }

    public void f0(sse sseVar) {
        int A;
        rr4 rr4Var = (rr4) this.e;
        int i = this.b & 7;
        if (i == 1) {
            do {
                sseVar.add(Long.valueOf(rr4Var.v()));
                if (rr4Var.e()) {
                    return;
                } else {
                    A = rr4Var.A();
                }
            } while (A == this.b);
            this.d = A;
            return;
        }
        if (i != 2) {
            throw cye.b();
        }
        int B = rr4Var.B();
        K0(B);
        int d = rr4Var.d() + B;
        do {
            sseVar.add(Long.valueOf(rr4Var.v()));
        } while (rr4Var.d() < d);
    }

    public int g() {
        return this.d - this.c;
    }

    public void g0(List list) {
        int l;
        int l2;
        int z;
        int z2;
        switch (this.a) {
            case 1:
                kr4 kr4Var = (kr4) this.e;
                boolean z3 = list instanceof pug;
                int i = this.b;
                if (!z3) {
                    int i2 = i & 7;
                    if (i2 == 1) {
                        do {
                            list.add(Long.valueOf(kr4Var.h()));
                            if (kr4Var.d()) {
                                return;
                            } else {
                                l = kr4Var.l();
                            }
                        } while (l == this.b);
                        this.d = l;
                        return;
                    }
                    if (i2 != 2) {
                        throw aye.b();
                    }
                    int i3 = kr4Var.i();
                    J0(i3);
                    int c = kr4Var.c() + i3;
                    do {
                        list.add(Long.valueOf(kr4Var.h()));
                    } while (kr4Var.c() < c);
                    return;
                }
                pug pugVar = (pug) list;
                int i4 = i & 7;
                if (i4 == 1) {
                    do {
                        pugVar.g(kr4Var.h());
                        if (kr4Var.d()) {
                            return;
                        } else {
                            l2 = kr4Var.l();
                        }
                    } while (l2 == this.b);
                    this.d = l2;
                    return;
                }
                if (i4 != 2) {
                    throw aye.b();
                }
                int i5 = kr4Var.i();
                J0(i5);
                int c2 = kr4Var.c() + i5;
                do {
                    pugVar.g(kr4Var.h());
                } while (kr4Var.c() < c2);
                return;
            default:
                qr4 qr4Var = (qr4) this.e;
                boolean z4 = list instanceof qug;
                int i6 = this.b;
                if (!z4) {
                    int i7 = i6 & 7;
                    if (i7 == 1) {
                        do {
                            list.add(Long.valueOf(qr4Var.u()));
                            if (qr4Var.e()) {
                                return;
                            } else {
                                z = qr4Var.z();
                            }
                        } while (z == this.b);
                        this.d = z;
                        return;
                    }
                    if (i7 != 2) {
                        throw bye.d();
                    }
                    int A = qr4Var.A();
                    I0(A);
                    int d = qr4Var.d() + A;
                    do {
                        list.add(Long.valueOf(qr4Var.u()));
                    } while (qr4Var.d() < d);
                    return;
                }
                qug qugVar = (qug) list;
                int i8 = i6 & 7;
                if (i8 == 1) {
                    do {
                        qugVar.g(qr4Var.u());
                        if (qr4Var.e()) {
                            return;
                        } else {
                            z2 = qr4Var.z();
                        }
                    } while (z2 == this.b);
                    this.d = z2;
                    return;
                }
                if (i8 != 2) {
                    throw bye.d();
                }
                int A2 = qr4Var.A();
                I0(A2);
                int d2 = qr4Var.d() + A2;
                do {
                    qugVar.g(qr4Var.u());
                } while (qr4Var.d() < d2);
                return;
        }
    }

    public int h() {
        switch (this.a) {
            case 1:
                int i = this.d;
                if (i != 0) {
                    this.b = i;
                    this.d = 0;
                } else {
                    this.b = ((kr4) this.e).l();
                }
                int i2 = this.b;
                if (i2 == 0 || i2 == this.c) {
                    return Integer.MAX_VALUE;
                }
                return i2 >>> 3;
            case 2:
                int i3 = this.d;
                if (i3 != 0) {
                    this.b = i3;
                    this.d = 0;
                } else {
                    this.b = ((qr4) this.e).z();
                }
                int i4 = this.b;
                if (i4 == 0 || i4 == this.c) {
                    return Integer.MAX_VALUE;
                }
                return i4 >>> 3;
            default:
                int i5 = this.d;
                if (i5 != 0) {
                    this.b = i5;
                    this.d = 0;
                } else {
                    this.b = ((rr4) this.e).A();
                }
                int i6 = this.b;
                if (i6 == 0 || i6 == this.c) {
                    return Integer.MAX_VALUE;
                }
                return i6 >>> 3;
        }
    }

    public int h0() {
        D0(0);
        return kr4.a(((kr4) this.e).i());
    }

    public int i(int i) {
        return ((puj) this.e).c[this.c + i];
    }

    public void i0(sse sseVar) {
        int A;
        rr4 rr4Var = (rr4) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                sseVar.add(Integer.valueOf(rr4Var.w()));
                if (rr4Var.e()) {
                    return;
                } else {
                    A = rr4Var.A();
                }
            } while (A == this.b);
            this.d = A;
            return;
        }
        if (i != 2) {
            throw cye.b();
        }
        int d = rr4Var.d() + rr4Var.B();
        do {
            sseVar.add(Integer.valueOf(rr4Var.w()));
        } while (rr4Var.d() < d);
        A0(d);
    }

    public Object j(int i) {
        return ((puj) this.e).e[this.d + i];
    }

    public void j0(List list) {
        int l;
        int l2;
        int z;
        int z2;
        switch (this.a) {
            case 1:
                kr4 kr4Var = (kr4) this.e;
                boolean z3 = list instanceof hpe;
                int i = this.b;
                if (!z3) {
                    int i2 = i & 7;
                    if (i2 == 0) {
                        do {
                            list.add(Integer.valueOf(kr4.a(kr4Var.i())));
                            if (kr4Var.d()) {
                                return;
                            } else {
                                l = kr4Var.l();
                            }
                        } while (l == this.b);
                        this.d = l;
                        return;
                    }
                    if (i2 != 2) {
                        throw aye.b();
                    }
                    int c = kr4Var.c() + kr4Var.i();
                    do {
                        list.add(Integer.valueOf(kr4.a(kr4Var.i())));
                    } while (kr4Var.c() < c);
                    B0(c);
                    return;
                }
                hpe hpeVar = (hpe) list;
                int i3 = i & 7;
                if (i3 == 0) {
                    do {
                        hpeVar.g(kr4.a(kr4Var.i()));
                        if (kr4Var.d()) {
                            return;
                        } else {
                            l2 = kr4Var.l();
                        }
                    } while (l2 == this.b);
                    this.d = l2;
                    return;
                }
                if (i3 != 2) {
                    throw aye.b();
                }
                int c2 = kr4Var.c() + kr4Var.i();
                do {
                    hpeVar.g(kr4.a(kr4Var.i()));
                } while (kr4Var.c() < c2);
                B0(c2);
                return;
            default:
                qr4 qr4Var = (qr4) this.e;
                boolean z4 = list instanceof ipe;
                int i4 = this.b;
                if (!z4) {
                    int i5 = i4 & 7;
                    if (i5 == 0) {
                        do {
                            list.add(Integer.valueOf(qr4Var.v()));
                            if (qr4Var.e()) {
                                return;
                            } else {
                                z = qr4Var.z();
                            }
                        } while (z == this.b);
                        this.d = z;
                        return;
                    }
                    if (i5 != 2) {
                        throw bye.d();
                    }
                    int d = qr4Var.d() + qr4Var.A();
                    do {
                        list.add(Integer.valueOf(qr4Var.v()));
                    } while (qr4Var.d() < d);
                    A0(d);
                    return;
                }
                ipe ipeVar = (ipe) list;
                int i6 = i4 & 7;
                if (i6 == 0) {
                    do {
                        ipeVar.g(qr4Var.v());
                        if (qr4Var.e()) {
                            return;
                        } else {
                            z2 = qr4Var.z();
                        }
                    } while (z2 == this.b);
                    this.d = z2;
                    return;
                }
                if (i6 != 2) {
                    throw bye.d();
                }
                int d2 = qr4Var.d() + qr4Var.A();
                do {
                    ipeVar.g(qr4Var.v());
                } while (qr4Var.d() < d2);
                A0(d2);
                return;
        }
    }

    public int k() {
        return this.b;
    }

    public long k0() {
        D0(0);
        return kr4.b(((kr4) this.e).j());
    }

    public int l(RecyclerView recyclerView, int i, int i2, long j) {
        if (this.b == -1) {
            this.b = recyclerView.getResources().getDimensionPixelSize(R.dimen.item_touch_helper_max_drag_scroll_per_frame);
        }
        int interpolation = (int) (f.getInterpolation(j <= 2000 ? j / 2000.0f : 1.0f) * ((int) (g.getInterpolation(Math.min(1.0f, (Math.abs(i2) * 1.0f) / i)) * ((int) Math.signum(i2)) * this.b)));
        return interpolation == 0 ? i2 > 0 ? 1 : -1 : interpolation;
    }

    public void l0(sse sseVar) {
        int A;
        rr4 rr4Var = (rr4) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                sseVar.add(Long.valueOf(rr4Var.x()));
                if (rr4Var.e()) {
                    return;
                } else {
                    A = rr4Var.A();
                }
            } while (A == this.b);
            this.d = A;
            return;
        }
        if (i != 2) {
            throw cye.b();
        }
        int d = rr4Var.d() + rr4Var.B();
        do {
            sseVar.add(Long.valueOf(rr4Var.x()));
        } while (rr4Var.d() < d);
        A0(d);
    }

    public void m(Object obj, wto wtoVar, z0c z0cVar) {
        int i = this.c;
        this.c = ((this.b >>> 3) << 3) | 4;
        try {
            wtoVar.e(obj, this, z0cVar);
            if (this.b == this.c) {
            } else {
                throw bye.g();
            }
        } finally {
            this.c = i;
        }
    }

    public void m0(List list) {
        int l;
        int l2;
        int z;
        int z2;
        switch (this.a) {
            case 1:
                kr4 kr4Var = (kr4) this.e;
                boolean z3 = list instanceof pug;
                int i = this.b;
                if (!z3) {
                    int i2 = i & 7;
                    if (i2 == 0) {
                        do {
                            list.add(Long.valueOf(kr4.b(kr4Var.j())));
                            if (kr4Var.d()) {
                                return;
                            } else {
                                l = kr4Var.l();
                            }
                        } while (l == this.b);
                        this.d = l;
                        return;
                    }
                    if (i2 != 2) {
                        throw aye.b();
                    }
                    int c = kr4Var.c() + kr4Var.i();
                    do {
                        list.add(Long.valueOf(kr4.b(kr4Var.j())));
                    } while (kr4Var.c() < c);
                    B0(c);
                    return;
                }
                pug pugVar = (pug) list;
                int i3 = i & 7;
                if (i3 == 0) {
                    do {
                        pugVar.g(kr4.b(kr4Var.j()));
                        if (kr4Var.d()) {
                            return;
                        } else {
                            l2 = kr4Var.l();
                        }
                    } while (l2 == this.b);
                    this.d = l2;
                    return;
                }
                if (i3 != 2) {
                    throw aye.b();
                }
                int c2 = kr4Var.c() + kr4Var.i();
                do {
                    pugVar.g(kr4.b(kr4Var.j()));
                } while (kr4Var.c() < c2);
                B0(c2);
                return;
            default:
                qr4 qr4Var = (qr4) this.e;
                boolean z4 = list instanceof qug;
                int i4 = this.b;
                if (!z4) {
                    int i5 = i4 & 7;
                    if (i5 == 0) {
                        do {
                            list.add(Long.valueOf(qr4Var.w()));
                            if (qr4Var.e()) {
                                return;
                            } else {
                                z = qr4Var.z();
                            }
                        } while (z == this.b);
                        this.d = z;
                        return;
                    }
                    if (i5 != 2) {
                        throw bye.d();
                    }
                    int d = qr4Var.d() + qr4Var.A();
                    do {
                        list.add(Long.valueOf(qr4Var.w()));
                    } while (qr4Var.d() < d);
                    A0(d);
                    return;
                }
                qug qugVar = (qug) list;
                int i6 = i4 & 7;
                if (i6 == 0) {
                    do {
                        qugVar.g(qr4Var.w());
                        if (qr4Var.e()) {
                            return;
                        } else {
                            z2 = qr4Var.z();
                        }
                    } while (z2 == this.b);
                    this.d = z2;
                    return;
                }
                if (i6 != 2) {
                    throw bye.d();
                }
                int d2 = qr4Var.d() + qr4Var.A();
                do {
                    qugVar.g(qr4Var.w());
                } while (qr4Var.d() < d2);
                A0(d2);
                return;
        }
    }

    public void n(Object obj, xto xtoVar, x0c x0cVar) {
        int i = this.c;
        this.c = ((this.b >>> 3) << 3) | 4;
        try {
            xtoVar.e(obj, this, x0cVar);
            if (this.b == this.c) {
            } else {
                throw new cye("Failed to parse the message.");
            }
        } finally {
            this.c = i;
        }
    }

    public String n0() {
        D0(2);
        kr4 kr4Var = (kr4) this.e;
        int i = kr4Var.i();
        if (i > 0) {
            int i2 = kr4Var.d;
            int i3 = kr4Var.f;
            if (i <= i2 - i3) {
                String str = new String(kr4Var.c, i3, i, tse.a);
                kr4Var.f += i;
                return str;
            }
        }
        if (i == 0) {
            return "";
        }
        if (i < 0) {
            throw aye.c();
        }
        throw aye.e();
    }

    public void o(Object obj, wto wtoVar, z0c z0cVar) {
        qr4 qr4Var = (qr4) this.e;
        int A = qr4Var.A();
        if (qr4Var.a + qr4Var.b >= qr4Var.c) {
            throw new bye("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i = qr4Var.i(A);
        qr4Var.a++;
        wtoVar.e(obj, this, z0cVar);
        qr4Var.a(0);
        qr4Var.a--;
        qr4Var.h(i);
    }

    public void o0(rse rseVar, boolean z) {
        String x;
        int z2;
        qr4 qr4Var = (qr4) this.e;
        if ((this.b & 7) != 2) {
            throw bye.d();
        }
        do {
            if (z) {
                C0(2);
                x = qr4Var.y();
            } else {
                C0(2);
                x = qr4Var.x();
            }
            rseVar.add(x);
            if (qr4Var.e()) {
                return;
            } else {
                z2 = qr4Var.z();
            }
        } while (z2 == this.b);
        this.d = z2;
    }

    public void p(Object obj, xto xtoVar, x0c x0cVar) {
        rr4 rr4Var = (rr4) this.e;
        int B = rr4Var.B();
        if (rr4Var.a >= 100) {
            throw new cye("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int k = rr4Var.k(B);
        rr4Var.a++;
        xtoVar.e(obj, this, x0cVar);
        rr4Var.c(0);
        rr4Var.a--;
        rr4Var.j(k);
    }

    public void p0(sse sseVar, boolean z) {
        String y;
        int A;
        rr4 rr4Var = (rr4) this.e;
        if ((this.b & 7) != 2) {
            throw cye.b();
        }
        do {
            if (z) {
                C0(2);
                y = rr4Var.z();
            } else {
                C0(2);
                y = rr4Var.y();
            }
            sseVar.add(y);
            if (rr4Var.e()) {
                return;
            } else {
                A = rr4Var.A();
            }
        } while (A == this.b);
        this.d = A;
    }

    public void q(Canvas canvas, RecyclerView recyclerView, opn opnVar, float f2, float f3, boolean z) {
        p8n p8nVar = (p8n) this.e;
        canvas.getClass();
        opnVar.getClass();
        View view = opnVar.a;
        if (z && view.getTag(R.id.item_touch_helper_previous_elevation) == null) {
            WeakHashMap weakHashMap = wdu.a;
            Float valueOf = Float.valueOf(ndu.f(view));
            int childCount = recyclerView.getChildCount();
            float f4 = 0.0f;
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                if (childAt != view) {
                    WeakHashMap weakHashMap2 = wdu.a;
                    float f5 = ndu.f(childAt);
                    if (f5 > f4) {
                        f4 = f5;
                    }
                }
            }
            ndu.l(view, f4 + 1.0f);
            view.setTag(R.id.item_touch_helper_previous_elevation, valueOf);
        }
        view.setTranslationX(f2);
        view.setTranslationY(f3);
        if (f2 == 0.0f) {
            return;
        }
        view.getClass();
        canvas.drawRect(view.getRight() + f2, view.getTop(), view.getRight(), view.getBottom(), p8nVar.i);
        p8n.u(p8nVar, canvas, view.getRight() + f2, view.getTop(), view.getRight(), view.getBottom());
    }

    public void q0(List list, boolean z) {
        int l;
        int l2;
        kr4 kr4Var = (kr4) this.e;
        if ((this.b & 7) != 2) {
            throw aye.b();
        }
        if (!(list instanceof yvf) || z) {
            do {
                list.add(z ? r0() : n0());
                if (kr4Var.d()) {
                    return;
                } else {
                    l = kr4Var.l();
                }
            } while (l == this.b);
            this.d = l;
            return;
        }
        yvf yvfVar = (yvf) list;
        do {
            yvfVar.C(u());
            if (kr4Var.d()) {
                return;
            } else {
                l2 = kr4Var.l();
            }
        } while (l2 == this.b);
        this.d = l2;
    }

    public boolean r() {
        D0(0);
        return ((kr4) this.e).f();
    }

    public String r0() {
        D0(2);
        kr4 kr4Var = (kr4) this.e;
        int i = kr4Var.i();
        if (i > 0) {
            int i2 = kr4Var.d;
            int i3 = kr4Var.f;
            if (i <= i2 - i3) {
                String w = mut.a.w(kr4Var.c, i3, i);
                kr4Var.f += i;
                return w;
            }
        }
        if (i == 0) {
            return "";
        }
        if (i <= 0) {
            throw aye.c();
        }
        throw aye.e();
    }

    public void s(sse sseVar) {
        int A;
        rr4 rr4Var = (rr4) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                sseVar.add(Boolean.valueOf(rr4Var.l()));
                if (rr4Var.e()) {
                    return;
                } else {
                    A = rr4Var.A();
                }
            } while (A == this.b);
            this.d = A;
            return;
        }
        if (i != 2) {
            throw cye.b();
        }
        int d = rr4Var.d() + rr4Var.B();
        do {
            sseVar.add(Boolean.valueOf(rr4Var.l()));
        } while (rr4Var.d() < d);
        A0(d);
    }

    public int s0() {
        D0(0);
        return ((kr4) this.e).i();
    }

    public void t(List list) {
        int l;
        int l2;
        int z;
        int z2;
        switch (this.a) {
            case 1:
                kr4 kr4Var = (kr4) this.e;
                boolean z3 = list instanceof ec3;
                int i = this.b;
                if (!z3) {
                    int i2 = i & 7;
                    if (i2 == 0) {
                        do {
                            list.add(Boolean.valueOf(kr4Var.f()));
                            if (kr4Var.d()) {
                                return;
                            } else {
                                l = kr4Var.l();
                            }
                        } while (l == this.b);
                        this.d = l;
                        return;
                    }
                    if (i2 != 2) {
                        throw aye.b();
                    }
                    int c = kr4Var.c() + kr4Var.i();
                    do {
                        list.add(Boolean.valueOf(kr4Var.f()));
                    } while (kr4Var.c() < c);
                    B0(c);
                    return;
                }
                ec3 ec3Var = (ec3) list;
                int i3 = i & 7;
                if (i3 == 0) {
                    do {
                        ec3Var.g(kr4Var.f());
                        if (kr4Var.d()) {
                            return;
                        } else {
                            l2 = kr4Var.l();
                        }
                    } while (l2 == this.b);
                    this.d = l2;
                    return;
                }
                if (i3 != 2) {
                    throw aye.b();
                }
                int c2 = kr4Var.c() + kr4Var.i();
                do {
                    ec3Var.g(kr4Var.f());
                } while (kr4Var.c() < c2);
                B0(c2);
                return;
            default:
                qr4 qr4Var = (qr4) this.e;
                boolean z4 = list instanceof fc3;
                int i4 = this.b;
                if (!z4) {
                    int i5 = i4 & 7;
                    if (i5 == 0) {
                        do {
                            list.add(Boolean.valueOf(qr4Var.j()));
                            if (qr4Var.e()) {
                                return;
                            } else {
                                z = qr4Var.z();
                            }
                        } while (z == this.b);
                        this.d = z;
                        return;
                    }
                    if (i5 != 2) {
                        throw bye.d();
                    }
                    int d = qr4Var.d() + qr4Var.A();
                    do {
                        list.add(Boolean.valueOf(qr4Var.j()));
                    } while (qr4Var.d() < d);
                    A0(d);
                    return;
                }
                fc3 fc3Var = (fc3) list;
                int i6 = i4 & 7;
                if (i6 == 0) {
                    do {
                        fc3Var.g(qr4Var.j());
                        if (qr4Var.e()) {
                            return;
                        } else {
                            z2 = qr4Var.z();
                        }
                    } while (z2 == this.b);
                    this.d = z2;
                    return;
                }
                if (i6 != 2) {
                    throw bye.d();
                }
                int d2 = qr4Var.d() + qr4Var.A();
                do {
                    fc3Var.g(qr4Var.j());
                } while (qr4Var.d() < d2);
                A0(d2);
                return;
        }
    }

    public void t0(sse sseVar) {
        int A;
        rr4 rr4Var = (rr4) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                sseVar.add(Integer.valueOf(rr4Var.B()));
                if (rr4Var.e()) {
                    return;
                } else {
                    A = rr4Var.A();
                }
            } while (A == this.b);
            this.d = A;
            return;
        }
        if (i != 2) {
            throw cye.b();
        }
        int d = rr4Var.d() + rr4Var.B();
        do {
            sseVar.add(Integer.valueOf(rr4Var.B()));
        } while (rr4Var.d() < d);
        A0(d);
    }

    public String toString() {
        switch (this.a) {
            case 5:
                return "";
            default:
                return super.toString();
        }
    }

    public jn3 u() {
        byte[] bArr;
        D0(2);
        kr4 kr4Var = (kr4) this.e;
        byte[] bArr2 = kr4Var.c;
        int i = kr4Var.i();
        if (i > 0) {
            int i2 = kr4Var.d;
            int i3 = kr4Var.f;
            if (i <= i2 - i3) {
                jn3 n = mn3.n(bArr2, i3, i);
                kr4Var.f += i;
                return n;
            }
        }
        if (i == 0) {
            return mn3.b;
        }
        if (i > 0) {
            int i4 = kr4Var.d;
            int i5 = kr4Var.f;
            if (i <= i4 - i5) {
                int i6 = i + i5;
                kr4Var.f = i6;
                bArr = Arrays.copyOfRange(bArr2, i5, i6);
                jn3 jn3Var = mn3.b;
                return new jn3(bArr);
            }
        }
        if (i > 0) {
            throw aye.e();
        }
        if (i != 0) {
            throw aye.c();
        }
        bArr = tse.b;
        jn3 jn3Var2 = mn3.b;
        return new jn3(bArr);
    }

    public void u0(List list) {
        int l;
        int l2;
        int z;
        int z2;
        switch (this.a) {
            case 1:
                kr4 kr4Var = (kr4) this.e;
                boolean z3 = list instanceof hpe;
                int i = this.b;
                if (!z3) {
                    int i2 = i & 7;
                    if (i2 == 0) {
                        do {
                            list.add(Integer.valueOf(kr4Var.i()));
                            if (kr4Var.d()) {
                                return;
                            } else {
                                l = kr4Var.l();
                            }
                        } while (l == this.b);
                        this.d = l;
                        return;
                    }
                    if (i2 != 2) {
                        throw aye.b();
                    }
                    int c = kr4Var.c() + kr4Var.i();
                    do {
                        list.add(Integer.valueOf(kr4Var.i()));
                    } while (kr4Var.c() < c);
                    B0(c);
                    return;
                }
                hpe hpeVar = (hpe) list;
                int i3 = i & 7;
                if (i3 == 0) {
                    do {
                        hpeVar.g(kr4Var.i());
                        if (kr4Var.d()) {
                            return;
                        } else {
                            l2 = kr4Var.l();
                        }
                    } while (l2 == this.b);
                    this.d = l2;
                    return;
                }
                if (i3 != 2) {
                    throw aye.b();
                }
                int c2 = kr4Var.c() + kr4Var.i();
                do {
                    hpeVar.g(kr4Var.i());
                } while (kr4Var.c() < c2);
                B0(c2);
                return;
            default:
                qr4 qr4Var = (qr4) this.e;
                boolean z4 = list instanceof ipe;
                int i4 = this.b;
                if (!z4) {
                    int i5 = i4 & 7;
                    if (i5 == 0) {
                        do {
                            list.add(Integer.valueOf(qr4Var.A()));
                            if (qr4Var.e()) {
                                return;
                            } else {
                                z = qr4Var.z();
                            }
                        } while (z == this.b);
                        this.d = z;
                        return;
                    }
                    if (i5 != 2) {
                        throw bye.d();
                    }
                    int d = qr4Var.d() + qr4Var.A();
                    do {
                        list.add(Integer.valueOf(qr4Var.A()));
                    } while (qr4Var.d() < d);
                    A0(d);
                    return;
                }
                ipe ipeVar = (ipe) list;
                int i6 = i4 & 7;
                if (i6 == 0) {
                    do {
                        ipeVar.g(qr4Var.A());
                        if (qr4Var.e()) {
                            return;
                        } else {
                            z2 = qr4Var.z();
                        }
                    } while (z2 == this.b);
                    this.d = z2;
                    return;
                }
                if (i6 != 2) {
                    throw bye.d();
                }
                int d2 = qr4Var.d() + qr4Var.A();
                do {
                    ipeVar.g(qr4Var.A());
                } while (qr4Var.d() < d2);
                A0(d2);
                return;
        }
    }

    public nn3 v() {
        C0(2);
        return ((qr4) this.e).k();
    }

    public long v0() {
        D0(0);
        return ((kr4) this.e).j();
    }

    public qn3 w() {
        C0(2);
        return ((rr4) this.e).m();
    }

    public void w0(sse sseVar) {
        int A;
        rr4 rr4Var = (rr4) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                sseVar.add(Long.valueOf(rr4Var.C()));
                if (rr4Var.e()) {
                    return;
                } else {
                    A = rr4Var.A();
                }
            } while (A == this.b);
            this.d = A;
            return;
        }
        if (i != 2) {
            throw cye.b();
        }
        int d = rr4Var.d() + rr4Var.B();
        do {
            sseVar.add(Long.valueOf(rr4Var.C()));
        } while (rr4Var.d() < d);
        A0(d);
    }

    public void x(rse rseVar) {
        int z;
        qr4 qr4Var = (qr4) this.e;
        if ((this.b & 7) != 2) {
            throw bye.d();
        }
        do {
            rseVar.add(v());
            if (qr4Var.e()) {
                return;
            } else {
                z = qr4Var.z();
            }
        } while (z == this.b);
        this.d = z;
    }

    public void x0(List list) {
        int l;
        int l2;
        int z;
        int z2;
        switch (this.a) {
            case 1:
                kr4 kr4Var = (kr4) this.e;
                boolean z3 = list instanceof pug;
                int i = this.b;
                if (!z3) {
                    int i2 = i & 7;
                    if (i2 == 0) {
                        do {
                            list.add(Long.valueOf(kr4Var.j()));
                            if (kr4Var.d()) {
                                return;
                            } else {
                                l = kr4Var.l();
                            }
                        } while (l == this.b);
                        this.d = l;
                        return;
                    }
                    if (i2 != 2) {
                        throw aye.b();
                    }
                    int c = kr4Var.c() + kr4Var.i();
                    do {
                        list.add(Long.valueOf(kr4Var.j()));
                    } while (kr4Var.c() < c);
                    B0(c);
                    return;
                }
                pug pugVar = (pug) list;
                int i3 = i & 7;
                if (i3 == 0) {
                    do {
                        pugVar.g(kr4Var.j());
                        if (kr4Var.d()) {
                            return;
                        } else {
                            l2 = kr4Var.l();
                        }
                    } while (l2 == this.b);
                    this.d = l2;
                    return;
                }
                if (i3 != 2) {
                    throw aye.b();
                }
                int c2 = kr4Var.c() + kr4Var.i();
                do {
                    pugVar.g(kr4Var.j());
                } while (kr4Var.c() < c2);
                B0(c2);
                return;
            default:
                qr4 qr4Var = (qr4) this.e;
                boolean z4 = list instanceof qug;
                int i4 = this.b;
                if (!z4) {
                    int i5 = i4 & 7;
                    if (i5 == 0) {
                        do {
                            list.add(Long.valueOf(qr4Var.B()));
                            if (qr4Var.e()) {
                                return;
                            } else {
                                z = qr4Var.z();
                            }
                        } while (z == this.b);
                        this.d = z;
                        return;
                    }
                    if (i5 != 2) {
                        throw bye.d();
                    }
                    int d = qr4Var.d() + qr4Var.A();
                    do {
                        list.add(Long.valueOf(qr4Var.B()));
                    } while (qr4Var.d() < d);
                    A0(d);
                    return;
                }
                qug qugVar = (qug) list;
                int i6 = i4 & 7;
                if (i6 == 0) {
                    do {
                        qugVar.g(qr4Var.B());
                        if (qr4Var.e()) {
                            return;
                        } else {
                            z2 = qr4Var.z();
                        }
                    } while (z2 == this.b);
                    this.d = z2;
                    return;
                }
                if (i6 != 2) {
                    throw bye.d();
                }
                int d2 = qr4Var.d() + qr4Var.A();
                do {
                    qugVar.g(qr4Var.B());
                } while (qr4Var.d() < d2);
                A0(d2);
                return;
        }
    }

    public void y(sse sseVar) {
        int A;
        rr4 rr4Var = (rr4) this.e;
        if ((this.b & 7) != 2) {
            throw cye.b();
        }
        do {
            sseVar.add(w());
            if (rr4Var.e()) {
                return;
            } else {
                A = rr4Var.A();
            }
        } while (A == this.b);
        this.d = A;
    }

    public long y0() {
        int i = this.c;
        if (i == 0) {
            wvs.n();
            return 0L;
        }
        long[] jArr = (long[]) this.e;
        int i2 = this.b;
        long j = jArr[i2];
        this.b = this.d & (i2 + 1);
        this.c = i - 1;
        return j;
    }

    public void z(List list) {
        int l;
        kr4 kr4Var = (kr4) this.e;
        if ((this.b & 7) != 2) {
            throw aye.b();
        }
        do {
            list.add(u());
            if (kr4Var.d()) {
                return;
            } else {
                l = kr4Var.l();
            }
        } while (l == this.b);
        this.d = l;
    }

    public void z0(int i, int i2, Object[] objArr) {
        int i3;
        Object obj;
        this.c--;
        while (true) {
            int i4 = i + 1;
            while (true) {
                i3 = i4 & i2;
                obj = objArr[i3];
                if (obj == null) {
                    objArr[i] = null;
                    return;
                }
                int hashCode = obj.hashCode() * (-1640531527);
                int i5 = (hashCode ^ (hashCode >>> 16)) & i2;
                if (i > i3) {
                    if (i >= i5 && i5 > i3) {
                        break;
                    }
                    i4 = i3 + 1;
                } else if (i < i5 && i5 <= i3) {
                    i4 = i3 + 1;
                }
            }
            objArr[i] = obj;
            i = i3;
        }
    }

    public /* synthetic */ n8n(int i, byte b) {
        this.a = i;
    }

    public n8n(rr4 rr4Var) {
        this.a = 3;
        this.d = 0;
        Charset charset = vse.a;
        this.e = rr4Var;
        rr4Var.b = this;
    }

    public n8n(kr4 kr4Var) {
        this.a = 1;
        this.d = 0;
        Charset charset = tse.a;
        this.e = kr4Var;
        kr4Var.b = this;
    }

    public n8n(int i) {
        this.a = 4;
        this.b = i;
    }

    public n8n(puj pujVar) {
        this.a = 9;
        this.e = pujVar;
    }

    public n8n(p8n p8nVar) {
        this.a = 0;
        this.e = p8nVar;
        this.b = -1;
        this.c = -1;
        this.d = -1;
    }
}
