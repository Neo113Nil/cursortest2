package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowMicroserviceAdapter implements WinterFlowBackendServer {
    public static Boolean WinterFlowHookDataSource;
    public static final WinterFlowMicroserviceAdapter WinterFlowRouterStructure = new WinterFlowMicroserviceAdapter();

    @Override // com.google.android.datatransport.WinterFlowBackendServer
    public final void WinterFlowHookDataSource(boolean z) {
        WinterFlowHookDataSource = Boolean.valueOf(z);
    }

    @Override // com.google.android.datatransport.WinterFlowBackendServer
    public final boolean WinterFlowRouterStructure() {
        Boolean bool = WinterFlowHookDataSource;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw WinterFlowResolverBackend.WinterFlowUnitTestResponse("canFocus is read before it is written");
    }
}
