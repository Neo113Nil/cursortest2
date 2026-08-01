package D0;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes.dex */
public final class E extends D {
    @Override // com.bumptech.glide.h
    public final float h(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // com.bumptech.glide.h
    public final void l(View view, float f3) {
        view.setTransitionAlpha(f3);
    }

    @Override // D0.D, com.bumptech.glide.h
    public final void m(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // D0.D
    public final void q(View view, int i, int i6, int i9, int i10) {
        view.setLeftTopRightBottom(i, i6, i9, i10);
    }

    @Override // D0.D
    public final void r(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // D0.D
    public final void s(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
