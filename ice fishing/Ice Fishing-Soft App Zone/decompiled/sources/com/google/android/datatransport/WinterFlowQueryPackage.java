package com.google.android.datatransport;

import java.util.Arrays;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowQueryPackage {
    public int WinterFlowHookDataSource;
    public int[] WinterFlowRouterStructure;

    public WinterFlowQueryPackage() {
        this.WinterFlowRouterStructure = new int[10];
    }

    public void WinterFlowArrayNetwork(int i, int i2, int i3) {
        int i4 = this.WinterFlowHookDataSource;
        int[] iArr = this.WinterFlowRouterStructure;
        int i5 = i4 + 3;
        if (i5 >= iArr.length) {
            iArr = Arrays.copyOf(iArr, iArr.length * 2);
            this.WinterFlowRouterStructure = iArr;
        }
        iArr[i4] = i + i3;
        iArr[i4 + 1] = i2 + i3;
        iArr[i4 + 2] = i3;
        this.WinterFlowHookDataSource = i5;
    }

    public void WinterFlowCacheManagerAgent(int i) {
        int[] iArr = this.WinterFlowRouterStructure;
        if (this.WinterFlowHookDataSource >= iArr.length) {
            iArr = Arrays.copyOf(iArr, iArr.length * 2);
            this.WinterFlowRouterStructure = iArr;
        }
        int i2 = this.WinterFlowHookDataSource;
        this.WinterFlowHookDataSource = i2 + 1;
        iArr[i2] = i;
    }

    public int WinterFlowHookDataSource() {
        int[] iArr = this.WinterFlowRouterStructure;
        int i = this.WinterFlowHookDataSource - 1;
        this.WinterFlowHookDataSource = i;
        return iArr[i];
    }

    public int WinterFlowRouterStructure(int i) {
        int i2 = this.WinterFlowHookDataSource - 1;
        return i2 >= 0 ? this.WinterFlowRouterStructure[i2] : i;
    }

    public void WinterFlowTransactionManagerStrategy(int i, int i2) {
        if (i < i2) {
            int i3 = i - 3;
            for (int i4 = i; i4 < i2; i4 += 3) {
                int[] iArr = this.WinterFlowRouterStructure;
                int i5 = iArr[i4];
                int i6 = iArr[i2];
                if (i5 < i6 || (i5 == i6 && iArr[i4 + 1] <= iArr[i2 + 1])) {
                    i3 += 3;
                    WinterFlowUnitTestResponse(i3, i4);
                }
            }
            WinterFlowUnitTestResponse(i3 + 3, i2);
            WinterFlowTransactionManagerStrategy(i, i3);
            WinterFlowTransactionManagerStrategy(i3 + 6, i2);
        }
    }

    public void WinterFlowUnitTestResponse(int i, int i2) {
        int[] iArr = this.WinterFlowRouterStructure;
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
        int i4 = i + 1;
        int i5 = i2 + 1;
        int i6 = iArr[i4];
        iArr[i4] = iArr[i5];
        iArr[i5] = i6;
        int i7 = i + 2;
        int i8 = i2 + 2;
        int i9 = iArr[i7];
        iArr[i7] = iArr[i8];
        iArr[i8] = i9;
    }

    public void WinterFlowVariableVersionControl(int i, int i2, int i3, int i4) {
        int i5 = this.WinterFlowHookDataSource;
        int[] iArr = this.WinterFlowRouterStructure;
        int i6 = i5 + 4;
        if (i6 >= iArr.length) {
            iArr = Arrays.copyOf(iArr, iArr.length * 2);
            this.WinterFlowRouterStructure = iArr;
        }
        iArr[i5] = i;
        iArr[i5 + 1] = i2;
        iArr[i5 + 2] = i3;
        iArr[i5 + 3] = i4;
        this.WinterFlowHookDataSource = i6;
    }

    public WinterFlowQueryPackage(int i) {
        this.WinterFlowRouterStructure = new int[i];
    }
}
