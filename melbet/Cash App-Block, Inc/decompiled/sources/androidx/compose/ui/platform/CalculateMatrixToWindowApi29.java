package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.graphics.ColorKt;

/* loaded from: classes.dex */
public final class CalculateMatrixToWindowApi29 {
    public final Matrix tmpMatrix = new Matrix();
    public final int[] tmpPosition = new int[2];

    /* renamed from: calculateMatrixToWindow-EL8BTi8, reason: not valid java name */
    public void m925calculateMatrixToWindowEL8BTi8(View view, float[] fArr) {
        Matrix matrix = this.tmpMatrix;
        matrix.reset();
        view.transformMatrixToGlobal(matrix);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        int[] iArr = this.tmpPosition;
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        view.getLocationInWindow(iArr);
        matrix.postTranslate(iArr[0] - i, iArr[1] - i2);
        ColorKt.m692setFromtUYjHk(matrix, fArr);
    }
}
