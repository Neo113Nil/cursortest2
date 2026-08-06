package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class ex1 implements android.view.View.OnAttachStateChangeListener {
    public final /* synthetic */ android.view.View WDYagTQQm9ns;
    public final /* synthetic */ defpackage.m31 oh71FJcDz6S2;

    public ex1(android.view.View view, defpackage.m31 m31Var) {
        this.WDYagTQQm9ns = view;
        this.oh71FJcDz6S2 = m31Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View view) {
        this.WDYagTQQm9ns.removeOnAttachStateChangeListener(this);
        this.oh71FJcDz6S2.VFeft99leXEK();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View view) {
    }
}
