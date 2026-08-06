package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final /* synthetic */ class hm1 implements defpackage.y10 {
    public final /* synthetic */ defpackage.fo0 QiMR8OkAhezm;
    public final /* synthetic */ int WDYagTQQm9ns;
    public final /* synthetic */ defpackage.hp oh71FJcDz6S2;

    public /* synthetic */ hm1(defpackage.hp hpVar, defpackage.fo0 fo0Var, int i) {
        this.WDYagTQQm9ns = i;
        this.oh71FJcDz6S2 = hpVar;
        this.QiMR8OkAhezm = fo0Var;
    }

    @Override // defpackage.y10
    public final java.lang.Object P05cfTpS5W5L(java.lang.Object obj) {
        int i = this.WDYagTQQm9ns;
        defpackage.fo0 fo0Var = this.QiMR8OkAhezm;
        defpackage.hp hpVar = this.oh71FJcDz6S2;
        switch (i) {
            case 0:
                defpackage.wd1 wd1Var = new defpackage.wd1(8, (defpackage.n10) obj);
                defpackage.hm1 hm1Var = new defpackage.hm1(hpVar, fo0Var, 1);
                if (defpackage.vj0.ZpBGe2uQfcn8()) {
                    return defpackage.vj0.ZpBGe2uQfcn8() ? new defpackage.sj0(wd1Var, hm1Var, android.os.Build.VERSION.SDK_INT == 28 ? defpackage.cz0.giKS3J6vZuNy : defpackage.cz0.fWTAfUmVKrZq) : defpackage.sl0.ZpBGe2uQfcn8;
                }
                throw new java.lang.UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
            default:
                defpackage.rr rrVar = (defpackage.rr) obj;
                fo0Var.setValue(new defpackage.u90((hpVar.OVwOqzUGHcCU(java.lang.Float.intBitsToFloat((int) (rrVar.ZpBGe2uQfcn8 & 4294967295L))) & 4294967295L) | (hpVar.OVwOqzUGHcCU(java.lang.Float.intBitsToFloat((int) (rrVar.ZpBGe2uQfcn8 >> 32))) << 32)));
                return defpackage.gs1.ZpBGe2uQfcn8;
        }
    }
}
