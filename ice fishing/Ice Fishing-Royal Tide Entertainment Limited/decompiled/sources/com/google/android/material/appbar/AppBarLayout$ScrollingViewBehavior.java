package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlin.text.CatchingFishFABCameraX;
import kotlin.text.CatchingFishHandlerToolbar;
import kotlin.text.CatchingFishHiltMVPToast;
import kotlin.text.CatchingFishJUnitToastKtor;
import kotlin.text.CatchingFishMVPView;
import kotlin.text.CatchingFishSnackbarPicasso;

/* loaded from: classes.dex */
public class AppBarLayout$ScrollingViewBehavior extends CatchingFishHandlerToolbar {
    public final int CatchingFishSnackbar;

    public AppBarLayout$ScrollingViewBehavior() {
        new Rect();
        new Rect();
    }

    public static void CatchingFish(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
        }
    }

    @Override // kotlin.text.CatchingFishJUnitToastKtor
    public final void CatchingFishEspressoTesting(CoordinatorLayout coordinatorLayout, View view) {
        CatchingFish(coordinatorLayout.CatchingFishFragmentHandler(view));
    }

    @Override // kotlin.text.CatchingFishHandlerToolbar
    public final void CatchingFishNavigation(CoordinatorLayout coordinatorLayout, View view, int i) {
        CatchingFish(coordinatorLayout.CatchingFishFragmentHandler(view));
        coordinatorLayout.CatchingFishStateLiveData(view, i);
    }

    @Override // kotlin.text.CatchingFishJUnitToastKtor
    public boolean CatchingFishReduxKtor(CoordinatorLayout coordinatorLayout, View view, View view2) {
        CatchingFishJUnitToastKtor catchingFishJUnitToastKtor = ((CatchingFishMVPView) view2.getLayoutParams()).CatchingFishParcelableFAB;
        if (catchingFishJUnitToastKtor instanceof AppBarLayout$BaseBehavior) {
            int bottom = view2.getBottom() - view.getTop();
            ((AppBarLayout$BaseBehavior) catchingFishJUnitToastKtor).getClass();
            int i = this.CatchingFishSnackbar;
            int CatchingFishViewModelScope = bottom - (i == 0 ? 0 : CatchingFishHiltMVPToast.CatchingFishViewModelScope((int) (0.0f * i), 0, i));
            WeakHashMap weakHashMap = CatchingFishFABCameraX.CatchingFishParcelableFAB;
            view.offsetTopAndBottom(CatchingFishViewModelScope);
        }
        return false;
    }

    @Override // kotlin.text.CatchingFishJUnitToastKtor
    public final boolean CatchingFishViewModelFAB(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        int i4 = view.getLayoutParams().height;
        if (i4 != -1 && i4 != -2) {
            return false;
        }
        CatchingFish(coordinatorLayout.CatchingFishFragmentHandler(view));
        return false;
    }

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        new Rect();
        new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, CatchingFishSnackbarPicasso.CatchingFishParcelableFlux);
        this.CatchingFishSnackbar = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }

    @Override // kotlin.text.CatchingFishJUnitToastKtor
    public final void CatchingFishSnackbar(View view) {
    }
}
