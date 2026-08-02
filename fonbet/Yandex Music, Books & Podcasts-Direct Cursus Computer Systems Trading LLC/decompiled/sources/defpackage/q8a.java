package defpackage;

/* loaded from: classes5.dex */
public final class q8a extends bsm {
    public static final q8a d;

    static {
        y8a.a.getClass();
        d = new q8a(n9a.a);
    }

    @Override // defpackage.x5
    public final int e(Object obj) {
        double[] dArr = (double[]) obj;
        dArr.getClass();
        return dArr.length;
    }

    @Override // defpackage.zz4, defpackage.x5
    public final void i(tq5 tq5Var, int i, Object obj) {
        m8a m8aVar = (m8a) obj;
        m8aVar.getClass();
        double F = tq5Var.F(this.c, i);
        m8aVar.b(m8aVar.d() + 1);
        double[] dArr = m8aVar.a;
        int i2 = m8aVar.b;
        m8aVar.b = i2 + 1;
        dArr[i2] = F;
    }

    @Override // defpackage.x5
    public final Object j(Object obj) {
        double[] dArr = (double[]) obj;
        dArr.getClass();
        m8a m8aVar = new m8a();
        m8aVar.a = dArr;
        m8aVar.b = dArr.length;
        m8aVar.b(10);
        return m8aVar;
    }

    @Override // defpackage.bsm
    public final Object m() {
        return new double[0];
    }

    @Override // defpackage.bsm
    public final void n(wq5 wq5Var, Object obj, int i) {
        double[] dArr = (double[]) obj;
        wq5Var.getClass();
        dArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            wq5Var.l(this.c, i2, dArr[i2]);
        }
    }
}
