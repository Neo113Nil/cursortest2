package defpackage;

/* loaded from: classes.dex */
public final class j41 implements defpackage.zm1 {
    public final defpackage.xd0 F7NU4MC0GW;
    public final android.app.Application IHQe1A4L2xu;
    public final defpackage.F7NU4MC0GW adDC3e2L;
    public final defpackage.ym1 oh6vYeIP;
    public final android.os.Bundle r1MBDhnF;

    public j41(android.app.Application application, com.corsair.ledger.MainActivity mainActivity, android.os.Bundle bundle) {
        defpackage.ym1 ym1Var;
        this.adDC3e2L = (defpackage.F7NU4MC0GW) mainActivity.EXtogiMhuM.AARZUJiTa;
        this.F7NU4MC0GW = mainActivity.adDC3e2L;
        this.r1MBDhnF = bundle;
        this.IHQe1A4L2xu = application;
        if (application != null) {
            if (defpackage.ym1.r1MBDhnF == null) {
                defpackage.ym1.r1MBDhnF = new defpackage.ym1(application);
            }
            ym1Var = defpackage.ym1.r1MBDhnF;
            ym1Var.getClass();
        } else {
            ym1Var = new defpackage.ym1(null);
        }
        this.oh6vYeIP = ym1Var;
    }

    public final defpackage.vm1 F7NU4MC0GW(java.lang.Class cls, java.lang.String str) {
        defpackage.y31 y31Var;
        defpackage.xd0 xd0Var = this.F7NU4MC0GW;
        if (xd0Var == null) {
            throw new java.lang.UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean isAssignableFrom = defpackage.q3.class.isAssignableFrom(cls);
        android.app.Application application = this.IHQe1A4L2xu;
        java.lang.reflect.Constructor IHQe1A4L2xu = (!isAssignableFrom || application == null) ? defpackage.k41.IHQe1A4L2xu(cls, defpackage.k41.oh6vYeIP) : defpackage.k41.IHQe1A4L2xu(cls, defpackage.k41.IHQe1A4L2xu);
        if (IHQe1A4L2xu == null) {
            if (application != null) {
                return this.oh6vYeIP.IHQe1A4L2xu(cls);
            }
            if (defpackage.an1.IHQe1A4L2xu == null) {
                defpackage.an1.IHQe1A4L2xu = new defpackage.an1();
            }
            defpackage.an1.IHQe1A4L2xu.getClass();
            return defpackage.f70.SH1y5HwkJhh(cls);
        }
        defpackage.F7NU4MC0GW f7nu4mc0gw = this.adDC3e2L;
        f7nu4mc0gw.getClass();
        android.os.Bundle cnag84Bm = f7nu4mc0gw.cnag84Bm(str);
        if (cnag84Bm == null) {
            cnag84Bm = this.r1MBDhnF;
        }
        if (cnag84Bm == null) {
            y31Var = new defpackage.y31();
        } else {
            java.lang.ClassLoader classLoader = defpackage.y31.class.getClassLoader();
            classLoader.getClass();
            cnag84Bm.setClassLoader(classLoader);
            defpackage.rg0 rg0Var = new defpackage.rg0(cnag84Bm.size());
            for (java.lang.String str2 : cnag84Bm.keySet()) {
                str2.getClass();
                rg0Var.put(str2, cnag84Bm.get(str2));
            }
            y31Var = new defpackage.y31(rg0Var.oh6vYeIP());
        }
        defpackage.z31 z31Var = new defpackage.z31(str, y31Var);
        z31Var.ez2rX8ReCYw(f7nu4mc0gw, xd0Var);
        defpackage.nd0 nd0Var = xd0Var.EXtogiMhuM;
        if (nd0Var == defpackage.nd0.xiZrDbcSW0 || nd0Var.compareTo(defpackage.nd0.EXtogiMhuM) >= 0) {
            f7nu4mc0gw.C0U8sNJm();
        } else {
            xd0Var.IHQe1A4L2xu(new defpackage.an(f7nu4mc0gw, xd0Var));
        }
        defpackage.vm1 oh6vYeIP = (!isAssignableFrom || application == null) ? defpackage.k41.oh6vYeIP(cls, IHQe1A4L2xu, y31Var) : defpackage.k41.oh6vYeIP(cls, IHQe1A4L2xu, application, y31Var);
        oh6vYeIP.IHQe1A4L2xu("androidx.lifecycle.savedstate.vm.tag", z31Var);
        return oh6vYeIP;
    }

    @Override // defpackage.zm1
    public final defpackage.vm1 IHQe1A4L2xu(java.lang.Class cls) {
        java.lang.String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return F7NU4MC0GW(cls, canonicalName);
        }
        defpackage.db.fnWB2E7cs("Local and anonymous classes can not be ViewModels");
        return null;
    }

    @Override // defpackage.zm1
    public final defpackage.vm1 oh6vYeIP(java.lang.Class cls, defpackage.uk0 uk0Var) {
        defpackage.c41 c41Var = defpackage.fm.EoOhNTTfIN7K;
        java.util.LinkedHashMap linkedHashMap = uk0Var.IHQe1A4L2xu;
        java.lang.String str = (java.lang.String) linkedHashMap.get(c41Var);
        if (str == null) {
            defpackage.db.AARZUJiTa("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
            return null;
        }
        if (linkedHashMap.get(defpackage.w70.XZx205DYe) == null || linkedHashMap.get(defpackage.w70.mAr5m2L7gYDP) == null) {
            if (this.F7NU4MC0GW != null) {
                return F7NU4MC0GW(cls, str);
            }
            defpackage.db.AARZUJiTa("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            return null;
        }
        android.app.Application application = (android.app.Application) linkedHashMap.get(defpackage.ym1.F7NU4MC0GW);
        boolean isAssignableFrom = defpackage.q3.class.isAssignableFrom(cls);
        java.lang.reflect.Constructor IHQe1A4L2xu = (!isAssignableFrom || application == null) ? defpackage.k41.IHQe1A4L2xu(cls, defpackage.k41.oh6vYeIP) : defpackage.k41.IHQe1A4L2xu(cls, defpackage.k41.IHQe1A4L2xu);
        return IHQe1A4L2xu == null ? this.oh6vYeIP.oh6vYeIP(cls, uk0Var) : (!isAssignableFrom || application == null) ? defpackage.k41.oh6vYeIP(cls, IHQe1A4L2xu, defpackage.w70.kd6TUFXn(uk0Var)) : defpackage.k41.oh6vYeIP(cls, IHQe1A4L2xu, application, defpackage.w70.kd6TUFXn(uk0Var));
    }

    @Override // defpackage.zm1
    public final defpackage.vm1 r1MBDhnF(defpackage.xc xcVar, defpackage.uk0 uk0Var) {
        return oh6vYeIP(defpackage.a70.QoRHpC4k(xcVar), uk0Var);
    }

    public j41() {
        this.oh6vYeIP = new defpackage.ym1(null);
    }
}
