package com.anythink.core.basead.ui.web;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes.dex */
public class WebProgressBarView extends View {

    /* renamed from: a, reason: collision with root package name */
    int f12778a;

    /* renamed from: b, reason: collision with root package name */
    int f12779b;

    /* renamed from: c, reason: collision with root package name */
    Paint f12780c;

    public WebProgressBarView(Context context) {
        super(context);
        a();
    }

    private void a() {
        this.f12779b = -14522893;
        Paint paint = new Paint();
        this.f12780c = paint;
        paint.setColor(this.f12779b);
        this.f12780c.setAntiAlias(true);
        this.f12780c.setDither(true);
        this.f12778a = 0;
        setBackgroundColor(16777215);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.drawRect(0.0f, 0.0f, (getWidth() * this.f12778a) / 100, getHeight(), this.f12780c);
        canvas.restore();
    }

    public void setProgress(int i) {
        this.f12778a = i;
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
