package com.google.android.datatransport;

import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.window.OnBackInvokedDispatcher;
import com.android.installreferrer.api.InstallReferrerClient;
import com.icewinter.flow.winter.icecatch.R;
import java.util.UUID;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowCompilerOrchestration extends Dialog implements WinterFlowDecoratorVersion, WinterFlowArrayDeserialization, WinterFlowSingletonPlatform, WinterFlowExceptionProxy {
    public WinterFlowSchedulerEngine WinterFlowResponseEngine;
    public final WinterFlowRendererNode WinterFlowRouterRouter;
    public final WinterFlowSessionManagerModule WinterFlowServerProtocol;
    public WinterFlowObjectUI WinterFlowSyntax;
    public boolean WinterFlowThreadListener;
    public final View WinterFlowTransactionAgent;
    public final WinterFlowCacheManagerVersionControl WinterFlowTransactionManagerStrategy;
    public final WinterFlowRendererNode WinterFlowUnitTestResponse;
    public WinterFlowDatabaseUtility WinterFlowVariableVersionControl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowCompilerOrchestration(WinterFlowObjectUI winterFlowObjectUI, WinterFlowSchedulerEngine winterFlowSchedulerEngine, View view, WinterFlowCacheManagerConfiguration winterFlowCacheManagerConfiguration, WinterFlowConcurrencyParser winterFlowConcurrencyParser, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), R.style.DialogWindowTheme), 0);
        final int i = 0;
        this.WinterFlowTransactionManagerStrategy = new WinterFlowCacheManagerVersionControl(new WinterFlowNodeGateway(this, new WinterFlowAPISystem(18, this)));
        this.WinterFlowUnitTestResponse = new WinterFlowRendererNode(new WinterFlowObjectUI(this) { // from class: com.google.android.datatransport.WinterFlowLoaderEventEmitter
            public final /* synthetic */ WinterFlowCompilerOrchestration WinterFlowTransactionManagerStrategy;

            {
                this.WinterFlowTransactionManagerStrategy = this;
            }

            @Override // com.google.android.datatransport.WinterFlowObjectUI
            public final Object WinterFlowRouterStructure() {
                int i2 = i;
                WinterFlowCompilerOrchestration winterFlowCompilerOrchestration = this.WinterFlowTransactionManagerStrategy;
                switch (i2) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        WinterFlowFrontendManager winterFlowFrontendManager = new WinterFlowFrontendManager();
                        winterFlowCompilerOrchestration.WinterFlowCacheManagerAgent().WinterFlowTransactionManagerStrategy(winterFlowFrontendManager);
                        return winterFlowFrontendManager;
                    default:
                        return new WinterFlowViewRenderer(new WinterFlowServerConcurrency(4, winterFlowCompilerOrchestration));
                }
            }
        });
        final int i2 = 1;
        this.WinterFlowRouterRouter = new WinterFlowRendererNode(new WinterFlowObjectUI(this) { // from class: com.google.android.datatransport.WinterFlowLoaderEventEmitter
            public final /* synthetic */ WinterFlowCompilerOrchestration WinterFlowTransactionManagerStrategy;

            {
                this.WinterFlowTransactionManagerStrategy = this;
            }

            @Override // com.google.android.datatransport.WinterFlowObjectUI
            public final Object WinterFlowRouterStructure() {
                int i22 = i2;
                WinterFlowCompilerOrchestration winterFlowCompilerOrchestration = this.WinterFlowTransactionManagerStrategy;
                switch (i22) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        WinterFlowFrontendManager winterFlowFrontendManager = new WinterFlowFrontendManager();
                        winterFlowCompilerOrchestration.WinterFlowCacheManagerAgent().WinterFlowTransactionManagerStrategy(winterFlowFrontendManager);
                        return winterFlowFrontendManager;
                    default:
                        return new WinterFlowViewRenderer(new WinterFlowServerConcurrency(4, winterFlowCompilerOrchestration));
                }
            }
        });
        this.WinterFlowSyntax = winterFlowObjectUI;
        this.WinterFlowResponseEngine = winterFlowSchedulerEngine;
        this.WinterFlowTransactionAgent = view;
        Window window = getWindow();
        if (window == null) {
            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Dialog has no window");
            throw null;
        }
        WinterFlowSchedulerEngine winterFlowSchedulerEngine2 = this.WinterFlowResponseEngine;
        Window window2 = getWindow();
        if (window2 != null) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            winterFlowSchedulerEngine2.getClass();
            attributes.type = 2;
            window2.setAttributes(attributes);
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        this.WinterFlowResponseEngine.getClass();
        WinterFlowPackageProcess.WinterFlowServerProtocol(window, true);
        window.setGravity(17);
        this.WinterFlowResponseEngine.getClass();
        WinterFlowSessionManagerModule winterFlowSessionManagerModule = new WinterFlowSessionManagerModule(getContext(), window);
        this.WinterFlowResponseEngine.getClass();
        setTitle("");
        winterFlowSessionManagerModule.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        winterFlowSessionManagerModule.setClipChildren(false);
        winterFlowSessionManagerModule.setElevation(winterFlowConcurrencyParser.WinterFlowSingletonPlatform(8.0f));
        winterFlowSessionManagerModule.setOutlineProvider(new WinterFlowAlgorithmDeserialization(0));
        this.WinterFlowServerProtocol = winterFlowSessionManagerModule;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            WinterFlowArrayNetwork(viewGroup);
        }
        setContentView(winterFlowSessionManagerModule);
        winterFlowSessionManagerModule.setTag(R.id.view_tree_lifecycle_owner, WinterFlowHookProcessor.WinterFlowTransactionAgent(view));
        winterFlowSessionManagerModule.setTag(R.id.view_tree_view_model_store_owner, WinterFlowWorkerVersionControl.WinterFlowArrayNetwork(view));
        winterFlowSessionManagerModule.setTag(R.id.view_tree_saved_state_registry_owner, WinterFlowNodeVersion.WinterFlowServerProtocol(view));
        WinterFlowSyntax(this.WinterFlowSyntax, this.WinterFlowResponseEngine, winterFlowCacheManagerConfiguration);
        WinterFlowViewRenderer WinterFlowRouterStructure = WinterFlowRouterStructure();
        WinterFlowSoftwareClass winterFlowSoftwareClass = new WinterFlowSoftwareClass(this, i2);
        WinterFlowRouterStructure.getClass();
        WinterFlowQueueComponent winterFlowQueueComponent = new WinterFlowQueueComponent(winterFlowSoftwareClass);
        final WinterFlowDatabaseUtility WinterFlowUnitTestResponse = WinterFlowUnitTestResponse();
        if (WinterFlowUnitTestResponse.WinterFlowSyntax == WinterFlowDatabaseProtocol.WinterFlowVariableVersionControl) {
            return;
        }
        WinterFlowSyntaxStructure winterFlowSyntaxStructure = new WinterFlowSyntaxStructure(winterFlowQueueComponent, new WinterFlowDatabaseVersion(winterFlowQueueComponent, this));
        winterFlowQueueComponent.WinterFlowRouterStructure.add(winterFlowSyntaxStructure);
        winterFlowSyntaxStructure.WinterFlowUnitTestResponse(false);
        WinterFlowStackProvider.WinterFlowArrayNetwork(WinterFlowRouterStructure.WinterFlowRouterStructure().WinterFlowCacheManagerAgent, winterFlowSyntaxStructure);
        final WinterFlowQueryStructure winterFlowQueryStructure = new WinterFlowQueryStructure(winterFlowSyntaxStructure, WinterFlowRouterStructure, WinterFlowUnitTestResponse);
        WinterFlowUnitTestResponse.WinterFlowRouterStructure(winterFlowQueryStructure);
        winterFlowQueueComponent.WinterFlowCacheManagerAgent.add(new AutoCloseable() { // from class: com.google.android.datatransport.WinterFlowClassHook
            @Override // java.lang.AutoCloseable
            public final void close() {
                WinterFlowDatabaseUtility.this.WinterFlowTransactionManagerStrategy(winterFlowQueryStructure);
            }
        });
    }

    public static final void WinterFlowArrayNetwork(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof WinterFlowSessionManagerModule) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                WinterFlowArrayNetwork(viewGroup2);
            }
        }
    }

    public static final void WinterFlowRouterRouter(WinterFlowCompilerOrchestration winterFlowCompilerOrchestration) {
        super.onBackPressed();
    }

    @Override // com.google.android.datatransport.WinterFlowSingletonPlatform
    public final WinterFlowStackProvider WinterFlowCacheManagerAgent() {
        return WinterFlowRouterStructure().WinterFlowRouterStructure().WinterFlowCacheManagerAgent;
    }

    @Override // com.google.android.datatransport.WinterFlowExceptionProxy
    public final WinterFlowAlgorithmArray WinterFlowHookDataSource() {
        return (WinterFlowAlgorithmArray) this.WinterFlowTransactionManagerStrategy.WinterFlowUnitTestResponse;
    }

    @Override // com.google.android.datatransport.WinterFlowArrayDeserialization
    public final WinterFlowViewRenderer WinterFlowRouterStructure() {
        return (WinterFlowViewRenderer) this.WinterFlowRouterRouter.getValue();
    }

    public final void WinterFlowSyntax(WinterFlowObjectUI winterFlowObjectUI, WinterFlowSchedulerEngine winterFlowSchedulerEngine, WinterFlowCacheManagerConfiguration winterFlowCacheManagerConfiguration) {
        int i;
        this.WinterFlowSyntax = winterFlowObjectUI;
        this.WinterFlowResponseEngine = winterFlowSchedulerEngine;
        WinterFlowUnitTestNode winterFlowUnitTestNode = winterFlowSchedulerEngine.WinterFlowRouterStructure;
        int i2 = WinterFlowPipelineStructure.WinterFlowRouterStructure;
        ViewGroup.LayoutParams layoutParams = this.WinterFlowTransactionAgent.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        boolean z = (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
        int ordinal = winterFlowUnitTestNode.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                z = true;
            } else {
                if (ordinal != 2) {
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterStructure();
                    return;
                }
                z = false;
            }
        }
        Window window = getWindow();
        window.getClass();
        window.setFlags(z ? 8192 : -8193, 8192);
        int ordinal2 = winterFlowCacheManagerConfiguration.ordinal();
        if (ordinal2 == 0) {
            i = 0;
        } else {
            if (ordinal2 != 1) {
                WinterFlowEventEmitterOrchestration.WinterFlowRouterStructure();
                return;
            }
            i = 1;
        }
        WinterFlowSessionManagerModule winterFlowSessionManagerModule = this.WinterFlowServerProtocol;
        winterFlowSessionManagerModule.setLayoutDirection(i);
        Window window2 = winterFlowSessionManagerModule.WinterFlowServiceUtility;
        boolean z2 = (winterFlowSessionManagerModule.WinterFlowSingletonPlatform && true == winterFlowSessionManagerModule.WinterFlowOrchestrationSubsystem && true == winterFlowSessionManagerModule.WinterFlowConcurrencyThread) ? false : true;
        winterFlowSessionManagerModule.WinterFlowOrchestrationSubsystem = true;
        winterFlowSessionManagerModule.WinterFlowConcurrencyThread = true;
        if (z2 && (-2 != window2.getAttributes().width || !winterFlowSessionManagerModule.WinterFlowSingletonPlatform)) {
            window2.setLayout(-2, -2);
            winterFlowSessionManagerModule.WinterFlowSingletonPlatform = true;
        }
        setCanceledOnTouchOutside(true);
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(0);
        }
    }

    public final void WinterFlowTransactionManagerStrategy() {
        Window window = getWindow();
        window.getClass();
        View decorView = window.getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        window2.getClass();
        View decorView2 = window2.getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        window3.getClass();
        View decorView3 = window3.getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        Window window4 = getWindow();
        window4.getClass();
        View decorView4 = window4.getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // com.google.android.datatransport.WinterFlowDecoratorVersion
    public final WinterFlowDatabaseUtility WinterFlowUnitTestResponse() {
        return WinterFlowVariableVersionControl();
    }

    public final WinterFlowDatabaseUtility WinterFlowVariableVersionControl() {
        WinterFlowDatabaseUtility winterFlowDatabaseUtility = this.WinterFlowVariableVersionControl;
        if (winterFlowDatabaseUtility != null) {
            return winterFlowDatabaseUtility;
        }
        WinterFlowDatabaseUtility winterFlowDatabaseUtility2 = new WinterFlowDatabaseUtility(this, true);
        this.WinterFlowVariableVersionControl = winterFlowDatabaseUtility2;
        return winterFlowDatabaseUtility2;
    }

    @Override // android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        WinterFlowTransactionManagerStrategy();
        super.addContentView(view, layoutParams);
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        ((WinterFlowFrontendManager) this.WinterFlowUnitTestResponse.getValue()).WinterFlowRouterStructure();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            WinterFlowViewRenderer WinterFlowRouterStructure = WinterFlowRouterStructure();
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            WinterFlowRouterStructure.WinterFlowHookDataSource(onBackInvokedDispatcher);
        }
        this.WinterFlowTransactionManagerStrategy.WinterFlowUnitTestResponse(bundle);
        WinterFlowVariableVersionControl().WinterFlowArrayNetwork(WinterFlowMicroserviceProcess.ON_CREATE);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        this.WinterFlowResponseEngine.getClass();
        if (!keyEvent.isTracking() || keyEvent.isCanceled() || i != 111) {
            return super.onKeyUp(i, keyEvent);
        }
        this.WinterFlowSyntax.WinterFlowRouterStructure();
        return true;
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        onSaveInstanceState.getClass();
        this.WinterFlowTransactionManagerStrategy.WinterFlowRouterRouter(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        WinterFlowVariableVersionControl().WinterFlowArrayNetwork(WinterFlowMicroserviceProcess.ON_RESUME);
    }

    @Override // android.app.Dialog
    public final void onStop() {
        WinterFlowVariableVersionControl().WinterFlowArrayNetwork(WinterFlowMicroserviceProcess.ON_DESTROY);
        this.WinterFlowVariableVersionControl = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        View childAt;
        int WinterFlowFrontendBackend;
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        this.WinterFlowResponseEngine.getClass();
        WinterFlowSessionManagerModule winterFlowSessionManagerModule = this.WinterFlowServerProtocol;
        winterFlowSessionManagerModule.getClass();
        if (Math.abs(motionEvent.getX()) <= Float.MAX_VALUE && Math.abs(motionEvent.getY()) <= Float.MAX_VALUE && (childAt = winterFlowSessionManagerModule.getChildAt(0)) != null) {
            int left = childAt.getLeft() + winterFlowSessionManagerModule.getLeft();
            int width = childAt.getWidth() + left;
            int top = childAt.getTop() + winterFlowSessionManagerModule.getTop();
            int height = childAt.getHeight() + top;
            int WinterFlowFrontendBackend2 = WinterFlowCloudStack.WinterFlowFrontendBackend(motionEvent.getX());
            if (left <= WinterFlowFrontendBackend2 && WinterFlowFrontendBackend2 <= width && top <= (WinterFlowFrontendBackend = WinterFlowCloudStack.WinterFlowFrontendBackend(motionEvent.getY())) && WinterFlowFrontendBackend <= height) {
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 0 || actionMasked == 1 || actionMasked == 3) {
                    this.WinterFlowThreadListener = false;
                    return onTouchEvent;
                }
                return onTouchEvent;
            }
        }
        int actionMasked2 = motionEvent.getActionMasked();
        if (actionMasked2 == 0) {
            this.WinterFlowThreadListener = true;
            return true;
        }
        if (actionMasked2 != 1) {
            if (actionMasked2 == 3) {
                this.WinterFlowThreadListener = false;
                return onTouchEvent;
            }
        } else if (this.WinterFlowThreadListener) {
            this.WinterFlowSyntax.WinterFlowRouterStructure();
            this.WinterFlowThreadListener = false;
            return true;
        }
        return onTouchEvent;
    }

    @Override // android.app.Dialog
    public final void setContentView(View view) {
        view.getClass();
        WinterFlowTransactionManagerStrategy();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public final void setContentView(int i) {
        WinterFlowTransactionManagerStrategy();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        WinterFlowTransactionManagerStrategy();
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
