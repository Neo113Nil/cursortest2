package defpackage;

/* loaded from: classes5.dex */
public final class qet extends bsm {
    public static final qet d;

    static {
        net.b.getClass();
        d = new qet(ret.a);
    }

    @Override // defpackage.x5
    public final int e(Object obj) {
        return ((oet) obj).a.length;
    }

    @Override // defpackage.zz4, defpackage.x5
    public final void i(tq5 tq5Var, int i, Object obj) {
        pet petVar = (pet) obj;
        petVar.getClass();
        long l = tq5Var.x(this.c, i).l();
        met metVar = net.b;
        petVar.b(petVar.d() + 1);
        long[] jArr = petVar.a;
        int i2 = petVar.b;
        petVar.b = i2 + 1;
        jArr[i2] = l;
    }

    @Override // defpackage.x5
    public final Object j(Object obj) {
        long[] jArr = ((oet) obj).a;
        pet petVar = new pet();
        petVar.a = jArr;
        petVar.b = jArr.length;
        petVar.b(10);
        return petVar;
    }

    @Override // defpackage.bsm
    public final Object m() {
        return new oet(new long[0]);
    }

    @Override // defpackage.bsm
    public final void n(wq5 wq5Var, Object obj, int i) {
        long[] jArr = ((oet) obj).a;
        wq5Var.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            l6b s = wq5Var.s(this.c, i2);
            long j = jArr[i2];
            met metVar = net.b;
            s.r(j);
        }
    }
}
