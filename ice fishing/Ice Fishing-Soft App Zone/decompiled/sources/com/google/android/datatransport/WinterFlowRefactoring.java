package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowRefactoring implements WinterFlowEventEvent {
    public final /* synthetic */ Object WinterFlowRouterRouter;
    public final /* synthetic */ Object WinterFlowSyntax;
    public final /* synthetic */ Object WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ int WinterFlowUnitTestResponse;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowRefactoring(WinterFlowScriptDatabaseSchema winterFlowScriptDatabaseSchema, Object obj, int i, Object obj2, int i2) {
        this.WinterFlowVariableVersionControl = 1;
        this.WinterFlowSyntax = winterFlowScriptDatabaseSchema;
        this.WinterFlowTransactionManagerStrategy = obj;
        this.WinterFlowUnitTestResponse = i;
        this.WinterFlowRouterRouter = obj2;
    }

    @Override // com.google.android.datatransport.WinterFlowEventEvent
    public final Object WinterFlowVariableVersionControl(Object obj, Object obj2) {
        int i = this.WinterFlowVariableVersionControl;
        int i2 = this.WinterFlowUnitTestResponse;
        Object obj3 = this.WinterFlowTransactionManagerStrategy;
        Object obj4 = this.WinterFlowRouterRouter;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        Object obj5 = this.WinterFlowSyntax;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((Integer) obj2).getClass();
                ((WinterFlowEventTool) obj5).WinterFlowRouterRouter(obj3, obj4, (WinterFlowResolverLibrary) obj, WinterFlowConfigurationException.WinterFlowResponseEngine(i2) | 1);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int WinterFlowResponseEngine = WinterFlowConfigurationException.WinterFlowResponseEngine(1);
                WinterFlowQuerySyntax.WinterFlowRouterStructure((WinterFlowScriptDatabaseSchema) obj5, this.WinterFlowTransactionManagerStrategy, this.WinterFlowUnitTestResponse, this.WinterFlowRouterRouter, (WinterFlowResolverLibrary) obj, WinterFlowResponseEngine);
                break;
            case 2:
                ((Integer) obj2).getClass();
                ((WinterFlowObjectUserManager) obj4).WinterFlowHookDataSource(obj3, (WinterFlowEventTool) obj5, (WinterFlowResolverLibrary) obj, WinterFlowConfigurationException.WinterFlowResponseEngine(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).intValue();
                WinterFlowSoftwareException.WinterFlowUnitTestResponse((WinterFlowDecoratorVersion) obj5, (WinterFlowNetworkStrategy) obj3, (WinterFlowObjectSession) obj4, (WinterFlowResolverLibrary) obj, WinterFlowConfigurationException.WinterFlowResponseEngine(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ((WinterFlowDecoratorPlatform) obj4).WinterFlowHookDataSource(obj3, (WinterFlowEventTool) obj5, (WinterFlowResolverLibrary) obj, WinterFlowConfigurationException.WinterFlowResponseEngine(i2 | 1));
                break;
        }
        return winterFlowAlgorithmSession;
    }

    public /* synthetic */ WinterFlowRefactoring(WinterFlowRefactoringServer winterFlowRefactoringServer, Object obj, WinterFlowEventTool winterFlowEventTool, int i, int i2) {
        this.WinterFlowVariableVersionControl = i2;
        this.WinterFlowRouterRouter = winterFlowRefactoringServer;
        this.WinterFlowTransactionManagerStrategy = obj;
        this.WinterFlowSyntax = winterFlowEventTool;
        this.WinterFlowUnitTestResponse = i;
    }

    public /* synthetic */ WinterFlowRefactoring(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.WinterFlowVariableVersionControl = i2;
        this.WinterFlowSyntax = obj;
        this.WinterFlowTransactionManagerStrategy = obj2;
        this.WinterFlowRouterRouter = obj3;
        this.WinterFlowUnitTestResponse = i;
    }
}
