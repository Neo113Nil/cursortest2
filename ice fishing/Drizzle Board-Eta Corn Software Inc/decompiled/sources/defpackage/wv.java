package defpackage;

import android.os.Bundle;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class wv {
    public boolean NCTxEWno;
    public au qoPGr6Ce;

    public final au NCTxEWno() {
        au auVar = this.qoPGr6Ce;
        if (auVar != null) {
            return auVar;
        }
        m1.Ey6iv0m0("You cannot access the Navigator's state until the Navigator is attached");
        return null;
    }

    public void P7K7Inc8(ut utVar) {
        pu puVar = utVar.MdtA4re8;
        if (puVar == null) {
            puVar = null;
        }
        if (puVar == null) {
            return;
        }
        wu wuVar = new wu();
        wuVar.qoPGr6Ce = true;
        wuVar.NCTxEWno = false;
        wuVar.MdtA4re8 = -1;
        wuVar.wxUZMvaN = false;
        MdtA4re8(puVar, null, wuVar.qoPGr6Ce());
        NCTxEWno().wxUZMvaN(utVar);
    }

    public Bundle Qr9iLBAD() {
        return null;
    }

    public void VgvYg0wo(au auVar) {
        this.qoPGr6Ce = auVar;
        this.NCTxEWno = true;
    }

    public boolean eVhOlqcC() {
        return true;
    }

    public void jb9XjC4I(ut utVar, boolean z) {
        List list = (List) NCTxEWno().VgvYg0wo.NCTxEWno.Qr9iLBAD();
        if (!list.contains(utVar)) {
            m1.OxcuoDLp("popBackStack was called with ", utVar, " which does not exist in back stack ", list);
            return;
        }
        ListIterator listIterator = list.listIterator(list.size());
        ut utVar2 = null;
        while (eVhOlqcC()) {
            utVar2 = (ut) listIterator.previous();
            if (fn.qoPGr6Ce(utVar2, utVar)) {
                break;
            }
        }
        if (utVar2 != null) {
            NCTxEWno().VgvYg0wo(utVar2, z);
        }
    }

    public abstract pu qoPGr6Ce();

    public void wxUZMvaN(List list, xu xuVar) {
        vg vgVar = new vg(new xb(new nb0(new e6(0, list), new cm(this, 4, xuVar), 1), new tKaxLBvG(28), 1));
        while (vgVar.hasNext()) {
            NCTxEWno().b2ZJblxo((ut) vgVar.next());
        }
    }

    public void b2ZJblxo(Bundle bundle) {
    }

    public pu MdtA4re8(pu puVar, Bundle bundle, xu xuVar) {
        return puVar;
    }
}
