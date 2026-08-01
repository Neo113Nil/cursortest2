package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowDatabaseObject extends WinterFlowDecoratorService implements WinterFlowEventEvent {
    public final /* synthetic */ int WinterFlowServerProtocol;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WinterFlowDatabaseObject(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.WinterFlowServerProtocol = i3;
    }

    @Override // com.google.android.datatransport.WinterFlowEventEvent
    public final Object WinterFlowVariableVersionControl(Object obj, Object obj2) {
        int i = this.WinterFlowServerProtocol;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        Object obj3 = this.WinterFlowVariableVersionControl;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((WinterFlowEventTool) obj3).WinterFlowCacheManagerAgent((WinterFlowResolverLibrary) obj, ((Number) obj2).intValue());
                break;
            case 1:
                WinterFlowConcurrencyThread winterFlowConcurrencyThread = (WinterFlowConcurrencyThread) obj3;
                WinterFlowCacheRuntime.WinterFlowStrategyTool(winterFlowConcurrencyThread.WinterFlowUIMiddleware.WinterFlowCacheManagerAgent(), null, new WinterFlowEncryptionUserManager(winterFlowConcurrencyThread, ((WinterFlowXMLNetwork) obj).WinterFlowRouterStructure, null, 2), 3);
                break;
            default:
                WinterFlowConcurrencyThread winterFlowConcurrencyThread2 = (WinterFlowConcurrencyThread) obj3;
                WinterFlowCacheRuntime.WinterFlowStrategyTool(winterFlowConcurrencyThread2.WinterFlowUIMiddleware.WinterFlowCacheManagerAgent(), null, new WinterFlowEncryptionUserManager(winterFlowConcurrencyThread2, ((WinterFlowXMLNetwork) obj).WinterFlowRouterStructure, null, 1), 3);
                break;
        }
        return winterFlowAlgorithmSession;
    }
}
