package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowMapperWebsocket extends WinterFlowUserManagerController implements WinterFlowAlgorithmEntity, WinterFlowLoaderUtility {
    public WinterFlowDebugEvent WinterFlowBatchUI;
    public WinterFlowMapperWebsocket WinterFlowRouterAdapter;
    public final String WinterFlowSerializerStructure = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    public WinterFlowLoaderUtility WinterFlowVariableBandwidth;

    public WinterFlowMapperWebsocket(WinterFlowLoaderUtility winterFlowLoaderUtility, WinterFlowDebugEvent winterFlowDebugEvent) {
        this.WinterFlowVariableBandwidth = winterFlowLoaderUtility;
        this.WinterFlowBatchUI = winterFlowDebugEvent;
    }

    @Override // com.google.android.datatransport.WinterFlowLoaderUtility
    public final long WinterFlowAPIFrontend(int i, long j) {
        WinterFlowMapperWebsocket WinterFlowUIPlatform = this.WinterFlowSingletonPlatform ? WinterFlowUIPlatform() : null;
        long WinterFlowAPIFrontend = WinterFlowUIPlatform != null ? WinterFlowUIPlatform.WinterFlowAPIFrontend(i, j) : 0L;
        return WinterFlowHandlerResolver.WinterFlowVariableVersionControl(WinterFlowAPIFrontend, this.WinterFlowVariableBandwidth.WinterFlowAPIFrontend(i, WinterFlowHandlerResolver.WinterFlowArrayNetwork(j, WinterFlowAPIFrontend)));
    }

    @Override // com.google.android.datatransport.WinterFlowLoaderUtility
    public final long WinterFlowConfigurationSubsystem(int i, long j, long j2) {
        long WinterFlowConfigurationSubsystem = this.WinterFlowVariableBandwidth.WinterFlowConfigurationSubsystem(i, j, j2);
        WinterFlowMapperWebsocket WinterFlowUIPlatform = this.WinterFlowSingletonPlatform ? WinterFlowUIPlatform() : null;
        return WinterFlowHandlerResolver.WinterFlowVariableVersionControl(WinterFlowConfigurationSubsystem, WinterFlowUIPlatform != null ? WinterFlowUIPlatform.WinterFlowConfigurationSubsystem(i, WinterFlowHandlerResolver.WinterFlowVariableVersionControl(j, WinterFlowConfigurationSubsystem), WinterFlowHandlerResolver.WinterFlowArrayNetwork(j2, WinterFlowConfigurationSubsystem)) : 0L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0050, code lost:
    
        if (r9 == r5) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.google.android.datatransport.WinterFlowLoaderUtility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WinterFlowHandlerJSON(long j, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        WinterFlowNodeHandler winterFlowNodeHandler;
        Object obj;
        int i;
        WinterFlowListenerJava winterFlowListenerJava;
        long j2;
        long j3;
        if (winterFlowTransactionManagerLayer instanceof WinterFlowNodeHandler) {
            winterFlowNodeHandler = (WinterFlowNodeHandler) winterFlowTransactionManagerLayer;
            int i2 = winterFlowNodeHandler.WinterFlowTransactionAgent;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                winterFlowNodeHandler.WinterFlowTransactionAgent = i2 - Integer.MIN_VALUE;
                obj = winterFlowNodeHandler.WinterFlowSyntax;
                i = winterFlowNodeHandler.WinterFlowTransactionAgent;
                winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
                if (i != 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    WinterFlowMapperWebsocket WinterFlowUIPlatform = this.WinterFlowSingletonPlatform ? WinterFlowUIPlatform() : null;
                    if (WinterFlowUIPlatform == null) {
                        j2 = 0;
                        WinterFlowLoaderUtility winterFlowLoaderUtility = this.WinterFlowVariableBandwidth;
                        long WinterFlowArrayNetwork = WinterFlowXMLNetwork.WinterFlowArrayNetwork(j, j2);
                        winterFlowNodeHandler.WinterFlowRouterRouter = j2;
                        winterFlowNodeHandler.WinterFlowTransactionAgent = 2;
                        obj = winterFlowLoaderUtility.WinterFlowHandlerJSON(WinterFlowArrayNetwork, winterFlowNodeHandler);
                        if (obj != winterFlowListenerJava) {
                            j3 = j2;
                            return new WinterFlowXMLNetwork(WinterFlowXMLNetwork.WinterFlowVariableVersionControl(j3, ((WinterFlowXMLNetwork) obj).WinterFlowRouterStructure));
                        }
                        return winterFlowListenerJava;
                    }
                    winterFlowNodeHandler.WinterFlowRouterRouter = j;
                    winterFlowNodeHandler.WinterFlowTransactionAgent = 1;
                    obj = WinterFlowUIPlatform.WinterFlowHandlerJSON(j, winterFlowNodeHandler);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        j3 = winterFlowNodeHandler.WinterFlowRouterRouter;
                        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                        return new WinterFlowXMLNetwork(WinterFlowXMLNetwork.WinterFlowVariableVersionControl(j3, ((WinterFlowXMLNetwork) obj).WinterFlowRouterStructure));
                    }
                    j = winterFlowNodeHandler.WinterFlowRouterRouter;
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                }
                j2 = ((WinterFlowXMLNetwork) obj).WinterFlowRouterStructure;
                WinterFlowLoaderUtility winterFlowLoaderUtility2 = this.WinterFlowVariableBandwidth;
                long WinterFlowArrayNetwork2 = WinterFlowXMLNetwork.WinterFlowArrayNetwork(j, j2);
                winterFlowNodeHandler.WinterFlowRouterRouter = j2;
                winterFlowNodeHandler.WinterFlowTransactionAgent = 2;
                obj = winterFlowLoaderUtility2.WinterFlowHandlerJSON(WinterFlowArrayNetwork2, winterFlowNodeHandler);
                if (obj != winterFlowListenerJava) {
                }
                return winterFlowListenerJava;
            }
        }
        winterFlowNodeHandler = new WinterFlowNodeHandler(this, (WinterFlowOrchestrationCompiler) winterFlowTransactionManagerLayer);
        obj = winterFlowNodeHandler.WinterFlowSyntax;
        i = winterFlowNodeHandler.WinterFlowTransactionAgent;
        winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
        if (i != 0) {
        }
        j2 = ((WinterFlowXMLNetwork) obj).WinterFlowRouterStructure;
        WinterFlowLoaderUtility winterFlowLoaderUtility22 = this.WinterFlowVariableBandwidth;
        long WinterFlowArrayNetwork22 = WinterFlowXMLNetwork.WinterFlowArrayNetwork(j, j2);
        winterFlowNodeHandler.WinterFlowRouterRouter = j2;
        winterFlowNodeHandler.WinterFlowTransactionAgent = 2;
        obj = winterFlowLoaderUtility22.WinterFlowHandlerJSON(WinterFlowArrayNetwork22, winterFlowNodeHandler);
        if (obj != winterFlowListenerJava) {
        }
        return winterFlowListenerJava;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // com.google.android.datatransport.WinterFlowLoaderUtility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WinterFlowPackageIDE(long j, long j2, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        WinterFlowNodeCloud winterFlowNodeCloud;
        int i;
        WinterFlowMapperWebsocket winterFlowMapperWebsocket;
        long j3;
        long j4;
        long j5;
        boolean z;
        long j6;
        long j7;
        if (winterFlowTransactionManagerLayer instanceof WinterFlowNodeCloud) {
            winterFlowNodeCloud = (WinterFlowNodeCloud) winterFlowTransactionManagerLayer;
            int i2 = winterFlowNodeCloud.WinterFlowServerProtocol;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                winterFlowNodeCloud.WinterFlowServerProtocol = i2 - Integer.MIN_VALUE;
                WinterFlowNodeCloud winterFlowNodeCloud2 = winterFlowNodeCloud;
                Object obj = winterFlowNodeCloud2.WinterFlowResponseEngine;
                i = winterFlowNodeCloud2.WinterFlowServerProtocol;
                winterFlowMapperWebsocket = null;
                WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
                if (i != 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    WinterFlowLoaderUtility winterFlowLoaderUtility = this.WinterFlowVariableBandwidth;
                    winterFlowNodeCloud2.WinterFlowRouterRouter = j;
                    winterFlowNodeCloud2.WinterFlowSyntax = j2;
                    winterFlowNodeCloud2.WinterFlowServerProtocol = 1;
                    obj = winterFlowLoaderUtility.WinterFlowPackageIDE(j, j2, winterFlowNodeCloud2);
                    if (obj != winterFlowListenerJava) {
                        j3 = j;
                        j4 = j2;
                    }
                    return winterFlowListenerJava;
                }
                if (i != 1) {
                    if (i != 2) {
                        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j7 = winterFlowNodeCloud2.WinterFlowRouterRouter;
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    j6 = ((WinterFlowXMLNetwork) obj).WinterFlowRouterStructure;
                    j5 = j7;
                    return new WinterFlowXMLNetwork(WinterFlowXMLNetwork.WinterFlowVariableVersionControl(j5, j6));
                }
                j4 = winterFlowNodeCloud2.WinterFlowSyntax;
                j3 = winterFlowNodeCloud2.WinterFlowRouterRouter;
                WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                j5 = ((WinterFlowXMLNetwork) obj).WinterFlowRouterStructure;
                z = this.WinterFlowSingletonPlatform;
                if (z) {
                    winterFlowMapperWebsocket = this.WinterFlowRouterAdapter;
                } else if (z) {
                    winterFlowMapperWebsocket = WinterFlowUIPlatform();
                }
                if (winterFlowMapperWebsocket != null) {
                    j6 = 0;
                    return new WinterFlowXMLNetwork(WinterFlowXMLNetwork.WinterFlowVariableVersionControl(j5, j6));
                }
                long WinterFlowVariableVersionControl = WinterFlowXMLNetwork.WinterFlowVariableVersionControl(j3, j5);
                long WinterFlowArrayNetwork = WinterFlowXMLNetwork.WinterFlowArrayNetwork(j4, j5);
                winterFlowNodeCloud2.WinterFlowRouterRouter = j5;
                winterFlowNodeCloud2.WinterFlowServerProtocol = 2;
                obj = winterFlowMapperWebsocket.WinterFlowPackageIDE(WinterFlowVariableVersionControl, WinterFlowArrayNetwork, winterFlowNodeCloud2);
                if (obj != winterFlowListenerJava) {
                    j7 = j5;
                    j6 = ((WinterFlowXMLNetwork) obj).WinterFlowRouterStructure;
                    j5 = j7;
                    return new WinterFlowXMLNetwork(WinterFlowXMLNetwork.WinterFlowVariableVersionControl(j5, j6));
                }
                return winterFlowListenerJava;
            }
        }
        winterFlowNodeCloud = new WinterFlowNodeCloud(this, (WinterFlowOrchestrationCompiler) winterFlowTransactionManagerLayer);
        WinterFlowNodeCloud winterFlowNodeCloud22 = winterFlowNodeCloud;
        Object obj2 = winterFlowNodeCloud22.WinterFlowResponseEngine;
        i = winterFlowNodeCloud22.WinterFlowServerProtocol;
        winterFlowMapperWebsocket = null;
        WinterFlowListenerJava winterFlowListenerJava2 = WinterFlowListenerJava.WinterFlowVariableVersionControl;
        if (i != 0) {
        }
        j5 = ((WinterFlowXMLNetwork) obj2).WinterFlowRouterStructure;
        z = this.WinterFlowSingletonPlatform;
        if (z) {
        }
        if (winterFlowMapperWebsocket != null) {
        }
    }

    @Override // com.google.android.datatransport.WinterFlowAlgorithmEntity
    public final Object WinterFlowResponseEngine() {
        return this.WinterFlowSerializerStructure;
    }

    @Override // com.google.android.datatransport.WinterFlowUserManagerController
    public final void WinterFlowSingletonWidget() {
        WinterFlowDebugEvent winterFlowDebugEvent = this.WinterFlowBatchUI;
        winterFlowDebugEvent.WinterFlowRouterStructure = this;
        winterFlowDebugEvent.WinterFlowHookDataSource = null;
        this.WinterFlowRouterAdapter = null;
        winterFlowDebugEvent.WinterFlowCacheManagerAgent = new WinterFlowRouterEngine(10, this);
        winterFlowDebugEvent.WinterFlowArrayNetwork = WinterFlowModuleService();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15, types: [com.google.android.datatransport.WinterFlowUserManagerController] */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [com.google.android.datatransport.WinterFlowUserManagerController] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [com.google.android.datatransport.WinterFlowJSON] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [com.google.android.datatransport.WinterFlowJSON] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // com.google.android.datatransport.WinterFlowUserManagerController
    public final void WinterFlowTestingTransactionManager() {
        WinterFlowExceptionStrategy winterFlowExceptionStrategy;
        WinterFlowBandwidthCache winterFlowBandwidthCache = new WinterFlowBandwidthCache();
        WinterFlowUIInvoker winterFlowUIInvoker = new WinterFlowUIInvoker(winterFlowBandwidthCache, 1);
        WinterFlowMapperWebsocket winterFlowMapperWebsocket = this;
        if (!winterFlowMapperWebsocket.WinterFlowVariableVersionControl.WinterFlowSingletonPlatform) {
            WinterFlowViewUtility.WinterFlowHookDataSource("visitAncestors called on an unattached node");
        }
        WinterFlowUserManagerController winterFlowUserManagerController = winterFlowMapperWebsocket.WinterFlowVariableVersionControl.WinterFlowSyntax;
        WinterFlowSchedulerStructure WinterFlowSyntaxSubsystem = WinterFlowCloudStack.WinterFlowSyntaxSubsystem(this);
        loop0: while (WinterFlowSyntaxSubsystem != null) {
            if ((WinterFlowSyntaxSubsystem.WinterFlowUserManagerUserManager.WinterFlowTransactionManagerStrategy.WinterFlowRouterRouter & 262144) != 0) {
                while (winterFlowUserManagerController != null) {
                    if ((winterFlowUserManagerController.WinterFlowUnitTestResponse & 262144) != 0) {
                        WinterFlowTestingEntity winterFlowTestingEntity = winterFlowUserManagerController;
                        ?? r8 = 0;
                        while (winterFlowTestingEntity != 0) {
                            if (winterFlowTestingEntity instanceof WinterFlowAlgorithmEntity) {
                                WinterFlowAlgorithmEntity winterFlowAlgorithmEntity = (WinterFlowAlgorithmEntity) winterFlowTestingEntity;
                                if (!((WinterFlowManagerRequest.WinterFlowThreadListener(WinterFlowResponseEngine(), winterFlowAlgorithmEntity.WinterFlowResponseEngine()) && getClass() == winterFlowAlgorithmEntity.getClass()) ? ((Boolean) winterFlowUIInvoker.WinterFlowUnitTestResponse(winterFlowAlgorithmEntity)).booleanValue() : true)) {
                                    break loop0;
                                }
                            } else if ((winterFlowTestingEntity.WinterFlowUnitTestResponse & 262144) != 0 && (winterFlowTestingEntity instanceof WinterFlowTestingEntity)) {
                                WinterFlowUserManagerController winterFlowUserManagerController2 = winterFlowTestingEntity.WinterFlowBatchUI;
                                int i = 0;
                                winterFlowTestingEntity = winterFlowTestingEntity;
                                r8 = r8;
                                while (winterFlowUserManagerController2 != null) {
                                    if ((winterFlowUserManagerController2.WinterFlowUnitTestResponse & 262144) != 0) {
                                        i++;
                                        r8 = r8;
                                        if (i == 1) {
                                            winterFlowTestingEntity = winterFlowUserManagerController2;
                                        } else {
                                            if (r8 == 0) {
                                                r8 = new WinterFlowJSON(new WinterFlowUserManagerController[16]);
                                            }
                                            if (winterFlowTestingEntity != 0) {
                                                r8.WinterFlowHookDataSource(winterFlowTestingEntity);
                                                winterFlowTestingEntity = 0;
                                            }
                                            r8.WinterFlowHookDataSource(winterFlowUserManagerController2);
                                        }
                                    }
                                    winterFlowUserManagerController2 = winterFlowUserManagerController2.WinterFlowResponseEngine;
                                    winterFlowTestingEntity = winterFlowTestingEntity;
                                    r8 = r8;
                                }
                                if (i == 1) {
                                }
                            }
                            winterFlowTestingEntity = WinterFlowCloudStack.WinterFlowPackageIDE(r8);
                        }
                    }
                    winterFlowUserManagerController = winterFlowUserManagerController.WinterFlowSyntax;
                }
            }
            WinterFlowSyntaxSubsystem = WinterFlowSyntaxSubsystem.WinterFlowVariableBandwidth();
            winterFlowUserManagerController = (WinterFlowSyntaxSubsystem == null || (winterFlowExceptionStrategy = WinterFlowSyntaxSubsystem.WinterFlowUserManagerUserManager) == null) ? null : winterFlowExceptionStrategy.WinterFlowVariableVersionControl;
        }
        WinterFlowMapperWebsocket winterFlowMapperWebsocket2 = (WinterFlowMapperWebsocket) ((WinterFlowAlgorithmEntity) winterFlowBandwidthCache.WinterFlowVariableVersionControl);
        this.WinterFlowRouterAdapter = winterFlowMapperWebsocket2;
        WinterFlowDebugEvent winterFlowDebugEvent = this.WinterFlowBatchUI;
        winterFlowDebugEvent.WinterFlowHookDataSource = winterFlowMapperWebsocket2;
        if (winterFlowDebugEvent.WinterFlowRouterStructure == this) {
            winterFlowDebugEvent.WinterFlowRouterStructure = null;
        }
    }

    public final WinterFlowMapperWebsocket WinterFlowUIPlatform() {
        WinterFlowExceptionStrategy winterFlowExceptionStrategy;
        WinterFlowAlgorithmEntity winterFlowAlgorithmEntity = null;
        if (!this.WinterFlowSingletonPlatform) {
            return null;
        }
        if (!this.WinterFlowVariableVersionControl.WinterFlowSingletonPlatform) {
            WinterFlowViewUtility.WinterFlowHookDataSource("visitAncestors called on an unattached node");
        }
        WinterFlowUserManagerController winterFlowUserManagerController = this.WinterFlowVariableVersionControl.WinterFlowSyntax;
        WinterFlowSchedulerStructure WinterFlowSyntaxSubsystem = WinterFlowCloudStack.WinterFlowSyntaxSubsystem(this);
        loop0: while (true) {
            if (WinterFlowSyntaxSubsystem == null) {
                break;
            }
            if ((WinterFlowSyntaxSubsystem.WinterFlowUserManagerUserManager.WinterFlowTransactionManagerStrategy.WinterFlowRouterRouter & 262144) != 0) {
                while (winterFlowUserManagerController != null) {
                    if ((winterFlowUserManagerController.WinterFlowUnitTestResponse & 262144) != 0) {
                        WinterFlowUserManagerController winterFlowUserManagerController2 = winterFlowUserManagerController;
                        WinterFlowJSON winterFlowJSON = null;
                        while (winterFlowUserManagerController2 != null) {
                            if (winterFlowUserManagerController2 instanceof WinterFlowAlgorithmEntity) {
                                WinterFlowAlgorithmEntity winterFlowAlgorithmEntity2 = (WinterFlowAlgorithmEntity) winterFlowUserManagerController2;
                                if (WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowSerializerStructure, winterFlowAlgorithmEntity2.WinterFlowResponseEngine()) && WinterFlowMapperWebsocket.class == winterFlowAlgorithmEntity2.getClass()) {
                                    winterFlowAlgorithmEntity = winterFlowAlgorithmEntity2;
                                    break loop0;
                                }
                            }
                            if ((winterFlowUserManagerController2.WinterFlowUnitTestResponse & 262144) != 0 && (winterFlowUserManagerController2 instanceof WinterFlowTestingEntity)) {
                                int i = 0;
                                for (WinterFlowUserManagerController winterFlowUserManagerController3 = ((WinterFlowTestingEntity) winterFlowUserManagerController2).WinterFlowBatchUI; winterFlowUserManagerController3 != null; winterFlowUserManagerController3 = winterFlowUserManagerController3.WinterFlowResponseEngine) {
                                    if ((winterFlowUserManagerController3.WinterFlowUnitTestResponse & 262144) != 0) {
                                        i++;
                                        if (i == 1) {
                                            winterFlowUserManagerController2 = winterFlowUserManagerController3;
                                        } else {
                                            if (winterFlowJSON == null) {
                                                winterFlowJSON = new WinterFlowJSON(new WinterFlowUserManagerController[16]);
                                            }
                                            if (winterFlowUserManagerController2 != null) {
                                                winterFlowJSON.WinterFlowHookDataSource(winterFlowUserManagerController2);
                                                winterFlowUserManagerController2 = null;
                                            }
                                            winterFlowJSON.WinterFlowHookDataSource(winterFlowUserManagerController3);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            winterFlowUserManagerController2 = WinterFlowCloudStack.WinterFlowPackageIDE(winterFlowJSON);
                        }
                    }
                    winterFlowUserManagerController = winterFlowUserManagerController.WinterFlowSyntax;
                }
            }
            WinterFlowSyntaxSubsystem = WinterFlowSyntaxSubsystem.WinterFlowVariableBandwidth();
            winterFlowUserManagerController = (WinterFlowSyntaxSubsystem == null || (winterFlowExceptionStrategy = WinterFlowSyntaxSubsystem.WinterFlowUserManagerUserManager) == null) ? null : winterFlowExceptionStrategy.WinterFlowVariableVersionControl;
        }
        return (WinterFlowMapperWebsocket) winterFlowAlgorithmEntity;
    }

    public final WinterFlowAdapterResponse WinterFlowValidatorNetwork() {
        WinterFlowMapperWebsocket WinterFlowUIPlatform = WinterFlowUIPlatform();
        WinterFlowAdapterResponse WinterFlowValidatorNetwork = WinterFlowUIPlatform != null ? WinterFlowUIPlatform.WinterFlowValidatorNetwork() : null;
        if (WinterFlowValidatorNetwork != null && WinterFlowEncryptionSubsystem.WinterFlowCacheManagerListener(WinterFlowValidatorNetwork)) {
            return WinterFlowValidatorNetwork;
        }
        WinterFlowAdapterResponse winterFlowAdapterResponse = this.WinterFlowBatchUI.WinterFlowArrayNetwork;
        if (winterFlowAdapterResponse != null) {
            return winterFlowAdapterResponse;
        }
        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }
}
