package com.gamericefishpro.space.i6;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class z extends y {
    @Override // com.gamericefishpro.space.d9.h
    public final float B(View view) {
        return view.getTransitionAlpha();
    }

    @Override // com.gamericefishpro.space.d9.h
    public final void N(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // com.gamericefishpro.space.i6.y, com.gamericefishpro.space.d9.h
    public final void O(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // com.gamericefishpro.space.i6.y
    public final void T(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // com.gamericefishpro.space.i6.y
    public final void U(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // com.gamericefishpro.space.i6.y
    public final void V(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
