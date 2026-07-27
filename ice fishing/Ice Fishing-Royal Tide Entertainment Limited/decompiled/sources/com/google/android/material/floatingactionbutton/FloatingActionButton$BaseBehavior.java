package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import kotlin.text.CatchingFishJUnitToastKtor;
import kotlin.text.CatchingFishMVPView;
import kotlin.text.CatchingFishSnackbarPicasso;

/* loaded from: classes.dex */
public class FloatingActionButton$BaseBehavior<T> extends CatchingFishJUnitToastKtor {
    public FloatingActionButton$BaseBehavior() {
    }

    @Override // kotlin.text.CatchingFishJUnitToastKtor
    public final void CatchingFishCoroutine(CatchingFishMVPView catchingFishMVPView) {
        if (catchingFishMVPView.CatchingFishViewModelFAB == 0) {
            catchingFishMVPView.CatchingFishViewModelFAB = 80;
        }
    }

    @Override // kotlin.text.CatchingFishJUnitToastKtor
    public final boolean CatchingFishParcelableFAB(View view) {
        throw new ClassCastException();
    }

    @Override // kotlin.text.CatchingFishJUnitToastKtor
    public final boolean CatchingFishReduxKtor(CoordinatorLayout coordinatorLayout, View view, View view2) {
        throw new ClassCastException();
    }

    @Override // kotlin.text.CatchingFishJUnitToastKtor
    public final boolean CatchingFishViewModelScope(CoordinatorLayout coordinatorLayout, View view, int i) {
        throw new ClassCastException();
    }

    public FloatingActionButton$BaseBehavior(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, CatchingFishSnackbarPicasso.CatchingFishViewModelScope);
        obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
    }
}
