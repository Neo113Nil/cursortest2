package O;

import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class B extends F1.a {

    /* renamed from: v, reason: collision with root package name */
    public View f2028v;

    /* renamed from: w, reason: collision with root package name */
    public WindowInsetsController f2029w;

    /* JADX WARN: Type inference failed for: r4v0, types: [O.A] */
    @Override // F1.a
    public final void p() {
        int ime;
        WindowInsetsController windowInsetsController = this.f2029w;
        View view = this.f2028v;
        if (windowInsetsController == null) {
            windowInsetsController = view != null ? view.getWindowInsetsController() : null;
        }
        if (windowInsetsController == null) {
            super.p();
            return;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ?? r42 = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: O.A
            @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
            public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i) {
                atomicBoolean.set((i & 8) != 0);
            }
        };
        windowInsetsController.addOnControllableInsetsChangedListener(r42);
        if (!atomicBoolean.get() && view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
        windowInsetsController.removeOnControllableInsetsChangedListener(r42);
        ime = WindowInsets.Type.ime();
        windowInsetsController.hide(ime);
    }
}
