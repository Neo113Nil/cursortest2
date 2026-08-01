package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public interface WinterFlowMapperManager {
    default WinterFlowMapperManager WinterFlowCacheManagerAgent(WinterFlowMapperManager winterFlowMapperManager) {
        return winterFlowMapperManager == WinterFlowValidatorComponent.WinterFlowRouterStructure ? this : new WinterFlowManagerSession(this, winterFlowMapperManager);
    }

    boolean WinterFlowHookDataSource(WinterFlowObjectSession winterFlowObjectSession);

    Object WinterFlowRouterStructure(WinterFlowEventEvent winterFlowEventEvent, Object obj);
}
