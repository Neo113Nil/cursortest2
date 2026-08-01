package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowMapperDecorator implements Runnable {
    public final /* synthetic */ WinterFlowJSONDecorator WinterFlowRouterRouter;
    public final /* synthetic */ WinterFlowProxyThreadPool WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ Runnable WinterFlowUnitTestResponse;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowMapperDecorator(WinterFlowProxyThreadPool winterFlowProxyThreadPool, Runnable runnable, WinterFlowJSONDecorator winterFlowJSONDecorator, int i) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = winterFlowProxyThreadPool;
        this.WinterFlowUnitTestResponse = runnable;
        this.WinterFlowRouterRouter = winterFlowJSONDecorator;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.WinterFlowVariableVersionControl;
        final WinterFlowJSONDecorator winterFlowJSONDecorator = this.WinterFlowRouterRouter;
        final Runnable runnable = this.WinterFlowUnitTestResponse;
        WinterFlowProxyThreadPool winterFlowProxyThreadPool = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                final int i2 = 0;
                winterFlowProxyThreadPool.WinterFlowVariableVersionControl.execute(new Runnable() { // from class: com.google.android.datatransport.WinterFlowDebugVersionControl
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i3 = i2;
                        WinterFlowJSONDecorator winterFlowJSONDecorator2 = winterFlowJSONDecorator;
                        Runnable runnable2 = runnable;
                        switch (i3) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    winterFlowJSONDecorator2.WinterFlowVariableBandwidth(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    winterFlowJSONDecorator2.WinterFlowVariableBandwidth(e2);
                                    return;
                                }
                            default:
                                try {
                                    runnable2.run();
                                    WinterFlowGatewayStructure winterFlowGatewayStructure = (WinterFlowGatewayStructure) winterFlowJSONDecorator2.WinterFlowTransactionManagerStrategy;
                                    if (WinterFlowThreadHelper.WinterFlowResponseEngine.WinterFlowBatchUI(winterFlowGatewayStructure, null, WinterFlowThreadHelper.WinterFlowTransactionAgent)) {
                                        WinterFlowThreadHelper.WinterFlowCacheManagerAgent(winterFlowGatewayStructure);
                                        return;
                                    }
                                    return;
                                } catch (Exception e3) {
                                    winterFlowJSONDecorator2.WinterFlowVariableBandwidth(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 1:
                final int i3 = 2;
                winterFlowProxyThreadPool.WinterFlowVariableVersionControl.execute(new Runnable() { // from class: com.google.android.datatransport.WinterFlowDebugVersionControl
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i32 = i3;
                        WinterFlowJSONDecorator winterFlowJSONDecorator2 = winterFlowJSONDecorator;
                        Runnable runnable2 = runnable;
                        switch (i32) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    winterFlowJSONDecorator2.WinterFlowVariableBandwidth(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    winterFlowJSONDecorator2.WinterFlowVariableBandwidth(e2);
                                    return;
                                }
                            default:
                                try {
                                    runnable2.run();
                                    WinterFlowGatewayStructure winterFlowGatewayStructure = (WinterFlowGatewayStructure) winterFlowJSONDecorator2.WinterFlowTransactionManagerStrategy;
                                    if (WinterFlowThreadHelper.WinterFlowResponseEngine.WinterFlowBatchUI(winterFlowGatewayStructure, null, WinterFlowThreadHelper.WinterFlowTransactionAgent)) {
                                        WinterFlowThreadHelper.WinterFlowCacheManagerAgent(winterFlowGatewayStructure);
                                        return;
                                    }
                                    return;
                                } catch (Exception e3) {
                                    winterFlowJSONDecorator2.WinterFlowVariableBandwidth(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                final int i4 = 1;
                winterFlowProxyThreadPool.WinterFlowVariableVersionControl.execute(new Runnable() { // from class: com.google.android.datatransport.WinterFlowDebugVersionControl
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i32 = i4;
                        WinterFlowJSONDecorator winterFlowJSONDecorator2 = winterFlowJSONDecorator;
                        Runnable runnable2 = runnable;
                        switch (i32) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    winterFlowJSONDecorator2.WinterFlowVariableBandwidth(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    winterFlowJSONDecorator2.WinterFlowVariableBandwidth(e2);
                                    return;
                                }
                            default:
                                try {
                                    runnable2.run();
                                    WinterFlowGatewayStructure winterFlowGatewayStructure = (WinterFlowGatewayStructure) winterFlowJSONDecorator2.WinterFlowTransactionManagerStrategy;
                                    if (WinterFlowThreadHelper.WinterFlowResponseEngine.WinterFlowBatchUI(winterFlowGatewayStructure, null, WinterFlowThreadHelper.WinterFlowTransactionAgent)) {
                                        WinterFlowThreadHelper.WinterFlowCacheManagerAgent(winterFlowGatewayStructure);
                                        return;
                                    }
                                    return;
                                } catch (Exception e3) {
                                    winterFlowJSONDecorator2.WinterFlowVariableBandwidth(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
        }
    }
}
