package androidx.compose.ui.window;

import android.view.WindowManager;

/* loaded from: classes3.dex */
public final class Api28Impl {
    public static final Api28Impl INSTANCE = new Api28Impl();

    public final void setLayoutInDisplayCutout(WindowManager.LayoutParams layoutParams) {
        layoutParams.layoutInDisplayCutoutMode = 3;
    }
}
