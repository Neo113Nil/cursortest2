package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowOrchestrationFramework {
    public static final WinterFlowQueueTool WinterFlowVariableVersionControl;

    static {
        Integer num = WinterFlowServicePackage.WinterFlowRouterStructure;
        WinterFlowVariableVersionControl = (num == null || num.intValue() >= 34) ? new WinterFlowStackAgent() : new WinterFlowAPIUtility();
    }

    public int WinterFlowCacheManagerAgent(int i, int i2) {
        int WinterFlowHookDataSource;
        int i3;
        int i4;
        if (i2 <= i) {
            WinterFlowEventEmitterOrchestration.WinterFlowSingletonPlatform("Random range is empty: [", Integer.valueOf(i), ", ", Integer.valueOf(i2), ").");
            return 0;
        }
        int i5 = i2 - i;
        if (i5 > 0 || i5 == Integer.MIN_VALUE) {
            if (((-i5) & i5) == i5) {
                i4 = WinterFlowRouterStructure(31 - Integer.numberOfLeadingZeros(i5));
            } else {
                do {
                    WinterFlowHookDataSource = WinterFlowHookDataSource() >>> 1;
                    i3 = WinterFlowHookDataSource % i5;
                } while ((i5 - 1) + (WinterFlowHookDataSource - i3) < 0);
                i4 = i3;
            }
            return i + i4;
        }
        while (true) {
            int WinterFlowHookDataSource2 = WinterFlowHookDataSource();
            if (i <= WinterFlowHookDataSource2 && WinterFlowHookDataSource2 < i2) {
                return WinterFlowHookDataSource2;
            }
        }
    }

    public abstract int WinterFlowHookDataSource();

    public abstract int WinterFlowRouterStructure(int i);
}
