package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowProxyWidget extends WinterFlowServerLayer {
    public final WinterFlowSchedulerEngine WinterFlowResponseEngine;
    public final WinterFlowEventTool WinterFlowTransactionAgent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowProxyWidget(WinterFlowJavaSubsystem winterFlowJavaSubsystem) {
        super(winterFlowJavaSubsystem);
        WinterFlowEventTool winterFlowEventTool = WinterFlowCacheManagerDeployment.WinterFlowRouterStructure;
        WinterFlowSchedulerEngine winterFlowSchedulerEngine = new WinterFlowSchedulerEngine();
        this.WinterFlowResponseEngine = winterFlowSchedulerEngine;
        this.WinterFlowTransactionAgent = winterFlowEventTool;
    }
}
