package y1;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class s0 implements r0 {

    /* renamed from: g, reason: collision with root package name */
    public final Matrix f8648g = new Matrix();

    /* renamed from: h, reason: collision with root package name */
    public final int[] f8649h = new int[2];

    @Override // y1.r0
    public void a(View view, float[] fArr) {
        Matrix matrix = this.f8648g;
        matrix.reset();
        view.transformMatrixToGlobal(matrix);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        int[] iArr = this.f8649h;
        view.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        int i11 = iArr[1];
        view.getLocationInWindow(iArr);
        matrix.postTranslate(iArr[0] - i10, iArr[1] - i11);
        f1.d0.p(fArr, matrix);
    }
}
