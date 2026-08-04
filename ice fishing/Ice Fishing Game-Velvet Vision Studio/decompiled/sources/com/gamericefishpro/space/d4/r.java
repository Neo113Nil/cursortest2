package com.gamericefishpro.space.d4;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    private final View d;
    public ViewTreeObserver e;
    private final Runnable i;

    public r(View view, Runnable runnable) {
        this.d = view;
        this.e = view.getViewTreeObserver();
        this.i = runnable;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        if (this.e.isAlive()) {
            this.e.removeOnPreDrawListener(this);
        } else {
            this.d.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.d.removeOnAttachStateChangeListener(this);
        this.i.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.e = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        if (this.e.isAlive()) {
            this.e.removeOnPreDrawListener(this);
        } else {
            this.d.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.d.removeOnAttachStateChangeListener(this);
    }
}
