package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.gamericefishpro.space.R;
import com.gamericefishpro.space.i2.x1;
import com.gamericefishpro.space.i6.i;
import com.gamericefishpro.space.i9.d5;
import com.gamericefishpro.space.p3.a;
import com.gamericefishpro.space.p3.c;
import com.gamericefishpro.space.t0.y0;
import com.gamericefishpro.space.v9.b;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class HideViewOnScrollBehavior<V extends View> extends a {
    public d5 a;
    public AccessibilityManager b;
    public com.gamericefishpro.space.v9.a c;
    public int e;
    public int f;
    public TimeInterpolator g;
    public TimeInterpolator h;
    public ViewPropertyAnimator k;
    public final LinkedHashSet d = new LinkedHashSet();
    public int i = 0;
    public int j = 2;

    public HideViewOnScrollBehavior() {
    }

    @Override // com.gamericefishpro.space.p3.a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (this.b == null) {
            this.b = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.b;
        if (accessibilityManager != null && this.c == null) {
            com.gamericefishpro.space.v9.a aVar = new com.gamericefishpro.space.v9.a(this, view, 1);
            this.c = aVar;
            accessibilityManager.addTouchExplorationStateChangeListener(aVar);
            view.addOnAttachStateChangeListener(new x1(7, this));
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i2 = ((c) view.getLayoutParams()).c;
        if (i2 == 80 || i2 == 81) {
            r(1);
        } else {
            int absoluteGravity = Gravity.getAbsoluteGravity(i2, i);
            r((absoluteGravity == 3 || absoluteGravity == 19) ? 2 : 0);
        }
        this.i = this.a.F(view, marginLayoutParams);
        this.e = com.gamericefishpro.space.a.a.B(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f = com.gamericefishpro.space.a.a.B(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.g = com.gamericefishpro.space.a.a.C(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, com.gamericefishpro.space.t9.a.d);
        this.h = com.gamericefishpro.space.a.a.C(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, com.gamericefishpro.space.t9.a.c);
        return false;
    }

    @Override // com.gamericefishpro.space.p3.a
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        if (i <= 0) {
            if (i < 0) {
                s(view);
                return;
            }
            return;
        }
        if (this.j == 1) {
            return;
        }
        AccessibilityManager accessibilityManager = this.b;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            ViewPropertyAnimator viewPropertyAnimator = this.k;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.j = 1;
            Iterator it = this.d.iterator();
            if (it.hasNext()) {
                throw com.gamericefishpro.space.m5.a.f(it);
            }
            this.k = this.a.J(view, this.i).setInterpolator(this.h).setDuration(this.f).setListener(new i(4, this));
        }
    }

    @Override // com.gamericefishpro.space.p3.a
    public final boolean o(View view, int i, int i2) {
        return i == 2;
    }

    public final void r(int i) {
        d5 d5Var = this.a;
        if (d5Var == null || d5Var.I() != i) {
            if (i == 0) {
                this.a = new b(2);
            } else if (i == 1) {
                this.a = new b(0);
            } else {
                if (i != 2) {
                    throw new IllegalArgumentException(y0.f(i, "Invalid view edge position value: ", ". Must be 0, 1 or 2."));
                }
                this.a = new b(1);
            }
        }
    }

    public final void s(View view) {
        if (this.j == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.k;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.j = 2;
        Iterator it = this.d.iterator();
        if (it.hasNext()) {
            throw com.gamericefishpro.space.m5.a.f(it);
        }
        this.a.getClass();
        this.k = this.a.J(view, 0).setInterpolator(this.g).setDuration(this.e).setListener(new i(4, this));
    }

    public HideViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
