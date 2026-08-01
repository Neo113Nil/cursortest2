package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowSoftwareModule extends WinterFlowDeserializationNetwork {
    public final WinterFlowLoaderHandler WinterFlowCacheManagerAgent;
    public final WinterFlowHandlerWebsocket WinterFlowHookDataSource;
    public final float WinterFlowRouterStructure;

    public WinterFlowSoftwareModule(float f, WinterFlowHandlerWebsocket winterFlowHandlerWebsocket, WinterFlowLoaderHandler winterFlowLoaderHandler) {
        this.WinterFlowRouterStructure = f;
        this.WinterFlowHookDataSource = winterFlowHandlerWebsocket;
        this.WinterFlowCacheManagerAgent = winterFlowLoaderHandler;
    }

    @Override // com.google.android.datatransport.WinterFlowDeserializationNetwork
    public final WinterFlowUserManagerController WinterFlowArrayNetwork() {
        return new WinterFlowHandlerInterface(this.WinterFlowRouterStructure, this.WinterFlowHookDataSource, this.WinterFlowCacheManagerAgent);
    }

    @Override // com.google.android.datatransport.WinterFlowDeserializationNetwork
    public final void WinterFlowVariableVersionControl(WinterFlowUserManagerController winterFlowUserManagerController) {
        WinterFlowHandlerInterface winterFlowHandlerInterface = (WinterFlowHandlerInterface) winterFlowUserManagerController;
        float f = winterFlowHandlerInterface.WinterFlowSerializerStructure;
        WinterFlowTestingObject winterFlowTestingObject = winterFlowHandlerInterface.WinterFlowConsumerUserManager;
        float f2 = this.WinterFlowRouterStructure;
        if (!WinterFlowRequestScheduler.WinterFlowHookDataSource(f, f2)) {
            winterFlowHandlerInterface.WinterFlowSerializerStructure = f2;
            winterFlowTestingObject.WinterFlowValidatorNetwork();
        }
        WinterFlowHandlerWebsocket winterFlowHandlerWebsocket = winterFlowHandlerInterface.WinterFlowMapperProtocol;
        WinterFlowHandlerWebsocket winterFlowHandlerWebsocket2 = this.WinterFlowHookDataSource;
        if (!WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowHandlerWebsocket, winterFlowHandlerWebsocket2)) {
            winterFlowHandlerInterface.WinterFlowMapperProtocol = winterFlowHandlerWebsocket2;
            winterFlowTestingObject.WinterFlowValidatorNetwork();
        }
        WinterFlowLoaderHandler winterFlowLoaderHandler = winterFlowHandlerInterface.WinterFlowResolverController;
        WinterFlowLoaderHandler winterFlowLoaderHandler2 = this.WinterFlowCacheManagerAgent;
        if (WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowLoaderHandler, winterFlowLoaderHandler2)) {
            return;
        }
        winterFlowHandlerInterface.WinterFlowResolverController = winterFlowLoaderHandler2;
        winterFlowTestingObject.WinterFlowValidatorNetwork();
        WinterFlowFrameworkMechanism.WinterFlowRouterRouter(winterFlowHandlerInterface);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowSoftwareModule)) {
            return false;
        }
        WinterFlowSoftwareModule winterFlowSoftwareModule = (WinterFlowSoftwareModule) obj;
        return WinterFlowRequestScheduler.WinterFlowHookDataSource(this.WinterFlowRouterStructure, winterFlowSoftwareModule.WinterFlowRouterStructure) && this.WinterFlowHookDataSource.equals(winterFlowSoftwareModule.WinterFlowHookDataSource) && this.WinterFlowCacheManagerAgent.equals(winterFlowSoftwareModule.WinterFlowCacheManagerAgent);
    }

    public final int hashCode() {
        return this.WinterFlowCacheManagerAgent.hashCode() + ((this.WinterFlowHookDataSource.hashCode() + (Float.hashCode(this.WinterFlowRouterStructure) * 31)) * 31);
    }

    public final String toString() {
        return "BorderModifierNodeElement(width=" + ((Object) WinterFlowRequestScheduler.WinterFlowCacheManagerAgent(this.WinterFlowRouterStructure)) + ", brush=" + this.WinterFlowHookDataSource + ", shape=" + this.WinterFlowCacheManagerAgent + ')';
    }
}
