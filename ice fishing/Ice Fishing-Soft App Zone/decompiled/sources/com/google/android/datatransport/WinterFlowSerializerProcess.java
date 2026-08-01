package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowSerializerProcess implements WinterFlowProviderView {
    public final Object WinterFlowHookDataSource;
    public final float WinterFlowRouterStructure;

    public WinterFlowSerializerProcess(float f, Object obj) {
        this.WinterFlowRouterStructure = f;
        this.WinterFlowHookDataSource = obj;
    }

    @Override // com.google.android.datatransport.WinterFlowModuleSingleton
    public final WinterFlowFrontendAgent WinterFlowRouterStructure(WinterFlowCacheManagerVersionControl winterFlowCacheManagerVersionControl) {
        WinterFlowAPIScheduler winterFlowAPIScheduler;
        Object obj = this.WinterFlowHookDataSource;
        WinterFlowConfigurationResponse winterFlowConfigurationResponse = obj == null ? null : (WinterFlowConfigurationResponse) ((WinterFlowObjectSession) winterFlowCacheManagerVersionControl.WinterFlowTransactionManagerStrategy).WinterFlowUnitTestResponse(obj);
        int i = WinterFlowTransactionSubsystem.WinterFlowRouterStructure;
        float f = this.WinterFlowRouterStructure;
        if (winterFlowConfigurationResponse != null) {
            winterFlowAPIScheduler = new WinterFlowJSONDecorator(winterFlowConfigurationResponse, f);
        } else {
            WinterFlowNodeSerializer winterFlowNodeSerializer = new WinterFlowNodeSerializer();
            winterFlowNodeSerializer.WinterFlowVariableVersionControl = new WinterFlowClassMechanism(f, 0.01f);
            winterFlowAPIScheduler = winterFlowNodeSerializer;
        }
        WinterFlowNodeSerializer winterFlowNodeSerializer2 = new WinterFlowNodeSerializer();
        winterFlowNodeSerializer2.WinterFlowVariableVersionControl = new WinterFlowStackProvider(winterFlowAPIScheduler);
        return winterFlowNodeSerializer2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof WinterFlowSerializerProcess)) {
            return false;
        }
        WinterFlowSerializerProcess winterFlowSerializerProcess = (WinterFlowSerializerProcess) obj;
        return winterFlowSerializerProcess.WinterFlowRouterStructure == this.WinterFlowRouterStructure && WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowSerializerProcess.WinterFlowHookDataSource, this.WinterFlowHookDataSource);
    }

    public final int hashCode() {
        Object obj = this.WinterFlowHookDataSource;
        return Float.hashCode(this.WinterFlowRouterStructure) + WinterFlowResolverBackend.WinterFlowCacheManagerAgent(1.0f, (obj != null ? obj.hashCode() : 0) * 31, 31);
    }
}
