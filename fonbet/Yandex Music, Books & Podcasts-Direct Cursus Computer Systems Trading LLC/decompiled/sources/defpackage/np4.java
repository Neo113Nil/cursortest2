package defpackage;

/* loaded from: classes.dex */
public final class np4 implements woh, voh {
    public final woh a;
    public voh b;
    public mp4[] c = new mp4[0];
    public long d;
    public long e;
    public long f;
    public qp4 g;

    public np4(woh wohVar, boolean z, long j, long j2) {
        this.a = wohVar;
        this.d = z ? j : -9223372036854775807L;
        this.e = j;
        this.f = j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0079  */
    @Override // defpackage.woh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(zsb[] zsbVarArr, boolean[] zArr, aoo[] aooVarArr, boolean[] zArr2, long j) {
        long j2;
        int i;
        this.c = new mp4[aooVarArr.length];
        aoo[] aooVarArr2 = new aoo[aooVarArr.length];
        for (int i2 = 0; i2 < aooVarArr.length; i2++) {
            mp4[] mp4VarArr = this.c;
            mp4 mp4Var = (mp4) aooVarArr[i2];
            mp4VarArr[i2] = mp4Var;
            aooVarArr2[i2] = mp4Var != null ? mp4Var.a : null;
        }
        long a = this.a.a(zsbVarArr, zArr, aooVarArr2, zArr2, j);
        long j3 = this.f;
        long max = Math.max(a, j);
        if (j3 != Long.MIN_VALUE) {
            max = Math.min(max, j3);
        }
        if (d()) {
            if (a >= j) {
                if (a != 0) {
                    for (zsb zsbVar : zsbVarArr) {
                        if (zsbVar != null) {
                            dsc s = zsbVar.s();
                            if (!l5i.a(s.n, s.k)) {
                            }
                        }
                    }
                }
            }
            j2 = max;
            this.d = j2;
            for (i = 0; i < aooVarArr.length; i++) {
                aoo aooVar = aooVarArr2[i];
                mp4[] mp4VarArr2 = this.c;
                if (aooVar == null) {
                    mp4VarArr2[i] = null;
                } else {
                    mp4 mp4Var2 = mp4VarArr2[i];
                    if (mp4Var2 == null || mp4Var2.a != aooVar) {
                        mp4VarArr2[i] = new mp4(this, aooVar);
                    }
                }
                aooVarArr[i] = mp4VarArr2[i];
            }
            return max;
        }
        j2 = -9223372036854775807L;
        this.d = j2;
        while (i < aooVarArr.length) {
        }
        return max;
    }

    @Override // defpackage.zgp
    public final void b(ahp ahpVar) {
        voh vohVar = this.b;
        vohVar.getClass();
        vohVar.b(this);
    }

    @Override // defpackage.woh
    public final long c(long j, hap hapVar) {
        long j2 = this.e;
        if (j == j2) {
            return j2;
        }
        long j3 = dvt.j(hapVar.a, 0L, j - j2);
        long j4 = hapVar.b;
        long j5 = this.f;
        long j6 = dvt.j(j4, 0L, j5 == Long.MIN_VALUE ? Long.MAX_VALUE : j5 - j);
        if (j3 != hapVar.a || j6 != hapVar.b) {
            hapVar = new hap(j3, j6);
        }
        return this.a.c(j, hapVar);
    }

    public final boolean d() {
        return this.d != -9223372036854775807L;
    }

    @Override // defpackage.ahp
    public final long e() {
        long e = this.a.e();
        if (e != Long.MIN_VALUE) {
            long j = this.f;
            if (j == Long.MIN_VALUE || e < j) {
                return e;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.ahp
    public final boolean f() {
        return this.a.f();
    }

    @Override // defpackage.voh
    public final void g(woh wohVar) {
        if (this.g != null) {
            return;
        }
        voh vohVar = this.b;
        vohVar.getClass();
        vohVar.g(this);
    }

    @Override // defpackage.woh
    public final long h(long j) {
        this.d = -9223372036854775807L;
        for (mp4 mp4Var : this.c) {
            if (mp4Var != null) {
                mp4Var.b = false;
            }
        }
        long h = this.a.h(j);
        long j2 = this.e;
        long j3 = this.f;
        long max = Math.max(h, j2);
        return j3 != Long.MIN_VALUE ? Math.min(max, j3) : max;
    }

    @Override // defpackage.woh
    public final long i() {
        if (d()) {
            long j = this.d;
            this.d = -9223372036854775807L;
            long i = i();
            return i != -9223372036854775807L ? i : j;
        }
        long i2 = this.a.i();
        if (i2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j2 = this.e;
        long j3 = this.f;
        long max = Math.max(i2, j2);
        return j3 != Long.MIN_VALUE ? Math.min(max, j3) : max;
    }

    @Override // defpackage.woh
    public final void k() {
        qp4 qp4Var = this.g;
        if (qp4Var != null) {
            throw qp4Var;
        }
        this.a.k();
    }

    @Override // defpackage.woh
    public final void l(voh vohVar, long j) {
        this.b = vohVar;
        this.a.l(this, j);
    }

    @Override // defpackage.woh
    public final yvs m() {
        return this.a.m();
    }

    @Override // defpackage.ahp
    public final boolean n(dhg dhgVar) {
        return this.a.n(dhgVar);
    }

    @Override // defpackage.ahp
    public final long r() {
        long r = this.a.r();
        if (r != Long.MIN_VALUE) {
            long j = this.f;
            if (j == Long.MIN_VALUE || r < j) {
                return r;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.woh
    public final void s(long j, boolean z) {
        this.a.s(j, z);
    }

    @Override // defpackage.ahp
    public final void t(long j) {
        this.a.t(j);
    }
}
