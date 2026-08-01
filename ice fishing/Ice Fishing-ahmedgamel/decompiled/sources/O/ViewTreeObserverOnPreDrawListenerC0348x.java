package O;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: O.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0348x implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: n, reason: collision with root package name */
    public final View f2148n;

    /* renamed from: u, reason: collision with root package name */
    public ViewTreeObserver f2149u;

    /* renamed from: v, reason: collision with root package name */
    public final Runnable f2150v;

    public ViewTreeObserverOnPreDrawListenerC0348x(View view, Runnable runnable) {
        this.f2148n = view;
        this.f2149u = view.getViewTreeObserver();
        this.f2150v = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        ViewTreeObserverOnPreDrawListenerC0348x viewTreeObserverOnPreDrawListenerC0348x = new ViewTreeObserverOnPreDrawListenerC0348x(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0348x);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC0348x);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean isAlive = this.f2149u.isAlive();
        View view = this.f2148n;
        if (isAlive) {
            this.f2149u.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f2150v.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f2149u = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.f2149u.isAlive();
        View view2 = this.f2148n;
        if (isAlive) {
            this.f2149u.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
