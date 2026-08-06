package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class i5 extends defpackage.lc0 implements defpackage.y10 {
    public final /* synthetic */ int P05cfTpS5W5L;
    public final /* synthetic */ defpackage.j5 QiMR8OkAhezm;
    public final /* synthetic */ int e6mdH7fiFuta;
    public final /* synthetic */ defpackage.ry0[] oh71FJcDz6S2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i5(defpackage.ry0[] ry0VarArr, defpackage.j5 j5Var, int i, int i2) {
        super(1);
        this.oh71FJcDz6S2 = ry0VarArr;
        this.QiMR8OkAhezm = j5Var;
        this.P05cfTpS5W5L = i;
        this.e6mdH7fiFuta = i2;
    }

    @Override // defpackage.y10
    public final java.lang.Object P05cfTpS5W5L(java.lang.Object obj) {
        defpackage.qy0 qy0Var = (defpackage.qy0) obj;
        for (defpackage.ry0 ry0Var : this.oh71FJcDz6S2) {
            if (ry0Var != null) {
                long ZpBGe2uQfcn8 = this.QiMR8OkAhezm.ZpBGe2uQfcn8.giKS3J6vZuNy.ZpBGe2uQfcn8((ry0Var.WDYagTQQm9ns << 32) | (ry0Var.oh71FJcDz6S2 & 4294967295L), (this.P05cfTpS5W5L << 32) | (this.e6mdH7fiFuta & 4294967295L), defpackage.sc0.WDYagTQQm9ns);
                defpackage.qy0.QiMR8OkAhezm(qy0Var, ry0Var, (int) (ZpBGe2uQfcn8 >> 32), (int) (ZpBGe2uQfcn8 & 4294967295L));
            }
        }
        return defpackage.gs1.ZpBGe2uQfcn8;
    }
}
