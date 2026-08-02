package defpackage;

/* loaded from: classes7.dex */
public final class sp71 implements ra71, e771 {
    public final v281 a;
    public final long b;
    public final xi71 c;
    public qv81 w;
    public ra71 x;
    public e771 y;
    public long z = -9223372036854775807L;

    public sp71(v281 v281Var, xi71 xi71Var, long j) {
        this.a = v281Var;
        this.c = xi71Var;
        this.b = j;
    }

    @Override // defpackage.ra71
    public final long D(long j, lb71 lb71Var) {
        ra71 ra71Var = this.x;
        int i = rf71.a;
        return ra71Var.D(j, lb71Var);
    }

    @Override // defpackage.ra71
    public final long J(gk71[] gk71VarArr, boolean[] zArr, dg81[] dg81VarArr, boolean[] zArr2, long j) {
        long j2 = this.z;
        if (j2 != -9223372036854775807L && j == this.b) {
            this.z = -9223372036854775807L;
            j = j2;
        }
        ra71 ra71Var = this.x;
        int i = rf71.a;
        return ra71Var.J(gk71VarArr, zArr, dg81VarArr, zArr2, j);
    }

    @Override // defpackage.yj61
    public final void a(sn61 sn61Var) {
        e771 e771Var = this.y;
        int i = rf71.a;
        e771Var.a((sn61) this);
    }

    public final void b(v281 v281Var) {
        long j = this.z;
        if (j == -9223372036854775807L) {
            j = this.b;
        }
        qv81 qv81Var = this.w;
        qv81Var.getClass();
        ra71 a = qv81Var.a(v281Var, this.c, j);
        this.x = a;
        if (this.y != null) {
            a.x(this, j);
        }
    }

    @Override // defpackage.ra71
    public final long e(long j) {
        ra71 ra71Var = this.x;
        int i = rf71.a;
        return ra71Var.e(j);
    }

    @Override // defpackage.ra71
    public final long f() {
        ra71 ra71Var = this.x;
        int i = rf71.a;
        return ra71Var.f();
    }

    @Override // defpackage.sn61
    public final long g() {
        ra71 ra71Var = this.x;
        int i = rf71.a;
        return ra71Var.g();
    }

    @Override // defpackage.ra71
    public final wx71 getTrackGroups() {
        ra71 ra71Var = this.x;
        int i = rf71.a;
        return ra71Var.getTrackGroups();
    }

    @Override // defpackage.sn61
    public final void h(long j) {
        ra71 ra71Var = this.x;
        int i = rf71.a;
        ra71Var.h(j);
    }

    @Override // defpackage.sn61
    public final long i() {
        ra71 ra71Var = this.x;
        int i = rf71.a;
        return ra71Var.i();
    }

    @Override // defpackage.sn61
    public final boolean isLoading() {
        ra71 ra71Var = this.x;
        return ra71Var != null && ra71Var.isLoading();
    }

    @Override // defpackage.ra71
    public final void j() {
        ra71 ra71Var = this.x;
        if (ra71Var != null) {
            ra71Var.j();
            return;
        }
        qv81 qv81Var = this.w;
        if (qv81Var != null) {
            qv81Var.d();
        }
    }

    @Override // defpackage.sn61
    public final boolean k(long j) {
        ra71 ra71Var = this.x;
        return ra71Var != null && ra71Var.k(j);
    }

    @Override // defpackage.ra71
    public final void x(e771 e771Var, long j) {
        this.y = e771Var;
        ra71 ra71Var = this.x;
        if (ra71Var != null) {
            long j2 = this.z;
            if (j2 == -9223372036854775807L) {
                j2 = this.b;
            }
            ra71Var.x(this, j2);
        }
    }

    @Override // defpackage.ra71
    public final void a(long j) {
        ra71 ra71Var = this.x;
        int i = rf71.a;
        ra71Var.a(j);
    }

    @Override // defpackage.e771
    public final void a(ra71 ra71Var) {
        e771 e771Var = this.y;
        int i = rf71.a;
        e771Var.a((ra71) this);
    }
}
