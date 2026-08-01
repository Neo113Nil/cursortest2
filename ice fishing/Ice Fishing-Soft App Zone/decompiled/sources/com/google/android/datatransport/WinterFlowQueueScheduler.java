package com.google.android.datatransport;

import android.app.Notification;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.DisplayCutout;
import java.util.List;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowQueueScheduler {
    public static String WinterFlowArrayNetwork(Object obj) {
        return ((Icon) obj).getResPackage();
    }

    public static int WinterFlowCacheManagerAgent(Object obj) {
        return ((Icon) obj).getResId();
    }

    public static List WinterFlowHookDataSource(DisplayCutout displayCutout) {
        return displayCutout.getBoundingRects();
    }

    public static Uri WinterFlowResponseEngine(Object obj) {
        return ((Icon) obj).getUri();
    }

    public static int WinterFlowRouterRouter(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }

    public static Handler WinterFlowRouterStructure(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static int WinterFlowSyntax(Object obj) {
        return ((Icon) obj).getType();
    }

    public static void WinterFlowTransactionAgent(Notification.Action.Builder builder) {
        builder.setSemanticAction(0);
    }

    public static int WinterFlowTransactionManagerStrategy(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    public static int WinterFlowUnitTestResponse(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    public static int WinterFlowVariableVersionControl(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }
}
