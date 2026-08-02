package defpackage;

/* loaded from: classes9.dex */
public final class tvr0 extends d2f0 {
    public static final tvr0 c = new tvr0(wvr0.a);

    @Override // defpackage.a7
    public final int d(Object obj) {
        return ((short[]) obj).length;
    }

    @Override // defpackage.jcc, defpackage.a7
    public final void f(sjd sjdVar, int i, Object obj) {
        ((svr0) obj).e(sjdVar.o(this.b, i));
    }

    @Override // defpackage.a7
    public final Object g(Object obj) {
        return new svr0((short[]) obj);
    }

    @Override // defpackage.d2f0
    public final Object j() {
        return new short[0];
    }

    @Override // defpackage.d2f0
    public final void k(yjd yjdVar, Object obj, int i) {
        short[] sArr = (short[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            yjdVar.v(this.b, i2, sArr[i2]);
        }
    }
}
