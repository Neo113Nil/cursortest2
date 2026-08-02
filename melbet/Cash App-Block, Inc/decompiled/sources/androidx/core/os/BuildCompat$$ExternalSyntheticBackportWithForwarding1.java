package androidx.core.os;

import android.os.Build;

/* loaded from: classes.dex */
public abstract /* synthetic */ class BuildCompat$$ExternalSyntheticBackportWithForwarding1 {
    public static /* synthetic */ int m() {
        int i = Build.VERSION.SDK_INT;
        return i < 36 ? i * 100000 : Build.VERSION.SDK_INT_FULL;
    }
}
