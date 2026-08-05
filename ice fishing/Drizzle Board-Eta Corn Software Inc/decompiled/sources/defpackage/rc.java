package defpackage;

import android.content.Context;
import android.util.Log;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
@vv("dialog")
/* loaded from: classes.dex */
public final class rc extends wv {
    public final Context MdtA4re8;
    public final ej wxUZMvaN;
    public final LinkedHashSet VgvYg0wo = new LinkedHashSet();
    public final i10 P7K7Inc8 = new i10(3, this);
    public final LinkedHashMap b2ZJblxo = new LinkedHashMap();

    public rc(Context context, ej ejVar) {
        this.MdtA4re8 = context;
        this.wxUZMvaN = ejVar;
    }

    @Override // defpackage.wv
    public final void P7K7Inc8(ut utVar) {
        String str = utVar.b2ZJblxo;
        ej ejVar = this.wxUZMvaN;
        if (ejVar.Xkz7p5xa()) {
            Log.i("DialogFragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        nc ncVar = (nc) this.b2ZJblxo.get(str);
        if (ncVar == null) {
            li U0LaHZX7 = ejVar.U0LaHZX7(str);
            ncVar = U0LaHZX7 instanceof nc ? (nc) U0LaHZX7 : null;
        }
        if (ncVar != null) {
            ncVar.FXJmAAN1.P7K7Inc8(this.P7K7Inc8);
            ncVar.zCflySGU(false, false);
        }
        nc k3x7lurq = k3x7lurq(utVar);
        k3x7lurq.dHozS53r = false;
        k3x7lurq.f7oeun2L = true;
        n1 n1Var = new n1(ejVar);
        n1Var.sjUBp5pO = true;
        n1Var.VgvYg0wo(0, k3x7lurq, str, 1);
        n1Var.wxUZMvaN(false);
        au NCTxEWno = NCTxEWno();
        List list = (List) NCTxEWno.VgvYg0wo.NCTxEWno.Qr9iLBAD();
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            ut utVar2 = (ut) listIterator.previous();
            if (utVar2.b2ZJblxo.equals(str)) {
                x90 x90Var = NCTxEWno.MdtA4re8;
                x90Var.eVhOlqcC(null, p60.OxcuoDLp(p60.OxcuoDLp((Set) x90Var.Qr9iLBAD(), utVar2), utVar));
                NCTxEWno.wxUZMvaN(utVar);
                return;
            }
        }
        throw new NoSuchElementException("List contains no element matching the predicate.");
    }

    @Override // defpackage.wv
    public final void VgvYg0wo(au auVar) {
        xo xoVar;
        this.qoPGr6Ce = auVar;
        this.NCTxEWno = true;
        Iterator it = ((List) auVar.VgvYg0wo.NCTxEWno.Qr9iLBAD()).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            ej ejVar = this.wxUZMvaN;
            if (!hasNext) {
                ejVar.ygLcUYwZ.add(new rj() { // from class: oc
                    @Override // defpackage.rj
                    public final void NCTxEWno(ej ejVar2, li liVar) {
                        ejVar2.getClass();
                        rc rcVar = rc.this;
                        LinkedHashSet linkedHashSet = rcVar.VgvYg0wo;
                        String str = liVar.DK9slbsy;
                        if ((linkedHashSet instanceof xn) && !(linkedHashSet instanceof yn)) {
                            le0.zCflySGU(linkedHashSet, "kotlin.collections.MutableCollection");
                            throw null;
                        }
                        if (linkedHashSet.remove(str)) {
                            liVar.FXJmAAN1.qoPGr6Ce(rcVar.P7K7Inc8);
                        }
                        LinkedHashMap linkedHashMap = rcVar.b2ZJblxo;
                        String str2 = liVar.DK9slbsy;
                        le0.MdtA4re8(linkedHashMap);
                        linkedHashMap.remove(str2);
                    }
                });
                return;
            }
            ut utVar = (ut) it.next();
            nc ncVar = (nc) ejVar.U0LaHZX7(utVar.b2ZJblxo);
            if (ncVar == null || (xoVar = ncVar.FXJmAAN1) == null) {
                this.VgvYg0wo.add(utVar.b2ZJblxo);
            } else {
                xoVar.qoPGr6Ce(this.P7K7Inc8);
            }
        }
    }

    @Override // defpackage.wv
    public final void jb9XjC4I(ut utVar, boolean z) {
        ej ejVar = this.wxUZMvaN;
        if (ejVar.Xkz7p5xa()) {
            Log.i("DialogFragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List list = (List) NCTxEWno().VgvYg0wo.NCTxEWno.Qr9iLBAD();
        int indexOf = list.indexOf(utVar);
        Iterator it = x5.f7oeun2L(list.subList(indexOf, list.size())).iterator();
        while (it.hasNext()) {
            li U0LaHZX7 = ejVar.U0LaHZX7(((ut) it.next()).b2ZJblxo);
            if (U0LaHZX7 != null) {
                ((nc) U0LaHZX7).zCflySGU(false, false);
            }
        }
        ow5vqvCr(indexOf, utVar, z);
    }

    public final nc k3x7lurq(ut utVar) {
        pu puVar = utVar.MdtA4re8;
        puVar.getClass();
        pc pcVar = (pc) puVar;
        String str = pcVar.Qr9iLBAD;
        if (str == null) {
            m1.Ey6iv0m0("DialogFragment class was not set");
            return null;
        }
        char charAt = str.charAt(0);
        Context context = this.MdtA4re8;
        if (charAt == '.') {
            str = context.getPackageName() + str;
        }
        yi Mq3SeTnW = this.wxUZMvaN.Mq3SeTnW();
        context.getClassLoader();
        li qoPGr6Ce = Mq3SeTnW.qoPGr6Ce(str);
        qoPGr6Ce.getClass();
        if (nc.class.isAssignableFrom(qoPGr6Ce.getClass())) {
            nc ncVar = (nc) qoPGr6Ce;
            ncVar.hzgxAD8d(utVar.jb9XjC4I.qoPGr6Ce());
            ncVar.FXJmAAN1.qoPGr6Ce(this.P7K7Inc8);
            this.b2ZJblxo.put(utVar.b2ZJblxo, ncVar);
            return ncVar;
        }
        StringBuilder sb = new StringBuilder("Dialog destination ");
        String str2 = pcVar.Qr9iLBAD;
        if (str2 == null) {
            m1.Ey6iv0m0("DialogFragment class was not set");
            return null;
        }
        sb.append(str2);
        sb.append(" is not an instance of DialogFragment");
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public final void ow5vqvCr(int i, ut utVar, boolean z) {
        ut utVar2 = (ut) x5.LfKQckgD((List) NCTxEWno().VgvYg0wo.NCTxEWno.Qr9iLBAD(), i - 1);
        boolean g2aRJUAd = x5.g2aRJUAd((Iterable) NCTxEWno().P7K7Inc8.NCTxEWno.Qr9iLBAD(), utVar2);
        NCTxEWno().P7K7Inc8(utVar, z);
        if (utVar2 == null || g2aRJUAd) {
            return;
        }
        NCTxEWno().MdtA4re8(utVar2);
    }

    @Override // defpackage.wv
    public final pu qoPGr6Ce() {
        return new pc(this);
    }

    @Override // defpackage.wv
    public final void wxUZMvaN(List list, xu xuVar) {
        ej ejVar = this.wxUZMvaN;
        if (ejVar.Xkz7p5xa()) {
            Log.i("DialogFragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ut utVar = (ut) it.next();
            nc k3x7lurq = k3x7lurq(utVar);
            String str = utVar.b2ZJblxo;
            k3x7lurq.dHozS53r = false;
            k3x7lurq.f7oeun2L = true;
            n1 n1Var = new n1(ejVar);
            n1Var.sjUBp5pO = true;
            n1Var.VgvYg0wo(0, k3x7lurq, str, 1);
            n1Var.wxUZMvaN(false);
            ut utVar2 = (ut) x5.hGvurcGl((List) NCTxEWno().VgvYg0wo.NCTxEWno.Qr9iLBAD());
            boolean g2aRJUAd = x5.g2aRJUAd((Iterable) NCTxEWno().P7K7Inc8.NCTxEWno.Qr9iLBAD(), utVar2);
            NCTxEWno().Qr9iLBAD(utVar);
            if (utVar2 != null && !g2aRJUAd) {
                NCTxEWno().MdtA4re8(utVar2);
            }
        }
    }
}
