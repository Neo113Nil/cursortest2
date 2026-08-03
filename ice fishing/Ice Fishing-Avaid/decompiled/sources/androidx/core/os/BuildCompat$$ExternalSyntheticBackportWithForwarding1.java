package androidx.core.os;

import android.os.Build;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;

/* compiled from: D8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class BuildCompat$$ExternalSyntheticBackportWithForwarding1 {
    public static /* synthetic */ int m() {
        int i;
        if (Build.VERSION.SDK_INT < 36) {
            return Build.VERSION.SDK_INT * AndroidComposeViewAccessibilityDelegateCompat.ParcelSafeTextLength;
        }
        i = Build.VERSION.SDK_INT_FULL;
        return i;
    }
}
