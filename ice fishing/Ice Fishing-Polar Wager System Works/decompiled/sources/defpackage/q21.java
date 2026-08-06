package defpackage;

/* loaded from: classes.dex */
public abstract class q21 {
    public boolean EXtogiMhuM;
    public defpackage.yh1 F7NU4MC0GW;
    public defpackage.dj IHQe1A4L2xu;
    public defpackage.o21 adDC3e2L;
    public defpackage.lj oh6vYeIP;
    public java.util.concurrent.Executor r1MBDhnF;
    public defpackage.k80 xiZrDbcSW0;
    public final defpackage.F7NU4MC0GW AARZUJiTa = new defpackage.F7NU4MC0GW(new defpackage.m0(0, this, defpackage.q21.class, "onClosed", "onClosed()V", 0, 0, 3));
    public final java.lang.ThreadLocal riuEU0zW4 = new java.lang.ThreadLocal();
    public final java.util.LinkedHashMap SH1y5HwkJhh = new java.util.LinkedHashMap();
    public boolean ez2rX8ReCYw = true;

    public java.util.Set AARZUJiTa() {
        return defpackage.td.FisHbM7NmV(new java.util.ArrayList(defpackage.ud.EoOhNTTfIN7K(defpackage.rt.adDC3e2L, 10)));
    }

    public java.util.LinkedHashMap EXtogiMhuM() {
        int yIx6ChFVk = defpackage.yh0.yIx6ChFVk(defpackage.ud.EoOhNTTfIN7K(defpackage.rt.adDC3e2L, 10));
        if (yIx6ChFVk < 16) {
            yIx6ChFVk = 16;
        }
        return new java.util.LinkedHashMap(yIx6ChFVk);
    }

    public defpackage.ts F7NU4MC0GW() {
        throw new defpackage.sp0(0);
    }

    public final void IHQe1A4L2xu() {
        if (this.EXtogiMhuM) {
            return;
        }
        if (android.os.Looper.getMainLooper().getThread() == java.lang.Thread.currentThread()) {
            defpackage.db.AARZUJiTa("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final java.lang.Object JlrlGoKF(boolean z, defpackage.k00 k00Var, defpackage.fj fjVar) {
        defpackage.o21 o21Var = this.adDC3e2L;
        if (o21Var != null) {
            return o21Var.xiZrDbcSW0.DFo87pBq1E5(z, k00Var, fjVar);
        }
        defpackage.x70.Ye0N2xE9Hc("connectionManager");
        throw null;
    }

    public final boolean SH1y5HwkJhh() {
        return ez2rX8ReCYw() && xiZrDbcSW0().QQUzIjv3iOC5().SyNS6RMn();
    }

    public final defpackage.k80 adDC3e2L() {
        defpackage.k80 k80Var = this.xiZrDbcSW0;
        if (k80Var != null) {
            return k80Var;
        }
        defpackage.x70.Ye0N2xE9Hc("internalTracker");
        throw null;
    }

    public final boolean ez2rX8ReCYw() {
        defpackage.o21 o21Var = this.adDC3e2L;
        if (o21Var == null) {
            defpackage.x70.Ye0N2xE9Hc("connectionManager");
            throw null;
        }
        defpackage.mz mzVar = o21Var.EXtogiMhuM;
        if (mzVar != null) {
            return mzVar.isOpen();
        }
        return false;
    }

    public java.util.List oh6vYeIP(java.util.LinkedHashMap linkedHashMap) {
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(defpackage.yh0.yIx6ChFVk(linkedHashMap.size()));
        for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(defpackage.a70.QoRHpC4k((defpackage.xc) entry.getKey()), entry.getValue());
        }
        return defpackage.nt.adDC3e2L;
    }

    public abstract defpackage.k80 r1MBDhnF();

    public final boolean riuEU0zW4() {
        defpackage.o21 o21Var = this.adDC3e2L;
        if (o21Var != null) {
            return o21Var.AARZUJiTa != null;
        }
        defpackage.x70.Ye0N2xE9Hc("connectionManager");
        throw null;
    }

    public final defpackage.nd1 xiZrDbcSW0() {
        defpackage.o21 o21Var = this.adDC3e2L;
        if (o21Var == null) {
            defpackage.x70.Ye0N2xE9Hc("connectionManager");
            throw null;
        }
        defpackage.nd1 nd1Var = o21Var.AARZUJiTa;
        if (nd1Var != null) {
            return nd1Var;
        }
        defpackage.db.AARZUJiTa("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
        return null;
    }
}
