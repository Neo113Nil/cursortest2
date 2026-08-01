package O;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: O.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0041q implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final View f827a;

    /* renamed from: b, reason: collision with root package name */
    public ViewTreeObserver f828b;

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f829c;

    public ViewTreeObserverOnPreDrawListenerC0041q(View view, Runnable runnable) {
        this.f827a = view;
        this.f828b = view.getViewTreeObserver();
        this.f829c = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        ViewTreeObserverOnPreDrawListenerC0041q viewTreeObserverOnPreDrawListenerC0041q = new ViewTreeObserverOnPreDrawListenerC0041q(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0041q);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC0041q);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean isAlive = this.f828b.isAlive();
        View view = this.f827a;
        if (isAlive) {
            this.f828b.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f829c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f828b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.f828b.isAlive();
        View view2 = this.f827a;
        if (isAlive) {
            this.f828b.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
