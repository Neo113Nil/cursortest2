package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowDatabaseResolver implements WinterFlowModuleHandler {
    public static final WinterFlowDatabaseResolver WinterFlowRouterStructure = new WinterFlowDatabaseResolver();

    @Override // com.google.android.datatransport.WinterFlowModuleHandler
    public final WinterFlowLibraryDeployment WinterFlowRouterStructure(WinterFlowJSONDecorator winterFlowJSONDecorator) {
        return new WinterFlowConfigurationNetwork(winterFlowJSONDecorator);
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return -1;
    }
}
