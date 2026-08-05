package defpackage;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class lh0 extends kh0 {
    @Override // defpackage.kh0
    public final void OnDfzHZD(ViewGroup viewGroup, Matrix matrix) {
        viewGroup.transformMatrixToLocal(matrix);
    }

    @Override // defpackage.m50
    public final float P7K7Inc8(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // defpackage.m50
    public final void Qr9iLBAD(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // defpackage.kh0
    public final void eVhOlqcC(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // defpackage.kh0
    public final void k3x7lurq(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // defpackage.kh0
    public final void ow5vqvCr(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }
}
