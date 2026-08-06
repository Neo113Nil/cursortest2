package defpackage;

/* loaded from: classes.dex */
public final class v01 {
    public final defpackage.xl0 AARZUJiTa;
    public defpackage.ol0 EXtogiMhuM;
    public defpackage.ol0 F7NU4MC0GW;
    public java.util.Set IHQe1A4L2xu;
    public java.util.ArrayList SH1y5HwkJhh;
    public defpackage.xl0 adDC3e2L;
    public defpackage.ol0 ez2rX8ReCYw;
    public defpackage.ih oh6vYeIP;
    public final defpackage.xl0 r1MBDhnF;
    public defpackage.nl0 riuEU0zW4;
    public final defpackage.xl0 xiZrDbcSW0;

    public v01() {
        defpackage.xl0 xl0Var = new defpackage.xl0(new defpackage.x10[16]);
        this.r1MBDhnF = xl0Var;
        defpackage.ol0 ol0Var = defpackage.a51.IHQe1A4L2xu;
        this.F7NU4MC0GW = new defpackage.ol0();
        this.adDC3e2L = xl0Var;
        this.xiZrDbcSW0 = new defpackage.xl0(new java.lang.Object[16]);
        this.AARZUJiTa = new defpackage.xl0(new defpackage.vz[16]);
    }

    public static final boolean xiZrDbcSW0(defpackage.x10 x10Var, defpackage.xl0 xl0Var) {
        java.lang.Object[] objArr = xl0Var.adDC3e2L;
        int i = xl0Var.AARZUJiTa;
        for (int i2 = 0; i2 < i; i2++) {
            defpackage.w01 w01Var = ((defpackage.x10) objArr[i2]).IHQe1A4L2xu;
            if (w01Var instanceof defpackage.cu0) {
                defpackage.xl0 xl0Var2 = ((defpackage.cu0) w01Var).xiZrDbcSW0;
                if (xl0Var2.SH1y5HwkJhh(x10Var) || xiZrDbcSW0(x10Var, xl0Var2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void AARZUJiTa(java.util.Set set, defpackage.ih ihVar) {
        IHQe1A4L2xu();
        this.IHQe1A4L2xu = set;
        this.oh6vYeIP = ihVar;
    }

    public final void F7NU4MC0GW() {
        defpackage.xl0 xl0Var = this.AARZUJiTa;
        if (xl0Var.AARZUJiTa != 0) {
            android.os.Trace.beginSection("Compose:sideeffects");
            try {
                java.lang.Object[] objArr = xl0Var.adDC3e2L;
                int i = xl0Var.AARZUJiTa;
                for (int i2 = 0; i2 < i; i2++) {
                    ((defpackage.vz) objArr[i2]).IHQe1A4L2xu();
                }
                xl0Var.AARZUJiTa();
            } finally {
                android.os.Trace.endSection();
            }
        }
    }

    public final void IHQe1A4L2xu() {
        this.IHQe1A4L2xu = null;
        this.oh6vYeIP = null;
        defpackage.xl0 xl0Var = this.r1MBDhnF;
        xl0Var.AARZUJiTa();
        this.F7NU4MC0GW.oh6vYeIP();
        this.adDC3e2L = xl0Var;
        this.xiZrDbcSW0.AARZUJiTa();
        this.AARZUJiTa.AARZUJiTa();
        this.EXtogiMhuM = null;
        this.riuEU0zW4 = null;
        this.SH1y5HwkJhh = null;
    }

    public final void adDC3e2L(defpackage.x10 x10Var) {
        if (!this.F7NU4MC0GW.r1MBDhnF(x10Var)) {
            defpackage.ol0 ol0Var = this.ez2rX8ReCYw;
            if (ol0Var == null || !ol0Var.r1MBDhnF(x10Var)) {
                this.xiZrDbcSW0.oh6vYeIP(x10Var);
                return;
            }
            return;
        }
        this.F7NU4MC0GW.JlrlGoKF(x10Var);
        if (!this.adDC3e2L.SH1y5HwkJhh(x10Var)) {
            defpackage.xl0 xl0Var = this.r1MBDhnF;
            if (!xl0Var.SH1y5HwkJhh(x10Var)) {
                xiZrDbcSW0(x10Var, xl0Var);
            }
        }
        java.util.Set set = this.IHQe1A4L2xu;
        if (set == null) {
            return;
        }
        set.add(x10Var.IHQe1A4L2xu);
    }

    public final void oh6vYeIP() {
        java.util.Set set = this.IHQe1A4L2xu;
        if (set == null || set.isEmpty()) {
            return;
        }
        android.os.Trace.beginSection("Compose:abandons");
        try {
            java.util.Iterator it = set.iterator();
            while (it.hasNext()) {
                defpackage.w01 w01Var = (defpackage.w01) it.next();
                it.remove();
                w01Var.r1MBDhnF();
            }
        } finally {
            android.os.Trace.endSection();
        }
    }

    public final void r1MBDhnF() {
        java.util.Set set = this.IHQe1A4L2xu;
        if (set == null) {
            return;
        }
        this.ez2rX8ReCYw = null;
        defpackage.xl0 xl0Var = this.xiZrDbcSW0;
        int i = 3;
        if (xl0Var.AARZUJiTa != 0) {
            android.os.Trace.beginSection("Compose:onForgotten");
            try {
                defpackage.ol0 ol0Var = this.EXtogiMhuM;
                int i2 = xl0Var.AARZUJiTa;
                while (true) {
                    i2--;
                    if (-1 >= i2) {
                        break;
                    }
                    java.lang.Object obj = xl0Var.adDC3e2L[i2];
                    try {
                        if (obj instanceof defpackage.x10) {
                            defpackage.w01 w01Var = ((defpackage.x10) obj).IHQe1A4L2xu;
                            set.remove(w01Var);
                            w01Var.adDC3e2L();
                        }
                        if (obj instanceof defpackage.ig) {
                            if (ol0Var == null || !ol0Var.r1MBDhnF(obj)) {
                                ((defpackage.ig) obj).oh6vYeIP();
                            } else {
                                ((defpackage.ig) obj).IHQe1A4L2xu();
                            }
                        }
                    } catch (java.lang.Throwable th) {
                        defpackage.ih ihVar = this.oh6vYeIP;
                        if (ihVar != null) {
                            defpackage.x70.RmCzwkUxICV(th, new defpackage.DSux0S2nxMSk(i, ihVar, obj));
                        }
                        throw th;
                    }
                }
            } finally {
            }
        }
        defpackage.xl0 xl0Var2 = this.r1MBDhnF;
        if (xl0Var2.AARZUJiTa != 0) {
            android.os.Trace.beginSection("Compose:onRemembered");
            try {
                java.util.Set set2 = this.IHQe1A4L2xu;
                if (set2 != null) {
                    java.lang.Object[] objArr = xl0Var2.adDC3e2L;
                    int i3 = xl0Var2.AARZUJiTa;
                    for (int i4 = 0; i4 < i3; i4++) {
                        defpackage.x10 x10Var = (defpackage.x10) objArr[i4];
                        defpackage.w01 w01Var2 = x10Var.IHQe1A4L2xu;
                        set2.remove(w01Var2);
                        try {
                            w01Var2.IHQe1A4L2xu();
                        } catch (java.lang.Throwable th2) {
                            defpackage.ih ihVar2 = this.oh6vYeIP;
                            if (ihVar2 != null) {
                                defpackage.x70.RmCzwkUxICV(th2, new defpackage.DSux0S2nxMSk(i, ihVar2, x10Var));
                            }
                            throw th2;
                        }
                    }
                }
            } finally {
            }
        }
    }
}
