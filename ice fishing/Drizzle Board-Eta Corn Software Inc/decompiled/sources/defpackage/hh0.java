package defpackage;

import android.graphics.Matrix;
import android.view.View;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class hh0 {
    public static void MdtA4re8(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    public static void NCTxEWno(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    public static void qoPGr6Ce(View view, Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }
}
