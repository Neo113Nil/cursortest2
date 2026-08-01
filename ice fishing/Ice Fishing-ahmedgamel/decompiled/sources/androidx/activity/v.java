package androidx.activity;

import O.B0;
import O.C0;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public class v extends u {
    @Override // androidx.activity.t, com.bumptech.glide.f
    public void z(I statusBarStyle, I navigationBarStyle, Window window, View view, boolean z3, boolean z6) {
        B0 c02;
        WindowInsetsController insetsController;
        kotlin.jvm.internal.h.e(statusBarStyle, "statusBarStyle");
        kotlin.jvm.internal.h.e(navigationBarStyle, "navigationBarStyle");
        kotlin.jvm.internal.h.e(window, "window");
        kotlin.jvm.internal.h.e(view, "view");
        com.bumptech.glide.d.j(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(true);
        I0.j jVar = new I0.j(view);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            insetsController = window.getInsetsController();
            c02 = new B0(insetsController, jVar);
            c02.f2031b = window;
        } else {
            c02 = i >= 26 ? new C0(window, jVar) : new B0(window, jVar);
        }
        c02.x(!z3);
        c02.w(!z6);
    }
}
