package defpackage;

/* loaded from: classes.dex */
public final class yq0 implements android.view.ViewTreeObserver.OnPreDrawListener, android.view.View.OnAttachStateChangeListener {
    public final defpackage.qn1 AARZUJiTa;
    public final android.view.View adDC3e2L;
    public android.view.ViewTreeObserver xiZrDbcSW0;

    public yq0(android.view.View view, defpackage.qn1 qn1Var) {
        this.adDC3e2L = view;
        this.xiZrDbcSW0 = view.getViewTreeObserver();
        this.AARZUJiTa = qn1Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean isAlive = this.xiZrDbcSW0.isAlive();
        android.view.View view = this.adDC3e2L;
        if (isAlive) {
            this.xiZrDbcSW0.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.AARZUJiTa.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View view) {
        this.xiZrDbcSW0 = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View view) {
        boolean isAlive = this.xiZrDbcSW0.isAlive();
        android.view.View view2 = this.adDC3e2L;
        if (isAlive) {
            this.xiZrDbcSW0.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
