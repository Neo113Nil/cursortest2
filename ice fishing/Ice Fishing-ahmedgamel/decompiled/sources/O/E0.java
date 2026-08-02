package O;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import i1.C4585b;

/* loaded from: classes.dex */
public final class E0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.bumptech.glide.e f2127a;

    public E0(WindowInsetsController windowInsetsController) {
        this.f2127a = new B0(windowInsetsController, new C4585b(windowInsetsController));
    }

    public E0(Window window, View view) {
        WindowInsetsController insetsController;
        C4585b c4585b = new C4585b(view);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            insetsController = window.getInsetsController();
            B0 b02 = new B0(insetsController, c4585b);
            b02.f2119b = window;
            this.f2127a = b02;
            return;
        }
        if (i >= 26) {
            this.f2127a = new C0(window, c4585b);
        } else {
            this.f2127a = new B0(window, c4585b);
        }
    }
}
