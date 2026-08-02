package w;

import com.google.android.gms.internal.ads.Wv;
import u.AbstractC5050e;
import u.C5047b;
import u.C5048c;
import u.C5051f;

/* renamed from: w.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5126a extends j {

    /* renamed from: s0, reason: collision with root package name */
    public int f41230s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f41231t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f41232u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f41233v0;

    @Override // w.C5130e
    public final boolean A() {
        return this.f41233v0;
    }

    @Override // w.C5130e
    public final boolean B() {
        return this.f41233v0;
    }

    public final boolean T() {
        int i;
        int i4;
        int i6;
        boolean z6 = true;
        int i9 = 0;
        while (true) {
            i = this.f41402r0;
            if (i9 >= i) {
                break;
            }
            C5130e c5130e = this.f41401q0[i9];
            if ((this.f41231t0 || c5130e.c()) && ((((i4 = this.f41230s0) == 0 || i4 == 1) && !c5130e.A()) || (((i6 = this.f41230s0) == 2 || i6 == 3) && !c5130e.B()))) {
                z6 = false;
            }
            i9++;
        }
        if (!z6 || i <= 0) {
            return false;
        }
        int i10 = 0;
        boolean z9 = false;
        for (int i11 = 0; i11 < this.f41402r0; i11++) {
            C5130e c5130e2 = this.f41401q0[i11];
            if (this.f41231t0 || c5130e2.c()) {
                if (!z9) {
                    int i12 = this.f41230s0;
                    if (i12 == 0) {
                        i10 = c5130e2.i(2).d();
                    } else if (i12 == 1) {
                        i10 = c5130e2.i(4).d();
                    } else if (i12 == 2) {
                        i10 = c5130e2.i(3).d();
                    } else if (i12 == 3) {
                        i10 = c5130e2.i(5).d();
                    }
                    z9 = true;
                }
                int i13 = this.f41230s0;
                if (i13 == 0) {
                    i10 = Math.min(i10, c5130e2.i(2).d());
                } else if (i13 == 1) {
                    i10 = Math.max(i10, c5130e2.i(4).d());
                } else if (i13 == 2) {
                    i10 = Math.min(i10, c5130e2.i(3).d());
                } else if (i13 == 3) {
                    i10 = Math.max(i10, c5130e2.i(5).d());
                }
            }
        }
        int i14 = i10 + this.f41232u0;
        int i15 = this.f41230s0;
        if (i15 == 0 || i15 == 1) {
            J(i14, i14);
        } else {
            K(i14, i14);
        }
        this.f41233v0 = true;
        return true;
    }

    public final int U() {
        int i = this.f41230s0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    @Override // w.C5130e
    public final void b(C5048c c5048c, boolean z6) {
        boolean z9;
        int i;
        int i4;
        C5129d[] c5129dArr = this.f41273Q;
        C5129d c5129d = this.f41266I;
        c5129dArr[0] = c5129d;
        C5129d c5129d2 = this.J;
        int i6 = 2;
        c5129dArr[2] = c5129d2;
        C5129d c5129d3 = this.f41267K;
        c5129dArr[1] = c5129d3;
        C5129d c5129d4 = this.f41268L;
        c5129dArr[3] = c5129d4;
        for (C5129d c5129d5 : c5129dArr) {
            c5129d5.i = c5048c.k(c5129d5);
        }
        int i9 = this.f41230s0;
        if (i9 < 0 || i9 >= 4) {
            return;
        }
        C5129d c5129d6 = c5129dArr[i9];
        if (!this.f41233v0) {
            T();
        }
        if (this.f41233v0) {
            this.f41233v0 = false;
            int i10 = this.f41230s0;
            if (i10 == 0 || i10 == 1) {
                c5048c.d(c5129d.i, this.Y);
                c5048c.d(c5129d3.i, this.Y);
                return;
            } else {
                if (i10 == 2 || i10 == 3) {
                    c5048c.d(c5129d2.i, this.f41281Z);
                    c5048c.d(c5129d4.i, this.f41281Z);
                    return;
                }
                return;
            }
        }
        for (int i11 = 0; i11 < this.f41402r0; i11++) {
            C5130e c5130e = this.f41401q0[i11];
            if ((this.f41231t0 || c5130e.c()) && ((((i4 = this.f41230s0) == 0 || i4 == 1) && c5130e.f41311p0[0] == 3 && c5130e.f41266I.f41255f != null && c5130e.f41267K.f41255f != null) || ((i4 == 2 || i4 == 3) && c5130e.f41311p0[1] == 3 && c5130e.J.f41255f != null && c5130e.f41268L.f41255f != null))) {
                z9 = true;
                break;
            }
        }
        z9 = false;
        boolean z10 = c5129d.g() || c5129d3.g();
        boolean z11 = c5129d2.g() || c5129d4.g();
        int i12 = (z9 || !(((i = this.f41230s0) == 0 && z10) || ((i == 2 && z11) || ((i == 1 && z10) || (i == 3 && z11))))) ? 4 : 5;
        int i13 = 0;
        while (i13 < this.f41402r0) {
            C5130e c5130e2 = this.f41401q0[i13];
            if (this.f41231t0 || c5130e2.c()) {
                C5051f k9 = c5048c.k(c5130e2.f41273Q[this.f41230s0]);
                int i14 = this.f41230s0;
                C5129d c5129d7 = c5130e2.f41273Q[i14];
                c5129d7.i = k9;
                C5129d c5129d8 = c5129d7.f41255f;
                int i15 = (c5129d8 == null || c5129d8.f41253d != this) ? 0 : c5129d7.f41256g;
                if (i14 == 0 || i14 == i6) {
                    C5051f c5051f = c5129d6.i;
                    int i16 = this.f41232u0 - i15;
                    C5047b l9 = c5048c.l();
                    C5051f m9 = c5048c.m();
                    m9.f40945w = 0;
                    l9.c(c5051f, k9, m9, i16);
                    c5048c.c(l9);
                } else {
                    C5051f c5051f2 = c5129d6.i;
                    int i17 = this.f41232u0 + i15;
                    C5047b l10 = c5048c.l();
                    C5051f m10 = c5048c.m();
                    m10.f40945w = 0;
                    l10.b(c5051f2, k9, m10, i17);
                    c5048c.c(l10);
                }
                c5048c.e(c5129d6.i, k9, this.f41232u0 + i15, i12);
            }
            i13++;
            i6 = 2;
        }
        int i18 = this.f41230s0;
        if (i18 == 0) {
            c5048c.e(c5129d3.i, c5129d.i, 0, 8);
            c5048c.e(c5129d.i, this.f41276T.f41267K.i, 0, 4);
            c5048c.e(c5129d.i, this.f41276T.f41266I.i, 0, 0);
            return;
        }
        if (i18 == 1) {
            c5048c.e(c5129d.i, c5129d3.i, 0, 8);
            c5048c.e(c5129d.i, this.f41276T.f41266I.i, 0, 4);
            c5048c.e(c5129d.i, this.f41276T.f41267K.i, 0, 0);
        } else if (i18 == 2) {
            c5048c.e(c5129d4.i, c5129d2.i, 0, 8);
            c5048c.e(c5129d2.i, this.f41276T.f41268L.i, 0, 4);
            c5048c.e(c5129d2.i, this.f41276T.J.i, 0, 0);
        } else if (i18 == 3) {
            c5048c.e(c5129d2.i, c5129d4.i, 0, 8);
            c5048c.e(c5129d2.i, this.f41276T.J.i, 0, 4);
            c5048c.e(c5129d2.i, this.f41276T.f41268L.i, 0, 0);
        }
    }

    @Override // w.C5130e
    public final boolean c() {
        return true;
    }

    @Override // w.C5130e
    public final String toString() {
        String i = Wv.i(new StringBuilder("[Barrier] "), this.f41297h0, " {");
        for (int i4 = 0; i4 < this.f41402r0; i4++) {
            C5130e c5130e = this.f41401q0[i4];
            if (i4 > 0) {
                i = Wv.g(i, ", ");
            }
            StringBuilder b9 = AbstractC5050e.b(i);
            b9.append(c5130e.f41297h0);
            i = b9.toString();
        }
        return Wv.g(i, "}");
    }
}
