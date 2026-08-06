package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class tt0 implements android.view.ViewTreeObserver.OnPreDrawListener, android.view.View.OnAttachStateChangeListener {
    public final defpackage.kv1 QiMR8OkAhezm;
    public final android.view.View WDYagTQQm9ns;
    public android.view.ViewTreeObserver oh71FJcDz6S2;

    public tt0(android.view.View view, defpackage.kv1 kv1Var) {
        this.WDYagTQQm9ns = view;
        this.oh71FJcDz6S2 = view.getViewTreeObserver();
        this.QiMR8OkAhezm = kv1Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean isAlive = this.oh71FJcDz6S2.isAlive();
        android.view.View view = this.WDYagTQQm9ns;
        if (isAlive) {
            this.oh71FJcDz6S2.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.QiMR8OkAhezm.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View view) {
        this.oh71FJcDz6S2 = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View view) {
        boolean isAlive = this.oh71FJcDz6S2.isAlive();
        android.view.View view2 = this.WDYagTQQm9ns;
        if (isAlive) {
            this.oh71FJcDz6S2.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
