package com.google.android.datatransport;

import java.util.ArrayList;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowHandlerRouter extends WinterFlowThreadDebug {
    public static final WinterFlowHandlerRouter WinterFlowCacheManagerAgent = new WinterFlowHandlerRouter(0, 1, 1);

    @Override // com.google.android.datatransport.WinterFlowThreadDebug
    public final void WinterFlowRouterStructure(WinterFlowProviderEntity winterFlowProviderEntity, WinterFlowProcessorConsumer winterFlowProcessorConsumer, WinterFlowServiceProviderListener winterFlowServiceProviderListener, WinterFlowValidator winterFlowValidator, WinterFlowListenerUtility winterFlowListenerUtility) {
        WinterFlowStackEngine winterFlowStackEngine = (WinterFlowStackEngine) winterFlowProviderEntity.WinterFlowCacheManagerAgent(0);
        WinterFlowDatabaseSchemaStructure winterFlowDatabaseSchemaStructure = winterFlowValidator.WinterFlowSyntax;
        WinterFlowServiceProviderConfiguration winterFlowServiceProviderConfiguration = winterFlowDatabaseSchemaStructure != null ? (WinterFlowServiceProviderConfiguration) winterFlowDatabaseSchemaStructure.WinterFlowUnitTestResponse(winterFlowStackEngine) : null;
        if (winterFlowServiceProviderConfiguration != null) {
            ArrayList arrayList = winterFlowValidator.WinterFlowResponseEngine;
            if (arrayList == null) {
                arrayList = new ArrayList();
                winterFlowValidator.WinterFlowResponseEngine = arrayList;
            }
            arrayList.add(winterFlowValidator.WinterFlowVariableVersionControl);
            winterFlowValidator.WinterFlowVariableVersionControl = winterFlowServiceProviderConfiguration.WinterFlowTransactionManagerStrategy;
        }
    }
}
