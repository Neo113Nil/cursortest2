package com.anythink.basead.ui.animplayerview.viewpager;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes.dex */
public class CircleIndicatorView extends View {

    /* renamed from: a, reason: collision with root package name */
    private boolean f11367a;

    /* renamed from: b, reason: collision with root package name */
    private final Path f11368b;

    public CircleIndicatorView(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        int width = getWidth() / 2;
        int height = getHeight() / 2;
        int min = Math.min(width, height);
        this.f11368b.reset();
        this.f11368b.addCircle(width, height, min, Path.Direction.CCW);
        canvas.clipPath(this.f11368b);
        canvas.drawColor(this.f11367a ? -7829368 : -1);
        canvas.restore();
    }

    public void setSelectStatus(boolean z6) {
        this.f11367a = z6;
        invalidate();
    }

    public CircleIndicatorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CircleIndicatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f11368b = new Path();
    }
}
