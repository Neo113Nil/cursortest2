package w;

import java.util.ArrayList;
import u.AbstractC5050e;
import u.C5047b;
import u.C5048c;
import u.C5051f;

/* loaded from: classes.dex */
public final class i extends C5130e {

    /* renamed from: q0, reason: collision with root package name */
    public float f41395q0 = -1.0f;

    /* renamed from: r0, reason: collision with root package name */
    public int f41396r0 = -1;

    /* renamed from: s0, reason: collision with root package name */
    public int f41397s0 = -1;

    /* renamed from: t0, reason: collision with root package name */
    public C5129d f41398t0 = this.J;

    /* renamed from: u0, reason: collision with root package name */
    public int f41399u0 = 0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f41400v0;

    public i() {
        this.f41274R.clear();
        this.f41274R.add(this.f41398t0);
        int length = this.f41273Q.length;
        for (int i = 0; i < length; i++) {
            this.f41273Q[i] = this.f41398t0;
        }
    }

    @Override // w.C5130e
    public final boolean A() {
        return this.f41400v0;
    }

    @Override // w.C5130e
    public final boolean B() {
        return this.f41400v0;
    }

    @Override // w.C5130e
    public final void Q(C5048c c5048c, boolean z6) {
        if (this.f41276T == null) {
            return;
        }
        C5129d c5129d = this.f41398t0;
        c5048c.getClass();
        int n9 = C5048c.n(c5129d);
        if (this.f41399u0 == 1) {
            this.Y = n9;
            this.f41281Z = 0;
            L(this.f41276T.k());
            O(0);
            return;
        }
        this.Y = 0;
        this.f41281Z = n9;
        O(this.f41276T.q());
        L(0);
    }

    public final void R(int i) {
        this.f41398t0.l(i);
        this.f41400v0 = true;
    }

    public final void S(int i) {
        if (this.f41399u0 == i) {
            return;
        }
        this.f41399u0 = i;
        ArrayList arrayList = this.f41274R;
        arrayList.clear();
        if (this.f41399u0 == 1) {
            this.f41398t0 = this.f41266I;
        } else {
            this.f41398t0 = this.J;
        }
        arrayList.add(this.f41398t0);
        C5129d[] c5129dArr = this.f41273Q;
        int length = c5129dArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            c5129dArr[i4] = this.f41398t0;
        }
    }

    @Override // w.C5130e
    public final void b(C5048c c5048c, boolean z6) {
        f fVar = (f) this.f41276T;
        if (fVar == null) {
            return;
        }
        Object i = fVar.i(2);
        Object i4 = fVar.i(4);
        C5130e c5130e = this.f41276T;
        boolean z9 = c5130e != null && c5130e.f41311p0[0] == 2;
        if (this.f41399u0 == 0) {
            i = fVar.i(3);
            i4 = fVar.i(5);
            C5130e c5130e2 = this.f41276T;
            z9 = c5130e2 != null && c5130e2.f41311p0[1] == 2;
        }
        if (this.f41400v0) {
            C5129d c5129d = this.f41398t0;
            if (c5129d.f41252c) {
                C5051f k9 = c5048c.k(c5129d);
                c5048c.d(k9, this.f41398t0.d());
                if (this.f41396r0 != -1) {
                    if (z9) {
                        c5048c.f(c5048c.k(i4), k9, 0, 5);
                    }
                } else if (this.f41397s0 != -1 && z9) {
                    C5051f k10 = c5048c.k(i4);
                    c5048c.f(k9, c5048c.k(i), 0, 5);
                    c5048c.f(k10, k9, 0, 5);
                }
                this.f41400v0 = false;
                return;
            }
        }
        if (this.f41396r0 != -1) {
            C5051f k11 = c5048c.k(this.f41398t0);
            c5048c.e(k11, c5048c.k(i), this.f41396r0, 8);
            if (z9) {
                c5048c.f(c5048c.k(i4), k11, 0, 5);
                return;
            }
            return;
        }
        if (this.f41397s0 != -1) {
            C5051f k12 = c5048c.k(this.f41398t0);
            C5051f k13 = c5048c.k(i4);
            c5048c.e(k12, k13, -this.f41397s0, 8);
            if (z9) {
                c5048c.f(k12, c5048c.k(i), 0, 5);
                c5048c.f(k13, k12, 0, 5);
                return;
            }
            return;
        }
        if (this.f41395q0 != -1.0f) {
            C5051f k14 = c5048c.k(this.f41398t0);
            C5051f k15 = c5048c.k(i4);
            float f2 = this.f41395q0;
            C5047b l9 = c5048c.l();
            l9.f40915d.g(k14, -1.0f);
            l9.f40915d.g(k15, f2);
            c5048c.c(l9);
        }
    }

    @Override // w.C5130e
    public final boolean c() {
        return true;
    }

    @Override // w.C5130e
    public final C5129d i(int i) {
        int d9 = AbstractC5050e.d(i);
        if (d9 != 1) {
            if (d9 != 2) {
                if (d9 != 3) {
                    if (d9 != 4) {
                        return null;
                    }
                }
            }
            if (this.f41399u0 == 0) {
                return this.f41398t0;
            }
            return null;
        }
        if (this.f41399u0 == 1) {
            return this.f41398t0;
        }
        return null;
    }
}
