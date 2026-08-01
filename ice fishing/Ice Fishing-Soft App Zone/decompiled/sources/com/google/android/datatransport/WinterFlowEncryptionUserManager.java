package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowEncryptionUserManager extends WinterFlowNodeInheritance implements WinterFlowEventEvent {
    public int WinterFlowResponseEngine;
    public /* synthetic */ long WinterFlowServerProtocol;
    public final /* synthetic */ int WinterFlowSyntax;
    public final /* synthetic */ Object WinterFlowTransactionAgent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WinterFlowEncryptionUserManager(Object obj, long j, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, int i) {
        super(2, winterFlowTransactionManagerLayer);
        this.WinterFlowSyntax = i;
        this.WinterFlowTransactionAgent = obj;
        this.WinterFlowServerProtocol = j;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final WinterFlowTransactionManagerLayer WinterFlowServerProtocol(WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, Object obj) {
        int i = this.WinterFlowSyntax;
        Object obj2 = this.WinterFlowTransactionAgent;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new WinterFlowEncryptionUserManager((WinterFlowConcurrencyThread) obj2, this.WinterFlowServerProtocol, winterFlowTransactionManagerLayer, 0);
            case 1:
                return new WinterFlowEncryptionUserManager((WinterFlowConcurrencyThread) obj2, this.WinterFlowServerProtocol, winterFlowTransactionManagerLayer, 1);
            case 2:
                return new WinterFlowEncryptionUserManager((WinterFlowConcurrencyThread) obj2, this.WinterFlowServerProtocol, winterFlowTransactionManagerLayer, 2);
            case 3:
                WinterFlowEncryptionUserManager winterFlowEncryptionUserManager = new WinterFlowEncryptionUserManager((WinterFlowConcurrencyThread) obj2, winterFlowTransactionManagerLayer);
                winterFlowEncryptionUserManager.WinterFlowServerProtocol = ((WinterFlowHandlerResolver) obj).WinterFlowRouterStructure;
                return winterFlowEncryptionUserManager;
            default:
                return new WinterFlowEncryptionUserManager((WinterFlowRouterLayer) obj2, this.WinterFlowServerProtocol, winterFlowTransactionManagerLayer, 4);
        }
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final Object WinterFlowServiceUtility(Object obj) {
        int i = this.WinterFlowSyntax;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        Object obj2 = this.WinterFlowTransactionAgent;
        WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i2 = this.WinterFlowResponseEngine;
                if (i2 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    WinterFlowTransactionManagerService winterFlowTransactionManagerService = ((WinterFlowConcurrencyThread) obj2).WinterFlowCacheTool;
                    WinterFlowModulePipeline winterFlowModulePipeline = new WinterFlowModulePipeline(this.WinterFlowServerProtocol, null);
                    this.WinterFlowResponseEngine = 1;
                    if (winterFlowTransactionManagerService.WinterFlowTransactionManagerStrategy(WinterFlowExceptionListener.WinterFlowTransactionManagerStrategy, winterFlowModulePipeline, this) == winterFlowListenerJava) {
                        break;
                    }
                } else if (i2 != 1) {
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    break;
                }
                break;
            case 1:
                int i3 = this.WinterFlowResponseEngine;
                if (i3 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    WinterFlowTransactionManagerService winterFlowTransactionManagerService2 = ((WinterFlowConcurrencyThread) obj2).WinterFlowCacheTool;
                    long j = this.WinterFlowServerProtocol;
                    this.WinterFlowResponseEngine = 1;
                    if (winterFlowTransactionManagerService2.WinterFlowHookDataSource(j, false, this) == winterFlowListenerJava) {
                        break;
                    }
                } else if (i3 != 1) {
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    break;
                }
                break;
            case 2:
                int i4 = this.WinterFlowResponseEngine;
                if (i4 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    WinterFlowTransactionManagerService winterFlowTransactionManagerService3 = ((WinterFlowConcurrencyThread) obj2).WinterFlowCacheTool;
                    long j2 = this.WinterFlowServerProtocol;
                    this.WinterFlowResponseEngine = 1;
                    if (winterFlowTransactionManagerService3.WinterFlowHookDataSource(j2, true, this) == winterFlowListenerJava) {
                        break;
                    }
                } else if (i4 != 1) {
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    break;
                }
                break;
            case 3:
                int i5 = this.WinterFlowResponseEngine;
                if (i5 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    long j3 = this.WinterFlowServerProtocol;
                    WinterFlowTransactionManagerService winterFlowTransactionManagerService4 = ((WinterFlowConcurrencyThread) obj2).WinterFlowCacheTool;
                    this.WinterFlowResponseEngine = 1;
                    Object WinterFlowRouterStructure = WinterFlowProcessorEntity.WinterFlowRouterStructure(winterFlowTransactionManagerService4, j3, this);
                    if (WinterFlowRouterStructure == winterFlowListenerJava) {
                        break;
                    }
                } else if (i5 != 1) {
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    break;
                }
                break;
            default:
                int i6 = this.WinterFlowResponseEngine;
                if (i6 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    WinterFlowDebugEvent winterFlowDebugEvent = ((WinterFlowRouterLayer) obj2).WinterFlowVariableVersionControl;
                    long j4 = this.WinterFlowServerProtocol;
                    this.WinterFlowResponseEngine = 1;
                    if (winterFlowDebugEvent.WinterFlowHookDataSource(j4, this) == winterFlowListenerJava) {
                        break;
                    }
                } else if (i6 != 1) {
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    break;
                }
                break;
        }
        return winterFlowListenerJava;
    }

    @Override // com.google.android.datatransport.WinterFlowEventEvent
    public final Object WinterFlowVariableVersionControl(Object obj, Object obj2) {
        int i = this.WinterFlowSyntax;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((WinterFlowEncryptionUserManager) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowAdapterResponse) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
            case 1:
                return ((WinterFlowEncryptionUserManager) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowAdapterResponse) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
            case 2:
                return ((WinterFlowEncryptionUserManager) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowAdapterResponse) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
            case 3:
                long j = ((WinterFlowHandlerResolver) obj).WinterFlowRouterStructure;
                WinterFlowEncryptionUserManager winterFlowEncryptionUserManager = new WinterFlowEncryptionUserManager((WinterFlowConcurrencyThread) this.WinterFlowTransactionAgent, (WinterFlowTransactionManagerLayer) obj2);
                winterFlowEncryptionUserManager.WinterFlowServerProtocol = j;
                return winterFlowEncryptionUserManager.WinterFlowServiceUtility(winterFlowAlgorithmSession);
            default:
                return ((WinterFlowEncryptionUserManager) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowAdapterResponse) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowEncryptionUserManager(WinterFlowConcurrencyThread winterFlowConcurrencyThread, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        super(2, winterFlowTransactionManagerLayer);
        this.WinterFlowSyntax = 3;
        this.WinterFlowTransactionAgent = winterFlowConcurrencyThread;
    }
}
