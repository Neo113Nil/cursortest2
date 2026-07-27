package h;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class w {
    public static OnBackInvokedDispatcher a(Activity activity) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
        return onBackInvokedDispatcher;
    }

    public static OnBackInvokedCallback b(Object obj, LayoutInflaterFactory2C4535B layoutInflaterFactory2C4535B) {
        Objects.requireNonNull(layoutInflaterFactory2C4535B);
        androidx.activity.C c4 = new androidx.activity.C(1, layoutInflaterFactory2C4535B);
        P.e.k(obj).registerOnBackInvokedCallback(1000000, c4);
        return c4;
    }

    public static void c(Object obj, Object obj2) {
        P.e.k(obj).unregisterOnBackInvokedCallback(P.e.g(obj2));
    }
}
