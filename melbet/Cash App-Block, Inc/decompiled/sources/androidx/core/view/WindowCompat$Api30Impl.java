package androidx.core.view;

import android.os.Build;
import android.os.ext.SdkExtensions;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.EditorInfo;
import androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia;
import defpackage.Drop$$ExternalSyntheticBUOutline0;

/* loaded from: classes.dex */
public abstract class WindowCompat$Api30Impl {
    public static String getVisualMimeType$activity(ActivityResultContracts$PickVisualMedia.VisualMediaType visualMediaType) {
        visualMediaType.getClass();
        if (visualMediaType instanceof ActivityResultContracts$PickVisualMedia.ImageOnly) {
            return "image/*";
        }
        if (visualMediaType instanceof ActivityResultContracts$PickVisualMedia.ImageAndVideo) {
            return null;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static boolean isSystemPickerAvailable$activity() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            return true;
        }
        return i >= 30 && SdkExtensions.getExtensionVersion(30) >= 2;
    }

    public static void setDecorFitsSystemWindows(Window window, boolean z) {
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z ? systemUiVisibility & (-257) : systemUiVisibility | 256);
        window.setDecorFitsSystemWindows(z);
    }

    public static void setImportantForContentCapture(View view) {
        view.setImportantForContentCapture(1);
    }

    public static void setInitialSurroundingSubText(EditorInfo editorInfo, CharSequence charSequence) {
        editorInfo.setInitialSurroundingSubText(charSequence, 0);
    }
}
