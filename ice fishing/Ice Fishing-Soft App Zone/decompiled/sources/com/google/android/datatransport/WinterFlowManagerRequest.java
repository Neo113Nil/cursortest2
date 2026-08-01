package com.google.android.datatransport;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.text.Layout;
import android.util.Size;
import android.util.SizeF;
import android.view.DragEvent;
import android.view.MotionEvent;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.android.installreferrer.api.InstallReferrerClient;
import com.icewinter.flow.winter.icecatch.R;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowManagerRequest {
    public static final WinterFlowGatewayParser WinterFlowRouterStructure = new WinterFlowGatewayParser();
    public static final WinterFlowVariableEntity WinterFlowHookDataSource = new WinterFlowVariableEntity(5);
    public static final StackTraceElement[] WinterFlowCacheManagerAgent = new StackTraceElement[0];
    public static final WinterFlowBackendConcurrency WinterFlowArrayNetwork = new WinterFlowBackendConcurrency(0, new long[0], new Object[0]);

    public static final int WinterFlowArrayHelper(Layout layout, int i, boolean z) {
        if (i <= 0) {
            return 0;
        }
        if (i >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart == i || lineEnd == i) {
            if (lineStart == i) {
                if (z) {
                    return lineForOffset - 1;
                }
            } else if (!z) {
                return lineForOffset + 1;
            }
        }
        return lineForOffset;
    }

    public static final void WinterFlowArrayNetwork(WinterFlowJavaManager winterFlowJavaManager, final boolean z, final boolean z2, final boolean z3, final WinterFlowObjectUI winterFlowObjectUI, final WinterFlowObjectUI winterFlowObjectUI2, WinterFlowResolverLibrary winterFlowResolverLibrary, final int i) {
        WinterFlowResolverLibrary winterFlowResolverLibrary2;
        boolean z4;
        final WinterFlowJavaManager winterFlowJavaManager2 = winterFlowJavaManager;
        winterFlowResolverLibrary.WinterFlowFrameworkTransaction(1240820811);
        int i2 = i | (winterFlowResolverLibrary.WinterFlowCacheManagerAgent(winterFlowJavaManager2.ordinal()) ? 4 : 2) | (winterFlowResolverLibrary.WinterFlowTransactionManagerStrategy(z) ? 32 : 16) | (winterFlowResolverLibrary.WinterFlowTransactionManagerStrategy(z2) ? 256 : 128) | (winterFlowResolverLibrary.WinterFlowTransactionManagerStrategy(z3) ? 2048 : 1024) | (winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowObjectUI) ? 16384 : 8192) | (winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowObjectUI2) ? 131072 : 65536);
        if (winterFlowResolverLibrary.WinterFlowFrontendBackend(i2 & 1, (74899 & i2) != 74898)) {
            long WinterFlowHookDataSource2 = z2 ? WinterFlowInheritanceSubsystem.WinterFlowUnitTestResponse : z ? WinterFlowInheritanceSubsystem.WinterFlowHookDataSource(WinterFlowInvokerComponent.WinterFlowTransactionManagerStrategy(4284666621L), 0.6f) : WinterFlowInheritanceSubsystem.WinterFlowHookDataSource(WinterFlowInheritanceSubsystem.WinterFlowCacheManagerAgent, 0.2f);
            long WinterFlowHookDataSource3 = z2 ? WinterFlowInheritanceSubsystem.WinterFlowHookDataSource(WinterFlowInvokerComponent.WinterFlowTransactionManagerStrategy(4278336241L), 0.3f) : WinterFlowInheritanceSubsystem.WinterFlowHookDataSource(WinterFlowInheritanceSubsystem.WinterFlowHookDataSource, 0.5f);
            WinterFlowMapperManager WinterFlowSingletonPlatform = WinterFlowSingletonPlatform(WinterFlowCacheRuntime.WinterFlowSingletonPlatform(1.0f), WinterFlowRepositoryProxy.WinterFlowRouterStructure(14.0f));
            WinterFlowProcessorSessionManager winterFlowProcessorSessionManager = WinterFlowCacheRuntime.WinterFlowTransactionAgent;
            WinterFlowMapperManager WinterFlowSoftwareEngine = WinterFlowCacheRuntime.WinterFlowSoftwareEngine(WinterFlowCloudStack.WinterFlowResponseEngine(WinterFlowSoftwareException.WinterFlowConcurrencyThread(WinterFlowSoftwareException.WinterFlowOrchestrationSubsystem(WinterFlowSingletonPlatform, WinterFlowHookDataSource3, winterFlowProcessorSessionManager), z2 ? 2.0f : 1.0f, WinterFlowHookDataSource2, WinterFlowRepositoryProxy.WinterFlowRouterStructure(14.0f)), z && !z2, winterFlowObjectUI, 14), 16.0f);
            WinterFlowRendererCacheManager WinterFlowRouterStructure2 = WinterFlowWebsocketInheritance.WinterFlowRouterStructure(WinterFlowInvokerComponent.WinterFlowCacheManagerAgent, WinterFlowCacheUtility.WinterFlowConcurrencyThread, winterFlowResolverLibrary, 48);
            int hashCode = Long.hashCode(winterFlowResolverLibrary.WinterFlowConfiguration);
            WinterFlowConfigurationProcess WinterFlowTransactionAgent = winterFlowResolverLibrary.WinterFlowTransactionAgent();
            WinterFlowMapperManager WinterFlowUserManagerUserManager = WinterFlowSoftwareException.WinterFlowUserManagerUserManager(winterFlowResolverLibrary, WinterFlowSoftwareEngine);
            WinterFlowBandwidthAgent.WinterFlowCacheManagerAgent.getClass();
            WinterFlowConfigurationRequest winterFlowConfigurationRequest = WinterFlowEventEmitterDeserialization.WinterFlowHookDataSource;
            winterFlowResolverLibrary.WinterFlowModuleAgent();
            if (winterFlowResolverLibrary.WinterFlowProxyStructure) {
                winterFlowResolverLibrary.WinterFlowResponseEngine(winterFlowConfigurationRequest);
            } else {
                winterFlowResolverLibrary.WinterFlowParserPipeline();
            }
            WinterFlowExceptionBackend winterFlowExceptionBackend = WinterFlowEventEmitterDeserialization.WinterFlowVariableVersionControl;
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend, winterFlowResolverLibrary, WinterFlowRouterStructure2);
            WinterFlowExceptionBackend winterFlowExceptionBackend2 = WinterFlowEventEmitterDeserialization.WinterFlowArrayNetwork;
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend2, winterFlowResolverLibrary, WinterFlowTransactionAgent);
            Integer valueOf = Integer.valueOf(hashCode);
            WinterFlowExceptionBackend winterFlowExceptionBackend3 = WinterFlowEventEmitterDeserialization.WinterFlowTransactionManagerStrategy;
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend3, winterFlowResolverLibrary, valueOf);
            WinterFlowServiceProviderBatch winterFlowServiceProviderBatch = WinterFlowEventEmitterDeserialization.WinterFlowUnitTestResponse;
            WinterFlowProtocolNetwork.WinterFlowRouterRouter(winterFlowResolverLibrary, winterFlowServiceProviderBatch);
            WinterFlowExceptionBackend winterFlowExceptionBackend4 = WinterFlowEventEmitterDeserialization.WinterFlowCacheManagerAgent;
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend4, winterFlowResolverLibrary, WinterFlowUserManagerUserManager);
            WinterFlowHookServer winterFlowHookServer = new WinterFlowHookServer(1.0f, true);
            WinterFlowRepositoryObject WinterFlowRouterStructure3 = WinterFlowConsumerDataSource.WinterFlowRouterStructure(WinterFlowInvokerComponent.WinterFlowArrayNetwork, WinterFlowCacheUtility.WinterFlowSingletonPlatform, winterFlowResolverLibrary, 0);
            int hashCode2 = Long.hashCode(winterFlowResolverLibrary.WinterFlowConfiguration);
            WinterFlowConfigurationProcess WinterFlowTransactionAgent2 = winterFlowResolverLibrary.WinterFlowTransactionAgent();
            WinterFlowMapperManager WinterFlowUserManagerUserManager2 = WinterFlowSoftwareException.WinterFlowUserManagerUserManager(winterFlowResolverLibrary, winterFlowHookServer);
            winterFlowResolverLibrary.WinterFlowModuleAgent();
            if (winterFlowResolverLibrary.WinterFlowProxyStructure) {
                winterFlowResolverLibrary.WinterFlowResponseEngine(winterFlowConfigurationRequest);
            } else {
                winterFlowResolverLibrary.WinterFlowParserPipeline();
            }
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend, winterFlowResolverLibrary, WinterFlowRouterStructure3);
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend2, winterFlowResolverLibrary, WinterFlowTransactionAgent2);
            WinterFlowResolverBackend.WinterFlowConcurrencyThread(hashCode2, winterFlowResolverLibrary, winterFlowExceptionBackend3, winterFlowResolverLibrary, winterFlowServiceProviderBatch);
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend4, winterFlowResolverLibrary, WinterFlowUserManagerUserManager2);
            String name = winterFlowJavaManager2.name();
            long j = z2 ? WinterFlowInheritanceSubsystem.WinterFlowUnitTestResponse : WinterFlowInheritanceSubsystem.WinterFlowCacheManagerAgent;
            long WinterFlowBatchUI = WinterFlowDecoratorUI.WinterFlowBatchUI(18);
            WinterFlowObjectHook winterFlowObjectHook = WinterFlowObjectHook.WinterFlowTransactionAgent;
            WinterFlowSingletonRuntime.WinterFlowHookDataSource(name, null, j, WinterFlowBatchUI, winterFlowObjectHook, 0L, null, 0L, 0, false, 0, 0, null, winterFlowResolverLibrary, 1597440, 262058);
            WinterFlowProtocolNetwork.WinterFlowRouterStructure(winterFlowResolverLibrary, WinterFlowCacheRuntime.WinterFlowArrayHelper(4.0f));
            String str = winterFlowJavaManager2.WinterFlowVariableVersionControl + " FISH / " + winterFlowJavaManager2.WinterFlowTransactionManagerStrategy + " SECONDS";
            long j2 = WinterFlowInheritanceSubsystem.WinterFlowCacheManagerAgent;
            WinterFlowSingletonRuntime.WinterFlowHookDataSource(str, null, WinterFlowInheritanceSubsystem.WinterFlowHookDataSource(j2, 0.8f), WinterFlowDecoratorUI.WinterFlowBatchUI(14), null, 0L, null, 0L, 0, false, 0, 0, null, winterFlowResolverLibrary, 24960, 262122);
            winterFlowResolverLibrary2 = winterFlowResolverLibrary;
            winterFlowResolverLibrary2.WinterFlowBandwidthObject(true);
            if (z) {
                winterFlowResolverLibrary2.WinterFlowCompilerDataSource(177746562);
                if (z2) {
                    winterFlowResolverLibrary2.WinterFlowCompilerDataSource(177775082);
                    WinterFlowMapperManager WinterFlowSingletonPlatform2 = WinterFlowSingletonPlatform(WinterFlowValidatorComponent.WinterFlowRouterStructure, WinterFlowRepositoryProxy.WinterFlowRouterStructure(6.0f));
                    long j3 = WinterFlowInheritanceSubsystem.WinterFlowUnitTestResponse;
                    WinterFlowMapperManager WinterFlowSyntaxSubsystem = WinterFlowCacheRuntime.WinterFlowSyntaxSubsystem(WinterFlowSoftwareException.WinterFlowConcurrencyThread(WinterFlowSoftwareException.WinterFlowOrchestrationSubsystem(WinterFlowSingletonPlatform2, WinterFlowInheritanceSubsystem.WinterFlowHookDataSource(j3, 0.2f), winterFlowProcessorSessionManager), 1.0f, j3, WinterFlowRepositoryProxy.WinterFlowRouterStructure(6.0f)), 12.0f, 6.0f);
                    WinterFlowWorkerModule WinterFlowCacheManagerAgent2 = WinterFlowLibrary.WinterFlowCacheManagerAgent(WinterFlowCacheUtility.WinterFlowUnitTestResponse, false);
                    int hashCode3 = Long.hashCode(winterFlowResolverLibrary2.WinterFlowConfiguration);
                    WinterFlowConfigurationProcess WinterFlowTransactionAgent3 = winterFlowResolverLibrary2.WinterFlowTransactionAgent();
                    WinterFlowMapperManager WinterFlowUserManagerUserManager3 = WinterFlowSoftwareException.WinterFlowUserManagerUserManager(winterFlowResolverLibrary2, WinterFlowSyntaxSubsystem);
                    winterFlowResolverLibrary2.WinterFlowModuleAgent();
                    if (winterFlowResolverLibrary2.WinterFlowProxyStructure) {
                        winterFlowResolverLibrary2.WinterFlowResponseEngine(winterFlowConfigurationRequest);
                    } else {
                        winterFlowResolverLibrary2.WinterFlowParserPipeline();
                    }
                    WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend, winterFlowResolverLibrary2, WinterFlowCacheManagerAgent2);
                    WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend2, winterFlowResolverLibrary2, WinterFlowTransactionAgent3);
                    WinterFlowResolverBackend.WinterFlowConcurrencyThread(hashCode3, winterFlowResolverLibrary2, winterFlowExceptionBackend3, winterFlowResolverLibrary2, winterFlowServiceProviderBatch);
                    WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend4, winterFlowResolverLibrary2, WinterFlowUserManagerUserManager3);
                    z4 = false;
                    WinterFlowSingletonRuntime.WinterFlowHookDataSource("ACTIVE", null, j3, WinterFlowDecoratorUI.WinterFlowBatchUI(12), winterFlowObjectHook, 0L, null, 0L, 0, false, 0, 0, null, winterFlowResolverLibrary, 1597830, 262058);
                    winterFlowResolverLibrary2 = winterFlowResolverLibrary;
                    winterFlowResolverLibrary2.WinterFlowBandwidthObject(true);
                    winterFlowResolverLibrary2.WinterFlowBandwidthObject(false);
                } else {
                    z4 = false;
                    winterFlowResolverLibrary2.WinterFlowCompilerDataSource(178368019);
                    winterFlowResolverLibrary2.WinterFlowBandwidthObject(false);
                }
                winterFlowResolverLibrary2.WinterFlowBandwidthObject(z4);
            } else {
                winterFlowResolverLibrary2.WinterFlowCompilerDataSource(178410551);
                WinterFlowMapperManager WinterFlowResponseEngine = WinterFlowCloudStack.WinterFlowResponseEngine(WinterFlowSingletonPlatform(WinterFlowServerManager.WinterFlowBackendCacheManager(WinterFlowCacheRuntime.WinterFlowOrchestrationConfiguration(WinterFlowCacheRuntime.WinterFlowArrayHelper(40.0f), 100.0f), WinterFlowSoftwareException.WinterFlowTestingNode(R.drawable.button, winterFlowResolverLibrary2, 0), WinterFlowThreadConfiguration.WinterFlowCacheManagerAgent, z3 ? 1.0f : 0.5f, 38), WinterFlowRepositoryProxy.WinterFlowRouterStructure(8.0f)), z3, winterFlowObjectUI2, 14);
                WinterFlowWorkerModule WinterFlowCacheManagerAgent3 = WinterFlowLibrary.WinterFlowCacheManagerAgent(WinterFlowCacheUtility.WinterFlowTransactionAgent, false);
                int hashCode4 = Long.hashCode(winterFlowResolverLibrary2.WinterFlowConfiguration);
                WinterFlowConfigurationProcess WinterFlowTransactionAgent4 = winterFlowResolverLibrary2.WinterFlowTransactionAgent();
                WinterFlowMapperManager WinterFlowUserManagerUserManager4 = WinterFlowSoftwareException.WinterFlowUserManagerUserManager(winterFlowResolverLibrary2, WinterFlowResponseEngine);
                winterFlowResolverLibrary2.WinterFlowModuleAgent();
                if (winterFlowResolverLibrary2.WinterFlowProxyStructure) {
                    winterFlowResolverLibrary2.WinterFlowResponseEngine(winterFlowConfigurationRequest);
                } else {
                    winterFlowResolverLibrary2.WinterFlowParserPipeline();
                }
                WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend, winterFlowResolverLibrary2, WinterFlowCacheManagerAgent3);
                WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend2, winterFlowResolverLibrary2, WinterFlowTransactionAgent4);
                WinterFlowResolverBackend.WinterFlowConcurrencyThread(hashCode4, winterFlowResolverLibrary2, winterFlowExceptionBackend3, winterFlowResolverLibrary2, winterFlowServiceProviderBatch);
                WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend4, winterFlowResolverLibrary2, WinterFlowUserManagerUserManager4);
                winterFlowJavaManager2 = winterFlowJavaManager;
                WinterFlowSingletonRuntime.WinterFlowHookDataSource(winterFlowJavaManager2.WinterFlowUnitTestResponse + " PTS", null, j2, WinterFlowDecoratorUI.WinterFlowBatchUI(12), winterFlowObjectHook, 0L, null, 0L, 0, false, 0, 0, null, winterFlowResolverLibrary2, 1597824, 262058);
                winterFlowResolverLibrary2 = winterFlowResolverLibrary2;
                winterFlowResolverLibrary2.WinterFlowBandwidthObject(true);
                winterFlowResolverLibrary2.WinterFlowBandwidthObject(false);
            }
            winterFlowResolverLibrary2.WinterFlowBandwidthObject(true);
        } else {
            winterFlowResolverLibrary2 = winterFlowResolverLibrary;
            winterFlowResolverLibrary2.WinterFlowQueueService();
        }
        WinterFlowStackEngine WinterFlowConcurrencyThread = winterFlowResolverLibrary2.WinterFlowConcurrencyThread();
        if (WinterFlowConcurrencyThread != null) {
            WinterFlowConcurrencyThread.WinterFlowArrayNetwork = new WinterFlowEventEvent(z, z2, z3, winterFlowObjectUI, winterFlowObjectUI2, i) { // from class: com.google.android.datatransport.WinterFlowVersionMiddleware
                public final /* synthetic */ WinterFlowObjectUI WinterFlowResponseEngine;
                public final /* synthetic */ boolean WinterFlowRouterRouter;
                public final /* synthetic */ WinterFlowObjectUI WinterFlowSyntax;
                public final /* synthetic */ boolean WinterFlowTransactionManagerStrategy;
                public final /* synthetic */ boolean WinterFlowUnitTestResponse;

                @Override // com.google.android.datatransport.WinterFlowEventEvent
                public final Object WinterFlowVariableVersionControl(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int WinterFlowResponseEngine2 = WinterFlowConfigurationException.WinterFlowResponseEngine(1);
                    WinterFlowManagerRequest.WinterFlowArrayNetwork(WinterFlowJavaManager.this, this.WinterFlowTransactionManagerStrategy, this.WinterFlowUnitTestResponse, this.WinterFlowRouterRouter, this.WinterFlowSyntax, this.WinterFlowResponseEngine, (WinterFlowResolverLibrary) obj, WinterFlowResponseEngine2);
                    return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                }
            };
        }
    }

    public static final boolean WinterFlowBackendCacheManager(WinterFlowEncryptionServer winterFlowEncryptionServer) {
        WinterFlowObjectBackend winterFlowObjectBackend;
        WinterFlowUnitTestStructure winterFlowUnitTestStructure = winterFlowEncryptionServer.WinterFlowCacheManagerAgent;
        WinterFlowProcessorProcessor winterFlowProcessorProcessor = (winterFlowUnitTestStructure == null || (winterFlowObjectBackend = winterFlowUnitTestStructure.WinterFlowRouterStructure) == null) ? null : new WinterFlowProcessorProcessor(winterFlowObjectBackend.WinterFlowHookDataSource);
        boolean z = false;
        if (winterFlowProcessorProcessor != null && winterFlowProcessorProcessor.WinterFlowRouterStructure == 1) {
            z = true;
        }
        return !z;
    }

    public static final int WinterFlowBandwidthObject(int i, int i2) {
        return i << (((i2 % 10) * 3) + 1);
    }

    public static int WinterFlowBatchUI(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    public static final WinterFlowJavaHandler WinterFlowCacheManagerAgent(String str) {
        Set singleton = Collections.singleton(str);
        singleton.getClass();
        return new WinterFlowJavaHandler(singleton);
    }

    public static final WinterFlowMapperManager WinterFlowCacheManagerListener(WinterFlowMapperManager winterFlowMapperManager, WinterFlowObjectSession winterFlowObjectSession) {
        return winterFlowMapperManager.WinterFlowCacheManagerAgent(new WinterFlowOrchestrationSubsystem(winterFlowObjectSession));
    }

    public static void WinterFlowCloudMicroservice(String str) {
        WinterFlowServerSystem winterFlowServerSystem = new WinterFlowServerSystem(WinterFlowResolverBackend.WinterFlowResponseEngine("lateinit property ", str, " has not been initialized"));
        WinterFlowTestingNode(winterFlowServerSystem, WinterFlowManagerRequest.class.getName());
        throw winterFlowServerSystem;
    }

    public static final void WinterFlowCompilerHandler(WinterFlowConcurrencySubsystem winterFlowConcurrencySubsystem, int i, Object obj) {
        winterFlowConcurrencySubsystem.WinterFlowBandwidthObject[(winterFlowConcurrencySubsystem.WinterFlowOrchestrationSubsystem - winterFlowConcurrencySubsystem.WinterFlowTransactionAgent[winterFlowConcurrencySubsystem.WinterFlowServerProtocol - 1].WinterFlowHookDataSource) + i] = obj;
    }

    public static final WinterFlowPipelineBackend WinterFlowCompilerVariable(WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice) {
        WinterFlowPipelineBackend winterFlowPipelineBackend = (WinterFlowPipelineBackend) winterFlowEncryptionMicroservice.WinterFlowConsumerUserManager(WinterFlowCacheUtility.WinterFlowSoftwareProtocol);
        if (winterFlowPipelineBackend != null) {
            return winterFlowPipelineBackend;
        }
        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
        return null;
    }

    public static final boolean WinterFlowConcurrencyThread(WinterFlowDeploymentWidget winterFlowDeploymentWidget, boolean z) {
        int ordinal = winterFlowDeploymentWidget.WinterFlowEncryptionAdapter().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                WinterFlowDeploymentWidget WinterFlowMapperProtocol = WinterFlowCloudStack.WinterFlowMapperProtocol(winterFlowDeploymentWidget);
                if (!(WinterFlowMapperProtocol != null ? WinterFlowConcurrencyThread(WinterFlowMapperProtocol, z) : true)) {
                    return false;
                }
                winterFlowDeploymentWidget.WinterFlowUIPlatform(WinterFlowProtocolCache.WinterFlowTransactionManagerStrategy, WinterFlowProtocolCache.WinterFlowUnitTestResponse);
                return true;
            }
            if (ordinal == 2) {
                return z;
            }
            if (ordinal != 3) {
                WinterFlowEventEmitterOrchestration.WinterFlowRouterStructure();
                return false;
            }
        }
        return true;
    }

    public static final long WinterFlowConfigurationSubsystem(WinterFlowJSONDecorator winterFlowJSONDecorator) {
        DragEvent dragEvent = (DragEvent) winterFlowJSONDecorator.WinterFlowTransactionManagerStrategy;
        float x = dragEvent.getX();
        float y = dragEvent.getY();
        return (Float.floatToRawIntBits(x) << 32) | (Float.floatToRawIntBits(y) & 4294967295L);
    }

    public static final WinterFlowDataSourceHelper WinterFlowConsumerUserManager(WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice) {
        WinterFlowStrategyPackage WinterFlowConsumerUserManager = winterFlowEncryptionMicroservice.WinterFlowConsumerUserManager(WinterFlowCacheUtility.WinterFlowMapperProtocol);
        WinterFlowDataSourceHelper winterFlowDataSourceHelper = WinterFlowConsumerUserManager instanceof WinterFlowDataSourceHelper ? (WinterFlowDataSourceHelper) WinterFlowConsumerUserManager : null;
        return winterFlowDataSourceHelper == null ? WinterFlowPipelineFramework.WinterFlowRouterStructure : winterFlowDataSourceHelper;
    }

    public static boolean WinterFlowEventEmitterController() {
        try {
            if (WinterFlowSyntaxTransactionManager.WinterFlowHandlerConsumer == null) {
                WinterFlowSyntaxTransactionManager.WinterFlowHandlerConsumer = Class.forName("android.os.SystemProperties");
            }
            Method method = WinterFlowSyntaxTransactionManager.WinterFlowRendererPackage;
            if (method == null) {
                Class cls = WinterFlowSyntaxTransactionManager.WinterFlowHandlerConsumer;
                method = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
                WinterFlowSyntaxTransactionManager.WinterFlowRendererPackage = method;
            }
            Object invoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
            return WinterFlowThreadListener(invoke instanceof Boolean ? (Boolean) invoke : null, Boolean.TRUE);
        } catch (Exception unused) {
            return false;
        }
    }

    public static final void WinterFlowFrontendBackend(WinterFlowConcurrencySubsystem winterFlowConcurrencySubsystem, int i, Object obj, int i2, Object obj2) {
        int i3 = winterFlowConcurrencySubsystem.WinterFlowOrchestrationSubsystem - winterFlowConcurrencySubsystem.WinterFlowTransactionAgent[winterFlowConcurrencySubsystem.WinterFlowServerProtocol - 1].WinterFlowHookDataSource;
        Object[] objArr = winterFlowConcurrencySubsystem.WinterFlowBandwidthObject;
        objArr[i + i3] = obj;
        objArr[i3 + i2] = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void WinterFlowHookDataSource(final String str, final WinterFlowMapperManager winterFlowMapperManager, final WinterFlowEncryptionServer winterFlowEncryptionServer, final int i, final boolean z, final int i2, final int i3, WinterFlowResolverLibrary winterFlowResolverLibrary, final int i4) {
        int i5;
        int i6;
        boolean z2;
        boolean z3;
        boolean z4;
        winterFlowResolverLibrary.WinterFlowFrameworkTransaction(-1040751001);
        if ((i4 & 6) == 0) {
            i5 = (winterFlowResolverLibrary.WinterFlowVariableVersionControl(str) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowMapperManager) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowEncryptionServer) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= winterFlowResolverLibrary.WinterFlowUnitTestResponse(null) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i6 = i;
            i5 |= winterFlowResolverLibrary.WinterFlowCacheManagerAgent(i6) ? 16384 : 8192;
        } else {
            i6 = i;
        }
        if ((196608 & i4) == 0) {
            z2 = z;
            i5 |= winterFlowResolverLibrary.WinterFlowTransactionManagerStrategy(z2) ? 131072 : 65536;
        } else {
            z2 = z;
        }
        if ((1572864 & i4) == 0) {
            i5 |= winterFlowResolverLibrary.WinterFlowCacheManagerAgent(i2) ? 1048576 : 524288;
        }
        if ((12582912 & i4) == 0) {
            i5 |= winterFlowResolverLibrary.WinterFlowCacheManagerAgent(i3) ? 8388608 : 4194304;
        }
        int i7 = i5 | 100663296;
        if ((805306368 & i4) == 0) {
            i7 |= (1073741824 & i4) == 0 ? winterFlowResolverLibrary.WinterFlowVariableVersionControl(null) : winterFlowResolverLibrary.WinterFlowUnitTestResponse(null) ? 536870912 : 268435456;
        }
        if (winterFlowResolverLibrary.WinterFlowFrontendBackend(i7 & 1, (306783379 & i7) != 306783378)) {
            if (i3 <= 0 || i2 <= 0) {
                WinterFlowValidatorConsumer.WinterFlowRouterStructure("both minLines " + i3 + " and maxLines " + i2 + " must be greater than zero");
            }
            if (i3 > i2) {
                WinterFlowValidatorConsumer.WinterFlowRouterStructure("minLines " + i3 + " must be less than or equal to maxLines " + i2);
            }
            if (winterFlowResolverLibrary.WinterFlowSyntax(WinterFlowRendererConsumer.WinterFlowRouterStructure) != null) {
                WinterFlowEventEmitterOrchestration.WinterFlowVariableBandwidth();
                return;
            }
            winterFlowResolverLibrary.WinterFlowCompilerDataSource(356914239);
            winterFlowResolverLibrary.WinterFlowBandwidthObject(false);
            WinterFlowDatabaseGateway winterFlowDatabaseGateway = (WinterFlowDatabaseGateway) winterFlowResolverLibrary.WinterFlowSyntax(WinterFlowBackendTransactionManager.WinterFlowTransactionAgent);
            Executor executor = (Executor) winterFlowResolverLibrary.WinterFlowSyntax(WinterFlowWebsocketComponent.WinterFlowRouterStructure);
            if (executor != null) {
                int length = str.length();
                if (Build.VERSION.SDK_INT >= 28 && length >= 8 && length < 1000) {
                    Boolean bool = WinterFlowWebsocketComponent.WinterFlowHookDataSource;
                    if (bool == null) {
                        bool = Boolean.valueOf(Runtime.getRuntime().availableProcessors() >= 4);
                        WinterFlowWebsocketComponent.WinterFlowHookDataSource = bool;
                    }
                    if (bool.booleanValue()) {
                        winterFlowResolverLibrary.WinterFlowCompilerDataSource(1254298614);
                        try {
                            z3 = false;
                            z4 = true;
                            try {
                                executor.execute(new WinterFlowInvokerManager(winterFlowEncryptionServer, (WinterFlowCacheManagerConfiguration) winterFlowResolverLibrary.WinterFlowSyntax(WinterFlowBackendTransactionManager.WinterFlowServiceUtility), str, (WinterFlowConcurrencyParser) winterFlowResolverLibrary.WinterFlowSyntax(WinterFlowBackendTransactionManager.WinterFlowRouterRouter), winterFlowDatabaseGateway, 0));
                            } catch (RejectedExecutionException unused) {
                            }
                        } catch (RejectedExecutionException unused2) {
                            z4 = true;
                            z3 = false;
                        }
                        winterFlowResolverLibrary.WinterFlowBandwidthObject(z3);
                        winterFlowResolverLibrary.WinterFlowCompilerDataSource(357875859);
                        winterFlowResolverLibrary.WinterFlowBandwidthObject(z3);
                        boolean z5 = z4;
                        WinterFlowMapperManager WinterFlowCacheManagerAgent2 = winterFlowMapperManager.WinterFlowCacheManagerAgent(new WinterFlowProtocolConsumer(str, winterFlowEncryptionServer, winterFlowDatabaseGateway, i6, z2, i2, i3));
                        WinterFlowRefactoringSubsystem winterFlowRefactoringSubsystem = WinterFlowRefactoringSubsystem.WinterFlowArrayNetwork;
                        int hashCode = Long.hashCode(winterFlowResolverLibrary.WinterFlowConfiguration);
                        WinterFlowMapperManager WinterFlowUserManagerUserManager = WinterFlowSoftwareException.WinterFlowUserManagerUserManager(winterFlowResolverLibrary, WinterFlowCacheManagerAgent2);
                        WinterFlowConfigurationProcess WinterFlowTransactionAgent = winterFlowResolverLibrary.WinterFlowTransactionAgent();
                        WinterFlowBandwidthAgent.WinterFlowCacheManagerAgent.getClass();
                        WinterFlowConfigurationRequest winterFlowConfigurationRequest = WinterFlowEventEmitterDeserialization.WinterFlowHookDataSource;
                        winterFlowResolverLibrary.WinterFlowModuleAgent();
                        if (winterFlowResolverLibrary.WinterFlowProxyStructure) {
                            winterFlowResolverLibrary.WinterFlowParserPipeline();
                        } else {
                            winterFlowResolverLibrary.WinterFlowResponseEngine(winterFlowConfigurationRequest);
                        }
                        WinterFlowProtocolNetwork.WinterFlowSyntax(WinterFlowEventEmitterDeserialization.WinterFlowVariableVersionControl, winterFlowResolverLibrary, winterFlowRefactoringSubsystem);
                        WinterFlowProtocolNetwork.WinterFlowSyntax(WinterFlowEventEmitterDeserialization.WinterFlowArrayNetwork, winterFlowResolverLibrary, WinterFlowTransactionAgent);
                        WinterFlowProtocolNetwork.WinterFlowRouterRouter(winterFlowResolverLibrary, WinterFlowEventEmitterDeserialization.WinterFlowUnitTestResponse);
                        WinterFlowProtocolNetwork.WinterFlowSyntax(WinterFlowEventEmitterDeserialization.WinterFlowCacheManagerAgent, winterFlowResolverLibrary, WinterFlowUserManagerUserManager);
                        WinterFlowProtocolNetwork.WinterFlowSyntax(WinterFlowEventEmitterDeserialization.WinterFlowTransactionManagerStrategy, winterFlowResolverLibrary, Integer.valueOf(hashCode));
                        winterFlowResolverLibrary.WinterFlowBandwidthObject(z5);
                    }
                }
                z4 = true;
                z3 = false;
            } else {
                z3 = false;
                z4 = true;
            }
            winterFlowResolverLibrary.WinterFlowCompilerDataSource(1255914055);
            winterFlowResolverLibrary.WinterFlowBandwidthObject(z3);
            winterFlowResolverLibrary.WinterFlowCompilerDataSource(357875859);
            winterFlowResolverLibrary.WinterFlowBandwidthObject(z3);
            boolean z52 = z4;
            WinterFlowMapperManager WinterFlowCacheManagerAgent22 = winterFlowMapperManager.WinterFlowCacheManagerAgent(new WinterFlowProtocolConsumer(str, winterFlowEncryptionServer, winterFlowDatabaseGateway, i6, z2, i2, i3));
            WinterFlowRefactoringSubsystem winterFlowRefactoringSubsystem2 = WinterFlowRefactoringSubsystem.WinterFlowArrayNetwork;
            int hashCode2 = Long.hashCode(winterFlowResolverLibrary.WinterFlowConfiguration);
            WinterFlowMapperManager WinterFlowUserManagerUserManager2 = WinterFlowSoftwareException.WinterFlowUserManagerUserManager(winterFlowResolverLibrary, WinterFlowCacheManagerAgent22);
            WinterFlowConfigurationProcess WinterFlowTransactionAgent2 = winterFlowResolverLibrary.WinterFlowTransactionAgent();
            WinterFlowBandwidthAgent.WinterFlowCacheManagerAgent.getClass();
            WinterFlowConfigurationRequest winterFlowConfigurationRequest2 = WinterFlowEventEmitterDeserialization.WinterFlowHookDataSource;
            winterFlowResolverLibrary.WinterFlowModuleAgent();
            if (winterFlowResolverLibrary.WinterFlowProxyStructure) {
            }
            WinterFlowProtocolNetwork.WinterFlowSyntax(WinterFlowEventEmitterDeserialization.WinterFlowVariableVersionControl, winterFlowResolverLibrary, winterFlowRefactoringSubsystem2);
            WinterFlowProtocolNetwork.WinterFlowSyntax(WinterFlowEventEmitterDeserialization.WinterFlowArrayNetwork, winterFlowResolverLibrary, WinterFlowTransactionAgent2);
            WinterFlowProtocolNetwork.WinterFlowRouterRouter(winterFlowResolverLibrary, WinterFlowEventEmitterDeserialization.WinterFlowUnitTestResponse);
            WinterFlowProtocolNetwork.WinterFlowSyntax(WinterFlowEventEmitterDeserialization.WinterFlowCacheManagerAgent, winterFlowResolverLibrary, WinterFlowUserManagerUserManager2);
            WinterFlowProtocolNetwork.WinterFlowSyntax(WinterFlowEventEmitterDeserialization.WinterFlowTransactionManagerStrategy, winterFlowResolverLibrary, Integer.valueOf(hashCode2));
            winterFlowResolverLibrary.WinterFlowBandwidthObject(z52);
        } else {
            winterFlowResolverLibrary.WinterFlowQueueService();
        }
        WinterFlowStackEngine WinterFlowConcurrencyThread = winterFlowResolverLibrary.WinterFlowConcurrencyThread();
        if (WinterFlowConcurrencyThread != null) {
            WinterFlowConcurrencyThread.WinterFlowArrayNetwork = new WinterFlowEventEvent() { // from class: com.google.android.datatransport.WinterFlowArrayEntity
                @Override // com.google.android.datatransport.WinterFlowEventEvent
                public final Object WinterFlowVariableVersionControl(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    WinterFlowManagerRequest.WinterFlowHookDataSource(str, winterFlowMapperManager, winterFlowEncryptionServer, i, z, i2, i3, (WinterFlowResolverLibrary) obj, WinterFlowConfigurationException.WinterFlowResponseEngine(i4 | 1));
                    return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                }
            };
        }
    }

    public static final WinterFlowServerProtocol WinterFlowMapperProtocol(Enum[] enumArr) {
        enumArr.getClass();
        return new WinterFlowServerProtocol(enumArr);
    }

    public static final Bundle WinterFlowOrchestrationSubsystem(WinterFlowServerPlatform... winterFlowServerPlatformArr) {
        Bundle bundle = new Bundle(winterFlowServerPlatformArr.length);
        for (WinterFlowServerPlatform winterFlowServerPlatform : winterFlowServerPlatformArr) {
            String str = (String) winterFlowServerPlatform.WinterFlowVariableVersionControl;
            Object obj = winterFlowServerPlatform.WinterFlowTransactionManagerStrategy;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                componentType.getClass();
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + "\"");
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                bundle.putSize(str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + "\"");
                }
                bundle.putSizeF(str, (SizeF) obj);
            }
        }
        return bundle;
    }

    public static final WinterFlowProxyMechanism WinterFlowPackageIDE(WinterFlowDeploymentWidget winterFlowDeploymentWidget, int i) {
        int ordinal = winterFlowDeploymentWidget.WinterFlowEncryptionAdapter().ordinal();
        WinterFlowProxyMechanism winterFlowProxyMechanism = WinterFlowProxyMechanism.WinterFlowVariableVersionControl;
        if (ordinal != 0) {
            WinterFlowProxyMechanism winterFlowProxyMechanism2 = WinterFlowProxyMechanism.WinterFlowTransactionManagerStrategy;
            if (ordinal == 1) {
                WinterFlowDeploymentWidget WinterFlowMapperProtocol = WinterFlowCloudStack.WinterFlowMapperProtocol(winterFlowDeploymentWidget);
                if (WinterFlowMapperProtocol == null) {
                    WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("ActiveParent with no focused child");
                    return null;
                }
                WinterFlowProxyMechanism WinterFlowPackageIDE = WinterFlowPackageIDE(WinterFlowMapperProtocol, i);
                WinterFlowProxyMechanism winterFlowProxyMechanism3 = WinterFlowPackageIDE != winterFlowProxyMechanism ? WinterFlowPackageIDE : null;
                if (winterFlowProxyMechanism3 != null) {
                    return winterFlowProxyMechanism3;
                }
                if (winterFlowDeploymentWidget.WinterFlowRouterAdapter) {
                    return winterFlowProxyMechanism;
                }
                winterFlowDeploymentWidget.WinterFlowRouterAdapter = true;
                try {
                    WinterFlowConsumerListener WinterFlowUserManagerConcurrency = winterFlowDeploymentWidget.WinterFlowUserManagerConcurrency();
                    WinterFlowViewEvent winterFlowViewEvent = new WinterFlowViewEvent(i);
                    WinterFlowHookMechanism winterFlowHookMechanism = (WinterFlowHookMechanism) ((WinterFlowSyntaxTransactionManager) WinterFlowCloudStack.WinterFlowTestingNode(winterFlowDeploymentWidget)).getFocusOwner();
                    WinterFlowDeploymentWidget WinterFlowTransactionManagerStrategy = winterFlowHookMechanism.WinterFlowTransactionManagerStrategy();
                    WinterFlowUserManagerConcurrency.WinterFlowTransactionAgent.WinterFlowUnitTestResponse(winterFlowViewEvent);
                    WinterFlowDeploymentWidget WinterFlowTransactionManagerStrategy2 = winterFlowHookMechanism.WinterFlowTransactionManagerStrategy();
                    if (!winterFlowViewEvent.WinterFlowHookDataSource) {
                        return (WinterFlowTransactionManagerStrategy == WinterFlowTransactionManagerStrategy2 || WinterFlowTransactionManagerStrategy2 == null) ? winterFlowProxyMechanism : WinterFlowAlgorithmModule.WinterFlowArrayNetwork == WinterFlowAlgorithmModule.WinterFlowCacheManagerAgent ? winterFlowProxyMechanism2 : WinterFlowProxyMechanism.WinterFlowUnitTestResponse;
                    }
                    WinterFlowAlgorithmModule winterFlowAlgorithmModule = WinterFlowAlgorithmModule.WinterFlowHookDataSource;
                    return winterFlowProxyMechanism2;
                } finally {
                    winterFlowDeploymentWidget.WinterFlowRouterAdapter = false;
                }
            }
            if (ordinal == 2) {
                return winterFlowProxyMechanism2;
            }
            if (ordinal != 3) {
                WinterFlowEventEmitterOrchestration.WinterFlowRouterStructure();
                return null;
            }
        }
        return winterFlowProxyMechanism;
    }

    public static final void WinterFlowQueueService(WinterFlowCacheManagerUtility winterFlowCacheManagerUtility, long j, WinterFlowObjectSession winterFlowObjectSession, boolean z) {
        MotionEvent WinterFlowRouterStructure2 = winterFlowCacheManagerUtility.WinterFlowRouterStructure();
        if (WinterFlowRouterStructure2 == null) {
            WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("The PointerEvent receiver cannot have a null MotionEvent.");
            return;
        }
        int action = WinterFlowRouterStructure2.getAction();
        if (z) {
            WinterFlowRouterStructure2.setAction(3);
        }
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        WinterFlowRouterStructure2.offsetLocation(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
        winterFlowObjectSession.WinterFlowUnitTestResponse(WinterFlowRouterStructure2);
        WinterFlowRouterStructure2.offsetLocation(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        WinterFlowRouterStructure2.setAction(action);
    }

    public static final String[] WinterFlowResolverController(WinterFlowCacheManagerService winterFlowCacheManagerService) {
        winterFlowCacheManagerService.getClass();
        return (String[]) ((WinterFlowJavaHandler) winterFlowCacheManagerService).WinterFlowHookDataSource.toArray(new String[0]);
    }

    public static final void WinterFlowResponseEngine(WinterFlowMapperManager winterFlowMapperManager, WinterFlowResolverLibrary winterFlowResolverLibrary, int i) {
        winterFlowResolverLibrary.WinterFlowFrameworkTransaction(-908597602);
        int i2 = 2;
        int i3 = (winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowMapperManager) ? 4 : 2) | i;
        int i4 = 1;
        if (winterFlowResolverLibrary.WinterFlowFrontendBackend(i3 & 1, (i3 & 3) != 2)) {
            WinterFlowProtocolEntity winterFlowProtocolEntity = WinterFlowUnitTestProvider.WinterFlowHookDataSource;
            Object obj = (Context) winterFlowResolverLibrary.WinterFlowSyntax(winterFlowProtocolEntity);
            Object[] copyOf = Arrays.copyOf(new WinterFlowRendererRenderer[0], 0);
            WinterFlowCacheManagerVersionControl winterFlowCacheManagerVersionControl = new WinterFlowCacheManagerVersionControl(i4, new WinterFlowHandlerTool(13), new WinterFlowCompilerCloud(15, obj));
            boolean WinterFlowUnitTestResponse = winterFlowResolverLibrary.WinterFlowUnitTestResponse(obj);
            Object WinterFlowSyntaxSubsystem = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
            Object obj2 = WinterFlowModuleModule.WinterFlowRouterStructure;
            if (WinterFlowUnitTestResponse || WinterFlowSyntaxSubsystem == obj2) {
                WinterFlowSyntaxSubsystem = new WinterFlowAPISystem(9, obj);
                winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem);
            }
            WinterFlowProtocolManager winterFlowProtocolManager = (WinterFlowProtocolManager) WinterFlowWorkerVersionControl.WinterFlowServiceUtility(copyOf, winterFlowCacheManagerVersionControl, (WinterFlowObjectUI) WinterFlowSyntaxSubsystem, winterFlowResolverLibrary, 0, 4);
            Context context = (Context) winterFlowResolverLibrary.WinterFlowSyntax(winterFlowProtocolEntity);
            Object WinterFlowSyntaxSubsystem2 = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
            if (WinterFlowSyntaxSubsystem2 == obj2) {
                WinterFlowSyntaxSubsystem2 = new WinterFlowVersionControlTransactionManager(context);
                winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem2);
            }
            Object obj3 = (WinterFlowVersionControlTransactionManager) WinterFlowSyntaxSubsystem2;
            boolean WinterFlowUnitTestResponse2 = winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowProtocolManager) | winterFlowResolverLibrary.WinterFlowUnitTestResponse(obj3);
            Object WinterFlowSyntaxSubsystem3 = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
            if (WinterFlowUnitTestResponse2 || WinterFlowSyntaxSubsystem3 == obj2) {
                WinterFlowSyntaxSubsystem3 = new WinterFlowRouterCompiler(22, winterFlowProtocolManager, obj3);
                winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem3);
            }
            WinterFlowServerManager.WinterFlowVariableVersionControl(winterFlowProtocolManager, winterFlowMapperManager, null, null, null, null, null, (WinterFlowObjectSession) WinterFlowSyntaxSubsystem3, winterFlowResolverLibrary, (i3 << 6) & 896);
        } else {
            winterFlowResolverLibrary.WinterFlowQueueService();
        }
        WinterFlowStackEngine WinterFlowConcurrencyThread = winterFlowResolverLibrary.WinterFlowConcurrencyThread();
        if (WinterFlowConcurrencyThread != null) {
            WinterFlowConcurrencyThread.WinterFlowArrayNetwork = new WinterFlowSingletonEventEmitter(winterFlowMapperManager, i, i2);
        }
    }

    public static int WinterFlowRouterAdapter(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void WinterFlowRouterRouter(WinterFlowMapperManager winterFlowMapperManager, final WinterFlowObjectLayer winterFlowObjectLayer, WinterFlowObjectUI winterFlowObjectUI, WinterFlowResolverLibrary winterFlowResolverLibrary, int i) {
        final WinterFlowObjectLayer winterFlowObjectLayer2;
        WinterFlowConfigurationRequest winterFlowConfigurationRequest;
        char c;
        WinterFlowOrchestrationNetwork winterFlowOrchestrationNetwork;
        WinterFlowResolverLibrary winterFlowResolverLibrary2 = winterFlowResolverLibrary;
        winterFlowObjectLayer.getClass();
        winterFlowObjectUI.getClass();
        winterFlowResolverLibrary2.WinterFlowFrameworkTransaction(1127225856);
        int i2 = i | (winterFlowResolverLibrary2.WinterFlowVariableVersionControl(winterFlowObjectLayer) ? 32 : 16) | (winterFlowResolverLibrary2.WinterFlowUnitTestResponse(winterFlowObjectUI) ? 256 : 128);
        if (winterFlowResolverLibrary2.WinterFlowFrontendBackend(i2 & 1, (i2 & 147) != 146)) {
            final WinterFlowThreadPoolGateway WinterFlowArrayNetwork2 = WinterFlowFrameworkMechanism.WinterFlowArrayNetwork(winterFlowObjectLayer.WinterFlowSyntax, winterFlowResolverLibrary2);
            WinterFlowThreadPoolGateway WinterFlowArrayNetwork3 = WinterFlowFrameworkMechanism.WinterFlowArrayNetwork(winterFlowObjectLayer.WinterFlowTransactionAgent, winterFlowResolverLibrary2);
            WinterFlowThreadPoolGateway WinterFlowArrayNetwork4 = WinterFlowFrameworkMechanism.WinterFlowArrayNetwork(winterFlowObjectLayer.WinterFlowThreadListener, winterFlowResolverLibrary2);
            WinterFlowThreadPoolGateway WinterFlowArrayNetwork5 = WinterFlowFrameworkMechanism.WinterFlowArrayNetwork(winterFlowObjectLayer.WinterFlowBandwidthObject, winterFlowResolverLibrary2);
            WinterFlowThreadPoolGateway WinterFlowArrayNetwork6 = WinterFlowFrameworkMechanism.WinterFlowArrayNetwork(winterFlowObjectLayer.WinterFlowVariableBandwidth, winterFlowResolverLibrary2);
            WinterFlowThreadPoolGateway WinterFlowArrayNetwork7 = WinterFlowFrameworkMechanism.WinterFlowArrayNetwork(winterFlowObjectLayer.WinterFlowConcurrencyThread, winterFlowResolverLibrary2);
            final WinterFlowThreadPoolGateway WinterFlowArrayNetwork8 = WinterFlowFrameworkMechanism.WinterFlowArrayNetwork(winterFlowObjectLayer.WinterFlowRouterAdapter, winterFlowResolverLibrary2);
            Object WinterFlowSyntaxSubsystem = winterFlowResolverLibrary2.WinterFlowSyntaxSubsystem();
            WinterFlowThreadPoolProcess winterFlowThreadPoolProcess = WinterFlowModuleModule.WinterFlowRouterStructure;
            if (WinterFlowSyntaxSubsystem == winterFlowThreadPoolProcess) {
                WinterFlowSyntaxSubsystem = new WinterFlowObjectHandler(0.0f);
                winterFlowResolverLibrary2.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem);
            }
            final WinterFlowObjectHandler winterFlowObjectHandler = (WinterFlowObjectHandler) WinterFlowSyntaxSubsystem;
            Object WinterFlowSyntaxSubsystem2 = winterFlowResolverLibrary2.WinterFlowSyntaxSubsystem();
            if (WinterFlowSyntaxSubsystem2 == winterFlowThreadPoolProcess) {
                WinterFlowSyntaxSubsystem2 = WinterFlowDecoratorUI.WinterFlowSerializerStructure(new WinterFlowArrayStructure(0.0f, 0.0f));
                winterFlowResolverLibrary2.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem2);
            }
            final WinterFlowThreadPoolGateway winterFlowThreadPoolGateway = (WinterFlowThreadPoolGateway) WinterFlowSyntaxSubsystem2;
            Activity activity = (Activity) winterFlowResolverLibrary2.WinterFlowSyntax(WinterFlowAlgorithm.WinterFlowRouterStructure);
            boolean WinterFlowUnitTestResponse = winterFlowResolverLibrary2.WinterFlowUnitTestResponse(activity);
            Object WinterFlowSyntaxSubsystem3 = winterFlowResolverLibrary2.WinterFlowSyntaxSubsystem();
            int i3 = 6;
            if (WinterFlowUnitTestResponse || WinterFlowSyntaxSubsystem3 == winterFlowThreadPoolProcess) {
                WinterFlowSyntaxSubsystem3 = new WinterFlowCompilerCloud(i3, activity);
                winterFlowResolverLibrary2.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem3);
            }
            WinterFlowSoftwareException.WinterFlowHookDataSource(WinterFlowAlgorithmSession.WinterFlowRouterStructure, (WinterFlowObjectSession) WinterFlowSyntaxSubsystem3, winterFlowResolverLibrary2);
            WinterFlowMicroserviceMechanism winterFlowMicroserviceMechanism = WinterFlowCacheRuntime.WinterFlowThreadListener;
            WinterFlowMapperManager WinterFlowBackendCacheManager = WinterFlowServerManager.WinterFlowBackendCacheManager(winterFlowMapperManager.WinterFlowCacheManagerAgent(winterFlowMicroserviceMechanism), WinterFlowSoftwareException.WinterFlowTestingNode(R.drawable.bg, winterFlowResolverLibrary2, 0), WinterFlowThreadConfiguration.WinterFlowRouterStructure, 0.0f, 54);
            WinterFlowInvokerConsumer winterFlowInvokerConsumer = WinterFlowCacheUtility.WinterFlowUnitTestResponse;
            WinterFlowWorkerModule WinterFlowCacheManagerAgent2 = WinterFlowLibrary.WinterFlowCacheManagerAgent(winterFlowInvokerConsumer, false);
            int hashCode = Long.hashCode(winterFlowResolverLibrary2.WinterFlowConfiguration);
            WinterFlowConfigurationProcess WinterFlowTransactionAgent = winterFlowResolverLibrary2.WinterFlowTransactionAgent();
            WinterFlowMapperManager WinterFlowUserManagerUserManager = WinterFlowSoftwareException.WinterFlowUserManagerUserManager(winterFlowResolverLibrary2, WinterFlowBackendCacheManager);
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
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend2, winterFlowResolverLibrary2, WinterFlowTransactionAgent);
            Integer valueOf = Integer.valueOf(hashCode);
            WinterFlowExceptionBackend winterFlowExceptionBackend3 = WinterFlowEventEmitterDeserialization.WinterFlowTransactionManagerStrategy;
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend3, winterFlowResolverLibrary2, valueOf);
            WinterFlowServiceProviderBatch winterFlowServiceProviderBatch = WinterFlowEventEmitterDeserialization.WinterFlowUnitTestResponse;
            WinterFlowProtocolNetwork.WinterFlowRouterRouter(winterFlowResolverLibrary2, winterFlowServiceProviderBatch);
            WinterFlowExceptionBackend winterFlowExceptionBackend4 = WinterFlowEventEmitterDeserialization.WinterFlowCacheManagerAgent;
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend4, winterFlowResolverLibrary2, WinterFlowUserManagerUserManager);
            WinterFlowMapperManager WinterFlowSoftwareEngine = WinterFlowCacheRuntime.WinterFlowSoftwareEngine(winterFlowMicroserviceMechanism, 16.0f);
            WinterFlowMicroserviceAgent winterFlowMicroserviceAgent = WinterFlowInvokerComponent.WinterFlowArrayNetwork;
            WinterFlowConfigurationPipeline winterFlowConfigurationPipeline = WinterFlowCacheUtility.WinterFlowSingletonPlatform;
            WinterFlowRepositoryObject WinterFlowRouterStructure2 = WinterFlowConsumerDataSource.WinterFlowRouterStructure(winterFlowMicroserviceAgent, winterFlowConfigurationPipeline, winterFlowResolverLibrary2, 0);
            int hashCode2 = Long.hashCode(winterFlowResolverLibrary2.WinterFlowConfiguration);
            WinterFlowConfigurationProcess WinterFlowTransactionAgent2 = winterFlowResolverLibrary2.WinterFlowTransactionAgent();
            WinterFlowMapperManager WinterFlowUserManagerUserManager2 = WinterFlowSoftwareException.WinterFlowUserManagerUserManager(winterFlowResolverLibrary2, WinterFlowSoftwareEngine);
            winterFlowResolverLibrary2.WinterFlowModuleAgent();
            if (winterFlowResolverLibrary2.WinterFlowProxyStructure) {
                winterFlowResolverLibrary2.WinterFlowResponseEngine(winterFlowConfigurationRequest2);
            } else {
                winterFlowResolverLibrary2.WinterFlowParserPipeline();
            }
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend, winterFlowResolverLibrary2, WinterFlowRouterStructure2);
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend2, winterFlowResolverLibrary2, WinterFlowTransactionAgent2);
            WinterFlowResolverBackend.WinterFlowConcurrencyThread(hashCode2, winterFlowResolverLibrary2, winterFlowExceptionBackend3, winterFlowResolverLibrary2, winterFlowServiceProviderBatch);
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend4, winterFlowResolverLibrary2, WinterFlowUserManagerUserManager2);
            WinterFlowMapperManager WinterFlowSingletonPlatform = WinterFlowCacheRuntime.WinterFlowSingletonPlatform(1.0f);
            WinterFlowRendererCacheManager WinterFlowRouterStructure3 = WinterFlowWebsocketInheritance.WinterFlowRouterStructure(WinterFlowInvokerComponent.WinterFlowVariableVersionControl, WinterFlowCacheUtility.WinterFlowConcurrencyThread, winterFlowResolverLibrary2, 54);
            int hashCode3 = Long.hashCode(winterFlowResolverLibrary2.WinterFlowConfiguration);
            WinterFlowConfigurationProcess WinterFlowTransactionAgent3 = winterFlowResolverLibrary2.WinterFlowTransactionAgent();
            WinterFlowMapperManager WinterFlowUserManagerUserManager3 = WinterFlowSoftwareException.WinterFlowUserManagerUserManager(winterFlowResolverLibrary2, WinterFlowSingletonPlatform);
            winterFlowResolverLibrary2.WinterFlowModuleAgent();
            if (winterFlowResolverLibrary2.WinterFlowProxyStructure) {
                winterFlowResolverLibrary2.WinterFlowResponseEngine(winterFlowConfigurationRequest2);
            } else {
                winterFlowResolverLibrary2.WinterFlowParserPipeline();
            }
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend, winterFlowResolverLibrary2, WinterFlowRouterStructure3);
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend2, winterFlowResolverLibrary2, WinterFlowTransactionAgent3);
            WinterFlowResolverBackend.WinterFlowConcurrencyThread(hashCode3, winterFlowResolverLibrary2, winterFlowExceptionBackend3, winterFlowResolverLibrary2, winterFlowServiceProviderBatch);
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend4, winterFlowResolverLibrary2, WinterFlowUserManagerUserManager3);
            WinterFlowLoaderHandler WinterFlowRouterStructure4 = WinterFlowRepositoryProxy.WinterFlowRouterStructure(8.0f);
            WinterFlowValidatorComponent winterFlowValidatorComponent = WinterFlowValidatorComponent.WinterFlowRouterStructure;
            WinterFlowMapperManager WinterFlowSingletonPlatform2 = WinterFlowSingletonPlatform(winterFlowValidatorComponent, WinterFlowRouterStructure4);
            long j = WinterFlowInheritanceSubsystem.WinterFlowHookDataSource;
            long WinterFlowHookDataSource2 = WinterFlowInheritanceSubsystem.WinterFlowHookDataSource(j, 0.6f);
            WinterFlowProcessorSessionManager winterFlowProcessorSessionManager = WinterFlowCacheRuntime.WinterFlowTransactionAgent;
            WinterFlowMapperManager WinterFlowSyntaxSubsystem4 = WinterFlowCacheRuntime.WinterFlowSyntaxSubsystem(WinterFlowSoftwareException.WinterFlowConcurrencyThread(WinterFlowSoftwareException.WinterFlowOrchestrationSubsystem(WinterFlowSingletonPlatform2, WinterFlowHookDataSource2, winterFlowProcessorSessionManager), 1.0f, WinterFlowInvokerComponent.WinterFlowTransactionManagerStrategy(4284666621L), WinterFlowRepositoryProxy.WinterFlowRouterStructure(8.0f)), 12.0f, 6.0f);
            WinterFlowWorkerModule WinterFlowCacheManagerAgent3 = WinterFlowLibrary.WinterFlowCacheManagerAgent(winterFlowInvokerConsumer, false);
            int hashCode4 = Long.hashCode(winterFlowResolverLibrary2.WinterFlowConfiguration);
            WinterFlowConfigurationProcess WinterFlowTransactionAgent4 = winterFlowResolverLibrary2.WinterFlowTransactionAgent();
            WinterFlowMapperManager WinterFlowUserManagerUserManager4 = WinterFlowSoftwareException.WinterFlowUserManagerUserManager(winterFlowResolverLibrary2, WinterFlowSyntaxSubsystem4);
            winterFlowResolverLibrary2.WinterFlowModuleAgent();
            if (winterFlowResolverLibrary2.WinterFlowProxyStructure) {
                winterFlowResolverLibrary2.WinterFlowResponseEngine(winterFlowConfigurationRequest2);
            } else {
                winterFlowResolverLibrary2.WinterFlowParserPipeline();
            }
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend, winterFlowResolverLibrary2, WinterFlowCacheManagerAgent3);
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend2, winterFlowResolverLibrary2, WinterFlowTransactionAgent4);
            WinterFlowResolverBackend.WinterFlowConcurrencyThread(hashCode4, winterFlowResolverLibrary2, winterFlowExceptionBackend3, winterFlowResolverLibrary2, winterFlowServiceProviderBatch);
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend4, winterFlowResolverLibrary2, WinterFlowUserManagerUserManager4);
            String str = "TIME: " + ((Number) WinterFlowArrayNetwork5.getValue()).intValue() + " SEC";
            long j2 = ((Number) WinterFlowArrayNetwork5.getValue()).intValue() <= 5 ? WinterFlowInheritanceSubsystem.WinterFlowArrayNetwork : WinterFlowInheritanceSubsystem.WinterFlowCacheManagerAgent;
            long WinterFlowBatchUI = WinterFlowDecoratorUI.WinterFlowBatchUI(18);
            WinterFlowObjectHook winterFlowObjectHook = WinterFlowObjectHook.WinterFlowTransactionAgent;
            WinterFlowSingletonRuntime.WinterFlowHookDataSource(str, null, j2, WinterFlowBatchUI, winterFlowObjectHook, 0L, null, 0L, 0, false, 0, 0, null, winterFlowResolverLibrary, 1597440, 262058);
            winterFlowResolverLibrary.WinterFlowBandwidthObject(true);
            WinterFlowMapperManager WinterFlowSyntaxSubsystem5 = WinterFlowCacheRuntime.WinterFlowSyntaxSubsystem(WinterFlowSoftwareException.WinterFlowConcurrencyThread(WinterFlowSoftwareException.WinterFlowOrchestrationSubsystem(WinterFlowSingletonPlatform(winterFlowValidatorComponent, WinterFlowRepositoryProxy.WinterFlowRouterStructure(8.0f)), WinterFlowInheritanceSubsystem.WinterFlowHookDataSource(j, 0.6f), winterFlowProcessorSessionManager), 1.0f, WinterFlowInvokerComponent.WinterFlowTransactionManagerStrategy(4284666621L), WinterFlowRepositoryProxy.WinterFlowRouterStructure(8.0f)), 12.0f, 6.0f);
            WinterFlowWorkerModule WinterFlowCacheManagerAgent4 = WinterFlowLibrary.WinterFlowCacheManagerAgent(winterFlowInvokerConsumer, false);
            int hashCode5 = Long.hashCode(winterFlowResolverLibrary.WinterFlowConfiguration);
            WinterFlowConfigurationProcess WinterFlowTransactionAgent5 = winterFlowResolverLibrary.WinterFlowTransactionAgent();
            WinterFlowMapperManager WinterFlowUserManagerUserManager5 = WinterFlowSoftwareException.WinterFlowUserManagerUserManager(winterFlowResolverLibrary, WinterFlowSyntaxSubsystem5);
            winterFlowResolverLibrary.WinterFlowModuleAgent();
            if (winterFlowResolverLibrary.WinterFlowProxyStructure) {
                winterFlowConfigurationRequest = winterFlowConfigurationRequest2;
                winterFlowResolverLibrary.WinterFlowResponseEngine(winterFlowConfigurationRequest);
            } else {
                winterFlowConfigurationRequest = winterFlowConfigurationRequest2;
                winterFlowResolverLibrary.WinterFlowParserPipeline();
            }
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend, winterFlowResolverLibrary, WinterFlowCacheManagerAgent4);
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend2, winterFlowResolverLibrary, WinterFlowTransactionAgent5);
            WinterFlowResolverBackend.WinterFlowConcurrencyThread(hashCode5, winterFlowResolverLibrary, winterFlowExceptionBackend3, winterFlowResolverLibrary, winterFlowServiceProviderBatch);
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend4, winterFlowResolverLibrary, WinterFlowUserManagerUserManager5);
            String WinterFlowRouterRouter = WinterFlowResolverBackend.WinterFlowRouterRouter(((Number) WinterFlowArrayNetwork6.getValue()).intValue(), ((Number) WinterFlowArrayNetwork7.getValue()).intValue(), "FISH: ", "/");
            long j3 = WinterFlowInheritanceSubsystem.WinterFlowCacheManagerAgent;
            WinterFlowConfigurationRequest winterFlowConfigurationRequest3 = winterFlowConfigurationRequest;
            WinterFlowSingletonRuntime.WinterFlowHookDataSource(WinterFlowRouterRouter, null, j3, WinterFlowDecoratorUI.WinterFlowBatchUI(16), winterFlowObjectHook, 0L, null, 0L, 0, false, 0, 0, null, winterFlowResolverLibrary, 1597824, 262058);
            winterFlowResolverLibrary.WinterFlowBandwidthObject(true);
            winterFlowResolverLibrary.WinterFlowBandwidthObject(true);
            final int i4 = 0;
            WinterFlowRepositoryObject WinterFlowRouterStructure5 = WinterFlowConsumerDataSource.WinterFlowRouterStructure(winterFlowMicroserviceAgent, winterFlowConfigurationPipeline, winterFlowResolverLibrary, 0);
            int hashCode6 = Long.hashCode(winterFlowResolverLibrary.WinterFlowConfiguration);
            WinterFlowConfigurationProcess WinterFlowTransactionAgent6 = winterFlowResolverLibrary.WinterFlowTransactionAgent();
            WinterFlowMapperManager WinterFlowUserManagerUserManager6 = WinterFlowSoftwareException.WinterFlowUserManagerUserManager(winterFlowResolverLibrary, winterFlowValidatorComponent);
            winterFlowResolverLibrary.WinterFlowModuleAgent();
            if (winterFlowResolverLibrary.WinterFlowProxyStructure) {
                winterFlowResolverLibrary.WinterFlowResponseEngine(winterFlowConfigurationRequest3);
            } else {
                winterFlowResolverLibrary.WinterFlowParserPipeline();
            }
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend, winterFlowResolverLibrary, WinterFlowRouterStructure5);
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend2, winterFlowResolverLibrary, WinterFlowTransactionAgent6);
            WinterFlowResolverBackend.WinterFlowConcurrencyThread(hashCode6, winterFlowResolverLibrary, winterFlowExceptionBackend3, winterFlowResolverLibrary, winterFlowServiceProviderBatch);
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend4, winterFlowResolverLibrary, WinterFlowUserManagerUserManager6);
            WinterFlowSingletonRuntime.WinterFlowHookDataSource(WinterFlowResolverBackend.WinterFlowSyntax("POINTS: ", ((Number) WinterFlowArrayNetwork4.getValue()).intValue()), null, WinterFlowInheritanceSubsystem.WinterFlowUnitTestResponse, WinterFlowDecoratorUI.WinterFlowBatchUI(16), winterFlowObjectHook, 0L, null, 0L, 0, false, 0, 0, null, winterFlowResolverLibrary, 1597824, 262058);
            WinterFlowSingletonRuntime.WinterFlowHookDataSource(WinterFlowResolverBackend.WinterFlowSyntax("ENERGY: ", ((Number) WinterFlowArrayNetwork3.getValue()).intValue()), null, WinterFlowInheritanceSubsystem.WinterFlowRouterRouter, WinterFlowDecoratorUI.WinterFlowBatchUI(16), winterFlowObjectHook, 0L, null, 0L, 0, false, 0, 0, null, winterFlowResolverLibrary, 1597824, 262058);
            winterFlowResolverLibrary.WinterFlowBandwidthObject(true);
            boolean z = true;
            WinterFlowEncryptionSubsystem.WinterFlowRouterStructure(WinterFlowCompilerDecorator.WinterFlowRouterStructure(WinterFlowCacheRuntime.WinterFlowSingletonPlatform(1.0f)), null, WinterFlowSyntaxSubsystem(-1998306734, new WinterFlowControllerScript() { // from class: com.google.android.datatransport.WinterFlowDataSourceAdapter
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.datatransport.WinterFlowControllerScript
                public final Object WinterFlowArrayNetwork(Object obj, Object obj2, Object obj3) {
                    WinterFlowPackageProcess winterFlowPackageProcess;
                    Object obj4 = (WinterFlowDecoratorAdapter) obj;
                    WinterFlowResolverLibrary winterFlowResolverLibrary3 = (WinterFlowResolverLibrary) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    obj4.getClass();
                    int i5 = 4;
                    if ((intValue & 6) == 0) {
                        intValue |= winterFlowResolverLibrary3.WinterFlowVariableVersionControl(obj4) ? 4 : 2;
                    }
                    int i6 = 0;
                    boolean WinterFlowFrontendBackend = winterFlowResolverLibrary3.WinterFlowFrontendBackend(intValue & 1, (intValue & 19) != 18);
                    WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                    if (!WinterFlowFrontendBackend) {
                        winterFlowResolverLibrary3.WinterFlowQueueService();
                        return winterFlowAlgorithmSession;
                    }
                    Object obj5 = (WinterFlowConcurrencyParser) winterFlowResolverLibrary3.WinterFlowSyntax(WinterFlowBackendTransactionManager.WinterFlowRouterRouter);
                    boolean WinterFlowVariableVersionControl = winterFlowResolverLibrary3.WinterFlowVariableVersionControl(obj5);
                    WinterFlowObjectLayer winterFlowObjectLayer3 = WinterFlowObjectLayer.this;
                    int i7 = intValue & 14;
                    boolean WinterFlowVariableVersionControl2 = (i7 == 4) | WinterFlowVariableVersionControl | winterFlowResolverLibrary3.WinterFlowVariableVersionControl(winterFlowObjectLayer3);
                    Object WinterFlowSyntaxSubsystem6 = winterFlowResolverLibrary3.WinterFlowSyntaxSubsystem();
                    WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer = null;
                    Object obj6 = WinterFlowModuleModule.WinterFlowRouterStructure;
                    if (WinterFlowVariableVersionControl2 || WinterFlowSyntaxSubsystem6 == obj6) {
                        Object winterFlowJSONUtility = new WinterFlowJSONUtility(obj5, winterFlowObjectLayer3, obj4, winterFlowTransactionManagerLayer, 1);
                        winterFlowPackageProcess = null;
                        winterFlowResolverLibrary3.WinterFlowArrayFramework(winterFlowJSONUtility);
                        WinterFlowSyntaxSubsystem6 = winterFlowJSONUtility;
                    } else {
                        winterFlowPackageProcess = null;
                    }
                    WinterFlowSoftwareException.WinterFlowArrayNetwork((WinterFlowEventEvent) WinterFlowSyntaxSubsystem6, winterFlowResolverLibrary3, winterFlowAlgorithmSession);
                    if (((WinterFlowOrchestrationNetwork) WinterFlowArrayNetwork2.getValue()) != WinterFlowOrchestrationNetwork.WinterFlowVariableVersionControl) {
                        winterFlowResolverLibrary3.WinterFlowCompilerDataSource(987781104);
                        winterFlowResolverLibrary3.WinterFlowBandwidthObject(false);
                        return winterFlowAlgorithmSession;
                    }
                    winterFlowResolverLibrary3.WinterFlowCompilerDataSource(986135872);
                    for (WinterFlowWorkerTransaction winterFlowWorkerTransaction : (List) WinterFlowArrayNetwork8.getValue()) {
                        WinterFlowSoftwareSubsystem WinterFlowTestingNode = WinterFlowSoftwareException.WinterFlowTestingNode(winterFlowWorkerTransaction.WinterFlowCacheManagerAgent, winterFlowResolverLibrary3, i6);
                        WinterFlowMapperManager WinterFlowConfiguration = WinterFlowCacheRuntime.WinterFlowConfiguration(WinterFlowValidatorComponent.WinterFlowRouterStructure, 75.0f);
                        int i8 = (winterFlowResolverLibrary3.WinterFlowUnitTestResponse(winterFlowWorkerTransaction) ? 1 : 0) | (i7 == i5 ? 1 : i6);
                        Object WinterFlowSyntaxSubsystem7 = winterFlowResolverLibrary3.WinterFlowSyntaxSubsystem();
                        if (i8 != 0 || WinterFlowSyntaxSubsystem7 == obj6) {
                            WinterFlowSyntaxSubsystem7 = new WinterFlowRouterCompiler(12, winterFlowWorkerTransaction, obj4);
                            winterFlowResolverLibrary3.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem7);
                        }
                        WinterFlowMapperManager WinterFlowPackageIDE = WinterFlowHandlerWebsocket.WinterFlowPackageIDE(WinterFlowConfiguration, (WinterFlowObjectSession) WinterFlowSyntaxSubsystem7);
                        Long valueOf2 = Long.valueOf(winterFlowWorkerTransaction.WinterFlowRouterStructure);
                        boolean WinterFlowVariableVersionControl3 = winterFlowResolverLibrary3.WinterFlowVariableVersionControl(winterFlowObjectLayer3) | winterFlowResolverLibrary3.WinterFlowUnitTestResponse(winterFlowWorkerTransaction);
                        Object WinterFlowSyntaxSubsystem8 = winterFlowResolverLibrary3.WinterFlowSyntaxSubsystem();
                        if (WinterFlowVariableVersionControl3 || WinterFlowSyntaxSubsystem8 == obj6) {
                            WinterFlowSyntaxSubsystem8 = new WinterFlowMapperProcess(winterFlowObjectLayer3, winterFlowWorkerTransaction, winterFlowObjectHandler, winterFlowThreadPoolGateway);
                            winterFlowResolverLibrary3.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem8);
                        }
                        WinterFlowCacheManagerUtility winterFlowCacheManagerUtility = WinterFlowIDESoftware.WinterFlowRouterStructure;
                        WinterFlowUnitTestLibrary.WinterFlowVariableVersionControl(WinterFlowTestingNode, WinterFlowPackageIDE.WinterFlowCacheManagerAgent(new WinterFlowResolverWorker(valueOf2, winterFlowPackageProcess, (PointerInputEventHandler) WinterFlowSyntaxSubsystem8, 6)), null, null, 0.0f, winterFlowResolverLibrary3, 56, 120);
                        winterFlowAlgorithmSession = winterFlowAlgorithmSession;
                        i7 = i7;
                        obj6 = obj6;
                        i5 = 4;
                        i6 = 0;
                    }
                    WinterFlowAlgorithmSession winterFlowAlgorithmSession2 = winterFlowAlgorithmSession;
                    winterFlowResolverLibrary3.WinterFlowBandwidthObject(i6);
                    return winterFlowAlgorithmSession2;
                }
            }, winterFlowResolverLibrary), winterFlowResolverLibrary, 3072);
            WinterFlowMapperManager WinterFlowConfiguration = WinterFlowCacheRuntime.WinterFlowConfiguration(winterFlowValidatorComponent, 150.0f);
            WinterFlowConfigurationPipeline winterFlowConfigurationPipeline2 = WinterFlowCacheUtility.WinterFlowVariableBandwidth;
            WinterFlowMapperManager WinterFlowCacheManagerAgent5 = WinterFlowConfiguration.WinterFlowCacheManagerAgent(new WinterFlowGatewayService());
            Object WinterFlowSyntaxSubsystem6 = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
            if (WinterFlowSyntaxSubsystem6 == winterFlowThreadPoolProcess) {
                WinterFlowSyntaxSubsystem6 = new WinterFlowRouterCompiler(11, winterFlowObjectHandler, winterFlowThreadPoolGateway);
                winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem6);
            }
            WinterFlowLibrary.WinterFlowRouterStructure(WinterFlowServerManager.WinterFlowBackendCacheManager(WinterFlowQuerySyntax.WinterFlowConsumerUserManager(WinterFlowCacheManagerAgent5, (WinterFlowObjectSession) WinterFlowSyntaxSubsystem6), WinterFlowSoftwareException.WinterFlowTestingNode(R.drawable.bucket, winterFlowResolverLibrary, 0), WinterFlowThreadConfiguration.WinterFlowHookDataSource, 0.0f, 54), winterFlowResolverLibrary, 0);
            WinterFlowProtocolNetwork.WinterFlowRouterStructure(winterFlowResolverLibrary, WinterFlowCacheRuntime.WinterFlowArrayHelper(10.0f));
            WinterFlowOrchestrationNetwork winterFlowOrchestrationNetwork2 = (WinterFlowOrchestrationNetwork) WinterFlowArrayNetwork2.getValue();
            WinterFlowOrchestrationNetwork winterFlowOrchestrationNetwork3 = WinterFlowOrchestrationNetwork.WinterFlowVariableVersionControl;
            if (winterFlowOrchestrationNetwork2 != winterFlowOrchestrationNetwork3 || ((Number) WinterFlowArrayNetwork3.getValue()).intValue() < 2) {
                winterFlowResolverLibrary2 = winterFlowResolverLibrary;
                c = ' ';
                winterFlowOrchestrationNetwork = winterFlowOrchestrationNetwork3;
                winterFlowResolverLibrary2.WinterFlowCompilerDataSource(1286523462);
                winterFlowResolverLibrary2.WinterFlowBandwidthObject(false);
            } else {
                winterFlowResolverLibrary.WinterFlowCompilerDataSource(1286229396);
                WinterFlowMapperManager WinterFlowCacheManagerAgent6 = WinterFlowCacheRuntime.WinterFlowOrchestrationConfiguration(winterFlowValidatorComponent, 220.0f).WinterFlowCacheManagerAgent(new WinterFlowGatewayService());
                Object[] objArr = (i2 & 112) == 32;
                Object WinterFlowSyntaxSubsystem7 = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
                if (objArr != false || WinterFlowSyntaxSubsystem7 == winterFlowThreadPoolProcess) {
                    WinterFlowSyntaxSubsystem7 = new WinterFlowObjectUI() { // from class: com.google.android.datatransport.WinterFlowCacheAgent
                        @Override // com.google.android.datatransport.WinterFlowObjectUI
                        public final Object WinterFlowRouterStructure() {
                            int i5 = i4;
                            WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                            WinterFlowObjectLayer winterFlowObjectLayer3 = winterFlowObjectLayer;
                            switch (i5) {
                                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                    WinterFlowHandlerPlatform winterFlowHandlerPlatform = winterFlowObjectLayer3.WinterFlowResponseEngine;
                                    if (((Number) winterFlowHandlerPlatform.getValue()).intValue() >= 2 && winterFlowObjectLayer3.WinterFlowRouterRouter.getValue() == WinterFlowOrchestrationNetwork.WinterFlowVariableVersionControl) {
                                        int intValue = ((Number) winterFlowHandlerPlatform.getValue()).intValue() - 2;
                                        winterFlowHandlerPlatform.WinterFlowTransactionAgent(null, Integer.valueOf(intValue));
                                        SharedPreferences.Editor edit = winterFlowObjectLayer3.WinterFlowCacheManagerAgent.edit();
                                        edit.getClass();
                                        edit.putInt(winterFlowObjectLayer3.WinterFlowArrayNetwork, intValue);
                                        edit.apply();
                                        WinterFlowHandlerPlatform winterFlowHandlerPlatform2 = winterFlowObjectLayer3.WinterFlowServiceUtility;
                                        winterFlowHandlerPlatform2.WinterFlowTransactionAgent(null, Integer.valueOf(((Number) winterFlowHandlerPlatform2.getValue()).intValue() + 1));
                                        break;
                                    }
                                    break;
                                default:
                                    winterFlowObjectLayer3.WinterFlowUnitTestResponse(-1);
                                    break;
                            }
                            return winterFlowAlgorithmSession;
                        }
                    };
                    winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem7);
                }
                WinterFlowObjectUI winterFlowObjectUI2 = (WinterFlowObjectUI) WinterFlowSyntaxSubsystem7;
                winterFlowOrchestrationNetwork = winterFlowOrchestrationNetwork3;
                winterFlowResolverLibrary2 = winterFlowResolverLibrary;
                c = ' ';
                WinterFlowSoftwareException.WinterFlowServerProtocol(48, 0, winterFlowObjectUI2, winterFlowResolverLibrary2, WinterFlowCacheManagerAgent6, "+1 SEC (2 NRG)");
                winterFlowResolverLibrary2.WinterFlowBandwidthObject(false);
            }
            winterFlowResolverLibrary2.WinterFlowBandwidthObject(true);
            if (((WinterFlowOrchestrationNetwork) WinterFlowArrayNetwork2.getValue()) != winterFlowOrchestrationNetwork) {
                winterFlowResolverLibrary2.WinterFlowCompilerDataSource(-687595405);
                WinterFlowMapperManager WinterFlowOrchestrationSubsystem = WinterFlowSoftwareException.WinterFlowOrchestrationSubsystem(winterFlowMicroserviceMechanism, WinterFlowInheritanceSubsystem.WinterFlowHookDataSource(j, 0.85f), winterFlowProcessorSessionManager);
                WinterFlowWorkerModule WinterFlowCacheManagerAgent7 = WinterFlowLibrary.WinterFlowCacheManagerAgent(WinterFlowCacheUtility.WinterFlowTransactionAgent, false);
                int hashCode7 = Long.hashCode(winterFlowResolverLibrary2.WinterFlowConfiguration);
                WinterFlowConfigurationProcess WinterFlowTransactionAgent7 = winterFlowResolverLibrary2.WinterFlowTransactionAgent();
                WinterFlowMapperManager WinterFlowUserManagerUserManager7 = WinterFlowSoftwareException.WinterFlowUserManagerUserManager(winterFlowResolverLibrary2, WinterFlowOrchestrationSubsystem);
                winterFlowResolverLibrary2.WinterFlowModuleAgent();
                if (winterFlowResolverLibrary2.WinterFlowProxyStructure) {
                    winterFlowResolverLibrary2.WinterFlowResponseEngine(winterFlowConfigurationRequest3);
                } else {
                    winterFlowResolverLibrary2.WinterFlowParserPipeline();
                }
                WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend, winterFlowResolverLibrary2, WinterFlowCacheManagerAgent7);
                WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend2, winterFlowResolverLibrary2, WinterFlowTransactionAgent7);
                WinterFlowResolverBackend.WinterFlowConcurrencyThread(hashCode7, winterFlowResolverLibrary2, winterFlowExceptionBackend3, winterFlowResolverLibrary2, winterFlowServiceProviderBatch);
                WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend4, winterFlowResolverLibrary2, WinterFlowUserManagerUserManager7);
                WinterFlowRepositoryObject WinterFlowRouterStructure6 = WinterFlowConsumerDataSource.WinterFlowRouterStructure(winterFlowMicroserviceAgent, winterFlowConfigurationPipeline2, winterFlowResolverLibrary2, 48);
                int hashCode8 = Long.hashCode(winterFlowResolverLibrary2.WinterFlowConfiguration);
                WinterFlowConfigurationProcess WinterFlowTransactionAgent8 = winterFlowResolverLibrary2.WinterFlowTransactionAgent();
                WinterFlowMapperManager WinterFlowUserManagerUserManager8 = WinterFlowSoftwareException.WinterFlowUserManagerUserManager(winterFlowResolverLibrary2, winterFlowValidatorComponent);
                winterFlowResolverLibrary2.WinterFlowModuleAgent();
                if (winterFlowResolverLibrary2.WinterFlowProxyStructure) {
                    winterFlowResolverLibrary2.WinterFlowResponseEngine(winterFlowConfigurationRequest3);
                } else {
                    winterFlowResolverLibrary2.WinterFlowParserPipeline();
                }
                WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend, winterFlowResolverLibrary2, WinterFlowRouterStructure6);
                WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend2, winterFlowResolverLibrary2, WinterFlowTransactionAgent8);
                WinterFlowResolverBackend.WinterFlowConcurrencyThread(hashCode8, winterFlowResolverLibrary2, winterFlowExceptionBackend3, winterFlowResolverLibrary2, winterFlowServiceProviderBatch);
                WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend4, winterFlowResolverLibrary2, WinterFlowUserManagerUserManager8);
                WinterFlowOrchestrationNetwork winterFlowOrchestrationNetwork4 = (WinterFlowOrchestrationNetwork) WinterFlowArrayNetwork2.getValue();
                WinterFlowOrchestrationNetwork winterFlowOrchestrationNetwork5 = WinterFlowOrchestrationNetwork.WinterFlowTransactionManagerStrategy;
                WinterFlowSingletonRuntime.WinterFlowHookDataSource(winterFlowOrchestrationNetwork4 == winterFlowOrchestrationNetwork5 ? "YOU WIN!" : "GAME OVER", null, ((WinterFlowOrchestrationNetwork) WinterFlowArrayNetwork2.getValue()) == winterFlowOrchestrationNetwork5 ? WinterFlowInheritanceSubsystem.WinterFlowVariableVersionControl : WinterFlowInheritanceSubsystem.WinterFlowArrayNetwork, WinterFlowDecoratorUI.WinterFlowBatchUI(36), winterFlowObjectHook, 0L, new WinterFlowThreadPoolEventEmitter(3), 0L, 0, false, 0, 0, null, winterFlowResolverLibrary, 1597440, 261034);
                WinterFlowProtocolNetwork.WinterFlowRouterStructure(winterFlowResolverLibrary, WinterFlowCacheRuntime.WinterFlowArrayHelper(8.0f));
                WinterFlowSingletonRuntime.WinterFlowHookDataSource(((WinterFlowOrchestrationNetwork) WinterFlowArrayNetwork2.getValue()) == winterFlowOrchestrationNetwork5 ? "Great job! Fish added to Archive." : "Time is out! Points deducted.", null, j3, WinterFlowDecoratorUI.WinterFlowBatchUI(16), null, 0L, new WinterFlowThreadPoolEventEmitter(3), 0L, 0, false, 0, 0, null, winterFlowResolverLibrary, 24960, 261098);
                WinterFlowProtocolNetwork.WinterFlowRouterStructure(winterFlowResolverLibrary, WinterFlowCacheRuntime.WinterFlowArrayHelper(32.0f));
                z = true;
                char c2 = 1;
                WinterFlowRendererCacheManager WinterFlowRouterStructure7 = WinterFlowWebsocketInheritance.WinterFlowRouterStructure(new WinterFlowThreadPoolCompiler(16.0f, new WinterFlowCompilerMechanism(1 == true ? 1 : 0)), WinterFlowCacheUtility.WinterFlowOrchestrationSubsystem, winterFlowResolverLibrary, 6);
                int hashCode9 = Long.hashCode(winterFlowResolverLibrary.WinterFlowConfiguration);
                WinterFlowConfigurationProcess WinterFlowTransactionAgent9 = winterFlowResolverLibrary.WinterFlowTransactionAgent();
                WinterFlowMapperManager WinterFlowUserManagerUserManager9 = WinterFlowSoftwareException.WinterFlowUserManagerUserManager(winterFlowResolverLibrary, winterFlowValidatorComponent);
                winterFlowResolverLibrary.WinterFlowModuleAgent();
                if (winterFlowResolverLibrary.WinterFlowProxyStructure) {
                    winterFlowResolverLibrary.WinterFlowResponseEngine(winterFlowConfigurationRequest3);
                } else {
                    winterFlowResolverLibrary.WinterFlowParserPipeline();
                }
                WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend, winterFlowResolverLibrary, WinterFlowRouterStructure7);
                WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend2, winterFlowResolverLibrary, WinterFlowTransactionAgent9);
                WinterFlowResolverBackend.WinterFlowConcurrencyThread(hashCode9, winterFlowResolverLibrary, winterFlowExceptionBackend3, winterFlowResolverLibrary, winterFlowServiceProviderBatch);
                WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend4, winterFlowResolverLibrary, WinterFlowUserManagerUserManager9);
                WinterFlowMapperManager WinterFlowOrchestrationConfiguration = WinterFlowCacheRuntime.WinterFlowOrchestrationConfiguration(winterFlowValidatorComponent, 140.0f);
                boolean z2 = (i2 & 112) == 32;
                Object WinterFlowSyntaxSubsystem8 = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
                if (z2 || WinterFlowSyntaxSubsystem8 == winterFlowThreadPoolProcess) {
                    winterFlowObjectLayer2 = winterFlowObjectLayer;
                    final char c3 = c2 == true ? 1 : 0;
                    WinterFlowSyntaxSubsystem8 = new WinterFlowObjectUI() { // from class: com.google.android.datatransport.WinterFlowCacheAgent
                        @Override // com.google.android.datatransport.WinterFlowObjectUI
                        public final Object WinterFlowRouterStructure() {
                            int i5 = c3;
                            WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                            WinterFlowObjectLayer winterFlowObjectLayer3 = winterFlowObjectLayer2;
                            switch (i5) {
                                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                    WinterFlowHandlerPlatform winterFlowHandlerPlatform = winterFlowObjectLayer3.WinterFlowResponseEngine;
                                    if (((Number) winterFlowHandlerPlatform.getValue()).intValue() >= 2 && winterFlowObjectLayer3.WinterFlowRouterRouter.getValue() == WinterFlowOrchestrationNetwork.WinterFlowVariableVersionControl) {
                                        int intValue = ((Number) winterFlowHandlerPlatform.getValue()).intValue() - 2;
                                        winterFlowHandlerPlatform.WinterFlowTransactionAgent(null, Integer.valueOf(intValue));
                                        SharedPreferences.Editor edit = winterFlowObjectLayer3.WinterFlowCacheManagerAgent.edit();
                                        edit.getClass();
                                        edit.putInt(winterFlowObjectLayer3.WinterFlowArrayNetwork, intValue);
                                        edit.apply();
                                        WinterFlowHandlerPlatform winterFlowHandlerPlatform2 = winterFlowObjectLayer3.WinterFlowServiceUtility;
                                        winterFlowHandlerPlatform2.WinterFlowTransactionAgent(null, Integer.valueOf(((Number) winterFlowHandlerPlatform2.getValue()).intValue() + 1));
                                        break;
                                    }
                                    break;
                                default:
                                    winterFlowObjectLayer3.WinterFlowUnitTestResponse(-1);
                                    break;
                            }
                            return winterFlowAlgorithmSession;
                        }
                    };
                    winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem8);
                } else {
                    winterFlowObjectLayer2 = winterFlowObjectLayer;
                }
                WinterFlowSoftwareException.WinterFlowServerProtocol(54, 0, (WinterFlowObjectUI) WinterFlowSyntaxSubsystem8, winterFlowResolverLibrary, WinterFlowOrchestrationConfiguration, "RETRY");
                winterFlowResolverLibrary2 = winterFlowResolverLibrary;
                WinterFlowSoftwareException.WinterFlowServerProtocol((i2 & 896) | 54, 0, winterFlowObjectUI, winterFlowResolverLibrary2, WinterFlowCacheRuntime.WinterFlowOrchestrationConfiguration(winterFlowValidatorComponent, 140.0f), "MENU");
                winterFlowResolverLibrary2.WinterFlowBandwidthObject(true);
                winterFlowResolverLibrary2.WinterFlowBandwidthObject(true);
                winterFlowResolverLibrary2.WinterFlowBandwidthObject(true);
                winterFlowResolverLibrary2.WinterFlowBandwidthObject(false);
            } else {
                winterFlowObjectLayer2 = winterFlowObjectLayer;
                winterFlowResolverLibrary2.WinterFlowCompilerDataSource(-685987652);
                winterFlowResolverLibrary2.WinterFlowBandwidthObject(false);
            }
            winterFlowResolverLibrary2.WinterFlowBandwidthObject(z);
        } else {
            winterFlowObjectLayer2 = winterFlowObjectLayer;
            winterFlowResolverLibrary2.WinterFlowQueueService();
        }
        WinterFlowStackEngine WinterFlowConcurrencyThread = winterFlowResolverLibrary2.WinterFlowConcurrencyThread();
        if (WinterFlowConcurrencyThread != null) {
            WinterFlowConcurrencyThread.WinterFlowArrayNetwork = new WinterFlowConsumerVersionControl(winterFlowMapperManager, winterFlowObjectLayer2, winterFlowObjectUI, i, 4);
        }
    }

    public static final void WinterFlowRouterStructure(WinterFlowHandlerInvoker winterFlowHandlerInvoker, WinterFlowMapperManager winterFlowMapperManager, WinterFlowObjectSession winterFlowObjectSession, WinterFlowInvokerConsumer winterFlowInvokerConsumer, WinterFlowObjectSession winterFlowObjectSession2, WinterFlowEventTool winterFlowEventTool, WinterFlowResolverLibrary winterFlowResolverLibrary, int i) {
        int i2;
        WinterFlowObjectSession winterFlowObjectSession3;
        WinterFlowResolverLibrary winterFlowResolverLibrary2;
        WinterFlowPackageConsumer winterFlowPackageConsumer;
        WinterFlowSessionManagerRequest winterFlowSessionManagerRequest;
        WinterFlowPackageResolver winterFlowPackageResolver;
        WinterFlowSessionManagerRequest winterFlowSessionManagerRequest2;
        WinterFlowListenerSyntax winterFlowListenerSyntax;
        WinterFlowObjectSession winterFlowObjectSession4 = winterFlowObjectSession;
        winterFlowResolverLibrary.WinterFlowFrameworkTransaction(511725103);
        if ((i & 6) == 0) {
            i2 = (winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowHandlerInvoker) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowMapperManager) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowObjectSession4) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowInvokerConsumer) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowObjectSession2) ? 16384 : 8192;
        }
        WinterFlowEventTool winterFlowEventTool2 = winterFlowEventTool;
        if ((196608 & i) == 0) {
            i2 |= winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowEventTool2) ? 131072 : 65536;
        }
        if (winterFlowResolverLibrary.WinterFlowFrontendBackend(i2 & 1, (74899 & i2) != 74898)) {
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object WinterFlowSyntaxSubsystem = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
            Object obj = WinterFlowModuleModule.WinterFlowRouterStructure;
            if (z || WinterFlowSyntaxSubsystem == obj) {
                WinterFlowSyntaxSubsystem = new WinterFlowSessionManagerRequest(winterFlowHandlerInvoker, winterFlowInvokerConsumer);
                winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem);
            }
            WinterFlowSessionManagerRequest winterFlowSessionManagerRequest3 = (WinterFlowSessionManagerRequest) WinterFlowSyntaxSubsystem;
            boolean z2 = i3 == 4;
            Object WinterFlowSyntaxSubsystem2 = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
            Object obj2 = WinterFlowSyntaxSubsystem2;
            if (z2 || WinterFlowSyntaxSubsystem2 == obj) {
                Object[] objArr = {winterFlowHandlerInvoker.WinterFlowRouterStructure.WinterFlowSyntax()};
                WinterFlowPackageResolver winterFlowPackageResolver2 = new WinterFlowPackageResolver();
                winterFlowPackageResolver2.addAll(WinterFlowProtocolPipeline.WinterFlowOrchestrationConfiguration(objArr));
                winterFlowResolverLibrary.WinterFlowArrayFramework(winterFlowPackageResolver2);
                obj2 = winterFlowPackageResolver2;
            }
            WinterFlowPackageResolver winterFlowPackageResolver3 = (WinterFlowPackageResolver) obj2;
            boolean z3 = i3 == 4;
            Object WinterFlowSyntaxSubsystem3 = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
            if (z3 || WinterFlowSyntaxSubsystem3 == obj) {
                long[] jArr = WinterFlowDatabaseSchemaUtility.WinterFlowRouterStructure;
                WinterFlowSyntaxSubsystem3 = new WinterFlowDatabaseSchemaStructure();
                winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem3);
            }
            WinterFlowDatabaseSchemaStructure winterFlowDatabaseSchemaStructure = (WinterFlowDatabaseSchemaStructure) WinterFlowSyntaxSubsystem3;
            WinterFlowPackageConsumer winterFlowPackageConsumer2 = winterFlowHandlerInvoker.WinterFlowRouterStructure;
            WinterFlowResolverSubsystem winterFlowResolverSubsystem = winterFlowHandlerInvoker.WinterFlowArrayNetwork;
            if (!winterFlowPackageResolver3.contains(winterFlowPackageConsumer2.WinterFlowSyntax())) {
                winterFlowPackageResolver3.clear();
                winterFlowPackageResolver3.add(winterFlowPackageConsumer2.WinterFlowSyntax());
            }
            if (WinterFlowThreadListener(winterFlowPackageConsumer2.WinterFlowSyntax(), winterFlowResolverSubsystem.getValue())) {
                if (winterFlowPackageResolver3.size() != 1 || !WinterFlowThreadListener(winterFlowPackageResolver3.get(0), winterFlowPackageConsumer2.WinterFlowSyntax())) {
                    winterFlowPackageResolver3.clear();
                    winterFlowPackageResolver3.add(winterFlowPackageConsumer2.WinterFlowSyntax());
                }
                if (winterFlowDatabaseSchemaStructure.WinterFlowVariableVersionControl != 1 || winterFlowDatabaseSchemaStructure.WinterFlowCacheManagerAgent(winterFlowPackageConsumer2.WinterFlowSyntax())) {
                    winterFlowDatabaseSchemaStructure.WinterFlowRouterStructure();
                }
                winterFlowSessionManagerRequest3.WinterFlowHookDataSource = winterFlowInvokerConsumer;
            }
            if (WinterFlowThreadListener(winterFlowPackageConsumer2.WinterFlowSyntax(), winterFlowResolverSubsystem.getValue()) || winterFlowPackageResolver3.contains(winterFlowResolverSubsystem.getValue())) {
                winterFlowPackageConsumer = winterFlowPackageConsumer2;
            } else {
                ListIterator listIterator = winterFlowPackageResolver3.listIterator();
                int i4 = 0;
                while (true) {
                    WinterFlowClassAlgorithm winterFlowClassAlgorithm = (WinterFlowClassAlgorithm) listIterator;
                    winterFlowPackageConsumer = winterFlowPackageConsumer2;
                    if (!winterFlowClassAlgorithm.hasNext()) {
                        i4 = -1;
                        break;
                    } else {
                        if (WinterFlowThreadListener(winterFlowObjectSession2.WinterFlowUnitTestResponse(winterFlowClassAlgorithm.next()), winterFlowObjectSession2.WinterFlowUnitTestResponse(winterFlowResolverSubsystem.getValue()))) {
                            break;
                        }
                        i4++;
                        winterFlowPackageConsumer2 = winterFlowPackageConsumer;
                    }
                }
                if (i4 == -1) {
                    winterFlowPackageResolver3.add(winterFlowResolverSubsystem.getValue());
                } else {
                    winterFlowPackageResolver3.set(i4, winterFlowResolverSubsystem.getValue());
                }
            }
            if (winterFlowDatabaseSchemaStructure.WinterFlowCacheManagerAgent(winterFlowResolverSubsystem.getValue()) && winterFlowDatabaseSchemaStructure.WinterFlowCacheManagerAgent(winterFlowPackageConsumer.WinterFlowSyntax())) {
                winterFlowResolverLibrary.WinterFlowCompilerDataSource(1968995539);
                winterFlowResolverLibrary.WinterFlowBandwidthObject(false);
                winterFlowObjectSession3 = winterFlowObjectSession4;
                winterFlowSessionManagerRequest = winterFlowSessionManagerRequest3;
            } else {
                winterFlowResolverLibrary.WinterFlowCompilerDataSource(1966410449);
                winterFlowDatabaseSchemaStructure.WinterFlowRouterStructure();
                int size = winterFlowPackageResolver3.size();
                int i5 = 0;
                while (i5 < size) {
                    Object obj3 = winterFlowPackageResolver3.get(i5);
                    winterFlowDatabaseSchemaStructure.WinterFlowThreadListener(obj3, WinterFlowSyntaxSubsystem(-23915175, new WinterFlowNodeStrategy(winterFlowHandlerInvoker, obj3, winterFlowObjectSession4, winterFlowSessionManagerRequest3, winterFlowPackageResolver3, winterFlowEventTool2), winterFlowResolverLibrary));
                    i5++;
                    winterFlowObjectSession4 = winterFlowObjectSession4;
                    winterFlowEventTool2 = winterFlowEventTool;
                }
                winterFlowObjectSession3 = winterFlowObjectSession4;
                winterFlowSessionManagerRequest = winterFlowSessionManagerRequest3;
                winterFlowResolverLibrary.WinterFlowBandwidthObject(false);
            }
            boolean WinterFlowVariableVersionControl = winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowHandlerInvoker.WinterFlowTransactionManagerStrategy()) | winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowSessionManagerRequest);
            Object WinterFlowSyntaxSubsystem4 = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
            if (WinterFlowVariableVersionControl || WinterFlowSyntaxSubsystem4 == obj) {
                WinterFlowSyntaxSubsystem4 = (WinterFlowBackendUI) winterFlowObjectSession3.WinterFlowUnitTestResponse(winterFlowSessionManagerRequest);
                winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem4);
            }
            WinterFlowBackendUI winterFlowBackendUI = (WinterFlowBackendUI) WinterFlowSyntaxSubsystem4;
            WinterFlowHandlerInvoker winterFlowHandlerInvoker2 = winterFlowSessionManagerRequest.WinterFlowRouterStructure;
            boolean WinterFlowVariableVersionControl2 = winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowSessionManagerRequest);
            Object WinterFlowSyntaxSubsystem5 = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
            if (WinterFlowVariableVersionControl2 || WinterFlowSyntaxSubsystem5 == obj) {
                WinterFlowSyntaxSubsystem5 = WinterFlowDecoratorUI.WinterFlowSerializerStructure(Boolean.FALSE);
                winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem5);
            }
            WinterFlowThreadPoolGateway winterFlowThreadPoolGateway = (WinterFlowThreadPoolGateway) WinterFlowSyntaxSubsystem5;
            WinterFlowThreadPoolGateway WinterFlowBackendCacheManager = WinterFlowDecoratorUI.WinterFlowBackendCacheManager(winterFlowBackendUI.WinterFlowArrayNetwork, winterFlowResolverLibrary);
            if (WinterFlowThreadListener(winterFlowHandlerInvoker2.WinterFlowRouterStructure.WinterFlowSyntax(), winterFlowHandlerInvoker2.WinterFlowArrayNetwork.getValue())) {
                winterFlowThreadPoolGateway.setValue(Boolean.FALSE);
            } else if (WinterFlowBackendCacheManager.getValue() != null) {
                winterFlowThreadPoolGateway.setValue(Boolean.TRUE);
            }
            boolean booleanValue = ((Boolean) winterFlowThreadPoolGateway.getValue()).booleanValue();
            WinterFlowMapperManager winterFlowMapperManager2 = WinterFlowValidatorComponent.WinterFlowRouterStructure;
            if (booleanValue) {
                winterFlowResolverLibrary.WinterFlowCompilerDataSource(1353077497);
                WinterFlowSessionManagerRequest winterFlowSessionManagerRequest4 = winterFlowSessionManagerRequest;
                winterFlowPackageResolver = winterFlowPackageResolver3;
                winterFlowSessionManagerRequest2 = winterFlowSessionManagerRequest4;
                winterFlowResolverLibrary2 = winterFlowResolverLibrary;
                winterFlowListenerSyntax = WinterFlowSoftwareException.WinterFlowEventEmitterController(winterFlowSessionManagerRequest4.WinterFlowRouterStructure, WinterFlowEncryptionSubsystem.WinterFlowArrayHelper, null, winterFlowResolverLibrary2, 0, 2);
                boolean WinterFlowVariableVersionControl3 = winterFlowResolverLibrary2.WinterFlowVariableVersionControl(winterFlowListenerSyntax);
                Object WinterFlowSyntaxSubsystem6 = winterFlowResolverLibrary2.WinterFlowSyntaxSubsystem();
                if (WinterFlowVariableVersionControl3 || WinterFlowSyntaxSubsystem6 == obj) {
                    WinterFlowSyntaxSubsystem6 = WinterFlowVariableBandwidth(winterFlowMapperManager2);
                    winterFlowResolverLibrary2.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem6);
                }
                winterFlowMapperManager2 = (WinterFlowMapperManager) WinterFlowSyntaxSubsystem6;
                winterFlowResolverLibrary2.WinterFlowBandwidthObject(false);
            } else {
                winterFlowPackageResolver = winterFlowPackageResolver3;
                winterFlowResolverLibrary2 = winterFlowResolverLibrary;
                winterFlowSessionManagerRequest2 = winterFlowSessionManagerRequest;
                winterFlowResolverLibrary2.WinterFlowCompilerDataSource(1353343539);
                winterFlowResolverLibrary2.WinterFlowBandwidthObject(false);
                winterFlowListenerSyntax = null;
            }
            WinterFlowMapperManager WinterFlowCacheManagerAgent2 = winterFlowMapperManager.WinterFlowCacheManagerAgent(winterFlowMapperManager2.WinterFlowCacheManagerAgent(new WinterFlowDataSourceView(winterFlowListenerSyntax, WinterFlowBackendCacheManager, winterFlowSessionManagerRequest2)));
            Object WinterFlowSyntaxSubsystem7 = winterFlowResolverLibrary2.WinterFlowSyntaxSubsystem();
            if (WinterFlowSyntaxSubsystem7 == obj) {
                WinterFlowSyntaxSubsystem7 = new WinterFlowUserManagerSyntax(winterFlowSessionManagerRequest2);
                winterFlowResolverLibrary2.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem7);
            }
            WinterFlowUserManagerSyntax winterFlowUserManagerSyntax = (WinterFlowUserManagerSyntax) WinterFlowSyntaxSubsystem7;
            int hashCode = Long.hashCode(winterFlowResolverLibrary2.WinterFlowConfiguration);
            WinterFlowConfigurationProcess WinterFlowTransactionAgent = winterFlowResolverLibrary2.WinterFlowTransactionAgent();
            WinterFlowMapperManager WinterFlowUserManagerUserManager = WinterFlowSoftwareException.WinterFlowUserManagerUserManager(winterFlowResolverLibrary2, WinterFlowCacheManagerAgent2);
            WinterFlowBandwidthAgent.WinterFlowCacheManagerAgent.getClass();
            WinterFlowConfigurationRequest winterFlowConfigurationRequest = WinterFlowEventEmitterDeserialization.WinterFlowHookDataSource;
            winterFlowResolverLibrary2.WinterFlowModuleAgent();
            if (winterFlowResolverLibrary2.WinterFlowProxyStructure) {
                winterFlowResolverLibrary2.WinterFlowResponseEngine(winterFlowConfigurationRequest);
            } else {
                winterFlowResolverLibrary2.WinterFlowParserPipeline();
            }
            WinterFlowProtocolNetwork.WinterFlowSyntax(WinterFlowEventEmitterDeserialization.WinterFlowVariableVersionControl, winterFlowResolverLibrary2, winterFlowUserManagerSyntax);
            WinterFlowProtocolNetwork.WinterFlowSyntax(WinterFlowEventEmitterDeserialization.WinterFlowArrayNetwork, winterFlowResolverLibrary2, WinterFlowTransactionAgent);
            Integer valueOf = Integer.valueOf(hashCode);
            WinterFlowExceptionBackend winterFlowExceptionBackend = WinterFlowEventEmitterDeserialization.WinterFlowTransactionManagerStrategy;
            if (winterFlowResolverLibrary2.WinterFlowProxyStructure) {
                winterFlowResolverLibrary2.WinterFlowHookDataSource(winterFlowExceptionBackend, valueOf);
            }
            WinterFlowProtocolNetwork.WinterFlowRouterRouter(winterFlowResolverLibrary2, WinterFlowEventEmitterDeserialization.WinterFlowUnitTestResponse);
            WinterFlowProtocolNetwork.WinterFlowSyntax(WinterFlowEventEmitterDeserialization.WinterFlowCacheManagerAgent, winterFlowResolverLibrary2, WinterFlowUserManagerUserManager);
            winterFlowResolverLibrary2.WinterFlowCompilerDataSource(-860173498);
            int size2 = winterFlowPackageResolver.size();
            int i6 = 0;
            while (i6 < size2) {
                WinterFlowPackageResolver winterFlowPackageResolver4 = winterFlowPackageResolver;
                Object obj4 = winterFlowPackageResolver4.get(i6);
                winterFlowResolverLibrary2.WinterFlowCacheTool(-2026002954, 0, winterFlowObjectSession2.WinterFlowUnitTestResponse(obj4), null);
                WinterFlowEventEvent winterFlowEventEvent = (WinterFlowEventEvent) winterFlowDatabaseSchemaStructure.WinterFlowUnitTestResponse(obj4);
                if (winterFlowEventEvent == null) {
                    winterFlowResolverLibrary2.WinterFlowCompilerDataSource(1618454323);
                } else {
                    winterFlowResolverLibrary2.WinterFlowCompilerDataSource(-2026001778);
                    winterFlowEventEvent.WinterFlowVariableVersionControl(winterFlowResolverLibrary2, 0);
                }
                winterFlowResolverLibrary2.WinterFlowBandwidthObject(false);
                winterFlowResolverLibrary2.WinterFlowBandwidthObject(false);
                i6++;
                winterFlowPackageResolver = winterFlowPackageResolver4;
            }
            winterFlowResolverLibrary2.WinterFlowBandwidthObject(false);
            winterFlowResolverLibrary2.WinterFlowBandwidthObject(true);
        } else {
            winterFlowObjectSession3 = winterFlowObjectSession4;
            winterFlowResolverLibrary2 = winterFlowResolverLibrary;
            winterFlowResolverLibrary2.WinterFlowQueueService();
        }
        WinterFlowStackEngine WinterFlowConcurrencyThread = winterFlowResolverLibrary2.WinterFlowConcurrencyThread();
        if (WinterFlowConcurrencyThread != null) {
            WinterFlowConcurrencyThread.WinterFlowArrayNetwork = new WinterFlowThreadPoolNetwork(winterFlowHandlerInvoker, winterFlowMapperManager, winterFlowObjectSession3, winterFlowInvokerConsumer, winterFlowObjectSession2, winterFlowEventTool, i);
        }
    }

    public static final Object WinterFlowSerializerStructure(long j, WinterFlowOrchestrationCompiler winterFlowOrchestrationCompiler) {
        if (j > 0) {
            WinterFlowEventCloud winterFlowEventCloud = new WinterFlowEventCloud(1, WinterFlowCloudStack.WinterFlowCompilerVariable(winterFlowOrchestrationCompiler));
            winterFlowEventCloud.WinterFlowSerializerStructure();
            if (j < Long.MAX_VALUE) {
                WinterFlowConsumerUserManager(winterFlowEventCloud.WinterFlowSyntax).WinterFlowRouterRouter(j, winterFlowEventCloud);
            }
            Object WinterFlowBatchUI = winterFlowEventCloud.WinterFlowBatchUI();
            if (WinterFlowBatchUI == WinterFlowListenerJava.WinterFlowVariableVersionControl) {
                return WinterFlowBatchUI;
            }
        }
        return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
    }

    public static final void WinterFlowServerProtocol(WinterFlowMapperManager winterFlowMapperManager, WinterFlowObjectUI winterFlowObjectUI, WinterFlowResolverLibrary winterFlowResolverLibrary, int i, int i2) {
        final WinterFlowMapperManager winterFlowMapperManager2;
        int i3;
        final int i4;
        final int i5;
        final WinterFlowObjectUI winterFlowObjectUI2 = winterFlowObjectUI;
        WinterFlowResolverLibrary winterFlowResolverLibrary2 = winterFlowResolverLibrary;
        winterFlowObjectUI2.getClass();
        winterFlowResolverLibrary2.WinterFlowFrameworkTransaction(-1448731754);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            winterFlowMapperManager2 = winterFlowMapperManager;
        } else if ((i & 6) == 0) {
            winterFlowMapperManager2 = winterFlowMapperManager;
            i3 = i | (winterFlowResolverLibrary2.WinterFlowVariableVersionControl(winterFlowMapperManager2) ? 4 : 2);
        } else {
            winterFlowMapperManager2 = winterFlowMapperManager;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= winterFlowResolverLibrary2.WinterFlowUnitTestResponse(winterFlowObjectUI2) ? 32 : 16;
        }
        int i7 = i3;
        if (winterFlowResolverLibrary2.WinterFlowFrontendBackend(i7 & 1, (i7 & 19) != 18)) {
            WinterFlowValidatorComponent winterFlowValidatorComponent = WinterFlowValidatorComponent.WinterFlowRouterStructure;
            WinterFlowMapperManager winterFlowMapperManager3 = i6 != 0 ? winterFlowValidatorComponent : winterFlowMapperManager2;
            WinterFlowMicroserviceMechanism winterFlowMicroserviceMechanism = WinterFlowCacheRuntime.WinterFlowThreadListener;
            WinterFlowMapperManager WinterFlowTestingNode = WinterFlowCacheRuntime.WinterFlowTestingNode(WinterFlowServerManager.WinterFlowBackendCacheManager(winterFlowMapperManager3.WinterFlowCacheManagerAgent(winterFlowMicroserviceMechanism), WinterFlowSoftwareException.WinterFlowTestingNode(R.drawable.bg, winterFlowResolverLibrary2, 0), WinterFlowThreadConfiguration.WinterFlowRouterStructure, 0.0f, 54), 16.0f, 2);
            WinterFlowInvokerConsumer winterFlowInvokerConsumer = WinterFlowCacheUtility.WinterFlowUnitTestResponse;
            WinterFlowWorkerModule WinterFlowCacheManagerAgent2 = WinterFlowLibrary.WinterFlowCacheManagerAgent(winterFlowInvokerConsumer, false);
            int hashCode = Long.hashCode(winterFlowResolverLibrary2.WinterFlowConfiguration);
            WinterFlowConfigurationProcess WinterFlowTransactionAgent = winterFlowResolverLibrary2.WinterFlowTransactionAgent();
            WinterFlowMapperManager WinterFlowUserManagerUserManager = WinterFlowSoftwareException.WinterFlowUserManagerUserManager(winterFlowResolverLibrary2, WinterFlowTestingNode);
            WinterFlowBandwidthAgent.WinterFlowCacheManagerAgent.getClass();
            WinterFlowConfigurationRequest winterFlowConfigurationRequest = WinterFlowEventEmitterDeserialization.WinterFlowHookDataSource;
            winterFlowResolverLibrary2.WinterFlowModuleAgent();
            if (winterFlowResolverLibrary2.WinterFlowProxyStructure) {
                winterFlowResolverLibrary2.WinterFlowResponseEngine(winterFlowConfigurationRequest);
            } else {
                winterFlowResolverLibrary2.WinterFlowParserPipeline();
            }
            WinterFlowExceptionBackend winterFlowExceptionBackend = WinterFlowEventEmitterDeserialization.WinterFlowVariableVersionControl;
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend, winterFlowResolverLibrary2, WinterFlowCacheManagerAgent2);
            WinterFlowExceptionBackend winterFlowExceptionBackend2 = WinterFlowEventEmitterDeserialization.WinterFlowArrayNetwork;
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend2, winterFlowResolverLibrary2, WinterFlowTransactionAgent);
            Integer valueOf = Integer.valueOf(hashCode);
            WinterFlowExceptionBackend winterFlowExceptionBackend3 = WinterFlowEventEmitterDeserialization.WinterFlowTransactionManagerStrategy;
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend3, winterFlowResolverLibrary2, valueOf);
            WinterFlowServiceProviderBatch winterFlowServiceProviderBatch = WinterFlowEventEmitterDeserialization.WinterFlowUnitTestResponse;
            WinterFlowProtocolNetwork.WinterFlowRouterRouter(winterFlowResolverLibrary2, winterFlowServiceProviderBatch);
            WinterFlowExceptionBackend winterFlowExceptionBackend4 = WinterFlowEventEmitterDeserialization.WinterFlowCacheManagerAgent;
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend4, winterFlowResolverLibrary2, WinterFlowUserManagerUserManager);
            WinterFlowMapperManager WinterFlowOrchestrationConfiguration = WinterFlowInvokerComponent.WinterFlowOrchestrationConfiguration(winterFlowMicroserviceMechanism, WinterFlowInvokerComponent.WinterFlowQueueService(winterFlowResolverLibrary2));
            WinterFlowRepositoryObject WinterFlowRouterStructure2 = WinterFlowConsumerDataSource.WinterFlowRouterStructure(WinterFlowInvokerComponent.WinterFlowArrayNetwork, WinterFlowCacheUtility.WinterFlowVariableBandwidth, winterFlowResolverLibrary2, 48);
            int hashCode2 = Long.hashCode(winterFlowResolverLibrary2.WinterFlowConfiguration);
            WinterFlowConfigurationProcess WinterFlowTransactionAgent2 = winterFlowResolverLibrary2.WinterFlowTransactionAgent();
            WinterFlowMapperManager WinterFlowUserManagerUserManager2 = WinterFlowSoftwareException.WinterFlowUserManagerUserManager(winterFlowResolverLibrary2, WinterFlowOrchestrationConfiguration);
            winterFlowResolverLibrary2.WinterFlowModuleAgent();
            if (winterFlowResolverLibrary2.WinterFlowProxyStructure) {
                winterFlowResolverLibrary2.WinterFlowResponseEngine(winterFlowConfigurationRequest);
            } else {
                winterFlowResolverLibrary2.WinterFlowParserPipeline();
            }
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend, winterFlowResolverLibrary2, WinterFlowRouterStructure2);
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend2, winterFlowResolverLibrary2, WinterFlowTransactionAgent2);
            WinterFlowResolverBackend.WinterFlowConcurrencyThread(hashCode2, winterFlowResolverLibrary2, winterFlowExceptionBackend3, winterFlowResolverLibrary2, winterFlowServiceProviderBatch);
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend4, winterFlowResolverLibrary2, WinterFlowUserManagerUserManager2);
            WinterFlowMapperManager WinterFlowSoftwareEngine = WinterFlowCacheRuntime.WinterFlowSoftwareEngine(WinterFlowSoftwareException.WinterFlowBandwidthObject(WinterFlowSingletonPlatform(WinterFlowCacheRuntime.WinterFlowSingletonPlatform(1.0f), WinterFlowRepositoryProxy.WinterFlowRouterStructure(12.0f)), WinterFlowSessionManagerProcess.WinterFlowBandwidthObject(WinterFlowUnitTestLibrary.WinterFlowPackageIDE(new WinterFlowInheritanceSubsystem(WinterFlowInvokerComponent.WinterFlowTransactionManagerStrategy(4284666621L)), new WinterFlowInheritanceSubsystem(WinterFlowInvokerComponent.WinterFlowTransactionManagerStrategy(4278336241L))))).WinterFlowCacheManagerAgent(new WinterFlowSoftwareModule(2.0f, WinterFlowSessionManagerProcess.WinterFlowBandwidthObject(WinterFlowUnitTestLibrary.WinterFlowPackageIDE(new WinterFlowInheritanceSubsystem(WinterFlowInvokerComponent.WinterFlowTransactionManagerStrategy(4278336241L)), new WinterFlowInheritanceSubsystem(WinterFlowInvokerComponent.WinterFlowTransactionManagerStrategy(4284666621L)))), WinterFlowRepositoryProxy.WinterFlowRouterStructure(12.0f))), 16.0f);
            WinterFlowWorkerModule WinterFlowCacheManagerAgent3 = WinterFlowLibrary.WinterFlowCacheManagerAgent(winterFlowInvokerConsumer, false);
            int hashCode3 = Long.hashCode(winterFlowResolverLibrary2.WinterFlowConfiguration);
            WinterFlowConfigurationProcess WinterFlowTransactionAgent3 = winterFlowResolverLibrary2.WinterFlowTransactionAgent();
            WinterFlowMapperManager WinterFlowUserManagerUserManager3 = WinterFlowSoftwareException.WinterFlowUserManagerUserManager(winterFlowResolverLibrary2, WinterFlowSoftwareEngine);
            winterFlowResolverLibrary2.WinterFlowModuleAgent();
            if (winterFlowResolverLibrary2.WinterFlowProxyStructure) {
                winterFlowResolverLibrary2.WinterFlowResponseEngine(winterFlowConfigurationRequest);
            } else {
                winterFlowResolverLibrary2.WinterFlowParserPipeline();
            }
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend, winterFlowResolverLibrary2, WinterFlowCacheManagerAgent3);
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend2, winterFlowResolverLibrary2, WinterFlowTransactionAgent3);
            WinterFlowResolverBackend.WinterFlowConcurrencyThread(hashCode3, winterFlowResolverLibrary2, winterFlowExceptionBackend3, winterFlowResolverLibrary2, winterFlowServiceProviderBatch);
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend4, winterFlowResolverLibrary2, WinterFlowUserManagerUserManager3);
            WinterFlowSingletonRuntime.WinterFlowHookDataSource("GAME RULES", WinterFlowCacheRuntime.WinterFlowSingletonPlatform(1.0f), WinterFlowInheritanceSubsystem.WinterFlowCacheManagerAgent, WinterFlowDecoratorUI.WinterFlowBatchUI(28), WinterFlowObjectHook.WinterFlowTransactionAgent, 0L, new WinterFlowThreadPoolEventEmitter(3), 0L, 0, false, 0, 0, null, winterFlowResolverLibrary, 1597878, 261032);
            winterFlowResolverLibrary2 = winterFlowResolverLibrary;
            winterFlowResolverLibrary2.WinterFlowBandwidthObject(true);
            WinterFlowProtocolNetwork.WinterFlowRouterStructure(winterFlowResolverLibrary2, WinterFlowCacheRuntime.WinterFlowArrayHelper(20.0f));
            WinterFlowTransactionAgent("CORE GAMEPLAY", WinterFlowUnitTestLibrary.WinterFlowRouterStructure, winterFlowResolverLibrary2, 54);
            WinterFlowProtocolNetwork.WinterFlowRouterStructure(winterFlowResolverLibrary2, WinterFlowCacheRuntime.WinterFlowArrayHelper(12.0f));
            WinterFlowTransactionAgent("ARCHIVE & ENERGY", WinterFlowUnitTestLibrary.WinterFlowHookDataSource, winterFlowResolverLibrary2, 54);
            WinterFlowProtocolNetwork.WinterFlowRouterStructure(winterFlowResolverLibrary2, WinterFlowCacheRuntime.WinterFlowArrayHelper(12.0f));
            WinterFlowTransactionAgent("DIFFICULTY MODES", WinterFlowUnitTestLibrary.WinterFlowCacheManagerAgent, winterFlowResolverLibrary2, 54);
            WinterFlowProtocolNetwork.WinterFlowRouterStructure(winterFlowResolverLibrary2, WinterFlowCacheRuntime.WinterFlowArrayHelper(32.0f));
            i5 = i2;
            winterFlowObjectUI2 = winterFlowObjectUI;
            i4 = i;
            WinterFlowSoftwareException.WinterFlowServerProtocol(((i7 << 3) & 896) | 54, 0, winterFlowObjectUI2, winterFlowResolverLibrary2, WinterFlowCacheRuntime.WinterFlowOrchestrationConfiguration(winterFlowValidatorComponent, 200.0f), "BACK");
            WinterFlowProtocolNetwork.WinterFlowRouterStructure(winterFlowResolverLibrary2, WinterFlowCacheRuntime.WinterFlowArrayHelper(16.0f));
            winterFlowResolverLibrary2.WinterFlowBandwidthObject(true);
            winterFlowResolverLibrary2.WinterFlowBandwidthObject(true);
            winterFlowMapperManager2 = winterFlowMapperManager3;
        } else {
            i4 = i;
            i5 = i2;
            winterFlowResolverLibrary2.WinterFlowQueueService();
        }
        WinterFlowStackEngine WinterFlowConcurrencyThread = winterFlowResolverLibrary2.WinterFlowConcurrencyThread();
        if (WinterFlowConcurrencyThread != null) {
            WinterFlowConcurrencyThread.WinterFlowArrayNetwork = new WinterFlowEventEvent() { // from class: com.google.android.datatransport.WinterFlowDecoratorWorker
                @Override // com.google.android.datatransport.WinterFlowEventEvent
                public final Object WinterFlowVariableVersionControl(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int WinterFlowResponseEngine = WinterFlowConfigurationException.WinterFlowResponseEngine(i4 | 1);
                    WinterFlowManagerRequest.WinterFlowServerProtocol(WinterFlowMapperManager.this, winterFlowObjectUI2, (WinterFlowResolverLibrary) obj, WinterFlowResponseEngine, i5);
                    return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                }
            };
        }
    }

    public static final int WinterFlowServiceUtility(int i, WinterFlowJSON winterFlowJSON) {
        int i2 = winterFlowJSON.WinterFlowUnitTestResponse - 1;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = ((i2 - i3) / 2) + i3;
            Object[] objArr = winterFlowJSON.WinterFlowVariableVersionControl;
            int i5 = ((WinterFlowModuleSyntax) objArr[i4]).WinterFlowRouterStructure;
            if (i5 != i) {
                if (i5 < i) {
                    i3 = i4 + 1;
                    if (i < ((WinterFlowModuleSyntax) objArr[i3]).WinterFlowRouterStructure) {
                    }
                } else {
                    i2 = i4 - 1;
                }
            }
            return i4;
        }
        return i3;
    }

    public static final WinterFlowMapperManager WinterFlowSingletonPlatform(WinterFlowMapperManager winterFlowMapperManager, WinterFlowVersionControlUtility winterFlowVersionControlUtility) {
        return WinterFlowUnitTestLibrary.WinterFlowEventEmitterController(winterFlowMapperManager, 0.0f, 0.0f, 0.0f, winterFlowVersionControlUtility, 518143);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7, types: [com.google.android.datatransport.WinterFlowUserManagerController] */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9, types: [com.google.android.datatransport.WinterFlowUserManagerController] */
    /* JADX WARN: Type inference failed for: r1v42, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [com.google.android.datatransport.WinterFlowJSON] */
    public static final boolean WinterFlowSoftwareEngine(WinterFlowDeploymentWidget winterFlowDeploymentWidget) {
        WinterFlowJSON winterFlowJSON;
        WinterFlowExceptionStrategy winterFlowExceptionStrategy;
        WinterFlowHookMechanism winterFlowHookMechanism;
        boolean z;
        int i;
        ?? r5;
        int i2;
        int i3;
        WinterFlowExceptionStrategy winterFlowExceptionStrategy2;
        WinterFlowHookMechanism winterFlowHookMechanism2 = (WinterFlowHookMechanism) ((WinterFlowSyntaxTransactionManager) WinterFlowCloudStack.WinterFlowTestingNode(winterFlowDeploymentWidget)).getFocusOwner();
        WinterFlowDeploymentWidget WinterFlowTransactionManagerStrategy = winterFlowHookMechanism2.WinterFlowTransactionManagerStrategy();
        WinterFlowProtocolCache WinterFlowEncryptionAdapter = winterFlowDeploymentWidget.WinterFlowEncryptionAdapter();
        if (WinterFlowTransactionManagerStrategy == winterFlowDeploymentWidget) {
            winterFlowDeploymentWidget.WinterFlowUIPlatform(WinterFlowEncryptionAdapter, WinterFlowEncryptionAdapter);
            return true;
        }
        if ((WinterFlowTransactionManagerStrategy == null || WinterFlowTransactionManagerStrategy.WinterFlowVariableBandwidth) && !winterFlowDeploymentWidget.WinterFlowVariableBandwidth && !((WinterFlowHookMechanism) ((WinterFlowSyntaxTransactionManager) WinterFlowCloudStack.WinterFlowTestingNode(winterFlowDeploymentWidget)).getFocusOwner()).WinterFlowRouterStructure.WinterFlowConfigurationSubsystem()) {
            return false;
        }
        if (WinterFlowTransactionManagerStrategy != null) {
            winterFlowJSON = new WinterFlowJSON(new WinterFlowDeploymentWidget[16]);
            if (!WinterFlowTransactionManagerStrategy.WinterFlowVariableVersionControl.WinterFlowSingletonPlatform) {
                WinterFlowViewUtility.WinterFlowHookDataSource("visitAncestors called on an unattached node");
            }
            WinterFlowUserManagerController winterFlowUserManagerController = WinterFlowTransactionManagerStrategy.WinterFlowVariableVersionControl.WinterFlowSyntax;
            WinterFlowSchedulerStructure WinterFlowSyntaxSubsystem = WinterFlowCloudStack.WinterFlowSyntaxSubsystem(WinterFlowTransactionManagerStrategy);
            while (WinterFlowSyntaxSubsystem != null) {
                if ((WinterFlowSyntaxSubsystem.WinterFlowUserManagerUserManager.WinterFlowTransactionManagerStrategy.WinterFlowRouterRouter & 1024) != 0) {
                    while (winterFlowUserManagerController != null) {
                        if ((winterFlowUserManagerController.WinterFlowUnitTestResponse & 1024) != 0) {
                            WinterFlowUserManagerController winterFlowUserManagerController2 = winterFlowUserManagerController;
                            WinterFlowJSON winterFlowJSON2 = null;
                            while (winterFlowUserManagerController2 != null) {
                                if (winterFlowUserManagerController2 instanceof WinterFlowDeploymentWidget) {
                                    winterFlowJSON.WinterFlowHookDataSource((WinterFlowDeploymentWidget) winterFlowUserManagerController2);
                                } else if ((winterFlowUserManagerController2.WinterFlowUnitTestResponse & 1024) != 0 && (winterFlowUserManagerController2 instanceof WinterFlowTestingEntity)) {
                                    int i4 = 0;
                                    for (WinterFlowUserManagerController winterFlowUserManagerController3 = ((WinterFlowTestingEntity) winterFlowUserManagerController2).WinterFlowBatchUI; winterFlowUserManagerController3 != null; winterFlowUserManagerController3 = winterFlowUserManagerController3.WinterFlowResponseEngine) {
                                        if ((winterFlowUserManagerController3.WinterFlowUnitTestResponse & 1024) != 0) {
                                            i4++;
                                            if (i4 == 1) {
                                                winterFlowUserManagerController2 = winterFlowUserManagerController3;
                                            } else {
                                                if (winterFlowJSON2 == null) {
                                                    winterFlowJSON2 = new WinterFlowJSON(new WinterFlowUserManagerController[16]);
                                                }
                                                if (winterFlowUserManagerController2 != null) {
                                                    winterFlowJSON2.WinterFlowHookDataSource(winterFlowUserManagerController2);
                                                    winterFlowUserManagerController2 = null;
                                                }
                                                winterFlowJSON2.WinterFlowHookDataSource(winterFlowUserManagerController3);
                                            }
                                        }
                                    }
                                    if (i4 == 1) {
                                    }
                                }
                                winterFlowUserManagerController2 = WinterFlowCloudStack.WinterFlowPackageIDE(winterFlowJSON2);
                            }
                        }
                        winterFlowUserManagerController = winterFlowUserManagerController.WinterFlowSyntax;
                    }
                }
                WinterFlowSyntaxSubsystem = WinterFlowSyntaxSubsystem.WinterFlowVariableBandwidth();
                winterFlowUserManagerController = (WinterFlowSyntaxSubsystem == null || (winterFlowExceptionStrategy2 = WinterFlowSyntaxSubsystem.WinterFlowUserManagerUserManager) == null) ? null : winterFlowExceptionStrategy2.WinterFlowVariableVersionControl;
            }
        } else {
            winterFlowJSON = null;
        }
        WinterFlowDeploymentWidget[] winterFlowDeploymentWidgetArr = new WinterFlowDeploymentWidget[16];
        WinterFlowDeploymentWidget[] winterFlowDeploymentWidgetArr2 = new WinterFlowDeploymentWidget[16];
        if (!winterFlowDeploymentWidget.WinterFlowVariableVersionControl.WinterFlowSingletonPlatform) {
            WinterFlowViewUtility.WinterFlowHookDataSource("visitAncestors called on an unattached node");
        }
        WinterFlowUserManagerController winterFlowUserManagerController4 = winterFlowDeploymentWidget.WinterFlowVariableVersionControl.WinterFlowSyntax;
        WinterFlowSchedulerStructure WinterFlowSyntaxSubsystem2 = WinterFlowCloudStack.WinterFlowSyntaxSubsystem(winterFlowDeploymentWidget);
        boolean z2 = true;
        int i5 = 0;
        int i6 = 0;
        while (WinterFlowSyntaxSubsystem2 != null) {
            if ((WinterFlowSyntaxSubsystem2.WinterFlowUserManagerUserManager.WinterFlowTransactionManagerStrategy.WinterFlowRouterRouter & 1024) != 0) {
                while (winterFlowUserManagerController4 != null) {
                    if ((winterFlowUserManagerController4.WinterFlowUnitTestResponse & 1024) != 0) {
                        WinterFlowDeploymentWidget winterFlowDeploymentWidget2 = winterFlowUserManagerController4;
                        WinterFlowJSON winterFlowJSON3 = null;
                        while (winterFlowDeploymentWidget2 != 0) {
                            if (winterFlowDeploymentWidget2 instanceof WinterFlowDeploymentWidget) {
                                WinterFlowDeploymentWidget winterFlowDeploymentWidget3 = winterFlowDeploymentWidget2;
                                if (WinterFlowThreadListener(winterFlowJSON != null ? Boolean.valueOf(winterFlowJSON.WinterFlowResponseEngine(winterFlowDeploymentWidget3)) : null, Boolean.TRUE)) {
                                    int i7 = i5 + 1;
                                    if (winterFlowDeploymentWidgetArr.length < i7) {
                                        int length = winterFlowDeploymentWidgetArr.length;
                                        winterFlowHookMechanism = winterFlowHookMechanism2;
                                        ?? r1 = new Object[Math.max(i7, length * 2)];
                                        i3 = i7;
                                        System.arraycopy(winterFlowDeploymentWidgetArr, 0, r1, 0, length);
                                        winterFlowDeploymentWidgetArr = r1;
                                    } else {
                                        winterFlowHookMechanism = winterFlowHookMechanism2;
                                        i3 = i7;
                                    }
                                    winterFlowDeploymentWidgetArr[i5] = winterFlowDeploymentWidget3;
                                    i5 = i3;
                                } else {
                                    winterFlowHookMechanism = winterFlowHookMechanism2;
                                    int i8 = i6 + 1;
                                    if (winterFlowDeploymentWidgetArr2.length < i8) {
                                        int length2 = winterFlowDeploymentWidgetArr2.length;
                                        ?? r52 = new Object[Math.max(i8, length2 * 2)];
                                        i2 = i8;
                                        System.arraycopy(winterFlowDeploymentWidgetArr2, 0, r52, 0, length2);
                                        winterFlowDeploymentWidgetArr2 = r52;
                                    } else {
                                        i2 = i8;
                                    }
                                    winterFlowDeploymentWidgetArr2[i6] = winterFlowDeploymentWidget3;
                                    i6 = i2;
                                }
                                if (winterFlowDeploymentWidget3 == WinterFlowTransactionManagerStrategy) {
                                    z2 = false;
                                }
                                z = false;
                            } else {
                                winterFlowHookMechanism = winterFlowHookMechanism2;
                                z = true;
                            }
                            if (z && (winterFlowDeploymentWidget2.WinterFlowUnitTestResponse & 1024) != 0 && (winterFlowDeploymentWidget2 instanceof WinterFlowTestingEntity)) {
                                WinterFlowUserManagerController winterFlowUserManagerController5 = winterFlowDeploymentWidget2.WinterFlowBatchUI;
                                int i9 = 0;
                                winterFlowDeploymentWidget2 = winterFlowDeploymentWidget2;
                                while (winterFlowUserManagerController5 != null) {
                                    if ((winterFlowUserManagerController5.WinterFlowUnitTestResponse & 1024) != 0) {
                                        int i10 = i9 + 1;
                                        if (i10 == 1) {
                                            winterFlowDeploymentWidget2 = winterFlowUserManagerController5;
                                            i = i10;
                                        } else {
                                            if (winterFlowJSON3 == null) {
                                                i = i10;
                                                r5 = new WinterFlowJSON(new WinterFlowUserManagerController[16]);
                                            } else {
                                                i = i10;
                                                r5 = winterFlowJSON3;
                                            }
                                            if (winterFlowDeploymentWidget2 != 0) {
                                                r5.WinterFlowHookDataSource(winterFlowDeploymentWidget2);
                                                winterFlowDeploymentWidget2 = 0;
                                            }
                                            r5.WinterFlowHookDataSource(winterFlowUserManagerController5);
                                            winterFlowJSON3 = r5;
                                            winterFlowDeploymentWidget2 = winterFlowDeploymentWidget2;
                                        }
                                        i9 = i;
                                    }
                                    winterFlowUserManagerController5 = winterFlowUserManagerController5.WinterFlowResponseEngine;
                                    winterFlowDeploymentWidget2 = winterFlowDeploymentWidget2;
                                }
                                if (i9 == 1) {
                                    winterFlowHookMechanism2 = winterFlowHookMechanism;
                                }
                            }
                            winterFlowDeploymentWidget2 = WinterFlowCloudStack.WinterFlowPackageIDE(winterFlowJSON3);
                            winterFlowHookMechanism2 = winterFlowHookMechanism;
                        }
                    }
                    winterFlowUserManagerController4 = winterFlowUserManagerController4.WinterFlowSyntax;
                    winterFlowHookMechanism2 = winterFlowHookMechanism2;
                }
            }
            WinterFlowHookMechanism winterFlowHookMechanism3 = winterFlowHookMechanism2;
            WinterFlowSyntaxSubsystem2 = WinterFlowSyntaxSubsystem2.WinterFlowVariableBandwidth();
            winterFlowUserManagerController4 = (WinterFlowSyntaxSubsystem2 == null || (winterFlowExceptionStrategy = WinterFlowSyntaxSubsystem2.WinterFlowUserManagerUserManager) == null) ? null : winterFlowExceptionStrategy.WinterFlowVariableVersionControl;
            winterFlowHookMechanism2 = winterFlowHookMechanism3;
        }
        WinterFlowHookMechanism winterFlowHookMechanism4 = winterFlowHookMechanism2;
        if (z2 && WinterFlowTransactionManagerStrategy != null && !WinterFlowConcurrencyThread(WinterFlowTransactionManagerStrategy, false)) {
            return false;
        }
        WinterFlowQuerySyntax.WinterFlowMapperProtocol(winterFlowDeploymentWidget, new WinterFlowRouterEngine(4, winterFlowDeploymentWidget));
        int ordinal = winterFlowDeploymentWidget.WinterFlowEncryptionAdapter().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        WinterFlowEventEmitterOrchestration.WinterFlowRouterStructure();
                        return false;
                    }
                }
            }
            ((WinterFlowHookMechanism) ((WinterFlowSyntaxTransactionManager) WinterFlowCloudStack.WinterFlowTestingNode(winterFlowDeploymentWidget)).getFocusOwner()).WinterFlowRouterRouter(winterFlowDeploymentWidget);
        }
        WinterFlowProtocolCache winterFlowProtocolCache = WinterFlowProtocolCache.WinterFlowUnitTestResponse;
        WinterFlowProtocolCache winterFlowProtocolCache2 = WinterFlowProtocolCache.WinterFlowVariableVersionControl;
        if (z2 && WinterFlowTransactionManagerStrategy != null) {
            WinterFlowTransactionManagerStrategy.WinterFlowUIPlatform(winterFlowProtocolCache2, winterFlowProtocolCache);
        }
        WinterFlowProtocolCache winterFlowProtocolCache3 = WinterFlowProtocolCache.WinterFlowTransactionManagerStrategy;
        if (winterFlowJSON != null) {
            int i11 = winterFlowJSON.WinterFlowUnitTestResponse - 1;
            Object[] objArr = winterFlowJSON.WinterFlowVariableVersionControl;
            if (i11 < objArr.length) {
                while (i11 >= 0) {
                    WinterFlowDeploymentWidget winterFlowDeploymentWidget4 = (WinterFlowDeploymentWidget) objArr[i11];
                    if (winterFlowHookMechanism4.WinterFlowTransactionManagerStrategy() != winterFlowDeploymentWidget) {
                        return false;
                    }
                    winterFlowDeploymentWidget4.WinterFlowUIPlatform(winterFlowProtocolCache3, winterFlowProtocolCache);
                    i11--;
                }
            }
        }
        int i12 = i6 - 1;
        if (i12 < winterFlowDeploymentWidgetArr2.length) {
            while (i12 >= 0) {
                WinterFlowDeploymentWidget winterFlowDeploymentWidget5 = winterFlowDeploymentWidgetArr2[i12];
                if (winterFlowHookMechanism4.WinterFlowTransactionManagerStrategy() != winterFlowDeploymentWidget) {
                    return false;
                }
                winterFlowDeploymentWidget5.WinterFlowUIPlatform(winterFlowDeploymentWidget5 == WinterFlowTransactionManagerStrategy ? winterFlowProtocolCache2 : winterFlowProtocolCache, winterFlowProtocolCache3);
                i12--;
            }
        }
        if (winterFlowHookMechanism4.WinterFlowTransactionManagerStrategy() != winterFlowDeploymentWidget) {
            return false;
        }
        winterFlowDeploymentWidget.WinterFlowUIPlatform(WinterFlowEncryptionAdapter, winterFlowProtocolCache2);
        return winterFlowHookMechanism4.WinterFlowTransactionManagerStrategy() == winterFlowDeploymentWidget;
    }

    public static final WinterFlowProxyMechanism WinterFlowSoftwareProtocol(WinterFlowDeploymentWidget winterFlowDeploymentWidget, int i) {
        if (!winterFlowDeploymentWidget.WinterFlowSerializerStructure) {
            winterFlowDeploymentWidget.WinterFlowSerializerStructure = true;
            try {
                WinterFlowConsumerListener WinterFlowUserManagerConcurrency = winterFlowDeploymentWidget.WinterFlowUserManagerConcurrency();
                WinterFlowViewEvent winterFlowViewEvent = new WinterFlowViewEvent(i);
                WinterFlowHookMechanism winterFlowHookMechanism = (WinterFlowHookMechanism) ((WinterFlowSyntaxTransactionManager) WinterFlowCloudStack.WinterFlowTestingNode(winterFlowDeploymentWidget)).getFocusOwner();
                WinterFlowDeploymentWidget WinterFlowTransactionManagerStrategy = winterFlowHookMechanism.WinterFlowTransactionManagerStrategy();
                WinterFlowUserManagerConcurrency.WinterFlowResponseEngine.WinterFlowUnitTestResponse(winterFlowViewEvent);
                WinterFlowDeploymentWidget WinterFlowTransactionManagerStrategy2 = winterFlowHookMechanism.WinterFlowTransactionManagerStrategy();
                boolean z = winterFlowViewEvent.WinterFlowHookDataSource;
                WinterFlowProxyMechanism winterFlowProxyMechanism = WinterFlowProxyMechanism.WinterFlowTransactionManagerStrategy;
                if (z) {
                    WinterFlowAlgorithmModule winterFlowAlgorithmModule = WinterFlowAlgorithmModule.WinterFlowHookDataSource;
                    return winterFlowProxyMechanism;
                }
                if (WinterFlowTransactionManagerStrategy != WinterFlowTransactionManagerStrategy2 && WinterFlowTransactionManagerStrategy2 != null) {
                    return WinterFlowAlgorithmModule.WinterFlowArrayNetwork == WinterFlowAlgorithmModule.WinterFlowCacheManagerAgent ? winterFlowProxyMechanism : WinterFlowProxyMechanism.WinterFlowUnitTestResponse;
                }
            } finally {
                winterFlowDeploymentWidget.WinterFlowSerializerStructure = false;
            }
        }
        return WinterFlowProxyMechanism.WinterFlowVariableVersionControl;
    }

    public static final WinterFlowResolverDecorator WinterFlowStrategyTool(WinterFlowResolverDecorator winterFlowResolverDecorator) {
        WinterFlowSchedulerStructure winterFlowSchedulerStructure = winterFlowResolverDecorator.WinterFlowVariableBandwidth.WinterFlowVariableBandwidth;
        while (true) {
            WinterFlowSchedulerStructure WinterFlowVariableBandwidth = winterFlowSchedulerStructure.WinterFlowVariableBandwidth();
            WinterFlowSchedulerStructure winterFlowSchedulerStructure2 = null;
            if ((WinterFlowVariableBandwidth != null ? WinterFlowVariableBandwidth.WinterFlowServerProtocol : null) == null) {
                WinterFlowResolverDecorator WinterFlowRepositoryAlgorithm = winterFlowSchedulerStructure.WinterFlowUserManagerUserManager.WinterFlowArrayNetwork.WinterFlowRepositoryAlgorithm();
                WinterFlowRepositoryAlgorithm.getClass();
                return WinterFlowRepositoryAlgorithm;
            }
            WinterFlowSchedulerStructure WinterFlowVariableBandwidth2 = winterFlowSchedulerStructure.WinterFlowVariableBandwidth();
            if (WinterFlowVariableBandwidth2 != null) {
                winterFlowSchedulerStructure2 = WinterFlowVariableBandwidth2.WinterFlowServerProtocol;
            }
            winterFlowSchedulerStructure2.getClass();
            WinterFlowSchedulerStructure WinterFlowVariableBandwidth3 = winterFlowSchedulerStructure.WinterFlowVariableBandwidth();
            WinterFlowVariableBandwidth3.getClass();
            winterFlowSchedulerStructure = WinterFlowVariableBandwidth3.WinterFlowServerProtocol;
            winterFlowSchedulerStructure.getClass();
        }
    }

    public static final void WinterFlowSyntax(Object obj, int i, WinterFlowServiceFrontend winterFlowServiceFrontend, WinterFlowEventTool winterFlowEventTool, WinterFlowResolverLibrary winterFlowResolverLibrary, int i2) {
        int i3;
        winterFlowResolverLibrary.WinterFlowFrameworkTransaction(872548579);
        if ((i2 & 6) == 0) {
            i3 = (winterFlowResolverLibrary.WinterFlowUnitTestResponse(obj) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= winterFlowResolverLibrary.WinterFlowCacheManagerAgent(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowServiceFrontend) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowEventTool) ? 2048 : 1024;
        }
        if (winterFlowResolverLibrary.WinterFlowFrontendBackend(i3 & 1, (i3 & 1171) != 1170)) {
            boolean WinterFlowVariableVersionControl = winterFlowResolverLibrary.WinterFlowVariableVersionControl(obj) | winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowServiceFrontend);
            Object WinterFlowSyntaxSubsystem = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
            Object obj2 = WinterFlowModuleModule.WinterFlowRouterStructure;
            if (WinterFlowVariableVersionControl || WinterFlowSyntaxSubsystem == obj2) {
                WinterFlowSyntaxSubsystem = new WinterFlowDatabaseServer(obj, winterFlowServiceFrontend);
                winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem);
            }
            WinterFlowDatabaseServer winterFlowDatabaseServer = (WinterFlowDatabaseServer) WinterFlowSyntaxSubsystem;
            winterFlowDatabaseServer.WinterFlowCacheManagerAgent = i;
            WinterFlowResolverSubsystem winterFlowResolverSubsystem = winterFlowDatabaseServer.WinterFlowUnitTestResponse;
            WinterFlowProtocolEntity winterFlowProtocolEntity = WinterFlowService.WinterFlowRouterStructure;
            WinterFlowDatabaseServer winterFlowDatabaseServer2 = (WinterFlowDatabaseServer) winterFlowResolverLibrary.WinterFlowSyntax(winterFlowProtocolEntity);
            WinterFlowJSONModule WinterFlowVariableVersionControl2 = WinterFlowWorkerVersionControl.WinterFlowVariableVersionControl();
            WinterFlowObjectSession WinterFlowVariableVersionControl3 = WinterFlowVariableVersionControl2 != null ? WinterFlowVariableVersionControl2.WinterFlowVariableVersionControl() : null;
            WinterFlowJSONModule WinterFlowResponseEngine = WinterFlowWorkerVersionControl.WinterFlowResponseEngine(WinterFlowVariableVersionControl2);
            try {
                if (winterFlowDatabaseServer2 != ((WinterFlowDatabaseServer) winterFlowResolverSubsystem.getValue())) {
                    winterFlowResolverSubsystem.setValue(winterFlowDatabaseServer2);
                    if (winterFlowDatabaseServer.WinterFlowArrayNetwork > 0) {
                        WinterFlowDatabaseServer winterFlowDatabaseServer3 = winterFlowDatabaseServer.WinterFlowVariableVersionControl;
                        if (winterFlowDatabaseServer3 != null) {
                            winterFlowDatabaseServer3.WinterFlowHookDataSource();
                        }
                        if (winterFlowDatabaseServer2 != null) {
                            winterFlowDatabaseServer2.WinterFlowRouterStructure();
                        } else {
                            winterFlowDatabaseServer2 = null;
                        }
                        winterFlowDatabaseServer.WinterFlowVariableVersionControl = winterFlowDatabaseServer2;
                    }
                }
                WinterFlowWorkerVersionControl.WinterFlowBandwidthObject(WinterFlowVariableVersionControl2, WinterFlowResponseEngine, WinterFlowVariableVersionControl3);
                boolean WinterFlowVariableVersionControl4 = winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowDatabaseServer);
                Object WinterFlowSyntaxSubsystem2 = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
                if (WinterFlowVariableVersionControl4 || WinterFlowSyntaxSubsystem2 == obj2) {
                    WinterFlowSyntaxSubsystem2 = new WinterFlowCompilerCloud(10, winterFlowDatabaseServer);
                    winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem2);
                }
                WinterFlowSoftwareException.WinterFlowHookDataSource(winterFlowDatabaseServer, (WinterFlowObjectSession) WinterFlowSyntaxSubsystem2, winterFlowResolverLibrary);
                WinterFlowHandlerWebsocket.WinterFlowHookDataSource(winterFlowProtocolEntity.WinterFlowRouterStructure(winterFlowDatabaseServer), winterFlowEventTool, winterFlowResolverLibrary, ((i3 >> 6) & 112) | 8);
            } catch (Throwable th) {
                WinterFlowWorkerVersionControl.WinterFlowBandwidthObject(WinterFlowVariableVersionControl2, WinterFlowResponseEngine, WinterFlowVariableVersionControl3);
                throw th;
            }
        } else {
            winterFlowResolverLibrary.WinterFlowQueueService();
        }
        WinterFlowStackEngine WinterFlowConcurrencyThread = winterFlowResolverLibrary.WinterFlowConcurrencyThread();
        if (WinterFlowConcurrencyThread != null) {
            WinterFlowConcurrencyThread.WinterFlowArrayNetwork = new WinterFlowJSONMapper(obj, i, winterFlowServiceFrontend, winterFlowEventTool, i2, 2);
        }
    }

    public static final WinterFlowEventTool WinterFlowSyntaxSubsystem(int i, WinterFlowOrchestrationIDE winterFlowOrchestrationIDE, WinterFlowResolverLibrary winterFlowResolverLibrary) {
        Object WinterFlowSyntaxSubsystem = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
        if (WinterFlowSyntaxSubsystem == WinterFlowModuleModule.WinterFlowRouterStructure) {
            WinterFlowSyntaxSubsystem = new WinterFlowEventTool(i, true, winterFlowOrchestrationIDE);
            winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem);
        }
        WinterFlowEventTool winterFlowEventTool = (WinterFlowEventTool) WinterFlowSyntaxSubsystem;
        if (!WinterFlowThreadListener(winterFlowEventTool.WinterFlowUnitTestResponse, winterFlowOrchestrationIDE)) {
            boolean z = winterFlowEventTool.WinterFlowUnitTestResponse == null;
            winterFlowEventTool.WinterFlowUnitTestResponse = winterFlowOrchestrationIDE;
            if (!z && winterFlowEventTool.WinterFlowTransactionManagerStrategy) {
                WinterFlowStackEngine winterFlowStackEngine = winterFlowEventTool.WinterFlowRouterRouter;
                if (winterFlowStackEngine != null) {
                    WinterFlowTransactionBackend winterFlowTransactionBackend = winterFlowStackEngine.WinterFlowRouterStructure;
                    if (winterFlowTransactionBackend != null) {
                        winterFlowTransactionBackend.WinterFlowVariableBandwidth(winterFlowStackEngine, null);
                    }
                    winterFlowEventTool.WinterFlowRouterRouter = null;
                }
                ArrayList arrayList = winterFlowEventTool.WinterFlowSyntax;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        WinterFlowStackEngine winterFlowStackEngine2 = (WinterFlowStackEngine) arrayList.get(i2);
                        WinterFlowTransactionBackend winterFlowTransactionBackend2 = winterFlowStackEngine2.WinterFlowRouterStructure;
                        if (winterFlowTransactionBackend2 != null) {
                            winterFlowTransactionBackend2.WinterFlowVariableBandwidth(winterFlowStackEngine2, null);
                        }
                    }
                    arrayList.clear();
                }
            }
        }
        return winterFlowEventTool;
    }

    public static void WinterFlowTestingNode(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }

    public static boolean WinterFlowThreadListener(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static final void WinterFlowTransactionAgent(String str, WinterFlowEventTool winterFlowEventTool, WinterFlowResolverLibrary winterFlowResolverLibrary, int i) {
        WinterFlowResolverLibrary winterFlowResolverLibrary2 = winterFlowResolverLibrary;
        winterFlowResolverLibrary2.WinterFlowFrameworkTransaction(967493962);
        if (winterFlowResolverLibrary2.WinterFlowFrontendBackend(i & 1, (i & 19) != 18)) {
            WinterFlowMapperManager WinterFlowSoftwareEngine = WinterFlowCacheRuntime.WinterFlowSoftwareEngine(WinterFlowSoftwareException.WinterFlowConcurrencyThread(WinterFlowSoftwareException.WinterFlowOrchestrationSubsystem(WinterFlowSingletonPlatform(WinterFlowCacheRuntime.WinterFlowSingletonPlatform(1.0f), WinterFlowRepositoryProxy.WinterFlowRouterStructure(12.0f)), WinterFlowInheritanceSubsystem.WinterFlowHookDataSource(WinterFlowInheritanceSubsystem.WinterFlowHookDataSource, 0.5f), WinterFlowCacheRuntime.WinterFlowTransactionAgent), 1.0f, WinterFlowInheritanceSubsystem.WinterFlowHookDataSource(WinterFlowInvokerComponent.WinterFlowTransactionManagerStrategy(4284666621L), 0.5f), WinterFlowRepositoryProxy.WinterFlowRouterStructure(12.0f)), 16.0f);
            WinterFlowWorkerModule WinterFlowCacheManagerAgent2 = WinterFlowLibrary.WinterFlowCacheManagerAgent(WinterFlowCacheUtility.WinterFlowUnitTestResponse, false);
            int hashCode = Long.hashCode(winterFlowResolverLibrary2.WinterFlowConfiguration);
            WinterFlowConfigurationProcess WinterFlowTransactionAgent = winterFlowResolverLibrary2.WinterFlowTransactionAgent();
            WinterFlowMapperManager WinterFlowUserManagerUserManager = WinterFlowSoftwareException.WinterFlowUserManagerUserManager(winterFlowResolverLibrary2, WinterFlowSoftwareEngine);
            WinterFlowBandwidthAgent.WinterFlowCacheManagerAgent.getClass();
            WinterFlowConfigurationRequest winterFlowConfigurationRequest = WinterFlowEventEmitterDeserialization.WinterFlowHookDataSource;
            winterFlowResolverLibrary2.WinterFlowModuleAgent();
            if (winterFlowResolverLibrary2.WinterFlowProxyStructure) {
                winterFlowResolverLibrary2.WinterFlowResponseEngine(winterFlowConfigurationRequest);
            } else {
                winterFlowResolverLibrary2.WinterFlowParserPipeline();
            }
            WinterFlowExceptionBackend winterFlowExceptionBackend = WinterFlowEventEmitterDeserialization.WinterFlowVariableVersionControl;
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend, winterFlowResolverLibrary2, WinterFlowCacheManagerAgent2);
            WinterFlowExceptionBackend winterFlowExceptionBackend2 = WinterFlowEventEmitterDeserialization.WinterFlowArrayNetwork;
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend2, winterFlowResolverLibrary2, WinterFlowTransactionAgent);
            Integer valueOf = Integer.valueOf(hashCode);
            WinterFlowExceptionBackend winterFlowExceptionBackend3 = WinterFlowEventEmitterDeserialization.WinterFlowTransactionManagerStrategy;
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend3, winterFlowResolverLibrary2, valueOf);
            WinterFlowServiceProviderBatch winterFlowServiceProviderBatch = WinterFlowEventEmitterDeserialization.WinterFlowUnitTestResponse;
            WinterFlowProtocolNetwork.WinterFlowRouterRouter(winterFlowResolverLibrary2, winterFlowServiceProviderBatch);
            WinterFlowExceptionBackend winterFlowExceptionBackend4 = WinterFlowEventEmitterDeserialization.WinterFlowCacheManagerAgent;
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend4, winterFlowResolverLibrary2, WinterFlowUserManagerUserManager);
            WinterFlowRepositoryObject WinterFlowRouterStructure2 = WinterFlowConsumerDataSource.WinterFlowRouterStructure(WinterFlowInvokerComponent.WinterFlowArrayNetwork, WinterFlowCacheUtility.WinterFlowSingletonPlatform, winterFlowResolverLibrary2, 0);
            int hashCode2 = Long.hashCode(winterFlowResolverLibrary2.WinterFlowConfiguration);
            WinterFlowConfigurationProcess WinterFlowTransactionAgent2 = winterFlowResolverLibrary2.WinterFlowTransactionAgent();
            WinterFlowMapperManager WinterFlowUserManagerUserManager2 = WinterFlowSoftwareException.WinterFlowUserManagerUserManager(winterFlowResolverLibrary2, WinterFlowValidatorComponent.WinterFlowRouterStructure);
            winterFlowResolverLibrary2.WinterFlowModuleAgent();
            if (winterFlowResolverLibrary2.WinterFlowProxyStructure) {
                winterFlowResolverLibrary2.WinterFlowResponseEngine(winterFlowConfigurationRequest);
            } else {
                winterFlowResolverLibrary2.WinterFlowParserPipeline();
            }
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend, winterFlowResolverLibrary2, WinterFlowRouterStructure2);
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend2, winterFlowResolverLibrary2, WinterFlowTransactionAgent2);
            WinterFlowResolverBackend.WinterFlowConcurrencyThread(hashCode2, winterFlowResolverLibrary2, winterFlowExceptionBackend3, winterFlowResolverLibrary2, winterFlowServiceProviderBatch);
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend4, winterFlowResolverLibrary2, WinterFlowUserManagerUserManager2);
            WinterFlowSingletonRuntime.WinterFlowHookDataSource(str, null, WinterFlowInvokerComponent.WinterFlowTransactionManagerStrategy(4284666621L), WinterFlowDecoratorUI.WinterFlowBatchUI(18), WinterFlowObjectHook.WinterFlowTransactionAgent, 0L, null, 0L, 0, false, 0, 0, null, winterFlowResolverLibrary2, 1597830, 262058);
            winterFlowResolverLibrary2 = winterFlowResolverLibrary2;
            WinterFlowProtocolNetwork.WinterFlowRouterStructure(winterFlowResolverLibrary2, WinterFlowCacheRuntime.WinterFlowArrayHelper(8.0f));
            winterFlowEventTool.WinterFlowVariableVersionControl(winterFlowResolverLibrary2, 6);
            winterFlowResolverLibrary2.WinterFlowBandwidthObject(true);
            winterFlowResolverLibrary2.WinterFlowBandwidthObject(true);
        } else {
            winterFlowResolverLibrary2.WinterFlowQueueService();
        }
        WinterFlowStackEngine WinterFlowConcurrencyThread = winterFlowResolverLibrary2.WinterFlowConcurrencyThread();
        if (WinterFlowConcurrencyThread != null) {
            WinterFlowConcurrencyThread.WinterFlowArrayNetwork = new WinterFlowAPIVersionControl(i, 9, str, winterFlowEventTool);
        }
    }

    public static final void WinterFlowTransactionManagerStrategy(String str, String str2, WinterFlowResolverLibrary winterFlowResolverLibrary, int i) {
        WinterFlowResolverLibrary winterFlowResolverLibrary2 = winterFlowResolverLibrary;
        winterFlowResolverLibrary2.WinterFlowFrameworkTransaction(-201729100);
        if (winterFlowResolverLibrary2.WinterFlowFrontendBackend(i & 1, (i & 19) != 18)) {
            WinterFlowMapperManager WinterFlowSingletonPlatform = WinterFlowCacheRuntime.WinterFlowSingletonPlatform(1.0f);
            WinterFlowRendererCacheManager WinterFlowRouterStructure2 = WinterFlowWebsocketInheritance.WinterFlowRouterStructure(WinterFlowInvokerComponent.WinterFlowVariableVersionControl, WinterFlowCacheUtility.WinterFlowOrchestrationSubsystem, winterFlowResolverLibrary2, 6);
            int hashCode = Long.hashCode(winterFlowResolverLibrary2.WinterFlowConfiguration);
            WinterFlowConfigurationProcess WinterFlowTransactionAgent = winterFlowResolverLibrary2.WinterFlowTransactionAgent();
            WinterFlowMapperManager WinterFlowUserManagerUserManager = WinterFlowSoftwareException.WinterFlowUserManagerUserManager(winterFlowResolverLibrary2, WinterFlowSingletonPlatform);
            WinterFlowBandwidthAgent.WinterFlowCacheManagerAgent.getClass();
            WinterFlowConfigurationRequest winterFlowConfigurationRequest = WinterFlowEventEmitterDeserialization.WinterFlowHookDataSource;
            winterFlowResolverLibrary2.WinterFlowModuleAgent();
            if (winterFlowResolverLibrary2.WinterFlowProxyStructure) {
                winterFlowResolverLibrary2.WinterFlowResponseEngine(winterFlowConfigurationRequest);
            } else {
                winterFlowResolverLibrary2.WinterFlowParserPipeline();
            }
            WinterFlowProtocolNetwork.WinterFlowSyntax(WinterFlowEventEmitterDeserialization.WinterFlowVariableVersionControl, winterFlowResolverLibrary2, WinterFlowRouterStructure2);
            WinterFlowProtocolNetwork.WinterFlowSyntax(WinterFlowEventEmitterDeserialization.WinterFlowArrayNetwork, winterFlowResolverLibrary2, WinterFlowTransactionAgent);
            WinterFlowProtocolNetwork.WinterFlowSyntax(WinterFlowEventEmitterDeserialization.WinterFlowTransactionManagerStrategy, winterFlowResolverLibrary2, Integer.valueOf(hashCode));
            WinterFlowProtocolNetwork.WinterFlowRouterRouter(winterFlowResolverLibrary2, WinterFlowEventEmitterDeserialization.WinterFlowUnitTestResponse);
            WinterFlowProtocolNetwork.WinterFlowSyntax(WinterFlowEventEmitterDeserialization.WinterFlowCacheManagerAgent, winterFlowResolverLibrary2, WinterFlowUserManagerUserManager);
            long j = WinterFlowInheritanceSubsystem.WinterFlowCacheManagerAgent;
            WinterFlowSingletonRuntime.WinterFlowHookDataSource(str, null, j, WinterFlowDecoratorUI.WinterFlowBatchUI(15), WinterFlowObjectHook.WinterFlowTransactionAgent, 0L, null, 0L, 0, false, 0, 0, null, winterFlowResolverLibrary2, 1597830, 262058);
            WinterFlowSingletonRuntime.WinterFlowHookDataSource(str2, null, WinterFlowInheritanceSubsystem.WinterFlowHookDataSource(j, 0.8f), WinterFlowDecoratorUI.WinterFlowBatchUI(15), null, 0L, null, 0L, 0, false, 0, 0, null, winterFlowResolverLibrary, 24966, 262122);
            winterFlowResolverLibrary2 = winterFlowResolverLibrary;
            winterFlowResolverLibrary2.WinterFlowBandwidthObject(true);
        } else {
            winterFlowResolverLibrary2.WinterFlowQueueService();
        }
        WinterFlowStackEngine WinterFlowConcurrencyThread = winterFlowResolverLibrary2.WinterFlowConcurrencyThread();
        if (WinterFlowConcurrencyThread != null) {
            WinterFlowConcurrencyThread.WinterFlowArrayNetwork = new WinterFlowAPIVersionControl(i, 10, str, str2);
        }
    }

    public static final long WinterFlowUIMiddleware(long j) {
        WinterFlowAlgorithmDebug winterFlowAlgorithmDebug = WinterFlowAlgorithmProtocol.WinterFlowVariableVersionControl;
        boolean z = j > 0;
        if (!z) {
            if (!z) {
                return 0L;
            }
            WinterFlowEventEmitterOrchestration.WinterFlowRouterStructure();
            return 0L;
        }
        WinterFlowCacheManagerSystem winterFlowCacheManagerSystem = WinterFlowCacheManagerSystem.NANOSECONDS;
        long WinterFlowHookDataSource2 = WinterFlowAlgorithmProtocol.WinterFlowHookDataSource(j, WinterFlowSoftwareException.WinterFlowSessionManagerInterface(999999L, winterFlowCacheManagerSystem));
        int i = ((int) WinterFlowHookDataSource2) & 1;
        if (i == 1 && WinterFlowHookDataSource2 != WinterFlowAlgorithmProtocol.WinterFlowTransactionManagerStrategy && WinterFlowHookDataSource2 != WinterFlowAlgorithmProtocol.WinterFlowUnitTestResponse) {
            return WinterFlowHookDataSource2 >> 1;
        }
        if (WinterFlowHookDataSource2 == WinterFlowAlgorithmProtocol.WinterFlowTransactionManagerStrategy) {
            return Long.MAX_VALUE;
        }
        if (WinterFlowHookDataSource2 == WinterFlowAlgorithmProtocol.WinterFlowUnitTestResponse) {
            return Long.MIN_VALUE;
        }
        long j2 = WinterFlowHookDataSource2 >> 1;
        if (i != 0) {
            winterFlowCacheManagerSystem = WinterFlowCacheManagerSystem.MILLISECONDS;
        }
        return TimeUnit.MILLISECONDS.convert(j2, winterFlowCacheManagerSystem.WinterFlowVariableVersionControl);
    }

    public static final long WinterFlowUnitTestResponse(float f, boolean z, boolean z2) {
        return (((z ? 1L : 0L) | (z2 ? 2L : 0L)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static final WinterFlowProxyMechanism WinterFlowUserManagerUserManager(WinterFlowDeploymentWidget winterFlowDeploymentWidget, int i) {
        WinterFlowUserManagerController winterFlowUserManagerController;
        WinterFlowExceptionStrategy winterFlowExceptionStrategy;
        int ordinal = winterFlowDeploymentWidget.WinterFlowEncryptionAdapter().ordinal();
        WinterFlowProxyMechanism winterFlowProxyMechanism = WinterFlowProxyMechanism.WinterFlowVariableVersionControl;
        if (ordinal != 0) {
            if (ordinal == 1) {
                WinterFlowDeploymentWidget WinterFlowMapperProtocol = WinterFlowCloudStack.WinterFlowMapperProtocol(winterFlowDeploymentWidget);
                if (WinterFlowMapperProtocol != null) {
                    return WinterFlowPackageIDE(WinterFlowMapperProtocol, i);
                }
                WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("ActiveParent with no focused child");
                return null;
            }
            if (ordinal != 2) {
                if (ordinal != 3) {
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterStructure();
                    return null;
                }
                if (!winterFlowDeploymentWidget.WinterFlowVariableVersionControl.WinterFlowSingletonPlatform) {
                    WinterFlowViewUtility.WinterFlowHookDataSource("visitAncestors called on an unattached node");
                }
                WinterFlowUserManagerController winterFlowUserManagerController2 = winterFlowDeploymentWidget.WinterFlowVariableVersionControl.WinterFlowSyntax;
                WinterFlowSchedulerStructure WinterFlowSyntaxSubsystem = WinterFlowCloudStack.WinterFlowSyntaxSubsystem(winterFlowDeploymentWidget);
                loop0: while (true) {
                    if (WinterFlowSyntaxSubsystem == null) {
                        winterFlowUserManagerController = null;
                        break;
                    }
                    if ((WinterFlowSyntaxSubsystem.WinterFlowUserManagerUserManager.WinterFlowTransactionManagerStrategy.WinterFlowRouterRouter & 1024) != 0) {
                        while (winterFlowUserManagerController2 != null) {
                            if ((winterFlowUserManagerController2.WinterFlowUnitTestResponse & 1024) != 0) {
                                winterFlowUserManagerController = winterFlowUserManagerController2;
                                WinterFlowJSON winterFlowJSON = null;
                                while (winterFlowUserManagerController != null) {
                                    if (winterFlowUserManagerController instanceof WinterFlowDeploymentWidget) {
                                        break loop0;
                                    }
                                    if ((winterFlowUserManagerController.WinterFlowUnitTestResponse & 1024) != 0 && (winterFlowUserManagerController instanceof WinterFlowTestingEntity)) {
                                        int i2 = 0;
                                        for (WinterFlowUserManagerController winterFlowUserManagerController3 = ((WinterFlowTestingEntity) winterFlowUserManagerController).WinterFlowBatchUI; winterFlowUserManagerController3 != null; winterFlowUserManagerController3 = winterFlowUserManagerController3.WinterFlowResponseEngine) {
                                            if ((winterFlowUserManagerController3.WinterFlowUnitTestResponse & 1024) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    winterFlowUserManagerController = winterFlowUserManagerController3;
                                                } else {
                                                    if (winterFlowJSON == null) {
                                                        winterFlowJSON = new WinterFlowJSON(new WinterFlowUserManagerController[16]);
                                                    }
                                                    if (winterFlowUserManagerController != null) {
                                                        winterFlowJSON.WinterFlowHookDataSource(winterFlowUserManagerController);
                                                        winterFlowUserManagerController = null;
                                                    }
                                                    winterFlowJSON.WinterFlowHookDataSource(winterFlowUserManagerController3);
                                                }
                                            }
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    winterFlowUserManagerController = WinterFlowCloudStack.WinterFlowPackageIDE(winterFlowJSON);
                                }
                            }
                            winterFlowUserManagerController2 = winterFlowUserManagerController2.WinterFlowSyntax;
                        }
                    }
                    WinterFlowSyntaxSubsystem = WinterFlowSyntaxSubsystem.WinterFlowVariableBandwidth();
                    winterFlowUserManagerController2 = (WinterFlowSyntaxSubsystem == null || (winterFlowExceptionStrategy = WinterFlowSyntaxSubsystem.WinterFlowUserManagerUserManager) == null) ? null : winterFlowExceptionStrategy.WinterFlowVariableVersionControl;
                }
                WinterFlowDeploymentWidget winterFlowDeploymentWidget2 = (WinterFlowDeploymentWidget) winterFlowUserManagerController;
                if (winterFlowDeploymentWidget2 == null) {
                    return winterFlowProxyMechanism;
                }
                int ordinal2 = winterFlowDeploymentWidget2.WinterFlowEncryptionAdapter().ordinal();
                if (ordinal2 == 0) {
                    return WinterFlowSoftwareProtocol(winterFlowDeploymentWidget2, i);
                }
                if (ordinal2 == 1) {
                    return WinterFlowUserManagerUserManager(winterFlowDeploymentWidget2, i);
                }
                if (ordinal2 == 2) {
                    return WinterFlowProxyMechanism.WinterFlowTransactionManagerStrategy;
                }
                if (ordinal2 != 3) {
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterStructure();
                    return null;
                }
                WinterFlowProxyMechanism WinterFlowUserManagerUserManager = WinterFlowUserManagerUserManager(winterFlowDeploymentWidget2, i);
                WinterFlowProxyMechanism winterFlowProxyMechanism2 = WinterFlowUserManagerUserManager != winterFlowProxyMechanism ? WinterFlowUserManagerUserManager : null;
                return winterFlowProxyMechanism2 == null ? WinterFlowSoftwareProtocol(winterFlowDeploymentWidget2, i) : winterFlowProxyMechanism2;
            }
        }
        return winterFlowProxyMechanism;
    }

    public static final WinterFlowMapperManager WinterFlowVariableBandwidth(WinterFlowMapperManager winterFlowMapperManager) {
        return WinterFlowUnitTestLibrary.WinterFlowEventEmitterController(winterFlowMapperManager, 0.0f, 0.0f, 0.0f, null, 520191);
    }

    public static final void WinterFlowVariableVersionControl(WinterFlowMapperManager winterFlowMapperManager, WinterFlowSyntaxMechanism winterFlowSyntaxMechanism, WinterFlowObjectUI winterFlowObjectUI, WinterFlowResolverLibrary winterFlowResolverLibrary, int i) {
        WinterFlowValidatorComponent winterFlowValidatorComponent;
        boolean z;
        int i2;
        WinterFlowResolverLibrary winterFlowResolverLibrary2 = winterFlowResolverLibrary;
        winterFlowSyntaxMechanism.getClass();
        winterFlowObjectUI.getClass();
        winterFlowResolverLibrary2.WinterFlowFrameworkTransaction(1598573125);
        int i3 = i | (winterFlowResolverLibrary2.WinterFlowVariableVersionControl(winterFlowSyntaxMechanism) ? 32 : 16) | (winterFlowResolverLibrary2.WinterFlowUnitTestResponse(winterFlowObjectUI) ? 256 : 128);
        if (winterFlowResolverLibrary2.WinterFlowFrontendBackend(i3 & 1, (i3 & 147) != 146)) {
            WinterFlowThreadPoolGateway WinterFlowArrayNetwork2 = WinterFlowFrameworkMechanism.WinterFlowArrayNetwork(winterFlowSyntaxMechanism.WinterFlowVariableVersionControl, winterFlowResolverLibrary2);
            Object WinterFlowArrayNetwork3 = WinterFlowFrameworkMechanism.WinterFlowArrayNetwork(winterFlowSyntaxMechanism.WinterFlowUnitTestResponse, winterFlowResolverLibrary2);
            Object WinterFlowArrayNetwork4 = WinterFlowFrameworkMechanism.WinterFlowArrayNetwork(winterFlowSyntaxMechanism.WinterFlowSyntax, winterFlowResolverLibrary2);
            WinterFlowMicroserviceMechanism winterFlowMicroserviceMechanism = WinterFlowCacheRuntime.WinterFlowThreadListener;
            WinterFlowMapperManager WinterFlowSoftwareEngine = WinterFlowCacheRuntime.WinterFlowSoftwareEngine(WinterFlowServerManager.WinterFlowBackendCacheManager(winterFlowMapperManager.WinterFlowCacheManagerAgent(winterFlowMicroserviceMechanism), WinterFlowSoftwareException.WinterFlowTestingNode(R.drawable.bg, winterFlowResolverLibrary2, 0), WinterFlowThreadConfiguration.WinterFlowRouterStructure, 0.0f, 54), 16.0f);
            WinterFlowInvokerConsumer winterFlowInvokerConsumer = WinterFlowCacheUtility.WinterFlowUnitTestResponse;
            WinterFlowWorkerModule WinterFlowCacheManagerAgent2 = WinterFlowLibrary.WinterFlowCacheManagerAgent(winterFlowInvokerConsumer, false);
            int hashCode = Long.hashCode(winterFlowResolverLibrary2.WinterFlowConfiguration);
            WinterFlowConfigurationProcess WinterFlowTransactionAgent = winterFlowResolverLibrary2.WinterFlowTransactionAgent();
            WinterFlowMapperManager WinterFlowUserManagerUserManager = WinterFlowSoftwareException.WinterFlowUserManagerUserManager(winterFlowResolverLibrary2, WinterFlowSoftwareEngine);
            WinterFlowBandwidthAgent.WinterFlowCacheManagerAgent.getClass();
            WinterFlowObjectUI winterFlowObjectUI2 = WinterFlowEventEmitterDeserialization.WinterFlowHookDataSource;
            winterFlowResolverLibrary2.WinterFlowModuleAgent();
            if (winterFlowResolverLibrary2.WinterFlowProxyStructure) {
                winterFlowResolverLibrary2.WinterFlowResponseEngine(winterFlowObjectUI2);
            } else {
                winterFlowResolverLibrary2.WinterFlowParserPipeline();
            }
            WinterFlowExceptionBackend winterFlowExceptionBackend = WinterFlowEventEmitterDeserialization.WinterFlowVariableVersionControl;
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend, winterFlowResolverLibrary2, WinterFlowCacheManagerAgent2);
            WinterFlowExceptionBackend winterFlowExceptionBackend2 = WinterFlowEventEmitterDeserialization.WinterFlowArrayNetwork;
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend2, winterFlowResolverLibrary2, WinterFlowTransactionAgent);
            Integer valueOf = Integer.valueOf(hashCode);
            WinterFlowExceptionBackend winterFlowExceptionBackend3 = WinterFlowEventEmitterDeserialization.WinterFlowTransactionManagerStrategy;
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend3, winterFlowResolverLibrary2, valueOf);
            WinterFlowServiceProviderBatch winterFlowServiceProviderBatch = WinterFlowEventEmitterDeserialization.WinterFlowUnitTestResponse;
            WinterFlowProtocolNetwork.WinterFlowRouterRouter(winterFlowResolverLibrary2, winterFlowServiceProviderBatch);
            WinterFlowExceptionBackend winterFlowExceptionBackend4 = WinterFlowEventEmitterDeserialization.WinterFlowCacheManagerAgent;
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend4, winterFlowResolverLibrary2, WinterFlowUserManagerUserManager);
            WinterFlowRepositoryObject WinterFlowRouterStructure2 = WinterFlowConsumerDataSource.WinterFlowRouterStructure(WinterFlowInvokerComponent.WinterFlowArrayNetwork, WinterFlowCacheUtility.WinterFlowSingletonPlatform, winterFlowResolverLibrary2, 0);
            int hashCode2 = Long.hashCode(winterFlowResolverLibrary2.WinterFlowConfiguration);
            WinterFlowConfigurationProcess WinterFlowTransactionAgent2 = winterFlowResolverLibrary2.WinterFlowTransactionAgent();
            WinterFlowMapperManager WinterFlowUserManagerUserManager2 = WinterFlowSoftwareException.WinterFlowUserManagerUserManager(winterFlowResolverLibrary2, winterFlowMicroserviceMechanism);
            winterFlowResolverLibrary2.WinterFlowModuleAgent();
            if (winterFlowResolverLibrary2.WinterFlowProxyStructure) {
                winterFlowResolverLibrary2.WinterFlowResponseEngine(winterFlowObjectUI2);
            } else {
                winterFlowResolverLibrary2.WinterFlowParserPipeline();
            }
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend, winterFlowResolverLibrary2, WinterFlowRouterStructure2);
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend2, winterFlowResolverLibrary2, WinterFlowTransactionAgent2);
            WinterFlowResolverBackend.WinterFlowConcurrencyThread(hashCode2, winterFlowResolverLibrary2, winterFlowExceptionBackend3, winterFlowResolverLibrary2, winterFlowServiceProviderBatch);
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend4, winterFlowResolverLibrary2, WinterFlowUserManagerUserManager2);
            WinterFlowMapperManager WinterFlowSingletonPlatform = WinterFlowCacheRuntime.WinterFlowSingletonPlatform(1.0f);
            WinterFlowRendererCacheManager WinterFlowRouterStructure3 = WinterFlowWebsocketInheritance.WinterFlowRouterStructure(WinterFlowInvokerComponent.WinterFlowVariableVersionControl, WinterFlowCacheUtility.WinterFlowConcurrencyThread, winterFlowResolverLibrary2, 54);
            int hashCode3 = Long.hashCode(winterFlowResolverLibrary2.WinterFlowConfiguration);
            WinterFlowConfigurationProcess WinterFlowTransactionAgent3 = winterFlowResolverLibrary2.WinterFlowTransactionAgent();
            WinterFlowMapperManager WinterFlowUserManagerUserManager3 = WinterFlowSoftwareException.WinterFlowUserManagerUserManager(winterFlowResolverLibrary2, WinterFlowSingletonPlatform);
            winterFlowResolverLibrary2.WinterFlowModuleAgent();
            if (winterFlowResolverLibrary2.WinterFlowProxyStructure) {
                winterFlowResolverLibrary2.WinterFlowResponseEngine(winterFlowObjectUI2);
            } else {
                winterFlowResolverLibrary2.WinterFlowParserPipeline();
            }
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend, winterFlowResolverLibrary2, WinterFlowRouterStructure3);
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend2, winterFlowResolverLibrary2, WinterFlowTransactionAgent3);
            WinterFlowResolverBackend.WinterFlowConcurrencyThread(hashCode3, winterFlowResolverLibrary2, winterFlowExceptionBackend3, winterFlowResolverLibrary2, winterFlowServiceProviderBatch);
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend4, winterFlowResolverLibrary2, WinterFlowUserManagerUserManager3);
            WinterFlowValidatorComponent winterFlowValidatorComponent2 = WinterFlowValidatorComponent.WinterFlowRouterStructure;
            WinterFlowMapperManager WinterFlowSyntaxSubsystem = WinterFlowCacheRuntime.WinterFlowSyntaxSubsystem(WinterFlowSoftwareException.WinterFlowBandwidthObject(WinterFlowSingletonPlatform(WinterFlowCacheRuntime.WinterFlowOrchestrationConfiguration(winterFlowValidatorComponent2, 160.0f), WinterFlowRepositoryProxy.WinterFlowRouterStructure(12.0f)), WinterFlowSessionManagerProcess.WinterFlowBandwidthObject(WinterFlowUnitTestLibrary.WinterFlowPackageIDE(new WinterFlowInheritanceSubsystem(WinterFlowInvokerComponent.WinterFlowTransactionManagerStrategy(4284666621L)), new WinterFlowInheritanceSubsystem(WinterFlowInvokerComponent.WinterFlowTransactionManagerStrategy(4278336241L))))).WinterFlowCacheManagerAgent(new WinterFlowSoftwareModule(2.0f, WinterFlowSessionManagerProcess.WinterFlowBandwidthObject(WinterFlowUnitTestLibrary.WinterFlowPackageIDE(new WinterFlowInheritanceSubsystem(WinterFlowInvokerComponent.WinterFlowTransactionManagerStrategy(4278336241L)), new WinterFlowInheritanceSubsystem(WinterFlowInvokerComponent.WinterFlowTransactionManagerStrategy(4284666621L)))), WinterFlowRepositoryProxy.WinterFlowRouterStructure(12.0f))), 12.0f, 8.0f);
            WinterFlowWorkerModule WinterFlowCacheManagerAgent3 = WinterFlowLibrary.WinterFlowCacheManagerAgent(winterFlowInvokerConsumer, false);
            int hashCode4 = Long.hashCode(winterFlowResolverLibrary2.WinterFlowConfiguration);
            WinterFlowConfigurationProcess WinterFlowTransactionAgent4 = winterFlowResolverLibrary2.WinterFlowTransactionAgent();
            WinterFlowMapperManager WinterFlowUserManagerUserManager4 = WinterFlowSoftwareException.WinterFlowUserManagerUserManager(winterFlowResolverLibrary2, WinterFlowSyntaxSubsystem);
            winterFlowResolverLibrary2.WinterFlowModuleAgent();
            if (winterFlowResolverLibrary2.WinterFlowProxyStructure) {
                winterFlowResolverLibrary2.WinterFlowResponseEngine(winterFlowObjectUI2);
            } else {
                winterFlowResolverLibrary2.WinterFlowParserPipeline();
            }
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend, winterFlowResolverLibrary2, WinterFlowCacheManagerAgent3);
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend2, winterFlowResolverLibrary2, WinterFlowTransactionAgent4);
            WinterFlowResolverBackend.WinterFlowConcurrencyThread(hashCode4, winterFlowResolverLibrary2, winterFlowExceptionBackend3, winterFlowResolverLibrary2, winterFlowServiceProviderBatch);
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend4, winterFlowResolverLibrary2, WinterFlowUserManagerUserManager4);
            long j = WinterFlowInheritanceSubsystem.WinterFlowCacheManagerAgent;
            long WinterFlowBatchUI = WinterFlowDecoratorUI.WinterFlowBatchUI(18);
            WinterFlowObjectHook winterFlowObjectHook = WinterFlowObjectHook.WinterFlowTransactionAgent;
            int i4 = 1;
            WinterFlowSingletonRuntime.WinterFlowHookDataSource("DIFFICULTY", WinterFlowCacheRuntime.WinterFlowSingletonPlatform(1.0f), j, WinterFlowBatchUI, winterFlowObjectHook, 0L, new WinterFlowThreadPoolEventEmitter(3), 0L, 0, false, 0, 0, null, winterFlowResolverLibrary, 1597878, 261032);
            winterFlowResolverLibrary.WinterFlowBandwidthObject(true);
            WinterFlowMapperManager WinterFlowSyntaxSubsystem2 = WinterFlowCacheRuntime.WinterFlowSyntaxSubsystem(WinterFlowSoftwareException.WinterFlowConcurrencyThread(WinterFlowSoftwareException.WinterFlowOrchestrationSubsystem(WinterFlowSingletonPlatform(winterFlowValidatorComponent2, WinterFlowRepositoryProxy.WinterFlowRouterStructure(12.0f)), WinterFlowInheritanceSubsystem.WinterFlowHookDataSource(WinterFlowInheritanceSubsystem.WinterFlowHookDataSource, 0.6f), WinterFlowCacheRuntime.WinterFlowTransactionAgent), 1.0f, WinterFlowInvokerComponent.WinterFlowTransactionManagerStrategy(4284666621L), WinterFlowRepositoryProxy.WinterFlowRouterStructure(12.0f)), 16.0f, 8.0f);
            WinterFlowWorkerModule WinterFlowCacheManagerAgent4 = WinterFlowLibrary.WinterFlowCacheManagerAgent(winterFlowInvokerConsumer, false);
            int hashCode5 = Long.hashCode(winterFlowResolverLibrary.WinterFlowConfiguration);
            WinterFlowConfigurationProcess WinterFlowTransactionAgent5 = winterFlowResolverLibrary.WinterFlowTransactionAgent();
            WinterFlowMapperManager WinterFlowUserManagerUserManager5 = WinterFlowSoftwareException.WinterFlowUserManagerUserManager(winterFlowResolverLibrary, WinterFlowSyntaxSubsystem2);
            winterFlowResolverLibrary.WinterFlowModuleAgent();
            if (winterFlowResolverLibrary.WinterFlowProxyStructure) {
                winterFlowResolverLibrary.WinterFlowResponseEngine(winterFlowObjectUI2);
            } else {
                winterFlowResolverLibrary.WinterFlowParserPipeline();
            }
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend, winterFlowResolverLibrary, WinterFlowCacheManagerAgent4);
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend2, winterFlowResolverLibrary, WinterFlowTransactionAgent5);
            WinterFlowResolverBackend.WinterFlowConcurrencyThread(hashCode5, winterFlowResolverLibrary, winterFlowExceptionBackend3, winterFlowResolverLibrary, winterFlowServiceProviderBatch);
            WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend4, winterFlowResolverLibrary, WinterFlowUserManagerUserManager5);
            boolean z2 = false;
            WinterFlowSingletonRuntime.WinterFlowHookDataSource(WinterFlowResolverBackend.WinterFlowSyntax("POINTS: ", ((Number) WinterFlowArrayNetwork2.getValue()).intValue()), null, WinterFlowInheritanceSubsystem.WinterFlowUnitTestResponse, WinterFlowDecoratorUI.WinterFlowBatchUI(18), winterFlowObjectHook, 0L, null, 0L, 0, false, 0, 0, null, winterFlowResolverLibrary, 1597824, 262058);
            winterFlowResolverLibrary.WinterFlowBandwidthObject(true);
            winterFlowResolverLibrary.WinterFlowBandwidthObject(true);
            WinterFlowProtocolNetwork.WinterFlowRouterStructure(winterFlowResolverLibrary, WinterFlowCacheRuntime.WinterFlowArrayHelper(20.0f));
            WinterFlowMapperManager WinterFlowCacheManagerAgent5 = WinterFlowCacheRuntime.WinterFlowSingletonPlatform(1.0f).WinterFlowCacheManagerAgent(new WinterFlowHookServer(1.0f, true));
            WinterFlowExceptionXML WinterFlowVariableVersionControl = WinterFlowCacheRuntime.WinterFlowVariableVersionControl(4.0f, 1);
            WinterFlowThreadPoolCompiler winterFlowThreadPoolCompiler = new WinterFlowThreadPoolCompiler(12.0f, new WinterFlowCompilerMechanism(i4));
            boolean WinterFlowVariableVersionControl2 = winterFlowResolverLibrary.WinterFlowVariableVersionControl(WinterFlowArrayNetwork4) | winterFlowResolverLibrary.WinterFlowVariableVersionControl(WinterFlowArrayNetwork3) | winterFlowResolverLibrary.WinterFlowVariableVersionControl(WinterFlowArrayNetwork2);
            if ((i3 & 112) == 32) {
                z2 = true;
            }
            boolean z3 = WinterFlowVariableVersionControl2 | z2;
            Object WinterFlowSyntaxSubsystem3 = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
            if (z3 || WinterFlowSyntaxSubsystem3 == WinterFlowModuleModule.WinterFlowRouterStructure) {
                winterFlowValidatorComponent = winterFlowValidatorComponent2;
                z = true;
                i2 = i3;
                Object winterFlowRequestPipeline = new WinterFlowRequestPipeline(winterFlowSyntaxMechanism, WinterFlowArrayNetwork4, WinterFlowArrayNetwork3, WinterFlowArrayNetwork2, 1);
                winterFlowResolverLibrary.WinterFlowArrayFramework(winterFlowRequestPipeline);
                WinterFlowSyntaxSubsystem3 = winterFlowRequestPipeline;
            } else {
                z = true;
                winterFlowValidatorComponent = winterFlowValidatorComponent2;
                i2 = i3;
            }
            WinterFlowEncryptionSubsystem.WinterFlowCacheManagerAgent(WinterFlowCacheManagerAgent5, null, WinterFlowVariableVersionControl, winterFlowThreadPoolCompiler, null, null, false, null, (WinterFlowObjectSession) WinterFlowSyntaxSubsystem3, winterFlowResolverLibrary, 24960);
            winterFlowResolverLibrary2 = winterFlowResolverLibrary;
            WinterFlowProtocolNetwork.WinterFlowRouterStructure(winterFlowResolverLibrary2, WinterFlowCacheRuntime.WinterFlowArrayHelper(16.0f));
            WinterFlowSoftwareException.WinterFlowServerProtocol((i2 & 896) | 48, 0, winterFlowObjectUI, winterFlowResolverLibrary2, WinterFlowCacheRuntime.WinterFlowOrchestrationConfiguration(winterFlowValidatorComponent, 180.0f).WinterFlowCacheManagerAgent(new WinterFlowGatewayService()), "BACK");
            winterFlowResolverLibrary2.WinterFlowBandwidthObject(z);
            winterFlowResolverLibrary2.WinterFlowBandwidthObject(z);
        } else {
            winterFlowResolverLibrary2.WinterFlowQueueService();
        }
        WinterFlowStackEngine WinterFlowConcurrencyThread = winterFlowResolverLibrary2.WinterFlowConcurrencyThread();
        if (WinterFlowConcurrencyThread != null) {
            WinterFlowConcurrencyThread.WinterFlowArrayNetwork = new WinterFlowConsumerVersionControl(winterFlowMapperManager, winterFlowSyntaxMechanism, winterFlowObjectUI, i, 3);
        }
    }
}
