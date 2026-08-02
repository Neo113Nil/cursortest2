package defpackage;

import android.util.Pair;

/* loaded from: classes7.dex */
public final class sy71 extends i571 {
    public final qv81 S;
    public final boolean T;
    public final uk81 U;
    public final ie81 V;
    public rs71 W;
    public sp71 X;
    public boolean Y;
    public boolean Z;
    public boolean a0;

    public sy71(qv81 qv81Var, boolean z) {
        boolean z2;
        this.S = qv81Var;
        if (z) {
            qv81Var.getClass();
            z2 = true;
        } else {
            z2 = false;
        }
        this.T = z2;
        this.U = new uk81();
        this.V = new ie81();
        qv81Var.getClass();
        this.W = new rs71(new wv71(qv81Var.c()), uk81.J, rs71.y);
    }

    @Override // defpackage.qv81
    public final void a(ra71 ra71Var) {
        sp71 sp71Var = (sp71) ra71Var;
        if (sp71Var.x != null) {
            qv81 qv81Var = sp71Var.w;
            qv81Var.getClass();
            qv81Var.a(sp71Var.x);
        }
        if (ra71Var == this.X) {
            this.X = null;
        }
    }

    @Override // defpackage.qv81
    public final op81 c() {
        return this.S.c();
    }

    @Override // defpackage.i571, defpackage.qv81
    public final void d() {
    }

    @Override // defpackage.i571, defpackage.qv81
    public final void e() {
        this.Z = false;
        this.Y = false;
        super.e();
    }

    @Override // defpackage.i571
    public final v281 f(Object obj, v281 v281Var) {
        Object obj2 = v281Var.a;
        Object obj3 = this.W.x;
        if (obj3 != null && obj3.equals(obj2)) {
            obj2 = rs71.y;
        }
        return v281Var.b(obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00d1  */
    @Override // defpackage.i571
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(Object obj, qv81 qv81Var, yn81 yn81Var) {
        long j;
        rs71 rs71Var;
        sp71 sp71Var;
        v281 b;
        rs71 rs71Var2;
        if (this.Z) {
            rs71 rs71Var3 = this.W;
            this.W = new rs71(yn81Var, rs71Var3.w, rs71Var3.x);
            sp71 sp71Var2 = this.X;
            if (sp71Var2 != null) {
                i(sp71Var2.z);
            }
        } else if (yn81Var.c()) {
            if (this.a0) {
                rs71 rs71Var4 = this.W;
                rs71Var2 = new rs71(yn81Var, rs71Var4.w, rs71Var4.x);
            } else {
                rs71Var2 = new rs71(yn81Var, uk81.J, rs71.y);
            }
            this.W = rs71Var2;
        } else {
            uk81 uk81Var = this.U;
            yn81Var.a(0, uk81Var, 0L);
            long j2 = uk81Var.E;
            Object obj2 = uk81Var.a;
            sp71 sp71Var3 = this.X;
            if (sp71Var3 != null) {
                long j3 = sp71Var3.b;
                rs71 rs71Var5 = this.W;
                int a = rs71Var5.a(sp71Var3.a.a);
                ie81 ie81Var = this.V;
                rs71Var5.a(a, ie81Var, true);
                long j4 = ie81Var.x + j3;
                this.W.a(0, uk81Var, 0L);
                if (j4 != uk81Var.E) {
                    j = j4;
                    Pair a2 = yn81Var.a(this.U, this.V, 0, j);
                    Object obj3 = a2.first;
                    long longValue = ((Long) a2.second).longValue();
                    if (this.a0) {
                        rs71Var = new rs71(yn81Var, obj2, obj3);
                    } else {
                        rs71 rs71Var6 = this.W;
                        rs71Var = new rs71(yn81Var, rs71Var6.w, rs71Var6.x);
                    }
                    this.W = rs71Var;
                    sp71Var = this.X;
                    if (sp71Var != null) {
                        i(longValue);
                        v281 v281Var = sp71Var.a;
                        Object obj4 = v281Var.a;
                        if (this.W.x != null && obj4.equals(rs71.y)) {
                            obj4 = this.W.x;
                        }
                        b = v281Var.b(obj4);
                        this.a0 = true;
                        this.Z = true;
                        a(this.W);
                        if (b == null) {
                            sp71 sp71Var4 = this.X;
                            sp71Var4.getClass();
                            sp71Var4.b(b);
                            return;
                        }
                        return;
                    }
                }
            }
            j = j2;
            Pair a22 = yn81Var.a(this.U, this.V, 0, j);
            Object obj32 = a22.first;
            long longValue2 = ((Long) a22.second).longValue();
            if (this.a0) {
            }
            this.W = rs71Var;
            sp71Var = this.X;
            if (sp71Var != null) {
            }
        }
        b = null;
        this.a0 = true;
        this.Z = true;
        a(this.W);
        if (b == null) {
        }
    }

    public final void i(long j) {
        sp71 sp71Var = this.X;
        int a = this.W.a(sp71Var.a.a);
        if (a == -1) {
            return;
        }
        rs71 rs71Var = this.W;
        ie81 ie81Var = this.V;
        rs71Var.a(a, ie81Var, false);
        long j2 = ie81Var.w;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        sp71Var.z = j;
    }

    @Override // defpackage.qv81
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final sp71 a(v281 v281Var, xi71 xi71Var, long j) {
        sp71 sp71Var = new sp71(v281Var, xi71Var, j);
        if (sp71Var.w != null) {
            ny61.k();
            return null;
        }
        qv81 qv81Var = this.S;
        sp71Var.w = qv81Var;
        if (!this.Z) {
            this.X = sp71Var;
            if (!this.Y) {
                this.Y = true;
                g(null, qv81Var);
            }
            return sp71Var;
        }
        Object obj = v281Var.a;
        if (this.W.x != null && obj.equals(rs71.y)) {
            obj = this.W.x;
        }
        sp71Var.b(v281Var.b(obj));
        return sp71Var;
    }

    @Override // defpackage.qv81
    public final void a(mr81 mr81Var) {
        this.R = mr81Var;
        this.Q = rf71.i(null);
        if (this.T) {
            return;
        }
        this.Y = true;
        g(null, this.S);
    }
}
