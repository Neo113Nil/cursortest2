package androidx.activity;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* renamed from: androidx.activity.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0456h {
    public static OnBackInvokedDispatcher a(Activity activity) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
        kotlin.jvm.internal.h.d(onBackInvokedDispatcher, "activity.getOnBackInvokedDispatcher()");
        return onBackInvokedDispatcher;
    }

    public static void b(Object dispatcher, Object callback) {
        kotlin.jvm.internal.h.e(dispatcher, "dispatcher");
        kotlin.jvm.internal.h.e(callback, "callback");
        ((OnBackInvokedDispatcher) dispatcher).registerOnBackInvokedCallback(0, (OnBackInvokedCallback) callback);
    }

    public static void c(Object dispatcher, Object callback) {
        kotlin.jvm.internal.h.e(dispatcher, "dispatcher");
        kotlin.jvm.internal.h.e(callback, "callback");
        ((OnBackInvokedDispatcher) dispatcher).unregisterOnBackInvokedCallback((OnBackInvokedCallback) callback);
    }
}
