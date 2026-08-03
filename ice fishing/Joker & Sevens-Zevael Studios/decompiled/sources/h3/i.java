package h3;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class i implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: g, reason: collision with root package name */
    public final View f2785g;

    /* renamed from: h, reason: collision with root package name */
    public ViewTreeObserver f2786h;

    /* renamed from: i, reason: collision with root package name */
    public final Runnable f2787i;

    public i(View view, Runnable runnable) {
        this.f2785g = view;
        this.f2786h = view.getViewTreeObserver();
        this.f2787i = runnable;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean isAlive = this.f2786h.isAlive();
        View view = this.f2785g;
        if (isAlive) {
            this.f2786h.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f2787i.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f2786h = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.f2786h.isAlive();
        View view2 = this.f2785g;
        if (isAlive) {
            this.f2786h.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
