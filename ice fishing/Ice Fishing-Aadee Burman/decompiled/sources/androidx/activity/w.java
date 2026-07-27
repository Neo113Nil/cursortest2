package androidx.activity;

import android.view.Window;

/* loaded from: classes.dex */
public final class w extends v {
    @Override // androidx.activity.u, com.bumptech.glide.f
    public void a(Window window) {
        kotlin.jvm.internal.h.e(window, "window");
        window.getAttributes().layoutInDisplayCutoutMode = 3;
    }
}
