package defpackage;

/* loaded from: classes5.dex */
public final class kpe extends bsm {
    public static final kpe d;

    static {
        ope.a.getClass();
        d = new kpe(cqe.a);
    }

    @Override // defpackage.x5
    public final int e(Object obj) {
        int[] iArr = (int[]) obj;
        iArr.getClass();
        return iArr.length;
    }

    @Override // defpackage.zz4, defpackage.x5
    public final void i(tq5 tq5Var, int i, Object obj) {
        gpe gpeVar = (gpe) obj;
        gpeVar.getClass();
        int k = tq5Var.k(this.c, i);
        gpeVar.b(gpeVar.d() + 1);
        int[] iArr = gpeVar.a;
        int i2 = gpeVar.b;
        gpeVar.b = i2 + 1;
        iArr[i2] = k;
    }

    @Override // defpackage.x5
    public final Object j(Object obj) {
        int[] iArr = (int[]) obj;
        iArr.getClass();
        gpe gpeVar = new gpe();
        gpeVar.a = iArr;
        gpeVar.b = iArr.length;
        gpeVar.b(10);
        return gpeVar;
    }

    @Override // defpackage.bsm
    public final Object m() {
        return new int[0];
    }

    @Override // defpackage.bsm
    public final void n(wq5 wq5Var, Object obj, int i) {
        int[] iArr = (int[]) obj;
        wq5Var.getClass();
        iArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            wq5Var.A(i2, iArr[i2], this.c);
        }
    }
}
