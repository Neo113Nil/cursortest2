package com.adjust.sdk;

import com.google.android.datatransport.WinterFlowResolverBackend;
import java.util.ArrayList;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowThreadPoolProtocol {
    public final ActivityHandler WinterFlowRouterStructure;
    public final ArrayList WinterFlowHookDataSource = new ArrayList();
    public int WinterFlowCacheManagerAgent = 0;

    public WinterFlowThreadPoolProtocol(ActivityHandler activityHandler) {
        this.WinterFlowRouterStructure = activityHandler;
    }

    public final void WinterFlowHookDataSource(String str, IRunActivityHandler iRunActivityHandler) {
        int i = this.WinterFlowCacheManagerAgent;
        ActivityHandler activityHandler = this.WinterFlowRouterStructure;
        if (i != 3) {
            iRunActivityHandler.run(activityHandler);
        } else {
            activityHandler.getAdjustConfig().getLogger().debug(WinterFlowResolverBackend.WinterFlowResponseEngine("Enqueuing \"", str, "\" action to be executed after first session delay ends"), new Object[0]);
            activityHandler.getAdjustConfig().preLaunchActions.preLaunchActionsArray.add(iRunActivityHandler);
        }
    }

    public final void WinterFlowRouterStructure(Runnable runnable, String str) {
        if (this.WinterFlowCacheManagerAgent != 3) {
            runnable.run();
        } else {
            this.WinterFlowRouterStructure.getAdjustConfig().getLogger().debug(WinterFlowResolverBackend.WinterFlowResponseEngine("Enqueuing \"", str, "\" action to be executed after first session delay ends"), new Object[0]);
            this.WinterFlowHookDataSource.add(runnable);
        }
    }
}
