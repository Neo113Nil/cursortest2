package com.squareup.cash.investingcrypto.components.common.drawables;

import android.graphics.Rect;
import android.graphics.drawable.StateListDrawable;
import android.view.Gravity;

/* loaded from: classes6.dex */
public final class FixedSizeDrawable extends DrawableWrapperCompat {
    public final Rect availableSpace;
    public final int height;
    public final Rect tempRect;
    public final int width;

    public FixedSizeDrawable(StateListDrawable stateListDrawable, int i, int i2) {
        super(stateListDrawable);
        this.width = i;
        this.height = i2;
        this.availableSpace = new Rect();
        this.tempRect = new Rect();
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.height;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.width;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.availableSpace;
        rect.set(i, i2, i3, i4);
        int i5 = this.width;
        int i6 = this.height;
        Rect rect2 = this.tempRect;
        Gravity.apply(17, i5, i6, rect, rect2);
        super.setBounds(rect2.left, rect2.top, rect2.right, rect2.bottom);
    }
}
