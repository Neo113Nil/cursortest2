package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowStackManager extends WinterFlowNodeInheritance implements WinterFlowObjectSession {
    public int WinterFlowResponseEngine;
    public final /* synthetic */ Object WinterFlowServerProtocol;
    public final /* synthetic */ int WinterFlowSyntax;
    public final /* synthetic */ Object WinterFlowThreadListener;
    public final /* synthetic */ Object WinterFlowTransactionAgent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowStackManager(WinterFlowCacheManagerMicroservice winterFlowCacheManagerMicroservice, Object obj, WinterFlowHandlerInvoker winterFlowHandlerInvoker, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        super(1, winterFlowTransactionManagerLayer);
        this.WinterFlowSyntax = 1;
        this.WinterFlowTransactionAgent = winterFlowCacheManagerMicroservice;
        this.WinterFlowServerProtocol = obj;
        this.WinterFlowThreadListener = winterFlowHandlerInvoker;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final Object WinterFlowServiceUtility(Object obj) {
        int i = this.WinterFlowSyntax;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        Object obj2 = this.WinterFlowServerProtocol;
        Object obj3 = this.WinterFlowTransactionAgent;
        Object obj4 = this.WinterFlowThreadListener;
        WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowHandlerInvoker winterFlowHandlerInvoker = (WinterFlowHandlerInvoker) obj4;
                int i2 = this.WinterFlowResponseEngine;
                if (i2 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    WinterFlowRuntimeMechanism winterFlowRuntimeMechanism = new WinterFlowRuntimeMechanism((WinterFlowCacheManagerMicroservice) obj3, obj2, winterFlowHandlerInvoker, null);
                    this.WinterFlowResponseEngine = 1;
                    if (WinterFlowEncryptionSubsystem.WinterFlowOrchestrationSubsystem(winterFlowRuntimeMechanism, this) == winterFlowListenerJava) {
                        return winterFlowListenerJava;
                    }
                } else {
                    if (i2 != 1) {
                        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                }
                winterFlowHandlerInvoker.WinterFlowSyntax();
                return winterFlowAlgorithmSession;
            case 1:
                WinterFlowHandlerInvoker winterFlowHandlerInvoker2 = (WinterFlowHandlerInvoker) obj4;
                WinterFlowCacheManagerMicroservice winterFlowCacheManagerMicroservice = (WinterFlowCacheManagerMicroservice) obj3;
                int i3 = this.WinterFlowResponseEngine;
                if (i3 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    winterFlowCacheManagerMicroservice.WinterFlowEventEmitterController();
                    WinterFlowResolverSubsystem winterFlowResolverSubsystem = winterFlowCacheManagerMicroservice.WinterFlowHookDataSource;
                    winterFlowCacheManagerMicroservice.WinterFlowThreadListener = Long.MIN_VALUE;
                    winterFlowCacheManagerMicroservice.WinterFlowPackageIDE(0.0f);
                    float f = obj2.equals(winterFlowCacheManagerMicroservice.WinterFlowCacheManagerAgent.getValue()) ? -4.0f : obj2.equals(winterFlowResolverSubsystem.getValue()) ? -5.0f : -3.0f;
                    winterFlowHandlerInvoker2.WinterFlowOrchestrationSubsystem(obj2);
                    winterFlowHandlerInvoker2.WinterFlowServiceUtility(0L);
                    winterFlowResolverSubsystem.setValue(obj2);
                    winterFlowCacheManagerMicroservice.WinterFlowPackageIDE(0.0f);
                    winterFlowCacheManagerMicroservice.WinterFlowRouterAdapter(obj2);
                    winterFlowHandlerInvoker2.WinterFlowResponseEngine(f);
                    if (f == -3.0f) {
                        this.WinterFlowResponseEngine = 1;
                        if (winterFlowCacheManagerMicroservice.WinterFlowSoftwareEngine(this) == winterFlowListenerJava) {
                            return winterFlowListenerJava;
                        }
                    }
                } else {
                    if (i3 != 1) {
                        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                }
                winterFlowHandlerInvoker2.WinterFlowSyntax();
                return winterFlowAlgorithmSession;
            default:
                int i4 = this.WinterFlowResponseEngine;
                if (i4 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    this.WinterFlowResponseEngine = 1;
                    Object WinterFlowVariableVersionControl = ((WinterFlowHookPlatform) obj4).WinterFlowVariableVersionControl((WinterFlowAdapter) obj3, (WinterFlowEventEvent) obj2, this);
                    return WinterFlowVariableVersionControl == winterFlowListenerJava ? winterFlowListenerJava : WinterFlowVariableVersionControl;
                }
                if (i4 == 1) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    return obj;
                }
                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    @Override // com.google.android.datatransport.WinterFlowObjectSession
    public final Object WinterFlowUnitTestResponse(Object obj) {
        int i = this.WinterFlowSyntax;
        Object obj2 = this.WinterFlowServerProtocol;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        Object obj3 = this.WinterFlowTransactionAgent;
        Object obj4 = this.WinterFlowThreadListener;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new WinterFlowStackManager((WinterFlowHandlerInvoker) obj4, (WinterFlowCacheManagerMicroservice) obj3, this.WinterFlowServerProtocol, (WinterFlowTransactionManagerLayer) obj, 0).WinterFlowServiceUtility(winterFlowAlgorithmSession);
            case 1:
                return new WinterFlowStackManager((WinterFlowCacheManagerMicroservice) obj3, obj2, (WinterFlowHandlerInvoker) obj4, (WinterFlowTransactionManagerLayer) obj).WinterFlowServiceUtility(winterFlowAlgorithmSession);
            default:
                return new WinterFlowStackManager((WinterFlowHookPlatform) obj4, (WinterFlowAdapter) obj3, (WinterFlowEventEvent) obj2, (WinterFlowTransactionManagerLayer) obj, 2).WinterFlowServiceUtility(winterFlowAlgorithmSession);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WinterFlowStackManager(Object obj, Object obj2, Object obj3, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, int i) {
        super(1, winterFlowTransactionManagerLayer);
        this.WinterFlowSyntax = i;
        this.WinterFlowThreadListener = obj;
        this.WinterFlowTransactionAgent = obj2;
        this.WinterFlowServerProtocol = obj3;
    }
}
