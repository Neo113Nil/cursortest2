package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class omM9cAlgeGXx {
    public static void JhCgjQRTAOCT(android.view.Window window, boolean z) {
        android.view.View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z ? systemUiVisibility & (-257) : systemUiVisibility | 256);
        window.setDecorFitsSystemWindows(z);
    }

    public static void P05cfTpS5W5L(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, java.lang.CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }

    public static void QiMR8OkAhezm(android.view.inputmethod.EditorInfo editorInfo, java.lang.CharSequence charSequence) {
        editorInfo.setInitialSurroundingSubText(charSequence, 0);
    }

    public static void WDYagTQQm9ns(android.view.Window window, boolean z) {
        window.setDecorFitsSystemWindows(z);
    }

    public static void ZpBGe2uQfcn8(int i) {
        android.os.ext.SdkExtensions.getExtensionVersion(i);
    }

    public static android.graphics.Insets fWTAfUmVKrZq(android.view.DisplayCutout displayCutout) {
        return displayCutout.getWaterfallInsets();
    }

    public static java.lang.CharSequence giKS3J6vZuNy(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    public static void oh71FJcDz6S2(android.view.View view) {
        view.setImportantForContentCapture(1);
    }
}
