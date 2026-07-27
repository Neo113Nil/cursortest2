package kotlin.text;

import android.content.Context;
import android.graphics.Insets;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.ext.SdkExtensions;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;

/* loaded from: classes.dex */
public abstract class CatchingFishJUnitIntent {
    public static void CatchingFishCoroutine(int i) {
        SdkExtensions.getExtensionVersion(i);
    }

    public static Insets CatchingFishDaggerWebsocket(DisplayCutout displayCutout) {
        return displayCutout.getWaterfallInsets();
    }

    public static void CatchingFishFragmentHandler(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }

    public static void CatchingFishLayout(EditorInfo editorInfo, CharSequence charSequence) {
        editorInfo.setInitialSurroundingSubText(charSequence, 0);
    }

    public static Icon CatchingFishParcelableFAB(Uri uri) {
        return Icon.createWithAdaptiveBitmapContentUri(uri);
    }

    public static CharSequence CatchingFishReduxKtor(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    public static String CatchingFishSnackbar(Context context) {
        return context.getAttributionTag();
    }

    public static void CatchingFishViewModelFAB(View view) {
        view.setImportantForContentCapture(1);
    }

    public static void CatchingFishViewModelScope(Window window, boolean z) {
        window.setDecorFitsSystemWindows(z);
    }

    public static void CatchingFishWorkManager(Window window, boolean z) {
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z ? systemUiVisibility & (-257) : systemUiVisibility | 256);
        window.setDecorFitsSystemWindows(z);
    }
}
