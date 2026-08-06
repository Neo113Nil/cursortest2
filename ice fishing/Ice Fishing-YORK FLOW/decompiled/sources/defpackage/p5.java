package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class p5 extends defpackage.dd0 {
    public defpackage.ep1 BHfvd2J71qpO;
    public defpackage.fo0 ZVVdXbWmyCSK;
    public long maCixPsq4ml2;
    public defpackage.q5 w7APNrr0aGRc;

    @Override // defpackage.ad0
    public final defpackage.wk0 WDYagTQQm9ns(defpackage.xk0 xk0Var, defpackage.qk0 qk0Var, long j) {
        long j2;
        defpackage.ry0 WDYagTQQm9ns = qk0Var.WDYagTQQm9ns(j);
        if (xk0Var.ZVVdXbWmyCSK()) {
            j2 = (WDYagTQQm9ns.WDYagTQQm9ns << 32) | (WDYagTQQm9ns.oh71FJcDz6S2 & 4294967295L);
        } else {
            defpackage.ep1 ep1Var = this.BHfvd2J71qpO;
            int i = WDYagTQQm9ns.WDYagTQQm9ns;
            if (ep1Var == null) {
                j2 = (i << 32) | (WDYagTQQm9ns.oh71FJcDz6S2 & 4294967295L);
                this.maCixPsq4ml2 = j2;
            } else {
                long j3 = (WDYagTQQm9ns.oh71FJcDz6S2 & 4294967295L) | (i << 32);
                defpackage.dp1 ZpBGe2uQfcn8 = ep1Var.ZpBGe2uQfcn8(new defpackage.o5(this, j3, 0), new defpackage.o5(this, j3, 1));
                this.w7APNrr0aGRc.getClass();
                j2 = ((defpackage.u90) ZpBGe2uQfcn8.getValue()).ZpBGe2uQfcn8;
                this.maCixPsq4ml2 = ((defpackage.u90) ZpBGe2uQfcn8.getValue()).ZpBGe2uQfcn8;
            }
        }
        return xk0Var.hwoZxnIesQBZ((int) (j2 >> 32), (int) (4294967295L & j2), defpackage.bv.WDYagTQQm9ns, new defpackage.n5(this, WDYagTQQm9ns, j2));
    }

    @Override // defpackage.ul0
    public final void Wx2ec0FCRg9J() {
        this.maCixPsq4ml2 = -9223372034707292160L;
    }
}
