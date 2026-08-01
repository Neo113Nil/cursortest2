package com.google.android.datatransport;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import androidx.core.graphics.drawable.IconCompat;
import com.android.installreferrer.api.InstallReferrerClient;
import com.icewinter.flow.winter.icecatch.R;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class WinterFlowCloudStack {
    public static final WinterFlowThreadPoolProcess WinterFlowArrayNetwork;
    public static final WinterFlowJSONDecorator WinterFlowHookDataSource;
    public static final WinterFlowDebugDatabaseSchema[] WinterFlowResponseEngine;
    public static final WinterFlowDebugDatabaseSchema WinterFlowRouterRouter;
    public static final WinterFlowJSONDecorator WinterFlowRouterStructure;
    public static final WinterFlowDebugDatabaseSchema WinterFlowSyntax;
    public static final WinterFlowAlgorithmDebug WinterFlowVariableVersionControl;
    public static final StackTraceElement[] WinterFlowCacheManagerAgent = new StackTraceElement[0];
    public static final WinterFlowThreadPoolProcess WinterFlowTransactionManagerStrategy = new WinterFlowThreadPoolProcess(22);
    public static final Object WinterFlowUnitTestResponse = new Object();

    static {
        int i = 25;
        WinterFlowRouterStructure = new WinterFlowJSONDecorator(i, "UNDEFINED");
        WinterFlowHookDataSource = new WinterFlowJSONDecorator(i, "REUSABLE_CLAIMED");
        int i2 = 21;
        WinterFlowArrayNetwork = new WinterFlowThreadPoolProcess(i2);
        WinterFlowVariableVersionControl = new WinterFlowAlgorithmDebug(i2);
        WinterFlowDebugDatabaseSchema winterFlowDebugDatabaseSchema = new WinterFlowDebugDatabaseSchema("CLIENT_TELEMETRY");
        WinterFlowRouterRouter = winterFlowDebugDatabaseSchema;
        WinterFlowDebugDatabaseSchema winterFlowDebugDatabaseSchema2 = new WinterFlowDebugDatabaseSchema("CLIENT_NOTIFICATION_TELEMETRY");
        WinterFlowSyntax = winterFlowDebugDatabaseSchema2;
        WinterFlowResponseEngine = new WinterFlowDebugDatabaseSchema[]{winterFlowDebugDatabaseSchema, winterFlowDebugDatabaseSchema2};
    }

    public static final WinterFlowCompilerFramework WinterFlowArrayHelper(WinterFlowProviderCacheManager winterFlowProviderCacheManager) {
        WinterFlowConfigurationManager winterFlowConfigurationManager = new WinterFlowConfigurationManager();
        WinterFlowEventEmitterHelper WinterFlowArrayNetwork2 = WinterFlowMicroserviceWidget.WinterFlowArrayNetwork(winterFlowProviderCacheManager);
        WinterFlowArrayNetwork2.getClass();
        WinterFlowScriptManager WinterFlowTransactionManagerStrategy2 = winterFlowProviderCacheManager.WinterFlowTransactionManagerStrategy();
        WinterFlowTransactionManagerStrategy2.getClass();
        return (WinterFlowCompilerFramework) new WinterFlowStackProvider(WinterFlowTransactionManagerStrategy2, winterFlowConfigurationManager, WinterFlowArrayNetwork2).WinterFlowConcurrencyThread(WinterFlowListenerProtocol.WinterFlowRouterStructure(WinterFlowCompilerFramework.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static final void WinterFlowArrayNetwork(WinterFlowJSON winterFlowJSON, WinterFlowUserManagerController winterFlowUserManagerController) {
        WinterFlowJSON WinterFlowResolverController = WinterFlowSyntaxSubsystem(winterFlowUserManagerController).WinterFlowResolverController();
        int i = WinterFlowResolverController.WinterFlowUnitTestResponse - 1;
        Object[] objArr = WinterFlowResolverController.WinterFlowVariableVersionControl;
        if (i < objArr.length) {
            while (i >= 0) {
                winterFlowJSON.WinterFlowHookDataSource(((WinterFlowSchedulerStructure) objArr[i]).WinterFlowUserManagerUserManager.WinterFlowTransactionManagerStrategy);
                i--;
            }
        }
    }

    public static String WinterFlowBackendCacheManager(Context context, ComponentName componentName) {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    public static final WinterFlowOrchestrationMapper WinterFlowBandwidthObject(WinterFlowEventEmitterHelper winterFlowEventEmitterHelper) {
        WinterFlowOrchestrationMapper winterFlowOrchestrationMapper;
        winterFlowEventEmitterHelper.getClass();
        WinterFlowExceptionProxy winterFlowExceptionProxy = (WinterFlowExceptionProxy) winterFlowEventEmitterHelper.WinterFlowRouterStructure(WinterFlowArrayNetwork);
        Bundle bundle = null;
        if (winterFlowExceptionProxy == null) {
            WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
            return null;
        }
        WinterFlowProviderCacheManager winterFlowProviderCacheManager = (WinterFlowProviderCacheManager) winterFlowEventEmitterHelper.WinterFlowRouterStructure(WinterFlowVariableVersionControl);
        if (winterFlowProviderCacheManager == null) {
            WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
            return null;
        }
        Bundle bundle2 = (Bundle) winterFlowEventEmitterHelper.WinterFlowRouterStructure(WinterFlowTransactionManagerStrategy);
        String str = (String) winterFlowEventEmitterHelper.WinterFlowRouterStructure(WinterFlowQuerySyntax.WinterFlowTransactionAgent);
        if (str == null) {
            WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            return null;
        }
        WinterFlowQueueFramework WinterFlowRouterAdapter = winterFlowExceptionProxy.WinterFlowHookDataSource().WinterFlowRouterAdapter("androidx.lifecycle.internal.SavedStateHandlesProvider");
        WinterFlowXMLUtility winterFlowXMLUtility = WinterFlowRouterAdapter instanceof WinterFlowXMLUtility ? (WinterFlowXMLUtility) WinterFlowRouterAdapter : null;
        if (winterFlowXMLUtility == null) {
            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
            return null;
        }
        LinkedHashMap linkedHashMap = WinterFlowArrayHelper(winterFlowProviderCacheManager).WinterFlowHookDataSource;
        WinterFlowOrchestrationMapper winterFlowOrchestrationMapper2 = (WinterFlowOrchestrationMapper) linkedHashMap.get(str);
        if (winterFlowOrchestrationMapper2 != null) {
            return winterFlowOrchestrationMapper2;
        }
        winterFlowXMLUtility.WinterFlowHookDataSource();
        Bundle bundle3 = winterFlowXMLUtility.WinterFlowCacheManagerAgent;
        if (bundle3 != null && bundle3.containsKey(str)) {
            Bundle bundle4 = bundle3.getBundle(str);
            if (bundle4 == null) {
                bundle4 = WinterFlowManagerRequest.WinterFlowOrchestrationSubsystem((WinterFlowServerPlatform[]) Arrays.copyOf(new WinterFlowServerPlatform[0], 0));
            }
            bundle3.remove(str);
            if (bundle3.isEmpty()) {
                winterFlowXMLUtility.WinterFlowCacheManagerAgent = null;
            }
            bundle = bundle4;
        }
        if (bundle != null) {
            bundle2 = bundle;
        }
        if (bundle2 == null) {
            winterFlowOrchestrationMapper = new WinterFlowOrchestrationMapper();
        } else {
            ClassLoader classLoader = WinterFlowOrchestrationMapper.class.getClassLoader();
            classLoader.getClass();
            bundle2.setClassLoader(classLoader);
            WinterFlowDatabaseScript winterFlowDatabaseScript = new WinterFlowDatabaseScript(bundle2.size());
            for (String str2 : bundle2.keySet()) {
                str2.getClass();
                winterFlowDatabaseScript.put(str2, bundle2.get(str2));
            }
            winterFlowOrchestrationMapper = new WinterFlowOrchestrationMapper(winterFlowDatabaseScript.WinterFlowHookDataSource());
        }
        linkedHashMap.put(str, winterFlowOrchestrationMapper);
        return winterFlowOrchestrationMapper;
    }

    public static final WinterFlowAlgorithmHandler WinterFlowBatchUI(WinterFlowAlgorithmHandler winterFlowAlgorithmHandler) {
        WinterFlowAlgorithmHandler winterFlowAlgorithmHandler2;
        WinterFlowAlgorithmHandler WinterFlowResponseEngine2 = winterFlowAlgorithmHandler.WinterFlowResponseEngine();
        while (true) {
            WinterFlowAlgorithmHandler winterFlowAlgorithmHandler3 = WinterFlowResponseEngine2;
            winterFlowAlgorithmHandler2 = winterFlowAlgorithmHandler;
            winterFlowAlgorithmHandler = winterFlowAlgorithmHandler3;
            if (winterFlowAlgorithmHandler == null) {
                break;
            }
            WinterFlowResponseEngine2 = winterFlowAlgorithmHandler.WinterFlowResponseEngine();
        }
        WinterFlowUIMicroservice winterFlowUIMicroservice = winterFlowAlgorithmHandler2 instanceof WinterFlowUIMicroservice ? (WinterFlowUIMicroservice) winterFlowAlgorithmHandler2 : null;
        if (winterFlowUIMicroservice == null) {
            return winterFlowAlgorithmHandler2;
        }
        WinterFlowUIMicroservice winterFlowUIMicroservice2 = winterFlowUIMicroservice.WinterFlowRouterAdapter;
        while (true) {
            WinterFlowUIMicroservice winterFlowUIMicroservice3 = winterFlowUIMicroservice2;
            WinterFlowUIMicroservice winterFlowUIMicroservice4 = winterFlowUIMicroservice;
            winterFlowUIMicroservice = winterFlowUIMicroservice3;
            if (winterFlowUIMicroservice == null) {
                return winterFlowUIMicroservice4;
            }
            winterFlowUIMicroservice2 = winterFlowUIMicroservice.WinterFlowRouterAdapter;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x0287, code lost:
    
        if (r44.WinterFlowTransactionManagerStrategy(true) != false) goto L173;
     */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02ff A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void WinterFlowCacheManagerAgent(final WinterFlowMapperManager winterFlowMapperManager, WinterFlowNetworkSession winterFlowNetworkSession, final WinterFlowExceptionXML winterFlowExceptionXML, final WinterFlowNetworkWidget winterFlowNetworkWidget, final boolean z, final WinterFlowDeploymentException winterFlowDeploymentException, final WinterFlowConfigurationPipeline winterFlowConfigurationPipeline, final WinterFlowTransactionDecorator winterFlowTransactionDecorator, final WinterFlowObjectSession winterFlowObjectSession, WinterFlowResolverLibrary winterFlowResolverLibrary, final int i, final int i2) {
        int i3;
        int i4;
        WinterFlowNetworkSession winterFlowNetworkSession2;
        int i5;
        boolean z2;
        Object obj;
        boolean z3;
        boolean WinterFlowVariableVersionControl2;
        Object winterFlowXMLLayer;
        WinterFlowNetworkSession winterFlowNetworkSession3;
        boolean z4;
        WinterFlowFrameworkHelper winterFlowFrameworkHelper;
        WinterFlowMapperManager winterFlowMapperManager2;
        winterFlowResolverLibrary.WinterFlowFrameworkTransaction(924924659);
        if ((i & 6) == 0) {
            i3 = (winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowMapperManager) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowNetworkSession) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowExceptionXML) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= winterFlowResolverLibrary.WinterFlowTransactionManagerStrategy(false) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= winterFlowResolverLibrary.WinterFlowTransactionManagerStrategy(true) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowNetworkWidget) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= winterFlowResolverLibrary.WinterFlowTransactionManagerStrategy(z) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowDeploymentException) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowConfigurationPipeline) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowTransactionDecorator) ? 4 : 2);
        } else {
            i4 = i2;
        }
        int i6 = i4 | 432;
        if ((i2 & 3072) == 0) {
            i6 |= winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowObjectSession) ? 2048 : 1024;
        }
        if (winterFlowResolverLibrary.WinterFlowFrontendBackend(i3 & 1, ((i3 & 306783379) == 306783378 && (i6 & 1171) == 1170) ? false : true)) {
            winterFlowResolverLibrary.WinterFlowProxyStructure();
            if ((i & 1) != 0 && !winterFlowResolverLibrary.WinterFlowResolverController()) {
                winterFlowResolverLibrary.WinterFlowQueueService();
            }
            int i7 = i3 & (-234881025);
            winterFlowResolverLibrary.WinterFlowOrchestrationSubsystem();
            int i8 = i7 >> 3;
            int i9 = i8 & 14;
            int i10 = i9 | ((i6 >> 6) & 112);
            WinterFlowThreadPoolGateway WinterFlowBackendCacheManager = WinterFlowDecoratorUI.WinterFlowBackendCacheManager(winterFlowObjectSession, winterFlowResolverLibrary);
            boolean z5 = (((i10 & 14) ^ 6) > 4 && winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowNetworkSession)) || (i10 & 6) == 4;
            Object WinterFlowSyntaxSubsystem = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
            Object obj2 = WinterFlowModuleModule.WinterFlowRouterStructure;
            if (z5 || WinterFlowSyntaxSubsystem == obj2) {
                WinterFlowExceptionFramework winterFlowExceptionFramework = new WinterFlowExceptionFramework();
                winterFlowExceptionFramework.WinterFlowRouterStructure = new WinterFlowVersionControlModule(Integer.MAX_VALUE);
                winterFlowExceptionFramework.WinterFlowHookDataSource = new WinterFlowVersionControlModule(Integer.MAX_VALUE);
                WinterFlowSessionManagerProcess winterFlowSessionManagerProcess = WinterFlowSessionManagerProcess.WinterFlowMapperProtocol;
                i5 = i6;
                WinterFlowCloudFrontend winterFlowCloudFrontend = new WinterFlowCloudFrontend(WinterFlowBackendCacheManager, 1);
                WinterFlowObjectPackage winterFlowObjectPackage = WinterFlowInheritanceConcurrency.WinterFlowRouterStructure;
                WinterFlowSyntaxSubsystem = new WinterFlowFrameworkHelper(0, 0, WinterFlowBatchCacheManager.class, new WinterFlowPipelineWidget(new WinterFlowRouterHelper(new WinterFlowPipelineWidget(winterFlowCloudFrontend, winterFlowSessionManagerProcess), winterFlowNetworkSession, winterFlowExceptionFramework, 4), winterFlowSessionManagerProcess), "value", "getValue()Ljava/lang/Object;");
                winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem);
            } else {
                i5 = i6;
            }
            WinterFlowFrameworkHelper winterFlowFrameworkHelper2 = (WinterFlowFrameworkHelper) WinterFlowSyntaxSubsystem;
            int i11 = i7 >> 9;
            int i12 = (i11 & 112) | i9;
            boolean z6 = ((((i12 & 112) ^ 48) > 32 && winterFlowResolverLibrary.WinterFlowTransactionManagerStrategy(true)) || (i12 & 48) == 32) | ((((i12 & 14) ^ 6) > 4 && winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowNetworkSession)) || (i12 & 6) == 4);
            Object WinterFlowSyntaxSubsystem2 = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
            if (z6 || WinterFlowSyntaxSubsystem2 == obj2) {
                WinterFlowSyntaxSubsystem2 = new WinterFlowVersionCacheManager(winterFlowNetworkSession);
                winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem2);
            }
            WinterFlowVersionCacheManager winterFlowVersionCacheManager = (WinterFlowVersionCacheManager) WinterFlowSyntaxSubsystem2;
            Object WinterFlowSyntaxSubsystem3 = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
            if (WinterFlowSyntaxSubsystem3 == obj2) {
                WinterFlowSyntaxSubsystem3 = WinterFlowSoftwareException.WinterFlowConsumerUserManager(winterFlowResolverLibrary);
                winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem3);
            }
            WinterFlowAdapterResponse winterFlowAdapterResponse = (WinterFlowAdapterResponse) WinterFlowSyntaxSubsystem3;
            WinterFlowWorkerHelper winterFlowWorkerHelper = (WinterFlowWorkerHelper) winterFlowResolverLibrary.WinterFlowSyntax(WinterFlowBackendTransactionManager.WinterFlowUnitTestResponse);
            WinterFlowThreadPoolProcess winterFlowThreadPoolProcess = !((Boolean) winterFlowResolverLibrary.WinterFlowSyntax(WinterFlowBackendTransactionManager.WinterFlowMapperProtocol)).booleanValue() ? WinterFlowDeploymentService.WinterFlowRouterStructure : null;
            int i13 = i5 << 18;
            int i14 = (i7 & 65520) | (i11 & 3670016) | (i13 & 29360128) | (i13 & 234881024) | ((i5 << 27) & 1879048192);
            boolean z7 = ((((i14 & 896) ^ 384) > 256 && winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowExceptionXML)) || (i14 & 384) == 256) | ((((i14 & 112) ^ 48) > 32 && winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowNetworkSession)) || (i14 & 48) == 32) | ((((i14 & 7168) ^ 3072) > 2048 && winterFlowResolverLibrary.WinterFlowTransactionManagerStrategy(false)) || (i14 & 3072) == 2048);
            if (((57344 & i14) ^ 24576) <= 16384) {
            }
            if ((i14 & 24576) != 16384) {
                z2 = false;
                boolean WinterFlowCacheManagerAgent2 = z7 | z2 | winterFlowResolverLibrary.WinterFlowCacheManagerAgent(0) | ((((i14 & 3670016) ^ 1572864) <= 1048576 && winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowConfigurationPipeline)) || (i14 & 1572864) == 1048576);
                if (((i14 & 29360128) ^ 12582912) <= 8388608) {
                    obj = null;
                    if (winterFlowResolverLibrary.WinterFlowVariableVersionControl(null)) {
                        z3 = true;
                        WinterFlowVariableVersionControl2 = (((i14 & 234881024) ^ 100663296) <= 67108864 && winterFlowResolverLibrary.WinterFlowVariableVersionControl(obj)) | WinterFlowCacheManagerAgent2 | z3 | ((((i14 & 1879048192) ^ 805306368) <= 536870912 && winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowTransactionDecorator)) || (i14 & 805306368) == 536870912) | winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowWorkerHelper) | winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowThreadPoolProcess);
                        Object WinterFlowSyntaxSubsystem4 = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
                        if (!WinterFlowVariableVersionControl2 || WinterFlowSyntaxSubsystem4 == obj2) {
                            winterFlowNetworkSession3 = winterFlowNetworkSession;
                            z4 = true;
                            winterFlowXMLLayer = new WinterFlowXMLLayer(winterFlowNetworkSession3, winterFlowExceptionXML, winterFlowFrameworkHelper2, winterFlowTransactionDecorator, winterFlowAdapterResponse, winterFlowWorkerHelper, winterFlowThreadPoolProcess, winterFlowConfigurationPipeline);
                            winterFlowFrameworkHelper = winterFlowFrameworkHelper2;
                            winterFlowResolverLibrary.WinterFlowArrayFramework(winterFlowXMLLayer);
                        } else {
                            winterFlowXMLLayer = WinterFlowSyntaxSubsystem4;
                            winterFlowFrameworkHelper = winterFlowFrameworkHelper2;
                            z4 = true;
                            winterFlowNetworkSession3 = winterFlowNetworkSession;
                        }
                        WinterFlowXMLLayer winterFlowXMLLayer2 = (WinterFlowXMLLayer) winterFlowXMLLayer;
                        WinterFlowBackendBatch winterFlowBackendBatch = WinterFlowBackendBatch.WinterFlowVariableVersionControl;
                        if (z) {
                            winterFlowResolverLibrary.WinterFlowCompilerDataSource(-2077147368);
                            if ((((i8 & 14) ^ 6) <= 4 || !winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowNetworkSession3)) && (i8 & 6) != 4) {
                                z4 = false;
                            }
                            boolean WinterFlowCacheManagerAgent3 = z4 | winterFlowResolverLibrary.WinterFlowCacheManagerAgent(0);
                            Object WinterFlowSyntaxSubsystem5 = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
                            if (WinterFlowCacheManagerAgent3 || WinterFlowSyntaxSubsystem5 == obj2) {
                                WinterFlowSyntaxSubsystem5 = new WinterFlowCloudPackage(winterFlowNetworkSession3);
                                winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem5);
                            }
                            winterFlowMapperManager2 = WinterFlowServerManager.WinterFlowResolverController((WinterFlowCloudPackage) WinterFlowSyntaxSubsystem5, winterFlowNetworkSession3.WinterFlowBandwidthObject, winterFlowBackendBatch);
                            winterFlowResolverLibrary.WinterFlowBandwidthObject(false);
                        } else {
                            winterFlowResolverLibrary.WinterFlowCompilerDataSource(-2076718545);
                            winterFlowResolverLibrary.WinterFlowBandwidthObject(false);
                            winterFlowMapperManager2 = WinterFlowValidatorComponent.WinterFlowRouterStructure;
                        }
                        winterFlowNetworkSession2 = winterFlowNetworkSession3;
                        WinterFlowServerManager.WinterFlowArrayNetwork(winterFlowFrameworkHelper, WinterFlowSoftwareException.WinterFlowValidatorHandler(winterFlowMapperManager.WinterFlowCacheManagerAgent(winterFlowNetworkSession3.WinterFlowServerProtocol).WinterFlowCacheManagerAgent(winterFlowNetworkSession3.WinterFlowThreadListener).WinterFlowCacheManagerAgent(new WinterFlowServiceProviderInheritance(winterFlowFrameworkHelper, winterFlowVersionCacheManager, winterFlowBackendBatch, z)).WinterFlowCacheManagerAgent(winterFlowMapperManager2).WinterFlowCacheManagerAgent((WinterFlowMapperManager) winterFlowNetworkSession3.WinterFlowServiceUtility.WinterFlowSyntax), winterFlowNetworkSession3, winterFlowBackendBatch, winterFlowDeploymentException, z, winterFlowNetworkWidget, winterFlowNetworkSession3.WinterFlowUnitTestResponse), winterFlowNetworkSession2.WinterFlowOrchestrationSubsystem, winterFlowXMLLayer2, winterFlowResolverLibrary, 0);
                    }
                } else {
                    obj = null;
                }
                z3 = false;
                WinterFlowVariableVersionControl2 = (((i14 & 234881024) ^ 100663296) <= 67108864 && winterFlowResolverLibrary.WinterFlowVariableVersionControl(obj)) | WinterFlowCacheManagerAgent2 | z3 | ((((i14 & 1879048192) ^ 805306368) <= 536870912 && winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowTransactionDecorator)) || (i14 & 805306368) == 536870912) | winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowWorkerHelper) | winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowThreadPoolProcess);
                Object WinterFlowSyntaxSubsystem42 = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
                if (WinterFlowVariableVersionControl2) {
                }
                winterFlowNetworkSession3 = winterFlowNetworkSession;
                z4 = true;
                winterFlowXMLLayer = new WinterFlowXMLLayer(winterFlowNetworkSession3, winterFlowExceptionXML, winterFlowFrameworkHelper2, winterFlowTransactionDecorator, winterFlowAdapterResponse, winterFlowWorkerHelper, winterFlowThreadPoolProcess, winterFlowConfigurationPipeline);
                winterFlowFrameworkHelper = winterFlowFrameworkHelper2;
                winterFlowResolverLibrary.WinterFlowArrayFramework(winterFlowXMLLayer);
                WinterFlowXMLLayer winterFlowXMLLayer22 = (WinterFlowXMLLayer) winterFlowXMLLayer;
                WinterFlowBackendBatch winterFlowBackendBatch2 = WinterFlowBackendBatch.WinterFlowVariableVersionControl;
                if (z) {
                }
                winterFlowNetworkSession2 = winterFlowNetworkSession3;
                WinterFlowServerManager.WinterFlowArrayNetwork(winterFlowFrameworkHelper, WinterFlowSoftwareException.WinterFlowValidatorHandler(winterFlowMapperManager.WinterFlowCacheManagerAgent(winterFlowNetworkSession3.WinterFlowServerProtocol).WinterFlowCacheManagerAgent(winterFlowNetworkSession3.WinterFlowThreadListener).WinterFlowCacheManagerAgent(new WinterFlowServiceProviderInheritance(winterFlowFrameworkHelper, winterFlowVersionCacheManager, winterFlowBackendBatch2, z)).WinterFlowCacheManagerAgent(winterFlowMapperManager2).WinterFlowCacheManagerAgent((WinterFlowMapperManager) winterFlowNetworkSession3.WinterFlowServiceUtility.WinterFlowSyntax), winterFlowNetworkSession3, winterFlowBackendBatch2, winterFlowDeploymentException, z, winterFlowNetworkWidget, winterFlowNetworkSession3.WinterFlowUnitTestResponse), winterFlowNetworkSession2.WinterFlowOrchestrationSubsystem, winterFlowXMLLayer22, winterFlowResolverLibrary, 0);
            }
            z2 = true;
            boolean WinterFlowCacheManagerAgent22 = z7 | z2 | winterFlowResolverLibrary.WinterFlowCacheManagerAgent(0) | ((((i14 & 3670016) ^ 1572864) <= 1048576 && winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowConfigurationPipeline)) || (i14 & 1572864) == 1048576);
            if (((i14 & 29360128) ^ 12582912) <= 8388608) {
            }
            z3 = false;
            WinterFlowVariableVersionControl2 = (((i14 & 234881024) ^ 100663296) <= 67108864 && winterFlowResolverLibrary.WinterFlowVariableVersionControl(obj)) | WinterFlowCacheManagerAgent22 | z3 | ((((i14 & 1879048192) ^ 805306368) <= 536870912 && winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowTransactionDecorator)) || (i14 & 805306368) == 536870912) | winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowWorkerHelper) | winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowThreadPoolProcess);
            Object WinterFlowSyntaxSubsystem422 = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
            if (WinterFlowVariableVersionControl2) {
            }
            winterFlowNetworkSession3 = winterFlowNetworkSession;
            z4 = true;
            winterFlowXMLLayer = new WinterFlowXMLLayer(winterFlowNetworkSession3, winterFlowExceptionXML, winterFlowFrameworkHelper2, winterFlowTransactionDecorator, winterFlowAdapterResponse, winterFlowWorkerHelper, winterFlowThreadPoolProcess, winterFlowConfigurationPipeline);
            winterFlowFrameworkHelper = winterFlowFrameworkHelper2;
            winterFlowResolverLibrary.WinterFlowArrayFramework(winterFlowXMLLayer);
            WinterFlowXMLLayer winterFlowXMLLayer222 = (WinterFlowXMLLayer) winterFlowXMLLayer;
            WinterFlowBackendBatch winterFlowBackendBatch22 = WinterFlowBackendBatch.WinterFlowVariableVersionControl;
            if (z) {
            }
            winterFlowNetworkSession2 = winterFlowNetworkSession3;
            WinterFlowServerManager.WinterFlowArrayNetwork(winterFlowFrameworkHelper, WinterFlowSoftwareException.WinterFlowValidatorHandler(winterFlowMapperManager.WinterFlowCacheManagerAgent(winterFlowNetworkSession3.WinterFlowServerProtocol).WinterFlowCacheManagerAgent(winterFlowNetworkSession3.WinterFlowThreadListener).WinterFlowCacheManagerAgent(new WinterFlowServiceProviderInheritance(winterFlowFrameworkHelper, winterFlowVersionCacheManager, winterFlowBackendBatch22, z)).WinterFlowCacheManagerAgent(winterFlowMapperManager2).WinterFlowCacheManagerAgent((WinterFlowMapperManager) winterFlowNetworkSession3.WinterFlowServiceUtility.WinterFlowSyntax), winterFlowNetworkSession3, winterFlowBackendBatch22, winterFlowDeploymentException, z, winterFlowNetworkWidget, winterFlowNetworkSession3.WinterFlowUnitTestResponse), winterFlowNetworkSession2.WinterFlowOrchestrationSubsystem, winterFlowXMLLayer222, winterFlowResolverLibrary, 0);
        } else {
            winterFlowNetworkSession2 = winterFlowNetworkSession;
            winterFlowResolverLibrary.WinterFlowQueueService();
        }
        WinterFlowStackEngine WinterFlowConcurrencyThread = winterFlowResolverLibrary.WinterFlowConcurrencyThread();
        if (WinterFlowConcurrencyThread != null) {
            final WinterFlowNetworkSession winterFlowNetworkSession4 = winterFlowNetworkSession2;
            WinterFlowConcurrencyThread.WinterFlowArrayNetwork = new WinterFlowEventEvent() { // from class: com.google.android.datatransport.WinterFlowSyntaxOrchestration
                @Override // com.google.android.datatransport.WinterFlowEventEvent
                public final Object WinterFlowVariableVersionControl(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    WinterFlowCloudStack.WinterFlowCacheManagerAgent(WinterFlowMapperManager.this, winterFlowNetworkSession4, winterFlowExceptionXML, winterFlowNetworkWidget, z, winterFlowDeploymentException, winterFlowConfigurationPipeline, winterFlowTransactionDecorator, winterFlowObjectSession, (WinterFlowResolverLibrary) obj3, WinterFlowConfigurationException.WinterFlowResponseEngine(i | 1), WinterFlowConfigurationException.WinterFlowResponseEngine(i2));
                    return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                }
            };
        }
    }

    public static final boolean WinterFlowCacheManagerListener(float f) {
        return Float.isNaN(f) || Math.abs(f) < 0.5f;
    }

    public static byte[] WinterFlowCacheTool(WinterFlowProcessorUtility winterFlowProcessorUtility) {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int min = Math.min(8192, Math.max(128, Integer.highestOneBit(0) * 2));
        int i = 0;
        while (i < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i);
            byte[] bArr = new byte[min2];
            arrayDeque.add(bArr);
            int i2 = 0;
            while (i2 < min2) {
                int read = winterFlowProcessorUtility.read(bArr, i2, min2 - i2);
                if (read == -1) {
                    return WinterFlowServerProtocol(arrayDeque, i);
                }
                i2 += read;
                i += read;
            }
            long j = min * (min < 4096 ? 4 : 2);
            min = j > 2147483647L ? Integer.MAX_VALUE : j < -2147483648L ? Integer.MIN_VALUE : (int) j;
        }
        if (winterFlowProcessorUtility.read() == -1) {
            return WinterFlowServerProtocol(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static long WinterFlowCloudMicroservice(double d) {
        if (!Double.isNaN(d)) {
            return Math.round(d);
        }
        WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("Cannot round NaN value.");
        return 0L;
    }

    public static final void WinterFlowCompilerHandler(WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, Object obj) {
        if (!(winterFlowTransactionManagerLayer instanceof WinterFlowScriptHelper)) {
            winterFlowTransactionManagerLayer.WinterFlowSyntax(obj);
            return;
        }
        WinterFlowScriptHelper winterFlowScriptHelper = (WinterFlowScriptHelper) winterFlowTransactionManagerLayer;
        WinterFlowUnitTestRouter winterFlowUnitTestRouter = winterFlowScriptHelper.WinterFlowRouterRouter;
        WinterFlowOrchestrationCompiler winterFlowOrchestrationCompiler = winterFlowScriptHelper.WinterFlowSyntax;
        Throwable WinterFlowRouterStructure2 = WinterFlowRendererStructure.WinterFlowRouterStructure(obj);
        Object winterFlowSessionManagerSessionManager = WinterFlowRouterStructure2 == null ? obj : new WinterFlowSessionManagerSessionManager(WinterFlowRouterStructure2, false);
        if (winterFlowUnitTestRouter.WinterFlowCacheManagerListener(winterFlowOrchestrationCompiler.getContext())) {
            winterFlowScriptHelper.WinterFlowResponseEngine = winterFlowSessionManagerSessionManager;
            winterFlowScriptHelper.WinterFlowUnitTestResponse = 1;
            winterFlowUnitTestRouter.WinterFlowConfigurationSubsystem(winterFlowOrchestrationCompiler.getContext(), winterFlowScriptHelper);
            return;
        }
        WinterFlowResponseObject WinterFlowRouterStructure3 = WinterFlowNetworkSubsystem.WinterFlowRouterStructure();
        if (WinterFlowRouterStructure3.WinterFlowUnitTestResponse >= 4294967296L) {
            winterFlowScriptHelper.WinterFlowResponseEngine = winterFlowSessionManagerSessionManager;
            winterFlowScriptHelper.WinterFlowUnitTestResponse = 1;
            WinterFlowRouterStructure3.WinterFlowUserManagerUserManager(winterFlowScriptHelper);
            return;
        }
        WinterFlowRouterStructure3.WinterFlowSoftwareEngine(true);
        try {
            WinterFlowConsumerBandwidth winterFlowConsumerBandwidth = (WinterFlowConsumerBandwidth) winterFlowOrchestrationCompiler.getContext().WinterFlowConsumerUserManager(WinterFlowSessionManagerProcess.WinterFlowVariableBandwidth);
            if (winterFlowConsumerBandwidth == null || winterFlowConsumerBandwidth.WinterFlowHookDataSource()) {
                Object obj2 = winterFlowScriptHelper.WinterFlowTransactionAgent;
                WinterFlowEncryptionMicroservice context = winterFlowOrchestrationCompiler.getContext();
                Object WinterFlowFrameworkTransaction = WinterFlowInvokerComponent.WinterFlowFrameworkTransaction(context, obj2);
                WinterFlowResolverCloud WinterFlowFrameworkTransaction2 = WinterFlowFrameworkTransaction != WinterFlowInvokerComponent.WinterFlowOrchestrationSubsystem ? WinterFlowUnitTestLibrary.WinterFlowFrameworkTransaction(winterFlowOrchestrationCompiler, context, WinterFlowFrameworkTransaction) : null;
                try {
                    winterFlowOrchestrationCompiler.WinterFlowSyntax(obj);
                } finally {
                    if (WinterFlowFrameworkTransaction2 == null || WinterFlowFrameworkTransaction2.WinterFlowPipelineSoftware()) {
                        WinterFlowInvokerComponent.WinterFlowCacheTool(context, WinterFlowFrameworkTransaction);
                    }
                }
            } else {
                winterFlowScriptHelper.WinterFlowSyntax(WinterFlowPackageProcess.WinterFlowHookDataSource(winterFlowConsumerBandwidth.WinterFlowBandwidthObject()));
            }
            while (WinterFlowRouterStructure3.WinterFlowTestingNode()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public static WinterFlowTransactionManagerLayer WinterFlowCompilerVariable(WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        winterFlowTransactionManagerLayer.getClass();
        WinterFlowOrchestrationCompiler winterFlowOrchestrationCompiler = winterFlowTransactionManagerLayer instanceof WinterFlowOrchestrationCompiler ? (WinterFlowOrchestrationCompiler) winterFlowTransactionManagerLayer : null;
        if (winterFlowOrchestrationCompiler == null || (winterFlowTransactionManagerLayer = winterFlowOrchestrationCompiler.WinterFlowUnitTestResponse) != null) {
            return winterFlowTransactionManagerLayer;
        }
        WinterFlowUnitTestRouter winterFlowUnitTestRouter = (WinterFlowUnitTestRouter) winterFlowOrchestrationCompiler.getContext().WinterFlowConsumerUserManager(WinterFlowCacheUtility.WinterFlowMapperProtocol);
        WinterFlowTransactionManagerLayer winterFlowScriptHelper = winterFlowUnitTestRouter != null ? new WinterFlowScriptHelper(winterFlowUnitTestRouter, winterFlowOrchestrationCompiler) : winterFlowOrchestrationCompiler;
        winterFlowOrchestrationCompiler.WinterFlowUnitTestResponse = winterFlowScriptHelper;
        return winterFlowScriptHelper;
    }

    public static final void WinterFlowConcurrencyThread(WinterFlowExceptionProxy winterFlowExceptionProxy) {
        WinterFlowDatabaseProtocol winterFlowDatabaseProtocol = winterFlowExceptionProxy.WinterFlowUnitTestResponse().WinterFlowSyntax;
        if (winterFlowDatabaseProtocol != WinterFlowDatabaseProtocol.WinterFlowTransactionManagerStrategy && winterFlowDatabaseProtocol != WinterFlowDatabaseProtocol.WinterFlowUnitTestResponse) {
            WinterFlowEventEmitterOrchestration.WinterFlowSingletonPlatform("Failed to enable `SavedStateHandle` for `", winterFlowExceptionProxy, "`. The `Lifecycle.State` must be `INITIALIZED` or `CREATED`, but was `", winterFlowDatabaseProtocol, "`. You must call `enableSavedStateHandles()` before the `Lifecycle.State` moves to `STARTED`.");
        } else if (winterFlowExceptionProxy.WinterFlowHookDataSource().WinterFlowRouterAdapter("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            WinterFlowXMLUtility winterFlowXMLUtility = new WinterFlowXMLUtility(winterFlowExceptionProxy.WinterFlowHookDataSource(), (WinterFlowProviderCacheManager) winterFlowExceptionProxy);
            winterFlowExceptionProxy.WinterFlowHookDataSource().WinterFlowArrayHelper("androidx.lifecycle.internal.SavedStateHandlesProvider", winterFlowXMLUtility);
            winterFlowExceptionProxy.WinterFlowUnitTestResponse().WinterFlowRouterStructure(new WinterFlowVariableComponent(3, winterFlowXMLUtility));
        }
    }

    public static String WinterFlowConfiguration(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
            return "CornerRadius.circular(" + WinterFlowQuerySyntax.WinterFlowSoftwareEngine(Float.intBitsToFloat(i)) + ')';
        }
        return "CornerRadius.elliptical(" + WinterFlowQuerySyntax.WinterFlowSoftwareEngine(Float.intBitsToFloat(i)) + ", " + WinterFlowQuerySyntax.WinterFlowSoftwareEngine(Float.intBitsToFloat(i2)) + ')';
    }

    public static final boolean WinterFlowConfigurationSubsystem(WinterFlowDeploymentWidget winterFlowDeploymentWidget) {
        WinterFlowSchedulerStructure winterFlowSchedulerStructure;
        WinterFlowUIMicroservice winterFlowUIMicroservice;
        WinterFlowSchedulerStructure winterFlowSchedulerStructure2;
        WinterFlowUIMicroservice winterFlowUIMicroservice2 = winterFlowDeploymentWidget.WinterFlowServerProtocol;
        return (winterFlowUIMicroservice2 == null || (winterFlowSchedulerStructure = winterFlowUIMicroservice2.WinterFlowVariableBandwidth) == null || !winterFlowSchedulerStructure.WinterFlowPackageIDE() || (winterFlowUIMicroservice = winterFlowDeploymentWidget.WinterFlowServerProtocol) == null || (winterFlowSchedulerStructure2 = winterFlowUIMicroservice.WinterFlowVariableBandwidth) == null || !winterFlowSchedulerStructure2.WinterFlowCacheManagerListener()) ? false : true;
    }

    public static Intent WinterFlowConsumerUserManager(Context context, ComponentName componentName) {
        String WinterFlowBackendCacheManager = WinterFlowBackendCacheManager(context, componentName);
        if (WinterFlowBackendCacheManager == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), WinterFlowBackendCacheManager);
        return WinterFlowBackendCacheManager(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public static final WinterFlowGatewaySubsystem WinterFlowEventEmitterController(View view) {
        WinterFlowGatewaySubsystem winterFlowGatewaySubsystem = (WinterFlowGatewaySubsystem) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (winterFlowGatewaySubsystem != null) {
            return winterFlowGatewaySubsystem;
        }
        WinterFlowGatewaySubsystem winterFlowGatewaySubsystem2 = new WinterFlowGatewaySubsystem();
        view.setTag(R.id.pooling_container_listener_holder_tag, winterFlowGatewaySubsystem2);
        return winterFlowGatewaySubsystem2;
    }

    public static int WinterFlowFrontendBackend(float f) {
        if (!Float.isNaN(f)) {
            return Math.round(f);
        }
        WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("Cannot round NaN value.");
        return 0;
    }

    public static final void WinterFlowHookDataSource(WinterFlowMapperManager winterFlowMapperManager, WinterFlowResolverLibrary winterFlowResolverLibrary, int i) {
        winterFlowResolverLibrary.WinterFlowFrameworkTransaction(-795745629);
        int i2 = (winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowMapperManager) ? 4 : 2) | i;
        int i3 = 0;
        int i4 = 1;
        if (winterFlowResolverLibrary.WinterFlowFrontendBackend(i2 & 1, (i2 & 3) != 2)) {
            Object WinterFlowSyntaxSubsystem = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
            Object obj = WinterFlowModuleModule.WinterFlowRouterStructure;
            if (WinterFlowSyntaxSubsystem == obj) {
                WinterFlowSyntaxSubsystem = WinterFlowServerManager.WinterFlowRouterStructure(0.0f);
                winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem);
            }
            WinterFlowRendererRefactoring winterFlowRendererRefactoring = (WinterFlowRendererRefactoring) WinterFlowSyntaxSubsystem;
            Object WinterFlowSyntaxSubsystem2 = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
            if (WinterFlowSyntaxSubsystem2 == obj) {
                WinterFlowSyntaxSubsystem2 = WinterFlowServerManager.WinterFlowRouterStructure(0.7f);
                winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem2);
            }
            WinterFlowRendererRefactoring winterFlowRendererRefactoring2 = (WinterFlowRendererRefactoring) WinterFlowSyntaxSubsystem2;
            boolean WinterFlowUnitTestResponse2 = winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowRendererRefactoring);
            Object WinterFlowSyntaxSubsystem3 = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
            WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer = null;
            if (WinterFlowUnitTestResponse2 || WinterFlowSyntaxSubsystem3 == obj) {
                WinterFlowSyntaxSubsystem3 = new WinterFlowIDESystem(winterFlowRendererRefactoring, winterFlowTransactionManagerLayer, i3);
                winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem3);
            }
            WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            WinterFlowSoftwareException.WinterFlowArrayNetwork((WinterFlowEventEvent) WinterFlowSyntaxSubsystem3, winterFlowResolverLibrary, winterFlowAlgorithmSession);
            boolean WinterFlowUnitTestResponse3 = winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowRendererRefactoring2);
            Object WinterFlowSyntaxSubsystem4 = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
            if (WinterFlowUnitTestResponse3 || WinterFlowSyntaxSubsystem4 == obj) {
                WinterFlowSyntaxSubsystem4 = new WinterFlowIDESystem(winterFlowRendererRefactoring2, winterFlowTransactionManagerLayer, i4);
                winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem4);
            }
            WinterFlowSoftwareException.WinterFlowArrayNetwork((WinterFlowEventEvent) WinterFlowSyntaxSubsystem4, winterFlowResolverLibrary, winterFlowAlgorithmSession);
            WinterFlowMicroserviceMechanism winterFlowMicroserviceMechanism = WinterFlowCacheRuntime.WinterFlowThreadListener;
            WinterFlowMapperManager WinterFlowCacheManagerAgent2 = winterFlowMapperManager.WinterFlowCacheManagerAgent(winterFlowMicroserviceMechanism);
            WinterFlowWorkerModule WinterFlowCacheManagerAgent3 = WinterFlowLibrary.WinterFlowCacheManagerAgent(WinterFlowCacheUtility.WinterFlowUnitTestResponse, false);
            int hashCode = Long.hashCode(winterFlowResolverLibrary.WinterFlowConfiguration);
            WinterFlowConfigurationProcess WinterFlowTransactionAgent = winterFlowResolverLibrary.WinterFlowTransactionAgent();
            WinterFlowMapperManager WinterFlowUserManagerUserManager = WinterFlowSoftwareException.WinterFlowUserManagerUserManager(winterFlowResolverLibrary, WinterFlowCacheManagerAgent2);
            WinterFlowBandwidthAgent.WinterFlowCacheManagerAgent.getClass();
            WinterFlowObjectUI winterFlowObjectUI = WinterFlowEventEmitterDeserialization.WinterFlowHookDataSource;
            winterFlowResolverLibrary.WinterFlowModuleAgent();
            if (winterFlowResolverLibrary.WinterFlowProxyStructure) {
                winterFlowResolverLibrary.WinterFlowResponseEngine(winterFlowObjectUI);
            } else {
                winterFlowResolverLibrary.WinterFlowParserPipeline();
            }
            WinterFlowProtocolNetwork.WinterFlowSyntax(WinterFlowEventEmitterDeserialization.WinterFlowVariableVersionControl, winterFlowResolverLibrary, WinterFlowCacheManagerAgent3);
            WinterFlowProtocolNetwork.WinterFlowSyntax(WinterFlowEventEmitterDeserialization.WinterFlowArrayNetwork, winterFlowResolverLibrary, WinterFlowTransactionAgent);
            WinterFlowProtocolNetwork.WinterFlowSyntax(WinterFlowEventEmitterDeserialization.WinterFlowTransactionManagerStrategy, winterFlowResolverLibrary, Integer.valueOf(hashCode));
            WinterFlowProtocolNetwork.WinterFlowRouterRouter(winterFlowResolverLibrary, WinterFlowEventEmitterDeserialization.WinterFlowUnitTestResponse);
            WinterFlowProtocolNetwork.WinterFlowSyntax(WinterFlowEventEmitterDeserialization.WinterFlowCacheManagerAgent, winterFlowResolverLibrary, WinterFlowUserManagerUserManager);
            WinterFlowSessionManagerProcess winterFlowSessionManagerProcess = WinterFlowSessionManagerProcess.WinterFlowRouterRouter;
            WinterFlowUnitTestLibrary.WinterFlowVariableVersionControl(WinterFlowSoftwareException.WinterFlowTestingNode(R.drawable.load1, winterFlowResolverLibrary, 0), winterFlowMicroserviceMechanism, null, WinterFlowThreadConfiguration.WinterFlowRouterStructure, 0.0f, winterFlowResolverLibrary, 25016, 104);
            WinterFlowSoftwareSubsystem WinterFlowTestingNode = WinterFlowSoftwareException.WinterFlowTestingNode(R.drawable.load2, winterFlowResolverLibrary, 0);
            WinterFlowMapperManager WinterFlowEventEmitterController = WinterFlowUnitTestLibrary.WinterFlowEventEmitterController(winterFlowSessionManagerProcess.WinterFlowServerProtocol(WinterFlowValidatorComponent.WinterFlowRouterStructure, WinterFlowCacheUtility.WinterFlowTransactionAgent), ((Number) winterFlowRendererRefactoring2.WinterFlowCacheManagerAgent()).floatValue(), ((Number) winterFlowRendererRefactoring2.WinterFlowCacheManagerAgent()).floatValue(), 0.0f, null, 524284);
            float floatValue = ((Number) winterFlowRendererRefactoring.WinterFlowCacheManagerAgent()).floatValue();
            if (floatValue != 1.0f) {
                WinterFlowEventEmitterController = WinterFlowUnitTestLibrary.WinterFlowEventEmitterController(WinterFlowEventEmitterController, 0.0f, 0.0f, floatValue, null, 520187);
            }
            WinterFlowUnitTestLibrary.WinterFlowVariableVersionControl(WinterFlowTestingNode, WinterFlowEventEmitterController, null, null, 0.0f, winterFlowResolverLibrary, 56, 120);
            winterFlowResolverLibrary.WinterFlowBandwidthObject(true);
        } else {
            winterFlowResolverLibrary.WinterFlowQueueService();
        }
        WinterFlowStackEngine WinterFlowConcurrencyThread = winterFlowResolverLibrary.WinterFlowConcurrencyThread();
        if (WinterFlowConcurrencyThread != null) {
            WinterFlowConcurrencyThread.WinterFlowArrayNetwork = new WinterFlowSingletonEventEmitter(winterFlowMapperManager, i, i4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0026, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final WinterFlowDeploymentWidget WinterFlowMapperProtocol(WinterFlowDeploymentWidget winterFlowDeploymentWidget) {
        boolean z = winterFlowDeploymentWidget.WinterFlowVariableVersionControl.WinterFlowSingletonPlatform;
        if (z) {
            if (!z) {
                WinterFlowViewUtility.WinterFlowHookDataSource("visitChildren called on an unattached node");
            }
            WinterFlowJSON winterFlowJSON = new WinterFlowJSON(new WinterFlowUserManagerController[16]);
            WinterFlowUserManagerController winterFlowUserManagerController = winterFlowDeploymentWidget.WinterFlowVariableVersionControl;
            WinterFlowUserManagerController winterFlowUserManagerController2 = winterFlowUserManagerController.WinterFlowResponseEngine;
            if (winterFlowUserManagerController2 == null) {
                WinterFlowArrayNetwork(winterFlowJSON, winterFlowUserManagerController);
            } else {
                winterFlowJSON.WinterFlowHookDataSource(winterFlowUserManagerController2);
            }
            loop0: while (true) {
                int i = winterFlowJSON.WinterFlowUnitTestResponse;
                if (i == 0) {
                    break;
                }
                WinterFlowUserManagerController winterFlowUserManagerController3 = (WinterFlowUserManagerController) winterFlowJSON.WinterFlowTransactionAgent(i - 1);
                if ((winterFlowUserManagerController3.WinterFlowRouterRouter & 1024) == 0) {
                    WinterFlowArrayNetwork(winterFlowJSON, winterFlowUserManagerController3);
                } else {
                    while (true) {
                        if (winterFlowUserManagerController3 == null) {
                            break;
                        }
                        if ((winterFlowUserManagerController3.WinterFlowUnitTestResponse & 1024) != 0) {
                            WinterFlowJSON winterFlowJSON2 = null;
                            while (winterFlowUserManagerController3 != null) {
                                if (winterFlowUserManagerController3 instanceof WinterFlowDeploymentWidget) {
                                    WinterFlowDeploymentWidget winterFlowDeploymentWidget2 = (WinterFlowDeploymentWidget) winterFlowUserManagerController3;
                                    if (winterFlowDeploymentWidget2.WinterFlowVariableVersionControl.WinterFlowSingletonPlatform) {
                                        int ordinal = winterFlowDeploymentWidget2.WinterFlowEncryptionAdapter().ordinal();
                                        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
                                            break loop0;
                                        }
                                        if (ordinal != 3) {
                                            WinterFlowEventEmitterOrchestration.WinterFlowRouterStructure();
                                            return null;
                                        }
                                    }
                                } else if ((winterFlowUserManagerController3.WinterFlowUnitTestResponse & 1024) != 0 && (winterFlowUserManagerController3 instanceof WinterFlowTestingEntity)) {
                                    int i2 = 0;
                                    for (WinterFlowUserManagerController winterFlowUserManagerController4 = ((WinterFlowTestingEntity) winterFlowUserManagerController3).WinterFlowBatchUI; winterFlowUserManagerController4 != null; winterFlowUserManagerController4 = winterFlowUserManagerController4.WinterFlowResponseEngine) {
                                        if ((winterFlowUserManagerController4.WinterFlowUnitTestResponse & 1024) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                winterFlowUserManagerController3 = winterFlowUserManagerController4;
                                            } else {
                                                if (winterFlowJSON2 == null) {
                                                    winterFlowJSON2 = new WinterFlowJSON(new WinterFlowUserManagerController[16]);
                                                }
                                                if (winterFlowUserManagerController3 != null) {
                                                    winterFlowJSON2.WinterFlowHookDataSource(winterFlowUserManagerController3);
                                                    winterFlowUserManagerController3 = null;
                                                }
                                                winterFlowJSON2.WinterFlowHookDataSource(winterFlowUserManagerController4);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                winterFlowUserManagerController3 = WinterFlowPackageIDE(winterFlowJSON2);
                            }
                        } else {
                            winterFlowUserManagerController3 = winterFlowUserManagerController3.WinterFlowResponseEngine;
                        }
                    }
                }
            }
        }
        return null;
    }

    public static boolean WinterFlowOrchestrationSubsystem(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return false;
        }
        boolean z = true;
        for (File file2 : listFiles) {
            z = WinterFlowOrchestrationSubsystem(file2) && z;
        }
        return z;
    }

    public static final WinterFlowUserManagerController WinterFlowPackageIDE(WinterFlowJSON winterFlowJSON) {
        int i;
        if (winterFlowJSON == null || (i = winterFlowJSON.WinterFlowUnitTestResponse) == 0) {
            return null;
        }
        return (WinterFlowUserManagerController) winterFlowJSON.WinterFlowTransactionAgent(i - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Icon WinterFlowProxyStructure(IconCompat iconCompat, Context context) {
        Icon createWithBitmap;
        InputStream openInputStream;
        int i = iconCompat.WinterFlowRouterStructure;
        String str = null;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                return (Icon) iconCompat.WinterFlowHookDataSource;
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
            default:
                WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("Unknown type");
                return null;
            case 1:
                createWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.WinterFlowHookDataSource);
                break;
            case 2:
                if (i == -1) {
                    Object obj = iconCompat.WinterFlowHookDataSource;
                    if (Build.VERSION.SDK_INT >= 28) {
                        str = WinterFlowQueueScheduler.WinterFlowArrayNetwork(obj);
                    } else {
                        try {
                            str = (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
                        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                        }
                    }
                } else {
                    if (i != 2) {
                        WinterFlowCompilerMechanism.WinterFlowRouterRouter(iconCompat, "called getResPackage() on ");
                        return null;
                    }
                    String str2 = iconCompat.WinterFlowResponseEngine;
                    str = (str2 == null || TextUtils.isEmpty(str2)) ? ((String) iconCompat.WinterFlowHookDataSource).split(":", -1)[0] : iconCompat.WinterFlowResponseEngine;
                }
                createWithBitmap = Icon.createWithResource(str, iconCompat.WinterFlowVariableVersionControl);
                break;
            case 3:
                createWithBitmap = Icon.createWithData((byte[]) iconCompat.WinterFlowHookDataSource, iconCompat.WinterFlowVariableVersionControl, iconCompat.WinterFlowTransactionManagerStrategy);
                break;
            case 4:
                createWithBitmap = Icon.createWithContentUri((String) iconCompat.WinterFlowHookDataSource);
                break;
            case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                createWithBitmap = Icon.createWithAdaptiveBitmap((Bitmap) iconCompat.WinterFlowHookDataSource);
                break;
            case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                if (Build.VERSION.SDK_INT >= 30) {
                    createWithBitmap = WinterFlowDebugPlatform.WinterFlowRouterStructure(iconCompat.WinterFlowArrayNetwork());
                    break;
                } else {
                    if (context == null) {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.WinterFlowArrayNetwork());
                    }
                    Uri WinterFlowArrayNetwork2 = iconCompat.WinterFlowArrayNetwork();
                    String scheme = WinterFlowArrayNetwork2.getScheme();
                    if ("content".equals(scheme) || "file".equals(scheme)) {
                        try {
                            openInputStream = context.getContentResolver().openInputStream(WinterFlowArrayNetwork2);
                        } catch (Exception unused2) {
                            WinterFlowArrayNetwork2.toString();
                            openInputStream = null;
                            if (openInputStream == null) {
                            }
                        }
                    } else {
                        try {
                            openInputStream = new FileInputStream(new File((String) iconCompat.WinterFlowHookDataSource));
                        } catch (FileNotFoundException unused3) {
                            WinterFlowArrayNetwork2.toString();
                            openInputStream = null;
                            if (openInputStream == null) {
                            }
                        }
                    }
                    if (openInputStream == null) {
                        WinterFlowCompilerMechanism.WinterFlowResponseEngine(iconCompat.WinterFlowArrayNetwork(), "Cannot load adaptive icon from uri: ");
                        return null;
                    }
                    createWithBitmap = Icon.createWithAdaptiveBitmap(BitmapFactory.decodeStream(openInputStream));
                    break;
                }
                break;
        }
        ColorStateList colorStateList = iconCompat.WinterFlowUnitTestResponse;
        if (colorStateList != null) {
            createWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = iconCompat.WinterFlowRouterRouter;
        if (mode != IconCompat.WinterFlowTransactionAgent) {
            createWithBitmap.setTintMode(mode);
        }
        return createWithBitmap;
    }

    public static final WinterFlowTransactionRequest WinterFlowQueueService(WinterFlowHandlerInvoker winterFlowHandlerInvoker, WinterFlowObjectSession winterFlowObjectSession, Object obj, WinterFlowResolverLibrary winterFlowResolverLibrary) {
        winterFlowResolverLibrary.WinterFlowCacheTool(-422486745, 0, winterFlowHandlerInvoker, null);
        boolean WinterFlowUnitTestResponse2 = winterFlowHandlerInvoker.WinterFlowUnitTestResponse();
        WinterFlowPackageConsumer winterFlowPackageConsumer = winterFlowHandlerInvoker.WinterFlowRouterStructure;
        WinterFlowTransactionRequest winterFlowTransactionRequest = WinterFlowTransactionRequest.WinterFlowVariableVersionControl;
        WinterFlowTransactionRequest winterFlowTransactionRequest2 = WinterFlowTransactionRequest.WinterFlowUnitTestResponse;
        WinterFlowTransactionRequest winterFlowTransactionRequest3 = WinterFlowTransactionRequest.WinterFlowTransactionManagerStrategy;
        if (WinterFlowUnitTestResponse2) {
            winterFlowResolverLibrary.WinterFlowCompilerDataSource(-212166497);
            winterFlowResolverLibrary.WinterFlowBandwidthObject(false);
            if (((Boolean) winterFlowObjectSession.WinterFlowUnitTestResponse(obj)).booleanValue()) {
                winterFlowTransactionRequest = winterFlowTransactionRequest3;
            } else if (((Boolean) winterFlowObjectSession.WinterFlowUnitTestResponse(winterFlowPackageConsumer.WinterFlowSyntax())).booleanValue()) {
                winterFlowTransactionRequest = winterFlowTransactionRequest2;
            }
        } else {
            winterFlowResolverLibrary.WinterFlowCompilerDataSource(-211892364);
            Object WinterFlowSyntaxSubsystem = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
            if (WinterFlowSyntaxSubsystem == WinterFlowModuleModule.WinterFlowRouterStructure) {
                WinterFlowSyntaxSubsystem = WinterFlowDecoratorUI.WinterFlowSerializerStructure(Boolean.FALSE);
                winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem);
            }
            WinterFlowThreadPoolGateway winterFlowThreadPoolGateway = (WinterFlowThreadPoolGateway) WinterFlowSyntaxSubsystem;
            if (((Boolean) winterFlowObjectSession.WinterFlowUnitTestResponse(winterFlowPackageConsumer.WinterFlowSyntax())).booleanValue()) {
                winterFlowThreadPoolGateway.setValue(Boolean.TRUE);
            }
            if (((Boolean) winterFlowObjectSession.WinterFlowUnitTestResponse(obj)).booleanValue()) {
                winterFlowTransactionRequest = winterFlowTransactionRequest3;
            } else if (((Boolean) winterFlowThreadPoolGateway.getValue()).booleanValue()) {
                winterFlowTransactionRequest = winterFlowTransactionRequest2;
            }
            winterFlowResolverLibrary.WinterFlowBandwidthObject(false);
        }
        winterFlowResolverLibrary.WinterFlowBandwidthObject(false);
        return winterFlowTransactionRequest;
    }

    public static final int WinterFlowResolverController(WinterFlowResolverLibrary winterFlowResolverLibrary) {
        winterFlowResolverLibrary.getClass();
        return Long.hashCode(winterFlowResolverLibrary.WinterFlowConfiguration);
    }

    public static WinterFlowMapperManager WinterFlowResponseEngine(WinterFlowMapperManager winterFlowMapperManager, boolean z, WinterFlowObjectUI winterFlowObjectUI, int i) {
        if ((i & 1) != 0) {
            z = true;
        }
        return winterFlowMapperManager.WinterFlowCacheManagerAgent(new WinterFlowPipelineService(z, winterFlowObjectUI));
    }

    public static final WinterFlowVersionParser WinterFlowRouterAdapter(WinterFlowDeploymentWidget winterFlowDeploymentWidget) {
        WinterFlowUIMicroservice winterFlowUIMicroservice;
        if (winterFlowDeploymentWidget.WinterFlowSingletonPlatform && (winterFlowUIMicroservice = winterFlowDeploymentWidget.WinterFlowServerProtocol) != null) {
            WinterFlowAlgorithmHandler WinterFlowBatchUI = WinterFlowBatchUI(winterFlowUIMicroservice);
            if (!WinterFlowBatchUI.WinterFlowCloudMicroservice()) {
                WinterFlowBatchUI = null;
            }
            if (WinterFlowBatchUI != null) {
                return winterFlowDeploymentWidget.WinterFlowServerStack(WinterFlowBatchUI);
            }
        }
        return WinterFlowVersionParser.WinterFlowVariableVersionControl;
    }

    public static final WinterFlowVersionParser WinterFlowRouterRouter(WinterFlowAlgorithmHandler winterFlowAlgorithmHandler) {
        WinterFlowAlgorithmHandler WinterFlowResponseEngine2 = winterFlowAlgorithmHandler.WinterFlowResponseEngine();
        return WinterFlowResponseEngine2 != null ? WinterFlowResponseEngine2.WinterFlowVariableBandwidth(winterFlowAlgorithmHandler, true) : new WinterFlowVersionParser(0.0f, 0.0f, (int) (winterFlowAlgorithmHandler.WinterFlowCacheManagerListener() >> 32), (int) (winterFlowAlgorithmHandler.WinterFlowCacheManagerListener() & 4294967295L));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void WinterFlowRouterStructure(WinterFlowHandlerInvoker winterFlowHandlerInvoker, WinterFlowObjectSession winterFlowObjectSession, WinterFlowMapperManager winterFlowMapperManager, WinterFlowProxyLayer winterFlowProxyLayer, WinterFlowInvokerOrchestration winterFlowInvokerOrchestration, WinterFlowEventEvent winterFlowEventEvent, WinterFlowEventTool winterFlowEventTool, WinterFlowResolverLibrary winterFlowResolverLibrary, int i) {
        WinterFlowEventTool winterFlowEventTool2;
        WinterFlowPackageConsumer winterFlowPackageConsumer;
        WinterFlowProxyLayer winterFlowProxyLayer2;
        boolean WinterFlowVariableVersionControl2;
        Object WinterFlowSyntaxSubsystem;
        WinterFlowInvokerOrchestration winterFlowInvokerOrchestration2;
        boolean WinterFlowVariableVersionControl3;
        Object WinterFlowSyntaxSubsystem2;
        Object WinterFlowSyntaxSubsystem3;
        WinterFlowThreadPoolGateway winterFlowThreadPoolGateway;
        boolean WinterFlowUnitTestResponse2;
        Object WinterFlowSyntaxSubsystem4;
        Object WinterFlowSyntax2;
        WinterFlowTransactionRequest winterFlowTransactionRequest;
        boolean z;
        Object WinterFlowSyntaxSubsystem5;
        Object WinterFlowSyntaxSubsystem6;
        WinterFlowRefactoringRequest winterFlowRefactoringRequest;
        WinterFlowRefactoringRequest winterFlowRefactoringRequest2;
        Object obj;
        boolean z2;
        WinterFlowListenerSyntax winterFlowListenerSyntax;
        boolean WinterFlowUnitTestResponse3;
        Object WinterFlowSyntaxSubsystem7;
        WinterFlowProxyLayer winterFlowProxyLayer3;
        WinterFlowInvokerOrchestration winterFlowInvokerOrchestration3;
        boolean WinterFlowTransactionManagerStrategy2;
        Object WinterFlowSyntaxSubsystem8;
        Object WinterFlowSyntaxSubsystem9;
        boolean z3;
        winterFlowResolverLibrary.WinterFlowFrameworkTransaction(1912839215);
        int i2 = i | (winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowHandlerInvoker) ? 4 : 2) | (winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowObjectSession) ? 32 : 16) | (winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowMapperManager) ? 256 : 128) | (winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowProxyLayer) ? 2048 : 1024) | (winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowInvokerOrchestration) ? 16384 : 8192) | (winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowEventEvent) ? 131072 : 65536) | 1572864;
        if (winterFlowResolverLibrary.WinterFlowFrontendBackend(i2 & 1, (4793491 & i2) != 4793490)) {
            WinterFlowResolverSubsystem winterFlowResolverSubsystem = winterFlowHandlerInvoker.WinterFlowArrayNetwork;
            WinterFlowPackageConsumer winterFlowPackageConsumer2 = winterFlowHandlerInvoker.WinterFlowRouterStructure;
            if (((Boolean) winterFlowObjectSession.WinterFlowUnitTestResponse(winterFlowResolverSubsystem.getValue())).booleanValue() || ((Boolean) winterFlowObjectSession.WinterFlowUnitTestResponse(winterFlowPackageConsumer2.WinterFlowSyntax())).booleanValue() || winterFlowHandlerInvoker.WinterFlowUnitTestResponse() || winterFlowHandlerInvoker.WinterFlowArrayNetwork()) {
                winterFlowResolverLibrary.WinterFlowCompilerDataSource(-232386135);
                int i3 = i2 & 14;
                int i4 = i3 | 48;
                int i5 = i4 & 14;
                boolean z4 = ((i5 ^ 6) > 4 && winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowHandlerInvoker)) || (i4 & 6) == 4;
                Object WinterFlowSyntaxSubsystem10 = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
                Object obj2 = WinterFlowModuleModule.WinterFlowRouterStructure;
                if (z4 || WinterFlowSyntaxSubsystem10 == obj2) {
                    WinterFlowSyntaxSubsystem10 = winterFlowPackageConsumer2.WinterFlowSyntax();
                    winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem10);
                }
                if (winterFlowHandlerInvoker.WinterFlowUnitTestResponse()) {
                    WinterFlowSyntaxSubsystem10 = winterFlowPackageConsumer2.WinterFlowSyntax();
                }
                winterFlowResolverLibrary.WinterFlowCompilerDataSource(1844425648);
                WinterFlowTransactionRequest WinterFlowQueueService = WinterFlowQueueService(winterFlowHandlerInvoker, winterFlowObjectSession, WinterFlowSyntaxSubsystem10, winterFlowResolverLibrary);
                winterFlowResolverLibrary.WinterFlowBandwidthObject(false);
                Object value = winterFlowHandlerInvoker.WinterFlowArrayNetwork.getValue();
                winterFlowResolverLibrary.WinterFlowCompilerDataSource(1844425648);
                WinterFlowTransactionRequest WinterFlowQueueService2 = WinterFlowQueueService(winterFlowHandlerInvoker, winterFlowObjectSession, value, winterFlowResolverLibrary);
                winterFlowResolverLibrary.WinterFlowBandwidthObject(false);
                int i6 = i5 | 3072;
                int i7 = (i6 & 14) ^ 6;
                boolean z5 = (i7 > 4 && winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowHandlerInvoker)) || (i6 & 6) == 4;
                Object WinterFlowSyntaxSubsystem11 = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
                if (z5 || WinterFlowSyntaxSubsystem11 == obj2) {
                    WinterFlowSyntaxSubsystem11 = new WinterFlowHandlerInvoker(new WinterFlowProviderRenderer(WinterFlowQueueService), winterFlowHandlerInvoker, winterFlowHandlerInvoker.WinterFlowCacheManagerAgent.concat(" > EnterExitTransition"));
                    winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem11);
                }
                WinterFlowHandlerInvoker winterFlowHandlerInvoker2 = (WinterFlowHandlerInvoker) WinterFlowSyntaxSubsystem11;
                boolean WinterFlowVariableVersionControl4 = ((i7 > 4 && winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowHandlerInvoker)) || (i6 & 6) == 4) | winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowHandlerInvoker2);
                Object WinterFlowSyntaxSubsystem12 = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
                if (WinterFlowVariableVersionControl4 || WinterFlowSyntaxSubsystem12 == obj2) {
                    WinterFlowSyntaxSubsystem12 = new WinterFlowDataSourceVersionControl(2, winterFlowHandlerInvoker, winterFlowHandlerInvoker2, false);
                    winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem12);
                }
                WinterFlowSoftwareException.WinterFlowHookDataSource(winterFlowHandlerInvoker2, (WinterFlowObjectSession) WinterFlowSyntaxSubsystem12, winterFlowResolverLibrary);
                if (winterFlowHandlerInvoker.WinterFlowUnitTestResponse()) {
                    winterFlowHandlerInvoker2.WinterFlowTransactionAgent(WinterFlowQueueService, WinterFlowQueueService2);
                } else {
                    winterFlowHandlerInvoker2.WinterFlowOrchestrationSubsystem(WinterFlowQueueService2);
                    winterFlowHandlerInvoker2.WinterFlowTransactionAgent.setValue(Boolean.FALSE);
                }
                WinterFlowCacheManagerVersionControl winterFlowCacheManagerVersionControl = WinterFlowMapperView.WinterFlowRouterStructure;
                boolean WinterFlowVariableVersionControl5 = winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowHandlerInvoker2);
                Object WinterFlowSyntaxSubsystem13 = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
                if (WinterFlowVariableVersionControl5 || WinterFlowSyntaxSubsystem13 == obj2) {
                    WinterFlowSyntaxSubsystem13 = WinterFlowDecoratorUI.WinterFlowSerializerStructure(winterFlowProxyLayer);
                    winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem13);
                }
                WinterFlowThreadPoolGateway winterFlowThreadPoolGateway2 = (WinterFlowThreadPoolGateway) WinterFlowSyntaxSubsystem13;
                WinterFlowPackageConsumer winterFlowPackageConsumer3 = winterFlowHandlerInvoker2.WinterFlowRouterStructure;
                WinterFlowPackageConsumer winterFlowPackageConsumer4 = winterFlowHandlerInvoker2.WinterFlowRouterStructure;
                WinterFlowResolverSubsystem winterFlowResolverSubsystem2 = winterFlowHandlerInvoker2.WinterFlowArrayNetwork;
                Object WinterFlowSyntax3 = winterFlowPackageConsumer3.WinterFlowSyntax();
                Object value2 = winterFlowResolverSubsystem2.getValue();
                WinterFlowTransactionRequest winterFlowTransactionRequest2 = WinterFlowTransactionRequest.WinterFlowTransactionManagerStrategy;
                if (WinterFlowSyntax3 == value2 && winterFlowPackageConsumer4.WinterFlowSyntax() == winterFlowTransactionRequest2) {
                    if (winterFlowHandlerInvoker2.WinterFlowUnitTestResponse()) {
                        winterFlowThreadPoolGateway2.setValue(winterFlowProxyLayer);
                    } else {
                        winterFlowThreadPoolGateway2.setValue(WinterFlowProxyLayer.WinterFlowHookDataSource);
                    }
                } else if (winterFlowResolverSubsystem2.getValue() == winterFlowTransactionRequest2) {
                    WinterFlowRefactoringRequest winterFlowRefactoringRequest3 = ((WinterFlowProxyLayer) winterFlowThreadPoolGateway2.getValue()).WinterFlowRouterStructure;
                    WinterFlowRefactoringRequest winterFlowRefactoringRequest4 = winterFlowProxyLayer.WinterFlowRouterStructure;
                    WinterFlowWorkerDeserialization winterFlowWorkerDeserialization = winterFlowRefactoringRequest4.WinterFlowRouterStructure;
                    if (winterFlowWorkerDeserialization == null) {
                        winterFlowWorkerDeserialization = winterFlowRefactoringRequest3.WinterFlowRouterStructure;
                    }
                    Map map = winterFlowRefactoringRequest3.WinterFlowCacheManagerAgent;
                    Map map2 = winterFlowRefactoringRequest4.WinterFlowCacheManagerAgent;
                    map.getClass();
                    map2.getClass();
                    winterFlowPackageConsumer = winterFlowPackageConsumer4;
                    LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                    linkedHashMap.putAll(map2);
                    winterFlowThreadPoolGateway2.setValue(new WinterFlowProxyLayer(new WinterFlowRefactoringRequest(winterFlowWorkerDeserialization, (WinterFlowConfigurationException) null, linkedHashMap, 32)));
                    winterFlowProxyLayer2 = (WinterFlowProxyLayer) winterFlowThreadPoolGateway2.getValue();
                    WinterFlowVariableVersionControl2 = winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowHandlerInvoker2);
                    WinterFlowSyntaxSubsystem = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
                    if (!WinterFlowVariableVersionControl2 || WinterFlowSyntaxSubsystem == obj2) {
                        WinterFlowSyntaxSubsystem = WinterFlowDecoratorUI.WinterFlowSerializerStructure(winterFlowInvokerOrchestration);
                        winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem);
                    }
                    WinterFlowThreadPoolGateway winterFlowThreadPoolGateway3 = (WinterFlowThreadPoolGateway) WinterFlowSyntaxSubsystem;
                    if (winterFlowPackageConsumer.WinterFlowSyntax() == winterFlowResolverSubsystem2.getValue() || winterFlowPackageConsumer.WinterFlowSyntax() != winterFlowTransactionRequest2) {
                        if (winterFlowResolverSubsystem2.getValue() != winterFlowTransactionRequest2) {
                            WinterFlowRefactoringRequest winterFlowRefactoringRequest5 = ((WinterFlowInvokerOrchestration) winterFlowThreadPoolGateway3.getValue()).WinterFlowRouterStructure;
                            WinterFlowRefactoringRequest winterFlowRefactoringRequest6 = winterFlowInvokerOrchestration.WinterFlowRouterStructure;
                            WinterFlowWorkerDeserialization winterFlowWorkerDeserialization2 = winterFlowRefactoringRequest6.WinterFlowRouterStructure;
                            if (winterFlowWorkerDeserialization2 == null) {
                                winterFlowWorkerDeserialization2 = winterFlowRefactoringRequest5.WinterFlowRouterStructure;
                            }
                            boolean z6 = winterFlowRefactoringRequest6.WinterFlowHookDataSource || winterFlowRefactoringRequest5.WinterFlowHookDataSource;
                            Map map3 = winterFlowRefactoringRequest5.WinterFlowCacheManagerAgent;
                            Map map4 = winterFlowRefactoringRequest6.WinterFlowCacheManagerAgent;
                            map3.getClass();
                            map4.getClass();
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap(map3);
                            linkedHashMap2.putAll(map4);
                            winterFlowThreadPoolGateway3.setValue(new WinterFlowInvokerOrchestration(new WinterFlowRefactoringRequest(winterFlowWorkerDeserialization2, (WinterFlowConfigurationException) null, z6, linkedHashMap2)));
                        }
                    } else if (winterFlowHandlerInvoker2.WinterFlowUnitTestResponse()) {
                        winterFlowThreadPoolGateway3.setValue(winterFlowInvokerOrchestration);
                    } else {
                        winterFlowThreadPoolGateway3.setValue(WinterFlowInvokerOrchestration.WinterFlowHookDataSource);
                    }
                    winterFlowInvokerOrchestration2 = (WinterFlowInvokerOrchestration) winterFlowThreadPoolGateway3.getValue();
                    Object WinterFlowBackendCacheManager = WinterFlowDecoratorUI.WinterFlowBackendCacheManager(winterFlowEventEvent, winterFlowResolverLibrary);
                    Object WinterFlowVariableVersionControl6 = winterFlowEventEvent.WinterFlowVariableVersionControl(winterFlowPackageConsumer.WinterFlowSyntax(), winterFlowResolverSubsystem2.getValue());
                    WinterFlowVariableVersionControl3 = winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowHandlerInvoker2) | winterFlowResolverLibrary.WinterFlowVariableVersionControl(WinterFlowBackendCacheManager);
                    WinterFlowSyntaxSubsystem2 = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
                    WinterFlowListenerSyntax winterFlowListenerSyntax2 = null;
                    if (!WinterFlowVariableVersionControl3 || WinterFlowSyntaxSubsystem2 == obj2) {
                        WinterFlowSyntaxSubsystem2 = new WinterFlowMapperJava(winterFlowHandlerInvoker2, WinterFlowBackendCacheManager, null == true ? 1 : 0, 1);
                        winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem2);
                    }
                    WinterFlowEventEvent winterFlowEventEvent2 = (WinterFlowEventEvent) WinterFlowSyntaxSubsystem2;
                    WinterFlowSyntaxSubsystem3 = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
                    if (WinterFlowSyntaxSubsystem3 == obj2) {
                        WinterFlowSyntaxSubsystem3 = WinterFlowDecoratorUI.WinterFlowSerializerStructure(WinterFlowVariableVersionControl6);
                        winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem3);
                    }
                    winterFlowThreadPoolGateway = (WinterFlowThreadPoolGateway) WinterFlowSyntaxSubsystem3;
                    WinterFlowUnitTestResponse2 = winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowEventEvent2);
                    WinterFlowSyntaxSubsystem4 = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
                    if (!WinterFlowUnitTestResponse2 || WinterFlowSyntaxSubsystem4 == obj2) {
                        WinterFlowSyntaxSubsystem4 = new WinterFlowBackendLayer(winterFlowEventEvent2, winterFlowThreadPoolGateway, null == true ? 1 : 0, 0);
                        winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem4);
                    }
                    WinterFlowSoftwareException.WinterFlowArrayNetwork((WinterFlowEventEvent) WinterFlowSyntaxSubsystem4, winterFlowResolverLibrary, WinterFlowAlgorithmSession.WinterFlowRouterStructure);
                    WinterFlowSyntax2 = winterFlowPackageConsumer.WinterFlowSyntax();
                    winterFlowTransactionRequest = WinterFlowTransactionRequest.WinterFlowUnitTestResponse;
                    if (WinterFlowSyntax2 != winterFlowTransactionRequest && winterFlowResolverSubsystem2.getValue() == winterFlowTransactionRequest && ((Boolean) winterFlowThreadPoolGateway.getValue()).booleanValue()) {
                        winterFlowResolverLibrary.WinterFlowCompilerDataSource(-229368781);
                        z3 = false;
                        winterFlowResolverLibrary.WinterFlowBandwidthObject(false);
                        winterFlowEventTool2 = winterFlowEventTool;
                    } else {
                        winterFlowResolverLibrary.WinterFlowCompilerDataSource(-230699766);
                        z = i3 != 4;
                        WinterFlowSyntaxSubsystem5 = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
                        if (!z || WinterFlowSyntaxSubsystem5 == obj2) {
                            WinterFlowSyntaxSubsystem5 = new WinterFlowPackageEntity();
                            winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem5);
                        }
                        WinterFlowPackageEntity winterFlowPackageEntity = (WinterFlowPackageEntity) WinterFlowSyntaxSubsystem5;
                        WinterFlowSyntaxSubsystem6 = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
                        if (WinterFlowSyntaxSubsystem6 == obj2) {
                            WinterFlowSyntaxSubsystem6 = WinterFlowConfigurationRequest.WinterFlowThreadListener;
                            winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem6);
                        }
                        WinterFlowObjectUI winterFlowObjectUI = (WinterFlowObjectUI) WinterFlowSyntaxSubsystem6;
                        winterFlowResolverLibrary.WinterFlowCompilerDataSource(-167964673);
                        winterFlowResolverLibrary.WinterFlowBandwidthObject(false);
                        winterFlowResolverLibrary.WinterFlowCompilerDataSource(-167961890);
                        winterFlowResolverLibrary.WinterFlowBandwidthObject(false);
                        winterFlowRefactoringRequest = winterFlowProxyLayer2.WinterFlowRouterStructure;
                        winterFlowRefactoringRequest2 = winterFlowInvokerOrchestration2.WinterFlowRouterStructure;
                        winterFlowResolverLibrary.WinterFlowCompilerDataSource(-911382324);
                        winterFlowResolverLibrary.WinterFlowBandwidthObject(false);
                        winterFlowResolverLibrary.WinterFlowCompilerDataSource(-911179709);
                        winterFlowResolverLibrary.WinterFlowBandwidthObject(false);
                        winterFlowResolverLibrary.WinterFlowCompilerDataSource(-910935677);
                        winterFlowResolverLibrary.WinterFlowBandwidthObject(false);
                        float[] fArr = WinterFlowIDEStructure.WinterFlowRouterStructure;
                        winterFlowResolverLibrary.WinterFlowCompilerDataSource(-910130296);
                        winterFlowResolverLibrary.WinterFlowBandwidthObject(false);
                        WinterFlowCacheManagerVersionControl winterFlowCacheManagerVersionControl2 = WinterFlowEncryptionSubsystem.WinterFlowRouterAdapter;
                        if (winterFlowRefactoringRequest.WinterFlowRouterStructure == null || winterFlowRefactoringRequest2.WinterFlowRouterStructure != null) {
                            obj = obj2;
                            z2 = false;
                            winterFlowResolverLibrary.WinterFlowCompilerDataSource(-703709976);
                            winterFlowResolverLibrary.WinterFlowBandwidthObject(false);
                            winterFlowListenerSyntax = null;
                        } else {
                            winterFlowResolverLibrary.WinterFlowCompilerDataSource(-703879421);
                            Object WinterFlowSyntaxSubsystem14 = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
                            if (WinterFlowSyntaxSubsystem14 == obj2) {
                                WinterFlowSyntaxSubsystem14 = "Built-in alpha";
                                winterFlowResolverLibrary.WinterFlowArrayFramework("Built-in alpha");
                            }
                            String str = (String) WinterFlowSyntaxSubsystem14;
                            obj = obj2;
                            winterFlowListenerSyntax = WinterFlowSoftwareException.WinterFlowEventEmitterController(winterFlowHandlerInvoker2, winterFlowCacheManagerVersionControl2, str, winterFlowResolverLibrary, 384, 0);
                            z2 = false;
                            winterFlowResolverLibrary.WinterFlowBandwidthObject(false);
                        }
                        winterFlowResolverLibrary.WinterFlowCompilerDataSource(-703472888);
                        winterFlowResolverLibrary.WinterFlowBandwidthObject(z2);
                        winterFlowResolverLibrary.WinterFlowCompilerDataSource(-703222904);
                        winterFlowResolverLibrary.WinterFlowBandwidthObject(z2);
                        WinterFlowUnitTestResponse3 = winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowListenerSyntax) | winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowProxyLayer2) | winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowInvokerOrchestration2) | winterFlowResolverLibrary.WinterFlowUnitTestResponse(null) | winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowHandlerInvoker2) | winterFlowResolverLibrary.WinterFlowUnitTestResponse(null);
                        WinterFlowSyntaxSubsystem7 = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
                        if (!WinterFlowUnitTestResponse3 || WinterFlowSyntaxSubsystem7 == obj) {
                            WinterFlowSyntaxSubsystem7 = new WinterFlowCloudSystem(winterFlowListenerSyntax, winterFlowListenerSyntax2, winterFlowHandlerInvoker2, winterFlowProxyLayer2, winterFlowInvokerOrchestration2, null == true ? 1 : 0);
                            winterFlowProxyLayer3 = winterFlowProxyLayer2;
                            winterFlowInvokerOrchestration3 = winterFlowInvokerOrchestration2;
                            winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem7);
                        } else {
                            winterFlowProxyLayer3 = winterFlowProxyLayer2;
                            winterFlowInvokerOrchestration3 = winterFlowInvokerOrchestration2;
                        }
                        WinterFlowCloudSystem winterFlowCloudSystem = (WinterFlowCloudSystem) WinterFlowSyntaxSubsystem7;
                        WinterFlowTransactionManagerStrategy2 = winterFlowResolverLibrary.WinterFlowTransactionManagerStrategy(true) | winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowObjectUI);
                        WinterFlowSyntaxSubsystem8 = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
                        if (!WinterFlowTransactionManagerStrategy2 || WinterFlowSyntaxSubsystem8 == obj) {
                            WinterFlowSyntaxSubsystem8 = new WinterFlowDatabaseSchemaNetwork(true, winterFlowObjectUI);
                            winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem8);
                        }
                        WinterFlowMapperManager WinterFlowCacheManagerAgent2 = WinterFlowUnitTestLibrary.WinterFlowConsumerUserManager((WinterFlowObjectSession) WinterFlowSyntaxSubsystem8).WinterFlowCacheManagerAgent(new WinterFlowDebugGateway(winterFlowHandlerInvoker2, winterFlowProxyLayer3, winterFlowInvokerOrchestration3, winterFlowObjectUI, winterFlowCloudSystem));
                        WinterFlowValidatorComponent winterFlowValidatorComponent = WinterFlowValidatorComponent.WinterFlowRouterStructure;
                        WinterFlowMapperManager WinterFlowCacheManagerAgent3 = WinterFlowCacheManagerAgent2.WinterFlowCacheManagerAgent(winterFlowValidatorComponent);
                        winterFlowResolverLibrary.WinterFlowCompilerDataSource(-7404393);
                        winterFlowResolverLibrary.WinterFlowBandwidthObject(false);
                        WinterFlowMapperManager WinterFlowCacheManagerAgent4 = winterFlowMapperManager.WinterFlowCacheManagerAgent(WinterFlowCacheManagerAgent3.WinterFlowCacheManagerAgent(winterFlowValidatorComponent));
                        WinterFlowSyntaxSubsystem9 = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
                        if (WinterFlowSyntaxSubsystem9 == obj) {
                            WinterFlowSyntaxSubsystem9 = new WinterFlowResolverFunction(winterFlowPackageEntity);
                            winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem9);
                        }
                        WinterFlowResolverFunction winterFlowResolverFunction = (WinterFlowResolverFunction) WinterFlowSyntaxSubsystem9;
                        int hashCode = Long.hashCode(winterFlowResolverLibrary.WinterFlowConfiguration);
                        WinterFlowConfigurationProcess WinterFlowTransactionAgent = winterFlowResolverLibrary.WinterFlowTransactionAgent();
                        WinterFlowMapperManager WinterFlowUserManagerUserManager = WinterFlowSoftwareException.WinterFlowUserManagerUserManager(winterFlowResolverLibrary, WinterFlowCacheManagerAgent4);
                        WinterFlowBandwidthAgent.WinterFlowCacheManagerAgent.getClass();
                        WinterFlowObjectUI winterFlowObjectUI2 = WinterFlowEventEmitterDeserialization.WinterFlowHookDataSource;
                        winterFlowResolverLibrary.WinterFlowModuleAgent();
                        if (winterFlowResolverLibrary.WinterFlowProxyStructure) {
                            winterFlowResolverLibrary.WinterFlowParserPipeline();
                        } else {
                            winterFlowResolverLibrary.WinterFlowResponseEngine(winterFlowObjectUI2);
                        }
                        WinterFlowProtocolNetwork.WinterFlowSyntax(WinterFlowEventEmitterDeserialization.WinterFlowVariableVersionControl, winterFlowResolverLibrary, winterFlowResolverFunction);
                        WinterFlowProtocolNetwork.WinterFlowSyntax(WinterFlowEventEmitterDeserialization.WinterFlowArrayNetwork, winterFlowResolverLibrary, WinterFlowTransactionAgent);
                        Object valueOf = Integer.valueOf(hashCode);
                        WinterFlowEventEvent winterFlowEventEvent3 = WinterFlowEventEmitterDeserialization.WinterFlowTransactionManagerStrategy;
                        if (winterFlowResolverLibrary.WinterFlowProxyStructure) {
                            winterFlowResolverLibrary.WinterFlowHookDataSource(winterFlowEventEvent3, valueOf);
                        }
                        WinterFlowProtocolNetwork.WinterFlowRouterRouter(winterFlowResolverLibrary, WinterFlowEventEmitterDeserialization.WinterFlowUnitTestResponse);
                        WinterFlowProtocolNetwork.WinterFlowSyntax(WinterFlowEventEmitterDeserialization.WinterFlowCacheManagerAgent, winterFlowResolverLibrary, WinterFlowUserManagerUserManager);
                        winterFlowEventTool2 = winterFlowEventTool;
                        winterFlowEventTool2.WinterFlowArrayNetwork(winterFlowPackageEntity, winterFlowResolverLibrary, 48);
                        winterFlowResolverLibrary.WinterFlowBandwidthObject(true);
                        z3 = false;
                        winterFlowResolverLibrary.WinterFlowBandwidthObject(false);
                    }
                    winterFlowResolverLibrary.WinterFlowBandwidthObject(z3);
                }
                winterFlowPackageConsumer = winterFlowPackageConsumer4;
                winterFlowProxyLayer2 = (WinterFlowProxyLayer) winterFlowThreadPoolGateway2.getValue();
                WinterFlowVariableVersionControl2 = winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowHandlerInvoker2);
                WinterFlowSyntaxSubsystem = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
                if (!WinterFlowVariableVersionControl2) {
                }
                WinterFlowSyntaxSubsystem = WinterFlowDecoratorUI.WinterFlowSerializerStructure(winterFlowInvokerOrchestration);
                winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem);
                WinterFlowThreadPoolGateway winterFlowThreadPoolGateway32 = (WinterFlowThreadPoolGateway) WinterFlowSyntaxSubsystem;
                if (winterFlowPackageConsumer.WinterFlowSyntax() == winterFlowResolverSubsystem2.getValue()) {
                }
                if (winterFlowResolverSubsystem2.getValue() != winterFlowTransactionRequest2) {
                }
                winterFlowInvokerOrchestration2 = (WinterFlowInvokerOrchestration) winterFlowThreadPoolGateway32.getValue();
                Object WinterFlowBackendCacheManager2 = WinterFlowDecoratorUI.WinterFlowBackendCacheManager(winterFlowEventEvent, winterFlowResolverLibrary);
                Object WinterFlowVariableVersionControl62 = winterFlowEventEvent.WinterFlowVariableVersionControl(winterFlowPackageConsumer.WinterFlowSyntax(), winterFlowResolverSubsystem2.getValue());
                WinterFlowVariableVersionControl3 = winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowHandlerInvoker2) | winterFlowResolverLibrary.WinterFlowVariableVersionControl(WinterFlowBackendCacheManager2);
                WinterFlowSyntaxSubsystem2 = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
                WinterFlowListenerSyntax winterFlowListenerSyntax22 = null;
                if (!WinterFlowVariableVersionControl3) {
                }
                WinterFlowSyntaxSubsystem2 = new WinterFlowMapperJava(winterFlowHandlerInvoker2, WinterFlowBackendCacheManager2, null == true ? 1 : 0, 1);
                winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem2);
                WinterFlowEventEvent winterFlowEventEvent22 = (WinterFlowEventEvent) WinterFlowSyntaxSubsystem2;
                WinterFlowSyntaxSubsystem3 = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
                if (WinterFlowSyntaxSubsystem3 == obj2) {
                }
                winterFlowThreadPoolGateway = (WinterFlowThreadPoolGateway) WinterFlowSyntaxSubsystem3;
                WinterFlowUnitTestResponse2 = winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowEventEvent22);
                WinterFlowSyntaxSubsystem4 = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
                if (!WinterFlowUnitTestResponse2) {
                }
                WinterFlowSyntaxSubsystem4 = new WinterFlowBackendLayer(winterFlowEventEvent22, winterFlowThreadPoolGateway, null == true ? 1 : 0, 0);
                winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem4);
                WinterFlowSoftwareException.WinterFlowArrayNetwork((WinterFlowEventEvent) WinterFlowSyntaxSubsystem4, winterFlowResolverLibrary, WinterFlowAlgorithmSession.WinterFlowRouterStructure);
                WinterFlowSyntax2 = winterFlowPackageConsumer.WinterFlowSyntax();
                winterFlowTransactionRequest = WinterFlowTransactionRequest.WinterFlowUnitTestResponse;
                if (WinterFlowSyntax2 != winterFlowTransactionRequest) {
                }
                winterFlowResolverLibrary.WinterFlowCompilerDataSource(-230699766);
                if (i3 != 4) {
                }
                WinterFlowSyntaxSubsystem5 = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
                if (!z) {
                }
                WinterFlowSyntaxSubsystem5 = new WinterFlowPackageEntity();
                winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem5);
                WinterFlowPackageEntity winterFlowPackageEntity2 = (WinterFlowPackageEntity) WinterFlowSyntaxSubsystem5;
                WinterFlowSyntaxSubsystem6 = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
                if (WinterFlowSyntaxSubsystem6 == obj2) {
                }
                WinterFlowObjectUI winterFlowObjectUI3 = (WinterFlowObjectUI) WinterFlowSyntaxSubsystem6;
                winterFlowResolverLibrary.WinterFlowCompilerDataSource(-167964673);
                winterFlowResolverLibrary.WinterFlowBandwidthObject(false);
                winterFlowResolverLibrary.WinterFlowCompilerDataSource(-167961890);
                winterFlowResolverLibrary.WinterFlowBandwidthObject(false);
                winterFlowRefactoringRequest = winterFlowProxyLayer2.WinterFlowRouterStructure;
                winterFlowRefactoringRequest2 = winterFlowInvokerOrchestration2.WinterFlowRouterStructure;
                winterFlowResolverLibrary.WinterFlowCompilerDataSource(-911382324);
                winterFlowResolverLibrary.WinterFlowBandwidthObject(false);
                winterFlowResolverLibrary.WinterFlowCompilerDataSource(-911179709);
                winterFlowResolverLibrary.WinterFlowBandwidthObject(false);
                winterFlowResolverLibrary.WinterFlowCompilerDataSource(-910935677);
                winterFlowResolverLibrary.WinterFlowBandwidthObject(false);
                float[] fArr2 = WinterFlowIDEStructure.WinterFlowRouterStructure;
                winterFlowResolverLibrary.WinterFlowCompilerDataSource(-910130296);
                winterFlowResolverLibrary.WinterFlowBandwidthObject(false);
                WinterFlowCacheManagerVersionControl winterFlowCacheManagerVersionControl22 = WinterFlowEncryptionSubsystem.WinterFlowRouterAdapter;
                if (winterFlowRefactoringRequest.WinterFlowRouterStructure == null || winterFlowRefactoringRequest2.WinterFlowRouterStructure != null) {
                }
                winterFlowResolverLibrary.WinterFlowCompilerDataSource(-703472888);
                winterFlowResolverLibrary.WinterFlowBandwidthObject(z2);
                winterFlowResolverLibrary.WinterFlowCompilerDataSource(-703222904);
                winterFlowResolverLibrary.WinterFlowBandwidthObject(z2);
                WinterFlowUnitTestResponse3 = winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowListenerSyntax) | winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowProxyLayer2) | winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowInvokerOrchestration2) | winterFlowResolverLibrary.WinterFlowUnitTestResponse(null) | winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowHandlerInvoker2) | winterFlowResolverLibrary.WinterFlowUnitTestResponse(null);
                WinterFlowSyntaxSubsystem7 = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
                if (WinterFlowUnitTestResponse3) {
                }
                WinterFlowSyntaxSubsystem7 = new WinterFlowCloudSystem(winterFlowListenerSyntax, winterFlowListenerSyntax22, winterFlowHandlerInvoker2, winterFlowProxyLayer2, winterFlowInvokerOrchestration2, null == true ? 1 : 0);
                winterFlowProxyLayer3 = winterFlowProxyLayer2;
                winterFlowInvokerOrchestration3 = winterFlowInvokerOrchestration2;
                winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem7);
                WinterFlowCloudSystem winterFlowCloudSystem2 = (WinterFlowCloudSystem) WinterFlowSyntaxSubsystem7;
                WinterFlowTransactionManagerStrategy2 = winterFlowResolverLibrary.WinterFlowTransactionManagerStrategy(true) | winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowObjectUI3);
                WinterFlowSyntaxSubsystem8 = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
                if (!WinterFlowTransactionManagerStrategy2) {
                }
                WinterFlowSyntaxSubsystem8 = new WinterFlowDatabaseSchemaNetwork(true, winterFlowObjectUI3);
                winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem8);
                WinterFlowMapperManager WinterFlowCacheManagerAgent22 = WinterFlowUnitTestLibrary.WinterFlowConsumerUserManager((WinterFlowObjectSession) WinterFlowSyntaxSubsystem8).WinterFlowCacheManagerAgent(new WinterFlowDebugGateway(winterFlowHandlerInvoker2, winterFlowProxyLayer3, winterFlowInvokerOrchestration3, winterFlowObjectUI3, winterFlowCloudSystem2));
                WinterFlowValidatorComponent winterFlowValidatorComponent2 = WinterFlowValidatorComponent.WinterFlowRouterStructure;
                WinterFlowMapperManager WinterFlowCacheManagerAgent32 = WinterFlowCacheManagerAgent22.WinterFlowCacheManagerAgent(winterFlowValidatorComponent2);
                winterFlowResolverLibrary.WinterFlowCompilerDataSource(-7404393);
                winterFlowResolverLibrary.WinterFlowBandwidthObject(false);
                WinterFlowMapperManager WinterFlowCacheManagerAgent42 = winterFlowMapperManager.WinterFlowCacheManagerAgent(WinterFlowCacheManagerAgent32.WinterFlowCacheManagerAgent(winterFlowValidatorComponent2));
                WinterFlowSyntaxSubsystem9 = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
                if (WinterFlowSyntaxSubsystem9 == obj) {
                }
                WinterFlowResolverFunction winterFlowResolverFunction2 = (WinterFlowResolverFunction) WinterFlowSyntaxSubsystem9;
                int hashCode2 = Long.hashCode(winterFlowResolverLibrary.WinterFlowConfiguration);
                WinterFlowConfigurationProcess WinterFlowTransactionAgent2 = winterFlowResolverLibrary.WinterFlowTransactionAgent();
                WinterFlowMapperManager WinterFlowUserManagerUserManager2 = WinterFlowSoftwareException.WinterFlowUserManagerUserManager(winterFlowResolverLibrary, WinterFlowCacheManagerAgent42);
                WinterFlowBandwidthAgent.WinterFlowCacheManagerAgent.getClass();
                WinterFlowObjectUI winterFlowObjectUI22 = WinterFlowEventEmitterDeserialization.WinterFlowHookDataSource;
                winterFlowResolverLibrary.WinterFlowModuleAgent();
                if (winterFlowResolverLibrary.WinterFlowProxyStructure) {
                }
                WinterFlowProtocolNetwork.WinterFlowSyntax(WinterFlowEventEmitterDeserialization.WinterFlowVariableVersionControl, winterFlowResolverLibrary, winterFlowResolverFunction2);
                WinterFlowProtocolNetwork.WinterFlowSyntax(WinterFlowEventEmitterDeserialization.WinterFlowArrayNetwork, winterFlowResolverLibrary, WinterFlowTransactionAgent2);
                Object valueOf2 = Integer.valueOf(hashCode2);
                WinterFlowEventEvent winterFlowEventEvent32 = WinterFlowEventEmitterDeserialization.WinterFlowTransactionManagerStrategy;
                if (winterFlowResolverLibrary.WinterFlowProxyStructure) {
                }
                WinterFlowProtocolNetwork.WinterFlowRouterRouter(winterFlowResolverLibrary, WinterFlowEventEmitterDeserialization.WinterFlowUnitTestResponse);
                WinterFlowProtocolNetwork.WinterFlowSyntax(WinterFlowEventEmitterDeserialization.WinterFlowCacheManagerAgent, winterFlowResolverLibrary, WinterFlowUserManagerUserManager2);
                winterFlowEventTool2 = winterFlowEventTool;
                winterFlowEventTool2.WinterFlowArrayNetwork(winterFlowPackageEntity2, winterFlowResolverLibrary, 48);
                winterFlowResolverLibrary.WinterFlowBandwidthObject(true);
                z3 = false;
                winterFlowResolverLibrary.WinterFlowBandwidthObject(false);
                winterFlowResolverLibrary.WinterFlowBandwidthObject(z3);
            } else {
                winterFlowResolverLibrary.WinterFlowCompilerDataSource(-229362829);
                winterFlowResolverLibrary.WinterFlowBandwidthObject(false);
                winterFlowEventTool2 = winterFlowEventTool;
            }
        } else {
            winterFlowEventTool2 = winterFlowEventTool;
            winterFlowResolverLibrary.WinterFlowQueueService();
        }
        WinterFlowStackEngine WinterFlowConcurrencyThread = winterFlowResolverLibrary.WinterFlowConcurrencyThread();
        if (WinterFlowConcurrencyThread != null) {
            WinterFlowConcurrencyThread.WinterFlowArrayNetwork = new WinterFlowThread(winterFlowHandlerInvoker, winterFlowObjectSession, winterFlowMapperManager, winterFlowProxyLayer, winterFlowInvokerOrchestration, winterFlowEventEvent, winterFlowEventTool2, i);
        }
    }

    public static final void WinterFlowSerializerStructure(WinterFlowRequestListener winterFlowRequestListener) {
        int i = winterFlowRequestListener.WinterFlowRouterRouter;
        int[] iArr = winterFlowRequestListener.WinterFlowTransactionManagerStrategy;
        Object[] objArr = winterFlowRequestListener.WinterFlowUnitTestResponse;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != WinterFlowUnitTestResponse) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        winterFlowRequestListener.WinterFlowVariableVersionControl = false;
        winterFlowRequestListener.WinterFlowRouterRouter = i2;
    }

    public static byte[] WinterFlowServerProtocol(ArrayDeque arrayDeque, int i) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i) {
            return bArr;
        }
        int length = i - bArr.length;
        byte[] copyOf = Arrays.copyOf(bArr, i);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int min = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, copyOf, i - length, min);
            length -= min;
        }
        return copyOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static WinterFlowTransactionManagerLayer WinterFlowServiceUtility(WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer2, WinterFlowEventEvent winterFlowEventEvent) {
        winterFlowEventEvent.getClass();
        if (winterFlowEventEvent instanceof WinterFlowVersionLayer) {
            return ((WinterFlowVersionLayer) winterFlowEventEvent).WinterFlowServerProtocol(winterFlowTransactionManagerLayer2, winterFlowTransactionManagerLayer);
        }
        WinterFlowEncryptionMicroservice context = winterFlowTransactionManagerLayer2.getContext();
        return context == WinterFlowEventEmitterPackage.WinterFlowVariableVersionControl ? new WinterFlowManagerVersion(winterFlowTransactionManagerLayer2, winterFlowTransactionManagerLayer, winterFlowEventEvent) : new WinterFlowDatabaseSchemaMapper(winterFlowTransactionManagerLayer2, context, winterFlowEventEvent, winterFlowTransactionManagerLayer);
    }

    public static final boolean WinterFlowSingletonPlatform(long j, long j2) {
        return j == j2;
    }

    public static final WinterFlowUIMicroservice WinterFlowSoftwareEngine(WinterFlowLibraryDeployment winterFlowLibraryDeployment) {
        if (!((WinterFlowUserManagerController) winterFlowLibraryDeployment).WinterFlowVariableVersionControl.WinterFlowSingletonPlatform) {
            WinterFlowViewUtility.WinterFlowHookDataSource("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        WinterFlowUIMicroservice WinterFlowUserManagerUserManager = WinterFlowUserManagerUserManager(winterFlowLibraryDeployment, 2);
        if (!WinterFlowUserManagerUserManager.WinterFlowInheritanceJava().WinterFlowSingletonPlatform) {
            WinterFlowViewUtility.WinterFlowHookDataSource("LayoutCoordinates is not attached.");
        }
        return WinterFlowUserManagerUserManager;
    }

    public static final WinterFlowDatabaseSchemaLayer WinterFlowSoftwareProtocol(WinterFlowResolverLibrary winterFlowResolverLibrary) {
        WinterFlowResolverLibrary winterFlowResolverLibrary2;
        winterFlowResolverLibrary.WinterFlowConfiguration(206, WinterFlowSessionManagerEntity.WinterFlowVariableVersionControl);
        if (winterFlowResolverLibrary.WinterFlowProxyStructure) {
            WinterFlowServiceProviderListener.WinterFlowConsumerUserManager(winterFlowResolverLibrary.WinterFlowUserManagerUserManager);
        }
        Object WinterFlowCompilerVariable = winterFlowResolverLibrary.WinterFlowCompilerVariable();
        WinterFlowFrontendHandler winterFlowFrontendHandler = WinterFlowCompilerVariable instanceof WinterFlowFrontendHandler ? (WinterFlowFrontendHandler) WinterFlowCompilerVariable : null;
        if (winterFlowFrontendHandler == null) {
            winterFlowResolverLibrary2 = winterFlowResolverLibrary;
            winterFlowFrontendHandler = new WinterFlowLibraryNetwork(new WinterFlowSoftwareView(new WinterFlowDatabaseSchemaLayer(winterFlowResolverLibrary2, winterFlowResolverLibrary.WinterFlowConfiguration, winterFlowResolverLibrary.WinterFlowConcurrencyThread, winterFlowResolverLibrary.WinterFlowCompilerVariable, winterFlowResolverLibrary.WinterFlowRouterRouter.WinterFlowResolverController)), -1);
            winterFlowResolverLibrary2.WinterFlowStrategyHook(winterFlowFrontendHandler);
        } else {
            winterFlowResolverLibrary2 = winterFlowResolverLibrary;
        }
        WinterFlowDatabaseSchemaLayer winterFlowDatabaseSchemaLayer = ((WinterFlowSoftwareView) winterFlowFrontendHandler.WinterFlowRouterStructure).WinterFlowVariableVersionControl;
        winterFlowDatabaseSchemaLayer.WinterFlowTransactionManagerStrategy.setValue(winterFlowResolverLibrary2.WinterFlowTransactionAgent());
        winterFlowResolverLibrary2.WinterFlowBandwidthObject(false);
        return winterFlowDatabaseSchemaLayer;
    }

    public static final boolean WinterFlowStrategyTool(KeyEvent keyEvent) {
        long WinterFlowCacheManagerAgent2 = WinterFlowServerManager.WinterFlowCacheManagerAgent(keyEvent.getKeyCode());
        return WinterFlowUserManagerDatabaseSchema.WinterFlowRouterStructure(WinterFlowCacheManagerAgent2, WinterFlowUserManagerDatabaseSchema.WinterFlowRouterRouter) || WinterFlowUserManagerDatabaseSchema.WinterFlowRouterStructure(WinterFlowCacheManagerAgent2, WinterFlowUserManagerDatabaseSchema.WinterFlowTransactionAgent) || WinterFlowUserManagerDatabaseSchema.WinterFlowRouterStructure(WinterFlowCacheManagerAgent2, WinterFlowUserManagerDatabaseSchema.WinterFlowBandwidthObject) || WinterFlowUserManagerDatabaseSchema.WinterFlowRouterStructure(WinterFlowCacheManagerAgent2, WinterFlowUserManagerDatabaseSchema.WinterFlowResponseEngine);
    }

    public static final WinterFlowVersionParser WinterFlowSyntax(WinterFlowAlgorithmHandler winterFlowAlgorithmHandler, boolean z) {
        WinterFlowAlgorithmHandler WinterFlowBatchUI = WinterFlowBatchUI(winterFlowAlgorithmHandler);
        float WinterFlowCacheManagerListener = (int) (WinterFlowBatchUI.WinterFlowCacheManagerListener() >> 32);
        float WinterFlowCacheManagerListener2 = (int) (WinterFlowBatchUI.WinterFlowCacheManagerListener() & 4294967295L);
        WinterFlowVersionParser WinterFlowVariableBandwidth = WinterFlowBatchUI.WinterFlowVariableBandwidth(winterFlowAlgorithmHandler, z);
        float f = WinterFlowVariableBandwidth.WinterFlowRouterStructure;
        if (z) {
            if (f < 0.0f) {
                f = 0.0f;
            }
            if (f > WinterFlowCacheManagerListener) {
                f = WinterFlowCacheManagerListener;
            }
        }
        float f2 = WinterFlowVariableBandwidth.WinterFlowHookDataSource;
        if (z) {
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            if (f2 > WinterFlowCacheManagerListener2) {
                f2 = WinterFlowCacheManagerListener2;
            }
        }
        float f3 = WinterFlowVariableBandwidth.WinterFlowCacheManagerAgent;
        if (z) {
            if (f3 < 0.0f) {
                f3 = 0.0f;
            }
            if (f3 <= WinterFlowCacheManagerListener) {
                WinterFlowCacheManagerListener = f3;
            }
            f3 = WinterFlowCacheManagerListener;
        }
        float f4 = WinterFlowVariableBandwidth.WinterFlowArrayNetwork;
        if (z) {
            float f5 = f4 >= 0.0f ? f4 : 0.0f;
            if (f5 <= WinterFlowCacheManagerListener2) {
                WinterFlowCacheManagerListener2 = f5;
            }
            f4 = WinterFlowCacheManagerListener2;
        }
        if (f == f3 || f2 == f4) {
            return WinterFlowVersionParser.WinterFlowVariableVersionControl;
        }
        long WinterFlowTransactionManagerStrategy2 = WinterFlowBatchUI.WinterFlowTransactionManagerStrategy((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
        long WinterFlowTransactionManagerStrategy3 = WinterFlowBatchUI.WinterFlowTransactionManagerStrategy((Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
        long WinterFlowTransactionManagerStrategy4 = WinterFlowBatchUI.WinterFlowTransactionManagerStrategy((Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L));
        long WinterFlowTransactionManagerStrategy5 = WinterFlowBatchUI.WinterFlowTransactionManagerStrategy((Float.floatToRawIntBits(f4) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
        float intBitsToFloat = Float.intBitsToFloat((int) (WinterFlowTransactionManagerStrategy2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (WinterFlowTransactionManagerStrategy3 >> 32));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (WinterFlowTransactionManagerStrategy5 >> 32));
        float intBitsToFloat4 = Float.intBitsToFloat((int) (WinterFlowTransactionManagerStrategy4 >> 32));
        float min = Math.min(intBitsToFloat, Math.min(intBitsToFloat2, Math.min(intBitsToFloat3, intBitsToFloat4)));
        float max = Math.max(intBitsToFloat, Math.max(intBitsToFloat2, Math.max(intBitsToFloat3, intBitsToFloat4)));
        float intBitsToFloat5 = Float.intBitsToFloat((int) (WinterFlowTransactionManagerStrategy2 & 4294967295L));
        float intBitsToFloat6 = Float.intBitsToFloat((int) (WinterFlowTransactionManagerStrategy3 & 4294967295L));
        float intBitsToFloat7 = Float.intBitsToFloat((int) (WinterFlowTransactionManagerStrategy5 & 4294967295L));
        float intBitsToFloat8 = Float.intBitsToFloat((int) (WinterFlowTransactionManagerStrategy4 & 4294967295L));
        return new WinterFlowVersionParser(min, Math.min(intBitsToFloat5, Math.min(intBitsToFloat6, Math.min(intBitsToFloat7, intBitsToFloat8))), max, Math.max(intBitsToFloat5, Math.max(intBitsToFloat6, Math.max(intBitsToFloat7, intBitsToFloat8))));
    }

    public static final WinterFlowSchedulerStructure WinterFlowSyntaxSubsystem(WinterFlowLibraryDeployment winterFlowLibraryDeployment) {
        WinterFlowUIMicroservice winterFlowUIMicroservice = ((WinterFlowUserManagerController) winterFlowLibraryDeployment).WinterFlowVariableVersionControl.WinterFlowServerProtocol;
        if (winterFlowUIMicroservice != null) {
            return winterFlowUIMicroservice.WinterFlowVariableBandwidth;
        }
        throw WinterFlowResolverBackend.WinterFlowUnitTestResponse("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    public static final WinterFlowListenerService WinterFlowTestingNode(WinterFlowLibraryDeployment winterFlowLibraryDeployment) {
        WinterFlowListenerService winterFlowListenerService = WinterFlowSyntaxSubsystem(winterFlowLibraryDeployment).WinterFlowSingletonPlatform;
        if (winterFlowListenerService != null) {
            return winterFlowListenerService;
        }
        throw WinterFlowResolverBackend.WinterFlowUnitTestResponse("This node does not have an owner.");
    }

    public static final Object WinterFlowThreadListener(WinterFlowRequestListener winterFlowRequestListener, int i) {
        Object obj;
        winterFlowRequestListener.getClass();
        int WinterFlowSyntax2 = WinterFlowHandlerWebsocket.WinterFlowSyntax(winterFlowRequestListener.WinterFlowTransactionManagerStrategy, winterFlowRequestListener.WinterFlowRouterRouter, i);
        if (WinterFlowSyntax2 < 0 || (obj = winterFlowRequestListener.WinterFlowUnitTestResponse[WinterFlowSyntax2]) == WinterFlowUnitTestResponse) {
            return null;
        }
        return obj;
    }

    public static final void WinterFlowTransactionAgent(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                WinterFlowTransactionManagerStrategy(th, th2);
            }
        }
    }

    public static void WinterFlowTransactionManagerStrategy(Throwable th, Throwable th2) {
        th.getClass();
        th2.getClass();
        if (th != th2) {
            Integer num = WinterFlowTransactionFramework.WinterFlowRouterStructure;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = WinterFlowRequestBandwidth.WinterFlowRouterStructure;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static final void WinterFlowUIMiddleware(TextPaint textPaint, float f) {
        if (Float.isNaN(f)) {
            return;
        }
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        textPaint.setAlpha(Math.round(f * 255.0f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final WinterFlowNetwork WinterFlowUnitTestResponse(WinterFlowUserManagerController winterFlowUserManagerController) {
        if ((winterFlowUserManagerController.WinterFlowUnitTestResponse & 2) != 0) {
            if (winterFlowUserManagerController instanceof WinterFlowNetwork) {
                return (WinterFlowNetwork) winterFlowUserManagerController;
            }
            if (winterFlowUserManagerController instanceof WinterFlowTestingEntity) {
                WinterFlowUserManagerController winterFlowUserManagerController2 = ((WinterFlowTestingEntity) winterFlowUserManagerController).WinterFlowBatchUI;
                while (winterFlowUserManagerController2 != 0) {
                    if (winterFlowUserManagerController2 instanceof WinterFlowNetwork) {
                        return (WinterFlowNetwork) winterFlowUserManagerController2;
                    }
                    winterFlowUserManagerController2 = (!(winterFlowUserManagerController2 instanceof WinterFlowTestingEntity) || (winterFlowUserManagerController2.WinterFlowUnitTestResponse & 2) == 0) ? winterFlowUserManagerController2.WinterFlowResponseEngine : ((WinterFlowTestingEntity) winterFlowUserManagerController2).WinterFlowBatchUI;
                }
            }
        }
        return null;
    }

    public static final WinterFlowUIMicroservice WinterFlowUserManagerUserManager(WinterFlowLibraryDeployment winterFlowLibraryDeployment, int i) {
        WinterFlowUIMicroservice winterFlowUIMicroservice = ((WinterFlowUserManagerController) winterFlowLibraryDeployment).WinterFlowVariableVersionControl.WinterFlowServerProtocol;
        winterFlowUIMicroservice.getClass();
        if (winterFlowUIMicroservice.WinterFlowInheritanceJava() != winterFlowLibraryDeployment || !WinterFlowHookDeserialization.WinterFlowUnitTestResponse(i)) {
            return winterFlowUIMicroservice;
        }
        WinterFlowUIMicroservice winterFlowUIMicroservice2 = winterFlowUIMicroservice.WinterFlowBatchUI;
        winterFlowUIMicroservice2.getClass();
        return winterFlowUIMicroservice2;
    }

    public static Object WinterFlowValidatorHandler(WinterFlowEventEvent winterFlowEventEvent, Object obj, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        winterFlowEventEvent.getClass();
        WinterFlowEncryptionMicroservice context = winterFlowTransactionManagerLayer.getContext();
        Object winterFlowQueryServiceProvider = context == WinterFlowEventEmitterPackage.WinterFlowVariableVersionControl ? new WinterFlowQueryServiceProvider(winterFlowTransactionManagerLayer) : new WinterFlowListenerHandler(winterFlowTransactionManagerLayer, context);
        WinterFlowUnitTestLibrary.WinterFlowTransactionAgent(2, winterFlowEventEvent);
        return winterFlowEventEvent.WinterFlowVariableVersionControl(obj, winterFlowQueryServiceProvider);
    }

    public static final WinterFlowDeploymentWidget WinterFlowVariableBandwidth(WinterFlowDeploymentWidget winterFlowDeploymentWidget) {
        WinterFlowDeploymentWidget WinterFlowTransactionManagerStrategy2 = ((WinterFlowHookMechanism) ((WinterFlowSyntaxTransactionManager) WinterFlowTestingNode(winterFlowDeploymentWidget)).getFocusOwner()).WinterFlowTransactionManagerStrategy();
        if (WinterFlowTransactionManagerStrategy2 == null || !WinterFlowTransactionManagerStrategy2.WinterFlowSingletonPlatform) {
            return null;
        }
        return WinterFlowTransactionManagerStrategy2;
    }

    public static final void WinterFlowVariableVersionControl(WinterFlowFrameworkDataSource winterFlowFrameworkDataSource, WinterFlowProcessorSystem winterFlowProcessorSystem) {
        WinterFlowDecoratorBackend winterFlowDecoratorBackend = winterFlowProcessorSystem.WinterFlowArrayNetwork;
        WinterFlowDatabaseSchemaStructure winterFlowDatabaseSchemaStructure = winterFlowDecoratorBackend.WinterFlowVariableVersionControl;
        Object WinterFlowUnitTestResponse2 = winterFlowDecoratorBackend.WinterFlowVariableVersionControl.WinterFlowUnitTestResponse(WinterFlowRendererJava.WinterFlowConsumerUserManager);
        if (WinterFlowUnitTestResponse2 == null) {
            WinterFlowUnitTestResponse2 = null;
        }
        if (WinterFlowTestingCloud.WinterFlowTransactionAgent(winterFlowProcessorSystem)) {
            Object WinterFlowUnitTestResponse3 = winterFlowDatabaseSchemaStructure.WinterFlowUnitTestResponse(WinterFlowCacheWorker.WinterFlowResolverController);
            if (WinterFlowUnitTestResponse3 == null) {
                WinterFlowUnitTestResponse3 = null;
            }
            WinterFlowDecoratorStrategy winterFlowDecoratorStrategy = (WinterFlowDecoratorStrategy) WinterFlowUnitTestResponse3;
            if (winterFlowDecoratorStrategy != null) {
                winterFlowFrameworkDataSource.WinterFlowRouterStructure(new WinterFlowStrategyUserManager(null, android.R.id.accessibilityActionPageUp, winterFlowDecoratorStrategy.WinterFlowRouterStructure, null));
            }
            Object WinterFlowUnitTestResponse4 = winterFlowDatabaseSchemaStructure.WinterFlowUnitTestResponse(WinterFlowCacheWorker.WinterFlowBackendCacheManager);
            if (WinterFlowUnitTestResponse4 == null) {
                WinterFlowUnitTestResponse4 = null;
            }
            WinterFlowDecoratorStrategy winterFlowDecoratorStrategy2 = (WinterFlowDecoratorStrategy) WinterFlowUnitTestResponse4;
            if (winterFlowDecoratorStrategy2 != null) {
                winterFlowFrameworkDataSource.WinterFlowRouterStructure(new WinterFlowStrategyUserManager(null, android.R.id.accessibilityActionPageDown, winterFlowDecoratorStrategy2.WinterFlowRouterStructure, null));
            }
            Object WinterFlowUnitTestResponse5 = winterFlowDatabaseSchemaStructure.WinterFlowUnitTestResponse(WinterFlowCacheWorker.WinterFlowConsumerUserManager);
            if (WinterFlowUnitTestResponse5 == null) {
                WinterFlowUnitTestResponse5 = null;
            }
            WinterFlowDecoratorStrategy winterFlowDecoratorStrategy3 = (WinterFlowDecoratorStrategy) WinterFlowUnitTestResponse5;
            if (winterFlowDecoratorStrategy3 != null) {
                winterFlowFrameworkDataSource.WinterFlowRouterStructure(new WinterFlowStrategyUserManager(null, android.R.id.accessibilityActionPageLeft, winterFlowDecoratorStrategy3.WinterFlowRouterStructure, null));
            }
            Object WinterFlowUnitTestResponse6 = winterFlowDatabaseSchemaStructure.WinterFlowUnitTestResponse(WinterFlowCacheWorker.WinterFlowEventEmitterController);
            if (WinterFlowUnitTestResponse6 == null) {
                WinterFlowUnitTestResponse6 = null;
            }
            WinterFlowDecoratorStrategy winterFlowDecoratorStrategy4 = (WinterFlowDecoratorStrategy) WinterFlowUnitTestResponse6;
            if (winterFlowDecoratorStrategy4 != null) {
                winterFlowFrameworkDataSource.WinterFlowRouterStructure(new WinterFlowStrategyUserManager(null, android.R.id.accessibilityActionPageRight, winterFlowDecoratorStrategy4.WinterFlowRouterStructure, null));
            }
        }
    }
}
