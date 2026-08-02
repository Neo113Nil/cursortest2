package androidx.activity;

import O.B0;
import O.C0;
import a.AbstractC0426a;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import i1.C4585b;

/* loaded from: classes.dex */
public class v extends u {
    @Override // androidx.activity.t, com.bumptech.glide.g
    public void z(I statusBarStyle, I navigationBarStyle, Window window, View view, boolean z6, boolean z9) {
        B0 c02;
        WindowInsetsController insetsController;
        kotlin.jvm.internal.h.e(statusBarStyle, "statusBarStyle");
        kotlin.jvm.internal.h.e(navigationBarStyle, "navigationBarStyle");
        kotlin.jvm.internal.h.e(window, "window");
        kotlin.jvm.internal.h.e(view, "view");
        AbstractC0426a.n(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(true);
        C4585b c4585b = new C4585b(view);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            insetsController = window.getInsetsController();
            c02 = new B0(insetsController, c4585b);
            c02.f2119b = window;
        } else {
            c02 = i >= 26 ? new C0(window, c4585b) : new B0(window, c4585b);
        }
        c02.j(!z6);
        c02.i(!z9);
    }
}
