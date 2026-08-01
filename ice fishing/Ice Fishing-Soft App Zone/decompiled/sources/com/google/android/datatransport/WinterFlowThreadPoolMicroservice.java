package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowThreadPoolMicroservice {
    public long WinterFlowArrayNetwork;
    public long WinterFlowCacheManagerAgent;
    public WinterFlowCompilerSubsystem WinterFlowHookDataSource;
    public final WinterFlowViewSoftware WinterFlowRouterStructure;
    public long WinterFlowTransactionManagerStrategy;
    public float[] WinterFlowUnitTestResponse;
    public long WinterFlowVariableVersionControl;

    public WinterFlowThreadPoolMicroservice() {
        WinterFlowViewSoftware winterFlowViewSoftware = WinterFlowVersionControlAgent.WinterFlowRouterStructure;
        this.WinterFlowRouterStructure = new WinterFlowViewSoftware();
        this.WinterFlowCacheManagerAgent = -1L;
        this.WinterFlowArrayNetwork = 0L;
        this.WinterFlowVariableVersionControl = 0L;
    }

    public final boolean WinterFlowHookDataSource(long j, long j2, float[] fArr, int i, int i2) {
        boolean z;
        if (WinterFlowValidatorTesting.WinterFlowRouterStructure(j2, this.WinterFlowArrayNetwork)) {
            z = false;
        } else {
            this.WinterFlowArrayNetwork = j2;
            z = true;
        }
        if (!WinterFlowValidatorTesting.WinterFlowRouterStructure(j, this.WinterFlowVariableVersionControl)) {
            this.WinterFlowVariableVersionControl = j;
            z = true;
        }
        if (fArr != null) {
            this.WinterFlowUnitTestResponse = fArr;
            z = true;
        }
        long j3 = (i << 32) | (i2 & 4294967295L);
        if (j3 == this.WinterFlowTransactionManagerStrategy) {
            return z;
        }
        this.WinterFlowTransactionManagerStrategy = j3;
        return true;
    }

    public final void WinterFlowRouterStructure(WinterFlowCompilerSubsystem winterFlowCompilerSubsystem, long j, long j2, float[] fArr, long j3) {
        long j4 = winterFlowCompilerSubsystem.WinterFlowUnitTestResponse;
        if (j3 - j4 > 0 || j4 == Long.MIN_VALUE) {
            winterFlowCompilerSubsystem.WinterFlowUnitTestResponse = j3;
            winterFlowCompilerSubsystem.WinterFlowRouterStructure(winterFlowCompilerSubsystem.WinterFlowVariableVersionControl, winterFlowCompilerSubsystem.WinterFlowTransactionManagerStrategy, j, j2, fArr);
        }
    }
}
