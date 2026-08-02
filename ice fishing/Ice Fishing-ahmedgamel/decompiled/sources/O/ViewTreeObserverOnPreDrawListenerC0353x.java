package O;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: O.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0353x implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: n, reason: collision with root package name */
    public final View f2236n;

    /* renamed from: u, reason: collision with root package name */
    public ViewTreeObserver f2237u;

    /* renamed from: v, reason: collision with root package name */
    public final Runnable f2238v;

    public ViewTreeObserverOnPreDrawListenerC0353x(View view, Runnable runnable) {
        this.f2236n = view;
        this.f2237u = view.getViewTreeObserver();
        this.f2238v = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        ViewTreeObserverOnPreDrawListenerC0353x viewTreeObserverOnPreDrawListenerC0353x = new ViewTreeObserverOnPreDrawListenerC0353x(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0353x);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC0353x);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean isAlive = this.f2237u.isAlive();
        View view = this.f2236n;
        if (isAlive) {
            this.f2237u.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f2238v.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f2237u = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.f2237u.isAlive();
        View view2 = this.f2236n;
        if (isAlive) {
            this.f2237u.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
