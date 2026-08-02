package defpackage;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class zq0 {
    public static OnBackInvokedDispatcher a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback b(Object obj, er0 er0Var) {
        Objects.requireNonNull(er0Var);
        yq0 yq0Var = new yq0(0, er0Var);
        xq0.h(obj).registerOnBackInvokedCallback(1000000, yq0Var);
        return yq0Var;
    }

    public static void c(Object obj, Object obj2) {
        xq0.h(obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
