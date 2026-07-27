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
public class ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior<T> extends CatchingFishJUnitToastKtor {
    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior() {
    }

    @Override // kotlin.text.CatchingFishJUnitToastKtor
    public final void CatchingFishCoroutine(CatchingFishMVPView catchingFishMVPView) {
        if (catchingFishMVPView.CatchingFishViewModelFAB == 0) {
            catchingFishMVPView.CatchingFishViewModelFAB = 80;
        }
    }

    @Override // kotlin.text.CatchingFishJUnitToastKtor
    public final /* synthetic */ boolean CatchingFishParcelableFAB(View view) {
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

    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, CatchingFishSnackbarPicasso.CatchingFishWorkManager);
        obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.getBoolean(1, true);
        obtainStyledAttributes.recycle();
    }
}
