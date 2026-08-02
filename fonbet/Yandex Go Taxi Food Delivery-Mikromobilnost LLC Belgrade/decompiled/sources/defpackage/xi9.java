package defpackage;

/* loaded from: classes9.dex */
public final class xi9 extends d2f0 {
    public static final xi9 c = new xi9(ij9.a);

    @Override // defpackage.a7
    public final int d(Object obj) {
        return ((char[]) obj).length;
    }

    @Override // defpackage.jcc, defpackage.a7
    public final void f(sjd sjdVar, int i, Object obj) {
        ((ti9) obj).e(sjdVar.r(this.b, i));
    }

    @Override // defpackage.a7
    public final Object g(Object obj) {
        return new ti9((char[]) obj);
    }

    @Override // defpackage.d2f0
    public final Object j() {
        return new char[0];
    }

    @Override // defpackage.d2f0
    public final void k(yjd yjdVar, Object obj, int i) {
        char[] cArr = (char[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            yjdVar.D(this.b, i2, cArr[i2]);
        }
    }
}
