package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Comparator;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowVariableEntity implements Comparator {
    public final /* synthetic */ int WinterFlowRouterStructure;

    public /* synthetic */ WinterFlowVariableEntity(int i) {
        this.WinterFlowRouterStructure = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.WinterFlowRouterStructure) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return WinterFlowManagerRequest.WinterFlowBatchUI(((WinterFlowHandlerDeserialization) obj2).WinterFlowRouterStructure, ((WinterFlowHandlerDeserialization) obj).WinterFlowRouterStructure);
            case 1:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i = 0; i < bArr.length; i++) {
                    byte b = bArr[i];
                    byte b2 = bArr2[i];
                    if (b != b2) {
                        return b - b2;
                    }
                }
                return 0;
            case 2:
                return WinterFlowManagerRequest.WinterFlowBatchUI(((WinterFlowRouterVariable) obj).WinterFlowHookDataSource, ((WinterFlowRouterVariable) obj2).WinterFlowHookDataSource);
            case 3:
                WinterFlowCacheManagerListener winterFlowCacheManagerListener = (WinterFlowCacheManagerListener) obj;
                WinterFlowCacheManagerListener winterFlowCacheManagerListener2 = (WinterFlowCacheManagerListener) obj2;
                return (winterFlowCacheManagerListener.WinterFlowTransactionManagerStrategy - winterFlowCacheManagerListener.WinterFlowVariableVersionControl) - (winterFlowCacheManagerListener2.WinterFlowTransactionManagerStrategy - winterFlowCacheManagerListener2.WinterFlowVariableVersionControl);
            case 4:
                WinterFlowSchedulerStructure winterFlowSchedulerStructure = (WinterFlowSchedulerStructure) obj;
                WinterFlowSchedulerStructure winterFlowSchedulerStructure2 = (WinterFlowSchedulerStructure) obj2;
                float f = winterFlowSchedulerStructure.WinterFlowSoftwareEngine.WinterFlowOrchestrationSubsystem.WinterFlowSoftwareProtocol;
                float f2 = winterFlowSchedulerStructure2.WinterFlowSoftwareEngine.WinterFlowOrchestrationSubsystem.WinterFlowSoftwareProtocol;
                return f == f2 ? WinterFlowManagerRequest.WinterFlowBatchUI(winterFlowSchedulerStructure.WinterFlowRouterAdapter(), winterFlowSchedulerStructure2.WinterFlowRouterAdapter()) : Float.compare(f, f2);
            default:
                return WinterFlowManagerRequest.WinterFlowBatchUI(((WinterFlowServiceSyntax) obj).WinterFlowRouterStructure, ((WinterFlowServiceSyntax) obj2).WinterFlowRouterStructure);
        }
    }
}
