package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowRequestConfiguration implements WinterFlowAlgorithmSystem {
    public final /* synthetic */ WinterFlowBatchBatch WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowRequestConfiguration(WinterFlowBatchBatch winterFlowBatchBatch, int i) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = winterFlowBatchBatch;
    }

    @Override // com.google.android.datatransport.WinterFlowAlgorithmSystem
    public final double WinterFlowHookDataSource(double d) {
        int i = this.WinterFlowVariableVersionControl;
        WinterFlowBatchBatch winterFlowBatchBatch = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return WinterFlowDecoratorUI.WinterFlowUnitTestResponse(winterFlowBatchBatch.WinterFlowTransactionAgent.WinterFlowHookDataSource(d), winterFlowBatchBatch.WinterFlowVariableVersionControl, winterFlowBatchBatch.WinterFlowTransactionManagerStrategy);
            default:
                return winterFlowBatchBatch.WinterFlowServiceUtility.WinterFlowHookDataSource(WinterFlowDecoratorUI.WinterFlowUnitTestResponse(d, winterFlowBatchBatch.WinterFlowVariableVersionControl, winterFlowBatchBatch.WinterFlowTransactionManagerStrategy));
        }
    }
}
