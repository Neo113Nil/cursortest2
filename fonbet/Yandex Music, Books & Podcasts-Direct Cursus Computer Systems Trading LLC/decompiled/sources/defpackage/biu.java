package defpackage;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class biu extends aiu {
    @Override // defpackage.ixf
    public final void H(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // defpackage.aiu
    public final void O(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // defpackage.aiu
    public final void P(int i, View view) {
        view.setTransitionVisibility(i);
    }

    @Override // defpackage.aiu
    public final void Q(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // defpackage.aiu
    public final void R(ViewGroup viewGroup, Matrix matrix) {
        viewGroup.transformMatrixToLocal(matrix);
    }

    @Override // defpackage.ixf
    public final float z(View view) {
        return view.getTransitionAlpha();
    }
}
