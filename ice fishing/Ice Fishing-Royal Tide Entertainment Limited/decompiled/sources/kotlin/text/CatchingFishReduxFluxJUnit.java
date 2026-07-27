package kotlin.text;

import android.graphics.Matrix;
import android.graphics.Path;

/* loaded from: classes.dex */
public final class CatchingFishReduxFluxJUnit extends CatchingFishGradleManifest {
    public float CatchingFishCoroutine;
    public float CatchingFishSnackbar;

    @Override // kotlin.text.CatchingFishGradleManifest
    public final void CatchingFishParcelableFAB(Matrix matrix, Path path) {
        Matrix matrix2 = this.CatchingFishParcelableFAB;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.CatchingFishSnackbar, this.CatchingFishCoroutine);
        path.transform(matrix);
    }
}
