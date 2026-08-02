package defpackage;

/* loaded from: classes5.dex */
public final class im3 extends bsm {
    public static final im3 d;

    static {
        um3.a.getClass();
        d = new im3(wm3.a);
    }

    @Override // defpackage.x5
    public final int e(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        return bArr.length;
    }

    @Override // defpackage.zz4, defpackage.x5
    public final void i(tq5 tq5Var, int i, Object obj) {
        bm3 bm3Var = (bm3) obj;
        bm3Var.getClass();
        byte y = tq5Var.y(this.c, i);
        bm3Var.b(bm3Var.d() + 1);
        byte[] bArr = bm3Var.a;
        int i2 = bm3Var.b;
        bm3Var.b = i2 + 1;
        bArr[i2] = y;
    }

    @Override // defpackage.x5
    public final Object j(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        bm3 bm3Var = new bm3();
        bm3Var.a = bArr;
        bm3Var.b = bArr.length;
        bm3Var.b(10);
        return bm3Var;
    }

    @Override // defpackage.bsm
    public final Object m() {
        return new byte[0];
    }

    @Override // defpackage.bsm
    public final void n(wq5 wq5Var, Object obj, int i) {
        byte[] bArr = (byte[]) obj;
        wq5Var.getClass();
        bArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            wq5Var.m(this.c, i2, bArr[i2]);
        }
    }
}
