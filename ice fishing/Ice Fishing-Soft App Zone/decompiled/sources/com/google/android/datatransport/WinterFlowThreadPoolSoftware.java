package com.google.android.datatransport;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public class WinterFlowThreadPoolSoftware extends WinterFlowFrameworkMechanism {
    public final Window WinterFlowHookDataSource;
    public final WindowInsetsController WinterFlowRouterStructure;

    public WinterFlowThreadPoolSoftware(Window window) {
        WindowInsetsController insetsController;
        insetsController = window.getInsetsController();
        this.WinterFlowRouterStructure = insetsController;
        this.WinterFlowHookDataSource = window;
    }

    @Override // com.google.android.datatransport.WinterFlowFrameworkMechanism
    public void WinterFlowServerProtocol(boolean z) {
        WinterFlowServiceUtility(16, 16, z);
    }

    public final void WinterFlowServiceUtility(int i, int i2, boolean z) {
        Window window = this.WinterFlowHookDataSource;
        if (window == null) {
            WindowInsetsController windowInsetsController = this.WinterFlowRouterStructure;
            if (z) {
                windowInsetsController.setSystemBarsAppearance(i2, i2);
                return;
            } else {
                windowInsetsController.setSystemBarsAppearance(0, i2);
                return;
            }
        }
        if (z) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        } else {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility((~i) & decorView2.getSystemUiVisibility());
        }
    }

    @Override // com.google.android.datatransport.WinterFlowFrameworkMechanism
    public void WinterFlowThreadListener(boolean z) {
        WinterFlowServiceUtility(8192, 8, z);
    }
}
