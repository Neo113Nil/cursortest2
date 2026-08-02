package defpackage;

/* loaded from: classes5.dex */
public final class sug extends bsm {
    public static final sug d;

    static {
        tug.a.getClass();
        d = new sug(mvg.a);
    }

    @Override // defpackage.x5
    public final int e(Object obj) {
        long[] jArr = (long[]) obj;
        jArr.getClass();
        return jArr.length;
    }

    @Override // defpackage.zz4, defpackage.x5
    public final void i(tq5 tq5Var, int i, Object obj) {
        oug ougVar = (oug) obj;
        ougVar.getClass();
        long q = tq5Var.q(this.c, i);
        ougVar.b(ougVar.d() + 1);
        long[] jArr = ougVar.a;
        int i2 = ougVar.b;
        ougVar.b = i2 + 1;
        jArr[i2] = q;
    }

    @Override // defpackage.x5
    public final Object j(Object obj) {
        long[] jArr = (long[]) obj;
        jArr.getClass();
        oug ougVar = new oug();
        ougVar.a = jArr;
        ougVar.b = jArr.length;
        ougVar.b(10);
        return ougVar;
    }

    @Override // defpackage.bsm
    public final Object m() {
        return new long[0];
    }

    @Override // defpackage.bsm
    public final void n(wq5 wq5Var, Object obj, int i) {
        long[] jArr = (long[]) obj;
        wq5Var.getClass();
        jArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            wq5Var.g(this.c, i2, jArr[i2]);
        }
    }
}
