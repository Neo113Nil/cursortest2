package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowManagerSession implements WinterFlowMapperManager {
    public final WinterFlowMapperManager WinterFlowHookDataSource;
    public final WinterFlowMapperManager WinterFlowRouterStructure;

    public WinterFlowManagerSession(WinterFlowMapperManager winterFlowMapperManager, WinterFlowMapperManager winterFlowMapperManager2) {
        this.WinterFlowRouterStructure = winterFlowMapperManager;
        this.WinterFlowHookDataSource = winterFlowMapperManager2;
    }

    @Override // com.google.android.datatransport.WinterFlowMapperManager
    public final boolean WinterFlowHookDataSource(WinterFlowObjectSession winterFlowObjectSession) {
        return this.WinterFlowRouterStructure.WinterFlowHookDataSource(winterFlowObjectSession) && this.WinterFlowHookDataSource.WinterFlowHookDataSource(winterFlowObjectSession);
    }

    @Override // com.google.android.datatransport.WinterFlowMapperManager
    public final Object WinterFlowRouterStructure(WinterFlowEventEvent winterFlowEventEvent, Object obj) {
        return this.WinterFlowHookDataSource.WinterFlowRouterStructure(winterFlowEventEvent, this.WinterFlowRouterStructure.WinterFlowRouterStructure(winterFlowEventEvent, obj));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof WinterFlowManagerSession)) {
            return false;
        }
        WinterFlowManagerSession winterFlowManagerSession = (WinterFlowManagerSession) obj;
        return this.WinterFlowRouterStructure.equals(winterFlowManagerSession.WinterFlowRouterStructure) && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowHookDataSource, winterFlowManagerSession.WinterFlowHookDataSource);
    }

    public final int hashCode() {
        return (this.WinterFlowHookDataSource.hashCode() * 31) + this.WinterFlowRouterStructure.hashCode();
    }

    public final String toString() {
        return "[" + ((String) WinterFlowRouterStructure(WinterFlowExceptionBackend.WinterFlowBandwidthObject, "")) + ']';
    }
}
