package com.google.android.datatransport;

import java.util.Set;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowDeserializationLibrary extends WinterFlowThreadDebug {
    public static final WinterFlowDeserializationLibrary WinterFlowCacheManagerAgent = new WinterFlowDeserializationLibrary(0, 1, 1);

    @Override // com.google.android.datatransport.WinterFlowThreadDebug
    public final void WinterFlowRouterStructure(WinterFlowProviderEntity winterFlowProviderEntity, WinterFlowProcessorConsumer winterFlowProcessorConsumer, WinterFlowServiceProviderListener winterFlowServiceProviderListener, WinterFlowValidator winterFlowValidator, WinterFlowListenerUtility winterFlowListenerUtility) {
        WinterFlowStackEngine winterFlowStackEngine = (WinterFlowStackEngine) winterFlowProviderEntity.WinterFlowCacheManagerAgent(0);
        Set set = winterFlowValidator.WinterFlowRouterStructure;
        if (set == null) {
            return;
        }
        WinterFlowServiceProviderConfiguration winterFlowServiceProviderConfiguration = new WinterFlowServiceProviderConfiguration(set);
        WinterFlowDatabaseSchemaStructure winterFlowDatabaseSchemaStructure = winterFlowValidator.WinterFlowSyntax;
        if (winterFlowDatabaseSchemaStructure == null) {
            long[] jArr = WinterFlowDatabaseSchemaUtility.WinterFlowRouterStructure;
            winterFlowDatabaseSchemaStructure = new WinterFlowDatabaseSchemaStructure();
            winterFlowValidator.WinterFlowSyntax = winterFlowDatabaseSchemaStructure;
        }
        winterFlowDatabaseSchemaStructure.WinterFlowThreadListener(winterFlowStackEngine, winterFlowServiceProviderConfiguration);
        winterFlowValidator.WinterFlowVariableVersionControl.WinterFlowHookDataSource(new WinterFlowFrontendHandler(winterFlowServiceProviderConfiguration, -1));
    }
}
