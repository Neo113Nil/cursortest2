package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class fh0 implements t90, ff1, hz, yw0 {
    public final Bundle AvO7iQsrTN;
    public final hh0 E7jCp8Ls = new hh0(this);
    public xh0 EljAMC1QTz;
    public final String JFJ3QoxA;
    public final kp OOA6hdeuvCS;
    public m90 encWxUiV2;
    public final qh0 mOu10nynGul;
    public final Bundle rQPn8YBR;

    public fh0(kp kpVar, xh0 xh0Var, Bundle bundle, m90 m90Var, qh0 qh0Var, String str, Bundle bundle2) {
        this.OOA6hdeuvCS = kpVar;
        this.EljAMC1QTz = xh0Var;
        this.AvO7iQsrTN = bundle;
        this.encWxUiV2 = m90Var;
        this.mOu10nynGul = qh0Var;
        this.JFJ3QoxA = str;
        this.rQPn8YBR = bundle2;
        new m71(new o1(4, this));
    }

    @Override // defpackage.t90
    public final w90 AvO7iQsrTN() {
        return this.E7jCp8Ls.JFJ3QoxA;
    }

    public final void GWasM1elztuh(m90 m90Var) {
        hh0 hh0Var = this.E7jCp8Ls;
        hh0Var.getClass();
        hh0Var.rQPn8YBR = m90Var;
        hh0Var.Yi7zF1RB1();
    }

    @Override // defpackage.ff1
    public final ef1 OOA6hdeuvCS() {
        hh0 hh0Var = this.E7jCp8Ls;
        if (!hh0Var.mOu10nynGul) {
            o4.jivtDDk9H("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
            return null;
        }
        if (hh0Var.JFJ3QoxA.encWxUiV2 == m90.OOA6hdeuvCS) {
            o4.jivtDDk9H("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
            return null;
        }
        qh0 qh0Var = hh0Var.OOA6hdeuvCS;
        if (qh0Var == null) {
            o4.jivtDDk9H("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
            return null;
        }
        String str = hh0Var.EljAMC1QTz;
        str.getClass();
        LinkedHashMap linkedHashMap = qh0Var.Yi7zF1RB1;
        ef1 ef1Var = (ef1) linkedHashMap.get(str);
        if (ef1Var != null) {
            return ef1Var;
        }
        ef1 ef1Var2 = new ef1();
        linkedHashMap.put(str, ef1Var2);
        return ef1Var2;
    }

    @Override // defpackage.yw0
    public final d X1lG3V04pd() {
        return (d) this.E7jCp8Ls.encWxUiV2.AvO7iQsrTN;
    }

    public final boolean equals(Object obj) {
        Set<String> keySet;
        if (obj != null && (obj instanceof fh0)) {
            fh0 fh0Var = (fh0) obj;
            Bundle bundle = fh0Var.AvO7iQsrTN;
            if (o30.rQPn8YBR(this.JFJ3QoxA, fh0Var.JFJ3QoxA) && o30.rQPn8YBR(this.EljAMC1QTz, fh0Var.EljAMC1QTz) && o30.rQPn8YBR(this.E7jCp8Ls.JFJ3QoxA, fh0Var.E7jCp8Ls.JFJ3QoxA) && o30.rQPn8YBR(X1lG3V04pd(), fh0Var.X1lG3V04pd())) {
                Bundle bundle2 = this.AvO7iQsrTN;
                if (o30.rQPn8YBR(bundle2, bundle)) {
                    return true;
                }
                if (bundle2 != null && (keySet = bundle2.keySet()) != null) {
                    Set<String> set = keySet;
                    if ((set instanceof Collection) && set.isEmpty()) {
                        return true;
                    }
                    for (String str : set) {
                        if (!o30.rQPn8YBR(bundle2.get(str), bundle != null ? bundle.get(str) : null)) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Set<String> keySet;
        int hashCode = this.EljAMC1QTz.hashCode() + (this.JFJ3QoxA.hashCode() * 31);
        Bundle bundle = this.AvO7iQsrTN;
        if (bundle != null && (keySet = bundle.keySet()) != null) {
            Iterator<T> it = keySet.iterator();
            while (it.hasNext()) {
                int i = hashCode * 31;
                Object obj = bundle.get((String) it.next());
                hashCode = i + (obj != null ? obj.hashCode() : 0);
            }
        }
        return X1lG3V04pd().hashCode() + ((this.E7jCp8Ls.JFJ3QoxA.hashCode() + (hashCode * 31)) * 31);
    }

    public final String toString() {
        return this.E7jCp8Ls.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    @Override // defpackage.hz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final of0 xqGvceK5x() {
        Application application;
        Application application2;
        hh0 hh0Var = this.E7jCp8Ls;
        hh0Var.getClass();
        of0 of0Var = new of0();
        vt vtVar = fb1.EljAMC1QTz;
        fh0 fh0Var = hh0Var.GWasM1elztuh;
        LinkedHashMap linkedHashMap = of0Var.GWasM1elztuh;
        linkedHashMap.put(vtVar, fh0Var);
        linkedHashMap.put(fb1.AvO7iQsrTN, fh0Var);
        Bundle GWasM1elztuh = hh0Var.GWasM1elztuh();
        if (GWasM1elztuh != null) {
            linkedHashMap.put(fb1.encWxUiV2, GWasM1elztuh);
        }
        kp kpVar = this.OOA6hdeuvCS;
        if (kpVar != null) {
            Context context = kpVar.GWasM1elztuh;
            Context applicationContext = context != null ? context.getApplicationContext() : null;
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                application2 = application != null ? application : null;
                if (application2 != null) {
                    linkedHashMap.put(ze1.xqGvceK5x, application2);
                }
                return of0Var;
            }
        }
        application = null;
        if (application != null) {
        }
        if (application2 != null) {
        }
        return of0Var;
    }
}
