package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class kf1 extends defpackage.k0 {
    public android.view.View QiMR8OkAhezm;

    @Override // defpackage.k0
    public final void dG7RjM6DqYVL() {
        int ime;
        android.view.View view = this.QiMR8OkAhezm;
        if (view != null && android.os.Build.VERSION.SDK_INT < 33) {
            ((android.view.inputmethod.InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
        }
        android.view.WindowInsetsController windowInsetsController = view != null ? view.getWindowInsetsController() : null;
        if (windowInsetsController != null) {
            ime = android.view.WindowInsets.Type.ime();
            windowInsetsController.show(ime);
        }
        super.dG7RjM6DqYVL();
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [jf1] */
    @Override // defpackage.k0
    public final void h3m55N1URyyK() {
        int ime;
        android.view.View view = this.QiMR8OkAhezm;
        android.view.WindowInsetsController windowInsetsController = view != null ? view.getWindowInsetsController() : null;
        if (windowInsetsController == null) {
            super.h3m55N1URyyK();
            return;
        }
        final java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean(false);
        ?? r3 = new android.view.WindowInsetsController.OnControllableInsetsChangedListener() { // from class: jf1
            @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
            public final void onControllableInsetsChanged(android.view.WindowInsetsController windowInsetsController2, int i) {
                atomicBoolean.set((i & 8) != 0);
            }
        };
        windowInsetsController.addOnControllableInsetsChangedListener(r3);
        if (!atomicBoolean.get() && view != null) {
            ((android.view.inputmethod.InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
        windowInsetsController.removeOnControllableInsetsChangedListener(r3);
        ime = android.view.WindowInsets.Type.ime();
        windowInsetsController.hide(ime);
    }
}
