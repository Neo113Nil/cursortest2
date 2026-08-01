package com.google.android.datatransport;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowScriptEngine extends WinterFlowControllerDebug {
    public final int WinterFlowArrayNetwork;
    public final OnBackInvokedDispatcher WinterFlowCacheManagerAgent;
    public boolean WinterFlowTransactionManagerStrategy;
    public final OnBackInvokedCallback WinterFlowVariableVersionControl;

    public WinterFlowScriptEngine(OnBackInvokedDispatcher onBackInvokedDispatcher, int i) {
        this.WinterFlowCacheManagerAgent = onBackInvokedDispatcher;
        this.WinterFlowArrayNetwork = i;
        this.WinterFlowVariableVersionControl = Build.VERSION.SDK_INT == 33 ? new OnBackInvokedCallback() { // from class: com.google.android.datatransport.WinterFlowOrchestrationProcess
            public final void onBackInvoked() {
                WinterFlowScriptEngine.this.WinterFlowRouterStructure();
            }
        } : new WinterFlowCacheCache(this);
    }

    @Override // com.google.android.datatransport.WinterFlowControllerDebug
    public final void WinterFlowHookDataSource(boolean z) {
        OnBackInvokedCallback onBackInvokedCallback = this.WinterFlowVariableVersionControl;
        if (z && !this.WinterFlowTransactionManagerStrategy) {
            this.WinterFlowCacheManagerAgent.registerOnBackInvokedCallback(this.WinterFlowArrayNetwork, onBackInvokedCallback);
            this.WinterFlowTransactionManagerStrategy = true;
        } else {
            if (z || !this.WinterFlowTransactionManagerStrategy) {
                return;
            }
            this.WinterFlowCacheManagerAgent.unregisterOnBackInvokedCallback(onBackInvokedCallback);
            this.WinterFlowTransactionManagerStrategy = false;
        }
    }
}
