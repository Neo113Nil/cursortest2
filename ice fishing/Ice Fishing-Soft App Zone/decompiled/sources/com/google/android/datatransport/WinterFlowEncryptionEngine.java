package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowEncryptionEngine implements WinterFlowCacheInterface {
    public final /* synthetic */ Object WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ Object WinterFlowUnitTestResponse;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public WinterFlowEncryptionEngine(WinterFlowScriptInterface winterFlowScriptInterface, WinterFlowBandwidthCache winterFlowBandwidthCache, WinterFlowCacheInterface winterFlowCacheInterface) {
        this.WinterFlowVariableVersionControl = 0;
        this.WinterFlowUnitTestResponse = winterFlowBandwidthCache;
        this.WinterFlowTransactionManagerStrategy = winterFlowCacheInterface;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01a2  */
    @Override // com.google.android.datatransport.WinterFlowCacheInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WinterFlowRouterRouter(Object obj, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        WinterFlowViewConfiguration winterFlowViewConfiguration;
        int i;
        WinterFlowTransactionLayer winterFlowTransactionLayer;
        Object obj2;
        int i2;
        WinterFlowSessionHelper winterFlowSessionHelper;
        Object obj3;
        int i3;
        int i4 = this.WinterFlowVariableVersionControl;
        boolean z = false;
        WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
        Object obj4 = this.WinterFlowTransactionManagerStrategy;
        Object obj5 = this.WinterFlowUnitTestResponse;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer2 = null;
        switch (i4) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowBandwidthCache winterFlowBandwidthCache = (WinterFlowBandwidthCache) obj5;
                if (winterFlowTransactionManagerLayer instanceof WinterFlowViewConfiguration) {
                    winterFlowViewConfiguration = (WinterFlowViewConfiguration) winterFlowTransactionManagerLayer;
                    int i5 = winterFlowViewConfiguration.WinterFlowResponseEngine;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        winterFlowViewConfiguration.WinterFlowResponseEngine = i5 - Integer.MIN_VALUE;
                        Object obj6 = winterFlowViewConfiguration.WinterFlowRouterRouter;
                        i = winterFlowViewConfiguration.WinterFlowResponseEngine;
                        if (i != 0) {
                            WinterFlowPackageProcess.WinterFlowThreadListener(obj6);
                            Object obj7 = winterFlowBandwidthCache.WinterFlowVariableVersionControl;
                            if (obj7 == WinterFlowEncryptionSubsystem.WinterFlowServerProtocol || !WinterFlowManagerRequest.WinterFlowThreadListener(obj7, obj)) {
                                winterFlowBandwidthCache.WinterFlowVariableVersionControl = obj;
                                winterFlowViewConfiguration.WinterFlowResponseEngine = 1;
                                if (((WinterFlowCacheInterface) obj4).WinterFlowRouterRouter(obj, winterFlowViewConfiguration) == winterFlowListenerJava) {
                                    return winterFlowListenerJava;
                                }
                            }
                        } else {
                            if (i != 1) {
                                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            WinterFlowPackageProcess.WinterFlowThreadListener(obj6);
                        }
                        return winterFlowAlgorithmSession;
                    }
                }
                winterFlowViewConfiguration = new WinterFlowViewConfiguration(this, winterFlowTransactionManagerLayer);
                Object obj62 = winterFlowViewConfiguration.WinterFlowRouterRouter;
                i = winterFlowViewConfiguration.WinterFlowResponseEngine;
                if (i != 0) {
                }
                return winterFlowAlgorithmSession;
            case 1:
                if (winterFlowTransactionManagerLayer instanceof WinterFlowTransactionLayer) {
                    winterFlowTransactionLayer = (WinterFlowTransactionLayer) winterFlowTransactionManagerLayer;
                    int i6 = winterFlowTransactionLayer.WinterFlowResponseEngine;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        winterFlowTransactionLayer.WinterFlowResponseEngine = i6 - Integer.MIN_VALUE;
                        obj2 = winterFlowTransactionLayer.WinterFlowSyntax;
                        i2 = winterFlowTransactionLayer.WinterFlowResponseEngine;
                        if (i2 != 0) {
                            WinterFlowPackageProcess.WinterFlowThreadListener(obj2);
                            winterFlowTransactionLayer.WinterFlowRouterRouter = this;
                            winterFlowTransactionLayer.WinterFlowServerProtocol = obj;
                            winterFlowTransactionLayer.WinterFlowResponseEngine = 1;
                            obj2 = ((WinterFlowConcurrencyMiddleware) obj5).WinterFlowVariableVersionControl(obj, winterFlowTransactionLayer);
                            if (obj2 == winterFlowListenerJava) {
                                return winterFlowListenerJava;
                            }
                        } else {
                            if (i2 != 1) {
                                if (i2 != 2) {
                                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                this = winterFlowTransactionLayer.WinterFlowRouterRouter;
                                WinterFlowPackageProcess.WinterFlowThreadListener(obj2);
                                z = true;
                                if (z) {
                                    return winterFlowAlgorithmSession;
                                }
                                throw new WinterFlowSyntaxEvent(this);
                            }
                            obj = winterFlowTransactionLayer.WinterFlowServerProtocol;
                            this = winterFlowTransactionLayer.WinterFlowRouterRouter;
                            WinterFlowPackageProcess.WinterFlowThreadListener(obj2);
                        }
                        if (((Boolean) obj2).booleanValue()) {
                            WinterFlowCacheInterface winterFlowCacheInterface = (WinterFlowCacheInterface) this.WinterFlowTransactionManagerStrategy;
                            winterFlowTransactionLayer.WinterFlowRouterRouter = this;
                            winterFlowTransactionLayer.WinterFlowServerProtocol = null;
                            winterFlowTransactionLayer.WinterFlowResponseEngine = 2;
                            if (winterFlowCacheInterface.WinterFlowRouterRouter(obj, winterFlowTransactionLayer) == winterFlowListenerJava) {
                                return winterFlowListenerJava;
                            }
                            z = true;
                        }
                        if (z) {
                        }
                    }
                }
                winterFlowTransactionLayer = new WinterFlowTransactionLayer(this, winterFlowTransactionManagerLayer);
                obj2 = winterFlowTransactionLayer.WinterFlowSyntax;
                i2 = winterFlowTransactionLayer.WinterFlowResponseEngine;
                if (i2 != 0) {
                }
                if (((Boolean) obj2).booleanValue()) {
                }
                if (z) {
                }
            case 2:
                if (winterFlowTransactionManagerLayer instanceof WinterFlowSessionHelper) {
                    winterFlowSessionHelper = (WinterFlowSessionHelper) winterFlowTransactionManagerLayer;
                    int i7 = winterFlowSessionHelper.WinterFlowResponseEngine;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        winterFlowSessionHelper.WinterFlowResponseEngine = i7 - Integer.MIN_VALUE;
                        obj3 = winterFlowSessionHelper.WinterFlowSyntax;
                        i3 = winterFlowSessionHelper.WinterFlowResponseEngine;
                        if (i3 != 0) {
                            WinterFlowPackageProcess.WinterFlowThreadListener(obj3);
                            winterFlowSessionHelper.WinterFlowRouterRouter = this;
                            winterFlowSessionHelper.WinterFlowServerProtocol = obj;
                            winterFlowSessionHelper.WinterFlowResponseEngine = 1;
                            obj3 = ((WinterFlowEventEvent) obj4).WinterFlowVariableVersionControl(obj, winterFlowSessionHelper);
                            if (obj3 == winterFlowListenerJava) {
                                return winterFlowListenerJava;
                            }
                        } else {
                            if (i3 != 1) {
                                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            obj = winterFlowSessionHelper.WinterFlowServerProtocol;
                            this = winterFlowSessionHelper.WinterFlowRouterRouter;
                            WinterFlowPackageProcess.WinterFlowThreadListener(obj3);
                        }
                        if (((Boolean) obj3).booleanValue()) {
                            return winterFlowAlgorithmSession;
                        }
                        ((WinterFlowBandwidthCache) this.WinterFlowUnitTestResponse).WinterFlowVariableVersionControl = obj;
                        throw new WinterFlowSyntaxEvent(this);
                    }
                }
                winterFlowSessionHelper = new WinterFlowSessionHelper(this, winterFlowTransactionManagerLayer);
                obj3 = winterFlowSessionHelper.WinterFlowSyntax;
                i3 = winterFlowSessionHelper.WinterFlowResponseEngine;
                if (i3 != 0) {
                }
                if (((Boolean) obj3).booleanValue()) {
                }
            case 3:
                ((WinterFlowThreadPoolGateway) obj5).setValue(Boolean.TRUE);
                ((WinterFlowObjectHandler) obj4).WinterFlowSyntax(((WinterFlowPipelineEvent) obj).WinterFlowCacheManagerAgent);
                return winterFlowAlgorithmSession;
            default:
                WinterFlowStackUI winterFlowStackUI = (WinterFlowStackUI) obj;
                WinterFlowRequestComponent winterFlowRequestComponent = (WinterFlowRequestComponent) obj5;
                if (!(winterFlowStackUI instanceof WinterFlowConcurrencyTransactionManager)) {
                    WinterFlowAdapterResponse winterFlowAdapterResponse = (WinterFlowAdapterResponse) obj4;
                    WinterFlowRepositoryFramework winterFlowRepositoryFramework = winterFlowRequestComponent.WinterFlowResolverController;
                    float f = 0.0f;
                    if (winterFlowRepositoryFramework == null) {
                        boolean z2 = winterFlowRequestComponent.WinterFlowBatchUI;
                        WinterFlowBatchFramework winterFlowBatchFramework = winterFlowRequestComponent.WinterFlowMapperProtocol;
                        winterFlowRepositoryFramework = new WinterFlowRepositoryFramework();
                        winterFlowRepositoryFramework.WinterFlowRouterStructure = z2;
                        winterFlowRepositoryFramework.WinterFlowHookDataSource = winterFlowBatchFramework;
                        winterFlowRepositoryFramework.WinterFlowCacheManagerAgent = WinterFlowServerManager.WinterFlowRouterStructure(0.0f);
                        winterFlowRepositoryFramework.WinterFlowArrayNetwork = new ArrayList();
                        WinterFlowUnitTestLibrary.WinterFlowArrayHelper(winterFlowRequestComponent);
                        winterFlowRequestComponent.WinterFlowResolverController = winterFlowRepositoryFramework;
                    }
                    ArrayList arrayList = (ArrayList) winterFlowRepositoryFramework.WinterFlowArrayNetwork;
                    if (winterFlowStackUI instanceof WinterFlowUserManagerWorker) {
                        arrayList.add(winterFlowStackUI);
                    } else if (winterFlowStackUI instanceof WinterFlowBandwidthModule) {
                        arrayList.remove(((WinterFlowBandwidthModule) winterFlowStackUI).WinterFlowRouterStructure);
                    } else if (winterFlowStackUI instanceof WinterFlowArrayTesting) {
                        arrayList.add(winterFlowStackUI);
                    } else if (winterFlowStackUI instanceof WinterFlowUINetwork) {
                        arrayList.remove(((WinterFlowUINetwork) winterFlowStackUI).WinterFlowRouterStructure);
                    } else if (winterFlowStackUI instanceof WinterFlowCompilerWorker) {
                        arrayList.add(winterFlowStackUI);
                    } else if (winterFlowStackUI instanceof WinterFlowExceptionManager) {
                        arrayList.remove(((WinterFlowExceptionManager) winterFlowStackUI).WinterFlowRouterStructure);
                    } else if (winterFlowStackUI instanceof WinterFlowAPISubsystem) {
                        arrayList.remove(((WinterFlowAPISubsystem) winterFlowStackUI).WinterFlowRouterStructure);
                    }
                    WinterFlowStackUI winterFlowStackUI2 = (WinterFlowStackUI) WinterFlowSerializerUtility.WinterFlowModuleService(arrayList);
                    if (!WinterFlowManagerRequest.WinterFlowThreadListener((WinterFlowStackUI) winterFlowRepositoryFramework.WinterFlowVariableVersionControl, winterFlowStackUI2)) {
                        if (winterFlowStackUI2 != null) {
                            ((WinterFlowBatchFramework) winterFlowRepositoryFramework.WinterFlowHookDataSource).WinterFlowRouterStructure();
                            boolean z3 = winterFlowStackUI2 instanceof WinterFlowUserManagerWorker;
                            if (z3) {
                                f = 0.08f;
                            } else if (winterFlowStackUI2 instanceof WinterFlowArrayTesting) {
                                f = 0.1f;
                            } else if (winterFlowStackUI2 instanceof WinterFlowCompilerWorker) {
                                f = 0.16f;
                            }
                            WinterFlowManagerService winterFlowManagerService = WinterFlowCompilerValidator.WinterFlowRouterStructure;
                            if (!z3) {
                                if (winterFlowStackUI2 instanceof WinterFlowArrayTesting) {
                                    winterFlowManagerService = new WinterFlowManagerService(45, 0, WinterFlowServerComponent.WinterFlowHookDataSource);
                                } else if (winterFlowStackUI2 instanceof WinterFlowCompilerWorker) {
                                    winterFlowManagerService = new WinterFlowManagerService(45, 0, WinterFlowServerComponent.WinterFlowHookDataSource);
                                }
                            }
                            WinterFlowCacheRuntime.WinterFlowStrategyTool(winterFlowAdapterResponse, null, new WinterFlowWorkerJSON(winterFlowRepositoryFramework, f, winterFlowManagerService, (WinterFlowTransactionManagerLayer) null), 3);
                        } else {
                            WinterFlowStackUI winterFlowStackUI3 = (WinterFlowStackUI) winterFlowRepositoryFramework.WinterFlowVariableVersionControl;
                            WinterFlowManagerService winterFlowManagerService2 = WinterFlowCompilerValidator.WinterFlowRouterStructure;
                            if (!(winterFlowStackUI3 instanceof WinterFlowUserManagerWorker) && !(winterFlowStackUI3 instanceof WinterFlowArrayTesting) && (winterFlowStackUI3 instanceof WinterFlowCompilerWorker)) {
                                winterFlowManagerService2 = new WinterFlowManagerService(150, 0, WinterFlowServerComponent.WinterFlowHookDataSource);
                            }
                            WinterFlowCacheRuntime.WinterFlowStrategyTool(winterFlowAdapterResponse, null, new WinterFlowModuleStack(winterFlowRepositoryFramework, winterFlowManagerService2, winterFlowTransactionManagerLayer2, 29), 3);
                        }
                        winterFlowRepositoryFramework.WinterFlowVariableVersionControl = winterFlowStackUI2;
                    }
                } else if (winterFlowRequestComponent.WinterFlowEventEmitterController) {
                    winterFlowRequestComponent.WinterFlowValidatorNetwork((WinterFlowConcurrencyTransactionManager) winterFlowStackUI);
                } else {
                    winterFlowRequestComponent.WinterFlowArrayHelper.WinterFlowRouterStructure(winterFlowStackUI);
                }
                return winterFlowAlgorithmSession;
        }
    }

    public /* synthetic */ WinterFlowEncryptionEngine(int i, Object obj, Object obj2) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowUnitTestResponse = obj;
        this.WinterFlowTransactionManagerStrategy = obj2;
    }

    public WinterFlowEncryptionEngine(WinterFlowEventEvent winterFlowEventEvent, WinterFlowBandwidthCache winterFlowBandwidthCache) {
        this.WinterFlowVariableVersionControl = 2;
        this.WinterFlowTransactionManagerStrategy = winterFlowEventEvent;
        this.WinterFlowUnitTestResponse = winterFlowBandwidthCache;
    }
}
