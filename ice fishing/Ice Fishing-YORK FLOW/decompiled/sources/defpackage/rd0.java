package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class rd0 implements defpackage.rh1 {
    public final /* synthetic */ defpackage.xd0 P05cfTpS5W5L;
    public float QiMR8OkAhezm;
    public defpackage.sc0 WDYagTQQm9ns = defpackage.sc0.oh71FJcDz6S2;
    public float oh71FJcDz6S2;

    public rd0(defpackage.xd0 xd0Var) {
        this.P05cfTpS5W5L = xd0Var;
    }

    @Override // defpackage.rh1
    public final java.util.List KrtOTfE6jiS2(defpackage.c20 c20Var, java.lang.Object obj) {
        defpackage.xd0 xd0Var = this.P05cfTpS5W5L;
        xd0Var.P05cfTpS5W5L();
        defpackage.jd0 jd0Var = xd0Var.WDYagTQQm9ns;
        defpackage.fd0 fd0Var = jd0Var.BXaznwstz2U0.JhCgjQRTAOCT;
        defpackage.fd0 fd0Var2 = defpackage.fd0.QiMR8OkAhezm;
        defpackage.fd0 fd0Var3 = defpackage.fd0.WDYagTQQm9ns;
        if (fd0Var != fd0Var3 && fd0Var != fd0Var2 && fd0Var != defpackage.fd0.oh71FJcDz6S2 && fd0Var != defpackage.fd0.P05cfTpS5W5L) {
            defpackage.e80.giKS3J6vZuNy("subcompose can only be used inside the measure or layout blocks");
        }
        defpackage.yn0 yn0Var = xd0Var.Ns0WNyEWdPsk;
        java.lang.Object QiMR8OkAhezm = yn0Var.QiMR8OkAhezm(obj);
        if (QiMR8OkAhezm == null) {
            QiMR8OkAhezm = (defpackage.jd0) xd0Var.gUjdnLbkVAaA.Ns0WNyEWdPsk(obj);
            if (QiMR8OkAhezm != null) {
                if (xd0Var.BHfvd2J71qpO <= 0) {
                    defpackage.e80.giKS3J6vZuNy("Check failed.");
                }
                xd0Var.BHfvd2J71qpO--;
            } else {
                QiMR8OkAhezm = xd0Var.gUjdnLbkVAaA(obj);
                if (QiMR8OkAhezm == null) {
                    int i = xd0Var.P05cfTpS5W5L;
                    defpackage.jd0 jd0Var2 = new defpackage.jd0(2);
                    jd0Var.ZVVdXbWmyCSK = true;
                    jd0Var.blKFvluuDQOf(i, jd0Var2);
                    jd0Var.ZVVdXbWmyCSK = false;
                    QiMR8OkAhezm = jd0Var2;
                }
            }
            yn0Var.h3m55N1URyyK(obj, QiMR8OkAhezm);
        }
        defpackage.jd0 jd0Var3 = (defpackage.jd0) QiMR8OkAhezm;
        if (defpackage.hf.Rl68HURFBtL3(xd0Var.P05cfTpS5W5L, jd0Var.T1fB7bDYiVJQ()) != jd0Var3) {
            int e6mdH7fiFuta = ((defpackage.ho0) ((defpackage.qn0) jd0Var.T1fB7bDYiVJQ()).oh71FJcDz6S2).e6mdH7fiFuta(jd0Var3);
            if (e6mdH7fiFuta < xd0Var.P05cfTpS5W5L) {
                defpackage.e80.ZpBGe2uQfcn8("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
            }
            int i2 = xd0Var.P05cfTpS5W5L;
            if (i2 != e6mdH7fiFuta) {
                xd0Var.GE9mJIPrb8gP(e6mdH7fiFuta, i2);
            }
        }
        xd0Var.P05cfTpS5W5L++;
        xd0Var.h3m55N1URyyK(jd0Var3, obj, false, c20Var);
        return (fd0Var == fd0Var3 || fd0Var == fd0Var2) ? jd0Var3.h3m55N1URyyK() : jd0Var3.fNwYGHIYeJcR();
    }

    @Override // defpackage.xk0
    public final defpackage.wk0 Wc0TdmRSwbbi(int i, int i2, java.util.Map map, defpackage.y10 y10Var, defpackage.y10 y10Var2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            defpackage.e80.giKS3J6vZuNy("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new defpackage.qd0(i, i2, map, y10Var, this, this.P05cfTpS5W5L, y10Var2);
    }

    @Override // defpackage.fa0
    public final boolean ZVVdXbWmyCSK() {
        defpackage.fd0 fd0Var = this.P05cfTpS5W5L.WDYagTQQm9ns.BXaznwstz2U0.JhCgjQRTAOCT;
        return fd0Var == defpackage.fd0.P05cfTpS5W5L || fd0Var == defpackage.fd0.oh71FJcDz6S2;
    }

    @Override // defpackage.fa0
    public final defpackage.sc0 getLayoutDirection() {
        return this.WDYagTQQm9ns;
    }

    @Override // defpackage.hp
    public final float giKS3J6vZuNy() {
        return this.oh71FJcDz6S2;
    }

    @Override // defpackage.hp
    public final float h3m55N1URyyK() {
        return this.QiMR8OkAhezm;
    }
}
