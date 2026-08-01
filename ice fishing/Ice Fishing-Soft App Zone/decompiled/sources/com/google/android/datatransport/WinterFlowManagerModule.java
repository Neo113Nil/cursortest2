package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public interface WinterFlowManagerModule extends WinterFlowLibraryDeployment {
    default boolean WinterFlowCloudMicroservice() {
        return false;
    }

    default void WinterFlowConfiguration() {
        WinterFlowOrchestrationConfiguration();
    }

    void WinterFlowOrchestrationConfiguration();

    void WinterFlowResolverController(WinterFlowCacheManagerUtility winterFlowCacheManagerUtility, WinterFlowJSONSerializer winterFlowJSONSerializer, long j);

    default void WinterFlowRouterStructure() {
        WinterFlowOrchestrationConfiguration();
    }

    default void WinterFlowVersionControlModule() {
    }
}
