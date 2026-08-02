package defpackage;

/* loaded from: classes.dex */
public final class s5i extends xci implements yr5, epf {
    @Override // defpackage.epf
    public final lfh c(mfh mfhVar, ffh ffhVar, long j) {
        boolean z = this.n && ((Boolean) men.t(this, yre.a)).booleanValue();
        long j2 = yre.b;
        ksk M = ffhVar.M(j);
        int i = M.a;
        if (z) {
            i = Math.max(i, mfhVar.L(fma.c(j2)));
        }
        int i2 = M.b;
        if (z) {
            i2 = Math.max(i2, mfhVar.L(fma.b(j2)));
        }
        return mfh.m0(mfhVar, i, i2, new coe(i, M, i2, 2));
    }
}
