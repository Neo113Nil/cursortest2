package com.instagram.common.viewpoint.core;

import android.view.View;
import android.widget.ImageView;

/* renamed from: com.facebook.ads.redexgen.X.aV, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnAttachStateChangeListenerC1457aV implements View.OnAttachStateChangeListener {
    public final /* synthetic */ C1458aW A00;

    public ViewOnAttachStateChangeListenerC1457aV(C1458aW c1458aW) {
        this.A00 = c1458aW;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ImageView imageView;
        this.A00.A09();
        imageView = this.A00.A03;
        imageView.setOnClickListener(null);
    }
}
