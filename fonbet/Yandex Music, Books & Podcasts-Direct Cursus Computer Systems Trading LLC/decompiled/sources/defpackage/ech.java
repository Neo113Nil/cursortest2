package defpackage;

/* loaded from: classes.dex */
public final class ech implements woh, voh {
    public final uvh a;
    public final long b;
    public final zi7 c;
    public wvh d;
    public woh e;
    public voh f;
    public long g = -9223372036854775807L;

    public ech(uvh uvhVar, zi7 zi7Var, long j) {
        this.a = uvhVar;
        this.c = zi7Var;
        this.b = j;
    }

    @Override // defpackage.woh
    public final long a(zsb[] zsbVarArr, boolean[] zArr, aoo[] aooVarArr, boolean[] zArr2, long j) {
        long j2 = this.g;
        long j3 = (j2 == -9223372036854775807L || j != this.b) ? j : j2;
        this.g = -9223372036854775807L;
        woh wohVar = this.e;
        int i = dvt.a;
        return wohVar.a(zsbVarArr, zArr, aooVarArr, zArr2, j3);
    }

    @Override // defpackage.zgp
    public final void b(ahp ahpVar) {
        voh vohVar = this.f;
        int i = dvt.a;
        vohVar.b(this);
    }

    @Override // defpackage.woh
    public final long c(long j, hap hapVar) {
        woh wohVar = this.e;
        int i = dvt.a;
        return wohVar.c(j, hapVar);
    }

    public final void d(uvh uvhVar) {
        long j = this.g;
        if (j == -9223372036854775807L) {
            j = this.b;
        }
        wvh wvhVar = this.d;
        wvhVar.getClass();
        woh n = wvhVar.n(uvhVar, this.c, j);
        this.e = n;
        if (this.f != null) {
            n.l(this, j);
        }
    }

    @Override // defpackage.ahp
    public final long e() {
        woh wohVar = this.e;
        int i = dvt.a;
        return wohVar.e();
    }

    @Override // defpackage.ahp
    public final boolean f() {
        woh wohVar = this.e;
        return wohVar != null && wohVar.f();
    }

    @Override // defpackage.voh
    public final void g(woh wohVar) {
        voh vohVar = this.f;
        int i = dvt.a;
        vohVar.g(this);
    }

    @Override // defpackage.woh
    public final long h(long j) {
        woh wohVar = this.e;
        int i = dvt.a;
        return wohVar.h(j);
    }

    @Override // defpackage.woh
    public final long i() {
        woh wohVar = this.e;
        int i = dvt.a;
        return wohVar.i();
    }

    @Override // defpackage.woh
    public final void k() {
        woh wohVar = this.e;
        if (wohVar != null) {
            wohVar.k();
            return;
        }
        wvh wvhVar = this.d;
        if (wvhVar != null) {
            wvhVar.p();
        }
    }

    @Override // defpackage.woh
    public final void l(voh vohVar, long j) {
        this.f = vohVar;
        woh wohVar = this.e;
        if (wohVar != null) {
            long j2 = this.g;
            if (j2 == -9223372036854775807L) {
                j2 = this.b;
            }
            wohVar.l(this, j2);
        }
    }

    @Override // defpackage.woh
    public final yvs m() {
        woh wohVar = this.e;
        int i = dvt.a;
        return wohVar.m();
    }

    @Override // defpackage.ahp
    public final boolean n(dhg dhgVar) {
        woh wohVar = this.e;
        return wohVar != null && wohVar.n(dhgVar);
    }

    @Override // defpackage.ahp
    public final long r() {
        woh wohVar = this.e;
        int i = dvt.a;
        return wohVar.r();
    }

    @Override // defpackage.woh
    public final void s(long j, boolean z) {
        woh wohVar = this.e;
        int i = dvt.a;
        wohVar.s(j, z);
    }

    @Override // defpackage.ahp
    public final void t(long j) {
        woh wohVar = this.e;
        int i = dvt.a;
        wohVar.t(j);
    }
}
