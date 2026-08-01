package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowExceptionBackend extends WinterFlowDebugFramework implements WinterFlowEventEvent {
    public static final WinterFlowExceptionBackend WinterFlowArrayHelper;
    public static final WinterFlowExceptionBackend WinterFlowBackendCacheManager;
    public static final WinterFlowExceptionBackend WinterFlowBandwidthObject;
    public static final WinterFlowExceptionBackend WinterFlowBatchUI;
    public static final WinterFlowExceptionBackend WinterFlowCacheManagerListener;
    public static final WinterFlowExceptionBackend WinterFlowCompilerVariable;
    public static final WinterFlowExceptionBackend WinterFlowConcurrencyThread;
    public static final WinterFlowExceptionBackend WinterFlowConfigurationSubsystem;
    public static final WinterFlowExceptionBackend WinterFlowConsumerUserManager;
    public static final WinterFlowExceptionBackend WinterFlowEventEmitterController;
    public static final WinterFlowExceptionBackend WinterFlowMapperProtocol;
    public static final WinterFlowExceptionBackend WinterFlowOrchestrationSubsystem;
    public static final WinterFlowExceptionBackend WinterFlowPackageIDE;
    public static final WinterFlowExceptionBackend WinterFlowResolverController;
    public static final WinterFlowExceptionBackend WinterFlowResponseEngine;
    public static final WinterFlowExceptionBackend WinterFlowRouterAdapter;
    public static final WinterFlowExceptionBackend WinterFlowRouterRouter;
    public static final WinterFlowExceptionBackend WinterFlowSerializerStructure;
    public static final WinterFlowExceptionBackend WinterFlowServerProtocol;
    public static final WinterFlowExceptionBackend WinterFlowServiceUtility;
    public static final WinterFlowExceptionBackend WinterFlowSingletonPlatform;
    public static final WinterFlowExceptionBackend WinterFlowSoftwareEngine;
    public static final WinterFlowExceptionBackend WinterFlowSoftwareProtocol;
    public static final WinterFlowExceptionBackend WinterFlowStrategyTool;
    public static final WinterFlowExceptionBackend WinterFlowSyntax;
    public static final WinterFlowExceptionBackend WinterFlowThreadListener;
    public static final WinterFlowExceptionBackend WinterFlowTransactionAgent;
    public static final WinterFlowExceptionBackend WinterFlowUnitTestResponse;
    public static final WinterFlowExceptionBackend WinterFlowUserManagerUserManager;
    public static final WinterFlowExceptionBackend WinterFlowVariableBandwidth;
    public final /* synthetic */ int WinterFlowTransactionManagerStrategy;

    static {
        int i = 2;
        WinterFlowUnitTestResponse = new WinterFlowExceptionBackend(i, 0);
        WinterFlowRouterRouter = new WinterFlowExceptionBackend(i, 1);
        WinterFlowSyntax = new WinterFlowExceptionBackend(i, 2);
        WinterFlowResponseEngine = new WinterFlowExceptionBackend(i, 3);
        WinterFlowTransactionAgent = new WinterFlowExceptionBackend(i, 4);
        WinterFlowServerProtocol = new WinterFlowExceptionBackend(i, 5);
        WinterFlowThreadListener = new WinterFlowExceptionBackend(i, 6);
        WinterFlowServiceUtility = new WinterFlowExceptionBackend(i, 7);
        WinterFlowBandwidthObject = new WinterFlowExceptionBackend(i, 8);
        WinterFlowOrchestrationSubsystem = new WinterFlowExceptionBackend(i, 9);
        WinterFlowConcurrencyThread = new WinterFlowExceptionBackend(i, 10);
        WinterFlowSingletonPlatform = new WinterFlowExceptionBackend(i, 11);
        WinterFlowVariableBandwidth = new WinterFlowExceptionBackend(i, 12);
        WinterFlowBatchUI = new WinterFlowExceptionBackend(i, 13);
        WinterFlowRouterAdapter = new WinterFlowExceptionBackend(i, 14);
        WinterFlowSerializerStructure = new WinterFlowExceptionBackend(i, 15);
        WinterFlowMapperProtocol = new WinterFlowExceptionBackend(i, 16);
        WinterFlowResolverController = new WinterFlowExceptionBackend(i, 17);
        WinterFlowConsumerUserManager = new WinterFlowExceptionBackend(i, 18);
        WinterFlowBackendCacheManager = new WinterFlowExceptionBackend(i, 19);
        WinterFlowEventEmitterController = new WinterFlowExceptionBackend(i, 20);
        WinterFlowArrayHelper = new WinterFlowExceptionBackend(i, 21);
        WinterFlowCompilerVariable = new WinterFlowExceptionBackend(i, 22);
        WinterFlowConfigurationSubsystem = new WinterFlowExceptionBackend(i, 23);
        WinterFlowStrategyTool = new WinterFlowExceptionBackend(i, 24);
        WinterFlowCacheManagerListener = new WinterFlowExceptionBackend(i, 25);
        WinterFlowPackageIDE = new WinterFlowExceptionBackend(i, 26);
        WinterFlowSoftwareProtocol = new WinterFlowExceptionBackend(i, 27);
        WinterFlowUserManagerUserManager = new WinterFlowExceptionBackend(i, 28);
        WinterFlowSoftwareEngine = new WinterFlowExceptionBackend(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WinterFlowExceptionBackend(int i, int i2) {
        super(i);
        this.WinterFlowTransactionManagerStrategy = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [com.google.android.datatransport.WinterFlowJSON] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [com.google.android.datatransport.WinterFlowJSON] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v31, types: [com.google.android.datatransport.WinterFlowUserManagerController] */
    /* JADX WARN: Type inference failed for: r9v35 */
    /* JADX WARN: Type inference failed for: r9v36, types: [com.google.android.datatransport.WinterFlowUserManagerController] */
    /* JADX WARN: Type inference failed for: r9v37, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v38 */
    /* JADX WARN: Type inference failed for: r9v39 */
    /* JADX WARN: Type inference failed for: r9v40 */
    /* JADX WARN: Type inference failed for: r9v41 */
    /* JADX WARN: Type inference failed for: r9v60 */
    /* JADX WARN: Type inference failed for: r9v61 */
    @Override // com.google.android.datatransport.WinterFlowEventEvent
    public final Object WinterFlowVariableVersionControl(Object obj, Object obj2) {
        int i = this.WinterFlowTransactionManagerStrategy;
        int i2 = 0;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowCacheRuntime.WinterFlowUIMiddleware((WinterFlowSchedulerStructure) obj).setUpdateBlock((WinterFlowObjectSession) obj2);
                return winterFlowAlgorithmSession;
            case 1:
                WinterFlowCacheRuntime.WinterFlowUIMiddleware((WinterFlowSchedulerStructure) obj).setReleaseBlock((WinterFlowObjectSession) obj2);
                return winterFlowAlgorithmSession;
            case 2:
                WinterFlowCacheRuntime.WinterFlowUIMiddleware((WinterFlowSchedulerStructure) obj).setModifier((WinterFlowMapperManager) obj2);
                return winterFlowAlgorithmSession;
            case 3:
                WinterFlowCacheRuntime.WinterFlowUIMiddleware((WinterFlowSchedulerStructure) obj).setDensity((WinterFlowConcurrencyParser) obj2);
                return winterFlowAlgorithmSession;
            case 4:
                WinterFlowCacheRuntime.WinterFlowUIMiddleware((WinterFlowSchedulerStructure) obj).setLifecycleOwner((WinterFlowDecoratorVersion) obj2);
                return winterFlowAlgorithmSession;
            case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                WinterFlowCacheRuntime.WinterFlowUIMiddleware((WinterFlowSchedulerStructure) obj).setSavedStateRegistryOwner((WinterFlowExceptionProxy) obj2);
                return winterFlowAlgorithmSession;
            case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                WinterFlowServiceProviderController WinterFlowUIMiddleware = WinterFlowCacheRuntime.WinterFlowUIMiddleware((WinterFlowSchedulerStructure) obj);
                int ordinal = ((WinterFlowCacheManagerConfiguration) obj2).ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        WinterFlowEventEmitterOrchestration.WinterFlowRouterStructure();
                        return null;
                    }
                    i2 = 1;
                }
                WinterFlowUIMiddleware.setLayoutDirection(i2);
                return winterFlowAlgorithmSession;
            case WinterFlowJSONLibrary.DOUBLE_FIELD_NUMBER /* 7 */:
                long j = ((WinterFlowJavaEntity) obj).WinterFlowRouterStructure;
                long j2 = ((WinterFlowJavaEntity) obj2).WinterFlowRouterStructure;
                Map map = WinterFlowThreadPoolDecorator.WinterFlowRouterStructure;
                return WinterFlowUnitTestLibrary.WinterFlowQueueService(1, new WinterFlowJavaEntity(4294967297L));
            case WinterFlowJSONLibrary.BYTES_FIELD_NUMBER /* 8 */:
                String str = (String) obj;
                WinterFlowDeserializationModule winterFlowDeserializationModule = (WinterFlowDeserializationModule) obj2;
                if (str.length() == 0) {
                    return winterFlowDeserializationModule.toString();
                }
                return str + ", " + winterFlowDeserializationModule;
            case 9:
                WinterFlowResolverLibrary winterFlowResolverLibrary = (WinterFlowResolverLibrary) obj;
                int intValue = ((Number) obj2).intValue();
                if (!winterFlowResolverLibrary.WinterFlowFrontendBackend(intValue & 1, (intValue & 3) != 2)) {
                    winterFlowResolverLibrary.WinterFlowQueueService();
                }
                return winterFlowAlgorithmSession;
            case 10:
                WinterFlowResolverLibrary winterFlowResolverLibrary2 = (WinterFlowResolverLibrary) obj;
                int intValue2 = ((Number) obj2).intValue();
                if (!winterFlowResolverLibrary2.WinterFlowFrontendBackend(intValue2 & 1, (intValue2 & 3) != 2)) {
                    winterFlowResolverLibrary2.WinterFlowQueueService();
                }
                return winterFlowAlgorithmSession;
            case 11:
                WinterFlowResolverLibrary winterFlowResolverLibrary3 = (WinterFlowResolverLibrary) obj;
                int intValue3 = ((Number) obj2).intValue();
                if (!winterFlowResolverLibrary3.WinterFlowFrontendBackend(intValue3 & 1, (intValue3 & 3) != 2)) {
                    winterFlowResolverLibrary3.WinterFlowQueueService();
                }
                return winterFlowAlgorithmSession;
            case 12:
                ((Number) obj2).intValue();
                ((WinterFlowSchedulerStructure) ((WinterFlowBandwidthAgent) obj)).getClass();
                return winterFlowAlgorithmSession;
            case 13:
                ((WinterFlowSchedulerStructure) ((WinterFlowBandwidthAgent) obj)).WinterFlowVariableInterface((WinterFlowWorkerModule) obj2);
                return winterFlowAlgorithmSession;
            case 14:
                ((WinterFlowSchedulerStructure) ((WinterFlowBandwidthAgent) obj)).WinterFlowAPIFrontend((WinterFlowMapperManager) obj2);
                return winterFlowAlgorithmSession;
            case 15:
                WinterFlowCacheHelper winterFlowCacheHelper = (WinterFlowCacheHelper) obj2;
                WinterFlowSchedulerStructure winterFlowSchedulerStructure = (WinterFlowSchedulerStructure) ((WinterFlowBandwidthAgent) obj);
                winterFlowSchedulerStructure.WinterFlowStrategyTool = winterFlowCacheHelper;
                WinterFlowExceptionStrategy winterFlowExceptionStrategy = winterFlowSchedulerStructure.WinterFlowUserManagerUserManager;
                WinterFlowPipelineHelper winterFlowPipelineHelper = WinterFlowBackendTransactionManager.WinterFlowRouterRouter;
                WinterFlowConfigurationProcess winterFlowConfigurationProcess = (WinterFlowConfigurationProcess) winterFlowCacheHelper;
                winterFlowConfigurationProcess.getClass();
                winterFlowSchedulerStructure.WinterFlowOrchestrationConfiguration((WinterFlowConcurrencyParser) WinterFlowQuerySyntax.WinterFlowConfigurationSubsystem(winterFlowConfigurationProcess, winterFlowPipelineHelper));
                WinterFlowConfigurationProcess winterFlowConfigurationProcess2 = (WinterFlowConfigurationProcess) winterFlowCacheHelper;
                WinterFlowCacheManagerConfiguration winterFlowCacheManagerConfiguration = (WinterFlowCacheManagerConfiguration) WinterFlowQuerySyntax.WinterFlowConfigurationSubsystem(winterFlowConfigurationProcess2, WinterFlowBackendTransactionManager.WinterFlowServiceUtility);
                if (winterFlowSchedulerStructure.WinterFlowCompilerVariable != winterFlowCacheManagerConfiguration) {
                    winterFlowSchedulerStructure.WinterFlowCompilerVariable = winterFlowCacheManagerConfiguration;
                    winterFlowSchedulerStructure.WinterFlowCompilerVariable();
                    WinterFlowSchedulerStructure WinterFlowVariableBandwidth2 = winterFlowSchedulerStructure.WinterFlowVariableBandwidth();
                    if (WinterFlowVariableBandwidth2 != null) {
                        WinterFlowVariableBandwidth2.WinterFlowEventEmitterController();
                    } else {
                        WinterFlowListenerService winterFlowListenerService = winterFlowSchedulerStructure.WinterFlowSingletonPlatform;
                        if (winterFlowListenerService != null) {
                            ((WinterFlowSyntaxTransactionManager) winterFlowListenerService).invalidate();
                        }
                    }
                    winterFlowSchedulerStructure.WinterFlowArrayHelper();
                    for (WinterFlowUserManagerController winterFlowUserManagerController = winterFlowExceptionStrategy.WinterFlowTransactionManagerStrategy; winterFlowUserManagerController != null; winterFlowUserManagerController = winterFlowUserManagerController.WinterFlowResponseEngine) {
                        winterFlowUserManagerController.WinterFlowStrategyHook();
                    }
                }
                winterFlowSchedulerStructure.WinterFlowBandwidth((WinterFlowInheritanceVariable) WinterFlowQuerySyntax.WinterFlowConfigurationSubsystem(winterFlowConfigurationProcess2, WinterFlowBackendTransactionManager.WinterFlowBatchUI));
                WinterFlowUserManagerController winterFlowUserManagerController2 = winterFlowExceptionStrategy.WinterFlowTransactionManagerStrategy;
                if ((winterFlowUserManagerController2.WinterFlowRouterRouter & 32768) != 0) {
                    while (winterFlowUserManagerController2 != null) {
                        if ((winterFlowUserManagerController2.WinterFlowUnitTestResponse & 32768) != 0) {
                            WinterFlowTestingEntity winterFlowTestingEntity = winterFlowUserManagerController2;
                            ?? r1 = 0;
                            while (winterFlowTestingEntity != 0) {
                                if (winterFlowTestingEntity instanceof WinterFlowProviderStructure) {
                                    WinterFlowUserManagerController winterFlowUserManagerController3 = ((WinterFlowUserManagerController) ((WinterFlowProviderStructure) winterFlowTestingEntity)).WinterFlowVariableVersionControl;
                                    if (winterFlowUserManagerController3.WinterFlowSingletonPlatform) {
                                        WinterFlowHookDeserialization.WinterFlowCacheManagerAgent(winterFlowUserManagerController3);
                                    } else {
                                        winterFlowUserManagerController3.WinterFlowServiceUtility = true;
                                    }
                                } else if ((winterFlowTestingEntity.WinterFlowUnitTestResponse & 32768) != 0 && (winterFlowTestingEntity instanceof WinterFlowTestingEntity)) {
                                    WinterFlowUserManagerController winterFlowUserManagerController4 = winterFlowTestingEntity.WinterFlowBatchUI;
                                    int i3 = 0;
                                    r1 = r1;
                                    winterFlowTestingEntity = winterFlowTestingEntity;
                                    while (winterFlowUserManagerController4 != null) {
                                        if ((winterFlowUserManagerController4.WinterFlowUnitTestResponse & 32768) != 0) {
                                            i3++;
                                            r1 = r1;
                                            if (i3 == 1) {
                                                winterFlowTestingEntity = winterFlowUserManagerController4;
                                            } else {
                                                if (r1 == 0) {
                                                    r1 = new WinterFlowJSON(new WinterFlowUserManagerController[16]);
                                                }
                                                if (winterFlowTestingEntity != 0) {
                                                    r1.WinterFlowHookDataSource(winterFlowTestingEntity);
                                                    winterFlowTestingEntity = 0;
                                                }
                                                r1.WinterFlowHookDataSource(winterFlowUserManagerController4);
                                            }
                                        }
                                        winterFlowUserManagerController4 = winterFlowUserManagerController4.WinterFlowResponseEngine;
                                        r1 = r1;
                                        winterFlowTestingEntity = winterFlowTestingEntity;
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                winterFlowTestingEntity = WinterFlowCloudStack.WinterFlowPackageIDE(r1);
                            }
                        }
                        if ((winterFlowUserManagerController2.WinterFlowRouterRouter & 32768) != 0) {
                            winterFlowUserManagerController2 = winterFlowUserManagerController2.WinterFlowResponseEngine;
                        }
                    }
                }
                return winterFlowAlgorithmSession;
            case 16:
                Collection collection = (List) obj;
                List list = (List) obj2;
                if (collection == null) {
                    collection = WinterFlowDataSourceEngine.WinterFlowVariableVersionControl;
                }
                return WinterFlowSerializerUtility.WinterFlowResolverListener(collection, list);
            case 17:
                return (WinterFlowManagerNode) obj;
            case 18:
                List list2 = (List) obj;
                List list3 = (List) obj2;
                if (list2 == null) {
                    return list3;
                }
                ArrayList arrayList = new ArrayList(list2);
                arrayList.addAll(list3);
                return arrayList;
            case 19:
                return (WinterFlowCacheManagerService) obj;
            case 20:
                return (WinterFlowScriptFramework) obj;
            case 21:
                return (WinterFlowAlgorithmSession) obj;
            case 22:
                return (WinterFlowAlgorithmSession) obj;
            case 23:
                throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
            case 24:
                return (WinterFlowAlgorithmSession) obj;
            case 25:
                throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
            case 26:
                WinterFlowQueueTransaction winterFlowQueueTransaction = (WinterFlowQueueTransaction) obj;
                ((WinterFlowQueueTransaction) obj2).getClass();
                return winterFlowQueueTransaction;
            case 27:
                return (WinterFlowVersionControlUtility) obj;
            case 28:
                return (String) obj;
            default:
                List list4 = (List) obj;
                List list5 = (List) obj2;
                if (list4 == null) {
                    return list5;
                }
                ArrayList arrayList2 = new ArrayList(list4);
                arrayList2.addAll(list5);
                return arrayList2;
        }
    }
}
