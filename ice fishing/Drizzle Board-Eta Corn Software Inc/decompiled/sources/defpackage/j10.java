package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class j10 implements Runnable {
    public final /* synthetic */ RecyclerView MdtA4re8;
    public final /* synthetic */ int NCTxEWno;

    public /* synthetic */ j10(RecyclerView recyclerView, int i) {
        this.NCTxEWno = i;
        this.MdtA4re8 = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        int i = this.NCTxEWno;
        RecyclerView recyclerView = this.MdtA4re8;
        switch (i) {
            case 0:
                if (recyclerView.I5GHvsYW && !recyclerView.isLayoutRequested()) {
                    if (!recyclerView.KlHjfFWx) {
                        recyclerView.requestLayout();
                        break;
                    } else if (!recyclerView.gjV1z5T1) {
                        recyclerView.eVhOlqcC();
                        break;
                    } else {
                        recyclerView.FySoLYna = true;
                        break;
                    }
                }
                break;
            default:
                q10 q10Var = recyclerView.Xkz7p5xa;
                if (q10Var != null) {
                    eb ebVar = (eb) q10Var;
                    long j = ebVar.wxUZMvaN;
                    ArrayList arrayList = ebVar.Qr9iLBAD;
                    boolean isEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = ebVar.eVhOlqcC;
                    boolean isEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = ebVar.k3x7lurq;
                    boolean isEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = ebVar.jb9XjC4I;
                    boolean isEmpty4 = arrayList4.isEmpty();
                    if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
                        int size = arrayList.size();
                        int i2 = 0;
                        while (i2 < size) {
                            Object obj = arrayList.get(i2);
                            i2++;
                            g20 g20Var = (g20) obj;
                            View view = g20Var.qoPGr6Ce;
                            ArrayList arrayList5 = arrayList;
                            ViewPropertyAnimator animate = view.animate();
                            ebVar.OxcuoDLp.add(g20Var);
                            animate.setDuration(j).alpha(0.0f).setListener(new za(ebVar, g20Var, animate, view)).start();
                            arrayList = arrayList5;
                            isEmpty = isEmpty;
                            isEmpty2 = isEmpty2;
                        }
                        boolean z2 = isEmpty;
                        boolean z3 = isEmpty2;
                        arrayList.clear();
                        if (!z3) {
                            ArrayList arrayList6 = new ArrayList();
                            arrayList6.addAll(arrayList2);
                            ebVar.OnDfzHZD.add(arrayList6);
                            arrayList2.clear();
                            ya yaVar = new ya(ebVar, arrayList6, 0);
                            if (z2) {
                                yaVar.run();
                            } else {
                                View view2 = ((db) arrayList6.get(0)).qoPGr6Ce.qoPGr6Ce;
                                WeakHashMap weakHashMap = hg0.qoPGr6Ce;
                                view2.postOnAnimationDelayed(yaVar, j);
                            }
                        }
                        if (!isEmpty3) {
                            ArrayList arrayList7 = new ArrayList();
                            arrayList7.addAll(arrayList3);
                            ebVar.ygLcUYwZ.add(arrayList7);
                            arrayList3.clear();
                            ya yaVar2 = new ya(ebVar, arrayList7, 1);
                            if (z2) {
                                yaVar2.run();
                            } else {
                                View view3 = ((cb) arrayList7.get(0)).qoPGr6Ce.qoPGr6Ce;
                                WeakHashMap weakHashMap2 = hg0.qoPGr6Ce;
                                view3.postOnAnimationDelayed(yaVar2, j);
                            }
                        }
                        if (!isEmpty4) {
                            ArrayList arrayList8 = new ArrayList();
                            arrayList8.addAll(arrayList4);
                            ebVar.ow5vqvCr.add(arrayList8);
                            arrayList4.clear();
                            ya yaVar3 = new ya(ebVar, arrayList8, 2);
                            if (!z2 || !z3 || !isEmpty3) {
                                if (z2) {
                                    j = 0;
                                }
                                long max = Math.max(!z3 ? ebVar.VgvYg0wo : 0L, isEmpty3 ? 0L : ebVar.P7K7Inc8) + j;
                                z = false;
                                View view4 = ((g20) arrayList8.get(0)).qoPGr6Ce;
                                WeakHashMap weakHashMap3 = hg0.qoPGr6Ce;
                                view4.postOnAnimationDelayed(yaVar3, max);
                                recyclerView.QT4Tf9Dt = z;
                                break;
                            } else {
                                yaVar3.run();
                            }
                        }
                    }
                }
                z = false;
                recyclerView.QT4Tf9Dt = z;
        }
    }
}
