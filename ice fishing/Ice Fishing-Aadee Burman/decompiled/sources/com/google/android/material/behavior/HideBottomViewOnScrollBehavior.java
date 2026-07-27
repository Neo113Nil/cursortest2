package com.google.android.material.behavior;

import B.b;
import D.y;
import D0.k;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.icefishing.icefishinglive2.C5275R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import l3.AbstractC4661a;
import t8.g;

/* loaded from: classes2.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends b {

    /* renamed from: b, reason: collision with root package name */
    public int f35816b;

    /* renamed from: c, reason: collision with root package name */
    public int f35817c;

    /* renamed from: d, reason: collision with root package name */
    public TimeInterpolator f35818d;

    /* renamed from: e, reason: collision with root package name */
    public TimeInterpolator f35819e;

    /* renamed from: h, reason: collision with root package name */
    public ViewPropertyAnimator f35822h;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f35815a = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public int f35820f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f35821g = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // B.b
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.f35820f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f35816b = g.D(view.getContext(), C5275R.attr.motionDurationLong2, 225);
        this.f35817c = g.D(view.getContext(), C5275R.attr.motionDurationMedium4, 175);
        this.f35818d = g.E(view.getContext(), C5275R.attr.motionEasingEmphasizedInterpolator, AbstractC4661a.f38906d);
        this.f35819e = g.E(view.getContext(), C5275R.attr.motionEasingEmphasizedInterpolator, AbstractC4661a.f38905c);
        return false;
    }

    @Override // B.b
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i, int i6, int i9, int[] iArr) {
        LinkedHashSet linkedHashSet = this.f35815a;
        if (i > 0) {
            if (this.f35821g == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.f35822h;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.f35821g = 1;
            Iterator it = linkedHashSet.iterator();
            if (it.hasNext()) {
                throw y.j(it);
            }
            this.f35822h = view.animate().translationY(this.f35820f).setInterpolator(this.f35819e).setDuration(this.f35817c).setListener(new k(4, this));
            return;
        }
        if (i >= 0 || this.f35821g == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.f35822h;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            view.clearAnimation();
        }
        this.f35821g = 2;
        Iterator it2 = linkedHashSet.iterator();
        if (it2.hasNext()) {
            throw y.j(it2);
        }
        this.f35822h = view.animate().translationY(0).setInterpolator(this.f35818d).setDuration(this.f35816b).setListener(new k(4, this));
    }

    @Override // B.b
    public boolean o(int i, int i6, View view) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
