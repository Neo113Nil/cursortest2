package defpackage;

/* loaded from: classes5.dex */
public final class xet extends bsm {
    public static final xet d;

    static {
        uet.b.getClass();
        d = new xet(yet.a);
    }

    @Override // defpackage.x5
    public final int e(Object obj) {
        return ((vet) obj).a.length;
    }

    @Override // defpackage.zz4, defpackage.x5
    public final void i(tq5 tq5Var, int i, Object obj) {
        wet wetVar = (wet) obj;
        wetVar.getClass();
        short o = tq5Var.x(this.c, i).o();
        tet tetVar = uet.b;
        wetVar.b(wetVar.d() + 1);
        short[] sArr = wetVar.a;
        int i2 = wetVar.b;
        wetVar.b = i2 + 1;
        sArr[i2] = o;
    }

    @Override // defpackage.x5
    public final Object j(Object obj) {
        short[] sArr = ((vet) obj).a;
        wet wetVar = new wet();
        wetVar.a = sArr;
        wetVar.b = sArr.length;
        wetVar.b(10);
        return wetVar;
    }

    @Override // defpackage.bsm
    public final Object m() {
        return new vet(new short[0]);
    }

    @Override // defpackage.bsm
    public final void n(wq5 wq5Var, Object obj, int i) {
        short[] sArr = ((vet) obj).a;
        wq5Var.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            l6b s = wq5Var.s(this.c, i2);
            short s2 = sArr[i2];
            tet tetVar = uet.b;
            s.w(s2);
        }
    }
}
