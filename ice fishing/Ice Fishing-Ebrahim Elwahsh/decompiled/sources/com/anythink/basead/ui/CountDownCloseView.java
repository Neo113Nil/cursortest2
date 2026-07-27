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
    private Paint f10142a;

    /* renamed from: b, reason: collision with root package name */
    private Paint f10143b;

    /* renamed from: c, reason: collision with root package name */
    private float f10144c;

    /* renamed from: d, reason: collision with root package name */
    private int f10145d;

    /* renamed from: e, reason: collision with root package name */
    private int f10146e;

    /* renamed from: f, reason: collision with root package name */
    private int f10147f;

    /* renamed from: g, reason: collision with root package name */
    private int f10148g;

    /* renamed from: h, reason: collision with root package name */
    private int f10149h;
    private RectF i;

    /* renamed from: j, reason: collision with root package name */
    private float f10150j;

    /* renamed from: k, reason: collision with root package name */
    private long f10151k;

    public CountDownCloseView(Context context) {
        this(context, null);
    }

    private void a(Context context) {
        this.f10144c = TypedValue.applyDimension(1, 2.5f, context.getResources().getDisplayMetrics());
        this.f10145d = Color.parseColor("#FF57575A");
        this.f10146e = -1;
        Paint paint = new Paint();
        this.f10142a = paint;
        paint.setAntiAlias(true);
        this.f10142a.setStrokeCap(Paint.Cap.ROUND);
        this.f10142a.setStyle(Paint.Style.STROKE);
        this.f10142a.setStrokeWidth(this.f10144c);
        Paint paint2 = new Paint();
        this.f10143b = paint2;
        paint2.setAntiAlias(true);
        this.f10143b.setColor(this.f10146e);
        this.i = new RectF();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f10150j < 360.0f) {
            this.f10142a.setColor(this.f10145d);
            canvas.drawArc(this.i, 0.0f, 360.0f, false, this.f10142a);
            this.f10142a.setColor(this.f10146e);
            canvas.drawArc(this.i, -90.0f, this.f10150j, false, this.f10142a);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i4, int i9, int i10) {
        super.onSizeChanged(i, i4, i9, i10);
        this.f10147f = i;
        this.f10148g = i4;
        a();
    }

    public void refresh(long j9) {
        long j10 = this.f10151k;
        if (j10 > 0) {
            this.f10150j = ((j9 * 1.0f) / j10) * 360.0f;
            postInvalidate();
        }
    }

    public void setDuration(long j9) {
        this.f10151k = j9;
    }

    public void setThickInPx(int i) {
        float f6 = i;
        this.f10144c = f6;
        this.f10142a.setStrokeWidth(f6);
        a();
    }

    public void setUnderRingColor(int i) {
        this.f10145d = i;
    }

    public CountDownCloseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10144c = TypedValue.applyDimension(1, 2.5f, context.getResources().getDisplayMetrics());
        this.f10145d = Color.parseColor("#FF57575A");
        this.f10146e = -1;
        Paint paint = new Paint();
        this.f10142a = paint;
        paint.setAntiAlias(true);
        this.f10142a.setStrokeCap(Paint.Cap.ROUND);
        this.f10142a.setStyle(Paint.Style.STROKE);
        this.f10142a.setStrokeWidth(this.f10144c);
        Paint paint2 = new Paint();
        this.f10143b = paint2;
        paint2.setAntiAlias(true);
        this.f10143b.setColor(this.f10146e);
        this.i = new RectF();
    }

    private void a() {
        float f6 = this.f10144c * 0.5f;
        float f9 = 0.0f + f6;
        this.i.set(f9, f9, this.f10147f - f6, this.f10148g - f6);
        this.f10149h = ((int) this.i.width()) >> 1;
    }
}
