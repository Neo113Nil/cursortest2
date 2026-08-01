package com.google.android.datatransport;

import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowInheritanceStack implements WinterFlowDeploymentArray {
    public final float[] WinterFlowHookDataSource;
    public final int[] WinterFlowRouterStructure;

    public WinterFlowInheritanceStack(ArrayList arrayList, ArrayList arrayList2) {
        int size = arrayList.size();
        this.WinterFlowRouterStructure = new int[size];
        this.WinterFlowHookDataSource = new float[size];
        for (int i = 0; i < size; i++) {
            this.WinterFlowRouterStructure[i] = ((Integer) arrayList.get(i)).intValue();
            this.WinterFlowHookDataSource[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public void WinterFlowHookDataSource(View view, float[] fArr) {
        Object parent = view.getParent();
        boolean z = parent instanceof View;
        float[] fArr2 = this.WinterFlowHookDataSource;
        if (z) {
            WinterFlowHookDataSource((View) parent, fArr);
            WinterFlowUnitTestLibrary.WinterFlowFrontendBackend(fArr2);
            WinterFlowUnitTestLibrary.WinterFlowConfiguration(fArr2, -view.getScrollX(), -view.getScrollY());
            WinterFlowEncryptionSubsystem.WinterFlowFrontendBackend(fArr, fArr2);
            float left = view.getLeft();
            float top = view.getTop();
            WinterFlowUnitTestLibrary.WinterFlowFrontendBackend(fArr2);
            WinterFlowUnitTestLibrary.WinterFlowConfiguration(fArr2, left, top);
            WinterFlowEncryptionSubsystem.WinterFlowFrontendBackend(fArr, fArr2);
        } else {
            int[] iArr = this.WinterFlowRouterStructure;
            view.getLocationInWindow(iArr);
            WinterFlowUnitTestLibrary.WinterFlowFrontendBackend(fArr2);
            WinterFlowUnitTestLibrary.WinterFlowConfiguration(fArr2, -view.getScrollX(), -view.getScrollY());
            WinterFlowEncryptionSubsystem.WinterFlowFrontendBackend(fArr, fArr2);
            float f = iArr[0];
            float f2 = iArr[1];
            WinterFlowUnitTestLibrary.WinterFlowFrontendBackend(fArr2);
            WinterFlowUnitTestLibrary.WinterFlowConfiguration(fArr2, f, f2);
            WinterFlowEncryptionSubsystem.WinterFlowFrontendBackend(fArr, fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        WinterFlowCacheRuntime.WinterFlowProxyStructure(fArr2, matrix);
        WinterFlowEncryptionSubsystem.WinterFlowFrontendBackend(fArr, fArr2);
    }

    @Override // com.google.android.datatransport.WinterFlowDeploymentArray
    public void WinterFlowRouterStructure(View view, float[] fArr) {
        WinterFlowUnitTestLibrary.WinterFlowFrontendBackend(fArr);
        WinterFlowHookDataSource(view, fArr);
    }

    public WinterFlowInheritanceStack(int i, int i2) {
        this.WinterFlowRouterStructure = new int[]{i, i2};
        this.WinterFlowHookDataSource = new float[]{0.0f, 1.0f};
    }

    public WinterFlowInheritanceStack(int i, int i2, int i3) {
        this.WinterFlowRouterStructure = new int[]{i, i2, i3};
        this.WinterFlowHookDataSource = new float[]{0.0f, 0.5f, 1.0f};
    }

    public WinterFlowInheritanceStack(float[] fArr) {
        this.WinterFlowHookDataSource = fArr;
        this.WinterFlowRouterStructure = new int[2];
    }
}
