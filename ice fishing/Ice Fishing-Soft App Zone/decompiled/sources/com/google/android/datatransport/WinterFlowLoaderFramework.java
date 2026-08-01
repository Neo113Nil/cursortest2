package com.google.android.datatransport;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Trace;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.icewinter.flow.winter.icecatch.R;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowLoaderFramework extends ViewGroup {
    public WinterFlowResolverParser WinterFlowResponseEngine;
    public WinterFlowExceptionScheduler WinterFlowRouterRouter;
    public boolean WinterFlowServerProtocol;
    public WinterFlowTransactionManagerEncryption WinterFlowSyntax;
    public boolean WinterFlowThreadListener;
    public boolean WinterFlowTransactionAgent;
    public IBinder WinterFlowTransactionManagerStrategy;
    public WinterFlowAlgorithmSyntax WinterFlowUnitTestResponse;
    public WeakReference WinterFlowVariableVersionControl;

    public WinterFlowLoaderFramework(Context context) {
        super(context, null, 0);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        WinterFlowMapperComponent winterFlowMapperComponent = new WinterFlowMapperComponent(1, this);
        addOnAttachStateChangeListener(winterFlowMapperComponent);
        WinterFlowEventEmitterOrchestration winterFlowEventEmitterOrchestration = new WinterFlowEventEmitterOrchestration(27);
        WinterFlowCloudStack.WinterFlowEventEmitterController(this).WinterFlowRouterStructure.add(winterFlowEventEmitterOrchestration);
        this.WinterFlowResponseEngine = new WinterFlowResolverParser(this, winterFlowMapperComponent, winterFlowEventEmitterOrchestration);
    }

    private final void setParentContext(WinterFlowExceptionScheduler winterFlowExceptionScheduler) {
        if (this.WinterFlowRouterRouter != winterFlowExceptionScheduler) {
            this.WinterFlowRouterRouter = winterFlowExceptionScheduler;
            if (winterFlowExceptionScheduler != null) {
                this.WinterFlowVariableVersionControl = null;
            }
            WinterFlowAlgorithmSyntax winterFlowAlgorithmSyntax = this.WinterFlowUnitTestResponse;
            if (winterFlowAlgorithmSyntax != null) {
                winterFlowAlgorithmSyntax.WinterFlowRouterStructure();
                this.WinterFlowUnitTestResponse = null;
                if (isAttachedToWindow()) {
                    WinterFlowUnitTestResponse();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.WinterFlowTransactionManagerStrategy != iBinder) {
            this.WinterFlowTransactionManagerStrategy = iBinder;
            this.WinterFlowVariableVersionControl = null;
        }
    }

    public final void WinterFlowArrayNetwork() {
        if (this.WinterFlowServerProtocol) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    public final void WinterFlowCacheManagerAgent() {
        if (isAttachedToWindow()) {
            setPreviousAttachedWindowToken(getWindowToken());
            if (this.WinterFlowSyntax == null) {
                WinterFlowSyntaxTransactionManager winterFlowSyntaxTransactionManager = null;
                if (getChildCount() != 0) {
                    View childAt = getChildAt(0);
                    if (childAt instanceof WinterFlowSyntaxTransactionManager) {
                        winterFlowSyntaxTransactionManager = (WinterFlowSyntaxTransactionManager) childAt;
                    }
                }
                if (winterFlowSyntaxTransactionManager != null) {
                    winterFlowSyntaxTransactionManager.setComposeViewContext(WinterFlowServerProtocol(WinterFlowInvokerComponent.WinterFlowMapperProtocol(this), winterFlowSyntaxTransactionManager.getComposeViewContext()));
                }
            }
            if (getShouldCreateCompositionOnAttachedToWindow()) {
                WinterFlowUnitTestResponse();
            }
        }
    }

    public abstract void WinterFlowHookDataSource(WinterFlowResolverLibrary winterFlowResolverLibrary, int i);

    /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final WinterFlowTransactionManagerEncryption WinterFlowResponseEngine() {
        WinterFlowTransactionManagerEncryption composeViewContext;
        WinterFlowTransactionManagerEncryption WinterFlowBackendCacheManager;
        WinterFlowProviderCacheManager winterFlowProviderCacheManager;
        if (getChildCount() != 0) {
            View childAt = getChildAt(0);
            WinterFlowSyntaxTransactionManager winterFlowSyntaxTransactionManager = childAt instanceof WinterFlowSyntaxTransactionManager ? (WinterFlowSyntaxTransactionManager) childAt : null;
            if (winterFlowSyntaxTransactionManager != null) {
                composeViewContext = winterFlowSyntaxTransactionManager.getComposeViewContext();
                View WinterFlowMapperProtocol = WinterFlowInvokerComponent.WinterFlowMapperProtocol(this);
                WinterFlowBackendCacheManager = WinterFlowInvokerComponent.WinterFlowBackendCacheManager(WinterFlowMapperProtocol);
                if (WinterFlowBackendCacheManager == null) {
                    return WinterFlowServerProtocol(WinterFlowMapperProtocol, WinterFlowBackendCacheManager);
                }
                WinterFlowExceptionScheduler WinterFlowTransactionAgent = WinterFlowTransactionAgent();
                WinterFlowDecoratorVersion WinterFlowTransactionAgent2 = WinterFlowHookProcessor.WinterFlowTransactionAgent(WinterFlowMapperProtocol);
                if (WinterFlowTransactionAgent2 == null) {
                    WinterFlowTransactionAgent2 = composeViewContext != null ? composeViewContext.WinterFlowCacheManagerAgent : null;
                    if (WinterFlowTransactionAgent2 == null) {
                        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
                        return null;
                    }
                }
                WinterFlowDecoratorVersion winterFlowDecoratorVersion = WinterFlowTransactionAgent2;
                WinterFlowExceptionProxy WinterFlowServerProtocol = WinterFlowNodeVersion.WinterFlowServerProtocol(WinterFlowMapperProtocol);
                if (WinterFlowServerProtocol == null) {
                    WinterFlowServerProtocol = composeViewContext != null ? composeViewContext.WinterFlowArrayNetwork : null;
                    if (WinterFlowServerProtocol == null) {
                        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Composed into the View which doesn't propagate ViewTreeSavedStateRegistryOwner!");
                        return null;
                    }
                }
                WinterFlowExceptionProxy winterFlowExceptionProxy = WinterFlowServerProtocol;
                WinterFlowProviderCacheManager WinterFlowArrayNetwork = WinterFlowWorkerVersionControl.WinterFlowArrayNetwork(WinterFlowMapperProtocol);
                if (WinterFlowArrayNetwork == null) {
                    winterFlowProviderCacheManager = composeViewContext != null ? composeViewContext.WinterFlowVariableVersionControl : null;
                } else {
                    winterFlowProviderCacheManager = WinterFlowArrayNetwork;
                }
                WinterFlowTransactionManagerEncryption winterFlowTransactionManagerEncryption = new WinterFlowTransactionManagerEncryption(WinterFlowInvokerComponent.WinterFlowBackendCacheManager(WinterFlowInvokerComponent.WinterFlowMapperProtocol(WinterFlowMapperProtocol)), WinterFlowMapperProtocol, WinterFlowTransactionAgent, winterFlowDecoratorVersion, winterFlowExceptionProxy, winterFlowProviderCacheManager);
                WinterFlowMapperProtocol.setTag(R.id.androidx_compose_ui_view_compose_view_context, new WeakReference(winterFlowTransactionManagerEncryption));
                return winterFlowTransactionManagerEncryption;
            }
        }
        composeViewContext = null;
        View WinterFlowMapperProtocol2 = WinterFlowInvokerComponent.WinterFlowMapperProtocol(this);
        WinterFlowBackendCacheManager = WinterFlowInvokerComponent.WinterFlowBackendCacheManager(WinterFlowMapperProtocol2);
        if (WinterFlowBackendCacheManager == null) {
        }
    }

    public void WinterFlowRouterRouter(int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    public final WinterFlowTransactionManagerEncryption WinterFlowServerProtocol(View view, WinterFlowTransactionManagerEncryption winterFlowTransactionManagerEncryption) {
        WinterFlowExceptionScheduler WinterFlowTransactionAgent = WinterFlowTransactionAgent();
        WinterFlowDecoratorVersion WinterFlowTransactionAgent2 = WinterFlowHookProcessor.WinterFlowTransactionAgent(view);
        WinterFlowProviderCacheManager WinterFlowArrayNetwork = WinterFlowWorkerVersionControl.WinterFlowArrayNetwork(view);
        WinterFlowExceptionProxy WinterFlowServerProtocol = WinterFlowNodeVersion.WinterFlowServerProtocol(view);
        WinterFlowExceptionScheduler winterFlowExceptionScheduler = winterFlowTransactionManagerEncryption.WinterFlowHookDataSource;
        WinterFlowExceptionProxy winterFlowExceptionProxy = winterFlowTransactionManagerEncryption.WinterFlowArrayNetwork;
        WinterFlowDecoratorVersion winterFlowDecoratorVersion = winterFlowTransactionManagerEncryption.WinterFlowCacheManagerAgent;
        if (WinterFlowTransactionAgent == winterFlowExceptionScheduler && WinterFlowTransactionAgent2 == winterFlowDecoratorVersion && WinterFlowArrayNetwork == winterFlowTransactionManagerEncryption.WinterFlowVariableVersionControl && WinterFlowServerProtocol == winterFlowExceptionProxy) {
            return winterFlowTransactionManagerEncryption;
        }
        if (WinterFlowTransactionAgent.WinterFlowResponseEngine() != winterFlowTransactionManagerEncryption.WinterFlowHookDataSource.WinterFlowResponseEngine()) {
            WinterFlowTransactionManagerStrategy();
        }
        if (WinterFlowTransactionAgent2 == null) {
            WinterFlowTransactionAgent2 = winterFlowDecoratorVersion;
        }
        WinterFlowTransactionManagerEncryption winterFlowTransactionManagerEncryption2 = new WinterFlowTransactionManagerEncryption(winterFlowTransactionManagerEncryption, view, WinterFlowTransactionAgent, WinterFlowTransactionAgent2, WinterFlowServerProtocol == null ? winterFlowExceptionProxy : WinterFlowServerProtocol, WinterFlowArrayNetwork);
        view.setTag(R.id.androidx_compose_ui_view_compose_view_context, new WeakReference(winterFlowTransactionManagerEncryption2));
        return winterFlowTransactionManagerEncryption2;
    }

    public void WinterFlowSyntax(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final WinterFlowExceptionScheduler WinterFlowTransactionAgent() {
        WinterFlowBackendService winterFlowBackendService;
        WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice;
        WinterFlowPipelineBackend winterFlowPipelineBackend;
        WinterFlowExceptionScheduler winterFlowExceptionScheduler = this.WinterFlowRouterRouter;
        if (winterFlowExceptionScheduler == null) {
            winterFlowExceptionScheduler = WinterFlowDeserializationSystem.WinterFlowRouterStructure(this);
            if (winterFlowExceptionScheduler == null) {
                Object parent = getParent();
                while (winterFlowExceptionScheduler == null && (parent instanceof View)) {
                    View view = (View) parent;
                    winterFlowExceptionScheduler = WinterFlowDeserializationSystem.WinterFlowRouterStructure(view);
                    parent = WinterFlowProtocolNetwork.WinterFlowCacheManagerAgent(view);
                }
            }
            if (winterFlowExceptionScheduler != null) {
                WinterFlowExceptionScheduler winterFlowExceptionScheduler2 = (!(winterFlowExceptionScheduler instanceof WinterFlowBackendService) || ((WinterFlowUserManagerSystem) ((WinterFlowBackendService) winterFlowExceptionScheduler).WinterFlowRouterAdapter.getValue()).compareTo(WinterFlowUserManagerSystem.WinterFlowTransactionManagerStrategy) > 0) ? winterFlowExceptionScheduler : null;
                if (winterFlowExceptionScheduler2 != null) {
                    this.WinterFlowVariableVersionControl = new WeakReference(winterFlowExceptionScheduler2);
                }
            } else {
                winterFlowExceptionScheduler = null;
            }
            if (winterFlowExceptionScheduler == null) {
                WeakReference weakReference = this.WinterFlowVariableVersionControl;
                if (weakReference == null || (winterFlowExceptionScheduler = (WinterFlowExceptionScheduler) weakReference.get()) == null || ((winterFlowExceptionScheduler instanceof WinterFlowBackendService) && ((WinterFlowUserManagerSystem) ((WinterFlowBackendService) winterFlowExceptionScheduler).WinterFlowRouterAdapter.getValue()).compareTo(WinterFlowUserManagerSystem.WinterFlowTransactionManagerStrategy) <= 0)) {
                    winterFlowExceptionScheduler = null;
                }
                if (winterFlowExceptionScheduler == null) {
                    if (!isAttachedToWindow()) {
                        WinterFlowViewUtility.WinterFlowHookDataSource("Cannot locate windowRecomposer; View " + this + " is not attached to a window");
                    }
                    Object WinterFlowCacheManagerAgent = WinterFlowProtocolNetwork.WinterFlowCacheManagerAgent(this);
                    View view2 = this;
                    while (WinterFlowCacheManagerAgent instanceof View) {
                        View view3 = (View) WinterFlowCacheManagerAgent;
                        if (view3.getId() == 16908290) {
                            break;
                        }
                        view2 = view3;
                        WinterFlowCacheManagerAgent = view3.getParent();
                    }
                    WinterFlowExceptionScheduler WinterFlowRouterStructure = WinterFlowDeserializationSystem.WinterFlowRouterStructure(view2);
                    if (WinterFlowRouterStructure == null) {
                        ((WinterFlowDebugView) WinterFlowConfigurationUnitTest.WinterFlowRouterStructure.get()).getClass();
                        WinterFlowEventEmitterPackage winterFlowEventEmitterPackage = WinterFlowEventEmitterPackage.WinterFlowVariableVersionControl;
                        WinterFlowRendererNode winterFlowRendererNode = WinterFlowServerHook.WinterFlowConcurrencyThread;
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            winterFlowEncryptionMicroservice = (WinterFlowEncryptionMicroservice) WinterFlowServerHook.WinterFlowConcurrencyThread.getValue();
                        } else {
                            winterFlowEncryptionMicroservice = (WinterFlowEncryptionMicroservice) WinterFlowServerHook.WinterFlowSingletonPlatform.get();
                            if (winterFlowEncryptionMicroservice == null) {
                                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("no AndroidUiDispatcher for this thread");
                                return null;
                            }
                        }
                        WinterFlowEncryptionMicroservice WinterFlowOrchestrationSubsystem = winterFlowEncryptionMicroservice.WinterFlowOrchestrationSubsystem(winterFlowEventEmitterPackage);
                        WinterFlowPipelineBackend winterFlowPipelineBackend2 = (WinterFlowPipelineBackend) WinterFlowOrchestrationSubsystem.WinterFlowConsumerUserManager(WinterFlowCacheUtility.WinterFlowSoftwareProtocol);
                        if (winterFlowPipelineBackend2 != null) {
                            WinterFlowPipelineBackend winterFlowPipelineBackend3 = new WinterFlowPipelineBackend(winterFlowPipelineBackend2);
                            WinterFlowViewSystem winterFlowViewSystem = (WinterFlowViewSystem) winterFlowPipelineBackend3.WinterFlowUnitTestResponse;
                            synchronized (winterFlowViewSystem.WinterFlowHookDataSource) {
                                winterFlowViewSystem.WinterFlowRouterStructure = false;
                                winterFlowPipelineBackend = winterFlowPipelineBackend3;
                            }
                        } else {
                            winterFlowPipelineBackend = 0;
                        }
                        WinterFlowBandwidthCache winterFlowBandwidthCache = new WinterFlowBandwidthCache();
                        WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice2 = (WinterFlowControllerProxy) WinterFlowOrchestrationSubsystem.WinterFlowConsumerUserManager(WinterFlowSessionManagerProcess.WinterFlowBatchUI);
                        if (winterFlowEncryptionMicroservice2 == null) {
                            winterFlowEncryptionMicroservice2 = new WinterFlowProcessorAgent(view2.getContext().getApplicationContext());
                            winterFlowBandwidthCache.WinterFlowVariableVersionControl = winterFlowEncryptionMicroservice2;
                        }
                        if (winterFlowPipelineBackend != 0) {
                            winterFlowEventEmitterPackage = winterFlowPipelineBackend;
                        }
                        WinterFlowEncryptionMicroservice WinterFlowOrchestrationSubsystem2 = WinterFlowOrchestrationSubsystem.WinterFlowOrchestrationSubsystem(winterFlowEventEmitterPackage).WinterFlowOrchestrationSubsystem(winterFlowEncryptionMicroservice2);
                        WinterFlowBackendService winterFlowBackendService2 = new WinterFlowBackendService(WinterFlowOrchestrationSubsystem2);
                        synchronized (winterFlowBackendService2.WinterFlowCacheManagerAgent) {
                            winterFlowBackendService2.WinterFlowBatchUI = true;
                        }
                        WinterFlowEventEmitterFramework WinterFlowHookDataSource = WinterFlowEncryptionSubsystem.WinterFlowHookDataSource(WinterFlowOrchestrationSubsystem2);
                        WinterFlowDecoratorVersion WinterFlowTransactionAgent = WinterFlowHookProcessor.WinterFlowTransactionAgent(view2);
                        WinterFlowDatabaseUtility WinterFlowUnitTestResponse = WinterFlowTransactionAgent != null ? WinterFlowTransactionAgent.WinterFlowUnitTestResponse() : null;
                        if (WinterFlowUnitTestResponse == null) {
                            WinterFlowViewUtility.WinterFlowCacheManagerAgent("ViewTreeLifecycleOwner not found from " + view2);
                            throw new WinterFlowServerSystem();
                        }
                        view2.addOnAttachStateChangeListener(new WinterFlowQueueSystem(view2, winterFlowBackendService2));
                        WinterFlowUnitTestResponse.WinterFlowRouterStructure(new WinterFlowIDEUserManager(WinterFlowHookDataSource, winterFlowPipelineBackend, winterFlowBackendService2, winterFlowBandwidthCache));
                        view2.setTag(R.id.androidx_compose_ui_view_composition_context, winterFlowBackendService2);
                        WinterFlowEventArray winterFlowEventArray = WinterFlowEventArray.WinterFlowVariableVersionControl;
                        Handler handler = view2.getHandler();
                        int i = WinterFlowProxySystem.WinterFlowRouterStructure;
                        int i2 = 2;
                        view2.addOnAttachStateChangeListener(new WinterFlowMapperComponent(i2, WinterFlowCacheRuntime.WinterFlowStrategyTool(winterFlowEventArray, new WinterFlowFrameworkNetwork(handler, "windowRecomposer cleanup", false).WinterFlowResponseEngine, new WinterFlowNetworkOrchestration(winterFlowBackendService2, view2, r1, i2), 2)));
                        winterFlowBackendService = winterFlowBackendService2;
                    } else {
                        if (!(WinterFlowRouterStructure instanceof WinterFlowBackendService)) {
                            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("root viewTreeParentCompositionContext is not a Recomposer");
                            return null;
                        }
                        winterFlowBackendService = (WinterFlowBackendService) WinterFlowRouterStructure;
                    }
                    r1 = ((WinterFlowUserManagerSystem) winterFlowBackendService.WinterFlowRouterAdapter.getValue()).compareTo(WinterFlowUserManagerSystem.WinterFlowTransactionManagerStrategy) > 0 ? winterFlowBackendService : null;
                    if (r1 != null) {
                        this.WinterFlowVariableVersionControl = new WeakReference(r1);
                    }
                    return winterFlowBackendService;
                }
            }
        }
        return winterFlowExceptionScheduler;
    }

    public final void WinterFlowTransactionManagerStrategy() {
        View childAt = getChildAt(0);
        WinterFlowSyntaxTransactionManager winterFlowSyntaxTransactionManager = childAt instanceof WinterFlowSyntaxTransactionManager ? (WinterFlowSyntaxTransactionManager) childAt : null;
        if (winterFlowSyntaxTransactionManager != null && winterFlowSyntaxTransactionManager.WinterFlowUserManagerAdapter) {
            winterFlowSyntaxTransactionManager.getComposeViewContext().WinterFlowHookDataSource();
            winterFlowSyntaxTransactionManager.WinterFlowUserManagerAdapter = false;
        }
        WinterFlowAlgorithmSyntax winterFlowAlgorithmSyntax = this.WinterFlowUnitTestResponse;
        if (winterFlowAlgorithmSyntax != null) {
            winterFlowAlgorithmSyntax.WinterFlowRouterStructure();
        }
        this.WinterFlowUnitTestResponse = null;
        requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void WinterFlowUnitTestResponse() {
        if (this.WinterFlowUnitTestResponse == null) {
            boolean z = false;
            Object[] objArr = 0;
            try {
                this.WinterFlowServerProtocol = true;
                Trace.beginSection("Compose:initializeView");
                try {
                    WinterFlowTransactionManagerEncryption winterFlowTransactionManagerEncryption = this.WinterFlowSyntax;
                    if (winterFlowTransactionManagerEncryption == null) {
                        winterFlowTransactionManagerEncryption = WinterFlowResponseEngine();
                    }
                    this.WinterFlowUnitTestResponse = WinterFlowTransactionManagerTransactionManager.WinterFlowRouterStructure(this, winterFlowTransactionManagerEncryption, new WinterFlowEventTool(1003123809, true, new WinterFlowRendererQuery(objArr == true ? 1 : 0, this)));
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } finally {
                this.WinterFlowServerProtocol = false;
            }
        }
    }

    public final void WinterFlowVariableVersionControl() {
        WinterFlowTransactionManagerEncryption winterFlowTransactionManagerEncryption;
        if (this.WinterFlowRouterRouter != null || isAttachedToWindow() || ((winterFlowTransactionManagerEncryption = this.WinterFlowSyntax) != null && winterFlowTransactionManagerEncryption.WinterFlowRouterStructure.isAttachedToWindow())) {
            WinterFlowUnitTestResponse();
        } else {
            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("createComposition requires a previous call to createComposition(ComposeViewContext), a parent reference, or the View to be attached to a window. Attach the View or call setParentCompositionReference.");
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        WinterFlowArrayNetwork();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        WinterFlowArrayNetwork();
        return super.addViewInLayout(view, i, layoutParams);
    }

    /* renamed from: getAutoClearFocusBehavior-4UtRPd4, reason: not valid java name */
    public final int m0getAutoClearFocusBehavior4UtRPd4() {
        Object tag = getTag(R.id.auto_clear_focus_behavior_tag);
        WinterFlowUITesting winterFlowUITesting = tag instanceof WinterFlowUITesting ? (WinterFlowUITesting) tag : null;
        if (winterFlowUITesting != null) {
            return winterFlowUITesting.WinterFlowRouterStructure;
        }
        return 1;
    }

    public final WinterFlowTransactionManagerEncryption getComposeViewContext$ui() {
        return this.WinterFlowSyntax;
    }

    public final boolean getHasComposition() {
        return this.WinterFlowUnitTestResponse != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.WinterFlowTransactionAgent;
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.WinterFlowThreadListener || super.isTransitionGroup();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        WinterFlowDatabaseSchemaStructure winterFlowDatabaseSchemaStructure = WinterFlowDeserializationSystem.WinterFlowRouterStructure;
        Object WinterFlowCacheManagerAgent = WinterFlowProtocolNetwork.WinterFlowCacheManagerAgent(this);
        View view = this;
        while (WinterFlowCacheManagerAgent instanceof View) {
            View view2 = (View) WinterFlowCacheManagerAgent;
            if (view2.getId() == 16908290) {
                break;
            }
            view = view2;
            WinterFlowCacheManagerAgent = view2.getParent();
        }
        if (view.getParent() == null) {
            getHandler().postAtFrontOfQueue(new WinterFlowServerConcurrency(0, this));
        } else {
            WinterFlowCacheManagerAgent();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        WinterFlowRouterRouter(i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        WinterFlowUnitTestResponse();
        WinterFlowSyntax(i, i2);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i);
        }
    }

    /* renamed from: setAutoClearFocusBehavior-17tfJxM, reason: not valid java name */
    public final void m1setAutoClearFocusBehavior17tfJxM(int i) {
        setTag(R.id.auto_clear_focus_behavior_tag, new WinterFlowUITesting(i));
    }

    public final void setComposeViewContext$ui(WinterFlowTransactionManagerEncryption winterFlowTransactionManagerEncryption) {
        if (this.WinterFlowSyntax != winterFlowTransactionManagerEncryption) {
            if (winterFlowTransactionManagerEncryption == null) {
                WinterFlowTransactionManagerStrategy();
            } else if (getChildCount() != 0) {
                View childAt = getChildAt(0);
                WinterFlowSyntaxTransactionManager winterFlowSyntaxTransactionManager = childAt instanceof WinterFlowSyntaxTransactionManager ? (WinterFlowSyntaxTransactionManager) childAt : null;
                if (winterFlowSyntaxTransactionManager != null) {
                    if (winterFlowSyntaxTransactionManager.getCoroutineContext() != winterFlowTransactionManagerEncryption.WinterFlowHookDataSource.WinterFlowResponseEngine()) {
                        WinterFlowTransactionManagerStrategy();
                    }
                    winterFlowSyntaxTransactionManager.setComposeViewContext(winterFlowTransactionManagerEncryption);
                }
            }
            this.WinterFlowSyntax = winterFlowTransactionManagerEncryption;
        }
    }

    public final void setParentCompositionContext(WinterFlowExceptionScheduler winterFlowExceptionScheduler) {
        setParentContext(winterFlowExceptionScheduler);
    }

    public final void setShowLayoutBounds(boolean z) {
        this.WinterFlowTransactionAgent = z;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((WinterFlowSyntaxTransactionManager) ((WinterFlowListenerService) childAt)).setShowLayoutBounds(z);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z) {
        super.setTransitionGroup(z);
        this.WinterFlowThreadListener = true;
    }

    public final void setViewCompositionStrategy(WinterFlowThreadPoolCloud winterFlowThreadPoolCloud) {
        WinterFlowResolverParser winterFlowResolverParser = this.WinterFlowResponseEngine;
        if (winterFlowResolverParser != null) {
            winterFlowResolverParser.WinterFlowRouterStructure();
        }
        ((WinterFlowDecoratorRouter) winterFlowThreadPoolCloud).getClass();
        WinterFlowMapperComponent winterFlowMapperComponent = new WinterFlowMapperComponent(1, this);
        addOnAttachStateChangeListener(winterFlowMapperComponent);
        WinterFlowEventEmitterOrchestration winterFlowEventEmitterOrchestration = new WinterFlowEventEmitterOrchestration(27);
        WinterFlowCloudStack.WinterFlowEventEmitterController(this).WinterFlowRouterStructure.add(winterFlowEventEmitterOrchestration);
        this.WinterFlowResponseEngine = new WinterFlowResolverParser(this, winterFlowMapperComponent, winterFlowEventEmitterOrchestration);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        WinterFlowArrayNetwork();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        WinterFlowArrayNetwork();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        WinterFlowArrayNetwork();
        super.addView(view, i, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        WinterFlowArrayNetwork();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        WinterFlowArrayNetwork();
        super.addView(view, i, layoutParams);
    }

    public static /* synthetic */ void getComposeViewContext$ui$annotations() {
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }
}
