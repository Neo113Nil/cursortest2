package com.google.android.datatransport;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowRuntimeInterface implements WinterFlowDeploymentArray {
    public final Matrix WinterFlowRouterStructure = new Matrix();
    public final int[] WinterFlowHookDataSource = new int[2];

    @Override // com.google.android.datatransport.WinterFlowDeploymentArray
    public void WinterFlowRouterStructure(View view, float[] fArr) {
        Matrix matrix = this.WinterFlowRouterStructure;
        matrix.reset();
        view.transformMatrixToGlobal(matrix);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        int[] iArr = this.WinterFlowHookDataSource;
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        view.getLocationInWindow(iArr);
        matrix.postTranslate(iArr[0] - i, iArr[1] - i2);
        WinterFlowCacheRuntime.WinterFlowProxyStructure(fArr, matrix);
    }
}
