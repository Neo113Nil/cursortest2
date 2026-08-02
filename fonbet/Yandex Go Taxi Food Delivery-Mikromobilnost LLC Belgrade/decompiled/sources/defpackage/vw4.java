package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.h;
import androidx.recyclerview.widget.x0;
import defpackage.vw4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class vw4 extends h {
    public final ArrayList t = new ArrayList();
    public final ArrayList u = new ArrayList();
    public final ArrayList v = new ArrayList();
    public final ArrayList w = new ArrayList();
    public final ArrayList x = new ArrayList();

    public static void A(ArrayList arrayList) {
        int size = arrayList.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i = size - 1;
            ((x0) arrayList.get(size)).a.animate().cancel();
            if (i < 0) {
                return;
            } else {
                size = i;
            }
        }
    }

    public abstract ViewPropertyAnimator B(x0 x0Var);

    public abstract ViewPropertyAnimator C(x0 x0Var);

    public abstract void D(x0 x0Var);

    public abstract void E(x0 x0Var);

    public boolean F() {
        return super.m();
    }

    public abstract boolean G(x0 x0Var);

    public abstract boolean H(x0 x0Var);

    @Override // androidx.recyclerview.widget.h, androidx.recyclerview.widget.RecyclerView.c
    public final void j(x0 x0Var) {
        x0Var.a.animate().cancel();
        if (this.t.remove(x0Var)) {
            D(x0Var);
            h(x0Var);
        }
        if (this.u.remove(x0Var)) {
            D(x0Var);
            s(x0Var);
        }
        ArrayList arrayList = this.v;
        int size = arrayList.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                List list = (List) arrayList.get(size);
                if (list.remove(x0Var)) {
                    D(x0Var);
                    s(x0Var);
                    if (list.isEmpty()) {
                        arrayList.remove(size);
                    }
                }
                if (i < 0) {
                    break;
                } else {
                    size = i;
                }
            }
        }
        if (this.x.remove(x0Var)) {
            xby.d.k(new IllegalStateException("after animation is cancelled, item should not be in removeAnimations list"), "after animation is cancelled, item should not be in removeAnimations list");
        }
        if (this.w.remove(x0Var)) {
            xby.d.k(new IllegalStateException("after animation is cancelled, item should not be in mAddAnimations list"), "after animation is cancelled, item should not be in mAddAnimations list");
        }
        super.j(x0Var);
    }

    @Override // androidx.recyclerview.widget.h, androidx.recyclerview.widget.RecyclerView.c
    public void k() {
        ArrayList arrayList = this.t;
        int size = arrayList.size();
        while (true) {
            size--;
            if (-1 >= size) {
                break;
            }
            x0 x0Var = (x0) arrayList.get(size);
            D(x0Var);
            h(x0Var);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.u;
        for (int size2 = arrayList2.size() - 1; -1 < size2; size2--) {
            x0 x0Var2 = (x0) arrayList2.get(size2);
            D(x0Var2);
            s(x0Var2);
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.v;
        for (int size3 = arrayList3.size() - 1; -1 < size3; size3--) {
            List list = (List) arrayList3.get(size3);
            for (int size4 = list.size() - 1; -1 < size4; size4--) {
                x0 x0Var3 = (x0) list.get(size4);
                D(x0Var3);
                s(x0Var3);
                list.remove(size4);
                if (list.isEmpty()) {
                    arrayList3.remove(size3);
                }
            }
        }
        A(this.x);
        A(this.w);
        super.k();
    }

    @Override // androidx.recyclerview.widget.h, androidx.recyclerview.widget.RecyclerView.c
    public final boolean m() {
        return (!super.m() && this.u.isEmpty() && this.t.isEmpty() && this.w.isEmpty() && this.x.isEmpty() && this.v.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.h, androidx.recyclerview.widget.RecyclerView.c
    public final void n() {
        ArrayList arrayList = this.t;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            final x0 x0Var = (x0) it.next();
            final View view = x0Var.a;
            final ViewPropertyAnimator C = C(x0Var);
            this.x.add(x0Var);
            C.setListener(new AnimatorListenerAdapter() { // from class: ru.yandex.taxi.animation.BaseAddItemAnimator$applyRemoveAnimation$1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    C.setListener(null);
                    view.setAlpha(1.0f);
                    view.setTranslationX(0.0f);
                    vw4.this.h(x0Var);
                    vw4.this.x.remove(x0Var);
                    vw4 vw4Var = vw4.this;
                    if (vw4Var.m()) {
                        return;
                    }
                    vw4Var.i();
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    vw4.this.getClass();
                }
            }).start();
        }
        arrayList.clear();
        super.n();
        ArrayList arrayList2 = this.u;
        if (arrayList2.isEmpty()) {
            return;
        }
        ArrayList arrayList3 = new ArrayList(arrayList2);
        this.v.add(arrayList3);
        arrayList2.clear();
        if (!F()) {
            z(arrayList3);
            return;
        }
        ((x0) arrayList3.get(0)).a.postOnAnimationDelayed(new mh3(8, this, arrayList3), Math.max(this.e, this.f) + this.d);
    }

    @Override // androidx.recyclerview.widget.h, androidx.recyclerview.widget.b1
    public final boolean o(x0 x0Var) {
        if (!G(x0Var)) {
            super.o(x0Var);
            return true;
        }
        j(x0Var);
        E(x0Var);
        this.u.add(x0Var);
        return true;
    }

    @Override // androidx.recyclerview.widget.h, androidx.recyclerview.widget.b1
    public final boolean r(x0 x0Var) {
        if (!H(x0Var)) {
            super.r(x0Var);
            return true;
        }
        j(x0Var);
        this.t.add(x0Var);
        return true;
    }

    public final void z(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            final x0 x0Var = (x0) it.next();
            final ViewPropertyAnimator B = B(x0Var);
            this.w.add(x0Var);
            B.setListener(new AnimatorListenerAdapter() { // from class: ru.yandex.taxi.animation.BaseAddItemAnimator$applyAddAnimation$1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    vw4.this.D(x0Var);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    B.setListener(null);
                    vw4.this.s(x0Var);
                    vw4.this.w.remove(x0Var);
                    vw4 vw4Var = vw4.this;
                    if (vw4Var.m()) {
                        return;
                    }
                    vw4Var.i();
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    vw4.this.getClass();
                }
            }).start();
        }
        arrayList.clear();
        this.v.remove(arrayList);
    }
}
