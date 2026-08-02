package defpackage;

/* loaded from: classes.dex */
public final class r5i extends xci implements yr5, epf {
    @Override // defpackage.epf
    public final lfh c(mfh mfhVar, ffh ffhVar, long j) {
        float f = ((cma) men.t(this, xre.a)).a;
        float f2 = 0;
        if (f < f2) {
            f = f2;
        }
        ksk M = ffhVar.M(j);
        boolean z = this.n && !Float.isNaN(f) && Float.compare(f, f2) > 0;
        int L = Float.isNaN(f) ? 0 : mfhVar.L(f);
        int i = M.a;
        if (z) {
            i = Math.max(i, L);
        }
        int i2 = M.b;
        if (z) {
            i2 = Math.max(i2, L);
        }
        return mfh.m0(mfhVar, i, i2, new coe(i, M, i2, 1));
    }
}
