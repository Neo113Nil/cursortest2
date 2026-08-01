package com.google.android.datatransport;

import android.content.Context;
import android.graphics.Typeface;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowRouterCompiler implements WinterFlowObjectSession {
    public final /* synthetic */ Object WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ Object WinterFlowUnitTestResponse;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowRouterCompiler(int i, Object obj, Object obj2) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = obj;
        this.WinterFlowUnitTestResponse = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:158:0x06e3  */
    @Override // com.google.android.datatransport.WinterFlowObjectSession
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WinterFlowUnitTestResponse(Object obj) {
        WinterFlowServerPlatform winterFlowServerPlatform;
        Object winterFlowDataSourceService;
        Object WinterFlowUnitTestResponse;
        Object obj2;
        ArrayList arrayList;
        Typeface WinterFlowHookDataSource;
        WinterFlowDatabaseUtility WinterFlowUnitTestResponse2;
        int i = 3;
        final int i2 = 2;
        final int i3 = 1;
        switch (this.WinterFlowVariableVersionControl) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((WinterFlowJSONDecorator) this.WinterFlowTransactionManagerStrategy).WinterFlowBatchUI((WinterFlowJSONService) this.WinterFlowUnitTestResponse);
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            case 1:
                WinterFlowThreadPoolGateway winterFlowThreadPoolGateway = (WinterFlowThreadPoolGateway) this.WinterFlowTransactionManagerStrategy;
                WinterFlowConfigurationSubsystem winterFlowConfigurationSubsystem = (WinterFlowConfigurationSubsystem) this.WinterFlowUnitTestResponse;
                WinterFlowDatabaseSchemaStrategy winterFlowDatabaseSchemaStrategy = (WinterFlowDatabaseSchemaStrategy) obj;
                winterFlowDatabaseSchemaStrategy.getClass();
                List list = (List) winterFlowThreadPoolGateway.getValue();
                winterFlowDatabaseSchemaStrategy.WinterFlowRouterStructure(list.size(), new WinterFlowAlgorithmServer(r10 ? 1 : 0, new WinterFlowInterfaceSoftware(3), list), new WinterFlowServiceRouter(r10 ? 1 : 0, list), new WinterFlowEventTool(802480018, true, new WinterFlowFunctionScript(list, winterFlowConfigurationSubsystem)));
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            case 2:
                WinterFlowInterfaceProcess winterFlowInterfaceProcess = (WinterFlowInterfaceProcess) this.WinterFlowTransactionManagerStrategy;
                WinterFlowObjectConfiguration winterFlowObjectConfiguration = (WinterFlowObjectConfiguration) this.WinterFlowUnitTestResponse;
                WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                WinterFlowCompilerSubsystem winterFlowCompilerSubsystem = winterFlowInterfaceProcess.WinterFlowVariableBandwidth;
                if (winterFlowCompilerSubsystem != null) {
                    winterFlowCompilerSubsystem.WinterFlowHookDataSource();
                }
                winterFlowInterfaceProcess.WinterFlowVariableBandwidth = null;
                WinterFlowXMLPlatform winterFlowXMLPlatform = winterFlowObjectConfiguration.WinterFlowHookDataSource;
                if (winterFlowXMLPlatform != null) {
                    winterFlowXMLPlatform.WinterFlowCacheTool(winterFlowAlgorithmSession);
                }
                winterFlowObjectConfiguration.WinterFlowHookDataSource = null;
                return winterFlowAlgorithmSession;
            case 3:
                WinterFlowIDEOrchestration winterFlowIDEOrchestration = (WinterFlowIDEOrchestration) this.WinterFlowTransactionManagerStrategy;
                WinterFlowUnitTestRefactoring winterFlowUnitTestRefactoring = (WinterFlowUnitTestRefactoring) this.WinterFlowUnitTestResponse;
                winterFlowIDEOrchestration.WinterFlowRouterStructure(winterFlowUnitTestRefactoring);
                return new WinterFlowIDERepository(r10 ? 1 : 0, winterFlowIDEOrchestration, winterFlowUnitTestRefactoring);
            case 4:
                WinterFlowManagerCloud winterFlowManagerCloud = (WinterFlowManagerCloud) this.WinterFlowTransactionManagerStrategy;
                WinterFlowHandlerWebsocket winterFlowHandlerWebsocket = (WinterFlowHandlerWebsocket) this.WinterFlowUnitTestResponse;
                WinterFlowProtocolStrategy winterFlowProtocolStrategy = (WinterFlowProtocolStrategy) obj;
                winterFlowProtocolStrategy.WinterFlowRouterStructure();
                WinterFlowParserUserManager.WinterFlowStrategyTool(winterFlowProtocolStrategy, winterFlowManagerCloud, winterFlowHandlerWebsocket, 0.0f, null, 60);
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                WinterFlowServiceProviderJava winterFlowServiceProviderJava = (WinterFlowServiceProviderJava) this.WinterFlowTransactionManagerStrategy;
                WinterFlowHandlerWebsocket winterFlowHandlerWebsocket2 = (WinterFlowHandlerWebsocket) this.WinterFlowUnitTestResponse;
                WinterFlowProtocolStrategy winterFlowProtocolStrategy2 = (WinterFlowProtocolStrategy) obj;
                winterFlowProtocolStrategy2.WinterFlowRouterStructure();
                WinterFlowParserUserManager.WinterFlowStrategyTool(winterFlowProtocolStrategy2, winterFlowServiceProviderJava.WinterFlowThreadListener, winterFlowHandlerWebsocket2, 0.0f, null, 60);
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                ((WinterFlowRequestController) this.WinterFlowTransactionManagerStrategy).WinterFlowRouterStructure.WinterFlowResponseEngine((WinterFlowAlgorithmResolver) this.WinterFlowUnitTestResponse);
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            case WinterFlowJSONLibrary.DOUBLE_FIELD_NUMBER /* 7 */:
                WinterFlowServiceProviderAgent winterFlowServiceProviderAgent = (WinterFlowServiceProviderAgent) this.WinterFlowTransactionManagerStrategy;
                WinterFlowInterfaceProcessor winterFlowInterfaceProcessor = (WinterFlowInterfaceProcessor) this.WinterFlowUnitTestResponse;
                r10 = winterFlowInterfaceProcessor.WinterFlowVariableVersionControl || ((WinterFlowAdapterModule) obj).WinterFlowProxyStructure(winterFlowServiceProviderAgent);
                winterFlowInterfaceProcessor.WinterFlowVariableVersionControl = r10;
                return Boolean.valueOf(!r10);
            case WinterFlowJSONLibrary.BYTES_FIELD_NUMBER /* 8 */:
                WinterFlowObjectSystem winterFlowObjectSystem = (WinterFlowObjectSystem) this.WinterFlowTransactionManagerStrategy;
                WinterFlowInterfaceProcessor winterFlowInterfaceProcessor2 = (WinterFlowInterfaceProcessor) this.WinterFlowUnitTestResponse;
                boolean z = winterFlowInterfaceProcessor2.WinterFlowVariableVersionControl || ((WinterFlowAdapterModule) obj).WinterFlowArrayHelper(winterFlowObjectSystem);
                winterFlowInterfaceProcessor2.WinterFlowVariableVersionControl = z;
                return Boolean.valueOf(!z);
            case 9:
                ((WinterFlowJSONDecorator) this.WinterFlowTransactionManagerStrategy).WinterFlowBatchUI((WinterFlowStackUI) this.WinterFlowUnitTestResponse);
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            case 10:
                WinterFlowObjectUtility winterFlowObjectUtility = (WinterFlowObjectUtility) this.WinterFlowTransactionManagerStrategy;
                WinterFlowMapperParser winterFlowMapperParser = (WinterFlowMapperParser) this.WinterFlowUnitTestResponse;
                WinterFlowObjectSession winterFlowObjectSession = (WinterFlowObjectSession) obj;
                WinterFlowThreadProtocol winterFlowThreadProtocol = winterFlowObjectUtility.WinterFlowArrayNetwork;
                WinterFlowEventWorker winterFlowEventWorker = winterFlowObjectUtility.WinterFlowRouterStructure;
                WinterFlowCompilerCloud winterFlowCompilerCloud = winterFlowObjectUtility.WinterFlowTransactionManagerStrategy;
                WinterFlowRendererSystem winterFlowRendererSystem = winterFlowMapperParser.WinterFlowRouterStructure;
                if (winterFlowRendererSystem instanceof WinterFlowQueryProtocol) {
                    List list2 = ((WinterFlowQueryProtocol) winterFlowRendererSystem).WinterFlowUnitTestResponse;
                    WinterFlowObjectHook winterFlowObjectHook = winterFlowMapperParser.WinterFlowHookDataSource;
                    int i4 = winterFlowMapperParser.WinterFlowCacheManagerAgent;
                    ArrayList arrayList2 = new ArrayList(list2.size());
                    int size = list2.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        Object obj3 = list2.get(i5);
                        if (WinterFlowManagerRequest.WinterFlowThreadListener(((WinterFlowStrategyBackend) obj3).WinterFlowRouterStructure, winterFlowObjectHook) && i4 == 0) {
                            arrayList2.add(obj3);
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        ArrayList arrayList3 = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i6 = 0; i6 < size2; i6++) {
                            Object obj4 = list2.get(i6);
                            ((WinterFlowStrategyBackend) obj4).getClass();
                            if (i4 == 0) {
                                arrayList3.add(obj4);
                            }
                        }
                        if (!arrayList3.isEmpty()) {
                            list2 = arrayList3;
                        }
                        int compareTo = winterFlowObjectHook.compareTo(WinterFlowObjectHook.WinterFlowTransactionManagerStrategy);
                        int i7 = winterFlowObjectHook.WinterFlowVariableVersionControl;
                        if (compareTo < 0) {
                            int size3 = list2.size();
                            WinterFlowObjectHook winterFlowObjectHook2 = null;
                            WinterFlowObjectHook winterFlowObjectHook3 = null;
                            int i8 = 0;
                            while (true) {
                                if (i8 < size3) {
                                    WinterFlowObjectHook winterFlowObjectHook4 = ((WinterFlowStrategyBackend) list2.get(i8)).WinterFlowRouterStructure;
                                    int i9 = winterFlowObjectHook4.WinterFlowVariableVersionControl;
                                    if (WinterFlowManagerRequest.WinterFlowBatchUI(i9, i7) < 0) {
                                        if (winterFlowObjectHook2 == null || WinterFlowManagerRequest.WinterFlowBatchUI(i9, winterFlowObjectHook2.WinterFlowVariableVersionControl) > 0) {
                                            winterFlowObjectHook2 = winterFlowObjectHook4;
                                        }
                                    } else if (WinterFlowManagerRequest.WinterFlowBatchUI(i9, i7) <= 0) {
                                        winterFlowObjectHook2 = winterFlowObjectHook4;
                                        winterFlowObjectHook3 = winterFlowObjectHook2;
                                    } else if (winterFlowObjectHook3 == null || WinterFlowManagerRequest.WinterFlowBatchUI(i9, winterFlowObjectHook3.WinterFlowVariableVersionControl) < 0) {
                                        winterFlowObjectHook3 = winterFlowObjectHook4;
                                    }
                                    i8++;
                                }
                            }
                            if (winterFlowObjectHook2 == null) {
                                winterFlowObjectHook2 = winterFlowObjectHook3;
                            }
                            arrayList = new ArrayList(list2.size());
                            int size4 = list2.size();
                            for (int i10 = 0; i10 < size4; i10++) {
                                Object obj5 = list2.get(i10);
                                if (WinterFlowManagerRequest.WinterFlowThreadListener(((WinterFlowStrategyBackend) obj5).WinterFlowRouterStructure, winterFlowObjectHook2)) {
                                    arrayList.add(obj5);
                                }
                            }
                        } else {
                            WinterFlowObjectHook winterFlowObjectHook5 = WinterFlowObjectHook.WinterFlowUnitTestResponse;
                            if (winterFlowObjectHook.compareTo(winterFlowObjectHook5) > 0) {
                                int size5 = list2.size();
                                WinterFlowObjectHook winterFlowObjectHook6 = null;
                                WinterFlowObjectHook winterFlowObjectHook7 = null;
                                int i11 = 0;
                                while (true) {
                                    if (i11 < size5) {
                                        WinterFlowObjectHook winterFlowObjectHook8 = ((WinterFlowStrategyBackend) list2.get(i11)).WinterFlowRouterStructure;
                                        int i12 = winterFlowObjectHook8.WinterFlowVariableVersionControl;
                                        if (WinterFlowManagerRequest.WinterFlowBatchUI(i12, i7) < 0) {
                                            if (winterFlowObjectHook6 == null || WinterFlowManagerRequest.WinterFlowBatchUI(i12, winterFlowObjectHook6.WinterFlowVariableVersionControl) > 0) {
                                                winterFlowObjectHook6 = winterFlowObjectHook8;
                                            }
                                        } else if (WinterFlowManagerRequest.WinterFlowBatchUI(i12, i7) <= 0) {
                                            winterFlowObjectHook6 = winterFlowObjectHook8;
                                            winterFlowObjectHook7 = winterFlowObjectHook6;
                                        } else if (winterFlowObjectHook7 == null || WinterFlowManagerRequest.WinterFlowBatchUI(i12, winterFlowObjectHook7.WinterFlowVariableVersionControl) < 0) {
                                            winterFlowObjectHook7 = winterFlowObjectHook8;
                                        }
                                        i11++;
                                    }
                                }
                                if (winterFlowObjectHook7 != null) {
                                    winterFlowObjectHook6 = winterFlowObjectHook7;
                                }
                                arrayList2 = new ArrayList(list2.size());
                                int size6 = list2.size();
                                for (int i13 = 0; i13 < size6; i13++) {
                                    Object obj6 = list2.get(i13);
                                    if (WinterFlowManagerRequest.WinterFlowThreadListener(((WinterFlowStrategyBackend) obj6).WinterFlowRouterStructure, winterFlowObjectHook6)) {
                                        arrayList2.add(obj6);
                                    }
                                }
                            } else {
                                int size7 = list2.size();
                                WinterFlowObjectHook winterFlowObjectHook9 = null;
                                WinterFlowObjectHook winterFlowObjectHook10 = null;
                                int i14 = 0;
                                while (true) {
                                    if (i14 < size7) {
                                        WinterFlowObjectHook winterFlowObjectHook11 = ((WinterFlowStrategyBackend) list2.get(i14)).WinterFlowRouterStructure;
                                        if (WinterFlowManagerRequest.WinterFlowBatchUI(winterFlowObjectHook11.WinterFlowVariableVersionControl, winterFlowObjectHook5.WinterFlowVariableVersionControl) <= 0) {
                                            int i15 = winterFlowObjectHook11.WinterFlowVariableVersionControl;
                                            if (WinterFlowManagerRequest.WinterFlowBatchUI(i15, i7) < 0) {
                                                if (winterFlowObjectHook9 == null || WinterFlowManagerRequest.WinterFlowBatchUI(i15, winterFlowObjectHook9.WinterFlowVariableVersionControl) > 0) {
                                                    winterFlowObjectHook9 = winterFlowObjectHook11;
                                                }
                                            } else if (WinterFlowManagerRequest.WinterFlowBatchUI(i15, i7) <= 0) {
                                                winterFlowObjectHook9 = winterFlowObjectHook11;
                                                winterFlowObjectHook10 = winterFlowObjectHook9;
                                            } else if (winterFlowObjectHook10 == null || WinterFlowManagerRequest.WinterFlowBatchUI(i15, winterFlowObjectHook10.WinterFlowVariableVersionControl) < 0) {
                                                winterFlowObjectHook10 = winterFlowObjectHook11;
                                            }
                                        }
                                        i14++;
                                    }
                                }
                                if (winterFlowObjectHook10 != null) {
                                    winterFlowObjectHook9 = winterFlowObjectHook10;
                                }
                                arrayList = new ArrayList(list2.size());
                                int size8 = list2.size();
                                for (int i16 = 0; i16 < size8; i16++) {
                                    Object obj7 = list2.get(i16);
                                    if (WinterFlowManagerRequest.WinterFlowThreadListener(((WinterFlowStrategyBackend) obj7).WinterFlowRouterStructure, winterFlowObjectHook9)) {
                                        arrayList.add(obj7);
                                    }
                                }
                                if (arrayList.isEmpty()) {
                                    WinterFlowObjectHook winterFlowObjectHook12 = WinterFlowObjectHook.WinterFlowUnitTestResponse;
                                    int size9 = list2.size();
                                    int i17 = 0;
                                    WinterFlowObjectHook winterFlowObjectHook13 = null;
                                    WinterFlowObjectHook winterFlowObjectHook14 = null;
                                    while (true) {
                                        if (i17 < size9) {
                                            WinterFlowObjectHook winterFlowObjectHook15 = ((WinterFlowStrategyBackend) list2.get(i17)).WinterFlowRouterStructure;
                                            if (winterFlowObjectHook12 == null || WinterFlowManagerRequest.WinterFlowBatchUI(winterFlowObjectHook15.WinterFlowVariableVersionControl, winterFlowObjectHook12.WinterFlowVariableVersionControl) >= 0) {
                                                int i18 = winterFlowObjectHook15.WinterFlowVariableVersionControl;
                                                if (WinterFlowManagerRequest.WinterFlowBatchUI(i18, i7) < 0) {
                                                    if (winterFlowObjectHook13 == null || WinterFlowManagerRequest.WinterFlowBatchUI(i18, winterFlowObjectHook13.WinterFlowVariableVersionControl) > 0) {
                                                        winterFlowObjectHook13 = winterFlowObjectHook15;
                                                    }
                                                } else if (WinterFlowManagerRequest.WinterFlowBatchUI(i18, i7) <= 0) {
                                                    winterFlowObjectHook13 = winterFlowObjectHook15;
                                                    winterFlowObjectHook14 = winterFlowObjectHook13;
                                                } else if (winterFlowObjectHook14 == null || WinterFlowManagerRequest.WinterFlowBatchUI(i18, winterFlowObjectHook14.WinterFlowVariableVersionControl) < 0) {
                                                    winterFlowObjectHook14 = winterFlowObjectHook15;
                                                }
                                            }
                                            i17++;
                                        }
                                    }
                                    if (winterFlowObjectHook14 != null) {
                                        winterFlowObjectHook13 = winterFlowObjectHook14;
                                    }
                                    arrayList2 = new ArrayList(list2.size());
                                    int size10 = list2.size();
                                    for (int i19 = 0; i19 < size10; i19++) {
                                        Object obj8 = list2.get(i19);
                                        if (WinterFlowManagerRequest.WinterFlowThreadListener(((WinterFlowStrategyBackend) obj8).WinterFlowRouterStructure, winterFlowObjectHook13)) {
                                            arrayList2.add(obj8);
                                        }
                                    }
                                }
                            }
                        }
                        arrayList2 = arrayList;
                    }
                    WinterFlowObjectPackage winterFlowObjectPackage = winterFlowThreadProtocol.WinterFlowRouterStructure;
                    if (arrayList2.size() > 0) {
                        WinterFlowStrategyBackend winterFlowStrategyBackend = (WinterFlowStrategyBackend) arrayList2.get(0);
                        winterFlowStrategyBackend.getClass();
                        synchronized (((WinterFlowAlgorithmDebug) winterFlowObjectPackage.WinterFlowRouterRouter)) {
                            try {
                                WinterFlowInheritanceModule winterFlowInheritanceModule = new WinterFlowInheritanceModule(winterFlowStrategyBackend);
                                WinterFlowFunctionHandler winterFlowFunctionHandler = (WinterFlowFunctionHandler) ((WinterFlowThreadNode) winterFlowObjectPackage.WinterFlowTransactionManagerStrategy).WinterFlowCacheManagerAgent(winterFlowInheritanceModule);
                                if (winterFlowFunctionHandler == null) {
                                    winterFlowFunctionHandler = (WinterFlowFunctionHandler) ((WinterFlowDatabaseSchemaStructure) winterFlowObjectPackage.WinterFlowUnitTestResponse).WinterFlowUnitTestResponse(winterFlowInheritanceModule);
                                }
                                if (winterFlowFunctionHandler != null) {
                                    obj2 = winterFlowFunctionHandler.WinterFlowRouterStructure;
                                } else {
                                    try {
                                        Context context = winterFlowEventWorker.WinterFlowRouterStructure;
                                        WinterFlowUnitTestResponse = winterFlowStrategyBackend instanceof WinterFlowStrategyBackend ? WinterFlowQuerySyntax.WinterFlowPackageIDE(WinterFlowEncryptionSubsystem.WinterFlowUserManagerUserManager(winterFlowStrategyBackend, context), winterFlowStrategyBackend.WinterFlowHookDataSource, context) : null;
                                    } catch (Exception unused) {
                                        WinterFlowUnitTestResponse = winterFlowCompilerCloud.WinterFlowUnitTestResponse(winterFlowMapperParser);
                                    }
                                    winterFlowObjectPackage.getClass();
                                    WinterFlowInheritanceModule winterFlowInheritanceModule2 = new WinterFlowInheritanceModule(winterFlowStrategyBackend);
                                    synchronized (((WinterFlowAlgorithmDebug) winterFlowObjectPackage.WinterFlowRouterRouter)) {
                                        try {
                                            if (WinterFlowUnitTestResponse == null) {
                                                ((WinterFlowDatabaseSchemaStructure) winterFlowObjectPackage.WinterFlowUnitTestResponse).WinterFlowThreadListener(winterFlowInheritanceModule2, new WinterFlowFunctionHandler(null));
                                            } else {
                                                ((WinterFlowThreadNode) winterFlowObjectPackage.WinterFlowTransactionManagerStrategy).WinterFlowArrayNetwork(winterFlowInheritanceModule2, new WinterFlowFunctionHandler(WinterFlowUnitTestResponse));
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                    obj2 = WinterFlowUnitTestResponse;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        if (obj2 == null) {
                            obj2 = winterFlowCompilerCloud.WinterFlowUnitTestResponse(winterFlowMapperParser);
                        }
                        winterFlowServerPlatform = new WinterFlowServerPlatform(null, WinterFlowSoftwareException.WinterFlowOrchestrationConfiguration(winterFlowMapperParser.WinterFlowArrayNetwork, obj2, winterFlowStrategyBackend, winterFlowMapperParser.WinterFlowHookDataSource, winterFlowMapperParser.WinterFlowCacheManagerAgent));
                    } else {
                        winterFlowServerPlatform = new WinterFlowServerPlatform(null, winterFlowCompilerCloud.WinterFlowUnitTestResponse(winterFlowMapperParser));
                    }
                    List list3 = (List) winterFlowServerPlatform.WinterFlowVariableVersionControl;
                    Object obj9 = winterFlowServerPlatform.WinterFlowTransactionManagerStrategy;
                    if (list3 == null) {
                        winterFlowDataSourceService = new WinterFlowCacheNode(obj9, true);
                    } else {
                        WinterFlowCacheManagerAgent winterFlowCacheManagerAgent = new WinterFlowCacheManagerAgent(list3, obj9, winterFlowMapperParser, winterFlowThreadProtocol.WinterFlowRouterStructure, winterFlowObjectSession, winterFlowEventWorker);
                        WinterFlowCacheRuntime.WinterFlowStrategyTool(winterFlowThreadProtocol.WinterFlowHookDataSource, null, new WinterFlowGatewayWorker(winterFlowCacheManagerAgent, (WinterFlowTransactionManagerLayer) null, 3), 1);
                        winterFlowDataSourceService = new WinterFlowDataSourceService(winterFlowCacheManagerAgent);
                    }
                } else {
                    winterFlowDataSourceService = null;
                }
                if (winterFlowDataSourceService == null) {
                    WinterFlowRequestRouter winterFlowRequestRouter = (WinterFlowRequestRouter) winterFlowObjectUtility.WinterFlowVariableVersionControl.WinterFlowTransactionManagerStrategy;
                    WinterFlowRendererSystem winterFlowRendererSystem2 = winterFlowMapperParser.WinterFlowRouterStructure;
                    int i20 = winterFlowMapperParser.WinterFlowCacheManagerAgent;
                    WinterFlowObjectHook winterFlowObjectHook16 = winterFlowMapperParser.WinterFlowHookDataSource;
                    if (winterFlowRendererSystem2 == null || (winterFlowRendererSystem2 instanceof WinterFlowResponseDataSource)) {
                        WinterFlowHookDataSource = winterFlowRequestRouter.WinterFlowHookDataSource(winterFlowObjectHook16, i20);
                    } else if (winterFlowRendererSystem2 instanceof WinterFlowCacheManagerEngine) {
                        WinterFlowHookDataSource = winterFlowRequestRouter.WinterFlowUnitTestResponse((WinterFlowCacheManagerEngine) winterFlowRendererSystem2, winterFlowObjectHook16, i20);
                    } else {
                        winterFlowDataSourceService = null;
                        if (winterFlowDataSourceService == null) {
                            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Could not load font");
                            return null;
                        }
                    }
                    winterFlowDataSourceService = new WinterFlowCacheNode(WinterFlowHookDataSource, true);
                    if (winterFlowDataSourceService == null) {
                    }
                }
                return winterFlowDataSourceService;
            case 11:
                WinterFlowObjectHandler winterFlowObjectHandler = (WinterFlowObjectHandler) this.WinterFlowTransactionManagerStrategy;
                WinterFlowThreadPoolGateway winterFlowThreadPoolGateway2 = (WinterFlowThreadPoolGateway) this.WinterFlowUnitTestResponse;
                WinterFlowAlgorithmHandler winterFlowAlgorithmHandler = (WinterFlowAlgorithmHandler) obj;
                winterFlowAlgorithmHandler.getClass();
                winterFlowObjectHandler.WinterFlowSyntax(Float.intBitsToFloat((int) (4294967295L & winterFlowAlgorithmHandler.WinterFlowPackageIDE(0L))));
                float intBitsToFloat = Float.intBitsToFloat((int) (winterFlowAlgorithmHandler.WinterFlowPackageIDE(0L) >> 32));
                winterFlowThreadPoolGateway2.setValue(new WinterFlowArrayStructure(intBitsToFloat, ((int) (winterFlowAlgorithmHandler.WinterFlowCacheManagerListener() >> 32)) + intBitsToFloat));
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            case 12:
                WinterFlowWorkerTransaction winterFlowWorkerTransaction = (WinterFlowWorkerTransaction) this.WinterFlowTransactionManagerStrategy;
                WinterFlowDecoratorAdapter winterFlowDecoratorAdapter = (WinterFlowDecoratorAdapter) this.WinterFlowUnitTestResponse;
                ((WinterFlowConcurrencyParser) obj).getClass();
                int WinterFlowFrontendBackend = WinterFlowCloudStack.WinterFlowFrontendBackend(Float.intBitsToFloat((int) (winterFlowWorkerTransaction.WinterFlowVariableVersionControl >> 32)));
                WinterFlowConcurrencyParser winterFlowConcurrencyParser = winterFlowDecoratorAdapter.WinterFlowRouterStructure;
                return new WinterFlowValidatorTesting((WinterFlowCloudStack.WinterFlowFrontendBackend(Float.intBitsToFloat((int) (r6 & 4294967295L))) & 4294967295L) | (WinterFlowDecoratorUI.WinterFlowSyntax(WinterFlowFrontendBackend, 0, r1.WinterFlowUserManagerUserManager(WinterFlowHandlerConsumer.WinterFlowArrayNetwork(winterFlowDecoratorAdapter.WinterFlowHookDataSource) ? winterFlowConcurrencyParser.WinterFlowArrayFramework(WinterFlowHandlerConsumer.WinterFlowRouterRouter(r11)) : Float.POSITIVE_INFINITY) - r1.WinterFlowUserManagerUserManager(75.0f)) << 32));
            case 13:
                ((WinterFlowFrameworkNetwork) this.WinterFlowTransactionManagerStrategy).WinterFlowUnitTestResponse.removeCallbacks((WinterFlowValidatorSystem) this.WinterFlowUnitTestResponse);
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            case 14:
                WinterFlowFrontendMechanism winterFlowFrontendMechanism = (WinterFlowFrontendMechanism) this.WinterFlowTransactionManagerStrategy;
                String str = (String) this.WinterFlowUnitTestResponse;
                WinterFlowDataSourceSerializer winterFlowDataSourceSerializer = (WinterFlowDataSourceSerializer) obj;
                winterFlowDataSourceSerializer.WinterFlowCacheManagerAgent(WinterFlowFrontendMechanism.WinterFlowArrayNetwork, str);
                winterFlowFrontendMechanism.WinterFlowArrayNetwork(winterFlowDataSourceSerializer, str);
                return null;
            case 15:
                WinterFlowObjectUserManager winterFlowObjectUserManager = (WinterFlowObjectUserManager) this.WinterFlowTransactionManagerStrategy;
                Object obj10 = this.WinterFlowUnitTestResponse;
                winterFlowObjectUserManager.WinterFlowUnitTestResponse.WinterFlowSyntax(obj10);
                return new WinterFlowIDERepository(i2, winterFlowObjectUserManager, obj10);
            case 16:
                return new WinterFlowObjectUserManager((WinterFlowEncryptionComponent) this.WinterFlowTransactionManagerStrategy, (Map) obj, (WinterFlowRefactoringServer) this.WinterFlowUnitTestResponse);
            case 17:
                ((WinterFlowHookHelper) this.WinterFlowTransactionManagerStrategy).WinterFlowCacheManagerAgent.add(new WinterFlowServerStack(obj, (WinterFlowInvokerPlatform) this.WinterFlowUnitTestResponse));
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            case 18:
                Set set = (Set) this.WinterFlowTransactionManagerStrategy;
                WinterFlowHookHelper winterFlowHookHelper = (WinterFlowHookHelper) this.WinterFlowUnitTestResponse;
                if (set.contains(obj)) {
                    WinterFlowDatabaseSchemaStructure winterFlowDatabaseSchemaStructure = winterFlowHookHelper.WinterFlowHookDataSource;
                    WinterFlowCacheManagerTransactionManager winterFlowCacheManagerTransactionManager = winterFlowHookHelper.WinterFlowArrayNetwork;
                    Object WinterFlowUnitTestResponse3 = winterFlowDatabaseSchemaStructure.WinterFlowUnitTestResponse(obj);
                    if (WinterFlowUnitTestResponse3 != null) {
                        if (WinterFlowUnitTestResponse3 instanceof WinterFlowCacheManagerTransactionManager) {
                            WinterFlowCacheManagerTransactionManager winterFlowCacheManagerTransactionManager2 = (WinterFlowCacheManagerTransactionManager) WinterFlowUnitTestResponse3;
                            Object[] objArr = winterFlowCacheManagerTransactionManager2.WinterFlowHookDataSource;
                            long[] jArr = winterFlowCacheManagerTransactionManager2.WinterFlowRouterStructure;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i21 = 0;
                                while (true) {
                                    long j = jArr[i21];
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i22 = 8 - ((~(i21 - length)) >>> 31);
                                        for (int i23 = 0; i23 < i22; i23++) {
                                            if ((255 & j) < 128) {
                                                winterFlowCacheManagerTransactionManager.WinterFlowRouterStructure((WinterFlowInvokerPlatform) objArr[(i21 << 3) + i23]);
                                            }
                                            j >>= 8;
                                        }
                                        if (i22 != 8) {
                                        }
                                    }
                                    if (i21 != length) {
                                        i21++;
                                    }
                                }
                            }
                        } else {
                            winterFlowCacheManagerTransactionManager.WinterFlowRouterStructure((WinterFlowInvokerPlatform) WinterFlowUnitTestResponse3);
                        }
                    }
                }
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            case 19:
                WinterFlowServerLayer winterFlowServerLayer = (WinterFlowServerLayer) this.WinterFlowTransactionManagerStrategy;
                WinterFlowProcessorProtocol winterFlowProcessorProtocol = ((WinterFlowProtocolManager) this.WinterFlowUnitTestResponse).WinterFlowHookDataSource;
                WinterFlowUnitTestCacheManager winterFlowUnitTestCacheManager = (WinterFlowUnitTestCacheManager) obj;
                winterFlowUnitTestCacheManager.getClass();
                WinterFlowStrategyLayer winterFlowStrategyLayer = winterFlowUnitTestCacheManager.WinterFlowRouterStructure;
                winterFlowStrategyLayer.WinterFlowVariableVersionControl = 0;
                winterFlowStrategyLayer.WinterFlowTransactionManagerStrategy = 0;
                if (winterFlowServerLayer instanceof WinterFlowSerializerMicroservice) {
                    int i24 = WinterFlowServerLayer.WinterFlowSyntax;
                    Iterator it = WinterFlowHandlerWebsocket.WinterFlowMapperProtocol(winterFlowServerLayer).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            WinterFlowServerLayer winterFlowServerLayer2 = (WinterFlowServerLayer) it.next();
                            WinterFlowServerLayer WinterFlowTransactionManagerStrategy = winterFlowProcessorProtocol.WinterFlowTransactionManagerStrategy();
                            if (WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowServerLayer2, WinterFlowTransactionManagerStrategy != null ? WinterFlowTransactionManagerStrategy.WinterFlowUnitTestResponse : null)) {
                            }
                        } else {
                            int i25 = WinterFlowSerializerMicroservice.WinterFlowTransactionAgent;
                            WinterFlowSerializerMicroservice winterFlowSerializerMicroservice = winterFlowProcessorProtocol.WinterFlowCacheManagerAgent;
                            if (winterFlowSerializerMicroservice == null) {
                                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("You must call setGraph() before calling getGraph()");
                                return null;
                            }
                            Iterator it2 = WinterFlowFrontendSubsystem.WinterFlowServiceUtility(winterFlowSerializerMicroservice, new WinterFlowInterfaceSoftware(29)).iterator();
                            if (!it2.hasNext()) {
                                WinterFlowCompilerMechanism.WinterFlowSyntax("Sequence is empty.");
                                return null;
                            }
                            Object next = it2.next();
                            while (it2.hasNext()) {
                                next = it2.next();
                            }
                            winterFlowUnitTestCacheManager.WinterFlowHookDataSource = ((WinterFlowServerLayer) next).WinterFlowTransactionManagerStrategy.WinterFlowRouterStructure;
                            winterFlowUnitTestCacheManager.WinterFlowCacheManagerAgent = true;
                        }
                    }
                }
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            case 20:
                return new WinterFlowIDERepository(i, (WinterFlowBatchCacheManager) this.WinterFlowTransactionManagerStrategy, (WinterFlowCacheException) this.WinterFlowUnitTestResponse);
            case 21:
                WinterFlowProtocolManager winterFlowProtocolManager = (WinterFlowProtocolManager) this.WinterFlowTransactionManagerStrategy;
                WinterFlowDecoratorVersion winterFlowDecoratorVersion = (WinterFlowDecoratorVersion) this.WinterFlowUnitTestResponse;
                winterFlowProtocolManager.getClass();
                winterFlowDecoratorVersion.getClass();
                WinterFlowProcessorProtocol winterFlowProcessorProtocol2 = winterFlowProtocolManager.WinterFlowHookDataSource;
                WinterFlowXMLThread winterFlowXMLThread = winterFlowProcessorProtocol2.WinterFlowSingletonPlatform;
                if (!winterFlowDecoratorVersion.equals(winterFlowProcessorProtocol2.WinterFlowServiceUtility)) {
                    WinterFlowDecoratorVersion winterFlowDecoratorVersion2 = winterFlowProcessorProtocol2.WinterFlowServiceUtility;
                    if (winterFlowDecoratorVersion2 != null && (WinterFlowUnitTestResponse2 = winterFlowDecoratorVersion2.WinterFlowUnitTestResponse()) != null) {
                        WinterFlowUnitTestResponse2.WinterFlowTransactionManagerStrategy(winterFlowXMLThread);
                    }
                    winterFlowProcessorProtocol2.WinterFlowServiceUtility = winterFlowDecoratorVersion;
                    winterFlowDecoratorVersion.WinterFlowUnitTestResponse().WinterFlowRouterStructure(winterFlowXMLThread);
                }
                return new WinterFlowObjectProcessor(0);
            case 22:
                final WinterFlowProtocolManager winterFlowProtocolManager2 = (WinterFlowProtocolManager) this.WinterFlowTransactionManagerStrategy;
                final WinterFlowVersionControlTransactionManager winterFlowVersionControlTransactionManager = (WinterFlowVersionControlTransactionManager) this.WinterFlowUnitTestResponse;
                WinterFlowBatchOrchestration winterFlowBatchOrchestration = (WinterFlowBatchOrchestration) obj;
                winterFlowBatchOrchestration.getClass();
                final int i26 = r10 ? 1 : 0;
                WinterFlowQuerySyntax.WinterFlowRouterRouter(winterFlowBatchOrchestration, "MAIN", new WinterFlowEventTool(916929089, true, new WinterFlowVersionEngine() { // from class: com.google.android.datatransport.WinterFlowRequest
                    @Override // com.google.android.datatransport.WinterFlowVersionEngine
                    public final Object WinterFlowTransactionAgent(Object obj11, Object obj12, Object obj13, Object obj14) {
                        int i27 = i26;
                        WinterFlowAlgorithmSession winterFlowAlgorithmSession2 = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                        WinterFlowThreadPoolProcess winterFlowThreadPoolProcess = WinterFlowModuleModule.WinterFlowRouterStructure;
                        WinterFlowProtocolManager winterFlowProtocolManager3 = winterFlowProtocolManager2;
                        WinterFlowResolverLibrary winterFlowResolverLibrary = (WinterFlowResolverLibrary) obj13;
                        ((Integer) obj14).getClass();
                        ((WinterFlowRefactoringJSON) obj11).getClass();
                        ((WinterFlowLibrarySessionManager) obj12).getClass();
                        switch (i27) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                WinterFlowMicroserviceMechanism winterFlowMicroserviceMechanism = WinterFlowCacheRuntime.WinterFlowThreadListener;
                                boolean WinterFlowUnitTestResponse4 = winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowProtocolManager3);
                                Object WinterFlowSyntaxSubsystem = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
                                if (WinterFlowUnitTestResponse4 || WinterFlowSyntaxSubsystem == winterFlowThreadPoolProcess) {
                                    WinterFlowSyntaxSubsystem = new WinterFlowCompilerCloud(16, winterFlowProtocolManager3);
                                    winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem);
                                }
                                WinterFlowSoftwareException.WinterFlowRouterRouter(6, (WinterFlowObjectSession) WinterFlowSyntaxSubsystem, winterFlowResolverLibrary, winterFlowMicroserviceMechanism);
                                break;
                            default:
                                WinterFlowMicroserviceMechanism winterFlowMicroserviceMechanism2 = WinterFlowCacheRuntime.WinterFlowThreadListener;
                                boolean WinterFlowUnitTestResponse5 = winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowProtocolManager3);
                                Object WinterFlowSyntaxSubsystem2 = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
                                if (WinterFlowUnitTestResponse5 || WinterFlowSyntaxSubsystem2 == winterFlowThreadPoolProcess) {
                                    WinterFlowSyntaxSubsystem2 = new WinterFlowDataSourceCloud(winterFlowProtocolManager3, 5);
                                    winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem2);
                                }
                                WinterFlowManagerRequest.WinterFlowServerProtocol(winterFlowMicroserviceMechanism2, (WinterFlowObjectUI) WinterFlowSyntaxSubsystem2, winterFlowResolverLibrary, 6, 0);
                                break;
                        }
                        return winterFlowAlgorithmSession2;
                    }
                }));
                WinterFlowQuerySyntax.WinterFlowRouterRouter(winterFlowBatchOrchestration, "RULES", new WinterFlowEventTool(53406264, true, new WinterFlowVersionEngine() { // from class: com.google.android.datatransport.WinterFlowRequest
                    @Override // com.google.android.datatransport.WinterFlowVersionEngine
                    public final Object WinterFlowTransactionAgent(Object obj11, Object obj12, Object obj13, Object obj14) {
                        int i27 = i3;
                        WinterFlowAlgorithmSession winterFlowAlgorithmSession2 = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                        WinterFlowThreadPoolProcess winterFlowThreadPoolProcess = WinterFlowModuleModule.WinterFlowRouterStructure;
                        WinterFlowProtocolManager winterFlowProtocolManager3 = winterFlowProtocolManager2;
                        WinterFlowResolverLibrary winterFlowResolverLibrary = (WinterFlowResolverLibrary) obj13;
                        ((Integer) obj14).getClass();
                        ((WinterFlowRefactoringJSON) obj11).getClass();
                        ((WinterFlowLibrarySessionManager) obj12).getClass();
                        switch (i27) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                WinterFlowMicroserviceMechanism winterFlowMicroserviceMechanism = WinterFlowCacheRuntime.WinterFlowThreadListener;
                                boolean WinterFlowUnitTestResponse4 = winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowProtocolManager3);
                                Object WinterFlowSyntaxSubsystem = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
                                if (WinterFlowUnitTestResponse4 || WinterFlowSyntaxSubsystem == winterFlowThreadPoolProcess) {
                                    WinterFlowSyntaxSubsystem = new WinterFlowCompilerCloud(16, winterFlowProtocolManager3);
                                    winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem);
                                }
                                WinterFlowSoftwareException.WinterFlowRouterRouter(6, (WinterFlowObjectSession) WinterFlowSyntaxSubsystem, winterFlowResolverLibrary, winterFlowMicroserviceMechanism);
                                break;
                            default:
                                WinterFlowMicroserviceMechanism winterFlowMicroserviceMechanism2 = WinterFlowCacheRuntime.WinterFlowThreadListener;
                                boolean WinterFlowUnitTestResponse5 = winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowProtocolManager3);
                                Object WinterFlowSyntaxSubsystem2 = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
                                if (WinterFlowUnitTestResponse5 || WinterFlowSyntaxSubsystem2 == winterFlowThreadPoolProcess) {
                                    WinterFlowSyntaxSubsystem2 = new WinterFlowDataSourceCloud(winterFlowProtocolManager3, 5);
                                    winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem2);
                                }
                                WinterFlowManagerRequest.WinterFlowServerProtocol(winterFlowMicroserviceMechanism2, (WinterFlowObjectUI) WinterFlowSyntaxSubsystem2, winterFlowResolverLibrary, 6, 0);
                                break;
                        }
                        return winterFlowAlgorithmSession2;
                    }
                }));
                final int i27 = r10 ? 1 : 0;
                WinterFlowQuerySyntax.WinterFlowRouterRouter(winterFlowBatchOrchestration, "ARCHIVE", new WinterFlowEventTool(246337465, true, new WinterFlowVersionEngine() { // from class: com.google.android.datatransport.WinterFlowRepositoryModule
                    @Override // com.google.android.datatransport.WinterFlowVersionEngine
                    public final Object WinterFlowTransactionAgent(Object obj11, Object obj12, Object obj13, Object obj14) {
                        int i28 = i27;
                        WinterFlowAlgorithmSession winterFlowAlgorithmSession2 = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                        WinterFlowThreadPoolProcess winterFlowThreadPoolProcess = WinterFlowModuleModule.WinterFlowRouterStructure;
                        WinterFlowProtocolManager winterFlowProtocolManager3 = winterFlowProtocolManager2;
                        WinterFlowVersionControlTransactionManager winterFlowVersionControlTransactionManager2 = winterFlowVersionControlTransactionManager;
                        WinterFlowResolverLibrary winterFlowResolverLibrary = (WinterFlowResolverLibrary) obj13;
                        ((Integer) obj14).getClass();
                        ((WinterFlowRefactoringJSON) obj11).getClass();
                        ((WinterFlowLibrarySessionManager) obj12).getClass();
                        switch (i28) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                WinterFlowProviderCacheManager WinterFlowRouterStructure = WinterFlowUnitTestTool.WinterFlowRouterStructure(winterFlowResolverLibrary);
                                if (WinterFlowRouterStructure == null) {
                                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    break;
                                } else {
                                    WinterFlowConfigurationSubsystem winterFlowConfigurationSubsystem2 = (WinterFlowConfigurationSubsystem) WinterFlowConfigurationException.WinterFlowTransactionAgent(WinterFlowListenerProtocol.WinterFlowRouterStructure(WinterFlowConfigurationSubsystem.class), WinterFlowRouterStructure, winterFlowVersionControlTransactionManager2, WinterFlowMicroserviceWidget.WinterFlowArrayNetwork(WinterFlowRouterStructure), winterFlowResolverLibrary);
                                    WinterFlowMicroserviceMechanism winterFlowMicroserviceMechanism = WinterFlowCacheRuntime.WinterFlowThreadListener;
                                    boolean WinterFlowUnitTestResponse4 = winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowProtocolManager3);
                                    Object WinterFlowSyntaxSubsystem = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
                                    if (WinterFlowUnitTestResponse4 || WinterFlowSyntaxSubsystem == winterFlowThreadPoolProcess) {
                                        WinterFlowSyntaxSubsystem = new WinterFlowDataSourceCloud(winterFlowProtocolManager3, 3);
                                        winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem);
                                    }
                                    WinterFlowUnitTestLibrary.WinterFlowRouterStructure(winterFlowMicroserviceMechanism, winterFlowConfigurationSubsystem2, (WinterFlowObjectUI) WinterFlowSyntaxSubsystem, winterFlowResolverLibrary, 6);
                                    break;
                                }
                            case 1:
                                WinterFlowProviderCacheManager WinterFlowRouterStructure2 = WinterFlowUnitTestTool.WinterFlowRouterStructure(winterFlowResolverLibrary);
                                if (WinterFlowRouterStructure2 == null) {
                                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    break;
                                } else {
                                    WinterFlowSyntaxMechanism winterFlowSyntaxMechanism = (WinterFlowSyntaxMechanism) WinterFlowConfigurationException.WinterFlowTransactionAgent(WinterFlowListenerProtocol.WinterFlowRouterStructure(WinterFlowSyntaxMechanism.class), WinterFlowRouterStructure2, winterFlowVersionControlTransactionManager2, WinterFlowMicroserviceWidget.WinterFlowArrayNetwork(WinterFlowRouterStructure2), winterFlowResolverLibrary);
                                    WinterFlowMicroserviceMechanism winterFlowMicroserviceMechanism2 = WinterFlowCacheRuntime.WinterFlowThreadListener;
                                    boolean WinterFlowUnitTestResponse5 = winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowProtocolManager3);
                                    Object WinterFlowSyntaxSubsystem2 = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
                                    if (WinterFlowUnitTestResponse5 || WinterFlowSyntaxSubsystem2 == winterFlowThreadPoolProcess) {
                                        WinterFlowSyntaxSubsystem2 = new WinterFlowDataSourceCloud(winterFlowProtocolManager3, 2);
                                        winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem2);
                                    }
                                    WinterFlowManagerRequest.WinterFlowVariableVersionControl(winterFlowMicroserviceMechanism2, winterFlowSyntaxMechanism, (WinterFlowObjectUI) WinterFlowSyntaxSubsystem2, winterFlowResolverLibrary, 6);
                                    break;
                                }
                            default:
                                WinterFlowProviderCacheManager WinterFlowRouterStructure3 = WinterFlowUnitTestTool.WinterFlowRouterStructure(winterFlowResolverLibrary);
                                if (WinterFlowRouterStructure3 == null) {
                                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    break;
                                } else {
                                    WinterFlowObjectLayer winterFlowObjectLayer = (WinterFlowObjectLayer) WinterFlowConfigurationException.WinterFlowTransactionAgent(WinterFlowListenerProtocol.WinterFlowRouterStructure(WinterFlowObjectLayer.class), WinterFlowRouterStructure3, winterFlowVersionControlTransactionManager2, WinterFlowMicroserviceWidget.WinterFlowArrayNetwork(WinterFlowRouterStructure3), winterFlowResolverLibrary);
                                    WinterFlowMicroserviceMechanism winterFlowMicroserviceMechanism3 = WinterFlowCacheRuntime.WinterFlowThreadListener;
                                    boolean WinterFlowUnitTestResponse6 = winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowProtocolManager3);
                                    Object WinterFlowSyntaxSubsystem3 = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
                                    if (WinterFlowUnitTestResponse6 || WinterFlowSyntaxSubsystem3 == winterFlowThreadPoolProcess) {
                                        WinterFlowSyntaxSubsystem3 = new WinterFlowDataSourceCloud(winterFlowProtocolManager3, 4);
                                        winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem3);
                                    }
                                    WinterFlowManagerRequest.WinterFlowRouterRouter(winterFlowMicroserviceMechanism3, winterFlowObjectLayer, (WinterFlowObjectUI) WinterFlowSyntaxSubsystem3, winterFlowResolverLibrary, 6);
                                    break;
                                }
                        }
                        return null;
                    }
                }));
                WinterFlowQuerySyntax.WinterFlowRouterRouter(winterFlowBatchOrchestration, "DIFFICULTY", new WinterFlowEventTool(439268666, true, new WinterFlowVersionEngine() { // from class: com.google.android.datatransport.WinterFlowRepositoryModule
                    @Override // com.google.android.datatransport.WinterFlowVersionEngine
                    public final Object WinterFlowTransactionAgent(Object obj11, Object obj12, Object obj13, Object obj14) {
                        int i28 = i3;
                        WinterFlowAlgorithmSession winterFlowAlgorithmSession2 = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                        WinterFlowThreadPoolProcess winterFlowThreadPoolProcess = WinterFlowModuleModule.WinterFlowRouterStructure;
                        WinterFlowProtocolManager winterFlowProtocolManager3 = winterFlowProtocolManager2;
                        WinterFlowVersionControlTransactionManager winterFlowVersionControlTransactionManager2 = winterFlowVersionControlTransactionManager;
                        WinterFlowResolverLibrary winterFlowResolverLibrary = (WinterFlowResolverLibrary) obj13;
                        ((Integer) obj14).getClass();
                        ((WinterFlowRefactoringJSON) obj11).getClass();
                        ((WinterFlowLibrarySessionManager) obj12).getClass();
                        switch (i28) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                WinterFlowProviderCacheManager WinterFlowRouterStructure = WinterFlowUnitTestTool.WinterFlowRouterStructure(winterFlowResolverLibrary);
                                if (WinterFlowRouterStructure == null) {
                                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    break;
                                } else {
                                    WinterFlowConfigurationSubsystem winterFlowConfigurationSubsystem2 = (WinterFlowConfigurationSubsystem) WinterFlowConfigurationException.WinterFlowTransactionAgent(WinterFlowListenerProtocol.WinterFlowRouterStructure(WinterFlowConfigurationSubsystem.class), WinterFlowRouterStructure, winterFlowVersionControlTransactionManager2, WinterFlowMicroserviceWidget.WinterFlowArrayNetwork(WinterFlowRouterStructure), winterFlowResolverLibrary);
                                    WinterFlowMicroserviceMechanism winterFlowMicroserviceMechanism = WinterFlowCacheRuntime.WinterFlowThreadListener;
                                    boolean WinterFlowUnitTestResponse4 = winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowProtocolManager3);
                                    Object WinterFlowSyntaxSubsystem = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
                                    if (WinterFlowUnitTestResponse4 || WinterFlowSyntaxSubsystem == winterFlowThreadPoolProcess) {
                                        WinterFlowSyntaxSubsystem = new WinterFlowDataSourceCloud(winterFlowProtocolManager3, 3);
                                        winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem);
                                    }
                                    WinterFlowUnitTestLibrary.WinterFlowRouterStructure(winterFlowMicroserviceMechanism, winterFlowConfigurationSubsystem2, (WinterFlowObjectUI) WinterFlowSyntaxSubsystem, winterFlowResolverLibrary, 6);
                                    break;
                                }
                            case 1:
                                WinterFlowProviderCacheManager WinterFlowRouterStructure2 = WinterFlowUnitTestTool.WinterFlowRouterStructure(winterFlowResolverLibrary);
                                if (WinterFlowRouterStructure2 == null) {
                                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    break;
                                } else {
                                    WinterFlowSyntaxMechanism winterFlowSyntaxMechanism = (WinterFlowSyntaxMechanism) WinterFlowConfigurationException.WinterFlowTransactionAgent(WinterFlowListenerProtocol.WinterFlowRouterStructure(WinterFlowSyntaxMechanism.class), WinterFlowRouterStructure2, winterFlowVersionControlTransactionManager2, WinterFlowMicroserviceWidget.WinterFlowArrayNetwork(WinterFlowRouterStructure2), winterFlowResolverLibrary);
                                    WinterFlowMicroserviceMechanism winterFlowMicroserviceMechanism2 = WinterFlowCacheRuntime.WinterFlowThreadListener;
                                    boolean WinterFlowUnitTestResponse5 = winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowProtocolManager3);
                                    Object WinterFlowSyntaxSubsystem2 = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
                                    if (WinterFlowUnitTestResponse5 || WinterFlowSyntaxSubsystem2 == winterFlowThreadPoolProcess) {
                                        WinterFlowSyntaxSubsystem2 = new WinterFlowDataSourceCloud(winterFlowProtocolManager3, 2);
                                        winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem2);
                                    }
                                    WinterFlowManagerRequest.WinterFlowVariableVersionControl(winterFlowMicroserviceMechanism2, winterFlowSyntaxMechanism, (WinterFlowObjectUI) WinterFlowSyntaxSubsystem2, winterFlowResolverLibrary, 6);
                                    break;
                                }
                            default:
                                WinterFlowProviderCacheManager WinterFlowRouterStructure3 = WinterFlowUnitTestTool.WinterFlowRouterStructure(winterFlowResolverLibrary);
                                if (WinterFlowRouterStructure3 == null) {
                                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    break;
                                } else {
                                    WinterFlowObjectLayer winterFlowObjectLayer = (WinterFlowObjectLayer) WinterFlowConfigurationException.WinterFlowTransactionAgent(WinterFlowListenerProtocol.WinterFlowRouterStructure(WinterFlowObjectLayer.class), WinterFlowRouterStructure3, winterFlowVersionControlTransactionManager2, WinterFlowMicroserviceWidget.WinterFlowArrayNetwork(WinterFlowRouterStructure3), winterFlowResolverLibrary);
                                    WinterFlowMicroserviceMechanism winterFlowMicroserviceMechanism3 = WinterFlowCacheRuntime.WinterFlowThreadListener;
                                    boolean WinterFlowUnitTestResponse6 = winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowProtocolManager3);
                                    Object WinterFlowSyntaxSubsystem3 = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
                                    if (WinterFlowUnitTestResponse6 || WinterFlowSyntaxSubsystem3 == winterFlowThreadPoolProcess) {
                                        WinterFlowSyntaxSubsystem3 = new WinterFlowDataSourceCloud(winterFlowProtocolManager3, 4);
                                        winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem3);
                                    }
                                    WinterFlowManagerRequest.WinterFlowRouterRouter(winterFlowMicroserviceMechanism3, winterFlowObjectLayer, (WinterFlowObjectUI) WinterFlowSyntaxSubsystem3, winterFlowResolverLibrary, 6);
                                    break;
                                }
                        }
                        return null;
                    }
                }));
                WinterFlowQuerySyntax.WinterFlowRouterRouter(winterFlowBatchOrchestration, "GO", new WinterFlowEventTool(632199867, true, new WinterFlowVersionEngine() { // from class: com.google.android.datatransport.WinterFlowRepositoryModule
                    @Override // com.google.android.datatransport.WinterFlowVersionEngine
                    public final Object WinterFlowTransactionAgent(Object obj11, Object obj12, Object obj13, Object obj14) {
                        int i28 = i2;
                        WinterFlowAlgorithmSession winterFlowAlgorithmSession2 = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                        WinterFlowThreadPoolProcess winterFlowThreadPoolProcess = WinterFlowModuleModule.WinterFlowRouterStructure;
                        WinterFlowProtocolManager winterFlowProtocolManager3 = winterFlowProtocolManager2;
                        WinterFlowVersionControlTransactionManager winterFlowVersionControlTransactionManager2 = winterFlowVersionControlTransactionManager;
                        WinterFlowResolverLibrary winterFlowResolverLibrary = (WinterFlowResolverLibrary) obj13;
                        ((Integer) obj14).getClass();
                        ((WinterFlowRefactoringJSON) obj11).getClass();
                        ((WinterFlowLibrarySessionManager) obj12).getClass();
                        switch (i28) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                WinterFlowProviderCacheManager WinterFlowRouterStructure = WinterFlowUnitTestTool.WinterFlowRouterStructure(winterFlowResolverLibrary);
                                if (WinterFlowRouterStructure == null) {
                                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    break;
                                } else {
                                    WinterFlowConfigurationSubsystem winterFlowConfigurationSubsystem2 = (WinterFlowConfigurationSubsystem) WinterFlowConfigurationException.WinterFlowTransactionAgent(WinterFlowListenerProtocol.WinterFlowRouterStructure(WinterFlowConfigurationSubsystem.class), WinterFlowRouterStructure, winterFlowVersionControlTransactionManager2, WinterFlowMicroserviceWidget.WinterFlowArrayNetwork(WinterFlowRouterStructure), winterFlowResolverLibrary);
                                    WinterFlowMicroserviceMechanism winterFlowMicroserviceMechanism = WinterFlowCacheRuntime.WinterFlowThreadListener;
                                    boolean WinterFlowUnitTestResponse4 = winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowProtocolManager3);
                                    Object WinterFlowSyntaxSubsystem = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
                                    if (WinterFlowUnitTestResponse4 || WinterFlowSyntaxSubsystem == winterFlowThreadPoolProcess) {
                                        WinterFlowSyntaxSubsystem = new WinterFlowDataSourceCloud(winterFlowProtocolManager3, 3);
                                        winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem);
                                    }
                                    WinterFlowUnitTestLibrary.WinterFlowRouterStructure(winterFlowMicroserviceMechanism, winterFlowConfigurationSubsystem2, (WinterFlowObjectUI) WinterFlowSyntaxSubsystem, winterFlowResolverLibrary, 6);
                                    break;
                                }
                            case 1:
                                WinterFlowProviderCacheManager WinterFlowRouterStructure2 = WinterFlowUnitTestTool.WinterFlowRouterStructure(winterFlowResolverLibrary);
                                if (WinterFlowRouterStructure2 == null) {
                                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    break;
                                } else {
                                    WinterFlowSyntaxMechanism winterFlowSyntaxMechanism = (WinterFlowSyntaxMechanism) WinterFlowConfigurationException.WinterFlowTransactionAgent(WinterFlowListenerProtocol.WinterFlowRouterStructure(WinterFlowSyntaxMechanism.class), WinterFlowRouterStructure2, winterFlowVersionControlTransactionManager2, WinterFlowMicroserviceWidget.WinterFlowArrayNetwork(WinterFlowRouterStructure2), winterFlowResolverLibrary);
                                    WinterFlowMicroserviceMechanism winterFlowMicroserviceMechanism2 = WinterFlowCacheRuntime.WinterFlowThreadListener;
                                    boolean WinterFlowUnitTestResponse5 = winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowProtocolManager3);
                                    Object WinterFlowSyntaxSubsystem2 = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
                                    if (WinterFlowUnitTestResponse5 || WinterFlowSyntaxSubsystem2 == winterFlowThreadPoolProcess) {
                                        WinterFlowSyntaxSubsystem2 = new WinterFlowDataSourceCloud(winterFlowProtocolManager3, 2);
                                        winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem2);
                                    }
                                    WinterFlowManagerRequest.WinterFlowVariableVersionControl(winterFlowMicroserviceMechanism2, winterFlowSyntaxMechanism, (WinterFlowObjectUI) WinterFlowSyntaxSubsystem2, winterFlowResolverLibrary, 6);
                                    break;
                                }
                            default:
                                WinterFlowProviderCacheManager WinterFlowRouterStructure3 = WinterFlowUnitTestTool.WinterFlowRouterStructure(winterFlowResolverLibrary);
                                if (WinterFlowRouterStructure3 == null) {
                                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    break;
                                } else {
                                    WinterFlowObjectLayer winterFlowObjectLayer = (WinterFlowObjectLayer) WinterFlowConfigurationException.WinterFlowTransactionAgent(WinterFlowListenerProtocol.WinterFlowRouterStructure(WinterFlowObjectLayer.class), WinterFlowRouterStructure3, winterFlowVersionControlTransactionManager2, WinterFlowMicroserviceWidget.WinterFlowArrayNetwork(WinterFlowRouterStructure3), winterFlowResolverLibrary);
                                    WinterFlowMicroserviceMechanism winterFlowMicroserviceMechanism3 = WinterFlowCacheRuntime.WinterFlowThreadListener;
                                    boolean WinterFlowUnitTestResponse6 = winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowProtocolManager3);
                                    Object WinterFlowSyntaxSubsystem3 = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
                                    if (WinterFlowUnitTestResponse6 || WinterFlowSyntaxSubsystem3 == winterFlowThreadPoolProcess) {
                                        WinterFlowSyntaxSubsystem3 = new WinterFlowDataSourceCloud(winterFlowProtocolManager3, 4);
                                        winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem3);
                                    }
                                    WinterFlowManagerRequest.WinterFlowRouterRouter(winterFlowMicroserviceMechanism3, winterFlowObjectLayer, (WinterFlowObjectUI) WinterFlowSyntaxSubsystem3, winterFlowResolverLibrary, 6);
                                    break;
                                }
                        }
                        return null;
                    }
                }));
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            case 23:
                WinterFlowProtocolInheritance winterFlowProtocolInheritance = (WinterFlowProtocolInheritance) this.WinterFlowTransactionManagerStrategy;
                WinterFlowViewTesting winterFlowViewTesting = (WinterFlowViewTesting) this.WinterFlowUnitTestResponse;
                WinterFlowDecoratorSessionManager winterFlowDecoratorSessionManager = (WinterFlowDecoratorSessionManager) obj;
                long j2 = ((WinterFlowValidatorTesting) winterFlowProtocolInheritance.WinterFlowVariableBandwidth.WinterFlowUnitTestResponse(winterFlowDecoratorSessionManager)).WinterFlowRouterStructure;
                if (winterFlowProtocolInheritance.WinterFlowBatchUI) {
                    WinterFlowDecoratorSessionManager.WinterFlowVariableBandwidth(winterFlowDecoratorSessionManager, winterFlowViewTesting, (int) (j2 >> 32), (int) (j2 & 4294967295L));
                } else {
                    WinterFlowDecoratorSessionManager.WinterFlowBatchUI(winterFlowDecoratorSessionManager, winterFlowViewTesting, (int) (j2 >> 32), (int) (j2 & 4294967295L), null, 12);
                }
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            case 24:
                WinterFlowCacheVersion winterFlowCacheVersion = (WinterFlowCacheVersion) this.WinterFlowTransactionManagerStrategy;
                WinterFlowViewTesting winterFlowViewTesting2 = (WinterFlowViewTesting) this.WinterFlowUnitTestResponse;
                WinterFlowDecoratorSessionManager winterFlowDecoratorSessionManager2 = (WinterFlowDecoratorSessionManager) obj;
                boolean z2 = winterFlowCacheVersion.WinterFlowMapperProtocol;
                float f = winterFlowCacheVersion.WinterFlowVariableBandwidth;
                if (z2) {
                    WinterFlowDecoratorSessionManager.WinterFlowConcurrencyThread(winterFlowDecoratorSessionManager2, winterFlowViewTesting2, winterFlowDecoratorSessionManager2.WinterFlowUserManagerUserManager(f), winterFlowDecoratorSessionManager2.WinterFlowUserManagerUserManager(winterFlowCacheVersion.WinterFlowBatchUI));
                } else {
                    WinterFlowDecoratorSessionManager.WinterFlowSyntax(winterFlowDecoratorSessionManager2, winterFlowViewTesting2, winterFlowDecoratorSessionManager2.WinterFlowUserManagerUserManager(f), winterFlowDecoratorSessionManager2.WinterFlowUserManagerUserManager(winterFlowCacheVersion.WinterFlowBatchUI));
                }
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            case 25:
                WinterFlowIDEOrchestration winterFlowIDEOrchestration2 = (WinterFlowIDEOrchestration) this.WinterFlowTransactionManagerStrategy;
                WinterFlowDataSourceResolver winterFlowDataSourceResolver = (WinterFlowDataSourceResolver) this.WinterFlowUnitTestResponse;
                winterFlowIDEOrchestration2.WinterFlowRouterStructure(winterFlowDataSourceResolver);
                return new WinterFlowIDERepository(4, winterFlowIDEOrchestration2, winterFlowDataSourceResolver);
            case 26:
                WinterFlowTransactionBackend winterFlowTransactionBackend = (WinterFlowTransactionBackend) this.WinterFlowTransactionManagerStrategy;
                WinterFlowCacheManagerTransactionManager winterFlowCacheManagerTransactionManager3 = (WinterFlowCacheManagerTransactionManager) this.WinterFlowUnitTestResponse;
                winterFlowTransactionBackend.WinterFlowBackendCacheManager(obj);
                if (winterFlowCacheManagerTransactionManager3 != null) {
                    winterFlowCacheManagerTransactionManager3.WinterFlowRouterStructure(obj);
                }
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            case 27:
                WinterFlowBackendService winterFlowBackendService = (WinterFlowBackendService) this.WinterFlowTransactionManagerStrategy;
                Throwable th3 = (Throwable) this.WinterFlowUnitTestResponse;
                Throwable th4 = (Throwable) obj;
                synchronized (winterFlowBackendService.WinterFlowCacheManagerAgent) {
                    if (th3 == null) {
                        th3 = null;
                    } else if (th4 != null) {
                        try {
                            if (th4 instanceof CancellationException) {
                                th4 = null;
                            }
                            if (th4 != null) {
                                WinterFlowCloudStack.WinterFlowTransactionManagerStrategy(th3, th4);
                            }
                        } catch (Throwable th5) {
                            throw th5;
                        }
                    }
                    winterFlowBackendService.WinterFlowVariableVersionControl = th3;
                    WinterFlowHandlerPlatform winterFlowHandlerPlatform = winterFlowBackendService.WinterFlowRouterAdapter;
                    WinterFlowUserManagerSystem winterFlowUserManagerSystem = WinterFlowUserManagerSystem.WinterFlowVariableVersionControl;
                    winterFlowHandlerPlatform.getClass();
                    winterFlowHandlerPlatform.WinterFlowTransactionAgent(null, winterFlowUserManagerSystem);
                }
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            case 28:
                ((WinterFlowLoaderRenderer) this.WinterFlowTransactionManagerStrategy).WinterFlowRouterStructure.setValue(new WinterFlowStackNetwork((WinterFlowDatabaseCompiler) this.WinterFlowUnitTestResponse, (WinterFlowDatabaseCompiler) obj));
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            default:
                WinterFlowRendererClass winterFlowRendererClass = (WinterFlowRendererClass) this.WinterFlowTransactionManagerStrategy;
                WinterFlowTransactionManagerService winterFlowTransactionManagerService = (WinterFlowTransactionManagerService) this.WinterFlowUnitTestResponse;
                WinterFlowListenerTransaction winterFlowListenerTransaction = (WinterFlowListenerTransaction) obj;
                float f2 = winterFlowListenerTransaction.WinterFlowHookDataSource ? -1.0f : 1.0f;
                long j3 = winterFlowListenerTransaction.WinterFlowRouterStructure;
                winterFlowRendererClass.WinterFlowRouterStructure(1, WinterFlowHandlerResolver.WinterFlowTransactionManagerStrategy(winterFlowTransactionManagerService.WinterFlowArrayNetwork == WinterFlowBackendBatch.WinterFlowTransactionManagerStrategy ? WinterFlowHandlerResolver.WinterFlowRouterStructure(1, j3) : WinterFlowHandlerResolver.WinterFlowRouterStructure(2, j3), f2));
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        }
    }
}
