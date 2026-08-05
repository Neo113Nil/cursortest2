package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class ya implements Runnable {
    public final /* synthetic */ ArrayList MdtA4re8;
    public final /* synthetic */ int NCTxEWno;
    public final /* synthetic */ eb wxUZMvaN;

    public /* synthetic */ ya(eb ebVar, ArrayList arrayList, int i) {
        this.NCTxEWno = i;
        this.wxUZMvaN = ebVar;
        this.MdtA4re8 = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        char c;
        int i = this.NCTxEWno;
        int i2 = 0;
        ArrayList arrayList = this.MdtA4re8;
        switch (i) {
            case 0:
                int size = arrayList.size();
                while (true) {
                    eb ebVar = this.wxUZMvaN;
                    if (i2 >= size) {
                        arrayList.clear();
                        ebVar.OnDfzHZD.remove(arrayList);
                        break;
                    } else {
                        Object obj = arrayList.get(i2);
                        i2++;
                        db dbVar = (db) obj;
                        g20 g20Var = dbVar.qoPGr6Ce;
                        int i3 = dbVar.NCTxEWno;
                        int i4 = dbVar.MdtA4re8;
                        int i5 = dbVar.wxUZMvaN;
                        int i6 = dbVar.VgvYg0wo;
                        ebVar.getClass();
                        View view = g20Var.qoPGr6Ce;
                        int i7 = i5 - i3;
                        int i8 = i6 - i4;
                        if (i7 != 0) {
                            view.animate().translationX(0.0f);
                        }
                        if (i8 != 0) {
                            view.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator animate = view.animate();
                        ebVar.sjUBp5pO.add(g20Var);
                        animate.setDuration(ebVar.VgvYg0wo).setListener(new ab(ebVar, g20Var, i7, view, i8, animate)).start();
                    }
                }
            case 1:
                int size2 = arrayList.size();
                while (true) {
                    eb ebVar2 = this.wxUZMvaN;
                    if (i2 >= size2) {
                        arrayList.clear();
                        ebVar2.ygLcUYwZ.remove(arrayList);
                        break;
                    } else {
                        Object obj2 = arrayList.get(i2);
                        i2++;
                        cb cbVar = (cb) obj2;
                        ArrayList arrayList2 = ebVar2.amk52bBQ;
                        long j = ebVar2.P7K7Inc8;
                        g20 g20Var2 = cbVar.qoPGr6Ce;
                        View view2 = g20Var2 == null ? null : g20Var2.qoPGr6Ce;
                        g20 g20Var3 = cbVar.NCTxEWno;
                        View view3 = g20Var3 != null ? g20Var3.qoPGr6Ce : null;
                        if (view2 != null) {
                            ViewPropertyAnimator duration = view2.animate().setDuration(j);
                            arrayList2.add(cbVar.qoPGr6Ce);
                            duration.translationX(cbVar.VgvYg0wo - cbVar.MdtA4re8);
                            duration.translationY(cbVar.P7K7Inc8 - cbVar.wxUZMvaN);
                            duration.alpha(0.0f).setListener(new bb(ebVar2, cbVar, duration, view2, 0)).start();
                        }
                        if (view3 != null) {
                            ViewPropertyAnimator animate2 = view3.animate();
                            arrayList2.add(cbVar.NCTxEWno);
                            c = 0;
                            animate2.translationX(0.0f).translationY(0.0f).setDuration(j).alpha(1.0f).setListener(new bb(ebVar2, cbVar, animate2, view3, 1)).start();
                        } else {
                            c = 0;
                        }
                    }
                }
            default:
                int size3 = arrayList.size();
                while (true) {
                    eb ebVar3 = this.wxUZMvaN;
                    if (i2 >= size3) {
                        arrayList.clear();
                        ebVar3.ow5vqvCr.remove(arrayList);
                        break;
                    } else {
                        Object obj3 = arrayList.get(i2);
                        i2++;
                        g20 g20Var4 = (g20) obj3;
                        ebVar3.getClass();
                        View view4 = g20Var4.qoPGr6Ce;
                        ViewPropertyAnimator animate3 = view4.animate();
                        ebVar3.lDXGDhIF.add(g20Var4);
                        animate3.alpha(1.0f).setDuration(ebVar3.MdtA4re8).setListener(new za(ebVar3, g20Var4, view4, animate3)).start();
                    }
                }
        }
    }
}
