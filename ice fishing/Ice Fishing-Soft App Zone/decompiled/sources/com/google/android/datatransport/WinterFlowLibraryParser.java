package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Map;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowLibraryParser implements WinterFlowResponseSubsystem {
    public final /* synthetic */ int WinterFlowRouterStructure;

    public /* synthetic */ WinterFlowLibraryParser(int i) {
        this.WinterFlowRouterStructure = i;
    }

    @Override // com.google.android.datatransport.WinterFlowModuleTransactionManager
    public final void WinterFlowRouterStructure(Object obj, Object obj2) {
        switch (this.WinterFlowRouterStructure) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new WinterFlowArrayManager("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                WinterFlowQueueHandler winterFlowQueueHandler = (WinterFlowQueueHandler) obj2;
                winterFlowQueueHandler.WinterFlowRouterStructure(WinterFlowArray.WinterFlowTransactionManagerStrategy, entry.getKey());
                winterFlowQueueHandler.WinterFlowRouterStructure(WinterFlowArray.WinterFlowUnitTestResponse, entry.getValue());
                return;
            default:
                throw new WinterFlowArrayManager("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
