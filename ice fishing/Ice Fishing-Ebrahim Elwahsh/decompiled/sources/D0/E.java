package D0;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes.dex */
public final class E extends D {
    @Override // com.bumptech.glide.f
    public final float j(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // com.bumptech.glide.f
    public final void o(View view, float f6) {
        view.setTransitionAlpha(f6);
    }

    @Override // D0.D, com.bumptech.glide.f
    public final void p(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // D0.D
    public final void u(View view, int i, int i4, int i9, int i10) {
        view.setLeftTopRightBottom(i, i4, i9, i10);
    }

    @Override // D0.D
    public final void v(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // D0.D
    public final void w(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
