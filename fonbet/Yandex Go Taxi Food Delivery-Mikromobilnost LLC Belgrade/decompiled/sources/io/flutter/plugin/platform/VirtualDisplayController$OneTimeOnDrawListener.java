package io.flutter.plugin.platform;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes4.dex */
class VirtualDisplayController$OneTimeOnDrawListener implements ViewTreeObserver.OnDrawListener {
    Runnable mOnDrawRunnable;
    final View mView;

    public VirtualDisplayController$OneTimeOnDrawListener(View view, Runnable runnable) {
        this.mView = view;
        this.mOnDrawRunnable = runnable;
    }

    public static void schedule(View view, Runnable runnable) {
        view.getViewTreeObserver().addOnDrawListener(new VirtualDisplayController$OneTimeOnDrawListener(view, runnable));
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public void onDraw() {
        Runnable runnable = this.mOnDrawRunnable;
        if (runnable == null) {
            return;
        }
        runnable.run();
        this.mOnDrawRunnable = null;
        this.mView.post(new f(1, this));
    }
}
