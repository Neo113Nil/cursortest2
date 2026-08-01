package k0;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* renamed from: k0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0186A implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3367a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f3368b;

    public /* synthetic */ RunnableC0186A(RecyclerView recyclerView, int i) {
        this.f3367a = i;
        this.f3368b = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView recyclerView = this.f3368b;
        switch (this.f3367a) {
            case 0:
                if (recyclerView.f2175u && !recyclerView.isLayoutRequested()) {
                    if (!recyclerView.f2172s) {
                        recyclerView.requestLayout();
                        break;
                    } else if (!recyclerView.f2181x) {
                        recyclerView.p();
                        break;
                    } else {
                        recyclerView.f2179w = true;
                        break;
                    }
                }
                break;
            default:
                G g2 = recyclerView.f2127L;
                if (g2 != null) {
                    C0197k c0197k = (C0197k) g2;
                    ArrayList arrayList = c0197k.f3526h;
                    boolean isEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = c0197k.j;
                    boolean isEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = c0197k.f3527k;
                    boolean isEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = c0197k.i;
                    boolean isEmpty4 = arrayList4.isEmpty();
                    if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            boolean hasNext = it.hasNext();
                            long j = c0197k.f3376d;
                            if (hasNext) {
                                b0 b0Var = (b0) it.next();
                                View view = b0Var.f3449a;
                                ViewPropertyAnimator animate = view.animate();
                                c0197k.f3533q.add(b0Var);
                                animate.setDuration(j).alpha(RecyclerView.f2111C0).setListener(new C0192f(c0197k, b0Var, animate, view)).start();
                                it = it;
                            } else {
                                arrayList.clear();
                                if (!isEmpty2) {
                                    ArrayList arrayList5 = new ArrayList();
                                    arrayList5.addAll(arrayList2);
                                    c0197k.f3529m.add(arrayList5);
                                    arrayList2.clear();
                                    RunnableC0191e runnableC0191e = new RunnableC0191e(c0197k, arrayList5, 0);
                                    if (isEmpty) {
                                        runnableC0191e.run();
                                    } else {
                                        View view2 = ((C0196j) arrayList5.get(0)).f3514a.f3449a;
                                        WeakHashMap weakHashMap = O.K.f747a;
                                        view2.postOnAnimationDelayed(runnableC0191e, j);
                                    }
                                }
                                if (!isEmpty3) {
                                    ArrayList arrayList6 = new ArrayList();
                                    arrayList6.addAll(arrayList3);
                                    c0197k.f3530n.add(arrayList6);
                                    arrayList3.clear();
                                    RunnableC0191e runnableC0191e2 = new RunnableC0191e(c0197k, arrayList6, 1);
                                    if (isEmpty) {
                                        runnableC0191e2.run();
                                    } else {
                                        View view3 = ((C0195i) arrayList6.get(0)).f3502a.f3449a;
                                        WeakHashMap weakHashMap2 = O.K.f747a;
                                        view3.postOnAnimationDelayed(runnableC0191e2, j);
                                    }
                                }
                                if (!isEmpty4) {
                                    ArrayList arrayList7 = new ArrayList();
                                    arrayList7.addAll(arrayList4);
                                    c0197k.f3528l.add(arrayList7);
                                    arrayList4.clear();
                                    RunnableC0191e runnableC0191e3 = new RunnableC0191e(c0197k, arrayList7, 2);
                                    if (isEmpty && isEmpty2 && isEmpty3) {
                                        runnableC0191e3.run();
                                    } else {
                                        if (isEmpty) {
                                            j = 0;
                                        }
                                        long max = Math.max(!isEmpty2 ? c0197k.e : 0L, isEmpty3 ? 0L : c0197k.f3377f) + j;
                                        View view4 = ((b0) arrayList7.get(0)).f3449a;
                                        WeakHashMap weakHashMap3 = O.K.f747a;
                                        view4.postOnAnimationDelayed(runnableC0191e3, max);
                                    }
                                }
                            }
                        }
                    }
                }
                recyclerView.f2161m0 = false;
                break;
        }
    }
}
