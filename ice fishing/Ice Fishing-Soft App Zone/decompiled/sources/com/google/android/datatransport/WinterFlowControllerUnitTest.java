package com.google.android.datatransport;

import android.util.SparseArray;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowControllerUnitTest {
    public WinterFlowBackend WinterFlowHookDataSource;
    public final SparseArray WinterFlowRouterStructure;

    public WinterFlowControllerUnitTest(int i) {
        this.WinterFlowRouterStructure = new SparseArray(i);
    }

    public final void WinterFlowRouterStructure(WinterFlowBackend winterFlowBackend, int i, int i2) {
        int WinterFlowRouterStructure = winterFlowBackend.WinterFlowRouterStructure(i);
        SparseArray sparseArray = this.WinterFlowRouterStructure;
        WinterFlowControllerUnitTest winterFlowControllerUnitTest = (WinterFlowControllerUnitTest) sparseArray.get(WinterFlowRouterStructure);
        if (winterFlowControllerUnitTest == null) {
            winterFlowControllerUnitTest = new WinterFlowControllerUnitTest(1);
            sparseArray.put(winterFlowBackend.WinterFlowRouterStructure(i), winterFlowControllerUnitTest);
        }
        if (i2 > i) {
            winterFlowControllerUnitTest.WinterFlowRouterStructure(winterFlowBackend, i + 1, i2);
        } else {
            winterFlowControllerUnitTest.WinterFlowHookDataSource = winterFlowBackend;
        }
    }
}
