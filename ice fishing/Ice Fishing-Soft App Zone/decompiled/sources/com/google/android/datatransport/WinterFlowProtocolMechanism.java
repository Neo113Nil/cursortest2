package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowProtocolMechanism implements WinterFlowObjectPlatform, WinterFlowListenerModule, WinterFlowMicroserviceMiddleware, WinterFlowTransactionDeserialization {
    public final Object WinterFlowRouterRouter;
    public final Executor WinterFlowTransactionManagerStrategy;
    public final Object WinterFlowUnitTestResponse;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public WinterFlowProtocolMechanism(Executor executor, WinterFlowTransactionDeserialization winterFlowTransactionDeserialization) {
        this.WinterFlowVariableVersionControl = 0;
        this.WinterFlowUnitTestResponse = new Object();
        this.WinterFlowTransactionManagerStrategy = executor;
        this.WinterFlowRouterRouter = winterFlowTransactionDeserialization;
    }

    @Override // com.google.android.datatransport.WinterFlowMicroserviceMiddleware
    public void WinterFlowArrayNetwork(Exception exc) {
        ((WinterFlowExceptionParser) this.WinterFlowRouterRouter).WinterFlowResponseEngine(exc);
    }

    @Override // com.google.android.datatransport.WinterFlowListenerModule
    public void WinterFlowCacheManagerAgent(Object obj) {
        ((WinterFlowExceptionParser) this.WinterFlowRouterRouter).WinterFlowSyntax(obj);
    }

    @Override // com.google.android.datatransport.WinterFlowTransactionDeserialization
    public void WinterFlowHookDataSource() {
        ((WinterFlowExceptionParser) this.WinterFlowRouterRouter).WinterFlowTransactionAgent();
    }

    @Override // com.google.android.datatransport.WinterFlowObjectPlatform
    public final void WinterFlowRouterStructure(WinterFlowExceptionParser winterFlowExceptionParser) {
        switch (this.WinterFlowVariableVersionControl) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (winterFlowExceptionParser.WinterFlowArrayNetwork) {
                    synchronized (this.WinterFlowUnitTestResponse) {
                    }
                    this.WinterFlowTransactionManagerStrategy.execute(new WinterFlowDeploymentSystem(16, this));
                    return;
                }
                return;
            case 1:
                synchronized (this.WinterFlowUnitTestResponse) {
                }
                this.WinterFlowTransactionManagerStrategy.execute(new WinterFlowProtocolThread(5, this, winterFlowExceptionParser));
                return;
            case 2:
                if (winterFlowExceptionParser.WinterFlowRouterRouter() || winterFlowExceptionParser.WinterFlowArrayNetwork) {
                    return;
                }
                synchronized (this.WinterFlowUnitTestResponse) {
                }
                this.WinterFlowTransactionManagerStrategy.execute(new WinterFlowProtocolThread(6, this, winterFlowExceptionParser));
                return;
            case 3:
                if (winterFlowExceptionParser.WinterFlowRouterRouter()) {
                    synchronized (this.WinterFlowUnitTestResponse) {
                    }
                    this.WinterFlowTransactionManagerStrategy.execute(new WinterFlowProtocolThread(8, this, winterFlowExceptionParser));
                    return;
                }
                return;
            default:
                this.WinterFlowTransactionManagerStrategy.execute(new WinterFlowProtocolThread(10, this, winterFlowExceptionParser));
                return;
        }
    }

    public WinterFlowProtocolMechanism(Executor executor, WinterFlowDeserializationProcess winterFlowDeserializationProcess) {
        this.WinterFlowVariableVersionControl = 1;
        this.WinterFlowUnitTestResponse = new Object();
        this.WinterFlowTransactionManagerStrategy = executor;
        this.WinterFlowRouterRouter = winterFlowDeserializationProcess;
    }

    public WinterFlowProtocolMechanism(Executor executor, WinterFlowMicroserviceMiddleware winterFlowMicroserviceMiddleware) {
        this.WinterFlowVariableVersionControl = 2;
        this.WinterFlowUnitTestResponse = new Object();
        this.WinterFlowTransactionManagerStrategy = executor;
        this.WinterFlowRouterRouter = winterFlowMicroserviceMiddleware;
    }

    public WinterFlowProtocolMechanism(Executor executor, WinterFlowListenerModule winterFlowListenerModule) {
        this.WinterFlowVariableVersionControl = 3;
        this.WinterFlowUnitTestResponse = new Object();
        this.WinterFlowTransactionManagerStrategy = executor;
        this.WinterFlowRouterRouter = winterFlowListenerModule;
    }

    public WinterFlowProtocolMechanism(Executor executor, WinterFlowSoftwareRouter winterFlowSoftwareRouter, WinterFlowExceptionParser winterFlowExceptionParser) {
        this.WinterFlowVariableVersionControl = 4;
        this.WinterFlowTransactionManagerStrategy = executor;
        this.WinterFlowUnitTestResponse = winterFlowSoftwareRouter;
        this.WinterFlowRouterRouter = winterFlowExceptionParser;
    }
}
