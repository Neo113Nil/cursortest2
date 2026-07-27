package w;

import com.google.android.gms.internal.ads.CL;
import t0.AbstractC5051n;
import u.AbstractC5088e;
import u.C5085b;
import u.C5086c;
import u.C5089f;

/* renamed from: w.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5141a extends i {

    /* renamed from: s0, reason: collision with root package name */
    public int f41386s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f41387t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f41388u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f41389v0;

    @Override // w.C5144d
    public final boolean A() {
        return this.f41389v0;
    }

    @Override // w.C5144d
    public final boolean B() {
        return this.f41389v0;
    }

    public final boolean T() {
        int i;
        int i4;
        int i9;
        boolean z8 = true;
        int i10 = 0;
        while (true) {
            i = this.f41558r0;
            if (i10 >= i) {
                break;
            }
            C5144d c5144d = this.f41557q0[i10];
            if ((this.f41387t0 || c5144d.c()) && ((((i4 = this.f41386s0) == 0 || i4 == 1) && !c5144d.A()) || (((i9 = this.f41386s0) == 2 || i9 == 3) && !c5144d.B()))) {
                z8 = false;
            }
            i10++;
        }
        if (!z8 || i <= 0) {
            return false;
        }
        int i11 = 0;
        boolean z9 = false;
        for (int i12 = 0; i12 < this.f41558r0; i12++) {
            C5144d c5144d2 = this.f41557q0[i12];
            if (this.f41387t0 || c5144d2.c()) {
                if (!z9) {
                    int i13 = this.f41386s0;
                    if (i13 == 0) {
                        i11 = c5144d2.i(2).d();
                    } else if (i13 == 1) {
                        i11 = c5144d2.i(4).d();
                    } else if (i13 == 2) {
                        i11 = c5144d2.i(3).d();
                    } else if (i13 == 3) {
                        i11 = c5144d2.i(5).d();
                    }
                    z9 = true;
                }
                int i14 = this.f41386s0;
                if (i14 == 0) {
                    i11 = Math.min(i11, c5144d2.i(2).d());
                } else if (i14 == 1) {
                    i11 = Math.max(i11, c5144d2.i(4).d());
                } else if (i14 == 2) {
                    i11 = Math.min(i11, c5144d2.i(3).d());
                } else if (i14 == 3) {
                    i11 = Math.max(i11, c5144d2.i(5).d());
                }
            }
        }
        int i15 = i11 + this.f41388u0;
        int i16 = this.f41386s0;
        if (i16 == 0 || i16 == 1) {
            J(i15, i15);
        } else {
            K(i15, i15);
        }
        this.f41389v0 = true;
        return true;
    }

    public final int U() {
        int i = this.f41386s0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    @Override // w.C5144d
    public final void b(C5086c c5086c, boolean z8) {
        boolean z9;
        int i;
        int i4;
        C5143c[] c5143cArr = this.f41429Q;
        C5143c c5143c = this.f41422I;
        c5143cArr[0] = c5143c;
        C5143c c5143c2 = this.J;
        int i9 = 2;
        c5143cArr[2] = c5143c2;
        C5143c c5143c3 = this.f41423K;
        c5143cArr[1] = c5143c3;
        C5143c c5143c4 = this.f41424L;
        c5143cArr[3] = c5143c4;
        for (C5143c c5143c5 : c5143cArr) {
            c5143c5.i = c5086c.k(c5143c5);
        }
        int i10 = this.f41386s0;
        if (i10 < 0 || i10 >= 4) {
            return;
        }
        C5143c c5143c6 = c5143cArr[i10];
        if (!this.f41389v0) {
            T();
        }
        if (this.f41389v0) {
            this.f41389v0 = false;
            int i11 = this.f41386s0;
            if (i11 == 0 || i11 == 1) {
                c5086c.d(c5143c.i, this.Y);
                c5086c.d(c5143c3.i, this.Y);
                return;
            } else {
                if (i11 == 2 || i11 == 3) {
                    c5086c.d(c5143c2.i, this.f41437Z);
                    c5086c.d(c5143c4.i, this.f41437Z);
                    return;
                }
                return;
            }
        }
        for (int i12 = 0; i12 < this.f41558r0; i12++) {
            C5144d c5144d = this.f41557q0[i12];
            if ((this.f41387t0 || c5144d.c()) && ((((i4 = this.f41386s0) == 0 || i4 == 1) && c5144d.f41467p0[0] == 3 && c5144d.f41422I.f41411f != null && c5144d.f41423K.f41411f != null) || ((i4 == 2 || i4 == 3) && c5144d.f41467p0[1] == 3 && c5144d.J.f41411f != null && c5144d.f41424L.f41411f != null))) {
                z9 = true;
                break;
            }
        }
        z9 = false;
        boolean z10 = c5143c.g() || c5143c3.g();
        boolean z11 = c5143c2.g() || c5143c4.g();
        int i13 = (z9 || !(((i = this.f41386s0) == 0 && z10) || ((i == 2 && z11) || ((i == 1 && z10) || (i == 3 && z11))))) ? 4 : 5;
        int i14 = 0;
        while (i14 < this.f41558r0) {
            C5144d c5144d2 = this.f41557q0[i14];
            if (this.f41387t0 || c5144d2.c()) {
                C5089f k6 = c5086c.k(c5144d2.f41429Q[this.f41386s0]);
                int i15 = this.f41386s0;
                C5143c c5143c7 = c5144d2.f41429Q[i15];
                c5143c7.i = k6;
                C5143c c5143c8 = c5143c7.f41411f;
                int i16 = (c5143c8 == null || c5143c8.f41409d != this) ? 0 : c5143c7.f41412g;
                if (i15 == 0 || i15 == i9) {
                    C5089f c5089f = c5143c6.i;
                    int i17 = this.f41388u0 - i16;
                    C5085b l9 = c5086c.l();
                    C5089f m8 = c5086c.m();
                    m8.f40997w = 0;
                    l9.c(c5089f, k6, m8, i17);
                    c5086c.c(l9);
                } else {
                    C5089f c5089f2 = c5143c6.i;
                    int i18 = this.f41388u0 + i16;
                    C5085b l10 = c5086c.l();
                    C5089f m9 = c5086c.m();
                    m9.f40997w = 0;
                    l10.b(c5089f2, k6, m9, i18);
                    c5086c.c(l10);
                }
                c5086c.e(c5143c6.i, k6, this.f41388u0 + i16, i13);
            }
            i14++;
            i9 = 2;
        }
        int i19 = this.f41386s0;
        if (i19 == 0) {
            c5086c.e(c5143c3.i, c5143c.i, 0, 8);
            c5086c.e(c5143c.i, this.f41432T.f41423K.i, 0, 4);
            c5086c.e(c5143c.i, this.f41432T.f41422I.i, 0, 0);
            return;
        }
        if (i19 == 1) {
            c5086c.e(c5143c.i, c5143c3.i, 0, 8);
            c5086c.e(c5143c.i, this.f41432T.f41422I.i, 0, 4);
            c5086c.e(c5143c.i, this.f41432T.f41423K.i, 0, 0);
        } else if (i19 == 2) {
            c5086c.e(c5143c4.i, c5143c2.i, 0, 8);
            c5086c.e(c5143c2.i, this.f41432T.f41424L.i, 0, 4);
            c5086c.e(c5143c2.i, this.f41432T.J.i, 0, 0);
        } else if (i19 == 3) {
            c5086c.e(c5143c2.i, c5143c4.i, 0, 8);
            c5086c.e(c5143c2.i, this.f41432T.J.i, 0, 4);
            c5086c.e(c5143c2.i, this.f41432T.f41424L.i, 0, 0);
        }
    }

    @Override // w.C5144d
    public final boolean c() {
        return true;
    }

    @Override // w.C5144d
    public final String toString() {
        String g9 = AbstractC5051n.g(new StringBuilder("[Barrier] "), this.f41453h0, " {");
        for (int i = 0; i < this.f41558r0; i++) {
            C5144d c5144d = this.f41557q0[i];
            if (i > 0) {
                g9 = CL.j(g9, ", ");
            }
            StringBuilder b9 = AbstractC5088e.b(g9);
            b9.append(c5144d.f41453h0);
            g9 = b9.toString();
        }
        return CL.j(g9, "}");
    }
}
