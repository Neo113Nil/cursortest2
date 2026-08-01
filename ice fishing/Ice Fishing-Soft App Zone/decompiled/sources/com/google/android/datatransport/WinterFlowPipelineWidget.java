package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowPipelineWidget extends WinterFlowThreadVersionControl implements WinterFlowBatchCacheManager {
    public WinterFlowRuntimeFrontend WinterFlowRouterRouter = new WinterFlowRuntimeFrontend(WinterFlowVersionProtocol.WinterFlowRouterRouter().WinterFlowUnitTestResponse());
    public final WinterFlowObjectUI WinterFlowTransactionManagerStrategy;
    public final WinterFlowSessionManagerProcess WinterFlowUnitTestResponse;

    public WinterFlowPipelineWidget(WinterFlowObjectUI winterFlowObjectUI, WinterFlowSessionManagerProcess winterFlowSessionManagerProcess) {
        this.WinterFlowTransactionManagerStrategy = winterFlowObjectUI;
        this.WinterFlowUnitTestResponse = winterFlowSessionManagerProcess;
    }

    @Override // com.google.android.datatransport.WinterFlowOrchestrationTool
    public final void WinterFlowCacheManagerAgent(WinterFlowOrchestrationInvoker winterFlowOrchestrationInvoker) {
        this.WinterFlowRouterRouter = (WinterFlowRuntimeFrontend) winterFlowOrchestrationInvoker;
    }

    public final WinterFlowRuntimeFrontend WinterFlowRouterRouter(WinterFlowRuntimeFrontend winterFlowRuntimeFrontend, WinterFlowJSONModule winterFlowJSONModule, boolean z, WinterFlowObjectUI winterFlowObjectUI) {
        WinterFlowJSON WinterFlowRouterStructure;
        WinterFlowSessionManagerProcess winterFlowSessionManagerProcess;
        int i;
        WinterFlowRuntimeFrontend winterFlowRuntimeFrontend2 = winterFlowRuntimeFrontend;
        if (winterFlowRuntimeFrontend2.WinterFlowCacheManagerAgent(this, winterFlowJSONModule)) {
            if (z) {
                WinterFlowRouterStructure = WinterFlowInheritanceConcurrency.WinterFlowRouterStructure();
                Object[] objArr = WinterFlowRouterStructure.WinterFlowVariableVersionControl;
                int i2 = WinterFlowRouterStructure.WinterFlowUnitTestResponse;
                for (int i3 = 0; i3 < i2; i3++) {
                    ((WinterFlowResponseConsumer) objArr[i3]).WinterFlowHookDataSource();
                }
                try {
                    WinterFlowLibraryCache winterFlowLibraryCache = winterFlowRuntimeFrontend2.WinterFlowVariableVersionControl;
                    WinterFlowObjectPackage winterFlowObjectPackage = WinterFlowInheritanceConcurrency.WinterFlowRouterStructure;
                    WinterFlowBackendEntity winterFlowBackendEntity = (WinterFlowBackendEntity) winterFlowObjectPackage.get();
                    if (winterFlowBackendEntity == null) {
                        winterFlowBackendEntity = new WinterFlowBackendEntity();
                        winterFlowObjectPackage.WinterFlowMapperProtocol(winterFlowBackendEntity);
                    }
                    int i4 = winterFlowBackendEntity.WinterFlowRouterStructure;
                    Object[] objArr2 = winterFlowLibraryCache.WinterFlowHookDataSource;
                    int[] iArr = winterFlowLibraryCache.WinterFlowCacheManagerAgent;
                    long[] jArr = winterFlowLibraryCache.WinterFlowRouterStructure;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j = jArr[i5];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i6 = 8;
                                int i7 = 8 - ((~(i5 - length)) >>> 31);
                                int i8 = 0;
                                while (i8 < i7) {
                                    if ((j & 255) < 128) {
                                        int i9 = (i5 << 3) + i8;
                                        WinterFlowOrchestrationTool winterFlowOrchestrationTool = (WinterFlowOrchestrationTool) objArr2[i9];
                                        i = i6;
                                        winterFlowBackendEntity.WinterFlowRouterStructure = i4 + iArr[i9];
                                        WinterFlowObjectSession WinterFlowVariableVersionControl = winterFlowJSONModule.WinterFlowVariableVersionControl();
                                        if (WinterFlowVariableVersionControl != null) {
                                            WinterFlowVariableVersionControl.WinterFlowUnitTestResponse(winterFlowOrchestrationTool);
                                        }
                                    } else {
                                        i = i6;
                                    }
                                    j >>= i;
                                    i8++;
                                    i6 = i;
                                }
                                if (i7 != i6) {
                                    break;
                                }
                            }
                            if (i5 == length) {
                                break;
                            }
                            i5++;
                        }
                    }
                    winterFlowBackendEntity.WinterFlowRouterStructure = i4;
                    Object[] objArr3 = WinterFlowRouterStructure.WinterFlowVariableVersionControl;
                    int i10 = WinterFlowRouterStructure.WinterFlowUnitTestResponse;
                    for (int i11 = 0; i11 < i10; i11++) {
                        ((WinterFlowResponseConsumer) objArr3[i11]).WinterFlowRouterStructure();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return winterFlowRuntimeFrontend2;
        }
        WinterFlowLibraryCache winterFlowLibraryCache2 = new WinterFlowLibraryCache();
        WinterFlowObjectPackage winterFlowObjectPackage2 = WinterFlowInheritanceConcurrency.WinterFlowRouterStructure;
        WinterFlowBackendEntity winterFlowBackendEntity2 = (WinterFlowBackendEntity) winterFlowObjectPackage2.get();
        if (winterFlowBackendEntity2 == null) {
            winterFlowBackendEntity2 = new WinterFlowBackendEntity();
            winterFlowObjectPackage2.WinterFlowMapperProtocol(winterFlowBackendEntity2);
        }
        int i12 = winterFlowBackendEntity2.WinterFlowRouterStructure;
        WinterFlowRouterStructure = WinterFlowInheritanceConcurrency.WinterFlowRouterStructure();
        Object[] objArr4 = WinterFlowRouterStructure.WinterFlowVariableVersionControl;
        int i13 = WinterFlowRouterStructure.WinterFlowUnitTestResponse;
        for (int i14 = 0; i14 < i13; i14++) {
            ((WinterFlowResponseConsumer) objArr4[i14]).WinterFlowHookDataSource();
        }
        try {
            winterFlowBackendEntity2.WinterFlowRouterStructure = i12 + 1;
            Object WinterFlowServerProtocol = WinterFlowWorkerVersionControl.WinterFlowServerProtocol(new WinterFlowLoaderEngine(this, winterFlowBackendEntity2, winterFlowLibraryCache2, i12), winterFlowObjectUI);
            winterFlowBackendEntity2.WinterFlowRouterStructure = i12;
            Object[] objArr5 = WinterFlowRouterStructure.WinterFlowVariableVersionControl;
            int i15 = WinterFlowRouterStructure.WinterFlowUnitTestResponse;
            for (int i16 = 0; i16 < i15; i16++) {
                ((WinterFlowResponseConsumer) objArr5[i16]).WinterFlowRouterStructure();
            }
            Object obj = WinterFlowVersionProtocol.WinterFlowCacheManagerAgent;
            synchronized (obj) {
                try {
                    WinterFlowJSONModule WinterFlowRouterRouter = WinterFlowVersionProtocol.WinterFlowRouterRouter();
                    Object obj2 = winterFlowRuntimeFrontend2.WinterFlowTransactionManagerStrategy;
                    if (obj2 == WinterFlowRuntimeFrontend.WinterFlowRouterRouter || (winterFlowSessionManagerProcess = this.WinterFlowUnitTestResponse) == null || !winterFlowSessionManagerProcess.WinterFlowThreadListener(WinterFlowServerProtocol, obj2)) {
                        WinterFlowRuntimeFrontend winterFlowRuntimeFrontend3 = this.WinterFlowRouterRouter;
                        synchronized (obj) {
                            WinterFlowOrchestrationInvoker WinterFlowTransactionAgent = WinterFlowVersionProtocol.WinterFlowTransactionAgent(winterFlowRuntimeFrontend3, this);
                            WinterFlowTransactionAgent.WinterFlowRouterStructure(winterFlowRuntimeFrontend3);
                            WinterFlowTransactionAgent.WinterFlowRouterStructure = WinterFlowRouterRouter.WinterFlowUnitTestResponse();
                            winterFlowRuntimeFrontend2 = (WinterFlowRuntimeFrontend) WinterFlowTransactionAgent;
                            winterFlowRuntimeFrontend2.WinterFlowVariableVersionControl = winterFlowLibraryCache2;
                            winterFlowRuntimeFrontend2.WinterFlowUnitTestResponse = winterFlowRuntimeFrontend2.WinterFlowArrayNetwork(this, WinterFlowRouterRouter);
                            winterFlowRuntimeFrontend2.WinterFlowTransactionManagerStrategy = WinterFlowServerProtocol;
                        }
                        return winterFlowRuntimeFrontend2;
                    }
                    winterFlowRuntimeFrontend2.WinterFlowVariableVersionControl = winterFlowLibraryCache2;
                    winterFlowRuntimeFrontend2.WinterFlowUnitTestResponse = winterFlowRuntimeFrontend2.WinterFlowArrayNetwork(this, WinterFlowRouterRouter);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            WinterFlowBackendEntity winterFlowBackendEntity3 = (WinterFlowBackendEntity) WinterFlowInheritanceConcurrency.WinterFlowRouterStructure.get();
            if (winterFlowBackendEntity3 == null || winterFlowBackendEntity3.WinterFlowRouterStructure != 0) {
                return winterFlowRuntimeFrontend2;
            }
            WinterFlowVersionProtocol.WinterFlowRouterRouter().WinterFlowThreadListener();
            synchronized (obj) {
                WinterFlowJSONModule WinterFlowRouterRouter2 = WinterFlowVersionProtocol.WinterFlowRouterRouter();
                winterFlowRuntimeFrontend2.WinterFlowCacheManagerAgent = WinterFlowRouterRouter2.WinterFlowUnitTestResponse();
                winterFlowRuntimeFrontend2.WinterFlowArrayNetwork = WinterFlowRouterRouter2.WinterFlowRouterRouter();
                return winterFlowRuntimeFrontend2;
            }
        } finally {
            Object[] objArr6 = WinterFlowRouterStructure.WinterFlowVariableVersionControl;
            int i17 = WinterFlowRouterStructure.WinterFlowUnitTestResponse;
            for (int i18 = 0; i18 < i17; i18++) {
                ((WinterFlowResponseConsumer) objArr6[i18]).WinterFlowRouterStructure();
            }
        }
    }

    @Override // com.google.android.datatransport.WinterFlowOrchestrationTool
    public final WinterFlowOrchestrationInvoker WinterFlowRouterStructure() {
        return this.WinterFlowRouterRouter;
    }

    public final WinterFlowRuntimeFrontend WinterFlowSyntax() {
        WinterFlowJSONModule WinterFlowRouterRouter = WinterFlowVersionProtocol.WinterFlowRouterRouter();
        return WinterFlowRouterRouter((WinterFlowRuntimeFrontend) WinterFlowVersionProtocol.WinterFlowUnitTestResponse(this.WinterFlowRouterRouter, WinterFlowRouterRouter), WinterFlowRouterRouter, false, this.WinterFlowTransactionManagerStrategy);
    }

    @Override // com.google.android.datatransport.WinterFlowBatchCacheManager
    public final Object getValue() {
        WinterFlowObjectSession WinterFlowVariableVersionControl = WinterFlowVersionProtocol.WinterFlowRouterRouter().WinterFlowVariableVersionControl();
        if (WinterFlowVariableVersionControl != null) {
            WinterFlowVariableVersionControl.WinterFlowUnitTestResponse(this);
        }
        WinterFlowJSONModule WinterFlowRouterRouter = WinterFlowVersionProtocol.WinterFlowRouterRouter();
        return WinterFlowRouterRouter((WinterFlowRuntimeFrontend) WinterFlowVersionProtocol.WinterFlowUnitTestResponse(this.WinterFlowRouterRouter, WinterFlowRouterRouter), WinterFlowRouterRouter, true, this.WinterFlowTransactionManagerStrategy).WinterFlowTransactionManagerStrategy;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DerivedState(value=");
        WinterFlowRuntimeFrontend winterFlowRuntimeFrontend = (WinterFlowRuntimeFrontend) WinterFlowVersionProtocol.WinterFlowTransactionManagerStrategy(this.WinterFlowRouterRouter);
        sb.append(winterFlowRuntimeFrontend.WinterFlowCacheManagerAgent(this, WinterFlowVersionProtocol.WinterFlowRouterRouter()) ? String.valueOf(winterFlowRuntimeFrontend.WinterFlowTransactionManagerStrategy) : "<Not calculated>");
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }
}
