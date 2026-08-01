package com.google.android.datatransport;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public class WinterFlowSoftwareHelper extends WinterFlowSyntaxQueue {
    @Override // com.google.android.datatransport.WinterFlowTransactionManagerDeployment
    public void WinterFlowHookDataSource(WinterFlowIDEParser winterFlowIDEParser, WinterFlowIDEParser winterFlowIDEParser2, Window window, View view, boolean z, boolean z2) {
        winterFlowIDEParser.getClass();
        winterFlowIDEParser2.getClass();
        window.getClass();
        view.getClass();
        WinterFlowPackageProcess.WinterFlowServerProtocol(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(true);
        int i = Build.VERSION.SDK_INT;
        WinterFlowFrameworkMechanism winterFlowEventEmitterTool = i >= 35 ? new WinterFlowEventEmitterTool(window) : i >= 30 ? new WinterFlowThreadPoolSoftware(window) : new WinterFlowConcurrencyNetwork(window);
        winterFlowEventEmitterTool.WinterFlowThreadListener(!z);
        winterFlowEventEmitterTool.WinterFlowServerProtocol(!z2);
    }
}
