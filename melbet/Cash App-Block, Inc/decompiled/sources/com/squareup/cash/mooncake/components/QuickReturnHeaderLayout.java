package com.squareup.cash.mooncake.components;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.NestedScrollingChildHelper;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.squareup.cash.R;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda5;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class QuickReturnHeaderLayout extends CoordinatorLayout {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final AppBarLayout appBarLayout;
    public final Lazy childHelper$delegate;
    public final CollapsingToolbarLayout collapsingToolbarLayout;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickReturnHeaderLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.childHelper$delegate = LazyKt.lazy(new MoneyTabUIKt$$ExternalSyntheticLambda5(this, 11));
        AppBarLayout appBarLayout = new AppBarLayout(context);
        appBarLayout.setId(R.id.quickreturnlayout_appbarlayout);
        appBarLayout.setStateListAnimator(null);
        appBarLayout.setBackground(null);
        appBarLayout.setLayoutParams(new CoordinatorLayout.LayoutParams(-1));
        this.appBarLayout = appBarLayout;
        CollapsingToolbarLayout collapsingToolbarLayout = new CollapsingToolbarLayout(context);
        AppBarLayout.LayoutParams layoutParams = new AppBarLayout.LayoutParams();
        layoutParams.scrollFlags = 7;
        collapsingToolbarLayout.setLayoutParams(layoutParams);
        this.collapsingToolbarLayout = collapsingToolbarLayout;
        appBarLayout.addView(collapsingToolbarLayout);
        addView(appBarLayout);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        CollapsingToolbarLayout.LayoutParams layoutParams2;
        view.getClass();
        CollapsingToolbarLayout collapsingToolbarLayout = this.collapsingToolbarLayout;
        if (collapsingToolbarLayout.getChildCount() != 0 && getChildCount() > 2) {
            a$$ExternalSyntheticBUOutline0.m$3("Can't have more than 2 children");
            return;
        }
        if (view instanceof ScrollView) {
            a$$ExternalSyntheticBUOutline0.m$3("Use NestedScrollView instead.");
            return;
        }
        View view2 = this.appBarLayout;
        if (view == view2) {
            super.addView(view, i, layoutParams);
            return;
        }
        if (view.isNestedScrollingEnabled()) {
            super.addView(view, indexOfChild(view2) + 1, layoutParams);
            ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
            if (layoutParams3 == null) {
                a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
                return;
            }
            CoordinatorLayout.LayoutParams layoutParams4 = (CoordinatorLayout.LayoutParams) layoutParams3;
            layoutParams4.setBehavior(new AppBarLayout.ScrollingViewBehavior());
            view.setLayoutParams(layoutParams4);
            return;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            layoutParams2 = new CollapsingToolbarLayout.LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
            layoutParams2.collapseMode = 0;
            layoutParams2.parallaxMult = 0.5f;
        } else {
            layoutParams2 = new CollapsingToolbarLayout.LayoutParams(-2);
        }
        collapsingToolbarLayout.addView(view, 0, layoutParams2);
        ViewGroup.LayoutParams layoutParams5 = view.getLayoutParams();
        if (layoutParams5 == null) {
            a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type com.google.android.material.appbar.CollapsingToolbarLayout.LayoutParams");
            return;
        }
        CollapsingToolbarLayout.LayoutParams layoutParams6 = (CollapsingToolbarLayout.LayoutParams) layoutParams5;
        layoutParams6.collapseMode = 2;
        layoutParams6.parallaxMult = RecyclerView.DECELERATION_RATE;
        view.setLayoutParams(layoutParams6);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getId() != -1) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$1("QuickReturnLayout needs an ID so that its state can be retained");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, androidx.core.view.NestedScrollingParent3
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        view.getClass();
        iArr.getClass();
        super.onNestedScroll(view, i, i2, i3, i4, i5, iArr);
        ((NestedScrollingChildHelper) this.childHelper$delegate.getValue()).dispatchNestedScrollInternal(i, null, i2, i3, i4, iArr, i5);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, androidx.core.view.NestedScrollingParent2
    public final boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        view.getClass();
        view2.getClass();
        boolean onStartNestedScroll = super.onStartNestedScroll(view, view2, i, i2);
        if (onStartNestedScroll) {
            ((NestedScrollingChildHelper) this.childHelper$delegate.getValue()).startNestedScroll(i, i2);
        }
        return onStartNestedScroll;
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        super.stopNestedScroll();
        ((NestedScrollingChildHelper) this.childHelper$delegate.getValue()).stopNestedScroll(0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public QuickReturnHeaderLayout(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    public /* synthetic */ QuickReturnHeaderLayout(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
