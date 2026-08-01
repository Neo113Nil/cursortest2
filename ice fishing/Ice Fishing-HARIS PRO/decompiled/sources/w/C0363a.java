package w;

import u.C0354b;
import u.C0355c;

/* renamed from: w.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0363a extends i {
    public int s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f4498t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f4499u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f4500v0;

    @Override // w.d
    public final boolean A() {
        return this.f4500v0;
    }

    @Override // w.d
    public final boolean B() {
        return this.f4500v0;
    }

    public final boolean T() {
        int i;
        int i2;
        int i3;
        boolean z2 = true;
        int i4 = 0;
        while (true) {
            i = this.f4659r0;
            if (i4 >= i) {
                break;
            }
            d dVar = this.f4658q0[i4];
            if ((this.f4498t0 || dVar.c()) && ((((i2 = this.s0) == 0 || i2 == 1) && !dVar.A()) || (((i3 = this.s0) == 2 || i3 == 3) && !dVar.B()))) {
                z2 = false;
            }
            i4++;
        }
        if (!z2 || i <= 0) {
            return false;
        }
        int i5 = 0;
        boolean z3 = false;
        for (int i6 = 0; i6 < this.f4659r0; i6++) {
            d dVar2 = this.f4658q0[i6];
            if (this.f4498t0 || dVar2.c()) {
                if (!z3) {
                    int i7 = this.s0;
                    if (i7 == 0) {
                        i5 = dVar2.i(2).d();
                    } else if (i7 == 1) {
                        i5 = dVar2.i(4).d();
                    } else if (i7 == 2) {
                        i5 = dVar2.i(3).d();
                    } else if (i7 == 3) {
                        i5 = dVar2.i(5).d();
                    }
                    z3 = true;
                }
                int i8 = this.s0;
                if (i8 == 0) {
                    i5 = Math.min(i5, dVar2.i(2).d());
                } else if (i8 == 1) {
                    i5 = Math.max(i5, dVar2.i(4).d());
                } else if (i8 == 2) {
                    i5 = Math.min(i5, dVar2.i(3).d());
                } else if (i8 == 3) {
                    i5 = Math.max(i5, dVar2.i(5).d());
                }
            }
        }
        int i9 = i5 + this.f4499u0;
        int i10 = this.s0;
        if (i10 == 0 || i10 == 1) {
            J(i9, i9);
        } else {
            K(i9, i9);
        }
        this.f4500v0 = true;
        return true;
    }

    public final int U() {
        int i = this.s0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    @Override // w.d
    public final void b(C0355c c0355c, boolean z2) {
        boolean z3;
        int i;
        int i2;
        c[] cVarArr = this.f4537Q;
        c cVar = this.f4530I;
        cVarArr[0] = cVar;
        c cVar2 = this.J;
        int i3 = 2;
        cVarArr[2] = cVar2;
        c cVar3 = this.f4531K;
        cVarArr[1] = cVar3;
        c cVar4 = this.f4532L;
        cVarArr[3] = cVar4;
        for (c cVar5 : cVarArr) {
            cVar5.i = c0355c.k(cVar5);
        }
        int i4 = this.s0;
        if (i4 < 0 || i4 >= 4) {
            return;
        }
        c cVar6 = cVarArr[i4];
        if (!this.f4500v0) {
            T();
        }
        if (this.f4500v0) {
            this.f4500v0 = false;
            int i5 = this.s0;
            if (i5 == 0 || i5 == 1) {
                c0355c.d(cVar.i, this.f4545Y);
                c0355c.d(cVar3.i, this.f4545Y);
                return;
            } else {
                if (i5 == 2 || i5 == 3) {
                    c0355c.d(cVar2.i, this.f4546Z);
                    c0355c.d(cVar4.i, this.f4546Z);
                    return;
                }
                return;
            }
        }
        for (int i6 = 0; i6 < this.f4659r0; i6++) {
            d dVar = this.f4658q0[i6];
            if ((this.f4498t0 || dVar.c()) && ((((i2 = this.s0) == 0 || i2 == 1) && dVar.f4575p0[0] == 3 && dVar.f4530I.f4519f != null && dVar.f4531K.f4519f != null) || ((i2 == 2 || i2 == 3) && dVar.f4575p0[1] == 3 && dVar.J.f4519f != null && dVar.f4532L.f4519f != null))) {
                z3 = true;
                break;
            }
        }
        z3 = false;
        boolean z4 = cVar.g() || cVar3.g();
        boolean z5 = cVar2.g() || cVar4.g();
        int i7 = (z3 || !(((i = this.s0) == 0 && z4) || ((i == 2 && z5) || ((i == 1 && z4) || (i == 3 && z5))))) ? 4 : 5;
        int i8 = 0;
        while (i8 < this.f4659r0) {
            d dVar2 = this.f4658q0[i8];
            if (this.f4498t0 || dVar2.c()) {
                u.f k2 = c0355c.k(dVar2.f4537Q[this.s0]);
                int i9 = this.s0;
                c cVar7 = dVar2.f4537Q[i9];
                cVar7.i = k2;
                c cVar8 = cVar7.f4519f;
                int i10 = (cVar8 == null || cVar8.f4518d != this) ? 0 : cVar7.f4520g;
                if (i9 == 0 || i9 == i3) {
                    u.f fVar = cVar6.i;
                    int i11 = this.f4499u0 - i10;
                    C0354b l2 = c0355c.l();
                    u.f m2 = c0355c.m();
                    m2.f4424d = 0;
                    l2.c(fVar, k2, m2, i11);
                    c0355c.c(l2);
                } else {
                    u.f fVar2 = cVar6.i;
                    int i12 = this.f4499u0 + i10;
                    C0354b l3 = c0355c.l();
                    u.f m3 = c0355c.m();
                    m3.f4424d = 0;
                    l3.b(fVar2, k2, m3, i12);
                    c0355c.c(l3);
                }
                c0355c.e(cVar6.i, k2, this.f4499u0 + i10, i7);
            }
            i8++;
            i3 = 2;
        }
        int i13 = this.s0;
        if (i13 == 0) {
            c0355c.e(cVar3.i, cVar.i, 0, 8);
            c0355c.e(cVar.i, this.f4540T.f4531K.i, 0, 4);
            c0355c.e(cVar.i, this.f4540T.f4530I.i, 0, 0);
            return;
        }
        if (i13 == 1) {
            c0355c.e(cVar.i, cVar3.i, 0, 8);
            c0355c.e(cVar.i, this.f4540T.f4530I.i, 0, 4);
            c0355c.e(cVar.i, this.f4540T.f4531K.i, 0, 0);
        } else if (i13 == 2) {
            c0355c.e(cVar4.i, cVar2.i, 0, 8);
            c0355c.e(cVar2.i, this.f4540T.f4532L.i, 0, 4);
            c0355c.e(cVar2.i, this.f4540T.J.i, 0, 0);
        } else if (i13 == 3) {
            c0355c.e(cVar2.i, cVar4.i, 0, 8);
            c0355c.e(cVar2.i, this.f4540T.J.i, 0, 4);
            c0355c.e(cVar2.i, this.f4540T.f4532L.i, 0, 0);
        }
    }

    @Override // w.d
    public final boolean c() {
        return true;
    }

    @Override // w.d
    public final String toString() {
        String h2 = D1.h.h(new StringBuilder("[Barrier] "), this.f4561h0, " {");
        for (int i = 0; i < this.f4659r0; i++) {
            d dVar = this.f4658q0[i];
            if (i > 0) {
                h2 = D1.h.f(h2, ", ");
            }
            h2 = h2 + dVar.f4561h0;
        }
        return D1.h.f(h2, "}");
    }
}
