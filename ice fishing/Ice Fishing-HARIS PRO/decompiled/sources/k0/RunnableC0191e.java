package k0;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: k0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0191e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3474a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f3475b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0197k f3476c;

    public /* synthetic */ RunnableC0191e(C0197k c0197k, ArrayList arrayList, int i) {
        this.f3474a = i;
        this.f3476c = c0197k;
        this.f3475b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it;
        switch (this.f3474a) {
            case 0:
                ArrayList arrayList = this.f3475b;
                Iterator it2 = arrayList.iterator();
                while (true) {
                    boolean hasNext = it2.hasNext();
                    C0197k c0197k = this.f3476c;
                    if (!hasNext) {
                        arrayList.clear();
                        c0197k.f3529m.remove(arrayList);
                        break;
                    } else {
                        C0196j c0196j = (C0196j) it2.next();
                        b0 b0Var = c0196j.f3514a;
                        c0197k.getClass();
                        View view = b0Var.f3449a;
                        int i = c0196j.f3517d - c0196j.f3515b;
                        int i2 = c0196j.e - c0196j.f3516c;
                        if (i != 0) {
                            view.animate().translationX(RecyclerView.f2111C0);
                        }
                        if (i2 != 0) {
                            view.animate().translationY(RecyclerView.f2111C0);
                        }
                        ViewPropertyAnimator animate = view.animate();
                        c0197k.f3532p.add(b0Var);
                        animate.setDuration(c0197k.e).setListener(new C0193g(c0197k, b0Var, i, view, i2, animate)).start();
                    }
                }
            case 1:
                ArrayList arrayList2 = this.f3475b;
                Iterator it3 = arrayList2.iterator();
                while (true) {
                    boolean hasNext2 = it3.hasNext();
                    C0197k c0197k2 = this.f3476c;
                    if (!hasNext2) {
                        arrayList2.clear();
                        c0197k2.f3530n.remove(arrayList2);
                        break;
                    } else {
                        C0195i c0195i = (C0195i) it3.next();
                        c0197k2.getClass();
                        b0 b0Var2 = c0195i.f3502a;
                        View view2 = b0Var2 == null ? null : b0Var2.f3449a;
                        b0 b0Var3 = c0195i.f3503b;
                        View view3 = b0Var3 != null ? b0Var3.f3449a : null;
                        ArrayList arrayList3 = c0197k2.f3534r;
                        long j = c0197k2.f3377f;
                        if (view2 != null) {
                            ViewPropertyAnimator duration = view2.animate().setDuration(j);
                            arrayList3.add(c0195i.f3502a);
                            duration.translationX(c0195i.e - c0195i.f3504c);
                            duration.translationY(c0195i.f3506f - c0195i.f3505d);
                            it = it3;
                            duration.alpha(RecyclerView.f2111C0).setListener(new C0194h(c0197k2, c0195i, duration, view2, 0)).start();
                        } else {
                            it = it3;
                        }
                        if (view3 != null) {
                            ViewPropertyAnimator animate2 = view3.animate();
                            arrayList3.add(c0195i.f3503b);
                            animate2.translationX(RecyclerView.f2111C0).translationY(RecyclerView.f2111C0).setDuration(j).alpha(1.0f).setListener(new C0194h(c0197k2, c0195i, animate2, view3, 1)).start();
                        }
                        it3 = it;
                    }
                }
            default:
                ArrayList arrayList4 = this.f3475b;
                Iterator it4 = arrayList4.iterator();
                while (true) {
                    boolean hasNext3 = it4.hasNext();
                    C0197k c0197k3 = this.f3476c;
                    if (!hasNext3) {
                        arrayList4.clear();
                        c0197k3.f3528l.remove(arrayList4);
                        break;
                    } else {
                        b0 b0Var4 = (b0) it4.next();
                        c0197k3.getClass();
                        View view4 = b0Var4.f3449a;
                        ViewPropertyAnimator animate3 = view4.animate();
                        c0197k3.f3531o.add(b0Var4);
                        animate3.alpha(1.0f).setDuration(c0197k3.f3375c).setListener(new C0192f(c0197k3, b0Var4, view4, animate3)).start();
                    }
                }
        }
    }
}
