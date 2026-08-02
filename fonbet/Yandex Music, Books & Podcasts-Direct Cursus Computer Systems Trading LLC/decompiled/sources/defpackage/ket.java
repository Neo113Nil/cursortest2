package defpackage;

/* loaded from: classes5.dex */
public final class ket extends bsm {
    public static final ket d;

    static {
        het.b.getClass();
        d = new ket(let.a);
    }

    @Override // defpackage.x5
    public final int e(Object obj) {
        return ((iet) obj).a.length;
    }

    @Override // defpackage.zz4, defpackage.x5
    public final void i(tq5 tq5Var, int i, Object obj) {
        jet jetVar = (jet) obj;
        jetVar.getClass();
        int h = tq5Var.x(this.c, i).h();
        get getVar = het.b;
        jetVar.b(jetVar.d() + 1);
        int[] iArr = jetVar.a;
        int i2 = jetVar.b;
        jetVar.b = i2 + 1;
        iArr[i2] = h;
    }

    @Override // defpackage.x5
    public final Object j(Object obj) {
        int[] iArr = ((iet) obj).a;
        jet jetVar = new jet();
        jetVar.a = iArr;
        jetVar.b = iArr.length;
        jetVar.b(10);
        return jetVar;
    }

    @Override // defpackage.bsm
    public final Object m() {
        return new iet(new int[0]);
    }

    @Override // defpackage.bsm
    public final void n(wq5 wq5Var, Object obj, int i) {
        int[] iArr = ((iet) obj).a;
        wq5Var.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            l6b s = wq5Var.s(this.c, i2);
            int i3 = iArr[i2];
            get getVar = het.b;
            s.C(i3);
        }
    }
}
