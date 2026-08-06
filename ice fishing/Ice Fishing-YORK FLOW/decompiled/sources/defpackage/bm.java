package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class bm implements defpackage.y10 {
    public final /* synthetic */ java.lang.Object QiMR8OkAhezm;
    public final /* synthetic */ int WDYagTQQm9ns;
    public final /* synthetic */ java.lang.Object oh71FJcDz6S2;

    public bm(defpackage.pw pwVar, boolean z, defpackage.fo0 fo0Var) {
        this.WDYagTQQm9ns = 1;
        this.oh71FJcDz6S2 = pwVar;
        this.QiMR8OkAhezm = fo0Var;
    }

    @Override // defpackage.y10
    public final java.lang.Object P05cfTpS5W5L(java.lang.Object obj) {
        long j;
        boolean z = false;
        switch (this.WDYagTQQm9ns) {
            case 0:
                android.view.KeyEvent keyEvent = ((defpackage.wb0) obj).ZpBGe2uQfcn8;
                if (((defpackage.hg0) this.oh71FJcDz6S2).ZpBGe2uQfcn8() == defpackage.q40.oh71FJcDz6S2 && keyEvent.getKeyCode() == 4 && defpackage.w60.jjTN4uUnoyEn(keyEvent) == 1) {
                    ((defpackage.em1) this.QiMR8OkAhezm).QiMR8OkAhezm(null);
                    z = true;
                }
                return java.lang.Boolean.valueOf(z);
            case 1:
                android.view.KeyEvent keyEvent2 = ((defpackage.wb0) obj).ZpBGe2uQfcn8;
                defpackage.fo0 fo0Var = (defpackage.fo0) this.QiMR8OkAhezm;
                defpackage.pw pwVar = (defpackage.pw) this.oh71FJcDz6S2;
                if (defpackage.w60.jjTN4uUnoyEn(keyEvent2) == 1 && (defpackage.vx1.VFeft99leXEK(keyEvent2) || defpackage.ub0.ZpBGe2uQfcn8(defpackage.v70.giKS3J6vZuNy(keyEvent2.getKeyCode()), defpackage.ub0.WmetiUbpKU9I))) {
                    pwVar.ZpBGe2uQfcn8();
                }
                java.lang.Boolean bool = java.lang.Boolean.FALSE;
                fo0Var.setValue(bool);
                return bool;
            case 2:
                defpackage.re1 re1Var = (defpackage.re1) obj;
                synchronized (defpackage.te1.fWTAfUmVKrZq) {
                    j = defpackage.te1.WDYagTQQm9ns;
                    defpackage.te1.WDYagTQQm9ns = 1 + j;
                }
                return new defpackage.do0(j, re1Var, (defpackage.y10) this.oh71FJcDz6S2, (defpackage.y10) this.QiMR8OkAhezm);
            case 3:
                defpackage.mc0 mc0Var = (defpackage.mc0) this.oh71FJcDz6S2;
                java.lang.Object obj2 = mc0Var.giKS3J6vZuNy;
                defpackage.dd ddVar = (defpackage.dd) this.QiMR8OkAhezm;
                synchronized (obj2) {
                    ((java.util.ArrayList) mc0Var.fWTAfUmVKrZq).remove(ddVar);
                }
                return defpackage.gs1.ZpBGe2uQfcn8;
            default:
                android.view.KeyEvent keyEvent3 = ((defpackage.wb0) obj).ZpBGe2uQfcn8;
                defpackage.dz dzVar = (defpackage.dz) this.QiMR8OkAhezm;
                android.view.InputDevice device = keyEvent3.getDevice();
                if (device != null && device.supportsSource(513) && ((!device.isVirtual() || keyEvent3.getSource() == 33554433) && defpackage.w60.jjTN4uUnoyEn(keyEvent3) == 2 && keyEvent3.getSource() != 257)) {
                    if (defpackage.t80.WDYagTQQm9ns(19, keyEvent3)) {
                        z = ((defpackage.gz) dzVar).QiMR8OkAhezm(5, true);
                    } else if (defpackage.t80.WDYagTQQm9ns(20, keyEvent3)) {
                        z = ((defpackage.gz) dzVar).QiMR8OkAhezm(6, true);
                    } else if (defpackage.t80.WDYagTQQm9ns(21, keyEvent3)) {
                        z = ((defpackage.gz) dzVar).QiMR8OkAhezm(3, true);
                    } else if (defpackage.t80.WDYagTQQm9ns(22, keyEvent3)) {
                        z = ((defpackage.gz) dzVar).QiMR8OkAhezm(4, true);
                    } else if (defpackage.t80.WDYagTQQm9ns(23, keyEvent3)) {
                        defpackage.if1 if1Var = ((defpackage.hg0) this.oh71FJcDz6S2).fWTAfUmVKrZq;
                        if (if1Var != null) {
                            ((defpackage.zo) if1Var).giKS3J6vZuNy();
                        }
                        z = true;
                    }
                }
                return java.lang.Boolean.valueOf(z);
        }
    }

    public /* synthetic */ bm(int i, java.lang.Object obj, java.lang.Object obj2) {
        this.WDYagTQQm9ns = i;
        this.oh71FJcDz6S2 = obj;
        this.QiMR8OkAhezm = obj2;
    }

    public bm(defpackage.dz dzVar, defpackage.hg0 hg0Var) {
        this.WDYagTQQm9ns = 4;
        this.QiMR8OkAhezm = dzVar;
        this.oh71FJcDz6S2 = hg0Var;
    }
}
