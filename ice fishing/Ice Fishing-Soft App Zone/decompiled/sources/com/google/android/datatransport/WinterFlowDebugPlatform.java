package com.google.android.datatransport;

import android.content.Context;
import android.graphics.Insets;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.ext.SdkExtensions;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowDebugPlatform {
    public static CharSequence WinterFlowArrayNetwork(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    public static void WinterFlowCacheManagerAgent(int i) {
        SdkExtensions.getExtensionVersion(i);
    }

    public static String WinterFlowHookDataSource(Context context) {
        return context.getAttributionTag();
    }

    public static void WinterFlowRouterRouter(View view) {
        view.setImportantForContentCapture(1);
    }

    public static Icon WinterFlowRouterStructure(Uri uri) {
        return Icon.createWithAdaptiveBitmapContentUri(uri);
    }

    public static void WinterFlowSyntax(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }

    public static void WinterFlowTransactionManagerStrategy(Window window, boolean z) {
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z ? systemUiVisibility & (-257) : systemUiVisibility | 256);
        window.setDecorFitsSystemWindows(z);
    }

    public static void WinterFlowUnitTestResponse(Window window, boolean z) {
        window.setDecorFitsSystemWindows(z);
    }

    public static Insets WinterFlowVariableVersionControl(DisplayCutout displayCutout) {
        return displayCutout.getWaterfallInsets();
    }
}
