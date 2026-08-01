package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowServiceService {
    public static final WinterFlowConfigurationModule WinterFlowRouterStructure;

    static {
        WinterFlowConfigurationModule winterFlowConfigurationModule = new WinterFlowConfigurationModule(11, false);
        winterFlowConfigurationModule.WinterFlowTransactionManagerStrategy = WinterFlowIDEEngine.WinterFlowTransactionAgent != null ? winterFlowConfigurationModule.WinterFlowTransactionAgent() : null;
        WinterFlowRouterStructure = winterFlowConfigurationModule;
    }
}
