package defpackage;

/* loaded from: classes.dex */
public abstract class OtkytngK3Mr {
    public static void AARZUJiTa(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, java.lang.CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }

    public static void F7NU4MC0GW(android.view.Window window, boolean z) {
        android.view.View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z ? systemUiVisibility & (-257) : systemUiVisibility | 256);
        window.setDecorFitsSystemWindows(z);
    }

    public static void IHQe1A4L2xu(int i) {
        android.os.ext.SdkExtensions.getExtensionVersion(i);
    }

    public static void adDC3e2L(android.view.Window window, boolean z) {
        window.setDecorFitsSystemWindows(z);
    }

    public static java.lang.CharSequence oh6vYeIP(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    public static android.graphics.Insets r1MBDhnF(android.view.DisplayCutout displayCutout) {
        return displayCutout.getWaterfallInsets();
    }

    public static void xiZrDbcSW0(android.view.View view) {
        view.setImportantForContentCapture(1);
    }
}
