package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowDecoratorDatabase implements WinterFlowObjectUI {
    public final /* synthetic */ WinterFlowWorkerThreadPool WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowDecoratorDatabase(WinterFlowWorkerThreadPool winterFlowWorkerThreadPool, int i) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = winterFlowWorkerThreadPool;
    }

    @Override // com.google.android.datatransport.WinterFlowObjectUI
    public final Object WinterFlowRouterStructure() {
        int i = this.WinterFlowVariableVersionControl;
        WinterFlowWorkerThreadPool winterFlowWorkerThreadPool = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Object WinterFlowCompilerVariable = winterFlowWorkerThreadPool.WinterFlowCompilerVariable();
                return (WinterFlowIDEVariable) (WinterFlowCompilerVariable instanceof WinterFlowGatewayParser ? null : WinterFlowCompilerVariable);
            default:
                Object WinterFlowCompilerVariable2 = winterFlowWorkerThreadPool.WinterFlowCompilerVariable();
                return (WinterFlowAdapterUtility) (WinterFlowCompilerVariable2 instanceof WinterFlowGatewayParser ? null : WinterFlowCompilerVariable2);
        }
    }
}
