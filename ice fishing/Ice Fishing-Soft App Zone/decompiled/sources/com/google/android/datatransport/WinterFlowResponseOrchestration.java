package com.google.android.datatransport;

import android.os.Build;
import android.view.View;
import java.util.List;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowResponseOrchestration extends WinterFlowWorkerCompiler implements Runnable, WinterFlowServiceLoader, View.OnAttachStateChangeListener {
    public WinterFlowWebsocketInterface WinterFlowResponseEngine;
    public boolean WinterFlowRouterRouter;
    public boolean WinterFlowSyntax;
    public final WinterFlowBandwidthProcess WinterFlowUnitTestResponse;

    public WinterFlowResponseOrchestration(WinterFlowBandwidthProcess winterFlowBandwidthProcess) {
        super(!winterFlowBandwidthProcess.WinterFlowVariableBandwidth ? 1 : 0);
        this.WinterFlowUnitTestResponse = winterFlowBandwidthProcess;
    }

    @Override // com.google.android.datatransport.WinterFlowWorkerCompiler
    public final WinterFlowCacheManagerVersionControl WinterFlowRouterRouter(WinterFlowValidatorEngine winterFlowValidatorEngine, WinterFlowCacheManagerVersionControl winterFlowCacheManagerVersionControl) {
        this.WinterFlowRouterRouter = false;
        return winterFlowCacheManagerVersionControl;
    }

    @Override // com.google.android.datatransport.WinterFlowServiceLoader
    public final WinterFlowWebsocketInterface WinterFlowRouterStructure(View view, WinterFlowWebsocketInterface winterFlowWebsocketInterface) {
        this.WinterFlowResponseEngine = winterFlowWebsocketInterface;
        WinterFlowBandwidthProcess winterFlowBandwidthProcess = this.WinterFlowUnitTestResponse;
        WinterFlowUnitTestThread winterFlowUnitTestThread = winterFlowBandwidthProcess.WinterFlowConcurrencyThread;
        WinterFlowWidgetEntity winterFlowWidgetEntity = winterFlowWebsocketInterface.WinterFlowRouterStructure;
        winterFlowUnitTestThread.WinterFlowTransactionManagerStrategy(WinterFlowDecoratorRouter.WinterFlowThreadListener(winterFlowWidgetEntity.WinterFlowSyntax(8)));
        if (this.WinterFlowRouterRouter) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.WinterFlowSyntax) {
            winterFlowBandwidthProcess.WinterFlowSingletonPlatform.WinterFlowTransactionManagerStrategy(WinterFlowDecoratorRouter.WinterFlowThreadListener(winterFlowWidgetEntity.WinterFlowSyntax(8)));
            WinterFlowBandwidthProcess.WinterFlowRouterStructure(winterFlowBandwidthProcess, winterFlowWebsocketInterface);
        }
        return winterFlowBandwidthProcess.WinterFlowVariableBandwidth ? WinterFlowWebsocketInterface.WinterFlowHookDataSource : winterFlowWebsocketInterface;
    }

    @Override // com.google.android.datatransport.WinterFlowWorkerCompiler
    public final void WinterFlowTransactionManagerStrategy(WinterFlowValidatorEngine winterFlowValidatorEngine) {
        this.WinterFlowRouterRouter = true;
        this.WinterFlowSyntax = true;
    }

    @Override // com.google.android.datatransport.WinterFlowWorkerCompiler
    public final WinterFlowWebsocketInterface WinterFlowUnitTestResponse(WinterFlowWebsocketInterface winterFlowWebsocketInterface, List list) {
        WinterFlowBandwidthProcess winterFlowBandwidthProcess = this.WinterFlowUnitTestResponse;
        WinterFlowBandwidthProcess.WinterFlowRouterStructure(winterFlowBandwidthProcess, winterFlowWebsocketInterface);
        return winterFlowBandwidthProcess.WinterFlowVariableBandwidth ? WinterFlowWebsocketInterface.WinterFlowHookDataSource : winterFlowWebsocketInterface;
    }

    @Override // com.google.android.datatransport.WinterFlowWorkerCompiler
    public final void WinterFlowVariableVersionControl(WinterFlowValidatorEngine winterFlowValidatorEngine) {
        this.WinterFlowRouterRouter = false;
        this.WinterFlowSyntax = false;
        WinterFlowWebsocketInterface winterFlowWebsocketInterface = this.WinterFlowResponseEngine;
        if (winterFlowValidatorEngine.WinterFlowRouterStructure.WinterFlowHookDataSource() > 0 && winterFlowWebsocketInterface != null) {
            WinterFlowWidgetEntity winterFlowWidgetEntity = winterFlowWebsocketInterface.WinterFlowRouterStructure;
            WinterFlowBandwidthProcess winterFlowBandwidthProcess = this.WinterFlowUnitTestResponse;
            winterFlowBandwidthProcess.WinterFlowSingletonPlatform.WinterFlowTransactionManagerStrategy(WinterFlowDecoratorRouter.WinterFlowThreadListener(winterFlowWidgetEntity.WinterFlowSyntax(8)));
            winterFlowBandwidthProcess.WinterFlowConcurrencyThread.WinterFlowTransactionManagerStrategy(WinterFlowDecoratorRouter.WinterFlowThreadListener(winterFlowWidgetEntity.WinterFlowSyntax(8)));
            WinterFlowBandwidthProcess.WinterFlowRouterStructure(winterFlowBandwidthProcess, winterFlowWebsocketInterface);
        }
        this.WinterFlowResponseEngine = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.WinterFlowRouterRouter) {
            this.WinterFlowRouterRouter = false;
            this.WinterFlowSyntax = false;
            WinterFlowWebsocketInterface winterFlowWebsocketInterface = this.WinterFlowResponseEngine;
            if (winterFlowWebsocketInterface != null) {
                WinterFlowBandwidthProcess winterFlowBandwidthProcess = this.WinterFlowUnitTestResponse;
                winterFlowBandwidthProcess.WinterFlowSingletonPlatform.WinterFlowTransactionManagerStrategy(WinterFlowDecoratorRouter.WinterFlowThreadListener(winterFlowWebsocketInterface.WinterFlowRouterStructure.WinterFlowSyntax(8)));
                WinterFlowBandwidthProcess.WinterFlowRouterStructure(winterFlowBandwidthProcess, winterFlowWebsocketInterface);
                this.WinterFlowResponseEngine = null;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
