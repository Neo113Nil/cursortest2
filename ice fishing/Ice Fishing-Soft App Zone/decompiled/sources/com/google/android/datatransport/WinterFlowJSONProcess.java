package com.google.android.datatransport;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowJSONProcess implements ComponentCallbacks2, ViewTreeObserver.OnWindowFocusChangeListener {
    public final /* synthetic */ WinterFlowTransactionManagerEncryption WinterFlowVariableVersionControl;

    public WinterFlowJSONProcess(WinterFlowTransactionManagerEncryption winterFlowTransactionManagerEncryption) {
        this.WinterFlowVariableVersionControl = winterFlowTransactionManagerEncryption;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.WinterFlowVariableVersionControl.WinterFlowArrayNetwork(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        WinterFlowTransactionManagerEncryption winterFlowTransactionManagerEncryption = this.WinterFlowVariableVersionControl;
        winterFlowTransactionManagerEncryption.WinterFlowTransactionManagerStrategy.WinterFlowRouterStructure.clear();
        WinterFlowHookProcess winterFlowHookProcess = winterFlowTransactionManagerEncryption.WinterFlowUnitTestResponse;
        synchronized (winterFlowHookProcess) {
            winterFlowHookProcess.WinterFlowRouterStructure.WinterFlowCacheManagerAgent();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        WinterFlowTransactionManagerEncryption winterFlowTransactionManagerEncryption = this.WinterFlowVariableVersionControl;
        winterFlowTransactionManagerEncryption.WinterFlowTransactionManagerStrategy.WinterFlowRouterStructure.clear();
        WinterFlowHookProcess winterFlowHookProcess = winterFlowTransactionManagerEncryption.WinterFlowUnitTestResponse;
        synchronized (winterFlowHookProcess) {
            winterFlowHookProcess.WinterFlowRouterStructure.WinterFlowCacheManagerAgent();
        }
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        this.WinterFlowVariableVersionControl.WinterFlowVariableBandwidth.WinterFlowVariableVersionControl.setValue(Boolean.valueOf(z));
    }
}
