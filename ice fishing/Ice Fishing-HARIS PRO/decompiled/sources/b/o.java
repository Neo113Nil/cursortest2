package b;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final o f2308a = new o();

    public final OnBackInvokedCallback a(C1.a aVar) {
        D1.i.e(aVar, "onBackInvoked");
        return new M0.d(1, aVar);
    }

    public final void b(Object obj, int i, Object obj2) {
        D1.i.e(obj, "dispatcher");
        D1.i.e(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i, (OnBackInvokedCallback) obj2);
    }

    public final void c(Object obj, Object obj2) {
        D1.i.e(obj, "dispatcher");
        D1.i.e(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
