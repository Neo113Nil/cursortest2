package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class ex implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public ViewTreeObserver MdtA4re8;
    public final View NCTxEWno;
    public final Runnable wxUZMvaN;

    public ex(View view, Runnable runnable) {
        this.NCTxEWno = view;
        this.MdtA4re8 = view.getViewTreeObserver();
        this.wxUZMvaN = runnable;
    }

    public static void qoPGr6Ce(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        ex exVar = new ex(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(exVar);
        view.addOnAttachStateChangeListener(exVar);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean isAlive = this.MdtA4re8.isAlive();
        View view = this.NCTxEWno;
        if (isAlive) {
            this.MdtA4re8.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.wxUZMvaN.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.MdtA4re8 = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.MdtA4re8.isAlive();
        View view2 = this.NCTxEWno;
        if (isAlive) {
            this.MdtA4re8.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
