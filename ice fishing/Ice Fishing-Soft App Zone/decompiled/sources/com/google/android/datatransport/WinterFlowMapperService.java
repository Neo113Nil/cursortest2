package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowMapperService implements WinterFlowEventEvent {
    public final /* synthetic */ Object WinterFlowRouterRouter;
    public final /* synthetic */ WinterFlowScriptDatabaseSchema WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ int WinterFlowUnitTestResponse;
    public final /* synthetic */ int WinterFlowVariableVersionControl = 0;

    public /* synthetic */ WinterFlowMapperService(int i, WinterFlowScriptDatabaseSchema winterFlowScriptDatabaseSchema, Object obj) {
        this.WinterFlowTransactionManagerStrategy = winterFlowScriptDatabaseSchema;
        this.WinterFlowUnitTestResponse = i;
        this.WinterFlowRouterRouter = obj;
    }

    @Override // com.google.android.datatransport.WinterFlowEventEvent
    public final Object WinterFlowVariableVersionControl(Object obj, Object obj2) {
        int i = this.WinterFlowVariableVersionControl;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        Object obj3 = this.WinterFlowRouterRouter;
        int i2 = this.WinterFlowUnitTestResponse;
        WinterFlowScriptDatabaseSchema winterFlowScriptDatabaseSchema = this.WinterFlowTransactionManagerStrategy;
        WinterFlowResolverLibrary winterFlowResolverLibrary = (WinterFlowResolverLibrary) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int intValue = num.intValue();
                if (!winterFlowResolverLibrary.WinterFlowFrontendBackend(intValue & 1, (intValue & 3) != 2)) {
                    winterFlowResolverLibrary.WinterFlowQueueService();
                    break;
                } else {
                    winterFlowScriptDatabaseSchema.WinterFlowRouterStructure(i2, obj3, winterFlowResolverLibrary, 0);
                    break;
                }
            default:
                num.getClass();
                winterFlowScriptDatabaseSchema.WinterFlowRouterStructure(i2, obj3, winterFlowResolverLibrary, WinterFlowConfigurationException.WinterFlowResponseEngine(1));
                break;
        }
        return winterFlowAlgorithmSession;
    }

    public /* synthetic */ WinterFlowMapperService(WinterFlowScriptDatabaseSchema winterFlowScriptDatabaseSchema, int i, Object obj, int i2) {
        this.WinterFlowTransactionManagerStrategy = winterFlowScriptDatabaseSchema;
        this.WinterFlowUnitTestResponse = i;
        this.WinterFlowRouterRouter = obj;
    }
}
