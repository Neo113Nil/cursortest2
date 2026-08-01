package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowRuntimeFrontend extends WinterFlowOrchestrationInvoker {
    public static final Object WinterFlowRouterRouter = new Object();
    public int WinterFlowArrayNetwork;
    public long WinterFlowCacheManagerAgent;
    public Object WinterFlowTransactionManagerStrategy;
    public int WinterFlowUnitTestResponse;
    public WinterFlowLibraryCache WinterFlowVariableVersionControl;

    public WinterFlowRuntimeFrontend(long j) {
        super(j);
        WinterFlowLibraryCache winterFlowLibraryCache = WinterFlowProtocolSoftware.WinterFlowRouterStructure;
        winterFlowLibraryCache.getClass();
        this.WinterFlowVariableVersionControl = winterFlowLibraryCache;
        this.WinterFlowTransactionManagerStrategy = WinterFlowRouterRouter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10, types: [com.google.android.datatransport.WinterFlowRuntimeFrontend] */
    /* JADX WARN: Type inference failed for: r13v5, types: [com.google.android.datatransport.WinterFlowOrchestrationInvoker] */
    /* JADX WARN: Type inference failed for: r13v6, types: [com.google.android.datatransport.WinterFlowOrchestrationInvoker, java.lang.Object] */
    public final int WinterFlowArrayNetwork(WinterFlowPipelineWidget winterFlowPipelineWidget, WinterFlowJSONModule winterFlowJSONModule) {
        WinterFlowLibraryCache winterFlowLibraryCache;
        int i;
        long[] jArr;
        int i2;
        Object[] objArr;
        long[] jArr2;
        int i3;
        Object[] objArr2;
        long j;
        long j2;
        int i4;
        ?? WinterFlowUnitTestResponse;
        synchronized (WinterFlowVersionProtocol.WinterFlowCacheManagerAgent) {
            winterFlowLibraryCache = this.WinterFlowVariableVersionControl;
        }
        int i5 = 7;
        if (winterFlowLibraryCache.WinterFlowVariableVersionControl == 0) {
            return 7;
        }
        WinterFlowJSON WinterFlowRouterStructure = WinterFlowInheritanceConcurrency.WinterFlowRouterStructure();
        Object[] objArr3 = WinterFlowRouterStructure.WinterFlowVariableVersionControl;
        int i6 = WinterFlowRouterStructure.WinterFlowUnitTestResponse;
        boolean z = false;
        for (int i7 = 0; i7 < i6; i7++) {
            ((WinterFlowResponseConsumer) objArr3[i7]).WinterFlowHookDataSource();
        }
        try {
            Object[] objArr4 = winterFlowLibraryCache.WinterFlowHookDataSource;
            int[] iArr = winterFlowLibraryCache.WinterFlowCacheManagerAgent;
            long[] jArr3 = winterFlowLibraryCache.WinterFlowRouterStructure;
            int length = jArr3.length - 2;
            if (length >= 0) {
                i = 7;
                int i8 = 0;
                while (true) {
                    long j3 = jArr3[i8];
                    long j4 = -9187201950435737472L;
                    if ((((~j3) << i5) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i9 = 8;
                        int i10 = 8 - ((~(i8 - length)) >>> 31);
                        i2 = i5;
                        int i11 = z ? 1 : 0;
                        while (i11 < i10) {
                            if ((j3 & 255) < 128) {
                                int i12 = (i8 << 3) + i11;
                                j2 = j4;
                                WinterFlowOrchestrationTool winterFlowOrchestrationTool = (WinterFlowOrchestrationTool) objArr4[i12];
                                int i13 = i9;
                                if (iArr[i12] != 1) {
                                    jArr2 = jArr3;
                                    i3 = i11;
                                    objArr2 = objArr4;
                                    j = j3;
                                } else {
                                    if (winterFlowOrchestrationTool instanceof WinterFlowPipelineWidget) {
                                        WinterFlowPipelineWidget winterFlowPipelineWidget2 = (WinterFlowPipelineWidget) winterFlowOrchestrationTool;
                                        WinterFlowUnitTestResponse = winterFlowPipelineWidget2.WinterFlowRouterRouter((WinterFlowRuntimeFrontend) WinterFlowVersionProtocol.WinterFlowUnitTestResponse(winterFlowPipelineWidget2.WinterFlowRouterRouter, winterFlowJSONModule), winterFlowJSONModule, z, winterFlowPipelineWidget2.WinterFlowTransactionManagerStrategy);
                                        WinterFlowLibraryCache winterFlowLibraryCache2 = WinterFlowUnitTestResponse.WinterFlowVariableVersionControl;
                                        Object[] objArr5 = winterFlowLibraryCache2.WinterFlowHookDataSource;
                                        long[] jArr4 = winterFlowLibraryCache2.WinterFlowRouterStructure;
                                        int length2 = jArr4.length - 2;
                                        jArr2 = jArr3;
                                        i3 = i11;
                                        objArr2 = objArr4;
                                        if (length2 >= 0) {
                                            int i14 = 0;
                                            while (true) {
                                                long j5 = jArr4[i14];
                                                j = j3;
                                                int i15 = i;
                                                if ((((~j5) << i2) & j5 & j2) != j2) {
                                                    int i16 = 8 - ((~(i14 - length2)) >>> 31);
                                                    for (int i17 = 0; i17 < i16; i17++) {
                                                        if ((j5 & 255) < 128) {
                                                            i15 = (i15 * 31) + System.identityHashCode((WinterFlowOrchestrationTool) objArr5[(i14 << 3) + i17]);
                                                        }
                                                        j5 >>= i13;
                                                    }
                                                    if (i16 != i13) {
                                                        i = i15;
                                                        break;
                                                    }
                                                }
                                                i = i15;
                                                if (i14 == length2) {
                                                    break;
                                                }
                                                i14++;
                                                j3 = j;
                                                i13 = 8;
                                            }
                                        } else {
                                            j = j3;
                                        }
                                    } else {
                                        jArr2 = jArr3;
                                        i3 = i11;
                                        objArr2 = objArr4;
                                        j = j3;
                                        WinterFlowUnitTestResponse = WinterFlowVersionProtocol.WinterFlowUnitTestResponse(winterFlowOrchestrationTool.WinterFlowRouterStructure(), winterFlowJSONModule);
                                    }
                                    i = (((i * 31) + System.identityHashCode(WinterFlowUnitTestResponse)) * 31) + Long.hashCode(WinterFlowUnitTestResponse.WinterFlowRouterStructure);
                                }
                                i4 = 8;
                            } else {
                                jArr2 = jArr3;
                                i3 = i11;
                                objArr2 = objArr4;
                                j = j3;
                                j2 = j4;
                                i4 = i9;
                            }
                            j3 = j >> i4;
                            i9 = i4;
                            j4 = j2;
                            objArr4 = objArr2;
                            z = false;
                            i11 = i3 + 1;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        objArr = objArr4;
                        if (i10 != i9) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        i2 = i5;
                        objArr = objArr4;
                    }
                    if (i8 == length) {
                        i5 = i;
                        break;
                    }
                    i8++;
                    i5 = i2;
                    jArr3 = jArr;
                    objArr4 = objArr;
                    z = false;
                }
            }
            i = i5;
            Object[] objArr6 = WinterFlowRouterStructure.WinterFlowVariableVersionControl;
            int i18 = WinterFlowRouterStructure.WinterFlowUnitTestResponse;
            for (int i19 = 0; i19 < i18; i19++) {
                ((WinterFlowResponseConsumer) objArr6[i19]).WinterFlowRouterStructure();
            }
            return i;
        } catch (Throwable th) {
            Object[] objArr7 = WinterFlowRouterStructure.WinterFlowVariableVersionControl;
            int i20 = WinterFlowRouterStructure.WinterFlowUnitTestResponse;
            for (int i21 = 0; i21 < i20; i21++) {
                ((WinterFlowResponseConsumer) objArr7[i21]).WinterFlowRouterStructure();
            }
            throw th;
        }
    }

    public final boolean WinterFlowCacheManagerAgent(WinterFlowPipelineWidget winterFlowPipelineWidget, WinterFlowJSONModule winterFlowJSONModule) {
        boolean z;
        boolean z2;
        Object obj = WinterFlowVersionProtocol.WinterFlowCacheManagerAgent;
        synchronized (obj) {
            z = true;
            if (this.WinterFlowCacheManagerAgent == winterFlowJSONModule.WinterFlowUnitTestResponse()) {
                if (this.WinterFlowArrayNetwork == winterFlowJSONModule.WinterFlowRouterRouter()) {
                    z2 = false;
                }
            }
            z2 = true;
        }
        if (this.WinterFlowTransactionManagerStrategy == WinterFlowRouterRouter || (z2 && this.WinterFlowUnitTestResponse != WinterFlowArrayNetwork(winterFlowPipelineWidget, winterFlowJSONModule))) {
            z = false;
        }
        if (!z || !z2) {
            return z;
        }
        synchronized (obj) {
            this.WinterFlowCacheManagerAgent = winterFlowJSONModule.WinterFlowUnitTestResponse();
            this.WinterFlowArrayNetwork = winterFlowJSONModule.WinterFlowRouterRouter();
        }
        return z;
    }

    @Override // com.google.android.datatransport.WinterFlowOrchestrationInvoker
    public final WinterFlowOrchestrationInvoker WinterFlowHookDataSource(long j) {
        return new WinterFlowRuntimeFrontend(j);
    }

    @Override // com.google.android.datatransport.WinterFlowOrchestrationInvoker
    public final void WinterFlowRouterStructure(WinterFlowOrchestrationInvoker winterFlowOrchestrationInvoker) {
        winterFlowOrchestrationInvoker.getClass();
        WinterFlowRuntimeFrontend winterFlowRuntimeFrontend = (WinterFlowRuntimeFrontend) winterFlowOrchestrationInvoker;
        this.WinterFlowVariableVersionControl = winterFlowRuntimeFrontend.WinterFlowVariableVersionControl;
        this.WinterFlowTransactionManagerStrategy = winterFlowRuntimeFrontend.WinterFlowTransactionManagerStrategy;
        this.WinterFlowUnitTestResponse = winterFlowRuntimeFrontend.WinterFlowUnitTestResponse;
    }
}
