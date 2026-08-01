package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowFrameworkHelper extends WinterFlowLibraryStrategy implements WinterFlowNodeSyntax, WinterFlowObjectUI {
    public final /* synthetic */ int WinterFlowServerProtocol;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WinterFlowFrameworkHelper(int i, int i2, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, i);
        this.WinterFlowServerProtocol = i2;
    }

    @Override // com.google.android.datatransport.WinterFlowRuntimeComponent
    public final WinterFlowDatabaseFramework WinterFlowCacheManagerAgent() {
        WinterFlowListenerProtocol.WinterFlowRouterStructure.getClass();
        return this;
    }

    @Override // com.google.android.datatransport.WinterFlowObjectUI
    public final Object WinterFlowRouterStructure() {
        int i = this.WinterFlowServerProtocol;
        Object obj = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((WinterFlowBatchCacheManager) obj).getValue();
            default:
                return obj.getClass().getSimpleName();
        }
    }
}
