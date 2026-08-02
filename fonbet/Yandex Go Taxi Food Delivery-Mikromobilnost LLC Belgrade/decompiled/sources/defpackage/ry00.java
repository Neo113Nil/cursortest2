package defpackage;

import android.util.Pair;

/* loaded from: classes10.dex */
public final class ry00 extends ob51 {
    public final boolean E;
    public final z8z0 F;
    public final y8z0 G;
    public py00 H;
    public oy00 I;
    public boolean J;
    public boolean K;
    public boolean L;

    public ry00(uf10 uf10Var, boolean z) {
        super(uf10Var);
        this.E = z && uf10Var.isSingleWindow();
        this.F = new z8z0();
        this.G = new y8z0();
        a9z0 initialTimeline = uf10Var.getInitialTimeline();
        if (initialTimeline == null) {
            this.H = new py00(new qy00(uf10Var.getMediaItem()), z8z0.p, py00.e);
        } else {
            this.H = new py00(initialTimeline, null, null);
            this.L = true;
        }
    }

    @Override // defpackage.uf10
    public final boolean canUpdateMediaItem(fe10 fe10Var) {
        return this.D.canUpdateMediaItem(fe10Var);
    }

    @Override // defpackage.ekd, defpackage.c45
    public final void g() {
        this.K = false;
        this.J = false;
        super.g();
    }

    @Override // defpackage.ekd, defpackage.uf10
    public final void maybeThrowSourceInfoRefreshError() {
    }

    @Override // defpackage.ob51
    public final sf10 n(sf10 sf10Var) {
        Object obj = sf10Var.a;
        Object obj2 = this.H.d;
        if (obj2 != null && obj2.equals(obj)) {
            obj = py00.e;
        }
        return sf10Var.a(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00cc  */
    @Override // defpackage.ob51
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q(a9z0 a9z0Var) {
        long j;
        py00 py00Var;
        oy00 oy00Var;
        Object obj;
        sf10 a;
        py00 py00Var2;
        if (this.K) {
            py00 py00Var3 = this.H;
            this.H = new py00(a9z0Var, py00Var3.c, py00Var3.d);
            oy00 oy00Var2 = this.I;
            if (oy00Var2 != null) {
                u(oy00Var2.z);
            }
        } else if (a9z0Var.q()) {
            if (this.L) {
                py00 py00Var4 = this.H;
                py00Var2 = new py00(a9z0Var, py00Var4.c, py00Var4.d);
            } else {
                py00Var2 = new py00(a9z0Var, z8z0.p, py00.e);
            }
            this.H = py00Var2;
        } else {
            z8z0 z8z0Var = this.F;
            a9z0Var.o(z8z0Var, 0);
            long j2 = z8z0Var.k;
            Object obj2 = z8z0Var.a;
            oy00 oy00Var3 = this.I;
            if (oy00Var3 != null) {
                long j3 = oy00Var3.b;
                py00 py00Var5 = this.H;
                Object obj3 = oy00Var3.a.a;
                y8z0 y8z0Var = this.G;
                py00Var5.h(obj3, y8z0Var);
                long j4 = y8z0Var.e + j3;
                this.H.n(0, z8z0Var, 0L);
                if (j4 != z8z0Var.k) {
                    j = j4;
                    Pair j5 = a9z0Var.j(this.F, this.G, 0, j);
                    Object obj4 = j5.first;
                    long longValue = ((Long) j5.second).longValue();
                    if (this.L) {
                        py00Var = new py00(a9z0Var, obj2, obj4);
                    } else {
                        py00 py00Var6 = this.H;
                        py00Var = new py00(a9z0Var, py00Var6.c, py00Var6.d);
                    }
                    this.H = py00Var;
                    oy00Var = this.I;
                    if (oy00Var != null && u(longValue)) {
                        sf10 sf10Var = oy00Var.a;
                        obj = sf10Var.a;
                        if (this.H.d != null && obj.equals(py00.e)) {
                            obj = this.H.d;
                        }
                        a = sf10Var.a(obj);
                        this.L = true;
                        this.K = true;
                        f(this.H);
                        if (a != null) {
                            oy00 oy00Var4 = this.I;
                            oy00Var4.getClass();
                            oy00Var4.a(a);
                            return;
                        }
                        return;
                    }
                }
            }
            j = j2;
            Pair j52 = a9z0Var.j(this.F, this.G, 0, j);
            Object obj42 = j52.first;
            long longValue2 = ((Long) j52.second).longValue();
            if (this.L) {
            }
            this.H = py00Var;
            oy00Var = this.I;
            if (oy00Var != null) {
                sf10 sf10Var2 = oy00Var.a;
                obj = sf10Var2.a;
                if (this.H.d != null) {
                    obj = this.H.d;
                }
                a = sf10Var2.a(obj);
                this.L = true;
                this.K = true;
                f(this.H);
                if (a != null) {
                }
            }
        }
        a = null;
        this.L = true;
        this.K = true;
        f(this.H);
        if (a != null) {
        }
    }

    @Override // defpackage.uf10
    public final void releasePeriod(xe10 xe10Var) {
        oy00 oy00Var = (oy00) xe10Var;
        if (oy00Var.x != null) {
            uf10 uf10Var = oy00Var.w;
            uf10Var.getClass();
            uf10Var.releasePeriod(oy00Var.x);
        }
        if (xe10Var == this.I) {
            this.I = null;
        }
    }

    @Override // defpackage.ob51
    public final void s() {
        if (this.E) {
            return;
        }
        this.J = true;
        r();
    }

    @Override // defpackage.uf10
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final oy00 createPeriod(sf10 sf10Var, au1 au1Var, long j) {
        oy00 oy00Var = new oy00(sf10Var, au1Var, j);
        d6z.x(oy00Var.w == null);
        oy00Var.w = this.D;
        if (!this.K) {
            this.I = oy00Var;
            if (!this.J) {
                this.J = true;
                r();
            }
            return oy00Var;
        }
        Object obj = sf10Var.a;
        if (this.H.d != null && obj.equals(py00.e)) {
            obj = this.H.d;
        }
        oy00Var.a(sf10Var.a(obj));
        return oy00Var;
    }

    public final boolean u(long j) {
        oy00 oy00Var = this.I;
        int b = this.H.b(oy00Var.a.a);
        if (b == -1) {
            return false;
        }
        py00 py00Var = this.H;
        y8z0 y8z0Var = this.G;
        py00Var.g(b, y8z0Var, false);
        long j2 = y8z0Var.d;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        oy00Var.z = j;
        return true;
    }

    @Override // defpackage.ob51, defpackage.uf10
    public final void updateMediaItem(fe10 fe10Var) {
        if (this.L) {
            py00 py00Var = this.H;
            this.H = new py00(new jzc0(this.H.b, fe10Var), py00Var.c, py00Var.d);
        } else {
            this.H = new py00(new qy00(fe10Var), z8z0.p, py00.e);
        }
        this.D.updateMediaItem(fe10Var);
    }
}
