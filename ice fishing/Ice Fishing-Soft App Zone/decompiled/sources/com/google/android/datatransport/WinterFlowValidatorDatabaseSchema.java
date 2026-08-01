package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowValidatorDatabaseSchema {
    public String WinterFlowArrayNetwork;
    public String WinterFlowCacheManagerAgent;
    public int WinterFlowHookDataSource;
    public byte WinterFlowRouterRouter;
    public String WinterFlowRouterStructure;
    public long WinterFlowTransactionManagerStrategy;
    public String WinterFlowUnitTestResponse;
    public long WinterFlowVariableVersionControl;

    public final WinterFlowManagerEvent WinterFlowRouterStructure() {
        if (this.WinterFlowRouterRouter == 3 && this.WinterFlowHookDataSource != 0) {
            return new WinterFlowManagerEvent(this.WinterFlowRouterStructure, this.WinterFlowHookDataSource, this.WinterFlowCacheManagerAgent, this.WinterFlowArrayNetwork, this.WinterFlowVariableVersionControl, this.WinterFlowTransactionManagerStrategy, this.WinterFlowUnitTestResponse);
        }
        StringBuilder sb = new StringBuilder();
        if (this.WinterFlowHookDataSource == 0) {
            sb.append(" registrationStatus");
        }
        if ((this.WinterFlowRouterRouter & 1) == 0) {
            sb.append(" expiresInSecs");
        }
        if ((this.WinterFlowRouterRouter & 2) == 0) {
            sb.append(" tokenCreationEpochInSecs");
        }
        WinterFlowCompilerMechanism.WinterFlowRouterRouter(sb, "Missing required properties:");
        return null;
    }
}
