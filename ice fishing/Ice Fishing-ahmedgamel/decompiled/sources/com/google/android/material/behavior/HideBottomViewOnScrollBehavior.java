package com.google.android.material.behavior;

import B.b;
import D.x;
import D0.k;
import N3.C;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.IceFishing.LiveIceFishing.C5248R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import n3.AbstractC4770a;

/* loaded from: classes2.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends b {

    /* renamed from: b, reason: collision with root package name */
    public int f36584b;

    /* renamed from: c, reason: collision with root package name */
    public int f36585c;

    /* renamed from: d, reason: collision with root package name */
    public TimeInterpolator f36586d;

    /* renamed from: e, reason: collision with root package name */
    public TimeInterpolator f36587e;

    /* renamed from: h, reason: collision with root package name */
    public ViewPropertyAnimator f36590h;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f36583a = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public int f36588f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f36589g = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // B.b
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.f36588f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f36584b = C.R(view.getContext(), C5248R.attr.motionDurationLong2, 225);
        this.f36585c = C.R(view.getContext(), C5248R.attr.motionDurationMedium4, 175);
        this.f36586d = C.S(view.getContext(), C5248R.attr.motionEasingEmphasizedInterpolator, AbstractC4770a.f39644d);
        this.f36587e = C.S(view.getContext(), C5248R.attr.motionEasingEmphasizedInterpolator, AbstractC4770a.f39643c);
        return false;
    }

    @Override // B.b
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i, int i4, int i6, int[] iArr) {
        LinkedHashSet linkedHashSet = this.f36583a;
        if (i > 0) {
            if (this.f36589g == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.f36590h;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.f36589g = 1;
            Iterator it = linkedHashSet.iterator();
            if (it.hasNext()) {
                throw x.i(it);
            }
            this.f36590h = view.animate().translationY(this.f36588f).setInterpolator(this.f36587e).setDuration(this.f36585c).setListener(new k(4, this));
            return;
        }
        if (i >= 0 || this.f36589g == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.f36590h;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            view.clearAnimation();
        }
        this.f36589g = 2;
        Iterator it2 = linkedHashSet.iterator();
        if (it2.hasNext()) {
            throw x.i(it2);
        }
        this.f36590h = view.animate().translationY(0).setInterpolator(this.f36586d).setDuration(this.f36584b).setListener(new k(4, this));
    }

    @Override // B.b
    public boolean o(int i, int i4, View view) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
