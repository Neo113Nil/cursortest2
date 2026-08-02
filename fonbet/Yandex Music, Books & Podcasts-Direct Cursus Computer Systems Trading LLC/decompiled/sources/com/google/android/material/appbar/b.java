package com.google.android.material.appbar;

import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import defpackage.qb;
import defpackage.vb;

/* loaded from: classes3.dex */
public final class b extends androidx.core.view.a {
    public final /* synthetic */ AppBarLayout d;
    public final /* synthetic */ CoordinatorLayout e;
    public final /* synthetic */ AppBarLayout.BaseBehavior f;

    public b(CoordinatorLayout coordinatorLayout, AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout) {
        this.f = baseBehavior;
        this.d = appBarLayout;
        this.e = coordinatorLayout;
    }

    @Override // androidx.core.view.a
    public final void d(View view, vb vbVar) {
        View childWithScrollingBehavior;
        boolean childrenHaveScrollFlags;
        this.a.onInitializeAccessibilityNodeInfo(view, vbVar.a);
        vbVar.n(ScrollView.class.getName());
        AppBarLayout appBarLayout = this.d;
        if (appBarLayout.getTotalScrollRange() == 0) {
            return;
        }
        CoordinatorLayout coordinatorLayout = this.e;
        AppBarLayout.BaseBehavior baseBehavior = this.f;
        childWithScrollingBehavior = baseBehavior.getChildWithScrollingBehavior(coordinatorLayout);
        if (childWithScrollingBehavior == null) {
            return;
        }
        childrenHaveScrollFlags = baseBehavior.childrenHaveScrollFlags(appBarLayout);
        if (childrenHaveScrollFlags) {
            if (baseBehavior.getTopBottomOffsetForScrollingSibling() != (-appBarLayout.getTotalScrollRange())) {
                vbVar.b(qb.i);
                vbVar.w(true);
            }
            if (baseBehavior.getTopBottomOffsetForScrollingSibling() != 0) {
                if (!childWithScrollingBehavior.canScrollVertically(-1)) {
                    vbVar.b(qb.j);
                    vbVar.w(true);
                } else if ((-appBarLayout.getDownNestedPreScrollRange()) != 0) {
                    vbVar.b(qb.j);
                    vbVar.w(true);
                }
            }
        }
    }

    @Override // androidx.core.view.a
    public final boolean g(View view, int i, Bundle bundle) {
        View childWithScrollingBehavior;
        AppBarLayout appBarLayout = this.d;
        if (i == 4096) {
            appBarLayout.setExpanded(false);
            return true;
        }
        if (i != 8192) {
            return super.g(view, i, bundle);
        }
        AppBarLayout.BaseBehavior baseBehavior = this.f;
        if (baseBehavior.getTopBottomOffsetForScrollingSibling() != 0) {
            childWithScrollingBehavior = baseBehavior.getChildWithScrollingBehavior(this.e);
            if (!childWithScrollingBehavior.canScrollVertically(-1)) {
                appBarLayout.setExpanded(true);
                return true;
            }
            int i2 = -appBarLayout.getDownNestedPreScrollRange();
            if (i2 != 0) {
                baseBehavior.onNestedPreScroll(this.e, (CoordinatorLayout) this.d, childWithScrollingBehavior, 0, i2, new int[]{0, 0}, 1);
                return true;
            }
        }
        return false;
    }
}
