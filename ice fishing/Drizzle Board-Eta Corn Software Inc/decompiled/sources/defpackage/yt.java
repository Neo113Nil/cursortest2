package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class yt {
    public Object MdtA4re8;
    public Object NCTxEWno;
    public int qoPGr6Ce;
    public Cloneable wxUZMvaN;

    public yt(ut utVar, int i) {
        this.NCTxEWno = utVar.b2ZJblxo;
        this.qoPGr6Ce = i;
        wt wtVar = utVar.jb9XjC4I;
        this.MdtA4re8 = wtVar.qoPGr6Ce();
        Bundle VgvYg0wo = w30.VgvYg0wo((hx[]) Arrays.copyOf(new hx[0], 0));
        this.wxUZMvaN = VgvYg0wo;
        wtVar.Qr9iLBAD.eVhOlqcC(VgvYg0wo);
    }

    public ou NCTxEWno(ou ouVar, f0 f0Var, boolean z, pu puVar) {
        ou ouVar2;
        ru ruVar = (ru) this.MdtA4re8;
        ArrayList arrayList = new ArrayList();
        Iterator it = ruVar.iterator();
        while (true) {
            su suVar = (su) it;
            if (!suVar.hasNext()) {
                break;
            }
            pu puVar2 = (pu) suVar.next();
            ouVar2 = fn.qoPGr6Ce(puVar2, puVar) ? null : puVar2.VgvYg0wo(f0Var);
            if (ouVar2 != null) {
                arrayList.add(ouVar2);
            }
        }
        ou ouVar3 = (ou) x5.Wi7iiXC4(arrayList);
        ru ruVar2 = ruVar.wxUZMvaN;
        if (ruVar2 != null && z && !ruVar2.equals(puVar)) {
            ouVar2 = ruVar2.jb9XjC4I(f0Var, ruVar);
        }
        ou[] ouVarArr = {ouVar, ouVar3, ouVar2};
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < 3; i++) {
            ou ouVar4 = ouVarArr[i];
            if (ouVar4 != null) {
                arrayList2.add(ouVar4);
            }
        }
        return (ou) x5.Wi7iiXC4(arrayList2);
    }

    public pu qoPGr6Ce(int i, pu puVar, pu puVar2, boolean z) {
        ru ruVar = (ru) this.MdtA4re8;
        a80 a80Var = (a80) this.wxUZMvaN;
        pu puVar3 = (pu) ej0.eVhOlqcC(a80Var, i);
        if (puVar2 != null) {
            if (fn.qoPGr6Ce(puVar3, puVar2) && fn.qoPGr6Ce(puVar3.wxUZMvaN, puVar2.wxUZMvaN)) {
                return puVar3;
            }
            puVar3 = null;
        } else if (puVar3 != null) {
            return puVar3;
        }
        if (z) {
            Iterator it = l60.I5GHvsYW(new ow5vqvCr(2, a80Var)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    puVar3 = null;
                    break;
                }
                pu puVar4 = (pu) it.next();
                puVar3 = (!(puVar4 instanceof ru) || puVar4.equals(puVar)) ? null : ((ru) puVar4).Qr9iLBAD.qoPGr6Ce(i, ruVar, puVar2, true);
                if (puVar3 != null) {
                    break;
                }
            }
        }
        if (puVar3 != null) {
            return puVar3;
        }
        ru ruVar2 = ruVar.wxUZMvaN;
        if (ruVar2 == null || ruVar2.equals(puVar)) {
            return null;
        }
        ru ruVar3 = ruVar.wxUZMvaN;
        ruVar3.getClass();
        return ruVar3.Qr9iLBAD.qoPGr6Ce(i, ruVar, puVar2, z);
    }
}
