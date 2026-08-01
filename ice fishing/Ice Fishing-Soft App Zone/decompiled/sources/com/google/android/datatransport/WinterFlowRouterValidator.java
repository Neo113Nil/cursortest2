package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowRouterValidator extends WinterFlowDebugFramework implements WinterFlowObjectSession {
    public static final WinterFlowRouterValidator WinterFlowBandwidthObject;
    public static final WinterFlowRouterValidator WinterFlowResponseEngine;
    public static final WinterFlowRouterValidator WinterFlowRouterRouter;
    public static final WinterFlowRouterValidator WinterFlowServerProtocol;
    public static final WinterFlowRouterValidator WinterFlowServiceUtility;
    public static final WinterFlowRouterValidator WinterFlowSyntax;
    public static final WinterFlowRouterValidator WinterFlowThreadListener;
    public static final WinterFlowRouterValidator WinterFlowTransactionAgent;
    public static final WinterFlowRouterValidator WinterFlowUnitTestResponse;
    public final /* synthetic */ int WinterFlowTransactionManagerStrategy;

    static {
        int i = 1;
        WinterFlowUnitTestResponse = new WinterFlowRouterValidator(i, 0);
        WinterFlowRouterRouter = new WinterFlowRouterValidator(i, 1);
        WinterFlowSyntax = new WinterFlowRouterValidator(i, 2);
        WinterFlowResponseEngine = new WinterFlowRouterValidator(i, 3);
        WinterFlowTransactionAgent = new WinterFlowRouterValidator(i, 4);
        WinterFlowServerProtocol = new WinterFlowRouterValidator(i, 5);
        WinterFlowThreadListener = new WinterFlowRouterValidator(i, 6);
        WinterFlowServiceUtility = new WinterFlowRouterValidator(i, 7);
        WinterFlowBandwidthObject = new WinterFlowRouterValidator(i, 8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowRouterValidator(WinterFlowQueueTransaction winterFlowQueueTransaction) {
        super(1);
        this.WinterFlowTransactionManagerStrategy = 9;
    }

    @Override // com.google.android.datatransport.WinterFlowObjectSession
    public final Object WinterFlowUnitTestResponse(Object obj) {
        int i = this.WinterFlowTransactionManagerStrategy;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowSchedulerStructure winterFlowSchedulerStructure = (WinterFlowSchedulerStructure) obj;
                if (winterFlowSchedulerStructure.WinterFlowCacheManagerListener()) {
                    WinterFlowSchedulerStructure.WinterFlowCacheTool(winterFlowSchedulerStructure, false, 7);
                }
                return winterFlowAlgorithmSession;
            case 1:
                WinterFlowSchedulerStructure winterFlowSchedulerStructure2 = (WinterFlowSchedulerStructure) obj;
                if (winterFlowSchedulerStructure2.WinterFlowCacheManagerListener()) {
                    WinterFlowSchedulerStructure.WinterFlowConfiguration(winterFlowSchedulerStructure2, false, 7);
                }
                return winterFlowAlgorithmSession;
            case 2:
                WinterFlowSchedulerStructure winterFlowSchedulerStructure3 = (WinterFlowSchedulerStructure) obj;
                if (winterFlowSchedulerStructure3.WinterFlowCacheManagerListener()) {
                    winterFlowSchedulerStructure3.WinterFlowConfigurationSubsystem();
                }
                return winterFlowAlgorithmSession;
            case 3:
                return winterFlowAlgorithmSession;
            case 4:
                return winterFlowAlgorithmSession;
            case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                return Integer.valueOf(((WinterFlowRefactoringConsumer) obj).WinterFlowHookDataSource);
            case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                WinterFlowLibraryInterface winterFlowLibraryInterface = ((WinterFlowRefactoringConsumer) obj).WinterFlowCacheManagerAgent;
                return Integer.valueOf(winterFlowLibraryInterface.WinterFlowArrayNetwork - winterFlowLibraryInterface.WinterFlowHookDataSource);
            case WinterFlowJSONLibrary.DOUBLE_FIELD_NUMBER /* 7 */:
                return winterFlowAlgorithmSession;
            case WinterFlowJSONLibrary.BYTES_FIELD_NUMBER /* 8 */:
                throw null;
            default:
                WinterFlowManagerRefactoring.WinterFlowRouterStructure((WinterFlowXMLInterface) obj);
                return winterFlowAlgorithmSession;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WinterFlowRouterValidator(int i, int i2) {
        super(i);
        this.WinterFlowTransactionManagerStrategy = i2;
    }
}
