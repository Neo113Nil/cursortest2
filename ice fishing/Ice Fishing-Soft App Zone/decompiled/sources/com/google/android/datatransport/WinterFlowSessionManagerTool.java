package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowSessionManagerTool implements WinterFlowCacheInterface {
    public final Object WinterFlowRouterRouter;
    public final Object WinterFlowTransactionManagerStrategy;
    public final Object WinterFlowUnitTestResponse;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public WinterFlowSessionManagerTool(WinterFlowCacheInterface winterFlowCacheInterface, WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice) {
        this.WinterFlowVariableVersionControl = 3;
        this.WinterFlowTransactionManagerStrategy = winterFlowEncryptionMicroservice;
        this.WinterFlowUnitTestResponse = WinterFlowInvokerComponent.WinterFlowProxyStructure(winterFlowEncryptionMicroservice);
        this.WinterFlowRouterRouter = new WinterFlowNetworkOrchestration(winterFlowCacheInterface, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bb  */
    @Override // com.google.android.datatransport.WinterFlowCacheInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WinterFlowRouterRouter(Object obj, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        WinterFlowTransactionManagerFramework winterFlowTransactionManagerFramework;
        int i;
        WinterFlowNetworkTool winterFlowNetworkTool;
        Object obj2;
        int i2;
        WinterFlowCacheInterface winterFlowCacheInterface;
        WinterFlowSessionManagerTool winterFlowSessionManagerTool = this;
        Object obj3 = obj;
        int i3 = winterFlowSessionManagerTool.WinterFlowVariableVersionControl;
        WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        Object obj4 = winterFlowSessionManagerTool.WinterFlowRouterRouter;
        Object obj5 = winterFlowSessionManagerTool.WinterFlowUnitTestResponse;
        Object obj6 = winterFlowSessionManagerTool.WinterFlowTransactionManagerStrategy;
        switch (i3) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowHandlerInvoker winterFlowHandlerInvoker = (WinterFlowHandlerInvoker) obj5;
                ((WinterFlowSoftwareProtocol) obj6).setValue(Boolean.valueOf(((Boolean) obj3).booleanValue() ? ((Boolean) ((WinterFlowEventEvent) ((WinterFlowThreadPoolGateway) obj4).getValue()).WinterFlowVariableVersionControl(winterFlowHandlerInvoker.WinterFlowRouterStructure.WinterFlowSyntax(), winterFlowHandlerInvoker.WinterFlowArrayNetwork.getValue())).booleanValue() : false));
                return winterFlowAlgorithmSession;
            case 1:
                if (winterFlowTransactionManagerLayer instanceof WinterFlowTransactionManagerFramework) {
                    winterFlowTransactionManagerFramework = (WinterFlowTransactionManagerFramework) winterFlowTransactionManagerLayer;
                    int i4 = winterFlowTransactionManagerFramework.WinterFlowServerProtocol;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        winterFlowTransactionManagerFramework.WinterFlowServerProtocol = i4 - Integer.MIN_VALUE;
                        Object obj7 = winterFlowTransactionManagerFramework.WinterFlowResponseEngine;
                        i = winterFlowTransactionManagerFramework.WinterFlowServerProtocol;
                        if (i != 0) {
                            WinterFlowPackageProcess.WinterFlowThreadListener(obj7);
                            if (((WinterFlowInterfaceProcessor) obj6).WinterFlowVariableVersionControl) {
                                winterFlowTransactionManagerFramework.WinterFlowServerProtocol = 1;
                                if (((WinterFlowCacheInterface) obj5).WinterFlowRouterRouter(obj3, winterFlowTransactionManagerFramework) == winterFlowListenerJava) {
                                    return winterFlowListenerJava;
                                }
                                return winterFlowAlgorithmSession;
                            }
                            winterFlowTransactionManagerFramework.WinterFlowRouterRouter = winterFlowSessionManagerTool;
                            winterFlowTransactionManagerFramework.WinterFlowSyntax = obj3;
                            winterFlowTransactionManagerFramework.WinterFlowServerProtocol = 2;
                            obj7 = ((WinterFlowEventEvent) obj4).WinterFlowVariableVersionControl(obj3, winterFlowTransactionManagerFramework);
                            if (obj7 == winterFlowListenerJava) {
                                return winterFlowListenerJava;
                            }
                            if (!((Boolean) obj7).booleanValue()) {
                            }
                            return winterFlowAlgorithmSession;
                        }
                        if (i != 1) {
                            if (i == 2) {
                                Object obj8 = winterFlowTransactionManagerFramework.WinterFlowSyntax;
                                WinterFlowSessionManagerTool winterFlowSessionManagerTool2 = winterFlowTransactionManagerFramework.WinterFlowRouterRouter;
                                WinterFlowPackageProcess.WinterFlowThreadListener(obj7);
                                obj3 = obj8;
                                winterFlowSessionManagerTool = winterFlowSessionManagerTool2;
                                if (!((Boolean) obj7).booleanValue()) {
                                    ((WinterFlowInterfaceProcessor) winterFlowSessionManagerTool.WinterFlowTransactionManagerStrategy).WinterFlowVariableVersionControl = true;
                                    WinterFlowCacheInterface winterFlowCacheInterface2 = (WinterFlowCacheInterface) winterFlowSessionManagerTool.WinterFlowUnitTestResponse;
                                    winterFlowTransactionManagerFramework.WinterFlowRouterRouter = null;
                                    winterFlowTransactionManagerFramework.WinterFlowSyntax = null;
                                    winterFlowTransactionManagerFramework.WinterFlowServerProtocol = 3;
                                    if (winterFlowCacheInterface2.WinterFlowRouterRouter(obj3, winterFlowTransactionManagerFramework) == winterFlowListenerJava) {
                                        return winterFlowListenerJava;
                                    }
                                }
                                return winterFlowAlgorithmSession;
                            }
                            if (i != 3) {
                                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        }
                        WinterFlowPackageProcess.WinterFlowThreadListener(obj7);
                        return winterFlowAlgorithmSession;
                    }
                }
                winterFlowTransactionManagerFramework = new WinterFlowTransactionManagerFramework(winterFlowSessionManagerTool, winterFlowTransactionManagerLayer);
                Object obj72 = winterFlowTransactionManagerFramework.WinterFlowResponseEngine;
                i = winterFlowTransactionManagerFramework.WinterFlowServerProtocol;
                if (i != 0) {
                }
            case 2:
                if (winterFlowTransactionManagerLayer instanceof WinterFlowNetworkTool) {
                    winterFlowNetworkTool = (WinterFlowNetworkTool) winterFlowTransactionManagerLayer;
                    int i5 = winterFlowNetworkTool.WinterFlowSyntax;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        winterFlowNetworkTool.WinterFlowSyntax = i5 - Integer.MIN_VALUE;
                        obj2 = winterFlowNetworkTool.WinterFlowRouterRouter;
                        i2 = winterFlowNetworkTool.WinterFlowSyntax;
                        if (i2 != 0) {
                            WinterFlowPackageProcess.WinterFlowThreadListener(obj2);
                            WinterFlowCacheInterface winterFlowCacheInterface3 = (WinterFlowCacheInterface) obj6;
                            winterFlowNetworkTool.WinterFlowResponseEngine = winterFlowCacheInterface3;
                            winterFlowNetworkTool.WinterFlowSyntax = 1;
                            Object WinterFlowArrayHelper = WinterFlowQuerySyntax.WinterFlowArrayHelper((WinterFlowCloudFramework) obj5, true, false, (WinterFlowInterfaceSoftware) obj4, winterFlowNetworkTool);
                            if (WinterFlowArrayHelper == winterFlowListenerJava) {
                                return winterFlowListenerJava;
                            }
                            winterFlowCacheInterface = winterFlowCacheInterface3;
                            obj2 = WinterFlowArrayHelper;
                        } else {
                            if (i2 != 1) {
                                if (i2 == 2) {
                                    WinterFlowPackageProcess.WinterFlowThreadListener(obj2);
                                    return winterFlowAlgorithmSession;
                                }
                                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            winterFlowCacheInterface = winterFlowNetworkTool.WinterFlowResponseEngine;
                            WinterFlowPackageProcess.WinterFlowThreadListener(obj2);
                        }
                        winterFlowNetworkTool.WinterFlowResponseEngine = null;
                        winterFlowNetworkTool.WinterFlowSyntax = 2;
                        if (winterFlowCacheInterface.WinterFlowRouterRouter(obj2, winterFlowNetworkTool) == winterFlowListenerJava) {
                            return winterFlowListenerJava;
                        }
                        return winterFlowAlgorithmSession;
                    }
                }
                winterFlowNetworkTool = new WinterFlowNetworkTool(winterFlowSessionManagerTool, winterFlowTransactionManagerLayer);
                obj2 = winterFlowNetworkTool.WinterFlowRouterRouter;
                i2 = winterFlowNetworkTool.WinterFlowSyntax;
                if (i2 != 0) {
                }
                winterFlowNetworkTool.WinterFlowResponseEngine = null;
                winterFlowNetworkTool.WinterFlowSyntax = 2;
                if (winterFlowCacheInterface.WinterFlowRouterRouter(obj2, winterFlowNetworkTool) == winterFlowListenerJava) {
                }
                return winterFlowAlgorithmSession;
            default:
                Object WinterFlowProxyStructure = WinterFlowEncryptionSubsystem.WinterFlowProxyStructure((WinterFlowEncryptionMicroservice) obj6, obj3, obj5, (WinterFlowNetworkOrchestration) obj4, winterFlowTransactionManagerLayer);
                return WinterFlowProxyStructure == winterFlowListenerJava ? WinterFlowProxyStructure : winterFlowAlgorithmSession;
        }
    }

    public /* synthetic */ WinterFlowSessionManagerTool(Object obj, Object obj2, Object obj3, int i) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = obj;
        this.WinterFlowUnitTestResponse = obj2;
        this.WinterFlowRouterRouter = obj3;
    }
}
