package com.google.android.datatransport;

import android.view.Choreographer;
import java.util.ArrayList;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowNetworkCompiler implements Choreographer.FrameCallback, Runnable {
    public final /* synthetic */ WinterFlowServerHook WinterFlowVariableVersionControl;

    public WinterFlowNetworkCompiler(WinterFlowServerHook winterFlowServerHook) {
        this.WinterFlowVariableVersionControl = winterFlowServerHook;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.WinterFlowVariableVersionControl.WinterFlowRouterRouter.removeCallbacks(this);
        this.WinterFlowVariableVersionControl.WinterFlowSoftwareProtocol();
        WinterFlowServerHook winterFlowServerHook = this.WinterFlowVariableVersionControl;
        synchronized (winterFlowServerHook.WinterFlowSyntax) {
            if (winterFlowServerHook.WinterFlowServiceUtility) {
                winterFlowServerHook.WinterFlowServiceUtility = false;
                ArrayList arrayList = winterFlowServerHook.WinterFlowTransactionAgent;
                winterFlowServerHook.WinterFlowTransactionAgent = winterFlowServerHook.WinterFlowServerProtocol;
                winterFlowServerHook.WinterFlowServerProtocol = arrayList;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((Choreographer.FrameCallback) arrayList.get(i)).doFrame(j);
                }
                arrayList.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.WinterFlowVariableVersionControl.WinterFlowSoftwareProtocol();
        WinterFlowServerHook winterFlowServerHook = this.WinterFlowVariableVersionControl;
        synchronized (winterFlowServerHook.WinterFlowSyntax) {
            if (winterFlowServerHook.WinterFlowTransactionAgent.isEmpty()) {
                winterFlowServerHook.WinterFlowUnitTestResponse.removeFrameCallback(this);
                winterFlowServerHook.WinterFlowServiceUtility = false;
            }
        }
    }
}
