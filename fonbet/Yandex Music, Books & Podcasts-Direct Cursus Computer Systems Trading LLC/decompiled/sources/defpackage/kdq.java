package defpackage;

/* loaded from: classes5.dex */
public final class kdq extends bsm {
    public static final kdq d;

    static {
        ldq.a.getClass();
        d = new kdq(mdq.a);
    }

    @Override // defpackage.x5
    public final int e(Object obj) {
        short[] sArr = (short[]) obj;
        sArr.getClass();
        return sArr.length;
    }

    @Override // defpackage.zz4, defpackage.x5
    public final void i(tq5 tq5Var, int i, Object obj) {
        jdq jdqVar = (jdq) obj;
        jdqVar.getClass();
        short H = tq5Var.H(this.c, i);
        jdqVar.b(jdqVar.d() + 1);
        short[] sArr = jdqVar.a;
        int i2 = jdqVar.b;
        jdqVar.b = i2 + 1;
        sArr[i2] = H;
    }

    @Override // defpackage.x5
    public final Object j(Object obj) {
        short[] sArr = (short[]) obj;
        sArr.getClass();
        jdq jdqVar = new jdq();
        jdqVar.a = sArr;
        jdqVar.b = sArr.length;
        jdqVar.b(10);
        return jdqVar;
    }

    @Override // defpackage.bsm
    public final Object m() {
        return new short[0];
    }

    @Override // defpackage.bsm
    public final void n(wq5 wq5Var, Object obj, int i) {
        short[] sArr = (short[]) obj;
        wq5Var.getClass();
        sArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            wq5Var.o(this.c, i2, sArr[i2]);
        }
    }
}
