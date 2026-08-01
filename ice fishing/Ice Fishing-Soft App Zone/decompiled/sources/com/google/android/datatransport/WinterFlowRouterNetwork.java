package com.google.android.datatransport;

import android.window.OnBackInvokedDispatcher;
import androidx.activity.ComponentActivity;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowRouterNetwork implements WinterFlowNodeProtocol {
    public final /* synthetic */ ComponentActivity WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ WinterFlowViewRenderer WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowRouterNetwork(WinterFlowViewRenderer winterFlowViewRenderer, ComponentActivity componentActivity) {
        this.WinterFlowVariableVersionControl = winterFlowViewRenderer;
        this.WinterFlowTransactionManagerStrategy = componentActivity;
    }

    @Override // com.google.android.datatransport.WinterFlowNodeProtocol
    public final void WinterFlowTransactionAgent(WinterFlowDecoratorVersion winterFlowDecoratorVersion, WinterFlowMicroserviceProcess winterFlowMicroserviceProcess) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        int i = ComponentActivity.WinterFlowBackendCacheManager;
        if (winterFlowMicroserviceProcess == WinterFlowMicroserviceProcess.ON_CREATE) {
            onBackInvokedDispatcher = this.WinterFlowTransactionManagerStrategy.getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            this.WinterFlowVariableVersionControl.WinterFlowHookDataSource(onBackInvokedDispatcher);
        }
    }
}
