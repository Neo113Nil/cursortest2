package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowResponseComponent extends WinterFlowDebugFramework implements WinterFlowObjectSession {
    public final /* synthetic */ int WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ WinterFlowBatchBatch WinterFlowUnitTestResponse;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WinterFlowResponseComponent(WinterFlowBatchBatch winterFlowBatchBatch, int i) {
        super(1);
        this.WinterFlowTransactionManagerStrategy = i;
        this.WinterFlowUnitTestResponse = winterFlowBatchBatch;
    }

    @Override // com.google.android.datatransport.WinterFlowObjectSession
    public final Object WinterFlowUnitTestResponse(Object obj) {
        int i = this.WinterFlowTransactionManagerStrategy;
        WinterFlowBatchBatch winterFlowBatchBatch = this.WinterFlowUnitTestResponse;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return Double.valueOf(winterFlowBatchBatch.WinterFlowServiceUtility.WinterFlowHookDataSource(WinterFlowDecoratorUI.WinterFlowUnitTestResponse(((Number) obj).doubleValue(), winterFlowBatchBatch.WinterFlowVariableVersionControl, winterFlowBatchBatch.WinterFlowTransactionManagerStrategy)));
            default:
                return Double.valueOf(WinterFlowDecoratorUI.WinterFlowUnitTestResponse(winterFlowBatchBatch.WinterFlowTransactionAgent.WinterFlowHookDataSource(((Number) obj).doubleValue()), winterFlowBatchBatch.WinterFlowVariableVersionControl, winterFlowBatchBatch.WinterFlowTransactionManagerStrategy));
        }
    }
}
