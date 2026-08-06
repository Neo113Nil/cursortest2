package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final /* synthetic */ class bp0 implements defpackage.n10 {
    public final /* synthetic */ int WDYagTQQm9ns;
    public final /* synthetic */ defpackage.xp0 oh71FJcDz6S2;

    public /* synthetic */ bp0(defpackage.xp0 xp0Var, int i) {
        this.WDYagTQQm9ns = i;
        this.oh71FJcDz6S2 = xp0Var;
    }

    @Override // defpackage.n10
    public final java.lang.Object ZpBGe2uQfcn8() {
        int i;
        int i2 = this.WDYagTQQm9ns;
        defpackage.xp0 xp0Var = this.oh71FJcDz6S2;
        switch (i2) {
            case 0:
                defpackage.a9 a9Var = xp0Var.oh71FJcDz6S2;
                boolean z = false;
                if (xp0Var.QiMR8OkAhezm) {
                    defpackage.p7 p7Var = xp0Var.giKS3J6vZuNy.oh71FJcDz6S2;
                    if (p7Var == null || !p7Var.isEmpty()) {
                        java.util.Iterator it = p7Var.iterator();
                        i = 0;
                        while (it.hasNext()) {
                            if (!(((defpackage.xo0) it.next()).oh71FJcDz6S2 instanceof defpackage.rp0) && (i = i + 1) < 0) {
                                throw new java.lang.ArithmeticException("Count overflow has happened.");
                            }
                        }
                    } else {
                        i = 0;
                    }
                    if (i > 1) {
                        z = true;
                    }
                }
                a9Var.JhCgjQRTAOCT(z);
                return defpackage.gs1.ZpBGe2uQfcn8;
            default:
                android.content.Context context = xp0Var.ZpBGe2uQfcn8;
                defpackage.zq0 zq0Var = xp0Var.giKS3J6vZuNy.BHfvd2J71qpO;
                context.getClass();
                zq0Var.getClass();
                return new defpackage.hq0();
        }
    }
}
