package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowOrchestrationSession implements Executor {
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.WinterFlowVariableVersionControl) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowMiddlewareService.WinterFlowServiceUtility().WinterFlowHookDataSource.WinterFlowCacheManagerAgent.execute(runnable);
                break;
            default:
                runnable.run();
                break;
        }
    }
}
