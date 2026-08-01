package com.google.android.datatransport;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import android.view.Surface;
import java.util.function.Consumer;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowXMLDebug implements ScrollCaptureCallback {
    public final WinterFlowSyntaxTransactionManager WinterFlowArrayNetwork;
    public final WinterFlowRuntimeInvoker WinterFlowCacheManagerAgent;
    public final WinterFlowLibraryInterface WinterFlowHookDataSource;
    public final WinterFlowProcessorSystem WinterFlowRouterStructure;
    public final WinterFlowWidgetRepository WinterFlowTransactionManagerStrategy;
    public final WinterFlowEventEmitterFramework WinterFlowVariableVersionControl;

    public WinterFlowXMLDebug(WinterFlowProcessorSystem winterFlowProcessorSystem, WinterFlowLibraryInterface winterFlowLibraryInterface, WinterFlowEventEmitterFramework winterFlowEventEmitterFramework, WinterFlowRuntimeInvoker winterFlowRuntimeInvoker, WinterFlowSyntaxTransactionManager winterFlowSyntaxTransactionManager) {
        this.WinterFlowRouterStructure = winterFlowProcessorSystem;
        this.WinterFlowHookDataSource = winterFlowLibraryInterface;
        this.WinterFlowCacheManagerAgent = winterFlowRuntimeInvoker;
        this.WinterFlowArrayNetwork = winterFlowSyntaxTransactionManager;
        this.WinterFlowVariableVersionControl = new WinterFlowEventEmitterFramework(winterFlowEventEmitterFramework.WinterFlowVariableVersionControl.WinterFlowOrchestrationSubsystem(WinterFlowDatabaseUI.WinterFlowTransactionManagerStrategy));
        this.WinterFlowTransactionManagerStrategy = new WinterFlowWidgetRepository(winterFlowLibraryInterface.WinterFlowArrayNetwork - winterFlowLibraryInterface.WinterFlowHookDataSource, new WinterFlowXMLStack(this, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x008f, code lost:
    
        if (r9 == r6) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WinterFlowRouterStructure(ScrollCaptureSession scrollCaptureSession, WinterFlowLibraryInterface winterFlowLibraryInterface, WinterFlowOrchestrationCompiler winterFlowOrchestrationCompiler) {
        WinterFlowDebugTool winterFlowDebugTool;
        int i;
        WinterFlowListenerJava winterFlowListenerJava;
        int i2;
        int i3;
        WinterFlowServiceProviderBatch winterFlowServiceProviderBatch;
        WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice;
        ScrollCaptureSession scrollCaptureSession2;
        int i4;
        WinterFlowLibraryInterface winterFlowLibraryInterface2;
        int i5;
        int WinterFlowSyntax;
        int WinterFlowSyntax2;
        Surface surface;
        Surface surface2;
        Surface surface3;
        if (winterFlowOrchestrationCompiler instanceof WinterFlowDebugTool) {
            winterFlowDebugTool = (WinterFlowDebugTool) winterFlowOrchestrationCompiler;
            int i6 = winterFlowDebugTool.WinterFlowServiceUtility;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                winterFlowDebugTool.WinterFlowServiceUtility = i6 - Integer.MIN_VALUE;
                Object obj = winterFlowDebugTool.WinterFlowServerProtocol;
                i = winterFlowDebugTool.WinterFlowServiceUtility;
                WinterFlowWidgetRepository winterFlowWidgetRepository = this.WinterFlowTransactionManagerStrategy;
                winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
                if (i != 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    i2 = winterFlowLibraryInterface.WinterFlowHookDataSource;
                    i3 = winterFlowLibraryInterface.WinterFlowArrayNetwork;
                    winterFlowDebugTool.WinterFlowRouterRouter = scrollCaptureSession;
                    winterFlowDebugTool.WinterFlowSyntax = winterFlowLibraryInterface;
                    winterFlowDebugTool.WinterFlowResponseEngine = i2;
                    winterFlowDebugTool.WinterFlowTransactionAgent = i3;
                    winterFlowDebugTool.WinterFlowServiceUtility = 1;
                    int i7 = winterFlowWidgetRepository.WinterFlowRouterStructure;
                    if (i2 > i3) {
                        WinterFlowCompilerMechanism.WinterFlowCacheManagerAgent(WinterFlowResolverBackend.WinterFlowRouterRouter(i2, i3, "Expected min=", " ≤ max="));
                        return null;
                    }
                    int i8 = i3 - i2;
                    if (i8 > i7) {
                        WinterFlowCompilerMechanism.WinterFlowCacheManagerAgent(WinterFlowResolverBackend.WinterFlowRouterRouter(i8, i7, "Expected range (", ") to be ≤ viewportSize="));
                        return null;
                    }
                    float f = i2;
                    float f2 = winterFlowWidgetRepository.WinterFlowCacheManagerAgent;
                    Object obj2 = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                    if (f < f2 || i3 > i7 + f2) {
                        Object WinterFlowRouterStructure = winterFlowWidgetRepository.WinterFlowRouterStructure((((i8 / 2) + i2) - (i7 / 2)) - f2, winterFlowDebugTool);
                        if (WinterFlowRouterStructure != winterFlowListenerJava) {
                            WinterFlowRouterStructure = obj2;
                        }
                        if (WinterFlowRouterStructure == winterFlowListenerJava) {
                            obj2 = WinterFlowRouterStructure;
                        }
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i4 = winterFlowDebugTool.WinterFlowTransactionAgent;
                        i5 = winterFlowDebugTool.WinterFlowResponseEngine;
                        winterFlowLibraryInterface2 = winterFlowDebugTool.WinterFlowSyntax;
                        scrollCaptureSession2 = WinterFlowUserManagerPlatform.WinterFlowTransactionAgent(winterFlowDebugTool.WinterFlowRouterRouter);
                        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                        WinterFlowSyntax = WinterFlowDecoratorUI.WinterFlowSyntax(i5 - WinterFlowCloudStack.WinterFlowFrontendBackend(winterFlowWidgetRepository.WinterFlowCacheManagerAgent), 0, winterFlowWidgetRepository.WinterFlowRouterStructure);
                        WinterFlowSyntax2 = WinterFlowDecoratorUI.WinterFlowSyntax(i4 - WinterFlowCloudStack.WinterFlowFrontendBackend(winterFlowWidgetRepository.WinterFlowCacheManagerAgent), 0, winterFlowWidgetRepository.WinterFlowRouterStructure);
                        int i9 = winterFlowLibraryInterface2.WinterFlowRouterStructure;
                        int i10 = winterFlowLibraryInterface2.WinterFlowCacheManagerAgent;
                        if (WinterFlowSyntax != WinterFlowSyntax2) {
                            return WinterFlowLibraryInterface.WinterFlowVariableVersionControl;
                        }
                        surface = scrollCaptureSession2.getSurface();
                        Canvas lockHardwareCanvas = surface.lockHardwareCanvas();
                        try {
                            lockHardwareCanvas.save();
                            lockHardwareCanvas.translate(-i9, -WinterFlowSyntax);
                            WinterFlowLibraryInterface winterFlowLibraryInterface3 = this.WinterFlowHookDataSource;
                            lockHardwareCanvas.translate(-winterFlowLibraryInterface3.WinterFlowRouterStructure, -winterFlowLibraryInterface3.WinterFlowHookDataSource);
                            this.WinterFlowArrayNetwork.getRootView().draw(lockHardwareCanvas);
                            surface3 = scrollCaptureSession2.getSurface();
                            surface3.unlockCanvasAndPost(lockHardwareCanvas);
                            int WinterFlowFrontendBackend = WinterFlowCloudStack.WinterFlowFrontendBackend(winterFlowWidgetRepository.WinterFlowCacheManagerAgent);
                            return new WinterFlowLibraryInterface(i9, WinterFlowSyntax + WinterFlowFrontendBackend, i10, WinterFlowSyntax2 + WinterFlowFrontendBackend);
                        } catch (Throwable th) {
                            surface2 = scrollCaptureSession2.getSurface();
                            surface2.unlockCanvasAndPost(lockHardwareCanvas);
                            throw th;
                        }
                    }
                    int i11 = winterFlowDebugTool.WinterFlowTransactionAgent;
                    int i12 = winterFlowDebugTool.WinterFlowResponseEngine;
                    WinterFlowLibraryInterface winterFlowLibraryInterface4 = winterFlowDebugTool.WinterFlowSyntax;
                    ScrollCaptureSession WinterFlowTransactionAgent = WinterFlowUserManagerPlatform.WinterFlowTransactionAgent(winterFlowDebugTool.WinterFlowRouterRouter);
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    i2 = i12;
                    winterFlowLibraryInterface = winterFlowLibraryInterface4;
                    i3 = i11;
                    scrollCaptureSession = WinterFlowTransactionAgent;
                }
                winterFlowServiceProviderBatch = WinterFlowServiceProviderBatch.WinterFlowOrchestrationSubsystem;
                winterFlowDebugTool.WinterFlowRouterRouter = scrollCaptureSession;
                winterFlowDebugTool.WinterFlowSyntax = winterFlowLibraryInterface;
                winterFlowDebugTool.WinterFlowResponseEngine = i2;
                winterFlowDebugTool.WinterFlowTransactionAgent = i3;
                winterFlowDebugTool.WinterFlowServiceUtility = 2;
                winterFlowEncryptionMicroservice = winterFlowDebugTool.WinterFlowTransactionManagerStrategy;
                winterFlowEncryptionMicroservice.getClass();
                if (WinterFlowManagerRequest.WinterFlowCompilerVariable(winterFlowEncryptionMicroservice).WinterFlowRouterStructure(winterFlowServiceProviderBatch, winterFlowDebugTool) != winterFlowListenerJava) {
                    scrollCaptureSession2 = scrollCaptureSession;
                    i4 = i3;
                    winterFlowLibraryInterface2 = winterFlowLibraryInterface;
                    i5 = i2;
                    WinterFlowSyntax = WinterFlowDecoratorUI.WinterFlowSyntax(i5 - WinterFlowCloudStack.WinterFlowFrontendBackend(winterFlowWidgetRepository.WinterFlowCacheManagerAgent), 0, winterFlowWidgetRepository.WinterFlowRouterStructure);
                    WinterFlowSyntax2 = WinterFlowDecoratorUI.WinterFlowSyntax(i4 - WinterFlowCloudStack.WinterFlowFrontendBackend(winterFlowWidgetRepository.WinterFlowCacheManagerAgent), 0, winterFlowWidgetRepository.WinterFlowRouterStructure);
                    int i92 = winterFlowLibraryInterface2.WinterFlowRouterStructure;
                    int i102 = winterFlowLibraryInterface2.WinterFlowCacheManagerAgent;
                    if (WinterFlowSyntax != WinterFlowSyntax2) {
                    }
                }
                return winterFlowListenerJava;
            }
        }
        winterFlowDebugTool = new WinterFlowDebugTool(this, winterFlowOrchestrationCompiler);
        Object obj3 = winterFlowDebugTool.WinterFlowServerProtocol;
        i = winterFlowDebugTool.WinterFlowServiceUtility;
        WinterFlowWidgetRepository winterFlowWidgetRepository2 = this.WinterFlowTransactionManagerStrategy;
        winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
        if (i != 0) {
        }
        winterFlowServiceProviderBatch = WinterFlowServiceProviderBatch.WinterFlowOrchestrationSubsystem;
        winterFlowDebugTool.WinterFlowRouterRouter = scrollCaptureSession;
        winterFlowDebugTool.WinterFlowSyntax = winterFlowLibraryInterface;
        winterFlowDebugTool.WinterFlowResponseEngine = i2;
        winterFlowDebugTool.WinterFlowTransactionAgent = i3;
        winterFlowDebugTool.WinterFlowServiceUtility = 2;
        winterFlowEncryptionMicroservice = winterFlowDebugTool.WinterFlowTransactionManagerStrategy;
        winterFlowEncryptionMicroservice.getClass();
        if (WinterFlowManagerRequest.WinterFlowCompilerVariable(winterFlowEncryptionMicroservice).WinterFlowRouterStructure(winterFlowServiceProviderBatch, winterFlowDebugTool) != winterFlowListenerJava) {
        }
        return winterFlowListenerJava;
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        WinterFlowCacheRuntime.WinterFlowStrategyTool(this.WinterFlowVariableVersionControl, WinterFlowInheritanceRepository.WinterFlowTransactionManagerStrategy, new WinterFlowModuleStack(this, runnable, null, 7), 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        final WinterFlowPipelineObject WinterFlowStrategyTool = WinterFlowCacheRuntime.WinterFlowStrategyTool(this.WinterFlowVariableVersionControl, null, new WinterFlowMiddlewareVariable(this, scrollCaptureSession, rect, consumer, null, 0), 3);
        WinterFlowStrategyTool.WinterFlowTransactionAgent(new WinterFlowProviderFramework(8, cancellationSignal));
        cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: com.google.android.datatransport.WinterFlowRuntimeConsumer
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                WinterFlowPipelineObject.this.WinterFlowArrayNetwork(null);
            }
        });
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(WinterFlowProtocolNetwork.WinterFlowResponseEngine(this.WinterFlowHookDataSource));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.WinterFlowTransactionManagerStrategy.WinterFlowCacheManagerAgent = 0.0f;
        this.WinterFlowCacheManagerAgent.WinterFlowRouterStructure.setValue(Boolean.TRUE);
        runnable.run();
    }
}
