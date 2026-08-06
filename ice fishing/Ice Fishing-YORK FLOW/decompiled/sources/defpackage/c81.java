package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class c81 implements defpackage.mu1 {
    public final defpackage.zg0 JhCgjQRTAOCT;
    public final defpackage.n80 WDYagTQQm9ns;
    public final android.app.Application ZpBGe2uQfcn8;
    public final android.os.Bundle fWTAfUmVKrZq;
    public final defpackage.lu1 giKS3J6vZuNy;

    public c81(android.app.Application application, defpackage.b81 b81Var, android.os.Bundle bundle) {
        defpackage.lu1 lu1Var;
        this.WDYagTQQm9ns = b81Var.fWTAfUmVKrZq();
        this.JhCgjQRTAOCT = b81Var.QiMR8OkAhezm();
        this.fWTAfUmVKrZq = bundle;
        this.ZpBGe2uQfcn8 = application;
        if (application != null) {
            if (defpackage.lu1.fWTAfUmVKrZq == null) {
                defpackage.lu1.fWTAfUmVKrZq = new defpackage.lu1(application);
            }
            lu1Var = defpackage.lu1.fWTAfUmVKrZq;
            lu1Var.getClass();
        } else {
            lu1Var = new defpackage.lu1(null);
        }
        this.giKS3J6vZuNy = lu1Var;
    }

    public final defpackage.iu1 JhCgjQRTAOCT(java.lang.String str, java.lang.Class cls) {
        defpackage.s71 s71Var;
        defpackage.zg0 zg0Var = this.JhCgjQRTAOCT;
        if (zg0Var == null) {
            throw new java.lang.UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean isAssignableFrom = defpackage.t4.class.isAssignableFrom(cls);
        android.app.Application application = this.ZpBGe2uQfcn8;
        java.lang.reflect.Constructor ZpBGe2uQfcn8 = (!isAssignableFrom || application == null) ? defpackage.d81.ZpBGe2uQfcn8(cls, defpackage.d81.giKS3J6vZuNy) : defpackage.d81.ZpBGe2uQfcn8(cls, defpackage.d81.ZpBGe2uQfcn8);
        if (ZpBGe2uQfcn8 == null) {
            if (application != null) {
                return this.giKS3J6vZuNy.ZpBGe2uQfcn8(cls);
            }
            if (defpackage.nu1.ZpBGe2uQfcn8 == null) {
                defpackage.nu1.ZpBGe2uQfcn8 = new defpackage.nu1();
            }
            defpackage.nu1.ZpBGe2uQfcn8.getClass();
            return defpackage.m90.s0TASMVLSWD5(cls);
        }
        defpackage.n80 n80Var = this.WDYagTQQm9ns;
        n80Var.getClass();
        android.os.Bundle gUjdnLbkVAaA = n80Var.gUjdnLbkVAaA(str);
        if (gUjdnLbkVAaA == null) {
            gUjdnLbkVAaA = this.fWTAfUmVKrZq;
        }
        if (gUjdnLbkVAaA == null) {
            s71Var = new defpackage.s71();
        } else {
            java.lang.ClassLoader classLoader = defpackage.s71.class.getClassLoader();
            classLoader.getClass();
            gUjdnLbkVAaA.setClassLoader(classLoader);
            defpackage.ck0 ck0Var = new defpackage.ck0(gUjdnLbkVAaA.size());
            for (java.lang.String str2 : gUjdnLbkVAaA.keySet()) {
                str2.getClass();
                ck0Var.put(str2, gUjdnLbkVAaA.get(str2));
            }
            s71Var = new defpackage.s71(ck0Var.giKS3J6vZuNy());
        }
        defpackage.t71 t71Var = new defpackage.t71(str, s71Var);
        t71Var.Ns0WNyEWdPsk(n80Var, zg0Var);
        defpackage.pg0 pg0Var = zg0Var.P05cfTpS5W5L;
        if (pg0Var == defpackage.pg0.oh71FJcDz6S2 || pg0Var.compareTo(defpackage.pg0.P05cfTpS5W5L) >= 0) {
            n80Var.UmgHb6n58gfG();
        } else {
            zg0Var.ZpBGe2uQfcn8(new defpackage.io(n80Var, zg0Var));
        }
        defpackage.iu1 giKS3J6vZuNy = (!isAssignableFrom || application == null) ? defpackage.d81.giKS3J6vZuNy(cls, ZpBGe2uQfcn8, s71Var) : defpackage.d81.giKS3J6vZuNy(cls, ZpBGe2uQfcn8, application, s71Var);
        giKS3J6vZuNy.ZpBGe2uQfcn8("androidx.lifecycle.savedstate.vm.tag", t71Var);
        return giKS3J6vZuNy;
    }

    @Override // defpackage.mu1
    public final defpackage.iu1 ZpBGe2uQfcn8(java.lang.Class cls) {
        java.lang.String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return JhCgjQRTAOCT(canonicalName, cls);
        }
        defpackage.h7.w7APNrr0aGRc("Local and anonymous classes can not be ViewModels");
        return null;
    }

    @Override // defpackage.mu1
    public final defpackage.iu1 fWTAfUmVKrZq(defpackage.ne neVar, defpackage.dn0 dn0Var) {
        java.lang.Class cls = neVar.ZpBGe2uQfcn8;
        cls.getClass();
        return giKS3J6vZuNy(cls, dn0Var);
    }

    @Override // defpackage.mu1
    public final defpackage.iu1 giKS3J6vZuNy(java.lang.Class cls, defpackage.dn0 dn0Var) {
        defpackage.l21 l21Var = defpackage.ma0.pf0OXpZQoaz3;
        java.util.LinkedHashMap linkedHashMap = dn0Var.ZpBGe2uQfcn8;
        java.lang.String str = (java.lang.String) linkedHashMap.get(l21Var);
        if (str == null) {
            defpackage.h7.P05cfTpS5W5L("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
            return null;
        }
        if (linkedHashMap.get(defpackage.ok0.P05cfTpS5W5L) == null || linkedHashMap.get(defpackage.ok0.e6mdH7fiFuta) == null) {
            if (this.JhCgjQRTAOCT != null) {
                return JhCgjQRTAOCT(str, cls);
            }
            defpackage.h7.P05cfTpS5W5L("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            return null;
        }
        android.app.Application application = (android.app.Application) linkedHashMap.get(defpackage.lu1.JhCgjQRTAOCT);
        boolean isAssignableFrom = defpackage.t4.class.isAssignableFrom(cls);
        java.lang.reflect.Constructor ZpBGe2uQfcn8 = (!isAssignableFrom || application == null) ? defpackage.d81.ZpBGe2uQfcn8(cls, defpackage.d81.giKS3J6vZuNy) : defpackage.d81.ZpBGe2uQfcn8(cls, defpackage.d81.ZpBGe2uQfcn8);
        return ZpBGe2uQfcn8 == null ? this.giKS3J6vZuNy.giKS3J6vZuNy(cls, dn0Var) : (!isAssignableFrom || application == null) ? defpackage.d81.giKS3J6vZuNy(cls, ZpBGe2uQfcn8, defpackage.ok0.VFeft99leXEK(dn0Var)) : defpackage.d81.giKS3J6vZuNy(cls, ZpBGe2uQfcn8, application, defpackage.ok0.VFeft99leXEK(dn0Var));
    }

    public c81() {
        this.giKS3J6vZuNy = new defpackage.lu1(null);
    }
}
