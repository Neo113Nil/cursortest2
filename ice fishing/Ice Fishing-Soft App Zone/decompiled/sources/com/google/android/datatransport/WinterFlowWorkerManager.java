package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowWorkerManager implements WinterFlowVersionControlScheduler {
    public static final WinterFlowWorkerManager WinterFlowHookDataSource = new WinterFlowWorkerManager(0);
    public final /* synthetic */ int WinterFlowRouterStructure;

    public /* synthetic */ WinterFlowWorkerManager(int i) {
        this.WinterFlowRouterStructure = i;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionControlScheduler
    public final boolean WinterFlowHookDataSource(Class cls) {
        switch (this.WinterFlowRouterStructure) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return WinterFlowDecoratorResponse.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    @Override // com.google.android.datatransport.WinterFlowVersionControlScheduler
    public final WinterFlowAdapterManager WinterFlowRouterStructure(Class cls) {
        switch (this.WinterFlowRouterStructure) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (!WinterFlowDecoratorResponse.class.isAssignableFrom(cls)) {
                    WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("Unsupported message type: ".concat(cls.getName()));
                    return null;
                }
                try {
                    return (WinterFlowAdapterManager) WinterFlowDecoratorResponse.WinterFlowArrayNetwork(cls.asSubclass(WinterFlowDecoratorResponse.class)).WinterFlowCacheManagerAgent(3);
                } catch (Exception e) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }
}
