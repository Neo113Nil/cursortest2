package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowFunctionSubsystem implements WinterFlowBatchCacheManager {
    public boolean WinterFlowResponseEngine;
    public long WinterFlowRouterRouter;
    public long WinterFlowSyntax;
    public final WinterFlowResolverSubsystem WinterFlowTransactionManagerStrategy;
    public WinterFlowConfigurationResponse WinterFlowUnitTestResponse;
    public final WinterFlowCacheManagerVersionControl WinterFlowVariableVersionControl;

    public WinterFlowFunctionSubsystem(WinterFlowCacheManagerVersionControl winterFlowCacheManagerVersionControl, Object obj, WinterFlowConfigurationResponse winterFlowConfigurationResponse, long j, long j2, boolean z) {
        WinterFlowConfigurationResponse winterFlowConfigurationResponse2;
        this.WinterFlowVariableVersionControl = winterFlowCacheManagerVersionControl;
        this.WinterFlowTransactionManagerStrategy = WinterFlowDecoratorUI.WinterFlowSerializerStructure(obj);
        if (winterFlowConfigurationResponse != null) {
            winterFlowConfigurationResponse2 = WinterFlowSoftwareException.WinterFlowResolverController(winterFlowConfigurationResponse);
        } else {
            winterFlowConfigurationResponse2 = (WinterFlowConfigurationResponse) ((WinterFlowObjectSession) winterFlowCacheManagerVersionControl.WinterFlowTransactionManagerStrategy).WinterFlowUnitTestResponse(obj);
            winterFlowConfigurationResponse2.WinterFlowArrayNetwork();
        }
        this.WinterFlowUnitTestResponse = winterFlowConfigurationResponse2;
        this.WinterFlowRouterRouter = j;
        this.WinterFlowSyntax = j2;
        this.WinterFlowResponseEngine = z;
    }

    @Override // com.google.android.datatransport.WinterFlowBatchCacheManager
    public final Object getValue() {
        return this.WinterFlowTransactionManagerStrategy.getValue();
    }

    public final String toString() {
        return "AnimationState(value=" + this.WinterFlowTransactionManagerStrategy.getValue() + ", velocity=" + ((WinterFlowObjectSession) this.WinterFlowVariableVersionControl.WinterFlowUnitTestResponse).WinterFlowUnitTestResponse(this.WinterFlowUnitTestResponse) + ", isRunning=" + this.WinterFlowResponseEngine + ", lastFrameTimeNanos=" + this.WinterFlowRouterRouter + ", finishedTimeNanos=" + this.WinterFlowSyntax + ')';
    }

    public /* synthetic */ WinterFlowFunctionSubsystem(WinterFlowCacheManagerVersionControl winterFlowCacheManagerVersionControl, Object obj, WinterFlowConfigurationResponse winterFlowConfigurationResponse, int i) {
        this(winterFlowCacheManagerVersionControl, obj, (i & 4) != 0 ? null : winterFlowConfigurationResponse, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }
}
