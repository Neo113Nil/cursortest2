package defpackage;

/* loaded from: classes.dex */
public final class nhs implements woh, voh {
    public final woh a;
    public final long b;
    public voh c;

    public nhs(woh wohVar, long j) {
        this.a = wohVar;
        this.b = j;
    }

    @Override // defpackage.woh
    public final long a(zsb[] zsbVarArr, boolean[] zArr, aoo[] aooVarArr, boolean[] zArr2, long j) {
        aoo[] aooVarArr2 = new aoo[aooVarArr.length];
        int i = 0;
        while (true) {
            aoo aooVar = null;
            if (i >= aooVarArr.length) {
                break;
            }
            mhs mhsVar = (mhs) aooVarArr[i];
            if (mhsVar != null) {
                aooVar = mhsVar.a;
            }
            aooVarArr2[i] = aooVar;
            i++;
        }
        woh wohVar = this.a;
        long j2 = this.b;
        long a = wohVar.a(zsbVarArr, zArr, aooVarArr2, zArr2, j - j2);
        for (int i2 = 0; i2 < aooVarArr.length; i2++) {
            aoo aooVar2 = aooVarArr2[i2];
            if (aooVar2 == null) {
                aooVarArr[i2] = null;
            } else {
                aoo aooVar3 = aooVarArr[i2];
                if (aooVar3 == null || ((mhs) aooVar3).a != aooVar2) {
                    aooVarArr[i2] = new mhs(aooVar2, j2);
                }
            }
        }
        return a + j2;
    }

    @Override // defpackage.zgp
    public final void b(ahp ahpVar) {
        voh vohVar = this.c;
        vohVar.getClass();
        vohVar.b(this);
    }

    @Override // defpackage.woh
    public final long c(long j, hap hapVar) {
        long j2 = this.b;
        return this.a.c(j - j2, hapVar) + j2;
    }

    @Override // defpackage.ahp
    public final long e() {
        long e = this.a.e();
        if (e == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return e + this.b;
    }

    @Override // defpackage.ahp
    public final boolean f() {
        return this.a.f();
    }

    @Override // defpackage.voh
    public final void g(woh wohVar) {
        voh vohVar = this.c;
        vohVar.getClass();
        vohVar.g(this);
    }

    @Override // defpackage.woh
    public final long h(long j) {
        long j2 = this.b;
        return this.a.h(j - j2) + j2;
    }

    @Override // defpackage.woh
    public final long i() {
        long i = this.a.i();
        if (i == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return i + this.b;
    }

    @Override // defpackage.woh
    public final void k() {
        this.a.k();
    }

    @Override // defpackage.woh
    public final void l(voh vohVar, long j) {
        this.c = vohVar;
        this.a.l(this, j - this.b);
    }

    @Override // defpackage.woh
    public final yvs m() {
        return this.a.m();
    }

    @Override // defpackage.ahp
    public final boolean n(dhg dhgVar) {
        chg chgVar = new chg();
        long j = dhgVar.a;
        chgVar.b = dhgVar.b;
        chgVar.c = dhgVar.c;
        chgVar.a = j - this.b;
        return this.a.n(new dhg(chgVar));
    }

    @Override // defpackage.ahp
    public final long r() {
        long r = this.a.r();
        if (r == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return r + this.b;
    }

    @Override // defpackage.woh
    public final void s(long j, boolean z) {
        this.a.s(j - this.b, z);
    }

    @Override // defpackage.ahp
    public final void t(long j) {
        this.a.t(j - this.b);
    }
}
