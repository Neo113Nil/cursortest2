package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class pon implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ RecyclerView b;

    public /* synthetic */ pon(RecyclerView recyclerView, int i) {
        this.a = i;
        this.b = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        int i = this.a;
        RecyclerView recyclerView = this.b;
        switch (i) {
            case 0:
                if (recyclerView.u && !recyclerView.isLayoutRequested()) {
                    if (!recyclerView.s) {
                        recyclerView.requestLayout();
                        break;
                    } else if (!recyclerView.x) {
                        recyclerView.z();
                        break;
                    } else {
                        recyclerView.w = true;
                        break;
                    }
                }
                break;
            default:
                von vonVar = recyclerView.v0;
                if (vonVar != null) {
                    tn7 tn7Var = (tn7) vonVar;
                    long j = tn7Var.d;
                    ArrayList arrayList = tn7Var.h;
                    boolean isEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = tn7Var.j;
                    boolean isEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = tn7Var.k;
                    boolean isEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = tn7Var.i;
                    boolean isEmpty4 = arrayList4.isEmpty();
                    if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            opn opnVar = (opn) it.next();
                            View view = opnVar.a;
                            ViewPropertyAnimator animate = view.animate();
                            tn7Var.q.add(opnVar);
                            animate.setDuration(j).alpha(0.0f).setListener(new on7(tn7Var, opnVar, animate, view)).start();
                            arrayList = arrayList;
                            isEmpty = isEmpty;
                        }
                        boolean z2 = isEmpty;
                        arrayList.clear();
                        if (!isEmpty2) {
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.addAll(arrayList2);
                            tn7Var.m.add(arrayList5);
                            arrayList2.clear();
                            nn7 nn7Var = new nn7(tn7Var, arrayList5, 0);
                            if (z2) {
                                nn7Var.run();
                            } else {
                                View view2 = ((sn7) arrayList5.get(0)).a.a;
                                WeakHashMap weakHashMap = wdu.a;
                                view2.postOnAnimationDelayed(nn7Var, j);
                            }
                        }
                        if (!isEmpty3) {
                            ArrayList arrayList6 = new ArrayList();
                            arrayList6.addAll(arrayList3);
                            tn7Var.n.add(arrayList6);
                            arrayList3.clear();
                            nn7 nn7Var2 = new nn7(tn7Var, arrayList6, 1);
                            if (z2) {
                                nn7Var2.run();
                            } else {
                                View view3 = ((rn7) arrayList6.get(0)).a.a;
                                WeakHashMap weakHashMap2 = wdu.a;
                                view3.postOnAnimationDelayed(nn7Var2, j);
                            }
                        }
                        if (!isEmpty4) {
                            ArrayList arrayList7 = new ArrayList();
                            arrayList7.addAll(arrayList4);
                            tn7Var.l.add(arrayList7);
                            arrayList4.clear();
                            nn7 nn7Var3 = new nn7(tn7Var, arrayList7, 2);
                            if (!z2 || !isEmpty2 || !isEmpty3) {
                                if (z2) {
                                    j = 0;
                                }
                                long max = Math.max(!isEmpty2 ? tn7Var.e : 0L, isEmpty3 ? 0L : tn7Var.f) + j;
                                z = false;
                                View view4 = ((opn) arrayList7.get(0)).a;
                                WeakHashMap weakHashMap3 = wdu.a;
                                view4.postOnAnimationDelayed(nn7Var3, max);
                                recyclerView.T0 = z;
                                break;
                            } else {
                                nn7Var3.run();
                            }
                        }
                    }
                }
                z = false;
                recyclerView.T0 = z;
        }
    }
}
