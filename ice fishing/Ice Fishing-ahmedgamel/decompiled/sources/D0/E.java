package D0;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes.dex */
public final class E extends D {
    @Override // com.bumptech.glide.d
    public final void H(View view, float f2) {
        view.setTransitionAlpha(f2);
    }

    @Override // D0.D, com.bumptech.glide.d
    public final void I(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // D0.D
    public final void Q(View view, int i, int i4, int i6, int i9) {
        view.setLeftTopRightBottom(i, i4, i6, i9);
    }

    @Override // D0.D
    public final void R(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // D0.D
    public final void S(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    @Override // com.bumptech.glide.d
    public final float u(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }
}
