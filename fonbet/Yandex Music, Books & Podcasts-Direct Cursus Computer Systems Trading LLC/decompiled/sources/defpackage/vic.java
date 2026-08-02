package defpackage;

/* loaded from: classes5.dex */
public final class vic extends bsm {
    public static final vic d;

    static {
        wic.a.getClass();
        d = new vic(zic.a);
    }

    @Override // defpackage.x5
    public final int e(Object obj) {
        float[] fArr = (float[]) obj;
        fArr.getClass();
        return fArr.length;
    }

    @Override // defpackage.zz4, defpackage.x5
    public final void i(tq5 tq5Var, int i, Object obj) {
        ric ricVar = (ric) obj;
        ricVar.getClass();
        float v = tq5Var.v(this.c, i);
        ricVar.b(ricVar.d() + 1);
        float[] fArr = ricVar.a;
        int i2 = ricVar.b;
        ricVar.b = i2 + 1;
        fArr[i2] = v;
    }

    @Override // defpackage.x5
    public final Object j(Object obj) {
        float[] fArr = (float[]) obj;
        fArr.getClass();
        ric ricVar = new ric();
        ricVar.a = fArr;
        ricVar.b = fArr.length;
        ricVar.b(10);
        return ricVar;
    }

    @Override // defpackage.bsm
    public final Object m() {
        return new float[0];
    }

    @Override // defpackage.bsm
    public final void n(wq5 wq5Var, Object obj, int i) {
        float[] fArr = (float[]) obj;
        wq5Var.getClass();
        fArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            wq5Var.F(this.c, i2, fArr[i2]);
        }
    }
}
