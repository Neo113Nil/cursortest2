package com.google.android.datatransport;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowDeploymentNode extends WinterFlowStack {
    @Override // com.google.android.datatransport.WinterFlowSoftwareHelper, com.google.android.datatransport.WinterFlowTransactionManagerDeployment
    public void WinterFlowHookDataSource(WinterFlowIDEParser winterFlowIDEParser, WinterFlowIDEParser winterFlowIDEParser2, Window window, View view, boolean z, boolean z2) {
        winterFlowIDEParser.getClass();
        winterFlowIDEParser2.getClass();
        window.getClass();
        view.getClass();
        WinterFlowPackageProcess.WinterFlowServerProtocol(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            int i = 0;
            while (true) {
                if (!(i < viewGroup.getChildCount())) {
                    break;
                }
                int i2 = i + 1;
                View childAt = viewGroup.getChildAt(i);
                if (childAt == null) {
                    throw new IndexOutOfBoundsException();
                }
                Object tag = childAt.getTag();
                if (tag instanceof List) {
                    List list = (List) tag;
                    if (list.size() == 4 && (list.get(0) instanceof WinterFlowUserManagerTool)) {
                        Iterator it = ((Iterable) tag).iterator();
                        while (it.hasNext()) {
                            it.next();
                        }
                    }
                }
                i = i2;
            }
        }
        window.setNavigationBarContrastEnforced(true);
        int i3 = Build.VERSION.SDK_INT;
        WinterFlowFrameworkMechanism winterFlowEventEmitterTool = i3 >= 35 ? new WinterFlowEventEmitterTool(window) : i3 >= 30 ? new WinterFlowThreadPoolSoftware(window) : new WinterFlowConcurrencyNetwork(window);
        winterFlowEventEmitterTool.WinterFlowThreadListener(!z);
        winterFlowEventEmitterTool.WinterFlowServerProtocol(true ^ z2);
    }
}
