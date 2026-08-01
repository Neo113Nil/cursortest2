package com.google.android.datatransport;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.res.Resources;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.text.Layout;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.icewinter.flow.winter.icecatch.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowBackendEventEmitter extends WinterFlowSyntaxCloud implements View.OnAttachStateChangeListener, AccessibilityManager.AccessibilityStateChangeListener, AccessibilityManager.TouchExplorationStateChangeListener {
    public static final WinterFlowTransactionStructure WinterFlowCacheTool;
    public boolean WinterFlowArrayHelper;
    public final WinterFlowRepositoryDatabase WinterFlowBackendCacheManager;
    public int WinterFlowBandwidthObject;
    public final WinterFlowViewSoftware WinterFlowBatchUI;
    public final WinterFlowRouterNode WinterFlowCacheManagerListener;
    public final WinterFlowServerConcurrency WinterFlowCloudMicroservice;
    public boolean WinterFlowCompilerHandler;
    public WinterFlowControllerAgent WinterFlowCompilerVariable;
    public WinterFlowFrameworkDataSource WinterFlowConcurrencyThread;
    public WinterFlowViewSoftware WinterFlowConfigurationSubsystem;
    public Integer WinterFlowConsumerUserManager;
    public final WinterFlowWorkerThreadPool WinterFlowEventEmitterController;
    public final WinterFlowRouterNode WinterFlowFrontendBackend;
    public final WinterFlowRequestListener WinterFlowMapperProtocol;
    public int WinterFlowOrchestrationSubsystem;
    public final WinterFlowRouterNode WinterFlowPackageIDE;
    public final WinterFlowTransactionManagerBatch WinterFlowQueueService;
    public int WinterFlowResolverController;
    public final WinterFlowViewSoftware WinterFlowRouterAdapter;
    public final WinterFlowSyntaxTransactionManager WinterFlowRouterRouter;
    public final WinterFlowRequestListener WinterFlowSerializerStructure;
    public long WinterFlowServerProtocol;
    public final WinterFlowManagerHandler WinterFlowServiceUtility;
    public WinterFlowFrameworkDataSource WinterFlowSingletonPlatform;
    public final WinterFlowNodeLayer WinterFlowSoftwareEngine;
    public final String WinterFlowSoftwareProtocol;
    public final WinterFlowMiddlewareFramework WinterFlowStrategyTool;
    public final WinterFlowViewSoftware WinterFlowSyntaxSubsystem;
    public WinterFlowRouterComponent WinterFlowTestingNode;
    public List WinterFlowThreadListener;
    public final AccessibilityManager WinterFlowTransactionAgent;
    public final ArrayList WinterFlowUIMiddleware;
    public final String WinterFlowUserManagerUserManager;
    public boolean WinterFlowVariableBandwidth;
    public int WinterFlowSyntax = Integer.MIN_VALUE;
    public final WinterFlowTransactionManagerBatch WinterFlowResponseEngine = new WinterFlowTransactionManagerBatch(this, 0);

    static {
        int[] iArr = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        WinterFlowTransactionStructure winterFlowTransactionStructure = WinterFlowFunctionScheduler.WinterFlowRouterStructure;
        WinterFlowTransactionStructure winterFlowTransactionStructure2 = new WinterFlowTransactionStructure(32);
        int i = winterFlowTransactionStructure2.WinterFlowHookDataSource;
        if (i < 0) {
            WinterFlowCompilerMechanism.WinterFlowTransactionAgent("");
            return;
        }
        int i2 = i + 32;
        int[] iArr2 = winterFlowTransactionStructure2.WinterFlowRouterStructure;
        if (iArr2.length < i2) {
            iArr2 = Arrays.copyOf(iArr2, Math.max(i2, (iArr2.length * 3) / 2));
            winterFlowTransactionStructure2.WinterFlowRouterStructure = iArr2;
        }
        int i3 = winterFlowTransactionStructure2.WinterFlowHookDataSource;
        if (i != i3) {
            WinterFlowProtocolPipeline.WinterFlowCompilerHandler(iArr2, iArr2, i2, i, i3);
        }
        WinterFlowProtocolPipeline.WinterFlowUIMiddleware(iArr, iArr2, i, 0, 12);
        winterFlowTransactionStructure2.WinterFlowHookDataSource += 32;
        WinterFlowCacheTool = winterFlowTransactionStructure2;
    }

    public WinterFlowBackendEventEmitter(WinterFlowSyntaxTransactionManager winterFlowSyntaxTransactionManager) {
        this.WinterFlowRouterRouter = winterFlowSyntaxTransactionManager;
        Object systemService = winterFlowSyntaxTransactionManager.getContext().getSystemService("accessibility");
        systemService.getClass();
        this.WinterFlowTransactionAgent = (AccessibilityManager) systemService;
        this.WinterFlowServerProtocol = 100L;
        new Handler(Looper.getMainLooper());
        this.WinterFlowServiceUtility = new WinterFlowManagerHandler(this);
        this.WinterFlowBandwidthObject = Integer.MIN_VALUE;
        this.WinterFlowOrchestrationSubsystem = Integer.MIN_VALUE;
        this.WinterFlowBatchUI = new WinterFlowViewSoftware();
        this.WinterFlowRouterAdapter = new WinterFlowViewSoftware();
        this.WinterFlowSerializerStructure = new WinterFlowRequestListener();
        this.WinterFlowMapperProtocol = new WinterFlowRequestListener();
        this.WinterFlowResolverController = -1;
        this.WinterFlowBackendCacheManager = new WinterFlowRepositoryDatabase(0);
        int i = 1;
        this.WinterFlowEventEmitterController = WinterFlowHandlerWebsocket.WinterFlowRouterStructure(1, 6, null);
        this.WinterFlowArrayHelper = true;
        WinterFlowViewSoftware winterFlowViewSoftware = WinterFlowVersionControlAgent.WinterFlowRouterStructure;
        winterFlowViewSoftware.getClass();
        this.WinterFlowConfigurationSubsystem = winterFlowViewSoftware;
        this.WinterFlowStrategyTool = new WinterFlowMiddlewareFramework();
        this.WinterFlowCacheManagerListener = new WinterFlowRouterNode();
        this.WinterFlowPackageIDE = new WinterFlowRouterNode();
        this.WinterFlowSoftwareProtocol = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.WinterFlowUserManagerUserManager = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.WinterFlowSoftwareEngine = new WinterFlowNodeLayer();
        this.WinterFlowSyntaxSubsystem = new WinterFlowViewSoftware();
        this.WinterFlowTestingNode = new WinterFlowRouterComponent(winterFlowSyntaxTransactionManager.getSemanticsOwner().WinterFlowRouterStructure(), winterFlowViewSoftware);
        int i2 = WinterFlowSerializerModule.WinterFlowRouterStructure;
        this.WinterFlowFrontendBackend = new WinterFlowRouterNode();
        winterFlowSyntaxTransactionManager.addOnAttachStateChangeListener(this);
        this.WinterFlowCloudMicroservice = new WinterFlowServerConcurrency(i, this);
        this.WinterFlowUIMiddleware = new ArrayList();
        this.WinterFlowQueueService = new WinterFlowTransactionManagerBatch(this, i);
    }

    public static final boolean WinterFlowConcurrencyThread(WinterFlowExceptionPlatform winterFlowExceptionPlatform, float f) {
        WinterFlowObjectUI winterFlowObjectUI = winterFlowExceptionPlatform.WinterFlowRouterStructure;
        if (f >= 0.0f || ((Number) winterFlowObjectUI.WinterFlowRouterStructure()).floatValue() <= 0.0f) {
            return f > 0.0f && ((Number) winterFlowObjectUI.WinterFlowRouterStructure()).floatValue() < ((Number) winterFlowExceptionPlatform.WinterFlowHookDataSource.WinterFlowRouterStructure()).floatValue();
        }
        return true;
    }

    public static float[] WinterFlowPackageIDE(WinterFlowTestingCloud winterFlowTestingCloud) {
        if (!(winterFlowTestingCloud instanceof WinterFlowSessionCompiler)) {
            return null;
        }
        WinterFlowQueryJSON winterFlowQueryJSON = ((WinterFlowSessionCompiler) winterFlowTestingCloud).WinterFlowThreadListener;
        long j = winterFlowQueryJSON.WinterFlowRouterRouter;
        long j2 = winterFlowQueryJSON.WinterFlowUnitTestResponse;
        long j3 = winterFlowQueryJSON.WinterFlowTransactionManagerStrategy;
        long j4 = winterFlowQueryJSON.WinterFlowVariableVersionControl;
        return new float[]{Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L))};
    }

    public static /* synthetic */ void WinterFlowResolverController(WinterFlowBackendEventEmitter winterFlowBackendEventEmitter, int i, int i2, Integer num, int i3) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        winterFlowBackendEventEmitter.WinterFlowMapperProtocol(i, i2, num, null);
    }

    public static final boolean WinterFlowSingletonPlatform(WinterFlowExceptionPlatform winterFlowExceptionPlatform) {
        WinterFlowObjectUI winterFlowObjectUI = winterFlowExceptionPlatform.WinterFlowRouterStructure;
        if (((Number) winterFlowObjectUI.WinterFlowRouterStructure()).floatValue() > 0.0f) {
            return true;
        }
        ((Number) winterFlowObjectUI.WinterFlowRouterStructure()).floatValue();
        ((Number) winterFlowExceptionPlatform.WinterFlowHookDataSource.WinterFlowRouterStructure()).floatValue();
        return false;
    }

    public static Region WinterFlowSoftwareProtocol(WinterFlowTestingCloud winterFlowTestingCloud, float f, float f2) {
        if (!(winterFlowTestingCloud instanceof WinterFlowServiceProviderJava)) {
            return null;
        }
        WinterFlowServiceProviderJava winterFlowServiceProviderJava = (WinterFlowServiceProviderJava) winterFlowTestingCloud;
        WinterFlowVersionParser WinterFlowArrayNetwork = winterFlowServiceProviderJava.WinterFlowRouterAdapter().WinterFlowArrayNetwork(f, f2);
        Region region = new Region(new Rect((int) (WinterFlowArrayNetwork.WinterFlowRouterStructure + 0.0f), (int) (WinterFlowArrayNetwork.WinterFlowHookDataSource + 0.0f), (int) (WinterFlowArrayNetwork.WinterFlowCacheManagerAgent + 0.0f), (int) (WinterFlowArrayNetwork.WinterFlowArrayNetwork + 0.0f)));
        Region region2 = new Region();
        WinterFlowManagerCloud winterFlowManagerCloud = winterFlowServiceProviderJava.WinterFlowThreadListener;
        if (!(winterFlowManagerCloud instanceof WinterFlowManagerCloud)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path path = winterFlowManagerCloud.WinterFlowRouterStructure;
        path.offset(f, f2);
        region2.setPath(path, region);
        return region2;
    }

    public static Rect WinterFlowStrategyTool(WinterFlowTestingCloud winterFlowTestingCloud, float f, float f2) {
        if (!(winterFlowTestingCloud instanceof WinterFlowSchedulerStack) && !(winterFlowTestingCloud instanceof WinterFlowSessionCompiler)) {
            return null;
        }
        WinterFlowVersionParser WinterFlowRouterAdapter = winterFlowTestingCloud.WinterFlowRouterAdapter();
        return new Rect((int) (WinterFlowRouterAdapter.WinterFlowRouterStructure + f), (int) (WinterFlowRouterAdapter.WinterFlowHookDataSource + f2), (int) (WinterFlowRouterAdapter.WinterFlowCacheManagerAgent + f), (int) (WinterFlowRouterAdapter.WinterFlowArrayNetwork + f2));
    }

    public static String WinterFlowThreadListener(WinterFlowProcessorSystem winterFlowProcessorSystem) {
        WinterFlowCompilerStructure winterFlowCompilerStructure;
        if (winterFlowProcessorSystem != null) {
            WinterFlowDecoratorBackend winterFlowDecoratorBackend = winterFlowProcessorSystem.WinterFlowArrayNetwork;
            WinterFlowDatabaseSchemaStructure winterFlowDatabaseSchemaStructure = winterFlowDecoratorBackend.WinterFlowVariableVersionControl;
            WinterFlowRendererOrchestration winterFlowRendererOrchestration = WinterFlowRendererJava.WinterFlowRouterStructure;
            if (winterFlowDatabaseSchemaStructure.WinterFlowCacheManagerAgent(winterFlowRendererOrchestration)) {
                return WinterFlowBackendTool.WinterFlowRouterStructure((List) winterFlowDecoratorBackend.WinterFlowArrayNetwork(winterFlowRendererOrchestration), ",", null, 62);
            }
            WinterFlowRendererOrchestration winterFlowRendererOrchestration2 = WinterFlowRendererJava.WinterFlowCacheManagerListener;
            if (winterFlowDatabaseSchemaStructure.WinterFlowCacheManagerAgent(winterFlowRendererOrchestration2)) {
                Object WinterFlowUnitTestResponse = winterFlowDatabaseSchemaStructure.WinterFlowUnitTestResponse(winterFlowRendererOrchestration2);
                if (WinterFlowUnitTestResponse == null) {
                    WinterFlowUnitTestResponse = null;
                }
                WinterFlowCompilerStructure winterFlowCompilerStructure2 = (WinterFlowCompilerStructure) WinterFlowUnitTestResponse;
                if (winterFlowCompilerStructure2 != null) {
                    return winterFlowCompilerStructure2.WinterFlowTransactionManagerStrategy;
                }
            } else {
                Object WinterFlowUnitTestResponse2 = winterFlowDatabaseSchemaStructure.WinterFlowUnitTestResponse(WinterFlowRendererJava.WinterFlowArrayHelper);
                if (WinterFlowUnitTestResponse2 == null) {
                    WinterFlowUnitTestResponse2 = null;
                }
                List list = (List) WinterFlowUnitTestResponse2;
                if (list != null && (winterFlowCompilerStructure = (WinterFlowCompilerStructure) WinterFlowSerializerUtility.WinterFlowPipelineSoftware(list)) != null) {
                    return winterFlowCompilerStructure.WinterFlowTransactionManagerStrategy;
                }
            }
        }
        return null;
    }

    public static CharSequence WinterFlowUserManagerUserManager(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i = 99999;
                }
                CharSequence subSequence = charSequence.subSequence(0, i);
                subSequence.getClass();
                return subSequence;
            }
        }
        return charSequence;
    }

    public static final boolean WinterFlowVariableBandwidth(WinterFlowExceptionPlatform winterFlowExceptionPlatform) {
        WinterFlowObjectUI winterFlowObjectUI = winterFlowExceptionPlatform.WinterFlowRouterStructure;
        if (((Number) winterFlowObjectUI.WinterFlowRouterStructure()).floatValue() < ((Number) winterFlowExceptionPlatform.WinterFlowHookDataSource.WinterFlowRouterStructure()).floatValue()) {
            return true;
        }
        ((Number) winterFlowObjectUI.WinterFlowRouterStructure()).floatValue();
        return false;
    }

    public final void WinterFlowArrayHelper(WinterFlowSchedulerStructure winterFlowSchedulerStructure, WinterFlowMiddlewareFramework winterFlowMiddlewareFramework) {
        WinterFlowDecoratorBackend WinterFlowSerializerStructure;
        if (winterFlowSchedulerStructure.WinterFlowCacheManagerListener() && !this.WinterFlowRouterRouter.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(winterFlowSchedulerStructure)) {
            WinterFlowSchedulerStructure winterFlowSchedulerStructure2 = null;
            if (!winterFlowSchedulerStructure.WinterFlowUserManagerUserManager.WinterFlowCacheManagerAgent(8)) {
                winterFlowSchedulerStructure = winterFlowSchedulerStructure.WinterFlowVariableBandwidth();
                while (true) {
                    if (winterFlowSchedulerStructure == null) {
                        winterFlowSchedulerStructure = null;
                        break;
                    } else if (winterFlowSchedulerStructure.WinterFlowUserManagerUserManager.WinterFlowCacheManagerAgent(8)) {
                        break;
                    } else {
                        winterFlowSchedulerStructure = winterFlowSchedulerStructure.WinterFlowVariableBandwidth();
                    }
                }
            }
            if (winterFlowSchedulerStructure == null || (WinterFlowSerializerStructure = winterFlowSchedulerStructure.WinterFlowSerializerStructure()) == null) {
                return;
            }
            if (!WinterFlowSerializerStructure.WinterFlowUnitTestResponse) {
                WinterFlowSchedulerStructure WinterFlowVariableBandwidth = winterFlowSchedulerStructure.WinterFlowVariableBandwidth();
                while (true) {
                    if (WinterFlowVariableBandwidth != null) {
                        WinterFlowDecoratorBackend WinterFlowSerializerStructure2 = WinterFlowVariableBandwidth.WinterFlowSerializerStructure();
                        if (WinterFlowSerializerStructure2 != null && WinterFlowSerializerStructure2.WinterFlowUnitTestResponse) {
                            winterFlowSchedulerStructure2 = WinterFlowVariableBandwidth;
                            break;
                        }
                        WinterFlowVariableBandwidth = WinterFlowVariableBandwidth.WinterFlowVariableBandwidth();
                    } else {
                        break;
                    }
                }
                if (winterFlowSchedulerStructure2 != null) {
                    winterFlowSchedulerStructure = winterFlowSchedulerStructure2;
                }
            }
            int i = winterFlowSchedulerStructure.WinterFlowTransactionManagerStrategy;
            if (winterFlowMiddlewareFramework.WinterFlowRouterStructure(i)) {
                WinterFlowResolverController(this, WinterFlowBatchUI(i), 2048, 1, 8);
            }
        }
    }

    public final Rect WinterFlowArrayNetwork(WinterFlowArrayModule winterFlowArrayModule) {
        WinterFlowLibraryInterface winterFlowLibraryInterface = winterFlowArrayModule.WinterFlowHookDataSource;
        return WinterFlowCacheManagerListener(winterFlowLibraryInterface.WinterFlowRouterStructure, winterFlowLibraryInterface.WinterFlowHookDataSource, winterFlowLibraryInterface.WinterFlowCacheManagerAgent, winterFlowLibraryInterface.WinterFlowArrayNetwork);
    }

    public final void WinterFlowBackendCacheManager(int i) {
        WinterFlowControllerAgent winterFlowControllerAgent = this.WinterFlowCompilerVariable;
        if (winterFlowControllerAgent != null) {
            WinterFlowProcessorSystem winterFlowProcessorSystem = winterFlowControllerAgent.WinterFlowRouterStructure;
            if (i != winterFlowProcessorSystem.WinterFlowTransactionManagerStrategy) {
                return;
            }
            if (SystemClock.uptimeMillis() - winterFlowControllerAgent.WinterFlowTransactionManagerStrategy <= 1000) {
                AccessibilityEvent WinterFlowRouterRouter = WinterFlowRouterRouter(WinterFlowBatchUI(winterFlowProcessorSystem.WinterFlowTransactionManagerStrategy), 131072);
                WinterFlowRouterRouter.setFromIndex(winterFlowControllerAgent.WinterFlowArrayNetwork);
                WinterFlowRouterRouter.setToIndex(winterFlowControllerAgent.WinterFlowVariableVersionControl);
                WinterFlowRouterRouter.setAction(winterFlowControllerAgent.WinterFlowHookDataSource);
                WinterFlowRouterRouter.setMovementGranularity(winterFlowControllerAgent.WinterFlowCacheManagerAgent);
                WinterFlowRouterRouter.getText().add(WinterFlowThreadListener(winterFlowProcessorSystem));
                WinterFlowSerializerStructure(WinterFlowRouterRouter);
            }
        }
        this.WinterFlowCompilerVariable = null;
    }

    public final boolean WinterFlowBandwidthObject() {
        AccessibilityManager accessibilityManager = this.WinterFlowTransactionAgent;
        if (!accessibilityManager.isEnabled()) {
            return false;
        }
        List<AccessibilityServiceInfo> list = this.WinterFlowThreadListener;
        if (list == null) {
            list = accessibilityManager.getEnabledAccessibilityServiceList(-1);
            this.WinterFlowThreadListener = list;
        }
        return !list.isEmpty();
    }

    public final int WinterFlowBatchUI(int i) {
        if (i == this.WinterFlowRouterRouter.getSemanticsOwner().WinterFlowRouterStructure().WinterFlowTransactionManagerStrategy) {
            return -1;
        }
        return i;
    }

    public final void WinterFlowCacheManagerAgent(int i, WinterFlowFrameworkDataSource winterFlowFrameworkDataSource, String str, Bundle bundle) {
        WinterFlowProcessorSystem winterFlowProcessorSystem;
        WinterFlowMiddlewareModule WinterFlowUnitTestResponse;
        int i2;
        float WinterFlowSyntax;
        float f;
        int i3;
        WinterFlowSyntaxTransactionManager winterFlowSyntaxTransactionManager;
        RectF rectF;
        AccessibilityNodeInfo accessibilityNodeInfo = winterFlowFrameworkDataSource.WinterFlowRouterStructure;
        WinterFlowArrayModule winterFlowArrayModule = (WinterFlowArrayModule) WinterFlowServerProtocol().WinterFlowHookDataSource(i);
        if (winterFlowArrayModule == null || (winterFlowProcessorSystem = winterFlowArrayModule.WinterFlowRouterStructure) == null) {
            return;
        }
        WinterFlowSchedulerStructure winterFlowSchedulerStructure = winterFlowProcessorSystem.WinterFlowCacheManagerAgent;
        WinterFlowDecoratorBackend winterFlowDecoratorBackend = winterFlowProcessorSystem.WinterFlowArrayNetwork;
        WinterFlowDatabaseSchemaStructure winterFlowDatabaseSchemaStructure = winterFlowDecoratorBackend.WinterFlowVariableVersionControl;
        String WinterFlowThreadListener = WinterFlowThreadListener(winterFlowProcessorSystem);
        if (WinterFlowManagerRequest.WinterFlowThreadListener(str, this.WinterFlowSoftwareProtocol)) {
            int WinterFlowArrayNetwork = this.WinterFlowCacheManagerListener.WinterFlowArrayNetwork(i);
            if (WinterFlowArrayNetwork != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, WinterFlowArrayNetwork);
                return;
            }
            return;
        }
        if (WinterFlowManagerRequest.WinterFlowThreadListener(str, this.WinterFlowUserManagerUserManager)) {
            int WinterFlowArrayNetwork2 = this.WinterFlowPackageIDE.WinterFlowArrayNetwork(i);
            if (WinterFlowArrayNetwork2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, WinterFlowArrayNetwork2);
                return;
            }
            return;
        }
        boolean WinterFlowCacheManagerAgent = winterFlowDatabaseSchemaStructure.WinterFlowCacheManagerAgent(WinterFlowCacheWorker.WinterFlowRouterStructure);
        WinterFlowSyntaxTransactionManager winterFlowSyntaxTransactionManager2 = this.WinterFlowRouterRouter;
        boolean z = false;
        if (!WinterFlowCacheManagerAgent || bundle == null || !WinterFlowManagerRequest.WinterFlowThreadListener(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            WinterFlowRendererOrchestration winterFlowRendererOrchestration = WinterFlowRendererJava.WinterFlowBackendCacheManager;
            if (winterFlowDatabaseSchemaStructure.WinterFlowCacheManagerAgent(winterFlowRendererOrchestration) && bundle != null && WinterFlowManagerRequest.WinterFlowThreadListener(str, "androidx.compose.ui.semantics.testTag")) {
                Object WinterFlowUnitTestResponse2 = winterFlowDatabaseSchemaStructure.WinterFlowUnitTestResponse(winterFlowRendererOrchestration);
                String str2 = (String) (WinterFlowUnitTestResponse2 == null ? null : WinterFlowUnitTestResponse2);
                if (str2 != null) {
                    accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
                    return;
                }
                return;
            }
            if (WinterFlowManagerRequest.WinterFlowThreadListener(str, "androidx.compose.ui.semantics.id")) {
                accessibilityNodeInfo.getExtras().putInt(str, winterFlowProcessorSystem.WinterFlowTransactionManagerStrategy);
                return;
            }
            if (WinterFlowManagerRequest.WinterFlowThreadListener(str, "androidx.compose.ui.semantics.shapeType")) {
                Object WinterFlowUnitTestResponse3 = winterFlowDatabaseSchemaStructure.WinterFlowUnitTestResponse(WinterFlowRendererJava.WinterFlowCloudMicroservice);
                WinterFlowVersionControlUtility winterFlowVersionControlUtility = (WinterFlowVersionControlUtility) (WinterFlowUnitTestResponse3 == null ? null : WinterFlowUnitTestResponse3);
                if (winterFlowVersionControlUtility != null) {
                    Rect rect = new Rect();
                    accessibilityNodeInfo.getBoundsInScreen(rect);
                    WinterFlowVersionParser WinterFlowServiceUtility = WinterFlowServiceUtility(winterFlowProcessorSystem, rect, winterFlowVersionControlUtility);
                    float f2 = WinterFlowServiceUtility.WinterFlowHookDataSource;
                    float f3 = WinterFlowServiceUtility.WinterFlowRouterStructure;
                    WinterFlowTestingCloud WinterFlowRouterStructure = winterFlowVersionControlUtility.WinterFlowRouterStructure(WinterFlowServiceUtility.WinterFlowHookDataSource(), winterFlowSchedulerStructure.WinterFlowCompilerVariable, winterFlowSyntaxTransactionManager2.getDensity());
                    if (WinterFlowRouterStructure instanceof WinterFlowSchedulerStack) {
                        accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 0);
                        accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", WinterFlowStrategyTool(WinterFlowRouterStructure, f3, f2));
                        return;
                    } else if (WinterFlowRouterStructure instanceof WinterFlowSessionCompiler) {
                        accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 1);
                        accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", WinterFlowStrategyTool(WinterFlowRouterStructure, f3, f2));
                        accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", WinterFlowPackageIDE(WinterFlowRouterStructure));
                        return;
                    } else if (!(WinterFlowRouterStructure instanceof WinterFlowServiceProviderJava)) {
                        WinterFlowEventEmitterOrchestration.WinterFlowRouterStructure();
                        return;
                    } else {
                        accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 2);
                        accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", WinterFlowSoftwareProtocol(WinterFlowRouterStructure, f3, f2));
                        return;
                    }
                }
                return;
            }
            if (WinterFlowManagerRequest.WinterFlowThreadListener(str, "androidx.compose.ui.semantics.shapeRect")) {
                Object WinterFlowUnitTestResponse4 = winterFlowDatabaseSchemaStructure.WinterFlowUnitTestResponse(WinterFlowRendererJava.WinterFlowCloudMicroservice);
                WinterFlowVersionControlUtility winterFlowVersionControlUtility2 = (WinterFlowVersionControlUtility) (WinterFlowUnitTestResponse4 == null ? null : WinterFlowUnitTestResponse4);
                if (winterFlowVersionControlUtility2 != null) {
                    Rect rect2 = new Rect();
                    accessibilityNodeInfo.getBoundsInScreen(rect2);
                    WinterFlowVersionParser WinterFlowServiceUtility2 = WinterFlowServiceUtility(winterFlowProcessorSystem, rect2, winterFlowVersionControlUtility2);
                    Rect WinterFlowStrategyTool = WinterFlowStrategyTool(winterFlowVersionControlUtility2.WinterFlowRouterStructure(WinterFlowServiceUtility2.WinterFlowHookDataSource(), winterFlowSchedulerStructure.WinterFlowCompilerVariable, winterFlowSyntaxTransactionManager2.getDensity()), WinterFlowServiceUtility2.WinterFlowRouterStructure, WinterFlowServiceUtility2.WinterFlowHookDataSource);
                    if (WinterFlowStrategyTool != null) {
                        accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", WinterFlowStrategyTool);
                        return;
                    }
                    return;
                }
                return;
            }
            if (WinterFlowManagerRequest.WinterFlowThreadListener(str, "androidx.compose.ui.semantics.shapeCorners")) {
                Object WinterFlowUnitTestResponse5 = winterFlowDatabaseSchemaStructure.WinterFlowUnitTestResponse(WinterFlowRendererJava.WinterFlowCloudMicroservice);
                WinterFlowVersionControlUtility winterFlowVersionControlUtility3 = (WinterFlowVersionControlUtility) (WinterFlowUnitTestResponse5 == null ? null : WinterFlowUnitTestResponse5);
                if (winterFlowVersionControlUtility3 != null) {
                    Rect rect3 = new Rect();
                    accessibilityNodeInfo.getBoundsInScreen(rect3);
                    float[] WinterFlowPackageIDE = WinterFlowPackageIDE(winterFlowVersionControlUtility3.WinterFlowRouterStructure(WinterFlowServiceUtility(winterFlowProcessorSystem, rect3, winterFlowVersionControlUtility3).WinterFlowHookDataSource(), winterFlowSchedulerStructure.WinterFlowCompilerVariable, winterFlowSyntaxTransactionManager2.getDensity()));
                    if (WinterFlowPackageIDE != null) {
                        accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", WinterFlowPackageIDE);
                        return;
                    }
                    return;
                }
                return;
            }
            if (WinterFlowManagerRequest.WinterFlowThreadListener(str, "androidx.compose.ui.semantics.shapeRegion")) {
                Object WinterFlowUnitTestResponse6 = winterFlowDatabaseSchemaStructure.WinterFlowUnitTestResponse(WinterFlowRendererJava.WinterFlowCloudMicroservice);
                WinterFlowVersionControlUtility winterFlowVersionControlUtility4 = (WinterFlowVersionControlUtility) (WinterFlowUnitTestResponse6 == null ? null : WinterFlowUnitTestResponse6);
                if (winterFlowVersionControlUtility4 != null) {
                    Rect rect4 = new Rect();
                    accessibilityNodeInfo.getBoundsInScreen(rect4);
                    WinterFlowVersionParser WinterFlowServiceUtility3 = WinterFlowServiceUtility(winterFlowProcessorSystem, rect4, winterFlowVersionControlUtility4);
                    Region WinterFlowSoftwareProtocol = WinterFlowSoftwareProtocol(winterFlowVersionControlUtility4.WinterFlowRouterStructure(WinterFlowServiceUtility3.WinterFlowHookDataSource(), winterFlowSchedulerStructure.WinterFlowCompilerVariable, winterFlowSyntaxTransactionManager2.getDensity()), WinterFlowServiceUtility3.WinterFlowRouterStructure, WinterFlowServiceUtility3.WinterFlowHookDataSource);
                    if (WinterFlowSoftwareProtocol != null) {
                        accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", WinterFlowSoftwareProtocol);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        int i4 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
        int i5 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
        if (i5 <= 0 || i4 < 0) {
            return;
        }
        if (i4 < (WinterFlowThreadListener != null ? WinterFlowThreadListener.length() : Integer.MAX_VALUE) && (WinterFlowUnitTestResponse = WinterFlowDecoratorRouter.WinterFlowUnitTestResponse(winterFlowDecoratorBackend)) != null) {
            ArrayList arrayList = new ArrayList();
            int i6 = 0;
            while (i6 < i5) {
                int i7 = i4 + i6;
                if (i7 >= WinterFlowUnitTestResponse.WinterFlowRouterStructure.WinterFlowRouterStructure.WinterFlowTransactionManagerStrategy.length()) {
                    arrayList.add(z);
                    i2 = i4;
                    i3 = i5;
                    winterFlowSyntaxTransactionManager = winterFlowSyntaxTransactionManager2;
                } else {
                    WinterFlowAdapterUnitTest winterFlowAdapterUnitTest = WinterFlowUnitTestResponse.WinterFlowHookDataSource;
                    WinterFlowCompilerStructure winterFlowCompilerStructure = (WinterFlowCompilerStructure) ((WinterFlowStackProvider) winterFlowAdapterUnitTest.WinterFlowCacheManagerAgent).WinterFlowVariableVersionControl;
                    if (i7 < 0 || i7 >= winterFlowCompilerStructure.WinterFlowTransactionManagerStrategy.length()) {
                        StringBuilder WinterFlowThreadListener2 = WinterFlowResolverBackend.WinterFlowThreadListener("offset(", i7, ") is out of bounds [0, ");
                        WinterFlowThreadListener2.append(winterFlowCompilerStructure.WinterFlowTransactionManagerStrategy.length());
                        WinterFlowThreadListener2.append(')');
                        WinterFlowWorkerPipeline.WinterFlowRouterStructure(WinterFlowThreadListener2.toString());
                    }
                    ArrayList arrayList2 = (ArrayList) winterFlowAdapterUnitTest.WinterFlowVariableVersionControl;
                    WinterFlowNodeInterface winterFlowNodeInterface = (WinterFlowNodeInterface) arrayList2.get(WinterFlowTestingCloud.WinterFlowServiceUtility(i7, arrayList2));
                    WinterFlowMiddlewareValidator winterFlowMiddlewareValidator = winterFlowNodeInterface.WinterFlowRouterStructure;
                    int WinterFlowRouterStructure2 = winterFlowNodeInterface.WinterFlowRouterStructure(i7);
                    CharSequence charSequence = winterFlowMiddlewareValidator.WinterFlowVariableVersionControl;
                    if (WinterFlowRouterStructure2 < 0 || WinterFlowRouterStructure2 >= charSequence.length()) {
                        StringBuilder WinterFlowThreadListener3 = WinterFlowResolverBackend.WinterFlowThreadListener("offset(", WinterFlowRouterStructure2, ") is out of bounds [0,");
                        WinterFlowThreadListener3.append(charSequence.length());
                        WinterFlowThreadListener3.append(')');
                        WinterFlowWorkerPipeline.WinterFlowRouterStructure(WinterFlowThreadListener3.toString());
                    }
                    WinterFlowDeploymentManager winterFlowDeploymentManager = winterFlowMiddlewareValidator.WinterFlowArrayNetwork;
                    int WinterFlowTransactionManagerStrategy = winterFlowDeploymentManager.WinterFlowTransactionManagerStrategy(WinterFlowRouterStructure2);
                    float WinterFlowUnitTestResponse7 = winterFlowDeploymentManager.WinterFlowUnitTestResponse(WinterFlowTransactionManagerStrategy);
                    float WinterFlowArrayNetwork3 = winterFlowDeploymentManager.WinterFlowArrayNetwork(WinterFlowTransactionManagerStrategy);
                    Layout layout = winterFlowDeploymentManager.WinterFlowVariableVersionControl;
                    i2 = i4;
                    boolean z2 = layout.getParagraphDirection(WinterFlowTransactionManagerStrategy) == 1;
                    boolean isRtlCharAt = layout.isRtlCharAt(WinterFlowRouterStructure2);
                    if (z2 && !isRtlCharAt) {
                        f = winterFlowDeploymentManager.WinterFlowRouterRouter(WinterFlowRouterStructure2, false);
                        WinterFlowSyntax = winterFlowDeploymentManager.WinterFlowRouterRouter(WinterFlowRouterStructure2 + 1, true);
                    } else if (z2 && isRtlCharAt) {
                        float WinterFlowSyntax2 = winterFlowDeploymentManager.WinterFlowSyntax(WinterFlowRouterStructure2, false);
                        f = winterFlowDeploymentManager.WinterFlowSyntax(WinterFlowRouterStructure2 + 1, true);
                        WinterFlowSyntax = WinterFlowSyntax2;
                    } else if (isRtlCharAt) {
                        float WinterFlowRouterRouter = winterFlowDeploymentManager.WinterFlowRouterRouter(WinterFlowRouterStructure2, false);
                        f = winterFlowDeploymentManager.WinterFlowRouterRouter(WinterFlowRouterStructure2 + 1, true);
                        WinterFlowSyntax = WinterFlowRouterRouter;
                    } else {
                        float WinterFlowSyntax3 = winterFlowDeploymentManager.WinterFlowSyntax(WinterFlowRouterStructure2, false);
                        WinterFlowSyntax = winterFlowDeploymentManager.WinterFlowSyntax(WinterFlowRouterStructure2 + 1, true);
                        f = WinterFlowSyntax3;
                    }
                    RectF rectF2 = new RectF(f, WinterFlowUnitTestResponse7, WinterFlowSyntax, WinterFlowArrayNetwork3);
                    float f4 = rectF2.left;
                    float f5 = rectF2.top;
                    float f6 = rectF2.right;
                    float f7 = rectF2.bottom;
                    i3 = i5;
                    long floatToRawIntBits = (Float.floatToRawIntBits(winterFlowNodeInterface.WinterFlowTransactionManagerStrategy) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
                    winterFlowSyntaxTransactionManager = winterFlowSyntaxTransactionManager2;
                    int i8 = (int) (floatToRawIntBits >> 32);
                    int i9 = (int) (floatToRawIntBits & 4294967295L);
                    WinterFlowVersionParser winterFlowVersionParser = new WinterFlowVersionParser(Float.intBitsToFloat(i8) + f4, Float.intBitsToFloat(i9) + f5, Float.intBitsToFloat(i8) + f6, Float.intBitsToFloat(i9) + f7);
                    WinterFlowUIMicroservice WinterFlowArrayNetwork4 = winterFlowProcessorSystem.WinterFlowArrayNetwork();
                    long j = 0;
                    if (WinterFlowArrayNetwork4 != null) {
                        if (!WinterFlowArrayNetwork4.WinterFlowInheritanceJava().WinterFlowSingletonPlatform) {
                            WinterFlowArrayNetwork4 = null;
                        }
                        if (WinterFlowArrayNetwork4 != null) {
                            j = WinterFlowArrayNetwork4.WinterFlowPackageIDE(0L);
                        }
                    }
                    WinterFlowVersionParser WinterFlowVariableVersionControl = winterFlowVersionParser.WinterFlowVariableVersionControl(j);
                    WinterFlowVersionParser WinterFlowUnitTestResponse8 = winterFlowProcessorSystem.WinterFlowUnitTestResponse();
                    if ((((((WinterFlowVariableVersionControl.WinterFlowRouterStructure > WinterFlowUnitTestResponse8.WinterFlowCacheManagerAgent ? 1 : (WinterFlowVariableVersionControl.WinterFlowRouterStructure == WinterFlowUnitTestResponse8.WinterFlowCacheManagerAgent ? 0 : -1)) < 0) & ((WinterFlowUnitTestResponse8.WinterFlowRouterStructure > WinterFlowVariableVersionControl.WinterFlowCacheManagerAgent ? 1 : (WinterFlowUnitTestResponse8.WinterFlowRouterStructure == WinterFlowVariableVersionControl.WinterFlowCacheManagerAgent ? 0 : -1)) < 0)) & ((WinterFlowVariableVersionControl.WinterFlowHookDataSource > WinterFlowUnitTestResponse8.WinterFlowArrayNetwork ? 1 : (WinterFlowVariableVersionControl.WinterFlowHookDataSource == WinterFlowUnitTestResponse8.WinterFlowArrayNetwork ? 0 : -1)) < 0)) & ((WinterFlowUnitTestResponse8.WinterFlowHookDataSource > WinterFlowVariableVersionControl.WinterFlowArrayNetwork ? 1 : (WinterFlowUnitTestResponse8.WinterFlowHookDataSource == WinterFlowVariableVersionControl.WinterFlowArrayNetwork ? 0 : -1)) < 0) ? WinterFlowVariableVersionControl.WinterFlowCacheManagerAgent(WinterFlowUnitTestResponse8) : null) != null) {
                        long WinterFlowVariableBandwidth = winterFlowSyntaxTransactionManager.WinterFlowVariableBandwidth((Float.floatToRawIntBits(r0.WinterFlowRouterStructure) << 32) | (Float.floatToRawIntBits(r0.WinterFlowHookDataSource) & 4294967295L));
                        long WinterFlowVariableBandwidth2 = winterFlowSyntaxTransactionManager.WinterFlowVariableBandwidth((Float.floatToRawIntBits(r0.WinterFlowArrayNetwork) & 4294967295L) | (Float.floatToRawIntBits(r0.WinterFlowCacheManagerAgent) << 32));
                        int i10 = (int) (WinterFlowVariableBandwidth >> 32);
                        int i11 = (int) (WinterFlowVariableBandwidth2 >> 32);
                        int i12 = (int) (WinterFlowVariableBandwidth & 4294967295L);
                        int i13 = (int) (WinterFlowVariableBandwidth2 & 4294967295L);
                        rectF = new RectF(Math.min(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11)), Math.min(Float.intBitsToFloat(i12), Float.intBitsToFloat(i13)), Math.max(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11)), Math.max(Float.intBitsToFloat(i12), Float.intBitsToFloat(i13)));
                    } else {
                        rectF = null;
                    }
                    arrayList.add(rectF);
                }
                i6++;
                i4 = i2;
                i5 = i3;
                winterFlowSyntaxTransactionManager2 = winterFlowSyntaxTransactionManager;
                z = false;
            }
            accessibilityNodeInfo.getExtras().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
        }
    }

    public final Rect WinterFlowCacheManagerListener(float f, float f2, float f3, float f4) {
        long floatToRawIntBits = Float.floatToRawIntBits(f);
        WinterFlowSyntaxTransactionManager winterFlowSyntaxTransactionManager = this.WinterFlowRouterRouter;
        long WinterFlowVariableBandwidth = winterFlowSyntaxTransactionManager.WinterFlowVariableBandwidth((Float.floatToRawIntBits(f2) & 4294967295L) | (floatToRawIntBits << 32));
        long WinterFlowVariableBandwidth2 = winterFlowSyntaxTransactionManager.WinterFlowVariableBandwidth((Float.floatToRawIntBits(f4) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
        int i = (int) (WinterFlowVariableBandwidth >> 32);
        int i2 = (int) (WinterFlowVariableBandwidth2 >> 32);
        int i3 = (int) (WinterFlowVariableBandwidth & 4294967295L);
        int i4 = (int) (WinterFlowVariableBandwidth2 & 4294967295L);
        return new Rect((int) Math.floor(Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.floor(Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))));
    }

    public final void WinterFlowCompilerVariable(WinterFlowSchedulerStructure winterFlowSchedulerStructure) {
        if (winterFlowSchedulerStructure.WinterFlowCacheManagerListener() && !this.WinterFlowRouterRouter.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(winterFlowSchedulerStructure)) {
            int i = winterFlowSchedulerStructure.WinterFlowTransactionManagerStrategy;
            WinterFlowExceptionPlatform winterFlowExceptionPlatform = (WinterFlowExceptionPlatform) this.WinterFlowBatchUI.WinterFlowHookDataSource(i);
            WinterFlowExceptionPlatform winterFlowExceptionPlatform2 = (WinterFlowExceptionPlatform) this.WinterFlowRouterAdapter.WinterFlowHookDataSource(i);
            if (winterFlowExceptionPlatform == null && winterFlowExceptionPlatform2 == null) {
                return;
            }
            AccessibilityEvent WinterFlowRouterRouter = WinterFlowRouterRouter(i, 4096);
            if (winterFlowExceptionPlatform != null) {
                WinterFlowRouterRouter.setScrollX((int) ((Number) winterFlowExceptionPlatform.WinterFlowRouterStructure.WinterFlowRouterStructure()).floatValue());
                WinterFlowRouterRouter.setMaxScrollX((int) ((Number) winterFlowExceptionPlatform.WinterFlowHookDataSource.WinterFlowRouterStructure()).floatValue());
            }
            if (winterFlowExceptionPlatform2 != null) {
                WinterFlowRouterRouter.setScrollY((int) ((Number) winterFlowExceptionPlatform2.WinterFlowRouterStructure.WinterFlowRouterStructure()).floatValue());
                WinterFlowRouterRouter.setMaxScrollY((int) ((Number) winterFlowExceptionPlatform2.WinterFlowHookDataSource.WinterFlowRouterStructure()).floatValue());
            }
            WinterFlowSerializerStructure(WinterFlowRouterRouter);
        }
    }

    public final boolean WinterFlowConfigurationSubsystem(WinterFlowProcessorSystem winterFlowProcessorSystem, int i, int i2, boolean z) {
        String WinterFlowThreadListener;
        WinterFlowDecoratorBackend winterFlowDecoratorBackend = winterFlowProcessorSystem.WinterFlowArrayNetwork;
        int i3 = winterFlowProcessorSystem.WinterFlowTransactionManagerStrategy;
        WinterFlowRendererOrchestration winterFlowRendererOrchestration = WinterFlowCacheWorker.WinterFlowResponseEngine;
        if (winterFlowDecoratorBackend.WinterFlowVariableVersionControl.WinterFlowCacheManagerAgent(winterFlowRendererOrchestration) && WinterFlowTestingCloud.WinterFlowTransactionAgent(winterFlowProcessorSystem)) {
            WinterFlowControllerScript winterFlowControllerScript = (WinterFlowControllerScript) ((WinterFlowDecoratorStrategy) winterFlowProcessorSystem.WinterFlowArrayNetwork.WinterFlowArrayNetwork(winterFlowRendererOrchestration)).WinterFlowHookDataSource;
            if (winterFlowControllerScript != null) {
                return ((Boolean) winterFlowControllerScript.WinterFlowArrayNetwork(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
            }
        } else if ((i != i2 || i2 != this.WinterFlowResolverController) && (WinterFlowThreadListener = WinterFlowThreadListener(winterFlowProcessorSystem)) != null) {
            if (i < 0 || i != i2 || i2 > WinterFlowThreadListener.length()) {
                i = -1;
            }
            this.WinterFlowResolverController = i;
            boolean z2 = WinterFlowThreadListener.length() > 0;
            WinterFlowSerializerStructure(WinterFlowSyntax(WinterFlowBatchUI(i3), z2 ? Integer.valueOf(this.WinterFlowResolverController) : null, z2 ? Integer.valueOf(this.WinterFlowResolverController) : null, z2 ? Integer.valueOf(WinterFlowThreadListener.length()) : null, WinterFlowThreadListener));
            WinterFlowBackendCacheManager(i3);
            return true;
        }
        return false;
    }

    public final void WinterFlowConsumerUserManager(String str, int i, int i2) {
        AccessibilityEvent WinterFlowRouterRouter = WinterFlowRouterRouter(WinterFlowBatchUI(i), 32);
        WinterFlowRouterRouter.setContentChangeTypes(i2);
        if (str != null) {
            WinterFlowRouterRouter.getText().add(str);
        }
        WinterFlowSerializerStructure(WinterFlowRouterRouter);
    }

    /* JADX WARN: Code restructure failed: missing block: B:187:0x0441, code lost:
    
        if (r1.isEmpty() == false) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0471, code lost:
    
        if (r11 != null) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0476, code lost:
    
        if (r11 == null) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x012b, code lost:
    
        if (com.google.android.datatransport.WinterFlowManagerRequest.WinterFlowThreadListener(r1, r13) != false) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void WinterFlowEventEmitterController(WinterFlowJSONAdapter winterFlowJSONAdapter) {
        Integer num;
        Integer num2;
        ArrayList arrayList;
        int[] iArr;
        long[] jArr;
        int i;
        Integer num3;
        ArrayList arrayList2;
        int[] iArr2;
        long[] jArr2;
        int i2;
        int i3;
        Integer num4;
        WinterFlowDecoratorBackend winterFlowDecoratorBackend;
        WinterFlowProcessorSystem winterFlowProcessorSystem;
        int i4;
        int i5;
        int i6;
        WinterFlowDatabaseSchemaStructure winterFlowDatabaseSchemaStructure;
        int i7;
        int i8;
        WinterFlowDecoratorBackend winterFlowDecoratorBackend2;
        Integer num5;
        ArrayList arrayList3;
        int i9;
        long j;
        int i10;
        Integer num6;
        int i11;
        WinterFlowDatabaseSchemaStructure winterFlowDatabaseSchemaStructure2;
        WinterFlowProcessorSystem winterFlowProcessorSystem2;
        int i12;
        WinterFlowWebsocketTransactionManager winterFlowWebsocketTransactionManager;
        int i13;
        WinterFlowRendererOrchestration winterFlowRendererOrchestration;
        int i14;
        WinterFlowWebsocketTransactionManager winterFlowWebsocketTransactionManager2;
        int i15;
        String str;
        Integer num7;
        int i16;
        int i17;
        Integer num8;
        AccessibilityEvent WinterFlowSyntax;
        WinterFlowJSONAdapter winterFlowJSONAdapter2 = winterFlowJSONAdapter;
        Integer num9 = 64;
        ArrayList arrayList4 = this.WinterFlowUIMiddleware;
        ArrayList arrayList5 = new ArrayList(arrayList4);
        arrayList4.clear();
        int[] iArr3 = winterFlowJSONAdapter2.WinterFlowHookDataSource;
        long[] jArr3 = winterFlowJSONAdapter2.WinterFlowRouterStructure;
        int i18 = 2;
        int length = jArr3.length - 2;
        int i19 = 0;
        Integer num10 = 0;
        if (length < 0) {
            return;
        }
        int i20 = 0;
        while (true) {
            long j2 = jArr3[i20];
            int i21 = i18;
            int i22 = length;
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i23 = 8;
                int i24 = 8 - ((~(i20 - i22)) >>> 31);
                long j3 = j2;
                int i25 = i19;
                while (i25 < i24) {
                    if ((j3 & 255) < 128) {
                        int i26 = iArr3[(i20 << 3) + i25];
                        WinterFlowRouterComponent winterFlowRouterComponent = (WinterFlowRouterComponent) this.WinterFlowSyntaxSubsystem.WinterFlowHookDataSource(i26);
                        if (winterFlowRouterComponent != null) {
                            WinterFlowDecoratorBackend winterFlowDecoratorBackend3 = winterFlowRouterComponent.WinterFlowRouterStructure;
                            WinterFlowDatabaseSchemaStructure winterFlowDatabaseSchemaStructure3 = winterFlowDecoratorBackend3.WinterFlowVariableVersionControl;
                            WinterFlowArrayModule winterFlowArrayModule = (WinterFlowArrayModule) winterFlowJSONAdapter2.WinterFlowHookDataSource(i26);
                            WinterFlowProcessorSystem winterFlowProcessorSystem3 = winterFlowArrayModule != null ? winterFlowArrayModule.WinterFlowRouterStructure : null;
                            if (winterFlowProcessorSystem3 == null) {
                                throw WinterFlowResolverBackend.WinterFlowUnitTestResponse("no value for specified key");
                            }
                            int i27 = i23;
                            int i28 = winterFlowProcessorSystem3.WinterFlowTransactionManagerStrategy;
                            WinterFlowDecoratorBackend winterFlowDecoratorBackend4 = winterFlowProcessorSystem3.WinterFlowArrayNetwork;
                            iArr2 = iArr3;
                            WinterFlowDatabaseSchemaStructure winterFlowDatabaseSchemaStructure4 = winterFlowDecoratorBackend4.WinterFlowVariableVersionControl;
                            jArr2 = jArr3;
                            Object[] objArr = winterFlowDatabaseSchemaStructure4.WinterFlowHookDataSource;
                            Object[] objArr2 = winterFlowDatabaseSchemaStructure4.WinterFlowCacheManagerAgent;
                            long[] jArr4 = winterFlowDatabaseSchemaStructure4.WinterFlowRouterStructure;
                            i = i25;
                            int length2 = jArr4.length - 2;
                            if (length2 >= 0) {
                                i3 = i24;
                                WinterFlowProcessorSystem winterFlowProcessorSystem4 = winterFlowProcessorSystem3;
                                int i29 = 0;
                                i5 = 0;
                                while (true) {
                                    int i30 = 1;
                                    long j4 = jArr4[i29];
                                    int i31 = i29;
                                    int i32 = i28;
                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i33 = 8 - ((~(i31 - length2)) >>> 31);
                                        int i34 = 0;
                                        while (i34 < i33) {
                                            if ((j4 & 255) < 128) {
                                                int i35 = (i31 << 3) + i34;
                                                Object obj = objArr[i35];
                                                int i36 = length2;
                                                Object obj2 = objArr2[i35];
                                                winterFlowDecoratorBackend2 = winterFlowDecoratorBackend3;
                                                WinterFlowRendererOrchestration winterFlowRendererOrchestration2 = (WinterFlowRendererOrchestration) obj;
                                                i9 = i34;
                                                WinterFlowRendererOrchestration winterFlowRendererOrchestration3 = WinterFlowRendererJava.WinterFlowSerializerStructure;
                                                if (WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowRendererOrchestration2, winterFlowRendererOrchestration3)) {
                                                    j = j4;
                                                } else {
                                                    j = j4;
                                                    if (!WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowRendererOrchestration2, WinterFlowRendererJava.WinterFlowMapperProtocol)) {
                                                        i13 = 0;
                                                        if (i13 == 0) {
                                                            Object WinterFlowUnitTestResponse = winterFlowDatabaseSchemaStructure3.WinterFlowUnitTestResponse(winterFlowRendererOrchestration2);
                                                            if (WinterFlowUnitTestResponse == null) {
                                                                WinterFlowUnitTestResponse = null;
                                                            }
                                                        }
                                                        winterFlowRendererOrchestration = WinterFlowRendererJava.WinterFlowArrayNetwork;
                                                        if (WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowRendererOrchestration2, winterFlowRendererOrchestration)) {
                                                            int i37 = i27;
                                                            if (WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowRendererOrchestration2, WinterFlowRendererJava.WinterFlowHookDataSource)) {
                                                                WinterFlowResolverController(this, WinterFlowBatchUI(i26), 2048, num9, i37);
                                                                WinterFlowResolverController(this, WinterFlowBatchUI(i26), 2048, num10, i37);
                                                            } else if (WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowRendererOrchestration2, WinterFlowRendererJava.WinterFlowUserManagerUserManager)) {
                                                                WinterFlowResolverController(this, WinterFlowBatchUI(i26), 2048, 8192, 8);
                                                                WinterFlowResolverController(this, WinterFlowBatchUI(i26), 2048, num10, 8);
                                                            } else if (WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowRendererOrchestration2, WinterFlowRendererJava.WinterFlowSyntaxSubsystem)) {
                                                                WinterFlowResolverController(this, WinterFlowBatchUI(i26), 2048, 3072, 8);
                                                            } else if (WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowRendererOrchestration2, WinterFlowRendererJava.WinterFlowCacheManagerAgent)) {
                                                                WinterFlowResolverController(this, WinterFlowBatchUI(i26), 2048, num9, 8);
                                                                WinterFlowResolverController(this, WinterFlowBatchUI(i26), 2048, num10, 8);
                                                            } else if (WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowRendererOrchestration2, WinterFlowRendererJava.WinterFlowSoftwareProtocol)) {
                                                                Object WinterFlowUnitTestResponse2 = winterFlowDatabaseSchemaStructure4.WinterFlowUnitTestResponse(WinterFlowRendererJava.WinterFlowConsumerUserManager);
                                                                if (WinterFlowUnitTestResponse2 == null) {
                                                                    WinterFlowUnitTestResponse2 = null;
                                                                }
                                                                WinterFlowResolverController(this, WinterFlowBatchUI(i26), 2048, num9, 8);
                                                                WinterFlowResolverController(this, WinterFlowBatchUI(i26), 2048, num10, 8);
                                                            } else if (WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowRendererOrchestration2, WinterFlowRendererJava.WinterFlowRouterStructure)) {
                                                                int WinterFlowBatchUI = WinterFlowBatchUI(i26);
                                                                obj2.getClass();
                                                                WinterFlowMapperProtocol(WinterFlowBatchUI, 2048, 4, (List) obj2);
                                                            } else {
                                                                WinterFlowRendererOrchestration winterFlowRendererOrchestration4 = WinterFlowRendererJava.WinterFlowCacheManagerListener;
                                                                String str2 = "";
                                                                if (WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowRendererOrchestration2, winterFlowRendererOrchestration4)) {
                                                                    if (winterFlowDatabaseSchemaStructure4.WinterFlowCacheManagerAgent(WinterFlowCacheWorker.WinterFlowTransactionAgent)) {
                                                                        Object WinterFlowUnitTestResponse3 = winterFlowDatabaseSchemaStructure3.WinterFlowUnitTestResponse(winterFlowRendererOrchestration4);
                                                                        if (WinterFlowUnitTestResponse3 == null) {
                                                                            WinterFlowUnitTestResponse3 = null;
                                                                        }
                                                                        WinterFlowCompilerStructure winterFlowCompilerStructure = (WinterFlowCompilerStructure) WinterFlowUnitTestResponse3;
                                                                        if (winterFlowCompilerStructure == null) {
                                                                            winterFlowCompilerStructure = "";
                                                                        }
                                                                        Object WinterFlowUnitTestResponse4 = winterFlowDatabaseSchemaStructure4.WinterFlowUnitTestResponse(winterFlowRendererOrchestration4);
                                                                        if (WinterFlowUnitTestResponse4 == null) {
                                                                            WinterFlowUnitTestResponse4 = null;
                                                                        }
                                                                        CharSequence charSequence = (WinterFlowCompilerStructure) WinterFlowUnitTestResponse4;
                                                                        if (charSequence == null) {
                                                                            charSequence = "";
                                                                        }
                                                                        CharSequence WinterFlowUserManagerUserManager = WinterFlowUserManagerUserManager(charSequence);
                                                                        int length3 = winterFlowCompilerStructure.length();
                                                                        int length4 = charSequence.length();
                                                                        Integer num11 = num10;
                                                                        int i38 = length3 > length4 ? length4 : length3;
                                                                        num5 = num9;
                                                                        int i39 = 0;
                                                                        while (true) {
                                                                            i16 = i38;
                                                                            if (i39 >= i38) {
                                                                                arrayList3 = arrayList5;
                                                                                break;
                                                                            }
                                                                            arrayList3 = arrayList5;
                                                                            if (winterFlowCompilerStructure.charAt(i39) != charSequence.charAt(i39)) {
                                                                                break;
                                                                            }
                                                                            i39++;
                                                                            i38 = i16;
                                                                            arrayList5 = arrayList3;
                                                                        }
                                                                        int i40 = 0;
                                                                        while (true) {
                                                                            if (i40 >= i16 - i39) {
                                                                                i17 = i40;
                                                                                break;
                                                                            }
                                                                            i17 = i40;
                                                                            if (winterFlowCompilerStructure.charAt((length3 - 1) - i40) != charSequence.charAt((length4 - 1) - i17)) {
                                                                                break;
                                                                            } else {
                                                                                i40 = i17 + 1;
                                                                            }
                                                                        }
                                                                        int i41 = (length3 - i17) - i39;
                                                                        int i42 = (length4 - i17) - i39;
                                                                        WinterFlowRendererOrchestration winterFlowRendererOrchestration5 = WinterFlowRendererJava.WinterFlowSoftwareEngine;
                                                                        boolean WinterFlowCacheManagerAgent = winterFlowDatabaseSchemaStructure3.WinterFlowCacheManagerAgent(winterFlowRendererOrchestration5);
                                                                        boolean WinterFlowCacheManagerAgent2 = winterFlowDatabaseSchemaStructure4.WinterFlowCacheManagerAgent(winterFlowRendererOrchestration5);
                                                                        boolean WinterFlowCacheManagerAgent3 = winterFlowDatabaseSchemaStructure3.WinterFlowCacheManagerAgent(WinterFlowRendererJava.WinterFlowCacheManagerListener);
                                                                        int i43 = (WinterFlowCacheManagerAgent3 && !WinterFlowCacheManagerAgent && WinterFlowCacheManagerAgent2) ? i30 : 0;
                                                                        int i44 = (WinterFlowCacheManagerAgent3 && WinterFlowCacheManagerAgent && !WinterFlowCacheManagerAgent2) ? i30 : 0;
                                                                        if (i43 == 0 && i44 == 0) {
                                                                            WinterFlowSyntax = WinterFlowRouterRouter(WinterFlowBatchUI(i26), 16);
                                                                            WinterFlowSyntax.setFromIndex(i39);
                                                                            WinterFlowSyntax.setRemovedCount(i41);
                                                                            WinterFlowSyntax.setAddedCount(i42);
                                                                            WinterFlowSyntax.setBeforeText(winterFlowCompilerStructure);
                                                                            WinterFlowSyntax.getText().add(WinterFlowUserManagerUserManager);
                                                                            i11 = i26;
                                                                            winterFlowDatabaseSchemaStructure2 = winterFlowDatabaseSchemaStructure3;
                                                                            num8 = num11;
                                                                        } else {
                                                                            int WinterFlowBatchUI2 = WinterFlowBatchUI(i26);
                                                                            Integer valueOf = Integer.valueOf(length4);
                                                                            i11 = i26;
                                                                            winterFlowDatabaseSchemaStructure2 = winterFlowDatabaseSchemaStructure3;
                                                                            num8 = num11;
                                                                            WinterFlowSyntax = WinterFlowSyntax(WinterFlowBatchUI2, num8, num11, valueOf, WinterFlowUserManagerUserManager);
                                                                        }
                                                                        WinterFlowSyntax.setClassName("android.widget.EditText");
                                                                        WinterFlowSerializerStructure(WinterFlowSyntax);
                                                                        if (i43 == 0 && i44 == 0) {
                                                                            num7 = num8;
                                                                        } else {
                                                                            num7 = num8;
                                                                            long j5 = ((WinterFlowEventProcess) winterFlowDecoratorBackend4.WinterFlowArrayNetwork(WinterFlowRendererJava.WinterFlowPackageIDE)).WinterFlowRouterStructure;
                                                                            WinterFlowSyntax.setFromIndex((int) (j5 >> 32));
                                                                            WinterFlowSyntax.setToIndex((int) (j5 & 4294967295L));
                                                                            WinterFlowSerializerStructure(WinterFlowSyntax);
                                                                        }
                                                                    } else {
                                                                        num7 = num10;
                                                                        winterFlowDatabaseSchemaStructure2 = winterFlowDatabaseSchemaStructure3;
                                                                        num5 = num9;
                                                                        arrayList3 = arrayList5;
                                                                        i11 = i26;
                                                                        WinterFlowResolverController(this, WinterFlowBatchUI(i11), 2048, Integer.valueOf(i21), 8);
                                                                    }
                                                                    winterFlowProcessorSystem2 = winterFlowProcessorSystem4;
                                                                    i12 = i32;
                                                                    i10 = i36;
                                                                    num6 = num7;
                                                                } else {
                                                                    Integer num12 = num10;
                                                                    winterFlowDatabaseSchemaStructure2 = winterFlowDatabaseSchemaStructure3;
                                                                    num5 = num9;
                                                                    arrayList3 = arrayList5;
                                                                    i10 = i36;
                                                                    i11 = i26;
                                                                    WinterFlowRendererOrchestration winterFlowRendererOrchestration6 = WinterFlowRendererJava.WinterFlowPackageIDE;
                                                                    if (WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowRendererOrchestration2, winterFlowRendererOrchestration6)) {
                                                                        Object WinterFlowUnitTestResponse5 = winterFlowDatabaseSchemaStructure4.WinterFlowUnitTestResponse(winterFlowRendererOrchestration4);
                                                                        if (WinterFlowUnitTestResponse5 == null) {
                                                                            WinterFlowUnitTestResponse5 = null;
                                                                        }
                                                                        WinterFlowCompilerStructure winterFlowCompilerStructure2 = (WinterFlowCompilerStructure) WinterFlowUnitTestResponse5;
                                                                        if (winterFlowCompilerStructure2 != null && (str = winterFlowCompilerStructure2.WinterFlowTransactionManagerStrategy) != null) {
                                                                            str2 = str;
                                                                        }
                                                                        long j6 = ((WinterFlowEventProcess) winterFlowDecoratorBackend4.WinterFlowArrayNetwork(winterFlowRendererOrchestration6)).WinterFlowRouterStructure;
                                                                        num6 = num12;
                                                                        WinterFlowSerializerStructure(WinterFlowSyntax(WinterFlowBatchUI(i11), Integer.valueOf((int) (j6 >> 32)), Integer.valueOf((int) (j6 & 4294967295L)), Integer.valueOf(str2.length()), WinterFlowUserManagerUserManager(str2)));
                                                                        i12 = i32;
                                                                        WinterFlowBackendCacheManager(i12);
                                                                    } else {
                                                                        i12 = i32;
                                                                        num6 = num12;
                                                                        if (WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowRendererOrchestration2, winterFlowRendererOrchestration3)) {
                                                                            i14 = 0;
                                                                            winterFlowProcessorSystem2 = winterFlowProcessorSystem4;
                                                                        } else if (WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowRendererOrchestration2, WinterFlowRendererJava.WinterFlowMapperProtocol)) {
                                                                            winterFlowProcessorSystem2 = winterFlowProcessorSystem4;
                                                                            i14 = 0;
                                                                        } else if (WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowRendererOrchestration2, WinterFlowRendererJava.WinterFlowServerProtocol)) {
                                                                            obj2.getClass();
                                                                            if (((Boolean) obj2).booleanValue()) {
                                                                                i15 = 8;
                                                                                WinterFlowSerializerStructure(WinterFlowRouterRouter(WinterFlowBatchUI(i12), 8));
                                                                            } else {
                                                                                i15 = 8;
                                                                            }
                                                                            WinterFlowResolverController(this, WinterFlowBatchUI(i12), 2048, num6, i15);
                                                                        } else {
                                                                            WinterFlowRendererOrchestration winterFlowRendererOrchestration7 = WinterFlowCacheWorker.WinterFlowMapperProtocol;
                                                                            if (WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowRendererOrchestration2, winterFlowRendererOrchestration7)) {
                                                                                List list = (List) winterFlowDecoratorBackend4.WinterFlowArrayNetwork(winterFlowRendererOrchestration7);
                                                                                Object WinterFlowUnitTestResponse6 = winterFlowDatabaseSchemaStructure2.WinterFlowUnitTestResponse(winterFlowRendererOrchestration7);
                                                                                if (WinterFlowUnitTestResponse6 == null) {
                                                                                    WinterFlowUnitTestResponse6 = null;
                                                                                }
                                                                                List list2 = (List) WinterFlowUnitTestResponse6;
                                                                                if (list2 != null) {
                                                                                    WinterFlowCacheManagerTransactionManager winterFlowCacheManagerTransactionManager = WinterFlowLoaderSessionManager.WinterFlowRouterStructure;
                                                                                    WinterFlowCacheManagerTransactionManager winterFlowCacheManagerTransactionManager2 = new WinterFlowCacheManagerTransactionManager();
                                                                                    if (list.size() > 0) {
                                                                                        list.get(0).getClass();
                                                                                        WinterFlowEventEmitterOrchestration.WinterFlowVariableBandwidth();
                                                                                        return;
                                                                                    }
                                                                                    WinterFlowCacheManagerTransactionManager winterFlowCacheManagerTransactionManager3 = new WinterFlowCacheManagerTransactionManager();
                                                                                    if (list2.size() > 0) {
                                                                                        list2.get(0).getClass();
                                                                                        WinterFlowEventEmitterOrchestration.WinterFlowVariableBandwidth();
                                                                                        return;
                                                                                    }
                                                                                    i5 = !winterFlowCacheManagerTransactionManager2.equals(winterFlowCacheManagerTransactionManager3) ? 1 : 0;
                                                                                }
                                                                            } else {
                                                                                if (obj2 instanceof WinterFlowDecoratorStrategy) {
                                                                                    WinterFlowDecoratorStrategy winterFlowDecoratorStrategy = (WinterFlowDecoratorStrategy) obj2;
                                                                                    Object WinterFlowUnitTestResponse7 = winterFlowDatabaseSchemaStructure2.WinterFlowUnitTestResponse(winterFlowRendererOrchestration2);
                                                                                    if (WinterFlowUnitTestResponse7 == null) {
                                                                                        WinterFlowUnitTestResponse7 = null;
                                                                                    }
                                                                                    if (winterFlowDecoratorStrategy != WinterFlowUnitTestResponse7) {
                                                                                        if (WinterFlowUnitTestResponse7 instanceof WinterFlowDecoratorStrategy) {
                                                                                            String str3 = winterFlowDecoratorStrategy.WinterFlowRouterStructure;
                                                                                            WinterFlowDecoratorStrategy winterFlowDecoratorStrategy2 = (WinterFlowDecoratorStrategy) WinterFlowUnitTestResponse7;
                                                                                            WinterFlowOrchestrationIDE winterFlowOrchestrationIDE = winterFlowDecoratorStrategy2.WinterFlowHookDataSource;
                                                                                            if (WinterFlowManagerRequest.WinterFlowThreadListener(str3, winterFlowDecoratorStrategy2.WinterFlowRouterStructure)) {
                                                                                                WinterFlowOrchestrationIDE winterFlowOrchestrationIDE2 = winterFlowDecoratorStrategy.WinterFlowHookDataSource;
                                                                                                if (winterFlowOrchestrationIDE2 == null) {
                                                                                                }
                                                                                                if (winterFlowOrchestrationIDE2 != null) {
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    i5 = 0;
                                                                                }
                                                                                i5 = i30;
                                                                            }
                                                                        }
                                                                        WinterFlowOrchestrationSubsystem(winterFlowProcessorSystem2.WinterFlowCacheManagerAgent);
                                                                        int size = arrayList4.size();
                                                                        int i45 = i14;
                                                                        while (true) {
                                                                            if (i45 >= size) {
                                                                                winterFlowWebsocketTransactionManager2 = null;
                                                                                break;
                                                                            } else {
                                                                                if (((WinterFlowWebsocketTransactionManager) arrayList4.get(i45)).WinterFlowVariableVersionControl == i11) {
                                                                                    winterFlowWebsocketTransactionManager2 = (WinterFlowWebsocketTransactionManager) arrayList4.get(i45);
                                                                                    break;
                                                                                }
                                                                                i45++;
                                                                            }
                                                                        }
                                                                        winterFlowWebsocketTransactionManager2.getClass();
                                                                        Object WinterFlowUnitTestResponse8 = winterFlowDatabaseSchemaStructure4.WinterFlowUnitTestResponse(winterFlowRendererOrchestration3);
                                                                        if (WinterFlowUnitTestResponse8 == null) {
                                                                            WinterFlowUnitTestResponse8 = null;
                                                                        }
                                                                        winterFlowWebsocketTransactionManager2.WinterFlowSyntax = (WinterFlowExceptionPlatform) WinterFlowUnitTestResponse8;
                                                                        Object WinterFlowUnitTestResponse9 = winterFlowDatabaseSchemaStructure4.WinterFlowUnitTestResponse(WinterFlowRendererJava.WinterFlowMapperProtocol);
                                                                        if (WinterFlowUnitTestResponse9 == null) {
                                                                            WinterFlowUnitTestResponse9 = null;
                                                                        }
                                                                        winterFlowWebsocketTransactionManager2.WinterFlowResponseEngine = (WinterFlowExceptionPlatform) WinterFlowUnitTestResponse9;
                                                                        if (winterFlowWebsocketTransactionManager2.WinterFlowTransactionManagerStrategy.contains(winterFlowWebsocketTransactionManager2)) {
                                                                            this.WinterFlowRouterRouter.getSnapshotObserver().WinterFlowRouterStructure.WinterFlowCacheManagerAgent(winterFlowWebsocketTransactionManager2, this.WinterFlowQueueService, new WinterFlowJavaSession(i30, winterFlowWebsocketTransactionManager2, this));
                                                                        }
                                                                    }
                                                                    winterFlowProcessorSystem2 = winterFlowProcessorSystem4;
                                                                }
                                                            }
                                                        } else {
                                                            obj2.getClass();
                                                            String str4 = (String) obj2;
                                                            boolean WinterFlowCacheManagerAgent4 = winterFlowDatabaseSchemaStructure3.WinterFlowCacheManagerAgent(winterFlowRendererOrchestration);
                                                            int i46 = i27;
                                                            if (WinterFlowCacheManagerAgent4) {
                                                                WinterFlowConsumerUserManager(str4, i26, i46);
                                                            }
                                                        }
                                                        num6 = num10;
                                                        winterFlowDatabaseSchemaStructure2 = winterFlowDatabaseSchemaStructure3;
                                                        num5 = num9;
                                                        arrayList3 = arrayList5;
                                                        winterFlowProcessorSystem2 = winterFlowProcessorSystem4;
                                                        i12 = i32;
                                                        i10 = i36;
                                                        i11 = i26;
                                                    }
                                                }
                                                int size2 = arrayList5.size();
                                                int i47 = 0;
                                                while (true) {
                                                    if (i47 >= size2) {
                                                        winterFlowWebsocketTransactionManager = null;
                                                        break;
                                                    }
                                                    int i48 = size2;
                                                    if (((WinterFlowWebsocketTransactionManager) arrayList5.get(i47)).WinterFlowVariableVersionControl == i26) {
                                                        winterFlowWebsocketTransactionManager = (WinterFlowWebsocketTransactionManager) arrayList5.get(i47);
                                                        break;
                                                    } else {
                                                        i47++;
                                                        size2 = i48;
                                                    }
                                                }
                                                if (winterFlowWebsocketTransactionManager != null) {
                                                    i13 = 0;
                                                } else {
                                                    winterFlowWebsocketTransactionManager = new WinterFlowWebsocketTransactionManager(i26, arrayList4);
                                                    i13 = i30;
                                                }
                                                arrayList4.add(winterFlowWebsocketTransactionManager);
                                                if (i13 == 0) {
                                                }
                                                winterFlowRendererOrchestration = WinterFlowRendererJava.WinterFlowArrayNetwork;
                                                if (WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowRendererOrchestration2, winterFlowRendererOrchestration)) {
                                                }
                                                num6 = num10;
                                                winterFlowDatabaseSchemaStructure2 = winterFlowDatabaseSchemaStructure3;
                                                num5 = num9;
                                                arrayList3 = arrayList5;
                                                winterFlowProcessorSystem2 = winterFlowProcessorSystem4;
                                                i12 = i32;
                                                i10 = i36;
                                                i11 = i26;
                                            } else {
                                                winterFlowDecoratorBackend2 = winterFlowDecoratorBackend3;
                                                num5 = num9;
                                                arrayList3 = arrayList5;
                                                i9 = i34;
                                                j = j4;
                                                i10 = length2;
                                                num6 = num10;
                                                i11 = i26;
                                                winterFlowDatabaseSchemaStructure2 = winterFlowDatabaseSchemaStructure3;
                                                winterFlowProcessorSystem2 = winterFlowProcessorSystem4;
                                                i12 = i32;
                                            }
                                            i34 = i9 + 1;
                                            winterFlowProcessorSystem4 = winterFlowProcessorSystem2;
                                            i32 = i12;
                                            i27 = 8;
                                            i26 = i11;
                                            length2 = i10;
                                            num10 = num6;
                                            num9 = num5;
                                            arrayList5 = arrayList3;
                                            i30 = 1;
                                            winterFlowDatabaseSchemaStructure3 = winterFlowDatabaseSchemaStructure2;
                                            j4 = j >> 8;
                                            winterFlowDecoratorBackend3 = winterFlowDecoratorBackend2;
                                        }
                                        num4 = num10;
                                        winterFlowDecoratorBackend = winterFlowDecoratorBackend3;
                                        winterFlowDatabaseSchemaStructure = winterFlowDatabaseSchemaStructure3;
                                        num3 = num9;
                                        arrayList2 = arrayList5;
                                        i7 = i32;
                                        i8 = length2;
                                        i4 = i26;
                                        winterFlowProcessorSystem = winterFlowProcessorSystem4;
                                        if (i33 != i27) {
                                            break;
                                        }
                                    } else {
                                        num4 = num10;
                                        winterFlowDecoratorBackend = winterFlowDecoratorBackend3;
                                        winterFlowDatabaseSchemaStructure = winterFlowDatabaseSchemaStructure3;
                                        num3 = num9;
                                        arrayList2 = arrayList5;
                                        i7 = i32;
                                        i8 = length2;
                                        i4 = i26;
                                        winterFlowProcessorSystem = winterFlowProcessorSystem4;
                                    }
                                    if (i31 == i8) {
                                        break;
                                    }
                                    i29 = i31 + 1;
                                    winterFlowProcessorSystem4 = winterFlowProcessorSystem;
                                    i28 = i7;
                                    i26 = i4;
                                    length2 = i8;
                                    num10 = num4;
                                    winterFlowDatabaseSchemaStructure3 = winterFlowDatabaseSchemaStructure;
                                    winterFlowDecoratorBackend3 = winterFlowDecoratorBackend;
                                    num9 = num3;
                                    arrayList5 = arrayList2;
                                    i27 = 8;
                                }
                            } else {
                                winterFlowDecoratorBackend = winterFlowDecoratorBackend3;
                                num3 = num9;
                                arrayList2 = arrayList5;
                                i3 = i24;
                                winterFlowProcessorSystem = winterFlowProcessorSystem3;
                                num4 = num10;
                                i4 = i26;
                                i5 = 0;
                            }
                            if (i5 == 0) {
                                Iterator it = winterFlowDecoratorBackend.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        i6 = 0;
                                        break;
                                    }
                                    if (!winterFlowProcessorSystem.WinterFlowTransactionAgent().WinterFlowVariableVersionControl.WinterFlowCacheManagerAgent((WinterFlowRendererOrchestration) ((Map.Entry) it.next()).getKey())) {
                                        i6 = 1;
                                        break;
                                    }
                                }
                                i5 = i6;
                            }
                            if (i5 != 0) {
                                i2 = 8;
                                WinterFlowResolverController(this, WinterFlowBatchUI(i4), 2048, num4, 8);
                            } else {
                                i2 = 8;
                            }
                            j3 >>= i2;
                            i25 = i + 1;
                            winterFlowJSONAdapter2 = winterFlowJSONAdapter;
                            i23 = i2;
                            num10 = num4;
                            iArr3 = iArr2;
                            jArr3 = jArr2;
                            i24 = i3;
                            num9 = num3;
                            arrayList5 = arrayList2;
                        }
                    }
                    i = i25;
                    num3 = num9;
                    arrayList2 = arrayList5;
                    iArr2 = iArr3;
                    jArr2 = jArr3;
                    i2 = i23;
                    i3 = i24;
                    num4 = num10;
                    j3 >>= i2;
                    i25 = i + 1;
                    winterFlowJSONAdapter2 = winterFlowJSONAdapter;
                    i23 = i2;
                    num10 = num4;
                    iArr3 = iArr2;
                    jArr3 = jArr2;
                    i24 = i3;
                    num9 = num3;
                    arrayList5 = arrayList2;
                }
                num2 = num9;
                arrayList = arrayList5;
                iArr = iArr3;
                jArr = jArr3;
                int i49 = i23;
                int i50 = i24;
                num = num10;
                if (i50 != i49) {
                    return;
                }
            } else {
                num = num10;
                num2 = num9;
                arrayList = arrayList5;
                iArr = iArr3;
                jArr = jArr3;
            }
            if (i20 == i22) {
                return;
            }
            i20++;
            winterFlowJSONAdapter2 = winterFlowJSONAdapter;
            num10 = num;
            i18 = i21;
            iArr3 = iArr;
            jArr3 = jArr;
            num9 = num2;
            arrayList5 = arrayList;
            i19 = 0;
            length = i22;
        }
    }

    public final boolean WinterFlowMapperProtocol(int i, int i2, Integer num, List list) {
        if (i == Integer.MIN_VALUE || !WinterFlowBandwidthObject()) {
            return false;
        }
        AccessibilityEvent WinterFlowRouterRouter = WinterFlowRouterRouter(i, i2);
        if (num != null) {
            WinterFlowRouterRouter.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            WinterFlowRouterRouter.setContentDescription(WinterFlowBackendTool.WinterFlowRouterStructure(list, ",", null, 62));
        }
        return WinterFlowSerializerStructure(WinterFlowRouterRouter);
    }

    public final void WinterFlowOrchestrationSubsystem(WinterFlowSchedulerStructure winterFlowSchedulerStructure) {
        if (this.WinterFlowBackendCacheManager.add(winterFlowSchedulerStructure)) {
            this.WinterFlowEventEmitterController.WinterFlowUnitTestResponse(WinterFlowAlgorithmSession.WinterFlowRouterStructure);
        }
    }

    public final int WinterFlowResponseEngine(WinterFlowProcessorSystem winterFlowProcessorSystem) {
        WinterFlowDecoratorBackend winterFlowDecoratorBackend = winterFlowProcessorSystem.WinterFlowArrayNetwork;
        if (!winterFlowDecoratorBackend.WinterFlowVariableVersionControl.WinterFlowCacheManagerAgent(WinterFlowRendererJava.WinterFlowRouterStructure)) {
            WinterFlowRendererOrchestration winterFlowRendererOrchestration = WinterFlowRendererJava.WinterFlowPackageIDE;
            if (winterFlowDecoratorBackend.WinterFlowVariableVersionControl.WinterFlowCacheManagerAgent(winterFlowRendererOrchestration)) {
                return (int) (((WinterFlowEventProcess) winterFlowDecoratorBackend.WinterFlowArrayNetwork(winterFlowRendererOrchestration)).WinterFlowRouterStructure & 4294967295L);
            }
        }
        return this.WinterFlowResolverController;
    }

    public final void WinterFlowRouterAdapter(WinterFlowProcessorSystem winterFlowProcessorSystem, WinterFlowRouterComponent winterFlowRouterComponent) {
        int[] iArr = WinterFlowConfigurationUtility.WinterFlowRouterStructure;
        WinterFlowMiddlewareFramework winterFlowMiddlewareFramework = new WinterFlowMiddlewareFramework();
        List WinterFlowResponseEngine = WinterFlowProcessorSystem.WinterFlowResponseEngine(4, winterFlowProcessorSystem);
        WinterFlowSchedulerStructure winterFlowSchedulerStructure = winterFlowProcessorSystem.WinterFlowCacheManagerAgent;
        int size = WinterFlowResponseEngine.size();
        for (int i = 0; i < size; i++) {
            WinterFlowProcessorSystem winterFlowProcessorSystem2 = (WinterFlowProcessorSystem) WinterFlowResponseEngine.get(i);
            WinterFlowJSONAdapter WinterFlowServerProtocol = WinterFlowServerProtocol();
            int i2 = winterFlowProcessorSystem2.WinterFlowTransactionManagerStrategy;
            if (WinterFlowServerProtocol.WinterFlowRouterStructure(i2)) {
                if (!winterFlowRouterComponent.WinterFlowHookDataSource.WinterFlowHookDataSource(i2)) {
                    WinterFlowOrchestrationSubsystem(winterFlowSchedulerStructure);
                    return;
                }
                winterFlowMiddlewareFramework.WinterFlowRouterStructure(i2);
            }
        }
        WinterFlowMiddlewareFramework winterFlowMiddlewareFramework2 = winterFlowRouterComponent.WinterFlowHookDataSource;
        int[] iArr2 = winterFlowMiddlewareFramework2.WinterFlowHookDataSource;
        long[] jArr = winterFlowMiddlewareFramework2.WinterFlowRouterStructure;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128 && !winterFlowMiddlewareFramework.WinterFlowHookDataSource(iArr2[(i3 << 3) + i5])) {
                            WinterFlowOrchestrationSubsystem(winterFlowSchedulerStructure);
                            return;
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        List WinterFlowResponseEngine2 = WinterFlowProcessorSystem.WinterFlowResponseEngine(4, winterFlowProcessorSystem);
        int size2 = WinterFlowResponseEngine2.size();
        for (int i6 = 0; i6 < size2; i6++) {
            WinterFlowProcessorSystem winterFlowProcessorSystem3 = (WinterFlowProcessorSystem) WinterFlowResponseEngine2.get(i6);
            WinterFlowRouterComponent winterFlowRouterComponent2 = (WinterFlowRouterComponent) this.WinterFlowSyntaxSubsystem.WinterFlowHookDataSource(winterFlowProcessorSystem3.WinterFlowTransactionManagerStrategy);
            if (winterFlowRouterComponent2 != null && WinterFlowServerProtocol().WinterFlowRouterStructure(winterFlowProcessorSystem3.WinterFlowTransactionManagerStrategy)) {
                WinterFlowRouterAdapter(winterFlowProcessorSystem3, winterFlowRouterComponent2);
            }
        }
    }

    public final AccessibilityEvent WinterFlowRouterRouter(int i, int i2) {
        WinterFlowArrayModule winterFlowArrayModule;
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        obtain.setEnabled(true);
        obtain.setClassName("android.view.View");
        WinterFlowSyntaxTransactionManager winterFlowSyntaxTransactionManager = this.WinterFlowRouterRouter;
        obtain.setPackageName(winterFlowSyntaxTransactionManager.getContext().getPackageName());
        obtain.setSource(winterFlowSyntaxTransactionManager, i);
        if (WinterFlowBandwidthObject() && (winterFlowArrayModule = (WinterFlowArrayModule) WinterFlowServerProtocol().WinterFlowHookDataSource(i)) != null) {
            WinterFlowProcessorSystem winterFlowProcessorSystem = winterFlowArrayModule.WinterFlowRouterStructure;
            obtain.setPassword(winterFlowProcessorSystem.WinterFlowArrayNetwork.WinterFlowVariableVersionControl.WinterFlowCacheManagerAgent(WinterFlowRendererJava.WinterFlowSoftwareEngine));
            Object WinterFlowUnitTestResponse = winterFlowProcessorSystem.WinterFlowArrayNetwork.WinterFlowVariableVersionControl.WinterFlowUnitTestResponse(WinterFlowRendererJava.WinterFlowBandwidthObject);
            if (WinterFlowUnitTestResponse == null) {
                WinterFlowUnitTestResponse = null;
            }
            boolean WinterFlowThreadListener = WinterFlowManagerRequest.WinterFlowThreadListener(WinterFlowUnitTestResponse, Boolean.TRUE);
            if (Build.VERSION.SDK_INT >= 34) {
                WinterFlowThreadPoolHelper.WinterFlowTransactionManagerStrategy(obtain, WinterFlowThreadListener);
            }
        }
        return obtain;
    }

    @Override // com.google.android.datatransport.WinterFlowSyntaxCloud
    public final WinterFlowConfigurationModule WinterFlowRouterStructure(View view) {
        return this.WinterFlowServiceUtility;
    }

    public final boolean WinterFlowSerializerStructure(AccessibilityEvent accessibilityEvent) {
        if (!WinterFlowBandwidthObject()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.WinterFlowVariableBandwidth = true;
        }
        try {
            return ((Boolean) this.WinterFlowResponseEngine.WinterFlowUnitTestResponse(accessibilityEvent)).booleanValue();
        } finally {
            this.WinterFlowVariableBandwidth = false;
        }
    }

    public final WinterFlowJSONAdapter WinterFlowServerProtocol() {
        if (this.WinterFlowArrayHelper) {
            this.WinterFlowArrayHelper = false;
            WinterFlowSyntaxTransactionManager winterFlowSyntaxTransactionManager = this.WinterFlowRouterRouter;
            this.WinterFlowConfigurationSubsystem = WinterFlowEncryptionSubsystem.WinterFlowResolverController(winterFlowSyntaxTransactionManager.getSemanticsOwner(), WinterFlowServiceProviderBatch.WinterFlowRouterRouter);
            if (WinterFlowBandwidthObject()) {
                WinterFlowViewSoftware winterFlowViewSoftware = this.WinterFlowConfigurationSubsystem;
                Resources resources = winterFlowSyntaxTransactionManager.getContext().getResources();
                WinterFlowRouterNode winterFlowRouterNode = this.WinterFlowCacheManagerListener;
                winterFlowRouterNode.WinterFlowRouterStructure();
                WinterFlowRouterNode winterFlowRouterNode2 = this.WinterFlowPackageIDE;
                winterFlowRouterNode2.WinterFlowRouterStructure();
                WinterFlowArrayModule winterFlowArrayModule = (WinterFlowArrayModule) winterFlowViewSoftware.WinterFlowHookDataSource(-1);
                WinterFlowProcessorSystem winterFlowProcessorSystem = winterFlowArrayModule != null ? winterFlowArrayModule.WinterFlowRouterStructure : null;
                winterFlowProcessorSystem.getClass();
                ArrayList WinterFlowHookDataSource = WinterFlowDecoratorNode.WinterFlowHookDataSource(winterFlowProcessorSystem, new WinterFlowProviderFramework(3, winterFlowViewSoftware), new WinterFlowProviderFramework(4, resources), WinterFlowUnitTestLibrary.WinterFlowCacheManagerListener(winterFlowProcessorSystem));
                int i = 1;
                int size = WinterFlowHookDataSource.size() - 1;
                if (1 <= size) {
                    while (true) {
                        int i2 = ((WinterFlowProcessorSystem) WinterFlowHookDataSource.get(i - 1)).WinterFlowTransactionManagerStrategy;
                        int i3 = ((WinterFlowProcessorSystem) WinterFlowHookDataSource.get(i)).WinterFlowTransactionManagerStrategy;
                        winterFlowRouterNode.WinterFlowTransactionManagerStrategy(i2, i3);
                        winterFlowRouterNode2.WinterFlowTransactionManagerStrategy(i3, i2);
                        if (i == size) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return this.WinterFlowConfigurationSubsystem;
    }

    public final WinterFlowVersionParser WinterFlowServiceUtility(WinterFlowProcessorSystem winterFlowProcessorSystem, Rect rect, WinterFlowVersionControlUtility winterFlowVersionControlUtility) {
        WinterFlowIDEAlgorithm winterFlowIDEAlgorithm = new WinterFlowIDEAlgorithm(winterFlowVersionControlUtility);
        WinterFlowSchedulerStructure winterFlowSchedulerStructure = winterFlowProcessorSystem.WinterFlowCacheManagerAgent;
        WinterFlowUserManagerController winterFlowUserManagerController = winterFlowSchedulerStructure.WinterFlowUserManagerUserManager.WinterFlowTransactionManagerStrategy;
        WinterFlowLibraryDeployment winterFlowLibraryDeployment = null;
        if ((winterFlowUserManagerController.WinterFlowRouterRouter & 8) != 0) {
            loop0: while (true) {
                if (winterFlowUserManagerController == null) {
                    break;
                }
                if ((winterFlowUserManagerController.WinterFlowUnitTestResponse & 8) != 0) {
                    WinterFlowUserManagerController winterFlowUserManagerController2 = winterFlowUserManagerController;
                    WinterFlowJSON winterFlowJSON = null;
                    while (winterFlowUserManagerController2 != null) {
                        if (winterFlowUserManagerController2 instanceof WinterFlowHandlerThread) {
                            ((WinterFlowHandlerThread) winterFlowUserManagerController2).WinterFlowSyntax(winterFlowIDEAlgorithm);
                            if (winterFlowIDEAlgorithm.WinterFlowVariableVersionControl) {
                                winterFlowLibraryDeployment = winterFlowUserManagerController2;
                                break loop0;
                            }
                        } else if ((winterFlowUserManagerController2.WinterFlowUnitTestResponse & 8) != 0 && (winterFlowUserManagerController2 instanceof WinterFlowTestingEntity)) {
                            int i = 0;
                            for (WinterFlowUserManagerController winterFlowUserManagerController3 = ((WinterFlowTestingEntity) winterFlowUserManagerController2).WinterFlowBatchUI; winterFlowUserManagerController3 != null; winterFlowUserManagerController3 = winterFlowUserManagerController3.WinterFlowResponseEngine) {
                                if ((winterFlowUserManagerController3.WinterFlowUnitTestResponse & 8) != 0) {
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
                if ((winterFlowUserManagerController.WinterFlowRouterRouter & 8) == 0) {
                    break;
                }
                winterFlowUserManagerController = winterFlowUserManagerController.WinterFlowResponseEngine;
            }
        }
        WinterFlowLibraryDeployment winterFlowLibraryDeployment2 = (WinterFlowHandlerThread) winterFlowLibraryDeployment;
        if (winterFlowLibraryDeployment2 == null || !((WinterFlowUserManagerController) winterFlowLibraryDeployment2).WinterFlowVariableVersionControl.WinterFlowSingletonPlatform) {
            return WinterFlowCloudStack.WinterFlowSyntax(winterFlowSchedulerStructure.WinterFlowUserManagerUserManager.WinterFlowArrayNetwork, false);
        }
        WinterFlowUIMicroservice WinterFlowSoftwareEngine = WinterFlowCloudStack.WinterFlowSoftwareEngine(winterFlowLibraryDeployment2);
        WinterFlowVersionParser WinterFlowVariableBandwidth = WinterFlowCloudStack.WinterFlowBatchUI(WinterFlowSoftwareEngine).WinterFlowVariableBandwidth(WinterFlowSoftwareEngine, false);
        Rect WinterFlowCacheManagerListener = WinterFlowCacheManagerListener(WinterFlowVariableBandwidth.WinterFlowRouterStructure, WinterFlowVariableBandwidth.WinterFlowHookDataSource, WinterFlowVariableBandwidth.WinterFlowCacheManagerAgent, WinterFlowVariableBandwidth.WinterFlowArrayNetwork);
        float f = WinterFlowCacheManagerListener.left - rect.left;
        float f2 = WinterFlowCacheManagerListener.top - rect.top;
        return new WinterFlowVersionParser(f, f2, WinterFlowCacheManagerListener.width() + f, WinterFlowCacheManagerListener.height() + f2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x013f, code lost:
    
        r28 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0149, code lost:
    
        if (((r7 & ((~r7) << 6)) & r20) == 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x014b, code lost:
    
        r25 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void WinterFlowSoftwareEngine() {
        long j;
        long j2;
        long j3;
        char c;
        long[] jArr;
        long[] jArr2;
        long j4;
        int i;
        int i2;
        int i3;
        char c2;
        WinterFlowMiddlewareFramework winterFlowMiddlewareFramework = new WinterFlowMiddlewareFramework();
        WinterFlowMiddlewareFramework winterFlowMiddlewareFramework2 = this.WinterFlowStrategyTool;
        int[] iArr = winterFlowMiddlewareFramework2.WinterFlowHookDataSource;
        long[] jArr3 = winterFlowMiddlewareFramework2.WinterFlowRouterStructure;
        int length = jArr3.length - 2;
        WinterFlowViewSoftware winterFlowViewSoftware = this.WinterFlowSyntaxSubsystem;
        int i4 = 8;
        if (length >= 0) {
            int i5 = 0;
            j = 128;
            j2 = 255;
            while (true) {
                long j5 = jArr3[i5];
                char c3 = 7;
                j3 = -9187201950435737472L;
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    int i7 = 0;
                    while (i7 < i6) {
                        if ((j5 & 255) < 128) {
                            int i8 = iArr[(i5 << 3) + i7];
                            c2 = c3;
                            WinterFlowArrayModule winterFlowArrayModule = (WinterFlowArrayModule) WinterFlowServerProtocol().WinterFlowHookDataSource(i8);
                            WinterFlowProcessorSystem winterFlowProcessorSystem = winterFlowArrayModule != null ? winterFlowArrayModule.WinterFlowRouterStructure : null;
                            if (winterFlowProcessorSystem != null) {
                                if (winterFlowProcessorSystem.WinterFlowArrayNetwork.WinterFlowVariableVersionControl.WinterFlowCacheManagerAgent(WinterFlowRendererJava.WinterFlowArrayNetwork)) {
                                }
                            }
                            winterFlowMiddlewareFramework.WinterFlowRouterStructure(i8);
                            WinterFlowRouterComponent winterFlowRouterComponent = (WinterFlowRouterComponent) winterFlowViewSoftware.WinterFlowHookDataSource(i8);
                            if (winterFlowRouterComponent != null) {
                                Object WinterFlowUnitTestResponse = winterFlowRouterComponent.WinterFlowRouterStructure.WinterFlowVariableVersionControl.WinterFlowUnitTestResponse(WinterFlowRendererJava.WinterFlowArrayNetwork);
                                r23 = WinterFlowUnitTestResponse != 0 ? WinterFlowUnitTestResponse : null;
                            }
                            WinterFlowConsumerUserManager(r23, i8, 32);
                        } else {
                            c2 = c3;
                        }
                        j5 >>= 8;
                        i7++;
                        c3 = c2;
                    }
                    c = c3;
                    if (i6 != 8) {
                        break;
                    }
                } else {
                    c = 7;
                }
                if (i5 == length) {
                    break;
                } else {
                    i5++;
                }
            }
        } else {
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
            c = 7;
        }
        int[] iArr2 = winterFlowMiddlewareFramework.WinterFlowHookDataSource;
        long[] jArr4 = winterFlowMiddlewareFramework.WinterFlowRouterStructure;
        int length2 = jArr4.length - 2;
        if (length2 >= 0) {
            int i9 = 0;
            while (true) {
                long j6 = jArr4[i9];
                if ((((~j6) << c) & j6 & j3) != j3) {
                    int i10 = 8 - ((~(i9 - length2)) >>> 31);
                    int i11 = 0;
                    while (i11 < i10) {
                        if ((j6 & j2) < j) {
                            int i12 = iArr2[(i9 << 3) + i11];
                            int hashCode = Integer.hashCode(i12) * (-862048943);
                            int i13 = hashCode ^ (hashCode << 16);
                            int i14 = i13 & 127;
                            int i15 = winterFlowMiddlewareFramework2.WinterFlowCacheManagerAgent;
                            int i16 = (i13 >>> 7) & i15;
                            i = i4;
                            int i17 = 0;
                            while (true) {
                                long[] jArr5 = winterFlowMiddlewareFramework2.WinterFlowRouterStructure;
                                int i18 = i16 >> 3;
                                jArr2 = jArr4;
                                int i19 = (i16 & 7) << 3;
                                j4 = j6;
                                long j7 = (jArr5[i18] >>> i19) | ((jArr5[i18 + 1] << (64 - i19)) & ((-i19) >> 63));
                                int i20 = i15;
                                long j8 = (i14 * 72340172838076673L) ^ j7;
                                long j9 = (j8 - 72340172838076673L) & (~j8) & j3;
                                while (true) {
                                    if (j9 == 0) {
                                        break;
                                    }
                                    i3 = (i16 + (Long.numberOfTrailingZeros(j9) >> 3)) & i20;
                                    int i21 = i20;
                                    if (winterFlowMiddlewareFramework2.WinterFlowHookDataSource[i3] == i12) {
                                        break;
                                    }
                                    j9 &= j9 - 1;
                                    i20 = i21;
                                }
                                i17 += 8;
                                i16 = (i16 + i17) & i2;
                                jArr4 = jArr2;
                                i15 = i2;
                                j6 = j4;
                            }
                            int i22 = i3;
                            if (i22 >= 0) {
                                winterFlowMiddlewareFramework2.WinterFlowTransactionManagerStrategy(i22);
                            }
                        } else {
                            jArr2 = jArr4;
                            j4 = j6;
                            i = i4;
                        }
                        j6 = j4 >> i;
                        i11++;
                        i4 = i;
                        jArr4 = jArr2;
                    }
                    jArr = jArr4;
                    if (i10 != i4) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                }
                if (i9 == length2) {
                    break;
                }
                i9++;
                jArr4 = jArr;
                i4 = 8;
            }
        }
        winterFlowViewSoftware.WinterFlowCacheManagerAgent();
        WinterFlowJSONAdapter WinterFlowServerProtocol = WinterFlowServerProtocol();
        int[] iArr3 = WinterFlowServerProtocol.WinterFlowHookDataSource;
        Object[] objArr = WinterFlowServerProtocol.WinterFlowCacheManagerAgent;
        long[] jArr6 = WinterFlowServerProtocol.WinterFlowRouterStructure;
        int length3 = jArr6.length - 2;
        if (length3 >= 0) {
            int i23 = 0;
            while (true) {
                long j10 = jArr6[i23];
                if ((((~j10) << c) & j10 & j3) != j3) {
                    int i24 = 8 - ((~(i23 - length3)) >>> 31);
                    for (int i25 = 0; i25 < i24; i25++) {
                        if ((j10 & j2) < j) {
                            int i26 = (i23 << 3) + i25;
                            int i27 = iArr3[i26];
                            WinterFlowProcessorSystem winterFlowProcessorSystem2 = ((WinterFlowArrayModule) objArr[i26]).WinterFlowRouterStructure;
                            WinterFlowDecoratorBackend winterFlowDecoratorBackend = winterFlowProcessorSystem2.WinterFlowArrayNetwork;
                            WinterFlowRendererOrchestration winterFlowRendererOrchestration = WinterFlowRendererJava.WinterFlowArrayNetwork;
                            if (winterFlowDecoratorBackend.WinterFlowVariableVersionControl.WinterFlowCacheManagerAgent(winterFlowRendererOrchestration) && winterFlowMiddlewareFramework2.WinterFlowRouterStructure(i27)) {
                                WinterFlowConsumerUserManager((String) winterFlowProcessorSystem2.WinterFlowArrayNetwork.WinterFlowArrayNetwork(winterFlowRendererOrchestration), i27, 16);
                            }
                            winterFlowViewSoftware.WinterFlowRouterRouter(i27, new WinterFlowRouterComponent(winterFlowProcessorSystem2, WinterFlowServerProtocol()));
                        }
                        j10 >>= 8;
                    }
                    if (i24 != 8) {
                        break;
                    }
                }
                if (i23 == length3) {
                    break;
                } else {
                    i23++;
                }
            }
        }
        this.WinterFlowTestingNode = new WinterFlowRouterComponent(this.WinterFlowRouterRouter.getSemanticsOwner().WinterFlowRouterStructure(), WinterFlowServerProtocol());
    }

    public final AccessibilityEvent WinterFlowSyntax(int i, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent WinterFlowRouterRouter = WinterFlowRouterRouter(i, 8192);
        if (num != null) {
            WinterFlowRouterRouter.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            WinterFlowRouterRouter.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            WinterFlowRouterRouter.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            WinterFlowRouterRouter.getText().add(charSequence);
        }
        return WinterFlowRouterRouter;
    }

    public final int WinterFlowTransactionAgent(WinterFlowProcessorSystem winterFlowProcessorSystem) {
        WinterFlowDecoratorBackend winterFlowDecoratorBackend = winterFlowProcessorSystem.WinterFlowArrayNetwork;
        if (!winterFlowDecoratorBackend.WinterFlowVariableVersionControl.WinterFlowCacheManagerAgent(WinterFlowRendererJava.WinterFlowRouterStructure)) {
            WinterFlowRendererOrchestration winterFlowRendererOrchestration = WinterFlowRendererJava.WinterFlowPackageIDE;
            if (winterFlowDecoratorBackend.WinterFlowVariableVersionControl.WinterFlowCacheManagerAgent(winterFlowRendererOrchestration)) {
                return (int) (((WinterFlowEventProcess) winterFlowDecoratorBackend.WinterFlowArrayNetwork(winterFlowRendererOrchestration)).WinterFlowRouterStructure >> 32);
            }
        }
        return this.WinterFlowResolverController;
    }

    public final boolean WinterFlowTransactionManagerStrategy(boolean z, int i, long j) {
        WinterFlowRendererOrchestration winterFlowRendererOrchestration;
        int i2;
        if (WinterFlowManagerRequest.WinterFlowThreadListener(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            WinterFlowJSONAdapter WinterFlowServerProtocol = WinterFlowServerProtocol();
            if (!WinterFlowHandlerResolver.WinterFlowHookDataSource(j, 9205357640488583168L) && (((9223372034707292159L & j) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                if (z) {
                    winterFlowRendererOrchestration = WinterFlowRendererJava.WinterFlowMapperProtocol;
                } else {
                    if (z) {
                        WinterFlowEventEmitterOrchestration.WinterFlowRouterStructure();
                        return false;
                    }
                    winterFlowRendererOrchestration = WinterFlowRendererJava.WinterFlowSerializerStructure;
                }
                Object[] objArr = WinterFlowServerProtocol.WinterFlowCacheManagerAgent;
                long[] jArr = WinterFlowServerProtocol.WinterFlowRouterStructure;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    boolean z2 = false;
                    while (true) {
                        long j2 = jArr[i3];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8;
                            int i5 = 8 - ((~(i3 - length)) >>> 31);
                            int i6 = 0;
                            while (i6 < i5) {
                                if ((255 & j2) < 128) {
                                    WinterFlowArrayModule winterFlowArrayModule = (WinterFlowArrayModule) objArr[(i3 << 3) + i6];
                                    WinterFlowLibraryInterface winterFlowLibraryInterface = winterFlowArrayModule.WinterFlowHookDataSource;
                                    float f = winterFlowLibraryInterface.WinterFlowRouterStructure;
                                    i2 = i4;
                                    float f2 = winterFlowLibraryInterface.WinterFlowHookDataSource;
                                    float f3 = winterFlowLibraryInterface.WinterFlowCacheManagerAgent;
                                    float f4 = winterFlowLibraryInterface.WinterFlowArrayNetwork;
                                    float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                                    float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
                                    if ((intBitsToFloat2 < f4) & (intBitsToFloat >= f) & (intBitsToFloat < f3) & (intBitsToFloat2 >= f2)) {
                                        Object WinterFlowUnitTestResponse = winterFlowArrayModule.WinterFlowRouterStructure.WinterFlowArrayNetwork.WinterFlowVariableVersionControl.WinterFlowUnitTestResponse(winterFlowRendererOrchestration);
                                        if (WinterFlowUnitTestResponse == null) {
                                            WinterFlowUnitTestResponse = null;
                                        }
                                        WinterFlowExceptionPlatform winterFlowExceptionPlatform = (WinterFlowExceptionPlatform) WinterFlowUnitTestResponse;
                                        if (winterFlowExceptionPlatform != null) {
                                            WinterFlowObjectUI winterFlowObjectUI = winterFlowExceptionPlatform.WinterFlowRouterStructure;
                                            if (i < 0) {
                                                if (((Number) winterFlowObjectUI.WinterFlowRouterStructure()).floatValue() <= 0.0f) {
                                                }
                                                z2 = true;
                                            } else {
                                                if (((Number) winterFlowObjectUI.WinterFlowRouterStructure()).floatValue() >= ((Number) winterFlowExceptionPlatform.WinterFlowHookDataSource.WinterFlowRouterStructure()).floatValue()) {
                                                }
                                                z2 = true;
                                            }
                                        }
                                    }
                                } else {
                                    i2 = i4;
                                }
                                j2 >>= i2;
                                i6++;
                                i4 = i2;
                            }
                            if (i5 != i4) {
                                return z2;
                            }
                        }
                        if (i3 == length) {
                            return z2;
                        }
                        i3++;
                    }
                }
            }
        }
        return false;
    }

    public final void WinterFlowUnitTestResponse() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (WinterFlowBandwidthObject()) {
                WinterFlowRouterAdapter(this.WinterFlowRouterRouter.getSemanticsOwner().WinterFlowRouterStructure(), this.WinterFlowTestingNode);
            }
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                WinterFlowEventEmitterController(WinterFlowServerProtocol());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    WinterFlowSoftwareEngine();
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f7, code lost:
    
        if (com.google.android.datatransport.WinterFlowManagerRequest.WinterFlowSerializerStructure(r4, r2) == r7) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0076 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:12:0x0030, B:15:0x005c, B:21:0x006e, B:23:0x0076, B:25:0x007f, B:27:0x0085, B:29:0x0094, B:31:0x009c, B:54:0x0046, B:56:0x004d), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00f7 -> B:14:0x00fa). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WinterFlowVariableVersionControl(WinterFlowOrchestrationCompiler winterFlowOrchestrationCompiler) {
        WinterFlowTransactionManagerNetwork winterFlowTransactionManagerNetwork;
        int i;
        WinterFlowRepositoryDatabase winterFlowRepositoryDatabase;
        WinterFlowRepositoryDatabase winterFlowRepositoryDatabase2;
        WinterFlowMiddlewareFramework winterFlowMiddlewareFramework;
        WinterFlowThreadPoolServiceProvider winterFlowThreadPoolServiceProvider;
        WinterFlowMiddlewareFramework winterFlowMiddlewareFramework2;
        WinterFlowThreadPoolServiceProvider winterFlowThreadPoolServiceProvider2;
        int i2;
        long j;
        Object WinterFlowHookDataSource;
        try {
            if (winterFlowOrchestrationCompiler instanceof WinterFlowTransactionManagerNetwork) {
                winterFlowTransactionManagerNetwork = (WinterFlowTransactionManagerNetwork) winterFlowOrchestrationCompiler;
                int i3 = winterFlowTransactionManagerNetwork.WinterFlowServerProtocol;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    winterFlowTransactionManagerNetwork.WinterFlowServerProtocol = i3 - Integer.MIN_VALUE;
                    Object obj = winterFlowTransactionManagerNetwork.WinterFlowResponseEngine;
                    i = winterFlowTransactionManagerNetwork.WinterFlowServerProtocol;
                    winterFlowRepositoryDatabase = this.WinterFlowBackendCacheManager;
                    WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
                    if (i != 0) {
                        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                        winterFlowMiddlewareFramework = new WinterFlowMiddlewareFramework();
                        WinterFlowWorkerThreadPool winterFlowWorkerThreadPool = this.WinterFlowEventEmitterController;
                        winterFlowWorkerThreadPool.getClass();
                        winterFlowThreadPoolServiceProvider = new WinterFlowThreadPoolServiceProvider(winterFlowWorkerThreadPool);
                        winterFlowTransactionManagerNetwork.WinterFlowRouterRouter = winterFlowMiddlewareFramework;
                        winterFlowTransactionManagerNetwork.WinterFlowSyntax = winterFlowThreadPoolServiceProvider;
                        winterFlowTransactionManagerNetwork.WinterFlowServerProtocol = 1;
                        WinterFlowHookDataSource = winterFlowThreadPoolServiceProvider.WinterFlowHookDataSource(winterFlowTransactionManagerNetwork);
                        if (WinterFlowHookDataSource != winterFlowListenerJava) {
                        }
                    } else if (i == 1) {
                        winterFlowThreadPoolServiceProvider2 = winterFlowTransactionManagerNetwork.WinterFlowSyntax;
                        winterFlowMiddlewareFramework2 = winterFlowTransactionManagerNetwork.WinterFlowRouterRouter;
                        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                        if (((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i != 2) {
                            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        winterFlowThreadPoolServiceProvider2 = winterFlowTransactionManagerNetwork.WinterFlowSyntax;
                        winterFlowMiddlewareFramework2 = winterFlowTransactionManagerNetwork.WinterFlowRouterRouter;
                        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                        char c = 2;
                        winterFlowRepositoryDatabase2 = winterFlowRepositoryDatabase;
                        winterFlowMiddlewareFramework = winterFlowMiddlewareFramework2;
                        winterFlowRepositoryDatabase = winterFlowRepositoryDatabase2;
                        winterFlowThreadPoolServiceProvider = winterFlowThreadPoolServiceProvider2;
                        winterFlowTransactionManagerNetwork.WinterFlowRouterRouter = winterFlowMiddlewareFramework;
                        winterFlowTransactionManagerNetwork.WinterFlowSyntax = winterFlowThreadPoolServiceProvider;
                        winterFlowTransactionManagerNetwork.WinterFlowServerProtocol = 1;
                        WinterFlowHookDataSource = winterFlowThreadPoolServiceProvider.WinterFlowHookDataSource(winterFlowTransactionManagerNetwork);
                        if (WinterFlowHookDataSource != winterFlowListenerJava) {
                            return winterFlowListenerJava;
                        }
                        WinterFlowThreadPoolServiceProvider winterFlowThreadPoolServiceProvider3 = winterFlowThreadPoolServiceProvider;
                        winterFlowMiddlewareFramework2 = winterFlowMiddlewareFramework;
                        obj = WinterFlowHookDataSource;
                        winterFlowThreadPoolServiceProvider2 = winterFlowThreadPoolServiceProvider3;
                        if (((Boolean) obj).booleanValue()) {
                            winterFlowRepositoryDatabase.clear();
                            return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                        }
                        winterFlowThreadPoolServiceProvider2.WinterFlowCacheManagerAgent();
                        if (WinterFlowBandwidthObject()) {
                            int i4 = winterFlowRepositoryDatabase.WinterFlowUnitTestResponse;
                            for (int i5 = 0; i5 < i4; i5++) {
                                WinterFlowSchedulerStructure winterFlowSchedulerStructure = (WinterFlowSchedulerStructure) winterFlowRepositoryDatabase.WinterFlowTransactionManagerStrategy[i5];
                                WinterFlowArrayHelper(winterFlowSchedulerStructure, winterFlowMiddlewareFramework2);
                                WinterFlowCompilerVariable(winterFlowSchedulerStructure);
                            }
                            winterFlowMiddlewareFramework2.WinterFlowArrayNetwork = 0;
                            long[] jArr = winterFlowMiddlewareFramework2.WinterFlowRouterStructure;
                            if (jArr != WinterFlowDatabaseSchemaUtility.WinterFlowRouterStructure) {
                                try {
                                    WinterFlowProtocolPipeline.WinterFlowConfiguration(jArr, -9187201950435737472L);
                                    long[] jArr2 = winterFlowMiddlewareFramework2.WinterFlowRouterStructure;
                                    i2 = winterFlowMiddlewareFramework2.WinterFlowCacheManagerAgent;
                                    int i6 = i2 >> 3;
                                    jArr2[i6] = ((~j) & jArr2[i6]) | j;
                                } catch (Throwable th) {
                                    th = th;
                                    winterFlowRepositoryDatabase2.clear();
                                    throw th;
                                }
                                j = 255 << ((i2 & 7) << 3);
                                winterFlowRepositoryDatabase2 = winterFlowRepositoryDatabase;
                            } else {
                                winterFlowRepositoryDatabase2 = winterFlowRepositoryDatabase;
                            }
                            winterFlowMiddlewareFramework2.WinterFlowVariableVersionControl = WinterFlowDatabaseSchemaUtility.WinterFlowRouterStructure(winterFlowMiddlewareFramework2.WinterFlowCacheManagerAgent) - winterFlowMiddlewareFramework2.WinterFlowArrayNetwork;
                            Handler handler = this.WinterFlowRouterRouter.getHandler();
                            if (!this.WinterFlowCompilerHandler && handler != null) {
                                this.WinterFlowCompilerHandler = true;
                                handler.post(this.WinterFlowCloudMicroservice);
                            }
                        } else {
                            winterFlowRepositoryDatabase2 = winterFlowRepositoryDatabase;
                        }
                        winterFlowRepositoryDatabase2.clear();
                        this.WinterFlowBatchUI.WinterFlowCacheManagerAgent();
                        this.WinterFlowRouterAdapter.WinterFlowCacheManagerAgent();
                        long j2 = this.WinterFlowServerProtocol;
                        winterFlowTransactionManagerNetwork.WinterFlowRouterRouter = winterFlowMiddlewareFramework2;
                        winterFlowTransactionManagerNetwork.WinterFlowSyntax = winterFlowThreadPoolServiceProvider2;
                        c = 2;
                        winterFlowTransactionManagerNetwork.WinterFlowServerProtocol = 2;
                    }
                }
            }
            if (i != 0) {
            }
        } catch (Throwable th2) {
            th = th2;
            winterFlowRepositoryDatabase2 = winterFlowRepositoryDatabase;
        }
        winterFlowTransactionManagerNetwork = new WinterFlowTransactionManagerNetwork(this, winterFlowOrchestrationCompiler);
        Object obj2 = winterFlowTransactionManagerNetwork.WinterFlowResponseEngine;
        i = winterFlowTransactionManagerNetwork.WinterFlowServerProtocol;
        winterFlowRepositoryDatabase = this.WinterFlowBackendCacheManager;
        WinterFlowListenerJava winterFlowListenerJava2 = WinterFlowListenerJava.WinterFlowVariableVersionControl;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        this.WinterFlowThreadListener = null;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        this.WinterFlowThreadListener = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager = this.WinterFlowTransactionAgent;
        if (accessibilityManager.isEnabled()) {
            this.WinterFlowThreadListener = null;
        }
        accessibilityManager.addAccessibilityStateChangeListener(this);
        accessibilityManager.addTouchExplorationStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Handler handler = this.WinterFlowRouterRouter.getHandler();
        handler.getClass();
        handler.removeCallbacks(this.WinterFlowCloudMicroservice);
        AccessibilityManager accessibilityManager = this.WinterFlowTransactionAgent;
        accessibilityManager.removeAccessibilityStateChangeListener(this);
        accessibilityManager.removeTouchExplorationStateChangeListener(this);
    }
}
