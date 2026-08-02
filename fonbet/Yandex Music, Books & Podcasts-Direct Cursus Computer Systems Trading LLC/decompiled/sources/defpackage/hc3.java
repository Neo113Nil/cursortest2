package defpackage;

/* loaded from: classes5.dex */
public final class hc3 extends bsm {
    public static final hc3 d;

    static {
        ic3.a.getClass();
        d = new hc3(oc3.a);
    }

    @Override // defpackage.x5
    public final int e(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        zArr.getClass();
        return zArr.length;
    }

    @Override // defpackage.zz4, defpackage.x5
    public final void i(tq5 tq5Var, int i, Object obj) {
        dc3 dc3Var = (dc3) obj;
        dc3Var.getClass();
        boolean D = tq5Var.D(this.c, i);
        dc3Var.b(dc3Var.d() + 1);
        boolean[] zArr = dc3Var.a;
        int i2 = dc3Var.b;
        dc3Var.b = i2 + 1;
        zArr[i2] = D;
    }

    @Override // defpackage.x5
    public final Object j(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        zArr.getClass();
        dc3 dc3Var = new dc3();
        dc3Var.a = zArr;
        dc3Var.b = zArr.length;
        dc3Var.b(10);
        return dc3Var;
    }

    @Override // defpackage.bsm
    public final Object m() {
        return new boolean[0];
    }

    @Override // defpackage.bsm
    public final void n(wq5 wq5Var, Object obj, int i) {
        boolean[] zArr = (boolean[]) obj;
        wq5Var.getClass();
        zArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            wq5Var.j(this.c, i2, zArr[i2]);
        }
    }
}
