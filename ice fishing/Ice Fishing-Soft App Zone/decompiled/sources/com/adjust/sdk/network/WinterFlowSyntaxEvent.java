package com.adjust.sdk.network;

import com.adjust.sdk.ActivityPackage;
import com.adjust.sdk.network.IActivityPackageSender;
import java.util.Map;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowSyntaxEvent implements Runnable {
    public final /* synthetic */ ActivityPackageSender WinterFlowRouterRouter;
    public final /* synthetic */ ActivityPackage WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ Map WinterFlowUnitTestResponse;
    public final /* synthetic */ IActivityPackageSender.ResponseDataCallbackSubscriber WinterFlowVariableVersionControl;

    public WinterFlowSyntaxEvent(ActivityPackageSender activityPackageSender, IActivityPackageSender.ResponseDataCallbackSubscriber responseDataCallbackSubscriber, ActivityPackage activityPackage, Map map) {
        this.WinterFlowRouterRouter = activityPackageSender;
        this.WinterFlowVariableVersionControl = responseDataCallbackSubscriber;
        this.WinterFlowTransactionManagerStrategy = activityPackage;
        this.WinterFlowUnitTestResponse = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.WinterFlowVariableVersionControl.onResponseDataCallback(this.WinterFlowRouterRouter.sendActivityPackageSync(this.WinterFlowTransactionManagerStrategy, this.WinterFlowUnitTestResponse));
    }
}
