package w;

import java.util.ArrayList;
import u.AbstractC5088e;
import u.C5085b;
import u.C5086c;
import u.C5089f;

/* loaded from: classes.dex */
public final class h extends C5144d {

    /* renamed from: q0, reason: collision with root package name */
    public float f41551q0 = -1.0f;

    /* renamed from: r0, reason: collision with root package name */
    public int f41552r0 = -1;

    /* renamed from: s0, reason: collision with root package name */
    public int f41553s0 = -1;

    /* renamed from: t0, reason: collision with root package name */
    public C5143c f41554t0 = this.J;

    /* renamed from: u0, reason: collision with root package name */
    public int f41555u0 = 0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f41556v0;

    public h() {
        this.f41430R.clear();
        this.f41430R.add(this.f41554t0);
        int length = this.f41429Q.length;
        for (int i = 0; i < length; i++) {
            this.f41429Q[i] = this.f41554t0;
        }
    }

    @Override // w.C5144d
    public final boolean A() {
        return this.f41556v0;
    }

    @Override // w.C5144d
    public final boolean B() {
        return this.f41556v0;
    }

    @Override // w.C5144d
    public final void Q(C5086c c5086c, boolean z8) {
        if (this.f41432T == null) {
            return;
        }
        C5143c c5143c = this.f41554t0;
        c5086c.getClass();
        int n9 = C5086c.n(c5143c);
        if (this.f41555u0 == 1) {
            this.Y = n9;
            this.f41437Z = 0;
            L(this.f41432T.k());
            O(0);
            return;
        }
        this.Y = 0;
        this.f41437Z = n9;
        O(this.f41432T.q());
        L(0);
    }

    public final void R(int i) {
        this.f41554t0.l(i);
        this.f41556v0 = true;
    }

    public final void S(int i) {
        if (this.f41555u0 == i) {
            return;
        }
        this.f41555u0 = i;
        ArrayList arrayList = this.f41430R;
        arrayList.clear();
        if (this.f41555u0 == 1) {
            this.f41554t0 = this.f41422I;
        } else {
            this.f41554t0 = this.J;
        }
        arrayList.add(this.f41554t0);
        C5143c[] c5143cArr = this.f41429Q;
        int length = c5143cArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            c5143cArr[i4] = this.f41554t0;
        }
    }

    @Override // w.C5144d
    public final void b(C5086c c5086c, boolean z8) {
        C5145e c5145e = (C5145e) this.f41432T;
        if (c5145e == null) {
            return;
        }
        Object i = c5145e.i(2);
        Object i4 = c5145e.i(4);
        C5144d c5144d = this.f41432T;
        boolean z9 = c5144d != null && c5144d.f41467p0[0] == 2;
        if (this.f41555u0 == 0) {
            i = c5145e.i(3);
            i4 = c5145e.i(5);
            C5144d c5144d2 = this.f41432T;
            z9 = c5144d2 != null && c5144d2.f41467p0[1] == 2;
        }
        if (this.f41556v0) {
            C5143c c5143c = this.f41554t0;
            if (c5143c.f41408c) {
                C5089f k6 = c5086c.k(c5143c);
                c5086c.d(k6, this.f41554t0.d());
                if (this.f41552r0 != -1) {
                    if (z9) {
                        c5086c.f(c5086c.k(i4), k6, 0, 5);
                    }
                } else if (this.f41553s0 != -1 && z9) {
                    C5089f k9 = c5086c.k(i4);
                    c5086c.f(k6, c5086c.k(i), 0, 5);
                    c5086c.f(k9, k6, 0, 5);
                }
                this.f41556v0 = false;
                return;
            }
        }
        if (this.f41552r0 != -1) {
            C5089f k10 = c5086c.k(this.f41554t0);
            c5086c.e(k10, c5086c.k(i), this.f41552r0, 8);
            if (z9) {
                c5086c.f(c5086c.k(i4), k10, 0, 5);
                return;
            }
            return;
        }
        if (this.f41553s0 != -1) {
            C5089f k11 = c5086c.k(this.f41554t0);
            C5089f k12 = c5086c.k(i4);
            c5086c.e(k11, k12, -this.f41553s0, 8);
            if (z9) {
                c5086c.f(k11, c5086c.k(i), 0, 5);
                c5086c.f(k12, k11, 0, 5);
                return;
            }
            return;
        }
        if (this.f41551q0 != -1.0f) {
            C5089f k13 = c5086c.k(this.f41554t0);
            C5089f k14 = c5086c.k(i4);
            float f6 = this.f41551q0;
            C5085b l9 = c5086c.l();
            l9.f40967d.g(k13, -1.0f);
            l9.f40967d.g(k14, f6);
            c5086c.c(l9);
        }
    }

    @Override // w.C5144d
    public final boolean c() {
        return true;
    }

    @Override // w.C5144d
    public final C5143c i(int i) {
        int d2 = AbstractC5088e.d(i);
        if (d2 != 1) {
            if (d2 != 2) {
                if (d2 != 3) {
                    if (d2 != 4) {
                        return null;
                    }
                }
            }
            if (this.f41555u0 == 0) {
                return this.f41554t0;
            }
            return null;
        }
        if (this.f41555u0 == 1) {
            return this.f41554t0;
        }
        return null;
    }
}
