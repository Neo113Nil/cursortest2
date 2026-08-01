package com.anythink.core.basead.ui.web;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes.dex */
public class WebProgressBarView extends View {

    /* renamed from: a, reason: collision with root package name */
    int f11992a;

    /* renamed from: b, reason: collision with root package name */
    int f11993b;

    /* renamed from: c, reason: collision with root package name */
    Paint f11994c;

    public WebProgressBarView(Context context) {
        super(context);
        a();
    }

    private void a() {
        this.f11993b = -14522893;
        Paint paint = new Paint();
        this.f11994c = paint;
        paint.setColor(this.f11993b);
        this.f11994c.setAntiAlias(true);
        this.f11994c.setDither(true);
        this.f11992a = 0;
        setBackgroundColor(16777215);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.drawRect(0.0f, 0.0f, (getWidth() * this.f11992a) / 100, getHeight(), this.f11994c);
        canvas.restore();
    }

    public void setProgress(int i) {
        this.f11992a = i;
        postInvalidate();
    }

    public WebProgressBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public WebProgressBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }
}
