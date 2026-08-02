package ru.yandex.taxi.transition;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import defpackage.a850;
import defpackage.aos0;
import defpackage.av31;
import defpackage.bh11;
import defpackage.bo31;
import defpackage.dzt0;
import defpackage.hek0;
import defpackage.jst;
import defpackage.ooc;
import defpackage.oy01;
import defpackage.qor0;
import defpackage.tcc;
import defpackage.x43;
import defpackage.xg;
import defpackage.yu31;
import defpackage.zu31;
import defpackage.zv31;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import ru.yandex.taxi.animation.NavigationDirection;
import ru.yandex.taxi.transition.AttachableViewHolder;
import ru.yandex.taxi.widget.InsetsAwareFrameLayout;

/* loaded from: classes6.dex */
public final class c {
    public final a850 a;
    public final dzt0 b;
    public final x43 c = new x43();
    public final zv31 d;
    public b e;
    public oy01 f;
    public oy01 g;
    public final ArrayList h;
    public b i;
    public b j;
    public final yu31 k;
    public boolean l;

    public c(InsetsAwareFrameLayout insetsAwareFrameLayout, a850 a850Var, dzt0 dzt0Var) {
        this.a = a850Var;
        this.b = dzt0Var;
        zv31 zv31Var = new zv31(insetsAwareFrameLayout);
        this.d = zv31Var;
        aos0 aos0Var = aos0.e;
        this.f = ooc.n(NavigationDirection.FORWARD);
        this.g = ooc.n(NavigationDirection.BACKWARD);
        this.h = new ArrayList();
        zv31Var.a(new bh11(27, this), "ViewStackController");
        ViewParent parent = insetsAwareFrameLayout.getParent();
        this.k = new yu31(new xg(), insetsAwareFrameLayout, parent instanceof ViewGroup ? (ViewGroup) parent : null);
    }

    public final void a(Runnable runnable) {
        b bVar = this.e;
        x43 x43Var = this.c;
        if (bVar == null && x43Var.isEmpty()) {
            return;
        }
        b bVar2 = this.e;
        if (bVar2 != null) {
            bVar2.M1(new AttachableViewHolder.b(2, runnable));
            this.e = null;
        }
        ArrayList arrayList = new ArrayList(tcc.n(x43Var, 10));
        Iterator it = x43Var.iterator();
        while (it.hasNext()) {
            arrayList.add(((av31) it.next()).screenName());
        }
        x43Var.clear();
        this.a.k(arrayList);
        yu31 yu31Var = this.k;
        int i = yu31Var.d - 1;
        yu31Var.d = i;
        if (i == 0) {
            yu31Var.a.c(yu31Var.b);
        }
        Iterator it2 = this.h.iterator();
        while (it2.hasNext()) {
            ((zu31) it2.next()).B8();
        }
    }

    public final void b(av31 av31Var, int i) {
        c(i, Collections.singletonList(av31Var));
    }

    public final void c(int i, Collection collection) {
        a850 a850Var;
        b bVar = this.e;
        if (bVar != null) {
            this.i = bVar;
            bVar.M1(new AttachableViewHolder.b(7, null));
        }
        x43 x43Var = this.c;
        boolean isEmpty = x43Var.isEmpty();
        int min = Math.min(i, x43Var.size());
        int i2 = 0;
        while (true) {
            a850Var = this.a;
            if (i2 >= min) {
                break;
            }
            a850Var.d(((av31) x43Var.removeLast()).screenName());
            i2++;
        }
        x43Var.addAll(collection);
        av31 av31Var = (av31) x43Var.h();
        if (av31Var == null) {
            return;
        }
        if (isEmpty && this.e == null) {
            yu31 yu31Var = this.k;
            yu31Var.d++;
            yu31Var.a();
        }
        d(((qor0) this.b).e(av31Var), new AttachableViewHolder.a(), this.f);
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList(tcc.n(collection2, 10));
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(((av31) it.next()).screenName());
        }
        a850Var.j(min, arrayList);
    }

    public final void d(b bVar, AttachableViewHolder.a aVar, oy01 oy01Var) {
        this.e = bVar;
        this.j = bVar;
        View h = bVar.h();
        this.l = false;
        boolean z = this.e == null;
        zv31 zv31Var = this.d;
        InsetsAwareFrameLayout insetsAwareFrameLayout = zv31Var.c;
        if (zv31Var.c()) {
            ValueAnimator valueAnimator = zv31Var.a;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            oy01Var = oy01.a;
        }
        oy01 oy01Var2 = oy01Var;
        View childAt = insetsAwareFrameLayout.getChildAt(0);
        zv31Var.d = childAt;
        if (childAt == h) {
            zv31Var.d = null;
            zv31Var.e();
        } else {
            if (h != null) {
                insetsAwareFrameLayout.addView(h);
            }
            View view = zv31Var.d;
            if (view == null) {
                zv31Var.e();
            } else {
                zv31Var.e = new bo31(4, ru.yandex.taxi.design.utils.c.f(h == null ? view : h, new hek0(zv31Var, view, h, oy01Var2, 10)), zv31Var);
            }
        }
        if (this.e == null && !z) {
            jst.e.n("Current became null after transitionManager.putView");
        }
        b bVar2 = this.i;
        boolean z2 = (bVar2 == null && this.j == null) ? false : true;
        this.l = z2;
        if (z2) {
            if (bVar2 != null) {
                bVar2.s5(AttachableViewHolder.TransitionType.DISAPPEAR);
            }
            b bVar3 = this.j;
            if (bVar3 != null) {
                bVar3.s5(AttachableViewHolder.TransitionType.APPEAR);
            }
        }
        b bVar4 = this.e;
        if (bVar4 != null) {
            bVar4.I(aVar);
        }
    }
}
