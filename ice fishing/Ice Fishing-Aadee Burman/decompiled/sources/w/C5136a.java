package w;

import com.icefishing.icefishinglive2.AbstractC4404f;
import u.AbstractC5049e;
import u.C5046b;
import u.C5047c;
import u.C5050f;

/* renamed from: w.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5136a extends i {

    /* renamed from: s0, reason: collision with root package name */
    public int f41448s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f41449t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f41450u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f41451v0;

    @Override // w.C5139d
    public final boolean A() {
        return this.f41451v0;
    }

    @Override // w.C5139d
    public final boolean B() {
        return this.f41451v0;
    }

    public final boolean T() {
        int i;
        int i6;
        int i9;
        boolean z3 = true;
        int i10 = 0;
        while (true) {
            i = this.f41620r0;
            if (i10 >= i) {
                break;
            }
            C5139d c5139d = this.f41619q0[i10];
            if ((this.f41449t0 || c5139d.c()) && ((((i6 = this.f41448s0) == 0 || i6 == 1) && !c5139d.A()) || (((i9 = this.f41448s0) == 2 || i9 == 3) && !c5139d.B()))) {
                z3 = false;
            }
            i10++;
        }
        if (!z3 || i <= 0) {
            return false;
        }
        int i11 = 0;
        boolean z6 = false;
        for (int i12 = 0; i12 < this.f41620r0; i12++) {
            C5139d c5139d2 = this.f41619q0[i12];
            if (this.f41449t0 || c5139d2.c()) {
                if (!z6) {
                    int i13 = this.f41448s0;
                    if (i13 == 0) {
                        i11 = c5139d2.i(2).d();
                    } else if (i13 == 1) {
                        i11 = c5139d2.i(4).d();
                    } else if (i13 == 2) {
                        i11 = c5139d2.i(3).d();
                    } else if (i13 == 3) {
                        i11 = c5139d2.i(5).d();
                    }
                    z6 = true;
                }
                int i14 = this.f41448s0;
                if (i14 == 0) {
                    i11 = Math.min(i11, c5139d2.i(2).d());
                } else if (i14 == 1) {
                    i11 = Math.max(i11, c5139d2.i(4).d());
                } else if (i14 == 2) {
                    i11 = Math.min(i11, c5139d2.i(3).d());
                } else if (i14 == 3) {
                    i11 = Math.max(i11, c5139d2.i(5).d());
                }
            }
        }
        int i15 = i11 + this.f41450u0;
        int i16 = this.f41448s0;
        if (i16 == 0 || i16 == 1) {
            J(i15, i15);
        } else {
            K(i15, i15);
        }
        this.f41451v0 = true;
        return true;
    }

    public final int U() {
        int i = this.f41448s0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    @Override // w.C5139d
    public final void b(C5047c c5047c, boolean z3) {
        boolean z6;
        int i;
        int i6;
        C5138c[] c5138cArr = this.f41491Q;
        C5138c c5138c = this.f41484I;
        c5138cArr[0] = c5138c;
        C5138c c5138c2 = this.J;
        int i9 = 2;
        c5138cArr[2] = c5138c2;
        C5138c c5138c3 = this.f41485K;
        c5138cArr[1] = c5138c3;
        C5138c c5138c4 = this.f41486L;
        c5138cArr[3] = c5138c4;
        for (C5138c c5138c5 : c5138cArr) {
            c5138c5.i = c5047c.k(c5138c5);
        }
        int i10 = this.f41448s0;
        if (i10 < 0 || i10 >= 4) {
            return;
        }
        C5138c c5138c6 = c5138cArr[i10];
        if (!this.f41451v0) {
            T();
        }
        if (this.f41451v0) {
            this.f41451v0 = false;
            int i11 = this.f41448s0;
            if (i11 == 0 || i11 == 1) {
                c5047c.d(c5138c.i, this.Y);
                c5047c.d(c5138c3.i, this.Y);
                return;
            } else {
                if (i11 == 2 || i11 == 3) {
                    c5047c.d(c5138c2.i, this.f41499Z);
                    c5047c.d(c5138c4.i, this.f41499Z);
                    return;
                }
                return;
            }
        }
        for (int i12 = 0; i12 < this.f41620r0; i12++) {
            C5139d c5139d = this.f41619q0[i12];
            if ((this.f41449t0 || c5139d.c()) && ((((i6 = this.f41448s0) == 0 || i6 == 1) && c5139d.f41529p0[0] == 3 && c5139d.f41484I.f41473f != null && c5139d.f41485K.f41473f != null) || ((i6 == 2 || i6 == 3) && c5139d.f41529p0[1] == 3 && c5139d.J.f41473f != null && c5139d.f41486L.f41473f != null))) {
                z6 = true;
                break;
            }
        }
        z6 = false;
        boolean z9 = c5138c.g() || c5138c3.g();
        boolean z10 = c5138c2.g() || c5138c4.g();
        int i13 = (z6 || !(((i = this.f41448s0) == 0 && z9) || ((i == 2 && z10) || ((i == 1 && z9) || (i == 3 && z10))))) ? 4 : 5;
        int i14 = 0;
        while (i14 < this.f41620r0) {
            C5139d c5139d2 = this.f41619q0[i14];
            if (this.f41449t0 || c5139d2.c()) {
                C5050f k9 = c5047c.k(c5139d2.f41491Q[this.f41448s0]);
                int i15 = this.f41448s0;
                C5138c c5138c7 = c5139d2.f41491Q[i15];
                c5138c7.i = k9;
                C5138c c5138c8 = c5138c7.f41473f;
                int i16 = (c5138c8 == null || c5138c8.f41471d != this) ? 0 : c5138c7.f41474g;
                if (i15 == 0 || i15 == i9) {
                    C5050f c5050f = c5138c6.i;
                    int i17 = this.f41450u0 - i16;
                    C5046b l9 = c5047c.l();
                    C5050f m4 = c5047c.m();
                    m4.f40980w = 0;
                    l9.c(c5050f, k9, m4, i17);
                    c5047c.c(l9);
                } else {
                    C5050f c5050f2 = c5138c6.i;
                    int i18 = this.f41450u0 + i16;
                    C5046b l10 = c5047c.l();
                    C5050f m9 = c5047c.m();
                    m9.f40980w = 0;
                    l10.b(c5050f2, k9, m9, i18);
                    c5047c.c(l10);
                }
                c5047c.e(c5138c6.i, k9, this.f41450u0 + i16, i13);
            }
            i14++;
            i9 = 2;
        }
        int i19 = this.f41448s0;
        if (i19 == 0) {
            c5047c.e(c5138c3.i, c5138c.i, 0, 8);
            c5047c.e(c5138c.i, this.f41494T.f41485K.i, 0, 4);
            c5047c.e(c5138c.i, this.f41494T.f41484I.i, 0, 0);
            return;
        }
        if (i19 == 1) {
            c5047c.e(c5138c.i, c5138c3.i, 0, 8);
            c5047c.e(c5138c.i, this.f41494T.f41484I.i, 0, 4);
            c5047c.e(c5138c.i, this.f41494T.f41485K.i, 0, 0);
        } else if (i19 == 2) {
            c5047c.e(c5138c4.i, c5138c2.i, 0, 8);
            c5047c.e(c5138c2.i, this.f41494T.f41486L.i, 0, 4);
            c5047c.e(c5138c2.i, this.f41494T.J.i, 0, 0);
        } else if (i19 == 3) {
            c5047c.e(c5138c2.i, c5138c4.i, 0, 8);
            c5047c.e(c5138c2.i, this.f41494T.J.i, 0, 4);
            c5047c.e(c5138c2.i, this.f41494T.f41486L.i, 0, 0);
        }
    }

    @Override // w.C5139d
    public final boolean c() {
        return true;
    }

    @Override // w.C5139d
    public final String toString() {
        String g4 = u1.h.g(new StringBuilder("[Barrier] "), this.f41515h0, " {");
        for (int i = 0; i < this.f41620r0; i++) {
            C5139d c5139d = this.f41619q0[i];
            if (i > 0) {
                g4 = AbstractC4404f.f(g4, ", ");
            }
            StringBuilder b9 = AbstractC5049e.b(g4);
            b9.append(c5139d.f41515h0);
            g4 = b9.toString();
        }
        return AbstractC4404f.f(g4, "}");
    }
}
