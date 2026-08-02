package ru.yandex.taxi.widget.modalview;

import android.view.View;
import android.widget.FrameLayout;
import defpackage.a130;
import defpackage.b130;
import defpackage.c130;
import defpackage.d130;
import defpackage.jl40;
import defpackage.jst;
import defpackage.kft0;
import defpackage.s45;
import defpackage.u45;
import defpackage.unr0;
import defpackage.v030;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.WeakHashMap;
import ru.yandex.taxi.widget.ModalView;
import ru.yandex.taxi.widget.SlideableModalView;

/* loaded from: classes10.dex */
public final class b extends s45 {
    public final c130 a;
    public ModalViewCoordinatorImpl$OnAppearingListener$Step b = ModalViewCoordinatorImpl$OnAppearingListener$Step.INITIAL;
    public final /* synthetic */ u45 c;
    public final /* synthetic */ s45 d;
    public final /* synthetic */ b130 e;
    public final /* synthetic */ d130 f;

    public b(u45 u45Var, s45 s45Var, b130 b130Var, d130 d130Var, c130 c130Var) {
        this.c = u45Var;
        this.d = s45Var;
        this.e = b130Var;
        this.f = d130Var;
        this.a = c130Var;
    }

    @Override // defpackage.s45
    public final void a(int i) {
        if (e(ModalViewCoordinatorImpl$OnAppearingListener$Step.APPEARED)) {
            this.d.a(i);
            boolean z = this.e.c;
            d130 d130Var = this.f;
            if (z) {
                a130 a130Var = d130Var.g;
                FrameLayout frameLayout = d130Var.f;
                a130Var.e++;
                a130Var.a.a(frameLayout, a130Var.b, a130Var.c);
            }
            u45 u45Var = this.c;
            if (u45Var instanceof ModalView) {
                ModalView modalView = (ModalView) u45Var;
                boolean z2 = ((float) modalView.getContentViewHeight()) / ((float) modalView.getMeasuredHeight()) >= 0.8f;
                Iterator it = d130Var.j.iterator();
                while (it.hasNext()) {
                    ((kft0) it.next()).a(z2);
                }
            }
        }
    }

    @Override // defpackage.s45
    public final void b() {
        if (e(ModalViewCoordinatorImpl$OnAppearingListener$Step.DISAPPEARED)) {
            d130 d130Var = this.f;
            FrameLayout frameLayout = d130Var.f;
            a130 a130Var = d130Var.g;
            b130 b130Var = this.e;
            if (b130Var.c) {
                a130Var.a(frameLayout);
            }
            u45 u45Var = b130Var.a;
            if ((u45Var instanceof SlideableModalView) && ((SlideableModalView) u45Var).getIsLastReportedStateExpanded()) {
                a130Var.a(frameLayout);
            }
            this.d.b();
            b130 t = d130Var.t();
            if (t == null || t.d) {
                d130Var.w();
            } else {
                d130Var.h();
            }
            Iterator it = d130Var.j.iterator();
            while (it.hasNext()) {
                ((kft0) it.next()).a(false);
            }
        }
    }

    @Override // defpackage.s45
    public final void c() {
        this.d.c();
        d130 d130Var = this.f;
        b130 t = d130Var.t();
        b130 b130Var = this.e;
        boolean l = jl40.l(t, b130Var);
        c130 c130Var = d130Var.l;
        if (l) {
            b130Var = (b130) c130Var.a.poll();
        } else {
            c130Var.a.remove(b130Var);
        }
        if (b130Var == null) {
            jst.e.x(new NoSuchElementException(), "viewStack is empty");
        }
        a130 a130Var = d130Var.g;
        Object u = d130Var.u();
        View view = u instanceof View ? (View) u : null;
        WeakHashMap weakHashMap = a130Var.d;
        if (view != null && weakHashMap.containsKey(view)) {
            Integer num = (Integer) weakHashMap.get(view);
            view.setImportantForAccessibility(num != null ? num.intValue() : 0);
            weakHashMap.remove(view);
        }
        u45 u45Var = b130Var != null ? b130Var.a : null;
        u45 u2 = d130Var.u();
        ModalViewCoordinator$StackChangeType modalViewCoordinator$StackChangeType = ModalViewCoordinator$StackChangeType.POLL;
        Iterator it = d130Var.i.iterator();
        while (it.hasNext()) {
            ((v030) it.next()).a(u45Var, u2, modalViewCoordinator$StackChangeType);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.s45
    public final void d() {
        this.d.d();
        d130 d130Var = this.f;
        u45 u = d130Var.u();
        a130 a130Var = d130Var.g;
        View view = u instanceof View ? (View) u : null;
        a130Var.getClass();
        if (view != null) {
            a130Var.d.put(view, Integer.valueOf(view.getImportantForAccessibility()));
            view.setImportantForAccessibility(4);
        }
        d130Var.l.a.push(this.e);
        u45 u2 = d130Var.u();
        ModalViewCoordinator$StackChangeType modalViewCoordinator$StackChangeType = ModalViewCoordinator$StackChangeType.PUSH;
        Iterator it = d130Var.i.iterator();
        while (it.hasNext()) {
            ((v030) it.next()).a(u, u2, modalViewCoordinator$StackChangeType);
        }
    }

    public final boolean e(ModalViewCoordinatorImpl$OnAppearingListener$Step modalViewCoordinatorImpl$OnAppearingListener$Step) {
        if (!this.a.c) {
            return false;
        }
        int i = a.a[modalViewCoordinatorImpl$OnAppearingListener$Step.ordinal()];
        if (i != 1) {
            if (i == 2 && this.b == ModalViewCoordinatorImpl$OnAppearingListener$Step.APPEARED) {
                this.b = ModalViewCoordinatorImpl$OnAppearingListener$Step.DISAPPEARED;
                return true;
            }
        } else if (this.b == ModalViewCoordinatorImpl$OnAppearingListener$Step.INITIAL) {
            this.b = ModalViewCoordinatorImpl$OnAppearingListener$Step.APPEARED;
            return true;
        }
        unr0.D(new Object[0], 0, this.c.getClass().getName() + ": There is no move from step " + this.b + " to step " + modalViewCoordinatorImpl$OnAppearingListener$Step, jst.e, new IllegalStateException("OnAppearingListener wrong state"));
        return false;
    }
}
