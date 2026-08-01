package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowLoaderThreadPool implements WinterFlowObjectSession {
    public final /* synthetic */ Object WinterFlowRouterRouter;
    public final /* synthetic */ int WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ Object WinterFlowUnitTestResponse;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowLoaderThreadPool(int i, int i2, Object obj, Object obj2) {
        this.WinterFlowVariableVersionControl = i2;
        this.WinterFlowUnitTestResponse = obj;
        this.WinterFlowTransactionManagerStrategy = i;
        this.WinterFlowRouterRouter = obj2;
    }

    @Override // com.google.android.datatransport.WinterFlowObjectSession
    public final Object WinterFlowUnitTestResponse(Object obj) {
        WinterFlowExceptionHandler winterFlowExceptionHandler;
        WinterFlowExceptionHandler winterFlowExceptionHandler2;
        int i;
        boolean z;
        int i2 = this.WinterFlowVariableVersionControl;
        int i3 = 0;
        Object obj2 = this.WinterFlowRouterRouter;
        int i4 = this.WinterFlowTransactionManagerStrategy;
        Object obj3 = this.WinterFlowUnitTestResponse;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        switch (i2) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowStackEngine winterFlowStackEngine = (WinterFlowStackEngine) obj3;
                WinterFlowLibraryCache winterFlowLibraryCache = (WinterFlowLibraryCache) obj2;
                WinterFlowExceptionHandler winterFlowExceptionHandler3 = (WinterFlowExceptionHandler) obj;
                if (winterFlowStackEngine.WinterFlowVariableVersionControl == i4 && WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowLibraryCache, winterFlowStackEngine.WinterFlowTransactionManagerStrategy) && (winterFlowExceptionHandler3 instanceof WinterFlowTransactionBackend)) {
                    long[] jArr = winterFlowLibraryCache.WinterFlowRouterStructure;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j = jArr[i5];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i6 = 8;
                                int i7 = 8 - ((~(i5 - length)) >>> 31);
                                int i8 = i3;
                                while (i8 < i7) {
                                    if ((255 & j) < 128) {
                                        int i9 = (i5 << 3) + i8;
                                        Object obj4 = winterFlowLibraryCache.WinterFlowHookDataSource[i9];
                                        boolean z2 = winterFlowLibraryCache.WinterFlowCacheManagerAgent[i9] != i4;
                                        if (z2) {
                                            i = i6;
                                            WinterFlowTransactionBackend winterFlowTransactionBackend = (WinterFlowTransactionBackend) winterFlowExceptionHandler3;
                                            winterFlowExceptionHandler2 = winterFlowExceptionHandler3;
                                            WinterFlowDatabaseSchemaStructure winterFlowDatabaseSchemaStructure = winterFlowTransactionBackend.WinterFlowTransactionAgent;
                                            WinterFlowHookProcessor.WinterFlowBandwidthObject(winterFlowDatabaseSchemaStructure, obj4, winterFlowStackEngine);
                                            z = z2;
                                            if (obj4 instanceof WinterFlowPipelineWidget) {
                                                WinterFlowPipelineWidget winterFlowPipelineWidget = (WinterFlowPipelineWidget) obj4;
                                                if (!winterFlowDatabaseSchemaStructure.WinterFlowCacheManagerAgent(winterFlowPipelineWidget)) {
                                                    WinterFlowHookProcessor.WinterFlowOrchestrationSubsystem(winterFlowTransactionBackend.WinterFlowServiceUtility, winterFlowPipelineWidget);
                                                }
                                                WinterFlowDatabaseSchemaStructure winterFlowDatabaseSchemaStructure2 = winterFlowStackEngine.WinterFlowUnitTestResponse;
                                                if (winterFlowDatabaseSchemaStructure2 != null) {
                                                    winterFlowDatabaseSchemaStructure2.WinterFlowTransactionAgent(obj4);
                                                }
                                            }
                                        } else {
                                            winterFlowExceptionHandler2 = winterFlowExceptionHandler3;
                                            z = z2;
                                            i = i6;
                                        }
                                        if (z) {
                                            winterFlowLibraryCache.WinterFlowTransactionManagerStrategy(i9);
                                        }
                                    } else {
                                        winterFlowExceptionHandler2 = winterFlowExceptionHandler3;
                                        i = i6;
                                    }
                                    j >>= i;
                                    i8++;
                                    i6 = i;
                                    winterFlowExceptionHandler3 = winterFlowExceptionHandler2;
                                }
                                winterFlowExceptionHandler = winterFlowExceptionHandler3;
                                if (i7 != i6) {
                                    break;
                                }
                            } else {
                                winterFlowExceptionHandler = winterFlowExceptionHandler3;
                            }
                            if (i5 == length) {
                                break;
                            } else {
                                i5++;
                                winterFlowExceptionHandler3 = winterFlowExceptionHandler;
                                i3 = 0;
                            }
                        }
                    }
                }
                break;
            default:
                WinterFlowBandwidthService winterFlowBandwidthService = (WinterFlowBandwidthService) obj3;
                WinterFlowViewTesting winterFlowViewTesting = (WinterFlowViewTesting) obj2;
                WinterFlowDecoratorSessionManager winterFlowDecoratorSessionManager = (WinterFlowDecoratorSessionManager) obj;
                int WinterFlowRouterRouter = winterFlowBandwidthService.WinterFlowVariableBandwidth.WinterFlowRouterStructure.WinterFlowRouterRouter();
                if (WinterFlowRouterRouter < 0) {
                    WinterFlowRouterRouter = 0;
                }
                if (WinterFlowRouterRouter <= i4) {
                    i4 = WinterFlowRouterRouter;
                }
                int i10 = -i4;
                boolean z3 = winterFlowBandwidthService.WinterFlowBatchUI;
                int i11 = z3 ? 0 : i10;
                if (!z3) {
                    i10 = 0;
                }
                winterFlowDecoratorSessionManager.WinterFlowVariableVersionControl = true;
                WinterFlowDecoratorSessionManager.WinterFlowVariableBandwidth(winterFlowDecoratorSessionManager, winterFlowViewTesting, i11, i10);
                winterFlowDecoratorSessionManager.WinterFlowVariableVersionControl = false;
                break;
        }
        return winterFlowAlgorithmSession;
    }
}
