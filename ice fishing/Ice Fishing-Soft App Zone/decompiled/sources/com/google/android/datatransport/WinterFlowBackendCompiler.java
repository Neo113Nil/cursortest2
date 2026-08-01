package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowBackendCompiler extends WinterFlowDebugFramework implements WinterFlowEventEvent {
    public final /* synthetic */ int WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ WinterFlowWorkerInvoker[] WinterFlowUnitTestResponse;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WinterFlowBackendCompiler(WinterFlowWorkerInvoker[] winterFlowWorkerInvokerArr, int i) {
        super(2);
        this.WinterFlowTransactionManagerStrategy = i;
        this.WinterFlowUnitTestResponse = winterFlowWorkerInvokerArr;
    }

    @Override // com.google.android.datatransport.WinterFlowEventEvent
    public final Object WinterFlowVariableVersionControl(Object obj, Object obj2) {
        int i = this.WinterFlowTransactionManagerStrategy;
        WinterFlowWorkerInvoker[] winterFlowWorkerInvokerArr = this.WinterFlowUnitTestResponse;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return Float.valueOf(WinterFlowDecoratorRouter.WinterFlowRouterRouter((WinterFlowDecoratorSessionManager) obj, true, winterFlowWorkerInvokerArr, ((Number) obj2).floatValue()));
            default:
                return Float.valueOf(WinterFlowDecoratorRouter.WinterFlowRouterRouter((WinterFlowDecoratorSessionManager) obj, false, winterFlowWorkerInvokerArr, ((Number) obj2).floatValue()));
        }
    }
}
