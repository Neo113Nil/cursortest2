package com.google.android.datatransport;

import java.util.Arrays;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowTransactionStructure {
    public int WinterFlowHookDataSource;
    public int[] WinterFlowRouterStructure;

    public WinterFlowTransactionStructure(int i) {
        this.WinterFlowRouterStructure = i == 0 ? WinterFlowConfigurationUtility.WinterFlowRouterStructure : new int[i];
    }

    public final void WinterFlowArrayNetwork(int i, int i2) {
        if (i < 0 || i >= this.WinterFlowHookDataSource) {
            WinterFlowCompilerMechanism.WinterFlowTransactionAgent("Index must be between 0 and size");
            return;
        }
        int[] iArr = this.WinterFlowRouterStructure;
        int i3 = iArr[i];
        iArr[i] = i2;
    }

    public final void WinterFlowCacheManagerAgent(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.WinterFlowHookDataSource)) {
            WinterFlowCompilerMechanism.WinterFlowTransactionAgent("Index must be between 0 and size");
            return;
        }
        int[] iArr = this.WinterFlowRouterStructure;
        int i3 = iArr[i];
        if (i != i2 - 1) {
            WinterFlowProtocolPipeline.WinterFlowCompilerHandler(iArr, iArr, i, i + 1, i2);
        }
        this.WinterFlowHookDataSource--;
    }

    public final int WinterFlowHookDataSource(int i) {
        if (i >= 0 && i < this.WinterFlowHookDataSource) {
            return this.WinterFlowRouterStructure[i];
        }
        WinterFlowCompilerMechanism.WinterFlowTransactionAgent("Index must be between 0 and size");
        return 0;
    }

    public final void WinterFlowRouterStructure(int i) {
        int i2 = this.WinterFlowHookDataSource + 1;
        int[] iArr = this.WinterFlowRouterStructure;
        if (iArr.length < i2) {
            iArr = Arrays.copyOf(iArr, Math.max(i2, (iArr.length * 3) / 2));
            this.WinterFlowRouterStructure = iArr;
        }
        int i3 = this.WinterFlowHookDataSource;
        iArr[i3] = i;
        this.WinterFlowHookDataSource = i3 + 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof WinterFlowTransactionStructure) {
            WinterFlowTransactionStructure winterFlowTransactionStructure = (WinterFlowTransactionStructure) obj;
            int i = winterFlowTransactionStructure.WinterFlowHookDataSource;
            int i2 = this.WinterFlowHookDataSource;
            if (i == i2) {
                int[] iArr = this.WinterFlowRouterStructure;
                int[] iArr2 = winterFlowTransactionStructure.WinterFlowRouterStructure;
                WinterFlowCacheManagerListener WinterFlowArrayHelper = WinterFlowDecoratorUI.WinterFlowArrayHelper(0, i2);
                int i3 = WinterFlowArrayHelper.WinterFlowVariableVersionControl;
                int i4 = WinterFlowArrayHelper.WinterFlowTransactionManagerStrategy;
                if (i3 > i4) {
                    return true;
                }
                while (iArr[i3] == iArr2[i3]) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.WinterFlowRouterStructure;
        int i = this.WinterFlowHookDataSource;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += Integer.hashCode(iArr[i3]) * 31;
        }
        return i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        int[] iArr = this.WinterFlowRouterStructure;
        int i = this.WinterFlowHookDataSource;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append((CharSequence) "]");
                break;
            }
            int i3 = iArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(i3);
            i2++;
        }
        return sb.toString();
    }

    public /* synthetic */ WinterFlowTransactionStructure() {
        this(16);
    }
}
