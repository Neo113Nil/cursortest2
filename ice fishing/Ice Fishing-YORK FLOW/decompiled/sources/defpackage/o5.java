package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class o5 extends defpackage.lc0 implements defpackage.y10 {
    public final /* synthetic */ long P05cfTpS5W5L;
    public final /* synthetic */ defpackage.p5 QiMR8OkAhezm;
    public final /* synthetic */ int oh71FJcDz6S2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o5(defpackage.p5 p5Var, long j, int i) {
        super(1);
        this.oh71FJcDz6S2 = i;
        this.QiMR8OkAhezm = p5Var;
        this.P05cfTpS5W5L = j;
    }

    @Override // defpackage.y10
    public final java.lang.Object P05cfTpS5W5L(java.lang.Object obj) {
        defpackage.ex exVar;
        int i = this.oh71FJcDz6S2;
        long j = this.P05cfTpS5W5L;
        defpackage.p5 p5Var = this.QiMR8OkAhezm;
        switch (i) {
            case 0:
                defpackage.fp1 fp1Var = (defpackage.fp1) obj;
                if (!defpackage.ma0.QiMR8OkAhezm(fp1Var.giKS3J6vZuNy(), p5Var.w7APNrr0aGRc.giKS3J6vZuNy())) {
                    defpackage.dg1 dg1Var = (defpackage.dg1) p5Var.w7APNrr0aGRc.JhCgjQRTAOCT.QiMR8OkAhezm(fp1Var.giKS3J6vZuNy());
                    j = dg1Var != null ? ((defpackage.u90) dg1Var.getValue()).ZpBGe2uQfcn8 : 0L;
                } else if (!defpackage.u90.ZpBGe2uQfcn8(p5Var.maCixPsq4ml2, -9223372034707292160L)) {
                    j = p5Var.maCixPsq4ml2;
                }
                defpackage.dg1 dg1Var2 = (defpackage.dg1) p5Var.w7APNrr0aGRc.JhCgjQRTAOCT.QiMR8OkAhezm(fp1Var.fWTAfUmVKrZq());
                r1 = dg1Var2 != null ? ((defpackage.u90) dg1Var2.getValue()).ZpBGe2uQfcn8 : 0L;
                defpackage.ee1 ee1Var = (defpackage.ee1) p5Var.ZVVdXbWmyCSK.getValue();
                return (ee1Var == null || (exVar = (defpackage.ex) ee1Var.ZpBGe2uQfcn8.QiMR8OkAhezm(new defpackage.u90(j), new defpackage.u90(r1))) == null) ? defpackage.la0.hH0RRJrNssvh(0.0f, 400.0f, null, 5) : exVar;
            default:
                if (defpackage.ma0.QiMR8OkAhezm(obj, p5Var.w7APNrr0aGRc.giKS3J6vZuNy())) {
                    r1 = defpackage.u90.ZpBGe2uQfcn8(p5Var.maCixPsq4ml2, -9223372034707292160L) ? j : p5Var.maCixPsq4ml2;
                } else {
                    defpackage.dg1 dg1Var3 = (defpackage.dg1) p5Var.w7APNrr0aGRc.JhCgjQRTAOCT.QiMR8OkAhezm(obj);
                    if (dg1Var3 != null) {
                        r1 = ((defpackage.u90) dg1Var3.getValue()).ZpBGe2uQfcn8;
                    }
                }
                return new defpackage.u90(r1);
        }
    }
}
