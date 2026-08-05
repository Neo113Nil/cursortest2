package defpackage;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class wc0 {
    public static void MdtA4re8(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
    }

    public static OnBackInvokedCallback NCTxEWno(Runnable runnable) {
        Objects.requireNonNull(runnable);
        return new a7H5Mii5(2, runnable);
    }

    public static OnBackInvokedDispatcher qoPGr6Ce(View view) {
        return view.findOnBackInvokedDispatcher();
    }

    public static void wxUZMvaN(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
