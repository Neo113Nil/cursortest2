package androidx.activity;

import O.B0;
import O.C0;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public class t extends com.bumptech.glide.f {
    @Override // com.bumptech.glide.f
    public void z(I statusBarStyle, I navigationBarStyle, Window window, View view, boolean z3, boolean z6) {
        B0 c02;
        WindowInsetsController insetsController;
        kotlin.jvm.internal.h.e(statusBarStyle, "statusBarStyle");
        kotlin.jvm.internal.h.e(navigationBarStyle, "navigationBarStyle");
        kotlin.jvm.internal.h.e(window, "window");
        kotlin.jvm.internal.h.e(view, "view");
        com.bumptech.glide.d.j(window, false);
        window.setStatusBarColor(z3 ? statusBarStyle.f4432b : statusBarStyle.f4431a);
        window.setNavigationBarColor(z6 ? navigationBarStyle.f4432b : navigationBarStyle.f4431a);
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
