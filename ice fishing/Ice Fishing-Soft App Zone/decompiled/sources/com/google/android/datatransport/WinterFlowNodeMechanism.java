package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public class WinterFlowNodeMechanism {
    public final float[] WinterFlowArrayNetwork;
    public final WinterFlowTransactionManagerBackend WinterFlowCacheManagerAgent;
    public final WinterFlowTransactionManagerBackend WinterFlowHookDataSource;
    public final WinterFlowTransactionManagerBackend WinterFlowRouterStructure;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public WinterFlowNodeMechanism(WinterFlowTransactionManagerBackend winterFlowTransactionManagerBackend, WinterFlowTransactionManagerBackend winterFlowTransactionManagerBackend2, int i) {
        this(winterFlowTransactionManagerBackend2, r0, r1, r6);
        WinterFlowTransactionManagerBackend WinterFlowTransactionManagerStrategy = WinterFlowSoftwareException.WinterFlowConfigurationSubsystem(winterFlowTransactionManagerBackend.WinterFlowHookDataSource, 12884901888L) ? WinterFlowHandlerWebsocket.WinterFlowTransactionManagerStrategy(winterFlowTransactionManagerBackend) : winterFlowTransactionManagerBackend;
        WinterFlowTransactionManagerBackend WinterFlowTransactionManagerStrategy2 = WinterFlowSoftwareException.WinterFlowConfigurationSubsystem(winterFlowTransactionManagerBackend2.WinterFlowHookDataSource, 12884901888L) ? WinterFlowHandlerWebsocket.WinterFlowTransactionManagerStrategy(winterFlowTransactionManagerBackend2) : winterFlowTransactionManagerBackend2;
        float[] fArr = WinterFlowEncryptionSubsystem.WinterFlowTransactionAgent;
        float[] fArr2 = null;
        if (i == 3) {
            boolean WinterFlowConfigurationSubsystem = WinterFlowSoftwareException.WinterFlowConfigurationSubsystem(winterFlowTransactionManagerBackend.WinterFlowHookDataSource, 12884901888L);
            boolean WinterFlowConfigurationSubsystem2 = WinterFlowSoftwareException.WinterFlowConfigurationSubsystem(winterFlowTransactionManagerBackend2.WinterFlowHookDataSource, 12884901888L);
            if ((!WinterFlowConfigurationSubsystem || !WinterFlowConfigurationSubsystem2) && (WinterFlowConfigurationSubsystem || WinterFlowConfigurationSubsystem2)) {
                WinterFlowGatewayPlatform winterFlowGatewayPlatform = ((WinterFlowBatchBatch) (WinterFlowConfigurationSubsystem ? winterFlowTransactionManagerBackend : winterFlowTransactionManagerBackend2)).WinterFlowArrayNetwork;
                float[] WinterFlowRouterStructure = WinterFlowConfigurationSubsystem ? winterFlowGatewayPlatform.WinterFlowRouterStructure() : fArr;
                fArr = WinterFlowConfigurationSubsystem2 ? winterFlowGatewayPlatform.WinterFlowRouterStructure() : fArr;
                fArr2 = new float[]{WinterFlowRouterStructure[0] / fArr[0], WinterFlowRouterStructure[1] / fArr[1], WinterFlowRouterStructure[2] / fArr[2]};
            }
        }
    }

    public long WinterFlowRouterStructure(long j) {
        float WinterFlowUnitTestResponse = WinterFlowInheritanceSubsystem.WinterFlowUnitTestResponse(j);
        float WinterFlowTransactionManagerStrategy = WinterFlowInheritanceSubsystem.WinterFlowTransactionManagerStrategy(j);
        float WinterFlowArrayNetwork = WinterFlowInheritanceSubsystem.WinterFlowArrayNetwork(j);
        float WinterFlowCacheManagerAgent = WinterFlowInheritanceSubsystem.WinterFlowCacheManagerAgent(j);
        WinterFlowTransactionManagerBackend winterFlowTransactionManagerBackend = this.WinterFlowHookDataSource;
        long WinterFlowArrayNetwork2 = winterFlowTransactionManagerBackend.WinterFlowArrayNetwork(WinterFlowUnitTestResponse, WinterFlowTransactionManagerStrategy, WinterFlowArrayNetwork);
        float intBitsToFloat = Float.intBitsToFloat((int) (WinterFlowArrayNetwork2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (WinterFlowArrayNetwork2 & 4294967295L));
        float WinterFlowVariableVersionControl = winterFlowTransactionManagerBackend.WinterFlowVariableVersionControl(WinterFlowUnitTestResponse, WinterFlowTransactionManagerStrategy, WinterFlowArrayNetwork);
        float[] fArr = this.WinterFlowArrayNetwork;
        if (fArr != null) {
            intBitsToFloat *= fArr[0];
            intBitsToFloat2 *= fArr[1];
            WinterFlowVariableVersionControl *= fArr[2];
        }
        float f = intBitsToFloat;
        float f2 = intBitsToFloat2;
        return this.WinterFlowCacheManagerAgent.WinterFlowTransactionManagerStrategy(f, f2, WinterFlowVariableVersionControl, WinterFlowCacheManagerAgent, this.WinterFlowRouterStructure);
    }

    public WinterFlowNodeMechanism(WinterFlowTransactionManagerBackend winterFlowTransactionManagerBackend, WinterFlowTransactionManagerBackend winterFlowTransactionManagerBackend2, WinterFlowTransactionManagerBackend winterFlowTransactionManagerBackend3, float[] fArr) {
        this.WinterFlowRouterStructure = winterFlowTransactionManagerBackend;
        this.WinterFlowHookDataSource = winterFlowTransactionManagerBackend2;
        this.WinterFlowCacheManagerAgent = winterFlowTransactionManagerBackend3;
        this.WinterFlowArrayNetwork = fArr;
    }
}
