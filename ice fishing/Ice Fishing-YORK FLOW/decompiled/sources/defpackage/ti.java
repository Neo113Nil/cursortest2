package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class ti {
    public final java.lang.Object ZpBGe2uQfcn8;

    public ti(int i) {
        switch (i) {
            case 1:
                this.ZpBGe2uQfcn8 = new java.lang.Object();
                break;
            case 2:
                this.ZpBGe2uQfcn8 = defpackage.w60.hH0RRJrNssvh(java.lang.Boolean.FALSE);
                break;
            default:
                this.ZpBGe2uQfcn8 = new java.util.ArrayList();
                break;
        }
    }

    public abstract void GE9mJIPrb8gP(defpackage.pd pdVar);

    public abstract void JhCgjQRTAOCT();

    public abstract void Ns0WNyEWdPsk(java.lang.Object obj);

    public void P05cfTpS5W5L(int i, java.lang.Object obj, defpackage.g30 g30Var, java.lang.Object obj2) {
        if (defpackage.ma0.QiMR8OkAhezm(obj, defpackage.cj.ZpBGe2uQfcn8)) {
            giKS3J6vZuNy(i, g30Var, null);
        }
    }

    public abstract java.lang.Object QiMR8OkAhezm();

    public abstract void WDYagTQQm9ns();

    /* JADX WARN: Code restructure failed: missing block: B:26:0x003a, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean ZpBGe2uQfcn8(int i, defpackage.g30 g30Var, java.lang.Object obj) {
        java.util.ArrayList arrayList = g30Var.ZpBGe2uQfcn8;
        if (arrayList != null) {
            int size = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                java.lang.Object obj2 = arrayList.get(i2);
                if (!(obj2 instanceof defpackage.y20)) {
                    if (!(obj2 instanceof defpackage.g30)) {
                        defpackage.h7.QiMR8OkAhezm(obj2, "Unexpected child source info ");
                        break;
                    }
                    if (ZpBGe2uQfcn8(i, (defpackage.g30) obj2, obj)) {
                        giKS3J6vZuNy(0, g30Var, obj2);
                        return true;
                    }
                } else if (obj2 == obj) {
                    giKS3J6vZuNy(0, g30Var, obj2);
                    return true;
                }
                i2++;
            }
        } else {
            giKS3J6vZuNy(i, g30Var, null);
            return true;
        }
    }

    public abstract defpackage.y10 e6mdH7fiFuta(defpackage.bc1 bc1Var);

    public abstract void fNwYGHIYeJcR(defpackage.jp1 jp1Var);

    public abstract void fWTAfUmVKrZq(defpackage.bc1 bc1Var);

    public void giKS3J6vZuNy(int i, defpackage.g30 g30Var, java.lang.Object obj) {
        ((java.util.ArrayList) this.ZpBGe2uQfcn8).add(new defpackage.ui(i, null, null));
    }

    public abstract void h3m55N1URyyK();

    public abstract java.lang.Object oh71FJcDz6S2();
}
