package com.anythink.basead.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class WaveAnimImageView extends ImageView {

    /* renamed from: a, reason: collision with root package name */
    int f10395a;

    /* renamed from: b, reason: collision with root package name */
    int f10396b;

    /* renamed from: c, reason: collision with root package name */
    private Paint f10397c;

    /* renamed from: d, reason: collision with root package name */
    private a f10398d;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        float f10399a;

        /* renamed from: b, reason: collision with root package name */
        float f10400b;

        /* renamed from: c, reason: collision with root package name */
        float f10401c;

        public a(float f3, float f9, float f10) {
            this.f10399a = f3;
            this.f10400b = f9;
            this.f10401c = f10;
        }
    }

    public WaveAnimImageView(Context context) {
        super(context);
        a();
    }

    private void a() {
        Paint paint = new Paint();
        this.f10397c = paint;
        paint.setAntiAlias(true);
        this.f10397c.setStyle(Paint.Style.STROKE);
        this.f10397c.setColor(Color.parseColor("#FFFFFF"));
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        a aVar = this.f10398d;
        if (aVar != null) {
            this.f10397c.setAlpha((int) (aVar.f10401c * 255.0f));
            this.f10397c.setStrokeWidth(this.f10398d.f10400b);
            canvas.drawCircle(this.f10395a, this.f10396b, this.f10398d.f10399a, this.f10397c);
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z3, int i, int i6, int i9, int i10) {
        super.onLayout(z3, i, i6, i9, i10);
        this.f10395a = getWidth() / 2;
        this.f10396b = getHeight() / 2;
    }

    public void setWaveAnimParams(a aVar) {
        this.f10398d = aVar;
        postInvalidate();
    }

    public WaveAnimImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public WaveAnimImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }
}
