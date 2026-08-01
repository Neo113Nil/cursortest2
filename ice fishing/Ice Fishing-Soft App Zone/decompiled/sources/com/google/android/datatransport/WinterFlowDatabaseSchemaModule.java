package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowDatabaseSchemaModule implements WinterFlowVariableRefactoring, WinterFlowJavaDeployment {
    public final /* synthetic */ Object WinterFlowHookDataSource;
    public final /* synthetic */ int WinterFlowRouterStructure;

    public /* synthetic */ WinterFlowDatabaseSchemaModule(int i, Object obj) {
        this.WinterFlowRouterStructure = i;
        this.WinterFlowHookDataSource = obj;
    }

    @Override // com.google.android.datatransport.WinterFlowVariableRefactoring
    public final WinterFlowDeserializationHandler WinterFlowHookDataSource() {
        int i = this.WinterFlowRouterStructure;
        Object obj = this.WinterFlowHookDataSource;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((WinterFlowHookPlatform) obj).WinterFlowHookDataSource;
            default:
                return ((WinterFlowClassNode) obj).WinterFlowHookDataSource;
        }
    }

    @Override // com.google.android.datatransport.WinterFlowJavaDeployment
    public final Object WinterFlowRouterStructure(String str, WinterFlowObjectSession winterFlowObjectSession, WinterFlowOrchestrationCompiler winterFlowOrchestrationCompiler) {
        int i = this.WinterFlowRouterStructure;
        Object obj = this.WinterFlowHookDataSource;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((WinterFlowHookPlatform) obj).WinterFlowRouterStructure(str, winterFlowObjectSession, winterFlowOrchestrationCompiler);
            default:
                return ((WinterFlowClassNode) obj).WinterFlowRouterStructure(str, winterFlowObjectSession, winterFlowOrchestrationCompiler);
        }
    }
}
