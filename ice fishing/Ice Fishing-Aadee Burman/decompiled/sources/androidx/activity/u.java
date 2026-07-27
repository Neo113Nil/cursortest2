package androidx.activity;

import android.view.Window;

/* loaded from: classes.dex */
public class u extends t {
    @Override // com.bumptech.glide.f
    public void a(Window window) {
        kotlin.jvm.internal.h.e(window, "window");
        window.getAttributes().layoutInDisplayCutoutMode = 1;
    }
}
