package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowCloudFrontend implements WinterFlowObjectUI {
    public final /* synthetic */ WinterFlowThreadPoolGateway WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowCloudFrontend(WinterFlowThreadPoolGateway winterFlowThreadPoolGateway, int i) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = winterFlowThreadPoolGateway;
    }

    @Override // com.google.android.datatransport.WinterFlowObjectUI
    public final Object WinterFlowRouterStructure() {
        int i = this.WinterFlowVariableVersionControl;
        WinterFlowThreadPoolGateway winterFlowThreadPoolGateway = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return (WinterFlowScriptDatabaseSchema) ((WinterFlowObjectUI) winterFlowThreadPoolGateway.getValue()).WinterFlowRouterStructure();
            default:
                return new WinterFlowDatabaseSchemaStrategy((WinterFlowObjectSession) winterFlowThreadPoolGateway.getValue());
        }
    }
}
