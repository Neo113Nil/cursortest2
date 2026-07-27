package O;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public final class E0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.bumptech.glide.f f2039a;

    public E0(WindowInsetsController windowInsetsController) {
        this.f2039a = new B0(windowInsetsController, new I0.j(windowInsetsController));
    }

    public E0(Window window, View view) {
        WindowInsetsController insetsController;
        I0.j jVar = new I0.j(view);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            insetsController = window.getInsetsController();
            B0 b02 = new B0(insetsController, jVar);
            b02.f2031b = window;
            this.f2039a = b02;
            return;
        }
        if (i >= 26) {
            this.f2039a = new C0(window, jVar);
        } else {
            this.f2039a = new B0(window, jVar);
        }
    }
}
