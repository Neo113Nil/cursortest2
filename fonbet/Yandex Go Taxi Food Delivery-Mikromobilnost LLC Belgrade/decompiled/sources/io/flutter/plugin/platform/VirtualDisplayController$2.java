package io.flutter.plugin.platform;

import android.view.View;

/* loaded from: classes4.dex */
class VirtualDisplayController$2 implements View.OnAttachStateChangeListener {
    final /* synthetic */ g this$0;
    final /* synthetic */ View val$embeddedView;
    final /* synthetic */ Runnable val$onNewSizeFrameAvailable;

    public VirtualDisplayController$2(g gVar, View view, Runnable runnable) {
        this.this$0 = gVar;
        this.val$embeddedView = view;
        this.val$onNewSizeFrameAvailable = runnable;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        VirtualDisplayController$OneTimeOnDrawListener.schedule(this.val$embeddedView, new f(0, this));
        this.val$embeddedView.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
    }
}
