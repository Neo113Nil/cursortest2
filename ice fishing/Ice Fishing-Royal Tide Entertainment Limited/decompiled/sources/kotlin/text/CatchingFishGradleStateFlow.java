package kotlin.text;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes.dex */
public final class CatchingFishGradleStateFlow extends CatchingFishGradleManifest {
    public static final RectF CatchingFishViewModelFAB = new RectF();
    public final float CatchingFishCoroutine;
    public final float CatchingFishDaggerWebsocket;
    public final float CatchingFishReduxKtor;
    public final float CatchingFishSnackbar;
    public float CatchingFishViewModelScope;
    public float CatchingFishWorkManager;

    public CatchingFishGradleStateFlow(float f, float f2, float f3, float f4) {
        this.CatchingFishSnackbar = f;
        this.CatchingFishCoroutine = f2;
        this.CatchingFishReduxKtor = f3;
        this.CatchingFishDaggerWebsocket = f4;
    }

    @Override // kotlin.text.CatchingFishGradleManifest
    public final void CatchingFishParcelableFAB(Matrix matrix, Path path) {
        Matrix matrix2 = this.CatchingFishParcelableFAB;
        matrix.invert(matrix2);
        path.transform(matrix2);
        float f = this.CatchingFishReduxKtor;
        float f2 = this.CatchingFishDaggerWebsocket;
        RectF rectF = CatchingFishViewModelFAB;
        rectF.set(this.CatchingFishSnackbar, this.CatchingFishCoroutine, f, f2);
        path.arcTo(rectF, this.CatchingFishWorkManager, this.CatchingFishViewModelScope, false);
        path.transform(matrix);
    }
}
