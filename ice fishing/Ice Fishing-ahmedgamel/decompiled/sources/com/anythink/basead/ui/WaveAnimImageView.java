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
    int f11181a;

    /* renamed from: b, reason: collision with root package name */
    int f11182b;

    /* renamed from: c, reason: collision with root package name */
    private Paint f11183c;

    /* renamed from: d, reason: collision with root package name */
    private a f11184d;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        float f11185a;

        /* renamed from: b, reason: collision with root package name */
        float f11186b;

        /* renamed from: c, reason: collision with root package name */
        float f11187c;

        public a(float f2, float f9, float f10) {
            this.f11185a = f2;
            this.f11186b = f9;
            this.f11187c = f10;
        }
    }

    public WaveAnimImageView(Context context) {
        super(context);
        a();
    }

    private void a() {
        Paint paint = new Paint();
        this.f11183c = paint;
        paint.setAntiAlias(true);
        this.f11183c.setStyle(Paint.Style.STROKE);
        this.f11183c.setColor(Color.parseColor("#FFFFFF"));
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        a aVar = this.f11184d;
        if (aVar != null) {
            this.f11183c.setAlpha((int) (aVar.f11187c * 255.0f));
            this.f11183c.setStrokeWidth(this.f11184d.f11186b);
            canvas.drawCircle(this.f11181a, this.f11182b, this.f11184d.f11185a, this.f11183c);
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z6, int i, int i4, int i6, int i9) {
        super.onLayout(z6, i, i4, i6, i9);
        this.f11181a = getWidth() / 2;
        this.f11182b = getHeight() / 2;
    }

    public void setWaveAnimParams(a aVar) {
        this.f11184d = aVar;
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
