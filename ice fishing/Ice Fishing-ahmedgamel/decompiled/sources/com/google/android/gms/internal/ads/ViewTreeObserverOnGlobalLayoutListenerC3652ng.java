package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.ng, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC3652ng extends OK implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: v, reason: collision with root package name */
    public final WeakReference f33534v;

    public ViewTreeObserverOnGlobalLayoutListenerC3652ng(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        super(view);
        this.f33534v = new WeakReference(onGlobalLayoutListener);
    }

    public final void R1(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnGlobalLayoutListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = (ViewTreeObserver.OnGlobalLayoutListener) this.f33534v.get();
        if (onGlobalLayoutListener != null) {
            onGlobalLayoutListener.onGlobalLayout();
            return;
        }
        View view = (View) ((WeakReference) this.f27380n).get();
        ViewTreeObserver viewTreeObserver2 = null;
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
            viewTreeObserver2 = viewTreeObserver;
        }
        if (viewTreeObserver2 != null) {
            viewTreeObserver2.removeOnGlobalLayoutListener(this);
        }
    }
}
