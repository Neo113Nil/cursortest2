package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowCompilerAgent implements WinterFlowResponseSubsystem {
    public static final WinterFlowCompilerAgent WinterFlowRouterStructure = new WinterFlowCompilerAgent();
    public static final WinterFlowAlgorithmHelper WinterFlowHookDataSource = WinterFlowAlgorithmHelper.WinterFlowRouterStructure("networkType");
    public static final WinterFlowAlgorithmHelper WinterFlowCacheManagerAgent = WinterFlowAlgorithmHelper.WinterFlowRouterStructure("mobileSubtype");

    @Override // com.google.android.datatransport.WinterFlowModuleTransactionManager
    public final void WinterFlowRouterStructure(Object obj, Object obj2) {
        WinterFlowJavaHook winterFlowJavaHook = (WinterFlowJavaHook) obj;
        WinterFlowQueueHandler winterFlowQueueHandler = (WinterFlowQueueHandler) obj2;
        winterFlowQueueHandler.WinterFlowRouterStructure(WinterFlowHookDataSource, ((WinterFlowControllerAdapter) winterFlowJavaHook).WinterFlowRouterStructure);
        winterFlowQueueHandler.WinterFlowRouterStructure(WinterFlowCacheManagerAgent, ((WinterFlowControllerAdapter) winterFlowJavaHook).WinterFlowHookDataSource);
    }
}
