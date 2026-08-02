package defpackage;

/* loaded from: classes7.dex */
public final class tm81 implements ra71, e771 {
    public final ra71 a;
    public final long b;
    public e771 c;

    public tm81(ra71 ra71Var, long j) {
        this.a = ra71Var;
        this.b = j;
    }

    @Override // defpackage.ra71
    public final long D(long j, lb71 lb71Var) {
        long j2 = this.b;
        return this.a.D(j - j2, lb71Var) + j2;
    }

    @Override // defpackage.ra71
    public final long J(gk71[] gk71VarArr, boolean[] zArr, dg81[] dg81VarArr, boolean[] zArr2, long j) {
        dg81[] dg81VarArr2 = new dg81[dg81VarArr.length];
        int i = 0;
        while (true) {
            dg81 dg81Var = null;
            if (i >= dg81VarArr.length) {
                break;
            }
            cq81 cq81Var = (cq81) dg81VarArr[i];
            if (cq81Var != null) {
                dg81Var = cq81Var.a;
            }
            dg81VarArr2[i] = dg81Var;
            i++;
        }
        ra71 ra71Var = this.a;
        long j2 = this.b;
        long J = ra71Var.J(gk71VarArr, zArr, dg81VarArr2, zArr2, j - j2);
        for (int i2 = 0; i2 < dg81VarArr.length; i2++) {
            dg81 dg81Var2 = dg81VarArr2[i2];
            if (dg81Var2 == null) {
                dg81VarArr[i2] = null;
            } else {
                dg81 dg81Var3 = dg81VarArr[i2];
                if (dg81Var3 == null || ((cq81) dg81Var3).a != dg81Var2) {
                    dg81VarArr[i2] = new cq81(dg81Var2, j2);
                }
            }
        }
        return J + j2;
    }

    @Override // defpackage.yj61
    public final void a(sn61 sn61Var) {
        e771 e771Var = this.c;
        e771Var.getClass();
        e771Var.a((sn61) this);
    }

    @Override // defpackage.ra71
    public final long e(long j) {
        long j2 = this.b;
        return this.a.e(j - j2) + j2;
    }

    @Override // defpackage.ra71
    public final long f() {
        long f = this.a.f();
        if (f == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return f + this.b;
    }

    @Override // defpackage.sn61
    public final long g() {
        long g = this.a.g();
        if (g == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return g + this.b;
    }

    @Override // defpackage.ra71
    public final wx71 getTrackGroups() {
        return this.a.getTrackGroups();
    }

    @Override // defpackage.sn61
    public final void h(long j) {
        this.a.h(j - this.b);
    }

    @Override // defpackage.sn61
    public final long i() {
        long i = this.a.i();
        if (i == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return i + this.b;
    }

    @Override // defpackage.sn61
    public final boolean isLoading() {
        return this.a.isLoading();
    }

    @Override // defpackage.ra71
    public final void j() {
        this.a.j();
    }

    @Override // defpackage.sn61
    public final boolean k(long j) {
        return this.a.k(j - this.b);
    }

    @Override // defpackage.ra71
    public final void x(e771 e771Var, long j) {
        this.c = e771Var;
        this.a.x(this, j - this.b);
    }

    @Override // defpackage.ra71
    public final void a(long j) {
        this.a.a(j - this.b);
    }

    @Override // defpackage.e771
    public final void a(ra71 ra71Var) {
        e771 e771Var = this.c;
        e771Var.getClass();
        e771Var.a((ra71) this);
    }
}
