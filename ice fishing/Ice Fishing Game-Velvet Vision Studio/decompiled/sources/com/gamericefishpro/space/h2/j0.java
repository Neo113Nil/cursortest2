package com.gamericefishpro.space.h2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 {
    public final f0 a;
    public boolean b;
    public boolean c;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public int l;
    public boolean m;
    public boolean n;
    public int o;
    public r0 q;
    public b0 d = b0.w;
    public final v0 p = new v0(this);

    public j0(f0 f0Var) {
        this.a = f0Var;
    }

    public final f1 a() {
        return this.a.Z.d;
    }

    public final void b() {
        b0 b0Var = this.a.a0.d;
        if (b0Var == b0.i || b0Var == b0.v) {
            if (this.p.S) {
                g(true);
            } else {
                f(true);
            }
        }
        if (b0Var == b0.v) {
            r0 r0Var = this.q;
            if (r0Var == null || !r0Var.M) {
                h(true);
            } else {
                i(true);
            }
        }
    }

    public final void c(long j) {
        r0 r0Var = this.q;
        if (r0Var != null) {
            b0 b0Var = b0.e;
            j0 j0Var = r0Var.y;
            j0Var.d = b0Var;
            v0 v0Var = j0Var.p;
            f0 f0Var = j0Var.a;
            j0Var.e = false;
            r0Var.Q = j;
            q1 snapshotObserver = ((com.gamericefishpro.space.i2.t) i0.a(f0Var)).getSnapshotObserver();
            q0 q0Var = r0Var.R;
            snapshotObserver.a.c(f0Var, snapshotObserver.b, q0Var);
            j0Var.f = true;
            j0Var.g = true;
            if (k.o(f0Var)) {
                v0Var.N = true;
                v0Var.O = true;
            } else {
                v0Var.M = true;
            }
            j0Var.d = b0.w;
        }
    }

    public final void d(int i) {
        int i2 = this.l;
        this.l = i;
        if ((i2 == 0) != (i == 0)) {
            f0 f0VarV = this.a.v();
            j0 j0Var = f0VarV != null ? f0VarV.a0 : null;
            if (j0Var != null) {
                if (i == 0) {
                    j0Var.d(j0Var.l - 1);
                } else {
                    j0Var.d(j0Var.l + 1);
                }
            }
        }
    }

    public final void e(int i) {
        int i2 = this.o;
        this.o = i;
        if ((i2 == 0) != (i == 0)) {
            f0 f0VarV = this.a.v();
            j0 j0Var = f0VarV != null ? f0VarV.a0 : null;
            if (j0Var != null) {
                if (i == 0) {
                    j0Var.e(j0Var.o - 1);
                } else {
                    j0Var.e(j0Var.o + 1);
                }
            }
        }
    }

    public final void f(boolean z) {
        if (this.k != z) {
            this.k = z;
            if (z && !this.j) {
                d(this.l + 1);
            } else {
                if (z || this.j) {
                    return;
                }
                d(this.l - 1);
            }
        }
    }

    public final void g(boolean z) {
        if (this.j != z) {
            this.j = z;
            if (z && !this.k) {
                d(this.l + 1);
            } else {
                if (z || this.k) {
                    return;
                }
                d(this.l - 1);
            }
        }
    }

    public final void h(boolean z) {
        if (this.n != z) {
            this.n = z;
            if (z && !this.m) {
                e(this.o + 1);
            } else {
                if (z || this.m) {
                    return;
                }
                e(this.o - 1);
            }
        }
    }

    public final void i(boolean z) {
        if (this.m != z) {
            this.m = z;
            if (z && !this.n) {
                e(this.o + 1);
            } else {
                if (z || this.n) {
                    return;
                }
                e(this.o - 1);
            }
        }
    }

    public final void j() {
        v0 v0Var = this.p;
        j0 j0Var = v0Var.y;
        Object obj = v0Var.J;
        f0 f0Var = this.a;
        if ((obj != null || j0Var.a().i() != null) && v0Var.I) {
            v0Var.I = false;
            v0Var.J = j0Var.a().i();
            f0 f0VarV = f0Var.v();
            if (f0VarV != null) {
                f0.V(f0VarV, false, 7);
            }
        }
        r0 r0Var = this.q;
        if (r0Var != null) {
            j0 j0Var2 = r0Var.y;
            if (r0Var.P == null) {
                o0 o0VarI0 = j0Var2.a().I0();
                Intrinsics.b(o0VarI0);
                if (o0VarI0.H.i() == null) {
                    return;
                }
            }
            if (r0Var.O) {
                r0Var.O = false;
                o0 o0VarI1 = j0Var2.a().I0();
                Intrinsics.b(o0VarI1);
                r0Var.P = o0VarI1.H.i();
                if (k.o(f0Var)) {
                    f0 f0VarV2 = f0Var.v();
                    if (f0VarV2 != null) {
                        f0.V(f0VarV2, false, 7);
                        return;
                    }
                    return;
                }
                f0 f0VarV3 = f0Var.v();
                if (f0VarV3 != null) {
                    f0.T(f0VarV3, false, 7);
                }
            }
        }
    }
}
