package com.squareup.cash.overlays;

import android.content.Context;
import android.content.ContextWrapper;

/* loaded from: classes.dex */
public final class OverlayContextWrapper extends ContextWrapper {
    public final OverlayLayer overlayLayer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverlayContextWrapper(Context context, OverlayLayer overlayLayer) {
        super(context);
        context.getClass();
        overlayLayer.getClass();
        this.overlayLayer = overlayLayer;
    }
}
