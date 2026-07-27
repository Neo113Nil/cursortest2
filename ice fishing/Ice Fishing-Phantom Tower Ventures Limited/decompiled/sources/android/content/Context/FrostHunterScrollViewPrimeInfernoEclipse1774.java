package android.content.Context;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterScrollViewPrimeInfernoEclipse1774 implements FrostHunterRotateDrawableAlphaStrike5953 {
    public final Matrix FrostHunterCameraXPixelTurboCosmos9814 = new Matrix();
    public final int[] FrostHunterFlowMaxDragonHero5809 = new int[2];

    @Override // android.content.Context.FrostHunterRotateDrawableAlphaStrike5953
    public void FrostHunterBundlePulseFusionHero2475(View view, float[] fArr) {
        Matrix matrix = this.FrostHunterCameraXPixelTurboCosmos9814;
        matrix.reset();
        view.transformMatrixToGlobal(matrix);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        int[] iArr = this.FrostHunterFlowMaxDragonHero5809;
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        view.getLocationInWindow(iArr);
        matrix.postTranslate(iArr[0] - i, iArr[1] - i2);
        FrostHunterTransitionGammaTitanSpeed7178.FrostHunterAnnotationProcessorSparkEclipse8710(fArr, matrix);
    }
}
