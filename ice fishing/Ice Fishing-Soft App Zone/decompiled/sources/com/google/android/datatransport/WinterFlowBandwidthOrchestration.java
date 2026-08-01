package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowBandwidthOrchestration implements WinterFlowDeserializationRenderer {
    public final /* synthetic */ TimeUnit WinterFlowResponseEngine;
    public final /* synthetic */ long WinterFlowRouterRouter;
    public final /* synthetic */ long WinterFlowSyntax;
    public final /* synthetic */ WinterFlowProxyThreadPool WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ Runnable WinterFlowUnitTestResponse;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowBandwidthOrchestration(WinterFlowProxyThreadPool winterFlowProxyThreadPool, Runnable runnable, long j, long j2, TimeUnit timeUnit, int i) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = winterFlowProxyThreadPool;
        this.WinterFlowUnitTestResponse = runnable;
        this.WinterFlowRouterRouter = j;
        this.WinterFlowSyntax = j2;
        this.WinterFlowResponseEngine = timeUnit;
    }

    @Override // com.google.android.datatransport.WinterFlowDeserializationRenderer
    public final ScheduledFuture WinterFlowRouterStructure(WinterFlowJSONDecorator winterFlowJSONDecorator) {
        int i = this.WinterFlowVariableVersionControl;
        Runnable runnable = this.WinterFlowUnitTestResponse;
        WinterFlowProxyThreadPool winterFlowProxyThreadPool = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return winterFlowProxyThreadPool.WinterFlowTransactionManagerStrategy.scheduleAtFixedRate(new WinterFlowMapperDecorator(winterFlowProxyThreadPool, runnable, winterFlowJSONDecorator, 0), this.WinterFlowRouterRouter, this.WinterFlowSyntax, this.WinterFlowResponseEngine);
            default:
                return winterFlowProxyThreadPool.WinterFlowTransactionManagerStrategy.scheduleWithFixedDelay(new WinterFlowMapperDecorator(winterFlowProxyThreadPool, runnable, winterFlowJSONDecorator, 2), this.WinterFlowRouterRouter, this.WinterFlowSyntax, this.WinterFlowResponseEngine);
        }
    }
}
