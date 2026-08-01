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

    public static OnBackInvokedCallback b(Object obj, LayoutInflaterFactory2C4533A layoutInflaterFactory2C4533A) {
        Objects.requireNonNull(layoutInflaterFactory2C4533A);
        androidx.activity.C c9 = new androidx.activity.C(1, layoutInflaterFactory2C4533A);
        P.d.k(obj).registerOnBackInvokedCallback(1000000, c9);
        return c9;
    }

    public static void c(Object obj, Object obj2) {
        P.d.k(obj).unregisterOnBackInvokedCallback(P.d.g(obj2));
    }
}
