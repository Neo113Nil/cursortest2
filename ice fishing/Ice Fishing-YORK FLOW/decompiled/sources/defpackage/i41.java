package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class i41 {
    public java.util.ArrayList GE9mJIPrb8gP;
    public defpackage.zn0 JhCgjQRTAOCT;
    public defpackage.zn0 Ns0WNyEWdPsk;
    public defpackage.zn0 P05cfTpS5W5L;
    public final defpackage.ho0 QiMR8OkAhezm;
    public defpackage.ho0 WDYagTQQm9ns;
    public java.util.Set ZpBGe2uQfcn8;
    public defpackage.yn0 e6mdH7fiFuta;
    public final defpackage.ho0 fWTAfUmVKrZq;
    public defpackage.jj giKS3J6vZuNy;
    public final defpackage.ho0 oh71FJcDz6S2;

    public i41() {
        defpackage.ho0 ho0Var = new defpackage.ho0(new defpackage.j30[16]);
        this.fWTAfUmVKrZq = ho0Var;
        defpackage.zn0 zn0Var = defpackage.n81.ZpBGe2uQfcn8;
        this.JhCgjQRTAOCT = new defpackage.zn0();
        this.WDYagTQQm9ns = ho0Var;
        this.oh71FJcDz6S2 = new defpackage.ho0(new java.lang.Object[16]);
        this.QiMR8OkAhezm = new defpackage.ho0(new defpackage.n10[16]);
    }

    public static final boolean oh71FJcDz6S2(defpackage.j30 j30Var, defpackage.ho0 ho0Var) {
        java.lang.Object[] objArr = ho0Var.WDYagTQQm9ns;
        int i = ho0Var.QiMR8OkAhezm;
        for (int i2 = 0; i2 < i; i2++) {
            defpackage.j41 j41Var = ((defpackage.j30) objArr[i2]).ZpBGe2uQfcn8;
            if (j41Var instanceof defpackage.wx0) {
                defpackage.ho0 ho0Var2 = ((defpackage.wx0) j41Var).oh71FJcDz6S2;
                if (ho0Var2.GE9mJIPrb8gP(j30Var) || oh71FJcDz6S2(j30Var, ho0Var2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void JhCgjQRTAOCT() {
        defpackage.ho0 ho0Var = this.QiMR8OkAhezm;
        if (ho0Var.QiMR8OkAhezm != 0) {
            android.os.Trace.beginSection("Compose:sideeffects");
            try {
                java.lang.Object[] objArr = ho0Var.WDYagTQQm9ns;
                int i = ho0Var.QiMR8OkAhezm;
                for (int i2 = 0; i2 < i; i2++) {
                    ((defpackage.n10) objArr[i2]).ZpBGe2uQfcn8();
                }
                ho0Var.QiMR8OkAhezm();
            } finally {
                android.os.Trace.endSection();
            }
        }
    }

    public final void QiMR8OkAhezm(java.util.Set set, defpackage.jj jjVar) {
        ZpBGe2uQfcn8();
        this.ZpBGe2uQfcn8 = set;
        this.giKS3J6vZuNy = jjVar;
    }

    public final void WDYagTQQm9ns(defpackage.j30 j30Var) {
        if (!this.JhCgjQRTAOCT.fWTAfUmVKrZq(j30Var)) {
            defpackage.zn0 zn0Var = this.Ns0WNyEWdPsk;
            if (zn0Var == null || !zn0Var.fWTAfUmVKrZq(j30Var)) {
                this.oh71FJcDz6S2.giKS3J6vZuNy(j30Var);
                return;
            }
            return;
        }
        this.JhCgjQRTAOCT.fNwYGHIYeJcR(j30Var);
        if (!this.WDYagTQQm9ns.GE9mJIPrb8gP(j30Var)) {
            defpackage.ho0 ho0Var = this.fWTAfUmVKrZq;
            if (!ho0Var.GE9mJIPrb8gP(j30Var)) {
                oh71FJcDz6S2(j30Var, ho0Var);
            }
        }
        java.util.Set set = this.ZpBGe2uQfcn8;
        if (set == null) {
            return;
        }
        set.add(j30Var.ZpBGe2uQfcn8);
    }

    public final void ZpBGe2uQfcn8() {
        this.ZpBGe2uQfcn8 = null;
        this.giKS3J6vZuNy = null;
        defpackage.ho0 ho0Var = this.fWTAfUmVKrZq;
        ho0Var.QiMR8OkAhezm();
        this.JhCgjQRTAOCT.giKS3J6vZuNy();
        this.WDYagTQQm9ns = ho0Var;
        this.oh71FJcDz6S2.QiMR8OkAhezm();
        this.QiMR8OkAhezm.QiMR8OkAhezm();
        this.P05cfTpS5W5L = null;
        this.e6mdH7fiFuta = null;
        this.GE9mJIPrb8gP = null;
    }

    public final void fWTAfUmVKrZq() {
        java.util.Set set = this.ZpBGe2uQfcn8;
        if (set == null) {
            return;
        }
        this.Ns0WNyEWdPsk = null;
        defpackage.ho0 ho0Var = this.oh71FJcDz6S2;
        int i = 6;
        if (ho0Var.QiMR8OkAhezm != 0) {
            android.os.Trace.beginSection("Compose:onForgotten");
            try {
                defpackage.zn0 zn0Var = this.P05cfTpS5W5L;
                int i2 = ho0Var.QiMR8OkAhezm;
                while (true) {
                    i2--;
                    if (-1 >= i2) {
                        break;
                    }
                    java.lang.Object obj = ho0Var.WDYagTQQm9ns[i2];
                    try {
                        if (obj instanceof defpackage.j30) {
                            defpackage.j41 j41Var = ((defpackage.j30) obj).ZpBGe2uQfcn8;
                            set.remove(j41Var);
                            j41Var.WDYagTQQm9ns();
                        }
                        if (obj instanceof defpackage.ii) {
                            if (zn0Var == null || !zn0Var.fWTAfUmVKrZq(obj)) {
                                ((defpackage.ii) obj).giKS3J6vZuNy();
                            } else {
                                ((defpackage.ii) obj).ZpBGe2uQfcn8();
                            }
                        }
                    } catch (java.lang.Throwable th) {
                        defpackage.jj jjVar = this.giKS3J6vZuNy;
                        if (jjVar != null) {
                            defpackage.ok0.GoIRkIe1iwj6(th, new defpackage.S0YpfprlOYIn(i, jjVar, obj));
                        }
                        throw th;
                    }
                }
            } finally {
            }
        }
        defpackage.ho0 ho0Var2 = this.fWTAfUmVKrZq;
        if (ho0Var2.QiMR8OkAhezm != 0) {
            android.os.Trace.beginSection("Compose:onRemembered");
            try {
                java.util.Set set2 = this.ZpBGe2uQfcn8;
                if (set2 != null) {
                    java.lang.Object[] objArr = ho0Var2.WDYagTQQm9ns;
                    int i3 = ho0Var2.QiMR8OkAhezm;
                    for (int i4 = 0; i4 < i3; i4++) {
                        defpackage.j30 j30Var = (defpackage.j30) objArr[i4];
                        defpackage.j41 j41Var2 = j30Var.ZpBGe2uQfcn8;
                        set2.remove(j41Var2);
                        try {
                            j41Var2.ZpBGe2uQfcn8();
                        } catch (java.lang.Throwable th2) {
                            defpackage.jj jjVar2 = this.giKS3J6vZuNy;
                            if (jjVar2 != null) {
                                defpackage.ok0.GoIRkIe1iwj6(th2, new defpackage.S0YpfprlOYIn(i, jjVar2, j30Var));
                            }
                            throw th2;
                        }
                    }
                }
            } finally {
            }
        }
    }

    public final void giKS3J6vZuNy() {
        java.util.Set set = this.ZpBGe2uQfcn8;
        if (set == null || set.isEmpty()) {
            return;
        }
        android.os.Trace.beginSection("Compose:abandons");
        try {
            java.util.Iterator it = set.iterator();
            while (it.hasNext()) {
                defpackage.j41 j41Var = (defpackage.j41) it.next();
                it.remove();
                j41Var.fWTAfUmVKrZq();
            }
        } finally {
            android.os.Trace.endSection();
        }
    }
}
