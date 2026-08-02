package defpackage;

/* loaded from: classes9.dex */
public final class sr11 extends d2f0 {
    public static final sr11 c = new sr11(tr11.a);

    @Override // defpackage.a7
    public final int d(Object obj) {
        return ((qr11) obj).a.length;
    }

    @Override // defpackage.jcc, defpackage.a7
    public final void f(sjd sjdVar, int i, Object obj) {
        ((rr11) obj).e(sjdVar.e(this.b, i).l());
    }

    @Override // defpackage.a7
    public final Object g(Object obj) {
        return new rr11(((qr11) obj).a);
    }

    @Override // defpackage.d2f0
    public final Object j() {
        return new qr11(new short[0]);
    }

    @Override // defpackage.d2f0
    public final void k(yjd yjdVar, Object obj, int i) {
        short[] sArr = ((qr11) obj).a;
        for (int i2 = 0; i2 < i; i2++) {
            yjdVar.x(this.b, i2).k(sArr[i2]);
        }
    }
}
