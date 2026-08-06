package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class xo0 implements defpackage.wg0, defpackage.ru1, defpackage.y40, defpackage.b81 {
    public final java.lang.String GE9mJIPrb8gP;
    public final android.os.Bundle Ns0WNyEWdPsk;
    public defpackage.pg0 P05cfTpS5W5L;
    public final android.os.Bundle QiMR8OkAhezm;
    public final defpackage.r1 WDYagTQQm9ns;
    public final defpackage.fp0 e6mdH7fiFuta;
    public final defpackage.zo0 fNwYGHIYeJcR = new defpackage.zo0(this);
    public defpackage.np0 oh71FJcDz6S2;

    public xo0(defpackage.r1 r1Var, defpackage.np0 np0Var, android.os.Bundle bundle, defpackage.pg0 pg0Var, defpackage.fp0 fp0Var, java.lang.String str, android.os.Bundle bundle2) {
        this.WDYagTQQm9ns = r1Var;
        this.oh71FJcDz6S2 = np0Var;
        this.QiMR8OkAhezm = bundle;
        this.P05cfTpS5W5L = pg0Var;
        this.e6mdH7fiFuta = fp0Var;
        this.GE9mJIPrb8gP = str;
        this.Ns0WNyEWdPsk = bundle2;
        new defpackage.ti1(new defpackage.l3(17, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    @Override // defpackage.y40
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final defpackage.dn0 JhCgjQRTAOCT() {
        android.app.Application application;
        android.app.Application application2;
        defpackage.zo0 zo0Var = this.fNwYGHIYeJcR;
        zo0Var.getClass();
        defpackage.dn0 dn0Var = new defpackage.dn0();
        defpackage.l21 l21Var = defpackage.ok0.P05cfTpS5W5L;
        defpackage.xo0 xo0Var = zo0Var.ZpBGe2uQfcn8;
        java.util.LinkedHashMap linkedHashMap = dn0Var.ZpBGe2uQfcn8;
        linkedHashMap.put(l21Var, xo0Var);
        linkedHashMap.put(defpackage.ok0.e6mdH7fiFuta, xo0Var);
        android.os.Bundle ZpBGe2uQfcn8 = zo0Var.ZpBGe2uQfcn8();
        if (ZpBGe2uQfcn8 != null) {
            linkedHashMap.put(defpackage.ok0.GE9mJIPrb8gP, ZpBGe2uQfcn8);
        }
        defpackage.r1 r1Var = this.WDYagTQQm9ns;
        if (r1Var != null) {
            android.content.Context context = r1Var.ZpBGe2uQfcn8;
            android.content.Context applicationContext = context != null ? context.getApplicationContext() : null;
            if (applicationContext instanceof android.app.Application) {
                application = (android.app.Application) applicationContext;
                application2 = application != null ? application : null;
                if (application2 != null) {
                    linkedHashMap.put(defpackage.lu1.JhCgjQRTAOCT, application2);
                }
                return dn0Var;
            }
        }
        application = null;
        if (application != null) {
        }
        if (application2 != null) {
        }
        return dn0Var;
    }

    @Override // defpackage.wg0
    public final defpackage.zg0 QiMR8OkAhezm() {
        return this.fNwYGHIYeJcR.GE9mJIPrb8gP;
    }

    @Override // defpackage.ru1
    public final defpackage.qu1 WDYagTQQm9ns() {
        defpackage.zo0 zo0Var = this.fNwYGHIYeJcR;
        if (!zo0Var.e6mdH7fiFuta) {
            defpackage.h7.P05cfTpS5W5L("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
            return null;
        }
        if (zo0Var.GE9mJIPrb8gP.P05cfTpS5W5L == defpackage.pg0.WDYagTQQm9ns) {
            defpackage.h7.P05cfTpS5W5L("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
            return null;
        }
        defpackage.fp0 fp0Var = zo0Var.WDYagTQQm9ns;
        if (fp0Var == null) {
            defpackage.h7.P05cfTpS5W5L("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
            return null;
        }
        java.lang.String str = zo0Var.oh71FJcDz6S2;
        str.getClass();
        java.util.LinkedHashMap linkedHashMap = fp0Var.giKS3J6vZuNy;
        defpackage.qu1 qu1Var = (defpackage.qu1) linkedHashMap.get(str);
        if (qu1Var != null) {
            return qu1Var;
        }
        defpackage.qu1 qu1Var2 = new defpackage.qu1();
        linkedHashMap.put(str, qu1Var2);
        return qu1Var2;
    }

    public final void ZpBGe2uQfcn8(defpackage.pg0 pg0Var) {
        defpackage.zo0 zo0Var = this.fNwYGHIYeJcR;
        zo0Var.getClass();
        zo0Var.Ns0WNyEWdPsk = pg0Var;
        zo0Var.giKS3J6vZuNy();
    }

    public final boolean equals(java.lang.Object obj) {
        java.util.Set<java.lang.String> keySet;
        if (obj != null && (obj instanceof defpackage.xo0)) {
            defpackage.xo0 xo0Var = (defpackage.xo0) obj;
            android.os.Bundle bundle = xo0Var.QiMR8OkAhezm;
            if (defpackage.ma0.QiMR8OkAhezm(this.GE9mJIPrb8gP, xo0Var.GE9mJIPrb8gP) && defpackage.ma0.QiMR8OkAhezm(this.oh71FJcDz6S2, xo0Var.oh71FJcDz6S2) && defpackage.ma0.QiMR8OkAhezm(this.fNwYGHIYeJcR.GE9mJIPrb8gP, xo0Var.fNwYGHIYeJcR.GE9mJIPrb8gP) && defpackage.ma0.QiMR8OkAhezm(fWTAfUmVKrZq(), xo0Var.fWTAfUmVKrZq())) {
                android.os.Bundle bundle2 = this.QiMR8OkAhezm;
                if (defpackage.ma0.QiMR8OkAhezm(bundle2, bundle)) {
                    return true;
                }
                if (bundle2 != null && (keySet = bundle2.keySet()) != null) {
                    java.util.Set<java.lang.String> set = keySet;
                    if ((set instanceof java.util.Collection) && set.isEmpty()) {
                        return true;
                    }
                    for (java.lang.String str : set) {
                        if (!defpackage.ma0.QiMR8OkAhezm(bundle2.get(str), bundle != null ? bundle.get(str) : null)) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.b81
    public final defpackage.n80 fWTAfUmVKrZq() {
        return (defpackage.n80) this.fNwYGHIYeJcR.P05cfTpS5W5L.QiMR8OkAhezm;
    }

    public final int hashCode() {
        java.util.Set<java.lang.String> keySet;
        int hashCode = this.oh71FJcDz6S2.hashCode() + (this.GE9mJIPrb8gP.hashCode() * 31);
        android.os.Bundle bundle = this.QiMR8OkAhezm;
        if (bundle != null && (keySet = bundle.keySet()) != null) {
            java.util.Iterator<T> it = keySet.iterator();
            while (it.hasNext()) {
                int i = hashCode * 31;
                java.lang.Object obj = bundle.get((java.lang.String) it.next());
                hashCode = i + (obj != null ? obj.hashCode() : 0);
            }
        }
        return fWTAfUmVKrZq().hashCode() + ((this.fNwYGHIYeJcR.GE9mJIPrb8gP.hashCode() + (hashCode * 31)) * 31);
    }

    public final java.lang.String toString() {
        return this.fNwYGHIYeJcR.toString();
    }
}
