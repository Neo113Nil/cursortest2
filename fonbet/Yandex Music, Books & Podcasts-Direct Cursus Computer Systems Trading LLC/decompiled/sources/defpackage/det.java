package defpackage;

/* loaded from: classes5.dex */
public final class det extends bsm {
    public static final det d;

    static {
        aet.b.getClass();
        d = new det(eet.a);
    }

    @Override // defpackage.x5
    public final int e(Object obj) {
        return ((bet) obj).a.length;
    }

    @Override // defpackage.zz4, defpackage.x5
    public final void i(tq5 tq5Var, int i, Object obj) {
        cet cetVar = (cet) obj;
        cetVar.getClass();
        byte E = tq5Var.x(this.c, i).E();
        zdt zdtVar = aet.b;
        cetVar.b(cetVar.d() + 1);
        byte[] bArr = cetVar.a;
        int i2 = cetVar.b;
        cetVar.b = i2 + 1;
        bArr[i2] = E;
    }

    @Override // defpackage.x5
    public final Object j(Object obj) {
        byte[] bArr = ((bet) obj).a;
        cet cetVar = new cet();
        cetVar.a = bArr;
        cetVar.b = bArr.length;
        cetVar.b(10);
        return cetVar;
    }

    @Override // defpackage.bsm
    public final Object m() {
        return new bet(new byte[0]);
    }

    @Override // defpackage.bsm
    public final void n(wq5 wq5Var, Object obj, int i) {
        byte[] bArr = ((bet) obj).a;
        wq5Var.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            l6b s = wq5Var.s(this.c, i2);
            byte b = bArr[i2];
            zdt zdtVar = aet.b;
            s.h(b);
        }
    }
}
