package ru.yandex.music.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import defpackage.oyi;

/* loaded from: classes6.dex */
public final class FlingBehavior extends FixAppBarLayoutBehavior {
    private static final int DEFAULT_TOP_CHILD_FLING_THRESHOLD = 1;
    private boolean isPositive;
    private int mTopChildFlingThreshold;

    public FlingBehavior() {
        this.mTopChildFlingThreshold = 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
    @Override // defpackage.uk6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onNestedFling(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, float f, float f2, boolean z) {
        View view2;
        if ((f2 > 0.0f && !this.isPositive) || (f2 < 0.0f && this.isPositive)) {
            f2 *= -1.0f;
        }
        float f3 = f2;
        if (!(view instanceof RecyclerView) && (view instanceof oyi) && (view instanceof ViewGroup)) {
            View childAt = ((ViewGroup) view).getChildAt(0);
            if (childAt instanceof RecyclerView) {
                view2 = childAt;
                if ((view2 instanceof RecyclerView) && f3 < 0.0f) {
                    z = RecyclerView.Y(((RecyclerView) view2).getChildAt(0)) <= this.mTopChildFlingThreshold;
                }
                return super.onNestedFling(coordinatorLayout, (View) appBarLayout, view2, f, f3, z);
            }
        }
        view2 = view;
        if (view2 instanceof RecyclerView) {
            if (RecyclerView.Y(((RecyclerView) view2).getChildAt(0)) <= this.mTopChildFlingThreshold) {
            }
        }
        return super.onNestedFling(coordinatorLayout, (View) appBarLayout, view2, f, f3, z);
    }

    @Override // defpackage.uk6
    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr) {
        super.onNestedPreScroll(coordinatorLayout, (View) appBarLayout, view, i, i2, iArr);
        this.isPositive = i2 > 0;
    }

    public void setTopChildFlingThreshold(int i) {
        this.mTopChildFlingThreshold = i;
    }

    public FlingBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mTopChildFlingThreshold = 1;
    }
}
