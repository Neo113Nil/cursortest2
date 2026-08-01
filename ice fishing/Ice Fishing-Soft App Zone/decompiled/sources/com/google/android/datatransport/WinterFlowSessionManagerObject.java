package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowSessionManagerObject implements WinterFlowObjectSession {
    public final /* synthetic */ WinterFlowTestingConcurrency WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowSessionManagerObject(WinterFlowTestingConcurrency winterFlowTestingConcurrency, int i) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = winterFlowTestingConcurrency;
    }

    @Override // com.google.android.datatransport.WinterFlowObjectSession
    public final Object WinterFlowUnitTestResponse(Object obj) {
        int i = this.WinterFlowVariableVersionControl;
        WinterFlowTestingConcurrency winterFlowTestingConcurrency = this.WinterFlowTransactionManagerStrategy;
        WinterFlowAlgorithmEntity winterFlowAlgorithmEntity = (WinterFlowAlgorithmEntity) obj;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                winterFlowAlgorithmEntity.getClass();
                WinterFlowTestingConcurrency winterFlowTestingConcurrency2 = (WinterFlowTestingConcurrency) winterFlowAlgorithmEntity;
                WinterFlowDatabaseCompiler winterFlowDatabaseCompiler = winterFlowTestingConcurrency.WinterFlowBatchUI;
                if (!WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowTestingConcurrency2.WinterFlowVariableBandwidth, winterFlowDatabaseCompiler)) {
                    winterFlowTestingConcurrency2.WinterFlowVariableBandwidth = winterFlowDatabaseCompiler;
                    winterFlowTestingConcurrency2.WinterFlowRouterAdapter.WinterFlowUnitTestResponse(winterFlowDatabaseCompiler);
                    winterFlowTestingConcurrency2.WinterFlowBatchUI = winterFlowDatabaseCompiler;
                    WinterFlowWorkerVersionControl.WinterFlowConcurrencyThread(winterFlowTestingConcurrency2, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new WinterFlowSessionManagerObject(winterFlowTestingConcurrency2, 0));
                }
                return WinterFlowSoftwareManager.WinterFlowTransactionManagerStrategy;
            default:
                winterFlowAlgorithmEntity.getClass();
                winterFlowTestingConcurrency.WinterFlowVariableBandwidth = ((WinterFlowTestingConcurrency) winterFlowAlgorithmEntity).WinterFlowBatchUI;
                return Boolean.FALSE;
        }
    }
}
