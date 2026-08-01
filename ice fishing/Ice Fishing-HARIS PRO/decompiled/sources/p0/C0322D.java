package p0;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: p0.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0322D extends C0321C {
    @Override // h0.f
    public final void A(View view, float f2) {
        view.setTransitionAlpha(f2);
    }

    @Override // p0.C0321C, h0.f
    public final void B(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // p0.C0321C
    public final void E(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // p0.C0321C
    public final void F(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // p0.C0321C
    public final void G(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    @Override // h0.f
    public final float o(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }
}
