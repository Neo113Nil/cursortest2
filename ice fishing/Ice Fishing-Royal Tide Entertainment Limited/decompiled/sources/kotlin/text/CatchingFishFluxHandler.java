package kotlin.text;

import android.graphics.Matrix;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes.dex */
public abstract class CatchingFishFluxHandler {
    public static final ThreadLocal CatchingFishParcelableFAB = new ThreadLocal();
    public static final ThreadLocal CatchingFishSnackbar = new ThreadLocal();

    public static void CatchingFishParcelableFAB(CoordinatorLayout coordinatorLayout, View view, Matrix matrix) {
        Object parent = view.getParent();
        if ((parent instanceof View) && parent != coordinatorLayout) {
            CatchingFishParcelableFAB(coordinatorLayout, (View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view.getMatrix());
    }
}
