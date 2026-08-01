package com.adjust.sdk;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowCompilerVariable {
    public final long WinterFlowArrayNetwork;
    public final int WinterFlowCacheManagerAgent;
    public final int WinterFlowHookDataSource;
    public final int WinterFlowRouterStructure;
    public final String WinterFlowTransactionManagerStrategy;
    public final String WinterFlowUnitTestResponse;
    public final long WinterFlowVariableVersionControl;

    public WinterFlowCompilerVariable(ActivityState activityState) {
        this.WinterFlowRouterStructure = -1;
        this.WinterFlowHookDataSource = -1;
        this.WinterFlowCacheManagerAgent = -1;
        this.WinterFlowArrayNetwork = -1L;
        this.WinterFlowVariableVersionControl = -1L;
        this.WinterFlowTransactionManagerStrategy = null;
        this.WinterFlowUnitTestResponse = null;
        if (activityState == null) {
            return;
        }
        this.WinterFlowRouterStructure = activityState.eventCount;
        this.WinterFlowHookDataSource = activityState.sessionCount;
        this.WinterFlowCacheManagerAgent = activityState.subsessionCount;
        this.WinterFlowArrayNetwork = activityState.timeSpent;
        this.WinterFlowVariableVersionControl = activityState.sessionLength;
        this.WinterFlowTransactionManagerStrategy = activityState.uuid;
        this.WinterFlowUnitTestResponse = activityState.pushToken;
    }
}
