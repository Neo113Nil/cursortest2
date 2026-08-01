package com.google.android.datatransport;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.util.SparseLongArray;
import android.view.FocusFinder;
import android.view.GestureDetector;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.icewinter.flow.winter.icecatch.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowSyntaxTransactionManager extends ViewGroup implements WinterFlowListenerService, WinterFlowWorkerWebsocket, WinterFlowJSONWorker, WinterFlowRendererRouter, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnTouchModeChangeListener, WinterFlowResolverProtocol {
    public static WinterFlowTransactionManagerConsumer WinterFlowDatabaseSchemaComponent;
    public static Class WinterFlowHandlerConsumer;
    public static final WinterFlowMicroserviceFunction WinterFlowQueryModule = new WinterFlowMicroserviceFunction();
    public static Method WinterFlowRendererPackage;
    public static Method WinterFlowRequestStrategy;
    public static Method WinterFlowSyntaxSingleton;
    public long WinterFlowAPIFrontend;
    public long WinterFlowArrayFramework;
    public final WinterFlowInterfaceManager WinterFlowArrayHelper;
    public final WinterFlowSchedulerStructure WinterFlowBackendCacheManager;
    public final int[] WinterFlowBandwidth;
    public final WinterFlowResolverSubsystem WinterFlowBandwidthObject;
    public final WinterFlowVersionControlDeployment WinterFlowBatchUI;
    public final float[] WinterFlowCacheManagerException;
    public final WinterFlowClassPlatform WinterFlowCacheManagerListener;
    public final WinterFlowHookThreadPool WinterFlowCacheTool;
    public final WinterFlowUnitTestScript WinterFlowClassConsumer;
    public final WinterFlowResolverSubsystem WinterFlowCloudMicroservice;
    public final WinterFlowServiceProviderTransactionManager WinterFlowCompilerDataSource;
    public final WinterFlowGatewaySyntax WinterFlowCompilerHandler;
    public final WinterFlowClassBackend WinterFlowCompilerVariable;
    public final WinterFlowHookMechanism WinterFlowConcurrencyThread;
    public final WinterFlowViewProvider WinterFlowConfiguration;
    public final WinterFlowBackendEventEmitter WinterFlowConfigurationSubsystem;
    public final WinterFlowServerLibrary WinterFlowConsumerUserManager;
    public final WinterFlowSessionManagerProcess WinterFlowControllerCache;
    public final WinterFlowRuntimeInvoker WinterFlowDatabase;
    public final WinterFlowCacheManagerVersionControl WinterFlowDatabaseSchemaUtility;
    public View WinterFlowDebugSession;
    public boolean WinterFlowEncryptionAdapter;
    public final WinterFlowViewSoftware WinterFlowEventEmitterController;
    public MotionEvent WinterFlowFrameworkCacheManager;
    public boolean WinterFlowFrameworkTransaction;
    public final WinterFlowRepositoryFramework WinterFlowFrontendBackend;
    public final WinterFlowFrontendDeserialization WinterFlowFunctionPipeline;
    public final WinterFlowPipelineWidget WinterFlowHandlerJSON;
    public WinterFlowPipelinePipeline WinterFlowHookQuery;
    public final WinterFlowDeploymentArray WinterFlowInheritanceJava;
    public final WinterFlowGatewayDeserialization WinterFlowMapperProtocol;
    public WinterFlowHandlerConsumer WinterFlowModuleAgent;
    public final AtomicReference WinterFlowModuleService;
    public WinterFlowManagerHelper WinterFlowOrchestrationConfiguration;
    public final View WinterFlowOrchestrationSubsystem;
    public final WinterFlowResponseJava WinterFlowPackageIDE;
    public final WinterFlowResolverSubsystem WinterFlowParserPipeline;
    public long WinterFlowPipelineSoftware;
    public final WinterFlowSessionManagerProcess WinterFlowProtocolConsumer;
    public boolean WinterFlowProxyStructure;
    public boolean WinterFlowQueryDeserialization;
    public final WinterFlowStackProvider WinterFlowQueueService;
    public WinterFlowThreadPoolProcess WinterFlowRefactoringThreadPool;
    public final WinterFlowStrategyVersionControl WinterFlowRepositoryAlgorithm;
    public WinterFlowObjectSession WinterFlowRepositoryBackend;
    public final WinterFlowRefactoringThreadPool WinterFlowResolverController;
    public final WinterFlowThreadPoolGateway WinterFlowResolverListener;
    public WinterFlowCloudThread WinterFlowResponseEngine;
    public final WinterFlowResolverSubsystem WinterFlowRouterAdapter;
    public WinterFlowDataSourceRenderer WinterFlowRouterRouter;
    public final WinterFlowPipelineWidget WinterFlowSerializerStructure;
    public WinterFlowDebugModule WinterFlowServerProtocol;
    public final WinterFlowDeploymentSystem WinterFlowServerStack;
    public final WinterFlowWorkerDatabaseSchema WinterFlowServiceUtility;
    public boolean WinterFlowSessionManagerInterface;
    public WinterFlowEncryptionMicroservice WinterFlowSingletonPlatform;
    public final WinterFlowResolverSubsystem WinterFlowSingletonWidget;
    public WinterFlowMicroserviceFunction WinterFlowSoftwareEngine;
    public final WinterFlowCloudDataSource WinterFlowSoftwareProtocol;
    public final WinterFlowRendererDataSource WinterFlowSoftwareServiceProvider;
    public boolean WinterFlowStrategyHook;
    public WinterFlowVariableAgent WinterFlowStrategyTool;
    public final WinterFlowProtocolStrategy WinterFlowSyntax;
    public boolean WinterFlowSyntaxSubsystem;
    public boolean WinterFlowTestingNode;
    public final WinterFlowResolverConsumer WinterFlowTestingTransactionManager;
    public final WinterFlowOrchestrationValidator WinterFlowThreadListener;
    public WinterFlowConsumerHandler WinterFlowThreadPoolEventEmitter;
    public WinterFlowEventEmitterNetwork WinterFlowTransactionAgent;
    public long WinterFlowTransactionManagerStrategy;
    public final WinterFlowPipelineWidget WinterFlowUIMiddleware;
    public float WinterFlowUIPlatform;
    public final WinterFlowViewTool WinterFlowUIThreadPool;
    public final boolean WinterFlowUnitTestResponse;
    public boolean WinterFlowUserManagerAdapter;
    public float WinterFlowUserManagerConcurrency;
    public final WinterFlowMicroserviceFunction WinterFlowUserManagerUserManager;
    public final WinterFlowScriptWebsocket WinterFlowValidatorHandler;
    public final WinterFlowMicroserviceFunction WinterFlowValidatorNetwork;
    public final WinterFlowMiddlewareStack WinterFlowVariableBandwidth;
    public final WinterFlowConsumerServiceProvider WinterFlowVariableInterface;
    public final WinterFlowResolverSubsystem WinterFlowVariableVersionControl;
    public final float[] WinterFlowVersionControlModule;
    public final WinterFlowWorkerDatabaseSchema WinterFlowWidgetProcess;
    public long WinterFlowXMLFramework;

    public WinterFlowSyntaxTransactionManager(Context context, WinterFlowTransactionManagerEncryption winterFlowTransactionManagerEncryption) {
        super(context);
        this.WinterFlowVariableVersionControl = WinterFlowDecoratorUI.WinterFlowSerializerStructure(winterFlowTransactionManagerEncryption);
        this.WinterFlowTransactionManagerStrategy = 9205357640488583168L;
        int i = 1;
        this.WinterFlowUnitTestResponse = true;
        this.WinterFlowSyntax = winterFlowTransactionManagerEncryption.WinterFlowSingletonPlatform;
        this.WinterFlowServerProtocol = WinterFlowCacheUtility.WinterFlowCacheManagerListener;
        this.WinterFlowThreadListener = new WinterFlowOrchestrationValidator();
        int i2 = 0;
        this.WinterFlowServiceUtility = new WinterFlowWorkerDatabaseSchema(this, i2);
        this.WinterFlowBandwidthObject = new WinterFlowResolverSubsystem(WinterFlowUnitTestLibrary.WinterFlowHookDataSource(context), WinterFlowSessionManagerProcess.WinterFlowMapperProtocol);
        this.WinterFlowConcurrencyThread = new WinterFlowHookMechanism(this, this);
        this.WinterFlowSingletonPlatform = winterFlowTransactionManagerEncryption.WinterFlowHookDataSource.WinterFlowResponseEngine();
        this.WinterFlowVariableBandwidth = new WinterFlowMiddlewareStack();
        this.WinterFlowBatchUI = new WinterFlowVersionControlDeployment(0);
        this.WinterFlowRouterAdapter = WinterFlowDecoratorUI.WinterFlowSerializerStructure(Boolean.FALSE);
        this.WinterFlowSerializerStructure = WinterFlowInheritanceConcurrency.WinterFlowHookDataSource(new WinterFlowRendererDataSource(this, i2));
        this.WinterFlowMapperProtocol = winterFlowTransactionManagerEncryption.WinterFlowBatchUI;
        this.WinterFlowResolverController = winterFlowTransactionManagerEncryption.WinterFlowConcurrencyThread;
        this.WinterFlowConsumerUserManager = new WinterFlowServerLibrary();
        int i3 = 3;
        WinterFlowSchedulerStructure winterFlowSchedulerStructure = new WinterFlowSchedulerStructure(3);
        winterFlowSchedulerStructure.WinterFlowVariableInterface(WinterFlowValidatorScheduler.WinterFlowHookDataSource);
        winterFlowSchedulerStructure.WinterFlowOrchestrationConfiguration(getDensity());
        winterFlowSchedulerStructure.WinterFlowBandwidth(getViewConfiguration());
        winterFlowSchedulerStructure.WinterFlowAPIFrontend(new WinterFlowModuleUtility(this).WinterFlowCacheManagerAgent(((WinterFlowHookMechanism) getFocusOwner()).WinterFlowVariableVersionControl).WinterFlowCacheManagerAgent(getDragAndDropManager().WinterFlowCacheManagerAgent));
        this.WinterFlowBackendCacheManager = winterFlowSchedulerStructure;
        WinterFlowViewSoftware winterFlowViewSoftware = WinterFlowVersionControlAgent.WinterFlowRouterStructure;
        this.WinterFlowEventEmitterController = new WinterFlowViewSoftware();
        getLayoutNodes();
        this.WinterFlowArrayHelper = new WinterFlowInterfaceManager(this);
        this.WinterFlowCompilerVariable = new WinterFlowClassBackend(getRoot(), new WinterFlowPackageNode(), getLayoutNodes());
        WinterFlowBackendEventEmitter winterFlowBackendEventEmitter = new WinterFlowBackendEventEmitter(this);
        this.WinterFlowConfigurationSubsystem = winterFlowBackendEventEmitter;
        this.WinterFlowStrategyTool = new WinterFlowVariableAgent(this, new WinterFlowObjectRuntime(0, this, WinterFlowEncryptionSubsystem.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/contentcapture/ContentCaptureSessionWrapper;", 1, 0));
        this.WinterFlowCacheManagerListener = winterFlowTransactionManagerEncryption.WinterFlowResponseEngine;
        this.WinterFlowPackageIDE = new WinterFlowResponseJava(this);
        this.WinterFlowSoftwareProtocol = new WinterFlowCloudDataSource();
        this.WinterFlowUserManagerUserManager = new WinterFlowMicroserviceFunction();
        this.WinterFlowCompilerHandler = new WinterFlowGatewaySyntax();
        WinterFlowSchedulerStructure root = getRoot();
        WinterFlowRepositoryFramework winterFlowRepositoryFramework = new WinterFlowRepositoryFramework();
        winterFlowRepositoryFramework.WinterFlowHookDataSource = root;
        winterFlowRepositoryFramework.WinterFlowCacheManagerAgent = new WinterFlowParserVersionControl(root.WinterFlowUserManagerUserManager.WinterFlowCacheManagerAgent);
        winterFlowRepositoryFramework.WinterFlowArrayNetwork = new WinterFlowJSONDecorator(18);
        winterFlowRepositoryFramework.WinterFlowVariableVersionControl = new WinterFlowProxyService();
        this.WinterFlowFrontendBackend = winterFlowRepositoryFramework;
        this.WinterFlowCloudMicroservice = WinterFlowDecoratorUI.WinterFlowSerializerStructure(new Configuration(context.getResources().getConfiguration()));
        this.WinterFlowUIMiddleware = WinterFlowInheritanceConcurrency.WinterFlowHookDataSource(new WinterFlowRendererDataSource(this, i));
        WinterFlowCloudDataSource autofillTree = getAutofillTree();
        WinterFlowStackProvider winterFlowStackProvider = new WinterFlowStackProvider();
        winterFlowStackProvider.WinterFlowVariableVersionControl = this;
        winterFlowStackProvider.WinterFlowTransactionManagerStrategy = autofillTree;
        AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
        if (autofillManager == null) {
            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Autofill service could not be located.");
            throw null;
        }
        winterFlowStackProvider.WinterFlowUnitTestResponse = autofillManager;
        setImportantForAutofill(1);
        AutofillId autofillId = getAutofillId();
        if (autofillId == null) {
            throw WinterFlowResolverBackend.WinterFlowUnitTestResponse("Required value was null.");
        }
        winterFlowStackProvider.WinterFlowRouterRouter = autofillId;
        this.WinterFlowQueueService = winterFlowStackProvider;
        AutofillManager autofillManager2 = (AutofillManager) context.getSystemService(AutofillManager.class);
        if (autofillManager2 == null) {
            throw WinterFlowResolverBackend.WinterFlowUnitTestResponse("Autofill service could not be located.");
        }
        this.WinterFlowCacheTool = new WinterFlowHookThreadPool(new WinterFlowJSONDecorator(17, autofillManager2), getSemanticsOwner(), this, getRectManager(), context.getPackageName());
        this.WinterFlowConfiguration = winterFlowTransactionManagerEncryption.WinterFlowServerProtocol;
        this.WinterFlowValidatorHandler = winterFlowTransactionManagerEncryption.WinterFlowThreadListener;
        this.WinterFlowCompilerDataSource = new WinterFlowServiceProviderTransactionManager(new WinterFlowCacheManagerDatabase(this, i));
        this.WinterFlowVariableInterface = new WinterFlowConsumerServiceProvider(getRoot());
        this.WinterFlowAPIFrontend = 9223372034707292159L;
        this.WinterFlowBandwidth = new int[]{0, 0};
        float[] WinterFlowVariableBandwidth = WinterFlowUnitTestLibrary.WinterFlowVariableBandwidth();
        this.WinterFlowCacheManagerException = WinterFlowUnitTestLibrary.WinterFlowVariableBandwidth();
        this.WinterFlowVersionControlModule = WinterFlowUnitTestLibrary.WinterFlowVariableBandwidth();
        this.WinterFlowArrayFramework = -1L;
        this.WinterFlowPipelineSoftware = 9187343241974906880L;
        this.WinterFlowParserPipeline = WinterFlowDecoratorUI.WinterFlowSerializerStructure(null);
        this.WinterFlowHandlerJSON = WinterFlowInheritanceConcurrency.WinterFlowHookDataSource(new WinterFlowRendererDataSource(this, i3));
        this.WinterFlowModuleService = new AtomicReference(null);
        this.WinterFlowFunctionPipeline = winterFlowTransactionManagerEncryption.WinterFlowServiceUtility;
        this.WinterFlowResolverListener = winterFlowTransactionManagerEncryption.WinterFlowBandwidthObject;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        int[] iArr = WinterFlowRouterDeserialization.WinterFlowRouterStructure;
        WinterFlowCacheManagerConfiguration winterFlowCacheManagerConfiguration = WinterFlowCacheManagerConfiguration.WinterFlowVariableVersionControl;
        WinterFlowCacheManagerConfiguration winterFlowCacheManagerConfiguration2 = layoutDirection != 0 ? layoutDirection != 1 ? null : WinterFlowCacheManagerConfiguration.WinterFlowTransactionManagerStrategy : winterFlowCacheManagerConfiguration;
        this.WinterFlowSingletonWidget = WinterFlowDecoratorUI.WinterFlowSerializerStructure(winterFlowCacheManagerConfiguration2 != null ? winterFlowCacheManagerConfiguration2 : winterFlowCacheManagerConfiguration);
        this.WinterFlowTestingTransactionManager = winterFlowTransactionManagerEncryption.WinterFlowOrchestrationSubsystem;
        int i4 = 2;
        this.WinterFlowUIThreadPool = new WinterFlowViewTool(isInTouchMode() ? 1 : 2);
        WinterFlowUnitTestScript winterFlowUnitTestScript = new WinterFlowUnitTestScript();
        new WinterFlowJSON(new WinterFlowLoaderEncryption[16]);
        new WinterFlowJSON(new WinterFlowServerManager[16]);
        new WinterFlowJSON(new WinterFlowSchedulerStructure[16]);
        new WinterFlowJSON(new WinterFlowServerManager[16]);
        this.WinterFlowClassConsumer = winterFlowUnitTestScript;
        this.WinterFlowProtocolConsumer = new WinterFlowSessionManagerProcess(23);
        this.WinterFlowDatabaseSchemaUtility = new WinterFlowCacheManagerVersionControl(6);
        this.WinterFlowValidatorNetwork = new WinterFlowMicroserviceFunction();
        this.WinterFlowServerStack = new WinterFlowDeploymentSystem(i3, this);
        this.WinterFlowWidgetProcess = new WinterFlowWorkerDatabaseSchema(this, i);
        WinterFlowCacheManagerDatabase winterFlowCacheManagerDatabase = new WinterFlowCacheManagerDatabase(this, i2);
        WinterFlowStrategyVersionControl winterFlowStrategyVersionControl = new WinterFlowStrategyVersionControl();
        winterFlowStrategyVersionControl.WinterFlowCacheManagerAgent = winterFlowCacheManagerDatabase;
        winterFlowStrategyVersionControl.WinterFlowHookDataSource = 0;
        winterFlowStrategyVersionControl.WinterFlowArrayNetwork = new GestureDetector(context, new WinterFlowConsumerTool(winterFlowStrategyVersionControl));
        this.WinterFlowRepositoryAlgorithm = winterFlowStrategyVersionControl;
        this.WinterFlowSoftwareServiceProvider = new WinterFlowRendererDataSource(this, i4);
        int i5 = Build.VERSION.SDK_INT;
        this.WinterFlowInheritanceJava = i5 < 29 ? new WinterFlowInheritanceStack(WinterFlowVariableBandwidth) : new WinterFlowRuntimeInterface();
        addOnAttachStateChangeListener(this.WinterFlowStrategyTool);
        setWillNotDraw(false);
        setFocusable(true);
        WinterFlowServerBackend.WinterFlowRouterStructure.WinterFlowRouterStructure(this, 1, false);
        setFocusableInTouchMode(true);
        setClipChildren(false);
        WinterFlowIDEComponent.WinterFlowHookDataSource(this, winterFlowBackendEventEmitter);
        setOnDragListener(getDragAndDropManager());
        getRoot().WinterFlowArrayNetwork(this);
        if (i5 >= 29) {
            WinterFlowStackGateway.WinterFlowRouterStructure.WinterFlowRouterStructure(this);
        }
        if (WinterFlowBandwidthObject()) {
            View view = new View(context);
            view.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
            view.setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
            this.WinterFlowOrchestrationSubsystem = view;
            addView(view, -1);
        }
        this.WinterFlowDatabase = i5 >= 31 ? new WinterFlowRuntimeInvoker() : null;
        this.WinterFlowControllerCache = new WinterFlowSessionManagerProcess(this);
    }

    public static boolean WinterFlowBandwidthObject() {
        return Build.VERSION.SDK_INT >= 35;
    }

    public static boolean WinterFlowOrchestrationSubsystem(MotionEvent motionEvent) {
        boolean z = (Float.floatToRawIntBits(motionEvent.getX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & Integer.MAX_VALUE) >= 2139095040;
        if (!z) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i = 1; i < pointerCount; i++) {
                z = (Float.floatToRawIntBits(motionEvent.getX(i)) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i)) & Integer.MAX_VALUE) >= 2139095040 || (Build.VERSION.SDK_INT >= 29 && !WinterFlowDecoratorUtility.WinterFlowRouterStructure.WinterFlowRouterStructure(motionEvent, i));
                if (z) {
                    break;
                }
            }
        }
        return z;
    }

    public static View WinterFlowResponseEngine(View view, int i) {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
            if (WinterFlowManagerRequest.WinterFlowThreadListener(declaredMethod.invoke(view, null), Integer.valueOf(i))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View WinterFlowResponseEngine = WinterFlowResponseEngine(viewGroup.getChildAt(i2), i);
                    if (WinterFlowResponseEngine != null) {
                        return WinterFlowResponseEngine;
                    }
                }
            }
        }
        return null;
    }

    public static void WinterFlowRouterRouter(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof WinterFlowSyntaxTransactionManager) {
                ((WinterFlowSyntaxTransactionManager) childAt).WinterFlowMapperProtocol();
            } else if (childAt instanceof ViewGroup) {
                WinterFlowRouterRouter((ViewGroup) childAt);
            }
        }
    }

    public static long WinterFlowSyntax(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            return size;
        }
        if (mode == 0) {
            return 2147483647L;
        }
        if (mode != 1073741824) {
            throw new IllegalStateException();
        }
        long j = size;
        return j | (j << 32);
    }

    public static void WinterFlowThreadListener(WinterFlowSchedulerStructure winterFlowSchedulerStructure) {
        winterFlowSchedulerStructure.WinterFlowArrayHelper();
        WinterFlowJSON WinterFlowResolverController = winterFlowSchedulerStructure.WinterFlowResolverController();
        Object[] objArr = WinterFlowResolverController.WinterFlowVariableVersionControl;
        int i = WinterFlowResolverController.WinterFlowUnitTestResponse;
        for (int i2 = 0; i2 < i; i2++) {
            WinterFlowThreadListener((WinterFlowSchedulerStructure) objArr[i2]);
        }
    }

    private final boolean getDerivedIsAttached() {
        return ((Boolean) this.WinterFlowSerializerStructure.getValue()).booleanValue();
    }

    private final WinterFlowPipelinePipeline getLegacyTextInputServiceAndroid() {
        WinterFlowPipelinePipeline winterFlowPipelinePipeline = this.WinterFlowHookQuery;
        if (winterFlowPipelinePipeline != null) {
            return winterFlowPipelinePipeline;
        }
        WinterFlowPipelinePipeline winterFlowPipelinePipeline2 = new WinterFlowPipelinePipeline(getView(), this);
        this.WinterFlowHookQuery = winterFlowPipelinePipeline2;
        return winterFlowPipelinePipeline2;
    }

    private final WinterFlowTransactionManagerEncryption get_composeViewContext() {
        return (WinterFlowTransactionManagerEncryption) this.WinterFlowVariableVersionControl.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WinterFlowQueryServer get_viewTreeOwners() {
        WinterFlowResolverBackend.WinterFlowBatchUI(this.WinterFlowParserPipeline.getValue());
        return null;
    }

    private final void setAttached(boolean z) {
        this.WinterFlowRouterAdapter.setValue(Boolean.valueOf(z));
    }

    private void setDensity(WinterFlowConcurrencyParser winterFlowConcurrencyParser) {
        this.WinterFlowBandwidthObject.setValue(winterFlowConcurrencyParser);
    }

    private void setFontFamilyResolver(WinterFlowDatabaseGateway winterFlowDatabaseGateway) {
        this.WinterFlowResolverListener.setValue(winterFlowDatabaseGateway);
    }

    private void setLayoutDirection(WinterFlowCacheManagerConfiguration winterFlowCacheManagerConfiguration) {
        this.WinterFlowSingletonWidget.setValue(winterFlowCacheManagerConfiguration);
    }

    private final void set_composeViewContext(WinterFlowTransactionManagerEncryption winterFlowTransactionManagerEncryption) {
        this.WinterFlowVariableVersionControl.setValue(winterFlowTransactionManagerEncryption);
    }

    private final void set_viewTreeOwners(WinterFlowQueryServer winterFlowQueryServer) {
        this.WinterFlowParserPipeline.setValue(winterFlowQueryServer);
    }

    public final void WinterFlowArrayHelper() {
        if (this.WinterFlowStrategyHook) {
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (currentAnimationTimeMillis != this.WinterFlowArrayFramework) {
            this.WinterFlowArrayFramework = currentAnimationTimeMillis;
            WinterFlowDeploymentArray winterFlowDeploymentArray = this.WinterFlowInheritanceJava;
            float[] fArr = this.WinterFlowCacheManagerException;
            winterFlowDeploymentArray.WinterFlowRouterStructure(this, fArr);
            WinterFlowTestingCloud.WinterFlowConsumerUserManager(fArr, this.WinterFlowVersionControlModule);
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.WinterFlowBandwidth;
            view.getLocationOnScreen(iArr);
            float f = iArr[0];
            float f2 = iArr[1];
            view.getLocationInWindow(iArr);
            float f3 = iArr[0];
            float f4 = f2 - iArr[1];
            this.WinterFlowPipelineSoftware = (Float.floatToRawIntBits(f - f3) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L);
        }
    }

    @Override // com.google.android.datatransport.WinterFlowJSONWorker
    public final void WinterFlowArrayNetwork(WinterFlowDecoratorVersion winterFlowDecoratorVersion) {
        WinterFlowEventEmitterNetwork winterFlowEventEmitterNetwork = this.WinterFlowTransactionAgent;
        if (winterFlowEventEmitterNetwork != null) {
            WinterFlowDeploymentBandwidth winterFlowDeploymentBandwidth = (WinterFlowDeploymentBandwidth) winterFlowEventEmitterNetwork.WinterFlowRouterStructure.WinterFlowTransactionManagerStrategy;
            if (winterFlowDeploymentBandwidth.WinterFlowVariableVersionControl && !winterFlowDeploymentBandwidth.WinterFlowUnitTestResponse) {
                WinterFlowClassNetwork winterFlowClassNetwork = winterFlowEventEmitterNetwork.WinterFlowArrayNetwork;
                if (winterFlowClassNetwork != null) {
                    winterFlowClassNetwork.cancel();
                }
                winterFlowEventEmitterNetwork.WinterFlowArrayNetwork = null;
                return;
            }
            if (winterFlowDeploymentBandwidth.WinterFlowTransactionManagerStrategy) {
                return;
            }
            if (!winterFlowDeploymentBandwidth.WinterFlowUnitTestResponse) {
                WinterFlowListenerScheduler.WinterFlowRouterStructure("ManagedValuesStore tried to leave composition twice. Is the store installed in multiple places?");
            }
            if (!winterFlowDeploymentBandwidth.WinterFlowRouterRouter.WinterFlowSyntax()) {
                WinterFlowListenerScheduler.WinterFlowRouterStructure("Attempted to start retaining exited values with pending exited values");
            }
            winterFlowDeploymentBandwidth.WinterFlowUnitTestResponse = false;
        }
    }

    public final void WinterFlowBackendCacheManager(WinterFlowSchedulerStructure winterFlowSchedulerStructure, boolean z, boolean z2) {
        WinterFlowUICompiler winterFlowUICompiler = winterFlowSchedulerStructure.WinterFlowSoftwareEngine;
        WinterFlowCompilerListener winterFlowCompilerListener = WinterFlowCompilerListener.WinterFlowRouterRouter;
        WinterFlowConsumerServiceProvider winterFlowConsumerServiceProvider = this.WinterFlowVariableInterface;
        if (!z) {
            winterFlowConsumerServiceProvider.getClass();
            int ordinal = winterFlowUICompiler.WinterFlowArrayNetwork.ordinal();
            if (ordinal == 0 || ordinal == 1 || ordinal == 2 || ordinal == 3) {
                return;
            }
            if (ordinal != 4) {
                WinterFlowEventEmitterOrchestration.WinterFlowRouterStructure();
                return;
            }
            WinterFlowSchedulerStructure WinterFlowVariableBandwidth = winterFlowSchedulerStructure.WinterFlowVariableBandwidth();
            boolean z3 = WinterFlowVariableBandwidth == null || WinterFlowVariableBandwidth.WinterFlowPackageIDE();
            if (!z2) {
                if (winterFlowSchedulerStructure.WinterFlowOrchestrationSubsystem()) {
                    return;
                }
                if (winterFlowSchedulerStructure.WinterFlowBandwidthObject() && winterFlowSchedulerStructure.WinterFlowPackageIDE() == z3 && winterFlowSchedulerStructure.WinterFlowPackageIDE() == winterFlowUICompiler.WinterFlowOrchestrationSubsystem.WinterFlowMapperProtocol) {
                    return;
                }
            }
            WinterFlowValidatorException winterFlowValidatorException = winterFlowUICompiler.WinterFlowOrchestrationSubsystem;
            winterFlowValidatorException.WinterFlowConsumerUserManager = true;
            winterFlowValidatorException.WinterFlowBackendCacheManager = true;
            if (!winterFlowSchedulerStructure.WinterFlowConfiguration && winterFlowValidatorException.WinterFlowMapperProtocol && z3) {
                if ((WinterFlowVariableBandwidth == null || !WinterFlowVariableBandwidth.WinterFlowBandwidthObject()) && (WinterFlowVariableBandwidth == null || !WinterFlowVariableBandwidth.WinterFlowOrchestrationSubsystem())) {
                    ((WinterFlowObjectPackage) winterFlowConsumerServiceProvider.WinterFlowArrayNetwork).WinterFlowRouterStructure(winterFlowSchedulerStructure, winterFlowCompilerListener);
                }
                if (winterFlowConsumerServiceProvider.WinterFlowHookDataSource) {
                    return;
                }
                WinterFlowStrategyTool(null);
                return;
            }
            return;
        }
        WinterFlowObjectPackage winterFlowObjectPackage = (WinterFlowObjectPackage) winterFlowConsumerServiceProvider.WinterFlowArrayNetwork;
        int ordinal2 = winterFlowUICompiler.WinterFlowArrayNetwork.ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 == 1) {
                return;
            }
            if (ordinal2 != 2) {
                if (ordinal2 == 3) {
                    return;
                }
                if (ordinal2 != 4) {
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterStructure();
                    return;
                }
            }
        }
        if ((winterFlowUICompiler.WinterFlowVariableVersionControl || winterFlowUICompiler.WinterFlowTransactionManagerStrategy) && !z2) {
            return;
        }
        winterFlowUICompiler.WinterFlowTransactionManagerStrategy = true;
        winterFlowUICompiler.WinterFlowUnitTestResponse = true;
        WinterFlowValidatorException winterFlowValidatorException2 = winterFlowUICompiler.WinterFlowOrchestrationSubsystem;
        winterFlowValidatorException2.WinterFlowConsumerUserManager = true;
        winterFlowValidatorException2.WinterFlowBackendCacheManager = true;
        if (winterFlowSchedulerStructure.WinterFlowConfiguration) {
            return;
        }
        WinterFlowSchedulerStructure WinterFlowVariableBandwidth2 = winterFlowSchedulerStructure.WinterFlowVariableBandwidth();
        if (WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowSchedulerStructure.WinterFlowSoftwareProtocol(), Boolean.TRUE) && ((WinterFlowVariableBandwidth2 == null || !WinterFlowVariableBandwidth2.WinterFlowSoftwareEngine.WinterFlowVariableVersionControl) && (WinterFlowVariableBandwidth2 == null || !WinterFlowVariableBandwidth2.WinterFlowSoftwareEngine.WinterFlowTransactionManagerStrategy))) {
            winterFlowObjectPackage.WinterFlowRouterStructure(winterFlowSchedulerStructure, WinterFlowCompilerListener.WinterFlowTransactionManagerStrategy);
        } else if (winterFlowSchedulerStructure.WinterFlowPackageIDE() && ((WinterFlowVariableBandwidth2 == null || !WinterFlowVariableBandwidth2.WinterFlowBandwidthObject()) && (WinterFlowVariableBandwidth2 == null || !WinterFlowVariableBandwidth2.WinterFlowOrchestrationSubsystem()))) {
            winterFlowObjectPackage.WinterFlowRouterStructure(winterFlowSchedulerStructure, winterFlowCompilerListener);
        }
        if (winterFlowConsumerServiceProvider.WinterFlowHookDataSource) {
            return;
        }
        WinterFlowStrategyTool(null);
    }

    public final void WinterFlowBatchUI(boolean z) {
        WinterFlowRendererDataSource winterFlowRendererDataSource;
        WinterFlowConsumerServiceProvider winterFlowConsumerServiceProvider = this.WinterFlowVariableInterface;
        if (((WinterFlowObjectPackage) winterFlowConsumerServiceProvider.WinterFlowArrayNetwork).WinterFlowOrchestrationSubsystem() || ((WinterFlowJSON) ((WinterFlowAlgorithmArray) winterFlowConsumerServiceProvider.WinterFlowVariableVersionControl).WinterFlowTransactionManagerStrategy).WinterFlowUnitTestResponse != 0) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z) {
                try {
                    winterFlowRendererDataSource = this.WinterFlowSoftwareServiceProvider;
                } finally {
                    Trace.endSection();
                }
            } else {
                winterFlowRendererDataSource = null;
            }
            if (winterFlowConsumerServiceProvider.WinterFlowThreadListener(winterFlowRendererDataSource)) {
                requestLayout();
            }
            winterFlowConsumerServiceProvider.WinterFlowCacheManagerAgent(false);
            getRectManager().WinterFlowRouterStructure();
            if (this.WinterFlowTestingNode) {
                getViewTreeObserver().dispatchOnGlobalLayout();
                this.WinterFlowTestingNode = false;
            }
        }
    }

    public final long WinterFlowCacheManagerListener(long j) {
        WinterFlowArrayHelper();
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (this.WinterFlowPipelineSoftware >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (this.WinterFlowPipelineSoftware & 4294967295L));
        return WinterFlowUnitTestLibrary.WinterFlowSoftwareProtocol(this.WinterFlowVersionControlModule, (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32));
    }

    public final void WinterFlowCompilerVariable(MotionEvent motionEvent) {
        this.WinterFlowArrayFramework = AnimationUtils.currentAnimationTimeMillis();
        WinterFlowDeploymentArray winterFlowDeploymentArray = this.WinterFlowInheritanceJava;
        float[] fArr = this.WinterFlowCacheManagerException;
        winterFlowDeploymentArray.WinterFlowRouterStructure(this, fArr);
        WinterFlowTestingCloud.WinterFlowConsumerUserManager(fArr, this.WinterFlowVersionControlModule);
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        long WinterFlowSoftwareProtocol = WinterFlowUnitTestLibrary.WinterFlowSoftwareProtocol(fArr, (Float.floatToRawIntBits(x) << 32) | (Float.floatToRawIntBits(y) & 4294967295L));
        float rawX = motionEvent.getRawX() - Float.intBitsToFloat((int) (WinterFlowSoftwareProtocol >> 32));
        float rawY = motionEvent.getRawY() - Float.intBitsToFloat((int) (WinterFlowSoftwareProtocol & 4294967295L));
        this.WinterFlowPipelineSoftware = (Float.floatToRawIntBits(rawX) << 32) | (Float.floatToRawIntBits(rawY) & 4294967295L);
    }

    public final boolean WinterFlowConcurrencyThread(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        return 0.0f <= x && x <= ((float) getWidth()) && 0.0f <= y && y <= ((float) getHeight());
    }

    public final boolean WinterFlowConfigurationSubsystem() {
        if (isFocused()) {
            return true;
        }
        return super.requestFocus(130, null);
    }

    public final void WinterFlowConsumerUserManager(WinterFlowSchedulerStructure winterFlowSchedulerStructure, boolean z, boolean z2, boolean z3) {
        WinterFlowSchedulerStructure WinterFlowVariableBandwidth;
        WinterFlowSchedulerStructure WinterFlowVariableBandwidth2;
        WinterFlowConsumerServiceProvider winterFlowConsumerServiceProvider = this.WinterFlowVariableInterface;
        if (!z) {
            if (winterFlowConsumerServiceProvider.WinterFlowMapperProtocol(winterFlowSchedulerStructure, z2) && z3) {
                WinterFlowStrategyTool(winterFlowSchedulerStructure);
                return;
            }
            return;
        }
        WinterFlowObjectPackage winterFlowObjectPackage = (WinterFlowObjectPackage) winterFlowConsumerServiceProvider.WinterFlowArrayNetwork;
        WinterFlowSchedulerStructure winterFlowSchedulerStructure2 = winterFlowSchedulerStructure.WinterFlowServerProtocol;
        WinterFlowUICompiler winterFlowUICompiler = winterFlowSchedulerStructure.WinterFlowSoftwareEngine;
        if (winterFlowSchedulerStructure2 == null) {
            WinterFlowViewUtility.WinterFlowHookDataSource("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int ordinal = winterFlowUICompiler.WinterFlowArrayNetwork.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return;
            }
            if (ordinal != 2 && ordinal != 3) {
                if (ordinal != 4) {
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterStructure();
                    return;
                }
                if (!winterFlowUICompiler.WinterFlowVariableVersionControl || z2) {
                    winterFlowUICompiler.WinterFlowVariableVersionControl = true;
                    winterFlowUICompiler.WinterFlowOrchestrationSubsystem.WinterFlowResolverController = true;
                    if (winterFlowSchedulerStructure.WinterFlowConfiguration) {
                        return;
                    }
                    if ((WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowSchedulerStructure.WinterFlowSoftwareProtocol(), Boolean.TRUE) || WinterFlowConsumerServiceProvider.WinterFlowResponseEngine(winterFlowSchedulerStructure)) && ((WinterFlowVariableBandwidth = winterFlowSchedulerStructure.WinterFlowVariableBandwidth()) == null || !WinterFlowVariableBandwidth.WinterFlowSoftwareEngine.WinterFlowVariableVersionControl)) {
                        winterFlowObjectPackage.WinterFlowRouterStructure(winterFlowSchedulerStructure, WinterFlowCompilerListener.WinterFlowVariableVersionControl);
                    } else if ((winterFlowSchedulerStructure.WinterFlowPackageIDE() || WinterFlowConsumerServiceProvider.WinterFlowTransactionAgent(winterFlowSchedulerStructure)) && ((WinterFlowVariableBandwidth2 = winterFlowSchedulerStructure.WinterFlowVariableBandwidth()) == null || !WinterFlowVariableBandwidth2.WinterFlowOrchestrationSubsystem())) {
                        winterFlowObjectPackage.WinterFlowRouterStructure(winterFlowSchedulerStructure, WinterFlowCompilerListener.WinterFlowUnitTestResponse);
                    }
                    if (winterFlowConsumerServiceProvider.WinterFlowHookDataSource || !z3) {
                        return;
                    }
                    WinterFlowStrategyTool(winterFlowSchedulerStructure);
                    return;
                }
                return;
            }
        }
        ((WinterFlowJSON) winterFlowConsumerServiceProvider.WinterFlowUnitTestResponse).WinterFlowHookDataSource(new WinterFlowServiceDecorator(winterFlowSchedulerStructure, true, z2));
    }

    public final void WinterFlowEventEmitterController() {
        WinterFlowBackendEventEmitter winterFlowBackendEventEmitter = this.WinterFlowConfigurationSubsystem;
        winterFlowBackendEventEmitter.WinterFlowArrayHelper = true;
        Handler handler = winterFlowBackendEventEmitter.WinterFlowRouterRouter.getHandler();
        if (winterFlowBackendEventEmitter.WinterFlowBandwidthObject() && !winterFlowBackendEventEmitter.WinterFlowCompilerHandler && handler != null) {
            winterFlowBackendEventEmitter.WinterFlowCompilerHandler = true;
            handler.post(winterFlowBackendEventEmitter.WinterFlowCloudMicroservice);
        }
        WinterFlowVariableAgent winterFlowVariableAgent = this.WinterFlowStrategyTool;
        winterFlowVariableAgent.WinterFlowResponseEngine = true;
        Handler handler2 = winterFlowVariableAgent.WinterFlowVariableVersionControl.getHandler();
        if (!winterFlowVariableAgent.WinterFlowUnitTestResponse() || winterFlowVariableAgent.WinterFlowOrchestrationSubsystem || handler2 == null) {
            return;
        }
        winterFlowVariableAgent.WinterFlowOrchestrationSubsystem = true;
        handler2.post(winterFlowVariableAgent.WinterFlowConcurrencyThread);
    }

    public final void WinterFlowMapperProtocol() {
        WinterFlowMicroserviceFunction winterFlowMicroserviceFunction;
        Object[] objArr;
        if (this.WinterFlowProxyStructure) {
            WinterFlowClassStrategy winterFlowClassStrategy = getSnapshotObserver().WinterFlowRouterStructure;
            synchronized (winterFlowClassStrategy.WinterFlowUnitTestResponse) {
                try {
                    WinterFlowJSON winterFlowJSON = winterFlowClassStrategy.WinterFlowTransactionManagerStrategy;
                    int i = winterFlowJSON.WinterFlowUnitTestResponse;
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        objArr = winterFlowJSON.WinterFlowVariableVersionControl;
                        if (i2 >= i) {
                            break;
                        }
                        WinterFlowServiceInvoker winterFlowServiceInvoker = (WinterFlowServiceInvoker) objArr[i2];
                        winterFlowServiceInvoker.WinterFlowArrayNetwork();
                        if (!winterFlowServiceInvoker.WinterFlowTransactionManagerStrategy.WinterFlowResponseEngine()) {
                            i3++;
                        } else if (i3 > 0) {
                            Object[] objArr2 = winterFlowJSON.WinterFlowVariableVersionControl;
                            objArr2[i2 - i3] = objArr2[i2];
                        }
                        i2++;
                    }
                    int i4 = i - i3;
                    Arrays.fill(objArr, i4, i, (Object) null);
                    winterFlowJSON.WinterFlowUnitTestResponse = i4;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.WinterFlowProxyStructure = false;
        }
        WinterFlowManagerHelper winterFlowManagerHelper = this.WinterFlowOrchestrationConfiguration;
        if (winterFlowManagerHelper != null) {
            WinterFlowRouterRouter(winterFlowManagerHelper);
        }
        WinterFlowHookThreadPool winterFlowHookThreadPool = this.WinterFlowCacheTool;
        if (winterFlowHookThreadPool != null) {
            WinterFlowMiddlewareFramework winterFlowMiddlewareFramework = winterFlowHookThreadPool.WinterFlowTransactionAgent;
            if (winterFlowMiddlewareFramework.WinterFlowArrayNetwork == 0 && winterFlowHookThreadPool.WinterFlowServerProtocol) {
                ((AutofillManager) winterFlowHookThreadPool.WinterFlowVariableVersionControl.WinterFlowTransactionManagerStrategy).commit();
                winterFlowHookThreadPool.WinterFlowServerProtocol = false;
            }
            if (winterFlowMiddlewareFramework.WinterFlowArrayNetwork != 0) {
                winterFlowHookThreadPool.WinterFlowServerProtocol = true;
            }
        }
        while (this.WinterFlowValidatorNetwork.WinterFlowSyntax() && this.WinterFlowValidatorNetwork.WinterFlowTransactionManagerStrategy(0) != null) {
            int i5 = this.WinterFlowValidatorNetwork.WinterFlowHookDataSource;
            int i6 = 0;
            while (true) {
                winterFlowMicroserviceFunction = this.WinterFlowValidatorNetwork;
                if (i6 < i5) {
                    WinterFlowObjectUI winterFlowObjectUI = (WinterFlowObjectUI) winterFlowMicroserviceFunction.WinterFlowTransactionManagerStrategy(i6);
                    this.WinterFlowValidatorNetwork.WinterFlowServiceUtility(i6, null);
                    if (winterFlowObjectUI != null) {
                        winterFlowObjectUI.WinterFlowRouterStructure();
                    }
                    i6++;
                }
            }
            winterFlowMicroserviceFunction.WinterFlowServerProtocol(0, i5);
        }
    }

    public final int WinterFlowPackageIDE(MotionEvent motionEvent) {
        Object obj;
        if (this.WinterFlowQueryDeserialization) {
            this.WinterFlowQueryDeserialization = false;
            WinterFlowVersionControlDeployment winterFlowVersionControlDeployment = getComposeViewContext().WinterFlowVariableBandwidth;
            WinterFlowOrchestrationDecorator.WinterFlowVariableVersionControl.setValue(new WinterFlowDataSourceAgent(motionEvent.getMetaState()));
        }
        WinterFlowGatewaySyntax winterFlowGatewaySyntax = this.WinterFlowCompilerHandler;
        WinterFlowAlgorithmArray WinterFlowCacheManagerAgent = winterFlowGatewaySyntax.WinterFlowCacheManagerAgent(motionEvent, this);
        int actionMasked = motionEvent.getActionMasked();
        WinterFlowRepositoryFramework winterFlowRepositoryFramework = this.WinterFlowFrontendBackend;
        if (WinterFlowCacheManagerAgent == null) {
            if (!winterFlowRepositoryFramework.WinterFlowRouterStructure) {
                ((WinterFlowDatabaseRenderer) ((WinterFlowJSONDecorator) winterFlowRepositoryFramework.WinterFlowArrayNetwork).WinterFlowTransactionManagerStrategy).WinterFlowRouterStructure();
                ((WinterFlowParserVersionControl) winterFlowRepositoryFramework.WinterFlowCacheManagerAgent).WinterFlowCacheManagerAgent();
            }
            return 0;
        }
        ArrayList arrayList = (ArrayList) WinterFlowCacheManagerAgent.WinterFlowTransactionManagerStrategy;
        int size = arrayList.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                obj = arrayList.get(size);
                if (((WinterFlowClassSubsystem) obj).WinterFlowVariableVersionControl && (actionMasked == 0 || actionMasked == 5)) {
                    break;
                }
                if (i < 0) {
                    break;
                }
                size = i;
            }
        }
        obj = null;
        WinterFlowClassSubsystem winterFlowClassSubsystem = (WinterFlowClassSubsystem) obj;
        if (winterFlowClassSubsystem != null) {
            this.WinterFlowTransactionManagerStrategy = winterFlowClassSubsystem.WinterFlowArrayNetwork;
        }
        int WinterFlowRouterStructure = winterFlowRepositoryFramework.WinterFlowRouterStructure(WinterFlowCacheManagerAgent, this, WinterFlowConcurrencyThread(motionEvent));
        WinterFlowCacheManagerAgent.WinterFlowUnitTestResponse = null;
        if ((actionMasked != 0 && actionMasked != 5) || (WinterFlowRouterStructure & 1) != 0) {
            return WinterFlowRouterStructure;
        }
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        winterFlowGatewaySyntax.WinterFlowCacheManagerAgent.delete(pointerId);
        winterFlowGatewaySyntax.WinterFlowHookDataSource.delete(pointerId);
        return WinterFlowRouterStructure;
    }

    public final void WinterFlowResolverController(WinterFlowSchedulerStructure winterFlowSchedulerStructure) {
        WinterFlowBackendEventEmitter winterFlowBackendEventEmitter = this.WinterFlowConfigurationSubsystem;
        winterFlowBackendEventEmitter.WinterFlowArrayHelper = true;
        if (winterFlowBackendEventEmitter.WinterFlowBandwidthObject()) {
            winterFlowBackendEventEmitter.WinterFlowOrchestrationSubsystem(winterFlowSchedulerStructure);
        }
        WinterFlowVariableAgent winterFlowVariableAgent = this.WinterFlowStrategyTool;
        winterFlowVariableAgent.WinterFlowResponseEngine = true;
        if (winterFlowVariableAgent.WinterFlowUnitTestResponse()) {
            winterFlowVariableAgent.WinterFlowTransactionAgent.WinterFlowUnitTestResponse(WinterFlowAlgorithmSession.WinterFlowRouterStructure);
        }
    }

    public final void WinterFlowRouterAdapter(WinterFlowSchedulerStructure winterFlowSchedulerStructure, long j) {
        WinterFlowConsumerServiceProvider winterFlowConsumerServiceProvider = this.WinterFlowVariableInterface;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            winterFlowConsumerServiceProvider.WinterFlowServiceUtility(winterFlowSchedulerStructure, j);
            if (!((WinterFlowObjectPackage) winterFlowConsumerServiceProvider.WinterFlowArrayNetwork).WinterFlowOrchestrationSubsystem()) {
                winterFlowConsumerServiceProvider.WinterFlowCacheManagerAgent(false);
                getRectManager().WinterFlowRouterStructure();
                if (this.WinterFlowTestingNode) {
                    getViewTreeObserver().dispatchOnGlobalLayout();
                    this.WinterFlowTestingNode = false;
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // com.google.android.datatransport.WinterFlowResolverProtocol
    public final void WinterFlowRouterStructure(WinterFlowDeploymentWidget winterFlowDeploymentWidget, WinterFlowDeploymentWidget winterFlowDeploymentWidget2) {
        WinterFlowExceptionStrategy winterFlowExceptionStrategy;
        boolean z;
        WinterFlowExceptionStrategy winterFlowExceptionStrategy2;
        boolean z2;
        if (winterFlowDeploymentWidget != null) {
            WinterFlowDeploymentWidget winterFlowDeploymentWidget3 = winterFlowDeploymentWidget;
            if (!winterFlowDeploymentWidget3.WinterFlowVariableVersionControl.WinterFlowSingletonPlatform) {
                WinterFlowViewUtility.WinterFlowHookDataSource("visitAncestors called on an unattached node");
            }
            WinterFlowUserManagerController winterFlowUserManagerController = winterFlowDeploymentWidget3.WinterFlowVariableVersionControl;
            WinterFlowSchedulerStructure WinterFlowSyntaxSubsystem = WinterFlowCloudStack.WinterFlowSyntaxSubsystem(winterFlowDeploymentWidget);
            WinterFlowCacheManagerTransactionManager winterFlowCacheManagerTransactionManager = null;
            ArrayList arrayList = null;
            while (WinterFlowSyntaxSubsystem != null) {
                if ((WinterFlowSyntaxSubsystem.WinterFlowUserManagerUserManager.WinterFlowTransactionManagerStrategy.WinterFlowRouterRouter & 2097152) != 0) {
                    while (winterFlowUserManagerController != null) {
                        if ((winterFlowUserManagerController.WinterFlowUnitTestResponse & 2097152) != 0) {
                            WinterFlowUserManagerController winterFlowUserManagerController2 = winterFlowUserManagerController;
                            WinterFlowJSON winterFlowJSON = null;
                            while (winterFlowUserManagerController2 != null) {
                                if (winterFlowUserManagerController2 instanceof WinterFlowUserManagerBackend) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(winterFlowUserManagerController2);
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                if (z2 && (winterFlowUserManagerController2.WinterFlowUnitTestResponse & 2097152) != 0 && (winterFlowUserManagerController2 instanceof WinterFlowTestingEntity)) {
                                    int i = 0;
                                    for (WinterFlowUserManagerController winterFlowUserManagerController3 = ((WinterFlowTestingEntity) winterFlowUserManagerController2).WinterFlowBatchUI; winterFlowUserManagerController3 != null; winterFlowUserManagerController3 = winterFlowUserManagerController3.WinterFlowResponseEngine) {
                                        if ((winterFlowUserManagerController3.WinterFlowUnitTestResponse & 2097152) != 0) {
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
                winterFlowUserManagerController = (WinterFlowSyntaxSubsystem == null || (winterFlowExceptionStrategy2 = WinterFlowSyntaxSubsystem.WinterFlowUserManagerUserManager) == null) ? null : winterFlowExceptionStrategy2.WinterFlowVariableVersionControl;
            }
            if (arrayList == null) {
                return;
            }
            if (winterFlowDeploymentWidget2 != null) {
                if (!winterFlowDeploymentWidget2.WinterFlowVariableVersionControl.WinterFlowSingletonPlatform) {
                    WinterFlowViewUtility.WinterFlowHookDataSource("visitAncestors called on an unattached node");
                }
                WinterFlowUserManagerController winterFlowUserManagerController4 = winterFlowDeploymentWidget2.WinterFlowVariableVersionControl;
                WinterFlowSchedulerStructure WinterFlowSyntaxSubsystem2 = WinterFlowCloudStack.WinterFlowSyntaxSubsystem(winterFlowDeploymentWidget2);
                WinterFlowCacheManagerTransactionManager winterFlowCacheManagerTransactionManager2 = null;
                while (WinterFlowSyntaxSubsystem2 != null) {
                    if ((WinterFlowSyntaxSubsystem2.WinterFlowUserManagerUserManager.WinterFlowTransactionManagerStrategy.WinterFlowRouterRouter & 2097152) != 0) {
                        while (winterFlowUserManagerController4 != null) {
                            if ((winterFlowUserManagerController4.WinterFlowUnitTestResponse & 2097152) != 0) {
                                WinterFlowUserManagerController winterFlowUserManagerController5 = winterFlowUserManagerController4;
                                WinterFlowJSON winterFlowJSON2 = null;
                                while (winterFlowUserManagerController5 != null) {
                                    if (winterFlowUserManagerController5 instanceof WinterFlowUserManagerBackend) {
                                        if (winterFlowCacheManagerTransactionManager2 == null) {
                                            WinterFlowCacheManagerTransactionManager winterFlowCacheManagerTransactionManager3 = WinterFlowLoaderSessionManager.WinterFlowRouterStructure;
                                            winterFlowCacheManagerTransactionManager2 = new WinterFlowCacheManagerTransactionManager();
                                        }
                                        winterFlowCacheManagerTransactionManager2.WinterFlowRouterStructure(winterFlowUserManagerController5);
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    if (z && (winterFlowUserManagerController5.WinterFlowUnitTestResponse & 2097152) != 0 && (winterFlowUserManagerController5 instanceof WinterFlowTestingEntity)) {
                                        int i2 = 0;
                                        for (WinterFlowUserManagerController winterFlowUserManagerController6 = ((WinterFlowTestingEntity) winterFlowUserManagerController5).WinterFlowBatchUI; winterFlowUserManagerController6 != null; winterFlowUserManagerController6 = winterFlowUserManagerController6.WinterFlowResponseEngine) {
                                            if ((winterFlowUserManagerController6.WinterFlowUnitTestResponse & 2097152) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    winterFlowUserManagerController5 = winterFlowUserManagerController6;
                                                } else {
                                                    if (winterFlowJSON2 == null) {
                                                        winterFlowJSON2 = new WinterFlowJSON(new WinterFlowUserManagerController[16]);
                                                    }
                                                    if (winterFlowUserManagerController5 != null) {
                                                        winterFlowJSON2.WinterFlowHookDataSource(winterFlowUserManagerController5);
                                                        winterFlowUserManagerController5 = null;
                                                    }
                                                    winterFlowJSON2.WinterFlowHookDataSource(winterFlowUserManagerController6);
                                                }
                                            }
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    winterFlowUserManagerController5 = WinterFlowCloudStack.WinterFlowPackageIDE(winterFlowJSON2);
                                }
                            }
                            winterFlowUserManagerController4 = winterFlowUserManagerController4.WinterFlowSyntax;
                        }
                    }
                    WinterFlowSyntaxSubsystem2 = WinterFlowSyntaxSubsystem2.WinterFlowVariableBandwidth();
                    winterFlowUserManagerController4 = (WinterFlowSyntaxSubsystem2 == null || (winterFlowExceptionStrategy = WinterFlowSyntaxSubsystem2.WinterFlowUserManagerUserManager) == null) ? null : winterFlowExceptionStrategy.WinterFlowVariableVersionControl;
                }
                winterFlowCacheManagerTransactionManager = winterFlowCacheManagerTransactionManager2;
            }
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                WinterFlowUserManagerBackend winterFlowUserManagerBackend = (WinterFlowUserManagerBackend) arrayList.get(i3);
                if (!(winterFlowCacheManagerTransactionManager != null ? winterFlowCacheManagerTransactionManager.WinterFlowCacheManagerAgent(winterFlowUserManagerBackend) : false)) {
                    winterFlowUserManagerBackend.WinterFlowVariableBandwidth();
                }
            }
        }
    }

    public final boolean WinterFlowSerializerStructure(int i) {
        if (i != 7 && i != 8) {
            Integer WinterFlowCacheManagerAgent = WinterFlowRouterDeserialization.WinterFlowCacheManagerAgent(i);
            if (WinterFlowCacheManagerAgent == null) {
                throw WinterFlowResolverBackend.WinterFlowUnitTestResponse("Invalid focus direction");
            }
            int intValue = WinterFlowCacheManagerAgent.intValue();
            WinterFlowDeploymentWidget WinterFlowTransactionManagerStrategy = ((WinterFlowHookMechanism) getFocusOwner()).WinterFlowTransactionManagerStrategy();
            if (WinterFlowTransactionManagerStrategy == null) {
                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("findNextViewInEmbeddedView called when owner does not have anything focused.");
                return false;
            }
            Integer WinterFlowCacheManagerAgent2 = WinterFlowRouterDeserialization.WinterFlowCacheManagerAgent(i);
            if (WinterFlowCacheManagerAgent2 == null) {
                throw WinterFlowResolverBackend.WinterFlowUnitTestResponse("Invalid focus direction");
            }
            int intValue2 = WinterFlowCacheManagerAgent2.intValue();
            WinterFlowServiceProviderController winterFlowServiceProviderController = WinterFlowCloudStack.WinterFlowSyntaxSubsystem(WinterFlowTransactionManagerStrategy).WinterFlowVariableBandwidth;
            View interopView = winterFlowServiceProviderController != null ? winterFlowServiceProviderController.getInteropView() : null;
            View findFocus = findFocus();
            FocusFinder focusFinder = FocusFinder.getInstance();
            View rootView = getRootView();
            rootView.getClass();
            View findNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, findFocus, intValue2);
            if (findNextFocus == null || interopView == null || !WinterFlowEncryptionSubsystem.WinterFlowBandwidthObject(interopView, findNextFocus)) {
                findNextFocus = null;
            }
            if (findNextFocus != null) {
                return WinterFlowRouterDeserialization.WinterFlowHookDataSource(findNextFocus, Integer.valueOf(intValue), null);
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00be A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b6, B:27:0x00be, B:28:0x00c1, B:30:0x00c5, B:32:0x00cb, B:34:0x00cf, B:35:0x00d5, B:38:0x00dd, B:41:0x00e5, B:42:0x00f1, B:44:0x00f7, B:46:0x00fd, B:48:0x0103, B:49:0x0109, B:51:0x010d, B:52:0x0111, B:57:0x0124, B:59:0x0128, B:60:0x012f, B:66:0x0140, B:67:0x014a, B:69:0x0152, B:70:0x0155, B:76:0x015c), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cf A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b6, B:27:0x00be, B:28:0x00c1, B:30:0x00c5, B:32:0x00cb, B:34:0x00cf, B:35:0x00d5, B:38:0x00dd, B:41:0x00e5, B:42:0x00f1, B:44:0x00f7, B:46:0x00fd, B:48:0x0103, B:49:0x0109, B:51:0x010d, B:52:0x0111, B:57:0x0124, B:59:0x0128, B:60:0x012f, B:66:0x0140, B:67:0x014a, B:69:0x0152, B:70:0x0155, B:76:0x015c), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0103 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b6, B:27:0x00be, B:28:0x00c1, B:30:0x00c5, B:32:0x00cb, B:34:0x00cf, B:35:0x00d5, B:38:0x00dd, B:41:0x00e5, B:42:0x00f1, B:44:0x00f7, B:46:0x00fd, B:48:0x0103, B:49:0x0109, B:51:0x010d, B:52:0x0111, B:57:0x0124, B:59:0x0128, B:60:0x012f, B:66:0x0140, B:67:0x014a, B:69:0x0152, B:70:0x0155, B:76:0x015c), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010d A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b6, B:27:0x00be, B:28:0x00c1, B:30:0x00c5, B:32:0x00cb, B:34:0x00cf, B:35:0x00d5, B:38:0x00dd, B:41:0x00e5, B:42:0x00f1, B:44:0x00f7, B:46:0x00fd, B:48:0x0103, B:49:0x0109, B:51:0x010d, B:52:0x0111, B:57:0x0124, B:59:0x0128, B:60:0x012f, B:66:0x0140, B:67:0x014a, B:69:0x0152, B:70:0x0155, B:76:0x015c), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0128 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b6, B:27:0x00be, B:28:0x00c1, B:30:0x00c5, B:32:0x00cb, B:34:0x00cf, B:35:0x00d5, B:38:0x00dd, B:41:0x00e5, B:42:0x00f1, B:44:0x00f7, B:46:0x00fd, B:48:0x0103, B:49:0x0109, B:51:0x010d, B:52:0x0111, B:57:0x0124, B:59:0x0128, B:60:0x012f, B:66:0x0140, B:67:0x014a, B:69:0x0152, B:70:0x0155, B:76:0x015c), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0140 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b6, B:27:0x00be, B:28:0x00c1, B:30:0x00c5, B:32:0x00cb, B:34:0x00cf, B:35:0x00d5, B:38:0x00dd, B:41:0x00e5, B:42:0x00f1, B:44:0x00f7, B:46:0x00fd, B:48:0x0103, B:49:0x0109, B:51:0x010d, B:52:0x0111, B:57:0x0124, B:59:0x0128, B:60:0x012f, B:66:0x0140, B:67:0x014a, B:69:0x0152, B:70:0x0155, B:76:0x015c), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0152 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b6, B:27:0x00be, B:28:0x00c1, B:30:0x00c5, B:32:0x00cb, B:34:0x00cf, B:35:0x00d5, B:38:0x00dd, B:41:0x00e5, B:42:0x00f1, B:44:0x00f7, B:46:0x00fd, B:48:0x0103, B:49:0x0109, B:51:0x010d, B:52:0x0111, B:57:0x0124, B:59:0x0128, B:60:0x012f, B:66:0x0140, B:67:0x014a, B:69:0x0152, B:70:0x0155, B:76:0x015c), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0155 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b6, B:27:0x00be, B:28:0x00c1, B:30:0x00c5, B:32:0x00cb, B:34:0x00cf, B:35:0x00d5, B:38:0x00dd, B:41:0x00e5, B:42:0x00f1, B:44:0x00f7, B:46:0x00fd, B:48:0x0103, B:49:0x0109, B:51:0x010d, B:52:0x0111, B:57:0x0124, B:59:0x0128, B:60:0x012f, B:66:0x0140, B:67:0x014a, B:69:0x0152, B:70:0x0155, B:76:0x015c), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x004e A[Catch: all -> 0x0076, TryCatch #0 {all -> 0x0076, blocks: (B:90:0x0034, B:92:0x003e, B:97:0x004e, B:100:0x007d, B:102:0x0081, B:13:0x0093, B:21:0x00a6, B:23:0x00ac, B:103:0x0056, B:109:0x0062, B:112:0x006a), top: B:89:0x0034 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int WinterFlowServerProtocol(MotionEvent motionEvent) {
        boolean z;
        int actionMasked;
        MotionEvent motionEvent2;
        WinterFlowSyntaxTransactionManager winterFlowSyntaxTransactionManager;
        MotionEvent motionEvent3;
        int pointerId;
        int action;
        boolean z2;
        WinterFlowParserVersionControl winterFlowParserVersionControl;
        removeCallbacks(this.WinterFlowServerStack);
        try {
            WinterFlowCompilerVariable(motionEvent);
            this.WinterFlowStrategyHook = true;
            WinterFlowBatchUI(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked2 = motionEvent.getActionMasked();
                MotionEvent motionEvent4 = this.WinterFlowFrameworkCacheManager;
                boolean z3 = motionEvent4 != null && motionEvent4.getToolType(0) == 3;
                WinterFlowRepositoryFramework winterFlowRepositoryFramework = this.WinterFlowFrontendBackend;
                if (motionEvent4 != null) {
                    try {
                        if (motionEvent4.getSource() == motionEvent.getSource() && motionEvent4.getToolType(0) == motionEvent.getToolType(0)) {
                            z = false;
                            if (z) {
                                if (motionEvent4.getButtonState() != 0 || (actionMasked = motionEvent4.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6) {
                                    motionEvent2 = motionEvent4;
                                    if (!winterFlowRepositoryFramework.WinterFlowRouterStructure) {
                                        ((WinterFlowDatabaseRenderer) ((WinterFlowJSONDecorator) winterFlowRepositoryFramework.WinterFlowArrayNetwork).WinterFlowTransactionManagerStrategy).WinterFlowRouterStructure();
                                        ((WinterFlowParserVersionControl) winterFlowRepositoryFramework.WinterFlowCacheManagerAgent).WinterFlowCacheManagerAgent();
                                    }
                                } else if (motionEvent4.getActionMasked() != 10 && z3) {
                                    WinterFlowSoftwareProtocol(motionEvent4, 10, motionEvent4.getEventTime(), true);
                                    motionEvent2 = motionEvent4;
                                }
                                boolean z4 = motionEvent.getToolType(0) != 3;
                                if (z3 && z4 && actionMasked2 != 3 && actionMasked2 != 9 && WinterFlowConcurrencyThread(motionEvent)) {
                                    winterFlowSyntaxTransactionManager = this;
                                    winterFlowSyntaxTransactionManager.WinterFlowSoftwareProtocol(motionEvent, 9, motionEvent.getEventTime(), true);
                                } else {
                                    winterFlowSyntaxTransactionManager = this;
                                }
                                if (motionEvent2 != null) {
                                    motionEvent2.recycle();
                                }
                                motionEvent3 = winterFlowSyntaxTransactionManager.WinterFlowFrameworkCacheManager;
                                if (motionEvent3 != null && motionEvent3.getAction() == 10) {
                                    MotionEvent motionEvent5 = winterFlowSyntaxTransactionManager.WinterFlowFrameworkCacheManager;
                                    pointerId = motionEvent5 == null ? motionEvent5.getPointerId(0) : -1;
                                    action = motionEvent.getAction();
                                    WinterFlowGatewaySyntax winterFlowGatewaySyntax = winterFlowSyntaxTransactionManager.WinterFlowCompilerHandler;
                                    if (action == 9 || motionEvent.getHistorySize() != 0) {
                                        if (motionEvent.getAction() == 0 && motionEvent.getHistorySize() == 0) {
                                            MotionEvent motionEvent6 = winterFlowSyntaxTransactionManager.WinterFlowFrameworkCacheManager;
                                            float x = motionEvent6 == null ? motionEvent6.getX() : Float.NaN;
                                            MotionEvent motionEvent7 = winterFlowSyntaxTransactionManager.WinterFlowFrameworkCacheManager;
                                            z2 = x == motionEvent.getX() || (motionEvent7 != null ? motionEvent7.getY() : Float.NaN) != motionEvent.getY();
                                            MotionEvent motionEvent8 = winterFlowSyntaxTransactionManager.WinterFlowFrameworkCacheManager;
                                            boolean z5 = (motionEvent8 == null ? motionEvent8.getEventTime() : -1L) == motionEvent.getEventTime();
                                            if (!z2 || z5) {
                                                if (pointerId >= 0) {
                                                    winterFlowGatewaySyntax.WinterFlowCacheManagerAgent.delete(pointerId);
                                                    winterFlowGatewaySyntax.WinterFlowHookDataSource.delete(pointerId);
                                                }
                                                winterFlowParserVersionControl = (WinterFlowParserVersionControl) winterFlowRepositoryFramework.WinterFlowCacheManagerAgent;
                                                if (winterFlowParserVersionControl.WinterFlowArrayNetwork) {
                                                    winterFlowParserVersionControl.WinterFlowUnitTestResponse.WinterFlowRouterStructure.WinterFlowUnitTestResponse();
                                                } else {
                                                    winterFlowParserVersionControl.WinterFlowArrayNetwork = true;
                                                }
                                            }
                                        }
                                    } else if (pointerId >= 0) {
                                        winterFlowGatewaySyntax.WinterFlowCacheManagerAgent.delete(pointerId);
                                        winterFlowGatewaySyntax.WinterFlowHookDataSource.delete(pointerId);
                                    }
                                }
                                winterFlowSyntaxTransactionManager.WinterFlowFrameworkCacheManager = MotionEvent.obtainNoHistory(motionEvent);
                                int WinterFlowPackageIDE = WinterFlowPackageIDE(motionEvent);
                                Trace.endSection();
                                winterFlowSyntaxTransactionManager.WinterFlowStrategyHook = false;
                                return WinterFlowPackageIDE;
                            }
                        }
                        z = true;
                        if (z) {
                        }
                    } catch (Throwable th) {
                        th = th;
                        Trace.endSection();
                        throw th;
                    }
                }
                motionEvent2 = motionEvent4;
                if (motionEvent.getToolType(0) != 3) {
                }
                if (z3) {
                }
                winterFlowSyntaxTransactionManager = this;
                if (motionEvent2 != null) {
                }
                motionEvent3 = winterFlowSyntaxTransactionManager.WinterFlowFrameworkCacheManager;
                if (motionEvent3 != null) {
                    MotionEvent motionEvent52 = winterFlowSyntaxTransactionManager.WinterFlowFrameworkCacheManager;
                    if (motionEvent52 == null) {
                    }
                    action = motionEvent.getAction();
                    WinterFlowGatewaySyntax winterFlowGatewaySyntax2 = winterFlowSyntaxTransactionManager.WinterFlowCompilerHandler;
                    if (action == 9) {
                    }
                    if (motionEvent.getAction() == 0) {
                        MotionEvent motionEvent62 = winterFlowSyntaxTransactionManager.WinterFlowFrameworkCacheManager;
                        if (motionEvent62 == null) {
                        }
                        MotionEvent motionEvent72 = winterFlowSyntaxTransactionManager.WinterFlowFrameworkCacheManager;
                        if (motionEvent72 != null) {
                        }
                        if (x == motionEvent.getX()) {
                        }
                        MotionEvent motionEvent82 = winterFlowSyntaxTransactionManager.WinterFlowFrameworkCacheManager;
                        if ((motionEvent82 == null ? motionEvent82.getEventTime() : -1L) == motionEvent.getEventTime()) {
                        }
                        if (!z2) {
                        }
                        if (pointerId >= 0) {
                        }
                        winterFlowParserVersionControl = (WinterFlowParserVersionControl) winterFlowRepositoryFramework.WinterFlowCacheManagerAgent;
                        if (winterFlowParserVersionControl.WinterFlowArrayNetwork) {
                        }
                    }
                }
                winterFlowSyntaxTransactionManager.WinterFlowFrameworkCacheManager = MotionEvent.obtainNoHistory(motionEvent);
                int WinterFlowPackageIDE2 = WinterFlowPackageIDE(motionEvent);
                Trace.endSection();
                winterFlowSyntaxTransactionManager.WinterFlowStrategyHook = false;
                return WinterFlowPackageIDE2;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            this.WinterFlowStrategyHook = false;
            throw th3;
        }
    }

    public final void WinterFlowServiceUtility(WinterFlowSchedulerStructure winterFlowSchedulerStructure) {
        this.WinterFlowVariableInterface.WinterFlowMapperProtocol(winterFlowSchedulerStructure, false);
        WinterFlowJSON WinterFlowResolverController = winterFlowSchedulerStructure.WinterFlowResolverController();
        Object[] objArr = WinterFlowResolverController.WinterFlowVariableVersionControl;
        int i = WinterFlowResolverController.WinterFlowUnitTestResponse;
        for (int i2 = 0; i2 < i; i2++) {
            WinterFlowServiceUtility((WinterFlowSchedulerStructure) objArr[i2]);
        }
    }

    public final boolean WinterFlowSingletonPlatform(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.WinterFlowFrameworkCacheManager) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void WinterFlowSoftwareEngine() {
        boolean z;
        View view;
        float[] fArr;
        int i;
        int[] iArr = this.WinterFlowBandwidth;
        getLocationOnScreen(iArr);
        long j = this.WinterFlowAPIFrontend;
        int i2 = (int) (j >> 32);
        int i3 = (int) (j & 4294967295L);
        int i4 = iArr[0];
        if (i2 != i4 || i3 != iArr[1] || this.WinterFlowArrayFramework < 0) {
            this.WinterFlowAPIFrontend = (4294967295L & iArr[1]) | (i4 << 32);
            if (i2 != Integer.MAX_VALUE && i3 != Integer.MAX_VALUE) {
                WinterFlowJSON WinterFlowResolverController = getRoot().WinterFlowResolverController();
                Object[] objArr = WinterFlowResolverController.WinterFlowVariableVersionControl;
                int i5 = WinterFlowResolverController.WinterFlowUnitTestResponse;
                for (int i6 = 0; i6 < i5; i6++) {
                    ((WinterFlowSchedulerStructure) objArr[i6]).WinterFlowSoftwareEngine.WinterFlowOrchestrationSubsystem.WinterFlowHookQuery();
                }
                z = true;
                WinterFlowArrayHelper();
                view = this.WinterFlowDebugSession;
                if (view == null) {
                    view = getRootView();
                    this.WinterFlowDebugSession = view;
                }
                WinterFlowInterfaceManager rectManager = getRectManager();
                long j2 = this.WinterFlowAPIFrontend;
                long WinterFlowStrategyTool = WinterFlowQuerySyntax.WinterFlowStrategyTool(this.WinterFlowPipelineSoftware);
                int width = view.getWidth();
                int height = view.getHeight();
                rectManager.getClass();
                fArr = this.WinterFlowCacheManagerException;
                if (fArr.length >= 16) {
                    i = 0;
                } else {
                    i = (((fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f) ? 1 : 0) << 1) | ((fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f) ? 1 : 0);
                }
                WinterFlowThreadPoolMicroservice winterFlowThreadPoolMicroservice = rectManager.WinterFlowCacheManagerAgent;
                if ((i & 2) != 0) {
                    fArr = null;
                }
                rectManager.WinterFlowTransactionManagerStrategy = !winterFlowThreadPoolMicroservice.WinterFlowHookDataSource(j2, WinterFlowStrategyTool, fArr, width, height) || rectManager.WinterFlowTransactionManagerStrategy;
                this.WinterFlowVariableInterface.WinterFlowCacheManagerAgent(z);
                getRectManager().WinterFlowRouterStructure();
            }
        }
        z = false;
        WinterFlowArrayHelper();
        view = this.WinterFlowDebugSession;
        if (view == null) {
        }
        WinterFlowInterfaceManager rectManager2 = getRectManager();
        long j22 = this.WinterFlowAPIFrontend;
        long WinterFlowStrategyTool2 = WinterFlowQuerySyntax.WinterFlowStrategyTool(this.WinterFlowPipelineSoftware);
        int width2 = view.getWidth();
        int height2 = view.getHeight();
        rectManager2.getClass();
        fArr = this.WinterFlowCacheManagerException;
        if (fArr.length >= 16) {
        }
        WinterFlowThreadPoolMicroservice winterFlowThreadPoolMicroservice2 = rectManager2.WinterFlowCacheManagerAgent;
        if ((i & 2) != 0) {
        }
        rectManager2.WinterFlowTransactionManagerStrategy = !winterFlowThreadPoolMicroservice2.WinterFlowHookDataSource(j22, WinterFlowStrategyTool2, fArr, width2, height2) || rectManager2.WinterFlowTransactionManagerStrategy;
        this.WinterFlowVariableInterface.WinterFlowCacheManagerAgent(z);
        getRectManager().WinterFlowRouterStructure();
    }

    public final void WinterFlowSoftwareProtocol(MotionEvent motionEvent, int i, long j, boolean z) {
        int actionMasked = motionEvent.getActionMasked();
        int i2 = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                i2 = motionEvent.getActionIndex();
            }
        } else if (i != 9 && i != 10) {
            i2 = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (i2 >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i3 = 0; i3 < pointerCount; i3++) {
            pointerPropertiesArr[i3] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i4 = 0; i4 < pointerCount; i4++) {
            pointerCoordsArr[i4] = new MotionEvent.PointerCoords();
        }
        int i5 = 0;
        while (i5 < pointerCount) {
            int i6 = ((i2 < 0 || i5 < i2) ? 0 : 1) + i5;
            motionEvent.getPointerProperties(i6, pointerPropertiesArr[i5]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i5];
            motionEvent.getPointerCoords(i6, pointerCoords);
            float f = pointerCoords.x;
            long WinterFlowVariableBandwidth = WinterFlowVariableBandwidth((Float.floatToRawIntBits(pointerCoords.y) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
            pointerCoords.x = Float.intBitsToFloat((int) (WinterFlowVariableBandwidth >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (WinterFlowVariableBandwidth & 4294967295L));
            i5++;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j : motionEvent.getDownTime(), j, i, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        WinterFlowAlgorithmArray WinterFlowCacheManagerAgent = this.WinterFlowCompilerHandler.WinterFlowCacheManagerAgent(obtain, this);
        WinterFlowCacheManagerAgent.getClass();
        this.WinterFlowFrontendBackend.WinterFlowRouterStructure(WinterFlowCacheManagerAgent, this, true);
        obtain.recycle();
    }

    public final void WinterFlowStrategyTool(WinterFlowSchedulerStructure winterFlowSchedulerStructure) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (winterFlowSchedulerStructure != null) {
            while (winterFlowSchedulerStructure != null && winterFlowSchedulerStructure.WinterFlowConcurrencyThread() == WinterFlowMapperSubsystem.WinterFlowVariableVersionControl) {
                if (!this.WinterFlowSessionManagerInterface) {
                    WinterFlowSchedulerStructure WinterFlowVariableBandwidth = winterFlowSchedulerStructure.WinterFlowVariableBandwidth();
                    if (WinterFlowVariableBandwidth == null) {
                        break;
                    }
                    long j = WinterFlowVariableBandwidth.WinterFlowUserManagerUserManager.WinterFlowCacheManagerAgent.WinterFlowRouterRouter;
                    if (WinterFlowHandlerConsumer.WinterFlowTransactionManagerStrategy(j) && WinterFlowHandlerConsumer.WinterFlowVariableVersionControl(j)) {
                        break;
                    }
                }
                winterFlowSchedulerStructure = winterFlowSchedulerStructure.WinterFlowVariableBandwidth();
            }
            if (winterFlowSchedulerStructure == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    public final void WinterFlowSyntaxSubsystem(float f) {
        if (WinterFlowBandwidthObject()) {
            if (f > 0.0f) {
                if (Float.isNaN(this.WinterFlowUIPlatform) || f > this.WinterFlowUIPlatform) {
                    this.WinterFlowUIPlatform = f;
                    return;
                }
                return;
            }
            if (f < 0.0f) {
                if (Float.isNaN(this.WinterFlowUserManagerConcurrency) || f < this.WinterFlowUserManagerConcurrency) {
                    this.WinterFlowUserManagerConcurrency = f;
                }
            }
        }
    }

    @Override // com.google.android.datatransport.WinterFlowJSONWorker
    public final void WinterFlowTransactionManagerStrategy(WinterFlowDecoratorVersion winterFlowDecoratorVersion) {
        WinterFlowClassNetwork winterFlowClassNetwork;
        if (Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(WinterFlowManagerRequest.WinterFlowEventEmitterController());
        }
        WinterFlowEventEmitterNetwork winterFlowEventEmitterNetwork = this.WinterFlowTransactionAgent;
        if (winterFlowEventEmitterNetwork != null) {
            WinterFlowCloudThread winterFlowCloudThread = this.WinterFlowResponseEngine;
            winterFlowCloudThread.getClass();
            WinterFlowDeploymentBandwidth winterFlowDeploymentBandwidth = (WinterFlowDeploymentBandwidth) winterFlowEventEmitterNetwork.WinterFlowRouterStructure.WinterFlowTransactionManagerStrategy;
            if (!winterFlowDeploymentBandwidth.WinterFlowVariableVersionControl || winterFlowDeploymentBandwidth.WinterFlowUnitTestResponse) {
                return;
            }
            try {
                winterFlowClassNetwork = ((WinterFlowTransactionManagerDeserialization) winterFlowCloudThread).WinterFlowRouterStructure.WinterFlowVariableBandwidth(new WinterFlowRouterEngine(8, winterFlowEventEmitterNetwork));
            } catch (CancellationException unused) {
                if (!winterFlowDeploymentBandwidth.WinterFlowTransactionManagerStrategy) {
                    if (winterFlowDeploymentBandwidth.WinterFlowUnitTestResponse) {
                        WinterFlowListenerScheduler.WinterFlowRouterStructure("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    winterFlowDeploymentBandwidth.WinterFlowRouterStructure();
                    winterFlowDeploymentBandwidth.WinterFlowUnitTestResponse = true;
                }
                winterFlowClassNetwork = null;
            }
            WinterFlowClassNetwork winterFlowClassNetwork2 = winterFlowEventEmitterNetwork.WinterFlowArrayNetwork;
            if (winterFlowClassNetwork2 != null) {
                winterFlowClassNetwork2.cancel();
            }
            winterFlowEventEmitterNetwork.WinterFlowArrayNetwork = winterFlowClassNetwork;
        }
    }

    public final void WinterFlowUnitTestResponse(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        int WinterFlowArrayNetwork;
        WinterFlowBackendEventEmitter winterFlowBackendEventEmitter = this.WinterFlowConfigurationSubsystem;
        if (WinterFlowManagerRequest.WinterFlowThreadListener(str, winterFlowBackendEventEmitter.WinterFlowSoftwareProtocol)) {
            int WinterFlowArrayNetwork2 = winterFlowBackendEventEmitter.WinterFlowCacheManagerListener.WinterFlowArrayNetwork(i);
            if (WinterFlowArrayNetwork2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, WinterFlowArrayNetwork2);
                return;
            }
            return;
        }
        if (!WinterFlowManagerRequest.WinterFlowThreadListener(str, winterFlowBackendEventEmitter.WinterFlowUserManagerUserManager) || (WinterFlowArrayNetwork = winterFlowBackendEventEmitter.WinterFlowPackageIDE.WinterFlowArrayNetwork(i)) == -1) {
            return;
        }
        accessibilityNodeInfo.getExtras().putInt(str, WinterFlowArrayNetwork);
    }

    public final void WinterFlowUserManagerUserManager(Configuration configuration) {
        Configuration configuration2 = getConfiguration();
        if (WinterFlowManagerRequest.WinterFlowThreadListener(configuration2, configuration)) {
            return;
        }
        setConfiguration(new Configuration(configuration));
        if (configuration2.fontScale != configuration.fontScale || configuration2.densityDpi != configuration.densityDpi) {
            setDensity(WinterFlowUnitTestLibrary.WinterFlowHookDataSource(getContext()));
        }
        if ((configuration2.diff(configuration) & (-1342235264)) != 0) {
            this.WinterFlowBatchUI.getClass();
        }
    }

    public final long WinterFlowVariableBandwidth(long j) {
        WinterFlowArrayHelper();
        long WinterFlowSoftwareProtocol = WinterFlowUnitTestLibrary.WinterFlowSoftwareProtocol(this.WinterFlowCacheManagerException, j);
        float intBitsToFloat = Float.intBitsToFloat((int) (this.WinterFlowPipelineSoftware >> 32)) + Float.intBitsToFloat((int) (WinterFlowSoftwareProtocol >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (this.WinterFlowPipelineSoftware & 4294967295L)) + Float.intBitsToFloat((int) (WinterFlowSoftwareProtocol & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        WinterFlowDeploymentWidget winterFlowDeploymentWidget = ((WinterFlowHookMechanism) getFocusOwner()).WinterFlowCacheManagerAgent;
        if (!winterFlowDeploymentWidget.WinterFlowSingletonPlatform) {
            return;
        }
        if (!winterFlowDeploymentWidget.WinterFlowVariableVersionControl.WinterFlowSingletonPlatform) {
            WinterFlowViewUtility.WinterFlowHookDataSource("visitSubtreeIf called on an unattached node");
        }
        WinterFlowJSON winterFlowJSON = new WinterFlowJSON(new WinterFlowUserManagerController[16]);
        WinterFlowUserManagerController winterFlowUserManagerController = winterFlowDeploymentWidget.WinterFlowVariableVersionControl;
        WinterFlowUserManagerController winterFlowUserManagerController2 = winterFlowUserManagerController.WinterFlowResponseEngine;
        if (winterFlowUserManagerController2 == null) {
            WinterFlowCloudStack.WinterFlowArrayNetwork(winterFlowJSON, winterFlowUserManagerController);
        } else {
            winterFlowJSON.WinterFlowHookDataSource(winterFlowUserManagerController2);
        }
        while (true) {
            int i3 = winterFlowJSON.WinterFlowUnitTestResponse;
            if (i3 == 0) {
                return;
            }
            WinterFlowUserManagerController winterFlowUserManagerController3 = (WinterFlowUserManagerController) winterFlowJSON.WinterFlowTransactionAgent(i3 - 1);
            if ((winterFlowUserManagerController3.WinterFlowRouterRouter & 1024) != 0) {
                for (WinterFlowUserManagerController winterFlowUserManagerController4 = winterFlowUserManagerController3; winterFlowUserManagerController4 != null && winterFlowUserManagerController4.WinterFlowSingletonPlatform; winterFlowUserManagerController4 = winterFlowUserManagerController4.WinterFlowResponseEngine) {
                    if ((winterFlowUserManagerController4.WinterFlowUnitTestResponse & 1024) != 0) {
                        WinterFlowUserManagerController winterFlowUserManagerController5 = winterFlowUserManagerController4;
                        WinterFlowJSON winterFlowJSON2 = null;
                        while (winterFlowUserManagerController5 != null) {
                            int i4 = 0;
                            if (winterFlowUserManagerController5 instanceof WinterFlowDeploymentWidget) {
                                WinterFlowDeploymentWidget winterFlowDeploymentWidget2 = (WinterFlowDeploymentWidget) winterFlowUserManagerController5;
                                if (winterFlowDeploymentWidget2.WinterFlowSingletonPlatform && winterFlowDeploymentWidget2.WinterFlowUserManagerConcurrency().WinterFlowRouterStructure) {
                                    super.addFocusables(arrayList, i, i2);
                                    WinterFlowDeploymentWidget winterFlowDeploymentWidget3 = ((WinterFlowHookMechanism) getFocusOwner()).WinterFlowCacheManagerAgent;
                                    if (winterFlowDeploymentWidget3.WinterFlowSingletonPlatform) {
                                        if (!winterFlowDeploymentWidget3.WinterFlowVariableVersionControl.WinterFlowSingletonPlatform) {
                                            WinterFlowViewUtility.WinterFlowHookDataSource("visitSubtreeIf called on an unattached node");
                                        }
                                        WinterFlowJSON winterFlowJSON3 = new WinterFlowJSON(new WinterFlowUserManagerController[16]);
                                        WinterFlowUserManagerController winterFlowUserManagerController6 = winterFlowDeploymentWidget3.WinterFlowVariableVersionControl;
                                        WinterFlowUserManagerController winterFlowUserManagerController7 = winterFlowUserManagerController6.WinterFlowResponseEngine;
                                        if (winterFlowUserManagerController7 == null) {
                                            WinterFlowCloudStack.WinterFlowArrayNetwork(winterFlowJSON3, winterFlowUserManagerController6);
                                        } else {
                                            winterFlowJSON3.WinterFlowHookDataSource(winterFlowUserManagerController7);
                                        }
                                        while (true) {
                                            int i5 = winterFlowJSON3.WinterFlowUnitTestResponse;
                                            if (i5 == 0) {
                                                break;
                                            }
                                            WinterFlowUserManagerController winterFlowUserManagerController8 = (WinterFlowUserManagerController) winterFlowJSON3.WinterFlowTransactionAgent(i5 - 1);
                                            if ((winterFlowUserManagerController8.WinterFlowRouterRouter & 1024) != 0) {
                                                for (WinterFlowUserManagerController winterFlowUserManagerController9 = winterFlowUserManagerController8; winterFlowUserManagerController9 != null && winterFlowUserManagerController9.WinterFlowSingletonPlatform; winterFlowUserManagerController9 = winterFlowUserManagerController9.WinterFlowResponseEngine) {
                                                    if ((winterFlowUserManagerController9.WinterFlowUnitTestResponse & 1024) != 0) {
                                                        WinterFlowUserManagerController winterFlowUserManagerController10 = winterFlowUserManagerController9;
                                                        WinterFlowJSON winterFlowJSON4 = null;
                                                        while (winterFlowUserManagerController10 != null) {
                                                            if (winterFlowUserManagerController10 instanceof WinterFlowDeploymentWidget) {
                                                                WinterFlowDeploymentWidget winterFlowDeploymentWidget4 = (WinterFlowDeploymentWidget) winterFlowUserManagerController10;
                                                                if (winterFlowDeploymentWidget4.WinterFlowSingletonPlatform) {
                                                                    WinterFlowConsumerListener WinterFlowUserManagerConcurrency = winterFlowDeploymentWidget4.WinterFlowUserManagerConcurrency();
                                                                    if (winterFlowDeploymentWidget4.WinterFlowSingletonPlatform && !winterFlowDeploymentWidget4.WinterFlowVariableBandwidth && WinterFlowUserManagerConcurrency.WinterFlowRouterStructure) {
                                                                        return;
                                                                    }
                                                                }
                                                            } else if ((winterFlowUserManagerController10.WinterFlowUnitTestResponse & 1024) != 0 && (winterFlowUserManagerController10 instanceof WinterFlowTestingEntity)) {
                                                                int i6 = 0;
                                                                for (WinterFlowUserManagerController winterFlowUserManagerController11 = ((WinterFlowTestingEntity) winterFlowUserManagerController10).WinterFlowBatchUI; winterFlowUserManagerController11 != null; winterFlowUserManagerController11 = winterFlowUserManagerController11.WinterFlowResponseEngine) {
                                                                    if ((winterFlowUserManagerController11.WinterFlowUnitTestResponse & 1024) != 0) {
                                                                        i6++;
                                                                        if (i6 == 1) {
                                                                            winterFlowUserManagerController10 = winterFlowUserManagerController11;
                                                                        } else {
                                                                            if (winterFlowJSON4 == null) {
                                                                                winterFlowJSON4 = new WinterFlowJSON(new WinterFlowUserManagerController[16]);
                                                                            }
                                                                            if (winterFlowUserManagerController10 != null) {
                                                                                winterFlowJSON4.WinterFlowHookDataSource(winterFlowUserManagerController10);
                                                                                winterFlowUserManagerController10 = null;
                                                                            }
                                                                            winterFlowJSON4.WinterFlowHookDataSource(winterFlowUserManagerController11);
                                                                        }
                                                                    }
                                                                }
                                                                if (i6 == 1) {
                                                                }
                                                            }
                                                            winterFlowUserManagerController10 = WinterFlowCloudStack.WinterFlowPackageIDE(winterFlowJSON4);
                                                        }
                                                    }
                                                }
                                            }
                                            WinterFlowCloudStack.WinterFlowArrayNetwork(winterFlowJSON3, winterFlowUserManagerController8);
                                        }
                                    }
                                    if (arrayList != null) {
                                        arrayList.remove(this);
                                        return;
                                    }
                                    return;
                                }
                            } else if ((winterFlowUserManagerController5.WinterFlowUnitTestResponse & 1024) != 0 && (winterFlowUserManagerController5 instanceof WinterFlowTestingEntity)) {
                                for (WinterFlowUserManagerController winterFlowUserManagerController12 = ((WinterFlowTestingEntity) winterFlowUserManagerController5).WinterFlowBatchUI; winterFlowUserManagerController12 != null; winterFlowUserManagerController12 = winterFlowUserManagerController12.WinterFlowResponseEngine) {
                                    if ((winterFlowUserManagerController12.WinterFlowUnitTestResponse & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            winterFlowUserManagerController5 = winterFlowUserManagerController12;
                                        } else {
                                            if (winterFlowJSON2 == null) {
                                                winterFlowJSON2 = new WinterFlowJSON(new WinterFlowUserManagerController[16]);
                                            }
                                            if (winterFlowUserManagerController5 != null) {
                                                winterFlowJSON2.WinterFlowHookDataSource(winterFlowUserManagerController5);
                                                winterFlowUserManagerController5 = null;
                                            }
                                            winterFlowJSON2.WinterFlowHookDataSource(winterFlowUserManagerController12);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            winterFlowUserManagerController5 = WinterFlowCloudStack.WinterFlowPackageIDE(winterFlowJSON2);
                        }
                    }
                }
            }
            WinterFlowCloudStack.WinterFlowArrayNetwork(winterFlowJSON, winterFlowUserManagerController3);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        WinterFlowDecoratorBackend WinterFlowSerializerStructure;
        WinterFlowObjectSession winterFlowObjectSession;
        WinterFlowObjectSession winterFlowObjectSession2;
        WinterFlowHookThreadPool winterFlowHookThreadPool = this.WinterFlowCacheTool;
        if (winterFlowHookThreadPool != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int keyAt = sparseArray.keyAt(i);
                AutofillValue autofillValue = (AutofillValue) sparseArray.get(keyAt);
                WinterFlowSchedulerStructure winterFlowSchedulerStructure = (WinterFlowSchedulerStructure) winterFlowHookThreadPool.WinterFlowTransactionManagerStrategy.WinterFlowCacheManagerAgent.WinterFlowHookDataSource(keyAt);
                if (winterFlowSchedulerStructure != null && (WinterFlowSerializerStructure = winterFlowSchedulerStructure.WinterFlowSerializerStructure()) != null) {
                    WinterFlowDatabaseSchemaStructure winterFlowDatabaseSchemaStructure = WinterFlowSerializerStructure.WinterFlowVariableVersionControl;
                    Object WinterFlowUnitTestResponse = winterFlowDatabaseSchemaStructure.WinterFlowUnitTestResponse(WinterFlowCacheWorker.WinterFlowUnitTestResponse);
                    if (WinterFlowUnitTestResponse == null) {
                        WinterFlowUnitTestResponse = null;
                    }
                    WinterFlowDecoratorStrategy winterFlowDecoratorStrategy = (WinterFlowDecoratorStrategy) WinterFlowUnitTestResponse;
                    if (winterFlowDecoratorStrategy != null && (winterFlowObjectSession2 = (WinterFlowObjectSession) winterFlowDecoratorStrategy.WinterFlowHookDataSource) != null) {
                    }
                    Object WinterFlowUnitTestResponse2 = winterFlowDatabaseSchemaStructure.WinterFlowUnitTestResponse(WinterFlowCacheWorker.WinterFlowRouterRouter);
                    WinterFlowDecoratorStrategy winterFlowDecoratorStrategy2 = (WinterFlowDecoratorStrategy) (WinterFlowUnitTestResponse2 != null ? WinterFlowUnitTestResponse2 : null);
                    if (winterFlowDecoratorStrategy2 != null && (winterFlowObjectSession = (WinterFlowObjectSession) winterFlowDecoratorStrategy2.WinterFlowHookDataSource) != null) {
                    }
                }
            }
        }
        WinterFlowStackProvider winterFlowStackProvider = this.WinterFlowQueueService;
        if (winterFlowStackProvider != null) {
            WinterFlowCloudDataSource winterFlowCloudDataSource = (WinterFlowCloudDataSource) winterFlowStackProvider.WinterFlowTransactionManagerStrategy;
            if (winterFlowCloudDataSource.WinterFlowRouterStructure.isEmpty()) {
                return;
            }
            int size2 = sparseArray.size();
            for (int i2 = 0; i2 < size2; i2++) {
                int keyAt2 = sparseArray.keyAt(i2);
                AutofillValue autofillValue2 = (AutofillValue) sparseArray.get(keyAt2);
                if (autofillValue2.isText()) {
                    autofillValue2.getTextValue().toString();
                    if (winterFlowCloudDataSource.WinterFlowRouterStructure.get(Integer.valueOf(keyAt2)) != null) {
                        WinterFlowEventEmitterOrchestration.WinterFlowVariableBandwidth();
                        return;
                    }
                } else {
                    if (autofillValue2.isDate()) {
                        throw new WinterFlowDecoratorEventEmitter("An operation is not implemented: b/138604541: Add onFill() callback for date");
                    }
                    if (autofillValue2.isList()) {
                        throw new WinterFlowDecoratorEventEmitter("An operation is not implemented: b/138604541: Add onFill() callback for list");
                    }
                    if (autofillValue2.isToggle()) {
                        throw new WinterFlowDecoratorEventEmitter("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.WinterFlowConfigurationSubsystem.WinterFlowTransactionManagerStrategy(false, i, this.WinterFlowTransactionManagerStrategy);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.WinterFlowConfigurationSubsystem.WinterFlowTransactionManagerStrategy(true, i, this.WinterFlowTransactionManagerStrategy);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        WinterFlowMicroserviceFunction winterFlowMicroserviceFunction = this.WinterFlowUserManagerUserManager;
        if (!isAttachedToWindow()) {
            WinterFlowThreadListener(getRoot());
        }
        WinterFlowBatchUI(true);
        WinterFlowVersionProtocol.WinterFlowRouterRouter().WinterFlowThreadListener();
        this.WinterFlowSyntaxSubsystem = true;
        Trace.beginSection("AndroidOwner:draw");
        try {
            WinterFlowGatewayDeserialization winterFlowGatewayDeserialization = this.WinterFlowMapperProtocol;
            WinterFlowHookInterface winterFlowHookInterface = winterFlowGatewayDeserialization.WinterFlowRouterStructure;
            Canvas canvas2 = winterFlowHookInterface.WinterFlowRouterStructure;
            winterFlowHookInterface.WinterFlowRouterStructure = canvas;
            getRoot().WinterFlowSyntax(winterFlowHookInterface, null);
            winterFlowGatewayDeserialization.WinterFlowRouterStructure.WinterFlowRouterStructure = canvas2;
            if (winterFlowMicroserviceFunction.WinterFlowSyntax()) {
                int i = winterFlowMicroserviceFunction.WinterFlowHookDataSource;
                for (int i2 = 0; i2 < i; i2++) {
                    ((WinterFlowCompilerSyntax) ((WinterFlowMicroserviceProxy) winterFlowMicroserviceFunction.WinterFlowTransactionManagerStrategy(i2))).WinterFlowUnitTestResponse();
                }
            }
            int i3 = WinterFlowWidgetRuntime.WinterFlowVariableVersionControl;
            winterFlowMicroserviceFunction.WinterFlowArrayNetwork();
            this.WinterFlowSyntaxSubsystem = false;
            Trace.endSection();
            WinterFlowMicroserviceFunction winterFlowMicroserviceFunction2 = this.WinterFlowSoftwareEngine;
            if (winterFlowMicroserviceFunction2 != null) {
                winterFlowMicroserviceFunction.WinterFlowHookDataSource(winterFlowMicroserviceFunction2);
                winterFlowMicroserviceFunction2.WinterFlowArrayNetwork();
            }
            if (WinterFlowBandwidthObject()) {
                WinterFlowSerializerHandler.WinterFlowRouterStructure(this, this.WinterFlowUIPlatform);
                View view = this.WinterFlowOrchestrationSubsystem;
                if (view != null) {
                    WinterFlowSerializerHandler.WinterFlowRouterStructure(view, this.WinterFlowUserManagerConcurrency);
                    if (!Float.isNaN(this.WinterFlowUserManagerConcurrency)) {
                        view.invalidate();
                        drawChild(canvas, view, getDrawingTime());
                    }
                }
                this.WinterFlowUIPlatform = Float.NaN;
                this.WinterFlowUserManagerConcurrency = Float.NaN;
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:652:0x0434, code lost:
    
        if ((r2 / r3) >= 5.0f) goto L249;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [com.google.android.datatransport.WinterFlowUserManagerController] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v17, types: [com.google.android.datatransport.WinterFlowInheritanceInterface] */
    /* JADX WARN: Type inference failed for: r0v32, types: [com.google.android.datatransport.WinterFlowUserManagerController] */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v40, types: [com.google.android.datatransport.WinterFlowInheritanceInterface] */
    /* JADX WARN: Type inference failed for: r2v41, types: [com.google.android.datatransport.WinterFlowUserManagerController] */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v46, types: [com.google.android.datatransport.WinterFlowInheritanceInterface] */
    /* JADX WARN: Type inference failed for: r2v74 */
    /* JADX WARN: Type inference failed for: r2v75 */
    /* JADX WARN: Type inference failed for: r2v77, types: [com.google.android.datatransport.WinterFlowInheritanceInterface] */
    /* JADX WARN: Type inference failed for: r33v0 */
    /* JADX WARN: Type inference failed for: r33v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r33v2 */
    /* JADX WARN: Type inference failed for: r39v0 */
    /* JADX WARN: Type inference failed for: r39v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r39v2 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27, types: [com.google.android.datatransport.WinterFlowLibraryDeployment, com.google.android.datatransport.WinterFlowUserManagerBackend] */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v40, types: [com.google.android.datatransport.WinterFlowUserManagerController] */
    /* JADX WARN: Type inference failed for: r3v79 */
    /* JADX WARN: Type inference failed for: r3v82 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v28, types: [com.google.android.datatransport.WinterFlowJSON] */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32, types: [com.google.android.datatransport.WinterFlowJSON] */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35, types: [com.google.android.datatransport.WinterFlowLibraryDeployment, com.google.android.datatransport.WinterFlowUserManagerBackend] */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v48 */
    /* JADX WARN: Type inference failed for: r4v49, types: [com.google.android.datatransport.WinterFlowUserManagerController] */
    /* JADX WARN: Type inference failed for: r4v58 */
    /* JADX WARN: Type inference failed for: r4v61 */
    /* JADX WARN: Type inference failed for: r4v63 */
    /* JADX WARN: Type inference failed for: r4v64 */
    /* JADX WARN: Type inference failed for: r4v65 */
    /* JADX WARN: Type inference failed for: r4v66 */
    /* JADX WARN: Type inference failed for: r4v67 */
    /* JADX WARN: Type inference failed for: r4v68 */
    /* JADX WARN: Type inference failed for: r4v69 */
    /* JADX WARN: Type inference failed for: r4v70 */
    /* JADX WARN: Type inference failed for: r4v71 */
    /* JADX WARN: Type inference failed for: r4v74 */
    /* JADX WARN: Type inference failed for: r4v75 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33, types: [com.google.android.datatransport.WinterFlowUserManagerController, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35, types: [com.google.android.datatransport.WinterFlowUserManagerController] */
    /* JADX WARN: Type inference failed for: r5v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v54 */
    /* JADX WARN: Type inference failed for: r5v55, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v56 */
    /* JADX WARN: Type inference failed for: r5v57 */
    /* JADX WARN: Type inference failed for: r5v58 */
    /* JADX WARN: Type inference failed for: r5v59 */
    /* JADX WARN: Type inference failed for: r5v60 */
    /* JADX WARN: Type inference failed for: r5v65, types: [com.google.android.datatransport.WinterFlowJSON] */
    /* JADX WARN: Type inference failed for: r5v66 */
    /* JADX WARN: Type inference failed for: r5v67 */
    /* JADX WARN: Type inference failed for: r5v68 */
    /* JADX WARN: Type inference failed for: r5v69, types: [com.google.android.datatransport.WinterFlowJSON] */
    /* JADX WARN: Type inference failed for: r5v82 */
    /* JADX WARN: Type inference failed for: r5v83 */
    /* JADX WARN: Type inference failed for: r5v84 */
    /* JADX WARN: Type inference failed for: r5v85 */
    /* JADX WARN: Type inference failed for: r5v86 */
    /* JADX WARN: Type inference failed for: r5v87 */
    /* JADX WARN: Type inference failed for: r5v88 */
    /* JADX WARN: Type inference failed for: r5v89 */
    /* JADX WARN: Type inference failed for: r5v90 */
    /* JADX WARN: Type inference failed for: r5v93 */
    /* JADX WARN: Type inference failed for: r5v94 */
    /* JADX WARN: Type inference failed for: r5v95 */
    /* JADX WARN: Type inference failed for: r5v96 */
    /* JADX WARN: Type inference failed for: r5v97 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15, types: [com.google.android.datatransport.WinterFlowJSON] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18, types: [com.google.android.datatransport.WinterFlowJSON] */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v36, types: [com.google.android.datatransport.WinterFlowUserManagerController, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r6v38, types: [com.google.android.datatransport.WinterFlowUserManagerController] */
    /* JADX WARN: Type inference failed for: r6v39, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v40 */
    /* JADX WARN: Type inference failed for: r6v41 */
    /* JADX WARN: Type inference failed for: r6v42 */
    /* JADX WARN: Type inference failed for: r6v43 */
    /* JADX WARN: Type inference failed for: r6v65 */
    /* JADX WARN: Type inference failed for: r6v66 */
    /* JADX WARN: Type inference failed for: r6v67 */
    /* JADX WARN: Type inference failed for: r6v68 */
    /* JADX WARN: Type inference failed for: r6v69 */
    /* JADX WARN: Type inference failed for: r6v70 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25, types: [com.google.android.datatransport.WinterFlowJSON] */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28, types: [com.google.android.datatransport.WinterFlowJSON] */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v37 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        Throwable th;
        int i;
        String str;
        int i2;
        WinterFlowBandwidthServer winterFlowBandwidthServer;
        String str2;
        long j;
        WinterFlowDataSourceRenderer winterFlowDataSourceRenderer;
        long j2;
        long j3;
        int i3;
        char c;
        int i4;
        long j4;
        WinterFlowUserManagerController winterFlowUserManagerController;
        WinterFlowExceptionStrategy winterFlowExceptionStrategy;
        boolean z;
        WinterFlowTestingEntity winterFlowTestingEntity;
        WinterFlowExceptionStrategy winterFlowExceptionStrategy2;
        Object WinterFlowPackageIDE;
        WinterFlowUserManagerController winterFlowUserManagerController2;
        boolean z2;
        int size;
        int size2;
        WinterFlowExceptionStrategy winterFlowExceptionStrategy3;
        boolean z3;
        WinterFlowTestingEntity winterFlowTestingEntity2;
        WinterFlowExceptionStrategy winterFlowExceptionStrategy4;
        Object WinterFlowPackageIDE2;
        boolean z4;
        WinterFlowHandlerEngine winterFlowHandlerEngine;
        int size3;
        WinterFlowExceptionStrategy winterFlowExceptionStrategy5;
        boolean z5;
        WinterFlowUserManagerController winterFlowUserManagerController3;
        WinterFlowExceptionStrategy winterFlowExceptionStrategy6;
        if (this.WinterFlowEncryptionAdapter) {
            WinterFlowWorkerDatabaseSchema winterFlowWorkerDatabaseSchema = this.WinterFlowWidgetProcess;
            removeCallbacks(winterFlowWorkerDatabaseSchema);
            if (motionEvent.getActionMasked() == 8) {
                this.WinterFlowEncryptionAdapter = false;
            } else {
                winterFlowWorkerDatabaseSchema.run();
            }
        }
        if (WinterFlowOrchestrationSubsystem(motionEvent) || !isAttachedToWindow()) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        String str3 = "visitAncestors called on an unattached node";
        int i5 = -1;
        int i6 = 1;
        if (motionEvent.getActionMasked() == 8) {
            if (!motionEvent.isFromSource(4194304)) {
                return (WinterFlowServerProtocol(motionEvent) & 4) != 0;
            }
            ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
            motionEvent.getAxisValue(26);
            getContext();
            viewConfiguration.getScaledVerticalScrollFactor();
            getContext();
            viewConfiguration.getScaledHorizontalScrollFactor();
            motionEvent.getEventTime();
            motionEvent.getDeviceId();
            WinterFlowHookMechanism winterFlowHookMechanism = (WinterFlowHookMechanism) getFocusOwner();
            if (winterFlowHookMechanism.WinterFlowArrayNetwork.WinterFlowVariableVersionControl) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching rotary event while the focus system is invalidated.");
                return false;
            }
            WinterFlowDeploymentWidget WinterFlowVariableBandwidth = WinterFlowCloudStack.WinterFlowVariableBandwidth(winterFlowHookMechanism.WinterFlowCacheManagerAgent);
            if (WinterFlowVariableBandwidth != null) {
                if (!WinterFlowVariableBandwidth.WinterFlowVariableVersionControl.WinterFlowSingletonPlatform) {
                    WinterFlowViewUtility.WinterFlowHookDataSource("visitAncestors called on an unattached node");
                }
                WinterFlowUserManagerController winterFlowUserManagerController4 = WinterFlowVariableBandwidth.WinterFlowVariableVersionControl;
                WinterFlowSchedulerStructure WinterFlowSyntaxSubsystem = WinterFlowCloudStack.WinterFlowSyntaxSubsystem(WinterFlowVariableBandwidth);
                loop0: while (true) {
                    if (WinterFlowSyntaxSubsystem == null) {
                        winterFlowUserManagerController3 = null;
                        break;
                    }
                    if ((WinterFlowSyntaxSubsystem.WinterFlowUserManagerUserManager.WinterFlowTransactionManagerStrategy.WinterFlowRouterRouter & 16384) != 0) {
                        while (winterFlowUserManagerController4 != null) {
                            if ((winterFlowUserManagerController4.WinterFlowUnitTestResponse & 16384) != 0) {
                                winterFlowUserManagerController3 = winterFlowUserManagerController4;
                                WinterFlowJSON winterFlowJSON = null;
                                while (winterFlowUserManagerController3 != null) {
                                    if (winterFlowUserManagerController3 instanceof WinterFlowHandlerEngine) {
                                        break loop0;
                                    }
                                    if ((winterFlowUserManagerController3.WinterFlowUnitTestResponse & 16384) != 0 && (winterFlowUserManagerController3 instanceof WinterFlowTestingEntity)) {
                                        int i7 = 0;
                                        for (WinterFlowUserManagerController winterFlowUserManagerController5 = ((WinterFlowTestingEntity) winterFlowUserManagerController3).WinterFlowBatchUI; winterFlowUserManagerController5 != null; winterFlowUserManagerController5 = winterFlowUserManagerController5.WinterFlowResponseEngine) {
                                            if ((winterFlowUserManagerController5.WinterFlowUnitTestResponse & 16384) != 0) {
                                                i7++;
                                                if (i7 == 1) {
                                                    winterFlowUserManagerController3 = winterFlowUserManagerController5;
                                                } else {
                                                    if (winterFlowJSON == null) {
                                                        winterFlowJSON = new WinterFlowJSON(new WinterFlowUserManagerController[16]);
                                                    }
                                                    if (winterFlowUserManagerController3 != null) {
                                                        winterFlowJSON.WinterFlowHookDataSource(winterFlowUserManagerController3);
                                                        winterFlowUserManagerController3 = null;
                                                    }
                                                    winterFlowJSON.WinterFlowHookDataSource(winterFlowUserManagerController5);
                                                }
                                            }
                                        }
                                        if (i7 == 1) {
                                        }
                                    }
                                    winterFlowUserManagerController3 = WinterFlowCloudStack.WinterFlowPackageIDE(winterFlowJSON);
                                }
                            }
                            winterFlowUserManagerController4 = winterFlowUserManagerController4.WinterFlowSyntax;
                        }
                    }
                    WinterFlowSyntaxSubsystem = WinterFlowSyntaxSubsystem.WinterFlowVariableBandwidth();
                    winterFlowUserManagerController4 = (WinterFlowSyntaxSubsystem == null || (winterFlowExceptionStrategy6 = WinterFlowSyntaxSubsystem.WinterFlowUserManagerUserManager) == null) ? null : winterFlowExceptionStrategy6.WinterFlowVariableVersionControl;
                }
                winterFlowHandlerEngine = (WinterFlowHandlerEngine) winterFlowUserManagerController3;
            } else {
                winterFlowHandlerEngine = null;
            }
            if (winterFlowHandlerEngine != null) {
                if (!winterFlowHandlerEngine.WinterFlowVariableVersionControl.WinterFlowSingletonPlatform) {
                    WinterFlowViewUtility.WinterFlowHookDataSource("visitAncestors called on an unattached node");
                }
                WinterFlowUserManagerController winterFlowUserManagerController6 = winterFlowHandlerEngine.WinterFlowVariableVersionControl.WinterFlowSyntax;
                WinterFlowSchedulerStructure WinterFlowSyntaxSubsystem2 = WinterFlowCloudStack.WinterFlowSyntaxSubsystem(winterFlowHandlerEngine);
                ArrayList arrayList = null;
                while (WinterFlowSyntaxSubsystem2 != null) {
                    if ((WinterFlowSyntaxSubsystem2.WinterFlowUserManagerUserManager.WinterFlowTransactionManagerStrategy.WinterFlowRouterRouter & 16384) != 0) {
                        while (winterFlowUserManagerController6 != null) {
                            if ((winterFlowUserManagerController6.WinterFlowUnitTestResponse & 16384) != 0) {
                                WinterFlowUserManagerController winterFlowUserManagerController7 = winterFlowUserManagerController6;
                                WinterFlowJSON winterFlowJSON2 = null;
                                while (winterFlowUserManagerController7 != null) {
                                    if (winterFlowUserManagerController7 instanceof WinterFlowHandlerEngine) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(winterFlowUserManagerController7);
                                        z5 = false;
                                    } else {
                                        z5 = true;
                                    }
                                    if (z5 && (winterFlowUserManagerController7.WinterFlowUnitTestResponse & 16384) != 0 && (winterFlowUserManagerController7 instanceof WinterFlowTestingEntity)) {
                                        int i8 = 0;
                                        for (WinterFlowUserManagerController winterFlowUserManagerController8 = ((WinterFlowTestingEntity) winterFlowUserManagerController7).WinterFlowBatchUI; winterFlowUserManagerController8 != null; winterFlowUserManagerController8 = winterFlowUserManagerController8.WinterFlowResponseEngine) {
                                            if ((winterFlowUserManagerController8.WinterFlowUnitTestResponse & 16384) != 0) {
                                                i8++;
                                                if (i8 == 1) {
                                                    winterFlowUserManagerController7 = winterFlowUserManagerController8;
                                                } else {
                                                    if (winterFlowJSON2 == null) {
                                                        winterFlowJSON2 = new WinterFlowJSON(new WinterFlowUserManagerController[16]);
                                                    }
                                                    if (winterFlowUserManagerController7 != null) {
                                                        winterFlowJSON2.WinterFlowHookDataSource(winterFlowUserManagerController7);
                                                        winterFlowUserManagerController7 = null;
                                                    }
                                                    winterFlowJSON2.WinterFlowHookDataSource(winterFlowUserManagerController8);
                                                }
                                            }
                                        }
                                        if (i8 == 1) {
                                        }
                                    }
                                    winterFlowUserManagerController7 = WinterFlowCloudStack.WinterFlowPackageIDE(winterFlowJSON2);
                                }
                            }
                            winterFlowUserManagerController6 = winterFlowUserManagerController6.WinterFlowSyntax;
                        }
                    }
                    WinterFlowSyntaxSubsystem2 = WinterFlowSyntaxSubsystem2.WinterFlowVariableBandwidth();
                    winterFlowUserManagerController6 = (WinterFlowSyntaxSubsystem2 == null || (winterFlowExceptionStrategy5 = WinterFlowSyntaxSubsystem2.WinterFlowUserManagerUserManager) == null) ? null : winterFlowExceptionStrategy5.WinterFlowVariableVersionControl;
                }
                if (arrayList != null && arrayList.size() - 1 >= 0) {
                    while (true) {
                        int i9 = size3 - 1;
                        ((WinterFlowHandlerEngine) arrayList.get(size3)).getClass();
                        if (i9 < 0) {
                            break;
                        }
                        size3 = i9;
                    }
                }
                WinterFlowUserManagerController winterFlowUserManagerController9 = winterFlowHandlerEngine.WinterFlowVariableVersionControl;
                WinterFlowJSON winterFlowJSON3 = null;
                while (winterFlowUserManagerController9 != null) {
                    if (!(winterFlowUserManagerController9 instanceof WinterFlowHandlerEngine) && (winterFlowUserManagerController9.WinterFlowUnitTestResponse & 16384) != 0 && (winterFlowUserManagerController9 instanceof WinterFlowTestingEntity)) {
                        int i10 = 0;
                        for (WinterFlowUserManagerController winterFlowUserManagerController10 = ((WinterFlowTestingEntity) winterFlowUserManagerController9).WinterFlowBatchUI; winterFlowUserManagerController10 != null; winterFlowUserManagerController10 = winterFlowUserManagerController10.WinterFlowResponseEngine) {
                            if ((winterFlowUserManagerController10.WinterFlowUnitTestResponse & 16384) != 0) {
                                i10++;
                                if (i10 == 1) {
                                    winterFlowUserManagerController9 = winterFlowUserManagerController10;
                                } else {
                                    if (winterFlowJSON3 == null) {
                                        winterFlowJSON3 = new WinterFlowJSON(new WinterFlowUserManagerController[16]);
                                    }
                                    if (winterFlowUserManagerController9 != null) {
                                        winterFlowJSON3.WinterFlowHookDataSource(winterFlowUserManagerController9);
                                        winterFlowUserManagerController9 = null;
                                    }
                                    winterFlowJSON3.WinterFlowHookDataSource(winterFlowUserManagerController10);
                                }
                            }
                        }
                        if (i10 == 1) {
                        }
                    }
                    winterFlowUserManagerController9 = WinterFlowCloudStack.WinterFlowPackageIDE(winterFlowJSON3);
                }
                if (!super.dispatchGenericMotionEvent(motionEvent)) {
                    WinterFlowUserManagerController winterFlowUserManagerController11 = winterFlowHandlerEngine.WinterFlowVariableVersionControl;
                    WinterFlowJSON winterFlowJSON4 = null;
                    while (winterFlowUserManagerController11 != null) {
                        if (!(winterFlowUserManagerController11 instanceof WinterFlowHandlerEngine) && (winterFlowUserManagerController11.WinterFlowUnitTestResponse & 16384) != 0 && (winterFlowUserManagerController11 instanceof WinterFlowTestingEntity)) {
                            int i11 = 0;
                            for (WinterFlowUserManagerController winterFlowUserManagerController12 = ((WinterFlowTestingEntity) winterFlowUserManagerController11).WinterFlowBatchUI; winterFlowUserManagerController12 != null; winterFlowUserManagerController12 = winterFlowUserManagerController12.WinterFlowResponseEngine) {
                                if ((winterFlowUserManagerController12.WinterFlowUnitTestResponse & 16384) != 0) {
                                    i11++;
                                    if (i11 == 1) {
                                        winterFlowUserManagerController11 = winterFlowUserManagerController12;
                                    } else {
                                        if (winterFlowJSON4 == null) {
                                            winterFlowJSON4 = new WinterFlowJSON(new WinterFlowUserManagerController[16]);
                                        }
                                        if (winterFlowUserManagerController11 != null) {
                                            winterFlowJSON4.WinterFlowHookDataSource(winterFlowUserManagerController11);
                                            winterFlowUserManagerController11 = null;
                                        }
                                        winterFlowJSON4.WinterFlowHookDataSource(winterFlowUserManagerController12);
                                    }
                                }
                            }
                            if (i11 == 1) {
                            }
                        }
                        winterFlowUserManagerController11 = WinterFlowCloudStack.WinterFlowPackageIDE(winterFlowJSON4);
                    }
                    if (arrayList != null) {
                        int size4 = arrayList.size();
                        for (int i12 = 0; i12 < size4; i12++) {
                            ((WinterFlowHandlerEngine) arrayList.get(i12)).getClass();
                        }
                    }
                }
            }
        }
        if (!motionEvent.isFromSource(2097152)) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        WinterFlowDataSourceRenderer winterFlowDataSourceRenderer2 = this.WinterFlowRouterRouter;
        WinterFlowGatewaySyntax winterFlowGatewaySyntax = this.WinterFlowCompilerHandler;
        WinterFlowDatabaseRenderer winterFlowDatabaseRenderer = winterFlowGatewaySyntax.WinterFlowVariableVersionControl;
        SparseLongArray sparseLongArray = winterFlowGatewaySyntax.WinterFlowHookDataSource;
        int actionMasked = motionEvent.getActionMasked();
        winterFlowGatewaySyntax.WinterFlowHookDataSource(motionEvent);
        if (actionMasked == 3) {
            sparseLongArray.clear();
            winterFlowGatewaySyntax.WinterFlowCacheManagerAgent.clear();
            str = "visitAncestors called on an unattached node";
            i = 16;
            winterFlowBandwidthServer = null;
            th = null;
        } else {
            winterFlowGatewaySyntax.WinterFlowRouterStructure(motionEvent);
            if (actionMasked != 1) {
                if (actionMasked == 6) {
                    i5 = motionEvent.getActionIndex();
                }
                th = null;
            } else {
                th = null;
                i5 = 0;
            }
            boolean z6 = actionMasked == 0 || actionMasked == 2 || actionMasked == 5;
            i = 16;
            int pointerCount = motionEvent.getPointerCount();
            ArrayList arrayList2 = new ArrayList(pointerCount);
            int i13 = 0;
            while (i13 < pointerCount) {
                int pointerId = motionEvent.getPointerId(i13);
                int i14 = i6;
                int indexOfKey = sparseLongArray.indexOfKey(pointerId);
                if (indexOfKey >= 0) {
                    str2 = str3;
                    j = sparseLongArray.valueAt(indexOfKey);
                    winterFlowDataSourceRenderer = winterFlowDataSourceRenderer2;
                } else {
                    str2 = str3;
                    j = winterFlowGatewaySyntax.WinterFlowRouterStructure;
                    winterFlowDataSourceRenderer = winterFlowDataSourceRenderer2;
                    winterFlowGatewaySyntax.WinterFlowRouterStructure = j + 1;
                    sparseLongArray.put(pointerId, j);
                }
                WinterFlowGatewaySyntax winterFlowGatewaySyntax2 = winterFlowGatewaySyntax;
                long floatToRawIntBits = (Float.floatToRawIntBits(motionEvent.getX(i13)) << 32) | (Float.floatToRawIntBits(motionEvent.getY(i13)) & 4294967295L);
                ?? r33 = i13 != i5 ? i14 : 0;
                WinterFlowClassProtocol winterFlowClassProtocol = (WinterFlowClassProtocol) winterFlowDatabaseRenderer.WinterFlowHookDataSource(j);
                if (i13 == i5) {
                    winterFlowDatabaseRenderer.WinterFlowVariableVersionControl(j);
                    j2 = j;
                    j3 = 2147483647L;
                    c = ' ';
                    i3 = 65535;
                } else {
                    if (z6) {
                        j3 = 2147483647L;
                        i3 = 65535;
                        j2 = j;
                        winterFlowDatabaseRenderer.WinterFlowArrayNetwork(j2, new WinterFlowClassProtocol(1 | ((motionEvent.getEventTime() & 2147483647L) << i14) | (((((short) Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L))) & 65535) | (((short) Float.intBitsToFloat((int) (floatToRawIntBits >> 32))) << 16)) << 32)));
                    } else {
                        j2 = j;
                        j3 = 2147483647L;
                        i3 = 65535;
                    }
                    c = ' ';
                }
                long eventTime = motionEvent.getEventTime();
                long j5 = j3;
                float pressure = motionEvent.getPressure(i13);
                int i15 = i3;
                int i16 = i5;
                long eventTime2 = winterFlowClassProtocol != null ? (winterFlowClassProtocol.WinterFlowRouterStructure >> i14) & j5 : motionEvent.getEventTime();
                if (winterFlowClassProtocol != null) {
                    float f = (short) (((int) (winterFlowClassProtocol.WinterFlowRouterStructure >>> c)) >>> 16);
                    i4 = i16;
                    j4 = (Float.floatToRawIntBits((short) (r5 & i15)) & 4294967295L) | (Float.floatToRawIntBits(f) << c);
                } else {
                    i4 = i16;
                    j4 = floatToRawIntBits;
                }
                arrayList2.add(new WinterFlowServiceProviderAgent(j2, eventTime, floatToRawIntBits, r33, pressure, eventTime2, j4, winterFlowClassProtocol != null ? (winterFlowClassProtocol.WinterFlowRouterStructure & 1) != 0 ? i14 : 0 : 0));
                i13++;
                winterFlowGatewaySyntax = winterFlowGatewaySyntax2;
                i6 = i14;
                str3 = str2;
                winterFlowDataSourceRenderer2 = winterFlowDataSourceRenderer;
                i5 = i4;
            }
            WinterFlowDataSourceRenderer winterFlowDataSourceRenderer3 = winterFlowDataSourceRenderer2;
            str = str3;
            int i17 = i6;
            winterFlowGatewaySyntax.WinterFlowVariableVersionControl(motionEvent);
            if (winterFlowDataSourceRenderer3 != null) {
                i2 = winterFlowDataSourceRenderer3.WinterFlowRouterStructure;
            } else {
                if (!motionEvent.isFromSource(2097152)) {
                    WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("MotionEvent must be a touch navigation source");
                    return false;
                }
                InputDevice device = motionEvent.getDevice();
                if (device != null) {
                    InputDevice.MotionRange motionRange = device.getMotionRange(0);
                    InputDevice.MotionRange motionRange2 = device.getMotionRange(i17);
                    if (motionRange == null || motionRange2 != null) {
                        if (motionRange2 == null || motionRange != null) {
                            if (motionRange != null && motionRange2 != null) {
                                float range = motionRange.getRange();
                                float range2 = motionRange2.getRange();
                                if (range <= range2 || (range2 != 0.0f && range / range2 < 5.0f)) {
                                    if (range2 > range) {
                                        if (range != 0.0f) {
                                        }
                                    }
                                }
                            }
                        }
                        i2 = 2;
                    }
                    i2 = 1;
                }
                i2 = 0;
            }
            if (actionMasked == 0 || actionMasked == 1 || actionMasked == 2 || actionMasked != 5) {
            }
            winterFlowBandwidthServer = new WinterFlowBandwidthServer();
            winterFlowBandwidthServer.WinterFlowHookDataSource = arrayList2;
            winterFlowBandwidthServer.WinterFlowRouterStructure = i2;
            winterFlowBandwidthServer.WinterFlowCacheManagerAgent = motionEvent;
            if (arrayList2.isEmpty()) {
                WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("changes cannot be empty");
                throw th;
            }
        }
        WinterFlowStrategyVersionControl winterFlowStrategyVersionControl = this.WinterFlowRepositoryAlgorithm;
        if (winterFlowBandwidthServer == null) {
            WinterFlowDeploymentWidget WinterFlowTransactionManagerStrategy = ((WinterFlowHookMechanism) getFocusOwner()).WinterFlowTransactionManagerStrategy();
            if (WinterFlowTransactionManagerStrategy != null) {
                if (!WinterFlowTransactionManagerStrategy.WinterFlowVariableVersionControl.WinterFlowSingletonPlatform) {
                    WinterFlowViewUtility.WinterFlowHookDataSource(str);
                }
                ?? r2 = WinterFlowTransactionManagerStrategy.WinterFlowVariableVersionControl;
                WinterFlowSchedulerStructure WinterFlowSyntaxSubsystem3 = WinterFlowCloudStack.WinterFlowSyntaxSubsystem(WinterFlowTransactionManagerStrategy);
                loop26: while (true) {
                    if (WinterFlowSyntaxSubsystem3 == null) {
                        winterFlowTestingEntity = th;
                        break;
                    }
                    int i18 = 2097152;
                    if ((WinterFlowSyntaxSubsystem3.WinterFlowUserManagerUserManager.WinterFlowTransactionManagerStrategy.WinterFlowRouterRouter & 2097152) != 0) {
                        for (WinterFlowUserManagerController winterFlowUserManagerController13 = r2; winterFlowUserManagerController13 != null; winterFlowUserManagerController13 = winterFlowUserManagerController13.WinterFlowSyntax) {
                            if ((winterFlowUserManagerController13.WinterFlowUnitTestResponse & i18) != 0) {
                                winterFlowTestingEntity = winterFlowUserManagerController13;
                                Throwable th2 = th;
                                while (winterFlowTestingEntity != 0) {
                                    if (winterFlowTestingEntity instanceof WinterFlowUserManagerBackend) {
                                        break loop26;
                                    }
                                    ?? r4 = th2;
                                    if ((winterFlowTestingEntity.WinterFlowUnitTestResponse & i18) != 0) {
                                        r4 = th2;
                                        if (winterFlowTestingEntity instanceof WinterFlowTestingEntity) {
                                            WinterFlowUserManagerController winterFlowUserManagerController14 = winterFlowTestingEntity.WinterFlowBatchUI;
                                            int i19 = 0;
                                            WinterFlowPackageIDE = winterFlowTestingEntity;
                                            r4 = th2;
                                            while (winterFlowUserManagerController14 != null) {
                                                if ((winterFlowUserManagerController14.WinterFlowUnitTestResponse & i18) != 0) {
                                                    i19++;
                                                    r4 = r4;
                                                    if (i19 == 1) {
                                                        WinterFlowPackageIDE = winterFlowUserManagerController14;
                                                    } else {
                                                        if (r4 == 0) {
                                                            r4 = new WinterFlowJSON(new WinterFlowUserManagerController[16]);
                                                        }
                                                        if (WinterFlowPackageIDE != null) {
                                                            r4.WinterFlowHookDataSource(WinterFlowPackageIDE);
                                                            WinterFlowPackageIDE = th;
                                                        }
                                                        r4.WinterFlowHookDataSource(winterFlowUserManagerController14);
                                                    }
                                                }
                                                winterFlowUserManagerController14 = winterFlowUserManagerController14.WinterFlowResponseEngine;
                                                i18 = 2097152;
                                                WinterFlowPackageIDE = WinterFlowPackageIDE;
                                                r4 = r4;
                                            }
                                            r4 = r4;
                                            if (i19 == 1) {
                                                i18 = 2097152;
                                                winterFlowTestingEntity = WinterFlowPackageIDE;
                                                th2 = r4;
                                            }
                                        }
                                    }
                                    WinterFlowPackageIDE = WinterFlowCloudStack.WinterFlowPackageIDE(r4);
                                    i18 = 2097152;
                                    winterFlowTestingEntity = WinterFlowPackageIDE;
                                    th2 = r4;
                                }
                            }
                            i18 = 2097152;
                        }
                    }
                    WinterFlowSyntaxSubsystem3 = WinterFlowSyntaxSubsystem3.WinterFlowVariableBandwidth();
                    r2 = (WinterFlowSyntaxSubsystem3 == null || (winterFlowExceptionStrategy2 = WinterFlowSyntaxSubsystem3.WinterFlowUserManagerUserManager) == null) ? th : winterFlowExceptionStrategy2.WinterFlowVariableVersionControl;
                }
                winterFlowUserManagerController = (WinterFlowUserManagerBackend) winterFlowTestingEntity;
            } else {
                winterFlowUserManagerController = th;
            }
            if (winterFlowUserManagerController != 0) {
                WinterFlowUserManagerController winterFlowUserManagerController15 = winterFlowUserManagerController;
                if (!winterFlowUserManagerController15.WinterFlowVariableVersionControl.WinterFlowSingletonPlatform) {
                    WinterFlowViewUtility.WinterFlowHookDataSource(str);
                }
                ?? r0 = winterFlowUserManagerController15.WinterFlowVariableVersionControl.WinterFlowSyntax;
                WinterFlowSchedulerStructure WinterFlowSyntaxSubsystem4 = WinterFlowCloudStack.WinterFlowSyntaxSubsystem(winterFlowUserManagerController);
                ?? r42 = th;
                while (WinterFlowSyntaxSubsystem4 != null) {
                    int i20 = 2097152;
                    WinterFlowUserManagerController winterFlowUserManagerController16 = r0;
                    r42 = r42;
                    if ((WinterFlowSyntaxSubsystem4.WinterFlowUserManagerUserManager.WinterFlowTransactionManagerStrategy.WinterFlowRouterRouter & 2097152) != 0) {
                        while (winterFlowUserManagerController16 != null) {
                            if ((winterFlowUserManagerController16.WinterFlowUnitTestResponse & i20) != 0) {
                                WinterFlowTestingEntity winterFlowTestingEntity3 = winterFlowUserManagerController16;
                                ?? r6 = th;
                                while (winterFlowTestingEntity3 != 0) {
                                    ArrayList arrayList3 = r42;
                                    if (winterFlowTestingEntity3 instanceof WinterFlowUserManagerBackend) {
                                        if (r42 == 0) {
                                            arrayList3 = new ArrayList();
                                        }
                                        arrayList3.add(winterFlowTestingEntity3);
                                        z = false;
                                        r42 = arrayList3;
                                    } else {
                                        z = true;
                                        r42 = r42;
                                    }
                                    if (z) {
                                        if ((winterFlowTestingEntity3.WinterFlowUnitTestResponse & 2097152) != 0 && (winterFlowTestingEntity3 instanceof WinterFlowTestingEntity)) {
                                            WinterFlowUserManagerController winterFlowUserManagerController17 = winterFlowTestingEntity3.WinterFlowBatchUI;
                                            int i21 = 0;
                                            winterFlowTestingEntity3 = winterFlowTestingEntity3;
                                            r6 = r6;
                                            while (winterFlowUserManagerController17 != null) {
                                                winterFlowTestingEntity3 = winterFlowTestingEntity3;
                                                if ((winterFlowUserManagerController17.WinterFlowUnitTestResponse & 2097152) != 0) {
                                                    i21++;
                                                    if (i21 == 1) {
                                                        winterFlowTestingEntity3 = winterFlowUserManagerController17;
                                                    } else {
                                                        r6 = r6 == 0 ? new WinterFlowJSON(new WinterFlowUserManagerController[16]) : r6;
                                                        if (winterFlowTestingEntity3 != 0) {
                                                            r6.WinterFlowHookDataSource(winterFlowTestingEntity3);
                                                            winterFlowTestingEntity3 = th;
                                                        }
                                                        r6.WinterFlowHookDataSource(winterFlowUserManagerController17);
                                                        winterFlowUserManagerController17 = winterFlowUserManagerController17.WinterFlowResponseEngine;
                                                        winterFlowTestingEntity3 = winterFlowTestingEntity3;
                                                        r6 = r6;
                                                    }
                                                }
                                                winterFlowUserManagerController17 = winterFlowUserManagerController17.WinterFlowResponseEngine;
                                                winterFlowTestingEntity3 = winterFlowTestingEntity3;
                                                r6 = r6;
                                            }
                                            if (i21 == 1) {
                                            }
                                        }
                                    }
                                    winterFlowTestingEntity3 = WinterFlowCloudStack.WinterFlowPackageIDE(r6);
                                }
                            }
                            i20 = 2097152;
                            winterFlowUserManagerController16 = winterFlowUserManagerController16.WinterFlowSyntax;
                            r42 = r42;
                        }
                    }
                    WinterFlowSyntaxSubsystem4 = WinterFlowSyntaxSubsystem4.WinterFlowVariableBandwidth();
                    r0 = (WinterFlowSyntaxSubsystem4 == null || (winterFlowExceptionStrategy = WinterFlowSyntaxSubsystem4.WinterFlowUserManagerUserManager) == null) ? th : winterFlowExceptionStrategy.WinterFlowVariableVersionControl;
                }
                winterFlowUserManagerController.WinterFlowVariableBandwidth();
                if (r42 != 0) {
                    int size5 = r42.size();
                    for (int i22 = 0; i22 < size5; i22++) {
                        ((WinterFlowUserManagerBackend) r42.get(i22)).WinterFlowVariableBandwidth();
                    }
                }
            }
            winterFlowStrategyVersionControl.WinterFlowHookDataSource = 0;
            winterFlowStrategyVersionControl.WinterFlowRouterStructure = true;
            return true;
        }
        WinterFlowHookMechanism winterFlowHookMechanism2 = (WinterFlowHookMechanism) getFocusOwner();
        if (winterFlowHookMechanism2.WinterFlowArrayNetwork.WinterFlowVariableVersionControl) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching indirect pointer event while the focus system is invalidated.");
        } else {
            WinterFlowDeploymentWidget WinterFlowTransactionManagerStrategy2 = winterFlowHookMechanism2.WinterFlowTransactionManagerStrategy();
            if (WinterFlowTransactionManagerStrategy2 != null) {
                if (!WinterFlowTransactionManagerStrategy2.WinterFlowVariableVersionControl.WinterFlowSingletonPlatform) {
                    WinterFlowViewUtility.WinterFlowHookDataSource(str);
                }
                WinterFlowUserManagerController winterFlowUserManagerController18 = WinterFlowTransactionManagerStrategy2.WinterFlowVariableVersionControl;
                WinterFlowSchedulerStructure WinterFlowSyntaxSubsystem5 = WinterFlowCloudStack.WinterFlowSyntaxSubsystem(WinterFlowTransactionManagerStrategy2);
                WinterFlowUserManagerController winterFlowUserManagerController19 = winterFlowUserManagerController18;
                loop14: while (true) {
                    if (WinterFlowSyntaxSubsystem5 == null) {
                        winterFlowTestingEntity2 = th;
                        break;
                    }
                    int i23 = 2097152;
                    if ((WinterFlowSyntaxSubsystem5.WinterFlowUserManagerUserManager.WinterFlowTransactionManagerStrategy.WinterFlowRouterRouter & 2097152) != 0) {
                        for (WinterFlowUserManagerController winterFlowUserManagerController20 = winterFlowUserManagerController19; winterFlowUserManagerController20 != null; winterFlowUserManagerController20 = winterFlowUserManagerController20.WinterFlowSyntax) {
                            if ((winterFlowUserManagerController20.WinterFlowUnitTestResponse & i23) != 0) {
                                winterFlowTestingEntity2 = winterFlowUserManagerController20;
                                Throwable th3 = th;
                                while (winterFlowTestingEntity2 != 0) {
                                    if (winterFlowTestingEntity2 instanceof WinterFlowUserManagerBackend) {
                                        break loop14;
                                    }
                                    ?? r5 = th3;
                                    if ((winterFlowTestingEntity2.WinterFlowUnitTestResponse & i23) != 0) {
                                        r5 = th3;
                                        if (winterFlowTestingEntity2 instanceof WinterFlowTestingEntity) {
                                            WinterFlowUserManagerController winterFlowUserManagerController21 = winterFlowTestingEntity2.WinterFlowBatchUI;
                                            int i24 = 0;
                                            WinterFlowPackageIDE2 = winterFlowTestingEntity2;
                                            r5 = th3;
                                            while (winterFlowUserManagerController21 != null) {
                                                if ((winterFlowUserManagerController21.WinterFlowUnitTestResponse & i23) != 0) {
                                                    i24++;
                                                    r5 = r5;
                                                    if (i24 == 1) {
                                                        WinterFlowPackageIDE2 = winterFlowUserManagerController21;
                                                    } else {
                                                        if (r5 == 0) {
                                                            r5 = new WinterFlowJSON(new WinterFlowUserManagerController[i]);
                                                        }
                                                        if (WinterFlowPackageIDE2 != null) {
                                                            r5.WinterFlowHookDataSource(WinterFlowPackageIDE2);
                                                            WinterFlowPackageIDE2 = th;
                                                        }
                                                        r5.WinterFlowHookDataSource(winterFlowUserManagerController21);
                                                    }
                                                }
                                                winterFlowUserManagerController21 = winterFlowUserManagerController21.WinterFlowResponseEngine;
                                                i = 16;
                                                i23 = 2097152;
                                                WinterFlowPackageIDE2 = WinterFlowPackageIDE2;
                                                r5 = r5;
                                            }
                                            r5 = r5;
                                            if (i24 == 1) {
                                                i = 16;
                                                i23 = 2097152;
                                                winterFlowTestingEntity2 = WinterFlowPackageIDE2;
                                                th3 = r5;
                                            }
                                        }
                                    }
                                    WinterFlowPackageIDE2 = WinterFlowCloudStack.WinterFlowPackageIDE(r5);
                                    i = 16;
                                    i23 = 2097152;
                                    winterFlowTestingEntity2 = WinterFlowPackageIDE2;
                                    th3 = r5;
                                }
                            }
                            i = 16;
                            i23 = 2097152;
                        }
                    }
                    WinterFlowSyntaxSubsystem5 = WinterFlowSyntaxSubsystem5.WinterFlowVariableBandwidth();
                    i = 16;
                    winterFlowUserManagerController19 = (WinterFlowSyntaxSubsystem5 == null || (winterFlowExceptionStrategy4 = WinterFlowSyntaxSubsystem5.WinterFlowUserManagerUserManager) == null) ? th : winterFlowExceptionStrategy4.WinterFlowVariableVersionControl;
                }
                winterFlowUserManagerController2 = (WinterFlowUserManagerBackend) winterFlowTestingEntity2;
            } else {
                winterFlowUserManagerController2 = th;
            }
            if (winterFlowUserManagerController2 != 0) {
                WinterFlowUserManagerController winterFlowUserManagerController22 = winterFlowUserManagerController2;
                if (!winterFlowUserManagerController22.WinterFlowVariableVersionControl.WinterFlowSingletonPlatform) {
                    WinterFlowViewUtility.WinterFlowHookDataSource(str);
                }
                ?? r02 = winterFlowUserManagerController22.WinterFlowVariableVersionControl.WinterFlowSyntax;
                WinterFlowSchedulerStructure WinterFlowSyntaxSubsystem6 = WinterFlowCloudStack.WinterFlowSyntaxSubsystem(winterFlowUserManagerController2);
                ?? r52 = th;
                while (WinterFlowSyntaxSubsystem6 != null) {
                    int i25 = 2097152;
                    WinterFlowUserManagerController winterFlowUserManagerController23 = r02;
                    r52 = r52;
                    if ((WinterFlowSyntaxSubsystem6.WinterFlowUserManagerUserManager.WinterFlowTransactionManagerStrategy.WinterFlowRouterRouter & 2097152) != 0) {
                        while (winterFlowUserManagerController23 != null) {
                            if ((winterFlowUserManagerController23.WinterFlowUnitTestResponse & i25) != 0) {
                                WinterFlowTestingEntity winterFlowTestingEntity4 = winterFlowUserManagerController23;
                                ?? r7 = th;
                                while (winterFlowTestingEntity4 != 0) {
                                    ArrayList arrayList4 = r52;
                                    if (winterFlowTestingEntity4 instanceof WinterFlowUserManagerBackend) {
                                        if (r52 == 0) {
                                            arrayList4 = new ArrayList();
                                        }
                                        arrayList4.add(winterFlowTestingEntity4);
                                        z3 = false;
                                        r52 = arrayList4;
                                    } else {
                                        z3 = true;
                                        r52 = r52;
                                    }
                                    if (z3) {
                                        int i26 = 2097152;
                                        if ((winterFlowTestingEntity4.WinterFlowUnitTestResponse & 2097152) != 0 && (winterFlowTestingEntity4 instanceof WinterFlowTestingEntity)) {
                                            WinterFlowUserManagerController winterFlowUserManagerController24 = winterFlowTestingEntity4.WinterFlowBatchUI;
                                            int i27 = 0;
                                            winterFlowTestingEntity4 = winterFlowTestingEntity4;
                                            r7 = r7;
                                            while (winterFlowUserManagerController24 != null) {
                                                if ((winterFlowUserManagerController24.WinterFlowUnitTestResponse & i26) != 0) {
                                                    i27++;
                                                    r7 = r7;
                                                    if (i27 == 1) {
                                                        winterFlowTestingEntity4 = winterFlowUserManagerController24;
                                                    } else {
                                                        if (r7 == 0) {
                                                            r7 = new WinterFlowJSON(new WinterFlowUserManagerController[16]);
                                                        }
                                                        if (winterFlowTestingEntity4 != 0) {
                                                            r7.WinterFlowHookDataSource(winterFlowTestingEntity4);
                                                            winterFlowTestingEntity4 = th;
                                                        }
                                                        r7.WinterFlowHookDataSource(winterFlowUserManagerController24);
                                                    }
                                                }
                                                winterFlowUserManagerController24 = winterFlowUserManagerController24.WinterFlowResponseEngine;
                                                i26 = 2097152;
                                                winterFlowTestingEntity4 = winterFlowTestingEntity4;
                                                r7 = r7;
                                            }
                                            if (i27 == 1) {
                                            }
                                        }
                                    }
                                    winterFlowTestingEntity4 = WinterFlowCloudStack.WinterFlowPackageIDE(r7);
                                }
                            }
                            i25 = 2097152;
                            winterFlowUserManagerController23 = winterFlowUserManagerController23.WinterFlowSyntax;
                            r52 = r52;
                        }
                    }
                    WinterFlowSyntaxSubsystem6 = WinterFlowSyntaxSubsystem6.WinterFlowVariableBandwidth();
                    r02 = (WinterFlowSyntaxSubsystem6 == null || (winterFlowExceptionStrategy3 = WinterFlowSyntaxSubsystem6.WinterFlowUserManagerUserManager) == null) ? th : winterFlowExceptionStrategy3.WinterFlowVariableVersionControl;
                }
                WinterFlowJSONSerializer winterFlowJSONSerializer = WinterFlowJSONSerializer.WinterFlowVariableVersionControl;
                if (r52 != 0 && r52.size() - 1 >= 0) {
                    while (true) {
                        int i28 = size2 - 1;
                        ((WinterFlowUserManagerBackend) r52.get(size2)).WinterFlowHookQuery(winterFlowBandwidthServer, winterFlowJSONSerializer);
                        if (i28 < 0) {
                            break;
                        }
                        size2 = i28;
                    }
                }
                winterFlowUserManagerController2.WinterFlowHookQuery(winterFlowBandwidthServer, winterFlowJSONSerializer);
                WinterFlowJSONSerializer winterFlowJSONSerializer2 = WinterFlowJSONSerializer.WinterFlowTransactionManagerStrategy;
                winterFlowUserManagerController2.WinterFlowHookQuery(winterFlowBandwidthServer, winterFlowJSONSerializer2);
                if (r52 != 0) {
                    int size6 = r52.size();
                    for (int i29 = 0; i29 < size6; i29++) {
                        ((WinterFlowUserManagerBackend) r52.get(i29)).WinterFlowHookQuery(winterFlowBandwidthServer, winterFlowJSONSerializer2);
                    }
                }
                WinterFlowJSONSerializer winterFlowJSONSerializer3 = WinterFlowJSONSerializer.WinterFlowUnitTestResponse;
                if (r52 != 0 && r52.size() - 1 >= 0) {
                    while (true) {
                        int i30 = size - 1;
                        ((WinterFlowUserManagerBackend) r52.get(size)).WinterFlowHookQuery(winterFlowBandwidthServer, winterFlowJSONSerializer3);
                        if (i30 < 0) {
                            break;
                        }
                        size = i30;
                    }
                }
                winterFlowUserManagerController2.WinterFlowHookQuery(winterFlowBandwidthServer, winterFlowJSONSerializer3);
            }
            ArrayList arrayList5 = (ArrayList) winterFlowBandwidthServer.WinterFlowHookDataSource;
            int size7 = arrayList5.size();
            for (int i31 = 0; i31 < size7; i31++) {
                if (((WinterFlowServiceProviderAgent) arrayList5.get(i31)).WinterFlowSyntax) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        winterFlowStrategyVersionControl.getClass();
        MotionEvent motionEvent2 = (MotionEvent) winterFlowBandwidthServer.WinterFlowCacheManagerAgent;
        int action = motionEvent2.getAction();
        if (action != 0) {
            z4 = true;
            if ((action == 1 || action == 2) && z2) {
                winterFlowStrategyVersionControl.WinterFlowHookDataSource = 0;
                winterFlowStrategyVersionControl.WinterFlowRouterStructure = true;
            }
        } else {
            z4 = true;
            winterFlowStrategyVersionControl.WinterFlowHookDataSource = winterFlowBandwidthServer.WinterFlowRouterStructure;
            winterFlowStrategyVersionControl.WinterFlowRouterStructure = false;
        }
        ((GestureDetector) winterFlowStrategyVersionControl.WinterFlowArrayNetwork).onTouchEvent(motionEvent2);
        return z4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0152, code lost:
    
        if (WinterFlowSingletonPlatform(r24) == false) goto L69;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i;
        boolean z = this.WinterFlowEncryptionAdapter;
        WinterFlowWorkerDatabaseSchema winterFlowWorkerDatabaseSchema = this.WinterFlowWidgetProcess;
        if (z) {
            removeCallbacks(winterFlowWorkerDatabaseSchema);
            winterFlowWorkerDatabaseSchema.run();
        }
        if (!WinterFlowOrchestrationSubsystem(motionEvent) && isAttachedToWindow()) {
            WinterFlowBackendEventEmitter winterFlowBackendEventEmitter = this.WinterFlowConfigurationSubsystem;
            WinterFlowSyntaxTransactionManager winterFlowSyntaxTransactionManager = winterFlowBackendEventEmitter.WinterFlowRouterRouter;
            AccessibilityManager accessibilityManager = winterFlowBackendEventEmitter.WinterFlowTransactionAgent;
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action == 7 || action == 9) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    winterFlowSyntaxTransactionManager.WinterFlowBatchUI(true);
                    WinterFlowProxyService winterFlowProxyService = new WinterFlowProxyService();
                    WinterFlowExceptionStrategy winterFlowExceptionStrategy = winterFlowSyntaxTransactionManager.getRoot().WinterFlowUserManagerUserManager;
                    WinterFlowUIMicroservice winterFlowUIMicroservice = winterFlowExceptionStrategy.WinterFlowArrayNetwork;
                    WinterFlowPipelineVariable winterFlowPipelineVariable = WinterFlowUIMicroservice.WinterFlowQueueService;
                    winterFlowExceptionStrategy.WinterFlowArrayNetwork.WinterFlowControllerCache(WinterFlowUIMicroservice.WinterFlowConfiguration, winterFlowUIMicroservice.WinterFlowEncryptionAdapter((Float.floatToRawIntBits(x) << 32) | (Float.floatToRawIntBits(y) & 4294967295L)), winterFlowProxyService, 1, true);
                    WinterFlowMicroserviceFunction winterFlowMicroserviceFunction = winterFlowProxyService.WinterFlowVariableVersionControl;
                    for (int i2 = winterFlowMicroserviceFunction.WinterFlowHookDataSource - 1; -1 < i2; i2--) {
                        Object WinterFlowTransactionManagerStrategy = winterFlowMicroserviceFunction.WinterFlowTransactionManagerStrategy(i2);
                        WinterFlowTransactionManagerStrategy.getClass();
                        WinterFlowSchedulerStructure WinterFlowSyntaxSubsystem = WinterFlowCloudStack.WinterFlowSyntaxSubsystem((WinterFlowUserManagerController) WinterFlowTransactionManagerStrategy);
                        if (winterFlowSyntaxTransactionManager.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(WinterFlowSyntaxSubsystem) != null) {
                            break;
                        }
                        if (WinterFlowSyntaxSubsystem.WinterFlowUserManagerUserManager.WinterFlowCacheManagerAgent(8)) {
                            int WinterFlowBatchUI = winterFlowBackendEventEmitter.WinterFlowBatchUI(WinterFlowSyntaxSubsystem.WinterFlowTransactionManagerStrategy);
                            WinterFlowProcessorSystem WinterFlowRouterStructure = WinterFlowDecoratorUI.WinterFlowRouterStructure(WinterFlowSyntaxSubsystem, false);
                            if (WinterFlowEncryptionSubsystem.WinterFlowSoftwareProtocol(WinterFlowRouterStructure)) {
                                if (!WinterFlowRouterStructure.WinterFlowTransactionAgent().WinterFlowVariableVersionControl.WinterFlowCacheManagerAgent(WinterFlowRendererJava.WinterFlowEventEmitterController)) {
                                    i = WinterFlowBatchUI;
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    i = Integer.MIN_VALUE;
                    winterFlowSyntaxTransactionManager.getAndroidViewsHandler$ui().dispatchGenericMotionEvent(motionEvent);
                    int i3 = winterFlowBackendEventEmitter.WinterFlowSyntax;
                    if (i3 != i) {
                        winterFlowBackendEventEmitter.WinterFlowSyntax = i;
                        WinterFlowBackendEventEmitter.WinterFlowResolverController(winterFlowBackendEventEmitter, i, 128, null, 12);
                        WinterFlowBackendEventEmitter.WinterFlowResolverController(winterFlowBackendEventEmitter, i3, 256, null, 12);
                    }
                } else if (action == 10) {
                    int i4 = winterFlowBackendEventEmitter.WinterFlowSyntax;
                    if (i4 == Integer.MIN_VALUE) {
                        winterFlowSyntaxTransactionManager.getAndroidViewsHandler$ui().dispatchGenericMotionEvent(motionEvent);
                    } else if (i4 != Integer.MIN_VALUE) {
                        winterFlowBackendEventEmitter.WinterFlowSyntax = Integer.MIN_VALUE;
                        WinterFlowBackendEventEmitter.WinterFlowResolverController(winterFlowBackendEventEmitter, Integer.MIN_VALUE, 128, null, 12);
                        WinterFlowBackendEventEmitter.WinterFlowResolverController(winterFlowBackendEventEmitter, i4, 256, null, 12);
                    }
                }
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 7) {
                if (actionMasked == 10 && WinterFlowConcurrencyThread(motionEvent)) {
                    if (motionEvent.getToolType(0) != 3 || motionEvent.getButtonState() == 0) {
                        MotionEvent motionEvent2 = this.WinterFlowFrameworkCacheManager;
                        if (motionEvent2 != null) {
                            motionEvent2.recycle();
                        }
                        this.WinterFlowFrameworkCacheManager = MotionEvent.obtainNoHistory(motionEvent);
                        this.WinterFlowEncryptionAdapter = true;
                        postDelayed(winterFlowWorkerDatabaseSchema, 8L);
                        return false;
                    }
                }
                if ((WinterFlowServerProtocol(motionEvent) & 1) != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i = 0;
        if (!isFocused()) {
            return ((WinterFlowHookMechanism) getFocusOwner()).WinterFlowArrayNetwork(keyEvent, new WinterFlowJavaSession(i, this, keyEvent));
        }
        WinterFlowVersionControlDeployment winterFlowVersionControlDeployment = getComposeViewContext().WinterFlowVariableBandwidth;
        WinterFlowOrchestrationDecorator.WinterFlowVariableVersionControl.setValue(new WinterFlowDataSourceAgent(keyEvent.getMetaState()));
        return ((WinterFlowHookMechanism) getFocusOwner()).WinterFlowArrayNetwork(keyEvent, WinterFlowConfigurationRequest.WinterFlowServiceUtility) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        WinterFlowExceptionStrategy winterFlowExceptionStrategy;
        if (isFocused()) {
            WinterFlowHookMechanism winterFlowHookMechanism = (WinterFlowHookMechanism) getFocusOwner();
            if (winterFlowHookMechanism.WinterFlowArrayNetwork.WinterFlowVariableVersionControl) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            } else {
                WinterFlowDeploymentWidget WinterFlowVariableBandwidth = WinterFlowCloudStack.WinterFlowVariableBandwidth(winterFlowHookMechanism.WinterFlowCacheManagerAgent);
                if (WinterFlowVariableBandwidth != null) {
                    if (!WinterFlowVariableBandwidth.WinterFlowVariableVersionControl.WinterFlowSingletonPlatform) {
                        WinterFlowViewUtility.WinterFlowHookDataSource("visitAncestors called on an unattached node");
                    }
                    WinterFlowUserManagerController winterFlowUserManagerController = WinterFlowVariableBandwidth.WinterFlowVariableVersionControl;
                    WinterFlowSchedulerStructure WinterFlowSyntaxSubsystem = WinterFlowCloudStack.WinterFlowSyntaxSubsystem(WinterFlowVariableBandwidth);
                    while (WinterFlowSyntaxSubsystem != null) {
                        if ((WinterFlowSyntaxSubsystem.WinterFlowUserManagerUserManager.WinterFlowTransactionManagerStrategy.WinterFlowRouterRouter & 131072) != 0) {
                            while (winterFlowUserManagerController != null) {
                                if ((winterFlowUserManagerController.WinterFlowUnitTestResponse & 131072) != 0) {
                                    WinterFlowUserManagerController winterFlowUserManagerController2 = winterFlowUserManagerController;
                                    WinterFlowJSON winterFlowJSON = null;
                                    while (winterFlowUserManagerController2 != null) {
                                        if ((winterFlowUserManagerController2.WinterFlowUnitTestResponse & 131072) != 0 && (winterFlowUserManagerController2 instanceof WinterFlowTestingEntity)) {
                                            int i = 0;
                                            for (WinterFlowUserManagerController winterFlowUserManagerController3 = ((WinterFlowTestingEntity) winterFlowUserManagerController2).WinterFlowBatchUI; winterFlowUserManagerController3 != null; winterFlowUserManagerController3 = winterFlowUserManagerController3.WinterFlowResponseEngine) {
                                                if ((winterFlowUserManagerController3.WinterFlowUnitTestResponse & 131072) != 0) {
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
                }
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT < 28) {
            WinterFlowSessionManagerNetwork.WinterFlowRouterStructure.WinterFlowRouterStructure(viewStructure, getView());
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object winterFlowUITesting;
        WinterFlowDeploymentWidget WinterFlowTransactionManagerStrategy;
        if (this.WinterFlowEncryptionAdapter) {
            WinterFlowWorkerDatabaseSchema winterFlowWorkerDatabaseSchema = this.WinterFlowWidgetProcess;
            removeCallbacks(winterFlowWorkerDatabaseSchema);
            MotionEvent motionEvent2 = this.WinterFlowFrameworkCacheManager;
            motionEvent2.getClass();
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.WinterFlowEncryptionAdapter = false;
            } else {
                winterFlowWorkerDatabaseSchema.run();
            }
        }
        if (!WinterFlowOrchestrationSubsystem(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || WinterFlowSingletonPlatform(motionEvent))) {
            int WinterFlowServerProtocol = WinterFlowServerProtocol(motionEvent);
            if ((WinterFlowServerProtocol & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            boolean z = motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5;
            boolean z2 = motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584);
            if (z && z2) {
                Object parent = getParent();
                View view = parent instanceof View ? (View) parent : null;
                if (view == null || (winterFlowUITesting = view.getTag(R.id.auto_clear_focus_behavior_tag)) == null) {
                    winterFlowUITesting = new WinterFlowUITesting(1);
                }
                if (winterFlowUITesting.equals(new WinterFlowUITesting(1)) && (WinterFlowTransactionManagerStrategy = ((WinterFlowHookMechanism) getFocusOwner()).WinterFlowTransactionManagerStrategy()) != null) {
                    WinterFlowUIMicroservice WinterFlowSoftwareEngine = WinterFlowCloudStack.WinterFlowSoftwareEngine(WinterFlowTransactionManagerStrategy);
                    WinterFlowVersionParser WinterFlowVariableBandwidth = WinterFlowCloudStack.WinterFlowBatchUI(WinterFlowSoftwareEngine).WinterFlowVariableBandwidth(WinterFlowSoftwareEngine, true);
                    long floatToRawIntBits = (Float.floatToRawIntBits(motionEvent.getX()) << 32) | (Float.floatToRawIntBits(motionEvent.getY()) & 4294967295L);
                    float intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
                    float intBitsToFloat2 = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
                    if (!((intBitsToFloat < WinterFlowVariableBandwidth.WinterFlowCacheManagerAgent) & (intBitsToFloat >= WinterFlowVariableBandwidth.WinterFlowRouterStructure) & (intBitsToFloat2 >= WinterFlowVariableBandwidth.WinterFlowHookDataSource) & (intBitsToFloat2 < WinterFlowVariableBandwidth.WinterFlowArrayNetwork))) {
                        ((WinterFlowHookMechanism) getFocusOwner()).WinterFlowHookDataSource(8, false, true);
                    }
                }
            }
            if ((WinterFlowServerProtocol & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    public final View findViewByAccessibilityIdTraversal(int i) {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return WinterFlowResponseEngine(this, i);
            }
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(this, Integer.valueOf(i));
            if (invoke instanceof View) {
                return (View) invoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i) {
        WinterFlowVersionParser WinterFlowRouterStructure;
        if (view == null || this.WinterFlowVariableInterface.WinterFlowRouterStructure) {
            return super.focusSearch(view, i);
        }
        View rootView = getRootView();
        rootView.getClass();
        View findNextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup) rootView, view, i);
        if (findNextFocus == null || !WinterFlowEncryptionSubsystem.WinterFlowBandwidthObject(this, findNextFocus)) {
            findNextFocus = null;
        }
        if (view == this) {
            WinterFlowDeploymentWidget WinterFlowVariableBandwidth = WinterFlowCloudStack.WinterFlowVariableBandwidth(((WinterFlowHookMechanism) getFocusOwner()).WinterFlowCacheManagerAgent);
            WinterFlowRouterStructure = WinterFlowVariableBandwidth != null ? WinterFlowCloudStack.WinterFlowRouterAdapter(WinterFlowVariableBandwidth) : null;
            if (WinterFlowRouterStructure == null) {
                WinterFlowRouterStructure = WinterFlowRouterDeserialization.WinterFlowRouterStructure(view, this);
            }
        } else {
            WinterFlowRouterStructure = WinterFlowRouterDeserialization.WinterFlowRouterStructure(view, this);
        }
        WinterFlowDeserializationEventEmitter WinterFlowArrayNetwork = WinterFlowRouterDeserialization.WinterFlowArrayNetwork(i);
        int i2 = WinterFlowArrayNetwork != null ? WinterFlowArrayNetwork.WinterFlowRouterStructure : 6;
        WinterFlowBandwidthCache winterFlowBandwidthCache = new WinterFlowBandwidthCache();
        if (((WinterFlowHookMechanism) getFocusOwner()).WinterFlowVariableVersionControl(i2, WinterFlowRouterStructure, new WinterFlowUIInvoker(winterFlowBandwidthCache, 0)) == null) {
            return view;
        }
        Object obj = winterFlowBandwidthCache.WinterFlowVariableVersionControl;
        if (obj == null) {
            if (findNextFocus == null) {
                return super.focusSearch(view, i);
            }
        } else if (findNextFocus == null || i2 == 1 || i2 == 2 || WinterFlowProviderRouter.WinterFlowOrchestrationSubsystem(WinterFlowCloudStack.WinterFlowRouterAdapter((WinterFlowDeploymentWidget) obj), WinterFlowRouterDeserialization.WinterFlowRouterStructure(findNextFocus, this), WinterFlowRouterStructure, i2)) {
            return this;
        }
        return findNextFocus;
    }

    public final WinterFlowManagerHelper getAndroidViewsHandler$ui() {
        if (this.WinterFlowOrchestrationConfiguration == null) {
            WinterFlowManagerHelper winterFlowManagerHelper = new WinterFlowManagerHelper(getContext());
            this.WinterFlowOrchestrationConfiguration = winterFlowManagerHelper;
            addView(winterFlowManagerHelper, -1);
            requestLayout();
        }
        WinterFlowManagerHelper winterFlowManagerHelper2 = this.WinterFlowOrchestrationConfiguration;
        winterFlowManagerHelper2.getClass();
        return winterFlowManagerHelper2;
    }

    public WinterFlowParserTransaction getAutofill() {
        return this.WinterFlowQueueService;
    }

    public WinterFlowConcurrencyRefactoring getAutofillManager() {
        return this.WinterFlowCacheTool;
    }

    public WinterFlowCloudDataSource getAutofillTree() {
        return this.WinterFlowSoftwareProtocol;
    }

    public final WinterFlowTransactionManagerEncryption getComposeViewContext() {
        return get_composeViewContext();
    }

    public final boolean getComposeViewContextIncrementedDuringInit$ui() {
        return this.WinterFlowUserManagerAdapter;
    }

    public final Configuration getConfiguration() {
        return (Configuration) this.WinterFlowCloudMicroservice.getValue();
    }

    public final WinterFlowVariableAgent getContentCaptureManager$ui() {
        return this.WinterFlowStrategyTool;
    }

    public WinterFlowEncryptionMicroservice getCoroutineContext() {
        return this.WinterFlowSingletonPlatform;
    }

    public WinterFlowConcurrencyParser getDensity() {
        return (WinterFlowConcurrencyParser) this.WinterFlowBandwidthObject.getValue();
    }

    public WinterFlowVersionParser getEmbeddedViewFocusRect() {
        if (isFocused()) {
            WinterFlowDeploymentWidget WinterFlowVariableBandwidth = WinterFlowCloudStack.WinterFlowVariableBandwidth(((WinterFlowHookMechanism) getFocusOwner()).WinterFlowCacheManagerAgent);
            if (WinterFlowVariableBandwidth != null) {
                return WinterFlowCloudStack.WinterFlowRouterAdapter(WinterFlowVariableBandwidth);
            }
            return null;
        }
        View findFocus = findFocus();
        if (findFocus != null) {
            return WinterFlowRouterDeserialization.WinterFlowRouterStructure(findFocus, this);
        }
        return null;
    }

    public WinterFlowProtocolArray getFocusOwner() {
        return this.WinterFlowConcurrencyThread;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        WinterFlowVersionParser embeddedViewFocusRect = getEmbeddedViewFocusRect();
        if (embeddedViewFocusRect != null) {
            rect.left = Math.round(embeddedViewFocusRect.WinterFlowRouterStructure);
            rect.top = Math.round(embeddedViewFocusRect.WinterFlowHookDataSource);
            rect.right = Math.round(embeddedViewFocusRect.WinterFlowCacheManagerAgent);
            rect.bottom = Math.round(embeddedViewFocusRect.WinterFlowArrayNetwork);
            return;
        }
        if (WinterFlowManagerRequest.WinterFlowThreadListener(((WinterFlowHookMechanism) getFocusOwner()).WinterFlowVariableVersionControl(6, null, WinterFlowServiceProviderBatch.WinterFlowUnitTestResponse), Boolean.TRUE)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
    }

    public WinterFlowDatabaseGateway getFontFamilyResolver() {
        return (WinterFlowDatabaseGateway) this.WinterFlowResolverListener.getValue();
    }

    public WinterFlowFrontendDeserialization getFontLoader() {
        return this.WinterFlowFunctionPipeline;
    }

    public final WinterFlowCloudThread getFrameEndScheduler$ui() {
        return this.WinterFlowResponseEngine;
    }

    public WinterFlowWorkerHelper getGraphicsContext() {
        return this.WinterFlowPackageIDE;
    }

    public WinterFlowResolverConsumer getHapticFeedBack() {
        return this.WinterFlowTestingTransactionManager;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return ((WinterFlowObjectPackage) this.WinterFlowVariableInterface.WinterFlowArrayNetwork).WinterFlowOrchestrationSubsystem() || !this.WinterFlowThreadListener.isEmpty();
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    public WinterFlowRefactoringModule getInputModeManager() {
        return this.WinterFlowUIThreadPool;
    }

    public final WinterFlowServerLibrary getInsetsListener() {
        return this.WinterFlowConsumerUserManager;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui() {
        return this.WinterFlowArrayFramework;
    }

    @Override // android.view.View, android.view.ViewParent
    public WinterFlowCacheManagerConfiguration getLayoutDirection() {
        return (WinterFlowCacheManagerConfiguration) this.WinterFlowSingletonWidget.getValue();
    }

    public WinterFlowRuntimeException getLocaleList() {
        return (WinterFlowRuntimeException) this.WinterFlowUIMiddleware.getValue();
    }

    public long getMeasureIteration() {
        if (this.WinterFlowVariableInterface.WinterFlowRouterStructure) {
            return 1L;
        }
        WinterFlowViewUtility.WinterFlowRouterStructure("measureIteration should be only used during the measure/layout pass");
        return 1L;
    }

    public WinterFlowUnitTestScript getModifierLocalManager() {
        return this.WinterFlowClassConsumer;
    }

    public WinterFlowSyntaxTransactionManager getOutOfFrameExecutor() {
        if (isAttachedToWindow()) {
            return this;
        }
        return null;
    }

    public WinterFlowDecoratorSessionManager getPlacementScope() {
        int i = WinterFlowObjectComponent.WinterFlowHookDataSource;
        return new WinterFlowRequestModule(1, this);
    }

    public WinterFlowLoaderStructure getPointerIconService() {
        return this.WinterFlowControllerCache;
    }

    /* renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui, reason: not valid java name */
    public final WinterFlowDataSourceRenderer m3getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui() {
        return this.WinterFlowRouterRouter;
    }

    public WinterFlowInterfaceManager getRectManager() {
        return this.WinterFlowArrayHelper;
    }

    public WinterFlowDebugModule getRetainedValuesStore() {
        return this.WinterFlowServerProtocol;
    }

    public WinterFlowSchedulerStructure getRoot() {
        return this.WinterFlowBackendCacheManager;
    }

    public final boolean getScrollCaptureInProgress$ui() {
        WinterFlowRuntimeInvoker winterFlowRuntimeInvoker;
        if (Build.VERSION.SDK_INT < 31 || (winterFlowRuntimeInvoker = this.WinterFlowDatabase) == null) {
            return false;
        }
        return ((Boolean) winterFlowRuntimeInvoker.WinterFlowRouterStructure.getValue()).booleanValue();
    }

    public WinterFlowClassBackend getSemanticsOwner() {
        return this.WinterFlowCompilerVariable;
    }

    public WinterFlowProtocolStrategy getSharedDrawScope() {
        return this.WinterFlowSyntax;
    }

    public boolean getShowLayoutBounds() {
        return Build.VERSION.SDK_INT >= 30 ? WinterFlowLoaderBandwidth.WinterFlowRouterStructure.WinterFlowRouterStructure(this) : this.WinterFlowFrameworkTransaction;
    }

    public WinterFlowServiceProviderTransactionManager getSnapshotObserver() {
        return this.WinterFlowCompilerDataSource;
    }

    public WinterFlowUserManagerMechanism getSoftwareKeyboardController() {
        WinterFlowThreadPoolProcess winterFlowThreadPoolProcess = this.WinterFlowRefactoringThreadPool;
        if (winterFlowThreadPoolProcess != null) {
            return winterFlowThreadPoolProcess;
        }
        getTextInputService();
        WinterFlowThreadPoolProcess winterFlowThreadPoolProcess2 = new WinterFlowThreadPoolProcess(5);
        this.WinterFlowRefactoringThreadPool = winterFlowThreadPoolProcess2;
        return winterFlowThreadPoolProcess2;
    }

    public WinterFlowConsumerHandler getTextInputService() {
        WinterFlowConsumerHandler winterFlowConsumerHandler = this.WinterFlowThreadPoolEventEmitter;
        if (winterFlowConsumerHandler != null) {
            return winterFlowConsumerHandler;
        }
        getLegacyTextInputServiceAndroid();
        WinterFlowConsumerHandler winterFlowConsumerHandler2 = new WinterFlowConsumerHandler();
        new AtomicReference(null);
        this.WinterFlowThreadPoolEventEmitter = winterFlowConsumerHandler2;
        return winterFlowConsumerHandler2;
    }

    public WinterFlowCloudMechanism getTextToolbar() {
        return this.WinterFlowProtocolConsumer;
    }

    public final WinterFlowMicroserviceUnitTest getUncaughtExceptionHandler$ui() {
        return null;
    }

    public WinterFlowInheritanceVariable getViewConfiguration() {
        return this.WinterFlowResolverController;
    }

    public final WinterFlowQueryServer getViewTreeOwners() {
        WinterFlowResolverBackend.WinterFlowBatchUI(this.WinterFlowHandlerJSON.getValue());
        return null;
    }

    public WinterFlowHandlerProcessor getWindowInfo() {
        return getComposeViewContext().WinterFlowVariableBandwidth;
    }

    public final WinterFlowHookThreadPool get_autofillManager$ui() {
        return this.WinterFlowCacheTool;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        WinterFlowDebugModule winterFlowDebugModule;
        Object obj;
        super.onAttachedToWindow();
        setAttached(true);
        int i = Build.VERSION.SDK_INT;
        if (i < 30) {
            setShowLayoutBounds(WinterFlowManagerRequest.WinterFlowEventEmitterController());
        }
        this.WinterFlowConsumerUserManager.onViewAttachedToWindow(this);
        int i2 = 0;
        if (i > 28) {
            if (WinterFlowDatabaseSchemaComponent == null) {
                WinterFlowTransactionManagerConsumer winterFlowTransactionManagerConsumer = new WinterFlowTransactionManagerConsumer(r0);
                WinterFlowDatabaseSchemaComponent = winterFlowTransactionManagerConsumer;
                StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
                try {
                    if (WinterFlowHandlerConsumer == null) {
                        WinterFlowHandlerConsumer = Class.forName("android.os.SystemProperties");
                    }
                    Method method = WinterFlowSyntaxSingleton;
                    if (method == null) {
                        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                        Class cls = WinterFlowHandlerConsumer;
                        method = cls != null ? cls.getDeclaredMethod("addChangeCallback", Runnable.class) : null;
                        WinterFlowSyntaxSingleton = method;
                    }
                    if (method != null) {
                        method.invoke(null, winterFlowTransactionManagerConsumer);
                    }
                } catch (Throwable unused) {
                }
                StrictMode.setVmPolicy(vmPolicy);
            }
            WinterFlowMicroserviceFunction winterFlowMicroserviceFunction = WinterFlowQueryModule;
            synchronized (winterFlowMicroserviceFunction) {
                winterFlowMicroserviceFunction.WinterFlowRouterStructure(this);
            }
        }
        if (!this.WinterFlowUserManagerAdapter) {
            getComposeViewContext().WinterFlowCacheManagerAgent();
        }
        this.WinterFlowUserManagerAdapter = false;
        WinterFlowServiceUtility(getRoot());
        WinterFlowThreadListener(getRoot());
        getSnapshotObserver().WinterFlowRouterStructure.WinterFlowArrayNetwork();
        WinterFlowStackProvider winterFlowStackProvider = this.WinterFlowQueueService;
        if (winterFlowStackProvider != null) {
            WinterFlowClassServer winterFlowClassServer = WinterFlowClassServer.WinterFlowRouterStructure;
            winterFlowClassServer.getClass();
            ((AutofillManager) winterFlowStackProvider.WinterFlowUnitTestResponse).registerCallback(winterFlowClassServer);
        }
        WinterFlowDecoratorVersion winterFlowDecoratorVersion = getComposeViewContext().WinterFlowCacheManagerAgent;
        WinterFlowProviderCacheManager winterFlowProviderCacheManager = getComposeViewContext().WinterFlowVariableVersionControl;
        WinterFlowCloudThread winterFlowCloudThread = this.WinterFlowResponseEngine;
        if (winterFlowDecoratorVersion == null || winterFlowProviderCacheManager == null || winterFlowCloudThread == null) {
            winterFlowDebugModule = null;
        } else {
            WinterFlowScriptManager WinterFlowTransactionManagerStrategy = winterFlowProviderCacheManager.WinterFlowTransactionManagerStrategy();
            WinterFlowThreadPoolSystem winterFlowThreadPoolSystem = new WinterFlowThreadPoolSystem();
            WinterFlowCompilerEngine winterFlowCompilerEngine = WinterFlowCompilerEngine.WinterFlowHookDataSource;
            WinterFlowTransactionManagerStrategy.getClass();
            winterFlowCompilerEngine.getClass();
            WinterFlowStackProvider winterFlowStackProvider2 = new WinterFlowStackProvider(WinterFlowTransactionManagerStrategy, winterFlowThreadPoolSystem, winterFlowCompilerEngine);
            WinterFlowEventEmitterCacheManager WinterFlowRouterStructure = WinterFlowListenerProtocol.WinterFlowRouterStructure(WinterFlowHandlerJSON.class);
            String WinterFlowHookDataSource = WinterFlowRouterStructure.WinterFlowHookDataSource();
            if (WinterFlowHookDataSource == null) {
                WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("Local and anonymous classes can not be ViewModels");
                return;
            }
            WinterFlowHandlerJSON winterFlowHandlerJSON = (WinterFlowHandlerJSON) winterFlowStackProvider2.WinterFlowConcurrencyThread(WinterFlowRouterStructure, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(WinterFlowHookDataSource));
            Object parent = getParent();
            parent.getClass();
            int id = ((View) parent).getId();
            WinterFlowViewSoftware winterFlowViewSoftware = winterFlowHandlerJSON.WinterFlowHookDataSource;
            Object WinterFlowHookDataSource2 = winterFlowViewSoftware.WinterFlowHookDataSource(id);
            if (WinterFlowHookDataSource2 == null) {
                WinterFlowHookDataSource2 = new WinterFlowMicroserviceFunction(1);
                winterFlowViewSoftware.WinterFlowRouterRouter(id, WinterFlowHookDataSource2);
            }
            WinterFlowMicroserviceFunction winterFlowMicroserviceFunction2 = (WinterFlowMicroserviceFunction) WinterFlowHookDataSource2;
            Object[] objArr = winterFlowMicroserviceFunction2.WinterFlowRouterStructure;
            int i3 = winterFlowMicroserviceFunction2.WinterFlowHookDataSource;
            while (true) {
                if (i2 >= i3) {
                    obj = null;
                    break;
                }
                obj = objArr[i2];
                if (!((WinterFlowEventEmitterNetwork) obj).WinterFlowCacheManagerAgent) {
                    break;
                } else {
                    i2++;
                }
            }
            WinterFlowEventEmitterNetwork winterFlowEventEmitterNetwork = (WinterFlowEventEmitterNetwork) obj;
            if (winterFlowEventEmitterNetwork == null) {
                winterFlowEventEmitterNetwork = new WinterFlowEventEmitterNetwork();
                winterFlowMicroserviceFunction2.WinterFlowRouterStructure(winterFlowEventEmitterNetwork);
            }
            winterFlowEventEmitterNetwork.WinterFlowCacheManagerAgent = true;
            this.WinterFlowTransactionAgent = winterFlowEventEmitterNetwork;
            winterFlowDebugModule = winterFlowEventEmitterNetwork.WinterFlowHookDataSource;
        }
        if (winterFlowDebugModule == null) {
            winterFlowDebugModule = WinterFlowCacheUtility.WinterFlowCacheManagerListener;
        }
        this.WinterFlowServerProtocol = winterFlowDebugModule;
        WinterFlowObjectSession winterFlowObjectSession = this.WinterFlowRepositoryBackend;
        if (winterFlowObjectSession != null) {
            winterFlowObjectSession.WinterFlowUnitTestResponse(getComposeViewContext());
            this.WinterFlowRepositoryBackend = null;
        }
        WinterFlowDatabaseUtility WinterFlowUnitTestResponse = getComposeViewContext().WinterFlowCacheManagerAgent.WinterFlowUnitTestResponse();
        WinterFlowUnitTestResponse.WinterFlowRouterStructure(this);
        WinterFlowUnitTestResponse.WinterFlowRouterStructure(this.WinterFlowStrategyTool);
        this.WinterFlowUIThreadPool.WinterFlowRouterStructure.setValue(new WinterFlowIDEClass(isInTouchMode() ? 1 : 2));
        getViewTreeObserver().addOnGlobalLayoutListener(this);
        getViewTreeObserver().addOnScrollChangedListener(this);
        getViewTreeObserver().addOnTouchModeChangeListener(this);
        if (Build.VERSION.SDK_INT >= 31) {
            WinterFlowCacheFramework.WinterFlowRouterStructure.WinterFlowHookDataSource(this);
        }
        WinterFlowHookThreadPool winterFlowHookThreadPool = this.WinterFlowCacheTool;
        if (winterFlowHookThreadPool != null) {
            ((WinterFlowHookMechanism) getFocusOwner()).WinterFlowUnitTestResponse.WinterFlowRouterStructure(winterFlowHookThreadPool);
            getSemanticsOwner().WinterFlowArrayNetwork.WinterFlowRouterStructure(winterFlowHookThreadPool);
        }
        ((WinterFlowHookMechanism) getFocusOwner()).WinterFlowUnitTestResponse.WinterFlowRouterStructure(this);
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        if (this.WinterFlowModuleService.get() == null) {
            getLegacyTextInputServiceAndroid().getClass();
            return false;
        }
        WinterFlowEventEmitterOrchestration.WinterFlowVariableBandwidth();
        return false;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        WinterFlowUserManagerUserManager(configuration);
    }

    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        if (this.WinterFlowModuleService.get() == null) {
            getLegacyTextInputServiceAndroid().getClass();
            return null;
        }
        WinterFlowEventEmitterOrchestration.WinterFlowVariableBandwidth();
        return null;
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        WinterFlowVariableAgent winterFlowVariableAgent = this.WinterFlowStrategyTool;
        winterFlowVariableAgent.getClass();
        WinterFlowProtocolDecorator.WinterFlowVariableVersionControl(winterFlowVariableAgent, jArr, consumer);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setAttached(false);
        this.WinterFlowConsumerUserManager.onViewDetachedFromWindow(this);
        View view = this.WinterFlowOrchestrationSubsystem;
        if (WinterFlowBandwidthObject() && view != null) {
            removeView(view);
        }
        if (Build.VERSION.SDK_INT > 28) {
            WinterFlowMicroserviceFunction winterFlowMicroserviceFunction = WinterFlowQueryModule;
            synchronized (winterFlowMicroserviceFunction) {
                winterFlowMicroserviceFunction.WinterFlowResponseEngine(this);
            }
        }
        getComposeViewContext().WinterFlowHookDataSource();
        WinterFlowServiceProviderTransactionManager snapshotObserver = getSnapshotObserver();
        WinterFlowExceptionBandwidth winterFlowExceptionBandwidth = snapshotObserver.WinterFlowRouterStructure.WinterFlowRouterRouter;
        if (winterFlowExceptionBandwidth != null) {
            winterFlowExceptionBandwidth.WinterFlowVariableVersionControl();
        }
        WinterFlowClassStrategy winterFlowClassStrategy = snapshotObserver.WinterFlowRouterStructure;
        synchronized (winterFlowClassStrategy.WinterFlowUnitTestResponse) {
            WinterFlowJSON winterFlowJSON = winterFlowClassStrategy.WinterFlowTransactionManagerStrategy;
            Object[] objArr = winterFlowJSON.WinterFlowVariableVersionControl;
            int i = winterFlowJSON.WinterFlowUnitTestResponse;
            for (int i2 = 0; i2 < i; i2++) {
                WinterFlowServiceInvoker winterFlowServiceInvoker = (WinterFlowServiceInvoker) objArr[i2];
                winterFlowServiceInvoker.WinterFlowVariableVersionControl.WinterFlowRouterStructure();
                winterFlowServiceInvoker.WinterFlowTransactionManagerStrategy.WinterFlowRouterStructure();
                winterFlowServiceInvoker.WinterFlowServerProtocol.WinterFlowRouterStructure();
                winterFlowServiceInvoker.WinterFlowThreadListener.clear();
            }
        }
        WinterFlowDatabaseUtility WinterFlowUnitTestResponse = getComposeViewContext().WinterFlowCacheManagerAgent.WinterFlowUnitTestResponse();
        WinterFlowUnitTestResponse.WinterFlowTransactionManagerStrategy(this.WinterFlowStrategyTool);
        WinterFlowUnitTestResponse.WinterFlowTransactionManagerStrategy(this);
        WinterFlowStackProvider winterFlowStackProvider = this.WinterFlowQueueService;
        if (winterFlowStackProvider != null) {
            WinterFlowClassServer winterFlowClassServer = WinterFlowClassServer.WinterFlowRouterStructure;
            winterFlowClassServer.getClass();
            ((AutofillManager) winterFlowStackProvider.WinterFlowUnitTestResponse).unregisterCallback(winterFlowClassServer);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
        getViewTreeObserver().removeOnScrollChangedListener(this);
        getViewTreeObserver().removeOnTouchModeChangeListener(this);
        WinterFlowEventEmitterNetwork winterFlowEventEmitterNetwork = this.WinterFlowTransactionAgent;
        if (winterFlowEventEmitterNetwork != null) {
            winterFlowEventEmitterNetwork.WinterFlowCacheManagerAgent = false;
        }
        this.WinterFlowTransactionAgent = null;
        if (Build.VERSION.SDK_INT >= 31) {
            WinterFlowCacheFramework.WinterFlowRouterStructure.WinterFlowRouterStructure(this);
        }
        WinterFlowHookThreadPool winterFlowHookThreadPool = this.WinterFlowCacheTool;
        if (winterFlowHookThreadPool != null) {
            getSemanticsOwner().WinterFlowArrayNetwork.WinterFlowResponseEngine(winterFlowHookThreadPool);
            ((WinterFlowHookMechanism) getFocusOwner()).WinterFlowUnitTestResponse.WinterFlowResponseEngine(winterFlowHookThreadPool);
        }
        WinterFlowInterfaceManager rectManager = getRectManager();
        rectManager.WinterFlowTransactionManagerStrategy = rectManager.WinterFlowCacheManagerAgent.WinterFlowHookDataSource(0L, 0L, null, 0, 0);
        getRectManager().WinterFlowRouterStructure();
        WinterFlowInterfaceManager rectManager2 = getRectManager();
        WinterFlowUserManagerFramework winterFlowUserManagerFramework = rectManager2.WinterFlowRouterRouter;
        if (winterFlowUserManagerFramework != null) {
            rectManager2.WinterFlowRouterStructure.removeCallbacks(winterFlowUserManagerFramework);
            rectManager2.WinterFlowRouterRouter = null;
        }
        ((WinterFlowHookMechanism) getFocusOwner()).WinterFlowUnitTestResponse.WinterFlowResponseEngine(this);
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z || hasFocus()) {
            return;
        }
        WinterFlowHookMechanism winterFlowHookMechanism = (WinterFlowHookMechanism) getFocusOwner();
        WinterFlowManagerRequest.WinterFlowConcurrencyThread(winterFlowHookMechanism.WinterFlowCacheManagerAgent, true);
        if (winterFlowHookMechanism.WinterFlowTransactionManagerStrategy() != null) {
            WinterFlowDeploymentWidget WinterFlowTransactionManagerStrategy = winterFlowHookMechanism.WinterFlowTransactionManagerStrategy();
            winterFlowHookMechanism.WinterFlowRouterRouter(null);
            if (WinterFlowTransactionManagerStrategy != null) {
                WinterFlowTransactionManagerStrategy.WinterFlowUIPlatform(WinterFlowProtocolCache.WinterFlowVariableVersionControl, WinterFlowProtocolCache.WinterFlowUnitTestResponse);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.WinterFlowArrayFramework = 0L;
        WinterFlowSoftwareEngine();
        int i = Build.VERSION.SDK_INT;
        if (32 > i || i >= 34) {
            return;
        }
        WinterFlowUserManagerUserManager(getResources().getConfiguration());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection("AndroidOwner:onLayout");
        try {
            this.WinterFlowArrayFramework = 0L;
            this.WinterFlowVariableInterface.WinterFlowThreadListener(this.WinterFlowSoftwareServiceProvider);
            this.WinterFlowModuleAgent = null;
            WinterFlowSoftwareEngine();
            if (this.WinterFlowOrchestrationConfiguration != null) {
                Trace.beginSection("AndroidOwner:viewLayout");
                getAndroidViewsHandler$ui().layout(0, 0, i3 - i, i4 - i2);
                Trace.endSection();
            }
        } catch (Throwable th) {
            throw th;
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        WinterFlowConsumerServiceProvider winterFlowConsumerServiceProvider = this.WinterFlowVariableInterface;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                WinterFlowServiceUtility(getRoot());
            }
            long WinterFlowSyntax = WinterFlowSyntax(i);
            long WinterFlowSyntax2 = WinterFlowSyntax(i2);
            long WinterFlowBatchUI = WinterFlowCacheRuntime.WinterFlowBatchUI((int) (WinterFlowSyntax >>> 32), (int) (WinterFlowSyntax & 4294967295L), (int) (WinterFlowSyntax2 >>> 32), (int) (4294967295L & WinterFlowSyntax2));
            WinterFlowHandlerConsumer winterFlowHandlerConsumer = this.WinterFlowModuleAgent;
            if (winterFlowHandlerConsumer == null) {
                this.WinterFlowModuleAgent = new WinterFlowHandlerConsumer(WinterFlowBatchUI);
                this.WinterFlowSessionManagerInterface = false;
            } else if (!WinterFlowHandlerConsumer.WinterFlowHookDataSource(winterFlowHandlerConsumer.WinterFlowRouterStructure, WinterFlowBatchUI)) {
                this.WinterFlowSessionManagerInterface = true;
            }
            winterFlowConsumerServiceProvider.WinterFlowConsumerUserManager(WinterFlowBatchUI);
            winterFlowConsumerServiceProvider.WinterFlowBandwidthObject();
            setMeasuredDimension(getRoot().WinterFlowSoftwareEngine.WinterFlowOrchestrationSubsystem.WinterFlowVariableVersionControl, getRoot().WinterFlowSoftwareEngine.WinterFlowOrchestrationSubsystem.WinterFlowTransactionManagerStrategy);
            if (this.WinterFlowOrchestrationConfiguration != null) {
                Trace.beginSection("AndroidOwner:androidViewMeasure");
                getAndroidViewsHandler$ui().measure(View.MeasureSpec.makeMeasureSpec(getRoot().WinterFlowSoftwareEngine.WinterFlowOrchestrationSubsystem.WinterFlowVariableVersionControl, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().WinterFlowSoftwareEngine.WinterFlowOrchestrationSubsystem.WinterFlowTransactionManagerStrategy, 1073741824));
                Trace.endSection();
            }
        } catch (Throwable th) {
            throw th;
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        if (viewStructure != null) {
            WinterFlowHookThreadPool winterFlowHookThreadPool = this.WinterFlowCacheTool;
            if (winterFlowHookThreadPool != null) {
                WinterFlowSchedulerStructure winterFlowSchedulerStructure = winterFlowHookThreadPool.WinterFlowTransactionManagerStrategy.WinterFlowRouterStructure;
                AutofillId autofillId = winterFlowHookThreadPool.WinterFlowResponseEngine;
                String str = winterFlowHookThreadPool.WinterFlowSyntax;
                WinterFlowInterfaceManager winterFlowInterfaceManager = winterFlowHookThreadPool.WinterFlowRouterRouter;
                WinterFlowTestingCloud.WinterFlowCompilerVariable(viewStructure, winterFlowSchedulerStructure, autofillId, str, winterFlowInterfaceManager);
                Object[] objArr = WinterFlowEventMicroservice.WinterFlowRouterStructure;
                WinterFlowMicroserviceFunction winterFlowMicroserviceFunction = new WinterFlowMicroserviceFunction(2);
                winterFlowMicroserviceFunction.WinterFlowRouterStructure(winterFlowSchedulerStructure);
                winterFlowMicroserviceFunction.WinterFlowRouterStructure(viewStructure);
                while (winterFlowMicroserviceFunction.WinterFlowSyntax()) {
                    Object WinterFlowTransactionAgent = winterFlowMicroserviceFunction.WinterFlowTransactionAgent(winterFlowMicroserviceFunction.WinterFlowHookDataSource - 1);
                    WinterFlowTransactionAgent.getClass();
                    ViewStructure viewStructure2 = (ViewStructure) WinterFlowTransactionAgent;
                    Object WinterFlowTransactionAgent2 = winterFlowMicroserviceFunction.WinterFlowTransactionAgent(winterFlowMicroserviceFunction.WinterFlowHookDataSource - 1);
                    WinterFlowTransactionAgent2.getClass();
                    WinterFlowDecoratorLayer winterFlowDecoratorLayer = (WinterFlowDecoratorLayer) ((WinterFlowSchedulerStructure) WinterFlowTransactionAgent2).WinterFlowThreadListener();
                    int i2 = winterFlowDecoratorLayer.WinterFlowVariableVersionControl.WinterFlowUnitTestResponse;
                    for (int i3 = 0; i3 < i2; i3++) {
                        WinterFlowSchedulerStructure winterFlowSchedulerStructure2 = (WinterFlowSchedulerStructure) winterFlowDecoratorLayer.get(i3);
                        if (!winterFlowSchedulerStructure2.WinterFlowConfiguration && winterFlowSchedulerStructure2.WinterFlowCacheManagerListener() && winterFlowSchedulerStructure2.WinterFlowPackageIDE()) {
                            WinterFlowDecoratorBackend WinterFlowSerializerStructure = winterFlowSchedulerStructure2.WinterFlowSerializerStructure();
                            if (WinterFlowSerializerStructure != null) {
                                WinterFlowDatabaseSchemaStructure winterFlowDatabaseSchemaStructure = WinterFlowSerializerStructure.WinterFlowVariableVersionControl;
                                if (winterFlowDatabaseSchemaStructure.WinterFlowHookDataSource(WinterFlowCacheWorker.WinterFlowUnitTestResponse) || winterFlowDatabaseSchemaStructure.WinterFlowHookDataSource(WinterFlowCacheWorker.WinterFlowRouterRouter) || winterFlowDatabaseSchemaStructure.WinterFlowHookDataSource(WinterFlowRendererJava.WinterFlowSingletonPlatform) || winterFlowDatabaseSchemaStructure.WinterFlowHookDataSource(WinterFlowRendererJava.WinterFlowVariableBandwidth)) {
                                    ViewStructure newChild = viewStructure2.newChild(viewStructure2.addChildCount(1));
                                    WinterFlowTestingCloud.WinterFlowCompilerVariable(newChild, winterFlowSchedulerStructure2, autofillId, str, winterFlowInterfaceManager);
                                    winterFlowMicroserviceFunction.WinterFlowRouterStructure(winterFlowSchedulerStructure2);
                                    winterFlowMicroserviceFunction.WinterFlowRouterStructure(newChild);
                                }
                            }
                            winterFlowMicroserviceFunction.WinterFlowRouterStructure(winterFlowSchedulerStructure2);
                            winterFlowMicroserviceFunction.WinterFlowRouterStructure(viewStructure2);
                        }
                    }
                }
            }
            WinterFlowStackProvider winterFlowStackProvider = this.WinterFlowQueueService;
            if (winterFlowStackProvider != null) {
                WinterFlowCloudDataSource winterFlowCloudDataSource = (WinterFlowCloudDataSource) winterFlowStackProvider.WinterFlowTransactionManagerStrategy;
                LinkedHashMap linkedHashMap = winterFlowCloudDataSource.WinterFlowRouterStructure;
                LinkedHashMap linkedHashMap2 = winterFlowCloudDataSource.WinterFlowRouterStructure;
                if (linkedHashMap.isEmpty()) {
                    return;
                }
                int addChildCount = viewStructure.addChildCount(linkedHashMap2.size());
                Iterator it = linkedHashMap2.entrySet().iterator();
                if (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    int intValue = ((Number) entry.getKey()).intValue();
                    if (entry.getValue() != null) {
                        WinterFlowEventEmitterOrchestration.WinterFlowVariableBandwidth();
                        return;
                    }
                    ViewStructure newChild2 = viewStructure.newChild(addChildCount);
                    newChild2.setAutofillId((AutofillId) winterFlowStackProvider.WinterFlowRouterRouter, intValue);
                    newChild2.setId(intValue, ((WinterFlowSyntaxTransactionManager) winterFlowStackProvider.WinterFlowVariableVersionControl).getContext().getPackageName(), null, null);
                    newChild2.setAutofillType(1);
                    throw null;
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        int toolType = motionEvent.getToolType(i);
        if (!motionEvent.isFromSource(8194) && motionEvent.isFromSource(16386) && (toolType == 2 || toolType == 4)) {
            getPointerIconService().getClass();
        }
        return super.onResolvePointerIcon(motionEvent, i);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        if (this.WinterFlowUnitTestResponse) {
            int[] iArr = WinterFlowRouterDeserialization.WinterFlowRouterStructure;
            WinterFlowCacheManagerConfiguration winterFlowCacheManagerConfiguration = WinterFlowCacheManagerConfiguration.WinterFlowVariableVersionControl;
            WinterFlowCacheManagerConfiguration winterFlowCacheManagerConfiguration2 = i != 0 ? i != 1 ? null : WinterFlowCacheManagerConfiguration.WinterFlowTransactionManagerStrategy : winterFlowCacheManagerConfiguration;
            if (winterFlowCacheManagerConfiguration2 != null) {
                winterFlowCacheManagerConfiguration = winterFlowCacheManagerConfiguration2;
            }
            setLayoutDirection(winterFlowCacheManagerConfiguration);
        }
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        WinterFlowRuntimeInvoker winterFlowRuntimeInvoker;
        if (Build.VERSION.SDK_INT < 31 || (winterFlowRuntimeInvoker = this.WinterFlowDatabase) == null) {
            return;
        }
        winterFlowRuntimeInvoker.WinterFlowRouterStructure(this, getSemanticsOwner(), getCoroutineContext(), consumer);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        WinterFlowSoftwareEngine();
    }

    @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
    public final void onTouchModeChanged(boolean z) {
        this.WinterFlowUIThreadPool.WinterFlowRouterStructure.setValue(new WinterFlowIDEClass(z ? 1 : 2));
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        WinterFlowVariableAgent winterFlowVariableAgent = this.WinterFlowStrategyTool;
        winterFlowVariableAgent.getClass();
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (WinterFlowManagerRequest.WinterFlowThreadListener(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            WinterFlowProtocolDecorator.WinterFlowHookDataSource(winterFlowVariableAgent, longSparseArray);
        } else {
            winterFlowVariableAgent.WinterFlowVariableVersionControl.post(new WinterFlowControllerManager(2, winterFlowVariableAgent, longSparseArray));
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        boolean WinterFlowEventEmitterController;
        this.WinterFlowQueryDeserialization = true;
        super.onWindowFocusChanged(z);
        if (!z || Build.VERSION.SDK_INT >= 30 || getShowLayoutBounds() == (WinterFlowEventEmitterController = WinterFlowManagerRequest.WinterFlowEventEmitterController())) {
            return;
        }
        setShowLayoutBounds(WinterFlowEventEmitterController);
        WinterFlowThreadListener(getRoot());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        int i2 = 1;
        if (!isFocused()) {
            WinterFlowDeserializationEventEmitter WinterFlowArrayNetwork = WinterFlowRouterDeserialization.WinterFlowArrayNetwork(i);
            int i3 = WinterFlowArrayNetwork != null ? WinterFlowArrayNetwork.WinterFlowRouterStructure : 7;
            Boolean WinterFlowVariableVersionControl = ((WinterFlowHookMechanism) getFocusOwner()).WinterFlowVariableVersionControl(i3, rect != null ? new WinterFlowVersionParser(rect.left, rect.top, rect.right, rect.bottom) : null, new WinterFlowConsumerHelper(i3, 0));
            Boolean bool = Boolean.TRUE;
            if (!WinterFlowManagerRequest.WinterFlowThreadListener(WinterFlowVariableVersionControl, bool)) {
                if (!WinterFlowManagerRequest.WinterFlowThreadListener(((WinterFlowHookMechanism) getFocusOwner()).WinterFlowVariableVersionControl(i3, null, new WinterFlowConsumerHelper(i3, i2)), bool)) {
                    if (hasFocus() && (i3 == 1 || i3 == 2)) {
                        return ((WinterFlowHookMechanism) getFocusOwner()).WinterFlowUnitTestResponse(i3);
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public void setAccessibilityEventBatchIntervalMillis(long j) {
        this.WinterFlowConfigurationSubsystem.WinterFlowServerProtocol = j;
    }

    public final void setComposeViewContext(WinterFlowTransactionManagerEncryption winterFlowTransactionManagerEncryption) {
        if (getCoroutineContext() != winterFlowTransactionManagerEncryption.WinterFlowHookDataSource.WinterFlowResponseEngine() && !((WinterFlowDecoratorLayer) getRoot().WinterFlowThreadListener()).isEmpty()) {
            WinterFlowViewUtility.WinterFlowRouterStructure("Changing ComposeViewContext cannot change the coroutine context without disposing of the composition first.");
        }
        WinterFlowJSONModule WinterFlowVariableVersionControl = WinterFlowWorkerVersionControl.WinterFlowVariableVersionControl();
        WinterFlowObjectSession WinterFlowVariableVersionControl2 = WinterFlowVariableVersionControl != null ? WinterFlowVariableVersionControl.WinterFlowVariableVersionControl() : null;
        WinterFlowJSONModule WinterFlowResponseEngine = WinterFlowWorkerVersionControl.WinterFlowResponseEngine(WinterFlowVariableVersionControl);
        try {
            WinterFlowTransactionManagerEncryption winterFlowTransactionManagerEncryption2 = get_composeViewContext();
            if (winterFlowTransactionManagerEncryption != winterFlowTransactionManagerEncryption2) {
                if (isAttachedToWindow()) {
                    winterFlowTransactionManagerEncryption2.WinterFlowHookDataSource();
                    winterFlowTransactionManagerEncryption.WinterFlowCacheManagerAgent();
                }
                set_composeViewContext(winterFlowTransactionManagerEncryption);
                setCoroutineContext(winterFlowTransactionManagerEncryption.WinterFlowHookDataSource.WinterFlowResponseEngine());
            }
        } finally {
            WinterFlowWorkerVersionControl.WinterFlowBandwidthObject(WinterFlowVariableVersionControl, WinterFlowResponseEngine, WinterFlowVariableVersionControl2);
        }
    }

    public final void setComposeViewContextIncrementedDuringInit$ui(boolean z) {
        this.WinterFlowUserManagerAdapter = z;
    }

    public final void setConfiguration(Configuration configuration) {
        this.WinterFlowCloudMicroservice.setValue(configuration);
    }

    public final void setContentCaptureManager$ui(WinterFlowVariableAgent winterFlowVariableAgent) {
        this.WinterFlowStrategyTool = winterFlowVariableAgent;
    }

    public void setCoroutineContext(WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice) {
        this.WinterFlowSingletonPlatform = winterFlowEncryptionMicroservice;
    }

    public final void setFrameEndScheduler$ui(WinterFlowCloudThread winterFlowCloudThread) {
        this.WinterFlowResponseEngine = winterFlowCloudThread;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui(long j) {
        this.WinterFlowArrayFramework = j;
    }

    public final void setOnReadyForComposition(WinterFlowObjectSession winterFlowObjectSession) {
        getDerivedIsAttached();
        if (isAttachedToWindow() || this.WinterFlowUserManagerAdapter) {
            winterFlowObjectSession.WinterFlowUnitTestResponse(getComposeViewContext());
        } else {
            this.WinterFlowRepositoryBackend = winterFlowObjectSession;
        }
    }

    /* renamed from: setPrimaryDirectionalMotionAxisOverride-r2epLt8$ui, reason: not valid java name */
    public final void m4setPrimaryDirectionalMotionAxisOverrider2epLt8$ui(WinterFlowDataSourceRenderer winterFlowDataSourceRenderer) {
        this.WinterFlowRouterRouter = winterFlowDataSourceRenderer;
    }

    public void setShowLayoutBounds(boolean z) {
        this.WinterFlowFrameworkTransaction = z;
    }

    public void setUncaughtExceptionHandler(WinterFlowMicroserviceUnitTest winterFlowMicroserviceUnitTest) {
        this.WinterFlowVariableInterface.getClass();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    /* renamed from: getAccessibilityManager, reason: merged with bridge method [inline-methods] */
    public WinterFlowClassPlatform m5getAccessibilityManager() {
        return this.WinterFlowCacheManagerListener;
    }

    public WinterFlowScriptWebsocket getClipboard() {
        return this.WinterFlowValidatorHandler;
    }

    public WinterFlowViewProvider getClipboardManager() {
        return this.WinterFlowConfiguration;
    }

    public WinterFlowMiddlewareStack getDragAndDropManager() {
        return this.WinterFlowVariableBandwidth;
    }

    public WinterFlowViewSoftware getLayoutNodes() {
        return this.WinterFlowEventEmitterController;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        ViewGroup.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.width = i;
        generateDefaultLayoutParams.height = i2;
        addViewInLayout(view, -1, generateDefaultLayoutParams, true);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, -1, layoutParams, true);
    }

    @WinterFlowVariableStructure
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui$annotations() {
    }

    /* renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui$annotations, reason: not valid java name */
    public static /* synthetic */ void m2getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui$annotations() {
    }

    public static /* synthetic */ void getRoot$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    @WinterFlowVariableStructure
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    public static /* synthetic */ void getWindowInfo$annotations() {
    }

    public WinterFlowWorkerWebsocket getRootForTest() {
        return this;
    }

    public View getView() {
        return this;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    public final void setUncaughtExceptionHandler$ui(WinterFlowMicroserviceUnitTest winterFlowMicroserviceUnitTest) {
    }
}
