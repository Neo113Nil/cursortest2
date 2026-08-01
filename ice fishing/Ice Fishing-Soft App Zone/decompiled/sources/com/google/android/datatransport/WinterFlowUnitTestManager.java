package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowUnitTestManager extends WinterFlowDebugFramework implements WinterFlowObjectSession {
    public final /* synthetic */ int WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ WinterFlowScriptHandler WinterFlowUnitTestResponse;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WinterFlowUnitTestManager(WinterFlowScriptHandler winterFlowScriptHandler, int i) {
        super(1);
        this.WinterFlowTransactionManagerStrategy = i;
        this.WinterFlowUnitTestResponse = winterFlowScriptHandler;
    }

    @Override // com.google.android.datatransport.WinterFlowObjectSession
    public final Object WinterFlowUnitTestResponse(Object obj) {
        int i = this.WinterFlowTransactionManagerStrategy;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        WinterFlowScriptHandler winterFlowScriptHandler = this.WinterFlowUnitTestResponse;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                winterFlowScriptHandler.WinterFlowCacheManagerAgent = true;
                winterFlowScriptHandler.WinterFlowVariableVersionControl.WinterFlowRouterStructure();
                return winterFlowAlgorithmSession;
            default:
                WinterFlowParserUserManager winterFlowParserUserManager = (WinterFlowParserUserManager) obj;
                WinterFlowMicroserviceHandler winterFlowMicroserviceHandler = winterFlowScriptHandler.WinterFlowHookDataSource;
                float f = winterFlowScriptHandler.WinterFlowResponseEngine;
                float f2 = winterFlowScriptHandler.WinterFlowTransactionAgent;
                WinterFlowObjectPackage WinterFlowSerializerStructure = winterFlowParserUserManager.WinterFlowSerializerStructure();
                long WinterFlowThreadListener = WinterFlowSerializerStructure.WinterFlowThreadListener();
                WinterFlowSerializerStructure.WinterFlowTransactionAgent().WinterFlowTransactionAgent();
                try {
                    ((WinterFlowConfigurationModule) WinterFlowSerializerStructure.WinterFlowTransactionManagerStrategy).WinterFlowConcurrencyThread(f, f2, 0L);
                    winterFlowMicroserviceHandler.WinterFlowRouterStructure(winterFlowParserUserManager);
                    return winterFlowAlgorithmSession;
                } finally {
                    WinterFlowSerializerStructure.WinterFlowTransactionAgent().WinterFlowResponseEngine();
                    WinterFlowSerializerStructure.WinterFlowArrayHelper(WinterFlowThreadListener);
                }
        }
    }
}
