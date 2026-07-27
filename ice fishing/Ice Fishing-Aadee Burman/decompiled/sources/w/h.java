package w;

import java.util.ArrayList;
import u.AbstractC5049e;
import u.C5046b;
import u.C5047c;
import u.C5050f;

/* loaded from: classes.dex */
public final class h extends C5139d {

    /* renamed from: q0, reason: collision with root package name */
    public float f41613q0 = -1.0f;

    /* renamed from: r0, reason: collision with root package name */
    public int f41614r0 = -1;

    /* renamed from: s0, reason: collision with root package name */
    public int f41615s0 = -1;

    /* renamed from: t0, reason: collision with root package name */
    public C5138c f41616t0 = this.J;

    /* renamed from: u0, reason: collision with root package name */
    public int f41617u0 = 0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f41618v0;

    public h() {
        this.f41492R.clear();
        this.f41492R.add(this.f41616t0);
        int length = this.f41491Q.length;
        for (int i = 0; i < length; i++) {
            this.f41491Q[i] = this.f41616t0;
        }
    }

    @Override // w.C5139d
    public final boolean A() {
        return this.f41618v0;
    }

    @Override // w.C5139d
    public final boolean B() {
        return this.f41618v0;
    }

    @Override // w.C5139d
    public final void Q(C5047c c5047c, boolean z3) {
        if (this.f41494T == null) {
            return;
        }
        C5138c c5138c = this.f41616t0;
        c5047c.getClass();
        int n9 = C5047c.n(c5138c);
        if (this.f41617u0 == 1) {
            this.Y = n9;
            this.f41499Z = 0;
            L(this.f41494T.k());
            O(0);
            return;
        }
        this.Y = 0;
        this.f41499Z = n9;
        O(this.f41494T.q());
        L(0);
    }

    public final void R(int i) {
        this.f41616t0.l(i);
        this.f41618v0 = true;
    }

    public final void S(int i) {
        if (this.f41617u0 == i) {
            return;
        }
        this.f41617u0 = i;
        ArrayList arrayList = this.f41492R;
        arrayList.clear();
        if (this.f41617u0 == 1) {
            this.f41616t0 = this.f41484I;
        } else {
            this.f41616t0 = this.J;
        }
        arrayList.add(this.f41616t0);
        C5138c[] c5138cArr = this.f41491Q;
        int length = c5138cArr.length;
        for (int i6 = 0; i6 < length; i6++) {
            c5138cArr[i6] = this.f41616t0;
        }
    }

    @Override // w.C5139d
    public final void b(C5047c c5047c, boolean z3) {
        C5140e c5140e = (C5140e) this.f41494T;
        if (c5140e == null) {
            return;
        }
        Object i = c5140e.i(2);
        Object i6 = c5140e.i(4);
        C5139d c5139d = this.f41494T;
        boolean z6 = c5139d != null && c5139d.f41529p0[0] == 2;
        if (this.f41617u0 == 0) {
            i = c5140e.i(3);
            i6 = c5140e.i(5);
            C5139d c5139d2 = this.f41494T;
            z6 = c5139d2 != null && c5139d2.f41529p0[1] == 2;
        }
        if (this.f41618v0) {
            C5138c c5138c = this.f41616t0;
            if (c5138c.f41470c) {
                C5050f k9 = c5047c.k(c5138c);
                c5047c.d(k9, this.f41616t0.d());
                if (this.f41614r0 != -1) {
                    if (z6) {
                        c5047c.f(c5047c.k(i6), k9, 0, 5);
                    }
                } else if (this.f41615s0 != -1 && z6) {
                    C5050f k10 = c5047c.k(i6);
                    c5047c.f(k9, c5047c.k(i), 0, 5);
                    c5047c.f(k10, k9, 0, 5);
                }
                this.f41618v0 = false;
                return;
            }
        }
        if (this.f41614r0 != -1) {
            C5050f k11 = c5047c.k(this.f41616t0);
            c5047c.e(k11, c5047c.k(i), this.f41614r0, 8);
            if (z6) {
                c5047c.f(c5047c.k(i6), k11, 0, 5);
                return;
            }
            return;
        }
        if (this.f41615s0 != -1) {
            C5050f k12 = c5047c.k(this.f41616t0);
            C5050f k13 = c5047c.k(i6);
            c5047c.e(k12, k13, -this.f41615s0, 8);
            if (z6) {
                c5047c.f(k12, c5047c.k(i), 0, 5);
                c5047c.f(k13, k12, 0, 5);
                return;
            }
            return;
        }
        if (this.f41613q0 != -1.0f) {
            C5050f k14 = c5047c.k(this.f41616t0);
            C5050f k15 = c5047c.k(i6);
            float f3 = this.f41613q0;
            C5046b l9 = c5047c.l();
            l9.f40950d.g(k14, -1.0f);
            l9.f40950d.g(k15, f3);
            c5047c.c(l9);
        }
    }

    @Override // w.C5139d
    public final boolean c() {
        return true;
    }

    @Override // w.C5139d
    public final C5138c i(int i) {
        int d2 = AbstractC5049e.d(i);
        if (d2 != 1) {
            if (d2 != 2) {
                if (d2 != 3) {
                    if (d2 != 4) {
                        return null;
                    }
                }
            }
            if (this.f41617u0 == 0) {
                return this.f41616t0;
            }
            return null;
        }
        if (this.f41617u0 == 1) {
            return this.f41616t0;
        }
        return null;
    }
}
