package defpackage;

/* loaded from: classes9.dex */
public final class tlz extends d2f0 {
    public static final tlz c = new tlz(pnz.a);

    @Override // defpackage.a7
    public final int d(Object obj) {
        return ((long[]) obj).length;
    }

    @Override // defpackage.jcc, defpackage.a7
    public final void f(sjd sjdVar, int i, Object obj) {
        ((olz) obj).e(sjdVar.f(this.b, i));
    }

    @Override // defpackage.a7
    public final Object g(Object obj) {
        return new olz((long[]) obj);
    }

    @Override // defpackage.d2f0
    public final Object j() {
        return new long[0];
    }

    @Override // defpackage.d2f0
    public final void k(yjd yjdVar, Object obj, int i) {
        long[] jArr = (long[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            yjdVar.s(this.b, i2, jArr[i2]);
        }
    }
}
