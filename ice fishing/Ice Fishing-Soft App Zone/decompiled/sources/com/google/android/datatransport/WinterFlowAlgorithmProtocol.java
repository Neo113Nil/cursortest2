package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowAlgorithmProtocol implements Comparable {
    public static final WinterFlowAlgorithmDebug WinterFlowVariableVersionControl = new WinterFlowAlgorithmDebug(5);
    public static final long WinterFlowTransactionManagerStrategy = WinterFlowSoftwareException.WinterFlowArrayHelper(4611686018427387903L);
    public static final long WinterFlowUnitTestResponse = WinterFlowSoftwareException.WinterFlowArrayHelper(-4611686018427387903L);

    public static final long WinterFlowHookDataSource(long j, long j2) {
        int i = ((int) j) & 1;
        if (i != (((int) j2) & 1)) {
            return i == 1 ? WinterFlowRouterStructure(j >> 1, j2 >> 1) : WinterFlowRouterStructure(j2 >> 1, j >> 1);
        }
        if (i == 0) {
            long j3 = (j >> 1) + (j2 >> 1);
            if (-4611686018426999999L > j3 || j3 >= 4611686018427000000L) {
                return WinterFlowSoftwareException.WinterFlowArrayHelper(j3 / 1000000);
            }
            long j4 = j3 << 1;
            int i2 = WinterFlowDataSourceIDE.WinterFlowRouterStructure;
            return j4;
        }
        long WinterFlowServiceUtility = WinterFlowSoftwareException.WinterFlowServiceUtility(j >> 1, j2 >> 1);
        if (WinterFlowServiceUtility == 9223372036854759646L) {
            WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("Summing infinite durations of different signs yields an undefined result.");
            return 0L;
        }
        if (WinterFlowServiceUtility == 4611686018427387903L || WinterFlowServiceUtility == -4611686018427387903L) {
            return WinterFlowSoftwareException.WinterFlowArrayHelper(WinterFlowServiceUtility);
        }
        if (-4611686018426L > WinterFlowServiceUtility || WinterFlowServiceUtility >= 4611686018427L) {
            return WinterFlowSoftwareException.WinterFlowArrayHelper(WinterFlowDecoratorUI.WinterFlowResponseEngine(WinterFlowServiceUtility));
        }
        long j5 = (WinterFlowServiceUtility * 1000000) << 1;
        int i3 = WinterFlowDataSourceIDE.WinterFlowRouterStructure;
        return j5;
    }

    public static final long WinterFlowRouterStructure(long j, long j2) {
        long j3 = j2 / 1000000;
        long WinterFlowServiceUtility = WinterFlowSoftwareException.WinterFlowServiceUtility(j, j3);
        if (-4611686018426L > WinterFlowServiceUtility || WinterFlowServiceUtility >= 4611686018427L) {
            return WinterFlowSoftwareException.WinterFlowArrayHelper(WinterFlowServiceUtility);
        }
        long j4 = ((WinterFlowServiceUtility * 1000000) + (j2 - (j3 * 1000000))) << 1;
        int i = WinterFlowDataSourceIDE.WinterFlowRouterStructure;
        return j4;
    }
}
