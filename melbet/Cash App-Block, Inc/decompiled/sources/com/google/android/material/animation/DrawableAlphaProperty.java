package com.google.android.material.animation;

import android.graphics.drawable.Drawable;
import android.util.Property;

/* loaded from: classes4.dex */
public final class DrawableAlphaProperty extends Property {
    public static final DrawableAlphaProperty DRAWABLE_ALPHA_COMPAT = new DrawableAlphaProperty(Integer.class, "drawableAlphaCompat");

    @Override // android.util.Property
    public final Object get(Object obj) {
        return Integer.valueOf(((Drawable) obj).getAlpha());
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        ((Drawable) obj).setAlpha(((Integer) obj2).intValue());
    }
}
