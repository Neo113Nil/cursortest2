package t0;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: t0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC5007b implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f40641n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ArrayList f40642u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C5013h f40643v;

    public /* synthetic */ RunnableC5007b(C5013h c5013h, ArrayList arrayList, int i) {
        this.f40641n = i;
        this.f40643v = c5013h;
        this.f40642u = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f40641n) {
            case 0:
                ArrayList arrayList = this.f40642u;
                Iterator it = arrayList.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    C5013h c5013h = this.f40643v;
                    if (!hasNext) {
                        arrayList.clear();
                        c5013h.f40681m.remove(arrayList);
                        break;
                    } else {
                        C5012g c5012g = (C5012g) it.next();
                        AbstractC5003S abstractC5003S = c5012g.f40670a;
                        c5013h.getClass();
                        View view = abstractC5003S.f40590a;
                        int i = c5012g.f40673d - c5012g.f40671b;
                        int i6 = c5012g.f40674e - c5012g.f40672c;
                        if (i != 0) {
                            view.animate().translationX(0.0f);
                        }
                        if (i6 != 0) {
                            view.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator animate = view.animate();
                        c5013h.f40684p.add(abstractC5003S);
                        animate.setDuration(c5013h.f40783e).setListener(new C5009d(c5013h, abstractC5003S, i, view, i6, animate)).start();
                    }
                }
            case 1:
                ArrayList arrayList2 = this.f40642u;
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    boolean hasNext2 = it2.hasNext();
                    C5013h c5013h2 = this.f40643v;
                    if (!hasNext2) {
                        arrayList2.clear();
                        c5013h2.f40682n.remove(arrayList2);
                        break;
                    } else {
                        C5011f c5011f = (C5011f) it2.next();
                        c5013h2.getClass();
                        AbstractC5003S abstractC5003S2 = c5011f.f40664a;
                        View view2 = abstractC5003S2 == null ? null : abstractC5003S2.f40590a;
                        AbstractC5003S abstractC5003S3 = c5011f.f40665b;
                        View view3 = abstractC5003S3 != null ? abstractC5003S3.f40590a : null;
                        ArrayList arrayList3 = c5013h2.f40686r;
                        long j6 = c5013h2.f40784f;
                        if (view2 != null) {
                            ViewPropertyAnimator duration = view2.animate().setDuration(j6);
                            arrayList3.add(c5011f.f40664a);
                            duration.translationX(c5011f.f40668e - c5011f.f40666c);
                            duration.translationY(c5011f.f40669f - c5011f.f40667d);
                            duration.alpha(0.0f).setListener(new C5010e(c5013h2, c5011f, duration, view2, 0)).start();
                        }
                        if (view3 != null) {
                            ViewPropertyAnimator animate2 = view3.animate();
                            arrayList3.add(c5011f.f40665b);
                            animate2.translationX(0.0f).translationY(0.0f).setDuration(j6).alpha(1.0f).setListener(new C5010e(c5013h2, c5011f, animate2, view3, 1)).start();
                        }
                    }
                }
            default:
                ArrayList arrayList4 = this.f40642u;
                Iterator it3 = arrayList4.iterator();
                while (true) {
                    boolean hasNext3 = it3.hasNext();
                    C5013h c5013h3 = this.f40643v;
                    if (!hasNext3) {
                        arrayList4.clear();
                        c5013h3.f40680l.remove(arrayList4);
                        break;
                    } else {
                        AbstractC5003S abstractC5003S4 = (AbstractC5003S) it3.next();
                        c5013h3.getClass();
                        View view4 = abstractC5003S4.f40590a;
                        ViewPropertyAnimator animate3 = view4.animate();
                        c5013h3.f40683o.add(abstractC5003S4);
                        animate3.alpha(1.0f).setDuration(c5013h3.f40781c).setListener(new C5008c(c5013h3, abstractC5003S4, view4, animate3)).start();
                    }
                }
        }
    }
}
