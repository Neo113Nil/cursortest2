package defpackage;

import android.graphics.Insets;
import android.os.ext.SdkExtensions;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class dcDmLGVhzWm {
    public static void AvO7iQsrTN(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }

    public static void EljAMC1QTz(View view) {
        view.setImportantForContentCapture(1);
    }

    public static void GWasM1elztuh(int i) {
        SdkExtensions.getExtensionVersion(i);
    }

    public static void OOA6hdeuvCS(Window window, boolean z) {
        window.setDecorFitsSystemWindows(z);
    }

    public static Insets X1lG3V04pd(DisplayCutout displayCutout) {
        return displayCutout.getWaterfallInsets();
    }

    public static CharSequence Yi7zF1RB1(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    public static void xqGvceK5x(Window window, boolean z) {
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z ? systemUiVisibility & (-257) : systemUiVisibility | 256);
        window.setDecorFitsSystemWindows(z);
    }
}
