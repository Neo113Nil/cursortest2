package defpackage;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class zw0 implements af1 {
    public final Application GWasM1elztuh;
    public final d OOA6hdeuvCS;
    public final Bundle X1lG3V04pd;
    public final ze1 Yi7zF1RB1;
    public final w90 xqGvceK5x;

    public zw0(Application application, yw0 yw0Var, Bundle bundle) {
        ze1 ze1Var;
        this.OOA6hdeuvCS = yw0Var.X1lG3V04pd();
        this.xqGvceK5x = yw0Var.AvO7iQsrTN();
        this.X1lG3V04pd = bundle;
        this.GWasM1elztuh = application;
        if (application != null) {
            if (ze1.X1lG3V04pd == null) {
                ze1.X1lG3V04pd = new ze1(application);
            }
            ze1Var = ze1.X1lG3V04pd;
            ze1Var.getClass();
        } else {
            ze1Var = new ze1(null);
        }
        this.Yi7zF1RB1 = ze1Var;
    }

    @Override // defpackage.af1
    public final we1 GWasM1elztuh(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return xqGvceK5x(cls, canonicalName);
        }
        o4.mE4lRynR("Local and anonymous classes can not be ViewModels");
        return null;
    }

    @Override // defpackage.af1
    public final we1 X1lG3V04pd(va vaVar, of0 of0Var) {
        Class cls = vaVar.GWasM1elztuh;
        cls.getClass();
        return Yi7zF1RB1(cls, of0Var);
    }

    @Override // defpackage.af1
    public final we1 Yi7zF1RB1(Class cls, of0 of0Var) {
        x51 x51Var = fb1.eUH21U3apd;
        LinkedHashMap linkedHashMap = of0Var.GWasM1elztuh;
        String str = (String) linkedHashMap.get(x51Var);
        if (str == null) {
            o4.jivtDDk9H("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
            return null;
        }
        if (linkedHashMap.get(fb1.EljAMC1QTz) == null || linkedHashMap.get(fb1.AvO7iQsrTN) == null) {
            if (this.xqGvceK5x != null) {
                return xqGvceK5x(cls, str);
            }
            o4.jivtDDk9H("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            return null;
        }
        Application application = (Application) linkedHashMap.get(ze1.xqGvceK5x);
        boolean isAssignableFrom = a2.class.isAssignableFrom(cls);
        Constructor GWasM1elztuh = (!isAssignableFrom || application == null) ? ax0.GWasM1elztuh(cls, ax0.Yi7zF1RB1) : ax0.GWasM1elztuh(cls, ax0.GWasM1elztuh);
        return GWasM1elztuh == null ? this.Yi7zF1RB1.Yi7zF1RB1(cls, of0Var) : (!isAssignableFrom || application == null) ? ax0.Yi7zF1RB1(cls, GWasM1elztuh, fb1.jivtDDk9H(of0Var)) : ax0.Yi7zF1RB1(cls, GWasM1elztuh, application, fb1.jivtDDk9H(of0Var));
    }

    public final we1 xqGvceK5x(Class cls, String str) {
        pw0 pw0Var;
        w90 w90Var = this.xqGvceK5x;
        if (w90Var == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean isAssignableFrom = a2.class.isAssignableFrom(cls);
        Application application = this.GWasM1elztuh;
        Constructor GWasM1elztuh = (!isAssignableFrom || application == null) ? ax0.GWasM1elztuh(cls, ax0.Yi7zF1RB1) : ax0.GWasM1elztuh(cls, ax0.GWasM1elztuh);
        if (GWasM1elztuh == null) {
            if (application != null) {
                return this.Yi7zF1RB1.GWasM1elztuh(cls);
            }
            if (bf1.GWasM1elztuh == null) {
                bf1.GWasM1elztuh = new bf1();
            }
            bf1.GWasM1elztuh.getClass();
            return n30.cilMamHF(cls);
        }
        d dVar = this.OOA6hdeuvCS;
        dVar.getClass();
        Bundle rQPn8YBR = dVar.rQPn8YBR(str);
        if (rQPn8YBR == null) {
            rQPn8YBR = this.X1lG3V04pd;
        }
        if (rQPn8YBR == null) {
            pw0Var = new pw0();
        } else {
            ClassLoader classLoader = pw0.class.getClassLoader();
            classLoader.getClass();
            rQPn8YBR.setClassLoader(classLoader);
            ic0 ic0Var = new ic0(rQPn8YBR.size());
            for (String str2 : rQPn8YBR.keySet()) {
                str2.getClass();
                ic0Var.put(str2, rQPn8YBR.get(str2));
            }
            pw0Var = new pw0(rc0.k8h8IjolWQ(ic0Var));
        }
        qw0 qw0Var = new qw0(str, pw0Var);
        qw0Var.xqGvceK5x(dVar, w90Var);
        m90 m90Var = w90Var.encWxUiV2;
        if (m90Var == m90.EljAMC1QTz || m90Var.compareTo(m90.encWxUiV2) >= 0) {
            dVar.Y6hRI1cF8();
        } else {
            w90Var.GWasM1elztuh(new ok(dVar, w90Var));
        }
        we1 Yi7zF1RB1 = (!isAssignableFrom || application == null) ? ax0.Yi7zF1RB1(cls, GWasM1elztuh, pw0Var) : ax0.Yi7zF1RB1(cls, GWasM1elztuh, application, pw0Var);
        Yi7zF1RB1.GWasM1elztuh("androidx.lifecycle.savedstate.vm.tag", qw0Var);
        return Yi7zF1RB1;
    }

    public zw0() {
        this.Yi7zF1RB1 = new ze1(null);
    }
}
