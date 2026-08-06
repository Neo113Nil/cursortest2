package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class sw implements android.view.View.OnAttachStateChangeListener, android.view.ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ defpackage.n10 QiMR8OkAhezm;
    public boolean WDYagTQQm9ns;
    public final /* synthetic */ android.view.View oh71FJcDz6S2;

    public sw(android.view.View view, defpackage.n10 n10Var) {
        this.oh71FJcDz6S2 = view;
        this.QiMR8OkAhezm = n10Var;
        view.addOnAttachStateChangeListener(this);
        if (this.WDYagTQQm9ns || !view.isAttachedToWindow()) {
            return;
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        this.WDYagTQQm9ns = true;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.QiMR8OkAhezm.ZpBGe2uQfcn8();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View view) {
        if (this.WDYagTQQm9ns) {
            return;
        }
        android.view.View view2 = this.oh71FJcDz6S2;
        if (view2.isAttachedToWindow()) {
            view2.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.WDYagTQQm9ns = true;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View view) {
        if (this.WDYagTQQm9ns) {
            this.oh71FJcDz6S2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.WDYagTQQm9ns = false;
        }
    }
}
