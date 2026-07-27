package kotlin.text;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes.dex */
public abstract class CatchingFishRoomKtor {
    public static void CatchingFishCoroutine(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    public static void CatchingFishParcelableFAB(View view, Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }

    public static void CatchingFishSnackbar(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }
}
