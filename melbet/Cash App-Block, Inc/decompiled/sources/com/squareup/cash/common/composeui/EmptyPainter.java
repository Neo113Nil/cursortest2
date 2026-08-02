package com.squareup.cash.common.composeui;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;

/* loaded from: classes5.dex */
public final class EmptyPainter extends Painter {
    public static final EmptyPainter INSTANCE = new EmptyPainter();
    public static final long intrinsicSize = 9205357640488583168L;

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public final long mo759getIntrinsicSizeNHjbRc() {
        return intrinsicSize;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final void onDraw(DrawScope drawScope) {
        drawScope.getClass();
    }
}
