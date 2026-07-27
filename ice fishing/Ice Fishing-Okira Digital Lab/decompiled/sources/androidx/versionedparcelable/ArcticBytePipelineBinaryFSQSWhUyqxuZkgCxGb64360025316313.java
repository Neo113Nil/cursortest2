package androidx.versionedparcelable;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class ArcticBytePipelineBinaryFSQSWhUyqxuZkgCxGb64360025316313 implements CosmicForgeRouterWorkerYJDRgbgOGp8wvdZQQa44772870321588 {
    public final Matrix ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = new Matrix();
    public final int[] AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = new int[2];

    @Override // androidx.versionedparcelable.CosmicForgeRouterWorkerYJDRgbgOGp8wvdZQQa44772870321588
    public void ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(View view, float[] fArr) {
        Matrix matrix = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        matrix.reset();
        view.transformMatrixToGlobal(matrix);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        int[] iArr = this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        view.getLocationInWindow(iArr);
        matrix.postTranslate(iArr[0] - i, iArr[1] - i2);
        ObsidianEngineTranspilerWorkerEHoOsrsySnsoA9iWxm35468870095129.ZenithPathVectorNormalizationStNnl4OgOjY2uLubQK64607822190606(matrix, fArr);
    }
}
