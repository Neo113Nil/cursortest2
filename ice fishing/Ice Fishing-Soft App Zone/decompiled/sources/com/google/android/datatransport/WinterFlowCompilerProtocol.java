package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowCompilerProtocol implements WinterFlowObjectUI {
    public final /* synthetic */ WinterFlowHandlerInvoker WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowCompilerProtocol(WinterFlowHandlerInvoker winterFlowHandlerInvoker, int i) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = winterFlowHandlerInvoker;
    }

    @Override // com.google.android.datatransport.WinterFlowObjectUI
    public final Object WinterFlowRouterStructure() {
        int i = this.WinterFlowVariableVersionControl;
        WinterFlowHandlerInvoker winterFlowHandlerInvoker = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return Boolean.valueOf((WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowHandlerInvoker.WinterFlowArrayNetwork.getValue(), winterFlowHandlerInvoker.WinterFlowRouterStructure.WinterFlowSyntax()) && winterFlowHandlerInvoker.WinterFlowUnitTestResponse.WinterFlowRouterRouter() == Long.MIN_VALUE && !((Boolean) winterFlowHandlerInvoker.WinterFlowRouterRouter.getValue()).booleanValue()) ? false : true);
            default:
                return Long.valueOf(winterFlowHandlerInvoker.WinterFlowHookDataSource());
        }
    }
}
