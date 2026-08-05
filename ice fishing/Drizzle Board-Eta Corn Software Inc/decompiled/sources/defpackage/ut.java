package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class ut implements vo, vg0, gm, s50 {
    public pu MdtA4re8;
    public final k0 NCTxEWno;
    public final hu P7K7Inc8;
    public final Bundle Qr9iLBAD;
    public po VgvYg0wo;
    public final String b2ZJblxo;
    public final wt jb9XjC4I = new wt(this);
    public final Bundle wxUZMvaN;

    public ut(k0 k0Var, pu puVar, Bundle bundle, po poVar, hu huVar, String str, Bundle bundle2) {
        this.NCTxEWno = k0Var;
        this.MdtA4re8 = puVar;
        this.wxUZMvaN = bundle;
        this.VgvYg0wo = poVar;
        this.P7K7Inc8 = huVar;
        this.b2ZJblxo = str;
        this.Qr9iLBAD = bundle2;
    }

    public final void NCTxEWno(po poVar) {
        wt wtVar = this.jb9XjC4I;
        wtVar.getClass();
        wtVar.k3x7lurq = poVar;
        wtVar.NCTxEWno();
    }

    @Override // defpackage.vg0
    public final ug0 P7K7Inc8() {
        wt wtVar = this.jb9XjC4I;
        if (!wtVar.jb9XjC4I) {
            m1.Ey6iv0m0("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
            return null;
        }
        if (wtVar.eVhOlqcC.MdtA4re8 == po.NCTxEWno) {
            m1.Ey6iv0m0("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
            return null;
        }
        hu huVar = wtVar.VgvYg0wo;
        if (huVar == null) {
            m1.Ey6iv0m0("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
            return null;
        }
        String str = wtVar.P7K7Inc8;
        LinkedHashMap linkedHashMap = huVar.NCTxEWno;
        ug0 ug0Var = (ug0) linkedHashMap.get(str);
        if (ug0Var != null) {
            return ug0Var;
        }
        ug0 ug0Var2 = new ug0();
        linkedHashMap.put(str, ug0Var2);
        return ug0Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    @Override // defpackage.gm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final mt VgvYg0wo() {
        Application application;
        Application application2;
        wt wtVar = this.jb9XjC4I;
        wtVar.getClass();
        mt mtVar = new mt(0);
        k00 k00Var = w30.b2ZJblxo;
        ut utVar = wtVar.qoPGr6Ce;
        LinkedHashMap linkedHashMap = mtVar.qoPGr6Ce;
        linkedHashMap.put(k00Var, utVar);
        linkedHashMap.put(w30.Qr9iLBAD, utVar);
        Bundle qoPGr6Ce = wtVar.qoPGr6Ce();
        if (qoPGr6Ce != null) {
            linkedHashMap.put(w30.jb9XjC4I, qoPGr6Ce);
        }
        k0 k0Var = this.NCTxEWno;
        if (k0Var != null) {
            Context applicationContext = k0Var.qoPGr6Ce.getApplicationContext();
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                application2 = application != null ? application : null;
                if (application2 != null) {
                    linkedHashMap.put(qg0.wxUZMvaN, application2);
                }
                return mtVar;
            }
        }
        application = null;
        if (application != null) {
        }
        if (application2 != null) {
        }
        return mtVar;
    }

    @Override // defpackage.vo
    public final xo b2ZJblxo() {
        return this.jb9XjC4I.eVhOlqcC;
    }

    public final boolean equals(Object obj) {
        Set<String> keySet;
        if (obj != null && (obj instanceof ut)) {
            ut utVar = (ut) obj;
            Bundle bundle = utVar.wxUZMvaN;
            if (!this.b2ZJblxo.equals(utVar.b2ZJblxo) || !fn.qoPGr6Ce(this.MdtA4re8, utVar.MdtA4re8) || this.jb9XjC4I.eVhOlqcC != utVar.jb9XjC4I.eVhOlqcC || qoPGr6Ce() != utVar.qoPGr6Ce()) {
                return false;
            }
            Bundle bundle2 = this.wxUZMvaN;
            if (fn.qoPGr6Ce(bundle2, bundle)) {
                return true;
            }
            if (bundle2 != null && (keySet = bundle2.keySet()) != null) {
                if (keySet.isEmpty()) {
                    return true;
                }
                for (String str : keySet) {
                    if (!fn.qoPGr6Ce(bundle2.get(str), bundle != null ? bundle.get(str) : null)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Set<String> keySet;
        int hashCode = this.MdtA4re8.hashCode() + (this.b2ZJblxo.hashCode() * 31);
        Bundle bundle = this.wxUZMvaN;
        if (bundle != null && (keySet = bundle.keySet()) != null) {
            Iterator<T> it = keySet.iterator();
            while (it.hasNext()) {
                int i = hashCode * 31;
                Object obj = bundle.get((String) it.next());
                hashCode = i + (obj != null ? obj.hashCode() : 0);
            }
        }
        return qoPGr6Ce().hashCode() + ((this.jb9XjC4I.eVhOlqcC.hashCode() + (hashCode * 31)) * 31);
    }

    @Override // defpackage.s50
    public final mcXgUFR8 qoPGr6Ce() {
        return (mcXgUFR8) this.jb9XjC4I.Qr9iLBAD.NCTxEWno;
    }

    public final String toString() {
        return this.jb9XjC4I.toString();
    }

    @Override // defpackage.gm
    public final rg0 wxUZMvaN() {
        return this.jb9XjC4I.ow5vqvCr;
    }
}
