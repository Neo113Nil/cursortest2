package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class hwoZxnIesQBZ {
    public static java.lang.String JhCgjQRTAOCT(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    public static final void P05cfTpS5W5L(android.view.accessibility.AccessibilityManager accessibilityManager, android.view.accessibility.AccessibilityManager$AccessibilityServicesStateChangeListener accessibilityManager$AccessibilityServicesStateChangeListener) {
        accessibilityManager.removeAccessibilityServicesStateChangeListener(accessibilityManager$AccessibilityServicesStateChangeListener);
    }

    public static final void QiMR8OkAhezm(defpackage.a11 a11Var, defpackage.t6 t6Var) {
        android.window.OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (t6Var == null || (findOnBackInvokedDispatcher = a11Var.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        findOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(t6Var);
    }

    public static boolean WDYagTQQm9ns(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    public static final void ZpBGe2uQfcn8(android.view.accessibility.AccessibilityManager accessibilityManager, android.view.accessibility.AccessibilityManager$AccessibilityServicesStateChangeListener accessibilityManager$AccessibilityServicesStateChangeListener) {
        accessibilityManager.addAccessibilityServicesStateChangeListener(accessibilityManager$AccessibilityServicesStateChangeListener);
    }

    public static java.util.ArrayList fWTAfUmVKrZq(android.os.Bundle bundle, java.lang.String str, java.lang.Class cls) {
        return bundle.getParcelableArrayList(str, cls);
    }

    public static android.content.pm.PackageInfo giKS3J6vZuNy(android.content.pm.PackageManager packageManager, android.content.Context context) {
        return packageManager.getPackageInfo(context.getPackageName(), android.content.pm.PackageManager.PackageInfoFlags.of(0L));
    }

    public static final void oh71FJcDz6S2(defpackage.a11 a11Var, defpackage.t6 t6Var) {
        android.window.OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (t6Var == null || (findOnBackInvokedDispatcher = a11Var.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        findOnBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, t6Var);
    }
}
