package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowBackendQuery implements WinterFlowConcurrencyParser {
    public WinterFlowConfigurationModule WinterFlowTransactionManagerStrategy;
    public WinterFlowDeserializationParser WinterFlowVariableVersionControl;

    @Override // com.google.android.datatransport.WinterFlowConcurrencyParser
    public final float WinterFlowHookDataSource() {
        return this.WinterFlowVariableVersionControl.WinterFlowHookDataSource().WinterFlowHookDataSource();
    }

    @Override // com.google.android.datatransport.WinterFlowConcurrencyParser
    public final float WinterFlowRouterRouter() {
        return this.WinterFlowVariableVersionControl.WinterFlowHookDataSource().WinterFlowRouterRouter();
    }

    public final WinterFlowConfigurationModule WinterFlowRouterStructure(WinterFlowObjectSession winterFlowObjectSession) {
        WinterFlowConfigurationModule winterFlowConfigurationModule = new WinterFlowConfigurationModule(14, false);
        winterFlowConfigurationModule.WinterFlowTransactionManagerStrategy = winterFlowObjectSession;
        this.WinterFlowTransactionManagerStrategy = winterFlowConfigurationModule;
        return winterFlowConfigurationModule;
    }
}
