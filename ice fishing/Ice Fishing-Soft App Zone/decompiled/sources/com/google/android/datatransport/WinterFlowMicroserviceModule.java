package com.google.android.datatransport;

import java.util.ArrayList;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowMicroserviceModule extends WinterFlowThreadDebug {
    public static final WinterFlowMicroserviceModule WinterFlowCacheManagerAgent = new WinterFlowMicroserviceModule(0, 1, 1);

    @Override // com.google.android.datatransport.WinterFlowThreadDebug
    public final void WinterFlowRouterStructure(WinterFlowProviderEntity winterFlowProviderEntity, WinterFlowProcessorConsumer winterFlowProcessorConsumer, WinterFlowServiceProviderListener winterFlowServiceProviderListener, WinterFlowValidator winterFlowValidator, WinterFlowListenerUtility winterFlowListenerUtility) {
        WinterFlowJSON winterFlowJSON;
        WinterFlowStackEngine winterFlowStackEngine = (WinterFlowStackEngine) winterFlowProviderEntity.WinterFlowCacheManagerAgent(0);
        WinterFlowDatabaseSchemaStructure winterFlowDatabaseSchemaStructure = winterFlowValidator.WinterFlowSyntax;
        if (winterFlowDatabaseSchemaStructure == null || ((WinterFlowServiceProviderConfiguration) winterFlowDatabaseSchemaStructure.WinterFlowUnitTestResponse(winterFlowStackEngine)) == null) {
            return;
        }
        ArrayList arrayList = winterFlowValidator.WinterFlowResponseEngine;
        if (arrayList != null && (winterFlowJSON = (WinterFlowJSON) arrayList.remove(arrayList.size() - 1)) != null) {
            winterFlowValidator.WinterFlowVariableVersionControl = winterFlowJSON;
        }
        winterFlowDatabaseSchemaStructure.WinterFlowTransactionAgent(winterFlowStackEngine);
    }
}
