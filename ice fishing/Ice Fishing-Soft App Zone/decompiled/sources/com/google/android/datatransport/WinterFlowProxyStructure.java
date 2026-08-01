package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.ScheduledFuture;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowProxyStructure implements WinterFlowWorkerNetwork {
    public final Object WinterFlowHookDataSource;
    public final /* synthetic */ int WinterFlowRouterStructure;

    public /* synthetic */ WinterFlowProxyStructure(int i, Object obj) {
        this.WinterFlowRouterStructure = i;
        this.WinterFlowHookDataSource = obj;
    }

    public final String toString() {
        int i = this.WinterFlowRouterStructure;
        Object obj = this.WinterFlowHookDataSource;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) obj) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((WinterFlowObjectSession) obj).getClass().getSimpleName() + '@' + WinterFlowQuerySyntax.WinterFlowBandwidthObject(this) + ']';
            default:
                return "DisposeOnCancel[" + ((WinterFlowVersionControlView) obj) + ']';
        }
    }
}
