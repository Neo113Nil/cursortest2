package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class gb {
    public final defpackage.ho0 ZpBGe2uQfcn8;

    public gb(int i) {
        switch (i) {
            case 1:
                this.ZpBGe2uQfcn8 = new defpackage.ho0(new defpackage.ee0[16]);
                break;
            default:
                this.ZpBGe2uQfcn8 = new defpackage.ho0(new defpackage.tk[16]);
                break;
        }
    }

    public void ZpBGe2uQfcn8(java.util.concurrent.CancellationException cancellationException) {
        defpackage.ho0 ho0Var = this.ZpBGe2uQfcn8;
        int i = ho0Var.QiMR8OkAhezm;
        defpackage.bd[] bdVarArr = new defpackage.bd[i];
        for (int i2 = 0; i2 < i; i2++) {
            bdVarArr[i2] = ((defpackage.tk) ho0Var.WDYagTQQm9ns[i2]).giKS3J6vZuNy;
        }
        for (int i3 = 0; i3 < i; i3++) {
            bdVarArr[i3].T1fB7bDYiVJQ(cancellationException);
        }
        if (ho0Var.QiMR8OkAhezm == 0) {
            return;
        }
        defpackage.h80.fWTAfUmVKrZq("uncancelled requests present");
    }

    public void giKS3J6vZuNy() {
        defpackage.ho0 ho0Var = this.ZpBGe2uQfcn8;
        defpackage.p90 OVwOqzUGHcCU = defpackage.j80.OVwOqzUGHcCU(0, ho0Var.QiMR8OkAhezm);
        int i = OVwOqzUGHcCU.WDYagTQQm9ns;
        int i2 = OVwOqzUGHcCU.oh71FJcDz6S2;
        if (i <= i2) {
            while (true) {
                ((defpackage.tk) ho0Var.WDYagTQQm9ns[i]).giKS3J6vZuNy.e6mdH7fiFuta(defpackage.gs1.ZpBGe2uQfcn8);
                if (i == i2) {
                    break;
                } else {
                    i++;
                }
            }
        }
        ho0Var.QiMR8OkAhezm();
    }
}
