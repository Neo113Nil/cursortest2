package defpackage;

/* loaded from: classes.dex */
public final class ip1 implements android.view.View.OnAttachStateChangeListener {
    public final /* synthetic */ android.view.View adDC3e2L;
    public final /* synthetic */ defpackage.gz0 xiZrDbcSW0;

    public ip1(android.view.View view, defpackage.gz0 gz0Var) {
        this.adDC3e2L = view;
        this.xiZrDbcSW0 = gz0Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View view) {
        this.adDC3e2L.removeOnAttachStateChangeListener(this);
        this.xiZrDbcSW0.abhbClRa();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View view) {
    }
}
