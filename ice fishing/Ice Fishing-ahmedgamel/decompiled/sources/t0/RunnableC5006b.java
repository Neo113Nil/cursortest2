package t0;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: t0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC5006b implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f40698n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ArrayList f40699u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C5012h f40700v;

    public /* synthetic */ RunnableC5006b(C5012h c5012h, ArrayList arrayList, int i) {
        this.f40698n = i;
        this.f40700v = c5012h;
        this.f40699u = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f40698n) {
            case 0:
                ArrayList arrayList = this.f40699u;
                Iterator it = arrayList.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    C5012h c5012h = this.f40700v;
                    if (!hasNext) {
                        arrayList.clear();
                        c5012h.f40734m.remove(arrayList);
                        break;
                    } else {
                        C5011g c5011g = (C5011g) it.next();
                        AbstractC5000P abstractC5000P = c5011g.f40723a;
                        c5012h.getClass();
                        View view = abstractC5000P.f40643a;
                        int i = c5011g.f40726d - c5011g.f40724b;
                        int i4 = c5011g.f40727e - c5011g.f40725c;
                        if (i != 0) {
                            view.animate().translationX(0.0f);
                        }
                        if (i4 != 0) {
                            view.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator animate = view.animate();
                        c5012h.f40737p.add(abstractC5000P);
                        animate.setDuration(c5012h.f40835e).setListener(new C5008d(c5012h, abstractC5000P, i, view, i4, animate)).start();
                    }
                }
            case 1:
                ArrayList arrayList2 = this.f40699u;
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    boolean hasNext2 = it2.hasNext();
                    C5012h c5012h2 = this.f40700v;
                    if (!hasNext2) {
                        arrayList2.clear();
                        c5012h2.f40735n.remove(arrayList2);
                        break;
                    } else {
                        C5010f c5010f = (C5010f) it2.next();
                        c5012h2.getClass();
                        AbstractC5000P abstractC5000P2 = c5010f.f40717a;
                        View view2 = abstractC5000P2 == null ? null : abstractC5000P2.f40643a;
                        AbstractC5000P abstractC5000P3 = c5010f.f40718b;
                        View view3 = abstractC5000P3 != null ? abstractC5000P3.f40643a : null;
                        ArrayList arrayList3 = c5012h2.f40739r;
                        long j6 = c5012h2.f40836f;
                        if (view2 != null) {
                            ViewPropertyAnimator duration = view2.animate().setDuration(j6);
                            arrayList3.add(c5010f.f40717a);
                            duration.translationX(c5010f.f40721e - c5010f.f40719c);
                            duration.translationY(c5010f.f40722f - c5010f.f40720d);
                            duration.alpha(0.0f).setListener(new C5009e(c5012h2, c5010f, duration, view2, 0)).start();
                        }
                        if (view3 != null) {
                            ViewPropertyAnimator animate2 = view3.animate();
                            arrayList3.add(c5010f.f40718b);
                            animate2.translationX(0.0f).translationY(0.0f).setDuration(j6).alpha(1.0f).setListener(new C5009e(c5012h2, c5010f, animate2, view3, 1)).start();
                        }
                    }
                }
            default:
                ArrayList arrayList4 = this.f40699u;
                Iterator it3 = arrayList4.iterator();
                while (true) {
                    boolean hasNext3 = it3.hasNext();
                    C5012h c5012h3 = this.f40700v;
                    if (!hasNext3) {
                        arrayList4.clear();
                        c5012h3.f40733l.remove(arrayList4);
                        break;
                    } else {
                        AbstractC5000P abstractC5000P4 = (AbstractC5000P) it3.next();
                        c5012h3.getClass();
                        View view4 = abstractC5000P4.f40643a;
                        ViewPropertyAnimator animate3 = view4.animate();
                        c5012h3.f40736o.add(abstractC5000P4);
                        animate3.alpha(1.0f).setDuration(c5012h3.f40833c).setListener(new C5007c(c5012h3, abstractC5000P4, view4, animate3)).start();
                    }
                }
        }
    }
}
