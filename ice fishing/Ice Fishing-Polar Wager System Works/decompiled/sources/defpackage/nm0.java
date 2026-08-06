package defpackage;

/* loaded from: classes.dex */
public final class nm0 implements defpackage.ud0, defpackage.cn1, defpackage.h30, defpackage.i41 {
    public final android.os.Bundle AARZUJiTa;
    public defpackage.nd0 EXtogiMhuM;
    public final defpackage.pm0 JlrlGoKF = new defpackage.pm0(this);
    public final java.lang.String SH1y5HwkJhh;
    public final defpackage.a6 adDC3e2L;
    public final android.os.Bundle ez2rX8ReCYw;
    public final defpackage.zm0 riuEU0zW4;
    public defpackage.gn0 xiZrDbcSW0;

    public nm0(defpackage.a6 a6Var, defpackage.gn0 gn0Var, android.os.Bundle bundle, defpackage.nd0 nd0Var, defpackage.zm0 zm0Var, java.lang.String str, android.os.Bundle bundle2) {
        this.adDC3e2L = a6Var;
        this.xiZrDbcSW0 = gn0Var;
        this.AARZUJiTa = bundle;
        this.EXtogiMhuM = nd0Var;
        this.riuEU0zW4 = zm0Var;
        this.SH1y5HwkJhh = str;
        this.ez2rX8ReCYw = bundle2;
        new defpackage.le1(new defpackage.e3(8, this));
    }

    @Override // defpackage.cn1
    public final defpackage.bn1 AARZUJiTa() {
        defpackage.pm0 pm0Var = this.JlrlGoKF;
        if (!pm0Var.riuEU0zW4) {
            defpackage.db.AARZUJiTa("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
            return null;
        }
        if (pm0Var.SH1y5HwkJhh.EXtogiMhuM == defpackage.nd0.adDC3e2L) {
            defpackage.db.AARZUJiTa("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
            return null;
        }
        defpackage.zm0 zm0Var = pm0Var.adDC3e2L;
        if (zm0Var == null) {
            defpackage.db.AARZUJiTa("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
            return null;
        }
        java.lang.String str = pm0Var.xiZrDbcSW0;
        str.getClass();
        java.util.LinkedHashMap linkedHashMap = zm0Var.oh6vYeIP;
        defpackage.bn1 bn1Var = (defpackage.bn1) linkedHashMap.get(str);
        if (bn1Var != null) {
            return bn1Var;
        }
        defpackage.bn1 bn1Var2 = new defpackage.bn1();
        linkedHashMap.put(str, bn1Var2);
        return bn1Var2;
    }

    @Override // defpackage.ud0
    public final defpackage.xd0 EXtogiMhuM() {
        return this.JlrlGoKF.SH1y5HwkJhh;
    }

    public final void IHQe1A4L2xu(defpackage.nd0 nd0Var) {
        defpackage.pm0 pm0Var = this.JlrlGoKF;
        pm0Var.getClass();
        pm0Var.ez2rX8ReCYw = nd0Var;
        pm0Var.oh6vYeIP();
    }

    @Override // defpackage.h30
    public final defpackage.zm1 adDC3e2L() {
        return this.JlrlGoKF.JlrlGoKF;
    }

    public final boolean equals(java.lang.Object obj) {
        java.util.Set<java.lang.String> keySet;
        if (obj != null && (obj instanceof defpackage.nm0)) {
            defpackage.nm0 nm0Var = (defpackage.nm0) obj;
            android.os.Bundle bundle = nm0Var.AARZUJiTa;
            if (defpackage.x70.QoRHpC4k(this.SH1y5HwkJhh, nm0Var.SH1y5HwkJhh) && defpackage.x70.QoRHpC4k(this.xiZrDbcSW0, nm0Var.xiZrDbcSW0) && defpackage.x70.QoRHpC4k(this.JlrlGoKF.SH1y5HwkJhh, nm0Var.JlrlGoKF.SH1y5HwkJhh) && defpackage.x70.QoRHpC4k(r1MBDhnF(), nm0Var.r1MBDhnF())) {
                android.os.Bundle bundle2 = this.AARZUJiTa;
                if (defpackage.x70.QoRHpC4k(bundle2, bundle)) {
                    return true;
                }
                if (bundle2 != null && (keySet = bundle2.keySet()) != null) {
                    java.util.Set<java.lang.String> set = keySet;
                    if ((set instanceof java.util.Collection) && set.isEmpty()) {
                        return true;
                    }
                    for (java.lang.String str : set) {
                        if (!defpackage.x70.QoRHpC4k(bundle2.get(str), bundle != null ? bundle.get(str) : null)) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        java.util.Set<java.lang.String> keySet;
        int hashCode = this.xiZrDbcSW0.hashCode() + (this.SH1y5HwkJhh.hashCode() * 31);
        android.os.Bundle bundle = this.AARZUJiTa;
        if (bundle != null && (keySet = bundle.keySet()) != null) {
            java.util.Iterator<T> it = keySet.iterator();
            while (it.hasNext()) {
                int i = hashCode * 31;
                java.lang.Object obj = bundle.get((java.lang.String) it.next());
                hashCode = i + (obj != null ? obj.hashCode() : 0);
            }
        }
        return r1MBDhnF().hashCode() + ((this.JlrlGoKF.SH1y5HwkJhh.hashCode() + (hashCode * 31)) * 31);
    }

    @Override // defpackage.i41
    public final defpackage.F7NU4MC0GW r1MBDhnF() {
        return (defpackage.F7NU4MC0GW) this.JlrlGoKF.EXtogiMhuM.AARZUJiTa;
    }

    public final java.lang.String toString() {
        return this.JlrlGoKF.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final defpackage.uk0 xiZrDbcSW0() {
        android.app.Application application;
        android.app.Application application2;
        defpackage.pm0 pm0Var = this.JlrlGoKF;
        pm0Var.getClass();
        defpackage.uk0 uk0Var = new defpackage.uk0();
        defpackage.ky kyVar = defpackage.w70.XZx205DYe;
        defpackage.nm0 nm0Var = pm0Var.IHQe1A4L2xu;
        java.util.LinkedHashMap linkedHashMap = uk0Var.IHQe1A4L2xu;
        linkedHashMap.put(kyVar, nm0Var);
        linkedHashMap.put(defpackage.w70.mAr5m2L7gYDP, nm0Var);
        android.os.Bundle IHQe1A4L2xu = pm0Var.IHQe1A4L2xu();
        if (IHQe1A4L2xu != null) {
            linkedHashMap.put(defpackage.w70.hyxIchWRW, IHQe1A4L2xu);
        }
        defpackage.a6 a6Var = this.adDC3e2L;
        if (a6Var != null) {
            android.content.Context context = a6Var.IHQe1A4L2xu;
            android.content.Context applicationContext = context != null ? context.getApplicationContext() : null;
            if (applicationContext instanceof android.app.Application) {
                application = (android.app.Application) applicationContext;
                application2 = application != null ? application : null;
                if (application2 != null) {
                    linkedHashMap.put(defpackage.ym1.F7NU4MC0GW, application2);
                }
                return uk0Var;
            }
        }
        application = null;
        if (application != null) {
        }
        if (application2 != null) {
        }
        return uk0Var;
    }
}
