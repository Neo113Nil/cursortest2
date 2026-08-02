package com.google.maps.android.compose;

import android.content.Context;
import android.graphics.Canvas;
import android.view.ViewGroup;

/* loaded from: classes4.dex */
public final class NoDrawContainerView extends ViewGroup {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoDrawContainerView(Context context) {
        super(context);
        context.getClass();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.getClass();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
