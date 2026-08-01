package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public interface WinterFlowDeserializationModule extends WinterFlowMapperManager {
    @Override // com.google.android.datatransport.WinterFlowMapperManager
    default boolean WinterFlowHookDataSource(WinterFlowObjectSession winterFlowObjectSession) {
        return ((Boolean) winterFlowObjectSession.WinterFlowUnitTestResponse(this)).booleanValue();
    }

    @Override // com.google.android.datatransport.WinterFlowMapperManager
    default Object WinterFlowRouterStructure(WinterFlowEventEvent winterFlowEventEvent, Object obj) {
        return winterFlowEventEvent.WinterFlowVariableVersionControl(obj, this);
    }
}
