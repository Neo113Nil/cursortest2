package com.google.android.datatransport;

import android.content.Context;
import android.os.Handler;
import com.adjust.sdk.AdjustTimeoutCallback;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowResolverSystem implements Runnable {
    public final /* synthetic */ Context WinterFlowRouterRouter;
    public final /* synthetic */ AdjustTimeoutCallback WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ ArrayList WinterFlowUnitTestResponse;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowResolverSystem(AdjustTimeoutCallback adjustTimeoutCallback, ArrayList arrayList, Context context, int i) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = adjustTimeoutCallback;
        this.WinterFlowUnitTestResponse = arrayList;
        this.WinterFlowRouterRouter = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.WinterFlowVariableVersionControl) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (this.WinterFlowTransactionManagerStrategy.getOnAdidReadListener() != null) {
                    synchronized (this.WinterFlowUnitTestResponse) {
                        this.WinterFlowUnitTestResponse.remove(this.WinterFlowTransactionManagerStrategy);
                    }
                    new Handler(this.WinterFlowRouterRouter.getMainLooper()).post(new WinterFlowDeploymentSystem(0, this));
                    return;
                }
                return;
            case 1:
                if (this.WinterFlowTransactionManagerStrategy.getOnAttributionReadListener() != null) {
                    synchronized (this.WinterFlowUnitTestResponse) {
                        this.WinterFlowUnitTestResponse.remove(this.WinterFlowTransactionManagerStrategy);
                    }
                    new Handler(this.WinterFlowRouterRouter.getMainLooper()).post(new WinterFlowDeploymentSystem(1, this));
                    return;
                }
                return;
            default:
                if (this.WinterFlowTransactionManagerStrategy.getOnThirdPartySharingSettingsReadListener() != null) {
                    synchronized (this.WinterFlowUnitTestResponse) {
                        this.WinterFlowUnitTestResponse.remove(this.WinterFlowTransactionManagerStrategy);
                    }
                    new Handler(this.WinterFlowRouterRouter.getMainLooper()).post(new WinterFlowDeploymentSystem(2, this));
                    return;
                }
                return;
        }
    }
}
