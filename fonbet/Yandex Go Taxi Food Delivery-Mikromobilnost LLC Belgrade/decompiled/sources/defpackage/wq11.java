package defpackage;

/* loaded from: classes9.dex */
public final class wq11 extends d2f0 {
    public static final wq11 c = new wq11(xq11.a);

    @Override // defpackage.a7
    public final int d(Object obj) {
        return ((uq11) obj).a.length;
    }

    @Override // defpackage.jcc, defpackage.a7
    public final void f(sjd sjdVar, int i, Object obj) {
        ((vq11) obj).e(sjdVar.e(this.b, i).u());
    }

    @Override // defpackage.a7
    public final Object g(Object obj) {
        return new vq11(((uq11) obj).a);
    }

    @Override // defpackage.d2f0
    public final Object j() {
        return new uq11(new int[0]);
    }

    @Override // defpackage.d2f0
    public final void k(yjd yjdVar, Object obj, int i) {
        int[] iArr = ((uq11) obj).a;
        for (int i2 = 0; i2 < i; i2++) {
            yjdVar.x(this.b, i2).q(iArr[i2]);
        }
    }
}
