package com.google.android.datatransport;

import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowConcurrencyNetwork extends WinterFlowFrameworkMechanism {
    public final Window WinterFlowRouterStructure;

    public WinterFlowConcurrencyNetwork(Window window) {
        this.WinterFlowRouterStructure = window;
    }

    @Override // com.google.android.datatransport.WinterFlowFrameworkMechanism
    public final void WinterFlowServerProtocol(boolean z) {
        Window window = this.WinterFlowRouterStructure;
        if (!z) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-17));
        } else {
            window.clearFlags(134217728);
            window.addFlags(Integer.MIN_VALUE);
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 16);
        }
    }

    @Override // com.google.android.datatransport.WinterFlowFrameworkMechanism
    public final void WinterFlowThreadListener(boolean z) {
        Window window = this.WinterFlowRouterStructure;
        if (!z) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
        } else {
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 8192);
        }
    }
}
