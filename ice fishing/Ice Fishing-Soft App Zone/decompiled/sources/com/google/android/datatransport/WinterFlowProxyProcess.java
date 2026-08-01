package com.google.android.datatransport;

import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.ComponentActivity;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowProxyProcess {
    public static WinterFlowTransactionManagerDeployment WinterFlowCacheManagerAgent;
    public static final int WinterFlowRouterStructure = Color.argb(230, 255, 255, 255);
    public static final int WinterFlowHookDataSource = Color.argb(128, 27, 27, 27);

    public static void WinterFlowRouterStructure(ComponentActivity componentActivity) {
        int i = 0;
        WinterFlowIDEParser winterFlowIDEParser = new WinterFlowIDEParser(0, 0, new WinterFlowSessionManagerAgent(24));
        WinterFlowIDEParser winterFlowIDEParser2 = new WinterFlowIDEParser(WinterFlowRouterStructure, WinterFlowHookDataSource, new WinterFlowSessionManagerAgent(24));
        View decorView = componentActivity.getWindow().getDecorView();
        decorView.getClass();
        WinterFlowTransactionManagerDeployment winterFlowTransactionManagerDeployment = WinterFlowCacheManagerAgent;
        if (winterFlowTransactionManagerDeployment == null) {
            int i2 = Build.VERSION.SDK_INT;
            winterFlowTransactionManagerDeployment = i2 >= 35 ? new WinterFlowDeploymentNode() : i2 >= 30 ? new WinterFlowStack() : i2 >= 29 ? new WinterFlowSoftwareHelper() : i2 >= 28 ? new WinterFlowSyntaxQueue() : new WinterFlowTransactionManagerDeployment();
            WinterFlowCacheManagerAgent = winterFlowTransactionManagerDeployment;
        }
        WinterFlowTransactionManagerDeployment winterFlowTransactionManagerDeployment2 = winterFlowTransactionManagerDeployment;
        WinterFlowInvokerManager winterFlowInvokerManager = new WinterFlowInvokerManager(winterFlowTransactionManagerDeployment2, winterFlowIDEParser, winterFlowIDEParser2, componentActivity, decorView, 1);
        ViewGroup viewGroup = (ViewGroup) decorView;
        while (true) {
            if (i >= viewGroup.getChildCount()) {
                WinterFlowConsumerEventEmitter winterFlowConsumerEventEmitter = new WinterFlowConsumerEventEmitter(winterFlowInvokerManager, viewGroup.getContext());
                winterFlowConsumerEventEmitter.setTag(winterFlowTransactionManagerDeployment2);
                winterFlowConsumerEventEmitter.setVisibility(8);
                winterFlowConsumerEventEmitter.setWillNotDraw(true);
                viewGroup.addView(winterFlowConsumerEventEmitter);
                break;
            }
            int i3 = i + 1;
            View childAt = viewGroup.getChildAt(i);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            if (childAt.getTag() instanceof WinterFlowTransactionManagerDeployment) {
                break;
            } else {
                i = i3;
            }
        }
        winterFlowInvokerManager.run();
        Window window = componentActivity.getWindow();
        window.getClass();
        winterFlowTransactionManagerDeployment2.WinterFlowRouterStructure(window);
    }
}
