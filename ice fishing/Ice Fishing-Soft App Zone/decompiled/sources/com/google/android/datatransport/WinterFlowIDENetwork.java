package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowIDENetwork implements WinterFlowProcessorConsumer {
    public final Object WinterFlowUnitTestResponse;
    public final WinterFlowTransactionStructure WinterFlowVariableVersionControl = new WinterFlowTransactionStructure();
    public final WinterFlowMicroserviceFunction WinterFlowTransactionManagerStrategy = new WinterFlowMicroserviceFunction();

    public WinterFlowIDENetwork(Object obj) {
        this.WinterFlowUnitTestResponse = obj;
    }

    @Override // com.google.android.datatransport.WinterFlowProcessorConsumer
    public final void WinterFlowArrayNetwork() {
        this.WinterFlowVariableVersionControl.WinterFlowRouterStructure(8);
    }

    @Override // com.google.android.datatransport.WinterFlowProcessorConsumer
    public final void WinterFlowCacheManagerAgent(Object obj) {
        this.WinterFlowVariableVersionControl.WinterFlowRouterStructure(1);
        this.WinterFlowTransactionManagerStrategy.WinterFlowRouterStructure(obj);
    }

    @Override // com.google.android.datatransport.WinterFlowProcessorConsumer
    public final void WinterFlowHookDataSource(int i, Object obj) {
        WinterFlowTransactionStructure winterFlowTransactionStructure = this.WinterFlowVariableVersionControl;
        winterFlowTransactionStructure.WinterFlowRouterStructure(5);
        winterFlowTransactionStructure.WinterFlowRouterStructure(i);
        this.WinterFlowTransactionManagerStrategy.WinterFlowRouterStructure(obj);
    }

    @Override // com.google.android.datatransport.WinterFlowProcessorConsumer
    public final Object WinterFlowResponseEngine() {
        return this.WinterFlowUnitTestResponse;
    }

    @Override // com.google.android.datatransport.WinterFlowProcessorConsumer
    public final void WinterFlowRouterRouter(int i, int i2, int i3) {
        WinterFlowTransactionStructure winterFlowTransactionStructure = this.WinterFlowVariableVersionControl;
        winterFlowTransactionStructure.WinterFlowRouterStructure(3);
        winterFlowTransactionStructure.WinterFlowRouterStructure(i);
        winterFlowTransactionStructure.WinterFlowRouterStructure(i2);
        winterFlowTransactionStructure.WinterFlowRouterStructure(i3);
    }

    public final void WinterFlowRouterStructure(WinterFlowResolverController winterFlowResolverController, WinterFlowValidator winterFlowValidator) {
        Exception exc;
        WinterFlowTransactionStructure winterFlowTransactionStructure = this.WinterFlowVariableVersionControl;
        int i = winterFlowTransactionStructure.WinterFlowHookDataSource;
        WinterFlowMicroserviceFunction winterFlowMicroserviceFunction = new WinterFlowMicroserviceFunction();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            WinterFlowMicroserviceFunction winterFlowMicroserviceFunction2 = this.WinterFlowTransactionManagerStrategy;
            if (i2 >= i) {
                if (i3 != winterFlowMicroserviceFunction2.WinterFlowHookDataSource) {
                    WinterFlowSessionManagerEntity.WinterFlowRouterStructure("Applier operation size mismatch");
                }
                winterFlowMicroserviceFunction2.WinterFlowArrayNetwork();
                winterFlowTransactionStructure.WinterFlowHookDataSource = 0;
                winterFlowResolverController.WinterFlowUnitTestResponse();
                return;
            }
            int i4 = i2 + 1;
            try {
                try {
                    switch (winterFlowTransactionStructure.WinterFlowHookDataSource(i2)) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                            winterFlowResolverController.WinterFlowServiceUtility();
                            i2 = i4;
                        case 1:
                            int i5 = i3 + 1;
                            winterFlowResolverController.WinterFlowCacheManagerAgent(winterFlowMicroserviceFunction2.WinterFlowTransactionManagerStrategy(i3));
                            i3 = i5;
                            i2 = i4;
                        case 2:
                            int i6 = i2 + 2;
                            i2 += 3;
                            winterFlowResolverController.WinterFlowTransactionAgent(winterFlowTransactionStructure.WinterFlowHookDataSource(i4), winterFlowTransactionStructure.WinterFlowHookDataSource(i6));
                        case 3:
                            int i7 = i2 + 2;
                            try {
                                int i8 = i2 + 3;
                                try {
                                    i2 += 4;
                                    winterFlowResolverController.WinterFlowRouterRouter(winterFlowTransactionStructure.WinterFlowHookDataSource(i4), winterFlowTransactionStructure.WinterFlowHookDataSource(i7), winterFlowTransactionStructure.WinterFlowHookDataSource(i8));
                                } catch (Exception e) {
                                    exc = e;
                                    i2 = i8;
                                    break;
                                }
                            } catch (Exception e2) {
                                exc = e2;
                                i2 = i7;
                                break;
                            }
                        case 4:
                            winterFlowResolverController.WinterFlowRouterStructure();
                            i2 = i4;
                        case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                            i2 += 2;
                            int i9 = i3 + 1;
                            winterFlowResolverController.WinterFlowHookDataSource(winterFlowTransactionStructure.WinterFlowHookDataSource(i4), winterFlowMicroserviceFunction2.WinterFlowTransactionManagerStrategy(i3));
                            i3 = i9;
                        case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                            i2 += 2;
                            try {
                                winterFlowTransactionStructure.WinterFlowHookDataSource(i4);
                                int i10 = i3 + 1;
                                i3 = i10;
                            } catch (Exception e3) {
                                exc = e3;
                                break;
                            }
                        case WinterFlowJSONLibrary.DOUBLE_FIELD_NUMBER /* 7 */:
                            int i11 = i3 + 1;
                            Object WinterFlowTransactionManagerStrategy = winterFlowMicroserviceFunction2.WinterFlowTransactionManagerStrategy(i3);
                            WinterFlowTransactionManagerStrategy.getClass();
                            WinterFlowUnitTestLibrary.WinterFlowTransactionAgent(2, WinterFlowTransactionManagerStrategy);
                            i3 += 2;
                            winterFlowResolverController.WinterFlowServerProtocol((WinterFlowEventEvent) WinterFlowTransactionManagerStrategy, winterFlowMicroserviceFunction2.WinterFlowTransactionManagerStrategy(i11));
                            i2 = i4;
                        case WinterFlowJSONLibrary.BYTES_FIELD_NUMBER /* 8 */:
                            Object obj = winterFlowResolverController.WinterFlowUnitTestResponse;
                            if (obj instanceof WinterFlowNodeBandwidth) {
                                WinterFlowNodeBandwidth winterFlowNodeBandwidth = (WinterFlowNodeBandwidth) obj;
                                if (winterFlowValidator.WinterFlowTransactionManagerStrategy.WinterFlowResponseEngine(winterFlowNodeBandwidth)) {
                                    winterFlowNodeBandwidth.WinterFlowCacheManagerAgent();
                                }
                            }
                            winterFlowMicroserviceFunction.WinterFlowRouterStructure(obj);
                            winterFlowResolverController.WinterFlowArrayNetwork();
                            i2 = i4;
                        default:
                            i2 = i4;
                    }
                } catch (Throwable th) {
                    winterFlowResolverController.WinterFlowUnitTestResponse();
                    throw th;
                }
            } catch (Exception e4) {
                exc = e4;
                i2 = i4;
            }
            exc = e3;
            throw new WinterFlowManagerThreadPool(winterFlowMicroserviceFunction2, winterFlowMicroserviceFunction, winterFlowTransactionStructure, i2 - 1, exc);
        }
    }

    @Override // com.google.android.datatransport.WinterFlowProcessorConsumer
    public final void WinterFlowServerProtocol(WinterFlowEventEvent winterFlowEventEvent, Object obj) {
        this.WinterFlowVariableVersionControl.WinterFlowRouterStructure(7);
        WinterFlowMicroserviceFunction winterFlowMicroserviceFunction = this.WinterFlowTransactionManagerStrategy;
        winterFlowMicroserviceFunction.WinterFlowRouterStructure(winterFlowEventEvent);
        winterFlowMicroserviceFunction.WinterFlowRouterStructure(obj);
    }

    @Override // com.google.android.datatransport.WinterFlowProcessorConsumer
    public final void WinterFlowServiceUtility() {
        this.WinterFlowVariableVersionControl.WinterFlowRouterStructure(0);
    }

    @Override // com.google.android.datatransport.WinterFlowProcessorConsumer
    public final void WinterFlowTransactionAgent(int i, int i2) {
        WinterFlowTransactionStructure winterFlowTransactionStructure = this.WinterFlowVariableVersionControl;
        winterFlowTransactionStructure.WinterFlowRouterStructure(2);
        winterFlowTransactionStructure.WinterFlowRouterStructure(i);
        winterFlowTransactionStructure.WinterFlowRouterStructure(i2);
    }

    @Override // com.google.android.datatransport.WinterFlowProcessorConsumer
    public final void WinterFlowTransactionManagerStrategy(int i, Object obj) {
        WinterFlowTransactionStructure winterFlowTransactionStructure = this.WinterFlowVariableVersionControl;
        winterFlowTransactionStructure.WinterFlowRouterStructure(6);
        winterFlowTransactionStructure.WinterFlowRouterStructure(i);
        this.WinterFlowTransactionManagerStrategy.WinterFlowRouterStructure(obj);
    }
}
