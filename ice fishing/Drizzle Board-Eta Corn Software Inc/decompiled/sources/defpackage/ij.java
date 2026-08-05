package defpackage;

import android.util.Log;
import java.util.ArrayList;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final /* synthetic */ class ij implements to {
    public final /* synthetic */ Object MdtA4re8;
    public final /* synthetic */ int NCTxEWno;

    public /* synthetic */ ij(int i, Object obj) {
        this.NCTxEWno = i;
        this.MdtA4re8 = obj;
    }

    @Override // defpackage.to
    public final void P7K7Inc8(vo voVar, oo ooVar) {
        int i = this.NCTxEWno;
        int i2 = 0;
        Object obj = this.MdtA4re8;
        switch (i) {
            case 0:
                nj njVar = (nj) obj;
                if (ooVar == oo.ON_DESTROY) {
                    li liVar = (li) voVar;
                    Object obj2 = null;
                    for (Object obj3 : (Iterable) njVar.NCTxEWno().P7K7Inc8.NCTxEWno.Qr9iLBAD()) {
                        if (((ut) obj3).b2ZJblxo.equals(liVar.DK9slbsy)) {
                            obj2 = obj3;
                        }
                    }
                    ut utVar = (ut) obj2;
                    if (utVar != null) {
                        if (nj.ygLcUYwZ()) {
                            Log.v("FragmentNavigator", "Marking transition complete for entry " + utVar + " due to fragment " + voVar + " lifecycle reaching DESTROYED");
                        }
                        njVar.NCTxEWno().MdtA4re8(utVar);
                        break;
                    }
                }
                break;
            case 1:
                gu guVar = (gu) obj;
                guVar.sjUBp5pO = ooVar.qoPGr6Ce();
                if (guVar.MdtA4re8 != null) {
                    ArrayList X1t0wlBd = x5.X1t0wlBd(guVar.P7K7Inc8);
                    int size = X1t0wlBd.size();
                    while (i2 < size) {
                        Object obj4 = X1t0wlBd.get(i2);
                        i2++;
                        ut utVar2 = (ut) obj4;
                        utVar2.getClass();
                        wt wtVar = utVar2.jb9XjC4I;
                        wtVar.getClass();
                        wtVar.qoPGr6Ce.VgvYg0wo = ooVar.qoPGr6Ce();
                        wtVar.wxUZMvaN = ooVar.qoPGr6Ce();
                        wtVar.NCTxEWno();
                    }
                    break;
                }
                break;
            default:
                r50 r50Var = (r50) obj;
                if (ooVar == oo.ON_START) {
                    r50Var.Qr9iLBAD = true;
                    break;
                } else if (ooVar == oo.ON_STOP) {
                    r50Var.Qr9iLBAD = false;
                    break;
                }
                break;
        }
    }
}
