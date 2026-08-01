package h;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class v {
    public static OnBackInvokedDispatcher a(Activity activity) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
        return onBackInvokedDispatcher;
    }

    public static OnBackInvokedCallback b(Object obj, LayoutInflaterFactory2C0159B layoutInflaterFactory2C0159B) {
        Objects.requireNonNull(layoutInflaterFactory2C0159B);
        M0.d dVar = new M0.d(2, layoutInflaterFactory2C0159B);
        M0.c.f(obj).registerOnBackInvokedCallback(1000000, dVar);
        return dVar;
    }

    public static void c(Object obj, Object obj2) {
        M0.c.f(obj).unregisterOnBackInvokedCallback(M0.c.b(obj2));
    }
}
