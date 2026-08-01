package com.google.android.datatransport;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Xml;
import com.adjust.sdk.Constants;
import com.icewinter.flow.winter.icecatch.R;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowUnitTestLibrary {
    public static final WinterFlowDebugDatabaseSchema[] WinterFlowConcurrencyThread;
    public static final WinterFlowDebugDatabaseSchema WinterFlowOrchestrationSubsystem;
    public static final WinterFlowCacheManagerVersionControl WinterFlowResponseEngine;
    public static final WinterFlowCacheManagerVersionControl WinterFlowServerProtocol;
    public static final WinterFlowCacheManagerVersionControl WinterFlowSyntax;
    public static final WinterFlowCacheManagerVersionControl WinterFlowThreadListener;
    public static final WinterFlowCacheManagerVersionControl WinterFlowTransactionAgent;
    public static final WinterFlowObjectPackage WinterFlowTransactionManagerStrategy;
    public static WinterFlowObjectPackage WinterFlowUnitTestResponse;
    public static WinterFlowPipelineVariable WinterFlowVariableVersionControl;
    public static final WinterFlowEventTool WinterFlowRouterStructure = new WinterFlowEventTool(-569919827, false, new WinterFlowHandlerTool(2));
    public static final WinterFlowEventTool WinterFlowHookDataSource = new WinterFlowEventTool(1267400228, false, new WinterFlowHandlerTool(3));
    public static final WinterFlowEventTool WinterFlowCacheManagerAgent = new WinterFlowEventTool(-738090651, false, new WinterFlowHandlerTool(4));
    public static final WinterFlowResolverNetwork WinterFlowArrayNetwork = new WinterFlowResolverNetwork(1.0f, 1.0f);
    public static final StackTraceElement[] WinterFlowRouterRouter = new StackTraceElement[0];
    public static final WinterFlowAlgorithmDebug WinterFlowServiceUtility = new WinterFlowAlgorithmDebug(24);
    public static final Object WinterFlowBandwidthObject = new Object();

    static {
        Object obj = null;
        WinterFlowTransactionManagerStrategy = new WinterFlowObjectPackage(obj, obj, obj, 17);
        int i = 1;
        WinterFlowSyntax = new WinterFlowCacheManagerVersionControl(i, new WinterFlowInvokerEngine(18), new WinterFlowSessionManagerAgent(12));
        WinterFlowResponseEngine = new WinterFlowCacheManagerVersionControl(i, new WinterFlowInvokerEngine(19), new WinterFlowSessionManagerAgent(13));
        WinterFlowTransactionAgent = new WinterFlowCacheManagerVersionControl(i, new WinterFlowInvokerEngine(20), new WinterFlowSessionManagerAgent(14));
        WinterFlowServerProtocol = new WinterFlowCacheManagerVersionControl(i, new WinterFlowInvokerEngine(21), new WinterFlowSessionManagerAgent(15));
        WinterFlowThreadListener = new WinterFlowCacheManagerVersionControl(i, new WinterFlowInvokerEngine(22), new WinterFlowSessionManagerAgent(16));
        WinterFlowDebugDatabaseSchema winterFlowDebugDatabaseSchema = new WinterFlowDebugDatabaseSchema("register", -1, 1L, true);
        WinterFlowOrchestrationSubsystem = winterFlowDebugDatabaseSchema;
        WinterFlowConcurrencyThread = new WinterFlowDebugDatabaseSchema[]{winterFlowDebugDatabaseSchema, new WinterFlowDebugDatabaseSchema("unregister", -1, 1L, true)};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void WinterFlowArrayHelper(WinterFlowManagerEncryption winterFlowManagerEncryption) {
        if (((WinterFlowUserManagerController) winterFlowManagerEncryption).WinterFlowVariableVersionControl.WinterFlowSingletonPlatform) {
            WinterFlowCloudStack.WinterFlowUserManagerUserManager(winterFlowManagerEncryption, 1).WinterFlowRendererPackage();
        }
    }

    public static final void WinterFlowArrayNetwork(WinterFlowCloudMicroservice winterFlowCloudMicroservice, WinterFlowObjectUI winterFlowObjectUI, WinterFlowObjectUI winterFlowObjectUI2, WinterFlowResolverLibrary winterFlowResolverLibrary, int i) {
        WinterFlowConfigurationRequest winterFlowConfigurationRequest;
        WinterFlowObjectUI winterFlowObjectUI3 = winterFlowObjectUI2;
        WinterFlowResolverLibrary winterFlowResolverLibrary2 = winterFlowResolverLibrary;
        winterFlowResolverLibrary2.WinterFlowFrameworkTransaction(-1666314702);
        int i2 = i | (winterFlowResolverLibrary2.WinterFlowVariableVersionControl(winterFlowCloudMicroservice) ? 4 : 2) | (winterFlowResolverLibrary2.WinterFlowUnitTestResponse(winterFlowObjectUI) ? 32 : 16) | (winterFlowResolverLibrary2.WinterFlowUnitTestResponse(winterFlowObjectUI3) ? 256 : 128);
        int i3 = 1;
        if (winterFlowResolverLibrary2.WinterFlowFrontendBackend(i2 & 1, (i2 & 147) != 146)) {
            WinterFlowMapperManager WinterFlowSingletonPlatform = WinterFlowManagerRequest.WinterFlowSingletonPlatform(WinterFlowCacheRuntime.WinterFlowSingletonPlatform(1.0f), WinterFlowRepositoryProxy.WinterFlowRouterStructure(14.0f));
            long WinterFlowHookDataSource2 = WinterFlowInheritanceSubsystem.WinterFlowHookDataSource(WinterFlowInheritanceSubsystem.WinterFlowHookDataSource, 0.5f);
            WinterFlowProcessorSessionManager winterFlowProcessorSessionManager = WinterFlowCacheRuntime.WinterFlowTransactionAgent;
            WinterFlowMapperManager WinterFlowSoftwareEngine = WinterFlowCacheRuntime.WinterFlowSoftwareEngine(WinterFlowSoftwareException.WinterFlowConcurrencyThread(WinterFlowSoftwareException.WinterFlowOrchestrationSubsystem(WinterFlowSingletonPlatform, WinterFlowHookDataSource2, winterFlowProcessorSessionManager), 1.0f, WinterFlowInheritanceSubsystem.WinterFlowHookDataSource(WinterFlowInvokerComponent.WinterFlowTransactionManagerStrategy(4284666621L), 0.4f), WinterFlowRepositoryProxy.WinterFlowRouterStructure(14.0f)), 12.0f);
            WinterFlowRendererCacheManager WinterFlowRouterStructure2 = WinterFlowWebsocketInheritance.WinterFlowRouterStructure(WinterFlowInvokerComponent.WinterFlowCacheManagerAgent, WinterFlowCacheUtility.WinterFlowConcurrencyThread, winterFlowResolverLibrary2, 48);
            int hashCode = Long.hashCode(winterFlowResolverLibrary2.WinterFlowConfiguration);
            WinterFlowConfigurationProcess WinterFlowTransactionAgent2 = winterFlowResolverLibrary2.WinterFlowTransactionAgent();
            WinterFlowMapperManager WinterFlowUserManagerUserManager = WinterFlowSoftwareException.WinterFlowUserManagerUserManager(winterFlowResolverLibrary2, WinterFlowSoftwareEngine);
            WinterFlowBandwidthAgent.WinterFlowCacheManagerAgent.getClass();
            WinterFlowConfigurationRequest winterFlowConfigurationRequest2 = WinterFlowEventEmitterDeserialization.WinterFlowHookDataSource;
            winterFlowResolverLibrary2.WinterFlowModuleAgent();
            if (winterFlowResolverLibrary2.WinterFlowProxyStructure) {
                winterFlowResolverLibrary2.WinterFlowResponseEngine(winterFlowConfigurationRequest2);
            } else {
                winterFlowResolverLibrary2.WinterFlowParserPipeline();
            }
            WinterFlowExceptionBackend winterFlowExceptionBackend = WinterFlowEventEmitterDeserialization.WinterFlowVariableVersionControl;
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend, winterFlowResolverLibrary2, WinterFlowRouterStructure2);
            WinterFlowExceptionBackend winterFlowExceptionBackend2 = WinterFlowEventEmitterDeserialization.WinterFlowArrayNetwork;
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend2, winterFlowResolverLibrary2, WinterFlowTransactionAgent2);
            Integer valueOf = Integer.valueOf(hashCode);
            WinterFlowExceptionBackend winterFlowExceptionBackend3 = WinterFlowEventEmitterDeserialization.WinterFlowTransactionManagerStrategy;
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend3, winterFlowResolverLibrary2, valueOf);
            WinterFlowServiceProviderBatch winterFlowServiceProviderBatch = WinterFlowEventEmitterDeserialization.WinterFlowUnitTestResponse;
            WinterFlowProtocolNetwork.WinterFlowRouterRouter(winterFlowResolverLibrary2, winterFlowServiceProviderBatch);
            WinterFlowExceptionBackend winterFlowExceptionBackend4 = WinterFlowEventEmitterDeserialization.WinterFlowCacheManagerAgent;
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend4, winterFlowResolverLibrary2, WinterFlowUserManagerUserManager);
            int i4 = winterFlowCloudMicroservice.WinterFlowArrayNetwork;
            int i5 = winterFlowCloudMicroservice.WinterFlowCacheManagerAgent;
            WinterFlowSoftwareSubsystem WinterFlowTestingNode = WinterFlowSoftwareException.WinterFlowTestingNode(i4, winterFlowResolverLibrary2, 0);
            WinterFlowValidatorComponent winterFlowValidatorComponent = WinterFlowValidatorComponent.WinterFlowRouterStructure;
            WinterFlowVariableVersionControl(WinterFlowTestingNode, WinterFlowCacheRuntime.WinterFlowConfiguration(winterFlowValidatorComponent, 60.0f), null, null, 0.0f, winterFlowResolverLibrary2, 440, 120);
            WinterFlowProtocolNetwork.WinterFlowRouterStructure(winterFlowResolverLibrary2, WinterFlowCacheRuntime.WinterFlowOrchestrationConfiguration(winterFlowValidatorComponent, 12.0f));
            WinterFlowHookServer winterFlowHookServer = new WinterFlowHookServer(1.0f, true);
            WinterFlowRepositoryObject WinterFlowRouterStructure3 = WinterFlowConsumerDataSource.WinterFlowRouterStructure(WinterFlowInvokerComponent.WinterFlowArrayNetwork, WinterFlowCacheUtility.WinterFlowSingletonPlatform, winterFlowResolverLibrary2, 0);
            int hashCode2 = Long.hashCode(winterFlowResolverLibrary2.WinterFlowConfiguration);
            WinterFlowConfigurationProcess WinterFlowTransactionAgent3 = winterFlowResolverLibrary2.WinterFlowTransactionAgent();
            WinterFlowMapperManager WinterFlowUserManagerUserManager2 = WinterFlowSoftwareException.WinterFlowUserManagerUserManager(winterFlowResolverLibrary2, winterFlowHookServer);
            winterFlowResolverLibrary2.WinterFlowModuleAgent();
            if (winterFlowResolverLibrary2.WinterFlowProxyStructure) {
                winterFlowConfigurationRequest = winterFlowConfigurationRequest2;
                winterFlowResolverLibrary2.WinterFlowResponseEngine(winterFlowConfigurationRequest);
            } else {
                winterFlowConfigurationRequest = winterFlowConfigurationRequest2;
                winterFlowResolverLibrary2.WinterFlowParserPipeline();
            }
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend, winterFlowResolverLibrary2, WinterFlowRouterStructure3);
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend2, winterFlowResolverLibrary2, WinterFlowTransactionAgent3);
            WinterFlowResolverBackend.WinterFlowConcurrencyThread(hashCode2, winterFlowResolverLibrary2, winterFlowExceptionBackend3, winterFlowResolverLibrary2, winterFlowServiceProviderBatch);
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend4, winterFlowResolverLibrary2, WinterFlowUserManagerUserManager2);
            String upperCase = winterFlowCloudMicroservice.WinterFlowHookDataSource.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            String WinterFlowMapperProtocol = WinterFlowHookModule.WinterFlowMapperProtocol(upperCase, "_", " ");
            long j = WinterFlowInheritanceSubsystem.WinterFlowCacheManagerAgent;
            long WinterFlowBatchUI = WinterFlowDecoratorUI.WinterFlowBatchUI(16);
            WinterFlowConfigurationRequest winterFlowConfigurationRequest3 = winterFlowConfigurationRequest;
            WinterFlowObjectHook winterFlowObjectHook = WinterFlowObjectHook.WinterFlowTransactionAgent;
            WinterFlowSingletonRuntime.WinterFlowHookDataSource(WinterFlowMapperProtocol, null, j, WinterFlowBatchUI, winterFlowObjectHook, 0L, null, 0L, 0, false, 0, 0, null, winterFlowResolverLibrary, 1597824, 262058);
            WinterFlowProtocolNetwork.WinterFlowRouterStructure(winterFlowResolverLibrary, WinterFlowCacheRuntime.WinterFlowArrayHelper(4.0f));
            String WinterFlowSyntax2 = i5 >= 0 ? WinterFlowResolverBackend.WinterFlowSyntax("+", i5) : String.valueOf(i5);
            WinterFlowSingletonRuntime.WinterFlowHookDataSource(WinterFlowSyntax2 + " ENERGY", null, WinterFlowInvokerComponent.WinterFlowTransactionManagerStrategy(i5 >= 0 ? 4283215696L : 4294198070L), WinterFlowDecoratorUI.WinterFlowBatchUI(14), WinterFlowObjectHook.WinterFlowResponseEngine, 0L, null, 0L, 0, false, 0, 0, null, winterFlowResolverLibrary, 1597440, 262058);
            winterFlowResolverLibrary.WinterFlowBandwidthObject(true);
            WinterFlowRendererCacheManager WinterFlowRouterStructure4 = WinterFlowWebsocketInheritance.WinterFlowRouterStructure(new WinterFlowThreadPoolCompiler(8.0f, new WinterFlowCompilerMechanism(i3)), WinterFlowCacheUtility.WinterFlowOrchestrationSubsystem, winterFlowResolverLibrary, 6);
            int hashCode3 = Long.hashCode(winterFlowResolverLibrary.WinterFlowConfiguration);
            WinterFlowConfigurationProcess WinterFlowTransactionAgent4 = winterFlowResolverLibrary.WinterFlowTransactionAgent();
            WinterFlowMapperManager WinterFlowUserManagerUserManager3 = WinterFlowSoftwareException.WinterFlowUserManagerUserManager(winterFlowResolverLibrary, winterFlowValidatorComponent);
            winterFlowResolverLibrary.WinterFlowModuleAgent();
            if (winterFlowResolverLibrary.WinterFlowProxyStructure) {
                winterFlowResolverLibrary.WinterFlowResponseEngine(winterFlowConfigurationRequest3);
            } else {
                winterFlowResolverLibrary.WinterFlowParserPipeline();
            }
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend, winterFlowResolverLibrary, WinterFlowRouterStructure4);
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend2, winterFlowResolverLibrary, WinterFlowTransactionAgent4);
            WinterFlowResolverBackend.WinterFlowConcurrencyThread(hashCode3, winterFlowResolverLibrary, winterFlowExceptionBackend3, winterFlowResolverLibrary, winterFlowServiceProviderBatch);
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend4, winterFlowResolverLibrary, WinterFlowUserManagerUserManager3);
            WinterFlowMapperManager WinterFlowResponseEngine2 = WinterFlowCloudStack.WinterFlowResponseEngine(WinterFlowServerManager.WinterFlowBackendCacheManager(WinterFlowCacheRuntime.WinterFlowOrchestrationConfiguration(WinterFlowCacheRuntime.WinterFlowArrayHelper(36.0f), 70.0f), WinterFlowSoftwareException.WinterFlowTestingNode(R.drawable.button, winterFlowResolverLibrary, 0), WinterFlowThreadConfiguration.WinterFlowCacheManagerAgent, 0.0f, 54), false, winterFlowObjectUI, 15);
            WinterFlowInvokerConsumer winterFlowInvokerConsumer = WinterFlowCacheUtility.WinterFlowTransactionAgent;
            WinterFlowWorkerModule WinterFlowCacheManagerAgent2 = WinterFlowLibrary.WinterFlowCacheManagerAgent(winterFlowInvokerConsumer, false);
            int hashCode4 = Long.hashCode(winterFlowResolverLibrary.WinterFlowConfiguration);
            WinterFlowConfigurationProcess WinterFlowTransactionAgent5 = winterFlowResolverLibrary.WinterFlowTransactionAgent();
            WinterFlowMapperManager WinterFlowUserManagerUserManager4 = WinterFlowSoftwareException.WinterFlowUserManagerUserManager(winterFlowResolverLibrary, WinterFlowResponseEngine2);
            winterFlowResolverLibrary.WinterFlowModuleAgent();
            if (winterFlowResolverLibrary.WinterFlowProxyStructure) {
                winterFlowResolverLibrary.WinterFlowResponseEngine(winterFlowConfigurationRequest3);
            } else {
                winterFlowResolverLibrary.WinterFlowParserPipeline();
            }
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend, winterFlowResolverLibrary, WinterFlowCacheManagerAgent2);
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend2, winterFlowResolverLibrary, WinterFlowTransactionAgent5);
            WinterFlowResolverBackend.WinterFlowConcurrencyThread(hashCode4, winterFlowResolverLibrary, winterFlowExceptionBackend3, winterFlowResolverLibrary, winterFlowServiceProviderBatch);
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend4, winterFlowResolverLibrary, WinterFlowUserManagerUserManager4);
            WinterFlowSingletonRuntime.WinterFlowHookDataSource("EAT", null, j, WinterFlowDecoratorUI.WinterFlowBatchUI(12), winterFlowObjectHook, 0L, null, 0L, 0, false, 0, 0, null, winterFlowResolverLibrary, 1597830, 262058);
            winterFlowResolverLibrary.WinterFlowBandwidthObject(true);
            WinterFlowMapperManager WinterFlowSingletonPlatform2 = WinterFlowManagerRequest.WinterFlowSingletonPlatform(WinterFlowCacheRuntime.WinterFlowOrchestrationConfiguration(WinterFlowCacheRuntime.WinterFlowArrayHelper(36.0f), 70.0f), WinterFlowRepositoryProxy.WinterFlowRouterStructure(6.0f));
            long j2 = WinterFlowInheritanceSubsystem.WinterFlowArrayNetwork;
            WinterFlowMapperManager WinterFlowResponseEngine3 = WinterFlowCloudStack.WinterFlowResponseEngine(WinterFlowSoftwareException.WinterFlowConcurrencyThread(WinterFlowSoftwareException.WinterFlowOrchestrationSubsystem(WinterFlowSingletonPlatform2, WinterFlowInheritanceSubsystem.WinterFlowHookDataSource(j2, 0.2f), winterFlowProcessorSessionManager), 1.0f, WinterFlowInheritanceSubsystem.WinterFlowHookDataSource(j2, 0.6f), WinterFlowRepositoryProxy.WinterFlowRouterStructure(6.0f)), false, winterFlowObjectUI2, 15);
            WinterFlowWorkerModule WinterFlowCacheManagerAgent3 = WinterFlowLibrary.WinterFlowCacheManagerAgent(winterFlowInvokerConsumer, false);
            int hashCode5 = Long.hashCode(winterFlowResolverLibrary.WinterFlowConfiguration);
            WinterFlowConfigurationProcess WinterFlowTransactionAgent6 = winterFlowResolverLibrary.WinterFlowTransactionAgent();
            WinterFlowMapperManager WinterFlowUserManagerUserManager5 = WinterFlowSoftwareException.WinterFlowUserManagerUserManager(winterFlowResolverLibrary, WinterFlowResponseEngine3);
            winterFlowResolverLibrary.WinterFlowModuleAgent();
            if (winterFlowResolverLibrary.WinterFlowProxyStructure) {
                winterFlowResolverLibrary.WinterFlowResponseEngine(winterFlowConfigurationRequest3);
            } else {
                winterFlowResolverLibrary.WinterFlowParserPipeline();
            }
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend, winterFlowResolverLibrary, WinterFlowCacheManagerAgent3);
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend2, winterFlowResolverLibrary, WinterFlowTransactionAgent6);
            WinterFlowResolverBackend.WinterFlowConcurrencyThread(hashCode5, winterFlowResolverLibrary, winterFlowExceptionBackend3, winterFlowResolverLibrary, winterFlowServiceProviderBatch);
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend4, winterFlowResolverLibrary, WinterFlowUserManagerUserManager5);
            winterFlowObjectUI3 = winterFlowObjectUI2;
            WinterFlowSingletonRuntime.WinterFlowHookDataSource("TRASH", null, j, WinterFlowDecoratorUI.WinterFlowBatchUI(12), winterFlowObjectHook, 0L, null, 0L, 0, false, 0, 0, null, winterFlowResolverLibrary, 1597830, 262058);
            winterFlowResolverLibrary2 = winterFlowResolverLibrary;
            winterFlowResolverLibrary2.WinterFlowBandwidthObject(true);
            winterFlowResolverLibrary2.WinterFlowBandwidthObject(true);
            winterFlowResolverLibrary2.WinterFlowBandwidthObject(true);
        } else {
            winterFlowResolverLibrary2.WinterFlowQueueService();
        }
        WinterFlowStackEngine WinterFlowConcurrencyThread2 = winterFlowResolverLibrary2.WinterFlowConcurrencyThread();
        if (WinterFlowConcurrencyThread2 != null) {
            WinterFlowConcurrencyThread2.WinterFlowArrayNetwork = new WinterFlowConsumerVersionControl(winterFlowCloudMicroservice, winterFlowObjectUI, winterFlowObjectUI3, i);
        }
    }

    public static final WinterFlowMapperManager WinterFlowBackendCacheManager(WinterFlowMapperManager winterFlowMapperManager, float f, float f2, float f3, float f4, long j, WinterFlowVersionControlUtility winterFlowVersionControlUtility, boolean z, long j2, long j3) {
        return winterFlowMapperManager.WinterFlowCacheManagerAgent(new WinterFlowSyntaxProtocol(f, f2, f3, f4, j, winterFlowVersionControlUtility, z, j2, j3));
    }

    public static void WinterFlowBandwidthObject(String str) {
        if (TextUtils.isEmpty(str)) {
            WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("Given String is empty or null");
        }
    }

    public static WinterFlowUserManagerResolver WinterFlowBatchUI() {
        return new WinterFlowUserManagerResolver(10);
    }

    public static WinterFlowResolverNetwork WinterFlowCacheManagerAgent() {
        return new WinterFlowResolverNetwork(1.0f, 1.0f);
    }

    public static List WinterFlowCacheManagerListener(Object obj) {
        List singletonList = Collections.singletonList(obj);
        singletonList.getClass();
        return singletonList;
    }

    public static void WinterFlowCacheTool(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(WinterFlowResolverBackend.WinterFlowResponseEngine(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        WinterFlowManagerRequest.WinterFlowTestingNode(classCastException, WinterFlowUnitTestLibrary.class.getName());
        throw classCastException;
    }

    public static final long WinterFlowCloudMicroservice(WinterFlowVersionParser winterFlowVersionParser) {
        float f = winterFlowVersionParser.WinterFlowCacheManagerAgent - winterFlowVersionParser.WinterFlowRouterStructure;
        float f2 = winterFlowVersionParser.WinterFlowArrayNetwork - winterFlowVersionParser.WinterFlowHookDataSource;
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static WinterFlowManagerService WinterFlowCompilerDataSource(int i, int i2, WinterFlowObjectNode winterFlowObjectNode) {
        int i3 = (i2 & 2) != 0 ? 0 : 90;
        if ((i2 & 4) != 0) {
            winterFlowObjectNode = WinterFlowServerComponent.WinterFlowRouterStructure;
        }
        return new WinterFlowManagerService(i, i3, winterFlowObjectNode);
    }

    public static List WinterFlowCompilerHandler(Resources resources, int i) {
        if (i == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (obtainTypedArray.getType(0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static final void WinterFlowCompilerVariable(WinterFlowNetwork winterFlowNetwork) {
        WinterFlowCloudStack.WinterFlowSyntaxSubsystem(winterFlowNetwork).WinterFlowCompilerVariable();
    }

    public static void WinterFlowConcurrencyThread(Object obj) {
        if (obj != null) {
            return;
        }
        WinterFlowCompilerMechanism.WinterFlowTransactionManagerStrategy("null reference");
    }

    public static void WinterFlowConfiguration(float[] fArr, float f, float f2) {
        if (fArr.length < 16) {
            return;
        }
        float f3 = (fArr[8] * 0.0f) + (fArr[4] * f2) + (fArr[0] * f) + fArr[12];
        float f4 = (fArr[9] * 0.0f) + (fArr[5] * f2) + (fArr[1] * f) + fArr[13];
        float f5 = (fArr[10] * 0.0f) + (fArr[6] * f2) + (fArr[2] * f) + fArr[14];
        float f6 = (fArr[11] * 0.0f) + (fArr[7] * f2) + (fArr[3] * f) + fArr[15];
        fArr[12] = f3;
        fArr[13] = f4;
        fArr[14] = f5;
        fArr[15] = f6;
    }

    public static final void WinterFlowConfigurationSubsystem(WinterFlowResolverLibrary winterFlowResolverLibrary, WinterFlowEventEvent winterFlowEventEvent) {
        winterFlowEventEvent.getClass();
        WinterFlowTransactionAgent(2, winterFlowEventEvent);
        winterFlowEventEvent.WinterFlowVariableVersionControl(winterFlowResolverLibrary, 1);
    }

    public static final WinterFlowMapperManager WinterFlowConsumerUserManager(WinterFlowObjectSession winterFlowObjectSession) {
        return new WinterFlowObjectGateway(winterFlowObjectSession);
    }

    public static WinterFlowMapperManager WinterFlowEventEmitterController(WinterFlowMapperManager winterFlowMapperManager, float f, float f2, float f3, WinterFlowVersionControlUtility winterFlowVersionControlUtility, int i) {
        float f4 = (i & 1) != 0 ? 1.0f : f;
        float f5 = (i & 2) != 0 ? 1.0f : f2;
        float f6 = (i & 4) != 0 ? 1.0f : f3;
        long j = WinterFlowServiceProviderSubsystem.WinterFlowHookDataSource;
        WinterFlowVersionControlUtility winterFlowVersionControlUtility2 = (i & 2048) != 0 ? WinterFlowCacheRuntime.WinterFlowTransactionAgent : winterFlowVersionControlUtility;
        boolean z = (i & 4096) == 0;
        long j2 = WinterFlowIDEListener.WinterFlowRouterStructure;
        return WinterFlowBackendCacheManager(winterFlowMapperManager, f4, f5, f6, 0.0f, j, winterFlowVersionControlUtility2, z, j2, j2);
    }

    public static final WinterFlowResolverCloud WinterFlowFrameworkTransaction(WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice, Object obj) {
        WinterFlowResolverCloud winterFlowResolverCloud = null;
        if ((winterFlowTransactionManagerLayer instanceof WinterFlowEventConfiguration) && winterFlowEncryptionMicroservice.WinterFlowConsumerUserManager(WinterFlowSyntaxInvoker.WinterFlowRouterRouter) != null) {
            WinterFlowEventConfiguration winterFlowEventConfiguration = (WinterFlowEventConfiguration) winterFlowTransactionManagerLayer;
            while (true) {
                if ((winterFlowEventConfiguration instanceof WinterFlowIDECompiler) || (winterFlowEventConfiguration = winterFlowEventConfiguration.WinterFlowTransactionManagerStrategy()) == null) {
                    break;
                }
                if (winterFlowEventConfiguration instanceof WinterFlowResolverCloud) {
                    winterFlowResolverCloud = (WinterFlowResolverCloud) winterFlowEventConfiguration;
                    break;
                }
            }
            if (winterFlowResolverCloud != null) {
                winterFlowResolverCloud.WinterFlowParserPipeline(winterFlowEncryptionMicroservice, obj);
            }
        }
        return winterFlowResolverCloud;
    }

    public static final void WinterFlowFrontendBackend(float[] fArr) {
        if (fArr.length < 16) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 1.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = 0.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 1.0f;
    }

    public static final WinterFlowServiceProviderUI WinterFlowHookDataSource(Context context) {
        float f = context.getResources().getConfiguration().fontScale;
        float f2 = context.getResources().getDisplayMetrics().density;
        WinterFlowVersionService WinterFlowRouterStructure2 = WinterFlowOrchestrationModule.WinterFlowRouterStructure(f);
        if (WinterFlowRouterStructure2 == null) {
            WinterFlowRouterStructure2 = new WinterFlowMicroserviceComponent(f);
        }
        return new WinterFlowServiceProviderUI(f2, f, WinterFlowRouterStructure2);
    }

    public static final WinterFlowEventCloud WinterFlowMapperProtocol(WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        Unsafe unsafe;
        WinterFlowEventCloud winterFlowEventCloud;
        WinterFlowEventCloud winterFlowEventCloud2;
        if (!(winterFlowTransactionManagerLayer instanceof WinterFlowScriptHelper)) {
            return new WinterFlowEventCloud(1, winterFlowTransactionManagerLayer);
        }
        WinterFlowScriptHelper winterFlowScriptHelper = (WinterFlowScriptHelper) winterFlowTransactionManagerLayer;
        WinterFlowJSONDecorator winterFlowJSONDecorator = WinterFlowCloudStack.WinterFlowHookDataSource;
        long j = WinterFlowScriptHelper.WinterFlowServerProtocol;
        loop0: while (true) {
            unsafe = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
            Object objectVolatile = unsafe.getObjectVolatile(winterFlowScriptHelper, j);
            winterFlowEventCloud = null;
            if (objectVolatile == null) {
                unsafe.putObjectVolatile(winterFlowScriptHelper, j, winterFlowJSONDecorator);
                winterFlowEventCloud2 = null;
                break;
            }
            if (objectVolatile instanceof WinterFlowEventCloud) {
                do {
                    unsafe = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
                    if (unsafe.compareAndSwapObject(winterFlowScriptHelper, WinterFlowScriptHelper.WinterFlowServerProtocol, objectVolatile, winterFlowJSONDecorator)) {
                        winterFlowEventCloud2 = (WinterFlowEventCloud) objectVolatile;
                        break loop0;
                    }
                } while (unsafe.getObjectVolatile(winterFlowScriptHelper, j) == objectVolatile);
            } else if (objectVolatile != winterFlowJSONDecorator && !(objectVolatile instanceof Throwable)) {
                WinterFlowCompilerMechanism.WinterFlowVariableVersionControl(objectVolatile, "Inconsistent state ");
                return null;
            }
        }
        if (winterFlowEventCloud2 != null) {
            long j2 = WinterFlowEventCloud.WinterFlowServerProtocol;
            Object objectVolatile2 = unsafe.getObjectVolatile(winterFlowEventCloud2, j2);
            if (!(objectVolatile2 instanceof WinterFlowSoftwareXML) || ((WinterFlowSoftwareXML) objectVolatile2).WinterFlowArrayNetwork == null) {
                unsafe.putIntVolatile(winterFlowEventCloud2, WinterFlowEventCloud.WinterFlowResponseEngine, 536870911);
                unsafe.putObjectVolatile(winterFlowEventCloud2, j2, WinterFlowBandwidthSubsystem.WinterFlowRouterStructure);
                winterFlowEventCloud = winterFlowEventCloud2;
            } else {
                winterFlowEventCloud2.WinterFlowBandwidthObject();
            }
            if (winterFlowEventCloud != null) {
                return winterFlowEventCloud;
            }
        }
        return new WinterFlowEventCloud(2, winterFlowTransactionManagerLayer);
    }

    public static final int WinterFlowOrchestrationConfiguration(float f, float[] fArr, int i) {
        float f2 = f >= 0.0f ? f : 0.0f;
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (Math.abs(f2 - f) > 1.05E-6f) {
            f2 = Float.NaN;
        }
        fArr[i] = f2;
        return !Float.isNaN(f2) ? 1 : 0;
    }

    public static void WinterFlowOrchestrationSubsystem(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject(str2);
        }
    }

    public static List WinterFlowPackageIDE(Object... objArr) {
        if (objArr.length <= 0) {
            return WinterFlowDataSourceEngine.WinterFlowVariableVersionControl;
        }
        List asList = Arrays.asList(objArr);
        asList.getClass();
        return asList;
    }

    public static void WinterFlowProxyStructure() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static WinterFlowSerializerProcess WinterFlowQueueService(int i, Object obj) {
        float f = (i & 2) != 0 ? 1500.0f : 400.0f;
        if ((i & 4) != 0) {
            obj = null;
        }
        return new WinterFlowSerializerProcess(f, obj);
    }

    public static final Object WinterFlowResolverController(WinterFlowDataSourceSerializer winterFlowDataSourceSerializer, WinterFlowNetworkFramework winterFlowNetworkFramework, Serializable serializable) {
        winterFlowDataSourceSerializer.getClass();
        winterFlowNetworkFramework.getClass();
        Object obj = winterFlowDataSourceSerializer.WinterFlowRouterStructure.get(winterFlowNetworkFramework);
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            obj = Arrays.copyOf(bArr, bArr.length);
        }
        return obj == null ? serializable : obj;
    }

    public static final void WinterFlowResponseEngine(WinterFlowTransactionVariable winterFlowTransactionVariable, WinterFlowAlgorithmArray winterFlowAlgorithmArray, WinterFlowDatabaseUtility winterFlowDatabaseUtility) {
        winterFlowAlgorithmArray.getClass();
        winterFlowDatabaseUtility.getClass();
        WinterFlowBatchManager winterFlowBatchManager = (WinterFlowBatchManager) winterFlowTransactionVariable.WinterFlowCacheManagerAgent("androidx.lifecycle.savedstate.vm.tag");
        if (winterFlowBatchManager == null || winterFlowBatchManager.WinterFlowUnitTestResponse) {
            return;
        }
        winterFlowBatchManager.WinterFlowRouterRouter(winterFlowAlgorithmArray, winterFlowDatabaseUtility);
        WinterFlowDatabaseProtocol winterFlowDatabaseProtocol = winterFlowDatabaseUtility.WinterFlowSyntax;
        if (winterFlowDatabaseProtocol == WinterFlowDatabaseProtocol.WinterFlowTransactionManagerStrategy || winterFlowDatabaseProtocol.compareTo(WinterFlowDatabaseProtocol.WinterFlowRouterRouter) >= 0) {
            winterFlowAlgorithmArray.WinterFlowConfigurationSubsystem();
        } else {
            winterFlowDatabaseUtility.WinterFlowRouterStructure(new WinterFlowQueryStructure(1, winterFlowDatabaseUtility, winterFlowAlgorithmArray));
        }
    }

    public static final WinterFlowEncryptionMicroservice WinterFlowRouterAdapter(WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice, WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice2, boolean z) {
        Boolean bool = Boolean.FALSE;
        int i = 9;
        boolean booleanValue = ((Boolean) winterFlowEncryptionMicroservice.WinterFlowServiceUtility(new WinterFlowHandlerTool(i), bool)).booleanValue();
        boolean booleanValue2 = ((Boolean) winterFlowEncryptionMicroservice2.WinterFlowServiceUtility(new WinterFlowHandlerTool(i), bool)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return winterFlowEncryptionMicroservice.WinterFlowOrchestrationSubsystem(winterFlowEncryptionMicroservice2);
        }
        WinterFlowHandlerTool winterFlowHandlerTool = new WinterFlowHandlerTool(7);
        WinterFlowEventEmitterPackage winterFlowEventEmitterPackage = WinterFlowEventEmitterPackage.WinterFlowVariableVersionControl;
        WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice3 = (WinterFlowEncryptionMicroservice) winterFlowEncryptionMicroservice.WinterFlowServiceUtility(winterFlowHandlerTool, winterFlowEventEmitterPackage);
        Object obj = winterFlowEncryptionMicroservice2;
        if (booleanValue2) {
            obj = winterFlowEncryptionMicroservice2.WinterFlowServiceUtility(new WinterFlowHandlerTool(8), winterFlowEventEmitterPackage);
        }
        return winterFlowEncryptionMicroservice3.WinterFlowOrchestrationSubsystem((WinterFlowEncryptionMicroservice) obj);
    }

    public static ArrayList WinterFlowRouterRouter(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new WinterFlowRefactoringInterface(objArr));
    }

    public static final void WinterFlowRouterStructure(WinterFlowMapperManager winterFlowMapperManager, WinterFlowConfigurationSubsystem winterFlowConfigurationSubsystem, WinterFlowObjectUI winterFlowObjectUI, WinterFlowResolverLibrary winterFlowResolverLibrary, int i) {
        WinterFlowConfigurationSubsystem winterFlowConfigurationSubsystem2;
        WinterFlowConfigurationRequest winterFlowConfigurationRequest;
        WinterFlowResolverLibrary winterFlowResolverLibrary2 = winterFlowResolverLibrary;
        winterFlowConfigurationSubsystem.getClass();
        winterFlowObjectUI.getClass();
        winterFlowResolverLibrary2.WinterFlowFrameworkTransaction(106008704);
        int i2 = i | (winterFlowResolverLibrary2.WinterFlowVariableVersionControl(winterFlowConfigurationSubsystem) ? 32 : 16) | (winterFlowResolverLibrary2.WinterFlowUnitTestResponse(winterFlowObjectUI) ? 256 : 128);
        if (winterFlowResolverLibrary2.WinterFlowFrontendBackend(i2 & 1, (i2 & 147) != 146)) {
            WinterFlowThreadPoolGateway WinterFlowArrayNetwork2 = WinterFlowFrameworkMechanism.WinterFlowArrayNetwork(winterFlowConfigurationSubsystem.WinterFlowTransactionManagerStrategy, winterFlowResolverLibrary2);
            WinterFlowThreadPoolGateway WinterFlowArrayNetwork3 = WinterFlowFrameworkMechanism.WinterFlowArrayNetwork(winterFlowConfigurationSubsystem.WinterFlowRouterRouter, winterFlowResolverLibrary2);
            WinterFlowMicroserviceMechanism winterFlowMicroserviceMechanism = WinterFlowCacheRuntime.WinterFlowThreadListener;
            WinterFlowMapperManager WinterFlowSoftwareEngine = WinterFlowCacheRuntime.WinterFlowSoftwareEngine(WinterFlowServerManager.WinterFlowBackendCacheManager(winterFlowMapperManager.WinterFlowCacheManagerAgent(winterFlowMicroserviceMechanism), WinterFlowSoftwareException.WinterFlowTestingNode(R.drawable.bg, winterFlowResolverLibrary2, 0), WinterFlowThreadConfiguration.WinterFlowRouterStructure, 0.0f, 54), 16.0f);
            WinterFlowInvokerConsumer winterFlowInvokerConsumer = WinterFlowCacheUtility.WinterFlowUnitTestResponse;
            WinterFlowWorkerModule WinterFlowCacheManagerAgent2 = WinterFlowLibrary.WinterFlowCacheManagerAgent(winterFlowInvokerConsumer, false);
            int hashCode = Long.hashCode(winterFlowResolverLibrary2.WinterFlowConfiguration);
            WinterFlowConfigurationProcess WinterFlowTransactionAgent2 = winterFlowResolverLibrary2.WinterFlowTransactionAgent();
            WinterFlowMapperManager WinterFlowUserManagerUserManager = WinterFlowSoftwareException.WinterFlowUserManagerUserManager(winterFlowResolverLibrary2, WinterFlowSoftwareEngine);
            WinterFlowBandwidthAgent.WinterFlowCacheManagerAgent.getClass();
            WinterFlowConfigurationRequest winterFlowConfigurationRequest2 = WinterFlowEventEmitterDeserialization.WinterFlowHookDataSource;
            winterFlowResolverLibrary2.WinterFlowModuleAgent();
            if (winterFlowResolverLibrary2.WinterFlowProxyStructure) {
                winterFlowResolverLibrary2.WinterFlowResponseEngine(winterFlowConfigurationRequest2);
            } else {
                winterFlowResolverLibrary2.WinterFlowParserPipeline();
            }
            WinterFlowExceptionBackend winterFlowExceptionBackend = WinterFlowEventEmitterDeserialization.WinterFlowVariableVersionControl;
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend, winterFlowResolverLibrary2, WinterFlowCacheManagerAgent2);
            WinterFlowExceptionBackend winterFlowExceptionBackend2 = WinterFlowEventEmitterDeserialization.WinterFlowArrayNetwork;
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend2, winterFlowResolverLibrary2, WinterFlowTransactionAgent2);
            Integer valueOf = Integer.valueOf(hashCode);
            WinterFlowExceptionBackend winterFlowExceptionBackend3 = WinterFlowEventEmitterDeserialization.WinterFlowTransactionManagerStrategy;
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend3, winterFlowResolverLibrary2, valueOf);
            WinterFlowServiceProviderBatch winterFlowServiceProviderBatch = WinterFlowEventEmitterDeserialization.WinterFlowUnitTestResponse;
            WinterFlowProtocolNetwork.WinterFlowRouterRouter(winterFlowResolverLibrary2, winterFlowServiceProviderBatch);
            WinterFlowExceptionBackend winterFlowExceptionBackend4 = WinterFlowEventEmitterDeserialization.WinterFlowCacheManagerAgent;
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend4, winterFlowResolverLibrary2, WinterFlowUserManagerUserManager);
            WinterFlowRepositoryObject WinterFlowRouterStructure2 = WinterFlowConsumerDataSource.WinterFlowRouterStructure(WinterFlowInvokerComponent.WinterFlowArrayNetwork, WinterFlowCacheUtility.WinterFlowSingletonPlatform, winterFlowResolverLibrary2, 0);
            int hashCode2 = Long.hashCode(winterFlowResolverLibrary2.WinterFlowConfiguration);
            WinterFlowConfigurationProcess WinterFlowTransactionAgent3 = winterFlowResolverLibrary2.WinterFlowTransactionAgent();
            WinterFlowMapperManager WinterFlowUserManagerUserManager2 = WinterFlowSoftwareException.WinterFlowUserManagerUserManager(winterFlowResolverLibrary2, winterFlowMicroserviceMechanism);
            winterFlowResolverLibrary2.WinterFlowModuleAgent();
            if (winterFlowResolverLibrary2.WinterFlowProxyStructure) {
                winterFlowResolverLibrary2.WinterFlowResponseEngine(winterFlowConfigurationRequest2);
            } else {
                winterFlowResolverLibrary2.WinterFlowParserPipeline();
            }
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend, winterFlowResolverLibrary2, WinterFlowRouterStructure2);
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend2, winterFlowResolverLibrary2, WinterFlowTransactionAgent3);
            WinterFlowResolverBackend.WinterFlowConcurrencyThread(hashCode2, winterFlowResolverLibrary2, winterFlowExceptionBackend3, winterFlowResolverLibrary2, winterFlowServiceProviderBatch);
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend4, winterFlowResolverLibrary2, WinterFlowUserManagerUserManager2);
            WinterFlowMapperManager WinterFlowSingletonPlatform = WinterFlowCacheRuntime.WinterFlowSingletonPlatform(1.0f);
            WinterFlowRendererCacheManager WinterFlowRouterStructure3 = WinterFlowWebsocketInheritance.WinterFlowRouterStructure(WinterFlowInvokerComponent.WinterFlowVariableVersionControl, WinterFlowCacheUtility.WinterFlowConcurrencyThread, winterFlowResolverLibrary2, 54);
            int hashCode3 = Long.hashCode(winterFlowResolverLibrary2.WinterFlowConfiguration);
            WinterFlowConfigurationProcess WinterFlowTransactionAgent4 = winterFlowResolverLibrary2.WinterFlowTransactionAgent();
            WinterFlowMapperManager WinterFlowUserManagerUserManager3 = WinterFlowSoftwareException.WinterFlowUserManagerUserManager(winterFlowResolverLibrary2, WinterFlowSingletonPlatform);
            winterFlowResolverLibrary2.WinterFlowModuleAgent();
            if (winterFlowResolverLibrary2.WinterFlowProxyStructure) {
                winterFlowResolverLibrary2.WinterFlowResponseEngine(winterFlowConfigurationRequest2);
            } else {
                winterFlowResolverLibrary2.WinterFlowParserPipeline();
            }
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend, winterFlowResolverLibrary2, WinterFlowRouterStructure3);
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend2, winterFlowResolverLibrary2, WinterFlowTransactionAgent4);
            WinterFlowResolverBackend.WinterFlowConcurrencyThread(hashCode3, winterFlowResolverLibrary2, winterFlowExceptionBackend3, winterFlowResolverLibrary2, winterFlowServiceProviderBatch);
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend4, winterFlowResolverLibrary2, WinterFlowUserManagerUserManager3);
            WinterFlowValidatorComponent winterFlowValidatorComponent = WinterFlowValidatorComponent.WinterFlowRouterStructure;
            WinterFlowMapperManager WinterFlowSyntaxSubsystem = WinterFlowCacheRuntime.WinterFlowSyntaxSubsystem(WinterFlowSoftwareException.WinterFlowBandwidthObject(WinterFlowManagerRequest.WinterFlowSingletonPlatform(WinterFlowCacheRuntime.WinterFlowOrchestrationConfiguration(winterFlowValidatorComponent, 140.0f), WinterFlowRepositoryProxy.WinterFlowRouterStructure(12.0f)), WinterFlowSessionManagerProcess.WinterFlowBandwidthObject(WinterFlowPackageIDE(new WinterFlowInheritanceSubsystem(WinterFlowInvokerComponent.WinterFlowTransactionManagerStrategy(4284666621L)), new WinterFlowInheritanceSubsystem(WinterFlowInvokerComponent.WinterFlowTransactionManagerStrategy(4278336241L))))).WinterFlowCacheManagerAgent(new WinterFlowSoftwareModule(2.0f, WinterFlowSessionManagerProcess.WinterFlowBandwidthObject(WinterFlowPackageIDE(new WinterFlowInheritanceSubsystem(WinterFlowInvokerComponent.WinterFlowTransactionManagerStrategy(4278336241L)), new WinterFlowInheritanceSubsystem(WinterFlowInvokerComponent.WinterFlowTransactionManagerStrategy(4284666621L)))), WinterFlowRepositoryProxy.WinterFlowRouterStructure(12.0f))), 16.0f, 8.0f);
            WinterFlowWorkerModule WinterFlowCacheManagerAgent3 = WinterFlowLibrary.WinterFlowCacheManagerAgent(winterFlowInvokerConsumer, false);
            int hashCode4 = Long.hashCode(winterFlowResolverLibrary2.WinterFlowConfiguration);
            WinterFlowConfigurationProcess WinterFlowTransactionAgent5 = winterFlowResolverLibrary2.WinterFlowTransactionAgent();
            WinterFlowMapperManager WinterFlowUserManagerUserManager4 = WinterFlowSoftwareException.WinterFlowUserManagerUserManager(winterFlowResolverLibrary2, WinterFlowSyntaxSubsystem);
            winterFlowResolverLibrary2.WinterFlowModuleAgent();
            if (winterFlowResolverLibrary2.WinterFlowProxyStructure) {
                winterFlowResolverLibrary2.WinterFlowResponseEngine(winterFlowConfigurationRequest2);
            } else {
                winterFlowResolverLibrary2.WinterFlowParserPipeline();
            }
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend, winterFlowResolverLibrary2, WinterFlowCacheManagerAgent3);
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend2, winterFlowResolverLibrary2, WinterFlowTransactionAgent5);
            WinterFlowResolverBackend.WinterFlowConcurrencyThread(hashCode4, winterFlowResolverLibrary2, winterFlowExceptionBackend3, winterFlowResolverLibrary2, winterFlowServiceProviderBatch);
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend4, winterFlowResolverLibrary2, WinterFlowUserManagerUserManager4);
            long j = WinterFlowInheritanceSubsystem.WinterFlowCacheManagerAgent;
            long WinterFlowBatchUI = WinterFlowDecoratorUI.WinterFlowBatchUI(20);
            WinterFlowObjectHook winterFlowObjectHook = WinterFlowObjectHook.WinterFlowTransactionAgent;
            int i3 = 1;
            WinterFlowSingletonRuntime.WinterFlowHookDataSource("ARCHIVE", WinterFlowCacheRuntime.WinterFlowSingletonPlatform(1.0f), j, WinterFlowBatchUI, winterFlowObjectHook, 0L, new WinterFlowThreadPoolEventEmitter(3), 0L, 0, false, 0, 0, null, winterFlowResolverLibrary, 1597878, 261032);
            winterFlowResolverLibrary.WinterFlowBandwidthObject(true);
            WinterFlowMapperManager WinterFlowSyntaxSubsystem2 = WinterFlowCacheRuntime.WinterFlowSyntaxSubsystem(WinterFlowSoftwareException.WinterFlowConcurrencyThread(WinterFlowSoftwareException.WinterFlowOrchestrationSubsystem(WinterFlowManagerRequest.WinterFlowSingletonPlatform(winterFlowValidatorComponent, WinterFlowRepositoryProxy.WinterFlowRouterStructure(12.0f)), WinterFlowInheritanceSubsystem.WinterFlowHookDataSource(WinterFlowInheritanceSubsystem.WinterFlowHookDataSource, 0.6f), WinterFlowCacheRuntime.WinterFlowTransactionAgent), 1.0f, WinterFlowInvokerComponent.WinterFlowTransactionManagerStrategy(4284666621L), WinterFlowRepositoryProxy.WinterFlowRouterStructure(12.0f)), 16.0f, 8.0f);
            WinterFlowWorkerModule WinterFlowCacheManagerAgent4 = WinterFlowLibrary.WinterFlowCacheManagerAgent(winterFlowInvokerConsumer, false);
            int hashCode5 = Long.hashCode(winterFlowResolverLibrary.WinterFlowConfiguration);
            WinterFlowConfigurationProcess WinterFlowTransactionAgent6 = winterFlowResolverLibrary.WinterFlowTransactionAgent();
            WinterFlowMapperManager WinterFlowUserManagerUserManager5 = WinterFlowSoftwareException.WinterFlowUserManagerUserManager(winterFlowResolverLibrary, WinterFlowSyntaxSubsystem2);
            winterFlowResolverLibrary.WinterFlowModuleAgent();
            if (winterFlowResolverLibrary.WinterFlowProxyStructure) {
                winterFlowConfigurationRequest = winterFlowConfigurationRequest2;
                winterFlowResolverLibrary.WinterFlowResponseEngine(winterFlowConfigurationRequest);
            } else {
                winterFlowConfigurationRequest = winterFlowConfigurationRequest2;
                winterFlowResolverLibrary.WinterFlowParserPipeline();
            }
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend, winterFlowResolverLibrary, WinterFlowCacheManagerAgent4);
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend2, winterFlowResolverLibrary, WinterFlowTransactionAgent6);
            WinterFlowResolverBackend.WinterFlowConcurrencyThread(hashCode5, winterFlowResolverLibrary, winterFlowExceptionBackend3, winterFlowResolverLibrary, winterFlowServiceProviderBatch);
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend4, winterFlowResolverLibrary, WinterFlowUserManagerUserManager5);
            WinterFlowConfigurationRequest winterFlowConfigurationRequest3 = winterFlowConfigurationRequest;
            WinterFlowSingletonRuntime.WinterFlowHookDataSource(WinterFlowResolverBackend.WinterFlowSyntax("ENERGY: ", ((Number) WinterFlowArrayNetwork3.getValue()).intValue()), null, WinterFlowInheritanceSubsystem.WinterFlowUnitTestResponse, WinterFlowDecoratorUI.WinterFlowBatchUI(18), winterFlowObjectHook, 0L, null, 0L, 0, false, 0, 0, null, winterFlowResolverLibrary, 1597824, 262058);
            winterFlowResolverLibrary2 = winterFlowResolverLibrary;
            winterFlowResolverLibrary2.WinterFlowBandwidthObject(true);
            winterFlowResolverLibrary2.WinterFlowBandwidthObject(true);
            WinterFlowProtocolNetwork.WinterFlowRouterStructure(winterFlowResolverLibrary2, WinterFlowCacheRuntime.WinterFlowArrayHelper(20.0f));
            if (((List) WinterFlowArrayNetwork2.getValue()).isEmpty()) {
                winterFlowResolverLibrary2.WinterFlowCompilerDataSource(-1823214185);
                WinterFlowMapperManager WinterFlowRouterStructure4 = WinterFlowCompilerDecorator.WinterFlowRouterStructure(WinterFlowCacheRuntime.WinterFlowSingletonPlatform(1.0f));
                WinterFlowWorkerModule WinterFlowCacheManagerAgent5 = WinterFlowLibrary.WinterFlowCacheManagerAgent(WinterFlowCacheUtility.WinterFlowTransactionAgent, false);
                int hashCode6 = Long.hashCode(winterFlowResolverLibrary2.WinterFlowConfiguration);
                WinterFlowConfigurationProcess WinterFlowTransactionAgent7 = winterFlowResolverLibrary2.WinterFlowTransactionAgent();
                WinterFlowMapperManager WinterFlowUserManagerUserManager6 = WinterFlowSoftwareException.WinterFlowUserManagerUserManager(winterFlowResolverLibrary2, WinterFlowRouterStructure4);
                winterFlowResolverLibrary2.WinterFlowModuleAgent();
                if (winterFlowResolverLibrary2.WinterFlowProxyStructure) {
                    winterFlowResolverLibrary2.WinterFlowResponseEngine(winterFlowConfigurationRequest3);
                } else {
                    winterFlowResolverLibrary2.WinterFlowParserPipeline();
                }
                WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend, winterFlowResolverLibrary2, WinterFlowCacheManagerAgent5);
                WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend2, winterFlowResolverLibrary2, WinterFlowTransactionAgent7);
                WinterFlowResolverBackend.WinterFlowConcurrencyThread(hashCode6, winterFlowResolverLibrary2, winterFlowExceptionBackend3, winterFlowResolverLibrary2, winterFlowServiceProviderBatch);
                WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend4, winterFlowResolverLibrary2, WinterFlowUserManagerUserManager6);
                WinterFlowSingletonRuntime.WinterFlowHookDataSource("ARCHIVE IS EMPTY.\nGO CATCH SOME FISH!", null, WinterFlowInheritanceSubsystem.WinterFlowHookDataSource(j, 0.6f), WinterFlowDecoratorUI.WinterFlowBatchUI(18), WinterFlowObjectHook.WinterFlowResponseEngine, 0L, new WinterFlowThreadPoolEventEmitter(3), 0L, 0, false, 0, 0, null, winterFlowResolverLibrary, 1597830, 261034);
                winterFlowResolverLibrary2 = winterFlowResolverLibrary;
                winterFlowResolverLibrary2.WinterFlowBandwidthObject(true);
                winterFlowResolverLibrary2.WinterFlowBandwidthObject(false);
                winterFlowConfigurationSubsystem2 = winterFlowConfigurationSubsystem;
            } else {
                winterFlowResolverLibrary2.WinterFlowCompilerDataSource(-1822627293);
                WinterFlowMapperManager WinterFlowRouterStructure5 = WinterFlowCompilerDecorator.WinterFlowRouterStructure(WinterFlowCacheRuntime.WinterFlowSingletonPlatform(1.0f));
                WinterFlowExceptionXML WinterFlowVariableVersionControl2 = WinterFlowCacheRuntime.WinterFlowVariableVersionControl(8.0f, 1);
                WinterFlowThreadPoolCompiler winterFlowThreadPoolCompiler = new WinterFlowThreadPoolCompiler(10.0f, new WinterFlowCompilerMechanism(i3));
                boolean WinterFlowVariableVersionControl3 = winterFlowResolverLibrary2.WinterFlowVariableVersionControl(WinterFlowArrayNetwork2) | ((i2 & 112) == 32);
                Object WinterFlowSyntaxSubsystem3 = winterFlowResolverLibrary2.WinterFlowSyntaxSubsystem();
                if (WinterFlowVariableVersionControl3 || WinterFlowSyntaxSubsystem3 == WinterFlowModuleModule.WinterFlowRouterStructure) {
                    winterFlowConfigurationSubsystem2 = winterFlowConfigurationSubsystem;
                    WinterFlowSyntaxSubsystem3 = new WinterFlowRouterCompiler(i3, WinterFlowArrayNetwork2, winterFlowConfigurationSubsystem2);
                    winterFlowResolverLibrary2.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem3);
                } else {
                    winterFlowConfigurationSubsystem2 = winterFlowConfigurationSubsystem;
                }
                WinterFlowEncryptionSubsystem.WinterFlowCacheManagerAgent(WinterFlowRouterStructure5, null, WinterFlowVariableVersionControl2, winterFlowThreadPoolCompiler, null, null, false, null, (WinterFlowObjectSession) WinterFlowSyntaxSubsystem3, winterFlowResolverLibrary2, 24960);
                winterFlowResolverLibrary2.WinterFlowBandwidthObject(false);
            }
            WinterFlowProtocolNetwork.WinterFlowRouterStructure(winterFlowResolverLibrary2, WinterFlowCacheRuntime.WinterFlowArrayHelper(16.0f));
            WinterFlowSoftwareException.WinterFlowServerProtocol((i2 & 896) | 48, 0, winterFlowObjectUI, winterFlowResolverLibrary2, WinterFlowCacheRuntime.WinterFlowOrchestrationConfiguration(winterFlowValidatorComponent, 180.0f).WinterFlowCacheManagerAgent(new WinterFlowGatewayService()), "BACK");
            winterFlowResolverLibrary2.WinterFlowBandwidthObject(true);
            winterFlowResolverLibrary2.WinterFlowBandwidthObject(true);
        } else {
            winterFlowConfigurationSubsystem2 = winterFlowConfigurationSubsystem;
            winterFlowResolverLibrary2.WinterFlowQueueService();
        }
        WinterFlowStackEngine WinterFlowConcurrencyThread2 = winterFlowResolverLibrary2.WinterFlowConcurrencyThread();
        if (WinterFlowConcurrencyThread2 != null) {
            WinterFlowConcurrencyThread2.WinterFlowArrayNetwork = new WinterFlowConsumerVersionControl(winterFlowMapperManager, winterFlowConfigurationSubsystem2, winterFlowObjectUI, i, 0);
        }
    }

    public static int WinterFlowSerializerStructure(List list) {
        list.getClass();
        return list.size() - 1;
    }

    public static WinterFlowUserManagerResolver WinterFlowServerProtocol(WinterFlowUserManagerResolver winterFlowUserManagerResolver) {
        winterFlowUserManagerResolver.WinterFlowUnitTestResponse();
        winterFlowUserManagerResolver.WinterFlowUnitTestResponse = true;
        return winterFlowUserManagerResolver.WinterFlowTransactionManagerStrategy > 0 ? winterFlowUserManagerResolver : WinterFlowUserManagerResolver.WinterFlowRouterRouter;
    }

    public static void WinterFlowServiceUtility(Handler handler) {
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            String name = myLooper != null ? myLooper.getThread().getName() : "null current looper";
            String name2 = handler.getLooper().getThread().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + String.valueOf(name2).length() + 35 + 1);
            sb.append("Must be called on ");
            sb.append(name2);
            sb.append(" thread, but got ");
            sb.append(name);
            sb.append(".");
            throw new IllegalStateException(sb.toString());
        }
    }

    public static void WinterFlowSingletonPlatform(Object obj, String str) {
        if (obj != null) {
            return;
        }
        WinterFlowCompilerMechanism.WinterFlowTransactionManagerStrategy(str);
    }

    public static final ArrayList WinterFlowSoftwareEngine(Map map, WinterFlowObjectSession winterFlowObjectSession) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = map.entrySet().iterator();
        if (it.hasNext()) {
            ((Map.Entry) it.next()).getValue().getClass();
            WinterFlowEventEmitterOrchestration.WinterFlowVariableBandwidth();
            return null;
        }
        Set keySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : keySet) {
            if (((Boolean) winterFlowObjectSession.WinterFlowUnitTestResponse((String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final long WinterFlowSoftwareProtocol(float[] fArr, long j) {
        if (fArr.length < 16) {
            return j;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[3];
        float f4 = fArr[4];
        float f5 = fArr[5];
        float f6 = fArr[7];
        float f7 = fArr[12];
        float f8 = fArr[13];
        float f9 = fArr[15];
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float f10 = 1.0f / (((f6 * intBitsToFloat2) + (f3 * intBitsToFloat)) + f9);
        if ((Float.floatToRawIntBits(f10) & Integer.MAX_VALUE) >= 2139095040) {
            f10 = 0.0f;
        }
        float f11 = ((f5 * intBitsToFloat2) + (f2 * intBitsToFloat) + f8) * f10;
        return (Float.floatToRawIntBits((((f4 * intBitsToFloat2) + (f * intBitsToFloat)) + f7) * f10) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L);
    }

    public static boolean WinterFlowStrategyTool(int i, Object obj) {
        if (obj instanceof WinterFlowOrchestrationIDE) {
            if ((obj instanceof WinterFlowParserFramework ? ((WinterFlowParserFramework) obj).WinterFlowHookDataSource() : obj instanceof WinterFlowObjectUI ? 0 : obj instanceof WinterFlowObjectSession ? 1 : obj instanceof WinterFlowEventEvent ? 2 : obj instanceof WinterFlowControllerScript ? 3 : obj instanceof WinterFlowVersionEngine ? 4 : obj instanceof WinterFlowCacheRouter ? 5 : obj instanceof WinterFlowSingletonSystem ? 6 : obj instanceof WinterFlowEncryptionStructure ? 7 : obj instanceof WinterFlowUnitTestResponse ? 8 : obj instanceof WinterFlowDatabaseSchemaTool ? 9 : obj instanceof WinterFlowViewBackend ? 10 : obj instanceof WinterFlowCacheManagerLibrary ? 11 : obj instanceof WinterFlowWebsocketSystem ? 13 : obj instanceof WinterFlowDebugMicroservice ? 14 : obj instanceof WinterFlowServerEngine ? 15 : obj instanceof WinterFlowFrameworkRuntime ? 16 : obj instanceof WinterFlowEventClass ? 17 : obj instanceof WinterFlowHandlerEntity ? 18 : obj instanceof WinterFlowProviderUtility ? 19 : obj instanceof WinterFlowHandlerModule ? 20 : obj instanceof WinterFlowCacheEvent ? 21 : -1) == i) {
                return true;
            }
        }
        return false;
    }

    public static Map WinterFlowSyntax(Object obj) {
        if ((obj instanceof WinterFlowLoaderProcess) && !(obj instanceof WinterFlowNetworkMiddleware)) {
            WinterFlowCacheTool(obj, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e) {
            WinterFlowManagerRequest.WinterFlowTestingNode(e, WinterFlowUnitTestLibrary.class.getName());
            throw e;
        }
    }

    public static ArrayList WinterFlowSyntaxSubsystem(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new WinterFlowRefactoringInterface(objArr));
    }

    public static WinterFlowDebugRequest WinterFlowTestingNode(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        int i;
        int i2;
        int i3;
        TypedArray typedArray;
        do {
            next = xmlResourceParser.next();
            i = 2;
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (!xmlResourceParser.getName().equals("font-family")) {
            WinterFlowUIMiddleware(xmlResourceParser);
            return null;
        }
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), WinterFlowResolverQueue.WinterFlowHookDataSource);
        int i4 = 0;
        String string = obtainAttributes.getString(0);
        String string2 = obtainAttributes.getString(5);
        String string3 = obtainAttributes.getString(6);
        String string4 = obtainAttributes.getString(2);
        int resourceId = obtainAttributes.getResourceId(1, 0);
        int i5 = 3;
        int integer = obtainAttributes.getInteger(3, 1);
        int integer2 = obtainAttributes.getInteger(4, 500);
        String string5 = obtainAttributes.getString(7);
        obtainAttributes.recycle();
        if (string == null || string2 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlResourceParser.next() != 3) {
                if (xmlResourceParser.getEventType() == 2) {
                    if (xmlResourceParser.getName().equals("font")) {
                        TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), WinterFlowResolverQueue.WinterFlowCacheManagerAgent);
                        int i6 = obtainAttributes2.getInt(obtainAttributes2.hasValue(8) ? 8 : 1, Constants.MINIMAL_ERROR_STATUS_CODE);
                        boolean z = 1 == obtainAttributes2.getInt(obtainAttributes2.hasValue(6) ? 6 : 2, 0);
                        int i7 = obtainAttributes2.hasValue(9) ? 9 : 3;
                        String string6 = obtainAttributes2.getString(obtainAttributes2.hasValue(7) ? 7 : 4);
                        int i8 = obtainAttributes2.getInt(i7, 0);
                        int i9 = obtainAttributes2.hasValue(5) ? 5 : 0;
                        int resourceId2 = obtainAttributes2.getResourceId(i9, 0);
                        String string7 = obtainAttributes2.getString(i9);
                        obtainAttributes2.recycle();
                        while (xmlResourceParser.next() != 3) {
                            WinterFlowUIMiddleware(xmlResourceParser);
                        }
                        arrayList.add(new WinterFlowExceptionHook(string7, i6, z, string6, i8, resourceId2));
                    } else {
                        WinterFlowUIMiddleware(xmlResourceParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new WinterFlowDecoratorView((WinterFlowExceptionHook[]) arrayList.toArray(new WinterFlowExceptionHook[0]));
        }
        List WinterFlowCompilerHandler = WinterFlowCompilerHandler(resources, resourceId);
        ArrayList arrayList2 = new ArrayList();
        while (xmlResourceParser.next() != i5) {
            if (xmlResourceParser.getEventType() == i) {
                if (xmlResourceParser.getName().equals("fallback")) {
                    TypedArray obtainAttributes3 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), WinterFlowResolverQueue.WinterFlowArrayNetwork);
                    try {
                        String string8 = obtainAttributes3.getString(i4);
                        String string9 = obtainAttributes3.getString(1);
                        i3 = integer;
                        String string10 = obtainAttributes3.getString(i);
                        if (string8 == null) {
                            typedArray = obtainAttributes3;
                            throw new XmlPullParserException("query attribute must be set in fallback element");
                        }
                        while (xmlResourceParser.next() != i5) {
                            WinterFlowUIMiddleware(xmlResourceParser);
                        }
                        try {
                            typedArray = obtainAttributes3;
                            i2 = i5;
                            try {
                                WinterFlowXMLHelper winterFlowXMLHelper = new WinterFlowXMLHelper(string, string2, string8, WinterFlowCompilerHandler, string9, string10);
                                typedArray.recycle();
                                arrayList2.add(winterFlowXMLHelper);
                            } catch (Throwable th) {
                                th = th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            typedArray = obtainAttributes3;
                        }
                        th = th;
                    } catch (Throwable th3) {
                        th = th3;
                        typedArray = obtainAttributes3;
                    }
                    typedArray.recycle();
                    throw th;
                }
                i2 = i5;
                i3 = integer;
                WinterFlowUIMiddleware(xmlResourceParser);
                i5 = i2;
                integer = i3;
                i = 2;
                i4 = 0;
            }
        }
        int i10 = integer;
        if (!arrayList2.isEmpty()) {
            return new WinterFlowResponseRuntime(arrayList2, i10, integer2, string5);
        }
        if (string3 == null) {
            WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("The provider font XML requires query attribute or fallback children.");
            return null;
        }
        arrayList2.add(new WinterFlowXMLHelper(string, string2, string3, WinterFlowCompilerHandler, null, null));
        if (string4 != null) {
            arrayList2.add(new WinterFlowXMLHelper(string, string2, string4, WinterFlowCompilerHandler, null, null));
        }
        return new WinterFlowResponseRuntime(arrayList2, i10, integer2, string5);
    }

    public static void WinterFlowThreadListener(String str, boolean z) {
        if (z) {
            return;
        }
        WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject(str);
    }

    public static void WinterFlowTransactionAgent(int i, Object obj) {
        if (obj == null || WinterFlowStrategyTool(i, obj)) {
            return;
        }
        WinterFlowCacheTool(obj, "kotlin.jvm.functions.Function" + i);
        throw null;
    }

    public static final void WinterFlowTransactionManagerStrategy(WinterFlowMapperManager winterFlowMapperManager, WinterFlowEventEvent winterFlowEventEvent, WinterFlowResolverLibrary winterFlowResolverLibrary, int i, int i2) {
        int i3;
        winterFlowResolverLibrary.WinterFlowFrameworkTransaction(-1298353104);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowMapperManager) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowEventEvent) ? 32 : 16;
        }
        if (winterFlowResolverLibrary.WinterFlowFrontendBackend(i3 & 1, (i3 & 19) != 18)) {
            if (i4 != 0) {
                winterFlowMapperManager = WinterFlowValidatorComponent.WinterFlowRouterStructure;
            }
            Object WinterFlowSyntaxSubsystem = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
            if (WinterFlowSyntaxSubsystem == WinterFlowModuleModule.WinterFlowRouterStructure) {
                WinterFlowSyntaxSubsystem = new WinterFlowLibraryAgent(WinterFlowCacheUtility.WinterFlowSoftwareEngine);
                winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem);
            }
            WinterFlowUnitTestResponse((WinterFlowLibraryAgent) WinterFlowSyntaxSubsystem, winterFlowMapperManager, winterFlowEventEvent, winterFlowResolverLibrary, (i3 << 3) & 1008);
        } else {
            winterFlowResolverLibrary.WinterFlowQueueService();
        }
        WinterFlowStackEngine WinterFlowConcurrencyThread2 = winterFlowResolverLibrary.WinterFlowConcurrencyThread();
        if (WinterFlowConcurrencyThread2 != null) {
            WinterFlowConcurrencyThread2.WinterFlowArrayNetwork = new WinterFlowStrategyEngine(winterFlowMapperManager, winterFlowEventEvent, i, i2);
        }
    }

    public static void WinterFlowUIMiddleware(XmlPullParser xmlPullParser) {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    public static final void WinterFlowUnitTestResponse(WinterFlowLibraryAgent winterFlowLibraryAgent, WinterFlowMapperManager winterFlowMapperManager, WinterFlowEventEvent winterFlowEventEvent, WinterFlowResolverLibrary winterFlowResolverLibrary, int i) {
        int i2;
        winterFlowResolverLibrary.WinterFlowFrameworkTransaction(-511989831);
        if ((i & 6) == 0) {
            i2 = (winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowLibraryAgent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowMapperManager) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowEventEvent) ? 256 : 128;
        }
        if (winterFlowResolverLibrary.WinterFlowFrontendBackend(i2 & 1, (i2 & 147) != 146)) {
            int hashCode = Long.hashCode(winterFlowResolverLibrary.WinterFlowConfiguration);
            WinterFlowDatabaseSchemaLayer WinterFlowSoftwareProtocol = WinterFlowCloudStack.WinterFlowSoftwareProtocol(winterFlowResolverLibrary);
            WinterFlowMapperManager WinterFlowUserManagerUserManager = WinterFlowSoftwareException.WinterFlowUserManagerUserManager(winterFlowResolverLibrary, winterFlowMapperManager);
            WinterFlowConfigurationProcess WinterFlowTransactionAgent2 = winterFlowResolverLibrary.WinterFlowTransactionAgent();
            WinterFlowConfigurationRequest winterFlowConfigurationRequest = WinterFlowConfigurationRequest.WinterFlowOrchestrationSubsystem;
            winterFlowResolverLibrary.WinterFlowModuleAgent();
            if (winterFlowResolverLibrary.WinterFlowProxyStructure) {
                winterFlowResolverLibrary.WinterFlowResponseEngine(winterFlowConfigurationRequest);
            } else {
                winterFlowResolverLibrary.WinterFlowParserPipeline();
            }
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowLibraryAgent.WinterFlowCacheManagerAgent, winterFlowResolverLibrary, winterFlowLibraryAgent);
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowLibraryAgent.WinterFlowArrayNetwork, winterFlowResolverLibrary, WinterFlowSoftwareProtocol);
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowLibraryAgent.WinterFlowVariableVersionControl, winterFlowResolverLibrary, winterFlowEventEvent);
            WinterFlowBandwidthAgent.WinterFlowCacheManagerAgent.getClass();
            WinterFlowProtocolNetwork.WinterFlowSyntax(WinterFlowEventEmitterDeserialization.WinterFlowArrayNetwork, winterFlowResolverLibrary, WinterFlowTransactionAgent2);
            WinterFlowProtocolNetwork.WinterFlowRouterRouter(winterFlowResolverLibrary, WinterFlowEventEmitterDeserialization.WinterFlowUnitTestResponse);
            WinterFlowProtocolNetwork.WinterFlowSyntax(WinterFlowEventEmitterDeserialization.WinterFlowCacheManagerAgent, winterFlowResolverLibrary, WinterFlowUserManagerUserManager);
            WinterFlowProtocolNetwork.WinterFlowSyntax(WinterFlowEventEmitterDeserialization.WinterFlowTransactionManagerStrategy, winterFlowResolverLibrary, Integer.valueOf(hashCode));
            winterFlowResolverLibrary.WinterFlowBandwidthObject(true);
            if (winterFlowResolverLibrary.WinterFlowBackendCacheManager()) {
                winterFlowResolverLibrary.WinterFlowCompilerDataSource(-1259187287);
                winterFlowResolverLibrary.WinterFlowBandwidthObject(false);
            } else {
                winterFlowResolverLibrary.WinterFlowCompilerDataSource(-1259245908);
                boolean WinterFlowUnitTestResponse2 = winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowLibraryAgent);
                Object WinterFlowSyntaxSubsystem = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
                if (WinterFlowUnitTestResponse2 || WinterFlowSyntaxSubsystem == WinterFlowModuleModule.WinterFlowRouterStructure) {
                    WinterFlowSyntaxSubsystem = new WinterFlowRouterEngine(13, winterFlowLibraryAgent);
                    winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem);
                }
                WinterFlowSoftwareException.WinterFlowTransactionAgent((WinterFlowObjectUI) WinterFlowSyntaxSubsystem, winterFlowResolverLibrary);
                winterFlowResolverLibrary.WinterFlowBandwidthObject(false);
            }
        } else {
            winterFlowResolverLibrary.WinterFlowQueueService();
        }
        WinterFlowStackEngine WinterFlowConcurrencyThread2 = winterFlowResolverLibrary.WinterFlowConcurrencyThread();
        if (WinterFlowConcurrencyThread2 != null) {
            WinterFlowConcurrencyThread2.WinterFlowArrayNetwork = new WinterFlowTransactionManagerServer(winterFlowLibraryAgent, winterFlowMapperManager, winterFlowEventEvent, i);
        }
    }

    public static final void WinterFlowUserManagerUserManager(float[] fArr, WinterFlowWidgetProtocol winterFlowWidgetProtocol) {
        if (fArr.length < 16) {
            return;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[3];
        float f4 = fArr[4];
        float f5 = fArr[5];
        float f6 = fArr[7];
        float f7 = fArr[12];
        float f8 = fArr[13];
        float f9 = fArr[15];
        float f10 = winterFlowWidgetProtocol.WinterFlowRouterStructure;
        float f11 = winterFlowWidgetProtocol.WinterFlowHookDataSource;
        float f12 = winterFlowWidgetProtocol.WinterFlowCacheManagerAgent;
        float f13 = winterFlowWidgetProtocol.WinterFlowArrayNetwork;
        float f14 = f3 * f10;
        float f15 = f6 * f11;
        float f16 = 1.0f / ((f14 + f15) + f9);
        if ((Float.floatToRawIntBits(f16) & Integer.MAX_VALUE) >= 2139095040) {
            f16 = 0.0f;
        }
        float f17 = f * f10;
        float f18 = f4 * f11;
        float f19 = (f17 + f18 + f7) * f16;
        float f20 = f10 * f2;
        float f21 = f11 * f5;
        float f22 = (f20 + f21 + f8) * f16;
        float f23 = f6 * f13;
        float f24 = 1.0f / ((f14 + f23) + f9);
        if ((Float.floatToRawIntBits(f24) & Integer.MAX_VALUE) >= 2139095040) {
            f24 = 0.0f;
        }
        float f25 = f4 * f13;
        float f26 = (f17 + f25 + f7) * f24;
        float f27 = f5 * f13;
        float f28 = (f20 + f27 + f8) * f24;
        float f29 = f3 * f12;
        float f30 = 1.0f / ((f15 + f29) + f9);
        if ((Float.floatToRawIntBits(f30) & Integer.MAX_VALUE) >= 2139095040) {
            f30 = 0.0f;
        }
        float f31 = f * f12;
        float f32 = (f31 + f18 + f7) * f30;
        float f33 = f12 * f2;
        float f34 = (f21 + f33 + f8) * f30;
        float f35 = 1.0f / ((f29 + f23) + f9);
        float f36 = (Float.floatToRawIntBits(f35) & Integer.MAX_VALUE) < 2139095040 ? f35 : 0.0f;
        float f37 = (f31 + f25 + f7) * f36;
        float f38 = (f33 + f27 + f8) * f36;
        winterFlowWidgetProtocol.WinterFlowRouterStructure = Math.min(f19, Math.min(f26, Math.min(f32, f37)));
        winterFlowWidgetProtocol.WinterFlowHookDataSource = Math.min(f22, Math.min(f28, Math.min(f34, f38)));
        winterFlowWidgetProtocol.WinterFlowCacheManagerAgent = Math.max(f19, Math.max(f26, Math.max(f32, f37)));
        winterFlowWidgetProtocol.WinterFlowArrayNetwork = Math.max(f22, Math.max(f28, Math.max(f34, f38)));
    }

    public static final boolean WinterFlowValidatorHandler(Throwable th, WinterFlowObjectUI winterFlowObjectUI) {
        List asList;
        Object invoke;
        th.getClass();
        Integer num = WinterFlowTransactionFramework.WinterFlowRouterStructure;
        WinterFlowMapperSession winterFlowMapperSession = null;
        if (num == null || num.intValue() >= 19) {
            Throwable[] suppressed = th.getSuppressed();
            suppressed.getClass();
            asList = Arrays.asList(suppressed);
            asList.getClass();
        } else {
            Method method = WinterFlowRequestBandwidth.WinterFlowHookDataSource;
            if (method == null || (invoke = method.invoke(th, null)) == null) {
                asList = WinterFlowDataSourceEngine.WinterFlowVariableVersionControl;
            } else {
                asList = Arrays.asList((Throwable[]) invoke);
                asList.getClass();
            }
        }
        int size = asList.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            if (((Throwable) asList.get(i)) instanceof WinterFlowMapperSession) {
                return false;
            }
        }
        try {
            WinterFlowAdapterEntity winterFlowAdapterEntity = (WinterFlowAdapterEntity) winterFlowObjectUI.WinterFlowRouterStructure();
            if (winterFlowAdapterEntity != null) {
                boolean z2 = winterFlowAdapterEntity.WinterFlowHookDataSource;
                List list = winterFlowAdapterEntity.WinterFlowRouterStructure;
                if (z2) {
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((WinterFlowProviderService) list.get(i2)).getClass();
                    }
                } else if (!list.isEmpty()) {
                    z = true;
                }
            }
            if (z) {
                winterFlowAdapterEntity.getClass();
                winterFlowMapperSession = new WinterFlowMapperSession(winterFlowAdapterEntity);
            }
        } catch (Throwable th2) {
            winterFlowMapperSession = th2;
        }
        if (winterFlowMapperSession != null) {
            WinterFlowCloudStack.WinterFlowTransactionManagerStrategy(th, winterFlowMapperSession);
        }
        return z;
    }

    public static float[] WinterFlowVariableBandwidth() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    public static final void WinterFlowVariableVersionControl(final WinterFlowSoftwareSubsystem winterFlowSoftwareSubsystem, final WinterFlowMapperManager winterFlowMapperManager, WinterFlowInvokerConsumer winterFlowInvokerConsumer, WinterFlowStackNode winterFlowStackNode, float f, WinterFlowResolverLibrary winterFlowResolverLibrary, final int i, final int i2) {
        final WinterFlowInvokerConsumer winterFlowInvokerConsumer2;
        final WinterFlowStackNode winterFlowStackNode2;
        final float f2;
        winterFlowResolverLibrary.WinterFlowFrameworkTransaction(1142754848);
        int i3 = (winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowSoftwareSubsystem) ? 4 : 2) | i;
        if ((i & 384) == 0) {
            i3 |= winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowMapperManager) ? 256 : 128;
        }
        int i4 = i3 | 3072;
        int i5 = i2 & 16;
        if (i5 != 0) {
            i4 = i3 | 27648;
        } else if ((i & 24576) == 0) {
            i4 |= winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowStackNode) ? 16384 : 8192;
        }
        int i6 = i4 | 1769472;
        if (winterFlowResolverLibrary.WinterFlowFrontendBackend(i6 & 1, (599187 & i6) != 599186)) {
            winterFlowInvokerConsumer2 = WinterFlowCacheUtility.WinterFlowTransactionAgent;
            WinterFlowStackNode winterFlowStackNode3 = i5 != 0 ? WinterFlowThreadConfiguration.WinterFlowHookDataSource : winterFlowStackNode;
            winterFlowResolverLibrary.WinterFlowCompilerDataSource(1899381698);
            winterFlowResolverLibrary.WinterFlowBandwidthObject(false);
            f2 = 1.0f;
            WinterFlowMapperManager WinterFlowBackendCacheManager = WinterFlowServerManager.WinterFlowBackendCacheManager(WinterFlowManagerRequest.WinterFlowVariableBandwidth(winterFlowMapperManager.WinterFlowCacheManagerAgent(WinterFlowValidatorComponent.WinterFlowRouterStructure)), winterFlowSoftwareSubsystem, winterFlowStackNode3, 1.0f, 2);
            Object WinterFlowSyntaxSubsystem = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
            if (WinterFlowSyntaxSubsystem == WinterFlowModuleModule.WinterFlowRouterStructure) {
                WinterFlowSyntaxSubsystem = WinterFlowRefactoringSubsystem.WinterFlowTransactionManagerStrategy;
                winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem);
            }
            WinterFlowWorkerModule winterFlowWorkerModule = (WinterFlowWorkerModule) WinterFlowSyntaxSubsystem;
            int hashCode = Long.hashCode(winterFlowResolverLibrary.WinterFlowConfiguration);
            WinterFlowMapperManager WinterFlowUserManagerUserManager = WinterFlowSoftwareException.WinterFlowUserManagerUserManager(winterFlowResolverLibrary, WinterFlowBackendCacheManager);
            WinterFlowConfigurationProcess WinterFlowTransactionAgent2 = winterFlowResolverLibrary.WinterFlowTransactionAgent();
            WinterFlowBandwidthAgent.WinterFlowCacheManagerAgent.getClass();
            WinterFlowConfigurationRequest winterFlowConfigurationRequest = WinterFlowEventEmitterDeserialization.WinterFlowHookDataSource;
            winterFlowResolverLibrary.WinterFlowModuleAgent();
            if (winterFlowResolverLibrary.WinterFlowProxyStructure) {
                winterFlowResolverLibrary.WinterFlowResponseEngine(winterFlowConfigurationRequest);
            } else {
                winterFlowResolverLibrary.WinterFlowParserPipeline();
            }
            WinterFlowProtocolNetwork.WinterFlowSyntax(WinterFlowEventEmitterDeserialization.WinterFlowVariableVersionControl, winterFlowResolverLibrary, winterFlowWorkerModule);
            WinterFlowProtocolNetwork.WinterFlowSyntax(WinterFlowEventEmitterDeserialization.WinterFlowArrayNetwork, winterFlowResolverLibrary, WinterFlowTransactionAgent2);
            WinterFlowProtocolNetwork.WinterFlowRouterRouter(winterFlowResolverLibrary, WinterFlowEventEmitterDeserialization.WinterFlowUnitTestResponse);
            WinterFlowProtocolNetwork.WinterFlowSyntax(WinterFlowEventEmitterDeserialization.WinterFlowCacheManagerAgent, winterFlowResolverLibrary, WinterFlowUserManagerUserManager);
            WinterFlowProtocolNetwork.WinterFlowSyntax(WinterFlowEventEmitterDeserialization.WinterFlowTransactionManagerStrategy, winterFlowResolverLibrary, Integer.valueOf(hashCode));
            winterFlowResolverLibrary.WinterFlowBandwidthObject(true);
            winterFlowStackNode2 = winterFlowStackNode3;
        } else {
            winterFlowResolverLibrary.WinterFlowQueueService();
            winterFlowInvokerConsumer2 = winterFlowInvokerConsumer;
            winterFlowStackNode2 = winterFlowStackNode;
            f2 = f;
        }
        WinterFlowStackEngine WinterFlowConcurrencyThread2 = winterFlowResolverLibrary.WinterFlowConcurrencyThread();
        if (WinterFlowConcurrencyThread2 != null) {
            WinterFlowConcurrencyThread2.WinterFlowArrayNetwork = new WinterFlowEventEvent() { // from class: com.google.android.datatransport.WinterFlowSyntaxAdapter
                @Override // com.google.android.datatransport.WinterFlowEventEvent
                public final Object WinterFlowVariableVersionControl(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    WinterFlowUnitTestLibrary.WinterFlowVariableVersionControl(WinterFlowSoftwareSubsystem.this, winterFlowMapperManager, winterFlowInvokerConsumer2, winterFlowStackNode2, f2, (WinterFlowResolverLibrary) obj, WinterFlowConfigurationException.WinterFlowResponseEngine(i | 1), i2);
                    return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                }
            };
        }
    }
}
