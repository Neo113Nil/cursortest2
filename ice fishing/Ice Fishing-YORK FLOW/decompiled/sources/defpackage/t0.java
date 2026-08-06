package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final /* synthetic */ class t0 implements defpackage.y10 {
    public final /* synthetic */ int WDYagTQQm9ns;
    public final /* synthetic */ long oh71FJcDz6S2;

    public /* synthetic */ t0(int i, long j) {
        this.WDYagTQQm9ns = i;
        this.oh71FJcDz6S2 = j;
    }

    @Override // defpackage.y10
    public final java.lang.Object P05cfTpS5W5L(java.lang.Object obj) {
        defpackage.dd ddVar;
        java.lang.Object g51Var;
        int i = this.WDYagTQQm9ns;
        long j = this.oh71FJcDz6S2;
        defpackage.gs1 gs1Var = defpackage.gs1.ZpBGe2uQfcn8;
        switch (i) {
            case 0:
                defpackage.mc mcVar = (defpackage.mc) obj;
                float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (mcVar.WDYagTQQm9ns.JhCgjQRTAOCT() >> 32)) / 2.0f;
                break;
            case 1:
                defpackage.tb tbVar = (defpackage.tb) obj;
                defpackage.y10 y10Var = tbVar.giKS3J6vZuNy;
                if (y10Var != null && (ddVar = tbVar.ZpBGe2uQfcn8) != null) {
                    try {
                        g51Var = y10Var.P05cfTpS5W5L(java.lang.Long.valueOf(j));
                    } catch (java.lang.Throwable th) {
                        g51Var = new defpackage.g51(th);
                    }
                    ddVar.e6mdH7fiFuta(g51Var);
                    break;
                }
                break;
            default:
                ((defpackage.rb1) obj).ZpBGe2uQfcn8(defpackage.ab1.ZpBGe2uQfcn8, new defpackage.za1(defpackage.o40.WDYagTQQm9ns, this.oh71FJcDz6S2, defpackage.ya1.oh71FJcDz6S2, true));
                break;
        }
        return gs1Var;
    }
}
