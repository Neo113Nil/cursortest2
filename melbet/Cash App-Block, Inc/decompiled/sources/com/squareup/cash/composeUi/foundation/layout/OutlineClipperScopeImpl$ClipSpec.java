package com.squareup.cash.composeUi.foundation.layout;

import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutCoordinates;

/* loaded from: classes6.dex */
public final class OutlineClipperScopeImpl$ClipSpec {
    public final float clipGap;
    public final Shape clipShape;
    public final LayoutCoordinates layoutCoordinates;

    public OutlineClipperScopeImpl$ClipSpec(Shape shape, float f, LayoutCoordinates layoutCoordinates) {
        shape.getClass();
        layoutCoordinates.getClass();
        this.clipShape = shape;
        this.clipGap = f;
        this.layoutCoordinates = layoutCoordinates;
    }
}
