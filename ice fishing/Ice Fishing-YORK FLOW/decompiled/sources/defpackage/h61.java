package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class h61 {
    public defpackage.vo1 JhCgjQRTAOCT;
    public defpackage.f61 WDYagTQQm9ns;
    public defpackage.jl ZpBGe2uQfcn8;
    public java.util.concurrent.Executor fWTAfUmVKrZq;
    public defpackage.jm giKS3J6vZuNy;
    public defpackage.wa0 oh71FJcDz6S2;
    public final defpackage.n80 QiMR8OkAhezm = new defpackage.n80(new defpackage.j(0, this, defpackage.h61.class, "onClosed", "onClosed()V", 0, 0, 6));
    public final java.lang.ThreadLocal P05cfTpS5W5L = new java.lang.ThreadLocal();
    public final java.util.LinkedHashMap e6mdH7fiFuta = new java.util.LinkedHashMap();
    public boolean GE9mJIPrb8gP = true;

    public final java.lang.Object GE9mJIPrb8gP(boolean z, defpackage.c20 c20Var, defpackage.ll llVar) {
        defpackage.f61 f61Var = this.WDYagTQQm9ns;
        if (f61Var != null) {
            return f61Var.oh71FJcDz6S2.h3m55N1URyyK(z, c20Var, llVar);
        }
        defpackage.ma0.hH0RRJrNssvh("connectionManager");
        throw null;
    }

    public final defpackage.wa0 JhCgjQRTAOCT() {
        defpackage.wa0 wa0Var = this.oh71FJcDz6S2;
        if (wa0Var != null) {
            return wa0Var;
        }
        defpackage.ma0.hH0RRJrNssvh("internalTracker");
        throw null;
    }

    public final boolean P05cfTpS5W5L() {
        if (e6mdH7fiFuta()) {
            defpackage.f61 f61Var = this.WDYagTQQm9ns;
            if (f61Var == null) {
                defpackage.ma0.hH0RRJrNssvh("connectionManager");
                throw null;
            }
            defpackage.yh1 yh1Var = f61Var.QiMR8OkAhezm;
            if (yh1Var == null) {
                defpackage.h7.P05cfTpS5W5L("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
                return false;
            }
            if (yh1Var.dG7RjM6DqYVL().gUjdnLbkVAaA()) {
                return true;
            }
        }
        return false;
    }

    public final boolean QiMR8OkAhezm() {
        defpackage.f61 f61Var = this.WDYagTQQm9ns;
        if (f61Var != null) {
            return f61Var.QiMR8OkAhezm != null;
        }
        defpackage.ma0.hH0RRJrNssvh("connectionManager");
        throw null;
    }

    public java.util.Set WDYagTQQm9ns() {
        return defpackage.hf.RIHPIrzkudeW(new java.util.ArrayList(defpackage.jf.Wc0TdmRSwbbi(defpackage.ev.WDYagTQQm9ns, 10)));
    }

    public java.util.List ZpBGe2uQfcn8(java.util.LinkedHashMap linkedHashMap) {
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(defpackage.jk0.zJPqDeoF0Os1(linkedHashMap.size()));
        for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
            defpackage.ne neVar = (defpackage.ne) entry.getKey();
            neVar.getClass();
            java.lang.Class ZpBGe2uQfcn8 = neVar.ZpBGe2uQfcn8();
            ZpBGe2uQfcn8.getClass();
            linkedHashMap2.put(ZpBGe2uQfcn8, entry.getValue());
        }
        return defpackage.av.WDYagTQQm9ns;
    }

    public final boolean e6mdH7fiFuta() {
        defpackage.f61 f61Var = this.WDYagTQQm9ns;
        if (f61Var == null) {
            defpackage.ma0.hH0RRJrNssvh("connectionManager");
            throw null;
        }
        defpackage.e10 e10Var = f61Var.P05cfTpS5W5L;
        if (e10Var != null) {
            return e10Var.isOpen();
        }
        return false;
    }

    public defpackage.gu fWTAfUmVKrZq() {
        throw new defpackage.es0(0);
    }

    public abstract defpackage.wa0 giKS3J6vZuNy();

    public java.util.LinkedHashMap oh71FJcDz6S2() {
        int zJPqDeoF0Os1 = defpackage.jk0.zJPqDeoF0Os1(defpackage.jf.Wc0TdmRSwbbi(defpackage.ev.WDYagTQQm9ns, 10));
        if (zJPqDeoF0Os1 < 16) {
            zJPqDeoF0Os1 = 16;
        }
        return new java.util.LinkedHashMap(zJPqDeoF0Os1);
    }
}
