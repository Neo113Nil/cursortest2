package defpackage;

import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class kh0 {
    public final ej0 AvO7iQsrTN;
    public final ys0 EljAMC1QTz;
    public final x51 GWasM1elztuh;
    public final ys0 OOA6hdeuvCS;
    public final p51 X1lG3V04pd;
    public final p51 Yi7zF1RB1;
    public final /* synthetic */ hi0 encWxUiV2;
    public boolean xqGvceK5x;

    public kh0(hi0 hi0Var, ej0 ej0Var) {
        ej0Var.getClass();
        this.encWxUiV2 = hi0Var;
        this.GWasM1elztuh = new x51(3);
        p51 EljAMC1QTz = vc0.EljAMC1QTz(xp.OOA6hdeuvCS);
        this.Yi7zF1RB1 = EljAMC1QTz;
        p51 EljAMC1QTz2 = vc0.EljAMC1QTz(bq.OOA6hdeuvCS);
        this.X1lG3V04pd = EljAMC1QTz2;
        this.OOA6hdeuvCS = new ys0(EljAMC1QTz);
        this.EljAMC1QTz = new ys0(EljAMC1QTz2);
        this.AvO7iQsrTN = ej0Var;
    }

    public final void EljAMC1QTz(fh0 fh0Var) {
        fh0Var.getClass();
        ph0 ph0Var = this.encWxUiV2.Yi7zF1RB1;
        ph0Var.getClass();
        ej0 Yi7zF1RB1 = ph0Var.mE4lRynR.Yi7zF1RB1(fh0Var.EljAMC1QTz.OOA6hdeuvCS);
        if (!Yi7zF1RB1.equals(this.AvO7iQsrTN)) {
            Object obj = ph0Var.jivtDDk9H.get(Yi7zF1RB1);
            if (obj != null) {
                ((kh0) obj).EljAMC1QTz(fh0Var);
                return;
            } else {
                o4.encWxUiV2("NavigatorBackStack for ", fh0Var.EljAMC1QTz.OOA6hdeuvCS, " should already be created");
                return;
            }
        }
        hv hvVar = ph0Var.Y6hRI1cF8;
        if (hvVar != null) {
            hvVar.mOu10nynGul(fh0Var);
            GWasM1elztuh(fh0Var);
        } else {
            Log.i("NavController", "Ignoring add of destination " + fh0Var.EljAMC1QTz + " outside of the call to navigate(). ");
        }
    }

    public final void GWasM1elztuh(fh0 fh0Var) {
        fh0Var.getClass();
        synchronized (this.GWasM1elztuh) {
            p51 p51Var = this.Yi7zF1RB1;
            p51Var.JFJ3QoxA(null, rb.gHe2tSmr6w((Collection) p51Var.getValue(), fh0Var));
        }
    }

    public final void OOA6hdeuvCS(fh0 fh0Var, boolean z) {
        Object obj;
        fh0Var.getClass();
        p51 p51Var = this.X1lG3V04pd;
        Iterable iterable = (Iterable) p51Var.getValue();
        boolean z2 = iterable instanceof Collection;
        ys0 ys0Var = this.OOA6hdeuvCS;
        if (!z2 || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((fh0) it.next()) == fh0Var) {
                    Iterable iterable2 = (Iterable) ys0Var.OOA6hdeuvCS.getValue();
                    if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
                        return;
                    }
                    Iterator it2 = iterable2.iterator();
                    while (it2.hasNext()) {
                        if (((fh0) it2.next()) == fh0Var) {
                        }
                    }
                    return;
                }
            }
        }
        p51Var.JFJ3QoxA(null, a11.DmJncFq5((Set) p51Var.getValue(), fh0Var));
        p51 p51Var2 = ys0Var.OOA6hdeuvCS;
        p51 p51Var3 = ys0Var.OOA6hdeuvCS;
        List list = (List) p51Var2.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            fh0 fh0Var2 = (fh0) obj;
            if (!o30.rQPn8YBR(fh0Var2, fh0Var) && ((List) p51Var3.getValue()).lastIndexOf(fh0Var2) < ((List) p51Var3.getValue()).lastIndexOf(fh0Var)) {
                break;
            }
        }
        fh0 fh0Var3 = (fh0) obj;
        if (fh0Var3 != null) {
            p51Var.JFJ3QoxA(null, a11.DmJncFq5((Set) p51Var.getValue(), fh0Var3));
        }
        xqGvceK5x(fh0Var, z);
    }

    public final void X1lG3V04pd(fh0 fh0Var) {
        qh0 qh0Var;
        fh0Var.getClass();
        ph0 ph0Var = this.encWxUiV2.Yi7zF1RB1;
        p51 p51Var = ph0Var.encWxUiV2;
        String str = fh0Var.JFJ3QoxA;
        LinkedHashMap linkedHashMap = ph0Var.lv06NcmrQ;
        boolean rQPn8YBR = o30.rQPn8YBR(linkedHashMap.get(fh0Var), Boolean.TRUE);
        p51 p51Var2 = this.X1lG3V04pd;
        Set set = (Set) p51Var2.getValue();
        set.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet(rc0.EXrPz3p7hFb(set.size()));
        boolean z = false;
        for (Object obj : set) {
            boolean z2 = true;
            if (!z && o30.rQPn8YBR(obj, fh0Var)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                linkedHashSet.add(obj);
            }
        }
        p51Var2.JFJ3QoxA(null, linkedHashSet);
        linkedHashMap.remove(fh0Var);
        v4 v4Var = ph0Var.EljAMC1QTz;
        if (v4Var.contains(fh0Var)) {
            if (this.xqGvceK5x) {
                return;
            }
            ph0Var.mE4lRynR();
            p51 p51Var3 = ph0Var.AvO7iQsrTN;
            ArrayList arrayList = new ArrayList(v4Var);
            p51Var3.getClass();
            p51Var3.JFJ3QoxA(null, arrayList);
            ArrayList WIEu4Ya2g8 = ph0Var.WIEu4Ya2g8();
            p51Var.getClass();
            p51Var.JFJ3QoxA(null, WIEu4Ya2g8);
            return;
        }
        ph0Var.Mjvvu5DE(fh0Var);
        if (fh0Var.E7jCp8Ls.JFJ3QoxA.encWxUiV2.compareTo(m90.AvO7iQsrTN) >= 0) {
            fh0Var.GWasM1elztuh(m90.OOA6hdeuvCS);
        }
        if (!v4Var.isEmpty()) {
            Iterator it = v4Var.iterator();
            while (it.hasNext()) {
                if (o30.rQPn8YBR(((fh0) it.next()).JFJ3QoxA, str)) {
                    break;
                }
            }
        }
        if (!rQPn8YBR && (qh0Var = ph0Var.iwATDS1i01k) != null) {
            str.getClass();
            ef1 ef1Var = (ef1) qh0Var.Yi7zF1RB1.remove(str);
            if (ef1Var != null) {
                ef1Var.GWasM1elztuh();
            }
        }
        ph0Var.mE4lRynR();
        ArrayList WIEu4Ya2g82 = ph0Var.WIEu4Ya2g8();
        p51Var.getClass();
        p51Var.JFJ3QoxA(null, WIEu4Ya2g82);
    }

    public final fh0 Yi7zF1RB1(xh0 xh0Var, Bundle bundle) {
        ph0 ph0Var = this.encWxUiV2.Yi7zF1RB1;
        ph0Var.getClass();
        return vt.rQPn8YBR(ph0Var.GWasM1elztuh.X1lG3V04pd, xh0Var, bundle, ph0Var.mOu10nynGul(), ph0Var.iwATDS1i01k);
    }

    public final void xqGvceK5x(fh0 fh0Var, boolean z) {
        fh0Var.getClass();
        ph0 ph0Var = this.encWxUiV2.Yi7zF1RB1;
        h2 h2Var = new h2(this, fh0Var, z);
        ph0Var.getClass();
        ej0 Yi7zF1RB1 = ph0Var.mE4lRynR.Yi7zF1RB1(fh0Var.EljAMC1QTz.OOA6hdeuvCS);
        ph0Var.lv06NcmrQ.put(fh0Var, Boolean.valueOf(z));
        if (!Yi7zF1RB1.equals(this.AvO7iQsrTN)) {
            Object obj = ph0Var.jivtDDk9H.get(Yi7zF1RB1);
            obj.getClass();
            ((kh0) obj).xqGvceK5x(fh0Var, z);
            return;
        }
        mh0 mh0Var = ph0Var.cilMamHF;
        if (mh0Var != null) {
            mh0Var.mOu10nynGul(fh0Var);
            h2Var.GWasM1elztuh();
            return;
        }
        v4 v4Var = ph0Var.EljAMC1QTz;
        int indexOf = v4Var.indexOf(fh0Var);
        if (indexOf < 0) {
            Log.i("NavController", "Ignoring pop of " + fh0Var + " as it was not found on the current back stack");
            return;
        }
        int i = indexOf + 1;
        if (i != v4Var.AvO7iQsrTN) {
            ph0Var.XnEVoBF0td1l(((fh0) v4Var.get(i)).EljAMC1QTz.EljAMC1QTz.GWasM1elztuh, true, false);
        }
        ph0.iwATDS1i01k(ph0Var, fh0Var);
        h2Var.GWasM1elztuh();
        ph0Var.Yi7zF1RB1.GWasM1elztuh();
        ph0Var.Yi7zF1RB1();
    }
}
