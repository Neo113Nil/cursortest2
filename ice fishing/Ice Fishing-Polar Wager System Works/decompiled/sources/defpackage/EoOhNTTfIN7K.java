package defpackage;

/* loaded from: classes.dex */
public abstract class EoOhNTTfIN7K {
    public static void AARZUJiTa(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
        accessibilityNodeInfo.setAccessibilityDataSensitive(z);
    }

    public static boolean F7NU4MC0GW(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isAccessibilityDataSensitive();
    }

    public static android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction IHQe1A4L2xu() {
        return android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
    }

    public static boolean adDC3e2L(android.view.accessibility.AccessibilityManager accessibilityManager) {
        return accessibilityManager.isRequestFromAccessibilityTool();
    }

    public static void oh6vYeIP(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, android.graphics.Rect rect) {
        accessibilityNodeInfo.getBoundsInWindow(rect);
    }

    public static java.lang.CharSequence r1MBDhnF(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getContainerTitle();
    }

    public static void xiZrDbcSW0(android.view.accessibility.AccessibilityEvent accessibilityEvent, boolean z) {
        accessibilityEvent.setAccessibilityDataSensitive(z);
    }
}
