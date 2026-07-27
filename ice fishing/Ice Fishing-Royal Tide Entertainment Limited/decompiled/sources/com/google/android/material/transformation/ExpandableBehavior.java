package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import kotlin.text.CatchingFishJUnitToastKtor;

@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableBehavior extends CatchingFishJUnitToastKtor {
    public ExpandableBehavior() {
    }

    @Override // kotlin.text.CatchingFishJUnitToastKtor
    public final boolean CatchingFishReduxKtor(CoordinatorLayout coordinatorLayout, View view, View view2) {
        view2.getClass();
        throw new ClassCastException();
    }

    @Override // kotlin.text.CatchingFishJUnitToastKtor
    public abstract void CatchingFishSnackbar(View view);

    @Override // kotlin.text.CatchingFishJUnitToastKtor
    public final boolean CatchingFishViewModelScope(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (!view.isLaidOut()) {
            ArrayList CatchingFishFragmentHandler = coordinatorLayout.CatchingFishFragmentHandler(view);
            int size = CatchingFishFragmentHandler.size();
            for (int i2 = 0; i2 < size; i2++) {
                CatchingFishSnackbar(view);
            }
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
