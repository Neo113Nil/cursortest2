package com.google.android.datatransport;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowDatabaseSchemaLayer extends WinterFlowExceptionScheduler {
    public HashSet WinterFlowArrayNetwork;
    public final boolean WinterFlowCacheManagerAgent;
    public final boolean WinterFlowHookDataSource;
    public final long WinterFlowRouterStructure;
    public final WinterFlowResolverSubsystem WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ WinterFlowResolverLibrary WinterFlowUnitTestResponse;
    public final WinterFlowCacheManagerTransactionManager WinterFlowVariableVersionControl;

    public WinterFlowDatabaseSchemaLayer(WinterFlowResolverLibrary winterFlowResolverLibrary, long j, boolean z, boolean z2, WinterFlowConfigurationModule winterFlowConfigurationModule) {
        this.WinterFlowUnitTestResponse = winterFlowResolverLibrary;
        this.WinterFlowRouterStructure = j;
        this.WinterFlowHookDataSource = z;
        this.WinterFlowCacheManagerAgent = z2;
        WinterFlowCacheManagerTransactionManager winterFlowCacheManagerTransactionManager = WinterFlowLoaderSessionManager.WinterFlowRouterStructure;
        this.WinterFlowVariableVersionControl = new WinterFlowCacheManagerTransactionManager();
        this.WinterFlowTransactionManagerStrategy = new WinterFlowResolverSubsystem(WinterFlowConfigurationProcess.WinterFlowRouterRouter, WinterFlowSessionManagerProcess.WinterFlowMapperProtocol);
    }

    @Override // com.google.android.datatransport.WinterFlowExceptionScheduler
    public final boolean WinterFlowArrayNetwork() {
        return this.WinterFlowUnitTestResponse.WinterFlowHookDataSource.WinterFlowArrayNetwork();
    }

    @Override // com.google.android.datatransport.WinterFlowExceptionScheduler
    public final void WinterFlowBandwidthObject(Set set) {
        HashSet hashSet = this.WinterFlowArrayNetwork;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.WinterFlowArrayNetwork = hashSet;
        }
        hashSet.add(set);
    }

    @Override // com.google.android.datatransport.WinterFlowExceptionScheduler
    public final void WinterFlowBatchUI() {
        this.WinterFlowUnitTestResponse.WinterFlowEventEmitterController++;
    }

    @Override // com.google.android.datatransport.WinterFlowExceptionScheduler
    public final void WinterFlowCacheManagerAgent() {
        WinterFlowResolverLibrary winterFlowResolverLibrary = this.WinterFlowUnitTestResponse;
        winterFlowResolverLibrary.WinterFlowEventEmitterController--;
    }

    @Override // com.google.android.datatransport.WinterFlowExceptionScheduler
    public final void WinterFlowConcurrencyThread(WinterFlowStackEngine winterFlowStackEngine) {
        this.WinterFlowUnitTestResponse.WinterFlowHookDataSource.WinterFlowConcurrencyThread(winterFlowStackEngine);
    }

    @Override // com.google.android.datatransport.WinterFlowExceptionScheduler
    public final WinterFlowCacheManagerTransactionManager WinterFlowHookDataSource(WinterFlowTransactionBackend winterFlowTransactionBackend, WinterFlowFunctionEngine winterFlowFunctionEngine, WinterFlowEventEvent winterFlowEventEvent) {
        return this.WinterFlowUnitTestResponse.WinterFlowHookDataSource.WinterFlowHookDataSource(winterFlowTransactionBackend, winterFlowFunctionEngine, winterFlowEventEvent);
    }

    public final void WinterFlowMapperProtocol() {
        WinterFlowCacheManagerTransactionManager winterFlowCacheManagerTransactionManager = this.WinterFlowVariableVersionControl;
        if (winterFlowCacheManagerTransactionManager.WinterFlowRouterRouter()) {
            HashSet hashSet = this.WinterFlowArrayNetwork;
            if (hashSet != null) {
                Object[] objArr = winterFlowCacheManagerTransactionManager.WinterFlowHookDataSource;
                long[] jArr = winterFlowCacheManagerTransactionManager.WinterFlowRouterStructure;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    WinterFlowResolverLibrary winterFlowResolverLibrary = (WinterFlowResolverLibrary) objArr[(i << 3) + i3];
                                    Iterator it = hashSet.iterator();
                                    while (it.hasNext()) {
                                        ((Set) it.next()).remove(winterFlowResolverLibrary.WinterFlowSerializerStructure());
                                    }
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            }
                        }
                        if (i == length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
            winterFlowCacheManagerTransactionManager.WinterFlowHookDataSource();
        }
    }

    @Override // com.google.android.datatransport.WinterFlowExceptionScheduler
    public final void WinterFlowOrchestrationSubsystem(WinterFlowResolverLibrary winterFlowResolverLibrary) {
        this.WinterFlowVariableVersionControl.WinterFlowRouterStructure(winterFlowResolverLibrary);
    }

    @Override // com.google.android.datatransport.WinterFlowExceptionScheduler
    public final WinterFlowEncryptionMicroservice WinterFlowResponseEngine() {
        return this.WinterFlowUnitTestResponse.WinterFlowHookDataSource.WinterFlowResponseEngine();
    }

    @Override // com.google.android.datatransport.WinterFlowExceptionScheduler
    public final void WinterFlowRouterAdapter(WinterFlowResolverLibrary winterFlowResolverLibrary) {
        HashSet hashSet = this.WinterFlowArrayNetwork;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                Set set = (Set) it.next();
                winterFlowResolverLibrary.getClass();
                set.remove(winterFlowResolverLibrary.WinterFlowSerializerStructure());
            }
        }
        if (winterFlowResolverLibrary != null) {
            this.WinterFlowVariableVersionControl.WinterFlowServerProtocol(winterFlowResolverLibrary);
        }
    }

    @Override // com.google.android.datatransport.WinterFlowExceptionScheduler
    public final WinterFlowExceptionHandler WinterFlowRouterRouter() {
        return this.WinterFlowUnitTestResponse.WinterFlowRouterRouter;
    }

    @Override // com.google.android.datatransport.WinterFlowExceptionScheduler
    public final void WinterFlowRouterStructure(WinterFlowTransactionBackend winterFlowTransactionBackend, WinterFlowEventEvent winterFlowEventEvent) {
        this.WinterFlowUnitTestResponse.WinterFlowHookDataSource.WinterFlowRouterStructure(winterFlowTransactionBackend, winterFlowEventEvent);
    }

    @Override // com.google.android.datatransport.WinterFlowExceptionScheduler
    public final void WinterFlowSerializerStructure(WinterFlowTransactionBackend winterFlowTransactionBackend) {
        this.WinterFlowUnitTestResponse.WinterFlowHookDataSource.WinterFlowSerializerStructure(winterFlowTransactionBackend);
    }

    @Override // com.google.android.datatransport.WinterFlowExceptionScheduler
    public final void WinterFlowServerProtocol(WinterFlowTransactionBackend winterFlowTransactionBackend) {
        WinterFlowResolverLibrary winterFlowResolverLibrary = this.WinterFlowUnitTestResponse;
        WinterFlowExceptionScheduler winterFlowExceptionScheduler = winterFlowResolverLibrary.WinterFlowHookDataSource;
        winterFlowExceptionScheduler.WinterFlowServerProtocol(winterFlowResolverLibrary.WinterFlowRouterRouter);
        winterFlowExceptionScheduler.WinterFlowServerProtocol(winterFlowTransactionBackend);
    }

    @Override // com.google.android.datatransport.WinterFlowExceptionScheduler
    public final WinterFlowCacheManagerTransactionManager WinterFlowServiceUtility(WinterFlowTransactionBackend winterFlowTransactionBackend, WinterFlowFunctionEngine winterFlowFunctionEngine, WinterFlowCacheManagerTransactionManager winterFlowCacheManagerTransactionManager) {
        return this.WinterFlowUnitTestResponse.WinterFlowHookDataSource.WinterFlowServiceUtility(winterFlowTransactionBackend, winterFlowFunctionEngine, winterFlowCacheManagerTransactionManager);
    }

    @Override // com.google.android.datatransport.WinterFlowExceptionScheduler
    public final void WinterFlowSingletonPlatform(WinterFlowTransactionBackend winterFlowTransactionBackend) {
        this.WinterFlowUnitTestResponse.WinterFlowHookDataSource.WinterFlowSingletonPlatform(winterFlowTransactionBackend);
    }

    @Override // com.google.android.datatransport.WinterFlowExceptionScheduler
    public final WinterFlowConfigurationProcess WinterFlowSyntax() {
        return (WinterFlowConfigurationProcess) this.WinterFlowTransactionManagerStrategy.getValue();
    }

    @Override // com.google.android.datatransport.WinterFlowExceptionScheduler
    public final WinterFlowConcurrencyHandler WinterFlowThreadListener(WinterFlowDebugService winterFlowDebugService) {
        return this.WinterFlowUnitTestResponse.WinterFlowHookDataSource.WinterFlowThreadListener(winterFlowDebugService);
    }

    @Override // com.google.android.datatransport.WinterFlowExceptionScheduler
    public final boolean WinterFlowTransactionAgent() {
        return this.WinterFlowUnitTestResponse.WinterFlowHookDataSource.WinterFlowTransactionAgent();
    }

    @Override // com.google.android.datatransport.WinterFlowExceptionScheduler
    public final boolean WinterFlowTransactionManagerStrategy() {
        return this.WinterFlowCacheManagerAgent;
    }

    @Override // com.google.android.datatransport.WinterFlowExceptionScheduler
    public final long WinterFlowUnitTestResponse() {
        return this.WinterFlowRouterStructure;
    }

    @Override // com.google.android.datatransport.WinterFlowExceptionScheduler
    public final WinterFlowClassNetwork WinterFlowVariableBandwidth(WinterFlowRouterEngine winterFlowRouterEngine) {
        return this.WinterFlowUnitTestResponse.WinterFlowHookDataSource.WinterFlowVariableBandwidth(winterFlowRouterEngine);
    }

    @Override // com.google.android.datatransport.WinterFlowExceptionScheduler
    public final boolean WinterFlowVariableVersionControl() {
        return this.WinterFlowHookDataSource;
    }
}
