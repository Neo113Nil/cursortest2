package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.window.OnBackInvokedDispatcher;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class i10 implements to {
    public final Object MdtA4re8;
    public final /* synthetic */ int NCTxEWno;

    public /* synthetic */ i10(int i, Object obj) {
        this.NCTxEWno = i;
        this.MdtA4re8 = obj;
    }

    @Override // defpackage.to
    public final void P7K7Inc8(vo voVar, oo ooVar) {
        int i;
        View view;
        int i2 = this.NCTxEWno;
        Object obj = this.MdtA4re8;
        Object obj2 = null;
        switch (i2) {
            case 0:
                s50 s50Var = (s50) obj;
                if (ooVar != oo.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                voVar.b2ZJblxo().P7K7Inc8(this);
                Bundle b2ZJblxo = s50Var.qoPGr6Ce().b2ZJblxo("androidx.savedstate.Restarter");
                if (b2ZJblxo == null) {
                    return;
                }
                ArrayList<String> stringArrayList = b2ZJblxo.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    m1.Ey6iv0m0("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                    return;
                }
                int size = stringArrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    String str = stringArrayList.get(i3);
                    i3++;
                    String str2 = str;
                    try {
                        Class<? extends U> asSubclass = Class.forName(str2, false, i10.class.getClassLoader()).asSubclass(o50.class);
                        asSubclass.getClass();
                        try {
                            Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object newInstance = declaredConstructor.newInstance(null);
                                newInstance.getClass();
                                if (!(s50Var instanceof vg0)) {
                                    throw new IllegalStateException(("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: " + s50Var).toString());
                                }
                                ug0 P7K7Inc8 = ((vg0) s50Var).P7K7Inc8();
                                mcXgUFR8 qoPGr6Ce = s50Var.qoPGr6Ce();
                                P7K7Inc8.getClass();
                                LinkedHashMap linkedHashMap = P7K7Inc8.qoPGr6Ce;
                                Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                while (it.hasNext()) {
                                    String str3 = (String) it.next();
                                    str3.getClass();
                                    ng0 ng0Var = (ng0) linkedHashMap.get(str3);
                                    if (ng0Var != null) {
                                        le0.wxUZMvaN(ng0Var, qoPGr6Ce, s50Var.b2ZJblxo());
                                    }
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    qoPGr6Ce.pRiPUEwG();
                                }
                            } catch (Exception e) {
                                m1.ow5vqvCr("Failed to instantiate ", str2, e);
                                return;
                            }
                        } catch (NoSuchMethodException e2) {
                            throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                        }
                    } catch (ClassNotFoundException e3) {
                        throw new RuntimeException(q70.P7K7Inc8("Class ", str2, " wasn't found"), e3);
                    }
                }
                return;
            case 1:
                if (ooVar != oo.ON_CREATE || Build.VERSION.SDK_INT < 33) {
                    return;
                }
                ax axVar = ((n7) obj).jb9XjC4I;
                OnBackInvokedDispatcher qoPGr6Ce2 = j7.qoPGr6Ce((n7) voVar);
                axVar.getClass();
                qoPGr6Ce2.getClass();
                axVar.VgvYg0wo = qoPGr6Ce2;
                axVar.MdtA4re8(axVar.b2ZJblxo);
                return;
            case 2:
                new HashMap();
                sl[] slVarArr = (sl[]) obj;
                if (slVarArr.length > 0) {
                    sl slVar = slVarArr[0];
                    throw null;
                }
                if (slVarArr.length <= 0) {
                    return;
                }
                sl slVar2 = slVarArr[0];
                throw null;
            case 3:
                rc rcVar = (rc) obj;
                int i4 = qc.qoPGr6Ce[ooVar.ordinal()];
                if (i4 == 1) {
                    nc ncVar = (nc) voVar;
                    Iterable iterable = (Iterable) rcVar.NCTxEWno().VgvYg0wo.NCTxEWno.Qr9iLBAD();
                    if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                        Iterator it2 = iterable.iterator();
                        while (it2.hasNext()) {
                            if (((ut) it2.next()).b2ZJblxo.equals(ncVar.DK9slbsy)) {
                                return;
                            }
                        }
                    }
                    ncVar.zCflySGU(false, false);
                    return;
                }
                if (i4 == 2) {
                    nc ncVar2 = (nc) voVar;
                    for (Object obj3 : (Iterable) rcVar.NCTxEWno().P7K7Inc8.NCTxEWno.Qr9iLBAD()) {
                        if (((ut) obj3).b2ZJblxo.equals(ncVar2.DK9slbsy)) {
                            obj2 = obj3;
                        }
                    }
                    ut utVar = (ut) obj2;
                    if (utVar != null) {
                        rcVar.NCTxEWno().MdtA4re8(utVar);
                        return;
                    }
                    return;
                }
                if (i4 != 3) {
                    if (i4 != 4) {
                        return;
                    }
                    nc ncVar3 = (nc) voVar;
                    for (Object obj4 : (Iterable) rcVar.NCTxEWno().P7K7Inc8.NCTxEWno.Qr9iLBAD()) {
                        if (((ut) obj4).b2ZJblxo.equals(ncVar3.DK9slbsy)) {
                            obj2 = obj4;
                        }
                    }
                    ut utVar2 = (ut) obj2;
                    if (utVar2 != null) {
                        rcVar.NCTxEWno().MdtA4re8(utVar2);
                    }
                    ncVar3.FXJmAAN1.P7K7Inc8(this);
                    return;
                }
                nc ncVar4 = (nc) voVar;
                o7 o7Var = ncVar4.QT4Tf9Dt;
                if (o7Var == null) {
                    m1.ygLcUYwZ(ncVar4, " does not have a Dialog.", "DialogFragment ");
                    return;
                }
                if (o7Var.isShowing()) {
                    return;
                }
                List list = (List) rcVar.NCTxEWno().VgvYg0wo.NCTxEWno.Qr9iLBAD();
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        i = -1;
                    } else if (((ut) listIterator.previous()).b2ZJblxo.equals(ncVar4.DK9slbsy)) {
                        i = listIterator.nextIndex();
                    }
                }
                ut utVar3 = (ut) x5.LfKQckgD(list, i);
                if (!fn.qoPGr6Ce(x5.hGvurcGl(list), utVar3)) {
                    Log.i("DialogFragmentNavigator", "Dialog " + ncVar4 + " was dismissed while it was not the top of the back stack, popping all dialogs above this dismissed dialog");
                }
                if (utVar3 != null) {
                    rcVar.ow5vqvCr(i, utVar3, false);
                    return;
                }
                return;
            case 4:
                if (ooVar != oo.ON_STOP || (view = ((li) obj).ytu5o6f4) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
                return;
            case 5:
                if (ooVar != oo.ON_CREATE) {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + ooVar).toString());
                }
                voVar.b2ZJblxo().P7K7Inc8(this);
                ((k50) obj).NCTxEWno();
                return;
            default:
                if (ooVar == oo.ON_DESTROY) {
                    ig0 ig0Var = (ig0) obj;
                    ig0Var.qoPGr6Ce = null;
                    ig0Var.NCTxEWno = null;
                    return;
                }
                return;
        }
    }
}
