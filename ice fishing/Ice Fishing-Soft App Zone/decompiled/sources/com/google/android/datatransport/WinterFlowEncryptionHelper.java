package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowEncryptionHelper extends WinterFlowNodeInheritance implements WinterFlowEventEvent {
    public /* synthetic */ Object WinterFlowResponseEngine;
    public final /* synthetic */ int WinterFlowSyntax = 1;
    public final /* synthetic */ WinterFlowObjectSession WinterFlowTransactionAgent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowEncryptionHelper(WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, WinterFlowObjectSession winterFlowObjectSession) {
        super(2, winterFlowTransactionManagerLayer);
        this.WinterFlowTransactionAgent = winterFlowObjectSession;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final WinterFlowTransactionManagerLayer WinterFlowServerProtocol(WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, Object obj) {
        int i = this.WinterFlowSyntax;
        WinterFlowObjectSession winterFlowObjectSession = this.WinterFlowTransactionAgent;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowEncryptionHelper winterFlowEncryptionHelper = new WinterFlowEncryptionHelper(winterFlowTransactionManagerLayer, winterFlowObjectSession);
                winterFlowEncryptionHelper.WinterFlowResponseEngine = obj;
                return winterFlowEncryptionHelper;
            default:
                WinterFlowEncryptionHelper winterFlowEncryptionHelper2 = new WinterFlowEncryptionHelper(winterFlowObjectSession, winterFlowTransactionManagerLayer);
                winterFlowEncryptionHelper2.WinterFlowResponseEngine = obj;
                return winterFlowEncryptionHelper2;
        }
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final Object WinterFlowServiceUtility(Object obj) {
        int i = this.WinterFlowSyntax;
        WinterFlowObjectSession winterFlowObjectSession = this.WinterFlowTransactionAgent;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                WinterFlowDatabaseSchemaModule winterFlowDatabaseSchemaModule = (WinterFlowDatabaseSchemaModule) this.WinterFlowResponseEngine;
                winterFlowDatabaseSchemaModule.getClass();
                return winterFlowObjectSession.WinterFlowUnitTestResponse(winterFlowDatabaseSchemaModule.WinterFlowHookDataSource());
            default:
                WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                winterFlowObjectSession.WinterFlowUnitTestResponse((WinterFlowDataSourceSerializer) this.WinterFlowResponseEngine);
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        }
    }

    @Override // com.google.android.datatransport.WinterFlowEventEvent
    public final Object WinterFlowVariableVersionControl(Object obj, Object obj2) {
        int i = this.WinterFlowSyntax;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((WinterFlowEncryptionHelper) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowDatabaseSchemaModule) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
            default:
                ((WinterFlowEncryptionHelper) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowDataSourceSerializer) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
                return winterFlowAlgorithmSession;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowEncryptionHelper(WinterFlowObjectSession winterFlowObjectSession, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        super(2, winterFlowTransactionManagerLayer);
        this.WinterFlowTransactionAgent = winterFlowObjectSession;
    }
}
