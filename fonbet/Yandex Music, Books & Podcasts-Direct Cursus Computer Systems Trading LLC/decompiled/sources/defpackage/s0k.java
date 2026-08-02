package defpackage;

/* loaded from: classes.dex */
public final class s0k extends xci implements epf {
    public o0k o;

    @Override // defpackage.epf
    public final lfh c(mfh mfhVar, ffh ffhVar, long j) {
        float b = this.o.b(mfhVar.getLayoutDirection());
        float d = this.o.d();
        float c = this.o.c(mfhVar.getLayoutDirection());
        float a = this.o.a();
        float f = 0;
        if (!((Float.compare(a, f) >= 0) & (Float.compare(b, f) >= 0) & (Float.compare(d, f) >= 0) & (Float.compare(c, f) >= 0))) {
            qme.a("Padding must be non-negative");
        }
        int L = mfhVar.L(b);
        int L2 = mfhVar.L(c) + L;
        int L3 = mfhVar.L(d);
        int L4 = mfhVar.L(a) + L3;
        ksk M = ffhVar.M(ia6.i(j, -L2, -L4));
        return mfh.m0(mfhVar, ia6.g(M.a + L2, j), ia6.f(M.b + L4, j), new coe(M, L, L3, 3));
    }
}
