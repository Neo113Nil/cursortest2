package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowResponseEntity implements WinterFlowObjectPlatform, WinterFlowListenerModule, WinterFlowMicroserviceMiddleware, WinterFlowTransactionDeserialization {
    public final WinterFlowExceptionParser WinterFlowRouterRouter;
    public final Executor WinterFlowTransactionManagerStrategy;
    public final WinterFlowModuleClass WinterFlowUnitTestResponse;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowResponseEntity(Executor executor, WinterFlowModuleClass winterFlowModuleClass, WinterFlowExceptionParser winterFlowExceptionParser, int i) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = executor;
        this.WinterFlowUnitTestResponse = winterFlowModuleClass;
        this.WinterFlowRouterRouter = winterFlowExceptionParser;
    }

    @Override // com.google.android.datatransport.WinterFlowMicroserviceMiddleware
    public void WinterFlowArrayNetwork(Exception exc) {
        this.WinterFlowRouterRouter.WinterFlowResponseEngine(exc);
    }

    @Override // com.google.android.datatransport.WinterFlowListenerModule
    public void WinterFlowCacheManagerAgent(Object obj) {
        this.WinterFlowRouterRouter.WinterFlowSyntax(obj);
    }

    @Override // com.google.android.datatransport.WinterFlowTransactionDeserialization
    public void WinterFlowHookDataSource() {
        this.WinterFlowRouterRouter.WinterFlowTransactionAgent();
    }

    @Override // com.google.android.datatransport.WinterFlowObjectPlatform
    public final void WinterFlowRouterStructure(WinterFlowExceptionParser winterFlowExceptionParser) {
        int i = this.WinterFlowVariableVersionControl;
        Executor executor = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                executor.execute(new WinterFlowProtocolThread(3, this, winterFlowExceptionParser));
                break;
            default:
                executor.execute(new WinterFlowProtocolThread(4, this, winterFlowExceptionParser));
                break;
        }
    }
}
