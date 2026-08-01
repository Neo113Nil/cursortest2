package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowLibraryUnitTest extends WinterFlowDebugFramework implements WinterFlowObjectUI {
    public final /* synthetic */ int WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ WinterFlowUIMicroservice WinterFlowUnitTestResponse;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WinterFlowLibraryUnitTest(WinterFlowUIMicroservice winterFlowUIMicroservice, int i) {
        super(0);
        this.WinterFlowTransactionManagerStrategy = i;
        this.WinterFlowUnitTestResponse = winterFlowUIMicroservice;
    }

    @Override // com.google.android.datatransport.WinterFlowObjectUI
    public final Object WinterFlowRouterStructure() {
        int i = this.WinterFlowTransactionManagerStrategy;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        WinterFlowUIMicroservice winterFlowUIMicroservice = this.WinterFlowUnitTestResponse;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowJavaLayer winterFlowJavaLayer = winterFlowUIMicroservice.WinterFlowTestingNode;
                winterFlowJavaLayer.getClass();
                winterFlowUIMicroservice.WinterFlowUserManagerConcurrency(winterFlowJavaLayer, winterFlowUIMicroservice.WinterFlowSyntaxSubsystem);
                break;
            default:
                WinterFlowUIMicroservice winterFlowUIMicroservice2 = winterFlowUIMicroservice.WinterFlowRouterAdapter;
                if (winterFlowUIMicroservice2 != null) {
                    winterFlowUIMicroservice2.WinterFlowRendererPackage();
                    break;
                }
                break;
        }
        return winterFlowAlgorithmSession;
    }
}
