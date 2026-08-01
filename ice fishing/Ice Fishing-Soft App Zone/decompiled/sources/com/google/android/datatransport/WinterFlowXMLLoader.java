package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowXMLLoader implements WinterFlowDecoratorThreadPool {
    public final /* synthetic */ Object WinterFlowHookDataSource;
    public final /* synthetic */ int WinterFlowRouterStructure;

    public /* synthetic */ WinterFlowXMLLoader(int i, Object obj) {
        this.WinterFlowRouterStructure = i;
        this.WinterFlowHookDataSource = obj;
    }

    @Override // com.google.android.datatransport.WinterFlowDecoratorThreadPool
    public final void accept(Object obj) {
        switch (this.WinterFlowRouterStructure) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowSchedulerEventEmitter winterFlowSchedulerEventEmitter = (WinterFlowSchedulerEventEmitter) obj;
                if (winterFlowSchedulerEventEmitter == null) {
                    winterFlowSchedulerEventEmitter = new WinterFlowSchedulerEventEmitter(-3);
                }
                ((WinterFlowAlgorithmArray) this.WinterFlowHookDataSource).WinterFlowConsumerUserManager(winterFlowSchedulerEventEmitter);
                return;
            default:
                WinterFlowSchedulerEventEmitter winterFlowSchedulerEventEmitter2 = (WinterFlowSchedulerEventEmitter) obj;
                synchronized (WinterFlowSessionManagerService.WinterFlowCacheManagerAgent) {
                    try {
                        WinterFlowParserRequest winterFlowParserRequest = WinterFlowSessionManagerService.WinterFlowArrayNetwork;
                        ArrayList arrayList = (ArrayList) winterFlowParserRequest.get((String) this.WinterFlowHookDataSource);
                        if (arrayList == null) {
                            return;
                        }
                        winterFlowParserRequest.remove((String) this.WinterFlowHookDataSource);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((WinterFlowDecoratorThreadPool) arrayList.get(i)).accept(winterFlowSchedulerEventEmitter2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
