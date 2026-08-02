package com.google.android.gms.internal.ads;

import android.graphics.RenderNode;
import android.graphics.drawable.ColorStateListDrawable;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class YP {
    public static /* synthetic */ RenderNode c() {
        return new RenderNode("OffscreenLayer.main");
    }

    public static /* bridge */ /* synthetic */ ColorStateListDrawable d(Drawable drawable) {
        return (ColorStateListDrawable) drawable;
    }

    public static /* bridge */ /* synthetic */ boolean o(Drawable drawable) {
        return drawable instanceof ColorStateListDrawable;
    }

    public static /* synthetic */ RenderNode r() {
        return new RenderNode("OffscreenLayer.shadow");
    }
}
