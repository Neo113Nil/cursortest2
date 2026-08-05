package defpackage;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class iZMrJEOF {
    public static void MdtA4re8(Object obj, Object obj2) {
        pRiPUEwG.P7K7Inc8(obj).unregisterOnBackInvokedCallback(pRiPUEwG.MdtA4re8(obj2));
    }

    public static OnBackInvokedCallback NCTxEWno(Object obj, SJ7tYVsF sJ7tYVsF) {
        Objects.requireNonNull(sJ7tYVsF);
        a7H5Mii5 a7h5mii5 = new a7H5Mii5(0, sJ7tYVsF);
        pRiPUEwG.P7K7Inc8(obj).registerOnBackInvokedCallback(1000000, a7h5mii5);
        return a7h5mii5;
    }

    public static OnBackInvokedDispatcher qoPGr6Ce(Activity activity) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
        return onBackInvokedDispatcher;
    }
}
