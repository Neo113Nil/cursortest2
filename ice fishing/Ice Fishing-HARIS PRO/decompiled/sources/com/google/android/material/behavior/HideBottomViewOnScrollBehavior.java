package com.google.android.material.behavior;

import B.c;
import a.AbstractC0078a;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.lumenpath.harispro.hrnavigator.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import v0.AbstractC0360a;

/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends c {

    /* renamed from: b, reason: collision with root package name */
    public int f2354b;

    /* renamed from: c, reason: collision with root package name */
    public int f2355c;

    /* renamed from: d, reason: collision with root package name */
    public TimeInterpolator f2356d;
    public TimeInterpolator e;

    /* renamed from: h, reason: collision with root package name */
    public ViewPropertyAnimator f2359h;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f2353a = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public int f2357f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f2358g = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // B.c
    public boolean k(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.f2357f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f2354b = AbstractC0078a.W(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f2355c = AbstractC0078a.W(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.f2356d = AbstractC0078a.X(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0360a.f4483d);
        this.e = AbstractC0078a.X(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0360a.f4482c);
        return false;
    }

    @Override // B.c
    public final void o(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        LinkedHashSet linkedHashSet = this.f2353a;
        if (i > 0) {
            if (this.f2358g == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.f2359h;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.f2358g = 1;
            Iterator it = linkedHashSet.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            this.f2359h = view.animate().translationY(this.f2357f).setInterpolator(this.e).setDuration(this.f2355c).setListener(new B0.c(8, this));
            return;
        }
        if (i >= 0 || this.f2358g == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.f2359h;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            view.clearAnimation();
        }
        this.f2358g = 2;
        Iterator it2 = linkedHashSet.iterator();
        if (it2.hasNext()) {
            it2.next().getClass();
            throw new ClassCastException();
        }
        this.f2359h = view.animate().translationY(0).setInterpolator(this.f2356d).setDuration(this.f2354b).setListener(new B0.c(8, this));
    }

    @Override // B.c
    public boolean s(View view, int i, int i2) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
