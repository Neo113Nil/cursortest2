package defpackage;

/* loaded from: classes5.dex */
public final class td4 extends bsm {
    public static final td4 d;

    static {
        ud4.a.getClass();
        d = new td4(ie4.a);
    }

    @Override // defpackage.x5
    public final int e(Object obj) {
        char[] cArr = (char[]) obj;
        cArr.getClass();
        return cArr.length;
    }

    @Override // defpackage.zz4, defpackage.x5
    public final void i(tq5 tq5Var, int i, Object obj) {
        qd4 qd4Var = (qd4) obj;
        qd4Var.getClass();
        char G = tq5Var.G(this.c, i);
        qd4Var.b(qd4Var.d() + 1);
        char[] cArr = qd4Var.a;
        int i2 = qd4Var.b;
        qd4Var.b = i2 + 1;
        cArr[i2] = G;
    }

    @Override // defpackage.x5
    public final Object j(Object obj) {
        char[] cArr = (char[]) obj;
        cArr.getClass();
        qd4 qd4Var = new qd4();
        qd4Var.a = cArr;
        qd4Var.b = cArr.length;
        qd4Var.b(10);
        return qd4Var;
    }

    @Override // defpackage.bsm
    public final Object m() {
        return new char[0];
    }

    @Override // defpackage.bsm
    public final void n(wq5 wq5Var, Object obj, int i) {
        char[] cArr = (char[]) obj;
        wq5Var.getClass();
        cArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            wq5Var.B(this.c, i2, cArr[i2]);
        }
    }
}
