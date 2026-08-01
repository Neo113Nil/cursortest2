package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowResponseConsumer {
    public final /* synthetic */ Object WinterFlowHookDataSource;
    public final /* synthetic */ int WinterFlowRouterStructure;

    public /* synthetic */ WinterFlowResponseConsumer(int i, Object obj) {
        this.WinterFlowRouterStructure = i;
        this.WinterFlowHookDataSource = obj;
    }

    public final void WinterFlowHookDataSource() {
        int i = this.WinterFlowRouterStructure;
        Object obj = this.WinterFlowHookDataSource;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((WinterFlowResolverLibrary) obj).WinterFlowEventEmitterController++;
                break;
            default:
                ((WinterFlowServiceInvoker) obj).WinterFlowTransactionAgent++;
                break;
        }
    }

    public final void WinterFlowRouterStructure() {
        int i = this.WinterFlowRouterStructure;
        Object obj = this.WinterFlowHookDataSource;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowResolverLibrary winterFlowResolverLibrary = (WinterFlowResolverLibrary) obj;
                winterFlowResolverLibrary.WinterFlowEventEmitterController--;
                break;
            default:
                WinterFlowServiceInvoker winterFlowServiceInvoker = (WinterFlowServiceInvoker) obj;
                winterFlowServiceInvoker.WinterFlowTransactionAgent--;
                break;
        }
    }
}
