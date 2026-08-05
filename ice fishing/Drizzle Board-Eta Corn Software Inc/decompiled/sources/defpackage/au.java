package defpackage;

import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class au {
    public final x90 MdtA4re8;
    public final x90 NCTxEWno;
    public final e10 P7K7Inc8;
    public final /* synthetic */ uu Qr9iLBAD;
    public final e10 VgvYg0wo;
    public final wv b2ZJblxo;
    public final k00 qoPGr6Ce;
    public boolean wxUZMvaN;

    public au(uu uuVar, wv wvVar) {
        wvVar.getClass();
        this.Qr9iLBAD = uuVar;
        this.qoPGr6Ce = new k00(9);
        x90 qoPGr6Ce = ra.qoPGr6Ce(wf.NCTxEWno);
        this.NCTxEWno = qoPGr6Ce;
        x90 qoPGr6Ce2 = ra.qoPGr6Ce(zf.NCTxEWno);
        this.MdtA4re8 = qoPGr6Ce2;
        this.VgvYg0wo = new e10(qoPGr6Ce);
        this.P7K7Inc8 = new e10(qoPGr6Ce2);
        this.b2ZJblxo = wvVar;
    }

    public final void MdtA4re8(ut utVar) {
        hu huVar;
        ug0 ug0Var;
        utVar.getClass();
        gu guVar = this.Qr9iLBAD.NCTxEWno;
        x90 x90Var = guVar.Qr9iLBAD;
        String str = utVar.b2ZJblxo;
        LinkedHashMap linkedHashMap = guVar.RXQxj5Oe;
        boolean qoPGr6Ce = fn.qoPGr6Ce(linkedHashMap.get(utVar), Boolean.TRUE);
        x90 x90Var2 = this.MdtA4re8;
        x90Var2.eVhOlqcC(null, p60.sjUBp5pO((Set) x90Var2.Qr9iLBAD(), utVar));
        linkedHashMap.remove(utVar);
        q0 q0Var = guVar.P7K7Inc8;
        if (q0Var.contains(utVar)) {
            if (this.wxUZMvaN) {
                return;
            }
            guVar.KlHjfFWx();
            x90 x90Var3 = guVar.b2ZJblxo;
            ArrayList arrayList = new ArrayList(q0Var);
            x90Var3.getClass();
            x90Var3.eVhOlqcC(null, arrayList);
            ArrayList lDXGDhIF = guVar.lDXGDhIF();
            x90Var.getClass();
            x90Var.eVhOlqcC(null, lDXGDhIF);
            return;
        }
        guVar.amk52bBQ(utVar);
        if (utVar.jb9XjC4I.eVhOlqcC.MdtA4re8.compareTo(po.wxUZMvaN) >= 0) {
            utVar.NCTxEWno(po.NCTxEWno);
        }
        if (!q0Var.isEmpty()) {
            Iterator it = q0Var.iterator();
            while (it.hasNext()) {
                if (((ut) it.next()).b2ZJblxo.equals(str)) {
                    break;
                }
            }
        }
        if (!qoPGr6Ce && (huVar = guVar.ygLcUYwZ) != null && (ug0Var = (ug0) huVar.NCTxEWno.remove(str)) != null) {
            ug0Var.qoPGr6Ce();
        }
        guVar.KlHjfFWx();
        ArrayList lDXGDhIF2 = guVar.lDXGDhIF();
        x90Var.getClass();
        x90Var.eVhOlqcC(null, lDXGDhIF2);
    }

    public final ut NCTxEWno(pu puVar, Bundle bundle) {
        gu guVar = this.Qr9iLBAD.NCTxEWno;
        guVar.getClass();
        return re.MdtA4re8(guVar.qoPGr6Ce.MdtA4re8, puVar, bundle, guVar.Qr9iLBAD(), guVar.ygLcUYwZ);
    }

    public final void P7K7Inc8(ut utVar, boolean z) {
        Object obj;
        x90 x90Var = this.VgvYg0wo.NCTxEWno;
        x90 x90Var2 = this.MdtA4re8;
        Iterable iterable = (Iterable) x90Var2.Qr9iLBAD();
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((ut) it.next()) == utVar) {
                    Iterable iterable2 = (Iterable) x90Var.Qr9iLBAD();
                    if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
                        return;
                    }
                    Iterator it2 = iterable2.iterator();
                    while (it2.hasNext()) {
                        if (((ut) it2.next()) == utVar) {
                        }
                    }
                    return;
                }
            }
        }
        x90Var2.eVhOlqcC(null, p60.OxcuoDLp((Set) x90Var2.Qr9iLBAD(), utVar));
        List list = (List) x90Var.Qr9iLBAD();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            ut utVar2 = (ut) obj;
            if (!fn.qoPGr6Ce(utVar2, utVar) && ((List) x90Var.Qr9iLBAD()).lastIndexOf(utVar2) < ((List) x90Var.Qr9iLBAD()).lastIndexOf(utVar)) {
                break;
            }
        }
        ut utVar3 = (ut) obj;
        if (utVar3 != null) {
            x90Var2.eVhOlqcC(null, p60.OxcuoDLp((Set) x90Var2.Qr9iLBAD(), utVar3));
        }
        VgvYg0wo(utVar, z);
    }

    public final void Qr9iLBAD(ut utVar) {
        x90 x90Var = this.VgvYg0wo.NCTxEWno;
        x90 x90Var2 = this.MdtA4re8;
        Iterable iterable = (Iterable) x90Var2.Qr9iLBAD();
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((ut) it.next()) == utVar) {
                    Iterable iterable2 = (Iterable) x90Var.Qr9iLBAD();
                    if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                        Iterator it2 = iterable2.iterator();
                        while (it2.hasNext()) {
                            if (((ut) it2.next()) == utVar) {
                                return;
                            }
                        }
                    }
                }
            }
        }
        ut utVar2 = (ut) x5.hGvurcGl((List) x90Var.Qr9iLBAD());
        if (utVar2 != null) {
            x90Var2.eVhOlqcC(null, p60.OxcuoDLp((Set) x90Var2.Qr9iLBAD(), utVar2));
        }
        x90Var2.eVhOlqcC(null, p60.OxcuoDLp((Set) x90Var2.Qr9iLBAD(), utVar));
        b2ZJblxo(utVar);
    }

    public final void VgvYg0wo(ut utVar, boolean z) {
        gu guVar = this.Qr9iLBAD.NCTxEWno;
        mj mjVar = new mj(this, utVar, z);
        guVar.getClass();
        wv NCTxEWno = guVar.amk52bBQ.NCTxEWno(utVar.MdtA4re8.NCTxEWno);
        guVar.RXQxj5Oe.put(utVar, Boolean.valueOf(z));
        if (!NCTxEWno.equals(this.b2ZJblxo)) {
            Object obj = guVar.KlHjfFWx.get(NCTxEWno);
            obj.getClass();
            ((au) obj).VgvYg0wo(utVar, z);
            return;
        }
        du duVar = guVar.I5GHvsYW;
        if (duVar != null) {
            duVar.ow5vqvCr(utVar);
            mjVar.qoPGr6Ce();
            return;
        }
        q0 q0Var = guVar.P7K7Inc8;
        int indexOf = q0Var.indexOf(utVar);
        if (indexOf < 0) {
            Log.i("NavController", "Ignoring pop of " + utVar + " as it was not found on the current back stack");
            return;
        }
        int i = indexOf + 1;
        if (i != q0Var.wxUZMvaN) {
            guVar.ow5vqvCr(((ut) q0Var.get(i)).MdtA4re8.MdtA4re8.qoPGr6Ce, true, false);
        }
        gu.ygLcUYwZ(guVar, utVar);
        mjVar.qoPGr6Ce();
        guVar.NCTxEWno.qoPGr6Ce();
        guVar.NCTxEWno();
    }

    public final void b2ZJblxo(ut utVar) {
        utVar.getClass();
        gu guVar = this.Qr9iLBAD.NCTxEWno;
        guVar.getClass();
        wv NCTxEWno = guVar.amk52bBQ.NCTxEWno(utVar.MdtA4re8.NCTxEWno);
        if (!NCTxEWno.equals(this.b2ZJblxo)) {
            Object obj = guVar.KlHjfFWx.get(NCTxEWno);
            if (obj != null) {
                ((au) obj).b2ZJblxo(utVar);
                return;
            } else {
                m1.I5GHvsYW(utVar.MdtA4re8.NCTxEWno, " should already be created", "NavigatorBackStack for ");
                return;
            }
        }
        zk zkVar = guVar.Ey6iv0m0;
        if (zkVar != null) {
            zkVar.ow5vqvCr(utVar);
            qoPGr6Ce(utVar);
        } else {
            Log.i("NavController", "Ignoring add of destination " + utVar.MdtA4re8 + " outside of the call to navigate(). ");
        }
    }

    public final void qoPGr6Ce(ut utVar) {
        utVar.getClass();
        synchronized (this.qoPGr6Ce) {
            x90 x90Var = this.NCTxEWno;
            x90Var.eVhOlqcC(null, x5.orhfF2Ya((Collection) x90Var.Qr9iLBAD(), utVar));
        }
    }

    public final void wxUZMvaN(ut utVar) {
        int i;
        synchronized (this.qoPGr6Ce) {
            try {
                ArrayList X1t0wlBd = x5.X1t0wlBd((Collection) this.VgvYg0wo.NCTxEWno.Qr9iLBAD());
                ListIterator listIterator = X1t0wlBd.listIterator(X1t0wlBd.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        i = -1;
                        break;
                    } else if (((ut) listIterator.previous()).b2ZJblxo.equals(utVar.b2ZJblxo)) {
                        i = listIterator.nextIndex();
                        break;
                    }
                }
                X1t0wlBd.set(i, utVar);
                this.NCTxEWno.eVhOlqcC(null, X1t0wlBd);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
