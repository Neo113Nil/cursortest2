package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;
import java.io.Serializable;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowServiceProviderUtility extends WinterFlowNodeInheritance implements WinterFlowObjectSession {
    public int WinterFlowResponseEngine;
    public Object WinterFlowServerProtocol;
    public final /* synthetic */ Object WinterFlowServiceUtility;
    public final /* synthetic */ int WinterFlowSyntax = 0;
    public final /* synthetic */ Object WinterFlowThreadListener;
    public final /* synthetic */ WinterFlowStrategyResolver WinterFlowTransactionAgent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowServiceProviderUtility(WinterFlowBandwidthCache winterFlowBandwidthCache, WinterFlowStrategyResolver winterFlowStrategyResolver, WinterFlowTransactionInterface winterFlowTransactionInterface, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        super(1, winterFlowTransactionManagerLayer);
        this.WinterFlowThreadListener = winterFlowBandwidthCache;
        this.WinterFlowTransactionAgent = winterFlowStrategyResolver;
        this.WinterFlowServiceUtility = winterFlowTransactionInterface;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WinterFlowServiceUtility(Object obj) {
        WinterFlowBandwidthCache winterFlowBandwidthCache;
        WinterFlowTransactionInterface winterFlowTransactionInterface;
        WinterFlowDebugMechanism winterFlowDebugMechanism;
        Object obj2;
        int i = this.WinterFlowSyntax;
        Object obj3 = this.WinterFlowServiceUtility;
        Object obj4 = this.WinterFlowThreadListener;
        WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
        WinterFlowStrategyResolver winterFlowStrategyResolver = this.WinterFlowTransactionAgent;
        WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer = null;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowTransactionInterface winterFlowTransactionInterface2 = (WinterFlowTransactionInterface) obj3;
                WinterFlowBandwidthCache winterFlowBandwidthCache2 = (WinterFlowBandwidthCache) obj4;
                int i2 = this.WinterFlowResponseEngine;
                try {
                } catch (WinterFlowProcessorCloud unused) {
                    Object obj5 = winterFlowBandwidthCache2.WinterFlowVariableVersionControl;
                    this.WinterFlowServerProtocol = winterFlowTransactionInterface2;
                    this.WinterFlowResponseEngine = 3;
                    obj = winterFlowStrategyResolver.WinterFlowResponseEngine(obj5, true, this);
                    if (obj == winterFlowListenerJava) {
                        return winterFlowListenerJava;
                    }
                }
                if (i2 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    this.WinterFlowServerProtocol = winterFlowBandwidthCache2;
                    this.WinterFlowResponseEngine = 1;
                    obj = ((WinterFlowCachePlatform) winterFlowStrategyResolver.WinterFlowServiceUtility.getValue()).WinterFlowRouterStructure(new WinterFlowVariableWidget(3, (WinterFlowTransactionManagerLayer) null), this);
                    if (obj == winterFlowListenerJava) {
                        return winterFlowListenerJava;
                    }
                    winterFlowBandwidthCache = winterFlowBandwidthCache2;
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            winterFlowTransactionInterface = (WinterFlowTransactionInterface) ((Serializable) this.WinterFlowServerProtocol);
                            WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                            winterFlowTransactionInterface.WinterFlowVariableVersionControl = ((Number) obj).intValue();
                            return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                        }
                        if (i2 != 3) {
                            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        winterFlowTransactionInterface2 = (WinterFlowTransactionInterface) ((Serializable) this.WinterFlowServerProtocol);
                        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                        winterFlowTransactionInterface2.WinterFlowVariableVersionControl = ((Number) obj).intValue();
                        return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                    }
                    winterFlowBandwidthCache = (WinterFlowBandwidthCache) ((Serializable) this.WinterFlowServerProtocol);
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                }
                winterFlowBandwidthCache.WinterFlowVariableVersionControl = obj;
                WinterFlowDebugStrategy WinterFlowHookDataSource = winterFlowStrategyResolver.WinterFlowHookDataSource();
                this.WinterFlowServerProtocol = winterFlowTransactionInterface2;
                this.WinterFlowResponseEngine = 2;
                obj = WinterFlowHookDataSource.WinterFlowRouterStructure();
                if (obj == winterFlowListenerJava) {
                    return winterFlowListenerJava;
                }
                winterFlowTransactionInterface = winterFlowTransactionInterface2;
                winterFlowTransactionInterface.WinterFlowVariableVersionControl = ((Number) obj).intValue();
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            default:
                int i3 = this.WinterFlowResponseEngine;
                if (i3 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    this.WinterFlowResponseEngine = 1;
                    obj = winterFlowStrategyResolver.WinterFlowSyntax(true, this);
                    if (obj == winterFlowListenerJava) {
                        return winterFlowListenerJava;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            Object obj6 = this.WinterFlowServerProtocol;
                            WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                            return obj6;
                        }
                        winterFlowDebugMechanism = (WinterFlowDebugMechanism) this.WinterFlowServerProtocol;
                        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                        obj2 = winterFlowDebugMechanism.WinterFlowHookDataSource;
                        if ((obj2 == null ? obj2.hashCode() : 0) == winterFlowDebugMechanism.WinterFlowCacheManagerAgent) {
                            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                            return null;
                        }
                        if (!WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowDebugMechanism.WinterFlowHookDataSource, obj)) {
                            this.WinterFlowServerProtocol = obj;
                            this.WinterFlowResponseEngine = 3;
                            if (winterFlowStrategyResolver.WinterFlowResponseEngine(obj, true, this) == winterFlowListenerJava) {
                                return winterFlowListenerJava;
                            }
                        }
                        return obj;
                    }
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                }
                winterFlowDebugMechanism = (WinterFlowDebugMechanism) obj;
                WinterFlowModuleStack winterFlowModuleStack = new WinterFlowModuleStack((WinterFlowEventEvent) obj3, winterFlowDebugMechanism, winterFlowTransactionManagerLayer, 11);
                this.WinterFlowServerProtocol = winterFlowDebugMechanism;
                this.WinterFlowResponseEngine = 2;
                obj = WinterFlowCacheRuntime.WinterFlowModuleAgent((WinterFlowEncryptionMicroservice) obj4, winterFlowModuleStack, this);
                if (obj == winterFlowListenerJava) {
                    return winterFlowListenerJava;
                }
                obj2 = winterFlowDebugMechanism.WinterFlowHookDataSource;
                if ((obj2 == null ? obj2.hashCode() : 0) == winterFlowDebugMechanism.WinterFlowCacheManagerAgent) {
                }
        }
    }

    @Override // com.google.android.datatransport.WinterFlowObjectSession
    public final Object WinterFlowUnitTestResponse(Object obj) {
        int i = this.WinterFlowSyntax;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        Object obj2 = this.WinterFlowServiceUtility;
        Object obj3 = this.WinterFlowThreadListener;
        WinterFlowStrategyResolver winterFlowStrategyResolver = this.WinterFlowTransactionAgent;
        WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer = (WinterFlowTransactionManagerLayer) obj;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new WinterFlowServiceProviderUtility((WinterFlowBandwidthCache) obj3, winterFlowStrategyResolver, (WinterFlowTransactionInterface) obj2, winterFlowTransactionManagerLayer).WinterFlowServiceUtility(winterFlowAlgorithmSession);
            default:
                return new WinterFlowServiceProviderUtility(winterFlowStrategyResolver, (WinterFlowEncryptionMicroservice) obj3, (WinterFlowEventEvent) obj2, winterFlowTransactionManagerLayer).WinterFlowServiceUtility(winterFlowAlgorithmSession);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowServiceProviderUtility(WinterFlowStrategyResolver winterFlowStrategyResolver, WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice, WinterFlowEventEvent winterFlowEventEvent, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        super(1, winterFlowTransactionManagerLayer);
        this.WinterFlowTransactionAgent = winterFlowStrategyResolver;
        this.WinterFlowThreadListener = winterFlowEncryptionMicroservice;
        this.WinterFlowServiceUtility = winterFlowEventEvent;
    }
}
