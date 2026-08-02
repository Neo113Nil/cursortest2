package com.anythink.basead.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;

/* loaded from: classes.dex */
public class CountDownCloseView extends CloseImageView {

    /* renamed from: a, reason: collision with root package name */
    private Paint f10771a;

    /* renamed from: b, reason: collision with root package name */
    private Paint f10772b;

    /* renamed from: c, reason: collision with root package name */
    private float f10773c;

    /* renamed from: d, reason: collision with root package name */
    private int f10774d;

    /* renamed from: e, reason: collision with root package name */
    private int f10775e;

    /* renamed from: f, reason: collision with root package name */
    private int f10776f;

    /* renamed from: g, reason: collision with root package name */
    private int f10777g;

    /* renamed from: h, reason: collision with root package name */
    private int f10778h;
    private RectF i;

    /* renamed from: j, reason: collision with root package name */
    private float f10779j;

    /* renamed from: k, reason: collision with root package name */
    private long f10780k;

    public CountDownCloseView(Context context) {
        this(context, null);
    }

    private void a(Context context) {
        this.f10773c = TypedValue.applyDimension(1, 2.5f, context.getResources().getDisplayMetrics());
        this.f10774d = Color.parseColor("#FF57575A");
        this.f10775e = -1;
        Paint paint = new Paint();
        this.f10771a = paint;
        paint.setAntiAlias(true);
        this.f10771a.setStrokeCap(Paint.Cap.ROUND);
        this.f10771a.setStyle(Paint.Style.STROKE);
        this.f10771a.setStrokeWidth(this.f10773c);
        Paint paint2 = new Paint();
        this.f10772b = paint2;
        paint2.setAntiAlias(true);
        this.f10772b.setColor(this.f10775e);
        this.i = new RectF();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f10779j < 360.0f) {
            this.f10771a.setColor(this.f10774d);
            canvas.drawArc(this.i, 0.0f, 360.0f, false, this.f10771a);
            this.f10771a.setColor(this.f10775e);
            canvas.drawArc(this.i, -90.0f, this.f10779j, false, this.f10771a);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i4, int i6, int i9) {
        super.onSizeChanged(i, i4, i6, i9);
        this.f10776f = i;
        this.f10777g = i4;
        a();
    }

    public void refresh(long j6) {
        long j9 = this.f10780k;
        if (j9 > 0) {
            this.f10779j = ((j6 * 1.0f) / j9) * 360.0f;
            postInvalidate();
        }
    }

    public void setDuration(long j6) {
        this.f10780k = j6;
    }

    public void setThickInPx(int i) {
        float f2 = i;
        this.f10773c = f2;
        this.f10771a.setStrokeWidth(f2);
        a();
    }

    public void setUnderRingColor(int i) {
        this.f10774d = i;
    }

    public CountDownCloseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10773c = TypedValue.applyDimension(1, 2.5f, context.getResources().getDisplayMetrics());
        this.f10774d = Color.parseColor("#FF57575A");
        this.f10775e = -1;
        Paint paint = new Paint();
        this.f10771a = paint;
        paint.setAntiAlias(true);
        this.f10771a.setStrokeCap(Paint.Cap.ROUND);
        this.f10771a.setStyle(Paint.Style.STROKE);
        this.f10771a.setStrokeWidth(this.f10773c);
        Paint paint2 = new Paint();
        this.f10772b = paint2;
        paint2.setAntiAlias(true);
        this.f10772b.setColor(this.f10775e);
        this.i = new RectF();
    }

    private void a() {
        float f2 = this.f10773c * 0.5f;
        float f9 = 0.0f + f2;
        this.i.set(f9, f9, this.f10776f - f2, this.f10777g - f2);
        this.f10778h = ((int) this.i.width()) >> 1;
    }
}
